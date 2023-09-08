package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hd0.C98403m0;
import hd0.C98410o0;
import hd0.C98429r0;
import java.util.HashMap;
import p682rz.C101487r;
import p682rz.C101488s;
import uf0.C102022j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.t1 */
public class C97132t1 {

    /* renamed from: a */
    public int f284995a = 0;

    /* renamed from: b */
    public int f284996b = 0;

    /* renamed from: c */
    public C102022j f284997c;

    /* renamed from: d */
    public ImageGalleryVideoHandler f284998d;

    /* renamed from: e */
    public String f284999e;

    /* renamed from: f */
    public String f285000f;

    /* renamed from: g */
    public int f285001g;

    /* renamed from: h */
    public int f285002h;

    /* renamed from: i */
    public int f285003i;

    /* renamed from: j */
    public int f285004j;

    /* renamed from: k */
    public boolean f285005k;

    /* renamed from: l */
    public int f285006l = 0;

    /* renamed from: m */
    public int f285007m;

    /* renamed from: n */
    public HashMap<String, Integer> f285008n = new HashMap<>();

    /* renamed from: o */
    public int f285009o = 0;

    /* renamed from: p */
    public long f285010p;

    /* renamed from: q */
    public long f285011q;

    /* renamed from: r */
    public long f285012r;

    /* renamed from: s */
    public long f285013s;

    /* renamed from: t */
    public int f285014t;

    /* renamed from: u */
    public boolean f285015u = false;

    /* renamed from: v */
    public boolean f285016v = false;

    /* renamed from: w */
    public C97134b f285017w;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.t1$a */
    public class C97133a implements Runnable {
        public C97133a() {
        }

        public void run() {
            C97132t1 t1Var = C97132t1.this;
            ImageGalleryVideoHandler imageGalleryVideoHandler = t1Var.f284998d;
            if (imageGalleryVideoHandler != null) {
                MMHandlerThread.postToMainThread(new C97116p0(imageGalleryVideoHandler, t1Var.f284999e, false));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.t1$b */
    public static class C97134b {

        /* renamed from: a */
        public int f285019a;

        /* renamed from: b */
        public int f285020b;

        /* renamed from: c */
        public int f285021c;

        /* renamed from: d */
        public int f285022d;

        public C97134b(C97125s1 s1Var) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97132t1(com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler r12) {
        /*
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.f284995a = r0
            r11.f284996b = r0
            r11.f285006l = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r11.f285008n = r1
            r11.f285009o = r0
            r11.f285015u = r0
            r11.f285016v = r0
            r11.f284998d = r12
            r11.mo136040j()
            uf0.j r12 = new uf0.j
            r12.<init>()
            r11.f284997c = r12
            com.tencent.mm.ui.chatting.gallery.t1$b r12 = new com.tencent.mm.ui.chatting.gallery.t1$b
            r1 = 0
            r12.<init>(r1)
            r11.f285017w = r12
            java.lang.Class<lc3.b> r12 = lc3.C10485b.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            lc3.b r12 = (lc3.C10485b) r12
            pj.f r12 = r12.vh0()
            java.lang.String r1 = "AndroidOnlineVideoArgs"
            java.lang.String r12 = r12.mo107405c(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            r2 = 1048576(0x100000, float:1.469368E-39)
            r3 = 75
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 4
            java.lang.String r8 = "MicroMsg.OnlineVideoUIHelper"
            r9 = 1
            if (r1 != 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "online video config : "
            r1.append(r10)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            if (r12 == 0) goto L_0x009a
            int r1 = r12.length
            if (r1 < r7) goto L_0x009a
            com.tencent.mm.ui.chatting.gallery.t1$b r1 = r11.f285017w
            r10 = r12[r0]
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r4)
            r1.f285019a = r10
            com.tencent.mm.ui.chatting.gallery.t1$b r1 = r11.f285017w
            r10 = r12[r9]
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r9)
            r1.f285020b = r10
            com.tencent.mm.ui.chatting.gallery.t1$b r1 = r11.f285017w
            r10 = r12[r6]
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r3)
            r1.f285021c = r10
            com.tencent.mm.ui.chatting.gallery.t1$b r1 = r11.f285017w
            r12 = r12[r5]
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r9)
            int r12 = r12 * r2
            r1.f285022d = r12
            r12 = 1
            goto L_0x009b
        L_0x009a:
            r12 = 0
        L_0x009b:
            if (r12 != 0) goto L_0x00a7
            com.tencent.mm.ui.chatting.gallery.t1$b r12 = r11.f285017w
            r12.f285019a = r4
            r12.f285020b = r9
            r12.f285021c = r3
            r12.f285022d = r2
        L_0x00a7:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.tencent.mm.ui.chatting.gallery.t1$b r1 = r11.f285017w
            int r1 = r1.f285019a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            com.tencent.mm.ui.chatting.gallery.t1$b r0 = r11.f285017w
            int r0 = r0.f285020b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r9] = r0
            com.tencent.mm.ui.chatting.gallery.t1$b r0 = r11.f285017w
            int r0 = r0.f285021c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r6] = r0
            com.tencent.mm.ui.chatting.gallery.t1$b r0 = r11.f285017w
            int r0 = r0.f285022d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r5] = r0
            java.lang.String r0 = "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r12)
            com.tencent.mm.ui.chatting.gallery.t1$b r12 = r11.f285017w
            int r12 = r12.f285019a
            r11.f285007m = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97132t1.<init>(com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler):void");
    }

    /* renamed from: a */
    public final boolean mo136031a(int i, PInt pInt, PInt pInt2) {
        pInt.value = Math.max(i, this.f285006l);
        int i2 = this.f284996b;
        if (i2 == 1) {
            pInt.value = i;
            pInt2.value = this.f285007m + i;
        }
        if (i2 == 2) {
            int i3 = i - 8;
            pInt.value = i3;
            if (i3 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f285007m + 8;
        }
        if (i2 == 3 || i2 == 4) {
            pInt.value = this.f285006l;
            pInt2.value = this.f285007m + i + 2 + this.f285017w.f285020b;
        }
        int i4 = pInt2.value;
        int i5 = this.f285003i;
        if (i4 >= i5 + 1) {
            pInt2.value = i5 + 1;
        }
        int i6 = pInt2.value;
        int i7 = pInt.value;
        if (i6 <= i7) {
            pInt2.value = i7 + this.f285017w.f285020b;
            return false;
        }
        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", Integer.valueOf(i7), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f284996b), Integer.valueOf(this.f285006l), Integer.valueOf(this.f285007m));
        return true;
    }

    /* renamed from: b */
    public boolean mo136032b(int i) {
        boolean z;
        if (this.f284995a == 3) {
            return true;
        }
        int i2 = this.f285006l;
        if (i2 - i <= 2 && i2 < this.f285003i) {
            return false;
        }
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        try {
            if (!this.f284997c.mo89449d(i, i + 2, pInt, pInt2)) {
                return false;
            }
            z = ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(this.f285000f, pInt.value, pInt2.value);
            if (!z) {
                try {
                    this.f285006l = i;
                } catch (Exception e) {
                    e = e;
                }
            }
            return z;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", e, "", new Object[0]);
            Log.m105920e("MicroMsg.OnlineVideoUIHelper", "check video data error: " + e.toString());
            return z;
        }
    }

    /* renamed from: c */
    public final void mo136033c() {
        if (C98403m0.m127702b(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(this.f284999e))) {
            Log.m105925i("MicroMsg.OnlineVideoUIHelper", "download finish and is hevc need complete %s ", this.f284999e);
            if (C98429r0.m127801G(this.f284999e)) {
                C115669n.INSTANCE.idkeyStat(354, 134, 1, false);
            }
        }
    }

    /* renamed from: d */
    public boolean mo136034d(int i) {
        boolean z;
        int i2 = this.f285004j;
        if (i2 == -1) {
            i2 = i;
        }
        int i3 = 3;
        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d downloadStatus %d firPlayWait{%d} isPrepareVideo[%b]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f285006l), Integer.valueOf(this.f285003i), Integer.valueOf(this.f284995a), Long.valueOf(this.f285012r - this.f285010p), Boolean.valueOf(this.f285015u));
        int i4 = this.f284995a;
        if (i4 == 1) {
            if (!mo136032b(i2)) {
                this.f285005k = true;
                if (this.f285006l > 0) {
                    Log.m105924i("MicroMsg.OnlineVideoUIHelper", "pause by load data pauseByLoadDataCount : " + this.f285009o + " playStatus : " + this.f284996b);
                    this.f285013s = Util.nowMilliSecond();
                    int i5 = this.f284996b;
                    if (!(i5 == 2 || i5 == 4)) {
                        int i6 = this.f285007m + this.f285017w.f285019a;
                        this.f285007m = i6;
                        this.f285007m = Math.min(i6, 60);
                        this.f285009o++;
                        this.f284996b = 4;
                    }
                    this.f284998d.mo135833J();
                } else if (this.f285004j == -1) {
                    this.f284996b = 1;
                } else {
                    this.f284996b = 2;
                }
                z = false;
            } else {
                if (this.f285009o == 0 && this.f285012r == 0) {
                    mo136036f();
                }
                if (this.f285015u) {
                    this.f284998d.mo135838O(this.f284999e);
                    if (this.f285005k) {
                        if (this.f285009o == 0 && this.f285012r == 0) {
                            mo136036f();
                        } else {
                            long j = this.f285013s;
                            if (j > 0) {
                                this.f285014t = (int) (((long) this.f285014t) + Util.milliSecondsToNow(j));
                            }
                        }
                        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d", Integer.valueOf(this.f285009o), Integer.valueOf(this.f285014t));
                        int i7 = this.f285004j;
                        if (i7 != -1) {
                            this.f284998d.mo135837N(i7, true);
                            this.f285004j = -1;
                            this.f285005k = false;
                        } else {
                            this.f285005k = !this.f284998d.mo135836M();
                        }
                        this.f284996b = 3;
                    } else {
                        int i8 = this.f284996b;
                        if (i8 != 3) {
                            Log.m105925i("MicroMsg.OnlineVideoUIHelper", "start to play video playStatus[%d]", Integer.valueOf(i8));
                            if (!this.f284998d.mo135836M()) {
                                i3 = this.f284996b;
                            }
                            this.f284996b = i3;
                        }
                    }
                } else {
                    Log.m105925i("MicroMsg.OnlineVideoUIHelper", "prepare video [%s]", this.f284999e);
                    ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284998d;
                    String str = this.f284999e;
                    imageGalleryVideoHandler.getClass();
                    MMHandlerThread.postToMainThread(new C97116p0(imageGalleryVideoHandler, str, true));
                    this.f285015u = true;
                }
                z = true;
            }
            this.f284998d.mo135841R(i2);
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            if (!mo136031a(i2, pInt, pInt2)) {
                Log.m105918d("MicroMsg.OnlineVideoUIHelper", "can not calc download.");
            } else if (mo136039i(pInt.value, pInt2.value, false)) {
                this.f285006l = Math.max(this.f285006l, pInt2.value);
                return true;
            }
            return z;
        } else if (i4 != 3) {
            return true;
        } else {
            mo136036f();
            if (this.f285015u) {
                if (this.f285005k) {
                    int i9 = this.f285004j;
                    if (i9 != -1) {
                        this.f284998d.mo135837N(i9, true);
                        this.f285004j = -1;
                        this.f285005k = false;
                    } else {
                        this.f285005k = !this.f284998d.mo135836M();
                    }
                }
                this.f284998d.mo135841R(i2);
                return true;
            }
            ImageGalleryVideoHandler imageGalleryVideoHandler2 = this.f284998d;
            String str2 = this.f284999e;
            imageGalleryVideoHandler2.getClass();
            MMHandlerThread.postToMainThread(new C97116p0(imageGalleryVideoHandler2, str2, false));
            this.f285015u = true;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] mo136035e() {
        /*
            r17 = this;
            r0 = r17
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r2 = r0.f284998d
            int r3 = r2.f284576N
            r4 = 0
            if (r3 >= 0) goto L_0x000e
            r2.f284576N = r4
        L_0x000e:
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r2.f284593z
            r5[r4] = r6
            int r6 = r2.f284576N
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "MicroMsg.Imagegallery.handler.video"
            java.lang.String r8 = "get[%s] play video duration [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r5)
            int r2 = r2.f284576N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            long r8 = r0.f285012r
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x003b
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f285012r = r8
        L_0x003b:
            long r8 = r0.f285012r
            long r12 = r0.f285010p
            long r8 = r8 - r12
            int r2 = (int) r8
            if (r2 > 0) goto L_0x0044
            r2 = 0
        L_0x0044:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            long r8 = r0.f285011q
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0056
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f285011q = r8
        L_0x0056:
            long r8 = r0.f285011q
            long r12 = r0.f285010p
            long r8 = r8 - r12
            int r2 = (int) r8
            if (r2 > 0) goto L_0x005f
            r2 = 0
        L_0x005f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            int r2 = r0.f285009o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 3
            r1[r5] = r2
            int r2 = r0.f285009o
            r8 = 4
            if (r2 <= 0) goto L_0x008e
            int r2 = r0.f285014t
            if (r2 != 0) goto L_0x0082
            long r12 = (long) r2
            long r14 = r0.f285013s
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r14)
            long r12 = r12 + r14
            int r2 = (int) r12
            r0.f285014t = r2
        L_0x0082:
            int r2 = r0.f285014t
            int r9 = r0.f285009o
            int r2 = r2 / r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            goto L_0x0094
        L_0x008e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1[r8] = r2
        L_0x0094:
            r2 = 6
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r9 = r0.f284998d
            long r12 = r9.f284564B
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x00a6
            long r14 = r9.f284563A
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x00a6
            long r12 = r12 - r14
            int r10 = (int) r12
            goto L_0x00a7
        L_0x00a6:
            r10 = 0
        L_0x00a7:
            if (r10 >= 0) goto L_0x00aa
            r10 = 0
        L_0x00aa:
            r11 = 5
            java.lang.Object[] r12 = new java.lang.Object[r11]
            int r13 = r9.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            java.lang.String r4 = r9.f284593z
            r12[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r12[r3] = r4
            long r3 = r9.f284564B
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12[r5] = r3
            long r3 = r9.f284563A
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12[r8] = r3
            java.lang.String r3 = "%d filename[%s] get ui stay time[%d %d %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1[r11] = r3
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r3 = r0.f284998d
            int r3 = r3.f284565C
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97132t1.mo136035e():java.lang.Object[]");
    }

    /* renamed from: f */
    public final void mo136036f() {
        if (this.f285012r == 0) {
            this.f285012r = Util.nowMilliSecond();
        }
    }

    /* renamed from: g */
    public final void mo136037g() {
        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "play offline video %s ", this.f284999e);
        mo136036f();
        MMHandlerThread.postToMainThread(new C97133a());
    }

    /* renamed from: h */
    public void mo136038h() {
        String str = this.f285000f + 0 + "_" + -1;
        if (!this.f285008n.containsKey(str)) {
            Log.m105925i("MicroMsg.OnlineVideoUIHelper", "request all data. [%s]", this.f285000f);
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(this.f285000f, 0, -1, 0);
            this.f285008n.put(str, 0);
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(354, 24, 1, false);
            Log.m105929w("MicroMsg.OnlineVideoUIHelper", "%d rpt request all video %s ", Integer.valueOf(hashCode()), this.f284999e);
            nVar.mo160131h(13836, 303, Long.valueOf(Util.nowSecond()), "");
        }
        this.f284996b = 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo136039i(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            java.lang.Class<rz.r> r0 = p682rz.C101487r.class
            java.lang.String r1 = "MicroMsg.OnlineVideoUIHelper"
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
            r2.<init>()
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            r4 = 0
            uf0.j r5 = r10.f284997c     // Catch:{ Exception -> 0x002e }
            boolean r11 = r5.mo89449d(r11, r12, r2, r3)     // Catch:{ Exception -> 0x002e }
            if (r11 == 0) goto L_0x004e
            di3.d r11 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x002e }
            rz.r r11 = (p682rz.C101487r) r11     // Catch:{ Exception -> 0x002e }
            rz.n r11 = r11.mo140795W6()     // Catch:{ Exception -> 0x002e }
            java.lang.String r5 = r10.f285000f     // Catch:{ Exception -> 0x002e }
            int r6 = r2.value     // Catch:{ Exception -> 0x002e }
            int r7 = r3.value     // Catch:{ Exception -> 0x002e }
            com.tencent.mm.modelcdntran.e0 r11 = (com.tencent.p014mm.modelcdntran.C92755e0) r11     // Catch:{ Exception -> 0x002e }
            boolean r11 = r11.mo126989m(r5, r6, r7)     // Catch:{ Exception -> 0x002e }
            goto L_0x004f
        L_0x002e:
            r11 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "check video data error: "
            r5.append(r6)
            java.lang.String r11 = r11.toString()
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
        L_0x004e:
            r11 = 0
        L_0x004f:
            if (r11 != 0) goto L_0x00fc
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r10.f285008n
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r10.f285000f
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "_"
            r6.append(r7)
            r8 = -1
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L_0x0101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r10.f285000f
            r5.append(r6)
            int r6 = r2.value
            r5.append(r6)
            r5.append(r7)
            int r6 = r3.value
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r7 = r2.value
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            int r7 = r3.value
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            boolean r9 = r10.f285016v
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r6[r7] = r9
            r7 = 3
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r13)
            r6[r7] = r9
            java.lang.String r7 = "request video data [%d, %d] isRequestNow[%b] isSeek[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r6)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r10.f285008n
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x00e7
            boolean r6 = r10.f285016v
            if (r6 == 0) goto L_0x00c6
            if (r13 == 0) goto L_0x00e7
        L_0x00c6:
            r10.f285016v = r8
            di3.d r13 = di3.C86312j.m106911c(r0)
            rz.r r13 = (p682rz.C101487r) r13
            rz.n r13 = r13.mo140795W6()
            java.lang.String r0 = r10.f285000f
            int r1 = r2.value
            int r2 = r3.value
            com.tencent.mm.modelcdntran.e0 r13 = (com.tencent.p014mm.modelcdntran.C92755e0) r13
            r13.mo126990n(r0, r1, r2, r4)
            java.util.HashMap<java.lang.String, java.lang.Integer> r13 = r10.f285008n
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.put(r5, r12)
            goto L_0x0101
        L_0x00e7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "already request video : "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r12 = "already had video data."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
        L_0x0101:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97132t1.mo136039i(int, int, boolean):boolean");
    }

    /* renamed from: j */
    public void mo136040j() {
        this.f285000f = "";
        this.f284999e = "";
        this.f285004j = -1;
        this.f285002h = 0;
        this.f285001g = 0;
        this.f285006l = 0;
        this.f285003i = 0;
        this.f285009o = 0;
        this.f284996b = 0;
        this.f284995a = 0;
        this.f285005k = false;
        this.f285015u = false;
        this.f285016v = false;
        this.f285008n.clear();
        C97134b bVar = this.f285017w;
        if (bVar != null) {
            this.f285007m = bVar.f285019a;
        }
        this.f285011q = 0;
        this.f285010p = 0;
        this.f285014t = 0;
        long j = (long) 0;
        this.f285013s = j;
        this.f285012r = j;
    }

    /* renamed from: k */
    public final void mo136041k() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(354, 8, 1, false);
        Log.m105929w("MicroMsg.OnlineVideoUIHelper", "%d rpt parse moov fail %s ", Integer.valueOf(hashCode()), this.f284999e);
        nVar.mo160131h(13836, 302, Long.valueOf(Util.nowSecond()), "");
    }

    /* renamed from: l */
    public boolean mo136042l(int i, boolean z) {
        boolean z2;
        int i2 = this.f284995a;
        if (i2 == 1) {
            this.f284996b = 2;
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            mo136031a(i, pInt, pInt2);
            if (mo136039i(pInt.value, pInt2.value, true)) {
                this.f285004j = -1;
                this.f285005k = false;
                this.f285006l = pInt2.value;
                this.f284996b = 3;
                this.f284998d.mo135837N(i, z);
            } else {
                this.f285004j = i;
                this.f285005k = true;
                this.f284998d.mo135833J();
                z2 = false;
                Log.m105925i("MicroMsg.OnlineVideoUIHelper", "seek video time %d, download status %d playStatus %d", Integer.valueOf(i), Integer.valueOf(this.f284995a), Integer.valueOf(this.f284996b));
                C115669n.INSTANCE.idkeyStat(354, 4, 1, false);
                return z2;
            }
        } else if (i2 == 3) {
            this.f284998d.mo135837N(i, z);
        }
        z2 = true;
        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "seek video time %d, download status %d playStatus %d", Integer.valueOf(i), Integer.valueOf(this.f284995a), Integer.valueOf(this.f284996b));
        C115669n.INSTANCE.idkeyStat(354, 4, 1, false);
        return z2;
    }

    /* renamed from: m */
    public void mo136043m() {
        Log.m105924i("MicroMsg.OnlineVideoUIHelper", "stop stream download video.");
        boolean z = this.f284995a == 3;
        this.f284995a = 0;
        if (!Util.isNullOrNil(this.f285000f)) {
            if (z) {
                mo136033c();
            } else {
                int i = this.f285002h;
                if (i >= this.f285017w.f285021c) {
                    Log.m105925i("MicroMsg.OnlineVideoUIHelper", "start complete video, downloaded (%d) more than config (%d).", Integer.valueOf(i), Integer.valueOf(this.f285017w.f285021c));
                    C98429r0.m127802H(this.f284999e, 2);
                    C115669n.INSTANCE.idkeyStat(354, 10, 1, false);
                }
            }
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(this.f285000f, mo136035e());
            C115669n.INSTANCE.idkeyStat(354, 2, 1, false);
        }
    }
}
