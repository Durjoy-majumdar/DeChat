package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fav.ui.o */
public class C93680o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C93687q f270465d;

    public C93680o(C93687q qVar) {
        this.f270465d = qVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f270465d.f270474b != null) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f270465d.f270474b.getLayoutParams();
            C93687q qVar = this.f270465d;
            layoutParams.leftMargin = (int) (((float) qVar.f270480h) * floatValue);
            layoutParams.topMargin = (int) (((float) qVar.f270481i) * floatValue);
            C93687q qVar2 = this.f270465d;
            layoutParams.rightMargin = (int) (((((float) qVar.f270475c.getWidth()) * floatValue) - (((float) qVar2.f270478f) * floatValue)) - ((float) layoutParams.leftMargin));
            C93687q qVar3 = this.f270465d;
            layoutParams.bottomMargin = (int) (((((float) qVar2.f270475c.getHeight()) * floatValue) - (((float) qVar3.f270479g) * floatValue)) - ((float) layoutParams.topMargin));
            qVar3.f270474b.setLayoutParams(layoutParams);
            Log.m105919d("MicroMsg.FavDragLogic", "onAnimationUpdate leftMargin:%s, topMargin:%s, rightMargin:%s, bottomMargin:%s", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin), Integer.valueOf(layoutParams.bottomMargin));
            C93687q.C93688a aVar = this.f270465d.f270477e;
            if (aVar != null && aVar.mo127461g4() != null) {
                MultiTouchImageView g4 = this.f270465d.f270477e.mo127461g4();
                float f = 1.0f - floatValue;
                g4.setTranslationX(this.f270465d.f270484l * f);
                g4.setTranslationY(this.f270465d.f270485m * f);
                g4.setScaleX((this.f270465d.f270482j * f) + floatValue);
                g4.setScaleY((this.f270465d.f270483k * f) + floatValue);
                this.f270465d.f270476d.setAlpha(f);
                Log.m105919d("MicroMsg.FavDragLogic", "onAnimationUpdate value:%s TranslationX:%s, TranslationY:%s, ScaleX:%s, ScaleY:%s", Float.valueOf(floatValue), Float.valueOf(this.f270465d.f270484l * f), Float.valueOf(this.f270465d.f270485m * f), Float.valueOf((this.f270465d.f270482j * f) + floatValue), Float.valueOf((f * this.f270465d.f270483k) + floatValue));
            }
        }
    }
}
