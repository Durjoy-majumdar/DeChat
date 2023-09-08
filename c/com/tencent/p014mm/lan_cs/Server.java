package com.tencent.p014mm.lan_cs;

import com.tencent.mars.cdn.CdnLogic;
import gv0.C20842c;
import java.io.IOException;
import zu0.C23575c;

/* renamed from: com.tencent.mm.lan_cs.Server */
public class Server {

    /* renamed from: a */
    public static C55202a f157041a;

    /* renamed from: com.tencent.mm.lan_cs.Server$C2Java */
    public static class C2Java {
        public static void onConnect(String str, int i) {
            C55202a aVar = Server.f157041a;
            if (aVar != null) {
                C23575c cVar = C23575c.this;
                cVar.f67577b = str;
                cVar.f67578c = i;
            }
        }

        public static void onDisconnect(String str, int i) {
            C55202a aVar = Server.f157041a;
            if (aVar != null) {
                C23575c.this.mo37035d(true, 0, CdnLogic.kMediaTypeBeatificFile, "listen server onDisconnect".getBytes());
            }
        }

        public static void onRecv(String str, int i, byte[] bArr) {
            C55202a aVar = Server.f157041a;
            if (aVar != null) {
                C23575c.C23579d dVar = (C23575c.C23579d) aVar;
                C23575c cVar = C23575c.this;
                cVar.f67577b = str;
                cVar.f67578c = i;
                try {
                    C23575c.m28147c(cVar, bArr);
                } catch (IOException e) {
                    C23575c cVar2 = C23575c.this;
                    cVar2.mo37035d(true, 0, 10006, ("server readErr:" + e.toString()).getBytes());
                }
            }
        }

        public static void onSend(String str, int i, int i2) {
            C55202a aVar = Server.f157041a;
            if (aVar != null && C23575c.this.f67576a.get() == 1) {
                C20842c.m22878j1(i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.lan_cs.Server$Java2C */
    public static class Java2C {
        public static native int send(String str, int i, byte[] bArr);

        public static native Object[] start();

        /* access modifiers changed from: private */
        public static native boolean startWithIP(String str, int i);

        public static native void stop();
    }

    /* renamed from: com.tencent.mm.lan_cs.Server$a */
    public interface C55202a {
    }
}
