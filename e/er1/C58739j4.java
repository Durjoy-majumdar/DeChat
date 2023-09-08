package er1;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bd1.C54446b;
import cm1.C0740i2;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.FinderEmptyLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C59741c0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60200t1;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import ke3.C88144b;
import ky2.C10432i;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p156gj.C87203t;
import p564iq.C87790d;
import p663qo.C101213l;
import p682rz.C36594q;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C22415w0;
import sx3.C26236u;
import sx3.C64197v;
import t91.C64208c;
import te3.C48654a21;
import te3.C50045jw0;
import te3.C50185kw0;
import te3.C64436i61;
import te3.C64513l40;
import te3.C64586nn1;
import te3.C64689rq2;
import te3.C64840xw0;
import tf0.C64916p1;
import up1.C37521f;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: er1.j4 */
public final class C58739j4 {

    /* renamed from: a */
    public static final C58739j4 f168176a = new C58739j4();

    /* renamed from: b */
    public static final String f168177b = "Finder.FinderUtil2";

    /* renamed from: c */
    public static final C13601g f168178c = C36568h.m40985a(C31675c.f84608d);

    /* renamed from: d */
    public static final C13601g f168179d = C36568h.m40985a(C31674b.f84607d);

    /* renamed from: e */
    public static final C13601g f168180e = C36568h.m40985a(C7821a.f26347d);

    /* renamed from: f */
    public static final Set<Integer> f168181f = C22415w0.m26092a(2013);

    /* renamed from: g */
    public static long f168182g;

    /* renamed from: er1.j4$a */
    public static final class C7821a extends C87413o implements C32224a<List<? extends Integer>> {

        /* renamed from: d */
        public static final C7821a f26347d = new C7821a();

        public C7821a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99289T1.mo60266n().intValue();
            if (intValue != -1) {
                return C26236u.m33719b(Integer.valueOf(intValue));
            }
            return C64197v.m75537f(2, 4, 9, 15);
        }
    }

    /* renamed from: er1.j4$d */
    public static final class C7822d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f26348d;

        /* renamed from: e */
        public final /* synthetic */ View f26349e;

        /* renamed from: f */
        public final /* synthetic */ C59741c0 f26350f;

        /* renamed from: g */
        public final /* synthetic */ C59741c0 f26351g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Float, C13598b0> f26352h;

        /* renamed from: i */
        public final /* synthetic */ int f26353i;

        /* renamed from: j */
        public final /* synthetic */ int f26354j;

        public C7822d(int i, View view, C59741c0 c0Var, C59741c0 c0Var2, C32226l<? super Float, C13598b0> lVar, int i2, int i3) {
            this.f26348d = i;
            this.f26349e = view;
            this.f26350f = c0Var;
            this.f26351g = c0Var2;
            this.f26352h = lVar;
            this.f26353i = i2;
            this.f26354j = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C32226l<Float, C13598b0> lVar;
            C32226l<Float, C13598b0> lVar2;
            boolean z = true;
            if (C87412m.m108589b(valueAnimator.getAnimatedValue(), Integer.valueOf(this.f26348d))) {
                this.f26349e.getLayoutParams().width = this.f26348d;
                this.f26349e.requestLayout();
                this.f26350f.f170634d = 1.0f;
                if (1.0f != this.f26351g.f170634d) {
                    z = false;
                }
                if (!z && (lVar2 = this.f26352h) != null) {
                    lVar2.invoke(Float.valueOf(1.0f));
                }
                this.f26351g.f170634d = this.f26350f.f170634d;
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f26349e.getLayoutParams();
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((Integer) animatedValue).intValue();
            this.f26349e.requestLayout();
            this.f26350f.f170634d = (((float) this.f26349e.getLayoutParams().width) - ((float) this.f26353i)) / ((float) this.f26354j);
            float f = this.f26350f.f170634d;
            if (f != this.f26351g.f170634d) {
                z = false;
            }
            if (!z && (lVar = this.f26352h) != null) {
                lVar.invoke(Float.valueOf(f));
            }
            this.f26351g.f170634d = this.f26350f.f170634d;
        }
    }

    /* renamed from: er1.j4$b */
    public static final class C31674b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C31674b f84607d = new C31674b();

        public C31674b() {
            super(0);
        }

        public Object invoke() {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_SUPPORT_HEVC_ENC_INT_SYNC;
            Object f = i.mo119685f(aVar, -1);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f).intValue();
            String str = C58739j4.f168177b;
            Log.m105924i(str, "deviceSupportHevcEncForLive supportHevc:" + intValue);
            if (intValue == -1) {
                intValue = ((C36594q) C86312j.m106911c(C36594q.class)).Le0(5);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(intValue));
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(C31676k4.f84609d);
            }
            boolean z = true;
            if (intValue != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: er1.j4$c */
    public static final class C31675c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C31675c f84608d = new C31675c();

        public C31675c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(5));
        }
    }

    /* renamed from: er1.j4$e */
    public static final class C58740e implements Runnable {

        /* renamed from: d */
        public static final C58740e f168183d = new C58740e();

        public final void run() {
            C58739j4.f168176a.mo83697Z();
        }
    }

    /* renamed from: G */
    public static String m68250G(C58739j4 j4Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        j4Var.getClass();
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76662GJ(str, str2, z);
    }

    /* renamed from: e */
    public static /* synthetic */ C64840xw0 m68251e(C58739j4 j4Var, C64436i61 i612, LinkedList linkedList, int i, Object obj) {
        if ((i & 1) != 0) {
            i612 = null;
        }
        if ((i & 2) != 0) {
            linkedList = null;
        }
        return j4Var.mo83704d(i612, linkedList);
    }

    /* renamed from: m */
    public static /* synthetic */ void m68252m(C58739j4 j4Var, View view, int i, int i2, long j, C32226l lVar, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            lVar = null;
        }
        j4Var.mo83717l(view, i, i2, j2, lVar);
    }

    /* renamed from: s */
    public static String m68253s(C58739j4 j4Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        j4Var.getClass();
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76705lw(str, str2, z);
    }

    /* renamed from: u */
    public static /* synthetic */ String m68254u(C58739j4 j4Var, long j, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return j4Var.mo83723t(j, bool, z);
    }

    /* renamed from: v */
    public static final String m68255v(C8479f0<Calendar> f0Var, boolean z, long j, C8479f0<CharSequence> f0Var2, Boolean bool) {
        String str = MMApplicationContext.getContext().getResources().getStringArray(C0966R.array.f2602aq)[(((Calendar) f0Var.f27484d).get(7) + 5) % 7];
        if (!C87412m.m108589b(bool, Boolean.FALSE)) {
            StringBuilder sb = new StringBuilder();
            sb.append(DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.eyh), j));
            sb.append(f0Var2.f27484d);
            return sb.toString();
        } else if (z) {
            return MMApplicationContext.getContext().getString(C0966R.string.dkg, new Object[]{DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.eyh), j), str}) + f0Var2.f27484d;
        } else {
            return MMApplicationContext.getContext().getString(C0966R.string.m1h, new Object[]{DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.eyh), j)}) + f0Var2.f27484d;
        }
    }

    /* renamed from: z */
    public static TXLivePlayConfig m68256z(C58739j4 j4Var, boolean z, int i, int i2, Object obj) {
        Class cls = C32735h.class;
        boolean z2 = false;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            C32444a aVar = C32444a.f86121a;
            i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_visitor_max_retry_count, 100);
        }
        j4Var.getClass();
        C32444a aVar2 = C32444a.f86121a;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_visitor_retry_interval, 3);
        TXLivePlayConfig tXLivePlayConfig = new TXLivePlayConfig();
        tXLivePlayConfig.setConnectRetryCount(i);
        tXLivePlayConfig.setConnectRetryInterval(Qe);
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_sei_enable_switch, 1) == 1) {
            z2 = true;
        }
        tXLivePlayConfig.setEnableMessage(z2);
        if (z) {
            tXLivePlayConfig.setAutoAdjustCacheTime(true);
            tXLivePlayConfig.setMinAutoAdjustCacheTime(1.0f);
            tXLivePlayConfig.setMaxAutoAdjustCacheTime(1.0f);
        }
        String str = f168177b;
        Log.m105924i(str, "cdn config retry count:" + i + ",retry interval:" + Qe + ", sei:" + z2 + ",miniCache:" + z);
        return tXLivePlayConfig;
    }

    /* renamed from: A */
    public final int mo83673A() {
        if (mo83692U()) {
            C32444a aVar = C32444a.f86121a;
            int intValue = C32444a.f86110W0.mo60266n().intValue();
            if (intValue != 1) {
                return intValue != 2 ? 0 : 2;
            }
            return 1;
        }
    }

    /* renamed from: B */
    public final String mo83674B(C64689rq2 rq22, int i) {
        String str;
        T t;
        boolean z;
        C87412m.m108594g(rq22, "mediaObj");
        LinkedList<C48654a21> linkedList = rq22.f185260V0;
        C87412m.m108593f(linkedList, "mediaObj.live_cover_imgs");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C48654a21) t).f130235i == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C48654a21 a212 = (C48654a21) t;
        StringBuilder sb = new StringBuilder();
        sb.append(Util.nullAsNil(a212 != null ? a212.f130230d : null));
        if (a212 != null) {
            str = a212.f130231e;
        }
        sb.append(Util.nullAsNil(str));
        return sb.toString();
    }

    /* renamed from: C */
    public final String mo83675C(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('0');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: D */
    public final String mo83676D(int i) {
        if (i == 2) {
            String m = C75592q0.m90783m();
            return m == null ? "" : m;
        }
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        return b != null ? b.getNickname() : "";
    }

    /* renamed from: E */
    public final String mo83677E(String str) {
        C87412m.m108594g(str, "str");
        String obj = C112550d0.m153799i0(str).toString();
        int E = C112550d0.m153769E(obj, "\n", 0, false, 6, (Object) null);
        return E == -1 ? obj : C112550d0.m153781Q(obj, E, obj.length(), "…").toString();
    }

    /* renamed from: F */
    public final long mo83678F() {
        Calendar instance = Calendar.getInstance();
        C87412m.m108593f(instance, "getInstance()");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: H */
    public final boolean mo83679H() {
        return !Util.isNullOrNil(C66785b.f191882e.mo90662O5());
    }

    /* renamed from: I */
    public final boolean mo83680I(C58969q qVar) {
        if (qVar != null) {
            if (!((qVar.field_extFlag & 16384) == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo83681J(int i, int i2) {
        return i2 == -4012 && i == 4;
    }

    /* renamed from: K */
    public final boolean mo83682K() {
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99422i3.mo60266n().intValue() == 1;
        boolean z2 = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean z3 = (C75592q0.m90781k() & 34359738368L) != 0;
        String str = f168177b;
        Log.m105924i(str, "isEnableShowDiscovery  isEnable:" + z + " isNotShowFinder:" + z2 + " isFinderClose:" + z3);
        return z && !z2 && !z3;
    }

    /* renamed from: L */
    public final boolean mo83683L() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - f168182g < 500;
        f168182g = currentTimeMillis;
        return z;
    }

    /* renamed from: M */
    public final boolean mo83684M(long j) {
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        if (b == null) {
            return true;
        }
        return !(((j > 1 ? 1 : (j == 1 ? 0 : -1)) == 0 || (j > 2 ? 1 : (j == 2 ? 0 : -1)) == 0) || (j > 4 ? 1 : (j == 4 ? 0 : -1)) == 0) || (b.field_messageStatus & j) != j;
    }

    /* renamed from: N */
    public final boolean mo83685N(String str) {
        JSONObject optJSONObject;
        if (str == null) {
            return false;
        }
        try {
            return ((str.length() > 0 ? str : null) == null || (optJSONObject = new JSONObject(str).optJSONObject("sns_ad")) == null || !optJSONObject.has("uxinfo")) ? false : true;
        } catch (Exception e) {
            String str2 = f168177b;
            Log.m105920e(str2, "isJsapiFromAd " + e.getMessage());
            return false;
        }
    }

    /* renamed from: O */
    public final boolean mo83686O(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "item");
        return baseFinderFeed.mo3513o().getMediaType() == 9;
    }

    /* renamed from: P */
    public final boolean mo83687P() {
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        return ((a != null ? a.field_extFlag : 0) & 1024) != 0;
    }

    /* renamed from: Q */
    public final boolean mo83688Q(C58969q qVar) {
        if (C87412m.m108589b(qVar != null ? qVar.getUsername() : null, C66785b.f191882e.mo90662O5())) {
            return mo83687P();
        }
        return ((qVar != null ? qVar.field_extFlag : 0) & 1024) != 0;
    }

    /* renamed from: R */
    public final boolean mo83689R() {
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99356a7;
        boolean z = true;
        if (cVar.mo60266n().intValue() == -1) {
            z = C61926c.m72696u((int) G, 1);
        } else {
            fVar.getClass();
            if (cVar.mo60266n().intValue() != 1) {
                z = false;
            }
        }
        String str = f168177b;
        StringBuilder sb = new StringBuilder();
        sb.append("flag = ");
        sb.append(G);
        sb.append(" , localConfig = ");
        fVar.getClass();
        sb.append(cVar.mo60266n().intValue());
        sb.append(" , result = ");
        sb.append(z);
        Log.m105924i(str, sb.toString());
        return z;
    }

    /* renamed from: S */
    public final boolean mo83690S(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C58969q l = baseFinderFeed.mo3507l();
        C66785b bVar = C66785b.f191882e;
        if (Util.isNullOrNil(bVar.mo90662O5())) {
            return false;
        }
        return C112551y.m153810j(l != null ? l.field_username : null, bVar.mo90662O5(), false, 2, (Object) null);
    }

    /* renamed from: T */
    public final boolean mo83691T(String str) {
        C66785b bVar = C66785b.f191882e;
        return !Util.isNullOrNil(bVar.mo90662O5()) && !Util.isNullOrNil(str) && C112551y.m153810j(str, bVar.mo90662O5(), false, 2, (Object) null);
    }

    /* renamed from: U */
    public final boolean mo83692U() {
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger();
    }

    /* renamed from: V */
    public final boolean mo83693V(String str) {
        C87412m.m108594g(str, "path");
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77246R5(str);
        return R5 != null && R5.f184502d == 1;
    }

    /* renamed from: W */
    public final boolean mo83694W(String str) {
        return Util.isEqual(str, C75592q0.m90789s());
    }

    /* renamed from: X */
    public final void mo83695X(String str, String str2, Context context, long j, String str3, int i) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "finderUsername");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "liveId");
        String str4 = f168177b;
        Log.m105924i(str4, "#liveJumpToBizContactProfile bizUsername=" + str + " sessionId=" + j + " liveId=" + str3 + " subScene=" + i);
        if (!(str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 208);
            intent.putExtra("Contact_Sub_Scene", i);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("Contact_Finder_Buffer", C64208c.f181951a.mo89027b(str2));
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("Contact_Scene_Note", str3);
            intent.putExtra("biz_profile_tab_type", 1);
            intent.putExtra("biz_profile_enter_from_finder", true);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: Y */
    public final void mo83696Y() {
        if (!C86709a0.m107522a()) {
            Log.m105920e(f168177b, "loadPagLib account is not ready");
            return;
        }
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86056G.mo60266n().intValue() == 0) {
            ((C119157j) C119157j.f356862d).mo183875f(C58740e.f168183d);
            return;
        }
        mo83697Z();
    }

    /* renamed from: Z */
    public final void mo83697Z() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1279, 200, 1);
        boolean R0 = ((C87790d) C86312j.m106911c(C87790d.class)).mo122034R0("pag");
        String str = f168177b;
        Log.m105924i(str, "loadPagLib result:" + R0);
        nVar.mo175913w(1279, 201, 1);
    }

    /* renamed from: a */
    public final C50185kw0 mo83698a() {
        C50185kw0 kw02 = new C50185kw0();
        C50045jw0 jw02 = new C50045jw0();
        jw02.f136359d = CdnLogic.getRecentAverageSpeed(2);
        kw02.f137066d = jw02;
        return kw02;
    }

    /* renamed from: a0 */
    public final String mo83699a0(int i) {
        try {
            String format = new DecimalFormat("0.##").format(((double) i) / 100.0d);
            C87412m.m108593f(format, "DecimalFormat(\"0.##\").format(price / 100.00)");
            return format;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final void mo83700b(String str, int i) {
        C87412m.m108594g(str, "logPrefix");
        if (!mo83692U()) {
            String str2 = f168177b;
            Log.printInfoStack(str2, str + " type:" + i + " invalid", new Object[0]);
            return;
        }
        throw new RuntimeException(str + " type:" + i + " invalid");
    }

    /* renamed from: b0 */
    public final void mo83701b0(int i, List<? extends C0740i2> list, C89349b bVar, Intent intent, C2780c cVar) {
        C87412m.m108594g(list, "feedList");
        C87412m.m108594g(intent, "intent");
        FinderEmptyLoader finderEmptyLoader = new FinderEmptyLoader();
        finderEmptyLoader.getDataList().addAll(list);
        finderEmptyLoader.setLastBuffer(bVar);
        finderEmptyLoader.saveCache(intent, i, cVar);
    }

    /* renamed from: c */
    public final String mo83702c(Map<String, ? extends Object> map) {
        C87412m.m108594g(map, "maps");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), next.getValue());
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    /* renamed from: c0 */
    public final void mo83703c0(TextView textView, boolean z) {
        C87412m.m108594g(textView, "tv");
        try {
            textView.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), z ? "fonts/WeChatSansSS-Medium.ttf" : "fonts/WeChatSansStd-Medium.ttf"));
        } catch (Exception e) {
            String str = f168177b;
            Log.m105920e(str, "setTypeface() Exception:" + e.getMessage());
        }
    }

    /* renamed from: d */
    public final C64840xw0 mo83704d(C64436i61 i612, LinkedList<C64436i61> linkedList) {
        C64840xw0 xw02 = new C64840xw0();
        xw02.f186401d = NetStatusUtil.getNetType(MMApplicationContext.getContext());
        xw02.f186402e = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        xw02.f186403f = CdnLogic.getRecentAverageSpeed(2);
        xw02.f186404g = C87203t.m108275k();
        xw02.f186405h = Build.BRAND;
        xw02.f186406i = Build.DISPLAY;
        xw02.f186407j = Build.VERSION.RELEASE;
        if (i612 != null) {
            xw02.f186408n = i612;
        }
        if (!Util.isNullOrNil((List) linkedList)) {
            xw02.f186409o = linkedList;
        }
        boolean z = ((C101213l) C86312j.m106911c(C101213l.class)).mo140305fF() != 0;
        String str = f168177b;
        Log.m105924i(str, "isCodec1Limit " + z);
        if (!z) {
            f168176a.getClass();
            if (((Boolean) ((C36570n) f168178c).getValue()).booleanValue()) {
                xw02.f186410p = 1;
            }
        }
        if (!z) {
            f168176a.getClass();
            if (((Boolean) ((C36570n) f168179d).getValue()).booleanValue()) {
                xw02.f186411q = 1;
            }
        }
        return xw02;
    }

    /* renamed from: d0 */
    public final void mo83705d0(TextView textView) {
        C87412m.m108594g(textView, "tv");
        try {
            textView.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), "fonts/WeChatSansStd-Regular.ttf"));
        } catch (Exception e) {
            String str = f168177b;
            Log.m105920e(str, "setTypeface() Exception:" + e.getMessage());
        }
    }

    /* renamed from: e0 */
    public final void mo83706e0() {
        Context context = MMApplicationContext.getContext();
        C76912y0.m92769h(context, context.getString(C0966R.string.mok), C0966R.raw.icons_filled_error);
    }

    /* renamed from: f */
    public final C13604l<Integer, Integer> mo83707f(int i, float f, float f2, float f3, float f4) {
        C13604l<Integer, Integer> lVar;
        boolean z = true;
        if (f2 == 0.0f) {
            return null;
        }
        if (f == 0.0f) {
            return null;
        }
        if (f4 == 0.0f) {
            return null;
        }
        if (f3 != 0.0f) {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i == ImageView.ScaleType.FIT_CENTER.ordinal()) {
            if (f4 / f3 < f2 / f) {
                return new C13604l<>(Integer.valueOf((int) f), Integer.valueOf((int) ((f4 * f) / f3)));
            }
            lVar = new C13604l<>(Integer.valueOf((int) ((f3 * f2) / f4)), Integer.valueOf((int) f2));
        } else if (f4 / f3 > f2 / f) {
            return new C13604l<>(Integer.valueOf((int) f), Integer.valueOf((int) ((f4 * f) / f3)));
        } else {
            lVar = new C13604l<>(Integer.valueOf((int) ((f3 * f2) / f4)), Integer.valueOf((int) f2));
        }
        return lVar;
    }

    /* renamed from: f0 */
    public final String mo83708f0() {
        if (!mo83692U()) {
            return "";
        }
        String mMStack = Util.getStack().toString();
        C87412m.m108593f(mMStack, "getStack().toString()");
        return mMStack;
    }

    /* renamed from: g */
    public final C13605o<Integer, Integer, Integer> mo83709g(Context context, int i, int i2) {
        int i3;
        C87412m.m108594g(context, "context");
        if (context instanceof Activity) {
            context = ((Activity) context).getBaseContext();
        }
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        int i5 = context.getResources().getDisplayMetrics().heightPixels;
        if (i4 > i5) {
            i4 = i5;
        }
        float f = (((float) i2) * 1.0f) / ((float) i);
        int ordinal = ImageView.ScaleType.CENTER_CROP.ordinal();
        if (Math.abs(i - i2) <= 10) {
            i3 = i4;
        } else {
            if (f < 0.5625f) {
                f = 0.5625f;
            } else if (f >= 1.0f && f >= 1.3166667f) {
                f = 1.3166667f;
            }
            i3 = (int) (((float) i4) * f);
        }
        return new C13605o<>(Integer.valueOf(ordinal), Integer.valueOf(i4), Integer.valueOf(i3));
    }

    /* renamed from: g0 */
    public final C89349b mo83710g0(C47465a aVar) {
        C87412m.m108594g(aVar, "<this>");
        byte[] byteArray = aVar.toByteArray();
        if (byteArray != null) {
            return new C89349b(byteArray, 0, byteArray.length);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((r0 != null ? java.lang.Integer.valueOf(r0.mediaType) : null) == null) goto L_0x0017;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo83711h(com.tencent.p014mm.protocal.protobuf.FinderObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            gy3.C87412m.m108594g(r6, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r6.objectDesc
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0014
            int r0 = r0.mediaType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x002f
        L_0x0017:
            java.lang.String r0 = f168177b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "obj "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r3, r4)
        L_0x002f:
            er1.j4 r0 = f168176a
            java.util.List r3 = r0.mo83721q()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r6.objectDesc
            if (r4 == 0) goto L_0x003f
            int r1 = r4.mediaType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x003f:
            boolean r1 = sx3.C110818d0.m150903D(r3, r1)
            if (r1 == 0) goto L_0x004c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x004b
            int r2 = r6.mediaType
        L_0x004b:
            return r2
        L_0x004c:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r6.objectDesc
            r3 = 1
            if (r1 == 0) goto L_0x005d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x005d
            int r1 = r1.size()
            if (r1 != 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0067
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x0066
            int r2 = r6.mediaType
        L_0x0066:
            return r2
        L_0x0067:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r6.objectDesc
            if (r1 == 0) goto L_0x007a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            if (r1 == 0) goto L_0x007a
            int r1 = r1.mediaType
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            java.util.List r0 = r0.mo83721q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x008a
            return r1
        L_0x008a:
            r0 = 4
            r4 = 8
            if (r1 != r0) goto L_0x009e
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r6.objectDesc
            if (r0 == 0) goto L_0x009b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x009b
            int r2 = r0.size()
        L_0x009b:
            if (r2 <= r3) goto L_0x009e
            return r4
        L_0x009e:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00bb
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x00bb
            java.util.Iterator r6 = r6.iterator()
        L_0x00aa:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r6.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            int r0 = r0.mediaType
            if (r0 == r1) goto L_0x00aa
            return r4
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58739j4.mo83711h(com.tencent.mm.protocal.protobuf.FinderObject):int");
    }

    /* renamed from: h0 */
    public final void mo83712h0(Exception exc, String str) {
        C87412m.m108594g(exc, "e");
        C87412m.m108594g(str, "extraMsg");
        if (!mo83692U()) {
            String str2 = f168177b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(' ');
            sb.append(exc.getMessage());
            sb.append(' ');
            Throwable cause = exc.getCause();
            sb.append(cause != null ? cause.getMessage() : null);
            Log.printInfoStack(str2, sb.toString(), new Object[0]);
            Log.printErrStackTrace(str2, exc, "", new Object[0]);
            return;
        }
        throw exc;
    }

    /* renamed from: i */
    public final HalfScreenConfig.CustomSubjectInfo mo83713i(C64513l40 l402) {
        HalfScreenConfig.CustomSubjectInfo customSubjectInfo = HalfScreenConfig.CustomSubjectInfo.f157973f;
        String str = f168177b;
        StringBuilder sb = new StringBuilder();
        sb.append("convertToCustomSubjectInfo page:");
        String str2 = null;
        sb.append(l402 != null ? l402.f184033f : null);
        sb.append(", ");
        if (l402 != null) {
            str2 = l402.f184034g;
        }
        sb.append(str2);
        Log.m105924i(str, sb.toString());
        if (l402 != null) {
            String str3 = l402.f184033f;
            boolean z = false;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = l402.f184034g;
                if (str4 == null || str4.length() == 0) {
                    z = true;
                }
                if (!z) {
                    String str5 = l402.f184034g;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = str6;
                    }
                    String str7 = l402.f184033f;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    customSubjectInfo = new HalfScreenConfig.CustomSubjectInfo(str5, str6);
                }
            }
        }
        return customSubjectInfo;
    }

    /* renamed from: i0 */
    public final void mo83714i0(String str) {
        C87412m.m108594g(str, "prefix");
        boolean Vb = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();
        boolean isGPVersion = ChannelUtil.isGPVersion();
        String str2 = f168177b;
        Log.m105924i(str2, str + " tryLoadPagLibrary pag start,gpVersion:" + isGPVersion + ",isPagEnable:" + Vb);
        if (!isGPVersion) {
            mo83696Y();
        } else if (Vb) {
            mo83696Y();
        }
        Log.m105924i(str2, str + " tryLoadPagLibrary pag end");
    }

    /* renamed from: j */
    public final C64513l40 mo83715j(C86299o oVar) {
        C87412m.m108594g(oVar, "bundle");
        if (C87412m.m108589b(oVar.f250912A.f157934E, HalfScreenConfig.CustomSubjectInfo.f157973f)) {
            return null;
        }
        C64513l40 l402 = new C64513l40();
        HalfScreenConfig.CustomSubjectInfo customSubjectInfo = oVar.f250912A.f157934E;
        l402.f184033f = customSubjectInfo.f157975e;
        l402.f184034g = customSubjectInfo.f157974d;
        return l402;
    }

    /* renamed from: k */
    public final String mo83716k(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        String obj = C112550d0.m153799i0(str).toString();
        Pattern compile = Pattern.compile("(\n\n[\\s]*\n)|(\n[\\s]*\n\n)");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(obj, "input");
        String replaceAll = compile.matcher(obj).replaceAll("\n\n");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("(\r\n\r\n[\\s]*\r\n)|(\r\n[\\s]*\r\n\r\n)");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\r\n\r\n");
        C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile3 = Pattern.compile("[ ]{11,}");
        C87412m.m108593f(compile3, "compile(pattern)");
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("          ");
        C87412m.m108593f(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll3;
    }

    /* renamed from: l */
    public final void mo83717l(View view, int i, int i2, long j, C32226l<? super Float, C13598b0> lVar) {
        C87412m.m108594g(view, "view");
        if (view.getVisibility() == 0) {
            C59741c0 c0Var = new C59741c0();
            C59741c0 c0Var2 = new C59741c0();
            c0Var2.f170634d = c0Var.f170634d;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new C7822d(i2, view, c0Var, c0Var2, lVar, i, i2 - i));
            ofInt.start();
        }
    }

    /* renamed from: n */
    public final String mo83718n() {
        String mD5String = MD5Util.getMD5String(C75592q0.m90789s() + System.currentTimeMillis());
        C87412m.m108593f(mD5String, "getMD5String(\"${ConfigSt…em.currentTimeMillis()}\")");
        return mD5String;
    }

    /* renamed from: o */
    public final String mo83719o(FinderMedia finderMedia) {
        if (finderMedia == null) {
            return "";
        }
        return Util.nullAsNil(finderMedia.thumbUrl) + Util.nullAsNil(finderMedia.thumb_url_token);
    }

    /* renamed from: p */
    public final String mo83720p() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mvb);
        C87412m.m108593f(string, "getContext().resources.g…r_live_anchor_topic_hint)");
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_TOPIC_HINT_STRING_SYNC, string);
        C87412m.m108593f(I, "storage().configStg.getS…INT_STRING_SYNC, default)");
        return I;
    }

    /* renamed from: q */
    public final List<Integer> mo83721q() {
        return (List) ((C36570n) f168180e).getValue();
    }

    /* renamed from: r */
    public final String mo83722r(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        Context context = MMApplicationContext.getContext();
        Map<String, List<String>> map = C7878t0.f26492a;
        CharSequence format = DateFormat.format(context.getString(C0966R.string.ezc), j);
        int i = instance.get(1);
        int i2 = instance.get(5);
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mev, new Object[]{Integer.valueOf(i), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(i2), format});
        C87412m.m108593f(string, "getContext().resources.g…nth, day, timeHourMimStr)");
        String str = f168177b;
        Log.m105918d(str, "result:" + string);
        return string;
    }

    /* renamed from: t */
    public final String mo83723t(long j, Boolean bool, boolean z) {
        String str;
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = Calendar.getInstance();
        Date date = new Date(j);
        ((Calendar) f0Var.f27484d).setTime(date);
        int i = ((Calendar) f0Var.f27484d).get(6);
        Calendar instance = Calendar.getInstance();
        Date date2 = new Date(C31543z5.m39453c());
        instance.setTime(date2);
        int i2 = i - instance.get(6);
        String str2 = f168177b;
        Log.m105924i(str2, "[getFinderLiveNoticeTips] dayDiff:" + i2 + ", bookTime:" + date + ", todayTime:" + date2);
        C8479f0 f0Var2 = new C8479f0();
        Context context = MMApplicationContext.getContext();
        Map<String, List<String>> map = C7878t0.f26492a;
        f0Var2.f27484d = DateFormat.format(context.getString(C0966R.string.ezc), j);
        if (LocaleUtil.isChineseAppLang()) {
            Boolean bool2 = Boolean.FALSE;
            if (!C87412m.m108589b(bool, bool2)) {
                str = m68255v(f0Var, z, j, f0Var2, bool);
            } else if (i2 == -1) {
                str = MMApplicationContext.getContext().getString(C0966R.string.f360813f00) + f0Var2.f27484d;
            } else if (i2 == 0) {
                str = MMApplicationContext.getContext().getString(C0966R.string.ezr) + f0Var2.f27484d;
            } else if (i2 == 1) {
                str = MMApplicationContext.getContext().getString(C0966R.string.ezs) + f0Var2.f27484d;
            } else if (i2 != 2) {
                str = m68255v(f0Var, z, j, f0Var2, bool2);
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.dkf) + f0Var2.f27484d;
            }
        } else {
            int i3 = ((Calendar) f0Var.f27484d).get(1);
            int i4 = ((Calendar) f0Var.f27484d).get(5);
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(((Calendar) f0Var.f27484d).get(2) + 1);
            sb.append('.');
            sb.append(i4);
            sb.append(' ');
            sb.append(f0Var2.f27484d);
            str = sb.toString();
        }
        Log.m105918d(str2, "result:" + str);
        return str;
    }

    /* renamed from: w */
    public final String mo83724w(String str, int i) {
        C87412m.m108594g(str, "key");
        String string = MMApplicationContext.getContext().getString(i);
        C87412m.m108593f(string, "getContext().getString(resId)");
        return string;
    }

    /* renamed from: x */
    public final Point mo83725x(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Point point = new Point();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        point.x = options.outWidth;
        point.y = options.outHeight;
        if (Exif.fromFile(str).getOrientationInDegree() % 180 != 0) {
            int i = point.y;
            point.y = point.x;
            point.x = i;
        }
        return point;
    }
}
