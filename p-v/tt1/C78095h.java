package tt1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import f40.C86709a0;
import java.util.Map;
import p156gj.C107835h0;
import p156gj.C87203t;
import p206nj.C88957l;
import p281yz.C79173v;
import p908k9.C76518a;
import p908k9.C76525c;
import st1.C77767l;
import st1.C77770n;
import st1.C77774s;
import tb3.C77880b;
import vt1.C78473a;
import vt1.C78476d;
import zt3.C119157j;

/* renamed from: tt1.h */
public class C78095h extends C52363a {

    /* renamed from: d */
    public C76518a f228900d;

    /* renamed from: tt1.h$a */
    public class C78096a implements Runnable {
        public C78096a() {
        }

        public void run() {
            if (!C77770n.m93842d()) {
                try {
                    C78095h.m94254a(C78095h.this, MMApplicationContext.getContext());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", e, "", new Object[0]);
                    C77770n.m93843e(false);
                }
            }
            if (!C77770n.f226610a) {
                try {
                    ClassLoader classLoader = C77880b.class.getClassLoader();
                    if (!TextUtils.isEmpty(C88957l.m111071g("teec"))) {
                        Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "LoadLibrary fingerprintauth.so, find the libteec so");
                        C88957l.m111079o("fingerprintauth", classLoader);
                        C77770n.f226610a = true;
                    } else {
                        Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "can not LoadLibrary fingerprintauth.so, because can not find the libteec");
                        C77770n.f226610a = false;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", th, "", new Object[0]);
                    C77770n.f226610a = false;
                }
            }
            C78095h.this.getClass();
            Class cls = C79173v.class;
            Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey");
            if (!C77770n.m93842d()) {
                Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "device is not support");
            } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y() || ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x()) {
                Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "user had not reg wxpay or is isSimpleReg");
            } else {
                try {
                    String b = C77770n.m93840b();
                    Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey userId:" + b);
                    String rsaKey = FingerPrintAuth.getRsaKey(C77770n.m93839a(MMApplicationContext.getContext()), b, C87203t.m108273i());
                    if (TextUtils.isEmpty(rsaKey)) {
                        Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.getRsaKey() is null");
                        rsaKey = FingerPrintAuth.genRsaKey(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i());
                    }
                    if (TextUtils.isEmpty(rsaKey)) {
                        Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.genRsaKey() return null");
                    } else {
                        Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey success!");
                    }
                } catch (Exception | UnsatisfiedLinkError e2) {
                    Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", e2, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: tt1.h$b */
    public class C78097b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f228902d;

        public C78097b(C78095h hVar, boolean z) {
            this.f228902d = z;
        }

        public void run() {
            MultiProcessMMKV.getMMKV("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FINGER", this.f228902d);
        }
    }

    /* renamed from: tt1.h$c */
    public class C78098c implements C78088b {

        /* renamed from: a */
        public int f228903a;

        /* renamed from: b */
        public final /* synthetic */ C78090d f228904b;

        public C78098c(C78095h hVar, C78090d dVar) {
            this.f228904b = dVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            boolean z = false;
            Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "authorize pay result: %s, %s", Integer.valueOf(cVar.f228884a), null);
            C78091e a = C78091e.m94238a(cVar);
            if (a.f228890a == 0) {
                a.f228891b++;
                this.f228904b.onSuccess(a);
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i = currentTimeMillis - this.f228903a;
            if (i >= 1) {
                a.f228891b++;
                this.f228903a = currentTimeMillis;
            }
            if (a.f228890a == 1) {
                z = true;
            }
            if (!z || a.f228891b >= 3 || i < 1) {
                this.f228904b.onFail(a);
            } else {
                this.f228904b.onRetry(a);
            }
        }
    }

    /* renamed from: tt1.h$d */
    public class C78099d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78088b f228905d;

        /* renamed from: e */
        public final /* synthetic */ C78092f f228906e;

        /* renamed from: tt1.h$d$a */
        public class C78100a implements C76518a.C76522d {
            public C78100a() {
            }

            /* renamed from: a */
            public void mo108092a(int i, int i2, int i3, int i4) {
                Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "on result: %s, %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                C78099d dVar = C78099d.this;
                C78088b bVar = dVar.f228905d;
                if (bVar != null) {
                    bVar.mo107892a(C78089c.m94236a(dVar.f228906e.f228896c, i, i2, i3, i4));
                }
            }

            /* renamed from: b */
            public void mo108093b(int i, int i2, int i3) {
                Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "on status: %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public C78099d(C78088b bVar, C78092f fVar) {
            this.f228905d = bVar;
            this.f228906e = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                tt1.h r0 = tt1.C78095h.this
                k9.a r0 = r0.mo108088b()
                r1 = -1
                if (r0 != 0) goto L_0x0019
                tt1.b r0 = r5.f228905d
                if (r0 == 0) goto L_0x0018
                tt1.f r2 = r5.f228906e
                java.lang.String r2 = r2.f228896c
                tt1.c r1 = tt1.C78089c.m94236a(r2, r1, r1, r1, r1)
                r0.mo107892a(r1)
            L_0x0018:
                return
            L_0x0019:
                r2 = 0
                k9.c r3 = r0.f223970a     // Catch:{ RemoteException -> 0x0023 }
                k9.b r4 = r0.f223971b     // Catch:{ RemoteException -> 0x0023 }
                int[] r3 = r3.mo106757vU(r4)     // Catch:{ RemoteException -> 0x0023 }
                goto L_0x0025
            L_0x0023:
                int[] r3 = new int[r2]
            L_0x0025:
                tt1.h$d$a r4 = new tt1.h$d$a
                r4.<init>()
                if (r3 == 0) goto L_0x003b
                r0.f223973d = r4
                r0.f223974e = r2
                k9.c r2 = r0.f223970a     // Catch:{ RemoteException -> 0x003a }
                k9.b r0 = r0.f223971b     // Catch:{ RemoteException -> 0x003a }
                r4 = 0
                int r0 = r2.mm0(r0, r3, r4)     // Catch:{ RemoteException -> 0x003a }
                goto L_0x003c
            L_0x003a:
            L_0x003b:
                r0 = -1
            L_0x003c:
                if (r0 == 0) goto L_0x004d
                tt1.b r0 = r5.f228905d
                if (r0 == 0) goto L_0x004d
                tt1.f r2 = r5.f228906e
                java.lang.String r2 = r2.f228896c
                tt1.c r1 = tt1.C78089c.m94236a(r2, r1, r1, r1, r1)
                r0.mo107892a(r1)
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tt1.C78095h.C78099d.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f2 A[SYNTHETIC, Splitter:B:100:0x01f2] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0215 A[SYNTHETIC, Splitter:B:105:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0251 A[SYNTHETIC, Splitter:B:117:0x0251] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5 A[SYNTHETIC, Splitter:B:37:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163 A[SYNTHETIC, Splitter:B:81:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0186 A[SYNTHETIC, Splitter:B:86:0x0186] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c6 A[Catch:{ Exception -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cd A[Catch:{ Exception -> 0x01d3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m94254a(tt1.C78095h r17, android.content.Context r18) {
        /*
            r17.getClass()
            java.lang.String r1 = "MicroMsg.HuaweiBiometricPayManagerImpl"
            java.lang.String r0 = "initTASecureWorld"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r17.gw0()
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "device is not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x024b
        L_0x0017:
            java.lang.String r2 = "copyTAFromAssets close out stream Exception "
            java.lang.String r3 = "copyTAFromAssets close in stream Exception "
            java.lang.String r4 = st1.C77770n.m93839a(r18)
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            java.lang.String r5 = r0.getPath()
            r6 = 0
            if (r5 == 0) goto L_0x0044
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)
            java.lang.String r7 = r0.getPath()
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0044
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r5)
            android.net.Uri r0 = r0.build()
        L_0x0044:
            r5 = r0
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r7 = 0
            com.tencent.mm.vfs.f0$h r8 = r0.mo177799l(r5, r7)
            boolean r0 = r8.mo177810a()
            if (r0 != 0) goto L_0x0054
            r0 = 0
            goto L_0x005c
        L_0x0054:
            com.tencent.mm.vfs.FileSystem$c r0 = r8.f348991a
            java.lang.String r9 = r8.f348992b
            boolean r0 = r0.mo119948x(r9)
        L_0x005c:
            r9 = 1024(0x400, float:1.435E-42)
            java.lang.String r10 = "b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec"
            java.lang.String r11 = ""
            java.lang.String r12 = "MicroMsg.FingerPrintUtil"
            r13 = 1
            if (r0 != 0) goto L_0x006a
            r15 = r7
            goto L_0x00d2
        L_0x006a:
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163865u(r5)
            java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            android.content.res.AssetManager r0 = r18.getAssets()     // Catch:{ IOException -> 0x009c, all -> 0x0097 }
            java.io.InputStream r15 = r0.open(r10)     // Catch:{ IOException -> 0x009c, all -> 0x0097 }
            if (r15 == 0) goto L_0x0085
            java.lang.String r0 = p823sg.C90193h.m112874b(r15, r9)     // Catch:{ IOException -> 0x0083 }
            r16 = r0
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            goto L_0x009e
        L_0x0085:
            r16 = r11
        L_0x0087:
            if (r15 == 0) goto L_0x0094
            r15.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0094
        L_0x008d:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r7, r11, r0)
        L_0x0094:
            r0 = r16
            goto L_0x00b1
        L_0x0097:
            r0 = move-exception
            r1 = r0
            r7 = 0
            goto L_0x024f
        L_0x009c:
            r0 = move-exception
            r15 = 0
        L_0x009e:
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x024c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r7)     // Catch:{ all -> 0x024c }
            if (r15 == 0) goto L_0x00b0
            r15.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00b0
        L_0x00a9:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r7, r11, r0)
        L_0x00b0:
            r0 = r11
        L_0x00b1:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 != 0) goto L_0x00c4
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x00c4
            boolean r7 = r14.equals(r0)
            if (r7 == 0) goto L_0x00c4
            goto L_0x00d0
        L_0x00c4:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 != 0) goto L_0x00d2
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d2
        L_0x00d0:
            r0 = 0
            goto L_0x00d3
        L_0x00d2:
            r0 = 1
        L_0x00d3:
            if (r0 == 0) goto L_0x0237
            r7 = -1
            android.content.res.AssetManager r0 = r18.getAssets()     // Catch:{ Exception -> 0x0142, all -> 0x013d }
            java.io.InputStream r15 = r0.open(r10)     // Catch:{ Exception -> 0x0142, all -> 0x013d }
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0142, all -> 0x013d }
            com.tencent.mm.vfs.f0$h r0 = r0.mo177799l(r5, r8)     // Catch:{ Exception -> 0x0142, all -> 0x013d }
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106425G(r5, r0, r6)     // Catch:{ Exception -> 0x0142, all -> 0x013d }
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x013b }
        L_0x00ea:
            int r8 = r15.read(r0)     // Catch:{ Exception -> 0x013b }
            if (r8 == r7) goto L_0x00f4
            r5.write(r0, r6, r8)     // Catch:{ Exception -> 0x013b }
            goto L_0x00ea
        L_0x00f4:
            r5.flush()     // Catch:{ Exception -> 0x013b }
            r15.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x0118
        L_0x00fb:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r7, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r7.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0118:
            r5.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0139
        L_0x011c:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0139:
            r7 = 0
            goto L_0x01a7
        L_0x013b:
            r0 = move-exception
            goto L_0x0144
        L_0x013d:
            r0 = move-exception
            r1 = r0
            r7 = 0
            goto L_0x01f0
        L_0x0142:
            r0 = move-exception
            r5 = 0
        L_0x0144:
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x01ed }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r8)     // Catch:{ all -> 0x01ed }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ed }
            r8.<init>()     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = "copyTAFromAssets Exception "
            r8.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01ed }
            r8.append(r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ all -> 0x01ed }
            if (r15 == 0) goto L_0x0184
            r15.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x0184
        L_0x0167:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r8, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r8.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0184:
            if (r5 == 0) goto L_0x01a7
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x01a7
        L_0x018a:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x01a7:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x01d3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d3 }
            r2.<init>()     // Catch:{ Exception -> 0x01d3 }
            java.lang.String r3 = "chmod 777 "
            r2.append(r3)     // Catch:{ Exception -> 0x01d3 }
            r2.append(r4)     // Catch:{ Exception -> 0x01d3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01d3 }
            java.lang.Process r0 = r0.exec(r2)     // Catch:{ Exception -> 0x01d3 }
            int r0 = r0.waitFor()     // Catch:{ Exception -> 0x01d3 }
            if (r0 != 0) goto L_0x01cd
            java.lang.String r0 = "chmod wechat ta file succeed "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x01d3 }
            goto L_0x0238
        L_0x01cd:
            java.lang.String r0 = "chmod wechat ta file failed "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x01d3 }
            goto L_0x0238
        L_0x01d3:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "chmod wechat ta file Exception "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x0238
        L_0x01ed:
            r0 = move-exception
            r7 = r5
            r1 = r0
        L_0x01f0:
            if (r15 == 0) goto L_0x0213
            r15.close()     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0213
        L_0x01f6:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r4, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r4.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0213:
            if (r7 == 0) goto L_0x0236
            r7.close()     // Catch:{ IOException -> 0x0219 }
            goto L_0x0236
        L_0x0219:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0236:
            throw r1
        L_0x0237:
            r7 = 0
        L_0x0238:
            if (r7 == 0) goto L_0x0243
            st1.C77770n.m93843e(r6)
            java.lang.String r0 = "copyTAFromAssets failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x024b
        L_0x0243:
            st1.C77770n.m93843e(r13)
            java.lang.String r0 = "copyTAFromAssets success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x024b:
            return
        L_0x024c:
            r0 = move-exception
            r7 = r15
            r1 = r0
        L_0x024f:
            if (r7 == 0) goto L_0x025c
            r7.close()     // Catch:{ IOException -> 0x0255 }
            goto L_0x025c
        L_0x0255:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r2, r11, r0)
        L_0x025c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tt1.C78095h.m94254a(tt1.h, android.content.Context):void");
    }

    public void Dq0(Context context, C78092f fVar, C78088b bVar) {
    }

    /* renamed from: G3 */
    public void mo108070G3(Object... objArr) {
        if (objArr == null || objArr.length < 1) {
            Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "hy: param incorrect");
            return;
        }
        String b = C77770n.m93840b();
        if (C77770n.m93841c()) {
            FingerPrintAuth.clearData(C77770n.m93839a(MMApplicationContext.getContext()), b, objArr[0].intValue());
        } else {
            Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "device is not support FingerPrintAuth");
        }
        Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "clear fingerprint data id:" + b + " clear_rsa_key_level:" + objArr[0]);
    }

    /* renamed from: H0 */
    public boolean mo108071H0() {
        return false;
    }

    /* renamed from: Hz */
    public void mo108072Hz(boolean z, boolean z2, boolean z3, Bundle bundle) {
    }

    /* renamed from: J4 */
    public boolean mo108073J4() {
        return false;
    }

    /* renamed from: Qk */
    public boolean mo108074Qk() {
        int[] iArr;
        mo108088b();
        C76518a aVar = this.f228900d;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        try {
            iArr = aVar.f223970a.mo106757vU(aVar.f223971b);
        } catch (RemoteException unused) {
            iArr = new int[0];
        }
        if (iArr == null || iArr.length <= 0) {
            Log.m105920e("MicroMsg.HuaweiBiometricPayManagerImpl", "ids is null");
        }
        try {
            this.f228900d.mo106747b();
        } catch (Exception unused2) {
        }
        this.f228900d = null;
        if (iArr != null && iArr.length > 0) {
            z = true;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C78097b(this, z));
        return z;
    }

    /* renamed from: RQ */
    public C78476d mo108075RQ() {
        return new C77774s();
    }

    /* renamed from: Wy */
    public boolean mo108076Wy(Context context) {
        return mo108079gv();
    }

    /* renamed from: b */
    public final C76518a mo108088b() {
        C76525c a = C76518a.m91995a();
        C76518a aVar = null;
        if (a != null) {
            try {
                aVar = new C76518a(a, Looper.getMainLooper(), 1);
            } catch (Exception unused) {
            }
        }
        this.f228900d = aVar;
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|(1:5)|6|7|8|9|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r3 = this;
            k9.a r0 = r3.f228900d
            if (r0 == 0) goto L_0x0019
            k9.a$c r1 = r0.f223972c     // Catch:{ Exception -> 0x0019 }
            if (r1 == 0) goto L_0x000d
            r2 = 8
            r1.removeMessages(r2)     // Catch:{ Exception -> 0x0019 }
        L_0x000d:
            k9.c r1 = r0.f223970a     // Catch:{ RemoteException -> 0x0014 }
            k9.b r0 = r0.f223971b     // Catch:{ RemoteException -> 0x0014 }
            r1.Ed0(r0)     // Catch:{ RemoteException -> 0x0014 }
        L_0x0014:
            k9.a r0 = r3.f228900d     // Catch:{ Exception -> 0x0019 }
            r0.mo106747b()     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tt1.C78095h.cancel():void");
    }

    public int fr0() {
        return 1;
    }

    /* renamed from: gv */
    public boolean mo108079gv() {
        return gw0() && C77770n.m93842d() && C77770n.f226610a;
    }

    public boolean gw0() {
        int[] iArr;
        boolean z;
        boolean z2 = C107835h0.f322849f.f322932a == 1;
        boolean z3 = C107835h0.f322851h.f322842a;
        C76525c a = C76518a.m91995a();
        if (a == null) {
            iArr = new int[0];
        } else {
            try {
                iArr = a.mo106753XW();
            } catch (RemoteException unused) {
                iArr = new int[0];
            }
        }
        if (iArr != null) {
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                } else if (1 == iArr[i]) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "is support: %s, %s, %s", Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(z3));
            return !z2 ? false : false;
        }
        z = false;
        Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "is support: %s, %s, %s", Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(z3));
        return !z2 ? false : false;
    }

    /* renamed from: n3 */
    public boolean mo108081n3() {
        return false;
    }

    /* renamed from: n4 */
    public void mo108082n4(Context context, C78092f fVar, C78088b bVar) {
        Log.m105925i("MicroMsg.HuaweiBiometricPayManagerImpl", "request fingerprint authorize: %s", fVar.f228896c);
        if (this.f228900d == null) {
            Log.m105918d("MicroMsg.HuaweiBiometricPayManagerImpl", "open auth once");
            mo108088b();
        }
        MMHandlerThread.postToMainThreadDelayed(new C78099d(bVar, fVar), 300);
    }

    public void prepare() {
        Class cls = C78473a.class;
        if (((C78473a) C86709a0.m107533q(cls)).type() != 1) {
            Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "set soter manager");
            C77767l lVar = new C77767l();
            lVar.f226572d = this;
            C86709a0.m107532n(cls, lVar);
        }
        if (C87203t.m108279o()) {
            Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "not support 64bit");
        } else {
            ThreadPool.post(new C78096a(), C78095h.class.getName());
        }
    }

    /* renamed from: rn */
    public void mo108084rn(Context context, C78092f fVar, C78090d dVar) {
        Log.m105924i("MicroMsg.HuaweiBiometricPayManagerImpl", "request fingerprint authorize for pay");
        if (dVar != null) {
            mo108082n4(context, fVar, new C78098c(this, dVar));
        }
    }

    /* renamed from: t0 */
    public Map<String, String> mo108085t0() {
        return null;
    }

    /* renamed from: xx */
    public boolean mo108086xx() {
        return true;
    }

    /* renamed from: zy */
    public boolean mo108087zy(Context context) {
        return false;
    }
}
