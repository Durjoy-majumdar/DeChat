package i72;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p625nu.C61901d;

/* renamed from: i72.d */
public class C98607d extends OrientationEventListener implements C61901d {

    /* renamed from: d */
    public int f289113d = -1;

    /* renamed from: e */
    public int f289114e = -1;

    /* renamed from: f */
    public long f289115f = 0;

    /* renamed from: g */
    public C61901d.C61902a f289116g;

    /* renamed from: h */
    public int f289117h = -1;

    public C98607d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo138047a() {
        if (!C108388k.f324537a) {
            return 0;
        }
        return this.f289114e;
    }

    /* renamed from: b */
    public int mo138048b() {
        int a = mo138047a();
        if (a <= 60 || a >= 300) {
            return 0;
        }
        if (a <= 120) {
            return 90;
        }
        return a <= 210 ? 180 : 270;
    }

    /* renamed from: c */
    public boolean mo138049c() {
        if (!C108388k.f324537a) {
            return false;
        }
        Log.m105925i("MicroMsg.DeviceOrientationListener", "isLandscape,  orientation: %s", Integer.valueOf(this.f289114e));
        int i = this.f289114e;
        if (i < 0) {
            return false;
        }
        return i == 90 || i == 270;
    }

    public void enable() {
        Log.m105925i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", Boolean.valueOf(C108388k.f324537a));
        if (C108388k.f324537a) {
            super.enable();
        }
    }

    public void onOrientationChanged(int i) {
        int i2 = i;
        if (this.f289117h == -1) {
            this.f289117h = i2;
            if (i2 <= 60 || i2 >= 300) {
                if (i2 <= 30 || i2 >= 330) {
                    this.f289117h = 0;
                }
            } else if (i2 <= 150) {
                if (i2 <= 120) {
                    this.f289117h = 90;
                }
            } else if (i2 > 240) {
                this.f289117h = 270;
            } else if (i2 <= 210) {
                this.f289117h = 180;
            }
            C61901d.C61902a aVar = this.f289116g;
            if (aVar != null) {
                aVar.onOrientationChange(this.f289117h);
            }
        }
        if (C108388k.f324537a) {
            if (i2 < 0 || i2 > 360) {
                Log.m105918d("MicroMsg.DeviceOrientationListener", "orientation out of range, ignore");
            } else if (Math.abs(this.f289113d - i2) >= 30 || Util.ticksToNow(this.f289115f) >= 300) {
                this.f289113d = i2;
                this.f289115f = Util.currentTicks();
                if (i2 <= 60 || i2 >= 300) {
                    if (i2 <= 30 || i2 >= 330) {
                        this.f289114e = 0;
                    }
                } else if (i2 < 30 || i2 > 150) {
                    if (i2 < 120 || i2 > 240) {
                        if (i2 >= 210 && i2 <= 330 && i2 >= 240 && i2 <= 300) {
                            this.f289114e = 270;
                        }
                    } else if (i2 >= 150 && i2 <= 210) {
                        this.f289114e = 180;
                    }
                } else if (i2 >= 60 && i2 <= 120) {
                    this.f289114e = 90;
                }
                C61901d.C61902a aVar2 = this.f289116g;
                if (aVar2 != null) {
                    aVar2.onOrientationChange(this.f289114e);
                }
            }
        }
    }

    public C98607d(Context context, int i) {
        super(context, i);
    }
}
