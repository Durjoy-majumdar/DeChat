package qc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C64719t23;

/* renamed from: qc0.o */
public class C62602o {

    /* renamed from: a */
    public String f177793a;

    /* renamed from: b */
    public C64719t23 f177794b;

    /* renamed from: c */
    public String f177795c;

    /* renamed from: a */
    public static C62602o m73561a(String str, C64719t23 t232) {
        C62602o oVar = new C62602o();
        oVar.f177793a = str;
        if (t232 != null) {
            try {
                C64719t23 t233 = new C64719t23();
                t233.parseFrom(t232.toByteArray());
                oVar.f177794b = t233;
                String str2 = t233.f185472t;
                oVar.f177795c = str2;
                if (Util.isNullOrNil(str2)) {
                    oVar.f177795c = t233.f185475w;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MusicWrapperExtend", e, "alvinluo createMusicWrapperExtend exception", new Object[0]);
            }
        }
        return oVar;
    }

    /* renamed from: b */
    public static C62602o m73562b(String str, C64719t23 t232, String str2) {
        C62602o oVar = new C62602o();
        oVar.f177793a = str;
        if (t232 != null) {
            try {
                C64719t23 t233 = new C64719t23();
                t233.parseFrom(t232.toByteArray());
                oVar.f177794b = t233;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MusicWrapperExtend", e, "alvinluo createMusicWrapperExtend exception", new Object[0]);
            }
        }
        oVar.f177795c = str2;
        return oVar;
    }
}
