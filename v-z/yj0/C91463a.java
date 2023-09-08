package yj0;

import com.tencent.p014mm.plugin.p944ap.WVAPJNI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yj0.a */
public class C91463a {

    /* renamed from: a */
    public boolean f262197a = false;

    /* renamed from: b */
    public long f262198b = 0;

    /* renamed from: c */
    public short f262199c = 0;

    /* renamed from: d */
    public int f262200d = 0;

    /* renamed from: e */
    public byte[] f262201e = null;

    /* renamed from: a */
    public synchronized byte[] mo125394a() {
        if (!this.f262197a) {
            return null;
        }
        try {
            int nativeMixerGetMixedPCM = WVAPJNI.nativeMixerGetMixedPCM(this.f262198b, this.f262201e, this.f262199c);
            if (nativeMixerGetMixedPCM <= 0) {
                Log.m105924i("MicroMsg.GameLiveAudioMixer", "[hilive] getData " + nativeMixerGetMixedPCM);
            }
            return this.f262201e;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM Exception " + e.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e2) {
            Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM UnsatisfiedLinkError " + e2.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0087 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo125395b(int r6, short r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f262197a     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "libvoipCodec.so"
            int r0 = com.tencent.p014mm.plugin.p944ap.WVAPJNI.nativeInitMixerFunc(r0)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r1 = 128(0x80, float:1.794E-43)
            r2 = 40
            long r3 = com.tencent.p014mm.plugin.p944ap.WVAPJNI.nativeMixerInit(r1, r6, r2)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r5.f262198b = r3     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r1 = 1
            r5.f262197a = r1     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r5.f262199c = r7     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r1 = 2
            int r3 = r7 * r6
            int r3 = r3 * 40
            int r3 = r3 / 1000
            int r1 = r1 * r3
            r5.f262200d = r1     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r5.f262201e = r1     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            goto L_0x002f
        L_0x002a:
            r6 = move-exception
            goto L_0x006d
        L_0x002c:
            r6 = move-exception
            goto L_0x007a
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.lang.String r1 = "MicroMsg.GameLiveAudioMixer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.<init>()     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r3 = "[hilive] init outputSamplerate: "
            r2.append(r3)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r6 = " outputChannel: "
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.append(r7)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r6 = " outputSize: "
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            int r6 = r5.f262200d     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r6 = " handle: "
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            long r6 = r5.f262198b     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r6 = " code: "
            r2.append(r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            r2.append(r0)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x002c, UnsatisfiedLinkError -> 0x002a }
            boolean r6 = r5.f262197a     // Catch:{ all -> 0x008b }
            monitor-exit(r5)
            return r6
        L_0x006d:
            java.lang.String r7 = "MicroMsg.GameLiveAudioMixer"
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0087 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)     // Catch:{ all -> 0x0087 }
            boolean r6 = r5.f262197a     // Catch:{ all -> 0x008b }
            monitor-exit(r5)
            return r6
        L_0x007a:
            java.lang.String r7 = "MicroMsg.GameLiveAudioMixer"
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0087 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)     // Catch:{ all -> 0x0087 }
            boolean r6 = r5.f262197a     // Catch:{ all -> 0x008b }
            monitor-exit(r5)
            return r6
        L_0x0087:
            boolean r6 = r5.f262197a     // Catch:{ all -> 0x008b }
            monitor-exit(r5)
            return r6
        L_0x008b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yj0.C91463a.mo125395b(int, short):boolean");
    }

    /* renamed from: c */
    public synchronized boolean mo125396c(short s, short s2, int i, byte[] bArr) {
        if (!this.f262197a) {
            return false;
        }
        try {
            WVAPJNI.nativeMixerInsertRawPCM(this.f262198b, (short) (((40 * i) / 1000) << 1), s, s2, i, bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM Exception " + e.getMessage());
        } catch (UnsatisfiedLinkError e2) {
            Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM UnsatisfiedLinkError " + e2.getMessage());
        }
        return true;
    }
}
