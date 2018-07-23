package penultimate.psychohistory;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


public class DataUpdater{
    public void getJSONFromURL(String sourceURL){
        //Gets the initial Data Load for Factions
        try {
            URL website = new URL(sourceURL);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("Data/factions.json");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (MalformedURLException e){
            System.out.println("Invalid URL passed.");
        }
        catch (FileNotFoundException e){
            System.out.println("The destination file was failed to be created by fos");
        }
        catch (IOException e){
            System.out.println("Transfer Failed for " + sourceURL);
        }
        finally {
            System.gc();
        }

    }
    public void getJSONFromURL(String sourceURL, String destination){
        //Gets the initial Data Load for Factions
        try {
            URL website = new URL(sourceURL);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(destination);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (MalformedURLException e){
            System.out.println("Invalid URL passed.");
        }
        catch (FileNotFoundException e){
            System.out.println("The destination file was failed to be created by fos");
        }
        catch (IOException e){
            System.out.println("Transfer Failed for " + sourceURL);
        }
        finally {
            System.gc();
        }

    }

    public void getFactionsFromURL(){
        //Gets the initial Data Load for Factions
        try {
            URL website = new URL("https://eddb.io/archive/v5/factions.json");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("Data/factions.json");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (MalformedURLException e){
            System.out.println("The URL provided for faction JSON is malformed.");
        }
        catch (FileNotFoundException e){
            System.out.println("The factions.json file failed to be created by fos");
        }
        catch (IOException e){
            System.out.println("Transfer Failed for factions.json");
        }
        finally {
            System.gc();
        }

    }
    public void getStationsFromURL(){
        //Gets the initial Data Load for Stations
        try {
            URL website = new URL("https://eddb.io/archive/v5/stations.json");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("Data/stations.json");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (MalformedURLException e){
            System.out.println("The URL provided for stations JSON is malformed.");
        }
        catch (FileNotFoundException e){
            System.out.println("The stations.json file failed to be created by fos");
        }
        catch (IOException e){System.out.println("Transfer Failed for stations.json");}
        finally {
            System.gc();
        }

    }
    public void getSystemsPopluatedFromURL(){
        //Gets the initial Data Load for Systems_Populated
        try {
            URL website = new URL("https://eddb.io/archive/v5/systems_populated.json");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("Data/systems_populated.json");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (MalformedURLException e){
            System.out.println("The URL provided for systems_populated JSON is malformed.");
        }
        catch (FileNotFoundException e){
            System.out.println("The systems_populated.json file failed to be created by fos");
        }
        catch (IOException e){System.out.println("Transfer Failed for factions.json");}
        finally {
            System.gc();
        }

    }
}
