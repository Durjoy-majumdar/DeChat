package com.eclipsesource.mmv8;

public class V8Inspector {
    private static JsInspectorChannelServer _server;

    public interface JsInspectorChannelServer {
        int notify(long j, long j2, String str);

        int sendData(long j, String str);
    }

    public static native int JniNotify(long j, long j2, String str);

    public static native void JniReceiveData(long j, String str);

    public static int jniCallbackNotify(long j, long j2, String str) {
        JsInspectorChannelServer jsInspectorChannelServer = _server;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.notify(j, j2, str);
    }

    public static int jniCallbackSendData(long j, String str) {
        JsInspectorChannelServer jsInspectorChannelServer = _server;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.sendData(j, str);
    }

    public static int notify(long j, long j2, String str) {
        return JniNotify(j, j2, str);
    }

    public static void onReceiveData(long j, String str) {
        JniReceiveData(j, str);
    }

    public static void setServer(JsInspectorChannelServer jsInspectorChannelServer) {
        _server = jsInspectorChannelServer;
    }
}
