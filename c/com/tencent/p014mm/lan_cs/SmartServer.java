package com.tencent.p014mm.lan_cs;

/* renamed from: com.tencent.mm.lan_cs.SmartServer */
public class SmartServer {

    /* renamed from: a */
    public static C68054a f195333a;

    /* renamed from: com.tencent.mm.lan_cs.SmartServer$C2Java */
    public static class C2Java {
        public static void onSendFail(String str, int i) {
            C68054a aVar = SmartServer.f195333a;
            if (aVar != null) {
                aVar.mo93529a(str, i);
            }
        }

        public static void onSendProgressChange(String str, long j, long j2) {
            C68054a aVar = SmartServer.f195333a;
            if (aVar != null) {
                aVar.mo93530b(str, j, j2);
            }
        }

        public static void onSendSucc(String str) {
            C68054a aVar = SmartServer.f195333a;
            if (aVar != null) {
                aVar.mo93531c(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.lan_cs.SmartServer$Java2C */
    public static class Java2C {
        public static native void addFileInfo(ServerFileInfo serverFileInfo);

        public static native int removeFileInfo(String str);

        /* access modifiers changed from: private */
        public static native Object[] startSmartServer();

        public static native void stopSmartServer();
    }

    /* renamed from: com.tencent.mm.lan_cs.SmartServer$ServerFileInfo */
    public static class ServerFileInfo {
        public int betweenRequestTimeoutMs = -1;
        public String cgi = null;
        public String cryptKey = null;
        public String filePath = null;
        public int fileType = 0;
        public int idleTimeoutMs = -1;
        public int totalSendTimeoutMs = -1;
    }

    /* renamed from: com.tencent.mm.lan_cs.SmartServer$a */
    public interface C68054a {
        /* renamed from: a */
        void mo93529a(String str, int i);

        /* renamed from: b */
        void mo93530b(String str, long j, long j2);

        /* renamed from: c */
        void mo93531c(String str);
    }
}
