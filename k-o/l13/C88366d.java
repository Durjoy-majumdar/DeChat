package l13;

import b12.C79645d;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import h81.C32735h;
import l20.C21388a;
import m13.C88689b;
import org.json.JSONObject;
import p271xn.C91298n;
import p327ct.C30914c;
import qe3.C89625d;
import x02.C91117e;

/* renamed from: l13.d */
public class C88366d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f255362d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255363e;

    public C88366d(C88357b bVar, boolean z, boolean z2) {
        this.f255362d = z;
        this.f255363e = z2;
    }

    public void run() {
        Class cls = C91298n.class;
        Class cls2 = C88689b.class;
        try {
            if (this.f255362d) {
                C115669n.INSTANCE.idkeyStat(1429, 38, 1, false);
                ((C91298n) C86312j.m106911c(cls)).mo125105XF(261, 4);
            }
            JSONObject f = C91117e.m114301f(C79645d.m96731g(C79645d.m96733i(MMApplicationContext.getContext())));
            if (f != null) {
                String string = f.getString(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION);
                String string2 = f.getString("cdnUrl");
                String string3 = f.getString("fileMd5");
                int i = f.getInt("fileSize");
                boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_upgrade_force_stop_tinker_xpatch_update, 0) == 1;
                Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion, clientVersion = %s, cdnUrl = %s, fileMd5 = %s, fileSize = %s, onlyShowNewRedDot = %s, isForceStopTinkerXpatchMerge = %s.", string, string2, string3, Integer.valueOf(i), Boolean.valueOf(this.f255363e), Boolean.valueOf(z));
                if (!z) {
                    try {
                        int i2 = f.getInt("packageType");
                        if (!Util.isNullOrNil(string) && !Util.isNullOrNil(string2) && !Util.isNullOrNil(string3)) {
                            if (i != 0) {
                                int e = C91117e.m114300e();
                                int parseInt = Integer.parseInt(string.substring(2), 16);
                                int i3 = C89625d.f257841g;
                                Log.m105925i("MicroMsg.Updater.PluginUpdater", "xKeyTargetApk = %s, mmdiffTargetVersion = %s, currentApkClientVersionCode = %s, hasManualUpdaterTabRedDot = %s, packageType = %s.", Integer.valueOf(e), Integer.valueOf(parseInt), Integer.valueOf(i3), Boolean.valueOf(((C88689b) C86312j.m106911c(cls2)).mo122746bQ()), Integer.valueOf(i2));
                                if (parseInt <= i3) {
                                    return;
                                }
                                if (parseInt >= e) {
                                    if (this.f255363e) {
                                        ((C88689b) C86312j.m106911c(cls2)).mo122747cD(parseInt);
                                    }
                                    if (this.f255362d) {
                                        C115669n.INSTANCE.idkeyStat(1429, 42, 1, false);
                                        ((C91298n) C86312j.m106911c(cls)).mo125105XF(CdnLogic.kGroupNoticeCDNAppType, 4);
                                    }
                                    if (i2 == 2) {
                                        ((C88689b) C86312j.m106911c(cls2)).mo122768xa(5);
                                    }
                                    ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33509r(262145, false);
                                    C115669n.INSTANCE.idkeyStat(1429, 37, 1, false);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.Updater.PluginUpdater", "e = " + e2 + ", packageType = " + -1);
                    }
                }
            }
        } catch (Exception e3) {
            Log.m105929w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e3.getMessage());
        }
    }
}
