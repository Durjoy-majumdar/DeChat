package qj1;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54424j;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kz1.C46828m;
import nj3.C11184p0;
import ok1.C62042e;
import qo3.C77407n;
import qo3.C77426q;
import te3.C49712hj1;

/* renamed from: qj1.z0 */
public final class C63151z0 extends C62660c {

    /* renamed from: p */
    public final C58124b f179192p;

    /* renamed from: q */
    public final View f179193q;

    /* renamed from: r */
    public C77407n f179194r;

    /* renamed from: s */
    public boolean f179195s;

    /* renamed from: t */
    public final C11184p0 f179196t;

    /* renamed from: qj1.z0$a */
    public static final class C63152a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63151z0 f179197d;

        public C63152a(C63151z0 z0Var) {
            this.f179197d = z0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f179197d.f179192p, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.z0$b */
    public static final class C63153b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C63151z0 f179198d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f179199e;

        public C63153b(C63151z0 z0Var, ViewGroup viewGroup) {
            this.f179198d = z0Var;
            this.f179199e = viewGroup;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                C63151z0 z0Var = this.f179198d;
                if (z0Var.f179195s) {
                    C77426q qVar = new C77426q(z0Var.f166287d.getContext());
                    qVar.mo107595g(z0Var.f166287d.getContext().getString(C0966R.string.cu_));
                    qVar.mo107589a(true);
                    qVar.mo107601m(C0966R.string.g8l);
                    qVar.mo107599k(Color.parseColor("#FF6146"));
                    qVar.mo107598j(z0Var.f166287d.getContext().getString(C0966R.string.e6r));
                    qVar.mo107590b(new C62664c1(z0Var));
                    qVar.mo107603o();
                    return;
                }
                C63151z0.m74500Z0(z0Var);
            } else if (itemId != 2) {
            } else {
                if (((C54991o) this.f179198d.mo87696x0(cls2)).f154301c3) {
                    C46828m mVar = (C46828m) C86312j.m106911c(C46828m.class);
                    Context context = this.f179199e.getContext();
                    String str = ((C54991o) this.f179198d.mo87696x0(cls2)).f154309e3;
                    if (str == null && (str = ((C55001u) this.f179198d.mo87696x0(cls)).f154420q.f182357C) == null) {
                        str = "";
                    }
                    int i2 = ((C54991o) this.f179198d.mo87696x0(cls2)).f154314f3;
                    Boolean bool = Boolean.FALSE;
                    mVar.mo72034dg(context, str, i2, bool, bool, Long.valueOf(((C55001u) this.f179198d.mo87696x0(cls)).f154420q.f182392d));
                    Context context2 = this.f179199e.getContext();
                    AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity != null) {
                        appCompatActivity.finish();
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                C63151z0 z0Var2 = this.f179198d;
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", false);
                z0Var2.f179192p.statusChange(C58124b.C58125b.LIVE_HAS_FINISHED, bundle);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63151z0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f179192p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g0d);
        this.f179193q = findViewById;
        C75044y4.m89991c(viewGroup.getContext());
        this.f179196t = new C63153b(this, viewGroup);
        findViewById.setOnClickListener(new C63152a(this));
        if (mo82893g0() && viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int d0 = mo82891d0();
            if (d0 == 1) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C75044y4.m89991c(viewGroup.getContext()));
            } else if (d0 == 3) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 16));
            }
        }
        C62042e eVar = C62042e.f176370a;
        eVar.mo87074e(this, false);
        eVar.mo87071d(this);
    }

    /* renamed from: Z0 */
    public static final void m74500Z0(C63151z0 z0Var) {
        z0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", true);
        z0Var.f179192p.statusChange(C58124b.C58125b.LIVE_HAS_FINISHED, bundle);
        if (z0Var.f179195s) {
            C58704c5 c5Var = C58704c5.f168044a;
            if (C58704c5.C58705a.f168049b == 2) {
                C58704c5.C58705a.f168049b = 0;
                C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1130);
            } else {
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportSecondaryManualClose but not record live!");
            }
            C58728f5 f5Var = C58728f5.f168144a;
            C45795b A0 = z0Var.mo87684A0();
            f5Var.mo83645b(A0, C1810l.CTRL_INDEX, 0, "secondaryManualClose", "0-vBitrate:" + C54424j.f152654c);
        } else if (((C54991o) z0Var.mo87696x0(C54991o.class)).f154301c3) {
            C58704c5 c5Var2 = C58704c5.f168044a;
            if (C58704c5.C58705a.f168049b == 3) {
                C58704c5.C58705a.f168049b = 0;
                C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1140);
            } else {
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportExternalManualClose but not record live!");
            }
            C58728f5 f5Var2 = C58728f5.f168144a;
            C45795b A02 = z0Var.mo87684A0();
            f5Var2.mo83645b(A02, C55529k.CTRL_INDEX, 0, "externalManualClose", "0-vBitrate:" + C54424j.f152654c);
        } else {
            C58704c5 c5Var3 = C58704c5.f168044a;
            if (C58704c5.C58705a.f168049b == 1) {
                C58704c5.C58705a.f168049b = 0;
                C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1120);
            } else {
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportAnchorManualClose but not record live!");
            }
            C58728f5 f5Var3 = C58728f5.f168144a;
            C45795b A03 = z0Var.mo87684A0();
            f5Var3.mo83645b(A03, 1120, 0, "anchorManualClose", "0-vBitrate:" + C54424j.f152654c);
        }
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

    /* renamed from: s0 */
    public void mo3209s0() {
        if (C75044y4.m89991c(this.f166287d.getContext()) == 0) {
            C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                mo10792g(0);
                return;
            } else if (ordinal != 8) {
                if (!(ordinal == 27 || ordinal == 28)) {
                    return;
                }
            } else if (this.f179195s) {
                Class cls = C54991o.class;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(this.f166287d.getContext().getResources().getString(((C54991o) mo87696x0(cls)).f154301c3 ? C0966R.string.e1o : C0966R.string.e5s));
                arrayList2.add(2);
                if (((C54991o) mo87696x0(cls)).f154227M1 && !((C54991o) mo87696x0(cls)).f154301c3) {
                    arrayList.add(this.f166287d.getContext().getResources().getString(C0966R.string.g8l));
                    arrayList2.add(0);
                }
                if (this.f179194r == null) {
                    C77407n nVar = new C77407n(this.f166287d.getContext(), 1, true);
                    this.f179194r = nVar;
                    nVar.f225771i = new C12279d1(this, arrayList, arrayList2);
                    nVar.f225782p = this.f179196t;
                    nVar.f225761d = new C62754e1(this);
                }
                C77407n nVar2 = this.f179194r;
                if (nVar2 != null) {
                    nVar2.mo107573q();
                    return;
                }
                return;
            } else {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(this.f166287d.getContext().getResources().getString(C0966R.string.g8l));
                arrayList4.add(0);
                if (this.f179194r == null) {
                    this.f179194r = new C77407n(this.f166287d.getContext(), 1, false);
                }
                C77407n nVar3 = this.f179194r;
                if (nVar3 != null) {
                    nVar3.f225771i = new C12241a1(this, arrayList3, arrayList4);
                }
                if (nVar3 != null) {
                    nVar3.f225782p = this.f179196t;
                }
                if (nVar3 != null) {
                    nVar3.f225761d = new C62640b1(this);
                }
                if (nVar3 != null) {
                    nVar3.mo107573q();
                    return;
                }
                return;
            }
        }
        mo10792g(8);
    }
}
