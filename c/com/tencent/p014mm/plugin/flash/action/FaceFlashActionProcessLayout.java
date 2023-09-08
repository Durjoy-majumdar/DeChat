package com.tencent.p014mm.plugin.flash.action;

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
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout */
public class FaceFlashActionProcessLayout extends RelativeLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f18966t = 0;

    /* renamed from: d */
    public FaceFlashActionUI f18967d;

    /* renamed from: e */
    public TextView f18968e;

    /* renamed from: f */
    public WeImageView f18969f;

    /* renamed from: g */
    public ImageView f18970g;

    /* renamed from: h */
    public Button f18971h;

    /* renamed from: i */
    public Button f18972i;

    /* renamed from: j */
    public TextView f18973j;

    /* renamed from: n */
    public RelativeLayout f18974n;

    /* renamed from: o */
    public float f18975o;

    /* renamed from: p */
    public boolean f18976p;

    /* renamed from: q */
    public Animation f18977q;

    /* renamed from: r */
    public Animation f18978r;

    /* renamed from: s */
    public Animation f18979s;

    public FaceFlashActionProcessLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo5269a(int i) {
        Log.m105924i("MicroMsg.FaceFlashActionProcessLayout", "showSuccessAnimation");
        if (this.f18976p) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18974n.getLayoutParams();
            layoutParams.removeRule(3);
            int o = i - C85875k4.m106198o(getContext());
            float f = this.f18975o;
            double d = ((double) o) * 0.5d;
            if (((double) ((int) f)) > d) {
                layoutParams.topMargin = ((int) d) - C76577a.m92151b(MMApplicationContext.getContext(), 100);
            } else {
                layoutParams.topMargin = ((int) f) - C76577a.m92151b(MMApplicationContext.getContext(), 100);
            }
            this.f18974n.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f18974n.getLayoutParams();
            layoutParams2.addRule(3, C0966R.C0970id.cq4);
            layoutParams2.topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 48);
            this.f18974n.setLayoutParams(layoutParams2);
        }
        this.f18968e.setText(C76577a.m92166q(getContext(), C0966R.string.ckx));
        this.f18970g.setImageResource(C0966R.C0969drawable.f4964sl);
        this.f18969f.setImageDrawable(C76577a.m92158i(getContext(), C0966R.raw.icons_filled_done3));
        this.f18969f.startAnimation(this.f18978r);
        this.f18970g.startAnimation(this.f18977q);
        this.f18971h.setVisibility(4);
        this.f18972i.setVisibility(4);
        this.f18973j.setVisibility(4);
    }

    public void setCircleY(float f) {
        this.f18975o = f;
    }

    public FaceFlashActionProcessLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f18967d = (FaceFlashActionUI) getContext();
        this.f18977q = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2379bg);
        this.f18978r = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2381bi);
        this.f18979s = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2380bh);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5l, this, true);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cq4);
        this.f18968e = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f18969f = (WeImageView) findViewById(C0966R.C0970id.f357962cq2);
        this.f18971h = (Button) findViewById(C0966R.C0970id.cpx);
        this.f18973j = (TextView) findViewById(C0966R.C0970id.cpw);
        this.f18970g = (ImageView) findViewById(C0966R.C0970id.f357960cq0);
        this.f18972i = (Button) findViewById(C0966R.C0970id.cpv);
        this.f18974n = (RelativeLayout) findViewById(C0966R.C0970id.f357963cq3);
    }
}
