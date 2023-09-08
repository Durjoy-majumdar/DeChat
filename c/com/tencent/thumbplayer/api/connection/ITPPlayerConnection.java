package com.tencent.thumbplayer.api.connection;

public interface ITPPlayerConnection {
    int activeAllConnections();

    int activeConnection(int i);

    int addConnection(long j, TPPlayerConnectionNode tPPlayerConnectionNode, long j2, TPPlayerConnectionNode tPPlayerConnectionNode2);

    void deactiveAllConnections();

    void deactiveConnection(int i);

    void init();

    void removeConnection(int i);

    void uninit();
}
