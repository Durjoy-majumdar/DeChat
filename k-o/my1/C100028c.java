package my1;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ly1.C99743i;
import ly1.C99754l;
import p232rw.C101476o;
import sw1.C13794o;
import sw1.C48484q;
import te3.C101781gb0;
import zg2.C53789d;

/* renamed from: my1.c */
public class C100028c implements C53789d {
    /* renamed from: a */
    public void mo74358a(String str) {
        Log.m105925i("MicroMsg.Haowan.VideoMixCallback", "onInit, taskId:%s", str);
    }

    /* renamed from: b */
    public void mo74359b(String str) {
        Log.m105925i("MicroMsg.Haowan.VideoMixCallback", "onWait, taskId:%s", str);
    }

    /* renamed from: c */
    public void mo74360c(String str, int i) {
        Log.m105925i("MicroMsg.Haowan.VideoMixCallback", "onRun, taskId:%s, runNum:%d", str, Integer.valueOf(i));
    }

    /* renamed from: d */
    public void mo74361d(String str, boolean z, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        C101781gb0 RL;
        Class cls = C101476o.class;
        Log.m105925i("MicroMsg.Haowan.VideoMixCallback", "onFinish, taskId:%s, success:%b, model:%s", str, Boolean.valueOf(z), captureVideoNormalModel);
        if (str != null) {
            Bundle Ip0 = ((C101476o) C86312j.m106911c(cls)).Ip0(str);
            if (Ip0.getInt("key_game_haowan_flag", 0) != 10) {
                Log.m105924i("MicroMsg.Haowan.VideoMixCallback", "not game haowan task");
                return;
            }
            C100022a.m130692f(captureVideoNormalModel, Ip0);
            if (z && (RL = ((C101476o) C86312j.m106911c(cls)).mo140778RL(str)) != null) {
                C100022a.m130694h(RL.f298299o, captureVideoNormalModel);
                C100022a.m130693g(RL.f298300p, captureVideoNormalModel);
            }
            C99754l kc = ((C48484q) C86312j.m106911c(C48484q.class)).mo66107kc();
            kc.getClass();
            String format = String.format("select * from %s where %s=\"%s\"", new Object[]{"GameHaowanPublishEdition", "bgMixTaskId", str});
            Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryTaskByBgMixId, sql : %s", format);
            Cursor rawQuery = kc.rawQuery(format, new String[0]);
            C99743i iVar = null;
            if (rawQuery != null) {
                if (rawQuery.moveToNext()) {
                    iVar = new C99743i();
                    iVar.convertFrom(rawQuery);
                }
                rawQuery.close();
            }
            if (iVar == null) {
                Log.m105924i("MicroMsg.Haowan.VideoMixCallback", "no perform publish action");
            } else if (iVar.field_publishState == 2) {
                Log.m105924i("MicroMsg.Haowan.VideoMixCallback", "publish has finished");
            } else {
                ((C13794o) C86312j.m106911c(C13794o.class)).mo13152TN(iVar.field_taskId);
            }
        }
    }
}
