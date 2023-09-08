package qj1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ky2.C10432i;
import l31.C61212e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: qj1.d4 */
public final class C62699d4 extends C62660c {

    /* renamed from: p */
    public final C58124b f178027p;

    /* renamed from: q */
    public final String f178028q = "FinderLiveBottomTipPlugin";

    /* renamed from: r */
    public final LiveBottomSheetPanel f178029r;

    /* renamed from: s */
    public final Button f178030s;

    /* renamed from: t */
    public final Button f178031t;

    /* renamed from: u */
    public final TextView f178032u;

    /* renamed from: v */
    public final TextView f178033v;

    /* renamed from: w */
    public final View f178034w;

    /* renamed from: qj1.d4$a */
    public static final class C62700a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62699d4 f178035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62700a(C62699d4 d4Var) {
            super(1);
            this.f178035d = d4Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f178035d.mo10792g(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d4$b */
    public static final class C62701b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62699d4 f178036d;

        public C62701b(C62699d4 d4Var) {
            this.f178036d = d4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBottomTipPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f178036d.f178029r.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBottomTipPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.d4$c */
    public static final class C62702c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62699d4 f178037d;

        public C62702c(C62699d4 d4Var) {
            this.f178037d = d4Var;
        }

        public final void run() {
            this.f178037d.f178029r.mo78804d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62699d4(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178027p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dgu);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…ve_bottom_tip_blank_area)");
        this.f178034w = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dgv);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…_bottom_tip_content_area)");
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) findViewById2;
        this.f178029r = liveBottomSheetPanel;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.dgr);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…_bottom_tip_action_group)");
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.dgs);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…ve_bottom_tip_action_one)");
        this.f178030s = (Button) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.dgt);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…ve_bottom_tip_action_two)");
        this.f178031t = (Button) findViewById5;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.dgx);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…er_live_bottom_tip_title)");
        this.f178032u = (TextView) findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.dgw);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.finder_live_bottom_tip_msg)");
        this.f178033v = (TextView) findViewById7;
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        ViewGroup.LayoutParams layoutParams = ((RelativeLayout) findViewById3).getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
        liveBottomSheetPanel.setOnVisibilityListener(new C62700a(this));
        findViewById.setOnClickListener(new C62701b(this));
    }

    /* renamed from: Z0 */
    public final void mo87712Z0(Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(C0966R.C0969drawable.f4653j6));
        button.setTextColor(button.getContext().getResources().getColor(C0966R.color.f3257l0));
    }

    /* renamed from: a1 */
    public final void mo87713a1(Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(C0966R.C0969drawable.f4665jf));
        button.setTextColor(button.getContext().getResources().getColor(C0966R.color.al7));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87714b1(int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        mo10792g(0);
        this.f178032u.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360687e63));
        this.f178033v.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360686e62));
        this.f178030s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360685e61));
        this.f178031t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.e64));
        this.f178030s.setBackground(this.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.f5152yj));
        this.f178031t.setBackground(this.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.f5150yh));
        if (i == 0) {
            this.f178032u.setText(this.f166287d.getContext().getResources().getString(C0966R.string.drr));
            this.f178033v.setText(this.f166287d.getContext().getResources().getString(C0966R.string.drq));
            this.f178030s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360600ds2));
            this.f178031t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.drh));
            mo87712Z0(this.f178030s);
            mo87713a1(this.f178031t);
        } else if (i == 1) {
            this.f178032u.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360687e63));
            this.f178033v.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360686e62));
            this.f178030s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360685e61));
            this.f178031t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.e64));
            mo87713a1(this.f178030s);
            mo87712Z0(this.f178031t);
        } else if (i == 2) {
            this.f178032u.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360684e60));
            this.f178033v.setText(this.f166287d.getContext().getResources().getString(C0966R.string.e5z));
            this.f178030s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360685e61));
            this.f178031t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.e64));
            mo87713a1(this.f178030s);
            mo87712Z0(this.f178031t);
        }
        if (this.f178027p.getLiveRole() == 0) {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_red_packet_hold_up", this.f166287d, C90364q0.m113147f(new C13604l("red_packet_err_type", 3), new C13604l("cur_red_packet_source", -1)), 25561);
        }
        this.f178030s.setOnClickListener(onClickListener);
        this.f178031t.setOnClickListener(onClickListener2);
        this.f178029r.post(new C62702c(this));
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w(this.f178028q, "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        this.f178029r.mo78802a();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
