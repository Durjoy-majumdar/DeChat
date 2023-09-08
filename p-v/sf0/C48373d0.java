package sf0;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import o90.C100308d;
import te3.C49616gv2;
import te3.C49758hv2;

/* renamed from: sf0.d0 */
public final class C48373d0 {

    /* renamed from: a */
    public static final C48373d0 f129498a = new C48373d0();

    /* renamed from: b */
    public static final String f129499b;

    /* renamed from: c */
    public static final C100308d<String, C49758hv2> f129500c;

    static {
        String str = C112760b.m154225d() + "media_export.proto";
        f129499b = str;
        C100308d<String, C49758hv2> dVar = new C100308d<>(500);
        f129500c = dVar;
        Log.m105924i("MicroMsg.MediaExportLogic", "readFromCache");
        byte[] O = C86013q1.m106433O(str, 0, -1);
        dVar.clear();
        if (O != null) {
            if (!(O.length == 0)) {
                try {
                    C49616gv2 gv22 = new C49616gv2();
                    gv22.parseFrom(O);
                    LinkedList<C49758hv2> linkedList = gv22.f134301d;
                    C87412m.m108593f(linkedList, "cache.exportInfoList");
                    for (C49758hv2 hv22 : linkedList) {
                        f129500c.put(hv22.f134897d, hv22);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MediaExportLogic", e, "", new Object[0]);
                    C86013q1.m106447h(f129499b);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo73084a(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        C49758hv2 hv22 = f129500c.get(str);
        if (hv22 != null) {
            str2 = hv22.f134898e;
        }
        mo73086c();
        Log.m105924i("MicroMsg.MediaExportLogic", "getExportUUID " + str + ", " + str2);
        return str2;
    }

    /* renamed from: b */
    public final void mo73085b(String str, String str2) {
        if (!(str == null || str2 == null)) {
            C49758hv2 hv22 = new C49758hv2();
            hv22.f134897d = str;
            hv22.f134898e = str2;
            f129500c.put(str, hv22);
            mo73086c();
        }
        Log.m105924i("MicroMsg.MediaExportLogic", "saveExportUUID " + str + ", " + str2);
    }

    /* renamed from: c */
    public final void mo73086c() {
        Map<String, C49758hv2> snapshot = f129500c.snapshot();
        Log.m105924i("MicroMsg.MediaExportLogic", "saveToCache " + snapshot.size());
        C49616gv2 gv22 = new C49616gv2();
        for (Map.Entry<String, C49758hv2> value : snapshot.entrySet()) {
            gv22.f134301d.add(value.getValue());
        }
        try {
            C86013q1.m106437S(f129499b, gv22.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaExportLogic", e, "", new Object[0]);
        }
    }
}
