package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;
import pj3.C11943f;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.preference.ImagePreference */
public final class ImagePreference extends Preference {

    /* renamed from: J */
    public ImageView f24266J;

    /* renamed from: K */
    public C11943f f24267K;

    public ImagePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f24266J = imageView;
        C11943f fVar = this.f24267K;
        if (imageView == null) {
            fVar.getClass();
        } else if (fVar.f34877a != -1) {
            imageView.setImageDrawable(C76577a.m92158i(imageView.getContext(), fVar.f34877a));
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.bs4);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bed, viewGroup2);
        return x;
    }

    public ImagePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24266J = null;
        this.f24267K = new C11943f();
        this.f121271G = C0966R.C0971layout.bed;
        this.f121272H = C0966R.C0971layout.f359893bf2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226863i);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            C11943f fVar = this.f24267K;
            fVar.f34877a = resourceId;
            ImageView imageView = this.f24266J;
            if (!(imageView == null || resourceId == -1)) {
                imageView.setImageDrawable(C76577a.m92158i(imageView.getContext(), fVar.f34877a));
            }
        }
        obtainStyledAttributes.recycle();
    }
}
