package er1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58411u;
import dp1.C7435f2;
import eb0.C31543z5;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import hp3.C87581a;
import ht1.C33078t2;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C98520u2;
import iq1.C9235i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je1.C33555i;
import je1.C46533r1;
import je1.C46547x1;
import jm2.C117361f;
import jp3.C9486a;
import jp3.C9487b;
import kd1.C9584f;
import lc3.C10485b;
import ls3.C10649f;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C89132b;
import org.json.JSONObject;
import ot1.C11767a;
import p166hy.C60226p0;
import p565ir.C60606n;
import p599lr.C61381b;
import p682rz.C36593i;
import p749xh.C66261f3;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import sx3.C26236u;
import t91.C64208c;
import te3.C48924by0;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C49838if0;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50429mo2;
import te3.C50851pn0;
import te3.C51860wo0;
import te3.C52192z0;
import te3.C64256b90;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64561mp1;
import te3.C64682rk1;
import tf0.C13887q1;
import up1.C37521f;
import up1.C65426w0;
import vc1.C37715b;
import vp1.C65834e;
import z04.C119027c;
import zc1.C66785b;

/* renamed from: er1.o4 */
public final class C58759o4 implements C60216z4 {

    /* renamed from: a */
    public static final C58759o4 f168229a = new C58759o4();

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, C13604l<Long, FinderObject>> f168230b = new ConcurrentHashMap<>();

    /* renamed from: er1.o4$c */
    public static final class C7850c implements C10649f.C10650a {

        /* renamed from: a */
        public final /* synthetic */ long f26429a;

        /* renamed from: b */
        public final /* synthetic */ String f26430b;

        /* renamed from: c */
        public final /* synthetic */ String f26431c;

        /* renamed from: d */
        public final /* synthetic */ String f26432d;

        public C7850c(long j, String str, String str2, String str3) {
            this.f26429a = j;
            this.f26430b = str;
            this.f26431c = str2;
            this.f26432d = str3;
        }

        /* renamed from: a */
        public void mo5052a() {
        }

        /* renamed from: b */
        public void mo5053b(FinderObject finderObject) {
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        }

        /* renamed from: c */
        public void mo5054c(Object obj) {
            C87412m.m108594g(obj, "bundle");
        }

        /* renamed from: d */
        public void mo5055d(C89132b.C89134c<C50008jm0> cVar) {
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            boolean z = true;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && finderObject != null) {
                C58759o4 o4Var = C58759o4.f168229a;
                StringBuilder sb = new StringBuilder();
                sb.append("jumpLiveUIAndDoAction liveId: ");
                C64273c21 c212 = finderObject.liveInfo;
                sb.append(c212 != null ? c212.f182392d : this.f26429a);
                sb.append(", username:");
                String str = finderObject.username;
                if (str == null && (str = this.f26430b) == null) {
                    str = "";
                }
                sb.append(str);
                Log.m105924i("Finder.FinderUtilApi", sb.toString());
                C65834e eVar = C65834e.f189316a;
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 0);
                C65834e.C65836b bVar = C65834e.C65836b.f189322b;
                eVar.mo89878l(a, C65834e.C65836b.f189330j);
                if (!Util.isNullOrNil(this.f26431c)) {
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[4];
                    String str2 = this.f26432d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    objArr[1] = this.f26431c;
                    objArr[2] = Long.valueOf(finderObject.f164794id);
                    objArr[3] = "";
                    nVar.mo160131h(21140, objArr);
                    return;
                }
                return;
            }
            C58759o4 o4Var2 = C58759o4.f168229a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("jumpLiveUIAndDoAction failed. ");
            sb4.append(cVar.f256793a);
            sb4.append(", ");
            sb4.append(cVar.f256794b);
            sb4.append(", ");
            if (finderObject != null) {
                z = false;
            }
            sb4.append(z);
            Log.m105928w("Finder.FinderUtilApi", sb4.toString());
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e1z);
            C87412m.m108593f(string, "getContext().resources.g…er_live_permission_title)");
            if (cVar.f256794b == -4036) {
                string = MMApplicationContext.getContext().getResources().getString(C0966R.string.ejb);
                C87412m.m108593f(string, "getContext().resources.g…te_feed_can_not_see_live)");
            }
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) string, 0).show();
        }

        /* renamed from: e */
        public void mo5056e(C89132b.C89134c<C50851pn0> cVar) {
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        }

        public void onFailed(int i) {
        }
    }

    /* renamed from: er1.o4$a */
    public static final class C31679a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f84613a;

        /* renamed from: b */
        public final /* synthetic */ String f84614b;

        /* renamed from: c */
        public final /* synthetic */ C60216z4.C8821a<Boolean> f84615c;

        /* renamed from: d */
        public final /* synthetic */ C60216z4.C8821a<Integer> f84616d;

        public C31679a(String str, String str2, C60216z4.C8821a<Boolean> aVar, C60216z4.C8821a<Integer> aVar2) {
            this.f84613a = str;
            this.f84614b = str2;
            this.f84615c = aVar;
            this.f84616d = aVar2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C49098d51 d512 = ((C49838if0) cVar.f256796d).f135259d;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && d512 != null) {
                ((C33078t2) C86312j.m106911c(C33078t2.class)).mo58242Ex(this.f84613a, this.f84614b, d512);
                C60216z4.C8821a<Boolean> aVar = this.f84615c;
                if (aVar == null) {
                    return null;
                }
                aVar.mo6382a(Boolean.valueOf(d512.f132119e == 0));
                return C13598b0.f38549a;
            }
            C60216z4.C8821a<Integer> aVar2 = this.f84616d;
            if (aVar2 == null) {
                return null;
            }
            aVar2.mo6382a(Integer.valueOf(cVar.f256794b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.o4$e */
    public static final class C31680e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Void> f84617a;

        /* renamed from: b */
        public final /* synthetic */ C60216z4.C8821a<Integer> f84618b;

        public C31680e(C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2) {
            this.f84617a = aVar;
            this.f84618b = aVar2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C60216z4.C8821a<Void> aVar = this.f84617a;
                if (aVar == null) {
                    return null;
                }
                aVar.mo6382a(null);
                return C13598b0.f38549a;
            }
            C60216z4.C8821a<Integer> aVar2 = this.f84618b;
            if (aVar2 == null) {
                return null;
            }
            aVar2.mo6382a(Integer.valueOf(cVar.f256794b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.o4$b */
    public static final class C58760b implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Boolean> f168231a;

        public C58760b(C60216z4.C8821a<Boolean> aVar) {
            this.f168231a = aVar;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            C60216z4.C8821a<Boolean> aVar = this.f168231a;
            if (aVar != null) {
                aVar.mo6382a(Boolean.valueOf(i != 2));
            }
        }
    }

    /* renamed from: er1.o4$d */
    public static final class C58761d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ long f168232a;

        /* renamed from: b */
        public final /* synthetic */ String f168233b;

        /* renamed from: c */
        public final /* synthetic */ Intent f168234c;

        /* renamed from: d */
        public final /* synthetic */ String f168235d;

        /* renamed from: e */
        public final /* synthetic */ String f168236e;

        /* renamed from: f */
        public final /* synthetic */ C60216z4.C8821a<Void> f168237f;

        /* renamed from: g */
        public final /* synthetic */ C60216z4.C8821a<Integer> f168238g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f168239h;

        public C58761d(long j, String str, Intent intent, String str2, String str3, C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2, C8479f0<String> f0Var) {
            this.f168232a = j;
            this.f168233b = str;
            this.f168234c = intent;
            this.f168235d = str2;
            this.f168236e = str3;
            this.f168237f = aVar;
            this.f168238g = aVar2;
            this.f168239h = f0Var;
        }

        public Object call(Object obj) {
            String str;
            char c;
            char c2;
            C60216z4.C8821a<Void> aVar;
            C48924by0 by02;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && finderObject != null) {
                C58759o4 o4Var = C58759o4.f168229a;
                StringBuilder sb = new StringBuilder();
                sb.append("jumpLiveUI liveId: ");
                C64273c21 c212 = finderObject.liveInfo;
                sb.append(c212 != null ? c212.f182392d : this.f168232a);
                sb.append(", username:");
                String str2 = finderObject.username;
                if (str2 == null && (str2 = this.f168233b) == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.m105924i("Finder.FinderUtilApi", sb.toString());
                Intent intent = this.f168234c;
                if (intent == null) {
                    intent = new Intent();
                }
                Intent intent2 = intent;
                intent2.putExtra("key_extra_info", this.f168235d);
                C64273c21 c213 = finderObject.liveInfo;
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", c213 != null ? Integer.valueOf(c213.f182384X) : null);
                C64273c21 c214 = finderObject.liveInfo;
                if (!(c214 == null || (by02 = c214.f182402p0) == null)) {
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
                }
                Intent intent3 = this.f168234c;
                int i = intent3 != null && intent3.hasExtra("KEY_MINI_APP_AD_FLOW_INFO") ? -1 : 1;
                String str3 = this.f168235d;
                if (!(str3.length() > 0)) {
                    str3 = null;
                }
                if (str3 != null) {
                    String str4 = this.f168233b;
                    String str5 = finderObject.username;
                    if (str5 != null) {
                        str4 = str5;
                    } else if (str4 == null) {
                        str4 = "";
                    }
                    C64208c.f181951a.mo89032g(str3, str4);
                }
                if (Util.isEqual(C66785b.f191882e.mo90662O5(), finderObject.username)) {
                    Intent intent4 = this.f168234c;
                    if (intent4 != null && intent4.hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.f360523mm1), 0).show();
                        this.f168234c.removeExtra("KEY_MINI_APP_AD_FLOW_INFO");
                        str = "KEY_MINI_APP_AD_FLOW_INFO";
                        c2 = 1;
                    } else {
                        C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
                        Context context = MMApplicationContext.getContext();
                        long j = finderObject.f164794id;
                        C64273c21 c215 = finderObject.liveInfo;
                        Long valueOf = Long.valueOf(c215 != null ? c215.f182392d : this.f168232a);
                        String str6 = finderObject.objectNonceId;
                        c2 = 1;
                        str = "KEY_MINI_APP_AD_FLOW_INFO";
                        nVar.o90(intent2, context, j, valueOf, str6 == null ? "" : str6, "", this.f168236e, finderObject.sessionBuffer, "");
                    }
                    c = 0;
                } else {
                    str = "KEY_MINI_APP_AD_FLOW_INFO";
                    c2 = 1;
                    c = 0;
                    C64279c90 c902 = new C64279c90();
                    String str7 = this.f168236e;
                    C8479f0<String> f0Var = this.f168239h;
                    c902.f182444d = str7;
                    c902.f182445e = "";
                    c902.f182446f = false;
                    c902.f182447g = -1;
                    c902.f182448h = -1;
                    c902.f182449i = i;
                    C64347eq2 eq22 = new C64347eq2();
                    byte[] bytes = ((String) f0Var.f27484d).getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    eq22.f183017e = new C89349b(bytes, 0, bytes.length);
                    c902.f182451n = eq22;
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(context2, intent2, C26236u.m33719b(finderObject), 0, c902, (C10649f.C10650a) null);
                }
                if (!Util.isNullOrNil(this.f168235d)) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    Object[] objArr = new Object[4];
                    String str8 = this.f168236e;
                    if (str8 == null) {
                        str8 = "";
                    }
                    objArr[c] = str8;
                    objArr[c2] = this.f168235d;
                    objArr[2] = Long.valueOf(finderObject.f164794id);
                    objArr[3] = "";
                    nVar2.mo160131h(21140, objArr);
                }
                Intent intent5 = this.f168234c;
                if (!(intent5 != null && intent5.hasExtra(str) == c2) && (aVar = this.f168237f) != null) {
                    aVar.mo6382a(null);
                }
            } else {
                C60216z4.C8821a<Integer> aVar2 = this.f168238g;
                if (aVar2 != null) {
                    aVar2.mo6382a(Integer.valueOf(cVar.f256794b));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.o4$f */
    public static final class C58762f<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f168240a;

        /* renamed from: b */
        public final /* synthetic */ Object f168241b;

        /* renamed from: c */
        public final /* synthetic */ long f168242c;

        /* renamed from: d */
        public final /* synthetic */ C8479f0<FinderObject> f168243d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f168244e;

        public C58762f(C8477a0 a0Var, Object obj, long j, C8479f0<FinderObject> f0Var, C8477a0 a0Var2) {
            this.f168240a = a0Var;
            this.f168241b = obj;
            this.f168242c = j;
            this.f168243d = f0Var;
            this.f168244e = a0Var2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                int i2 = cVar.f256794b;
                if (i2 == -4011 || i2 == -4033 || i2 == -4036) {
                    this.f168240a.f27482d = true;
                }
            } else {
                T t = ((C50008jm0) cVar.f256796d).f136184e;
                if (t != null) {
                    C8479f0<FinderObject> f0Var = this.f168243d;
                    C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(t, 1), C65834e.C65836b.f189330j);
                    f0Var.f27484d = t;
                }
            }
            Object obj2 = this.f168241b;
            C8477a0 a0Var = this.f168244e;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notify();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C58759o4 o4Var = C58759o4.f168229a;
            Log.m105924i("Finder.FinderUtilApi", "tryGetFinderObject " + this.f168242c + ", finish");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m68333c(C58759o4 o4Var, String str, String str2, C60216z4.C8821a aVar, String str3, long j, C60216z4.C8821a aVar2, String str4, String str5, C49946j51 j512, long j2, Intent intent, Map map, int i, Object obj) {
        int i2 = i;
        o4Var.mo83782b(str, str2, aVar, str3, j, aVar2, str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? null : j512, (i2 & 512) != 0 ? 0 : j2, (i2 & 1024) != 0 ? null : intent, (i2 & 2048) != 0 ? null : map);
    }

    /* renamed from: B5 */
    public void mo83755B5(ImageView imageView, String str, int i) {
        C58784w3 w3Var = C58784w3.f168295a;
        C58739j4 j4Var = C58739j4.f168176a;
        if (imageView != null && str != null) {
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13300B5(imageView, str, i);
        }
    }

    /* renamed from: C5 */
    public String mo83756C5(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        C58784w3.f168295a.getClass();
        if (f4Var.mo108769t2() == 1) {
            String t = f4Var.mo108768t();
            C87412m.m108593f(t, "msg.talker");
            return t;
        } else if (C72996z1.m85820U5(f4Var.mo108768t())) {
            String t2 = f4Var.mo108768t();
            C87412m.m108593f(t2, "msg.talker");
            return t2;
        } else {
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            return s;
        }
    }

    /* renamed from: D5 */
    public FinderJumpInfo mo83757D5(String str) {
        if (str == null) {
            return null;
        }
        return C58784w3.f168295a.mo83963s1(str);
    }

    /* renamed from: E5 */
    public void mo83758E5(Context context, String str, int i, String str2) {
        C87412m.m108594g(context, "context");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("Finder.FinderUtilApi", "enterProfileForWxPay finderUserName empty");
            return;
        }
        Log.m105924i("Finder.FinderUtilApi", "enterProfileForWxPay finderUserName:" + str + ", enterCommentScene:" + i + ", extraInfo:" + str2);
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_extra_info", str2);
        if (i > 0) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(i, 2, 32, intent);
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
    }

    /* renamed from: F5 */
    public float mo83759F5() {
        float xe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58785xe(C32735h.C32737c.clicfg_long_video_max_wh_rate, 3.0f);
        float f = xe >= 1.0f ? 1.0f / xe : 0.33333334f;
        Log.m105924i("Finder.FinderUtilApi", "getLongVideoMinRatio " + f);
        return f;
    }

    /* renamed from: G5 */
    public boolean mo83760G5() {
        C32444a aVar = C32444a.f86121a;
        boolean z = C32444a.f86122a0.mo60266n().intValue() == 1;
        boolean z2 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderNearbyLiveSwitch", 1) == 1;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z3 = C32444a.f86112X.mo60266n().intValue() == 1;
        Log.m105924i("Finder.FinderUtilApi", "isEnableNearbyLiveFriends isValidUser:" + z2 + " hasFinder:" + sF + " isEnableNearbyLiveFriends:" + z3);
        return z || (z2 && sF && z3);
    }

    /* renamed from: H5 */
    public void mo83761H5(ImageView imageView, TextView textView, C64682rk1 rk12, int i) {
        C87412m.m108594g(imageView, "authIconView");
        C87412m.m108594g(textView, "nickNameView");
        C87412m.m108594g(rk12, "shareObject");
        C58784w3.f168295a.mo83870G1(imageView, textView, rk12, i);
    }

    /* renamed from: I5 */
    public void mo83762I5(Context context, String str, String str2, int i) {
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                Intent intent = new Intent();
                intent.putExtra("KEY_USERNAME", str);
                intent.putExtra("KEY_NICKNAME", str2);
                intent.putExtra("KEY_COMMENT_SCENE", i);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(14, 2, i, intent);
                ((C58684b) C86312j.m106911c(C58684b.class)).gy0(context, intent);
            }
        }
    }

    /* renamed from: J5 */
    public void mo83763J5(Context context, JSONObject jSONObject, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2) {
        String str;
        String str2;
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        C60216z4.C8821a<Integer> aVar3 = aVar2;
        Class cls = C60200t1.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(jSONObject2, "extInfo");
        String optString = jSONObject2.optString("feedId");
        String optString2 = jSONObject2.optString("nonceId");
        int optInt = jSONObject2.optInt("shareScene", 0);
        String optString3 = jSONObject2.optString("sessionId", "");
        String optString4 = jSONObject2.optString("reportExtraInfo", "");
        int optInt2 = jSONObject2.optInt("entryScene", 0);
        int optInt3 = jSONObject2.optInt("adJSAPIType", 0);
        String optString5 = jSONObject2.optString("userName", "");
        C9235i.f28975a = aVar;
        int b = C11767a.f34453a.mo11660b("entrance");
        if (b != 0) {
            if (aVar3 != null) {
                aVar3.mo6382a(-1003);
            }
            Log.m105924i("Finder.FinderUtilApi", "[openChannelsRewardedVideoAd] spamAction:" + b + ' ');
            return;
        }
        int r0 = C58784w3.f168295a.mo83959r0(optInt);
        if (r0 != -1) {
            optInt2 = r0;
        } else if (optInt2 == 0) {
            optInt2 = 15;
        }
        int i = C58739j4.f168176a.mo83685N(optString4) ? 4 : 2;
        if (optInt3 == 1) {
            C64208c.f181951a.mo89032g(optString4, optString5);
            Intent intent = new Intent();
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(optInt2, i, 104, intent);
            ((C60226p0) C86312j.m106911c(C60226p0.class)).mo84728zF(intent, context, optString5, optString2, optString, optString4);
            return;
        }
        C64561mp1 mp12 = new C64561mp1();
        mp12.f184367d = optString;
        mp12.f184368e = optString2;
        mp12.f184369f = jSONObject2.optString("finderUserName");
        mp12.f184370g = jSONObject2.optString("expReportLink");
        mp12.f184371h = jSONObject2.optString("clkReportLink");
        JSONObject optJSONObject = jSONObject2.optJSONObject("reportInfo");
        if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
            str = new JSONObject().toString();
        }
        mp12.f184372i = str;
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("clickPosMap");
        if (optJSONObject2 == null || (str2 = optJSONObject2.toString()) == null) {
            str2 = new JSONObject().toString();
        }
        mp12.f184373j = str2;
        mp12.f184374n = jSONObject2.optString("feedbackUrl");
        Log.m105924i("Finder.FinderUtilApi", "adFlowInfo feedId:" + optString + ", nonceId:" + mp12.f184368e + ", finderUserName:" + mp12.f184369f);
        Log.m105924i("Finder.FinderUtilApi", "adFlowInfo expReportLink:" + mp12.f184370g + ", clkReportLink:" + mp12.f184371h + ", reportInfo:" + mp12.f184372i);
        StringBuilder sb = new StringBuilder();
        sb.append("adFlowInfo clickPosMap:");
        sb.append(mp12.f184373j);
        sb.append(", feedbackUrl:");
        sb.append(mp12.f184374n);
        Log.m105924i("Finder.FinderUtilApi", sb.toString());
        C64208c.f181951a.mo89032g(optString4, mp12.f184369f);
        Intent intent2 = new Intent();
        intent2.putExtra("KEY_MINI_APP_AD_FLOW_INFO", mp12.toByteArray());
        intent2.putExtra("from_user", C75592q0.m90789s());
        intent2.putExtra("feed_encrypted_object_id", optString);
        intent2.putExtra("feed_object_nonceId", optString2);
        intent2.putExtra("key_need_related_list", true);
        intent2.putExtra("key_comment_scene", 104);
        intent2.putExtra("key_reuqest_scene", 23);
        intent2.putExtra("key_session_id", optString3);
        intent2.putExtra("key_extra_info", optString4);
        intent2.putExtra("is_from_ad", true);
        String e7 = ((C60200t1) C86312j.m106911c(cls)).mo76842e7(optInt2, i, 104, intent2);
        if (!Util.isNullOrNil("")) {
            C115669n.INSTANCE.mo160131h(21140, e7, "", optString, "");
        }
        intent2.putExtra("report_scene", optInt);
        intent2.putExtra("tab_type", 9);
        ((C58684b) C86312j.m106911c(C58684b.class)).Zx0(context2, intent2);
        C117361f.INSTANCE.mo182041q(540999685);
    }

    /* renamed from: K5 */
    public void mo83764K5(String str, String str2, boolean z, C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && str != null && str2 != null) {
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13351n5(str, str2, z ? 1 : 2, (C49712hj1) null, 1).mo9225i().mo123420E(new C31680e(aVar, aVar2));
        } else if (aVar2 != null) {
            aVar2.mo6382a(-1000);
        }
    }

    /* renamed from: L5 */
    public void mo83765L5(String str, String str2, C60216z4.C8821a<Boolean> aVar, C60216z4.C8821a<Integer> aVar2) {
        if (str != null && str2 != null) {
            Boolean zi = ((C33078t2) C86312j.m106911c(C33078t2.class)).mo58246zi(str, str2);
            if (zi == null) {
                new C33555i(str, str2, (C49712hj1) null).mo9225i().mo123420E(new C31679a(str, str2, aVar, aVar2));
            } else if (aVar != null) {
                aVar.mo6382a(zi);
            }
        } else if (aVar2 != null) {
            aVar2.mo6382a(-1000);
        }
    }

    /* renamed from: M5 */
    public String mo83766M5() {
        return C37521f.f99374d.mo61188n() ? ".ui.FinderHomeAffinityUI" : ".ui.FinderHomeUI";
    }

    /* renamed from: N5 */
    public boolean mo83767N5(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feedObject");
        return C58784w3.f168295a.mo83891O0(finderObject);
    }

    /* renamed from: O5 */
    public String mo83768O5(String str) {
        return C58784w3.f168295a.mo83905V(str);
    }

    /* renamed from: P5 */
    public boolean mo83769P5() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86126b0.mo60266n().intValue() == 1;
    }

    /* renamed from: Q5 */
    public void mo83770Q5(Context context, String str, long j, String str2, String str3, Map<String, Object> map, C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2) {
        Map<String, Object> map2 = map;
        C60216z4.C8821a<Void> aVar3 = aVar;
        C60216z4.C8821a<Integer> aVar4 = aVar2;
        if (str2 != null) {
            C8477a0 a0Var = new C8477a0();
            boolean z = false;
            if (map2 != null && map2.containsKey("is_from_ad")) {
                z = true;
            }
            if (z && C87412m.m108589b(map2.get("is_from_ad"), Boolean.TRUE)) {
                a0Var.f27482d = true;
            }
            if (mo83780a(j)) {
                if (a0Var.f27482d) {
                    C115669n.INSTANCE.mo175913w(1837, 1, 1);
                }
                new C46547x1(0, str3, 65, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2 == null ? "" : str2, (C49712hj1) null, 0, (C49946j51) null, false, 85952, (C8480h) null).mo9225i().mo123420E(new C58768p4(j, a0Var, str, "", aVar, aVar2));
            } else if (aVar3 != null) {
                aVar3.mo6382a(null);
            }
        } else if (aVar4 != null) {
            aVar4.mo6382a(-1000);
        }
    }

    /* renamed from: R5 */
    public boolean mo83771R5() {
        boolean z = false;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderOpenShareListFeedsIgnoreLimitedSwitch", 0) == 0) {
            z = true;
        }
        Log.m105924i("Finder.FinderUtilApi", "isEnableTeenModeCheckInShareScene:" + z);
        return z;
    }

    /* renamed from: S5 */
    public boolean mo83772S5() {
        return C37715b.f99914a.mo61298a();
    }

    /* renamed from: T5 */
    public Intent mo83773T5(Intent intent, String str, int i) {
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("KEY_PAGE_TYPE", str);
        intent.putExtra("KEY_PAGE_SUB_TYPE", i);
        return intent;
    }

    /* renamed from: U5 */
    public void mo83774U5(String str, long j, C60216z4.C8821a<Boolean> aVar, C60216z4.C8821a<Integer> aVar2) {
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n.C60607a.m70857a((C60606n) c, j, false, (C9487b) null, new C58760b(aVar), 0, (String) null, (C50429mo2) null, 118, (Object) null);
    }

    /* renamed from: V5 */
    public String mo83775V5() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168189f;
    }

    /* renamed from: W5 */
    public void mo83776W5(Context context, Intent intent, int i, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C58679a1.f167972a.mo83554a(context, intent, i, i2);
    }

    /* renamed from: X5 */
    public void mo83777X5(ViewGroup viewGroup, int i, int i2) {
        C87412m.m108594g(viewGroup, "mask");
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                z = true;
                break;
            }
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0 || childAt.getVisibility() == 4) {
                break;
            }
            i3++;
        }
        if (z) {
            viewGroup.setBackground(viewGroup.getContext().getDrawable(i));
        } else {
            viewGroup.setBackground(viewGroup.getContext().getDrawable(i2));
        }
    }

    /* renamed from: Y5 */
    public int mo83778Y5() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        return C37521f.f99455m3.mo60266n().intValue() != 1 ? fVar.mo61160N() : ((C36593i) C86312j.m106911c(C36593i.class)).f30();
    }

    /* renamed from: Z5 */
    public C13605o<Integer, Integer, Integer> mo83779Z5(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        return C58739j4.f168176a.mo83709g(context, i, i2);
    }

    /* renamed from: a */
    public final boolean mo83780a(long j) {
        ConcurrentHashMap<Long, C13604l<Long, FinderObject>> concurrentHashMap = f168230b;
        if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            return true;
        }
        C13604l lVar = concurrentHashMap.get(Long.valueOf(j));
        long longValue = lVar != null ? ((Number) lVar.f38555d).longValue() : 0;
        C32444a aVar = C32444a.f86121a;
        return System.currentTimeMillis() - longValue > ((long) (C32444a.f86123a1 * 1000));
    }

    /* renamed from: a6 */
    public Object mo83781a6(String str, String str2, C9487b<C9486a> bVar, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2) {
        Integer num;
        C87412m.m108594g(bVar, "lifeCycle");
        if (Util.isNullOrNil(str2)) {
            return C45690w4.f123497a.mo71189a(str, bVar, aVar, aVar2, false, 0);
        }
        C45690w4 w4Var = C45690w4.f123497a;
        if (str2 == null || Util.isNullOrNil(str2)) {
            if (aVar2 != null) {
                aVar2.mo6382a(-1000);
            }
            return null;
        }
        if (C87412m.m108589b(str2, C75592q0.m90789s()) || (num = C45690w4.f123499c.get(str2)) == null) {
            num = 0;
        }
        if (C31543z5.m39455e() - num.intValue() > C45690w4.f123500d) {
            C89059e i = new C46533r1("", 3, str2, 5).mo9225i();
            i.mo11397F(bVar);
            i.mo123420E(new C45689t4(str2, aVar, aVar2));
        }
        return C45690w4.f123498b.get(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83782b(java.lang.String r36, java.lang.String r37, ht1.C60216z4.C8821a<java.lang.Integer> r38, java.lang.String r39, long r40, ht1.C60216z4.C8821a<java.lang.Void> r42, java.lang.String r43, java.lang.String r44, te3.C49946j51 r45, long r46, android.content.Intent r48, java.util.Map<java.lang.String, java.lang.Object> r49) {
        /*
            r35 = this;
            r9 = r38
            r8 = r42
            r7 = r43
            r6 = r44
            r5 = r48
            r0 = r49
            java.lang.String r1 = "adInfoJson.getString(\"uxinfo\")"
            java.lang.String r2 = "uxinfo"
            java.lang.String r3 = "sns_ad"
            java.lang.String r4 = "key_extra_info"
            java.lang.String r10 = "Finder.FinderUtilApi"
            java.lang.String r11 = "contextId"
            gy3.C87412m.m108594g(r7, r11)
            java.lang.String r11 = "reportExtraInfo"
            gy3.C87412m.m108594g(r6, r11)
            if (r37 != 0) goto L_0x0036
            r11 = 0
            int r13 = (r46 > r11 ? 1 : (r46 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0036
            if (r9 == 0) goto L_0x0035
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.mo6382a(r0)
        L_0x0035:
            return
        L_0x0036:
            java.lang.String r11 = "is_from_ad"
            r15 = 1
            if (r0 == 0) goto L_0x0043
            boolean r12 = r0.containsKey(r11)
            if (r12 != r15) goto L_0x0043
            r12 = 1
            goto L_0x0044
        L_0x0043:
            r12 = 0
        L_0x0044:
            if (r12 == 0) goto L_0x0054
            java.lang.Object r11 = r0.get(r11)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x0054
            r11 = 1
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            if (r0 == 0) goto L_0x005e
            java.lang.String r13 = "key_finder_show_recommend"
            java.lang.Object r13 = r0.get(r13)
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            boolean r12 = r13 instanceof java.lang.Boolean
            if (r12 == 0) goto L_0x0066
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            if (r13 == 0) goto L_0x006c
            r13.booleanValue()
        L_0x006c:
            gy3.f0 r12 = new gy3.f0
            r12.<init>()
            java.lang.String r13 = ""
            r12.f27484d = r13
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            boolean r14 = r0 instanceof java.lang.String     // Catch:{ all -> 0x00b3 }
            if (r14 == 0) goto L_0x0086
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b3 }
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            if (r0 != 0) goto L_0x008a
            r0 = r13
        L_0x008a:
            r15.<init>(r0)     // Catch:{ all -> 0x00b3 }
            org.json.JSONObject r0 = r15.getJSONObject(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x00b3 }
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ all -> 0x00b3 }
            r12.f27484d = r0     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r0.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = "parse snsUxInfo, "
            r0.append(r14)     // Catch:{ all -> 0x00b3 }
            T r14 = r12.f27484d     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00b3 }
            r0.append(r14)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00bc
        L_0x00b3:
            r0 = move-exception
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r14 = "parse snsUxInfo failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r14, r15)
        L_0x00bc:
            T r0 = r12.f27484d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r0 = 0
            goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            if (r0 == 0) goto L_0x0102
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00f9 }
            r0.<init>(r6)     // Catch:{ all -> 0x00f9 }
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x00f9 }
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ all -> 0x00f9 }
            r12.f27484d = r0     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r0.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "parse snsUxInfo again, "
            r0.append(r1)     // Catch:{ all -> 0x00f9 }
            T r1 = r12.f27484d     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f9 }
            r0.append(r1)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "parse snsUxInfo failed again"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r1, r2)
        L_0x0102:
            if (r11 == 0) goto L_0x010f
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1837(0x72d, double:9.076E-321)
            r22 = 3
            r24 = 1
            r19.mo175913w(r20, r22, r24)
        L_0x010f:
            r10 = r35
            r2 = r40
            boolean r0 = r10.mo83780a(r2)
            if (r0 == 0) goto L_0x0169
            je1.x1 r0 = new je1.x1
            r17 = 65
            r18 = 2
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            if (r37 != 0) goto L_0x0132
            r28 = r13
            goto L_0x0134
        L_0x0132:
            r28 = r37
        L_0x0134:
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 85952(0x14fc0, float:1.20444E-40)
            r34 = 0
            java.lang.String r19 = ""
            r13 = r0
            r14 = r46
            r16 = r39
            r31 = r45
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            nr3.e r0 = r0.mo9225i()
            er1.o4$d r11 = new er1.o4$d
            r1 = r11
            r2 = r40
            r4 = r36
            r5 = r48
            r6 = r44
            r7 = r43
            r8 = r42
            r9 = r38
            r10 = r12
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10)
            r0.mo123420E(r11)
            goto L_0x02b4
        L_0x0169:
            if (r11 == 0) goto L_0x0176
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1837(0x72d, double:9.076E-321)
            r22 = 4
            r24 = 1
            r19.mo175913w(r20, r22, r24)
        L_0x0176:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, rx3.l<java.lang.Long, com.tencent.mm.protocal.protobuf.FinderObject>> r0 = f168230b
            java.lang.Long r1 = java.lang.Long.valueOf(r40)
            java.lang.Object r1 = r0.get(r1)
            rx3.l r1 = (rx3.C13604l) r1
            if (r1 == 0) goto L_0x0189
            B r1 = r1.f38556e
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r5 != 0) goto L_0x0193
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r10 = r9
            goto L_0x0194
        L_0x0193:
            r10 = r5
        L_0x0194:
            r10.putExtra(r4, r6)
            if (r1 == 0) goto L_0x01a4
            te3.c21 r4 = r1.liveInfo
            if (r4 == 0) goto L_0x01a4
            int r4 = r4.f182384X
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x01a5
        L_0x01a4:
            r4 = 0
        L_0x01a5:
            java.lang.String r6 = "KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE"
            r10.putExtra(r6, r4)
            if (r1 == 0) goto L_0x01bd
            te3.c21 r4 = r1.liveInfo
            if (r4 == 0) goto L_0x01bd
            te3.by0 r4 = r4.f182402p0
            if (r4 == 0) goto L_0x01bd
            byte[] r4 = r4.toByteArray()
            java.lang.String r6 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO"
            r10.putExtra(r6, r4)
        L_0x01bd:
            java.lang.String r4 = "KEY_MINI_APP_AD_FLOW_INFO"
            if (r5 == 0) goto L_0x01ca
            boolean r6 = r5.hasExtra(r4)
            r9 = 1
            if (r6 != r9) goto L_0x01ca
            r14 = 1
            goto L_0x01cb
        L_0x01ca:
            r14 = 0
        L_0x01cb:
            r9 = -1
            if (r14 == 0) goto L_0x01d0
            r6 = -1
            goto L_0x01d1
        L_0x01d0:
            r6 = 1
        L_0x01d1:
            if (r1 == 0) goto L_0x029c
            zc1.b r11 = zc1.C66785b.f191882e
            java.lang.String r11 = r11.mo90662O5()
            java.lang.String r14 = r1.username
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r14)
            if (r11 == 0) goto L_0x0243
            if (r5 == 0) goto L_0x01ec
            boolean r6 = r5.hasExtra(r4)
            r15 = 1
            if (r6 != r15) goto L_0x01ed
            r14 = 1
            goto L_0x01ee
        L_0x01ec:
            r15 = 1
        L_0x01ed:
            r14 = 0
        L_0x01ee:
            if (r14 == 0) goto L_0x0210
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826903(0x7f1118d7, float:1.9286704E38)
            java.lang.String r2 = r2.getString(r3)
            r6 = 0
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r6)
            r1.show()
            r5.removeExtra(r4)
            goto L_0x029c
        L_0x0210:
            r6 = 0
            java.lang.Class<ir.n> r9 = p565ir.C60606n.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ir.n r9 = (p565ir.C60606n) r9
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r6 = r1.f164794id
            te3.c21 r12 = r1.liveInfo
            if (r12 == 0) goto L_0x0225
            long r2 = r12.f182392d
        L_0x0225:
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = r1.objectNonceId
            if (r2 != 0) goto L_0x022e
            r2 = r13
        L_0x022e:
            java.lang.String r1 = r1.sessionBuffer
            java.lang.String r3 = ""
            java.lang.String r19 = ""
            r12 = r6
            r7 = 0
            r6 = 1
            r15 = r2
            r16 = r3
            r17 = r43
            r18 = r1
            r9.o90(r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r2 = 1
            goto L_0x029e
        L_0x0243:
            r2 = 1
            r7 = 0
            te3.c90 r3 = new te3.c90
            r3.<init>()
            r11 = r43
            r3.f182444d = r11
            r3.f182445e = r13
            r3.f182446f = r7
            r3.f182447g = r9
            r3.f182448h = r9
            r3.f182449i = r6
            te3.eq2 r6 = new te3.eq2
            r6.<init>()
            pe3.b r9 = new pe3.b
            T r11 = r12.f27484d
            java.lang.String r11 = (java.lang.String) r11
            java.nio.charset.Charset r12 = z04.C119027c.f356488a
            byte[] r11 = r11.getBytes(r12)
            java.lang.String r12 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r11, r12)
            int r12 = r11.length
            r9.<init>(r11, r7, r12)
            r6.f183017e = r9
            r3.f182451n = r6
            java.lang.Class<ls3.f> r6 = ls3.C10649f.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            r19 = r6
            ls3.f r19 = (ls3.C10649f) r19
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "getContext()"
            gy3.C87412m.m108593f(r6, r9)
            java.util.List r22 = sx3.C26236u.m33719b(r1)
            r23 = 0
            r25 = 0
            r20 = r6
            r21 = r10
            r24 = r3
            r19.mo10913cP(r20, r21, r22, r23, r24, r25)
            goto L_0x029e
        L_0x029c:
            r2 = 1
            r7 = 0
        L_0x029e:
            if (r5 == 0) goto L_0x02a8
            boolean r1 = r5.hasExtra(r4)
            if (r1 != r2) goto L_0x02a8
            r15 = 1
            goto L_0x02a9
        L_0x02a8:
            r15 = 0
        L_0x02a9:
            if (r15 != 0) goto L_0x02b1
            if (r8 == 0) goto L_0x02b1
            r1 = 0
            r8.mo6382a(r1)
        L_0x02b1:
            r0.clear()
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58759o4.mo83782b(java.lang.String, java.lang.String, ht1.z4$a, java.lang.String, long, ht1.z4$a, java.lang.String, java.lang.String, te3.j51, long, android.content.Intent, java.util.Map):void");
    }

    /* renamed from: b6 */
    public String mo83783b6() {
        return C37521f.f99374d.mo61188n() ? "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI" : "com.tencent.mm.plugin.finder.ui.FinderHomeUI";
    }

    /* renamed from: c6 */
    public float mo83784c6() {
        float xe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58785xe(C32735h.C32737c.clicfg_long_video_max_wh_rate, 3.0f);
        Log.m105924i("Finder.FinderUtilApi", "getLongVideoMaxRatio " + xe);
        return xe;
    }

    /* renamed from: d6 */
    public boolean mo83785d6() {
        boolean z = true;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderProfileCoverSettingShowEntrance", 1) != 1) {
            z = false;
        }
        Log.m105924i("Finder.FinderUtilApi", "isEnableSetProfileCover:" + z);
        return z;
    }

    /* renamed from: e6 */
    public C52192z0 mo83786e6(FinderObject finderObject) {
        if (finderObject == null) {
            return null;
        }
        return C58784w3.f168295a.mo83940j0(finderObject);
    }

    /* renamed from: f6 */
    public void mo83787f6(String str) {
        C45690w4 w4Var = C45690w4.f123497a;
        if (str != null && !Util.isNullOrNil(str)) {
            C45690w4.f123499c.put(str, 0);
        }
    }

    /* renamed from: g6 */
    public void mo83788g6(String str, int i, JSONObject jSONObject, C49712hj1 hj12) {
        C87412m.m108594g(str, "eid");
        C7435f2.f25626a.mo8577a(hj12, str, i, jSONObject);
    }

    public C89132b<C51860wo0> getMiaojianCgi(String str) {
        C87412m.m108594g(str, "md5");
        return ((C61381b) C86312j.m106911c(C61381b.class)).E80().getMiaojianCgi(str);
    }

    /* renamed from: h6 */
    public void mo83790h6(int i, String str, long j, String str2, String str3, String str4) {
        C87412m.m108594g(str, "feedExportId");
        C87412m.m108594g(str4, "reportExtraInfo");
        Intent intent = new Intent();
        int i2 = i;
        intent.putExtra("KEY_PARAMS_DO_ACTION", i);
        C10649f fVar = (C10649f) C86312j.m106911c(C10649f.class);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C64256b90 b902 = new C64256b90();
        b902.f182241d = str;
        b902.f182242e = "";
        b902.f182243f = j;
        C13598b0 b0Var = C13598b0.f38549a;
        C64279c90 c902 = new C64279c90();
        c902.f182444d = str3 == null ? "" : str3;
        c902.f182445e = "";
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = -1;
        fVar.Uf0(context, intent, b902, c902, new C7850c(j, str2, str4, str3));
    }

    /* renamed from: i6 */
    public void mo83791i6(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        Class cls = C60200t1.class;
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        String str7 = "";
        intent.putExtra("key_encrypted_topic_id", str == null ? str7 : str);
        intent.putExtra("key_activity_name", str2 == null ? str7 : str2);
        intent.putExtra("key_extra_report_info", str4 == null ? str7 : str4);
        intent.putExtra("key_enter_scene", i);
        C7808i iVar = C7808i.f26328b;
        iVar.getClass();
        HashMap<String, CALLBACK> hashMap = iVar.f26323a;
        if (str5 != null) {
            str7 = str5;
        }
        if (hashMap.containsKey(str7)) {
            intent.putExtra("async_callback_param", str5);
        }
        Log.m105924i("Finder.FinderUtilApi", "enterActivityProfileUI :" + str + " eventName:" + str2 + " entryScene:" + i);
        String str8 = C58411u.f167342a;
        if (36 == i) {
            C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), 3);
        } else {
            C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), 5);
        }
        if (36 == i) {
            if (!(str8 == null || str8.length() == 0)) {
                intent.putExtra("key_context_id", str8);
                intent.putExtra("CLIENT_KV_REPORTINFO", str6);
                intent.putExtra("key_activity_profile_src_type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                ((C58684b) C86312j.m106911c(C58684b.class)).vx0(context, intent, true);
            }
        }
        if (6 == i) {
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(6, 2, 59, intent);
        } else if (15 == i) {
            intent.putExtra("key_extra_info", str4);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(15, 2, 59, intent);
        } else {
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 4, 59, intent);
        }
        intent.putExtra("CLIENT_KV_REPORTINFO", str6);
        intent.putExtra("key_activity_profile_src_type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        ((C58684b) C86312j.m106911c(C58684b.class)).vx0(context, intent, true);
    }

    /* renamed from: j6 */
    public String mo83792j6(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "name");
        return C58784w3.f168295a.mo83978x1(str, str2);
    }

    /* renamed from: k6 */
    public void mo83793k6(Context context, String str, long j, String str2, String str3, Map<String, Object> map, C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2) {
        C60216z4.C8821a<Integer> aVar3 = aVar2;
        m68333c(this, str, str2, aVar3, str3, j, aVar, ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76802R1(4, 4, 105), (String) null, (C49946j51) null, 0, (Intent) null, map, 1920, (Object) null);
    }

    /* renamed from: l6 */
    public void mo83794l6(Context context, String str, String str2, boolean z, int i, String str3) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("Finder.FinderUtilApi", "enterProfileForWxPay exportId empty");
            return;
        }
        Log.m105924i("Finder.FinderUtilApi", "enterFeedForWxPay exportId:" + str + ", enterCommentScene:" + i + ", extraInfo:" + str3);
        Intent intent = new Intent();
        intent.putExtra("from_user", C75592q0.m90789s());
        intent.putExtra("feed_encrypted_object_id", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("feed_object_nonceId", str2);
        intent.putExtra("key_need_related_list", true);
        intent.putExtra("key_comment_scene", i);
        intent.putExtra("key_reuqest_scene", 22);
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("key_extra_info", str3);
        if (C11767a.f34453a.mo11660b("entrance") != 0) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(i, 2, 25, intent);
        ((C58684b) C86312j.m106911c(cls)).Zx0(context, intent);
    }

    /* renamed from: m6 */
    public Boolean mo83795m6(Context context, FinderJumpInfo finderJumpInfo, Integer num) {
        C87412m.m108594g(context, "context");
        return Boolean.valueOf(C58784w3.f168295a.mo83929f1(context, finderJumpInfo, num));
    }

    /* renamed from: n6 */
    public String mo83796n6(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        C58784w3.f168295a.getClass();
        if (f4Var.mo108769t2() == 1) {
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            return s;
        } else if (C72996z1.m85820U5(f4Var.mo108768t())) {
            String s2 = C75604z3.m90847s(f4Var.getContent());
            C87412m.m108593f(s2, "getGroupChatMsgTalker(msg.content)");
            return s2;
        } else {
            String t = f4Var.mo108768t();
            C87412m.m108593f(t, "msg.talker");
            return t;
        }
    }

    /* renamed from: s2 */
    public C98520u2 mo83797s2(Context context) {
        C87412m.m108594g(context, "context");
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13357s2(context);
    }

    /* renamed from: w4 */
    public C13604l<Boolean, Object> mo83798w4(long j, String str, int i) {
        String str2 = str;
        int i2 = i;
        Log.m105924i("Finder.FinderUtilApi", "tryGetFinderObject " + j + ", start");
        C8479f0 f0Var = new C8479f0();
        C8477a0 a0Var = new C8477a0();
        Object obj = new Object();
        C8477a0 a0Var2 = new C8477a0();
        C8477a0 a0Var3 = a0Var;
        new C46547x1(j, str2, i2, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, (C49712hj1) null, 0, (C49946j51) null, false, 122816, (C8480h) null).mo9225i().mo123064p(new C58762f(a0Var3, obj, j, f0Var, a0Var2));
        Object obj2 = obj;
        synchronized (obj2) {
            if (!a0Var2.f27482d) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFinderObject wait ");
                long j2 = j;
                sb.append(j2);
                Log.m105924i("Finder.FinderUtilApi", sb.toString());
                obj2.wait(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                Log.m105924i("Finder.FinderUtilApi", "requestFinderObject notify " + j2);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return new C13604l<>(Boolean.valueOf(a0Var3.f27482d), f0Var.f27484d);
    }
}
