package zt1;

import android.content.Intent;
import com.tencent.p014mm.plugin.facedetect.service.FaceUploadVideoService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import jb1.C108680a;

/* renamed from: zt1.e */
public class C16404e implements C108680a.C108692h {

    /* renamed from: a */
    public final /* synthetic */ long f43808a;

    /* renamed from: b */
    public final /* synthetic */ C16405f f43809b;

    public C16404e(C16405f fVar, long j) {
        this.f43809b = fVar;
        this.f43808a = j;
    }

    /* renamed from: a */
    public void mo9420a(String str) {
        Log.m105925i("MicroMsg.FaceFlashManagerRecorder", "hy: video release done. using: %d ms. file path: %s", Long.valueOf(Util.ticksToNow(this.f43809b.f43811b)), str);
        if (!Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            this.f43809b.f43813d = new Intent(MMApplicationContext.getContext(), FaceUploadVideoService.class);
            this.f43809b.f43813d.putExtra("key_video_file_name", str);
            this.f43809b.f43813d.putExtra("k_bio_id", this.f43808a);
            C16405f fVar = this.f43809b;
            fVar.f43813d.putExtra("key_face_type", fVar.f43816g);
            C16405f fVar2 = this.f43809b;
            fVar2.f43813d.putExtra("key_app_id", fVar2.f43812c);
        }
    }
}
