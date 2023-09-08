package i03;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import sx3.C110818d0;

/* renamed from: i03.c */
public final class C60240c {

    /* renamed from: a */
    public C60239b f171750a;

    /* renamed from: b */
    public long f171751b;

    /* renamed from: c */
    public long f171752c;

    /* renamed from: d */
    public long f171753d;

    /* renamed from: e */
    public final HashMap<Integer, C60238a> f171754e = new HashMap<>();

    /* renamed from: i03.c$a */
    public static final class C8839a extends C87413o implements C32226l<Map.Entry<Integer, C60238a>, CharSequence> {

        /* renamed from: d */
        public static final C8839a f28058d = new C8839a();

        public C8839a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            return ((Number) entry.getKey()).intValue() + ":[" + entry.getValue() + "] ";
        }
    }

    /* renamed from: a */
    public final void mo85227a(int i, C60238a aVar) {
        C87412m.m108594g(aVar, "info");
        if (this.f171754e.isEmpty() || this.f171753d <= 0) {
            this.f171753d = aVar.f171735b;
        }
        C60239b bVar = this.f171750a;
        if (bVar != null) {
            aVar.f171740g = (int) ((((float) bVar.f171746b) * 1.0f) / ((float) bVar.f171745a));
            aVar.f171741h = bVar.f171747c;
            aVar.f171742i = bVar.f171748d;
            bVar.f171745a = 0;
            bVar.f171746b = 0;
            bVar.f171747c = 0;
            bVar.f171748d = 0;
        }
        this.f171754e.put(Integer.valueOf(i), aVar);
        Log.m105924i("MicroMsg.MV.MvReportInfo", i + ", " + aVar);
    }

    public String toString() {
        Set<Map.Entry<Integer, C60238a>> entrySet = this.f171754e.entrySet();
        C87412m.m108593f(entrySet, "mediaReportInfo.entries");
        return C110818d0.m150921S(entrySet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C8839a.f28058d, 31, (Object) null);
    }
}
