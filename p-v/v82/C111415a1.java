package v82;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.lifecycle.C54219z;
import bs3.C104161b;
import c92.C104327a;
import c92.C104328f;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105617d2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105794d1;
import com.tencent.p014mm.plugin.multitalk.model.C105798e1;
import com.tencent.p014mm.plugin.multitalk.model.C105844v0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105854y;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import nw3.C109770a;
import nw3.C109779e;
import nw3.C109782f;
import ow3.C110090n;
import x82.C112092f;
import x82.C112101k;
import zr3.C112675e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: v82.a1 */
public final class C111415a1 {

    /* renamed from: e */
    public static final C111416a f333534e = new C111416a((C8480h) null);

    /* renamed from: a */
    public MultiTalkMainUI f333535a;

    /* renamed from: b */
    public C112101k f333536b;

    /* renamed from: c */
    public C112092f f333537c;

    /* renamed from: d */
    public int f333538d = -1;

    /* renamed from: v82.a1$a */
    public static final class C111416a {
        public C111416a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo163079a(Context context) {
            C87412m.m108594g(context, "context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            if (rotation == 0) {
                return 0;
            }
            if (rotation == 1) {
                return 90;
            }
            if (rotation != 2) {
                return rotation != 3 ? 0 : 270;
            }
            return 180;
        }

        /* renamed from: b */
        public final void mo163080b(String str, String str2) {
            String str3 = str;
            C87412m.m108594g(str3, "fileMd5");
            boolean v = C105851w0.zx0().mo150680v();
            Log.m105925i("MicroMsg.MultiTalkScreenProjectUILogic", "getMultiTalkSDKMode sdk mode:%s", Boolean.valueOf(v));
            if (v) {
                C105724z zVar = C105724z.INSTANCE;
                zVar.getClass();
                zVar.mo150614x(new C105617d2(zVar, str3));
            } else {
                ((C109779e) C105851w0.xx0().f314798d).getClass();
                if (!C109770a.m149092a().mo161080L()) {
                    C104161b.m138997f("TalkRoomSdkApi", "DoScreenSharingSecurityCheck isWorking is false");
                } else {
                    C104161b.m138993b("TalkRoomSdkApi", "DoScreenSharingSecurityCheck fileMd5: ", str3, " fileId: ", str2);
                    C109782f a = C109770a.m149092a();
                    if (TextUtils.isEmpty(a.f328593p)) {
                        C104161b.m138997f("TalkRoomService", "DoScreenSharingSecurityCheck mGroupId is null");
                    } else {
                        C104161b.m138993b("TalkRoomService", "DoScreenSharingSecurityCheck ret: ", Boolean.valueOf(C112675e.m154053e().mo164407c(new C110090n(a.f328593p, a.f328597s, a.f328598t, 103, a.f328592o, 0, str, str2))));
                    }
                }
            }
            MultiTalkManager zx02 = C105851w0.zx0();
            if (zx02.f314475Q0 == null) {
                zx02.f314475Q0 = new C54219z();
            }
            C105844v0 v0Var = new C105844v0();
            zx02.f314513y0 = v0Var;
            v0Var.f314797c = System.currentTimeMillis();
            zx02.f314513y0.f314795a = str3;
            C119179t tVar = C119157j.f356862d;
            C105854y yVar = new C105854y(zx02);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(yVar, 3000, "delayChecking");
            zx02.f314475Q0.postValue(zx02.f314513y0);
        }

        /* renamed from: c */
        public final int mo163081c(Context context) {
            C87412m.m108594g(context, "context");
            int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
            int dimensionPixelSize = identifier > 0 ? Resources.getSystem().getDimensionPixelSize(identifier) : 0;
            int e = C75044y4.m89993e(context);
            return (e == 0 || e >= dimensionPixelSize) ? dimensionPixelSize : e;
        }

        /* renamed from: d */
        public final void mo163082d(Activity activity, boolean z) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
                activity.getWindow().clearFlags(134217728);
                return;
            }
            activity.getWindow().clearFlags(1024);
            activity.getWindow().addFlags(134217728);
        }
    }

    public C111415a1(MultiTalkMainUI multiTalkMainUI) {
        C87412m.m108594g(multiTalkMainUI, "mainUI");
        this.f333535a = multiTalkMainUI;
    }

    /* renamed from: a */
    public final void mo163074a() {
        if (this.f333535a.mo150869H7() != null && this.f333535a.mo150869H7().findViewById(C0966R.C0970id.iws) != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C111416a aVar = f333534e;
            int a = aVar.mo163079a(this.f333535a);
            this.f333538d = a;
            if (a == 0 || a == 180) {
                aVar.mo163082d(this.f333535a, true);
                layoutParams.bottomMargin = aVar.mo163081c(this.f333535a);
            } else if (a == 270) {
                aVar.mo163082d(this.f333535a, false);
                layoutParams.leftMargin = aVar.mo163081c(this.f333535a);
            } else if (a == 90) {
                aVar.mo163082d(this.f333535a, false);
                layoutParams.rightMargin = aVar.mo163081c(this.f333535a);
            }
            this.f333535a.mo150869H7().findViewById(C0966R.C0970id.iws).setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo163075b() {
        ViewGroup H7 = this.f333535a.mo150869H7();
        if (H7 != null) {
            H7.removeView(this.f333536b);
        }
        ViewGroup H72 = this.f333535a.mo150869H7();
        if (H72 != null) {
            H72.removeView(this.f333537c);
        }
        C112101k kVar = this.f333536b;
        if (kVar != null) {
            kVar.mo163806k();
        }
        C112092f fVar = this.f333537c;
        if (fVar != null) {
            fVar.mo163806k();
        }
        this.f333536b = null;
        this.f333537c = null;
        C105851w0.zx0().f314477R0 = false;
        C105851w0.zx0().f314500o = null;
        Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markExitProject");
        C115669n.INSTANCE.mo175913w(1538, 4, 1);
    }

    /* renamed from: c */
    public final void mo163076c(int i) {
        ViewGroup H7 = this.f333535a.mo150869H7();
        if (H7 != null) {
            if (i == 2) {
                Context context = H7.getContext();
                C87412m.m108593f(context, "it.context");
                C112101k kVar = new C112101k(context);
                this.f333536b = kVar;
                kVar.setVisibility(0);
                H7.addView(this.f333536b);
            } else {
                Context context2 = H7.getContext();
                C87412m.m108593f(context2, "it.context");
                C112092f fVar = new C112092f(context2);
                this.f333537c = fVar;
                fVar.setVisibility(0);
                H7.addView(this.f333537c);
            }
            mo163074a();
        }
    }

    /* renamed from: d */
    public final boolean mo163077d() {
        C112101k kVar = this.f333536b;
        if (kVar != null) {
            return kVar != null && kVar.getVisibility() == 0;
        }
        C112092f fVar = this.f333537c;
        if (fVar != null) {
            return fVar.isShown();
        }
        return false;
    }

    /* renamed from: e */
    public final void mo163078e() {
        if (this.f333535a.mo150869H7() != null) {
            C112101k kVar = this.f333536b;
            if (kVar != null) {
                kVar.mo163807o();
            }
            mo163074a();
            C105794d1 r = C105851w0.zx0().mo150677r();
            C111416a aVar = f333534e;
            int a = aVar.mo163079a(this.f333535a);
            ((C105798e1) r).getClass();
            C104327a.f308804a.mo146022a(62, a != 0 ? a != 90 ? a != 180 ? a != 270 ? a != 360 ? 0 : 5 : 4 : 3 : 2 : 1);
            if (aVar.mo163079a(this.f333535a) == 90 || aVar.mo163079a(this.f333535a) == 270) {
                if (this.f333536b != null) {
                    C104328f.f308805a.mo146025b(3, 1);
                    String str = C105851w0.zx0().f314506t.f320042d;
                }
                if (this.f333537c != null) {
                    String str2 = C105851w0.zx0().f314506t.f320042d;
                }
            }
        }
    }
}
