package bt0;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;

public class b$$k extends b$$h {

    /* renamed from: a */
    public final /* synthetic */ C79808b f233915a;

    public b$$k(C79808b bVar, b$$d b__d) {
        this.f233915a = bVar;
    }

    /* renamed from: a */
    public int mo109966a() {
        return C0966R.dimen.f4063q_;
    }

    /* renamed from: d */
    public void mo109969d(ImageView imageView, ImageView imageView2, View view, View view2) {
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(C0966R.C0969drawable.col);
            imageView.setColorFilter(this.f233915a.f233899r, PorterDuff.Mode.SRC_ATOP);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.width = this.f233915a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4055q1);
            marginLayoutParams.height = this.f233915a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4054q0);
            marginLayoutParams.leftMargin = this.f233915a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4063q_);
            marginLayoutParams.rightMargin = this.f233915a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4065qb);
            imageView.setLayoutParams(marginLayoutParams);
        }
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.leftMargin = 0;
            marginLayoutParams2.rightMargin = 0;
            view.setLayoutParams(marginLayoutParams2);
        }
    }
}
