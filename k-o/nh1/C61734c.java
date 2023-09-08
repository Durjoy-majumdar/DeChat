package nh1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.c */
public final class C61734c implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175448a;

    public C61734c(RelativeLayout relativeLayout, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, RelativeLayout relativeLayout2) {
        this.f175448a = relativeLayout;
    }

    /* renamed from: a */
    public static C61734c m72427a(View view) {
        int i = C0966R.C0970id.f5845q7;
        FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(view, C0966R.C0970id.f5845q7);
        if (frameLayout != null) {
            i = C0966R.C0970id.f357800bu0;
            TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.f357800bu0);
            if (textView != null) {
                i = C0966R.C0970id.dqo;
                FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(view, C0966R.C0970id.dqo);
                if (frameLayout2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new C61734c(relativeLayout, frameLayout, textView, frameLayout2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
