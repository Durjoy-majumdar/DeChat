package ap1;

import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C75044y4;

/* renamed from: ap1.a */
public final class C0197a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f672d;

    public C0197a(ViewGroup viewGroup) {
        this.f672d = viewGroup;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams = this.f672d.getLayoutParams();
        Integer num = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            ViewGroup.LayoutParams layoutParams2 = this.f672d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                num = Integer.valueOf(marginLayoutParams2.topMargin + C75044y4.m89994f(this.f672d.getContext()));
            }
            marginLayoutParams.topMargin = num.intValue();
        }
    }
}
