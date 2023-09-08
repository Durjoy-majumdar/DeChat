package kd0;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import kj2.C117407d;
import p1081gi.C98120c;
import p1081gi.C98121d;

public final /* synthetic */ class g$$a implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ C76540g f224031a;

    public /* synthetic */ g$$a(C76540g gVar) {
        this.f224031a = gVar;
    }

    /* renamed from: a */
    public final void mo11363a(C92798v vVar) {
        C92798v vVar2 = vVar;
        C76540g gVar = this.f224031a;
        Log.m105925i("MicroMsg.NetSceneUploadVoice", "CdnPLCJavaHelperListener fileName:%s %s %s", gVar.f224013f, vVar2.f267130a, Integer.valueOf(vVar2.f267132c));
        int ordinal = vVar2.f267130a.ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                C117407d.INSTANCE.idkeyStat(111, 51, 1, false);
                C98121d dVar = vVar2.f267135f;
                if (dVar != null) {
                    String str = dVar.field_aesKey;
                    gVar.f224022r = str;
                    String str2 = dVar.field_fileId;
                    gVar.f224023s = str2;
                    long j = dVar.field_fileLength;
                    gVar.f224021q = true;
                    Log.m105925i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceSuccess cdnAesKey:%s cdnVoiceUrl:%s cdnFileLength:%s", str, str2, Long.valueOf(j));
                    C86709a0.m107525e().postToWorker(new C76543i(gVar));
                    return;
                }
                return;
            } else if (ordinal == 6) {
                C98120c cVar = vVar2.f267134e;
                if (cVar != null) {
                    Log.m105925i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceProgress fileName:%s %s/%s", gVar.f224013f, Long.valueOf(cVar.field_finishedLength), Long.valueOf(vVar2.f267134e.field_toltalLength));
                    return;
                }
                return;
            } else if (!(ordinal == 13 || ordinal == 15 || ordinal == 17)) {
                return;
            }
        }
        Log.m105921e("MicroMsg.NetSceneUploadVoice", "cdn upload failed, fallback to cgi %s", vVar2.f267130a.name());
        gVar.f224024t = true;
        String str3 = gVar.f224013f;
        C92798v.C92799a aVar = vVar2.f267130a;
        C87412m.m108594g(aVar, "event");
        int ordinal2 = aVar.ordinal();
        C21321k.m23908c(str3, 2, ordinal2 != 4 ? ordinal2 != 13 ? ordinal2 != 15 ? ordinal2 != 17 ? 330 : 334 : 332 : 331 : 333, Util.ticksToNow(gVar.f224028x), gVar.f224025u, (String) null);
        C86709a0.m107525e().postToWorker(new C76542h(gVar));
    }
}
