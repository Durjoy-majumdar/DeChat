package ca1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C118423dg2;

/* renamed from: ca1.a */
public final class C113263a {
    /* renamed from: a */
    public static synchronized C118423dg2 m155052a() {
        C118423dg2 dg22;
        synchronized (C113263a.class) {
            byte[] a = C116850b.m164831a("mmkv_key_hell_PFLOW");
            dg22 = null;
            if (a != null) {
                if (a.length > 0) {
                    C118423dg2 dg23 = new C118423dg2();
                    try {
                        dg23.parseFrom(a);
                        dg22 = dg23;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellPageFlowDao", e, "HellPageFlowDao.read crash: %s", e.getMessage());
                    }
                }
            }
            if (dg22 == null) {
                dg22 = new C118423dg2();
                m155054c(dg22);
            }
        }
        return dg22;
    }

    /* renamed from: b */
    public static synchronized void m155053b(C118423dg2 dg22) {
        synchronized (C113263a.class) {
            if (dg22 != null) {
                m155054c(dg22);
            }
        }
    }

    /* renamed from: c */
    public static void m155054c(C118423dg2 dg22) {
        try {
            C116850b.m164834d("mmkv_key_hell_PFLOW", dg22.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellPageFlowDao", e, "HellPageFlowDao.writeBack crash: %s", e.getMessage());
        }
    }
}
