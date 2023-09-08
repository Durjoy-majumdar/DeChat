package il1;

import android.app.Activity;
import android.view.ViewGroup;
import cl1.C0696x;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dj1.C7341l;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import qj1.C62660c;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C50326ly0;
import zc1.C66785b;

/* renamed from: il1.u */
public final class C9118u {

    /* renamed from: a */
    public final Activity f28731a;

    /* renamed from: b */
    public final C8953d3 f28732b;

    /* renamed from: c */
    public final C9002h2 f28733c;

    /* renamed from: il1.u$a */
    public static final class C9119a extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28734d;

        /* renamed from: e */
        public final /* synthetic */ C9118u f28735e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9119a(C9002h2 h2Var, C9118u uVar) {
            super(2);
            this.f28734d = h2Var;
            this.f28735e = uVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C13598b0 b0Var;
            C0696x xVar;
            C50326ly0 ly02;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            Class cls = C0696x.class;
            Class cls2 = C55001u.class;
            C87412m.m108594g(str, "fansClubName");
            if (booleanValue) {
                this.f28734d.mo9809b();
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C0696x xVar2 = (C0696x) finderLiveService.mo77630e(cls);
                if (xVar2 == null || (ly02 = xVar2.f1644g) == null) {
                    b0Var = null;
                } else {
                    ly02.f137706d = str;
                    ly02.f137707e = true;
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null && (xVar = (C0696x) finderLiveService.mo77630e(cls)) != null) {
                    C50326ly0 ly03 = new C50326ly0();
                    ly03.f137706d = str;
                    ly03.f137707e = true;
                    ly03.f137710h = true;
                    xVar.mo659c3(ly03);
                }
                C45795b bVar = FinderLiveService.f159348A;
                if (bVar != null) {
                    new C7341l(((C55001u) bVar.mo71262a(cls2)).f154420q.f182392d, ((C55001u) bVar.mo71262a(cls2)).f154416j, ((C55001u) bVar.mo71262a(cls2)).f154423t, C66785b.f191882e.mo90662O5(), 1, ((C55001u) bVar.mo71262a(cls2)).f154417n, C62042e.f176370a.mo87031P(bVar), 1).mo9225i();
                }
                this.f28735e.f28732b.mo9759e((C12925w) null, true);
            }
            return C13598b0.f38549a;
        }
    }

    public C9118u(Activity activity, ViewGroup viewGroup, C45795b bVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "container");
        this.f28731a = activity;
        C8953d3 d3Var = new C8953d3(activity);
        C62660c basePlugin = d3Var.getBasePlugin();
        if (basePlugin != null) {
            d3Var.mo9935a(basePlugin);
        }
        this.f28732b = d3Var;
        C9002h2 h2Var = new C9002h2(activity, viewGroup, bVar);
        h2Var.setCreateResultCallback(new C9119a(h2Var, this));
        this.f28733c = h2Var;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9934a(int r6, boolean r7) {
        /*
            r5 = this;
            il1.d3 r0 = r5.f28732b
            il1.v3 r1 = r0.f28274A
            if (r1 == 0) goto L_0x000d
            if (r7 != 0) goto L_0x000d
            android.widget.EditText r1 = r1.f28803p
            r1.clearFocus()
        L_0x000d:
            il1.y3 r0 = r0.f28275B
            r1 = 0
            if (r0 == 0) goto L_0x0045
            il1.v3 r2 = r0.f28874o
            if (r2 == 0) goto L_0x001d
            if (r7 != 0) goto L_0x001d
            android.widget.EditText r2 = r2.f28803p
            r2.clearFocus()
        L_0x001d:
            il1.l3 r0 = r0.f28875p
            if (r0 == 0) goto L_0x0045
            android.view.View r2 = r0.f28576p
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x002e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r6 <= 0) goto L_0x003a
            if (r7 != 0) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            if (r2 != 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            r2.bottomMargin = r6
            goto L_0x0040
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            r3 = 0
            r2.bottomMargin = r3
        L_0x0040:
            android.view.View r0 = r0.f28576p
            r0.setLayoutParams(r2)
        L_0x0045:
            il1.h2 r0 = r5.f28733c
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r2 = r0.f28444q
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165337(0x7f070099, float:1.7944888E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            if (r6 <= r3) goto L_0x0075
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelOffset(r4)
            int r6 = r6 - r3
            r2.bottomMargin = r6
            goto L_0x0077
        L_0x0075:
            r2.bottomMargin = r6
        L_0x0077:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r6 = r0.f28444q
            android.view.ViewParent r6 = r6.getParent()
            boolean r3 = r6 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0084
            r1 = r6
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0084:
            if (r1 == 0) goto L_0x008b
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r6 = r0.f28444q
            r1.updateViewLayout(r6, r2)
        L_0x008b:
            if (r7 != 0) goto L_0x0092
            android.widget.EditText r6 = r0.f28448u
            r6.clearFocus()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9118u.mo9934a(int, boolean):void");
    }
}
