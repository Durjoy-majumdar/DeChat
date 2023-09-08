package zt1;

import android.content.Intent;
import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jb1.C108680a;
import ke3.C88144b;

/* renamed from: zt1.f */
public class C16405f {

    /* renamed from: a */
    public boolean f43810a = false;

    /* renamed from: b */
    public long f43811b = 0;

    /* renamed from: c */
    public String f43812c;

    /* renamed from: d */
    public Intent f43813d;

    /* renamed from: e */
    public boolean f43814e = false;

    /* renamed from: f */
    public Camera.Parameters f43815f;

    /* renamed from: g */
    public int f43816g = -1;

    /* renamed from: a */
    public void mo14854a(Intent intent, int i) {
        this.f43810a = intent.getBooleanExtra("needVideo", false);
        C108680a.m147401e().f325476h = this.f43810a;
        this.f43812c = intent.getStringExtra("appId");
        this.f43816g = i;
        if (i == 0) {
            this.f43814e = true;
        }
        Log.m105925i("MicroMsg.FaceFlashManagerRecorder", "needVideo %s,mAppId %s acceptVoiceFromOutSide:%s", Boolean.valueOf(this.f43810a), this.f43812c, Boolean.valueOf(this.f43814e));
    }

    /* renamed from: b */
    public void mo14855b(Camera.Parameters parameters) {
        if (this.f43810a) {
            try {
                this.f43815f = parameters;
                int i = parameters.getInt("rotation");
                String[] split = parameters.get("preview-size").split("x");
                C108680a e = C108680a.m147401e();
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                e.mo159699g(i, parseInt, parseInt2, false, 0, Integer.parseInt(split[0]), Integer.parseInt(split[1]), this.f43814e);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo14856c() {
        if (this.f43810a && this.f43815f != null) {
            Log.m105924i("MicroMsg.FaceFlashManagerRecorder", "resetRecord");
            if (this.f43810a && C108680a.m147401e().mo159700h()) {
                Log.m105924i("MicroMsg.FaceFlashManagerRecorder", "releaseRecord");
                C108680a.m147401e().mo159697d();
            }
            mo14855b(this.f43815f);
        }
    }

    /* renamed from: d */
    public void mo14857d() {
        if (this.f43813d != null) {
            Log.m105924i("MicroMsg.FaceFlashManagerRecorder", "sendRequestUploadVideo");
            C88144b.m109807y(this.f43813d);
            this.f43813d = null;
        }
    }

    /* renamed from: e */
    public void mo14858e() {
        if (this.f43810a && !C108680a.m147401e().mo159700h()) {
            Log.m105924i("MicroMsg.FaceFlashManagerRecorder", "releaseRecord");
            C108680a.m147401e().mo159701i();
            this.f43811b = Util.currentTicks();
        }
    }
}
