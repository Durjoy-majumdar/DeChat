package vl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;

/* renamed from: vl2.r */
public final class C22768r {

    /* renamed from: a */
    public MultiProcessMMKV f65477a;

    /* renamed from: b */
    public long f65478b;

    /* renamed from: c */
    public long f65479c = 3000;

    /* renamed from: d */
    public long f65480d = 1000;

    /* renamed from: e */
    public float f65481e = 2.0f;

    /* renamed from: f */
    public boolean f65482f;

    /* renamed from: g */
    public int f65483g;

    /* renamed from: h */
    public boolean f65484h;

    /* renamed from: i */
    public boolean f65485i;

    /* renamed from: j */
    public float f65486j = 0.8f;

    /* renamed from: k */
    public long f65487k;

    /* renamed from: l */
    public long f65488l;

    /* renamed from: m */
    public boolean f65489m;

    /* renamed from: n */
    public boolean f65490n;

    /* renamed from: o */
    public boolean f65491o;

    public C22768r() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV(C86709a0.m107523b().mo121111i() + "_scan_code_retry");
        this.f65477a = singleMMKV;
        long j = singleMMKV != null ? singleMMKV.getLong("scan_code_retry_timeout", 3000) : 3000;
        this.f65478b = j;
        this.f65483g = 1;
        this.f65479c = 3000;
        this.f65480d = 1000;
        this.f65481e = ((float) 200) / 100.0f;
        long max = Math.max(1000, j);
        this.f65478b = max;
        this.f65478b = Math.min(this.f65479c, max);
        float f = ((float) 80) / 100.0f;
        this.f65486j = f;
        this.f65486j = Math.min(1.0f, f);
        int i = this.f65483g;
        if (i == 1) {
            this.f65484h = true;
            this.f65485i = false;
        } else if (i == 2) {
            this.f65484h = false;
            this.f65485i = true;
        }
        Log.m105925i("MicroMsg.ScanRetryManager", "alvinluo init retryType: %d, maxTimeout: %d, minTimeout: %d, timeout: %d, timeoutFactor config: %d, factor: %f, textureScaleFactor: %d, factor: %f, canRetry: %b, %b", Integer.valueOf(i), Long.valueOf(this.f65479c), Long.valueOf(this.f65480d), Long.valueOf(this.f65478b), 200, Float.valueOf(this.f65481e), 80, Float.valueOf(this.f65486j), Boolean.valueOf(this.f65484h), Boolean.valueOf(this.f65485i));
    }

    /* renamed from: a */
    public final void mo35861a(long j) {
        Log.m105925i("MicroMsg.ScanRetryManager", "alvinluo saveTimeout %d", Long.valueOf(j));
        MultiProcessMMKV multiProcessMMKV = this.f65477a;
        if (multiProcessMMKV != null) {
            multiProcessMMKV.putLong("scan_code_retry_timeout", j);
        }
        MultiProcessMMKV multiProcessMMKV2 = this.f65477a;
        if (multiProcessMMKV2 != null) {
            multiProcessMMKV2.apply();
        }
    }
}
