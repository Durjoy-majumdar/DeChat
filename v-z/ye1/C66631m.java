package ye1;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.m */
public final class C66631m implements C10461a {

    /* renamed from: a */
    public final LinearLayout f191596a;

    /* renamed from: b */
    public final ImageView f191597b;

    /* renamed from: c */
    public final ImageView f191598c;

    /* renamed from: d */
    public final TextView f191599d;

    /* renamed from: e */
    public final WeImageView f191600e;

    /* renamed from: f */
    public final TextView f191601f;

    public C66631m(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView, WeImageView weImageView, TextView textView2) {
        this.f191596a = linearLayout;
        this.f191597b = imageView;
        this.f191598c = imageView2;
        this.f191599d = textView;
        this.f191600e = weImageView;
        this.f191601f = textView2;
    }

    /* renamed from: a */
    public static C66631m m78605a(View view) {
        int i = C0966R.C0970id.a1p;
        ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.a1p);
        if (imageView != null) {
            i = C0966R.C0970id.buo;
            ImageView imageView2 = (ImageView) C10462b.m10395a(view, C0966R.C0970id.buo);
            if (imageView2 != null) {
                i = C0966R.C0970id.da7;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view, C0966R.C0970id.da7);
                if (linearLayout != null) {
                    i = C0966R.C0970id.fnp;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.fnp);
                    if (textView != null) {
                        i = C0966R.C0970id.fnu;
                        WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.fnu);
                        if (weImageView != null) {
                            i = C0966R.C0970id.hfm;
                            TextView textView2 = (TextView) C10462b.m10395a(view, C0966R.C0970id.hfm);
                            if (textView2 != null) {
                                return new C66631m((LinearLayout) view, imageView, imageView2, linearLayout, textView, weImageView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
