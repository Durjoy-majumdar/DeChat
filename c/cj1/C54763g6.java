package cj1;

import b50.C54412f;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import org.json.JSONObject;
import q00.C110264g;
import q00.C12024e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s50.C63699b;
import w50.C65929d;
import w50.C65933h;
import z04.C112551y;

/* renamed from: cj1.g6 */
public final class C54763g6 {

    /* renamed from: a */
    public static final C54763g6 f153485a = new C54763g6();

    /* renamed from: b */
    public static final boolean f153486b;

    /* renamed from: c */
    public static final C13601g f153487c = C36568h.m40985a(C28570b.f78434d);

    /* renamed from: cj1.g6$b */
    public static final class C28570b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C28570b f78434d = new C28570b();

        public C28570b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MakeupSuitDataManager");
        }
    }

    /* renamed from: cj1.g6$a */
    public static final class C54764a {

        /* renamed from: a */
        public static final C54764a f153488a = new C54764a();

        /* renamed from: a */
        public final String mo75669a(int i) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            C54412f fVar = null;
            Object obj = aVar != null ? aVar.f173032r : null;
            if (obj instanceof C54412f) {
                fVar = (C54412f) obj;
            }
            boolean z = fVar != null ? fVar.f152611f : false;
            C65933h hVar = C65933h.f189544a;
            C54763g6 g6Var = C54763g6.f153485a;
            String g = hVar.mo89976g(g6Var.mo75665b());
            int c = g6Var.mo75666c(g6Var.mo75665b(), 1);
            int c2 = z ? 0 : g6Var.mo75666c(g6Var.mo75665b(), 2);
            C65929d dVar = C65929d.f189535a;
            finderLiveService.getClass();
            C63699b bVar = FinderLiveService.f159393w;
            String b = dVar.mo89970b(bVar != null ? bVar.f180566a : 0);
            finderLiveService.getClass();
            C63699b bVar2 = FinderLiveService.f159393w;
            int i2 = bVar2 != null ? bVar2.f180568c : 0;
            try {
                JSONObject jSONObject = new JSONObject();
                if (i != 0) {
                    jSONObject.put("result", i);
                }
                jSONObject.put("Beautytype", g);
                jSONObject.put("Beautyvalue", c);
                jSONObject.put("beautyFiltervalue", c2);
                jSONObject.put("Filtertype", b);
                jSONObject.put("Filtervalue", i2);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "beautyJson.toString()");
                return C112551y.m153814n(jSONObject2, ",", ";", false);
            } catch (Exception e) {
                Log.m105920e("MakeupSuitDataManager", e.toString());
                return "";
            }
        }
    }

    static {
        String yl02 = ((C12024e) C86312j.m106911c(C12024e.class)).yl0(C110264g.C47730a.APP_LIVEVLOG, "FaceMakeUpLevel");
        boolean z = true;
        if ((yl02 == null || yl02.length() == 0) || Util.safeParseFloat(yl02) != 1.0f) {
            z = false;
        }
        f153486b = z;
        Log.m105924i("Finder.MakeupSuitDataManager", "#init cfgValue=" + yl02);
    }

    /* renamed from: a */
    public final String mo75664a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107523b().mo121110g());
        sb.append('_');
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo75665b() {
        if (!f153486b) {
            return 0;
        }
        return ((MultiProcessMMKV) ((C36570n) f153487c).getValue()).getInt("MMKV_KEY_SUIT_ID_" + C86709a0.m107523b().mo121110g(), 0);
    }

    /* renamed from: c */
    public final int mo75666c(int i, int i2) {
        return ((MultiProcessMMKV) ((C36570n) f153487c).getValue()).getInt(mo75664a(i, i2), i2 == 1 ? 70 : 60);
    }

    /* renamed from: d */
    public final void mo75667d(int i) {
        ((MultiProcessMMKV) ((C36570n) f153487c).getValue()).putInt("MMKV_KEY_SUIT_ID_" + C86709a0.m107523b().mo121110g(), i);
    }

    /* renamed from: e */
    public final void mo75668e(int i, int i2, int i3) {
        Log.m105924i("MakeupSuitDataManager", "#setValue suitId=" + i + " valueType=" + i2 + " value" + i3);
        ((MultiProcessMMKV) ((C36570n) f153487c).getValue()).putInt(mo75664a(i, i2), i3);
    }
}
