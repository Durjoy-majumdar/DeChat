package hb1;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.C115426w;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.p014mm.sdk.platformtools.Log;
import pe3.C89349b;
import te3.C118453od;

/* renamed from: hb1.a */
public class C117074a implements C115426w {

    /* renamed from: a */
    public final /* synthetic */ FaceDetectProcessService f350821a;

    /* renamed from: hb1.a$a */
    public class C117075a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FaceProNative.FaceResult f350822d;

        public C117075a(FaceProNative.FaceResult faceResult) {
            this.f350822d = faceResult;
        }

        public void run() {
            String str;
            FaceProNative.FaceResult faceResult = this.f350822d;
            if (faceResult == null || faceResult.result != 0) {
                Log.m105920e("MicroMsg.FaceUtils", "alvinluo face result is null or result code not 0");
            } else {
                try {
                    str = C85191v.m105071j();
                    C118453od odVar = new C118453od();
                    odVar.f354208d = C89349b.m111674a(faceResult.sidedata);
                    odVar.f354209e = C89349b.m111674a(faceResult.data);
                    C85191v.m105075n(odVar.toByteArray(), str);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FaceUtils", e, "", new Object[0]);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_face_result_code", 0);
                bundle.putString("key_face_result_file_path", str);
                FaceDetectProcessService faceDetectProcessService = C117074a.this.f350821a;
                faceDetectProcessService.getClass();
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.setData(bundle);
                faceDetectProcessService.mo175313k(obtain);
            }
            str = null;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_face_result_code", 0);
            bundle2.putString("key_face_result_file_path", str);
            FaceDetectProcessService faceDetectProcessService2 = C117074a.this.f350821a;
            faceDetectProcessService2.getClass();
            Message obtain2 = Message.obtain();
            obtain2.what = 1;
            obtain2.setData(bundle2);
            faceDetectProcessService2.mo175313k(obtain2);
        }
    }

    public C117074a(FaceDetectProcessService faceDetectProcessService) {
        this.f350821a = faceDetectProcessService;
    }

    /* renamed from: a */
    public void mo181031a(FaceProNative.FaceResult faceResult) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(faceResult == null);
        int i = -1;
        objArr[1] = Integer.valueOf(faceResult != null ? faceResult.result : -1);
        Log.m105925i("MicroMsg.FaceDetectProcessService", "alvinluo release out result == null:%b, result: %d", objArr);
        if (faceResult == null || faceResult.result != 0) {
            Log.m105924i("MicroMsg.FaceDetectProcessService", "alvinluo release out data not valid");
            if (faceResult != null) {
                i = faceResult.result;
            }
            this.f350821a.mo175312j(1, i);
            return;
        }
        C105227i.f312610f.postToWorker(new C117075a(faceResult));
    }
}
