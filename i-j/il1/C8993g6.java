package il1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import c30.C104289g;
import cj1.C54795n5;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76912y0;
import qj1.C62660c;
import qj1.C62815i3;
import qo3.C77407n;
import zj1.C16217b;

/* renamed from: il1.g6 */
public final class C8993g6 {

    /* renamed from: a */
    public final ViewGroup f28411a;

    /* renamed from: b */
    public final C58124b f28412b;

    /* renamed from: c */
    public final C62660c f28413c;

    /* renamed from: d */
    public final int f28414d = 1;

    /* renamed from: e */
    public final int f28415e = 2;

    /* renamed from: f */
    public final int f28416f = 3;

    /* renamed from: g */
    public final int f28417g = 4;

    /* renamed from: h */
    public final int f28418h = 5;

    /* renamed from: i */
    public final int f28419i = 6;

    /* renamed from: j */
    public C77407n f28420j;

    /* renamed from: k */
    public boolean f28421k = true;

    /* renamed from: l */
    public final View f28422l;

    /* renamed from: m */
    public final String f28423m;

    /* renamed from: n */
    public C11184p0 f28424n;

    /* renamed from: il1.g6$a */
    public static final class C8994a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8993g6 f28425d;

        public C8994a(C8993g6 g6Var) {
            this.f28425d = g6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenShareEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28425d.mo9803d();
            C16217b.f43438a.mo14745b(this.f28425d.f28423m, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenShareEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.g6$b */
    public static final class C8995b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C8993g6 f28426d;

        public C8995b(C8993g6 g6Var) {
            this.f28426d = g6Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class<FinderLiveBizListUI> cls = FinderLiveBizListUI.class;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            int i2 = this.f28426d.f28416f;
            if (valueOf != null && valueOf.intValue() == i2) {
                C8993g6.m8769b(this.f28426d);
                C54795n5 D0 = this.f28426d.f28413c.mo14476D0();
                if (D0 != null) {
                    Context context = this.f28426d.f28411a.getContext();
                    C87412m.m108593f(context, "root.context");
                    D0.mo75752t(context, 3);
                }
                C77407n nVar = this.f28426d.f28420j;
                if (nVar != null) {
                    nVar.mo107572p();
                    return;
                }
                return;
            }
            this.f28426d.getClass();
            if (valueOf != null && valueOf.intValue() == 0) {
                C8993g6.m8769b(this.f28426d);
                C54795n5 D02 = this.f28426d.f28413c.mo14476D0();
                if (D02 != null) {
                    Context context2 = this.f28426d.f28411a.getContext();
                    C87412m.m108593f(context2, "root.context");
                    D02.mo75752t(context2, 1);
                }
                C77407n nVar2 = this.f28426d.f28420j;
                if (nVar2 != null) {
                    nVar2.mo107572p();
                    return;
                }
                return;
            }
            int i3 = this.f28426d.f28417g;
            if (valueOf != null && valueOf.intValue() == i3) {
                C8993g6.m8769b(this.f28426d);
                C54795n5 D03 = this.f28426d.f28413c.mo14476D0();
                if (D03 != null) {
                    Context context3 = this.f28426d.f28411a.getContext();
                    C87412m.m108593f(context3, "root.context");
                    D03.mo75738h0(context3, 4);
                }
                C77407n nVar3 = this.f28426d.f28420j;
                if (nVar3 != null) {
                    nVar3.mo107572p();
                    return;
                }
                return;
            }
            int i4 = this.f28426d.f28414d;
            if (valueOf != null && valueOf.intValue() == i4) {
                C8993g6.m8769b(this.f28426d);
                C54795n5 D04 = this.f28426d.f28413c.mo14476D0();
                if (D04 != null) {
                    Context context4 = this.f28426d.f28411a.getContext();
                    C87412m.m108593f(context4, "root.context");
                    D04.mo75738h0(context4, 2);
                }
                C77407n nVar4 = this.f28426d.f28420j;
                if (nVar4 != null) {
                    nVar4.mo107572p();
                    return;
                }
                return;
            }
            int i5 = this.f28426d.f28415e;
            if (valueOf != null && valueOf.intValue() == i5) {
                C62815i3 i3Var = (C62815i3) this.f28426d.f28413c.mo87687E0(C62815i3.class);
                if (i3Var != null) {
                    i3Var.mo87799f1();
                }
                C77407n nVar5 = this.f28426d.f28420j;
                if (nVar5 != null) {
                    nVar5.mo107572p();
                    return;
                }
                return;
            }
            int i6 = this.f28426d.f28418h;
            if (valueOf != null && valueOf.intValue() == i6) {
                C8993g6.m8768a(this.f28426d);
                Intent intent = new Intent(this.f28426d.f28411a.getContext(), cls);
                Context context5 = this.f28426d.f28411a.getContext();
                C87412m.m108592e(context5, "null cannot be cast to non-null type android.app.Activity");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(5);
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) context5, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenShareEntranceWidget$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                C77407n nVar6 = this.f28426d.f28420j;
                if (nVar6 != null) {
                    nVar6.mo107572p();
                    return;
                }
                return;
            }
            int i7 = this.f28426d.f28419i;
            if (valueOf != null && valueOf.intValue() == i7) {
                C8993g6.m8768a(this.f28426d);
                Intent intent2 = new Intent(this.f28426d.f28411a.getContext(), cls);
                Context context6 = this.f28426d.f28411a.getContext();
                C87412m.m108592e(context6, "null cannot be cast to non-null type android.app.Activity");
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(5);
                aVar2.mo10233c(intent2);
                C117292a.m165364j((Activity) context6, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenShareEntranceWidget$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                C77407n nVar7 = this.f28426d.f28420j;
                if (nVar7 != null) {
                    nVar7.mo107572p();
                }
            }
        }
    }

    public C8993g6(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28411a = viewGroup;
        this.f28412b = bVar;
        this.f28413c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.oob);
        this.f28422l = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.ooa);
        this.f28423m = "anchorlive.bottom.tools.screenshare";
        viewGroup.setOnClickListener(new C8994a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.tools.screenshare", findViewById, (View) null, textView, 8, (Object) null);
        this.f28424n = new C8995b(this);
    }

    /* renamed from: a */
    public static final void m8768a(C8993g6 g6Var) {
        g6Var.getClass();
        C104289g gVar = new C104289g();
        gVar.mo145967r("type", 2);
        gVar.mo145967r("result", 2);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SCREEN_SHARE, gVar.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: b */
    public static final void m8769b(C8993g6 g6Var) {
        g6Var.getClass();
        C104289g gVar = new C104289g();
        gVar.mo145967r("type", 2);
        gVar.mo145967r("result", 1);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SCREEN_SHARE, gVar.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: c */
    public final void mo9802c(boolean z) {
        Class cls = C54108o.class;
        if (z) {
            if (this.f28411a.getVisibility() != 0) {
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.DOCUMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
                if (this.f28421k) {
                    C16217b.f43438a.mo14751g(this.f28423m);
                    this.f28421k = false;
                }
            }
            this.f28411a.setVisibility(0);
            return;
        }
        this.f28411a.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo9803d() {
        List<C54130j> list;
        Class cls = C54963d0.class;
        Class cls2 = C54108o.class;
        new C104289g();
        C7335d c = C86312j.m106911c(cls2);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.DOCUMENT, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54963d0 d0Var = (C54963d0) finderLiveService.mo77630e(cls);
        if ((d0Var != null ? d0Var.f154073p : null) == null) {
            C54963d0 d0Var2 = (C54963d0) finderLiveService.mo77630e(cls);
            boolean z = false;
            if (!(d0Var2 == null || (list = d0Var2.f154074q) == null || !(!list.isEmpty()))) {
                z = true;
            }
            if (!z) {
                if (this.f28420j == null) {
                    C77407n nVar = new C77407n(this.f28411a.getContext(), 1, true);
                    this.f28420j = nVar;
                    nVar.f225775k1 = true;
                }
                C77407n nVar2 = this.f28420j;
                if (nVar2 != null) {
                    nVar2.f225792t1 = true;
                }
                if (nVar2 != null) {
                    nVar2.f225771i = new C9016h6(this);
                }
                if (nVar2 != null) {
                    nVar2.f225782p = this.f28424n;
                }
                if (nVar2 != null) {
                    nVar2.f225761d = new C9021i6(this);
                }
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
                C104289g gVar = new C104289g();
                gVar.mo145967r("type", 1);
                gVar.mo145967r("result", 1);
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.SCREEN_SHARE;
                C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, gVar.toString(), (String) null, 4, (Object) null);
                C104289g gVar2 = new C104289g();
                gVar2.mo145967r("type", 1);
                gVar2.mo145967r("result", 2);
                C7335d c3 = C86312j.m106911c(cls2);
                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c3, g0Var, gVar2.toString(), (String) null, 4, (Object) null);
                return;
            }
        }
        C76912y0.m92767f(this.f28411a.getContext(), this.f28411a.getContext().getResources().getString(C0966R.string.e1t));
    }
}
