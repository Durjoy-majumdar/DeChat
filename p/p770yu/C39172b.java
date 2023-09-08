package p770yu;

import android.os.Build;
import ce2.C28547d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import p206nj.C76862i;
import p206nj.C88957l;
import p523fp.C32147e;
import p782zu.C39454b;
import z72.C102978c;
import z72.C102979f;
import z72.C102980g;
import zt3.C119157j;

@C86522b
/* renamed from: yu.b */
public class C39172b extends C86301e implements C39454b {
    /* renamed from: Vk */
    public void mo61972Vk(C102978c cVar, int i, long j, String str) {
        Class cls = C32735h.class;
        Log.m105925i("MicroMsg.NetSceneMultiMediaReport", "goto report, id:%d", Long.valueOf(j));
        if (!Util.isOverseasUser(MMApplicationContext.getContext())) {
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_media_report_open, 0) != 1) {
                Log.m105928w("MicroMsg.NetSceneMultiMediaReport", "report switch close.");
                return;
            }
            if (!BuildInfo.IS_ARM64 && Build.VERSION.SDK_INT >= ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_media_report_filter_api, 29)) {
                String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_multi_media_report_filter_brand, "");
                String str2 = Build.BRAND;
                if (!Util.isNullOrNil(str2) && Y60.toLowerCase().contains(str2.toLowerCase())) {
                    Log.m105928w("MicroMsg.NetSceneMultiMediaReport", "brand not allow report.");
                    return;
                }
            }
            C28547d dVar = (C28547d) C86709a0.m107533q(C28547d.class);
            if (dVar == null || !dVar.mo56052aI()) {
                Class cls2 = C32147e.class;
                if (!C102980g.f303907g) {
                    String AD = ((C32147e) C86312j.m106911c(cls2)).mo58507AD(83, 2);
                    if (!C86013q1.m106450k(AD)) {
                        ((C32147e) C86312j.m106911c(cls2)).Yi0(83);
                        Log.m105929w("MicroMsg.NetSceneMultiMediaReport", "not model, path:%s", AD);
                    } else if (C76862i.m92661a("ginfo")) {
                        C88957l.m111078n("ginfo");
                        boolean init = C102980g.f303906f.init(C86013q1.m106448i(AD, false));
                        C102980g.f303908h = init;
                        Log.m105929w("MicroMsg.NetSceneMultiMediaReport", "init gogcv model! path: %s, result:%b", AD, Boolean.valueOf(init));
                    } else {
                        Log.m105924i("MicroMsg.NetSceneMultiMediaReport", "ginfo so not exist.");
                    }
                    C102980g.f303907g = true;
                }
                if (!C102980g.f303908h) {
                    Log.m105928w("MicroMsg.NetSceneMultiMediaReport", "init err.");
                    return;
                }
                ((C119157j) C119157j.f356862d).mo183871b(new C102979f(j, cVar, str, i), "ginforeport");
                return;
            }
            Log.m105928w("MicroMsg.NetSceneMultiMediaReport", "gogcv disabled by memory degrade.");
        }
    }
}
