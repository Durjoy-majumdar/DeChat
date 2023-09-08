package qy1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import w10.C53065b;
import y10.C15928a;

/* renamed from: qy1.b */
public final class C47890b {
    /* renamed from: a */
    public static final void m53200a(String str, long j, int i, int i2, int i3, String str2) {
        C87412m.m108594g(str, "appId");
        C53065b bVar = new C53065b(str, 0, j, i, i2, i3, 0, 0, str2, 194, (C8480h) null);
        Log.m105924i("Report20267", "reportInfo = " + bVar);
        C115669n.INSTANCE.mo160131h(20267, bVar.f148104a, Integer.valueOf(bVar.f148110g), Integer.valueOf(bVar.f148111h), Integer.valueOf(C15928a.m14854a(MMApplicationContext.getContext())), 0, null, 60, Long.valueOf(bVar.f148105b), Long.valueOf(bVar.f148106c), Integer.valueOf(bVar.f148107d), Integer.valueOf(bVar.f148109f), Integer.valueOf(bVar.f148108e), null, null, null, null, null, null, null, null, null, null, null, null, null, C15928a.m14857d(bVar.f148112i), null);
    }

    /* renamed from: b */
    public static final void m53201b(String str, long j, int i, int i2, int i3, String str2, int i4, int i5) {
        C87412m.m108594g(str, "appId");
        C53065b bVar = new C53065b(str, 0, j, i, i2, i3, i5, i4, str2, 2, (C8480h) null);
        Log.m105924i("Report20267", "reportInfo = " + bVar);
        C115669n.INSTANCE.mo160131h(20267, bVar.f148104a, Integer.valueOf(bVar.f148110g), Integer.valueOf(bVar.f148111h), Integer.valueOf(C15928a.m14854a(MMApplicationContext.getContext())), 0, null, 60, Long.valueOf(bVar.f148105b), Long.valueOf(bVar.f148106c), Integer.valueOf(bVar.f148107d), Integer.valueOf(bVar.f148109f), Integer.valueOf(bVar.f148108e), null, null, null, null, null, null, null, null, null, null, null, null, null, C15928a.m14857d(bVar.f148112i), null);
    }

    /* renamed from: c */
    public static final void m53202c(C53065b bVar) {
        C87412m.m108594g(bVar, "info");
        Log.m105924i("Report20267", "reportInfo = " + bVar);
        C115669n.INSTANCE.mo160131h(20267, bVar.f148104a, Integer.valueOf(bVar.f148110g), Integer.valueOf(bVar.f148111h), Integer.valueOf(C15928a.m14854a(MMApplicationContext.getContext())), 0, null, 60, Long.valueOf(bVar.f148105b), Long.valueOf(bVar.f148106c), Integer.valueOf(bVar.f148107d), Integer.valueOf(bVar.f148109f), Integer.valueOf(bVar.f148108e), null, null, null, null, null, null, null, null, null, null, null, null, null, C15928a.m14857d(bVar.f148112i), null);
    }
}
