package rs1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import kr0.C76630x0;
import os1.C11739f;
import rx3.C13601g;
import rx3.C36568h;
import te3.C48896br0;
import te3.C64858yi1;

@C113200q(initialMode = 2)
/* renamed from: rs1.r8 */
public class C13421r8 extends UIComponent {

    /* renamed from: d */
    public C64858yi1 f37997d;

    /* renamed from: e */
    public final C13601g f37998e = C36568h.m40985a(new C13422a(this));

    /* renamed from: f */
    public C11739f f37999f;

    /* renamed from: rs1.r8$a */
    public static final class C13422a extends C87413o implements C32224a<C55718s0> {

        /* renamed from: d */
        public final /* synthetic */ C13421r8 f38000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13422a(C13421r8 r8Var) {
            super(0);
            this.f38000d = r8Var;
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5(this.f38000d.mo9201c3());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13421r8(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f37999f = (C11739f) a;
    }

    /* renamed from: c3 */
    public String mo9201c3() {
        return "FinderEntrance";
    }

    /* renamed from: d3 */
    public boolean mo9202d3() {
        boolean Y5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77253Y5();
        Log.m105924i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowEntranceRedDot=" + Y5);
        return !Y5;
    }

    /* renamed from: e3 */
    public void mo9203e3() {
        int p = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77276p();
        Log.m105924i("Finder.RedDotUIJumpUIC", "[markHardRefresh] aliveType=" + p);
        this.f37999f.mo11600c3(p).f34376i = C11739f.C11742c.HardRefresh;
    }

    public void onCreateBefore(Bundle bundle) {
        String str;
        C64858yi1 yi12;
        C48896br0 br02;
        String str2;
        Class cls = C58684b.class;
        super.onCreate(bundle);
        C55718s0 s0Var = (C55718s0) this.f37998e.getValue();
        String str3 = null;
        this.f37997d = s0Var != null ? s0Var.f158585F : null;
        StringBuilder sb = new StringBuilder();
        sb.append("enterCtrlInfoExt=");
        boolean z = true;
        sb.append(this.f37997d != null);
        sb.append(" enter_action=");
        C64858yi1 yi13 = this.f37997d;
        sb.append(yi13 != null ? Integer.valueOf(yi13.f186559t) : null);
        sb.append(" jump_config=");
        C64858yi1 yi14 = this.f37997d;
        C48896br0 br03 = yi14 != null ? yi14.f186564y : null;
        if (br03 == null) {
            str = "";
        } else {
            str = "miniapp_path=" + br03.f131275e + ", miniapp_scene=" + br03.f131277g + ", miniapp_username=" + br03.f131274d + "web_url=" + br03.f131276f;
        }
        sb.append(str);
        Log.m105924i("Finder.RedDotUIJumpUIC", sb.toString());
        if (!mo9202d3() && (yi12 = this.f37997d) != null && (br02 = yi12.f186564y) != null) {
            if (yi12 != null && yi12.f186559t == 6) {
                String str4 = br02.f131276f;
                if (str4 != null) {
                    if (str4.length() <= 0) {
                        z = false;
                    }
                    if (!z) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        mo9203e3();
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                        C58684b bVar = (C58684b) c;
                        AppCompatActivity activity = getActivity();
                        C87412m.m108594g(activity, "context");
                        Log.m105924i("Finder.ActivityRouter", "[enterWebViewForRedDot] url=" + str4);
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", str4);
                        C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        return;
                    }
                    return;
                }
                return;
            }
            if ((yi12 != null && yi12.f186559t == 7) && (str2 = br02.f131274d) != null) {
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    str3 = str2;
                }
                if (str3 != null) {
                    mo9203e3();
                    C58684b bVar2 = (C58684b) C86312j.m106911c(cls);
                    AppCompatActivity activity2 = getActivity();
                    String str5 = br02.f131275e;
                    if (str5 == null) {
                        str5 = "";
                    }
                    int i = br02.f131277g;
                    bVar2.getClass();
                    C87412m.m108594g(activity2, "context");
                    Log.m105924i("Finder.ActivityRouter", "[enterWeAppForRedDot] appId=" + str3 + " enterPath=" + str5 + " scene=" + i);
                    C86299o oVar = new C86299o();
                    oVar.f250929a = str3;
                    oVar.f250934f = Util.nullAs(str5, "");
                    oVar.f250939k = i;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(activity2, oVar);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13421r8(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f37999f = (C11739f) a;
    }
}
