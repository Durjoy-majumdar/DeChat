package com.tencent.p014mm.plugin.facedetect;

import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import rd3.C48020a;

/* renamed from: com.tencent.mm.plugin.facedetect.d */
public class C85186d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String[] f248182d;

    /* renamed from: e */
    public final /* synthetic */ String f248183e;

    /* renamed from: f */
    public final /* synthetic */ String[] f248184f;

    /* renamed from: g */
    public final /* synthetic */ String[] f248185g;

    /* renamed from: h */
    public final /* synthetic */ C85187e f248186h;

    public C85186d(C85187e eVar, String[] strArr, String str, String[] strArr2, String[] strArr3) {
        this.f248186h = eVar;
        this.f248182d = strArr;
        this.f248183e = str;
        this.f248184f = strArr2;
        this.f248185g = strArr3;
    }

    public void run() {
        for (String str : this.f248182d) {
            C85187e.m105056b(this.f248186h, this.f248183e + str, "face_detect/" + ("detector/" + str));
        }
        for (String str2 : this.f248184f) {
            C85187e.m105056b(this.f248186h, this.f248183e + str2, "face_detect/" + ("ufa/" + str2));
        }
        for (String str3 : this.f248185g) {
            C85187e.m105056b(this.f248186h, this.f248183e + str3, "face_detect/" + ("poseest/" + str3));
        }
        String h = C85191v.m105069h();
        String f = C85191v.m105067f();
        boolean b = C48020a.m53385b(h);
        boolean b2 = C48020a.m53385b(f);
        Log.m105925i("MicroMsg.TaskInitFace", "alvinluo detectmodel: %s, exist: %b, alignModel: %s, exist: %b", h, Boolean.valueOf(b), f, Boolean.valueOf(b2));
        if (!b) {
            Log.m105924i("MicroMsg.TaskInitFace", "alvinluo copy detect model file");
            C85187e.m105057c(MMApplicationContext.getContext(), "face_detect/ufdmtcc.bin", h);
        } else {
            this.f248186h.mo118221d(h, "face_detect/ufdmtcc.bin");
        }
        if (!b2) {
            Log.m105924i("MicroMsg.TaskInitFace", "alvinluo copy alignment model file");
            C85187e.m105057c(MMApplicationContext.getContext(), "face_detect/ufat.bin", f);
            return;
        }
        this.f248186h.mo118221d(f, "face_detect/ufat.bin");
    }
}
