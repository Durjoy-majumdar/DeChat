package com.tencent.p014mm.plugin.voip.video.p806cs;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.video.OpenGlView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.voip.video.cs.MovableVideoView */
public class MovableVideoView extends OpenGlView {

    /* renamed from: A */
    public long f117113A;

    /* renamed from: B */
    public int f117114B = 0;

    /* renamed from: C */
    public int f117115C = 0;

    /* renamed from: D */
    public View.OnClickListener f117116D;

    /* renamed from: u */
    public int f117117u = C0947jz.f2205e;

    /* renamed from: v */
    public int f117118v = 240;

    /* renamed from: w */
    public float f117119w;

    /* renamed from: x */
    public float f117120x;

    /* renamed from: y */
    public int f117121y = 800;

    /* renamed from: z */
    public int f117122z = 480;

    public MovableVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: f */
    public void mo67520f(int i, int i2) {
        mo67523h(i, i2);
    }

    /* renamed from: h */
    public void mo67523h(int i, int i2) {
        this.f117117u = i;
        this.f117118v = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (this.f117114B == 0) {
            this.f117114B = windowManager.getDefaultDisplay().getWidth();
            this.f117115C = windowManager.getDefaultDisplay().getHeight();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(21, -1);
        int b = C76577a.m92151b(getContext(), 12) + C76912y0.m92764c(getContext());
        layoutParams.topMargin = b;
        layoutParams.rightMargin = b - C76912y0.m92764c(getContext());
        setLayoutParams(layoutParams);
        this.f117121y = this.f117115C - this.f117118v;
        this.f117122z = this.f117114B - this.f117117u;
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        Log.m105918d("MicroMsg.MovableVideoView", "event: " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f117113A;
                if (j != 0 && currentTimeMillis - j < 300 && currentTimeMillis - j >= 0 && (onClickListener = this.f117116D) != null) {
                    onClickListener.onClick(this);
                }
                C115669n.INSTANCE.mo160131h(11079, 2);
            } else if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f117119w;
                float rawY = motionEvent.getRawY() - this.f117120x;
                if (Math.abs(rawX) > 1.0f || Math.abs(rawY) > 1.0f) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                    int i2 = (int) (((float) layoutParams.rightMargin) - rawX);
                    int i3 = (int) (((float) layoutParams.topMargin) + rawY);
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int i4 = this.f117122z;
                        if (i2 > i4) {
                            i2 = i4;
                        }
                    }
                    layoutParams.rightMargin = i2;
                    if (i3 >= 0 && i3 <= (i = this.f117121y)) {
                        i = i3;
                    }
                    layoutParams.topMargin = i;
                    setLayoutParams(layoutParams);
                    this.f117119w = motionEvent.getRawX();
                    this.f117120x = motionEvent.getRawY();
                }
            }
        } else {
            this.f117119w = motionEvent.getRawX();
            this.f117120x = motionEvent.getRawY();
            this.f117113A = System.currentTimeMillis();
        }
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f117116D = onClickListener;
    }
}
