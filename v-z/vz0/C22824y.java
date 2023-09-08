package vz0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.C18609n0;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import wz0.C22945n;

/* renamed from: vz0.y */
public class C22824y extends C22821l {

    /* renamed from: b */
    public View f65622b;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65622b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f65622b == null) {
            this.f65622b = ((ViewStub) mo35969b(C0966R.C0970id.awb)).inflate();
        }
        C18609n0 n0Var = this.f65616a;
        C20483c cVar = ((CardDetailUIContoller) n0Var).f51776E;
        MMActivity mMActivity = ((CardDetailUIContoller) n0Var).f51797e;
        C22498fy fyVar = cVar.mo23263J0().f63959x;
        View view = this.f65622b;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.awc);
            textView.setText(fyVar.f63884d);
            textView.setTextColor(C22945n.m27004d(cVar.mo23264L0().f64145p));
            TextView textView2 = (TextView) this.f65622b.findViewById(C0966R.C0970id.awa);
            LinearLayout linearLayout = (LinearLayout) this.f65622b.findViewById(C0966R.C0970id.axt);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (cVar.mo23291o()) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                if (!TextUtils.isEmpty(fyVar.f63886f)) {
                    textView2.setText(fyVar.f63886f);
                    textView2.setVisibility(0);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f4228ww);
                    layoutParams2.bottomMargin = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                    layoutParams3.topMargin = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
                    textView2.setLayoutParams(layoutParams3);
                    textView2.invalidate();
                } else {
                    textView2.setVisibility(8);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f4229wx);
                }
                layoutParams2.height = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4230wy);
                textView.setLayoutParams(layoutParams2);
                textView.invalidate();
                int dimensionPixelSize = mMActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4232x0);
                String str = cVar.mo23264L0().f64145p;
                ShapeDrawable l = C22945n.m27012l(mMActivity, C22945n.m27004d(str), dimensionPixelSize);
                ShapeDrawable n = C22945n.m27014n(mMActivity, C22945n.m27004d(str), dimensionPixelSize);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, n);
                stateListDrawable.addState(new int[0], l);
                textView.setBackgroundDrawable(stateListDrawable);
                int[] iArr = {mMActivity.getResources().getColor(C0966R.color.al_), C22945n.m27004d(cVar.mo23264L0().f64145p)};
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[0]}, iArr));
                linearLayout.setBackgroundDrawable((Drawable) null);
                textView.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
            } else {
                if (!TextUtils.isEmpty(fyVar.f63886f)) {
                    textView2.setText(fyVar.f63886f);
                    textView2.setVisibility(0);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f4240x_);
                } else {
                    textView2.setVisibility(8);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f4241xa);
                }
                linearLayout.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.invalidate();
            this.f65622b.invalidate();
            if (cVar.mo23291o()) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            }
        }
    }
}
