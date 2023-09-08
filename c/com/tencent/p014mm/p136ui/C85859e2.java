package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.e2 */
public class C85859e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f250075d;

    /* renamed from: com.tencent.mm.ui.e2$a */
    public class C85860a implements Runnable {
        public C85860a() {
        }

        public void run() {
            if (C74785j2.m89538a(C85859e2.this.f250075d)) {
                Log.m105918d("MicroMsg.MMErrorProcessor", "we got an unfinished silence download");
            }
        }
    }

    public C85859e2(Activity activity) {
        this.f250075d = activity;
    }

    public void run() {
        if (Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SilentDownloadApkAtWiFi")) == 0) {
            boolean z = false;
            boolean z2 = NetStatusUtil.isWifi((Context) this.f250075d) && ((((Integer) C97625j3.m125812b().mo105906u().mo119684e(7, 0)).intValue() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0);
            if ((ChannelUtil.updateMode & 1) != 0) {
                Log.m105918d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
                z2 = false;
            } else {
                Log.m105918d("MicroMsg.MMErrorProcessor", "not channel pack.");
            }
            if (z2) {
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("update_config_prefs", 4);
                long j = sharedPreferences.getLong("update_downloading_in_silence", 0);
                boolean z3 = sharedPreferences.getBoolean("update_download_start_one_immediate", false);
                Log.m105925i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", Long.valueOf(j));
                if (z3 || (j != 0 && System.currentTimeMillis() - j > 3600000)) {
                    z = true;
                }
                if (z) {
                    this.f250075d.runOnUiThread(new C85860a());
                }
            }
        }
    }
}
