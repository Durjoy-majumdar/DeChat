package ye1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.o */
public final class C15976o implements C10461a {

    /* renamed from: a */
    public final LinearLayout f42957a;

    /* renamed from: b */
    public final FrameLayout f42958b;

    /* renamed from: c */
    public final TextView f42959c;

    /* renamed from: d */
    public final TextView f42960d;

    /* renamed from: e */
    public final FrameLayout f42961e;

    /* renamed from: f */
    public final LinearLayout f42962f;

    /* renamed from: g */
    public final FrameLayout f42963g;

    /* renamed from: h */
    public final LinearLayout f42964h;

    /* renamed from: i */
    public final WeImageView f42965i;

    public C15976o(FrameLayout frameLayout, FrameLayout frameLayout2, WeImageView weImageView, LinearLayout linearLayout, WeImageView weImageView2, FrameLayout frameLayout3, TextView textView, TextView textView2, FrameLayout frameLayout4, LinearLayout linearLayout2, WeImageView weImageView3, TextView textView3, FrameLayout frameLayout5, LinearLayout linearLayout3, WeImageView weImageView4) {
        this.f42957a = linearLayout;
        this.f42958b = frameLayout3;
        this.f42959c = textView;
        this.f42960d = textView2;
        this.f42961e = frameLayout4;
        this.f42962f = linearLayout2;
        this.f42963g = frameLayout5;
        this.f42964h = linearLayout3;
        this.f42965i = weImageView4;
    }

    /* renamed from: a */
    public static C15976o m14888a(View view) {
        View view2 = view;
        int i = C0966R.C0970id.f5375dg;
        FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(view2, C0966R.C0970id.f5375dg);
        if (frameLayout != null) {
            i = C0966R.C0970id.a2z;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.a2z);
            if (weImageView != null) {
                i = C0966R.C0970id.f357485a33;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.f357485a33);
                if (linearLayout != null) {
                    i = C0966R.C0970id.m1n;
                    WeImageView weImageView2 = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.m1n);
                    if (weImageView2 != null) {
                        i = C0966R.C0970id.m1o;
                        FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(view2, C0966R.C0970id.m1o);
                        if (frameLayout2 != null) {
                            i = C0966R.C0970id.ege;
                            TextView textView = (TextView) C10462b.m10395a(view2, C0966R.C0970id.ege);
                            if (textView != null) {
                                i = C0966R.C0970id.nn_;
                                TextView textView2 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.nn_);
                                if (textView2 != null) {
                                    FrameLayout frameLayout3 = (FrameLayout) view2;
                                    i = C0966R.C0970id.gz9;
                                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.gz9);
                                    if (linearLayout2 != null) {
                                        i = C0966R.C0970id.gz_;
                                        WeImageView weImageView3 = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.gz_);
                                        if (weImageView3 != null) {
                                            i = C0966R.C0970id.miq;
                                            TextView textView3 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.miq);
                                            if (textView3 != null) {
                                                i = C0966R.C0970id.hwo;
                                                FrameLayout frameLayout4 = (FrameLayout) C10462b.m10395a(view2, C0966R.C0970id.hwo);
                                                if (frameLayout4 != null) {
                                                    i = C0966R.C0970id.ncr;
                                                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.ncr);
                                                    if (linearLayout3 != null) {
                                                        i = C0966R.C0970id.ncs;
                                                        WeImageView weImageView4 = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.ncs);
                                                        if (weImageView4 != null) {
                                                            return new C15976o(frameLayout3, frameLayout, weImageView, linearLayout, weImageView2, frameLayout2, textView, textView2, frameLayout3, linearLayout2, weImageView3, textView3, frameLayout4, linearLayout3, weImageView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
