package qj1;

import android.view.ViewGroup;
import android.widget.TextView;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60200t1;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import te3.C49712hj1;

/* renamed from: qj1.s2 */
public final class C12657s2 extends C62660c {

    /* renamed from: p */
    public final C58124b f36248p;

    /* renamed from: q */
    public final String f36249q = "Finder.LiveAnchorGuidePlugin";

    /* renamed from: r */
    public final String f36250r = "finder_live_anchor_music_guide.pag";

    /* renamed from: s */
    public PAGView f36251s;

    /* renamed from: t */
    public TextView f36252t;

    /* renamed from: u */
    public final boolean f36253u = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: v */
    public boolean f36254v;

    /* renamed from: w */
    public boolean f36255w;

    /* renamed from: qj1.s2$a */
    public static final class C12658a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36256d;

        public C12658a(ViewGroup viewGroup) {
            this.f36256d = viewGroup;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f36256d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(this.f36256d.getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12657s2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36248p = bVar;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_MUSIC_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        this.f36254v = ((Boolean) f).booleanValue();
        boolean B = C62042e.f176370a.mo86991B(mo87684A0());
        this.f36255w = B;
        if (B) {
            viewGroup.post(new C12658a(viewGroup));
        }
    }

    /* renamed from: Z0 */
    public final void mo12242Z0() {
        Class cls = C54991o.class;
        C54655b b = FinderLiveService.f159376d.mo77626b();
        Boolean valueOf = b != null ? Boolean.valueOf(b.f172995G) : null;
        boolean g4 = ((C54991o) mo87696x0(cls)).mo76003g4();
        String str = this.f36249q;
        Log.m105924i(str, "enableVolumeGuide isPlayingBgMusic:" + valueOf + ", enableMusic:" + this.f36255w + ", liveStatus:" + ((C54991o) mo87696x0(cls)).f154295b1 + ", checkVisible haveShowGuide:" + this.f36254v + ", isPagEnable:" + this.f36253u + ", isMicLinking:" + g4);
        if (!this.f36254v && this.f36255w && C87412m.m108589b(valueOf, Boolean.TRUE) && ((C54991o) mo87696x0(cls)).mo75999e4() && !g4) {
            if (!this.f36254v && this.f36253u) {
                Log.m105924i(this.f36249q, "showGuideView");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_MUSIC_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
                this.f36254v = true;
                C58739j4.f168176a.mo83714i0("FinderLiveAnchorGuidePlugin");
                if (this.f36251s == null) {
                    PAGView pAGView = (PAGView) this.f166287d.findViewById(C0966R.C0970id.h6f);
                    this.f36251s = pAGView;
                    if (pAGView != null) {
                        pAGView.setComposition(PAGFile.Load(this.f166287d.getContext().getAssets(), this.f36250r));
                    }
                    PAGView pAGView2 = this.f36251s;
                    if (pAGView2 != null) {
                        pAGView2.setRepeatCount(0);
                    }
                }
                if (this.f36252t == null) {
                    this.f36252t = (TextView) this.f166287d.findViewById(C0966R.C0970id.h6g);
                }
                PAGView pAGView3 = this.f36251s;
                if (pAGView3 != null) {
                    pAGView3.play();
                }
                PAGView pAGView4 = this.f36251s;
                if (pAGView4 != null) {
                    pAGView4.setVisibility(0);
                }
                TextView textView = this.f36252t;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            mo10792g(0);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
