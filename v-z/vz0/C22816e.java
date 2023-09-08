package vz0;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wz0.C22945n;

/* renamed from: vz0.e */
public class C22816e extends C22821l {

    /* renamed from: b */
    public View f65601b;

    /* renamed from: c */
    public TextView f65602c;

    /* renamed from: d */
    public TextView f65603d;

    /* renamed from: c */
    public void mo35949c() {
        this.f65601b = mo35969b(C0966R.C0970id.f5648ks);
        this.f65602c = (TextView) mo35969b(C0966R.C0970id.f5649kt);
        TextView textView = (TextView) mo35969b(C0966R.C0970id.jhy);
        this.f65603d = (TextView) mo35969b(C0966R.C0970id.awo);
        this.f65602c.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
        View view = this.f65601b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65601b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public void mo35951e() {
        CardDetailUIContoller cardDetailUIContoller = (CardDetailUIContoller) this.f65616a;
        C20483c cVar = cardDetailUIContoller.f51776E;
        MMActivity mMActivity = cardDetailUIContoller.f51797e;
        View view = this.f65601b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!TextUtils.isEmpty(cVar.mo23264L0().f64108F)) {
            this.f65602c.setVisibility(0);
            this.f65602c.setText(cVar.mo23264L0().f64108F);
            if (cVar.mo23272T0() || (cVar.mo23267O() && cVar.mo23284h())) {
                this.f65602c.setTextColor(mMActivity.getResources().getColor(C0966R.color.al_));
            } else if (!cVar.mo23267O() || !cVar.mo23291o()) {
                this.f65602c.setTextColor(mMActivity.getResources().getColor(C0966R.color.al_));
            } else {
                this.f65602c.setTextColor(mMActivity.getResources().getColor(C0966R.color.f3197in));
                this.f65601b.setBackgroundColor(mMActivity.getResources().getColor(C0966R.color.al6));
            }
        } else {
            this.f65602c.setVisibility(8);
        }
        View findViewById = this.f65601b.findViewById(C0966R.C0970id.ax4);
        if (((CardDetailUIContoller) this.f65616a).f51798f.mo35440n()) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f65603d.setText(mMActivity.getString(C0966R.string.f360231b12));
            this.f65603d.setTextColor(mMActivity.getResources().getColor(C0966R.color.al_));
            int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3926j6);
            Button button = (Button) this.f65601b.findViewById(C0966R.C0970id.awm);
            ShapeDrawable l = C22945n.m27012l(mMActivity, mMActivity.getResources().getColor(C0966R.color.al6), dimensionPixelOffset);
            ShapeDrawable n = C22945n.m27014n(mMActivity, mMActivity.getResources().getColor(C0966R.color.al6), dimensionPixelOffset);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, n);
            stateListDrawable.addState(new int[0], l);
            button.setBackgroundDrawable(stateListDrawable);
            int[] iArr = {C22945n.m27004d(cVar.mo23264L0().f64145p), mMActivity.getResources().getColor(C0966R.color.al6)};
            button.setTextColor(new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[0]}, iArr));
            button.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
            View findViewById2 = this.f65601b.findViewById(C0966R.C0970id.gtm);
            View findViewById3 = this.f65601b.findViewById(C0966R.C0970id.f357627av2);
            if (cVar.mo23264L0().f64126U == 1) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view4 = findViewById3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view5 = findViewById2;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view6 = findViewById3;
            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(8);
        View view7 = findViewById;
        C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
