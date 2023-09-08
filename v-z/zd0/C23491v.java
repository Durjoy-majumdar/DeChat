package zd0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;
import at0.C79630a;
import com.tencent.p014mm.C0966R;

/* renamed from: zd0.v */
public final class C23491v extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C23466p f67387d;

    public C23491v(C23466p pVar) {
        this.f67387d = pVar;
    }

    public void onAnimationEnd(Animator animator) {
        View findViewById;
        C23466p pVar = this.f67387d;
        Integer num = pVar.f67309F;
        if (!(num == null || (findViewById = pVar.f67337t.findViewById(num.intValue())) == null)) {
            ((LinearLayout) pVar.f67337t.findViewById(C0966R.C0970id.f357785br0)).removeView(findViewById);
        }
        C79630a.m96708a(this.f67387d.f67327g);
    }
}
