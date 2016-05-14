package ch.hgrieder;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Created by Hermann Grieder on 5/13/2016.
 */
public class Client extends NetworkConnection{

    private String ip;
    private int port;

    public Client(String ip, int port, Consumer<Serializable> onReceiveCallback) {
        super(onReceiveCallback);
        this.ip = ip;
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return false;
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
