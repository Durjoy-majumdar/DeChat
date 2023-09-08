package qj1;

import ak1.C54108o;
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

/* renamed from: qj1.h2 */
public final class C62799h2 extends C62660c implements View.OnClickListener {

    /* renamed from: p */
    public final C58124b f178258p;

    /* renamed from: q */
    public final String f178259q = "Finder.FinderLiveLinkMicStatePlugin";

    /* renamed from: r */
    public final FinderLiveFloatContainer f178260r;

    /* renamed from: s */
    public final View f178261s;

    /* renamed from: t */
    public final TextView f178262t;

    /* renamed from: u */
    public final View f178263u;

    /* renamed from: v */
    public final PAGView f178264v;

    /* renamed from: w */
    public final View f178265w;

    /* renamed from: x */
    public final WeImageView f178266x;

    /* renamed from: y */
    public C77407n f178267y;

    /* renamed from: z */
    public boolean f178268z;

    /* renamed from: qj1.h2$a */
    public static final class C62800a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62799h2 f178269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62800a(C62799h2 h2Var) {
            super(1);
            this.f178269d = h2Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            C62799h2 h2Var = this.f178269d;
            if (((C54963d0) h2Var.mo87696x0(C54963d0.class)).mo75913U3()) {
                if (h2Var.f178267y == null) {
                    C77407n nVar = new C77407n(h2Var.f166287d.getContext(), 1, true);
                    h2Var.f178267y = nVar;
                    nVar.f225775k1 = true;
                }
                C77407n nVar2 = h2Var.f178267y;
                if (nVar2 != null) {
                    nVar2.f225792t1 = false;
                }
                if (nVar2 != null) {
                    nVar2.f225771i = new C62814i2(h2Var);
                }
                if (nVar2 != null) {
                    nVar2.f225782p = new C62828j2(h2Var);
                }
                if (nVar2 != null) {
                    nVar2.f225761d = new C62839k2(h2Var);
                }
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.h2$b */
    public static final class C62801b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62799h2 f178270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62801b(C62799h2 h2Var) {
            super(0);
            this.f178270d = h2Var;
        }

        public Object invoke() {
            this.f178270d.f178264v.stop();
            C62799h2 h2Var = this.f178270d;
            h2Var.f178260r.mo77918b(new C62866l2(h2Var));
            this.f178270d.f178268z = false;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62799h2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178258p = bVar;
        FinderLiveFloatContainer finderLiveFloatContainer = (FinderLiveFloatContainer) viewGroup.findViewById(C0966R.C0970id.dq5);
        this.f178260r = finderLiveFloatContainer;
        this.f178261s = viewGroup.findViewById(C0966R.C0970id.dpz);
        this.f178262t = (TextView) viewGroup.findViewById(C0966R.C0970id.f358173dq2);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358172dq1);
        this.f178263u = findViewById;
        PAGView pAGView = (PAGView) viewGroup.findViewById(C0966R.C0970id.dq4);
        this.f178264v = pAGView;
        this.f178265w = viewGroup.findViewById(C0966R.C0970id.dq_);
        this.f178266x = (WeImageView) viewGroup.findViewById(C0966R.C0970id.dpx);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dpy);
        finderLiveFloatContainer.setOnClick(new C62800a(this));
        ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.f159734C;
        findViewById.setOnClickListener(this);
        pAGView.setComposition(PAGFile.Load(viewGroup.getContext().getAssets(), "finder_live_shopping_promoting.pag"));
        pAGView.setRepeatCount(-1);
    }

    /* renamed from: Z0 */
    public final void mo87790Z0() {
        C61926c.m72668M(new C62801b(this));
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
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358172dq1) {
            C58124b.C7172a.m7372a(this.f178258p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            C54108o.f151869h.f151476t = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
