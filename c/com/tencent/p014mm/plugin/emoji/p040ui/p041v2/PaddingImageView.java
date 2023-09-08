package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView */
public class PaddingImageView extends FrameLayout {

    /* renamed from: d */
    public ImageView f268947d;

    /* renamed from: e */
    public ImageView f268948e;

    /* renamed from: f */
    public int f268949f;

    public PaddingImageView(Context context) {
        super(context);
        mo127873a(context);
    }

    /* renamed from: a */
    public final void mo127873a(Context context) {
        this.f268949f = C76577a.m92157h(getContext(), C0966R.dimen.f3926j6);
        ImageView imageView = new ImageView(context);
        this.f268947d = imageView;
        int i = this.f268949f;
        imageView.setPadding(i, i, i, i);
        this.f268948e = new ImageView(context);
    }

    public ImageView getImageView() {
        return this.f268947d;
    }

    public ImageView getImageViewFG() {
        return this.f268948e;
    }

    public PaddingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo127873a(context);
    }

    public PaddingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo127873a(context);
    }
}
