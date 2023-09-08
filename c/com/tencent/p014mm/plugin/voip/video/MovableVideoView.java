package com.tencent.p014mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.voip.video.MovableVideoView */
public class MovableVideoView extends OpenGlView {

    /* renamed from: A */
    public long f117103A;

    /* renamed from: B */
    public int f117104B = 0;

    /* renamed from: C */
    public int f117105C = 0;

    /* renamed from: D */
    public View.OnClickListener f117106D;

    /* renamed from: u */
    public int f117107u = C0947jz.f2205e;

    /* renamed from: v */
    public int f117108v = 240;

    /* renamed from: w */
    public float f117109w;

    /* renamed from: x */
    public float f117110x;

    /* renamed from: y */
    public int f117111y = 800;

    /* renamed from: z */
    public int f117112z = 480;

    public MovableVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: f */
    public void mo67520f(int i, int i2) {
        this.f117107u = i;
        this.f117108v = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (this.f117104B == 0) {
            this.f117104B = windowManager.getDefaultDisplay().getWidth();
            this.f117105C = windowManager.getDefaultDisplay().getHeight();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(21, -1);
        int b = C76577a.m92151b(getContext(), 12) + C76912y0.m92764c(getContext());
        layoutParams.topMargin = b;
        layoutParams.rightMargin = b - C76912y0.m92764c(getContext());
        setLayoutParams(layoutParams);
        this.f117111y = this.f117105C - this.f117108v;
        this.f117112z = this.f117104B - this.f117107u;
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
                long j = this.f117103A;
                if (j != 0 && currentTimeMillis - j < 300 && currentTimeMillis - j >= 0 && (onClickListener = this.f117106D) != null) {
                    onClickListener.onClick(this);
                }
                C115669n.INSTANCE.mo160131h(11079, 2);
            } else if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f117109w;
                float rawY = motionEvent.getRawY() - this.f117110x;
                if (Math.abs(rawX) > 1.0f || Math.abs(rawY) > 1.0f) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                    int i2 = (int) (((float) layoutParams.rightMargin) - rawX);
                    int i3 = (int) (((float) layoutParams.topMargin) + rawY);
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int i4 = this.f117112z;
                        if (i2 > i4) {
                            i2 = i4;
                        }
                    }
                    layoutParams.rightMargin = i2;
                    if (i3 >= 0 && i3 <= (i = this.f117111y)) {
                        i = i3;
                    }
                    layoutParams.topMargin = i;
                    setLayoutParams(layoutParams);
                    this.f117109w = motionEvent.getRawX();
                    this.f117110x = motionEvent.getRawY();
                }
            }
        } else {
            this.f117109w = motionEvent.getRawX();
            this.f117110x = motionEvent.getRawY();
            this.f117103A = System.currentTimeMillis();
        }
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f117106D = onClickListener;
    }
}
