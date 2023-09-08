package eb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import ob0.C47350c;
import ob0.C89144l0;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C22508lo3;
import te3.C64515l72;
import te3.C64522lg;
import te3.C64546m72;
import te3.C64614oo3;
import te3.C64635po3;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;

/* renamed from: eb0.z */
public final class C20583z {

    /* renamed from: a */
    public static final C20584b f57949a = new C20584b((C8480h) null);

    /* renamed from: b */
    public static final C13601g<MultiProcessMMKV> f57950b = C36568h.m40985a(C20586a.f57964d);

    /* renamed from: c */
    public static final boolean f57951c = true;

    /* renamed from: d */
    public static final boolean f57952d = true;

    /* renamed from: e */
    public static List<C19623o0> f57953e = new LinkedList();

    /* renamed from: f */
    public static final AtomicLong f57954f = new AtomicLong(0);

    /* renamed from: g */
    public static final String f57955g = ("FirstScreenData:" + C86709a0.m107523b().mo121111i());

    /* renamed from: h */
    public static String f57956h;

    /* renamed from: eb0.z$b */
    public static final class C20584b {
        public C20584b(C8480h hVar) {
        }

        /* renamed from: e */
        public static Object m22405e(C20584b bVar, C20585c cVar, C64635po3 po32, C64522lg lgVar, C15601d dVar, int i, Object obj) {
            if ((i & 2) != 0) {
                po32 = null;
            }
            if ((i & 4) != 0) {
                lgVar = null;
            }
            bVar.getClass();
            C66218h hVar = new C66218h(C66447b.m78392b(dVar));
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            C64515l72 l722 = new C64515l72();
            l722.f184044d = cVar.f57963d;
            C20584b bVar3 = C20583z.f57949a;
            byte[] decodeBytes = bVar3.mo32230c().decodeBytes("GetRecommendFeedsBuffer");
            if (decodeBytes != null) {
                l722.f184045e = new C89349b(decodeBytes, 0, decodeBytes.length);
            }
            l722.f184046f = po32;
            l722.f184047g = lgVar;
            bVar2.f127066a = l722;
            bVar2.f127067b = new C64546m72();
            bVar2.f127068c = "/cgi-bin/mmbiz-bin/timeline/getrecommendfeeds";
            bVar2.f127069d = 4690;
            C47350c a = bVar2.mo72403a();
            Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "getRecommendFeeds scene=" + cVar.f57963d);
            if (1 == cVar.f57963d) {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - bVar3.mo32230c().decodeLong("LastReqTime", 0)) < ((long) bVar3.mo32231d(cVar))) {
                    Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "getRecommendFeeds delta < interval, return");
                    hVar.resumeWith(Result.m168114constructorimpl((Object) null));
                    return hVar.mo90314b();
                }
                bVar3.mo32230c().encode("LastReqTime", currentTimeMillis);
            }
            C89144l0.m111429e(a, new C20582y(new C8477a0(), hVar, cVar), false);
            return hVar.mo90314b();
        }

        /* renamed from: a */
        public final boolean mo32228a(C22508lo3 lo32, List<C19623o0> list) {
            if (list == null || lo32 == null || !C19613h1.m21044q(lo32)) {
                return false;
            }
            for (C19623o0 o0Var : list) {
                C22508lo3 lo33 = o0Var.f55539x1;
                if (lo33 != null && C87412m.m108589b(lo32.f64175h, lo33.f64175h)) {
                    C115669n.INSTANCE.idkeyStat(1590, 4, 1, false);
                    Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "filterRecommendFeed cardId repeat " + lo32.f64175h);
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final C64546m72 mo32229b() {
            C47465a aVar;
            byte[] decodeBytes;
            MultiProcessMMKV c = mo32230c();
            C87412m.m108593f(c, "mmkv");
            String str = C20583z.f57955g;
            if (c.containsKey(str) && (decodeBytes = c.decodeBytes(str)) != null) {
                if (!(decodeBytes.length == 0)) {
                    try {
                        C64546m72 newInstance = C64546m72.class.newInstance();
                        newInstance.parseFrom(decodeBytes);
                        aVar = newInstance;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                    }
                    return (C64546m72) aVar;
                }
            }
            aVar = null;
            return (C64546m72) aVar;
        }

        /* renamed from: c */
        public final MultiProcessMMKV mo32230c() {
            return (MultiProcessMMKV) ((C36570n) C20583z.f57950b).getValue();
        }

        /* renamed from: d */
        public final int mo32231d(C20585c cVar) {
            C87412m.m108594g(cVar, "getRecFeedScene");
            MultiProcessMMKV c = mo32230c();
            return c.decodeInt("NextReqTime-" + cVar.f57963d, 600) * 1000;
        }

        /* renamed from: f */
        public final String mo32232f(C64614oo3 oo32) {
            C87412m.m108594g(oo32, "<this>");
            return "NextReqTime=" + oo32.f184682d + " ProtectionTime=" + oo32.f184683e + " BizmsgContextCnt=" + oo32.f184686h;
        }

        /* renamed from: g */
        public final int mo32233g() {
            int decodeInt = mo32230c().decodeInt("SubscribeMsgLimit", 0);
            Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "subscribeMsgLimit = " + decodeInt);
            if (decodeInt <= 0) {
                return 1100;
            }
            return decodeInt;
        }

        /* renamed from: h */
        public final void mo32234h(C64546m72 m722) {
            C87412m.m108594g(m722, "resp");
            try {
                mo32230c().encode(C20583z.f57955g, m722.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("Micromsg.BizTLRecFeedsDataUtil", e, "saveFirstScreen", new Object[0]);
            }
        }
    }

    /* renamed from: eb0.z$c */
    public enum C20585c {
        GET_RECOMMEND_FEEDS_SCENE_ENTER(2),
        GET_RECOMMEND_FEEDS_SCENE_LOAD_MORE(3),
        GET_RECOMMEND_FEEDS_SCENE_REPLACE(4),
        GET_RECOMMEND_FEEDS_SCENE_SUPPLEMENT(5),
        GET_RECOMMEND_FEEDS_SCENE_REFRESH_AFTER_CLICK(6);
        

        /* renamed from: d */
        public final int f57963d;

        /* access modifiers changed from: public */
        C20585c(int i) {
            this.f57963d = i;
        }
    }

    /* renamed from: eb0.z$a */
    public static final class C20586a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C20586a f57964d = new C20586a();

        public C20586a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("BizTimeLineRecFeeds");
        }
    }
}
