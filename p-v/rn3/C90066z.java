package rn3;

import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: rn3.z */
public class C90066z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f258735d;

    /* renamed from: e */
    public final /* synthetic */ C90049b0 f258736e;

    public C90066z(String str, C90049b0 b0Var) {
        this.f258735d = str;
        this.f258736e = b0Var;
    }

    public void run() {
        if (C86013q1.m106451l(this.f258735d) > 1048576) {
            Log.m105920e("MiroMsg.MusicVideoShareUtil", "img size is too large");
            C90049b0 b0Var = this.f258736e;
            if (b0Var != null) {
                b0Var.mo119879a((String) null, true);
                return;
            }
            return;
        }
        String i = C86013q1.m106448i(this.f258735d, false);
        C90049b0 b0Var2 = this.f258736e;
        Log.m105925i("MiroMsg.MusicVideoShareUtil", "alvinluo handleCDNUpload imgPath: %s", i);
        C98124g gVar = new C98124g();
        long currentTimeMillis = System.currentTimeMillis();
        String b = C1297x.m1387b("musicvideoimage", currentTimeMillis, C75592q0.m90777g().getUsername(), String.valueOf(currentTimeMillis));
        gVar.f287660d = "task_AiScanImagetUploadTask";
        gVar.field_mediaId = b;
        gVar.field_fullpath = i;
        gVar.field_appType = 202;
        gVar.field_fileType = 20304;
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_needCompressImage = true;
        gVar.field_isStreamMedia = false;
        gVar.field_bzScene = 2;
        gVar.f287662f = new C90048a0(b0Var2);
        if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            Log.m105921e("MiroMsg.MusicVideoShareUtil", "hy: cdntra addSendTask failed. clientid:%s", b);
        }
    }
}
