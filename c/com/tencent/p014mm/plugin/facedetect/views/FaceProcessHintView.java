package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.model.C115423k;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceProcessHintView */
public class FaceProcessHintView extends LinearLayout {

    /* renamed from: d */
    public C115423k f12407d;

    /* renamed from: e */
    public Animation f12408e;

    public FaceProcessHintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setCurrentProcessing(int i) {
        TextView textView = (TextView) getChildAt(i).findViewById(C0966R.C0970id.bxq);
        textView.setTextColor(getResources().getColor(C0966R.color.al6));
        textView.setBackgroundResource(C0966R.C0969drawable.f4967so);
    }

    public void setDataAndInvalidate(C115423k kVar) {
        this.f12407d = kVar;
        if (kVar == null || kVar.f345976c <= 0) {
            Log.m105920e("MicroMsg.FaceProcessHintView", "hy: model invalid");
            return;
        }
        removeAllViews();
        int i = 0;
        while (i < this.f12407d.f345976c) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5y, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            i++;
            ((TextView) inflate.findViewById(C0966R.C0970id.bxq)).setText("" + i);
            addView(inflate, layoutParams);
        }
        View findViewById = getChildAt(getChildCount() - 1).findViewById(C0966R.C0970id.cqm);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setCurrentProcessing(0);
        invalidate();
    }

    public FaceProcessHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12407d = null;
        this.f12408e = null;
        setOrientation(0);
        setMinimumHeight(BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 36.0f));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2385bm);
        this.f12408e = loadAnimation;
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
    }
}
