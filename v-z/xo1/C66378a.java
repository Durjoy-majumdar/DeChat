package xo1;

import ak1.C0047e0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import bp1.C54519d;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import d60.C58124b;
import di3.C86312j;
import gh1.C59453p;
import gh1.C59461x;
import gh1.C8313a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C64338e71;
import te3.C64662qp2;
import zo1.C66913a0;

/* renamed from: xo1.a */
public final class C66378a extends C8313a {

    /* renamed from: j */
    public C59453p f191089j;

    /* renamed from: n */
    public View f191090n;

    /* renamed from: o */
    public View f191091o;

    /* renamed from: xo1.a$a */
    public static final class C66379a implements C59461x {

        /* renamed from: a */
        public final /* synthetic */ C66378a f191092a;

        public C66379a(C66378a aVar) {
            this.f191092a = aVar;
        }

        /* renamed from: a */
        public List<C59453p> mo9171a() {
            C59453p pVar = this.f191092a.f191089j;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: b */
        public List<C59453p> mo9172b() {
            C59453p pVar = this.f191092a.f191089j;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: c */
        public void mo9173c(boolean z) {
        }
    }

    /* renamed from: xo1.a$b */
    public static final class C66380b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66378a f191093d;

        public C66380b(C66378a aVar) {
            this.f191093d = aVar;
        }

        public final void onClick(View view) {
            C59453p pVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66378a aVar = this.f191093d;
            ((C54991o) aVar.business(C54991o.class)).f154286Z = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
            aVar.mo9313k3(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
            C66913a0 a0Var = (C66913a0) this.f191093d.controller(C66913a0.class);
            if (!(a0Var == null || (pVar = a0Var.f192273n) == null)) {
                pVar.mo84560c(0);
            }
            String jSONObject = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
            C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…CommonParams().toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_speed_click", jSONObject);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xo1.a$c */
    public static final class C66381c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66378a f191094d;

        public C66381c(C66378a aVar) {
            this.f191094d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String jSONObject = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
            C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…CommonParams().toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_wonderful_button_click", jSONObject);
            C66396l lVar = (C66396l) this.f191094d.controller(C66396l.class);
            if (lVar != null) {
                lVar.mo90494n3();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66378a(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        Class cls = C8777j5.class;
        C87412m.m108594g(viewGroup2, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0966R.C0970id.o7g);
        C87412m.m108593f(viewGroup3, "rootView");
        this.f191089j = new C59453p(viewGroup3, this);
        this.f191090n = viewGroup3.findViewById(C0966R.C0970id.o_4);
        this.f191091o = viewGroup3.findViewById(C0966R.C0970id.obd);
        this.f27265i = new C66379a(this);
        if (((C54519d) business(C54519d.class)).f152846f) {
            View view = this.f191090n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view3 = this.f191090n;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f191090n;
            if (view5 != null) {
                view5.setOnClickListener(new C66380b(this));
            }
            String jSONObject = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
            C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…CommonParams().toString()");
            ((C8777j5) C86312j.m106911c(cls)).hg0("watch_live_speed_exp", jSONObject);
        }
        C64338e71 e712 = ((C55001u) business(C55001u.class)).f154420q.f182388Z;
        LinkedList<C64662qp2> linkedList = e712 != null ? e712.f182935n : null;
        if (linkedList == null || linkedList.isEmpty()) {
            View view6 = this.f191091o;
            if (view6 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view8 = this.f191091o;
        if (view8 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view10 = this.f191091o;
        if (view10 != null) {
            view10.setOnClickListener(new C66381c(this));
        }
        String jSONObject2 = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
        C87412m.m108593f(jSONObject2, "LiveChargeAndReplayRepor…CommonParams().toString()");
        ((C8777j5) C86312j.m106911c(cls)).hg0("watch_live_wonderful_button_exp", jSONObject2);
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        this.f191089j = null;
        this.f191090n = null;
        this.f191091o = null;
    }
}
