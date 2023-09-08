package nh1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.t */
public final class C61750t implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175537a;

    public C61750t(RelativeLayout relativeLayout, TextView textView, FrameLayout frameLayout, RelativeLayout relativeLayout2, ImageView imageView) {
        this.f175537a = relativeLayout;
    }

    /* renamed from: a */
    public static C61750t m72433a(View view) {
        int i = C0966R.C0970id.f357800bu0;
        TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.f357800bu0);
        if (textView != null) {
            i = C0966R.C0970id.ney;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(view, C0966R.C0970id.ney);
            if (frameLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C0966R.C0970id.ngx;
                ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.ngx);
                if (imageView != null) {
                    return new C61750t(relativeLayout, textView, frameLayout, relativeLayout, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
