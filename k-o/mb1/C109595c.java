package mb1;

import android.content.Context;
import android.hardware.Camera;
import android.widget.TextView;
import au1.C0222b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.C85185b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.ytcommon.tools.YTCameraSetting;
import com.tencent.youtu.ytcommon.tools.YTFaceUtils;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;

/* renamed from: mb1.c */
public class C109595c {

    /* renamed from: a */
    public Context f328104a;

    /* renamed from: b */
    public int f328105b;

    /* renamed from: c */
    public int f328106c;

    /* renamed from: d */
    public String f328107d;

    /* renamed from: e */
    public TextView f328108e;

    /* renamed from: f */
    public int f328109f;

    /* renamed from: g */
    public int f328110g;

    /* renamed from: h */
    public int f328111h;

    /* renamed from: i */
    public int f328112i;

    /* renamed from: j */
    public YTPoseDetectInterface.PoseDetectOnFrame f328113j;

    /* renamed from: k */
    public boolean f328114k = false;

    /* renamed from: mb1.c$a */
    public interface C109596a {
    }

    /* renamed from: mb1.c$b */
    public static class C109597b {

        /* renamed from: a */
        public static C109595c f328115a = new C109595c((C109594b) null);
    }

    public C109595c(C109594b bVar) {
    }

    /* renamed from: a */
    public void mo160807a(byte[] bArr, Camera camera) {
        if (this.f328114k && YTFaceTrack.IsInstanceExist()) {
            YTFaceTrack.FaceStatus[] faceStatusArr = null;
            int rotate = YTCameraSetting.getRotate(this.f328104a, this.f328105b, 1);
            if (C85185b.vx0()) {
                faceStatusArr = YTFaceTrack.getInstance().DoDetectionProcessYUV(bArr, this.f328111h, this.f328112i, rotate, (YTFaceTrack.YTImage) null);
            }
            if (faceStatusArr != null) {
                C0222b.m174m("faceRecognized");
                YTFaceTrack.FaceStatus faceStatus = faceStatusArr[0];
                if (!YTPoseDetectInterface.isDetecting()) {
                    return;
                }
                if (faceStatus == null) {
                    Log.m105924i("MicroMsg.FaceActionLogic", "Detecting result：out of rect");
                    this.f328108e.setText(C0966R.string.ck9);
                    return;
                }
                YTFaceUtils.shelterJudge(faceStatus.pointsVis);
                YTPoseDetectInterface.PoseDetectOnFrame poseDetectOnFrame = this.f328113j;
                if (poseDetectOnFrame != null) {
                    YTPoseDetectInterface.poseDetect(faceStatus.xys, faceStatus.pointsVis, this.f328106c, bArr, camera, faceStatus.pitch, faceStatus.yaw, faceStatus.roll, poseDetectOnFrame, 0);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.FaceActionLogic", "No face");
        }
    }
}
