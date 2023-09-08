package c40;

import a40.C79462a;
import org.tensorflow.lite.C89289c;
import y30.C91370a;

/* renamed from: c40.a */
public abstract class C79928a extends C79462a {

    /* renamed from: b */
    public C89289c f234151b;

    /* renamed from: c */
    public boolean f234152c;

    public C79928a(C91370a aVar) {
        this.f233006a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo109455a() {
        /*
            r14 = this;
            java.lang.String r0 = z30.C91614b.f262457a
            java.lang.String r0 = "Kara.KaraEnv"
            java.lang.String r1 = "init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r1 = z30.C91614b.m114960b()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0012:
            r0 = 0
            goto L_0x00c6
        L_0x0015:
            boolean r1 = z30.C91614b.f262458b
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = "so is downloading"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0012
        L_0x0020:
            z30.b$a r1 = z30.C91614b.m114959a()
            if (r1 != 0) goto L_0x0027
            goto L_0x006f
        L_0x0027:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = z30.C91614b.f262457a
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r1 = r1.mo125485a()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r5 = r1.getPath()
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r4, r4)
            java.lang.String r6 = r1.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0065
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r5)
            android.net.Uri r1 = r1.build()
        L_0x0065:
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163865u(r1)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 != 0) goto L_0x0071
        L_0x006f:
            r1 = r2
            goto L_0x0075
        L_0x0071:
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163865u(r1)
        L_0x0075:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x0082
            java.lang.String r1 = "so path empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0012
        L_0x0082:
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r5 != 0) goto L_0x008e
            java.lang.String r1 = "file not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0012
        L_0x008e:
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00a2
            java.lang.String r5 = "file length 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            goto L_0x0012
        L_0x00a2:
            java.lang.System.load(r1)     // Catch:{ all -> 0x00a7 }
            r0 = 1
            goto L_0x00c6
        L_0x00a7:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r1
            java.lang.String r6 = "so load error! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r0 == 0) goto L_0x00bf
            r0 = 40
            d40.C86172c.m106685a(r0)
            goto L_0x0012
        L_0x00bf:
            r0 = 41
            d40.C86172c.m106685a(r0)
            goto L_0x0012
        L_0x00c6:
            java.lang.String r1 = "Kara.BasePredict"
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "PredictEnv not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r4
        L_0x00d0:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r0 != 0) goto L_0x00db
            boolean r0 = j30.C76385a.m91809a()
            if (r0 != 0) goto L_0x00db
            goto L_0x00ed
        L_0x00db:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r5 = "clicfg_plugin_kara_predict_open"
            java.lang.String r6 = "1"
            java.lang.String r0 = r0.mo182444f(r5, r6, r4, r3)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            if (r0 != 0) goto L_0x00ef
        L_0x00ed:
            r0 = 0
            goto L_0x00f0
        L_0x00ef:
            r0 = 1
        L_0x00f0:
            if (r0 == 0) goto L_0x0199
            y30.a r0 = r14.f233006a     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r0.mo125343c()     // Catch:{ Exception -> 0x0188 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x0188 }
            if (r5 == 0) goto L_0x011c
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r4, r4)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r6 = r0.getPath()     // Catch:{ Exception -> 0x0188 }
            boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x0188 }
            if (r6 != 0) goto L_0x011c
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0188 }
            android.net.Uri$Builder r0 = r0.path(r5)     // Catch:{ Exception -> 0x0188 }
            android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x0188 }
        L_0x011c:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0188 }
            com.tencent.mm.vfs.f0$h r2 = r5.mo177799l(r0, r2)     // Catch:{ Exception -> 0x0188 }
            boolean r5 = r2.mo177810a()     // Catch:{ Exception -> 0x0188 }
            if (r5 != 0) goto L_0x012a
            r2 = 0
            goto L_0x0132
        L_0x012a:
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = r2.f348992b     // Catch:{ Exception -> 0x0188 }
            boolean r2 = r5.mo119948x(r2)     // Catch:{ Exception -> 0x0188 }
        L_0x0132:
            if (r2 != 0) goto L_0x014f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0188 }
            r0.<init>()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = "model file not exists:"
            r0.append(r2)     // Catch:{ Exception -> 0x0188 }
            y30.a r2 = r14.f233006a     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = r2.mo125343c()     // Catch:{ Exception -> 0x0188 }
            r0.append(r2)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0188 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0195
        L_0x014f:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163865u(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r5 = "rw"
            r2.<init>(r0, r5)     // Catch:{ Exception -> 0x0188 }
            java.nio.channels.FileChannel r6 = r2.getChannel()     // Catch:{ Exception -> 0x0188 }
            long r8 = r2.getFilePointer()     // Catch:{ Exception -> 0x0188 }
            long r10 = r2.getFilePointer()     // Catch:{ Exception -> 0x0188 }
            long r12 = r2.length()     // Catch:{ Exception -> 0x0188 }
            long r10 = r10 + r12
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Exception -> 0x0188 }
            java.nio.MappedByteBuffer r0 = r6.map(r7, r8, r10)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = "get mappedByteBuffer succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0188 }
            org.tensorflow.lite.c r2 = new org.tensorflow.lite.c     // Catch:{ Exception -> 0x0188 }
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()     // Catch:{ Exception -> 0x0188 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0188 }
            r14.f234151b = r2     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = "get Interpreter succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0196
        L_0x0188:
            r0 = move-exception
            java.lang.String r2 = "load model error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
        L_0x0195:
            r3 = 0
        L_0x0196:
            r14.f234152c = r3
            return r3
        L_0x0199:
            java.lang.String r0 = "init error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.C79928a.mo109455a():boolean");
    }

    /* renamed from: b */
    public boolean mo109456b() {
        return this.f234152c;
    }

    /* renamed from: d */
    public void mo109458d() {
        synchronized (this) {
            C89289c cVar = this.f234151b;
            if (cVar != null) {
                cVar.close();
                this.f234151b = null;
            }
        }
    }
}
