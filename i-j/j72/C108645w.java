package j72;

import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: j72.w */
public class C108645w {

    /* renamed from: a */
    public int f325340a = -1;

    /* renamed from: b */
    public volatile int f325341b = 0;

    /* renamed from: c */
    public long f325342c = 0;

    /* renamed from: d */
    public long f325343d = 0;

    /* renamed from: e */
    public int f325344e;

    /* renamed from: f */
    public int f325345f;

    /* renamed from: g */
    public boolean f325346g;

    /* renamed from: h */
    public boolean f325347h;

    /* renamed from: i */
    public int f325348i;

    /* renamed from: j */
    public int f325349j = -1;

    public C108645w(boolean z, int i, int i2, int i3, boolean z2) {
        this.f325346g = z;
        this.f325348i = i;
        this.f325344e = i2;
        this.f325345f = i3;
        this.f325347h = z2;
        Log.m105925i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", Boolean.valueOf(z), Integer.valueOf(this.f325348i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public long mo159662a() {
        if (0 != this.f325342c) {
            return System.currentTimeMillis() - this.f325342c;
        }
        Log.m105928w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
        return 0;
    }

    /* renamed from: b */
    public void mo159663b(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f325349j = i;
    }

    /* renamed from: c */
    public void mo159664c() {
        synchronized (C108645w.class) {
            this.f325341b = 0;
        }
        this.f325342c = 0;
    }

    /* renamed from: d */
    public void mo159665d(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        this.f325343d = Util.currentTicks();
        if (this.f325340a < 0) {
            Log.m105920e("MicroMsg.MMSightX264YUVRecorder", "write data error, yuv buffer id error");
            return;
        }
        synchronized (C108645w.class) {
            this.f325341b++;
        }
        int i4 = this.f325348i;
        boolean z2 = this.f325346g;
        if (!z2) {
            int i5 = this.f325349j;
            if (i5 == -1 || i5 == i4) {
                z = false;
            } else {
                i4 = Math.max(0, i4 <= 180 ? i5 - i4 : i5 + (360 - i4));
                if (i4 >= 360) {
                    i4 = 0;
                }
                z = true;
            }
        } else {
            int i6 = this.f325349j;
            if (i6 != -1) {
                i4 = i6;
            }
            z = z2;
        }
        SightVideoJNI.setRotateForBufId(this.f325340a, i4);
        int i7 = (!z ? i4 == 0 || i4 == 180 : !(i4 == 0 || i4 == 180)) ? this.f325345f : this.f325344e;
        int i8 = (!z ? i4 == 0 || i4 == 180 : !(i4 == 0 || i4 == 180)) ? this.f325344e : this.f325345f;
        int i9 = (!z ? i4 == 0 || i4 == 180 : !(i4 == 0 || i4 == 180)) ? i3 : i2;
        int i15 = (!z ? i4 == 0 || i4 == 180 : !(i4 == 0 || i4 == 180)) ? i2 : i3;
        boolean z3 = (i9 == i7 && i15 == i8) ? false : true;
        if (this.f325347h) {
            SightVideoJNI.mirrorCameraData(bArr, i9, i15, true);
        } else {
            byte[] bArr2 = bArr;
        }
        SightVideoJNI.writeYuvDataForMMSight(this.f325340a, bArr, i, i7, i8, z, z3, i9, i15);
        Log.m105919d("MicroMsg.MMSightX264YUVRecorder", "write data use %dms", Long.valueOf(Util.ticksToNow(this.f325343d)));
    }
}
