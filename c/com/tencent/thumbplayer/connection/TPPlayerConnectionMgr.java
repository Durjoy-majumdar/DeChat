package com.tencent.thumbplayer.connection;

import com.tencent.thumbplayer.api.connection.ITPPlayerConnection;
import com.tencent.thumbplayer.api.connection.TPPlayerConnectionNode;
import com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionMgr;

public class TPPlayerConnectionMgr implements ITPPlayerConnection {
    private TPNativePlayerConnectionMgr mNativeConnection = new TPNativePlayerConnectionMgr();

    public int activeAllConnections() {
        return this.mNativeConnection.activeAllConnections();
    }

    public int activeConnection(int i) {
        return this.mNativeConnection.activeConnection(i);
    }

    public int addConnection(long j, TPPlayerConnectionNode tPPlayerConnectionNode, long j2, TPPlayerConnectionNode tPPlayerConnectionNode2) {
        return this.mNativeConnection.addConnection(j, tPPlayerConnectionNode.getNativeNode(), j2, tPPlayerConnectionNode2.getNativeNode());
    }

    public void deactiveAllConnections() {
        this.mNativeConnection.deactiveAllConnections();
    }

    public void deactiveConnection(int i) {
        this.mNativeConnection.deactiveConnection(i);
    }

    public void init() {
        this.mNativeConnection.init();
    }

    public void removeConnection(int i) {
        this.mNativeConnection.removeConnection(i);
    }

    public void uninit() {
        this.mNativeConnection.unInit();
    }
}
