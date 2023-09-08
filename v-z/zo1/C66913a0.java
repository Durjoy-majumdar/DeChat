package zo1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import cp1.C57952m;
import d60.C58124b;
import gh1.C59453p;
import gh1.C8313a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zo1.a0 */
public final class C66913a0 extends C8313a {

    /* renamed from: j */
    public final List<TextView> f192272j = new ArrayList();

    /* renamed from: n */
    public C59453p f192273n;

    /* renamed from: zo1.a0$a */
    public static final class C66914a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66913a0 f192274d;

        public C66914a(C66913a0 a0Var) {
            this.f192274d = a0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66913a0.m79045m3(this.f192274d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zo1.a0$b */
    public static final class C66915b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66913a0 f192275d;

        public C66915b(C66913a0 a0Var) {
            this.f192275d = a0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66913a0.m79045m3(this.f192275d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66913a0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public static final void m79045m3(C66913a0 a0Var) {
        C59453p pVar = a0Var.f192273n;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        ((C54991o) a0Var.business(C54991o.class)).f154286Z = false;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        a0Var.mo9313k3(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
    }

    /* renamed from: n3 */
    public final void mo90908n3() {
        C59453p pVar = this.f192273n;
        if (pVar != null) {
            Iterator it = ((ArrayList) this.f192272j).iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) it.next();
                if (C87412m.m108589b(textView.getTag(), Float.valueOf(((C54519d) business(C54519d.class)).f152840B))) {
                    textView.setTextColor(pVar.f169882a.getContext().getResources().getColor(C0966R.color.f2939n));
                } else {
                    textView.setTextColor(pVar.f169882a.getContext().getResources().getColor(C0966R.color.f2975b6));
                }
            }
        }
    }

    public void onLiveActivate() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        C57952m mVar;
        View findViewById;
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.o_5);
        C87412m.m108593f(viewGroup2, "rootView");
        this.f192273n = new C59453p(viewGroup2, this);
        if (!(viewGroup2.getContext().getResources().getConfiguration().orientation == 2 || (findViewById = viewGroup2.findViewById(C0966R.C0970id.o8l)) == null)) {
            findViewById.setOnClickListener(new C66914a(this));
        }
        viewGroup2.setOnClickListener(new C66915b(this));
        TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.jz5);
        textView.setTag(Float.valueOf(0.5f));
        ((ArrayList) this.f192272j).add(textView);
        TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.oa5);
        textView2.setTag(Float.valueOf(1.0f));
        ((ArrayList) this.f192272j).add(textView2);
        TextView textView3 = (TextView) viewGroup2.findViewById(C0966R.C0970id.oa4);
        textView3.setTag(Float.valueOf(1.25f));
        ((ArrayList) this.f192272j).add(textView3);
        TextView textView4 = (TextView) viewGroup2.findViewById(C0966R.C0970id.jz7);
        textView4.setTag(Float.valueOf(1.5f));
        ((ArrayList) this.f192272j).add(textView4);
        TextView textView5 = (TextView) viewGroup2.findViewById(C0966R.C0970id.jz8);
        textView5.setTag(Float.valueOf(2.0f));
        ((ArrayList) this.f192272j).add(textView5);
        Iterator it = ((ArrayList) this.f192272j).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new C66953z(this, viewGroup2));
        }
        mo90908n3();
        Class cls = C54519d.class;
        float f = ((C54519d) business(cls)).f152840B;
        ((C54519d) business(cls)).f152840B = f;
        C66925j0 j0Var = (C66925j0) mo9307d3(C66925j0.class);
        if (!(j0Var == null || (mVar = j0Var.f192301r) == null)) {
            mVar.f165852a.setPlaySpeed(f);
        }
        mo90908n3();
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        C59453p pVar = this.f192273n;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        ((ArrayList) this.f192272j).clear();
    }
}
