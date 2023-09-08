package dm3;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C106691j3;
import com.tencent.p014mm.p136ui.magicemoji.core.MEHolderView;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.C85278l0;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C31066c0;
import d42.C86183k;
import d42.C86193x;
import d42.C86195z;
import di3.C86312j;
import e42.C7594e;
import e42.C86431j;
import e61.C86453a;
import e61.C86454b;
import em3.C86577b;
import em3.C86579d;
import em3.C86580e;
import em3.C86581f;
import em3.C86582g;
import em3.C86583h;
import em3.C86584i;
import f61.C86758a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h61.C8490d;
import h61.C87455a;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kr0.C33987b1;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import p212oe.C89205v;
import p212oe.v$$c;
import p933be.C79691a;
import q52.C62582g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64187h0;
import sx3.C64197v;
import tm0.C78044d0;
import z04.C66731x;

/* renamed from: dm3.b */
public final class C86351b extends C7594e implements C86193x, C86183k {

    /* renamed from: q */
    public static boolean f251054q;

    /* renamed from: a */
    public final C67391b f251055a;

    /* renamed from: b */
    public final MEHolderView f251056b;

    /* renamed from: c */
    public final C32226l<Long, Boolean> f251057c;

    /* renamed from: d */
    public final Handler f251058d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public C86350a f251059e;

    /* renamed from: f */
    public C86454b f251060f;

    /* renamed from: g */
    public boolean f251061g;

    /* renamed from: h */
    public final ArrayList<C86353b> f251062h;

    /* renamed from: i */
    public final Runnable f251063i;

    /* renamed from: j */
    public final Runnable f251064j;

    /* renamed from: k */
    public final Runnable f251065k;

    /* renamed from: l */
    public C86195z<C86351b> f251066l;

    /* renamed from: m */
    public C86195z<C86351b> f251067m;

    /* renamed from: n */
    public C62582g f251068n;

    /* renamed from: o */
    public final C13601g f251069o;

    /* renamed from: p */
    public final C13601g f251070p;

    /* renamed from: dm3.b$c */
    public static final class C31205c extends C87413o implements C32224a<C13604l<? extends Set<? extends String>, ? extends Integer>> {

        /* renamed from: d */
        public static final C31205c f83618d = new C31205c();

        public C31205c() {
            super(0);
        }

        public Object invoke() {
            C13604l lVar;
            String F5 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_magicemoji_cocos", "");
            C87412m.m108593f(F5, "data");
            if (F5.length() == 0) {
                lVar = new C13604l(C64187h0.f181908d, 100000);
            } else {
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = new JSONObject(F5);
                    JSONArray jSONArray = jSONObject.getJSONArray("magicemoji");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj = jSONArray.get(i);
                        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                        arrayList.add((String) obj);
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray("easteregg");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object obj2 = jSONArray2.get(i2);
                        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                        arrayList.add((String) obj2);
                    }
                    lVar = new C13604l(C110818d0.m150904D0(arrayList), Integer.valueOf(jSONObject.optInt("minVersion", 100000)));
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MEChattingMgr", "parse keyword abtest failed: " + e);
                    lVar = new C13604l(C64187h0.f181908d, 100000);
                }
            }
            Log.m105924i("MicroMsg.MEChattingMgr", "get cocos keyword from abtest: " + lVar);
            return lVar;
        }
    }

    /* renamed from: dm3.b$e */
    public static final class C31206e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C31206e f83619d = new C31206e();

        public C31206e() {
            super(0);
        }

        public Object invoke() {
            String F5 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_magicemoji_keepalive_timeout", "");
            C87412m.m108593f(F5, "getService(IExptService:…RD_ABTEST_KEEP_ALIVE, \"\")");
            Long f = C66731x.m78732f(F5);
            Log.m105924i("MicroMsg.MEChattingMgr", "destroyTimeout value is " + f);
            return Long.valueOf(f != null ? f.longValue() : 60000);
        }
    }

    /* renamed from: dm3.b$a */
    public /* synthetic */ class C86352a extends C24565l implements C32224a<C13598b0> {
        public C86352a(Object obj) {
            super(0, obj, C86351b.class, "onBoundingBoxClick", "onBoundingBoxClick()V", 0);
        }

        public Object invoke() {
            C13598b0 b0Var;
            C86351b bVar = (C86351b) this.receiver;
            bVar.getClass();
            C86454b bVar2 = bVar.f251060f;
            String s = new C86758a(new C86758a.C86761c(bVar2.f251247a, bVar2.f251248b, bVar2.f251249c)).mo121165s();
            C86195z<C86351b> g0 = bVar.mo120733g0(bVar.f251060f.f251247a);
            if (g0 != null) {
                g0.mo120601d(C86758a.NAME, s);
                g0.mo120601d("OnClientEvent", s);
                bVar.mo120736j0();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.MEChattingMgr", "onBoundingBoxClick without biz");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dm3.b$b */
    public static final class C86353b {

        /* renamed from: a */
        public final long f251071a;

        /* renamed from: b */
        public final boolean f251072b;

        /* renamed from: c */
        public final C86453a f251073c;

        public C86353b(long j, boolean z, C86453a aVar) {
            C87412m.m108594g(aVar, "ext");
            this.f251071a = j;
            this.f251072b = z;
            this.f251073c = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C86353b)) {
                return false;
            }
            C86353b bVar = (C86353b) obj;
            return this.f251071a == bVar.f251071a && this.f251072b == bVar.f251072b && C87412m.m108589b(this.f251073c, bVar.f251073c);
        }

        public int hashCode() {
            long j = this.f251071a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            boolean z = this.f251072b;
            if (z) {
                z = true;
            }
            return ((i + (z ? 1 : 0)) * 31) + this.f251073c.hashCode();
        }

        public String toString() {
            return "MagicEggSendItem(sendTime=" + this.f251071a + ", clickable=" + this.f251072b + ", ext=" + this.f251073c + ')';
        }
    }

    /* renamed from: dm3.b$d */
    public static final class C86354d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86351b f251074d;

        public C86354d(C86351b bVar) {
            this.f251074d = bVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MEChattingMgr", "destroyBizTask because of timeout");
            C86195z<C86351b> zVar = this.f251074d.f251066l;
            if (zVar != null) {
                zVar.destroy();
            }
            C86351b bVar = this.f251074d;
            bVar.f251066l = null;
            C86195z<C86351b> zVar2 = bVar.f251067m;
            if (zVar2 != null) {
                zVar2.destroy();
            }
            C86351b bVar2 = this.f251074d;
            bVar2.f251067m = null;
            C62582g gVar = bVar2.f251068n;
            if (gVar != null) {
                gVar.mo87640d();
            }
            this.f251074d.f251068n = null;
        }
    }

    /* renamed from: dm3.b$f */
    public static final class C86355f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86351b f251075d;

        public C86355f(C86351b bVar) {
            this.f251075d = bVar;
        }

        public final void run() {
            C86351b bVar = this.f251075d;
            bVar.f251056b.f250188d = MEHolderView.f250187f;
            bVar.mo120734h0(bVar.f251060f, 1);
        }
    }

    /* renamed from: dm3.b$g */
    public static final class C86356g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86351b f251076d;

        public C86356g(C86351b bVar) {
            this.f251076d = bVar;
        }

        public final void run() {
            this.f251076d.mo120738l0();
        }
    }

    public C86351b(C67391b bVar, MEHolderView mEHolderView, C32226l<? super Long, Boolean> lVar) {
        C87412m.m108594g(bVar, "chattingContext");
        C87412m.m108594g(mEHolderView, "holder");
        C87412m.m108594g(lVar, "checkMsgExist");
        this.f251055a = bVar;
        this.f251056b = mEHolderView;
        this.f251057c = lVar;
        mEHolderView.setClickHandler(new C86352a(this));
        C86454b bVar2 = C86454b.f251246d;
        this.f251060f = C86454b.f251246d;
        this.f251062h = new ArrayList<>();
        this.f251063i = new C86355f(this);
        this.f251064j = new C86356g(this);
        this.f251065k = new C86354d(this);
        this.f251069o = C36568h.m40985a(C31206e.f83619d);
        this.f251070p = C36568h.m40985a(C31205c.f83618d);
    }

    /* renamed from: B */
    public void mo109582B(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] canvas destroy id = " + i);
        this.f251056b.removeView(view);
    }

    /* renamed from: R */
    public void mo109583R(int i, View view, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] canvas layout id = " + i + ", holder size = " + i2 + ' ' + i4 + ' ' + i5);
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] js exception: " + str2);
    }

    /* renamed from: Z */
    public void mo109585Z(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] canvas created id = " + i + ", holder size = " + this.f251056b.getTop() + ' ' + this.f251056b.getWidth() + ' ' + this.f251056b.getHeight());
        this.f251056b.addView(view, -1, -1);
    }

    /* renamed from: a0 */
    public void mo109586a0() {
    }

    /* renamed from: b */
    public void mo109587b() {
    }

    /* renamed from: c */
    public void mo109588c(int i, boolean z) {
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] first frame rendered");
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME] biz destroy with reason = " + i);
    }

    /* renamed from: f0 */
    public final List<C86431j<C86351b>> mo120732f0() {
        return C64197v.m75537f(new C86577b(), new C86579d(), new C86581f(), new C86580e(), new C86584i(), new C86583h(), new C86582g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r2 = r1.f251067m;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d42.C86195z<dm3.C86351b> mo120733g0(java.lang.String r2) {
        /*
            r1 = this;
            rx3.g r0 = r1.f251070p
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            rx3.l r0 = (rx3.C13604l) r0
            A r0 = r0.f38555d
            java.util.Set r0 = (java.util.Set) r0
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0019
            d42.z<dm3.b> r2 = r1.f251067m
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            d42.z<dm3.b> r2 = r1.f251066l
        L_0x001b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.C86351b.mo120733g0(java.lang.String):d42.z");
    }

    /* renamed from: h0 */
    public final void mo120734h0(C86454b bVar, int i) {
        C13598b0 b0Var;
        C87412m.m108594g(bVar, "meta");
        if (mo120738l0()) {
            Log.m105924i("MicroMsg.MEChattingMgr", "[ME] forceMagicEggStop, meta = " + bVar + ", reason = " + i);
            String s = new C86758a(new C86758a.C86760b(bVar.f251247a, bVar.f251248b, bVar.f251249c, i)).mo121165s();
            C86195z<C86351b> g0 = mo120733g0(bVar.f251247a);
            if (g0 != null) {
                g0.mo120601d(C86758a.NAME, s);
                g0.mo120601d("OnClientEvent", s);
                mo120736j0();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.MEChattingMgr", "forceMagicEggStop without biz");
            }
        }
    }

    /* renamed from: i0 */
    public final void mo120735i0() {
        Class cls = C30211n0.class;
        Class cls2 = C85278l0.class;
        Class<C78044d0> cls3 = C78044d0.class;
        if (this.f251066l == null) {
            C89205v vVar = (C89205v) C79691a.m96804a(C89205v.class);
            if (vVar != null) {
                vVar.f349668a.f339059f.post(new v$$c(vVar, "ME"));
            }
            MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
            mBBuildConfig.f248375n = this;
            mBBuildConfig.f248378q = this;
            mBBuildConfig.mo118367a(mo120732f0());
            C85280q0.m105250a(mBBuildConfig, cls3.getName());
            C86195z<C86351b> mI = ((C85278l0) C86312j.m106911c(cls2)).mo57202mI(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI);
            mI.mo120607r(this);
            mI.mo120604m(mBBuildConfig);
            mI.start();
            this.f251066l = mI;
            WxaMagicPkgInfo zs02 = ((C30211n0) C86312j.m106911c(cls)).zs0("magicemojicocos");
            if (C87455a.f253429e) {
                if (zs02 == null) {
                    Log.m105920e("MicroMsg.MEChattingMgr", "try to use boots, but pkg not found");
                    C115669n.INSTANCE.mo175911u(C87455a.f253430f, 49);
                    if (!f251054q) {
                        ((C30211n0) C86312j.m106911c(cls)).mo57240SE("magicemojicocos", "", true, (C31066c0) null);
                        f251054q = true;
                        return;
                    }
                    return;
                }
                String str = zs02.f81572o;
                C87412m.m108593f(str, "cocosPkgInfo.version");
                Integer e = C66731x.m78731e(str);
                if ((e != null ? e.intValue() : -1) < ((Number) ((C13604l) ((C36570n) this.f251070p).getValue()).f38556e).intValue()) {
                    Log.m105920e("MicroMsg.MEChattingMgr", "try to use boots, but pkg version is " + zs02.f81572o + " < " + ((Number) ((C13604l) ((C36570n) this.f251070p).getValue()).f38556e).intValue());
                    return;
                }
            }
            if (!C87455a.f253429e) {
                C87455a.C87456a aVar = C87455a.f253428d;
                if (((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(aVar.f253431a, aVar.f253433c, 0) == null) {
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                        C61926c.m72668M(new C8490d("本地没有 wxapkg, 请先触发下载"));
                        return;
                    } else {
                        Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", "本地没有 wxapkg, 请先触发下载");
                        return;
                    }
                }
            }
            Activity f = this.f251055a.mo91565f();
            C87412m.m108593f(f, "chattingContext.context");
            C62582g t7 = ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57195t7(f);
            t7.mo87639c(this.f251056b);
            MBBuildConfig mBBuildConfig2 = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
            mBBuildConfig2.f248375n = this;
            mBBuildConfig2.f248378q = this;
            mBBuildConfig2.f248377p = t7;
            mBBuildConfig2.mo118367a(mo120732f0());
            C85280q0.m105250a(mBBuildConfig2, cls3.getName());
            C86195z<C86351b> mI2 = ((C85278l0) C86312j.m106911c(cls2)).mo57202mI(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI_COCOS);
            mI2.mo120607r(this);
            mI2.mo120604m(mBBuildConfig2);
            mI2.start();
            this.f251067m = mI2;
            this.f251068n = t7;
            mo120736j0();
        }
    }

    /* renamed from: j0 */
    public final void mo120736j0() {
        this.f251058d.removeCallbacks(this.f251065k);
        this.f251058d.postDelayed(this.f251065k, ((Number) ((C36570n) this.f251069o).getValue()).longValue());
    }

    /* renamed from: k0 */
    public final void mo120737k0(C86454b bVar, boolean z, C86453a aVar) {
        C13598b0 b0Var;
        Log.m105924i("MicroMsg.MEChattingMgr", "[ME]: sendMagicEgg: " + bVar + ", " + z + ", " + aVar);
        if (!z || !this.f251061g) {
            if (z) {
                this.f251061g = true;
            }
            String s = new C86758a(new C86758a.C86762d(bVar.f251247a, bVar.f251248b, bVar.f251249c, z, aVar.f251244a, aVar.f251245b)).mo121165s();
            C86195z<C86351b> g0 = mo120733g0(bVar.f251247a);
            if (g0 != null) {
                g0.mo120601d(C86758a.NAME, s);
                g0.mo120601d("OnClientEvent", s);
                mo120736j0();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.MEChattingMgr", "sendMagicEgg without biz");
                C115669n.INSTANCE.mo175911u(C87455a.f253430f, 68);
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.MEChattingMgr", "[ME]: only one clickable in a session");
    }

    /* renamed from: l0 */
    public final boolean mo120738l0() {
        C86454b bVar = this.f251060f;
        C86454b bVar2 = C86454b.f251246d;
        C86454b bVar3 = C86454b.f251246d;
        if (C87412m.m108589b(bVar, bVar3)) {
            return false;
        }
        this.f251056b.f250188d = MEHolderView.f250187f;
        this.f251058d.removeCallbacks(this.f251063i);
        this.f251058d.removeCallbacks(this.f251064j);
        this.f251062h.clear();
        C86350a aVar = this.f251059e;
        if (aVar != null) {
            C86454b bVar4 = this.f251060f;
            Log.m105925i("MicroMsg.EggMgr", "onEnd: %s, %s", bVar4.f251248b, bVar4.f251247a);
            C106691j3.this.f318967r = false;
        }
        this.f251060f = bVar3;
        this.f251061g = false;
        return true;
    }

    /* renamed from: n */
    public void mo109590n() {
    }

    public void onCreated() {
    }

    public void onPause() {
    }

    public void onResume() {
    }
}
