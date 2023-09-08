package mb1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import mb1.C109595c;
import mb1.C109599e;
import mb1.C109603j;
import nb1.C109732d;
import nb1.C109734f;

/* renamed from: mb1.d */
public class C109598d implements YTPoseDetectInterface.PoseDetectOnFrame {

    /* renamed from: a */
    public final /* synthetic */ C109599e f328116a;

    public C109598d(C109599e eVar) {
        this.f328116a = eVar;
    }

    public void onCanReflect() {
    }

    public void onFailed(int i, String str, String str2) {
        Log.m105925i("MicroMsg.FaceCheckActionEngine", "detect action failed, %s %s %s", Integer.valueOf(i), str, str2);
        this.f328116a.getClass();
        C115669n.INSTANCE.idkeyStat(917, 43, 1, false);
        C109599e.C10774a aVar = this.f328116a.f328118b;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void onRecordingDone(byte[][] bArr, int i, int i2) {
        if (bArr != null) {
            Log.m105925i("MicroMsg.FaceCheckActionEngine", "notify start record, frameDatas.length: %s, width: %s, height: %s", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            Log.m105920e("MicroMsg.FaceCheckActionEngine", "onRecordingDone, frameData is null!!");
        }
        this.f328116a.getClass();
        C109595c.C109597b.f328115a.f328114k = false;
        C109599e.C10774a aVar = this.f328116a.f328118b;
        if (aVar != null) {
            C109600h hVar = (C109600h) aVar;
            Log.m105925i("MicroMsg.FaceCheckActionMgr", "onStartRecord, frameDatas: %s, width: %s, height: %s", bArr, Integer.valueOf(i), Integer.valueOf(i2));
            if (bArr != null) {
                C109603j jVar = hVar.f328119a;
                jVar.getClass();
                Log.m105925i("MicroMsg.FaceCheckActionMgr", "processRecordFrameData, frames: %s, width: %s, height: %s", bArr, Integer.valueOf(i), Integer.valueOf(i2));
                C109603j.C109604a aVar2 = jVar.f328137r;
                if (aVar2 != null) {
                    Log.m105924i("MicroMsg.FaceActionUI", "onStartUpload");
                    MMHandlerThread.postToMainThread(new C109732d((C109734f) aVar2));
                }
                C109601i iVar = new C109601i(jVar, bArr, i, i2);
                MMHandler mMHandler = jVar.f328139t;
                if (mMHandler != null) {
                    mMHandler.post(iVar);
                }
            }
        }
    }

    public void onSuccess(int i) {
        Log.m105925i("MicroMsg.FaceCheckActionEngine", "detect action success: %s", Integer.valueOf(i));
        this.f328116a.getClass();
        C115669n.INSTANCE.idkeyStat(917, 42, 1, false);
        C109599e.C10774a aVar = this.f328116a.f328118b;
        if (aVar != null) {
            aVar.getClass();
        }
    }
}
