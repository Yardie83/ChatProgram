package ch.hgrieder;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Created by Hermann Grieder on 5/13/2016.
 */
public class Server extends NetworkConnection{

    private int port;

    public Server(int port, Consumer<Serializable> onReceiveCallback) {
        super(onReceiveCallback);
        this.port = port;;

    }

    @Override
    protected boolean isServer() {
        return true;
    }

    @Override
    protected String getIP() {
        return null;
    }

    @Override
    protected int getPort() {
        return port;
    }
}
