package mb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;

/* renamed from: mb1.b */
public class C109594b implements YTPoseDetectInterface.PoseDetectResult {
    public C109594b(C109595c cVar) {
    }

    public void onFailed(int i, String str, String str2) {
        Log.m105924i("MicroMsg.FaceActionLogic", "onFailed s:" + str + " s1:" + str2);
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.FaceActionLogic", "onSuccess");
    }
}
