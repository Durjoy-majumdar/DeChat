package dx1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: dx1.a */
public final class C45485a implements C10461a {

    /* renamed from: a */
    public final MMDotView f123111a;

    /* renamed from: b */
    public final MMFlipper f123112b;

    /* renamed from: c */
    public final ImageView f123113c;

    public C45485a(LinearLayout linearLayout, LinearLayout linearLayout2, MMDotView mMDotView, MMFlipper mMFlipper, ImageView imageView) {
        this.f123111a = mMDotView;
        this.f123112b = mMFlipper;
        this.f123113c = imageView;
    }

    /* renamed from: a */
    public static C45485a m50450a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0966R.C0971layout.cjw, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0966R.C0970id.lx5;
        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.lx5);
        if (linearLayout != null) {
            i = C0966R.C0970id.lx6;
            MMDotView mMDotView = (MMDotView) C10462b.m10395a(inflate, C0966R.C0970id.lx6);
            if (mMDotView != null) {
                i = C0966R.C0970id.lx7;
                MMFlipper mMFlipper = (MMFlipper) C10462b.m10395a(inflate, C0966R.C0970id.lx7);
                if (mMFlipper != null) {
                    i = C0966R.C0970id.f359496lx1;
                    ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f359496lx1);
                    if (imageView != null) {
                        return new C45485a((LinearLayout) inflate, linearLayout, mMDotView, mMFlipper, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
