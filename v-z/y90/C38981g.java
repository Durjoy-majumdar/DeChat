package y90;

import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: y90.g */
public final class C38981g {

    /* renamed from: a */
    public static final C38981g f105024a = new C38981g();

    /* renamed from: b */
    public static final MultiProcessMMKV f105025b = MultiProcessMMKV.getMMKV("MaasAutoFallbackOutputSizeConfig");

    /* renamed from: c */
    public static final C13601g f105026c = C36568h.m40985a(C15940a.f42824d);

    /* renamed from: d */
    public static final Map<Integer, Integer> f105027d;

    /* renamed from: e */
    public static final Map<Integer, Integer> f105028e;

    /* renamed from: f */
    public static final List<Integer> f105029f = C110818d0.m150953y0(f105027d.values());

    /* renamed from: y90.g$a */
    public static final class C15940a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C15940a f42824d = new C15940a();

        public C15940a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_maas_autofallback_outputsize, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Map<Integer, Integer> f = C90364q0.m113147f(new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_144.getId()), 144), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_224.getId()), Integer.valueOf(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL)), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_360.getId()), Integer.valueOf(v2helper.VOIP_ENC_HEIGHT_LV1)), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_480.getId()), 480), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_540.getId()), Integer.valueOf(TAVPlayer.VIDEO_PLAYER_WIDTH)), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_720.getId()), Integer.valueOf(TAVExporter.VIDEO_EXPORT_WIDTH)), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_1080.getId()), 1080), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_1440.getId()), 1440), new C13604l(Integer.valueOf(DimensionLevel.DIMENSION_LEVEL_2160.getId()), 2160));
        f105027d = f;
        Set<Map.Entry<Integer, Integer>> entrySet = f.entrySet();
        int a = C90363p0.m113142a(C36907w.m41090l(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), Integer.valueOf(((Number) entry.getKey()).intValue()));
        }
        f105028e = linkedHashMap;
    }

    /* renamed from: a */
    public final int mo61861a(DimensionLevel dimensionLevel) {
        Integer num;
        Map<Integer, Integer> map = f105027d;
        if (!map.containsKey(Integer.valueOf(dimensionLevel.getId())) || (num = map.get(Integer.valueOf(dimensionLevel.getId()))) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final void mo61862b(DimensionLevel dimensionLevel) {
        int Qe;
        int a;
        C87412m.m108594g(dimensionLevel, "dimension");
        if (((Boolean) ((C36570n) f105026c).getValue()).booleanValue() && (a = mo61861a(dimensionLevel)) >= (Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_maas_autofallback_dimension_threshold, TAVExporter.VIDEO_EXPORT_WIDTH))) {
            int id = dimensionLevel.getId();
            int a2 = mo61861a(id == DimensionLevel.DIMENSION_LEVEL_1440.getId() ? DimensionLevel.DIMENSION_LEVEL_1080 : id == DimensionLevel.DIMENSION_LEVEL_1080.getId() ? DimensionLevel.DIMENSION_LEVEL_720 : DimensionLevel.DIMENSION_LEVEL_540);
            f105025b.encode("KeyMassAutoFallbackOutputSize", a2);
            Log.m105924i("MicroMsg.MaasExportAutoFallback", "markExportFailed fallbackDimensionThreshold:" + Qe + ", size:" + a + ", fallbackSize:" + a2);
        }
    }
}
