package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import java.util.concurrent.Callable;
import p269xe.C91191l;
import p723vf.C118672d;
import p773yy.C79168k;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference$a$$a */
public final /* synthetic */ class SettingsAboutMMHeaderPreference$a$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ long f248964d;

    public /* synthetic */ SettingsAboutMMHeaderPreference$a$$a(long j) {
        this.f248964d = j;
    }

    public final Object call() {
        long j = this.f248964d;
        C85448x0 x0Var = C85448x0.f249036a;
        try {
            Log.m105924i("MicroMsg.SettingsAboutMMHeaderReporter", "do report: time = " + j);
            C115669n.INSTANCE.mo160131h(28255, Long.valueOf(j), BuildInfo.BUILD_TAG, BuildInfo.REV, Integer.valueOf(XWebSdk.getXWebSdkVersion()), Integer.valueOf(XWebSdk.getAvailableVersion()), C91191l.m114455a(x0Var.mo118799a(MemInfo.f235669p.mo112156a())), Integer.valueOf(C43471q.m46977a(0)), Integer.valueOf(C43471q.m46977a(6)), Integer.valueOf(C43471q.m46977a(1)), Integer.valueOf(C43471q.m46977a(3)), Integer.valueOf(C43471q.m46977a(2)), Integer.valueOf(C43471q.m46977a(5)), Long.valueOf(((C79168k) C86312j.m106911c(C79168k.class)).mo74118OU()));
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.SettingsAboutMMHeaderReporter", th, "", new Object[0]);
        }
        return C85448x0.f249036a;
    }
}
