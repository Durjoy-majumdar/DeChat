package nh1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.a */
public final class C11164a implements C10461a {

    /* renamed from: a */
    public final TextView f32949a;

    /* renamed from: b */
    public final MMEditText f32950b;

    /* renamed from: c */
    public final TextView f32951c;

    /* renamed from: d */
    public final TextView f32952d;

    public C11164a(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, MMEditText mMEditText, FrameLayout frameLayout, TextView textView2, TextView textView3) {
        this.f32949a = textView;
        this.f32950b = mMEditText;
        this.f32951c = textView2;
        this.f32952d = textView3;
    }

    /* renamed from: a */
    public static C11164a m11042a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0966R.C0971layout.afx, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0966R.C0970id.fpj;
        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.fpj);
        if (textView != null) {
            i = C0966R.C0970id.fpk;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.fpk);
            if (linearLayout != null) {
                i = C0966R.C0970id.fpl;
                MMEditText mMEditText = (MMEditText) C10462b.m10395a(inflate, C0966R.C0970id.fpl);
                if (mMEditText != null) {
                    i = C0966R.C0970id.fpm;
                    FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.fpm);
                    if (frameLayout != null) {
                        i = C0966R.C0970id.fpn;
                        TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.fpn);
                        if (textView2 != null) {
                            i = C0966R.C0970id.fpq;
                            TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.fpq);
                            if (textView3 != null) {
                                return new C11164a((LinearLayout) inflate, textView, linearLayout, mMEditText, frameLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
