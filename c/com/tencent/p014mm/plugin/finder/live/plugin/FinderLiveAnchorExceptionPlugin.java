package com.tencent.p014mm.plugin.finder.live.plugin;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import c30.C104289g;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveRealNameVerifyJumpUI;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C86312j;
import er1.C58728f5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8968f2;
import il1.C8989g2;
import j20.C117292a;
import k20.C9556a;
import o40.C61926c;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C48779ay0;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin */
public final class FinderLiveAnchorExceptionPlugin extends C62660c {

    /* renamed from: p */
    public final C58124b f159482p;

    /* renamed from: q */
    public final String f159483q = "Finder.LiveAnchorExceptionPlugin";

    /* renamed from: r */
    public final int f159484r = 10000;

    /* renamed from: s */
    public C8968f2 f159485s;

    /* renamed from: t */
    public final IListener<?> f159486t = new FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$a */
    public static final class C3168a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorExceptionPlugin f15137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3168a(FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin) {
            super(1);
            this.f15137d = finderLiveAnchorExceptionPlugin;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "licenseUrl");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C54795n5 D0 = this.f15137d.mo14476D0();
            if (D0 != null) {
                Context context = this.f15137d.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                D0.mo75714R(context, intent, (Integer) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$b */
    public static final class C55950b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorExceptionPlugin f159487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55950b(FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin) {
            super(1);
            this.f159487d = finderLiveAnchorExceptionPlugin;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C58124b.C7172a.m7372a(this.f159487d.f159482p, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$c */
    public static final class C55951c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorExceptionPlugin f159488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55951c(FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin) {
            super(1);
            this.f159488d = finderLiveAnchorExceptionPlugin;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C58124b.C7172a.m7372a(this.f159488d.f159482p, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$d */
    public static final class C55952d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorExceptionPlugin f159489d;

        /* renamed from: e */
        public final /* synthetic */ String f159490e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55952d(FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin, String str) {
            super(1);
            this.f159489d = finderLiveAnchorExceptionPlugin;
            this.f159490e = str;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f159489d.f159486t.alive();
                Intent intent = new Intent();
                intent.setClass(this.f159489d.f166287d.getContext(), FinderLiveRealNameVerifyJumpUI.class);
                intent.putExtra("enterRealnameVerifyUI", true);
                Context context = this.f159489d.f166287d.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ((C54108o) C86312j.m106911c(C54108o.class)).Ox0(C54067f0.C54069c0.LIVE_ENTER_VERIFIED_PAGE, this.f159490e);
            } else {
                C58124b.C7172a.m7372a(this.f159489d.f159482p, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAnchorExceptionPlugin(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f159482p = bVar;
    }

    /* renamed from: Z0 */
    public final void mo77685Z0(String str) {
        if (this.f159485s == null) {
            C8968f2 f2Var = new C8968f2(this.f166287d, str, ((C54991o) mo87684A0().mo71262a(C54991o.class)).mo75969L3());
            this.f159485s = f2Var;
            f2Var.f28352e = new C3168a(this);
        }
    }

    /* renamed from: a1 */
    public final void mo77686a1(String str, C48779ay0 ay02, int i) {
        C87412m.m108594g(str, "anchorUserName");
        String str2 = this.f159483q;
        Log.m105924i(str2, "showAnchorForceQuit anchorUserName:" + str);
        mo77685Z0(str);
        C8968f2 f2Var = this.f159485s;
        if (f2Var != null) {
            f2Var.mo9779c(3, ay02, i, new C55950b(this));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo77687b1(String str, C48779ay0 ay02, int i) {
        C87412m.m108594g(str, "anchorUserName");
        String str2 = this.f159483q;
        Log.m105924i(str2, "showCreateLiveDynamicErrPage anchorUserName:" + str);
        mo77685Z0(str);
        C8968f2 f2Var = this.f159485s;
        if (f2Var != null) {
            f2Var.mo9779c(7, ay02, i, new C55951c(this));
        }
    }

    /* renamed from: c1 */
    public final void mo77688c1(String str, String str2, C48779ay0 ay02) {
        String str3 = this.f159483q;
        Log.m105924i(str3, "showFaceVerify:" + str);
        ((C54108o) C86312j.m106911c(C54108o.class)).Ox0(C54067f0.C54069c0.LIVE_VERIFIED_PAGE_EXPOSURE, str2);
        mo77685Z0("");
        C8968f2 f2Var = this.f159485s;
        if (f2Var != null) {
            C8968f2.m8755d(f2Var, 2, ay02, 0, new C55952d(this, str2), 4, (Object) null);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        String str;
        Class cls = C54108o.class;
        if (i == this.f159484r) {
            C8968f2 f2Var = this.f159485s;
            if (f2Var != null) {
                C61926c.m72668M(new C8989g2(f2Var));
            }
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (intent == null || (str = intent.getStringExtra("srcUsername")) == null) {
                str = "";
            }
            if (i2 == -1 && bundleExtra != null) {
                String string = bundleExtra.getString("go_next", "");
                String string2 = bundleExtra.getString("result_json");
                if (!Util.isNullOrNil(string2)) {
                    int i3 = new C104289g(string2).getInt("code");
                    if (C87412m.m108589b(string, "roomlive_verify") && i3 == 0) {
                        C58124b bVar = this.f159482p;
                        C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_STATUS_CREATE_LIVE;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar.statusChange(bVar2, bundle);
                        ((C54108o) C86312j.m106911c(cls)).Ox0(C54067f0.C54069c0.LIVE_PASS_VERIFIED_SUCC, str);
                        return;
                    }
                }
            }
            ((C54108o) C86312j.m106911c(cls)).Ox0(C54067f0.C54069c0.LIVE_PASS_VERIFIED_FAIL, str);
            C58124b.C7172a.m7372a(this.f159482p, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
            C58728f5.m68215a(C58728f5.f168144a, "faceVerify", i2, 0, String.valueOf(bundleExtra), mo87684A0(), (String) null, 32, (Object) null);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
