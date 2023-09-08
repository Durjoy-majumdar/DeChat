package wp1;

import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k60.C60979d;
import o40.C61926c;
import o40.C61937h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import te3.C48996cf1;
import te3.C49138df1;
import te3.C49839if1;
import te3.C49985jf1;
import te3.C51827wf3;
import te3.C51967xf3;
import up1.C27696y;
import up1.C37521f;

/* renamed from: wp1.j */
public final class C15587j {

    /* renamed from: a */
    public static final C15587j f42215a = new C15587j();

    /* renamed from: b */
    public static final HashMap<Integer, C49839if1> f42216b = new HashMap<>();

    /* renamed from: c */
    public static LinkedList<C48996cf1> f42217c = new LinkedList<>();

    /* renamed from: d */
    public static LinkedList<C49138df1> f42218d = new LinkedList<>();

    /* renamed from: e */
    public static final HashMap<String, C51827wf3> f42219e = new HashMap<>();

    /* renamed from: f */
    public static C49985jf1 f42220f = new C49985jf1();

    /* renamed from: wp1.j$a */
    public static final class C15588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C49985jf1 f42221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15588a(C49985jf1 jf12) {
            super(0);
            this.f42221d = jf12;
        }

        public Object invoke() {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_OBJECT_WORDING_CONFIG_STRING_SYNC, Util.encodeHexString(this.f42221d.toByteArray()));
            return C13598b0.f38549a;
        }
    }

    static {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_OBJECT_WORDING_CONFIG_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        byte[] decodeHexString = Util.decodeHexString((String) f);
        C49985jf1 jf12 = f42220f;
        if (decodeHexString != null) {
            try {
                jf12.parseFrom(decodeHexString);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        f42215a.mo14354f(f42220f, false, Boolean.FALSE);
    }

    /* renamed from: a */
    public final C48996cf1 mo14349a(String str) {
        T t;
        C87412m.m108594g(str, "key");
        Iterator<T> it = f42217c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C48996cf1) t).f131696g, str)) {
                break;
            }
        }
        return (C48996cf1) t;
    }

    /* renamed from: b */
    public final String mo14350b(String str) {
        T t;
        C87412m.m108594g(str, "key");
        Iterator<T> it = f42218d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C49138df1) t).f132286h, str)) {
                break;
            }
        }
        C49138df1 df12 = (C49138df1) t;
        if (df12 == null) {
            return null;
        }
        int i = df12.f132283e;
        String str2 = i != 1 ? i != 2 ? null : df12.f132285g : df12.f132284f;
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        return str2;
    }

    /* renamed from: c */
    public final C49839if1 mo14351c(int i) {
        C37521f.f99374d.getClass();
        if (C37521f.f99281S2.mo60266n().intValue() == 1) {
            i = 1;
        }
        return f42216b.get(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final C51827wf3 mo14352d(String str) {
        C87412m.m108594g(str, "appid");
        return f42219e.get(str);
    }

    /* renamed from: e */
    public final void mo14353e(String str) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (!(str == null || str.length() == 0)) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        }
    }

    /* renamed from: f */
    public final void mo14354f(C49985jf1 jf12, boolean z, Boolean bool) {
        LinkedList<C51827wf3> linkedList;
        String str;
        String str2;
        String str3;
        C87412m.m108594g(jf12, "infoList");
        Log.m105924i("FinderObjectWordingConfig", "[resetConfig] infoList = " + C61937h.m72709h(jf12) + ", needUpdateMemory = " + z + ", needRefreshStorage = " + bool);
        f42216b.clear();
        LinkedList<C49839if1> linkedList2 = jf12.f136091d;
        if (linkedList2 != null) {
            for (C49839if1 if12 : linkedList2) {
                f42216b.put(Integer.valueOf(if12.f135261d), if12);
                C15587j jVar = f42215a;
                C11978e0 e0Var = C11978e0.f34938a;
                C60979d<C100810g0> b = e0Var.mo11850b();
                String str4 = if12.f135268n;
                C27696y yVar = C27696y.RAW_IMAGE;
                C11984n0 n0Var = new C11984n0(str4, yVar);
                C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
                b.mo85956b(n0Var, e0Var.mo11851c(aVar));
                e0Var.mo11850b().mo85956b(new C11984n0(if12.f135269o, yVar), e0Var.mo11851c(aVar));
                e0Var.mo11850b().mo85956b(new C11984n0(if12.f135270p, yVar), e0Var.mo11851c(aVar));
                e0Var.mo11850b().mo85956b(new C11984n0(if12.f135271q, yVar), e0Var.mo11851c(aVar));
                C48996cf1 a = jVar.mo14349a("FinderObjectDynamicImageKey_FinderFavOnIcon");
                String str5 = "";
                if (a == null || (str = a.f131694e) == null) {
                    str = str5;
                }
                jVar.mo14353e(str);
                C48996cf1 a2 = jVar.mo14349a("FinderObjectDynamicImageKey_FinderFavOffIcon");
                if (a2 == null || (str2 = a2.f131694e) == null) {
                    str2 = str5;
                }
                jVar.mo14353e(str2);
                C48996cf1 a3 = jVar.mo14349a("FinderObjectDynamicImageKey_FinderFavManageIcon");
                if (!(a3 == null || (str3 = a3.f131694e) == null)) {
                    str5 = str3;
                }
                jVar.mo14353e(str5);
            }
        }
        LinkedList<C48996cf1> linkedList3 = jf12.f136096i;
        if (linkedList3 == null) {
            linkedList3 = new LinkedList<>();
        }
        f42217c = linkedList3;
        LinkedList<C49138df1> linkedList4 = jf12.f136097j;
        if (linkedList4 == null) {
            linkedList4 = new LinkedList<>();
        }
        f42218d = linkedList4;
        HashMap<String, C51827wf3> hashMap = f42219e;
        hashMap.clear();
        C37521f.f99374d.getClass();
        if (C37521f.f99393f1.mo60266n().intValue() == 1) {
            C51827wf3 wf32 = new C51827wf3();
            wf32.f144028o = "https://miaojian.weixin.qq.com/download/apps?channel=1104";
            wf32.f144029p = "com.tencent.phoenix";
            wf32.f144027n = "miaojian://createVideo?scene=channels&from=channels-samestyle&miaojianExtInfo=";
            wf32.f144030q = "A24DC0755072F64C480DC06DCD3412BF";
            wf32.f144026j = "https://apps.apple.com/app/apple-store/id1530922601?pt=69276&ct=channels1&mt=8";
            wf32.f144022f = null;
            wf32.f144021e = "http://dldir1.qq.com/weixin/checkresupdate/outlined_miaojian_658e3fe317814fc8a1c209e9a5937e01.png";
            wf32.f144020d = "秒剪做同款";
            wf32.f144023g = 0;
            wf32.f144025i = "https://v.vuevideo.net/vfromwx/createvideo?scene=channels";
            wf32.f144024h = "wxa5e0de08d96cc09d";
            wf32.f144031r = "http://dldir1.qq.com/weixin/checkresupdate/outlined_miaojian_dark_6b87f03b481440249680c17b73dac97b.png";
            C13598b0 b0Var = C13598b0.f38549a;
            hashMap.put("wxa5e0de08d96cc09d", wf32);
        }
        C51967xf3 xf32 = jf12.f136095h;
        if (!(xf32 == null || (linkedList = xf32.f144633d) == null)) {
            for (C51827wf3 wf33 : linkedList) {
                String str6 = wf33.f144024h;
                if (!(str6 == null || str6.length() == 0)) {
                    f42219e.put(str6, wf33);
                    C15587j jVar2 = f42215a;
                    jVar2.mo14353e(wf33.f144021e);
                    jVar2.mo14353e(wf33.f144031r);
                }
            }
        }
        if (z) {
            f42220f = jf12;
        }
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            C61926c.m72661F("FinderObjectWordingConfig", new C15588a(jf12));
        }
    }
}
