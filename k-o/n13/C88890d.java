package n13;

import b12.C79645d;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import eb0.C31543z5;
import gy3.C87412m;
import java.io.File;
import kj2.C117407d;
import v02.C90736c;
import v02.C90737d;
import zt3.C119157j;

/* renamed from: n13.d */
public final class C88890d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TinkerSyncResponse f256378d;

    /* renamed from: e */
    public final /* synthetic */ String f256379e;

    /* renamed from: n13.d$a */
    public static final class C88891a implements Runnable {

        /* renamed from: d */
        public static final C88891a f256380d = new C88891a();

        public final void run() {
            C88880b.m110961c();
        }
    }

    public C88890d(TinkerSyncResponse tinkerSyncResponse, String str) {
        this.f256378d = tinkerSyncResponse;
        this.f256379e = str;
    }

    public final void run() {
        C79645d.m96726b(this.f256378d);
        try {
            C86009m1 m1Var = new C86009m1(this.f256379e);
            String l = C79645d.m96736l(this.f256378d.f248346o);
            String i = C79645d.m96733i(MMApplicationContext.getContext());
            String i2 = m1Var.mo119971i();
            C87412m.m108593f(i2, "patchFile.absolutePath");
            long c = C31543z5.m39453c();
            int b = C90736c.m113792b(i, i2, l, this.f256378d.f248346o);
            long c2 = C31543z5.m39453c() - c;
            C88880b bVar = C88880b.f256362a;
            Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "merge bs diff costTime:" + (C31543z5.m39453c() - c) + ' ' + i2 + ' ' + l + " retCode:" + b);
            SharePatchFileUtil.safeDeleteFile(new File(i2));
            if (b == 0) {
                C90737d.m113804l(206, b, c2 / ((long) 1000), 2, 1);
            } else {
                C90737d.m113804l(205, b, c2 / ((long) 1000), 2, 1);
            }
            if (b == 0) {
                C88880b bVar2 = C88880b.f256362a;
                String str = this.f256378d.f248346o;
                C87412m.m108593f(str, "response.newApkMd5");
                if (!bVar2.mo123263d(str)) {
                    bVar2.mo123268k();
                    C117407d.INSTANCE.idkeyStat(1429, 19, 1, false);
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(C88891a.f256380d);
                }
            } else {
                C88880b.f256362a.mo123268k();
                C117407d.INSTANCE.idkeyStat(1429, 18, 1, false);
            }
            C79645d.m96728d(this.f256378d, b);
        } catch (Exception e) {
            C88880b bVar3 = C88880b.f256362a;
            Log.m105925i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish e = %s", e);
            C79645d.m96728d(this.f256378d, -10002);
        } catch (Throwable th) {
            C79645d.m96728d(this.f256378d, -101);
            C79645d.m96745u();
            throw th;
        }
        C79645d.m96745u();
    }
}
