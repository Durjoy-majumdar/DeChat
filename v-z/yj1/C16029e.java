package yj1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kj1.C10119d1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49658h43;
import te3.C51068r71;
import te3.C52173yv0;
import xj1.C15712a;
import yj1.C16025d;
import zj1.C16217b;

/* renamed from: yj1.e */
public final class C16029e {

    /* renamed from: a */
    public final Context f43118a;

    /* renamed from: b */
    public final C15712a f43119b;

    /* renamed from: c */
    public final C32224a<C13598b0> f43120c;

    /* renamed from: d */
    public final C32224a<C13598b0> f43121d;

    /* renamed from: e */
    public ViewGroup f43122e;

    /* renamed from: f */
    public MMSwitchBtn f43123f;

    /* renamed from: g */
    public TextView f43124g;

    /* renamed from: h */
    public C51068r71 f43125h;

    /* renamed from: i */
    public final C13601g f43126i;

    /* renamed from: yj1.e$a */
    public static final class C16030a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16029e f43127d;

        public C16030a(C16029e eVar) {
            this.f43127d = eVar;
        }

        public final void onClick(View view) {
            LinkedList<C49658h43> linkedList;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f43127d.f43120c.invoke();
            C16029e eVar = this.f43127d;
            C51068r71 r712 = eVar.f43125h;
            if (r712 != null) {
                C16025d dVar = (C16025d) ((C36570n) eVar.f43126i).getValue();
                dVar.getClass();
                dVar.mo3431p();
                dVar.f43110p = r712;
                dVar.f43108n.clear();
                C52173yv0 yv02 = r712.f140743f;
                long j = yv02 != null ? yv02.f145533e : 0;
                C51068r71 r713 = dVar.f43110p;
                if (!(r713 == null || (linkedList = r713.f140742e) == null)) {
                    for (C49658h43 h432 : linkedList) {
                        LinkedList<C16025d.C16027b> linkedList2 = dVar.f43108n;
                        long j2 = h432.f134442d;
                        linkedList2.add(new C16025d.C16027b(j2, j == j2));
                    }
                }
                dVar.f43109o.notifyDataSetChanged();
            }
            C16217b.f43438a.mo14745b("audience.more.morefunction.rewardlimitamount", false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yj1.e$b */
    public static final class C16031b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C16029e f43128a;

        public C16031b(C16029e eVar) {
            this.f43128a = eVar;
        }

        public final void onStatusChange(boolean z) {
            C52173yv0 yv02;
            C10119d1.f30943a.mo10530a(4, 0, 3, z ? 2 : 3);
            C16029e eVar = this.f43128a;
            C51068r71 r712 = eVar.f43125h;
            if (!(r712 == null || (yv02 = r712.f140743f) == null)) {
                yv02.f145532d = z ? 1 : 0;
                eVar.f43122e.setVisibility(z ? 0 : 8);
                eVar.f43124g.setText(eVar.f43118a.getResources().getString(C0966R.string.mwk, new Object[]{Long.valueOf(yv02.f145533e)}));
                eVar.f43119b.mo14208N(yv02, true);
            }
            this.f43128a.mo14650a(z);
            C16217b.f43438a.mo14745b("audience.more.morefunction.rewardlimit", false);
        }
    }

    /* renamed from: yj1.e$c */
    public static final class C16032c extends C87413o implements C32224a<C16025d> {

        /* renamed from: d */
        public final /* synthetic */ C16029e f43129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16032c(C16029e eVar) {
            super(0);
            this.f43129d = eVar;
        }

        public Object invoke() {
            C16029e eVar = this.f43129d;
            return new C16025d(eVar.f43118a, new C16033f(eVar), new C16034g(this.f43129d));
        }
    }

    public C16029e(Context context, C15712a aVar, View view, C51068r71 r712, C32224a<C13598b0> aVar2, C32224a<C13598b0> aVar3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "service");
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(r712, "dataInfo");
        C87412m.m108594g(aVar2, "hideForNextPanel");
        C87412m.m108594g(aVar3, "reOpen");
        this.f43118a = context;
        this.f43119b = aVar;
        this.f43120c = aVar2;
        this.f43121d = aVar3;
        View findViewById = view.findViewById(C0966R.C0970id.nqn);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.tips_second_layout)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f43122e = viewGroup;
        viewGroup.setOnClickListener(new C16030a(this));
        View findViewById2 = view.findViewById(C0966R.C0970id.o37);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…trict_consume_switch_btn)");
        this.f43123f = (MMSwitchBtn) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.nql);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.tips_num_content)");
        this.f43124g = (TextView) findViewById3;
        mo14650a(this.f43123f.f220433y);
        this.f43123f.setSwitchListener(new C16031b(this));
        this.f43125h = r712;
        C52173yv0 yv02 = r712.f140743f;
        if (yv02 != null) {
            if (yv02.f145532d == 1) {
                this.f43123f.setCheck(true);
                this.f43122e.setVisibility(0);
                this.f43124g.setText(context.getResources().getString(C0966R.string.mwk, new Object[]{Long.valueOf(yv02.f145533e)}));
            } else {
                this.f43123f.setCheck(false);
                this.f43122e.setVisibility(8);
            }
        }
        this.f43126i = C36568h.m40985a(new C16032c(this));
    }

    /* renamed from: a */
    public final void mo14650a(boolean z) {
        String string = this.f43118a.getString(C0966R.string.mwi);
        C87412m.m108593f(string, "context.getString(R.stri…consume_switch_tips_main)");
        if (z) {
            this.f43123f.setContentDescription(this.f43118a.getString(C0966R.string.nef, new Object[]{string}));
            return;
        }
        this.f43123f.setContentDescription(this.f43118a.getString(C0966R.string.nee, new Object[]{string}));
    }
}
