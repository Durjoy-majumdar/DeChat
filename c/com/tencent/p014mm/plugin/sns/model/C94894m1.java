package com.tencent.p014mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;
import java.util.Map;
import r90.C101364a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.m1 */
public class C94894m1 extends C101364a {

    /* renamed from: f */
    public long f274982f;

    /* renamed from: g */
    public boolean f274983g = false;

    /* renamed from: h */
    public int f274984h = 255;

    /* renamed from: i */
    public Map<String, Boolean> f274985i;

    public C94894m1(String str, C92714n nVar, long j) {
        super(str, nVar);
        HashMap hashMap = new HashMap();
        this.f274985i = hashMap;
        if (j != 0) {
            this.f274982f = j;
            hashMap.put(str, Boolean.TRUE);
            this.f274983g = true;
        } else if (!hashMap.containsKey(str)) {
            this.f274982f = SystemClock.uptimeMillis();
            this.f274985i.put(str, Boolean.TRUE);
            this.f274983g = true;
        }
    }

    /* renamed from: c */
    public long mo131076c() {
        SnsMethodCalculate.markStartTimeMs("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        long j = this.f274982f;
        SnsMethodCalculate.markEndTimeMs("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        return j;
    }

    public void draw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        Rect bounds = getBounds();
        Bitmap bitmap = this.f296934e.f266818d;
        if (!C102236a0.m134740e(bitmap)) {
            canvas.drawColor(-1118482);
            this.f274982f = 0;
        } else if (this.f274983g) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f274982f;
            float f = ((float) (uptimeMillis - j)) / 150.0f;
            if (j == 0) {
                f = 0.0f;
            }
            if (f >= 1.0f) {
                this.f274983g = false;
                this.f296933d.setAlpha(this.f274984h);
                canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f296933d);
            } else {
                this.f296933d.setAlpha((int) (((float) this.f274984h) * f));
                canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f296933d);
                invalidateSelf();
            }
        } else {
            this.f296933d.setAlpha(this.f274984h);
            canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f296933d);
        }
        SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
    }
}
