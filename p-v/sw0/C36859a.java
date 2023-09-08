package sw0;

import a12.C27733g;
import a12.C79451c;
import a12.C79454f;
import a12.C79455h;
import a12.C79456i;
import a12.C79457j;
import android.content.Context;
import android.os.Build;
import bx3.C79852a;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.p064hp.tinker.TinkerPatchResultService;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import fv3.C87102h;
import g40.C87134f;
import p156gj.C87203t;
import qe3.C89625d;
import w02.C90877a;
import zw3.C91941a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_PATCH})
@Deprecated
/* renamed from: sw0.a */
public class C36859a extends C86301e {

    /* renamed from: sw0.a$a */
    public class C36860a implements C87134f {
        public C36860a(C36859a aVar) {
        }

        /* renamed from: e */
        public void mo1180e() {
            C91941a aVar;
            ApplicationLike applicationLike = C80589e.f235760a;
            Log.m105924i("Tinker.TinkerPatchManager", "try installing tinker");
            if (C79455h.f232995a) {
                Log.m105928w("Tinker.TinkerPatchManager", "install tinker, but has installed, ignore");
                return;
            }
            long j = 0;
            try {
                j = ((long) C86718e.m107549h()) & Util.MAX_32BIT_VALUE;
                Log.m105925i("Tinker.TinkerPatchManager", "uin is %s", Util.secPrint(String.valueOf(j)));
            } catch (Exception e) {
                Log.printErrStackTrace("Tinker.TinkerPatchManager", e, "tinker patch manager get uin failed.", new Object[0]);
            }
            long j2 = j;
            if (applicationLike != null) {
                C91941a aVar2 = new C91941a(applicationLike.getApplication(), applicationLike, new C79454f(applicationLike.getApplication()), new C79456i(applicationLike.getApplication()), new C79451c(applicationLike.getApplication()), new C87102h(), new C90877a(), TinkerPatchResultService.class, new C79852a());
                if (C91941a.f263210c == null) {
                    C91941a.f263210c = aVar2;
                    C91941a b = C91941a.m115469d().mo125792b(applicationLike.getApplication().getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12));
                    boolean hasDebuger = CrashReportFactory.hasDebuger();
                    if (b.f263212b == null || b.f263211a == null) {
                        ShareTinkerLog.m106533v("Tinker.TinkerClient", "setDebugger, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
                        aVar = C91941a.f263210c;
                    } else {
                        ShareTinkerLog.m106533v("Tinker.TinkerClient", "set debugger to %b", Boolean.valueOf(hasDebuger));
                        b.f263212b.f233512d = hasDebuger;
                        aVar = C91941a.f263210c;
                    }
                    String str = "1";
                    C91941a c = aVar.mo125793c("uin", String.valueOf(j2)).mo125793c("code-version", BuildInfo.CLIENT_VERSION).mo125793c("code-reversion", BuildInfo.REV).mo125793c("network", String.valueOf(NetStatusUtil.isWifi((Context) applicationLike.getApplication()) ? 3 : 2)).mo125793c("sdk", String.valueOf(Build.VERSION.SDK_INT)).mo125793c("os-name", C89625d.f257839e).mo125793c("device-brand", C89625d.f257836b).mo125793c("device-name", C89625d.f257838d).mo125793c("support-64-bit", Build.SUPPORTED_64_BIT_ABIS.length > 0 ? str : "0");
                    if (!C87203t.m108279o()) {
                        str = "0";
                    }
                    C91941a c2 = c.mo125793c("device-is-64-bit-runtime", str);
                    C79457j jVar = new C79457j();
                    if (c2.f263212b == null || c2.f263211a == null) {
                        ShareTinkerLog.m106533v("Tinker.TinkerClient", "setPatchRequestCallback, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
                    } else {
                        ShareTinkerLog.m106533v("Tinker.TinkerClient", "setPatchRequestCallback with hashcode %d", Integer.valueOf(jVar.hashCode()));
                        c2.f263212b.f233509a = jVar;
                    }
                    Log.m105924i("Tinker.TinkerPatchManager", "try installing end");
                    C79455h.f232995a = true;
                    return;
                }
                throw new TinkerRuntimeException("TinkerClient instance is already set.");
            }
            throw new TinkerRuntimeException("applicationLike must not be null.");
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    public void onCreate(Context context) {
        ShareTinkerLog.setTinkerLogImp(new C27733g());
        C86709a0.m107528h().mo121097c(new C36860a(this));
    }
}
