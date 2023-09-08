package gg1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1820q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import nj3.C76912y0;
import p565ir.C60606n;
import pe1.C35464c;
import pe1.C35469d;
import pt1.C35640b;
import re1.C36316a;
import rx3.C13598b0;
import rx3.C36570n;
import se1.C36665a;
import sx3.C64197v;
import te1.C37016a;
import zb3.C66782d;

/* renamed from: gg1.a */
public final class C32444a {

    /* renamed from: A */
    public static final C35464c<Integer> f86032A;

    /* renamed from: A0 */
    public static final C35464c<Integer> f86033A0;

    /* renamed from: A1 */
    public static final C35464c<Integer> f86034A1;

    /* renamed from: A2 */
    public static final C35464c<Integer> f86035A2;

    /* renamed from: B */
    public static final C35464c<Integer> f86036B;

    /* renamed from: B0 */
    public static final C35464c<Integer> f86037B0;

    /* renamed from: B1 */
    public static final C35464c<Integer> f86038B1;

    /* renamed from: B2 */
    public static final C35464c<Integer> f86039B2;

    /* renamed from: C */
    public static final C35464c<Integer> f86040C;

    /* renamed from: C0 */
    public static final C35464c<Integer> f86041C0;

    /* renamed from: C1 */
    public static final C35464c<Integer> f86042C1;

    /* renamed from: C2 */
    public static final C36316a f86043C2 = new C36316a(false, "直播间隐藏评论", "FINDER_LIVE_HIDE_COMMENT");

    /* renamed from: D */
    public static C35464c<Integer> f86044D;

    /* renamed from: D0 */
    public static final C35464c<Integer> f86045D0;

    /* renamed from: D1 */
    public static final C35464c<Integer> f86046D1;

    /* renamed from: D2 */
    public static final C36316a f86047D2 = new C36316a(false, "直播间隐藏礼物条", "FINDER_LIVE_HIDE_GIFT_QUEUE");

    /* renamed from: E */
    public static C35464c<Integer> f86048E;

    /* renamed from: E0 */
    public static final C35464c<Integer> f86049E0;

    /* renamed from: E1 */
    public static C35464c<Integer> f86050E1;

    /* renamed from: E2 */
    public static final C36316a f86051E2 = new C36316a(false, "直播间隐藏点赞动画", "FINDER_LIVE_HIDE_LIKE");

    /* renamed from: F */
    public static C35464c<Integer> f86052F;

    /* renamed from: F0 */
    public static final C35464c<Integer> f86053F0;

    /* renamed from: F1 */
    public static final C35464c<Integer> f86054F1;

    /* renamed from: F2 */
    public static C36316a f86055F2 = new C36316a(false, "直播礼物背包页面debug入口开关", "FINDER_LIVE_ENTER_GIFT_PKG_UI");

    /* renamed from: G */
    public static final C35464c<Integer> f86056G;

    /* renamed from: G0 */
    public static final C35464c<Integer> f86057G0;

    /* renamed from: G1 */
    public static final C36316a f86058G1 = new C36316a(false, "点击直播间主播头像进入可鼓掌状态", "FINDER_LIVE_CLICK_AVATAR_ENTER_APPLAUD");

    /* renamed from: G2 */
    public static C36316a f86059G2 = new C36316a(false, "直播背包礼物冻结", "FINDER_LIVE_GIFT_PKG_FREZZE");

    /* renamed from: H */
    public static final C35464c<Integer> f86060H;

    /* renamed from: H0 */
    public static final C35464c<Integer> f86061H0;

    /* renamed from: H1 */
    public static final C36316a f86062H1 = new C36316a(false, "鼓掌提示是否一直出", "FINDER_LIVE_APPLAUD_TIPS_ALWAYS");

    /* renamed from: H2 */
    public static final C35464c<Integer> f86063H2;

    /* renamed from: I */
    public static final C35464c<Integer> f86064I;

    /* renamed from: I0 */
    public static final C35464c<Integer> f86065I0;

    /* renamed from: I1 */
    public static final C35464c<Integer> f86066I1;

    /* renamed from: I2 */
    public static C35464c<Integer> f86067I2;

    /* renamed from: J */
    public static final C35464c<Integer> f86068J;

    /* renamed from: J0 */
    public static final C35464c<Integer> f86069J0;

    /* renamed from: J1 */
    public static C36316a f86070J1 = new C36316a(false, "开播绕过前面的实名检查", "FINDER_LIVE_SKIP_REAL_NAME");

    /* renamed from: J2 */
    public static final C36316a f86071J2 = new C36316a(false, "直播间礼物预加载强制关闭", "FINDER_LIVE_GIFT_PRELOAD_FORCE_CLOSE");

    /* renamed from: K */
    public static final C35464c<Integer> f86072K;

    /* renamed from: K0 */
    public static final C35464c<Integer> f86073K0;

    /* renamed from: K1 */
    public static C35464c<Integer> f86074K1;

    /* renamed from: K2 */
    public static C35464c<Integer> f86075K2;

    /* renamed from: L */
    public static final C35464c<Integer> f86076L;

    /* renamed from: L0 */
    public static final C35464c<Integer> f86077L0;

    /* renamed from: L1 */
    public static final C35464c<Integer> f86078L1;

    /* renamed from: M */
    public static final C35464c<Integer> f86079M;

    /* renamed from: M0 */
    public static final C35464c<Integer> f86080M0;

    /* renamed from: M1 */
    public static final C35464c<Integer> f86081M1;

    /* renamed from: N */
    public static final C35464c<Integer> f86082N;

    /* renamed from: N0 */
    public static final C35464c<Integer> f86083N0;

    /* renamed from: N1 */
    public static C35464c<Integer> f86084N1;

    /* renamed from: O */
    public static final C35464c<Integer> f86085O;

    /* renamed from: O0 */
    public static final C35464c<Integer> f86086O0;

    /* renamed from: O1 */
    public static final C35464c<Integer> f86087O1;

    /* renamed from: P */
    public static final C35464c<Integer> f86088P;

    /* renamed from: P0 */
    public static final C35464c<Integer> f86089P0;

    /* renamed from: P1 */
    public static final C35464c<Integer> f86090P1;

    /* renamed from: Q */
    public static final C35464c<Integer> f86091Q;

    /* renamed from: Q0 */
    public static C35464c<Integer> f86092Q0;

    /* renamed from: Q1 */
    public static final C35464c<Integer> f86093Q1;

    /* renamed from: R */
    public static final C35464c<Integer> f86094R;

    /* renamed from: R0 */
    public static C35464c<Integer> f86095R0;

    /* renamed from: R1 */
    public static final C35464c<Integer> f86096R1;

    /* renamed from: S */
    public static final C35464c<Integer> f86097S;

    /* renamed from: S0 */
    public static C35464c<Integer> f86098S0;

    /* renamed from: S1 */
    public static final C35464c<Integer> f86099S1;

    /* renamed from: T */
    public static final C35464c<Integer> f86100T;

    /* renamed from: T0 */
    public static final C35464c<Integer> f86101T0;

    /* renamed from: T1 */
    public static final C35464c<Integer> f86102T1;

    /* renamed from: U */
    public static final C35464c<Integer> f86103U;

    /* renamed from: U0 */
    public static final C35464c<Integer> f86104U0;

    /* renamed from: U1 */
    public static final C35464c<Integer> f86105U1;

    /* renamed from: V */
    public static final C35464c<Integer> f86106V;

    /* renamed from: V0 */
    public static final C35464c<Integer> f86107V0;

    /* renamed from: V1 */
    public static C35464c<Integer> f86108V1;

    /* renamed from: W */
    public static final C35464c<Integer> f86109W;

    /* renamed from: W0 */
    public static final C35464c<Integer> f86110W0;

    /* renamed from: W1 */
    public static C35464c<Integer> f86111W1;

    /* renamed from: X */
    public static final C35464c<Integer> f86112X;

    /* renamed from: X0 */
    public static final C35464c<Integer> f86113X0;

    /* renamed from: X1 */
    public static C35464c<Integer> f86114X1;

    /* renamed from: Y */
    public static final C35464c<Integer> f86115Y;

    /* renamed from: Y0 */
    public static final C35464c<Integer> f86116Y0;

    /* renamed from: Y1 */
    public static C35464c<Integer> f86117Y1;

    /* renamed from: Z */
    public static final C35464c<Integer> f86118Z;

    /* renamed from: Z0 */
    public static final C35464c<Integer> f86119Z0;

    /* renamed from: Z1 */
    public static C35464c<Integer> f86120Z1;

    /* renamed from: a */
    public static final C32444a f86121a = new C32444a();

    /* renamed from: a0 */
    public static final C35464c<Integer> f86122a0;

    /* renamed from: a1 */
    public static final int f86123a1 = 60;

    /* renamed from: a2 */
    public static C35464c<Long> f86124a2;

    /* renamed from: b */
    public static final C35464c<Integer> f86125b;

    /* renamed from: b0 */
    public static final C35464c<Integer> f86126b0;

    /* renamed from: b1 */
    public static final C35464c<Integer> f86127b1;

    /* renamed from: b2 */
    public static C35464c<Integer> f86128b2;

    /* renamed from: c */
    public static final C35464c<Integer> f86129c;

    /* renamed from: c0 */
    public static C35464c<Integer> f86130c0;

    /* renamed from: c1 */
    public static final C35464c<Integer> f86131c1;

    /* renamed from: c2 */
    public static C35464c<Integer> f86132c2;

    /* renamed from: d */
    public static final C35464c<Integer> f86133d;

    /* renamed from: d0 */
    public static C35464c<Integer> f86134d0;

    /* renamed from: d1 */
    public static C35464c<Integer> f86135d1;

    /* renamed from: d2 */
    public static C36316a f86136d2 = new C36316a(false, "游戏段位半屏是否显示忽略后台标记位", "FINDER_LIVE_GAME_RANK_SWITCH_HARD_CODE_SHOW");

    /* renamed from: e */
    public static final C35464c<Integer> f86137e;

    /* renamed from: e0 */
    public static final C35464c<Integer> f86138e0;

    /* renamed from: e1 */
    public static final C35464c<Integer> f86139e1;

    /* renamed from: e2 */
    public static C36316a f86140e2 = new C36316a(false, "游戏段位半屏授权是否每次都出", "FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_ALWAYS");

    /* renamed from: f */
    public static final C35464c<Integer> f86141f;

    /* renamed from: f0 */
    public static final C35464c<Integer> f86142f0;

    /* renamed from: f1 */
    public static final C35464c<Integer> f86143f1;

    /* renamed from: f2 */
    public static C35464c<Integer> f86144f2;

    /* renamed from: g */
    public static final C35464c<Integer> f86145g;

    /* renamed from: g0 */
    public static final C35464c<Integer> f86146g0;

    /* renamed from: g1 */
    public static final C35464c<Integer> f86147g1;

    /* renamed from: g2 */
    public static C35464c<Integer> f86148g2;

    /* renamed from: h */
    public static final C35464c<Integer> f86149h;

    /* renamed from: h0 */
    public static final C35464c<Integer> f86150h0;

    /* renamed from: h1 */
    public static final C35464c<Long> f86151h1;

    /* renamed from: h2 */
    public static final C36316a f86152h2 = new C36316a(false, "是否强制允许主播开启音乐", "FINDER_LIVE_FORCE_ENABLE_ANCHOR_MUSIC");

    /* renamed from: i */
    public static final C35464c<Integer> f86153i;

    /* renamed from: i0 */
    public static final C35464c<Integer> f86154i0;

    /* renamed from: i1 */
    public static final C35464c<Integer> f86155i1;

    /* renamed from: i2 */
    public static final C35464c<Integer> f86156i2;

    /* renamed from: j */
    public static final C35464c<Integer> f86157j;

    /* renamed from: j0 */
    public static final C35464c<Long> f86158j0;

    /* renamed from: j1 */
    public static final C35464c<Integer> f86159j1;

    /* renamed from: j2 */
    public static final C36316a f86160j2 = new C36316a(false, "进直播间自动拉起音乐列表", "FINDER_LIVE_LAUNCH_BGM_PLUGIN_ON_ENTER_LIVE");

    /* renamed from: k */
    public static final C35464c<Integer> f86161k;

    /* renamed from: k0 */
    public static final C35464c<Integer> f86162k0;

    /* renamed from: k1 */
    public static final C35464c<Integer> f86163k1;

    /* renamed from: k2 */
    public static final C35464c<Integer> f86164k2;

    /* renamed from: l */
    public static C35464c<Integer> f86165l;

    /* renamed from: l0 */
    public static final C35464c<Integer> f86166l0;

    /* renamed from: l1 */
    public static final C35464c<Integer> f86167l1;

    /* renamed from: l2 */
    public static final C35464c<Integer> f86168l2;

    /* renamed from: m */
    public static final C35464c<Integer> f86169m;

    /* renamed from: m0 */
    public static final C35464c<Integer> f86170m0;

    /* renamed from: m1 */
    public static C35464c<Integer> f86171m1;

    /* renamed from: m2 */
    public static final C35464c<Integer> f86172m2;

    /* renamed from: n */
    public static final C35464c<Integer> f86173n;

    /* renamed from: n0 */
    public static final C35464c<Integer> f86174n0;

    /* renamed from: n1 */
    public static final C35464c<Integer> f86175n1;

    /* renamed from: n2 */
    public static final C35464c<Integer> f86176n2;

    /* renamed from: o */
    public static C35464c<Long> f86177o;

    /* renamed from: o0 */
    public static final C35464c<Integer> f86178o0;

    /* renamed from: o1 */
    public static C35464c<Integer> f86179o1;

    /* renamed from: o2 */
    public static C35464c<Integer> f86180o2;

    /* renamed from: p */
    public static C35464c<Integer> f86181p;

    /* renamed from: p0 */
    public static final C35464c<Integer> f86182p0;

    /* renamed from: p1 */
    public static final C36316a f86183p1 = new C36316a(false, "开播后5s触发一个crash", "FINDER_LIVE_MANUAL_CRASH");

    /* renamed from: p2 */
    public static C35464c<Integer> f86184p2;

    /* renamed from: q */
    public static C35464c<Integer> f86185q;

    /* renamed from: q0 */
    public static final C35464c<Integer> f86186q0;

    /* renamed from: q1 */
    public static final C35464c<Integer> f86187q1;

    /* renamed from: q2 */
    public static C36316a f86188q2 = new C36316a(false, "进入直播间塞入全类型进场消息", "FINDER_LIVE_ENTER_COMMENT_MSG_TEST");

    /* renamed from: r */
    public static C35464c<Integer> f86189r;

    /* renamed from: r0 */
    public static final C35464c<Integer> f86190r0;

    /* renamed from: r1 */
    public static final C35464c<Integer> f86191r1;

    /* renamed from: r2 */
    public static C35464c<Integer> f86192r2;

    /* renamed from: s */
    public static final C35464c<Integer> f86193s;

    /* renamed from: s0 */
    public static final C35464c<Integer> f86194s0;

    /* renamed from: s1 */
    public static final C35464c<Integer> f86195s1;

    /* renamed from: s2 */
    public static C36316a f86196s2 = new C36316a(false, "进入直播间塞入2条升级信息", "FINDER_LIVE_LEVEL_UP_MSG_INSERT");

    /* renamed from: t */
    public static final C35464c<Integer> f86197t;

    /* renamed from: t0 */
    public static final C35464c<Integer> f86198t0;

    /* renamed from: t1 */
    public static final C35464c<Integer> f86199t1;

    /* renamed from: t2 */
    public static C36316a f86200t2 = new C36316a(false, "直播发送123的时候假插一条升级信息", "FINDER_LIVE_LEVEL_UP_INSERT_WHEN_SPECIAL_MSG");

    /* renamed from: u */
    public static C35464c<Integer> f86201u;

    /* renamed from: u0 */
    public static final C35464c<Integer> f86202u0;

    /* renamed from: u1 */
    public static final C35464c<Integer> f86203u1;

    /* renamed from: u2 */
    public static final C36316a f86204u2 = new C36316a(false, "直播间公众号文章跳转提示必出", "FINDER_LIVE_MP_SUGGESSTION");

    /* renamed from: v */
    public static final C35464c<Integer> f86205v;

    /* renamed from: v0 */
    public static final C35464c<Integer> f86206v0;

    /* renamed from: v1 */
    public static final C35464c<Integer> f86207v1;

    /* renamed from: v2 */
    public static final C35464c<Integer> f86208v2;

    /* renamed from: w */
    public static C35464c<Integer> f86209w;

    /* renamed from: w0 */
    public static final C35464c<Integer> f86210w0;

    /* renamed from: w1 */
    public static final C35464c<Integer> f86211w1;

    /* renamed from: w2 */
    public static final C36316a f86212w2 = new C36316a(false, "模拟观众进入直播间被拦截", "FINDER_LIVE_VISITOR_ENTER_FORBIDDEN_SIMULATION");

    /* renamed from: x */
    public static C35464c<Integer> f86213x;

    /* renamed from: x0 */
    public static final C35464c<Integer> f86214x0;

    /* renamed from: x1 */
    public static final C35464c<Integer> f86215x1;

    /* renamed from: x2 */
    public static final C35464c<Integer> f86216x2;

    /* renamed from: y */
    public static C35464c<Integer> f86217y;

    /* renamed from: y0 */
    public static final C35464c<Integer> f86218y0;

    /* renamed from: y1 */
    public static final C35464c<Integer> f86219y1;

    /* renamed from: y2 */
    public static C35464c<Integer> f86220y2;

    /* renamed from: z */
    public static C35464c<Integer> f86221z;

    /* renamed from: z0 */
    public static final C35464c<Integer> f86222z0;

    /* renamed from: z1 */
    public static final C35464c<Integer> f86223z1;

    /* renamed from: z2 */
    public static final C36316a f86224z2 = new C36316a(false, "直播间保量弹窗", "FINDER_LIVE_MP_SUGGESSTION");

    /* renamed from: gg1.a$a */
    public static final class C8279a extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8279a f27226d = new C8279a();

        public C8279a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$a0 */
    public static final class C8280a0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8280a0 f27227d = new C8280a0();

        public C8280a0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$b */
    public static final class C8281b extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8281b f27228d = new C8281b();

        public C8281b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_MUSIC_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$b0 */
    public static final class C8282b0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8282b0 f27229d = new C8282b0();

        public C8282b0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C32444a.f86121a.mo58623d(0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$c */
    public static final class C8283c extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8283c f27230d = new C8283c();

        public C8283c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LIVE_KNOW_LICENSE_UPDATE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$c0 */
    public static final class C8284c0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8284c0 f27231d = new C8284c0();

        public C8284c0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_FUNCTION_BOOLEAN_SYNC, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_HAS_SHOW_MORE_SETTING_BOOLEAN_SYNC, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_MIC_INTERCOM_GUIDE_TYPE_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$d */
    public static final class C8285d extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8285d f27232d = new C8285d();

        public C8285d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$d0 */
    public static final class C8286d0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8286d0 f27233d = new C8286d0();

        public C8286d0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            MultiProcessMMKV.getDefault().putBoolean("MMKVFinderLiveInputPluginLocationGuideShow", false);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$e */
    public static final class C8287e extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8287e f27234d = new C8287e();

        public C8287e() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PROFILE_SHOP_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$f */
    public static final class C8288f extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8288f f27235d = new C8288f();

        public C8288f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_CHARGE_ANCHOR_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$f0 */
    public static final class C8289f0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8289f0 f27236d = new C8289f0();

        public C8289f0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Bundle bundle = new Bundle();
            C35640b bVar = C35640b.f95284a;
            bundle.putString("realname_verify_process_jump_activity", ((Class) ((C36570n) C35640b.f95289f).getValue()).getClass().getName());
            bundle.putString("realname_verify_process_jump_plugin", "remittance");
            bundle.putInt("real_name_verify_mode", 0);
            bundle.putInt("entry_scene", 0);
            ((C66782d) C86312j.m106911c(C66782d.class)).mo72982Co(AppForegroundDelegate.INSTANCE.mo174212f().get(), bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$g */
    public static final class C8290g extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8290g f27237d = new C8290g();

        public C8290g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_CHARGE_VISITOR_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$g0 */
    public static final class C8291g0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8291g0 f27238d = new C8291g0();

        public C8291g0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            MultiProcessMMKV.getMMKV("finder_shop_disclaimer_mmkv").clearAll();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$h */
    public static final class C8292h extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8292h f27239d = new C8292h();

        public C8292h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_FANS_CLUB_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$h0 */
    public static final class C8293h0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8293h0 f27240d = new C8293h0();

        public C8293h0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FIRST_SHOW_NEARBY_REDDOT_BOOLEAN_SYNC, Boolean.TRUE);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$i */
    public static final class C8294i extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8294i f27241d = new C8294i();

        public C8294i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_MODE_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$i0 */
    public static final class C8295i0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8295i0 f27242d = new C8295i0();

        public C8295i0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$j */
    public static final class C8296j extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8296j f27243d = new C8296j();

        public C8296j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC, "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$j0 */
    public static final class C8297j0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8297j0 f27244d = new C8297j0();

        public C8297j0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_LIVE_NEW_REDDOT_FLAG_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$k */
    public static final class C8298k extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8298k f27245d = new C8298k();

        public C8298k() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$k0 */
    public static final class C8299k0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8299k0 f27246d = new C8299k0();

        public C8299k0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_LIVE_TASK_REDDOT_FLAG_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$l */
    public static final class C8300l extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8300l f27247d = new C8300l();

        public C8300l() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VR_MODE_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$m */
    public static final class C8301m extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8301m f27248d = new C8301m();

        public C8301m() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VR_TIP_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$n */
    public static final class C8302n extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8302n f27249d = new C8302n();

        public C8302n() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86013q1.m106445f(VFSStrategy.m163776d(WeChatBrands.Business.GROUP_LIVE) + XVFSFile.SEPARATOR_CHAR);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$o */
    public static final class C8303o extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8303o f27250d = new C8303o();

        public C8303o() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_FESTIVAL_TIP_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_FESTIVAL_GUIDE_BOOLEAN_SYNC, bool);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$p */
    public static final class C8304p extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8304p f27251d = new C8304p();

        public C8304p() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_ALWAYS_SUBSCRIBE_NOTIFICATION_INT_SYNC, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$q */
    public static final class C8305q extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8305q f27252d = new C8305q();

        public C8305q() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_GESTURE_EFFECT_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$r */
    public static final class C8306r extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8306r f27253d = new C8306r();

        public C8306r() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_EFFECT_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$s */
    public static final class C8307s extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8307s f27254d = new C8307s();

        public C8307s() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_TIPS_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$t */
    public static final class C8308t extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8308t f27255d = new C8308t();

        public C8308t() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$u */
    public static final class C8309u extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8309u f27256d = new C8309u();

        public C8309u() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_LUCKY_MONEY_GUIDE_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$v */
    public static final class C8310v extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8310v f27257d = new C8310v();

        public C8310v() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85063ie(context, "21029574718@chatroom");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$w */
    public static final class C8311w extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8311w f27258d = new C8311w();

        public C8311w() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_SHOW_FIDNER_ACCOUNT_CONFIRM_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$z */
    public static final class C8312z extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C8312z f27259d = new C8312z();

        public C8312z() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, bool);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$e0 */
    public static final class C32445e0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32445e0 f86225d = new C32445e0();

        public C32445e0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).mo84988BG("nativeShareToGameLive", "wx95a3a4d7c627e07d", "{\"liveEntryScene\":7,\"liveObjectExportId\":\"\"}", true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$x */
    public static final class C32446x extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32446x f86226d = new C32446x();

        public C32446x() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).lc0(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gg1.a$y */
    public static final class C32447y extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32447y f86227d = new C32447y();

        public C32447y() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).lc0(true);
            return C13598b0.f38549a;
        }
    }

    static {
        C36665a aVar = new C36665a(1, "会话列表是否展示视频号群直播icon", (C32227p) null, 4, (C8480h) null);
        aVar.mo60270f(C32735h.C32737c.clicfg_finder_live_conversation_icon_show);
        aVar.mo60268b("FINDER_LIVE_FAST_COMMENT_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86125b = aVar;
        C36665a aVar2 = new C36665a(0, "离开直播间总是弹关注按钮", (C32227p) null, 4, (C8480h) null);
        aVar2.mo60268b("FINDER_LIVE_FOLLOW_TIPS", C64197v.m75537f(0, 1), C64197v.m75537f("no", "yes"));
        f86129c = aVar2;
        C36665a aVar3 = new C36665a(0, "榜单入口权限", (C32227p) null, 4, (C8480h) null);
        aVar3.mo60268b("FINDER_LIVE_REWARD_TEST_SWITCH1", C64197v.m75537f(1, 2, 0), C64197v.m75537f("关闭", "打开", "依赖后台下发"));
        f86133d = aVar3;
        C36665a aVar4 = new C36665a(0, "隐藏热度数值", (C32227p) null, 4, (C8480h) null);
        aVar4.mo60268b("FINDER_LIVE_REWARD_TEST_SWITCH2", C64197v.m75537f(1, 2, 0), C64197v.m75537f("不隐藏", "隐藏", "依赖后台下发"));
        f86137e = aVar4;
        C36665a aVar5 = new C36665a(0, "主播榜单标题是否显示\"礼物热度\"", (C32227p) null, 4, (C8480h) null);
        aVar5.mo60268b("FINDER_LIVE_REWARD_TEST_SWITCH3", C64197v.m75537f(1, 2, 0), C64197v.m75537f("不显示", "显示", "依赖后台下发"));
        f86141f = aVar5;
        C36665a aVar6 = new C36665a(50, "慢函数阈值(ms)", (C32227p) null, 4, (C8480h) null);
        aVar6.mo60268b("FINDER_FPS_EVIL_METHOD_THRESHOLD", C64197v.m75537f(10, 20, 50, 100), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "50", "100"));
        aVar6.mo60273m(V2TXJSAdapterConstants.PUSHER_KEY_FPS);
        f86145g = aVar6;
        C36665a aVar7 = new C36665a(15, "直播添加进历史准入时间偏移", (C32227p) null, 4, (C8480h) null);
        aVar7.mo60270f(C32735h.C32737c.clicfg_finder_live_add_to_history_offset);
        f86149h = aVar7;
        C36665a aVar8 = new C36665a(0, "直播间红包入口", (C32227p) null, 4, (C8480h) null);
        aVar8.mo60268b("FINDER_DEBUG_LIVE_LUCKY_MONEY_ENTRANCE", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("默认", "不允许", "允许-非节日", "允许-节日"));
        f86153i = aVar8;
        C36665a aVar9 = new C36665a(0, "是否支持抢占连麦玩法", (C32227p) null, 4, (C8480h) null);
        aVar9.mo60268b("FINDER_LIVE_ENABLE_GRAB_MODE", C64197v.m75537f(0, 1, 2), C64197v.m75537f("默认", "打开", "关闭"));
        f86157j = aVar9;
        C36665a aVar10 = new C36665a(1, "观众端连麦美颜开关", (C32227p) null, 4, (C8480h) null);
        aVar10.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_mic_beauty_switch);
        aVar10.mo60268b("FINDER_LIVE_VISITOR_MIC_BEAUTY_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86161k = aVar10;
        new C35469d("重置直播红包H5", C8309u.f27256d).mo60273m("T5");
        new C35469d("清除商品免责声明缓存", C8291g0.f27238d);
        new C35469d("清空本地礼物资源", C8302n.f27249d).mo60273m("常用");
        new C35469d("直播红包测试", C8310v.f27257d).mo60273m("T5");
        C36665a aVar11 = new C36665a(1, "直播间更多菜单调试选项", (C32227p) null, 4, (C8480h) null);
        aVar11.mo60268b("FINDER_LIVE_MORE_ACTION_DEBUG", C64197v.m75537f(0, 1), C64197v.m75537f("隐藏", "显示"));
        aVar11.mo60273m("T5.1");
        f86165l = aVar11;
        C36665a aVar12 = new C36665a(0, "自己的等级改为70", (C32227p) null, 4, (C8480h) null);
        aVar12.mo60268b("FINDER_SELF_LEVEL_70", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86169m = aVar12;
        C36665a aVar13 = new C36665a(0, "全场偶数等级使用70级动画效果", (C32227p) null, 4, (C8480h) null);
        aVar13.mo60268b("FINDER_EVEN_LEVEL_70_EFFECT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86173n = aVar13;
        new C35469d("重置身份确认半屏", C8311w.f27258d).mo60273m("T5");
        C37016a aVar14 = new C37016a(10000, "直播心跳手动复苏时间间隔");
        aVar14.mo60270f(C32735h.C32737c.clicfg_finder_live_heart_beat_guard_interval);
        f86177o = aVar14;
        C36665a aVar15 = new C36665a(1, "直播保活手动复苏开关", (C32227p) null, 4, (C8480h) null);
        aVar15.mo60270f(C32735h.C32737c.clicfg_finder_live_keep_alive_guard_enable);
        f86181p = aVar15;
        C36665a aVar16 = new C36665a(0, "直播快捷评论开关", (C32227p) null, 4, (C8480h) null);
        aVar16.mo60270f(C32735h.C32737c.clicfg_finder_live_fast_comment_enable);
        aVar16.mo60268b("FINDER_LIVE_FAST_COMMENT_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86185q = aVar16;
        C36665a aVar17 = new C36665a(0, "歌单能力开关", (C32227p) null, 4, (C8480h) null);
        aVar17.mo60270f(C32735h.C32737c.clicfg_finder_live_song_list_ability_enable);
        aVar17.mo60268b("FINDER_LIVE_LIST_ABILITY_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86189r = aVar17;
        C36665a aVar18 = new C36665a(15, "直播小程序广告浏览倒计时", (C32227p) null, 4, (C8480h) null);
        aVar18.mo60270f(C32735h.C32737c.clicfg_finder_live_ad_count_down_time_sec);
        f86193s = aVar18;
        C36665a aVar19 = new C36665a(1, "主播发生错误时弹窗提醒关播", (C32227p) null, 4, (C8480h) null);
        aVar19.mo60270f(C32735h.C32738b.clicfg_finder_live_anchor_error_alert_dialog);
        f86197t = aVar19;
        C36665a aVar20 = new C36665a(0, "banner预加载开关", (C32227p) null, 4, (C8480h) null);
        aVar20.mo60270f(C32735h.C32737c.clicfg_finder_live_banner_preload_ability_enable);
        aVar20.mo60268b("FINDER_LIVE_BANNER_PRE_LOAD_ABILITY_ENABLE", C64197v.m75537f(0, 1, 2), C64197v.m75537f("全开启", "仅开启秒开", "全关闭"));
        f86201u = aVar20;
        C36665a aVar21 = new C36665a(0, "直播间结束页保持打击状态", (C32227p) null, 4, (C8480h) null);
        aVar21.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_after_abnormal_close);
        aVar21.mo60268b("FINDER_LIVE_AFTER_ABNORMAL_CLOSE", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86205v = aVar21;
        C36665a aVar22 = new C36665a(0, "直播播放器自动回收", (C32227p) null, 4, (C8480h) null);
        aVar22.mo60270f(C32735h.C32737c.clicfg_finder_live_player_auto_recover);
        aVar22.mo60268b("FINDER_LIVE_PLAYER_AUTO_RECOVER", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        C36665a aVar23 = new C36665a(0, "直播播放器Page自动回收", (C32227p) null, 4, (C8480h) null);
        aVar23.mo60270f(C32735h.C32737c.clicfg_finder_live_page_player_auto_recover_new);
        aVar23.mo60268b("FINDER_LIVE_PLAYER_AUTO_RECOVER", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86209w = aVar23;
        C36665a aVar24 = new C36665a(0, "视频号MM播放器Page自动回收", (C32227p) null, 4, (C8480h) null);
        aVar24.mo60270f(C32735h.C32737c.clicfg_finder_mm_player_recover);
        aVar24.mo60268b("FINDER_MM_PLAYER_AUTO_RECOVER", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86213x = aVar24;
        C36665a aVar25 = new C36665a(0, "直播画质增强", (C32227p) null, 4, (C8480h) null);
        aVar25.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_sharpen_xlab_android);
        aVar25.mo60268b("FINDER_LIVE_PLAYER_AUTO_RECOVER", C64197v.m75537f(0, 5), C64197v.m75537f("否", "是"));
        f86217y = aVar25;
        C36665a aVar26 = new C36665a(0, "直播画质增强支持广场及视频号feed入口", (C32227p) null, 4, (C8480h) null);
        aVar26.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_sharpen_nearbyandfinder);
        aVar26.mo60268b("FINDER_LIVE_PLAYER_AUTO_RECOVER", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86221z = aVar26;
        C36665a aVar27 = new C36665a(0, "是否允许主播开启音乐", (C32227p) null, 4, (C8480h) null);
        aVar27.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_anchor_music);
        aVar27.mo60268b("FINDER_LIVE_ENABLE_ANCHOR_MUSIC", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86032A = aVar27;
        C36665a aVar28 = new C36665a(0, "是否允许观众端后台弹notification", (C32227p) null, 4, (C8480h) null);
        aVar28.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_visitor_notification);
        f86036B = aVar28;
        C36665a aVar29 = new C36665a(0, "主播音量调节快捷区域test", (C32227p) null, 4, (C8480h) null);
        aVar29.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_music_test);
        aVar29.mo60268b("FINDER_LIVE_ANCHOR_MUSIC_CLICK_TEST", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86040C = aVar29;
        C36665a aVar30 = new C36665a(1000, "主播音乐数量上限", (C32227p) null, 4, (C8480h) null);
        aVar30.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_music_max_size);
        aVar30.mo60268b("FINDER_LIVE_ANCHOR_MUSIC_MAX_SIZE", C64197v.m75537f(50, 100, 1000), C64197v.m75537f("50首", "100首", "1000首"));
        f86044D = aVar30;
        C36665a aVar31 = new C36665a(100, "主播点歌歌单上限", (C32227p) null, 4, (C8480h) null);
        aVar31.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_sing_song_list_max_size);
        aVar31.mo60268b("FINDER_LIVE_ANCHOR_SING_SONG_LIST_MAX_SIZE", C64197v.m75537f(50, 100), C64197v.m75537f("50首", "100首"));
        f86048E = aVar31;
        C36665a aVar32 = new C36665a(40, "主播背景音乐初始音量", (C32227p) null, 4, (C8480h) null);
        aVar32.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_music_init_volume);
        aVar32.mo60268b("FINDER_LIVE_ANCHOR_MUSIC_INIT_VOLUME", C64197v.m75537f(20, 40, 60), C64197v.m75537f("20", "40", "60"));
        f86052F = aVar32;
        C36665a aVar33 = new C36665a(0, "是否异步load pag", (C32227p) null, 4, (C8480h) null);
        aVar33.mo60270f(C32735h.C32737c.clicfg_finder_live_asycn_load_pag);
        aVar33.mo60268b("FINDER_LIVE_ASYCN_LOAD_PAG", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86056G = aVar33;
        new C35469d("重置直播模式选择教育页", C8294i.f27241d);
        C36665a aVar34 = new C36665a(1, "视频号直播音频模式开关", (C32227p) null, 4, (C8480h) null);
        aVar34.mo60270f(C32735h.C32737c.clicfg_finder_live_audio_mode_enable);
        f86060H = aVar34;
        C36665a aVar35 = new C36665a(5, "直播语音对讲最多人数参与", (C32227p) null, 4, (C8480h) null);
        aVar35.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_intercom_max_nums);
        f86064I = aVar35;
        C36665a aVar36 = new C36665a(1, "连麦心跳开关", (C32227p) null, 4, (C8480h) null);
        aVar36.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_intercom_heart_switch);
        f86068J = aVar36;
        new C35469d("重置是否第一次获得直播打赏", C8295i0.f27242d);
        new C36665a(0, "视频号直播冬奥开幕式预约指引开关", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_OLYMPIC_RESERVE_GUIDE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        C36665a aVar37 = new C36665a(1, "直播和附近-直播卡片自动播放", (C32227p) null, 4, (C8480h) null);
        aVar37.mo60268b("FINDER_NEARBY_LIVE_CARD_AUTO_PLAY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar37.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_card_auto_play);
        f86072K = aVar37;
        C36665a aVar38 = new C36665a(1, "直播和附近-红点命中执行放大动画", (C32227p) null, 4, (C8480h) null);
        aVar38.mo60268b("FINDER_NEARBY_LIVE_ENABLE_REDDOT_ANIMATION", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar38.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_enable_reddot_animation);
        f86076L = aVar38;
        C36665a aVar39 = new C36665a(1, "直播和附近-点击红点跳转直播间", (C32227p) null, 4, (C8480h) null);
        aVar39.mo60268b("FINDER_NEARBY_REDDOT_TO_TARGET_LIVE_ROOM", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar39.mo60270f(C32735h.C32737c.clicfg_finder_nearby_reddot_to_target_live_room);
        f86079M = aVar39;
        C36665a aVar40 = new C36665a(1, "直播和附近-红点触发预加载", (C32227p) null, 4, (C8480h) null);
        aVar40.mo60268b("FINDER_NEARBY_REDDOT_START_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar40.mo60270f(C32735h.C32737c.clicfg_finder_nearby_reddot_start_preload);
        C36665a aVar41 = new C36665a(1, "直播和附近-根据指定条件触发预加载", (C32227p) null, 4, (C8480h) null);
        aVar41.mo60268b("FINDER_NEARBY_INVOKE_START_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar41.mo60270f(C32735h.C32737c.clicfg_finder_nearby_invoke_start_preload);
        C36665a aVar42 = new C36665a(1, "直播和附近-预加载直播广场tab列表", (C32227p) null, 4, (C8480h) null);
        aVar42.mo60268b("FINDER_NEARBY_SQUARE_TABS_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar42.mo60270f(C32735h.C32737c.clicfg_finder_nearby_square_tabs_preload);
        C36665a aVar43 = new C36665a(1, "直播和附近-在直播广场当前页加载好后，预加载直播广场其他页", (C32227p) null, 4, (C8480h) null);
        aVar43.mo60268b("FINDER_NEARBY_LIVE_PAGES_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar43.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_pages_preload);
        f86082N = aVar43;
        C36665a aVar44 = new C36665a(1, "直播和附近-自动播放实验组", (C32227p) null, 4, (C8480h) null);
        aVar44.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_auto_play_test);
        aVar44.mo60268b("FINDER_NEARBY_LIVE_AUTO_PLAY_TEST", C64197v.m75537f(1, 2, 3, 4, 5), C64197v.m75537f("实验1", "实验2", "实验3", "实验4", "实验5"));
        aVar44.mo60273m("2021T1");
        C36665a aVar45 = new C36665a(1, "直播和附近-自动播放实验组", (C32227p) null, 4, (C8480h) null);
        aVar45.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_auto_play_test_new);
        aVar45.mo60268b("FINDER_NEARBY_LIVE_AUTO_PLAY_TEST", C64197v.m75537f(1, 2), C64197v.m75537f("实验1", "实验2"));
        aVar45.mo60273m("2021T1");
        f86085O = aVar45;
        C36665a aVar46 = new C36665a(1, "直播和附近-直播是否打开声音", (C32227p) null, 4, (C8480h) null);
        aVar46.mo60268b("FINDER_NEARBY_LIVE_AUTO_PLAY_MUTE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar46.mo60270f(C32735h.C32737c.clicfg_finder_nearby_live_auto_play_mute);
        new C35469d("清除附近的直播和人的NEW红点", C8293h0.f27240d).mo60273m("T32");
        new C35469d("清除直播新手引导标记(上滑&下滑)", C8312z.f27259d);
        C36665a aVar47 = new C36665a(1, "直播上滑新手引导开关", (C32227p) null, 4, (C8480h) null);
        aVar47.mo60270f(C32735h.C32737c.clicfg_finder_live_guide_enable);
        aVar47.mo60268b("FINDER_LIVE_GUIDE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar47.mo60273m("T32_next");
        f86088P = aVar47;
        C36665a aVar48 = new C36665a(1, "直播下滑（进历史）新手引导开关", (C32227p) null, 4, (C8480h) null);
        aVar48.mo60270f(C32735h.C32737c.clicfg_finder_live_real_history_guide_enable);
        aVar48.mo60268b("FINDER_LIVE_REAL_HISTORY_GUIDE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86091Q = aVar48;
        C36665a aVar49 = new C36665a(1, "视频号直播前置摄像头渲染镜像开关", (C32227p) null, 4, (C8480h) null);
        aVar49.mo60270f(C32735h.C32737c.clicfg_finder_live_front_camera_mirror_enable);
        aVar49.mo60273m("T32");
        f86094R = aVar49;
        C36665a aVar50 = new C36665a(1000, "用户距离上次按住对讲按钮时间", (C32227p) null, 4, (C8480h) null);
        aVar50.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_intercom_down_time);
        f86097S = aVar50;
        C36665a aVar51 = new C36665a(200, "用户距离上次松手时间", (C32227p) null, 4, (C8480h) null);
        aVar51.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_intercom_up_time);
        f86100T = aVar51;
        C36665a aVar52 = new C36665a(0, "直播是否打开拍一拍", (C32227p) null, 4, (C8480h) null);
        aVar52.mo60270f(C32735h.C32737c.clicfg_finder_live_tickle_enable);
        aVar52.mo60268b("FINDER_LIVE_TICKLE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar52.mo60273m("T32");
        f86103U = aVar52;
        C36665a aVar53 = new C36665a(1, "直播美颜开关", (C32227p) null, 4, (C8480h) null);
        aVar53.mo60270f(C32735h.C32737c.clicfg_finder_live_beauty_enable);
        aVar53.mo60268b("FINDER_LIVE_BEAUTY_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar53.mo60273m("T32");
        f86106V = aVar53;
        C36665a aVar54 = new C36665a(1, "直播滤镜开关", (C32227p) null, 4, (C8480h) null);
        aVar54.mo60270f(C32735h.C32737c.clicfg_finder_live_filter_enable);
        aVar54.mo60268b("FINDER_LIVE_FILTER_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar54.mo60273m("T32");
        f86109W = aVar54;
        C36665a aVar55 = new C36665a(1, "直播连麦是否打开", (C32227p) null, 4, (C8480h) null);
        aVar55.mo60270f(C32735h.C32737c.clicfg_finder_live_link_mic_enable);
        aVar55.mo60268b("FINDER_LIVE_LINK_MIC_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar55.mo60273m("T32");
        C36665a aVar56 = new C36665a(1, "打开附近的直播和人", (C32227p) null, 4, (C8480h) null);
        aVar56.mo60270f(C32735h.C32737c.clicfg_finder_live_friends);
        aVar56.mo60268b("FINDER_NEARBY_LIVE_FRIENDS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar56.mo60273m("T32");
        f86112X = aVar56;
        C36665a aVar57 = new C36665a(0, "单流预加载策略", (C32227p) null, 4, (C8480h) null);
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_live_new_preload_strategy;
        aVar57.mo60270f(cVar);
        aVar57.mo60268b("FINDER_LIVE_LOAD_DATA_NEW_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar57.mo60273m("T41");
        f86115Y = aVar57;
        C36665a aVar58 = new C36665a(0, "单流预加载策略-禁用预加载", (C32227p) null, 4, (C8480h) null);
        aVar58.mo60270f(cVar);
        aVar58.mo60268b("FINDER_LIVE_LOAD_DATA_NEW_STRATEGY_BAN_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("后台值", "强制禁用"));
        aVar58.mo60273m("T41");
        f86118Z = aVar58;
        C36665a aVar59 = new C36665a(0, "打开附近的直播和人-强制", (C32227p) null, 4, (C8480h) null);
        aVar59.mo60270f(C32735h.C32737c.clicfg_finder_live_friends_total);
        aVar59.mo60268b("FINDER_NEARBY_LIVE_FRIENDS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar59.mo60273m("T32");
        f86122a0 = aVar59;
        C36665a aVar60 = new C36665a(1, "直播Feed下拉出相似流", (C32227p) null, 4, (C8480h) null);
        aVar60.mo60270f(C32735h.C32737c.clicfg_finder_live_pull_similar);
        aVar60.mo60268b("FINDER_NEARBY_LIVE_PULL_SIMILAR", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar60.mo60273m("T32");
        f86126b0 = aVar60;
        C36665a aVar61 = new C36665a(0, "直播礼物连击生成相同comboId", (C32227p) null, 4, (C8480h) null);
        aVar61.mo60268b("FINDER_LIVE_GIFT_CONTINUOUS_CLICK_MANAGER_USE_SAME_COMBO_ID", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f86130c0 = aVar61;
        new C36316a(false, "直播礼物打赏mock工具是否打开", (String) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_GIFT_MOCK_DEBUG", C64197v.m75537f(Boolean.TRUE, Boolean.FALSE), C64197v.m75537f("打开", "关闭"));
        new C36665a(0, "直播礼物debug", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_GIFT_DEBUG", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        C36665a aVar62 = new C36665a(0, "进直播间播视频广告-无限次数", (C32227p) null, 4, (C8480h) null);
        aVar62.mo60268b("LIVE_AD_VIDEO", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f86134d0 = aVar62;
        C36665a aVar63 = new C36665a(0, "视频号直播礼物开关", (C32227p) null, 4, (C8480h) null);
        aVar63.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_enable);
        aVar63.mo60268b("FINDER_LIVE_GIFT_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        aVar63.mo60273m("T32");
        C36665a aVar64 = new C36665a(3, "礼物时长上限(秒)", (C32227p) null, 4, (C8480h) null);
        aVar64.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_anim_duration);
        aVar64.mo60268b("FINDER_LIVE_GIFT_ANIM_STAY_DURATION", C64197v.m75537f(3, 1, 10, 30), C64197v.m75537f("3秒", "1秒", "10秒", "30秒"));
        aVar64.mo60273m("T32");
        f86138e0 = aVar64;
        C36665a aVar65 = new C36665a(0, "视频号直播送礼通知昵称长度", (C32227p) null, 4, (C8480h) null);
        aVar65.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_queue_nickname_length);
        f86142f0 = aVar65;
        C36665a aVar66 = new C36665a(0, "视频号直播礼物小礼物pag flush在api25及以下机型中是否在主线程执行", (C32227p) null, 4, (C8480h) null);
        aVar66.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_queue_flush_main_thread_below_api25);
        f86146g0 = aVar66;
        C36665a aVar67 = new C36665a(10000, "视频号直播送礼队列最大缓存长度", (C32227p) null, 4, (C8480h) null);
        aVar67.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_queue_max_size);
        f86150h0 = aVar67;
        C36665a aVar68 = new C36665a(10, "视频号直播送礼队列聚合id延迟消失时长/秒", (C32227p) null, 4, (C8480h) null);
        aVar68.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_comboid_live_time);
        f86154i0 = aVar68;
        C37016a aVar69 = new C37016a(9000, "视频号直播送礼大礼物默认播放时长");
        aVar69.mo60270f(C32735h.C32737c.clicfg_finder_live_gift_full_pag_default_duration);
        f86158j0 = aVar69;
        C36665a aVar70 = new C36665a(0, "直播打赏模拟上榜", (C32227p) null, 4, (C8480h) null);
        aVar70.mo60270f(C32735h.C32737c.clicfg_finder_live_msg_badge_debug);
        aVar70.mo60268b("FINDER_LIVE_MSG_BADGE_DEBUG", C64197v.m75537f(0, 1, 2, 3, 9), C64197v.m75537f("不上榜", "榜1", "榜2", "榜3", "榜9"));
        C36665a aVar71 = new C36665a(3, "观众打赏榜单自动刷新间隔/秒", (C32227p) null, 4, (C8480h) null);
        aVar71.mo60270f(C32735h.C32737c.clicfg_finder_live_member_list_autorefresh);
        aVar71.mo60268b("FINDER_LIVE_MEMBER_LIST_AUTO_REFRESH", C64197v.m75537f(0, 1, 2, 3, 5, 10, -1), C64197v.m75537f("0秒", "1秒", "2秒", "3秒", "5秒", "10秒", "不自动刷新"));
        f86162k0 = aVar71;
        C36665a aVar72 = new C36665a(0, "过滤观众端因为复用问题的0在线人数", (C32227p) null, 4, (C8480h) null);
        aVar72.mo60270f(C32735h.C32737c.clicfg_finder_live_filter_visitor_reset_online_value);
        aVar72.mo60268b("FINDER_LIVE_FILTER_VISITOR_RESET_ONLOIN_VALUE", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86166l0 = aVar72;
        C36665a aVar73 = new C36665a(0, "过滤观众端0人点赞数", (C32227p) null, 4, (C8480h) null);
        aVar73.mo60270f(C32735h.C32737c.clicfg_finder_live_filter_visitor_zero_like_value);
        aVar73.mo60268b("FINDER_LIVE_FILTER_VISITOR_ZERO_LIKE_VALUE", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86170m0 = aVar73;
        C36665a aVar74 = new C36665a(0, "直播打赏是否本地假插", (C32227p) null, 4, (C8480h) null);
        aVar74.mo60270f(C32735h.C32737c.clicfg_finder_live_msg_send_local_gift);
        aVar74.mo60268b("FINDER_LIVE_MSG_SEND_LOCAL_GIFT", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86174n0 = aVar74;
        C36665a aVar75 = new C36665a(0, "评论列表是否保留自己不超过一半上限的评论数据", (C32227p) null, 4, (C8480h) null);
        aVar75.mo60270f(C32735h.C32737c.clicfg_finder_live_msg_save_myself_comment);
        aVar75.mo60268b("FINDER_LIVE_MSG_SAVE_MYSELF_COMMENT", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86178o0 = aVar75;
        C36665a aVar76 = new C36665a(-1, "视频号直播观众模式", (C32227p) null, 4, (C8480h) null);
        aVar76.mo60268b("FINDER_LIVE_VISITOR_MODE", C64197v.m75537f(-1, 0, 1), C64197v.m75537f("跟随后台", "TRTC", "CDN"));
        aVar76.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_mode);
        f86182p0 = aVar76;
        C36665a aVar77 = new C36665a(100000, "心愿单单个礼物上限", (C32227p) null, 4, (C8480h) null);
        aVar77.mo60268b("FINDER_LIVE_WISH_MAX_SIZE", C64197v.m75537f(99999, 999999, 9999999), C64197v.m75537f("99999", "99999", "9999999"));
        aVar77.mo60270f(C32735h.C32737c.clicfg_finder_live_wish_max_size);
        f86186q0 = aVar77;
        C36665a aVar78 = new C36665a(1000, "直播评论长度限制", (C32227p) null, 4, (C8480h) null);
        aVar78.mo60270f(C32735h.C32737c.clicfg_finder_live_comment_list_size_limit);
        aVar78.mo60268b("FINDER_LIVE_COMMENT_SIZE_LIMIT", C64197v.m75537f(5, 10), C64197v.m75537f("限制5条", "限制10条"));
        f86190r0 = aVar78;
        C36665a aVar79 = new C36665a(0, "是否使用本地时间创建直播预告", (C32227p) null, 4, (C8480h) null);
        aVar79.mo60268b("FINDER_LIVE_NOTICE_TIME", C64197v.m75537f(0, 1), C64197v.m75537f("使用服务器时间", "使用本地时间"));
        f86194s0 = aVar79;
        C36665a aVar80 = new C36665a(0, "是否展示开播分组入口", (C32227p) null, 4, (C8480h) null);
        aVar80.mo60270f(C32735h.C32737c.clicfg_finder_live_visibility_entrance);
        aVar80.mo60268b("FINDER_LIVE_VISIBLITY_ENTRANCE", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86198t0 = aVar80;
        C36665a aVar81 = new C36665a(0, "开播分组分组是否插入假数据", (C32227p) null, 4, (C8480h) null);
        aVar81.mo60268b("FINDER_LIVE_VISIBLITY_DEBUG_DATA", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86202u0 = aVar81;
        C36665a aVar82 = new C36665a(0, "是否打开观看直播的身份的入口", (C32227p) null, 4, (C8480h) null);
        aVar82.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_role_entrance);
        aVar82.mo60268b("FINDER_LIVE_VISITOR_ROLE_ENTRANCE", C64197v.m75537f(0, 1, 2), C64197v.m75537f("打开", "非release打开", "关闭"));
        f86206v0 = aVar82;
        C36665a aVar83 = new C36665a(0, "是否打开主播开播安全引导页的入口", (C32227p) null, 4, (C8480h) null);
        aVar83.mo60270f(C32735h.C32737c.clicfg_finder_live_precheck_entrance);
        aVar83.mo60268b("FINDER_LIVE_PRECHECK_ENTRANCE", C64197v.m75537f(0, 1, 2), C64197v.m75537f("打开", "非release打开", "关闭"));
        f86210w0 = aVar83;
        C36665a aVar84 = new C36665a(28, "观看直播的身份昵称最大长度", (C32227p) null, 4, (C8480h) null);
        aVar84.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_role_nickname_length);
        aVar84.mo60268b("FINDER_LIVE_VISITOR_ROLE_NICKNAME_LENGTH", C64197v.m75537f(14, 28, 32, 50), C64197v.m75537f("14", "28", "32", "50"));
        f86214x0 = aVar84;
        C36665a aVar85 = new C36665a(0, "是否过滤自己的头像", (C32227p) null, 4, (C8480h) null);
        aVar85.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_role_filter_avatarurl);
        aVar85.mo60268b("FINDER_LIVE_VISITOR_ROLE_FILTER_MYSELF_AVATARURL", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86218y0 = aVar85;
        C36665a aVar86 = new C36665a(1, "直播购物讲解图片大小", (C32227p) null, 4, (C8480h) null);
        aVar86.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_picture_size);
        aVar86.mo60268b("FINDER_LIVE_SHPOPPING_PICTURE_CONFIG", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("10A", "12A", "20A", "30A"));
        f86222z0 = aVar86;
        MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        C36665a aVar87 = new C36665a(0, "直播购物是否展示热卖动画", (C32227p) null, 4, (C8480h) null);
        aVar87.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_hot_sell_anim);
        aVar87.mo60268b("FINDER_LIVE_SHPOPPING_HOT_SELL_ANIM", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86033A0 = aVar87;
        C36665a aVar88 = new C36665a(1, "直播购物使用热卖动画debug数据", (C32227p) null, 4, (C8480h) null);
        aVar88.mo60268b("FINDER_LIVE_SHPOPPING_HOT_SELL_DEBUG", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86037B0 = aVar88;
        C36665a aVar89 = new C36665a(0, "直播购物是否允许异步inflater", (C32227p) null, 4, (C8480h) null);
        aVar89.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_async_inflater);
        aVar89.mo60268b("FINDER_LIVE_SHPOPPING_ASYNC_LAYOUT_INFLATER", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86041C0 = aVar89;
        C36665a aVar90 = new C36665a(0, "直播购物是否展示购物袋动画", (C32227p) null, 4, (C8480h) null);
        aVar90.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_entrance_anim);
        aVar90.mo60268b("FINDER_LIVE_SHPOPPING_ENTRANCE_ANIM", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86045D0 = aVar90;
        new C36316a(false, "直播分享打开单流", "FINDER_LIVE_SHARE_MSG_OPEN_SHARE_PAGE");
        C36665a aVar91 = new C36665a(1, "直播抽奖入口", (C32227p) null, 4, (C8480h) null);
        aVar91.mo60270f(C32735h.C32737c.clicfg_finder_live_lottery_switch);
        aVar91.mo60268b("debugFinderLiveLottery", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f86049E0 = aVar91;
        C36665a aVar92 = new C36665a(60, "投票气泡展示时长(秒)", (C32227p) null, 4, (C8480h) null);
        aVar92.mo60270f(C32735h.C32737c.clicfg_finder_live_vote_bubble_stay_duration);
        aVar92.mo60268b("FINDER_LIVE_VOTE_BUBBLE_STAY_DURATION", C64197v.m75537f(60, 5, 30, 100), C64197v.m75537f("60秒", "5秒", "30秒", "100秒"));
        String str = "T32";
        aVar92.mo60273m(str);
        f86053F0 = aVar92;
        C36665a aVar93 = new C36665a(60, "抽奖气泡展示时长(秒)", (C32227p) null, 4, (C8480h) null);
        aVar93.mo60270f(C32735h.C32737c.clicfg_finder_live_lottery_bubble_stay_duration);
        aVar93.mo60268b("FINDER_LIVE_LOTTERY_BUBBLE_STAY_DURATION", C64197v.m75537f(60, 5, 30, 100), C64197v.m75537f("60秒", "5秒", "30秒", "100秒"));
        aVar93.mo60273m(str);
        f86057G0 = aVar93;
        C36665a aVar94 = new C36665a(60, "抽奖中气泡展示时长(秒)", (C32227p) null, 4, (C8480h) null);
        aVar94.mo60270f(C32735h.C32737c.clicfg_finder_live_lottery_bubble_computing_stay_duration);
        aVar94.mo60268b("FINDER_LIVE_LOTTERY_BUBBLE_COMPUTING_STAY_DURATION", C64197v.m75537f(60, 5, 30, 200), C64197v.m75537f("60秒", "5秒", "30秒", "200秒"));
        aVar94.mo60273m(str);
        f86061H0 = aVar94;
        C36665a aVar95 = new C36665a(10, "抽奖本地缓存的已看过抽奖个数", (C32227p) null, 4, (C8480h) null);
        aVar95.mo60270f(C32735h.C32737c.clicfg_finder_live_lottery_saveid_size);
        f86065I0 = aVar95;
        C36665a aVar96 = new C36665a(5, "视频号直播feed缓存时间", (C32227p) null, 4, (C8480h) null);
        aVar96.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_cache_duration);
        f86069J0 = aVar96;
        C36665a aVar97 = new C36665a(0, "视频号直播feed结束后不再播放", (C32227p) null, 4, (C8480h) null);
        aVar97.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_not_play_after_end);
        f86073K0 = aVar97;
        C36665a aVar98 = new C36665a(0, "直播广场feed结束后不再播放", (C32227p) null, 4, (C8480h) null);
        aVar98.mo60270f(C32735h.C32737c.clicfg_nearby_live_feed_not_play_after_end);
        f86077L0 = aVar98;
        C36665a aVar99 = new C36665a(0, "视频号直播是否预加载", (C32227p) null, 4, (C8480h) null);
        aVar99.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_preload);
        aVar99.mo60268b("FINDER_LIVE_ENABLE_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86080M0 = aVar99;
        C36665a aVar100 = new C36665a(2, "视频号直播间切换预加载门槛", (C32227p) null, 4, (C8480h) null);
        aVar100.mo60270f(C32735h.C32737c.clicfg_finder_live_list_preload_threshold);
        aVar100.mo60268b("FINDER_LIVE_LIST_PRELOAD_SIZE", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("0", "1", "2", "3"));
        f86083N0 = aVar100;
        C36665a aVar101 = new C36665a(0, "视频号直播getLiveMsg优化test", (C32227p) null, 4, (C8480h) null);
        aVar101.mo60270f(C32735h.C32737c.clicfg_finder_live_getlivemsg_test);
        aVar101.mo60268b("FINDER_LIVE_GETLIVEMSG_TEST", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86086O0 = aVar101;
        C36665a aVar102 = new C36665a(0, "视频号直播是否本地过滤后台下发的extFlag", (C32227p) null, 4, (C8480h) null);
        aVar102.mo60270f(C32735h.C32737c.clicfg_finder_live_filter_anchor_ext_flag);
        aVar102.mo60268b("FINDER_LIVE_FILTER_ANCHOR_EXT_FLAG", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86089P0 = aVar102;
        new C35469d("重置直播勾选协议", C8283c.f27230d);
        new C35469d("重置实名认证缓存", C8285d.f27232d);
        new C35469d("重置主播音乐引导缓存", C8281b.f27228d);
        new C35469d("重置profile页商品绑定引导缓存", C8287e.f27234d);
        new C35469d("重置直播多身份教育页", C8298k.f27245d);
        new C35469d("重置直播粉丝团红点", C8292h.f27239d);
        new C35469d("重置直播段位授权页", C8296j.f27243d);
        new C35469d("重置付费直播主播法务协议", C8288f.f27235d);
        new C35469d("重置付费直播观众法务协议", C8290g.f27237d);
        C36665a aVar103 = new C36665a(0, "是否允许付费直播设置试看模式", (C32227p) null, 4, (C8480h) null);
        aVar103.mo60270f(C32735h.C32737c.clicfg_finder_live_charge_mode_choose_enable);
        aVar103.mo60268b("FINDER_LIVE_CHARGE_MODE_CHOOSER_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("不允许", "允许"));
        f86092Q0 = aVar103;
        C36665a aVar104 = new C36665a(0, "付费成功之后是否重新进房", (C32227p) null, 4, (C8480h) null);
        aVar104.mo60270f(C32735h.C32737c.clicfg_finder_live_restart_after_charge_pay);
        aVar104.mo60268b("FINDER_LIVE_RESTART_AFTER_CHARGE_PAY", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86095R0 = aVar104;
        C36665a aVar105 = new C36665a(0, "直播间列表是否增加额外的child空间", (C32227p) null, 4, (C8480h) null);
        aVar105.mo60270f(C32735h.C32737c.clicfg_finder_live_layout_enable_extra_space);
        aVar105.mo60268b("FINDER_LIVE_LAYOUT_ENABLE_EXTRA_SPACE", C64197v.m75537f(0, 1), C64197v.m75537f("允许", "不允许"));
        f86098S0 = aVar105;
        new C36316a(false, "打开美颜实时调节器", "FINDER_LIVE_BEAUTY_DEBUG");
        C36665a aVar106 = new C36665a(0, "视频号发布直播", (C32227p) null, 4, (C8480h) null);
        aVar106.mo60270f(C32735h.C32737c.clicfg_finder_live_switch);
        aVar106.mo60268b("debugFinderLive", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f86101T0 = aVar106;
        C36665a aVar107 = new C36665a(0, "直播电商设置推荐语", (C32227p) null, 4, (C8480h) null);
        aVar107.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_set_recommend);
        aVar107.mo60268b("FINDER_LIVE_SHOPPING_SET_RECOMMEND", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86104U0 = aVar107;
        C36665a aVar108 = new C36665a(0, "直播列表嵌套滑动新策略是否打开", (C32227p) null, 4, (C8480h) null);
        aVar108.mo60270f(C32735h.C32737c.clicfg_finder_live_shopping_list_nest_scroll_strategy);
        aVar108.mo60268b("FINDER_LIVE_SHOPPING_LIST_NEST_SCROLL_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86107V0 = aVar108;
        C36665a aVar109 = new C36665a(0, "购物小程序版本", (C32227p) null, 4, (C8480h) null);
        aVar109.mo60268b("FINDER_LIVE_USING_DEBUG_MINIPRO", C64197v.m75537f(0, 1, 2), C64197v.m75537f("正式版", "测试版", "体验版"));
        f86110W0 = aVar109;
        C36665a aVar110 = new C36665a(0, "短视频购物小程序隐藏导航栏", (C32227p) null, 4, (C8480h) null);
        aVar110.mo60268b("debugFinderFeedShopHideNavBar", C64197v.m75537f(0, 1), C64197v.m75537f("跟随后台下发", "隐藏"));
        f86113X0 = aVar110;
        C36665a aVar111 = new C36665a(0, "游戏仿原生版本", (C32227p) null, 4, (C8480h) null);
        aVar111.mo60268b("FINDER_LIVE_GAME_USING_DEBUG_MINIPRO", C64197v.m75537f(0, 1, 2), C64197v.m75537f("正式版", "测试版", "体验版"));
        f86116Y0 = aVar111;
        C36665a aVar112 = new C36665a(100, "直播进场消息队列容量", (C32227p) null, 4, (C8480h) null);
        aVar112.mo60270f(C32735h.C32737c.clicfg_finder_live_bullet_comment_limit_num);
        aVar112.mo60268b("FINDER_LIVE_BULLET_COMMENT_LIMIT_NUM", C64197v.m75537f(10, 20, 50, 100, 200, 500, 1000), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "50", "100", "200", "500", "1000"));
        f86119Z0 = aVar112;
        C36665a aVar113 = new C36665a(0, "直播最多可选可见人数", (C32227p) null, 4, (C8480h) null);
        aVar113.mo60268b("LIVE_USER_MAX_COUNT", C64197v.m75537f(0, 3, 500), C64197v.m75537f("不启动", "3", "500"));
        aVar113.mo60273m("T5");
        f86127b1 = aVar113;
        C36665a aVar114 = new C36665a(0, "视频号直播拉取评论时间间隔", (C32227p) null, 4, (C8480h) null);
        aVar114.mo60270f(C32735h.C32737c.clicfg_finder_live_get_comment_duration);
        f86131c1 = aVar114;
        new C35469d("主播任务红点重置", C8299k0.f27246d);
        new C35469d("清除直播评论地理位置引导", C8286d0.f27233d);
        new C35469d("直播发起红点重置", C8297j0.f27244d);
        C36665a aVar115 = new C36665a(0, "直播间测试过滤过时的cgi响应", (C32227p) null, 4, (C8480h) null);
        aVar115.mo60270f(C32735h.C32737c.clicfg_finder_live_filter_outdated_resp);
        aVar115.mo60268b("FINDER_LIVE_FILTER_OUTDATED_RESP", C64197v.m75537f(0, 1), C64197v.m75537f("过滤", "不过滤"));
        f86135d1 = aVar115;
        C36665a aVar116 = new C36665a(1, "视频号直播清屏动画优化", (C32227p) null, 4, (C8480h) null);
        aVar116.mo60270f(C32735h.C32737c.clicfg_finder_live_clear_screen_overlap);
        f86139e1 = aVar116;
        C36665a aVar117 = new C36665a(3, "视频号直播网络质量弱网阈值", (C32227p) null, 4, (C8480h) null);
        aVar117.mo60270f(C32735h.C32737c.clicfg_finder_live_poor_network_quality_threshold_android);
        f86143f1 = aVar117;
        C36665a aVar118 = new C36665a(3, "feed流中观看直播可以计入uv的观看时间阈值", (C32227p) null, 4, (C8480h) null);
        aVar118.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_preview_interval_threshold);
        f86147g1 = aVar118;
        C37016a aVar119 = new C37016a(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, "直播评论中发送自己的城市位置的最小时间间隔");
        aVar119.mo60270f(C32735h.C32737c.clicfg_finder_live_comment_poi_send_min_interval);
        f86151h1 = aVar119;
        new C36316a(false, "朋友tab直播列表mock数据", "FINDER_LIVE_LIST_CREATE_DEBUG_DATA");
        C36665a aVar120 = new C36665a(0, "朋友tab直播列表是否加入更多直播item", (C32227p) null, 4, (C8480h) null);
        aVar120.mo60270f(C32735h.C32737c.clicfg_finder_live_list_more_live_at_the_end);
        aVar120.mo60268b("FINDER_LIVE_LIST_ENABLE_MORE_LIVE", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86155i1 = aVar120;
        C36665a aVar121 = new C36665a(0, "视频号直播上下切换是否预热feed", (C32227p) null, 4, (C8480h) null);
        aVar121.mo60270f(C32735h.C32737c.clicfg_finder_live_rvfeed_enable_preload);
        aVar121.mo60268b("FINDER_LIVE_RV_FEED_ENABLE_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86159j1 = aVar121;
        C36665a aVar122 = new C36665a(15, "视频号直播历史多少的停留时长能加入到历史列表(ms)", (C32227p) null, 4, (C8480h) null);
        aVar122.mo60270f(C32735h.C32737c.clicfg_finder_live_expire_watch_history_duration);
        aVar122.mo60268b("FINDER_LIVE_EXPIRE_WATCH_HISTORY_DURATION", C64197v.m75537f(5, 15, 30), C64197v.m75537f("5s", "15s", "30s"));
        f86163k1 = aVar122;
        C36665a aVar123 = new C36665a(5, "视频号直播历史最多能有多少个历史直播", (C32227p) null, 4, (C8480h) null);
        aVar123.mo60270f(C32735h.C32737c.clicfg_finder_live_expire_watch_history_max_count);
        aVar123.mo60268b("FINDER_LIVE_EXPIRE_WATCH_HISTORY_MAX_COUNT", C64197v.m75537f(0, 5, 30), C64197v.m75537f("0个", "5个", "30个"));
        f86167l1 = aVar123;
        C36665a aVar124 = new C36665a(0, "直播列表是否允许自动播放", (C32227p) null, 4, (C8480h) null);
        aVar124.mo60270f(C32735h.C32737c.clicfg_finder_live_list_auto_play);
        aVar124.mo60268b("FINDER_LIVE_LIST_AUTO_PLAY", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86171m1 = aVar124;
        C36665a aVar125 = new C36665a(0, "最近打赏列表人数", (C32227p) null, 4, (C8480h) null);
        aVar125.mo60268b("FINDER_LIVE_REWARD_MEMBER", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("不设置", "3个", "14个", "40个"));
        f86175n1 = aVar125;
        C36665a aVar126 = new C36665a(0, "直播是否使用LiveSdkInfo预热", (C32227p) null, 4, (C8480h) null);
        aVar126.mo60270f(C32735h.C32737c.clicfg_finder_live_preload_livesdkinfo);
        aVar126.mo60268b("FINDER_LIVE_PRELOAD_LIVE_SDK_INFO", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86179o1 = aVar126;
        C36665a aVar127 = new C36665a(0, "新广场首页开关", (C32227p) null, 4, (C8480h) null);
        aVar127.mo60270f(C32735h.C32737c.clicfg_finder_live_new_entrance);
        aVar127.mo60268b("FINDER_LIVE_ACTIVITY_AT_LIVE_ENTRANCE_CARD", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f86187q1 = aVar127;
        C36665a aVar128 = new C36665a(0, "新广场红点滚动开关", (C32227p) null, 4, (C8480h) null);
        aVar128.mo60270f(C32735h.C32737c.clicfg_finder_live_new_entrance_red_dot_auto_scroll);
        aVar128.mo60268b("CLICFG_FINDER_LIVE_NEW_ENTRANCE_RED_DOT_AUTO_SCROLL", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f86191r1 = aVar128;
        C36665a aVar129 = new C36665a(0, "强行启用品牌标签", (C32227p) null, 4, (C8480h) null);
        aVar129.mo60270f(C32735h.C32737c.clicfg_finder_live_brand_tag_debug_enable);
        aVar129.mo60268b("FINDER_LIVE_BRAND_TAG_DEBUG_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        C36665a aVar130 = new C36665a(0, "活动状态 icon 是否在广场 feed 流中启用", (C32227p) null, 4, (C8480h) null);
        aVar130.mo60270f(C32735h.C32737c.clicfg_finder_live_activity_at_live_entrance_card);
        aVar130.mo60268b("FINDER_LIVE_ACTIVITY_AT_LIVE_ENTRANCE_CARD", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f86195s1 = aVar130;
        C36665a aVar131 = new C36665a(0, "活动状态 icon 是否在分享场景中启用", (C32227p) null, 4, (C8480h) null);
        aVar131.mo60270f(C32735h.C32737c.clicfg_finder_live_activity_at_live_shared_card);
        aVar131.mo60268b("FINDER_LIVE_ACTIVITY_AT_LIVE_SHARED_CARD", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f86199t1 = aVar131;
        C36665a aVar132 = new C36665a(0, "礼包掉落假开关。启用必现入口", (C32227p) null, 4, (C8480h) null);
        aVar132.mo60270f(C32735h.C32737c.clicfg_finder_live_allowance_debug);
        aVar132.mo60268b("FINDER_LIVE_FINDER_LIVE_ALLOWANCE_DEBUG", C64197v.m75537f(1, 0), C64197v.m75537f("必现入口。测试看效果", "正常上线效果"));
        f86203u1 = aVar132;
        C36665a aVar133 = new C36665a(0, "屏蔽封面测试", (C32227p) null, 4, (C8480h) null);
        aVar133.mo60270f(C32735h.C32737c.clicfg_finder_live_bans_cover);
        aVar133.mo60268b("FINDER_LIVE_FINDER_LIVE_BANS_COVER", C64197v.m75537f(1, 0), C64197v.m75537f("启用屏蔽", "正常"));
        f86207v1 = aVar133;
        C36665a aVar134 = new C36665a(0, "预约领券小程序是否启用体验版", (C32227p) null, 4, (C8480h) null);
        aVar134.mo60270f(C32735h.C32737c.clicfg_finder_live_coupon_mini_app_debug);
        aVar134.mo60268b("FINDER_LIVE_COUPON_MINI_APP_DEBUG", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f86211w1 = aVar134;
        C36665a aVar135 = new C36665a(1, "使用新磨皮", (C32227p) null, 4, (C8480h) null);
        aVar135.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_beauty_enable_new_smooth_face);
        aVar135.mo60268b("CLICFG_FINDER_LIVE_ANCHOR_BEAUTY_ENABLE_NEW_SMOOTH_FACE", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        C36665a aVar136 = new C36665a(0, "设置关注抽奖时是否要提示主播", (C32227p) null, 4, (C8480h) null);
        aVar136.mo60269d("FinderLiveLotteryPromptAttendTypeCompatibility");
        aVar136.mo60268b("FINDER_LIVE_LOTTERY_FOLLOW_TIPS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86215x1 = aVar136;
        C36665a aVar137 = new C36665a(5, "视频号慢轮询请求合并间隔", (C32227p) null, 4, (C8480h) null);
        aVar137.mo60269d("FinderLiveSyncExtraInfoDefaultMergeIntervalSeconds");
        f86219y1 = aVar137;
        C36665a aVar138 = new C36665a(1, "付费回放付费后是否重新进房", (C32227p) null, 4, (C8480h) null);
        aVar138.mo60270f(C32735h.C32737c.clicfg_live_replay_restart_after_pay);
        aVar138.mo60268b("FINDER_LIVE_REPLAY_RESTART_AFTER_PAY", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86223z1 = aVar138;
        C36665a aVar139 = new C36665a(1, "付费回放免费观看时长默认值", (C32227p) null, 4, (C8480h) null);
        aVar139.mo60270f(C32735h.C32737c.clicfg_live_replay_default_preview_duration);
        aVar139.mo60268b("FINDER_LIVE_REPLAY_DEFAULT_PREVIEW_DURATION", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86034A1 = aVar139;
        C36665a aVar140 = new C36665a(0, "直播回放是否允许弹幕", (C32227p) null, 4, (C8480h) null);
        aVar140.mo60270f(C32735h.C32737c.clicfg_live_replay_bullet_enable);
        aVar140.mo60268b("FINDER_LIVE_REPLAY_BULLET_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86038B1 = aVar140;
        C36665a aVar141 = new C36665a(0, "直播间更多按钮样式", (C32227p) null, 4, (C8480h) null);
        aVar141.mo60270f(C32735h.C32737c.clicfg_menu_legacy_style);
        aVar141.mo60268b("FINDER_LIVE_MORE_ACTION_BTN_STYLE", C64197v.m75537f(0, 1), C64197v.m75537f("转发icon", "三点icon"));
        f86042C1 = aVar141;
        C36665a aVar142 = new C36665a(0, "门票编号", (C32227p) null, 4, (C8480h) null);
        aVar142.mo60270f(C32735h.C32737c.clicfg_finder_live_ticket_num);
        aVar142.mo60268b("FINDER_LIVE_TICKET_NUM", C64197v.m75537f(0, 1000086), C64197v.m75537f("默认", "值：1000086"));
        f86046D1 = aVar142;
        new C35469d("清除主播开始组队通知保持选择", C8304p.f27251d);
        new C35469d("重置春晚包厢引导提示", C8279a.f27226d);
        C36665a aVar143 = new C36665a(0, "主播从小窗恢复时是否允许不重启摄像头", (C32227p) null, 4, (C8480h) null);
        aVar143.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_direct_start_from_mini_window);
        aVar143.mo60268b("FINDER_LIVE_ANCHOR_DRIECTOR_START_FROM_MINIWINDOW", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86050E1 = aVar143;
        C36665a aVar144 = new C36665a(0, "观众进入直播间提前加载core", (C32227p) null, 4, (C8480h) null);
        aVar144.mo60270f(C32735h.C32737c.clicfg_finder_live_visitor_preload_core);
        aVar144.mo60268b("FINDER_ENTER_VISITOR_PRELOAD_CORE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar144.mo60273m("2021T3");
        f86054F1 = aVar144;
        new C36316a(false, "直播间是否允许本地直接进鼓掌模式", "FINDER_LIVE_APPLAUD_LOCAL");
        new C35469d("重置创作者流量包红点", C8280a0.f27227d).mo60273m("2022T4");
        new C35469d("重置直播更多菜单红点", C8284c0.f27231d).mo60273m("2022T5.1");
        C36665a aVar145 = new C36665a(1, "手势特效x实验开关", (C32227p) null, 4, (C8480h) null);
        aVar145.mo60270f(C32735h.C32737c.clicfg_finder_live_gesture_effect);
        aVar145.mo60268b("FINDER_LIVE_GESTURE_EFFECT_CONFIG", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar145.mo60273m("2022T41");
        f86066I1 = aVar145;
        new C35469d("重置手势特效红点", C8305q.f27252d).mo60273m("2022T41");
        new C35469d("重置主动操作手势特效判断", C8306r.f27253d).mo60273m("2022T41");
        new C35469d("重置手势提示", C8307s.f27254d).mo60273m("2022T41");
        new C35469d("重置直播间观众端礼物特效隐藏指引", C8308t.f27255d);
        new C35469d("Mock直播红点-点击", C32446x.f86226d);
        new C35469d("Mock直播红点-曝光", C32447y.f86227d);
        new C35469d("跳支付实名认证", C8289f0.f27236d);
        C36665a aVar146 = new C36665a(0, "直播观众是否展示分辨率等级", (C32227p) null, 4, (C8480h) null);
        aVar146.mo60270f(C32735h.C32737c.clicfg_finder_live_definition_level);
        aVar146.mo60268b("FINDER_LIVE_DEFINITION_LEVEL", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86074K1 = aVar146;
        C36665a aVar147 = new C36665a(1, "视频号直播预播放", (C32227p) null, 4, (C8480h) null);
        aVar147.mo60268b("FINDER_LIVE_PRE_PLAY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar147.mo60273m("2021T3");
        aVar147.mo60270f(C32735h.C32737c.clicfg_finder_live_player_preplay);
        f86078L1 = aVar147;
        new C35469d("重置直播VR模式教育页", C8300l.f27247d);
        new C35469d("重置直播VR提示气泡", C8301m.f27248d);
        C36665a aVar148 = new C36665a(1, "直播VR开关", (C32227p) null, 4, (C8480h) null);
        aVar148.mo60270f(C32735h.C32737c.clicfg_finder_live_vr_mode_enable);
        aVar148.mo60268b("FINDER_LIVE_VR_MODE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86081M1 = aVar148;
        C36665a aVar149 = new C36665a(0, "是否展示直播侧边栏", (C32227p) null, 4, (C8480h) null);
        aVar149.mo60270f(C32735h.C32737c.clicfg_finder_live_sidebar_switch);
        aVar149.mo60268b("FINDER_LIVE_SIDEBAR_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86084N1 = aVar149;
        new C35469d("游戏直播全屏协议重置", C8282b0.f27229d);
        C36665a aVar150 = new C36665a(-1, "主播开播温度过高提示阈值", (C32227p) null, 4, (C8480h) null);
        aVar150.mo60270f(C32735h.C32737c.clicfg_finder_live_battery_temperature_threshold);
        aVar150.mo60268b("FINDER_LIVE_ANCHOR_BATTERY_TEMPERATURE_THRESHOLD", C64197v.m75537f(15, 20, 25, 30, 35, 40, 45, 50), C64197v.m75537f("15度", "20度", "25度", "30度", "35度", "40度", "45度", "50度"));
        f86087O1 = aVar150;
        C36665a aVar151 = new C36665a(-1, "主播开播静音检测时长阈值", (C32227p) null, 4, (C8480h) null);
        aVar151.mo60270f(C32735h.C32737c.clicfg_finder_live_silent_audio_duration_threshold);
        aVar151.mo60268b("FINDER_LIVE_ANCHOR_SILENT_AUDIO_DURATION_THRESHOLD", C64197v.m75537f(5, 10), C64197v.m75537f("10s", "20s"));
        f86090P1 = aVar151;
        C36665a aVar152 = new C36665a(-1, "主播开播破音检测时长阈值", (C32227p) null, 4, (C8480h) null);
        aVar152.mo60270f(C32735h.C32737c.clicfg_finder_live_overflow_audio_duration_threshold);
        aVar152.mo60268b("FINDER_LIVE_ANCHOR_OVERFLOW_AUDIO_DURATION_THRESHOLD", C64197v.m75537f(5, 10), C64197v.m75537f("10s", "20s"));
        f86093Q1 = aVar152;
        C36665a aVar153 = new C36665a(-1, "主播开播音频断续检测时长阈值", (C32227p) null, 4, (C8480h) null);
        aVar153.mo60270f(C32735h.C32737c.clicfg_finder_live_break_audio_duration_threshold);
        aVar153.mo60268b("FINDER_LIVE_ANCHOR_BREAK_AUDIO_DURATION_THRESHOLD", C64197v.m75537f(5, 10), C64197v.m75537f("10s", "20s"));
        f86096R1 = aVar153;
        C36665a aVar154 = new C36665a(5, "主播开播音频异常断续阈值", (C32227p) null, 4, (C8480h) null);
        aVar154.mo60270f(C32735h.C32737c.clicfg_finder_live_audio_break_count);
        f86099S1 = aVar154;
        C36665a aVar155 = new C36665a(C1820q.CTRL_INDEX, "主播开播弱网测速阈值", (C32227p) null, 4, (C8480h) null);
        aVar155.mo60268b("FINDER_LIVE_ANCHOR_NET_SPEED_TEST_THRESHOLD", C64197v.m75537f(60, Integer.valueOf(C1820q.CTRL_INDEX), 6000, Integer.valueOf(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), C64197v.m75537f("60kbps", "680kbps", "6000kbps", "60000kbps"));
        f86102T1 = aVar155;
        C36665a aVar156 = new C36665a(300000, "主播开播弱网测速弹窗间隔时间", (C32227p) null, 4, (C8480h) null);
        aVar156.mo60268b("FINDER_LIVE_ANCHOR_NET_SPEED_TEST_INTERVAL", C64197v.m75537f(Integer.valueOf(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), 300000), C64197v.m75537f("1分钟", "5分钟"));
        f86105U1 = aVar156;
        C36665a aVar157 = new C36665a(0, "支持主播使用本地视频推流", (C32227p) null, 4, (C8480h) null);
        aVar157.mo60270f(C32735h.C32737c.clicfg_finder_live_local_push_stream_enable);
        aVar157.mo60268b("FINDER_LIVE_LOCAL_PUSH_STREAM_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86108V1 = aVar157;
        C36665a aVar158 = new C36665a(1, "是否允许录屏", (C32227p) null, 4, (C8480h) null);
        aVar158.mo60270f(C32735h.C32737c.clicfg_finder_live_secure_switch);
        aVar158.mo60268b("FINDER_LIVE_SECURE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86111W1 = aVar158;
        C36665a aVar159 = new C36665a(1, "直播feed是否允许录屏", (C32227p) null, 4, (C8480h) null);
        aVar159.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_secure_switch);
        aVar159.mo60268b("FINDER_LIVE_FEED_SECURE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86114X1 = aVar159;
        C36665a aVar160 = new C36665a(1, "直播切换清晰度UI样式", (C32227p) null, 4, (C8480h) null);
        aVar160.mo60270f(C32735h.C32737c.clicfg_finder_live_switch_stream_ui_opt);
        aVar160.mo60268b("FINDER_LIVE_SWITCH_STREAM_UI_OPT", C64197v.m75537f(0, 1), C64197v.m75537f("旧样式", "新样式"));
        f86117Y1 = aVar160;
        C36665a aVar161 = new C36665a(30, "直播商品讲解录制时长上限（分钟）", (C32227p) null, 4, (C8480h) null);
        aVar161.mo60268b("FINDER_LIVE_RECORD_DURATION_LIMIT", C64197v.m75537f(30, 3, 1), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "3", "1"));
        f86120Z1 = aVar161;
        C37016a aVar162 = new C37016a(300, "直播纪念日背景装饰间隔时长");
        aVar162.mo60270f(C32735h.C32737c.clicfg_finder_live_anniversary_day_animation_interval);
        aVar162.mo60268b("FINDER_LIVE_DECORATION_BG_INTERVAL", C64197v.m75537f(30L, 300L), C64197v.m75537f("30s", "5min"));
        f86124a2 = aVar162;
        C36665a aVar163 = new C36665a(0, "多场预约入口", (C32227p) null, 4, (C8480h) null);
        aVar163.mo60270f(C32735h.C32737c.clicfg_finder_live_multi_notice_enable);
        aVar163.mo60268b("FINDER_LIVE_MULTI_NOTICE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f86128b2 = aVar163;
        new C35469d("春联提示重置", C8303o.f27250d);
        new C36665a(0, "所有直播都是春晚", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_MOCK_GALA", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        new C36665a(-1, "朋友圈春晚发表入口控制", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_MOCK_GALA", C64197v.m75537f(-1, 0, 1, 2, 3), C64197v.m75537f("后台配置", "禁用入口", "进过直播间的用户才能发表，带小尾巴", "所有用户开放入口，进过直播间才带小尾巴", "所有用户开放入口，发表都不带小尾巴"));
        new C36665a(-1, "朋友圈春晚小尾巴状体", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_MOCK_GALA", C64197v.m75537f(-1, 0, 1), C64197v.m75537f("后台配置", "显示", "隐藏"));
        new C36665a(0, "强制打开春联活动", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_MOCK_COUPLETS_SNS", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        C36665a aVar164 = new C36665a(0, "直播结束后跳过getLiveMsg", (C32227p) null, 4, (C8480h) null);
        aVar164.mo60270f(C32735h.C32737c.clicfg_finder_live_msg_skip_after_finish);
        aVar164.mo60268b("FINDER_LIVE_MSG_SKIP_AFTER_FINISH", C64197v.m75537f(0, 1), C64197v.m75537f("打开", "关闭"));
        f86132c2 = aVar164;
        new C36316a(false, "是否用维修厂的速度", "FINDER_LIVE_HARD_CODE_MSG_SPEED");
        C36665a aVar165 = new C36665a(172800, "直播服务通知本地记录时间窗口", (C32227p) null, 4, (C8480h) null);
        aVar165.mo60268b("FINDER_LIVE_NOTIFY_RECORD_DURATION", C64197v.m75537f(172800, 3600, 7200, 1800, 900), C64197v.m75537f("48小时", "1小时", "2小时", "30分钟", "15分钟"));
        f86144f2 = aVar165;
        C36665a aVar166 = new C36665a(100, "直播服务通知本地记录条数窗口", (C32227p) null, 4, (C8480h) null);
        aVar166.mo60268b("FINDER_LIVE_NOTIFY_RECORD_COUNT_LIMIT", C64197v.m75537f(100, 2, 4, 6, 8), C64197v.m75537f("100", "2", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "8"));
        f86148g2 = aVar166;
        new C36316a(false, "直播评论更改配置测试", "FINDER_LIVE_COMMENT_CONFIG_CHANGE_TEST");
        new C35469d("游戏直播拉起音乐列表测试", C32445e0.f86225d);
        C36665a aVar167 = new C36665a(0, "直播禁用分享", (C32227p) null, 4, (C8480h) null);
        aVar167.mo60268b("FINDER_LIVE_BAN_SHARE", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        aVar167.mo60273m("T41");
        f86156i2 = aVar167;
        C36665a aVar168 = new C36665a(0, "直播feed推荐ui是否使用新样式", (C32227p) null, 4, (C8480h) null);
        aVar168.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_recommend_ui_if_new);
        aVar168.mo60268b("FINDER_LIVE_FEED_RECOMMEND_IF_NEW_UI", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86164k2 = aVar168;
        C36665a aVar169 = new C36665a(100, "直播抽奖面板上限(debug)", (C32227p) null, 4, (C8480h) null);
        aVar169.mo60268b("FINDER_LIVE_LOTTERY_PANEL_LIMIT_ITEM", C64197v.m75537f(100, 50, 20, 10), C64197v.m75537f("100", "50", "20", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        f86168l2 = aVar169;
        C36665a aVar170 = new C36665a(0, "直播主播是否立体声采集", (C32227p) null, 4, (C8480h) null);
        aVar170.mo60270f(C32735h.C32737c.clicfg_finder_live_anchor_stereo_capture_strategy);
        aVar170.mo60268b("FINDER_LIVE_STEREO_CAPTURE_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86172m2 = aVar170;
        C36665a aVar171 = new C36665a(3, "视频号商品免责声明弹窗策略", (C32227p) null, 4, (C8480h) null);
        aVar171.mo60270f(C32735h.C32738b.clicfg_finder_shopping_third_party_disclaimer);
        aVar171.mo60268b("FINDER_LIVE_SHOPPING_DISCLAIMER_STRATEGY", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("关闭", "每个appid弹一次", "每个appid一天一次", "每次"));
        f86176n2 = aVar171;
        C36665a aVar172 = new C36665a(-1, "设置直播礼物面板中显示的打赏等级", (C32227p) null, 4, (C8480h) null);
        aVar172.mo60268b("FINDER_LIVE_GIFT_LEVEL_HARD_CODE", C64197v.m75537f(-1, 5, 15, 25, 35, 45, 55, 65, 75, 85), C64197v.m75537f("real", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "15", "25", "35", "45", "55", "65", "75", "85"));
        f86180o2 = aVar172;
        C36665a aVar173 = new C36665a(-1, "设置直播进场信息的类型", (C32227p) null, 4, (C8480h) null);
        aVar173.mo60268b("FINDER_LIVE_ENTER_MSG_LEVEL_HARD_CODE", C64197v.m75537f(-1, 5, 15, 25, 35, 45, 55, 65, 75, 85, -2, -3), C64197v.m75537f("real", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "15", "25", "35", "45", "55", "65", "75", "85", "隐身", "隐身+75级"));
        f86184p2 = aVar173;
        C36665a aVar174 = new C36665a(5, "直播打赏升级信息显示时间", (C32227p) null, 4, (C8480h) null);
        aVar174.mo60270f(C32735h.C32737c.clicfg_live_notice_top_time_max_count_android);
        aVar174.mo60268b("FINDER_LIVE_LEVEL_UP_DURATION", C64197v.m75537f(5, 10, 15, 30, 60, 1800), C64197v.m75537f("5秒", "10秒", "15秒", "30秒", "60秒", "半小时"));
        f86192r2 = aVar174;
        C36665a aVar175 = new C36665a(-1, "模拟粉丝团公告开关", (C32227p) null, 4, (C8480h) null);
        aVar175.mo60268b("FINDER_LIVE_FANS_CLUB_ANNOUNCEMENT_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f86208v2 = aVar175;
        C36665a aVar176 = new C36665a(0, "扫一扫触发直播暂停的方式", (C32227p) null, 4, (C8480h) null);
        aVar176.mo60270f(C32735h.C32737c.clicfg_finder_live_scan_pause_way);
        aVar176.mo60268b("FINDER_LIVE_SCAN_TO_PAUSE_WAY", C64197v.m75537f(0, 1), C64197v.m75537f("停在首帧", "暂停直播"));
        f86216x2 = aVar176;
        C36665a aVar177 = new C36665a(-1, "直播点赞x个后冒头像", (C32227p) null, 4, (C8480h) null);
        aVar177.mo60270f(C32735h.C32737c.clicfg_live_like_count_to_header);
        aVar177.mo60268b("FINDER_LIVE_LIKE_TO_HEADER", C64197v.m75537f(3, 6, 9, 12, 15), C64197v.m75537f("3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "9", "12", "15"));
        f86220y2 = aVar177;
        C36665a aVar178 = new C36665a(0, "直播是否允许半屏强制暗夜模式", (C32227p) null, 4, (C8480h) null);
        aVar178.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_panel_force_dark);
        aVar178.mo60268b("FINDER_LIVE_ENABLE_PANEL_FORCE_DARK", C64197v.m75537f(0, 1), C64197v.m75537f("是", "否"));
        f86035A2 = aVar178;
        C36665a aVar179 = new C36665a(0, "pad是否允许pad开播", (C32227p) null, 4, (C8480h) null);
        aVar179.mo60270f(C32735h.C32737c.clicfg_finder_live_enable_pad_launch);
        aVar179.mo60268b("FINDER_LIVE_ENABLE_PAD_LAUNCHER", C64197v.m75537f(0, 1), C64197v.m75537f("否", "是"));
        f86039B2 = aVar179;
        new C36316a(false, "直播礼物背包购买每次都展示协议", "FINDER_LIVE_GIFT_PKG_SHOW_PROTOCOL_ALWAYS");
        C36665a aVar180 = new C36665a(0, "强制成包厢直播间", (C32227p) null, 4, (C8480h) null);
        aVar180.mo60268b("LOCAL_LIVE_BOX_ALL_OPEN_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        aVar180.mo60273m("包厢本地配置");
        f86063H2 = aVar180;
        C36665a aVar181 = new C36665a(0, "大礼物全站通知样式", (C32227p) null, 4, (C8480h) null);
        aVar181.mo60270f(C32735h.C32737c.clicfg_live_gift_all_notify_way);
        aVar181.mo60268b("FINDER_LIVE_GIFT_ALL_NOTIFY_WAY", C64197v.m75537f(0, 1), C64197v.m75537f("礼物通知条", "banner"));
        f86067I2 = aVar181;
        C36665a aVar182 = new C36665a(-1, "点击直播礼物入口弹条款弹窗", (C32227p) null, 4, (C8480h) null);
        aVar182.mo60268b("FINDER_LIVE_GIFT_AGREEMENT", C64197v.m75537f(1, 2), C64197v.m75537f("礼物背包条款弹窗", "人气宝礼物条款弹窗"));
        f86075K2 = aVar182;
    }

    /* renamed from: a */
    public final boolean mo58620a() {
        return f86101T0.mo60266n().intValue() == 1;
    }

    /* renamed from: b */
    public final int mo58621b() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_shopping_height_percent, 75);
    }

    /* renamed from: c */
    public final int mo58622c() {
        int intValue = f86222z0.mo60266n().intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3705bx) : MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3740cu) : MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3727cg) : MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
    }

    /* renamed from: d */
    public final void mo58623d(int i) {
        Log.m105924i("Finder.FinderLiveConfig", "set LIVE_LICENSE value:" + i);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LIVE_KNOW_GAME_LICENSE_UPDATE_INT_SYNC, Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo58624e(int i) {
        Log.m105924i("Finder.FinderLiveConfig", "set LIVE_LICENSE value:" + i);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LIVE_KNOW_LICENSE_UPDATE_INT_SYNC, Integer.valueOf(i));
    }
}
