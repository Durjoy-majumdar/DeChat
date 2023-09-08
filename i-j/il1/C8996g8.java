package il1;

import ak1.C0076j0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cj1.C54795n5;
import cj1.C54847z3;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l31.C10460a;
import l31.C61212e;
import ok1.C62042e;
import pg1.C11934a;
import pg1.C11935b;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C50931q91;
import te3.C51075r91;

/* renamed from: il1.g8 */
public final class C8996g8 {

    /* renamed from: a */
    public final ViewGroup f28427a;

    /* renamed from: b */
    public final C58124b f28428b;

    /* renamed from: c */
    public final C62660c f28429c;

    /* renamed from: d */
    public final View f28430d;

    /* renamed from: e */
    public boolean f28431e;

    /* renamed from: il1.g8$a */
    public static final class C8997a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8996g8 f28432d;

        /* renamed from: il1.g8$a$a */
        public static final class C8998a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C8998a f28433d = new C8998a();

            public C8998a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: il1.g8$a$b */
        public static final class C8999b extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C8999b f28434d = new C8999b();

            public C8999b() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return C13598b0.f38549a;
            }
        }

        public C8997a(C8996g8 g8Var) {
            this.f28432d = g8Var;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32444a aVar = C32444a.f86121a;
            if (C32444a.f86075K2.mo60266n().intValue() != -1) {
                int intValue = C32444a.f86075K2.mo60266n().intValue();
                if (intValue == 1) {
                    C62042e eVar2 = C62042e.f176370a;
                    Context context = this.f28432d.f28427a.getContext();
                    C87412m.m108593f(context, "root.context");
                    if (eVar2.mo87098n(context, "FinderLiveLegalPromot1", C8998a.f28433d)) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                } else if (intValue == 2) {
                    C62042e eVar3 = C62042e.f176370a;
                    Context context2 = this.f28432d.f28427a.getContext();
                    C87412m.m108593f(context2, "root.context");
                    if (eVar3.mo87098n(context2, "FinderLiveLegalPromot2", C8999b.f28434d)) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
            }
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.LIVE_GIFT, (Map) null, (String) null, 6, (Object) null);
            C58124b.C7172a.m7372a(this.f28432d.f28428b, C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, (Bundle) null, 2, (Object) null);
            if (!(!((C54991o) this.f28432d.f28429c.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f28432d.f28429c.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2017);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C8996g8(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28427a = viewGroup;
        this.f28428b = bVar;
        this.f28429c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dmc);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_gift_icon)");
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.jao);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…der_live_gift_pkg_reddot)");
        this.f28430d = findViewById2;
        ((ImageView) findViewById).setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.finder_icons_filled_gift, viewGroup.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8)));
        C10460a.m10392a(viewGroup, "finder_live_room_gift_icon");
        C10460a.m10394c(viewGroup, 8, 25561);
        viewGroup.setOnClickListener(new C8997a(this));
        mo9805a();
    }

    /* renamed from: a */
    public final void mo9805a() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, false);
        View view = this.f28430d;
        int i = g ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final void mo9806b(boolean z) {
        Class cls = C55001u.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        if (!z || C62042e.f176370a.mo87057Y0(this.f28429c.mo87684A0()) || ((C54991o) this.f28429c.mo87696x0(cls3)).f154190D || !((C54991o) this.f28429c.mo87696x0(cls3)).mo75963I3() || !((C54991o) this.f28429c.mo87696x0(cls3)).mo75999e4()) {
            this.f28427a.setVisibility(8);
        } else {
            if (this.f28427a.getVisibility() != 0) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.LIVE_GIFT, (Map) null, 2, (Object) null);
            }
            if (!((C55001u) this.f28429c.mo87696x0(cls)).f154428y) {
                ((C55001u) this.f28429c.mo87696x0(cls)).f154428y = true;
                C54795n5 D0 = this.f28429c.mo14476D0();
                if (D0 != null) {
                    Context context = this.f28427a.getContext();
                    C87412m.m108593f(context, "root.context");
                    D0.mo75715S(context, (C32226l<? super Boolean, C13598b0>) null, (C32227p<? super Integer, ? super Integer, C13598b0>) null);
                }
            }
            this.f28427a.setVisibility(0);
        }
        Class cls4 = C11935b.class;
        if (this.f28427a.getVisibility() == 0) {
            if (!this.f28431e) {
                C11935b bVar = (C11935b) this.f28429c.mo87696x0(cls4);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                C54847z3 z3Var = FinderLiveService.f159383n;
                z3Var.mo75800f(17);
                finderLiveService.getClass();
                C50931q91 q912 = new C50931q91();
                q912.f140197d = bVar.f34869i;
                C13598b0 b0Var = C13598b0.f38549a;
                z3Var.mo75799e(17, q912, new C11934a(bVar, C51075r91.class), false);
                this.f28431e = true;
            }
        } else if (this.f28431e) {
            C11935b bVar2 = (C11935b) this.f28429c.mo87696x0(cls4);
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75800f(17);
            this.f28431e = false;
        }
        if (this.f28427a.getVisibility() == 0 && !((C54116w) C86312j.m106911c(cls2)).f151938e1) {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_exp", this.f28427a, (Map<String, Object>) null, 25561);
        }
        ((C54116w) C86312j.m106911c(cls2)).nv0(C0076j0.GIFT_ICON_EXPOSURE, "", this.f28427a.getVisibility());
    }
}
