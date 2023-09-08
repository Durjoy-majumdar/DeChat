package com.tencent.qqpinyin.voicerecoapi;

import com.google.android.gms.common.util.GmsVersion;

/* renamed from: com.tencent.qqpinyin.voicerecoapi.c */
public class C116361c {

    /* renamed from: a */
    public TRVADNative f349167a = new TRVADNative();

    /* renamed from: b */
    public int f349168b;

    /* renamed from: com.tencent.qqpinyin.voicerecoapi.c$a */
    public static class C45130a {

        /* renamed from: a */
        public int f122402a = 0;
    }

    public C116361c(int i, int i2) {
        this.f349168b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo178018a(short[] r8, int r9, com.tencent.qqpinyin.voicerecoapi.C116361c.C45130a r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x003e
            if (r9 <= 0) goto L_0x003e
            if (r10 != 0) goto L_0x0008
            goto L_0x003e
        L_0x0008:
            com.tencent.qqpinyin.voicerecoapi.TRVADNative r0 = r7.f349167a     // Catch:{ all -> 0x003b }
            int r0 = r0.mfeSendData(r8, r9)     // Catch:{ all -> 0x003b }
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0021
            r1 = 2
            if (r0 == r1) goto L_0x001e
            r1 = 3
            if (r0 == r1) goto L_0x001b
            r10.f122402a = r2     // Catch:{ all -> 0x003b }
            goto L_0x0023
        L_0x001b:
            r10.f122402a = r1     // Catch:{ all -> 0x003b }
            goto L_0x0023
        L_0x001e:
            r10.f122402a = r1     // Catch:{ all -> 0x003b }
            goto L_0x0023
        L_0x0021:
            r10.f122402a = r1     // Catch:{ all -> 0x003b }
        L_0x0023:
            r10 = 0
        L_0x0024:
            if (r2 < r9) goto L_0x002a
            r8 = 100
            monitor-exit(r7)
            return
        L_0x002a:
            double r0 = (double) r10
            short r10 = r8[r2]     // Catch:{ all -> 0x003b }
            int r10 = r10 * r10
            double r3 = (double) r10     // Catch:{ all -> 0x003b }
            double r3 = java.lang.Math.sqrt(r3)     // Catch:{ all -> 0x003b }
            double r5 = (double) r9
            double r3 = r3 / r5
            double r0 = r0 + r3
            int r10 = (int) r0
            int r2 = r2 + 1
            goto L_0x0024
        L_0x003b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x003e:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqpinyin.voicerecoapi.C116361c.mo178018a(short[], int, com.tencent.qqpinyin.voicerecoapi.c$a):void");
    }

    /* renamed from: b */
    public int mo178019b() {
        int mfeInit = this.f349167a.mfeInit(this.f349168b, GmsVersion.VERSION_LONGHORN);
        if (mfeInit == 0 && (mfeInit = this.f349167a.mfeOpen()) == 0 && (mfeInit = this.f349167a.mfeEnableNoiseDetection(true)) == 0) {
            mfeInit = this.f349167a.mfeStart();
        }
        return mfeInit == 0 ? 0 : -1;
    }

    /* renamed from: c */
    public int mo178020c() {
        int mfeStop = this.f349167a.mfeStop();
        if (mfeStop == 0 && (mfeStop = this.f349167a.mfeClose()) == 0) {
            mfeStop = this.f349167a.mfeExit();
        }
        return mfeStop == 0 ? 0 : -1;
    }
}
