package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter */
public class VoicePrintVolumeMeter extends View {

    /* renamed from: s */
    public static int f347534s = Color.rgb(210, 240, 200);

    /* renamed from: t */
    public static int f347535t = 100;

    /* renamed from: u */
    public static int f347536u = 20;

    /* renamed from: v */
    public static float f347537v = 2.0f;

    /* renamed from: w */
    public static float f347538w = 0.1f;

    /* renamed from: x */
    public static float f347539x = 0.05f;

    /* renamed from: d */
    public Paint f347540d;

    /* renamed from: e */
    public Context f347541e;

    /* renamed from: f */
    public View f347542f;

    /* renamed from: g */
    public int f347543g = -1;

    /* renamed from: h */
    public int f347544h = -1;

    /* renamed from: i */
    public MTimerHandler f347545i = null;

    /* renamed from: j */
    public float f347546j = 0.0f;

    /* renamed from: n */
    public float f347547n = 0.0f;

    /* renamed from: o */
    public float f347548o = 0.0f;

    /* renamed from: p */
    public float f347549p = -1.0f;

    /* renamed from: q */
    public boolean f347550q = true;

    /* renamed from: r */
    public boolean f347551r = false;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter$a */
    public class C115833a implements MTimerHandler.CallBack {
        public C115833a() {
        }

        public boolean onTimerExpired() {
            VoicePrintVolumeMeter voicePrintVolumeMeter = VoicePrintVolumeMeter.this;
            if (voicePrintVolumeMeter.f347551r) {
                if (voicePrintVolumeMeter.f347550q) {
                    voicePrintVolumeMeter.f347548o *= VoicePrintVolumeMeter.f347538w + 1.0f;
                } else {
                    voicePrintVolumeMeter.f347548o *= 1.0f - VoicePrintVolumeMeter.f347539x;
                }
                voicePrintVolumeMeter.postInvalidate();
            }
            return VoicePrintVolumeMeter.this.f347551r;
        }
    }

    static {
        Color.rgb(240, 250, 235);
    }

    public VoicePrintVolumeMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo176344a(context);
    }

    /* renamed from: a */
    public final void mo176344a(Context context) {
        this.f347541e = context;
        this.f347540d = new Paint();
        context.getResources().getColor(C0966R.color.Brand_Alpha_0_1);
        f347534s = context.getResources().getColor(C0966R.color.Brand_Alpha_0_3);
        this.f347545i = new MTimerHandler("VoicePrintVolumeMeter", (MTimerHandler.CallBack) new C115833a(), true);
    }

    /* renamed from: b */
    public final void mo176345b() {
        View view = this.f347542f;
        if (view != null && view.getVisibility() != 8) {
            int[] iArr = new int[2];
            this.f347542f.getLocationOnScreen(iArr);
            if (iArr[0] == 0 || iArr[1] == 0) {
                Log.m105918d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView location");
                return;
            }
            int width = this.f347542f.getWidth();
            int height = this.f347542f.getHeight();
            if (height == 0 || width == 0) {
                Log.m105918d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView size");
                return;
            }
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            int i = iArr[0] + (width / 2);
            this.f347543g = i;
            this.f347544h = (iArr[1] + (height / 2)) - iArr2[1];
            Log.m105919d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, mCenterX:%d, mCenterY:%d", Integer.valueOf(i), Integer.valueOf(this.f347544h));
            float f = ((float) width) / 2.0f;
            this.f347546j = f;
            this.f347547n = f347537v * f;
            this.f347548o = f;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f347551r) {
            if (this.f347543g == -1 || this.f347544h == -1) {
                mo176345b();
            }
            this.f347540d.setAlpha(f347535t);
            float f = this.f347548o;
            float f2 = this.f347547n;
            if (f > f2) {
                this.f347548o = f2;
            }
            float f3 = this.f347548o;
            float f4 = this.f347546j;
            if (f3 < f4) {
                this.f347548o = f4;
            }
            this.f347540d.setColor(f347534s);
            canvas.drawCircle((float) this.f347543g, (float) this.f347544h, this.f347548o, this.f347540d);
        }
    }

    public void setArchView(View view) {
        this.f347542f = view;
    }

    public void setVolume(float f) {
        if (f > this.f347549p) {
            this.f347550q = true;
        } else {
            this.f347550q = false;
        }
        this.f347549p = f;
    }

    public VoicePrintVolumeMeter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo176344a(context);
    }
}
