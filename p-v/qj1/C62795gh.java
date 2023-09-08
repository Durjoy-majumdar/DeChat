package qj1;

import ak1.C54116w;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFloatContainer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d60.C58124b;
import di3.C86312j;
import fh1.C8070p;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o40.C61926c;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.gh */
public final class C62795gh extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public C77407n f178242A;

    /* renamed from: p */
    public final C58124b f178243p;

    /* renamed from: q */
    public final String f178244q = "Finder.FinderLiveVisitorLinkMicStatePlugin";

    /* renamed from: r */
    public final FinderLiveFloatContainer f178245r;

    /* renamed from: s */
    public final View f178246s;

    /* renamed from: t */
    public final View f178247t;

    /* renamed from: u */
    public final WeImageView f178248u;

    /* renamed from: v */
    public final TextView f178249v;

    /* renamed from: w */
    public final TextView f178250w;

    /* renamed from: x */
    public final View f178251x;

    /* renamed from: y */
    public final PAGView f178252y;

    /* renamed from: z */
    public final TextView f178253z;

    /* renamed from: qj1.gh$a */
    public static final class C62796a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62795gh f178254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62796a(C62795gh ghVar) {
            super(1);
            this.f178254d = ghVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            this.f178254d.mo87787Z0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.gh$b */
    public static final class C62797b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62795gh f178255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62797b(C62795gh ghVar) {
            super(0);
            this.f178255d = ghVar;
        }

        public Object invoke() {
            this.f178255d.f178252y.stop();
            C62795gh ghVar = this.f178255d;
            ghVar.f178245r.mo77918b(new C62859kh(ghVar));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62795gh(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178243p = bVar;
        FinderLiveFloatContainer finderLiveFloatContainer = (FinderLiveFloatContainer) viewGroup.findViewById(C0966R.C0970id.dq5);
        this.f178245r = finderLiveFloatContainer;
        this.f178246s = viewGroup.findViewById(C0966R.C0970id.dq7);
        this.f178247t = viewGroup.findViewById(C0966R.C0970id.dpz);
        this.f178248u = (WeImageView) viewGroup.findViewById(C0966R.C0970id.dq8);
        this.f178249v = (TextView) viewGroup.findViewById(C0966R.C0970id.dq9);
        this.f178250w = (TextView) viewGroup.findViewById(C0966R.C0970id.f358173dq2);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358172dq1);
        this.f178251x = findViewById;
        PAGView pAGView = (PAGView) viewGroup.findViewById(C0966R.C0970id.dq4);
        this.f178252y = pAGView;
        this.f178253z = (TextView) viewGroup.findViewById(C0966R.C0970id.f358174dq3);
        finderLiveFloatContainer.setOnClick(new C62796a(this));
        ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.f159734C;
        findViewById.setOnClickListener(this);
        pAGView.setComposition(PAGFile.Load(viewGroup.getContext().getAssets(), "finder_live_shopping_promoting.pag"));
        pAGView.setRepeatCount(-1);
    }

    /* renamed from: Z0 */
    public final void mo87787Z0() {
        if (((C54963d0) mo87696x0(C54963d0.class)).mo75913U3()) {
            if (this.f178242A == null) {
                C77407n nVar = new C77407n(this.f166287d.getContext(), 1, true);
                this.f178242A = nVar;
                nVar.f225775k1 = true;
            }
            C77407n nVar2 = this.f178242A;
            if (nVar2 != null) {
                nVar2.f225792t1 = false;
            }
            if (nVar2 != null) {
                nVar2.f225771i = new C62812hh(this);
            }
            if (nVar2 != null) {
                nVar2.f225782p = new C62826ih(this);
            }
            if (nVar2 != null) {
                nVar2.f225761d = new C62837jh(this);
            }
            if (nVar2 != null) {
                nVar2.mo107573q();
            }
        }
    }

    /* renamed from: a1 */
    public final void mo87788a1() {
        C61926c.m72668M(new C62797b(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return !((C54991o) mo87696x0(C54991o.class)).mo76004h4();
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        C8070p pVar = (C8070p) mo87685B0(C8070p.class);
        if (pVar != null) {
            pVar.mo9158J3(linkedHashMap);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358172dq1 && ((C54963d0) mo87696x0(C54963d0.class)).mo75914V3()) {
            mo87788a1();
            ((C54116w) C86312j.m106911c(C54116w.class)).f151919T0 = true;
            C58124b.C7172a.m7372a(this.f178243p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C54963d0.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 118) {
            if (ordinal == 156) {
                mo87787Z0();
            }
        } else if (((C54963d0) mo87696x0(cls)).mo75913U3() && !((C54963d0) mo87696x0(cls)).mo75902I3()) {
            mo87788a1();
            C58124b.C7172a.m7372a(this.f178243p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
        }
    }
}
