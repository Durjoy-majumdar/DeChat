package com.tencent.p014mm.xwebutil;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall */
public class XWebAudioPlayerProgressBall extends View {

    /* renamed from: d */
    public int f56711d = 0;

    /* renamed from: e */
    public float f56712e = 0.0f;

    /* renamed from: f */
    public float f56713f = 0.0f;

    /* renamed from: g */
    public float f56714g = 0.0f;

    /* renamed from: h */
    public boolean f56715h = false;

    /* renamed from: i */
    public int[] f56716i = new int[2];

    /* renamed from: j */
    public Paint f56717j = new Paint();

    /* renamed from: n */
    public C19893a f56718n = null;

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall$a */
    public interface C19893a {
    }

    public XWebAudioPlayerProgressBall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context2 = getContext();
        int i = 8;
        if (!(context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            i = (int) TypedValue.applyDimension(1, (float) 8, displayMetrics);
        }
        this.f56713f = (float) i;
        this.f56717j.setAntiAlias(true);
        this.f56717j.setColor(-1);
    }

    /* renamed from: a */
    public boolean mo26658a(float f, boolean z) {
        C19893a aVar;
        long width = (long) (this.f56711d - getWidth());
        if (width <= 0) {
            return false;
        }
        if (this.f56715h && !z) {
            return false;
        }
        if (f < 0.0f) {
            this.f56712e = 0.0f;
        } else if (f > 1.0f) {
            this.f56712e = 1.0f;
        } else {
            this.f56712e = f;
        }
        setTranslationX(this.f56712e * ((float) width));
        if (!z || (aVar = this.f56718n) == null) {
            return true;
        }
        XWebAudioPlayerProgress xWebAudioPlayerProgress = (XWebAudioPlayerProgress) aVar;
        xWebAudioPlayerProgress.f56700f.setText(xWebAudioPlayerProgress.mo26648a((long) (this.f56712e * ((float) xWebAudioPlayerProgress.f56699e))));
        return true;
    }

    public int getTotalLength() {
        return this.f56711d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f56713f, this.f56717j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 != 6) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00e5
            r3 = 0
            if (r0 == r2) goto L_0x0051
            r4 = 2
            if (r0 == r4) goto L_0x0019
            r4 = 3
            if (r0 == r4) goto L_0x0051
            r4 = 5
            if (r0 == r4) goto L_0x00e5
            r12 = 6
            if (r0 == r12) goto L_0x0051
            goto L_0x00ff
        L_0x0019:
            boolean r0 = r11.f56715h
            if (r0 == 0) goto L_0x00ff
            int[] r0 = r11.f56716i
            r11.getLocationOnScreen(r0)
            int[] r0 = r11.f56716i
            r0 = r0[r1]
            float r0 = (float) r0
            float r1 = r11.getTranslationX()
            float r0 = r0 - r1
            float r12 = r12.getRawX()
            float r1 = r11.f56714g
            float r12 = r12 - r1
            float r12 = r12 - r0
            int r0 = r11.f56711d
            int r1 = r11.getWidth()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r12 = r12 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0044
            goto L_0x004c
        L_0x0044:
            int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004c
        L_0x004b:
            r3 = r12
        L_0x004c:
            r11.mo26658a(r3, r2)
            goto L_0x00ff
        L_0x0051:
            r11.f56715h = r1
            r11.f56714g = r3
            com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall$a r12 = r11.f56718n
            if (r12 == 0) goto L_0x00ff
            float r0 = r11.f56712e
            com.tencent.mm.xwebutil.XWebAudioPlayerProgress r12 = (com.tencent.p014mm.xwebutil.XWebAudioPlayerProgress) r12
            r12.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onUserPressEnd percentage = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "XFilesAudioPlayerProgress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            long r3 = r12.f56699e
            float r1 = (float) r3
            float r0 = r0 * r1
            long r0 = (long) r0
            r12.f56698d = r0
            android.widget.TextView r3 = r12.f56700f
            java.lang.String r0 = r12.mo26648a(r0)
            r3.setText(r0)
            com.tencent.mm.xwebutil.XWebAudioPlayerProgress$e r0 = r12.f56704j
            if (r0 == 0) goto L_0x00ff
            long r3 = r12.f56698d
            com.tencent.mm.xwebutil.g r0 = (com.tencent.p014mm.xwebutil.C19902g) r0
            java.lang.String r12 = "XFilesAudioPlayerLogic"
            java.lang.String r0 = r0.f56731a     // Catch:{ all -> 0x00c4 }
            boolean r0 = com.tencent.p014mm.xwebutil.C19905j.m21650b(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "progressBar onUserMoveTo, sCurrentParams invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x00ff
        L_0x009f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r0.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "onUserMoveTo "
            r0.append(r1)     // Catch:{ all -> 0x00c4 }
            r0.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x00c4 }
            com.tencent.mm.xwebutil.k r0 = com.tencent.p014mm.xwebutil.C19905j.f56734a     // Catch:{ all -> 0x00c4 }
            com.tencent.thumbplayer.api.ITPPlayer r5 = r0.f56748h     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = r0.f56744d     // Catch:{ all -> 0x00c4 }
            java.lang.String r7 = r0.f56745e     // Catch:{ all -> 0x00c4 }
            com.tencent.mm.xwebutil.j$b r8 = r0.f56749i     // Catch:{ all -> 0x00c4 }
            com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r9 = r0.f56747g     // Catch:{ all -> 0x00c4 }
            int r10 = (int) r3     // Catch:{ all -> 0x00c4 }
            com.tencent.p014mm.xwebutil.C19905j.m21653e(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c4 }
            goto L_0x00ff
        L_0x00c4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "seekTo error: "
            r1.append(r3)
            java.lang.String r3 = r0.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            java.lang.String r12 = "seekTo error "
            com.tencent.p014mm.xwebutil.C19905j.m21652d(r12, r0)
            goto L_0x00ff
        L_0x00e5:
            r11.f56715h = r2
            int[] r0 = r11.f56716i
            r11.getLocationOnScreen(r0)
            float r12 = r12.getRawX()
            int[] r0 = r11.f56716i
            r0 = r0[r1]
            float r0 = (float) r0
            float r12 = r12 - r0
            r11.f56714g = r12
            com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall$a r12 = r11.f56718n
            if (r12 == 0) goto L_0x00ff
            r12.getClass()
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.xwebutil.XWebAudioPlayerProgressBall.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOperationCallback(C19893a aVar) {
        this.f56718n = aVar;
    }

    public void setTotalLength(int i) {
        if (this.f56711d != i) {
            Log.m105924i("XFilesAudioPlayerProgressBall", "setTotalLength " + i);
            this.f56711d = i;
            mo26658a(this.f56712e, false);
        }
    }

    public XWebAudioPlayerProgressBall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context2 = getContext();
        int i2 = 8;
        if (!(context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            i2 = (int) TypedValue.applyDimension(1, (float) 8, displayMetrics);
        }
        this.f56713f = (float) i2;
        this.f56717j.setAntiAlias(true);
        this.f56717j.setColor(-1);
    }
}
