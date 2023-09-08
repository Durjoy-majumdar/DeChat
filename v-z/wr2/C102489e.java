package wr2;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: wr2.e */
public final class C102489e {

    /* renamed from: a */
    public final String f301772a;

    /* renamed from: b */
    public final String f301773b;

    /* renamed from: c */
    public final String f301774c;

    /* renamed from: d */
    public final String f301775d;

    /* renamed from: e */
    public final boolean f301776e;

    /* renamed from: f */
    public final long f301777f;

    /* renamed from: g */
    public long f301778g;

    /* renamed from: h */
    public int f301779h;

    /* renamed from: i */
    public int f301780i;

    public C102489e(String str, String str2, String str3, String str4, SnsInfo snsInfo, boolean z) {
        this.f301779h = 0;
        this.f301780i = 0;
        this.f301772a = str;
        this.f301773b = str2;
        this.f301774c = str3 == null ? "" : str3;
        this.f301775d = str4 == null ? "" : str4;
        this.f301776e = z;
        this.f301777f = SystemClock.elapsedRealtime();
        this.f301778g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static C102489e m135289a(String str, int i, int i2, String str2, String str3, String str4, SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
        try {
            C102489e eVar = new C102489e(str, i, i2, str2, str3, str4, snsInfo, z);
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return eVar;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return null;
        }
    }

    public C102489e(String str, int i, int i2, String str2, String str3, String str4, SnsInfo snsInfo, boolean z) {
        this.f301772a = str;
        this.f301779h = i;
        this.f301780i = i2;
        this.f301773b = str2;
        this.f301774c = Util.isNullOrNil(str3) ? "" : str3;
        this.f301775d = Util.isNullOrNil(str4) ? "" : str4;
        this.f301776e = z;
        this.f301777f = SystemClock.elapsedRealtime();
        this.f301778g = System.currentTimeMillis();
    }
}
