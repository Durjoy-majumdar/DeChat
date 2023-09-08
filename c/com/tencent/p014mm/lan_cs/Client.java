package com.tencent.p014mm.lan_cs;

import com.tencent.mars.cdn.CdnLogic;
import java.io.IOException;
import zu0.C23575c;
import zu0.C66985a;

/* renamed from: com.tencent.mm.lan_cs.Client */
public class Client {

    /* renamed from: a */
    public static C55201a f157040a;

    /* renamed from: com.tencent.mm.lan_cs.Client$C2Java */
    public static class C2Java {
        public static void onDisconnect(String str, int i) {
            C55201a aVar = Client.f157040a;
            if (aVar != null) {
                ((C66985a) aVar).f192448a.mo37035d(true, 0, CdnLogic.kMediaTypeBeatificFile, "client onDisconnect".getBytes());
            }
        }

        public static void onRecv(String str, int i, byte[] bArr) {
            C55201a aVar = Client.f157040a;
            if (aVar != null) {
                C66985a aVar2 = (C66985a) aVar;
                C23575c cVar = aVar2.f192448a;
                cVar.f67577b = str;
                cVar.f67578c = i;
                try {
                    C23575c.m28147c(cVar, bArr);
                } catch (IOException e) {
                    C23575c cVar2 = aVar2.f192448a;
                    cVar2.mo37035d(true, 0, 10006, ("client readErr:" + e.toString()).getBytes());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.lan_cs.Client$Java2C */
    public static class Java2C {
        public static native void disconnect();

        public static native int send(String str, int i, byte[] bArr);
    }

    /* renamed from: com.tencent.mm.lan_cs.Client$a */
    public interface C55201a {
    }
}
