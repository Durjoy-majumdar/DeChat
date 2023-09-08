package com.tencent.p014mm.modelavatar;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31536y2;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import lu3.C109426i;
import lu3.C88656g;
import o90.C100308d;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C10578j;
import p823sg.C101611g;
import p996kj.C88155a;
import pe3.C89349b;
import q90.C101062d;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C52265zh2;
import z51.C102975i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelavatar.g */
public class C68082g implements C11385n, C10578j {

    /* renamed from: d */
    public boolean f195675d = false;

    /* renamed from: e */
    public Set<String> f195676e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    public C101611g<String, C68090h> f195677f = new C100308d(400);

    /* renamed from: g */
    public Stack<C68097n> f195678g = new Stack<>();

    /* renamed from: h */
    public volatile String f195679h;

    /* renamed from: i */
    public C101611g<String, String> f195680i = new C100308d(200);

    /* renamed from: j */
    public MTimerHandler f195681j = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C68086d(), false);

    /* renamed from: com.tencent.mm.modelavatar.g$a */
    public class C68083a implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ String f195682d;

        public C68083a(String str) {
            this.f195682d = str;
        }

        public String getKey() {
            return "AvatarService#checkAvatarExpire";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f195682d)) {
                if (this.f195682d.equals(C68082g.this.f195679h)) {
                    Log.m105924i("MicroMsg.AvatarService", "thisUser is empty!!");
                    return;
                }
                C68082g.this.getClass();
                C68098o zx02 = C86709a0.m107523b().mo121114l() ? C68102u.zx0() : null;
                if (zx02 == null) {
                    Log.m105924i("MicroMsg.AvatarService", "istg is null!!");
                    return;
                }
                C68097n Lo = zx02.mo93607Lo(this.f195682d);
                if (Lo == null || !Lo.mo93598g().equals(this.f195682d)) {
                    Log.m105924i("MicroMsg.AvatarService", "imgFlag is null or username not equal");
                    return;
                }
                if (!(Util.nowSecond() - (((long) Lo.f195734g) * 60) > 86400)) {
                    Log.m105924i("MicroMsg.AvatarService", "imgFlag is expired!!");
                } else if (Util.isNullOrNil(Lo.mo93597f())) {
                    Log.m105929w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", this.f195682d);
                } else {
                    C68082g.this.mo93582i(this.f195682d);
                }
            }
        }

        public String toString() {
            return super.toString() + "|checkAvatarExpire";
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$b */
    public class C68084b implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ String f195684d;

        public C68084b(String str) {
            this.f195684d = str;
        }

        public String getKey() {
            return "AvatarService#checkAvatarUpdateExpire";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            if (!this.f195684d.equals(C68082g.this.f195679h)) {
                C68090h hVar = (C68090h) ((C101062d) C68082g.this.f195677f).mo139556b(this.f195684d);
                if (hVar != null && Util.nowSecond() - hVar.f195702a > 21600 && !C86013q1.m106450k(C68102u.wx0().mo93559h(this.f195684d, false))) {
                    Log.m105925i("MicroMsg.AvatarService", "checkAvatarUpdateExpire refresh username:%s, lastTime:%s, retryCount:%s", Util.nullAs(this.f195684d, ""), Long.valueOf(hVar.f195702a), Integer.valueOf(hVar.f195703b));
                    ((C101062d) C68082g.this.f195677f).remove(this.f195684d);
                    C68082g.this.mo93582i(this.f195684d);
                }
            }
        }

        public String toString() {
            return super.toString() + "|checkAvatarUpdateExpire";
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$c */
    public class C68085c implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ QueueWorkerThread.ThreadObject f195686d;

        public C68085c(C68082g gVar, QueueWorkerThread.ThreadObject threadObject) {
            this.f195686d = threadObject;
        }

        public String getKey() {
            return "AvatarService#putAsyncTask";
        }

        public void run() {
            this.f195686d.doInBackground();
            this.f195686d.onPostExecute();
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$d */
    public class C68086d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public long f195687d = 0;

        public C68086d() {
        }

        public boolean onTimerExpired() {
            long currentTimeMillis = System.currentTimeMillis();
            if (C68082g.this.f195675d) {
                long j = this.f195687d;
                if (currentTimeMillis - j > 60000) {
                    Log.m105929w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", Long.valueOf(currentTimeMillis - j));
                    C68082g.this.f195675d = false;
                }
            }
            C68082g gVar = C68082g.this;
            if (gVar.f195675d) {
                gVar.f195681j.startTimer(1000);
                return false;
            }
            this.f195687d = currentTimeMillis;
            gVar.f195675d = true;
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 5 && C68082g.this.f195678g.size() > 0; i++) {
                C115669n.INSTANCE.idkeyStat(138, 42, 1, true);
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = Util.nullAsNil(C68082g.this.f195678g.pop().mo93598g());
                rv32.f141176e = true;
                linkedList.add(rv32);
            }
            C86709a0.m107524d().mo123460f(new C40354p(linkedList));
            C115669n.INSTANCE.idkeyStat(138, 44, 1, true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$e */
    public class C68087e implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public C68097n f195689d;

        /* renamed from: e */
        public byte[] f195690e;

        /* renamed from: f */
        public boolean f195691f;

        /* renamed from: g */
        public byte[] f195692g;

        public C68087e(C68097n nVar, byte[] bArr, boolean z) {
            this.f195689d = nVar;
            this.f195690e = bArr;
            this.f195691f = z;
        }

        public boolean doInBackground() {
            byte[] bArr;
            if (this.f195691f) {
                Log.m105924i("MicroMsg.AvatarService", "DecryptAvatar: decrypt");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(138, 51);
                bArr = UtilsJni.DecryptAvatar(this.f195690e);
                if (Util.isNullOrNil(bArr)) {
                    nVar.mo175911u(138, 52);
                    Log.m105924i("MicroMsg.AvatarService", "DecryptAvatar: decrypt output empty");
                    return false;
                }
            } else {
                bArr = this.f195690e;
            }
            if (ImgUtil.isWXGF(bArr)) {
                Log.m105924i("MicroMsg.AvatarService", "DecryptAvatar: hevc to pic");
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175911u(138, 53);
                byte[] Gj = ((C102975i) C86312j.m106911c(C102975i.class)).mo141695Gj(bArr);
                this.f195692g = Gj;
                if (!Util.isNullOrNil(Gj)) {
                    return true;
                }
                nVar2.mo175911u(138, 54);
                Log.m105924i("MicroMsg.AvatarService", "DecryptAvatar: output is empty");
                return false;
            }
            this.f195692g = bArr;
            return true;
        }

        public boolean onPostExecute() {
            if (!Util.isNullOrNil(this.f195692g)) {
                Log.m105925i("MicroMsg.AvatarService", "DecryptAvatar: post to save length is %s", Integer.valueOf(this.f195692g.length));
                C68082g gVar = C68082g.this;
                gVar.mo93580g(new C68091i(this.f195689d, this.f195692g));
                return true;
            }
            Log.m105924i("MicroMsg.AvatarService", "DecryptAvatar: onPostExecute output is empty");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$f */
    public class C68088f implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public C68097n f195694d;

        /* renamed from: e */
        public byte[] f195695e = null;

        /* renamed from: f */
        public boolean f195696f = false;

        public C68088f(C68097n nVar) {
            this.f195694d = nVar;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0481  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0484  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x048c  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x048f  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x049c  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0501  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x0504  */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x050c  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x050f  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x051c  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x0583  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x0586  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x058e  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x0591  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x059e  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0605  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0608  */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0610  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x0613  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x0620  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x064a A[SYNTHETIC, Splitter:B:197:0x064a] */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0653 A[Catch:{ Exception -> 0x064e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r35 = this;
                r1 = r35
                java.lang.String r2 = "HTTP download exception: url:%s exception:%s %s"
                java.lang.String r3 = "null"
                com.tencent.mm.modelavatar.n r4 = r1.f195694d
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                if (r4 != 0) goto L_0x0010
                return r5
            L_0x0010:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r4)
                java.lang.String r7 = "MicroMsg.HttpGetAvatar"
                if (r4 != 0) goto L_0x0024
                java.lang.String r4 = "[tomys] network is unavailable, skip rest loading logic."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r4)
                com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()
            L_0x0024:
                com.tencent.mm.modelavatar.n r4 = r1.f195694d
                java.lang.String r4 = r4.mo93597f()
                java.lang.Class<z51.i> r8 = z51.C102975i.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                z51.i r8 = (z51.C102975i) r8
                boolean r8 = r8.mo141697he()
                com.tencent.mm.modelcdntran.u r9 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
                java.lang.Object r10 = r9.f267122o
                monitor-enter(r10)
                int r9 = r9.f267123p     // Catch:{ all -> 0x06b2 }
                monitor-exit(r10)     // Catch:{ all -> 0x06b2 }
                r10 = 1
                if (r9 == 0) goto L_0x0045
                r9 = 1
                goto L_0x0046
            L_0x0045:
                r9 = 0
            L_0x0046:
                if (r8 == 0) goto L_0x0083
                if (r9 != 0) goto L_0x0083
                java.lang.String r8 = "HttpGetAvatar: get hevc"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.lang.String r8 = "?"
                boolean r8 = r4.contains(r8)
                if (r8 == 0) goto L_0x0069
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r4)
                java.lang.String r4 = "&tp=wxpic"
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                goto L_0x007a
            L_0x0069:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r4)
                java.lang.String r4 = "?tp=wxpic"
                r8.append(r4)
                java.lang.String r4 = r8.toString()
            L_0x007a:
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 138(0x8a, float:1.93E-43)
                r11 = 50
                r8.mo175911u(r9, r11)
            L_0x0083:
                f40.e r8 = f40.C86709a0.m107523b()
                boolean r8 = r8.mo121114l()
                r9 = 3
                java.lang.String r11 = ""
                r12 = 4
                r13 = 2
                if (r8 == 0) goto L_0x00e6
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r14 = "https://"
                r8.append(r14)
                r14 = 2131831344(0x7f112a30, float:1.929571E38)
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r14)
                r8.append(r14)
                java.lang.String r14 = "/?version=%d&uin=%s&nettype=%d&signal=%d"
                r8.append(r14)
                java.lang.String r8 = r8.toString()
                java.lang.Object[] r14 = new java.lang.Object[r12]
                int r15 = qe3.C89625d.f257841g
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r5] = r15
                f40.e r15 = f40.C86709a0.m107523b()
                int r15 = r15.mo121110g()
                java.lang.String r15 = p823sg.C77710q.m93738a(r15)
                r14[r10] = r15
                android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r15)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r13] = r15
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r15 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
                int r15 = r15.getCompatMixStrength()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r9] = r15
                java.lang.String r8 = java.lang.String.format(r8, r14)
                goto L_0x00e7
            L_0x00e6:
                r8 = r11
            L_0x00e7:
                java.lang.Object[] r14 = new java.lang.Object[r13]
                com.tencent.mm.modelavatar.n r15 = r1.f195694d
                java.lang.String r15 = r15.mo93598g()
                r14[r5] = r15
                r14[r10] = r8
                java.lang.String r15 = "dkreferer dkavatar user: %s referer: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r15, r14)
                r14 = 0
                r1.f195695e = r14
                java.io.ByteArrayOutputStream r15 = new java.io.ByteArrayOutputStream
                r15.<init>()
                r16 = 0
                com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 40
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)
                r26 = 10003(0x2713, float:1.4017E-41)
                r27 = 9
                r28 = 8
                r29 = 7
                r30 = 6
                r31 = 5
                r32 = 100001(0x186a1, float:1.40131E-40)
                long r16 = java.lang.System.currentTimeMillis()     // Catch:{ ProtocolException -> 0x05c6, SocketTimeoutException -> 0x0544, IOException -> 0x04c4, Exception -> 0x0444 }
                com.tencent.mm.network.d0 r13 = com.tencent.p014mm.network.C81035d.m98964e(r4, r14)     // Catch:{ ProtocolException -> 0x05c6, SocketTimeoutException -> 0x0544, IOException -> 0x04c4, Exception -> 0x0444 }
                r14 = 1224(0x4c8, float:1.715E-42)
                r13.mo112942p(r14)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                r13.mo112944r(r10)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                r19 = 1224(0x4c8, double:6.047E-321)
                r21 = 96
                r23 = 1
                r25 = 0
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                java.lang.String r14 = "GET"
                r13.mo112943q(r14)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                java.lang.String r14 = "referer"
                r13.mo112921e(r14, r8)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                r8 = 5000(0x1388, float:7.006E-42)
                r13.mo112919d(r8)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                r13.mo112923g(r8)     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                int r8 = r13.mo112916a()     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                r14 = 200(0xc8, float:2.8E-43)
                if (r8 == r14) goto L_0x0319
                java.util.Map r14 = r13.mo112940n()     // Catch:{ ProtocolException -> 0x043d, SocketTimeoutException -> 0x0436, IOException -> 0x042f, Exception -> 0x0429 }
                if (r14 == 0) goto L_0x0172
                java.lang.String r10 = "X-ErrNo"
                java.lang.Object r10 = r14.get(r10)     // Catch:{ ProtocolException -> 0x016f, SocketTimeoutException -> 0x016c, IOException -> 0x0169, Exception -> 0x0166 }
                java.util.List r10 = (java.util.List) r10     // Catch:{ ProtocolException -> 0x016f, SocketTimeoutException -> 0x016c, IOException -> 0x0169, Exception -> 0x0166 }
                goto L_0x0173
            L_0x0166:
                r0 = move-exception
                r8 = r0
                goto L_0x0182
            L_0x0169:
                r0 = move-exception
                r8 = r0
                goto L_0x0186
            L_0x016c:
                r0 = move-exception
                r8 = r0
                goto L_0x018a
            L_0x016f:
                r0 = move-exception
                r8 = r0
                goto L_0x018e
            L_0x0172:
                r10 = 0
            L_0x0173:
                if (r10 == 0) goto L_0x0192
                int r14 = r10.size()     // Catch:{ ProtocolException -> 0x016f, SocketTimeoutException -> 0x016c, IOException -> 0x0169, Exception -> 0x0166 }
                if (r14 <= 0) goto L_0x0192
                java.lang.Object r10 = r10.get(r5)     // Catch:{ ProtocolException -> 0x016f, SocketTimeoutException -> 0x016c, IOException -> 0x0169, Exception -> 0x0166 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ ProtocolException -> 0x016f, SocketTimeoutException -> 0x016c, IOException -> 0x0169, Exception -> 0x0166 }
                goto L_0x0193
            L_0x0182:
                r34 = r3
                goto L_0x044a
            L_0x0186:
                r34 = r3
                goto L_0x04ca
            L_0x018a:
                r34 = r3
                goto L_0x054a
            L_0x018e:
                r34 = r3
                goto L_0x05cc
            L_0x0192:
                r10 = r11
            L_0x0193:
                java.lang.String r14 = "checkHttpConnection failed! url:%s code:%d xErr:%s"
                r34 = r3
                java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3[r5] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r18 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r19 = 1
                r3[r19] = r18     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r18 = 2
                r3[r18] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r14, r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 404(0x194, float:5.66E-43)
                if (r8 == r3) goto L_0x02d0
                r19 = 138(0x8a, double:6.8E-322)
                switch(r8) {
                    case 502: goto L_0x024e;
                    case 503: goto L_0x0207;
                    case 504: goto L_0x01c0;
                    default: goto L_0x01b3;
                }     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
            L_0x01b3:
                r21 = 6
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                goto L_0x0295
            L_0x01c0:
                r21 = 5
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 10
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r5] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 2
                r14[r3] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r9] = r6     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.mm.modelavatar.n r3 = r1.f195694d     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r3.mo93598g()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 4
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r31] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r30] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r27] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 14058(0x36ea, float:1.97E-41)
                r12.mo160131h(r3, r14)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                goto L_0x0317
            L_0x0207:
                r21 = 4
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 10
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r5] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 2
                r14[r3] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r9] = r6     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.mm.modelavatar.n r3 = r1.f195694d     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r3.mo93598g()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 4
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r31] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r30] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r27] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 14058(0x36ea, float:1.97E-41)
                r12.mo160131h(r3, r14)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                goto L_0x0317
            L_0x024e:
                r21 = 3
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 10
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r5] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 2
                r14[r3] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r9] = r6     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.mm.modelavatar.n r3 = r1.f195694d     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r3.mo93598g()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 4
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r31] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r30] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r27] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 14058(0x36ea, float:1.97E-41)
                r12.mo160131h(r3, r14)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                goto L_0x0317
            L_0x0295:
                r3 = 10
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r5] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 2
                r14[r3] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r9] = r6     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.mm.modelavatar.n r3 = r1.f195694d     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r3.mo93598g()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 4
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r31] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r30] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r27] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 14058(0x36ea, float:1.97E-41)
                r12.mo160131h(r3, r14)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                goto L_0x0317
            L_0x02d0:
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 2
                r23 = 1
                r25 = 1
                r18 = r12
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 10
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r5] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 2
                r14[r3] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r9] = r6     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                com.tencent.mm.modelavatar.n r3 = r1.f195694d     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r3.mo93598g()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 4
                r14[r8] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.String r3 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r31] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r30] = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r14[r27] = r10     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r3 = 14058(0x36ea, float:1.97E-41)
                r12.mo160131h(r3, r14)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
            L_0x0317:
                r2 = 1
                return r2
            L_0x0319:
                r34 = r3
                java.lang.String r3 = "X-Enc"
                int r3 = r13.mo112939m(r3, r5)     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r8 = 1
                if (r3 != r8) goto L_0x0326
                r3 = 1
                goto L_0x0327
            L_0x0326:
                r3 = 0
            L_0x0327:
                r1.f195696f = r3     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                int r3 = r13.mo112936j()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                java.io.InputStream r8 = r13.getInputStream()     // Catch:{ ProtocolException -> 0x0426, SocketTimeoutException -> 0x0423, IOException -> 0x0420, Exception -> 0x041d }
                r10 = 1024(0x400, float:1.435E-42)
                byte[] r10 = new byte[r10]     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
            L_0x0335:
                int r12 = r8.read(r10)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14 = -1
                if (r12 == r14) goto L_0x0340
                r15.write(r10, r5, r12)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                goto L_0x0335
            L_0x0340:
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 41
                r23 = 1
                r25 = 1
                r18 = r10
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                boolean r12 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                if (r12 == 0) goto L_0x0397
                r12 = 10
                java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r32)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r5] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r12 = 20000(0x4e20, float:2.8026E-41)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r18 = 1
                r14[r18] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r12 = 2
                r14[r12] = r11     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r9] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                com.tencent.mm.modelavatar.n r12 = r1.f195694d     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                java.lang.String r12 = r12.mo93598g()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r18 = 4
                r14[r18] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                java.lang.String r12 = r13.mo112937k()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r31] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                int r12 = r13.mo112938l()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r30] = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r29] = r11     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r28] = r4     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r14[r27] = r11     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r12 = 14058(0x36ea, float:1.97E-41)
                r10.mo160131h(r12, r14)     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
            L_0x0397:
                byte[] r12 = r15.toByteArray()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r1.f195695e = r12     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r15.close()     // Catch:{ ProtocolException -> 0x0415, SocketTimeoutException -> 0x040d, IOException -> 0x0405, Exception -> 0x03fd }
                r8.close()     // Catch:{ ProtocolException -> 0x03f5, SocketTimeoutException -> 0x03ed, IOException -> 0x03e5, Exception -> 0x03dd }
                if (r3 <= 0) goto L_0x03d9
                byte[] r8 = r1.f195695e     // Catch:{ ProtocolException -> 0x03d2, SocketTimeoutException -> 0x03cb, IOException -> 0x03c4, Exception -> 0x03bd }
                int r8 = r8.length     // Catch:{ ProtocolException -> 0x03d2, SocketTimeoutException -> 0x03cb, IOException -> 0x03c4, Exception -> 0x03bd }
                if (r8 >= r3) goto L_0x03d9
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 15
                r23 = 1
                r25 = 1
                r18 = r10
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ ProtocolException -> 0x03d2, SocketTimeoutException -> 0x03cb, IOException -> 0x03c4, Exception -> 0x03bd }
                java.lang.String r3 = "HTTP downloaded length is smaller than Content-Length field. Drop."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)     // Catch:{ ProtocolException -> 0x03d2, SocketTimeoutException -> 0x03cb, IOException -> 0x03c4, Exception -> 0x03bd }
                goto L_0x03d9
            L_0x03bd:
                r0 = move-exception
                r3 = r0
                r8 = r3
                r13 = 0
                r15 = 0
                goto L_0x044a
            L_0x03c4:
                r0 = move-exception
                r3 = r0
                r8 = r3
                r13 = 0
                r15 = 0
                goto L_0x04ca
            L_0x03cb:
                r0 = move-exception
                r3 = r0
                r8 = r3
                r13 = 0
                r15 = 0
                goto L_0x054a
            L_0x03d2:
                r0 = move-exception
                r3 = r0
                r8 = r3
                r13 = 0
                r15 = 0
                goto L_0x05cc
            L_0x03d9:
                r14 = 0
                r15 = 0
                goto L_0x0648
            L_0x03dd:
                r0 = move-exception
                r33 = r8
                r14 = 0
                r15 = 0
                r8 = r0
                goto L_0x044d
            L_0x03e5:
                r0 = move-exception
                r33 = r8
                r14 = 0
                r15 = 0
                r8 = r0
                goto L_0x04cd
            L_0x03ed:
                r0 = move-exception
                r33 = r8
                r14 = 0
                r15 = 0
                r8 = r0
                goto L_0x054d
            L_0x03f5:
                r0 = move-exception
                r33 = r8
                r14 = 0
                r15 = 0
                r8 = r0
                goto L_0x05cf
            L_0x03fd:
                r0 = move-exception
                r3 = r0
                r33 = r8
                r14 = r13
                r8 = r3
                goto L_0x044d
            L_0x0405:
                r0 = move-exception
                r3 = r0
                r33 = r8
                r14 = r13
                r8 = r3
                goto L_0x04cd
            L_0x040d:
                r0 = move-exception
                r3 = r0
                r33 = r8
                r14 = r13
                r8 = r3
                goto L_0x054d
            L_0x0415:
                r0 = move-exception
                r3 = r0
                r33 = r8
                r14 = r13
                r8 = r3
                goto L_0x05cf
            L_0x041d:
                r0 = move-exception
            L_0x041e:
                r3 = r0
                goto L_0x042d
            L_0x0420:
                r0 = move-exception
            L_0x0421:
                r3 = r0
                goto L_0x0433
            L_0x0423:
                r0 = move-exception
            L_0x0424:
                r3 = r0
                goto L_0x043a
            L_0x0426:
                r0 = move-exception
            L_0x0427:
                r3 = r0
                goto L_0x0441
            L_0x0429:
                r0 = move-exception
                r34 = r3
                goto L_0x041e
            L_0x042d:
                r8 = r3
                goto L_0x044a
            L_0x042f:
                r0 = move-exception
                r34 = r3
                goto L_0x0421
            L_0x0433:
                r8 = r3
                goto L_0x04ca
            L_0x0436:
                r0 = move-exception
                r34 = r3
                goto L_0x0424
            L_0x043a:
                r8 = r3
                goto L_0x054a
            L_0x043d:
                r0 = move-exception
                r34 = r3
                goto L_0x0427
            L_0x0441:
                r8 = r3
                goto L_0x05cc
            L_0x0444:
                r0 = move-exception
                r34 = r3
                r3 = r0
                r8 = r3
                r13 = 0
            L_0x044a:
                r14 = r13
                r33 = 0
            L_0x044d:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 0
                r23 = 1
                r25 = 1
                r18 = r3
                r18.idkeyStat(r19, r21, r23, r25)
                r10 = 10
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
                r10[r5] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
                r13 = 1
                r10[r13] = r12
                java.lang.String r12 = r8.getMessage()
                r13 = 2
                r10[r13] = r12
                r10[r9] = r6
                com.tencent.mm.modelavatar.n r6 = r1.f195694d
                java.lang.String r6 = r6.mo93598g()
                r12 = 4
                r10[r12] = r6
                if (r14 != 0) goto L_0x0484
                r6 = r34
                goto L_0x0488
            L_0x0484:
                java.lang.String r6 = r14.mo112937k()
            L_0x0488:
                r10[r31] = r6
                if (r14 != 0) goto L_0x048f
                r6 = r34
                goto L_0x0497
            L_0x048f:
                int r6 = r14.mo112938l()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L_0x0497:
                r10[r30] = r6
                if (r14 != 0) goto L_0x049c
                goto L_0x049e
            L_0x049c:
                r34 = r11
            L_0x049e:
                r10[r29] = r34
                r10[r28] = r4
                r10[r27] = r11
                r6 = 14058(0x36ea, float:1.97E-41)
                r3.mo160131h(r6, r10)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                r3[r5] = r4
                java.lang.Class r4 = r8.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r6 = 1
                r3[r6] = r4
                java.lang.String r4 = r8.getMessage()
                r6 = 2
                r3[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
                goto L_0x0646
            L_0x04c4:
                r0 = move-exception
                r34 = r3
                r3 = r0
                r8 = r3
                r13 = 0
            L_0x04ca:
                r14 = r13
                r33 = 0
            L_0x04cd:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 7
                r23 = 1
                r25 = 1
                r18 = r3
                r18.idkeyStat(r19, r21, r23, r25)
                r10 = 10
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
                r10[r5] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
                r13 = 1
                r10[r13] = r12
                java.lang.String r12 = r8.getMessage()
                r13 = 2
                r10[r13] = r12
                r10[r9] = r6
                com.tencent.mm.modelavatar.n r6 = r1.f195694d
                java.lang.String r6 = r6.mo93598g()
                r12 = 4
                r10[r12] = r6
                if (r14 != 0) goto L_0x0504
                r6 = r34
                goto L_0x0508
            L_0x0504:
                java.lang.String r6 = r14.mo112937k()
            L_0x0508:
                r10[r31] = r6
                if (r14 != 0) goto L_0x050f
                r6 = r34
                goto L_0x0517
            L_0x050f:
                int r6 = r14.mo112938l()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L_0x0517:
                r10[r30] = r6
                if (r14 != 0) goto L_0x051c
                goto L_0x051e
            L_0x051c:
                r34 = r11
            L_0x051e:
                r10[r29] = r34
                r10[r28] = r4
                r10[r27] = r11
                r6 = 14058(0x36ea, float:1.97E-41)
                r3.mo160131h(r6, r10)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                r3[r5] = r4
                java.lang.Class r4 = r8.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r6 = 1
                r3[r6] = r4
                java.lang.String r4 = r8.getMessage()
                r6 = 2
                r3[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
                goto L_0x0646
            L_0x0544:
                r0 = move-exception
                r34 = r3
                r3 = r0
                r8 = r3
                r13 = 0
            L_0x054a:
                r14 = r13
                r33 = 0
            L_0x054d:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 8
                r23 = 1
                r25 = 1
                r18 = r3
                r18.idkeyStat(r19, r21, r23, r25)
                r10 = 10
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
                r10[r5] = r12
                r12 = 10002(0x2712, float:1.4016E-41)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r13 = 1
                r10[r13] = r12
                java.lang.String r12 = r8.getMessage()
                r13 = 2
                r10[r13] = r12
                r10[r9] = r6
                com.tencent.mm.modelavatar.n r6 = r1.f195694d
                java.lang.String r6 = r6.mo93598g()
                r12 = 4
                r10[r12] = r6
                if (r14 != 0) goto L_0x0586
                r6 = r34
                goto L_0x058a
            L_0x0586:
                java.lang.String r6 = r14.mo112937k()
            L_0x058a:
                r10[r31] = r6
                if (r14 != 0) goto L_0x0591
                r6 = r34
                goto L_0x0599
            L_0x0591:
                int r6 = r14.mo112938l()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L_0x0599:
                r10[r30] = r6
                if (r14 != 0) goto L_0x059e
                goto L_0x05a0
            L_0x059e:
                r34 = r11
            L_0x05a0:
                r10[r29] = r34
                r10[r28] = r4
                r10[r27] = r11
                r6 = 14058(0x36ea, float:1.97E-41)
                r3.mo160131h(r6, r10)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                r3[r5] = r4
                java.lang.Class r4 = r8.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r6 = 1
                r3[r6] = r4
                java.lang.String r4 = r8.getMessage()
                r6 = 2
                r3[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
                goto L_0x0646
            L_0x05c6:
                r0 = move-exception
                r34 = r3
                r3 = r0
                r8 = r3
                r13 = 0
            L_0x05cc:
                r14 = r13
                r33 = 0
            L_0x05cf:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 1
                r23 = 1
                r25 = 1
                r18 = r3
                r18.idkeyStat(r19, r21, r23, r25)
                r10 = 10
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
                r10[r5] = r12
                r12 = 10001(0x2711, float:1.4014E-41)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r13 = 1
                r10[r13] = r12
                java.lang.String r12 = r8.getMessage()
                r13 = 2
                r10[r13] = r12
                r10[r9] = r6
                com.tencent.mm.modelavatar.n r6 = r1.f195694d
                java.lang.String r6 = r6.mo93598g()
                r12 = 4
                r10[r12] = r6
                if (r14 != 0) goto L_0x0608
                r6 = r34
                goto L_0x060c
            L_0x0608:
                java.lang.String r6 = r14.mo112937k()
            L_0x060c:
                r10[r31] = r6
                if (r14 != 0) goto L_0x0613
                r6 = r34
                goto L_0x061b
            L_0x0613:
                int r6 = r14.mo112938l()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L_0x061b:
                r10[r30] = r6
                if (r14 != 0) goto L_0x0620
                goto L_0x0622
            L_0x0620:
                r34 = r11
            L_0x0622:
                r10[r29] = r34
                r10[r28] = r4
                r10[r27] = r11
                r6 = 14058(0x36ea, float:1.97E-41)
                r3.mo160131h(r6, r10)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                r3[r5] = r4
                java.lang.Class r4 = r8.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r6 = 1
                r3[r6] = r4
                java.lang.String r4 = r8.getMessage()
                r6 = 2
                r3[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
            L_0x0646:
                r14 = r33
            L_0x0648:
                if (r14 == 0) goto L_0x0651
                r14.close()     // Catch:{ Exception -> 0x064e }
                goto L_0x0651
            L_0x064e:
                r0 = move-exception
                r2 = r0
                goto L_0x0689
            L_0x0651:
                if (r15 == 0) goto L_0x0656
                r15.close()     // Catch:{ Exception -> 0x064e }
            L_0x0656:
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x064e }
                long r2 = r2 - r16
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x064e }
                r9 = 1224(0x4c8, double:6.047E-321)
                r11 = 98
                r15 = 0
                r8 = r4
                r13 = r2
                r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ Exception -> 0x064e }
                r9 = 1224(0x4c8, double:6.047E-321)
                r11 = 100
                r13 = 1
                r15 = 0
                r8 = r4
                r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ Exception -> 0x064e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x064e }
                r4.<init>()     // Catch:{ Exception -> 0x064e }
                java.lang.String r6 = "use normal time "
                r4.append(r6)     // Catch:{ Exception -> 0x064e }
                r4.append(r2)     // Catch:{ Exception -> 0x064e }
                java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x064e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ Exception -> 0x064e }
                goto L_0x06b0
            L_0x0689:
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
                r4[r5] = r6
                java.lang.String r6 = "exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r6, r4)
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r2 = r2.getMessage()
                r4[r5] = r2
                java.lang.String r2 = "close conn failed : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r4)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 138(0x8a, double:6.8E-322)
                r11 = 9
                r13 = 1
                r15 = 1
                r8.idkeyStat(r9, r11, r13, r15)
            L_0x06b0:
                r2 = 1
                return r2
            L_0x06b2:
                r0 = move-exception
                r2 = r0
                monitor-exit(r10)     // Catch:{ all -> 0x06b2 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C68082g.C68088f.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            C68097n nVar = this.f195694d;
            if (nVar != null && !Util.isNullOrNil(nVar.mo93598g())) {
                if (Util.isNullOrNil(this.f195695e)) {
                    C68082g.this.f195676e.remove(this.f195694d.mo93598g());
                    C115669n.INSTANCE.idkeyStat(138, 10, 1, true);
                    return false;
                }
                C31536y2 y2Var = C31519v2.f84271a;
                if (y2Var != null) {
                    ((C29048w.C29055f) y2Var).mo56422a(this.f195695e.length, 0, 0);
                }
                C68082g gVar = C68082g.this;
                gVar.mo93580g(new C68087e(this.f195694d, this.f195695e, this.f195696f));
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$h */
    public static class C68090h {

        /* renamed from: a */
        public long f195702a = 0;

        /* renamed from: b */
        public int f195703b = 0;
    }

    /* renamed from: com.tencent.mm.modelavatar.g$i */
    public class C68091i implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public C68097n f195704d;

        /* renamed from: e */
        public byte[] f195705e;

        /* renamed from: f */
        public Bitmap f195706f = null;

        public C68091i(C68097n nVar, byte[] bArr) {
            this.f195704d = nVar;
            this.f195705e = bArr;
        }

        public boolean doInBackground() {
            C68097n nVar = this.f195704d;
            if (nVar == null || Util.isNullOrNil(nVar.mo93598g())) {
                Log.m105920e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
                C115669n.INSTANCE.idkeyStat(138, 13, 1, true);
                return false;
            }
            AvatarStorage e = C68082g.this.mo93578e();
            if (e != null) {
                e.mo93566o(this.f195704d.mo93598g(), false);
                e.mo93566o(this.f195704d.mo93598g(), true);
                Bitmap q = e.mo93568q(this.f195704d.mo93598g(), this.f195705e);
                this.f195706f = q;
                if (q == null) {
                    C115669n.INSTANCE.idkeyStat(138, 14, 1, true);
                }
            } else {
                Log.m105924i("MicroMsg.AvatarService", "astg is null!!");
            }
            C68082g.this.getClass();
            C68098o zx02 = C86709a0.m107523b().mo121114l() ? C68102u.zx0() : null;
            if (zx02 != null) {
                C68097n Lo = zx02.mo93607Lo(this.f195704d.mo93598g());
                if (Lo != null) {
                    String f = Lo.mo93597f();
                    if (!Util.isNullOrNil(f) && !Util.isNullOrNil(this.f195704d.mo93597f()) && !f.equals(this.f195704d.mo93597f())) {
                        if (e != null) {
                            e.mo93566o(this.f195704d.mo93598g(), false);
                            e.mo93566o(this.f195704d.mo93598g(), true);
                        }
                        Log.m105925i("MicroMsg.AvatarService", "small url is not same, must remove avatar file!! oldSmallUrl: %s, curSmallUrl: %s", this.f195704d.mo93597f(), f);
                        return false;
                    }
                }
                C68097n nVar2 = this.f195704d;
                nVar2.f195736i = -1;
                nVar2.mo93603l();
                C68097n nVar3 = this.f195704d;
                nVar3.f195735h = 0;
                zx02.mo93608Yt(nVar3);
            }
            return true;
        }

        public boolean onPostExecute() {
            if (Util.isNullOrNil(this.f195704d.mo93598g())) {
                return false;
            }
            AvatarStorage e = C68082g.this.mo93578e();
            if (!(e == null || this.f195706f == null)) {
                e.mo93569r(this.f195704d.mo93598g(), this.f195706f);
            }
            C68082g.this.f195676e.remove(this.f195704d.mo93598g());
            try {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1) {
                    ((C101062d) C68082g.this.f195677f).remove(this.f195704d.mo93598g());
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AvatarService", "SaveAvatar %s", e2.getMessage());
            }
            return false;
        }
    }

    public C68082g() {
        C86709a0.m107524d().mo123455a(123, this);
        this.f195675d = false;
        this.f195679h = C75592q0.m90789s();
    }

    /* renamed from: a */
    public void mo93574a() {
        while (this.f195678g.size() > 0) {
            this.f195676e.remove(this.f195678g.pop());
        }
    }

    /* renamed from: b */
    public void mo93575b(String str) {
        ((C119157j) C119157j.f356862d).mo183875f(new C68083a(str));
    }

    /* renamed from: c */
    public void mo93576c(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_contact_get_check_avatar_expire_sw, 1) == 1 && ((C101062d) this.f195677f).keySet().contains(str)) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C68084b(str));
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AvatarService", "checkAvatarUpdateExpire %s", e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public final void mo93577d(C40354p pVar) {
        C51163rv3 rv32;
        C89349b bVar;
        HashSet hashSet = new HashSet();
        LinkedList<C52265zh2> linkedList = pVar.f108450f;
        if (linkedList != null) {
            Iterator<C52265zh2> it = linkedList.iterator();
            while (it.hasNext()) {
                C52265zh2 next = it.next();
                if (next == null || (rv32 = next.f145962e) == null) {
                    Log.m105925i("MicroMsg.AvatarService", "error p is null or username is null %s", next);
                } else {
                    String str = rv32.f141175d;
                    C51018qv3 qv32 = next.f145961d;
                    if (qv32 == null || (bVar = qv32.f140574f) == null || bVar.f257327a == null) {
                        C115669n.INSTANCE.idkeyStat(138, 11, 1, true);
                    } else {
                        hashSet.add(str);
                        C68097n nVar = new C68097n();
                        nVar.f195728a = str;
                        nVar.f195729b = 3;
                        C115669n.INSTANCE.idkeyStat(138, 43, 1, true);
                        mo93580g(new C68091i(nVar, next.f145961d.f140574f.f257327a));
                    }
                }
            }
        }
        LinkedList<C51163rv3> linkedList2 = pVar.f108449e;
        if (linkedList2 != null) {
            Iterator<C51163rv3> it4 = linkedList2.iterator();
            while (it4.hasNext()) {
                C51163rv3 next2 = it4.next();
                if (next2 != null) {
                    String str2 = next2.f141175d;
                    if (!hashSet.contains(str2)) {
                        this.f195676e.remove(str2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final AvatarStorage mo93578e() {
        if (C86709a0.m107523b().mo121114l()) {
            return C68102u.wx0();
        }
        return null;
    }

    /* renamed from: f */
    public Bitmap mo93579f(String str, boolean z, int i, C68080d dVar) {
        Bitmap bitmap;
        AvatarStorage e = mo93578e();
        if (e != null) {
            if (i < 0 || i <= 5) {
                bitmap = null;
            } else {
                bitmap = e.mo93561j(String.format("%s$$%d", new Object[]{str, Integer.valueOf(i)}));
                if (bitmap != null) {
                    Log.m105925i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", Integer.valueOf(i));
                    mo93576c(str);
                    return bitmap;
                }
                Log.m105925i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", Integer.valueOf(i));
            }
            if (bitmap == null) {
                bitmap = e.mo93561j(str);
            }
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            if (i >= 0 && i > 5) {
                Log.m105925i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", Integer.valueOf(i));
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) i);
                e.mo93569r(String.format("%s$$%d", new Object[]{str, Integer.valueOf(i)}), bitmap);
            }
            mo93576c(str);
            return bitmap;
        } else if (z) {
            mo93576c(str);
            return null;
        } else {
            Log.m105927v("MicroMsg.AvatarService", "get bitmap from cache failed, try to load :%s", str);
            if (this.f195676e.contains(str)) {
                mo93576c(str);
                return null;
            }
            this.f195676e.add(str);
            mo93580g(new C68089g(str, dVar));
            return null;
        }
    }

    /* renamed from: g */
    public final int mo93580g(QueueWorkerThread.ThreadObject threadObject) {
        if (threadObject == null) {
            return -1;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C68085c(this, threadObject));
        return 1;
    }

    /* renamed from: h */
    public String mo93581h(String str) {
        String str2;
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            str2 = String.format("%s%x_%s", new Object[]{"ammURL_", Integer.valueOf(str.hashCode()), str.substring(str.length() - 24, str.length() - 4)});
        } catch (Exception unused) {
            str2 = String.format("%s%x_", new Object[]{"ammURL_", Integer.valueOf(str.hashCode())});
        }
        ((C101062d) this.f195680i).put(str2, str);
        return str2;
    }

    @Deprecated
    /* renamed from: i */
    public void mo93582i(String str) {
        mo93580g(new C68089g(str));
    }

    /* renamed from: j */
    public void mo93583j(String str, C68097n nVar) {
        if (nVar != null && Util.isNullOrNil(nVar.mo93597f())) {
            C68102u.wx0().mo93566o(str, false);
            C68102u.wx0().mo93566o(str, true);
        } else if (nVar != null) {
            nVar.f195735h = 1;
        }
        mo93580g(new C68089g(str));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (yVar2 != null && yVar.getType() == 123 && (yVar2 instanceof C40354p)) {
            if (!(i == 0 && i2 == 0)) {
                C115669n.INSTANCE.idkeyStat(138, 12, 1, true);
            }
            C115669n.INSTANCE.idkeyStat(138, 45, 1, true);
            try {
                mo93577d((C40354p) yVar2);
            } catch (NullPointerException e) {
                Log.m105921e("MicroMsg.AvatarService", "[onSceneEnd] NullPointerException:%s", e);
            }
            this.f195675d = false;
            if (this.f195678g.size() > 0) {
                this.f195681j.startTimer(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.g$g */
    public class C68089g implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public String f195698d;

        /* renamed from: e */
        public Bitmap f195699e;

        /* renamed from: f */
        public C68080d f195700f;

        public C68089g(String str) {
            this.f195699e = null;
            this.f195700f = null;
            this.f195698d = str;
        }

        public boolean doInBackground() {
            C68097n Lo;
            C68097n nVar;
            if (Util.isNullOrNil(this.f195698d)) {
                return false;
            }
            String str = this.f195698d;
            C68082g.this.getClass();
            if (str == null ? false : str.startsWith("ammURL_")) {
                String str2 = (String) ((C101062d) C68082g.this.f195680i).get(str);
                if (!Util.isNullOrNil(str2) && ((Lo = C68102u.zx0().mo93607Lo(str)) == null || !str.equals(Lo.mo93598g()))) {
                    C68098o zx02 = C68102u.zx0();
                    zx02.getClass();
                    Cursor rawQuery = zx02.f195738d.rawQuery("select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4,img_flag.updateflag from img_flag where img_flag.reserved2=\"" + Util.escapeSqlValue(str2) + FastJsonResponse.QUOTE, (String[]) null, 2);
                    if (rawQuery == null) {
                        nVar = null;
                    } else {
                        if (rawQuery.moveToFirst()) {
                            rawQuery.moveToFirst();
                            nVar = new C68097n();
                            nVar.mo93592a(rawQuery);
                        } else {
                            nVar = null;
                        }
                        rawQuery.close();
                    }
                    if (nVar != null && !Util.isNullOrNil(nVar.mo93598g())) {
                        C86013q1.m106442c(C68081f.m80468c(nVar.mo93598g(), false, false), C68081f.m80468c(str, false, true));
                    }
                    C68097n nVar2 = new C68097n();
                    nVar2.f195728a = str;
                    nVar2.f195729b = 3;
                    nVar2.f195731d = str2;
                    nVar2.f195732e = str2;
                    if (nVar != null) {
                        nVar2.f195735h = nVar.f195735h;
                    } else {
                        nVar2.f195735h = 1;
                    }
                    nVar2.f195733f = 1;
                    nVar2.f195736i = 31;
                    C68102u.zx0().mo93608Yt(nVar2);
                }
            }
            AvatarStorage e = C68082g.this.mo93578e();
            if (e == null) {
                return false;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AvatarStorage.f195665d;
            int intValue = concurrentHashMap.containsKey(this.f195698d) ? ((Integer) concurrentHashMap.get(this.f195698d)).intValue() : 0;
            if (intValue != 0) {
                C68102u.xx0().getClass();
                Context context = MMApplicationContext.getContext();
                if (context != null) {
                    e.mo93570s(this.f195698d, C88155a.decodeResource(context.getResources(), intValue, (BitmapFactory.Options) null));
                }
            }
            C68097n Lo2 = C68102u.zx0().mo93607Lo(this.f195698d);
            if (Lo2 != null) {
                if (Lo2.f195735h != 0) {
                    this.f195699e = null;
                    return true;
                }
            }
            String str3 = this.f195698d;
            this.f195699e = AvatarStorage.m80444f(e.mo93559h(str3, false), str3, true);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01d9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPostExecute() {
            /*
                r19 = this;
                r1 = r19
                android.graphics.Bitmap r0 = r1.f195699e
                r2 = 0
                if (r0 != 0) goto L_0x023f
                com.tencent.mm.modelavatar.g r3 = com.tencent.p014mm.modelavatar.C68082g.this
                java.lang.String r4 = r1.f195698d
                com.tencent.mm.modelavatar.d r5 = r1.f195700f
                r3.getClass()
                r6 = 1
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r2] = r4
                java.lang.String r7 = "MicroMsg.AvatarService"
                java.lang.String r8 = "avatar service push: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                r8 = 2
                r9 = 4
                r10 = 0
                r11 = 5
                if (r0 == 0) goto L_0x0027
                goto L_0x007a
            L_0x0027:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r12 = r3.f195679h
                r0.append(r12)
                java.lang.String r12 = "@bottle"
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x0057
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r12 = 60
                java.lang.Object r0 = r0.mo119684e(r12, r10)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r0, (boolean) r2)
                if (r0 != 0) goto L_0x0057
                goto L_0x007a
            L_0x0057:
                java.lang.String r0 = r3.f195679h
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x007d
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r12 = 59
                java.lang.Object r0 = r0.mo119684e(r12, r10)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r0, (boolean) r2)
                if (r0 != 0) goto L_0x007d
                java.lang.String r0 = "ConstantsStorage.USERINFO_HAS_HEADIMG false"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            L_0x007a:
                r11 = r3
                goto L_0x01d1
            L_0x007d:
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                sg.g<java.lang.String, com.tencent.mm.modelavatar.g$h> r0 = r3.f195677f
                q90.d r0 = (q90.C101062d) r0
                java.lang.Object r0 = r0.mo139556b(r4)
                r14 = r0
                com.tencent.mm.modelavatar.g$h r14 = (com.tencent.p014mm.modelavatar.C68082g.C68090h) r14
                r15 = 600(0x258, double:2.964E-321)
                if (r14 == 0) goto L_0x00a7
                int r0 = r14.f195703b
                if (r0 < r11) goto L_0x00a7
                long r10 = r14.f195702a
                long r10 = r12 - r10
                int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
                if (r0 >= 0) goto L_0x00a7
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r2] = r4
                java.lang.String r10 = "checkUser block by recentdown: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r10, r0)
                goto L_0x0177
            L_0x00a7:
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                com.tencent.mm.modelavatar.o r10 = com.tencent.p014mm.modelavatar.C68102u.zx0()
                com.tencent.mm.modelavatar.n r10 = r10.mo93607Lo(r4)
                r11 = 3
                if (r10 == 0) goto L_0x00cf
                java.lang.String r15 = r10.mo93598g()
                boolean r15 = r15.equals(r4)
                if (r15 == 0) goto L_0x00cf
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.String r15 = r10.mo93597f()
                r0[r2] = r15
                r0[r6] = r4
                java.lang.String r15 = "[isFlagNeed] getSmallUrl:%s username:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r0)
                goto L_0x015b
            L_0x00cf:
                k40.a r10 = f40.C86709a0.m107533q(r0)
                f62.k0 r10 = (f62.C75700k0) r10
                com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()
                com.tencent.mm.storage.z1 r10 = r10.get(r4)
                boolean r15 = r10.mo62932t3()
                if (r15 == 0) goto L_0x00e4
                goto L_0x00fa
            L_0x00e4:
                int r15 = r10.f149499G
                if (r15 != r9) goto L_0x00fc
                com.tencent.p014mm.modelavatar.C68081f.m80471f(r4, r15)
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r10 = r10.f149499G
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r0[r2] = r10
                java.lang.String r10 = "ct imgFlag :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r10, r0)
            L_0x00fa:
                r10 = 0
                goto L_0x015b
            L_0x00fc:
                com.tencent.mm.modelavatar.n r15 = new com.tencent.mm.modelavatar.n
                r15.<init>()
                r15.f195728a = r4
                r15.f195729b = r11
                r15.f195735h = r6
                k40.a r0 = f40.C86709a0.m107533q(r0)
                f62.k0 r0 = (f62.C75700k0) r0
                com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
                byte[] r0 = r0.mo69697f4(r4)
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
                if (r16 == 0) goto L_0x0126
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r2] = r4
                java.lang.String r10 = "[isFlagNeed] cmdBuf is null! username:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)
                r10 = r15
                goto L_0x015b
            L_0x0126:
                te3.jy2 r9 = new te3.jy2     // Catch:{ Exception -> 0x0137 }
                r9.<init>()     // Catch:{ Exception -> 0x0137 }
                pe3.a r0 = r9.parseFrom(r0)     // Catch:{ Exception -> 0x0137 }
                te3.jy2 r0 = (te3.C50052jy2) r0     // Catch:{ Exception -> 0x0137 }
                com.tencent.mm.modelavatar.n r0 = com.tencent.p014mm.modelavatar.C68081f.m80470e(r4, r0, r10)     // Catch:{ Exception -> 0x0137 }
                r10 = r0
                goto L_0x0146
            L_0x0137:
                r0 = move-exception
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r9[r2] = r0
                java.lang.String r0 = "exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r9)
                r10 = r15
            L_0x0146:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.String r9 = r10.mo93597f()
                r0[r2] = r9
                java.lang.String r9 = r10.mo93594c()
                r0[r6] = r9
                r0[r8] = r4
                java.lang.String r9 = "[isFlagNeed] finally! getSmallUrl:%s getBigUrl:%s username:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r0)
            L_0x015b:
                if (r10 != 0) goto L_0x017a
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r2] = r4
                java.lang.String r9 = "checkUser block local no need: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r9, r0)
                com.tencent.mm.modelavatar.g$h r0 = new com.tencent.mm.modelavatar.g$h
                r0.<init>()
                r9 = 5
                r0.f195703b = r9
                r0.f195702a = r12
                sg.g<java.lang.String, com.tencent.mm.modelavatar.g$h> r9 = r3.f195677f
                q90.d r9 = (q90.C101062d) r9
                r9.mo139557c(r4, r0)
            L_0x0177:
                r11 = r3
                r10 = 0
                goto L_0x01d1
            L_0x017a:
                if (r14 == 0) goto L_0x01b6
                long r8 = r14.f195702a
                long r8 = r12 - r8
                r17 = 600(0x258, double:2.964E-321)
                int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                if (r0 <= 0) goto L_0x0187
                goto L_0x01b6
            L_0x0187:
                int r0 = r14.f195703b
                r8 = 5
                if (r0 >= r8) goto L_0x007a
                java.lang.Object[] r8 = new java.lang.Object[r11]
                r8[r2] = r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r8[r6] = r0
                r11 = r3
                long r2 = r14.f195702a
                long r2 = r12 - r2
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r2 = 2
                r8[r2] = r0
                java.lang.String r0 = "checkUser: %s tryCount: %d time: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r8)
                int r0 = r14.f195703b
                int r0 = r0 + r6
                r14.f195703b = r0
                r14.f195702a = r12
                sg.g<java.lang.String, com.tencent.mm.modelavatar.g$h> r0 = r11.f195677f
                q90.d r0 = (q90.C101062d) r0
                r0.mo139557c(r4, r14)
                goto L_0x01d1
            L_0x01b6:
                r11 = r3
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r2 = 0
                r0[r2] = r4
                java.lang.String r2 = "new user: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
                com.tencent.mm.modelavatar.g$h r0 = new com.tencent.mm.modelavatar.g$h
                r0.<init>()
                r0.f195703b = r6
                r0.f195702a = r12
                sg.g<java.lang.String, com.tencent.mm.modelavatar.g$h> r2 = r11.f195677f
                q90.d r2 = (q90.C101062d) r2
                r2.mo139557c(r4, r0)
            L_0x01d1:
                if (r10 != 0) goto L_0x01d9
                java.util.Set<java.lang.String> r0 = r11.f195676e
                r0.remove(r4)
                goto L_0x023d
            L_0x01d9:
                java.lang.String r0 = r10.mo93597f()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x01ec
                com.tencent.mm.modelavatar.g$f r0 = new com.tencent.mm.modelavatar.g$f
                r0.<init>(r10)
                r11.mo93580g(r0)
                goto L_0x023d
            L_0x01ec:
                r2 = 2
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r2 = 0
                r0[r2] = r4
                int r2 = r10.f195729b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r6] = r2
                java.lang.String r2 = "dkhurl [%s] has NO URL flag:%d !"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r0)
                int r0 = r10.f195729b
                r2 = 4
                if (r2 != r0) goto L_0x020a
                java.lang.String r0 = "no avatar, do not batch get head image"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
                goto L_0x023d
            L_0x020a:
                if (r5 == 0) goto L_0x0220
                boolean r0 = r5.f195673a
                if (r0 != 0) goto L_0x0220
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r2 = 0
                r0[r2] = r4
                java.lang.String r2 = "avatar push username %s can not get avatar by username"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r0)
                java.util.Set<java.lang.String> r0 = r11.f195676e
                r0.remove(r4)
                goto L_0x023d
            L_0x0220:
                java.util.Stack<com.tencent.mm.modelavatar.n> r0 = r11.f195678g
                r0.push(r10)
                java.util.Stack<com.tencent.mm.modelavatar.n> r0 = r11.f195678g
                int r0 = r0.size()
                r2 = 5
                if (r0 <= r2) goto L_0x0236
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r11.f195681j
                r2 = 0
                r0.startTimer(r2)
                goto L_0x023d
            L_0x0236:
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r11.f195681j
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.startTimer(r2)
            L_0x023d:
                r2 = 0
                return r2
            L_0x023f:
                com.tencent.mm.modelavatar.g r0 = com.tencent.p014mm.modelavatar.C68082g.this
                com.tencent.mm.modelavatar.AvatarStorage r0 = r0.mo93578e()
                if (r0 == 0) goto L_0x024e
                java.lang.String r2 = r1.f195698d
                android.graphics.Bitmap r3 = r1.f195699e
                r0.mo93569r(r2, r3)
            L_0x024e:
                com.tencent.mm.modelavatar.g r0 = com.tencent.p014mm.modelavatar.C68082g.this
                java.util.Set<java.lang.String> r0 = r0.f195676e
                java.lang.String r2 = r1.f195698d
                r0.remove(r2)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C68082g.C68089g.onPostExecute():boolean");
        }

        public C68089g(String str, C68080d dVar) {
            this.f195699e = null;
            this.f195698d = str;
            this.f195700f = dVar;
        }
    }
}
