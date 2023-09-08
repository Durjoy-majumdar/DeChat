package cs0;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import uo3.C78253a;

/* renamed from: cs0.p */
public final class C45188p extends C78253a {

    /* renamed from: R */
    public final /* synthetic */ View f122501R;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45188p(View view, Context context) {
        super(context);
        this.f122501R = view;
    }

    /* renamed from: m */
    public boolean mo70679m() {
        ViewParent parent = this.f122501R.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f122501R.setBackgroundResource(C0966R.C0969drawable.f4476do);
        return mo71743n(0, 0);
    }

    public void onDismiss() {
        ViewParent parent = this.f122501R.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f122501R.setBackgroundResource(C0966R.color.ahf);
        super.onDismiss();
    }
}
