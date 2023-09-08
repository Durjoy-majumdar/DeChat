package com.tencent.p014mm.plugin.appbrand.performance;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.Closeable;
import java.io.RandomAccessFile;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.f */
public class C84000f implements Closeable {

    /* renamed from: d */
    public final int f245241d;

    /* renamed from: e */
    public volatile RandomAccessFile f245242e;

    /* renamed from: f */
    public volatile RandomAccessFile f245243f;

    /* renamed from: g */
    public boolean f245244g;

    /* renamed from: h */
    public long f245245h;

    /* renamed from: i */
    public long f245246i;

    /* renamed from: j */
    public long f245247j;

    public C84000f(int i) {
        this.f245241d = i;
    }

    /* renamed from: a */
    public final long mo116641a() {
        if (this.f245242e == null) {
            this.f245242e = C86013q1.m106420B("/proc/stat", false);
        }
        this.f245242e.seek(0);
        String readLine = this.f245242e.readLine();
        if (Util.isNullOrNil(readLine)) {
            return 0;
        }
        String[] split = readLine.split(" ");
        if (split.length < 9) {
            return 0;
        }
        long safeParseLong = Util.safeParseLong(split[2]);
        long safeParseLong2 = Util.safeParseLong(split[3]);
        long safeParseLong3 = Util.safeParseLong(split[4]);
        long safeParseLong4 = Util.safeParseLong(split[5]);
        long safeParseLong5 = Util.safeParseLong(split[6]);
        long safeParseLong6 = Util.safeParseLong(split[7]);
        return safeParseLong + safeParseLong2 + safeParseLong3 + safeParseLong4 + safeParseLong5 + safeParseLong6 + Util.safeParseLong(split[8]) + Util.safeParseLong(split[9]);
    }

    /* renamed from: b */
    public double mo116642b() {
        double d;
        double d2;
        double d3 = 0.0d;
        if (this.f245244g) {
            return 0.0d;
        }
        try {
            if (this.f245243f == null) {
                try {
                    this.f245243f = C86013q1.m106420B("/proc/" + this.f245241d + "/stat", false);
                } catch (Exception e) {
                    e = e;
                }
            }
            this.f245243f.seek(0);
            String readLine = this.f245243f.readLine();
            if (Util.isNullOrNil(readLine)) {
                return 0.0d;
            }
            String[] split = readLine.split(" ");
            if (split.length < 17) {
                return 0.0d;
            }
            long a = mo116641a();
            long safeParseLong = Util.safeParseLong(split[13]);
            long safeParseLong2 = Util.safeParseLong(split[14]);
            long j = this.f245245h;
            if (j != 0) {
                double d4 = ((double) ((safeParseLong - this.f245246i) * 100)) / ((double) (a - j));
                try {
                    d2 = ((double) ((safeParseLong2 - this.f245247j) * 100)) / ((double) (a - j));
                    d = 0.0d;
                } catch (Exception e2) {
                    e = e2;
                    d = 0.0d;
                    d3 = d;
                    Log.m105920e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                    this.f245244g = true;
                    return d3;
                }
                try {
                    d3 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
                } catch (Exception e3) {
                    e = e3;
                    d3 = d;
                    Log.m105920e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                    this.f245244g = true;
                    return d3;
                }
            }
            this.f245245h = a;
            this.f245246i = safeParseLong;
            this.f245247j = safeParseLong2;
            return d3;
        } catch (Exception e4) {
            e = e4;
            Log.m105920e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
            this.f245244g = true;
            return d3;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000d A[Catch:{ IOException -> 0x0012 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r1 = this;
            java.io.RandomAccessFile r0 = r1.f245243f     // Catch:{ IOException -> 0x0009 }
            if (r0 == 0) goto L_0x0009
            java.io.RandomAccessFile r0 = r1.f245243f     // Catch:{ IOException -> 0x0009 }
            r0.close()     // Catch:{ IOException -> 0x0009 }
        L_0x0009:
            java.io.RandomAccessFile r0 = r1.f245242e     // Catch:{ IOException -> 0x0012 }
            if (r0 == 0) goto L_0x0012
            java.io.RandomAccessFile r0 = r1.f245242e     // Catch:{ IOException -> 0x0012 }
            r0.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.performance.C84000f.close():void");
    }
}
