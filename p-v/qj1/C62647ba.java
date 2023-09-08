package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import kg3.C76577a;
import rx3.C90107a;
import te3.C49712hj1;
import te3.C51587ur2;
import te3.C51711vm1;
import xg1.C53325a;
import xg1.C53326d;
import xg1.C66255b;
import xg1.C66256c;

/* renamed from: qj1.ba */
public final class C62647ba extends C62660c {

    /* renamed from: p */
    public final boolean f177905p;

    /* renamed from: q */
    public final C32226l<C51711vm1, List<C51587ur2>> f177906q;

    /* renamed from: r */
    public C53325a f177907r;

    /* renamed from: s */
    public C51711vm1 f177908s;

    /* renamed from: t */
    public int f177909t;

    /* renamed from: qj1.ba$a */
    public static final class C62648a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62647ba f177910d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f177911e;

        /* renamed from: qj1.ba$a$a */
        public /* synthetic */ class C62649a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f177912a;

            static {
                int[] iArr = new int[C54951d.C54952a.values().length];
                iArr[4] = 1;
                iArr[3] = 2;
                f177912a = iArr;
            }
        }

        public C62648a(C62647ba baVar, ViewGroup viewGroup) {
            this.f177910d = baVar;
            this.f177911e = viewGroup;
        }

        public void onChanged(Object obj) {
            C54951d.C54952a aVar = (C54951d.C54952a) obj;
            Log.m105924i("FinderLiveLogoForViewPlugin", "onVideoPlayStateChange: " + aVar);
            int i = aVar == null ? -1 : C62649a.f177912a[aVar.ordinal()];
            if (i == 1) {
                C62647ba baVar = this.f177910d;
                baVar.mo10792g(baVar.f177909t);
            } else if (i == 2) {
                this.f177910d.f177909t = this.f177911e.getVisibility();
                this.f177910d.mo10792g(8);
            }
        }
    }

    /* renamed from: qj1.ba$b */
    public /* synthetic */ class C62650b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f177913a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[200] = 1;
            f177913a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62647ba(ViewGroup viewGroup, FinderLiveLogoGroupView finderLiveLogoGroupView, C58124b bVar, boolean z, C32226l<? super C51711vm1, ? extends List<? extends C51587ur2>> lVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(lVar, "choiceData");
        this.f177905p = z;
        this.f177906q = lVar;
        this.f177909t = viewGroup.getVisibility();
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f177907r = new C66256c(viewGroup, context, mo87684A0(), bVar, this);
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C53326d dVar = new C53326d(viewGroup, finderLiveLogoGroupView, (MMActivity) context2, this.f177907r);
        C53325a aVar = this.f177907r;
        if (aVar != null) {
            ((C66256c) aVar).onAttach(dVar);
        }
        ((C54951d) mo87696x0(C54951d.class)).f154007o.observe(this, new C62648a(this, viewGroup));
    }

    /* renamed from: K0 */
    public void mo87674K0(boolean z) {
        mo87690J0(z);
        Log.m105924i("FinderLiveLogoForViewPlugin", "#onClearScreenEndNotify clear=" + z);
        mo87677a1();
    }

    /* renamed from: M0 */
    public void mo87675M0(boolean z) {
        mo87691L0(z);
        Log.m105924i("FinderLiveLogoForViewPlugin", "#onClearScreenStartNotify clear=" + z);
        mo87677a1();
    }

    /* renamed from: Z0 */
    public final void mo87676Z0(int i) {
        if (mo82893g0()) {
            Class cls = C54991o.class;
            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 72);
            int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 104);
            if (!this.f177905p) {
                b = b2;
            }
            layoutParams2.topMargin = b;
            float f = ((((float) ((int) (((float) C85875k4.m106180f()) * 1.0f))) - (((float) C85875k4.m106196n(1.0f)) * (((float) ((C54991o) mo87696x0(cls)).f154335l1) / ((float) ((C54991o) mo87696x0(cls)).f154338m1)))) / ((float) 2)) + ((float) C76577a.m92151b(MMApplicationContext.getContext(), 12));
            int b3 = C76577a.m92151b(MMApplicationContext.getContext(), 12);
            if (this.f177905p) {
                layoutParams2.leftMargin = Math.max((int) f, b3);
            } else {
                layoutParams2.rightMargin = Math.max((int) f, b3);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = Math.max(C76577a.m92151b(MMApplicationContext.getContext(), 120), i) + C76577a.m92151b(MMApplicationContext.getContext(), 12);
            if (this.f177905p) {
                layoutParams4.leftMargin = C76577a.m92151b(MMApplicationContext.getContext(), 12);
            } else {
                layoutParams4.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), 12);
            }
            this.f166287d.setLayoutParams(layoutParams4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r0 == null) goto L_0x0055;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87677a1() {
        /*
            r4 = this;
            java.lang.String r0 = "FinderLiveLogoForViewPlugin"
            java.lang.String r1 = "#updateGiftInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            te3.vm1 r0 = r4.f177908s
            r1 = 0
            if (r0 == 0) goto L_0x0055
            fy3.l<te3.vm1, java.util.List<te3.ur2>> r2 = r4.f177906q
            java.lang.Object r0 = r2.invoke(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.ur2 r0 = (te3.C51587ur2) r0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.f143048j
            if (r0 == 0) goto L_0x0038
            com.tencent.mm.plugin.finder.live.view.b r0 = r4.mo14484z0()
            boolean r0 = r0.isScreenClear()
            if (r0 != 0) goto L_0x0038
            xg1.a r0 = r4.f177907r
            if (r0 == 0) goto L_0x0052
            xg1.c r0 = (xg1.C66256c) r0
            r0.mo90343e(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0053
        L_0x0038:
            xg1.a r0 = r4.f177907r
            if (r0 == 0) goto L_0x0052
            te3.vm1 r2 = r4.f177908s
            if (r2 == 0) goto L_0x0049
            fy3.l<te3.vm1, java.util.List<te3.ur2>> r3 = r4.f177906q
            java.lang.Object r2 = r3.invoke(r2)
            java.util.List r2 = (java.util.List) r2
            goto L_0x004a
        L_0x0049:
            r2 = r1
        L_0x004a:
            xg1.c r0 = (xg1.C66256c) r0
            r0.mo90343e(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 != 0) goto L_0x0060
        L_0x0055:
            xg1.a r0 = r4.f177907r
            if (r0 == 0) goto L_0x0060
            xg1.c r0 = (xg1.C66256c) r0
            r0.mo90343e(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0060:
            java.lang.Class<cl1.d> r0 = cl1.C54951d.class
            androidx.lifecycle.i0 r0 = r4.mo87696x0(r0)
            cl1.d r0 = (cl1.C54951d) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<cl1.d$a> r0 = r0.f154007o
            java.lang.Object r0 = r0.getValue()
            cl1.d$a r0 = (cl1.C54951d.C54952a) r0
            cl1.d$a r1 = cl1.C54951d.C54952a.LIVING_VIDEO_PLAYING
            r2 = 0
            if (r0 != r1) goto L_0x0077
            r0 = 1
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 == 0) goto L_0x0082
            r4.f177909t = r2
            r0 = 8
            r4.mo10792g(r0)
            goto L_0x0085
        L_0x0082:
            r4.mo10792g(r2)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62647ba.mo87677a1():void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        Log.m105924i("FinderLiveLogoForViewPlugin", "#mount");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    public final void onResume() {
        C53325a aVar = this.f177907r;
        if (aVar != null) {
            C66256c cVar = (C66256c) aVar;
            Log.m105924i("FinderLiveLogoPresenter", "#reloadData");
            cVar.mo90343e(cVar.f190318h);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        byte[] byteArray;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        if (C62650b.f177913a[bVar.ordinal()] == 1 && bundle != null && (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_RECEIVE_LOGO_RESP_KEY")) != null) {
            try {
                C51711vm1 vm12 = new C51711vm1();
                vm12.parseFrom(byteArray);
                this.f177908s = vm12;
                mo87677a1();
            } catch (Exception e) {
                Log.m105924i("FinderLiveLogoForViewPlugin", "#statusChange-parse err " + C90107a.m112736b(e));
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C66255b bVar;
        super.mo3211w0();
        Log.m105924i("FinderLiveLogoForViewPlugin", "#unMount");
        C53325a aVar = this.f177907r;
        if (aVar != null && (bVar = ((C66256c) aVar).f190317g) != null) {
            bVar.mo73941C();
        }
    }
}
