package hb1;

import android.content.Intent;
import com.tencent.p014mm.plugin.facedetect.service.FaceUploadVideoService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import jb1.C108680a;
import ke3.C88144b;

/* renamed from: hb1.d */
public class C8501d implements C108680a.C108692h {

    /* renamed from: a */
    public final /* synthetic */ long f27525a;

    /* renamed from: b */
    public final /* synthetic */ C8502e f27526b;

    public C8501d(C8502e eVar, long j) {
        this.f27526b = eVar;
        this.f27525a = j;
    }

    /* renamed from: a */
    public void mo9420a(String str) {
        Log.m105925i("MicroMsg.FaceDetectServiceControllerMp", "hy: video release done. using: %d ms. file path: %s", Long.valueOf(Util.ticksToNow(this.f27525a)), str);
        if (!Util.isNullOrNil(str)) {
            Intent intent = new Intent(MMApplicationContext.getContext(), FaceUploadVideoService.class);
            intent.putExtra("key_video_file_name", str);
            intent.putExtra("k_bio_id", this.f27526b.f27527a);
            intent.putExtra("key_app_id", this.f27526b.f27528b);
            C88144b.m109807y(intent);
        }
    }
}
