package sb2;

import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.music.p080ui.LyricView;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import la2.C99364n;
import ma2.C61453s;
import o40.C61926c;
import p529fv.C59331r;
import rx3.C13598b0;
import te3.C64488kb1;

/* renamed from: sb2.p0 */
public final class C101580p0 extends UIComponent {

    /* renamed from: d */
    public LyricView f297382d;

    /* renamed from: e */
    public C64488kb1 f297383e;

    /* renamed from: f */
    public final C94223g.C94224a f297384f = new C101581a(this);

    /* renamed from: sb2.p0$a */
    public static final class C101581a implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ C101580p0 f297385a;

        /* renamed from: sb2.p0$a$a */
        public static final class C101582a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f297386d;

            /* renamed from: e */
            public final /* synthetic */ int f297387e;

            /* renamed from: f */
            public final /* synthetic */ C101580p0 f297388f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C101582a(int i, int i2, C101580p0 p0Var) {
                super(0);
                this.f297386d = i;
                this.f297387e = i2;
                this.f297388f = p0Var;
            }

            public Object invoke() {
                LyricView lyricView;
                int i = this.f297386d;
                if (i >= 0 && this.f297387e >= 0 && (lyricView = this.f297388f.f297382d) != null) {
                    lyricView.setCurrentTime((long) i);
                }
                return C13598b0.f38549a;
            }
        }

        public C101581a(C101580p0 p0Var) {
            this.f297385a = p0Var;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            C61926c.m72668M(new C101582a(i, i2, this.f297385a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101580p0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo141057c3() {
        LyricView lyricView;
        Class cls = C59331r.class;
        this.f297382d = (LyricView) getActivity().findViewById(C0966R.C0970id.gjw);
        int b = C76577a.m92151b(getActivity(), 22);
        int a = C76577a.m92150a(getActivity(), 4.0f);
        int a2 = C76577a.m92150a(getActivity(), 4.0f);
        LyricView lyricView2 = this.f297382d;
        boolean z = false;
        if (lyricView2 != null) {
            Paint.Align align = Paint.Align.LEFT;
            lyricView2.f272213n = true;
            lyricView2.f272212j = align;
            lyricView2.f272210h.setTextAlign(align);
            lyricView2.f272210h.setFakeBoldText(false);
            lyricView2.f272211i.setTextAlign(align);
            lyricView2.f272210h.setFakeBoldText(false);
            lyricView2.f272214o = a;
            lyricView2.f272215p = b;
            lyricView2.f272216q = a2;
            int i = a + b + a2;
            lyricView2.f272220u = i;
            lyricView2.f272221v = i;
            float f = (float) b;
            lyricView2.f272210h.setTextSize(f);
            lyricView2.f272211i.setTextSize(f);
        }
        LyricView lyricView3 = this.f297382d;
        if (lyricView3 != null) {
            lyricView3.setMode(1);
        }
        LyricView lyricView4 = this.f297382d;
        C64488kb1 kb12 = null;
        ViewGroup.LayoutParams layoutParams = lyricView4 != null ? lyricView4.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) getActivity().getResources().getDisplayMetrics().heightPixels) * 0.37f);
        C64488kb1 kb13 = this.f297383e;
        if (kb13 != null) {
            String str = kb13.f183910j;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                kb12 = kb13;
            }
            if (kb12 != null) {
                C61453s f2 = C61453s.m72164f(kb12.f183910j, getActivity().getString(C0966R.string.h3z), "", ((C59331r) C86312j.m106911c(cls)).mo84030xB(kb12.f183908h, kb12.f183906f), kb12.f183905e, false, false);
                if (f2.mo86427b() > 1) {
                    LyricView lyricView5 = this.f297382d;
                    if (lyricView5 != null) {
                        lyricView5.setLyricObj(f2);
                    }
                    if (!((C59331r) C86312j.m106911c(cls)).mo84030xB(kb12.f183908h, kb12.f183906f) && (lyricView = this.f297382d) != null) {
                        lyricView.setCurrentTime(1);
                    }
                }
            }
        }
    }

    public void onPause() {
        C99364n.m129616h().mo138828g(this.f297384f);
    }

    public void onResume() {
        C99364n.m129616h().mo138823b(this.f297384f);
    }
}
