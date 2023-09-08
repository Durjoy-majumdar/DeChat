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
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.voip.video.NewMovableVideoView */
public class NewMovableVideoView extends VoIPRenderTextureView {

    /* renamed from: d */
    public int f318108d = C0947jz.f2205e;

    /* renamed from: e */
    public int f318109e = 240;

    /* renamed from: f */
    public float f318110f;

    /* renamed from: g */
    public float f318111g;

    /* renamed from: h */
    public int f318112h = 800;

    /* renamed from: i */
    public int f318113i = 480;

    /* renamed from: j */
    public long f318114j;

    /* renamed from: n */
    public int f318115n = 0;

    /* renamed from: o */
    public int f318116o = 0;

    /* renamed from: p */
    public View.OnClickListener f318117p;

    public NewMovableVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public void mo153096b(int i, int i2) {
        mo153097d(i, i2);
    }

    /* renamed from: d */
    public void mo153097d(int i, int i2) {
        this.f318108d = i;
        this.f318109e = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (this.f318115n == 0) {
            this.f318115n = windowManager.getDefaultDisplay().getWidth();
            this.f318116o = windowManager.getDefaultDisplay().getHeight();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(21, -1);
        int b = C76577a.m92151b(getContext(), 12) + C76912y0.m92764c(getContext());
        layoutParams.topMargin = b;
        layoutParams.rightMargin = b - C76912y0.m92764c(getContext());
        setLayoutParams(layoutParams);
        this.f318112h = this.f318116o - this.f318109e;
        this.f318113i = this.f318115n - this.f318108d;
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    }

    /* renamed from: e */
    public void mo153098e(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i2);
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.addRule(21, -1);
        this.f318108d = i;
        this.f318109e = i2;
        setLayoutParams(layoutParams2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        Log.m105918d("MicroMsg.MovableVideoView", "event: " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f318114j;
                if (j != 0 && currentTimeMillis - j < 300 && currentTimeMillis - j >= 0 && (onClickListener = this.f318117p) != null) {
                    onClickListener.onClick(this);
                }
                C115669n.INSTANCE.mo160131h(11079, 2);
            } else if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f318110f;
                float rawY = motionEvent.getRawY() - this.f318111g;
                if (Math.abs(rawX) > 1.0f || Math.abs(rawY) > 1.0f) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                    int i2 = (int) (((float) layoutParams.rightMargin) - rawX);
                    int i3 = (int) (((float) layoutParams.topMargin) + rawY);
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int i4 = this.f318113i;
                        if (i2 > i4) {
                            i2 = i4;
                        }
                    }
                    layoutParams.rightMargin = i2;
                    if (i3 >= 0 && i3 <= (i = this.f318112h)) {
                        i = i3;
                    }
                    layoutParams.topMargin = i;
                    setLayoutParams(layoutParams);
                    this.f318110f = motionEvent.getRawX();
                    this.f318111g = motionEvent.getRawY();
                }
            }
        } else {
            this.f318110f = motionEvent.getRawX();
            this.f318111g = motionEvent.getRawY();
            this.f318114j = System.currentTimeMillis();
        }
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f318117p = onClickListener;
    }
}
