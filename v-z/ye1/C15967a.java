package ye1;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.a */
public final class C15967a implements C10461a {

    /* renamed from: a */
    public final ConstraintLayout f42863a;

    /* renamed from: b */
    public final TextView f42864b;

    public C15967a(ConstraintLayout constraintLayout, TextView textView, WeImageView weImageView, TextView textView2) {
        this.f42863a = constraintLayout;
        this.f42864b = textView;
    }

    /* renamed from: a */
    public static C15967a m14885a(View view) {
        int i = C0966R.C0970id.d5l;
        TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.d5l);
        if (textView != null) {
            i = C0966R.C0970id.f15;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.f15);
            if (weImageView != null) {
                i = C0966R.C0970id.khj;
                TextView textView2 = (TextView) C10462b.m10395a(view, C0966R.C0970id.khj);
                if (textView2 != null) {
                    return new C15967a((ConstraintLayout) view, textView, weImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
