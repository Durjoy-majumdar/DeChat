package com.tencent.p014mm.plugin.flash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashProcessLayout */
public class FaceFlashProcessLayout extends RelativeLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f18888q = 0;

    /* renamed from: d */
    public FaceFlashUI f18889d;

    /* renamed from: e */
    public TextView f18890e;

    /* renamed from: f */
    public TextView f18891f;

    /* renamed from: g */
    public WeImageView f18892g;

    /* renamed from: h */
    public ImageView f18893h;

    /* renamed from: i */
    public Button f18894i;

    /* renamed from: j */
    public TextView f18895j;

    /* renamed from: n */
    public Animation f18896n;

    /* renamed from: o */
    public Animation f18897o;

    /* renamed from: p */
    public Animation f18898p;

    public FaceFlashProcessLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo5236a() {
        Log.m105924i("MicroMsg.FaceFlashManager", "showSuccessAnimation");
        findViewById(C0966R.C0970id.ija).setPadding(0, C75044y4.m89989a(getContext()), 0, 0);
        this.f18890e.setText(C76577a.m92166q(getContext(), C0966R.string.ckx));
        this.f18893h.setImageResource(C0966R.C0969drawable.f4964sl);
        this.f18892g.setImageDrawable(C76577a.m92158i(getContext(), C0966R.raw.icons_filled_done3));
        this.f18892g.startAnimation(this.f18897o);
        this.f18893h.startAnimation(this.f18896n);
        this.f18894i.setVisibility(4);
    }

    public FaceFlashProcessLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f18889d = (FaceFlashUI) getContext();
        this.f18896n = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2379bg);
        this.f18897o = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2381bi);
        this.f18898p = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2380bh);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5q, this, true);
        this.f18890e = (TextView) findViewById(C0966R.C0970id.cq4);
        this.f18891f = (TextView) findViewById(C0966R.C0970id.f357961cq1);
        this.f18892g = (WeImageView) findViewById(C0966R.C0970id.f357962cq2);
        this.f18894i = (Button) findViewById(C0966R.C0970id.cpx);
        this.f18895j = (TextView) findViewById(C0966R.C0970id.cpw);
        this.f18893h = (ImageView) findViewById(C0966R.C0970id.f357960cq0);
    }
}
