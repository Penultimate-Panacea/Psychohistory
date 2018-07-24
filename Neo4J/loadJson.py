import os
import requests
from py2neo import neo4j

# Connect to graph and add constraints.
neo4jUrl = os.environ.get('NEO4J_URL', "http://localhost:7474/db/data/")
graph = neo4j.GraphDatabaseService(neo4jUrl)

# Add uniqueness constraints.
neo4j.CypherQuery(graph, "CREATE CONSTRAINT ON (q:Question) ASSERT q.id IS UNIQUE;").run()

# Build URL.
apiUrl = "https://api.stackexchange.com/2.2/questions...." % (tag,page,page_size)
# Send GET request.
json = requests.get(apiUrl, headers = {"accept":"application/json"}).json()

# Build query.
query = """
UNWIND {json} AS data ....
"""

# Send Cypher query.
neo4j.CypherQuery(graph, query).run(json=json)

