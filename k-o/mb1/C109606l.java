package mb1;

import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import jb1.C108680a;
import jb1.C108698e;
import mb1.C109601i;
import mb1.C117545m;
import p500dy.C97560f;

/* renamed from: mb1.l */
public class C109606l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[][] f328150d;

    /* renamed from: e */
    public final /* synthetic */ C117545m f328151e;

    /* renamed from: mb1.l$a */
    public class C109607a implements C108680a.C108692h {
        public C109607a() {
        }

        /* renamed from: a */
        public void mo9420a(String str) {
            String str2 = str;
            Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "onStop filePath: %s", str2);
            C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(str2);
            if (Z40 != null) {
                Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "face record video size:%sx%s rotate:%s", Integer.valueOf(Z40.f273445c), Integer.valueOf(Z40.f273446d), Integer.valueOf(((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getMp4RotateVFS(str2)));
            }
            C115669n.INSTANCE.idkeyStat(917, 46, 1, false);
            C117545m mVar = C109606l.this.f328151e;
            mVar.getClass();
            try {
                Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "encryptAndUploadVideoFile: %s", str2);
                if (!Util.isNullOrNil(str) && C86013q1.m106450k(str)) {
                    Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str2, C86013q1.m106456q(str));
                    mVar.mo182279a(str2);
                    String str3 = str2 + "_encrypt";
                    Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "encrypt video file, personId: %s", mVar.f351665a);
                    mVar.mo182281c(mVar.f351665a, str2, str3);
                    Log.m105925i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str3, C86013q1.m106456q(str3));
                    C86013q1.m106447h(str);
                    mVar.mo182280b(str3);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", e, "encryptAndUploadVideoFile error", new Object[0]);
                C117545m.C109608a aVar = mVar.f351670f;
                if (aVar != null) {
                    ((C109601i.C109602a) aVar).mo160809a();
                }
            }
        }
    }

    public C109606l(C117545m mVar, byte[][] bArr) {
        this.f328151e = mVar;
        this.f328150d = bArr;
    }

    public void run() {
        try {
            C108680a.m147401e().mo159701i();
            for (byte[] eVar : this.f328150d) {
                C108680a e = C108680a.m147401e();
                e.f325471c.postToWorker(new C108698e(e, eVar));
            }
            C108680a.m147401e().mo159702j(new C109607a());
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", e2, "recordFrameImpl error", new Object[0]);
            C117545m.C109608a aVar = this.f328151e.f351670f;
            if (aVar != null) {
                ((C109601i.C109602a) aVar).mo160809a();
            }
        }
    }
}
