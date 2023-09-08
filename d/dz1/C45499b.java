package dz1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: dz1.b */
public final class C45499b implements C10461a {

    /* renamed from: a */
    public final LinearLayout f123147a;

    /* renamed from: b */
    public final ImageView f123148b;

    /* renamed from: c */
    public final TextView f123149c;

    /* renamed from: d */
    public final TextView f123150d;

    /* renamed from: e */
    public final View f123151e;

    /* renamed from: f */
    public final View f123152f;

    /* renamed from: g */
    public final WeImageView f123153g;

    /* renamed from: h */
    public final TextView f123154h;

    /* renamed from: i */
    public final TextView f123155i;

    /* renamed from: j */
    public final TextView f123156j;

    public C45499b(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, View view, View view2, WeImageView weImageView, TextView textView3, TextView textView4, TextView textView5) {
        this.f123147a = linearLayout;
        this.f123148b = imageView;
        this.f123149c = textView;
        this.f123150d = textView2;
        this.f123151e = view;
        this.f123152f = view2;
        this.f123153g = weImageView;
        this.f123154h = textView3;
        this.f123155i = textView4;
        this.f123156j = textView5;
    }

    /* renamed from: a */
    public static C45499b m50457a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0966R.C0971layout.ay8, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0966R.C0970id.a1r;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.a1r);
        if (imageView != null) {
            i = C0966R.C0970id.btb;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.btb);
            if (textView != null) {
                i = C0966R.C0970id.f357849c24;
                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f357849c24);
                if (textView2 != null) {
                    i = C0966R.C0970id.c88;
                    View a = C10462b.m10395a(inflate, C0966R.C0970id.c88);
                    if (a != null) {
                        i = C0966R.C0970id.c89;
                        View a2 = C10462b.m10395a(inflate, C0966R.C0970id.c89);
                        if (a2 != null) {
                            i = C0966R.C0970id.isw;
                            WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.isw);
                            if (weImageView != null) {
                                i = C0966R.C0970id.kkm;
                                TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkm);
                                if (textView3 != null) {
                                    i = C0966R.C0970id.km8;
                                    TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km8);
                                    if (textView4 != null) {
                                        i = C0966R.C0970id.km9;
                                        TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km9);
                                        if (textView5 != null) {
                                            return new C45499b((LinearLayout) inflate, imageView, textView, textView2, a, a2, weImageView, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
