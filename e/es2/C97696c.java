package es2;

import android.util.SparseArray;
import as2.C92084a;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C85609x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XWebFeature;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p1081gi.C98121d;
import p1081gi.C98122e;
import p1081gi.C98123f;
import p1081gi.C98124g;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: es2.c */
public abstract class C97696c extends C85609x0<String, Integer, Integer> {

    /* renamed from: l */
    public static HashSet<String> f286585l = new HashSet<>();

    /* renamed from: c */
    public C97699b f286586c;

    /* renamed from: d */
    public C92714n f286587d = null;

    /* renamed from: e */
    public SparseArray<C92714n> f286588e = new SparseArray<>();

    /* renamed from: f */
    public C97694a f286589f;

    /* renamed from: g */
    public C101804kv2 f286590g = null;

    /* renamed from: h */
    public long f286591h = -1;

    /* renamed from: i */
    public int f286592i = -1;

    /* renamed from: j */
    public int f286593j = 0;

    /* renamed from: k */
    public String f286594k = "";

    /* renamed from: es2.c$a */
    public class C97697a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C98123f f286595d;

        /* renamed from: e */
        public final /* synthetic */ long f286596e;

        /* renamed from: es2.c$a$a */
        public class C97698a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f286598d;

            /* renamed from: e */
            public final /* synthetic */ int f286599e;

            /* renamed from: f */
            public final /* synthetic */ C98121d f286600f;

            public C97698a(String str, int i, C98121d dVar) {
                this.f286598d = str;
                this.f286599e = i;
                this.f286600f = dVar;
            }

            public void run() {
                int i;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
                C97697a aVar = C97697a.this;
                if (9 == C97696c.this.f286589f.f286542f) {
                    C98122e eVar = (C98122e) aVar.f286595d;
                    if (eVar.f287626U0 == eVar.f287628W0) {
                        C97696c.m125948g().remove(C97696c.this.f286589f.mo136953e());
                    }
                } else {
                    C97696c.m125948g().remove(C97696c.this.f286589f.mo136953e());
                }
                C102268v vVar = C97696c.this.f286589f.f286544h;
                int a = vVar == null ? -1 : vVar.mo141829a();
                C97694a aVar2 = C97696c.this.f286589f;
                Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d decodetype:%d", "[image-flow]", this.f286598d, Integer.valueOf(this.f286599e), aVar2.f286539c, aVar2.f286538b, Long.valueOf(this.f286600f.field_fileLength), Integer.valueOf(C97696c.m125948g().size()), Integer.valueOf(a));
                C97694a aVar3 = C97696c.this.f286589f;
                boolean z = aVar3.f286540d;
                if (!z || this.f286599e == 2) {
                    if (!z && ((i = aVar3.f286542f) == 4 || i == 6)) {
                        C94866e1.Fx0().mo131086F(C97696c.this.f286589f.f286538b, C97696c.this.f286589f.mo136951c() + C102236a0.m134725T(C97696c.this.f286590g));
                    }
                } else if (9 == aVar3.f286542f) {
                    C94921o2.m120483e(aVar3.f286552p.get(this.f286600f.f287616h).f298689d, C97696c.this.f286589f.f286550n);
                    C97696c cVar = C97696c.this;
                    int i2 = this.f286600f.f287616h;
                    cVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    if (C94866e1.qy0()) {
                        SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    } else {
                        C102268v vVar2 = cVar.f286589f.f286553q.get(i2);
                        C101804kv2 kv22 = cVar.f286589f.f286552p.get(i2);
                        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "thumbAddDecode index: %d decodeType: %d.", Integer.valueOf(i2), Integer.valueOf(vVar2.mo141829a()));
                        C94866e1.Fx0().mo131085E(kv22.f298689d, cVar.f286588e.get(i2), vVar2.mo141829a());
                        String y = vVar2.mo141829a() == 0 ? C102236a0.m134780y(0, vVar2.mo141831c()) : null;
                        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]thumbAddDecode cacheName2: %s.", "[image-flow]", kv22.f298689d, y);
                        C94901o Fx0 = C94866e1.Fx0();
                        String str = kv22.f298689d;
                        Fx0.getClass();
                        SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        Fx0.mo131126k0(str, y, (C92714n) null);
                        SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    }
                } else {
                    C94921o2.m120483e(aVar3.f286538b, aVar3.f286550n);
                    C97696c.this.mo136964s();
                }
                C97694a aVar4 = C97696c.this.f286589f;
                int i3 = aVar4.f286542f;
                if (9 == i3) {
                    C101804kv2 kv23 = aVar4.f286552p.get(this.f286600f.f287616h);
                    C98122e eVar2 = (C98122e) C97697a.this.f286595d;
                    if ((eVar2.f287626U0 == eVar2.f287628W0) && !eVar2.f287629X0) {
                        eVar2.f287629X0 = true;
                        long milliSecondsToNow = Util.milliSecondsToNow(C97697a.this.f286596e);
                        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]group download, feed cost: %d.", "[image-flow]", this.f286598d, Long.valueOf(milliSecondsToNow));
                        C115669n nVar = C115669n.INSTANCE;
                        C115669n nVar2 = nVar;
                        long j = milliSecondsToNow;
                        nVar2.mo175913w(1040, 3, j);
                        nVar.mo175911u(XWebFeature.INTERFACE_SHOW_HIDE, 4);
                        nVar2.mo175913w(1040, 9, j);
                        nVar2.mo175913w(1040, 10, (long) eVar2.f287626U0);
                    }
                    C97696c cVar2 = C97696c.this;
                    C97699b bVar = cVar2.f286586c;
                    int i4 = this.f286599e;
                    int d = cVar2.f286589f.mo136952d();
                    C97694a aVar5 = C97696c.this.f286589f;
                    boolean z2 = aVar5.f286540d;
                    String e = aVar5.mo136953e();
                    C98121d dVar = this.f286600f;
                    ((C94853e) bVar).mo130996u(i4, kv23, d, z2, e, (int) dVar.field_fileLength, dVar.f287616h, eVar2.f287626U0 == eVar2.f287628W0);
                } else {
                    if (1 == i3) {
                        C94853e Vx0 = C94866e1.Vx0();
                        String str2 = C97696c.this.f286589f.f286538b;
                        Vx0.getClass();
                        SnsMethodCalculate.markStartTimeMs("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        boolean remove = Vx0.f274832s.remove(str2);
                        SnsMethodCalculate.markEndTimeMs("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        if (remove) {
                            long milliSecondsToNow2 = Util.milliSecondsToNow(C97697a.this.f286596e);
                            Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]single download cost: %d.", "[image-flow]", this.f286598d, Long.valueOf(milliSecondsToNow2));
                            C115669n nVar3 = C115669n.INSTANCE;
                            nVar3.mo175913w(1040, 6, milliSecondsToNow2);
                            nVar3.mo175911u(XWebFeature.INTERFACE_SHOW_HIDE, 7);
                        }
                    }
                    if (C97696c.this.f286589f.f286542f == 4) {
                        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]sight download cost=" + Util.milliSecondsToNow(C97697a.this.f286596e), "[image-flow]", C97696c.this.f286589f.f286538b);
                    }
                    C97696c cVar3 = C97696c.this;
                    C97699b bVar2 = cVar3.f286586c;
                    int i5 = this.f286599e;
                    C101804kv2 kv24 = cVar3.f286590g;
                    int d2 = cVar3.f286589f.mo136952d();
                    C97694a aVar6 = C97696c.this.f286589f;
                    ((C94853e) bVar2).mo130996u(i5, kv24, d2, aVar6.f286540d, aVar6.mo136953e(), (int) this.f286600f.field_fileLength, -1, true);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
            }
        }

        public C97697a(C98123f fVar, long j) {
            this.f286595d = fVar;
            this.f286596e = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0341  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0343  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x036a  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x037e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x05a6 A[SYNTHETIC, Splitter:B:89:0x05a6] */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r39, int r40, p1081gi.C98120c r41, p1081gi.C98121d r42, boolean r43) {
            /*
                r38 = this;
                r1 = r38
                r2 = r39
                r0 = r41
                r3 = r42
                java.lang.String r4 = "callback"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                es2.c r6 = es2.C97696c.this
                es2.a r6 = r6.f286589f
                r7 = 2
                r8 = 1
                r9 = 0
                java.lang.String r10 = "[image-flow]"
                java.lang.String r11 = "MicroMsg.SnsCdnDownloadBase"
                if (r6 != 0) goto L_0x002b
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r9] = r10
                r0[r8] = r2
                java.lang.String r2 = "[%s][media:%s]pack is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                return r9
            L_0x002b:
                r13 = 9
                r14 = 4
                r15 = 3
                if (r3 == 0) goto L_0x0654
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r9] = r10
                r0[r8] = r2
                r0[r7] = r2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r40)
                r0[r15] = r6
                java.lang.String r6 = "[%s][media:%s]download callback mediaId:%s, startRet:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r0)
                es2.c r0 = es2.C97696c.this
                gi.f r6 = r1.f286595d
                java.lang.String r12 = "access$000"
                java.lang.String r15 = "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r15)
                r0.getClass()
                java.lang.String r7 = "reportDownloadFinish"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r15)
                es2.a r14 = r0.f286589f
                int r9 = r14.f286542f
                java.lang.String r8 = "reportDownloadFinish:%s"
                if (r13 != r9) goto L_0x00c5
                com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r9 = r3.f287617i
                if (r9 == 0) goto L_0x00a1
                gi.e r6 = (p1081gi.C98122e) r6
                com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r6 = r6.f287627V0
                int r9 = r6.length
                r14 = 0
            L_0x006b:
                if (r14 >= r9) goto L_0x00d4
                r13 = r6[r14]
                r41 = r6
                int r6 = r13.picIndex
                r19 = r9
                if (r6 < 0) goto L_0x0098
                es2.a r9 = r0.f286589f
                android.util.SparseArray<te3.kv2> r9 = r9.f286552p
                int r9 = r9.size()
                if (r6 >= r9) goto L_0x0098
                es2.a r6 = r0.f286589f
                android.util.SparseArray<te3.kv2> r6 = r6.f286552p
                int r9 = r13.picIndex
                java.lang.Object r6 = r6.get(r9)
                te3.kv2 r6 = (te3.C101804kv2) r6
                r9 = 1
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.String r6 = r6.f298689d
                r9 = 0
                r13[r9] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r13)
            L_0x0098:
                int r14 = r14 + 1
                r6 = r41
                r9 = r19
                r13 = 9
                goto L_0x006b
            L_0x00a1:
                int r6 = r3.f287616h
                if (r6 < 0) goto L_0x00d4
                android.util.SparseArray<te3.kv2> r9 = r14.f286552p
                int r9 = r9.size()
                if (r6 >= r9) goto L_0x00d4
                es2.a r0 = r0.f286589f
                android.util.SparseArray<te3.kv2> r0 = r0.f286552p
                int r6 = r3.f287616h
                java.lang.Object r0 = r0.get(r6)
                te3.kv2 r0 = (te3.C101804kv2) r0
                r6 = 1
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.String r0 = r0.f298689d
                r13 = 0
                r9[r13] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r9)
                goto L_0x00d4
            L_0x00c5:
                r6 = 1
                r13 = 0
                te3.kv2 r0 = r0.f286590g
                if (r0 == 0) goto L_0x00d4
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.String r0 = r0.f298689d
                r9[r13] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r9)
            L_0x00d4:
                java.lang.String r0 = r3.f287609a
                int r6 = r3.field_retCode
                ks2.C99181f.m129207j(r0, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r15)
                int r0 = r3.field_retCode
                java.lang.String r6 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
                java.lang.String r7 = "mediaId"
                java.lang.String r8 = "SnsImageLoadReporter"
                if (r0 == 0) goto L_0x029d
                r12 = 4
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r12 = 0
                r13[r12] = r10
                r12 = 1
                r13[r12] = r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r12 = 2
                r13[r12] = r0
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                int r0 = r0.f286542f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r12 = 3
                r13[r12] = r0
                java.lang.String r0 = "[%s][media:%s]download err, retCode: %d reqDownType: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r13)
                java.lang.String r0 = r3.field_serverIP
                com.tencent.p014mm.network.C81035d.m98966g(r0)
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                int r0 = r0.f286542f
                r12 = 9
                if (r12 != r0) goto L_0x0282
                com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r0 = r3.f287617i
                java.lang.String r12 = "[%s][media:%s]group download err, retry single download. index: %d."
                java.lang.String r13 = "fallbackDownload"
                if (r0 == 0) goto L_0x01ed
                int r14 = r0.length
                if (r14 <= 0) goto L_0x01ed
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 12
                r19 = r4
                r4 = 1040(0x410, float:1.457E-42)
                r14.mo175911u(r4, r9)
                gi.f r4 = r1.f286595d
                gi.e r4 = (p1081gi.C98122e) r4
                r9 = 5
                java.lang.Object[] r14 = new java.lang.Object[r9]
                r9 = 0
                r14[r9] = r10
                r9 = 1
                r14[r9] = r2
                int r9 = r4.f287628W0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r17 = 2
                r14[r17] = r9
                int r9 = r0.length
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r16 = 3
                r14[r16] = r9
                int r9 = r4.f287626U0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r18 = 4
                r14[r18] = r9
                java.lang.String r9 = "[%s][media:%s]download err, taskInfo2 need inc counter, before: %d, inc: %d, count: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r9, r14)
                int r9 = r4.f287628W0
                int r14 = r0.length
                int r9 = r9 + r14
                r4.f287628W0 = r9
                int r9 = r0.length
                r14 = 0
            L_0x016a:
                if (r14 >= r9) goto L_0x01e7
                r20 = r9
                r9 = r0[r14]
                r21 = r0
                boolean r0 = r9.retry
                if (r0 == 0) goto L_0x01d8
                int r0 = r9.picIndex
                es2.c r9 = es2.C97696c.this
                es2.a r9 = r9.f286589f
                android.util.SparseArray<te3.kv2> r9 = r9.f286552p
                java.lang.Object r9 = r9.get(r0)
                te3.kv2 r9 = (te3.C101804kv2) r9
                r28 = r5
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                android.util.SparseArray<vr2.v> r5 = r5.f286553q
                java.lang.Object r5 = r5.get(r0)
                r25 = r5
                vr2.v r25 = (vr2.C102268v) r25
                java.lang.String r5 = r9.f298689d
                ks2.f r22 = ks2.C99181f.f290857a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
                gy3.C87412m.m108594g(r5, r7)
                r29 = r15
                ks2.l r15 = new ks2.l
                r15.<init>(r5)
                o40.C61926c.m72661F(r8, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
                com.tencent.mm.plugin.sns.model.e r22 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
                r24 = 1
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                com.tencent.mm.storage.o3 r5 = r5.f286548l
                java.lang.String r15 = r4.f287624S0
                r23 = r9
                r26 = r5
                r27 = r15
                r22.mo130980e(r23, r24, r25, r26, r27)
                r5 = 3
                java.lang.Object[] r15 = new java.lang.Object[r5]
                r5 = 0
                r15[r5] = r10
                java.lang.String r5 = r9.f298689d
                r9 = 1
                r15[r9] = r5
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5 = 2
                r15[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r15)
                goto L_0x01dc
            L_0x01d8:
                r28 = r5
                r29 = r15
            L_0x01dc:
                int r14 = r14 + 1
                r9 = r20
                r0 = r21
                r5 = r28
                r15 = r29
                goto L_0x016a
            L_0x01e7:
                r28 = r5
                r29 = r15
                goto L_0x031a
            L_0x01ed:
                r19 = r4
                r28 = r5
                r29 = r15
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 14
                r5 = 1040(0x410, float:1.457E-42)
                r0.mo175911u(r5, r4)
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r4 = 0
                r0[r4] = r10
                r4 = 1
                r0[r4] = r2
                java.lang.String r4 = "[%s][media:%s]download error, totally re-download by single."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r4, r0)
                gi.f r0 = r1.f286595d
                gi.e r0 = (p1081gi.C98122e) r0
                int r4 = r0.f287626U0
                r0.f287628W0 = r4
                com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r4 = r0.f287627V0
                int r5 = r4.length
                r9 = 0
            L_0x0216:
                if (r9 >= r5) goto L_0x031a
                r14 = r4[r9]
                int r14 = r14.picIndex
                es2.c r15 = es2.C97696c.this
                es2.a r15 = r15.f286589f
                android.util.SparseArray<te3.kv2> r15 = r15.f286552p
                java.lang.Object r15 = r15.get(r14)
                te3.kv2 r15 = (te3.C101804kv2) r15
                r26 = r4
                es2.c r4 = es2.C97696c.this
                es2.a r4 = r4.f286589f
                android.util.SparseArray<vr2.v> r4 = r4.f286553q
                java.lang.Object r4 = r4.get(r14)
                r23 = r4
                vr2.v r23 = (vr2.C102268v) r23
                java.lang.String r4 = r15.f298689d
                ks2.f r20 = ks2.C99181f.f290857a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
                gy3.C87412m.m108594g(r4, r7)
                r27 = r5
                ks2.l r5 = new ks2.l
                r5.<init>(r4)
                o40.C61926c.m72661F(r8, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
                com.tencent.mm.plugin.sns.model.e r20 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
                r22 = 1
                es2.c r4 = es2.C97696c.this
                es2.a r4 = r4.f286589f
                com.tencent.mm.storage.o3 r4 = r4.f286548l
                java.lang.String r5 = r0.f287624S0
                r21 = r15
                r24 = r4
                r25 = r5
                r20.mo130980e(r21, r22, r23, r24, r25)
                r4 = 3
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
                r14 = 0
                r5[r14] = r4
                r4 = 1
                r5[r4] = r10
                java.lang.String r4 = r15.f298689d
                r14 = 2
                r5[r14] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r5)
                int r9 = r9 + 1
                r4 = r26
                r5 = r27
                goto L_0x0216
            L_0x0282:
                r19 = r4
                r28 = r5
                r29 = r15
                java.lang.String r0 = "downloadFail"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
                gy3.C87412m.m108594g(r2, r7)
                ks2.j r4 = new ks2.j
                r4.<init>(r2)
                o40.C61926c.m72661F(r8, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
                goto L_0x031a
            L_0x029d:
                r19 = r4
                r28 = r5
                r29 = r15
                r4 = 4
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r4 = 0
                r0[r4] = r10
                r4 = 1
                r0[r4] = r2
                es2.c r4 = es2.C97696c.this
                es2.a r4 = r4.f286589f
                int r4 = r4.f286542f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 2
                r0[r5] = r4
                r4 = 3
                r0[r4] = r2
                java.lang.String r4 = "[%s][media:%s]download succ, type: %d, mediaId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
                es2.c r0 = es2.C97696c.this
                long r4 = r3.field_fileLength
                int r5 = (int) r4
                r0.f286593j = r5
                es2.a r4 = r0.f286589f
                int r4 = r4.f286542f
                r5 = 9
                if (r5 != r4) goto L_0x0300
                gi.f r0 = r1.f286595d
                gi.e r0 = (p1081gi.C98122e) r0
                int r4 = r0.f287628W0
                r5 = 1
                int r4 = r4 + r5
                r0.f287628W0 = r4
                r9 = 4
                java.lang.Object[] r12 = new java.lang.Object[r9]
                r9 = 0
                r12[r9] = r10
                r12[r5] = r2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 2
                r12[r5] = r4
                int r0 = r0.f287626U0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4 = 3
                r12[r4] = r0
                java.lang.String r0 = "[%s][media:%s]download succ, counter++, res: %d, count: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r12)
                es2.c r0 = es2.C97696c.this
                int r4 = r3.f287616h
                boolean r0 = r0.mo136977r(r4)
                goto L_0x0304
            L_0x0300:
                boolean r0 = r0.mo136976q()
            L_0x0304:
                if (r0 != 0) goto L_0x031c
                java.lang.String r0 = "processFail"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
                gy3.C87412m.m108594g(r2, r7)
                ks2.q r4 = new ks2.q
                r4.<init>(r2)
                o40.C61926c.m72661F(r8, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            L_0x031a:
                r4 = 2
                goto L_0x0328
            L_0x031c:
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                boolean r0 = r0.f286540d
                if (r0 == 0) goto L_0x0326
                r0 = 3
                goto L_0x0327
            L_0x0326:
                r0 = 1
            L_0x0327:
                r4 = r0
            L_0x0328:
                es2.c r0 = es2.C97696c.this
                r0.getClass()
                java.lang.String r5 = "reportDownloadRecord"
                r6 = r29
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                int r7 = r0.mo136974l()
                es2.a r8 = r0.f286589f
                int r8 = r8.f286542f
                r9 = 8
                if (r8 != r9) goto L_0x0343
                r8 = 1
                goto L_0x035e
            L_0x0343:
                r9 = 6
                if (r8 == r9) goto L_0x035d
                r9 = 4
                if (r8 != r9) goto L_0x034a
                goto L_0x035d
            L_0x034a:
                r9 = 5
                if (r8 != r9) goto L_0x034f
                r8 = 4
                goto L_0x035e
            L_0x034f:
                r9 = 2
                if (r8 == r9) goto L_0x035b
                r9 = 1
                if (r8 == r9) goto L_0x035b
                r9 = 3
                if (r8 != r9) goto L_0x0359
                goto L_0x035b
            L_0x0359:
                r8 = 5
                goto L_0x035e
            L_0x035b:
                r8 = 0
                goto L_0x035e
            L_0x035d:
                r8 = 2
            L_0x035e:
                long r12 = r3.field_recvedBytes
                r14 = 0
                int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r9 <= 0) goto L_0x037e
                int r9 = r3.field_receiveCostTime
                if (r9 <= 0) goto L_0x037e
                float r12 = (float) r12
                r13 = 1149239296(0x44800000, float:1024.0)
                float r12 = r12 / r13
                int r13 = r3.field_waitResponseCostTime
                int r9 = r9 + r13
                int r13 = r3.field_connectCostTime
                int r9 = r9 + r13
                int r13 = r3.field_dnsCostTime
                int r9 = r9 + r13
                float r9 = (float) r9
                r13 = 1148846080(0x447a0000, float:1000.0)
                float r9 = r9 / r13
                float r12 = r12 / r9
                int r9 = (int) r12
                goto L_0x037f
            L_0x037e:
                r9 = 0
            L_0x037f:
                ad0.t r12 = new ad0.t
                r12.<init>()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                long r14 = r3.field_fileLength
                r13.append(r14)
                java.lang.String r14 = ","
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "20ImgSize"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r15)
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "21NetType"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_delayTime
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "22DelayTime"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_retCode
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "23RetCode"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_dnsCostTime
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "24DnsCostTime"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_connectCostTime
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "25ConnectCostTime"
                r12.mo32a(r15, r13)
                java.lang.String r13 = "26SendCostTime"
                r12.mo32a(r13, r14)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_waitResponseCostTime
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "27WaitResponseCostTime"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_receiveCostTime
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "28ReceiveCostTime"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_clientHostIP
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "29ClientAddrIP(uint)"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r3.field_serverHostIP
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "30ServerAddrIP(uint)"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r15 = r0.f286592i
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "31dnstype"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r15 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
                int r15 = r15.getCompatMixStrength()
                r13.append(r15)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r15 = "32signal(int)"
                r12.mo32a(r15, r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = r0.f286594k
                r13.append(r0)
                r13.append(r14)
                java.lang.String r0 = r13.toString()
                java.lang.String r13 = "33host(string)"
                r12.mo32a(r13, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "34MediaType"
                r12.mo32a(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = r3.field_xErrorNo
                r0.append(r7)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "35X_Errno(string)"
                r12.mo32a(r7, r0)
                java.lang.String r0 = "36MaxPackageSize"
                r12.mo32a(r0, r14)
                java.lang.String r0 = "37MaxPackageTimeStamp"
                r12.mo32a(r0, r14)
                java.lang.String r0 = "38PackageRecordList"
                r12.mo32a(r0, r14)
                java.lang.String r0 = "0,"
                java.lang.String r7 = "39ExpLayerId"
                r12.mo32a(r7, r0)
                java.lang.String r7 = "40ExpId"
                r12.mo32a(r7, r0)
                java.lang.String r0 = "41FeedId"
                r12.mo32a(r0, r14)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "42BizType"
                r12.mo32a(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r7 = r3.field_cSeqCheck
                r0.append(r7)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "43CSeqCheck(uint)"
                r12.mo32a(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                boolean r7 = r3.field_usePrivateProtocol
                r0.append(r7)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "44isPrivate(uint)"
                r12.mo32a(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = r3.f287609a
                r0.append(r7)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = "45mediaId(string)"
                r12.mo32a(r7, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                java.lang.String r7 = "46download_speed(uint)"
                r12.mo32a(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = "report logbuffer(13480 TLMediaFielDownloadRecord): "
                r0.append(r7)
                java.lang.String r7 = r12.mo34c()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 13480(0x34a8, float:1.889E-41)
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r13 = 0
                r9[r13] = r12
                r0.mo160131h(r7, r9)
                int r7 = r3.field_retCode
                r9 = 200(0xc8, float:2.8E-43)
                if (r7 == r9) goto L_0x0593
                if (r7 == 0) goto L_0x0593
                r7 = 14071(0x36f7, float:1.9718E-41)
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r9[r13] = r12
                r0.mo160131h(r7, r9)
            L_0x0593:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                java.lang.String r5 = "AdImgDownloadReporter"
                java.lang.String r6 = "reportAdPicCDNDownload"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                if (r0 == 0) goto L_0x061d
                te3.kv2 r8 = r0.f286537a     // Catch:{ all -> 0x0603 }
                if (r8 == 0) goto L_0x061d
                boolean r8 = r8.f298681N     // Catch:{ all -> 0x0603 }
                if (r8 == 0) goto L_0x061d
                java.lang.String r8 = r0.f286543g     // Catch:{ all -> 0x0603 }
                int r8 = jq2.C33629d.m40144a(r8)     // Catch:{ all -> 0x0603 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0603 }
                r9.<init>()     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = "reportAdPicCDNDownload, result="
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                int r12 = r3.field_retCode     // Catch:{ all -> 0x0603 }
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = ", requestKey="
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = r0.f286543g     // Catch:{ all -> 0x0603 }
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = ", reqDownType="
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                int r12 = r0.f286542f     // Catch:{ all -> 0x0603 }
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = ", url="
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r12 = r0.f286539c     // Catch:{ all -> 0x0603 }
                r9.append(r12)     // Catch:{ all -> 0x0603 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0603 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)     // Catch:{ all -> 0x0603 }
                r9 = 1
                if (r8 == r9) goto L_0x05ef
                r9 = 5
                if (r8 != r9) goto L_0x061d
            L_0x05ef:
                int r8 = r3.field_retCode     // Catch:{ all -> 0x0603 }
                if (r8 != 0) goto L_0x05fb
                java.lang.String r0 = r0.f286539c     // Catch:{ all -> 0x0603 }
                r8 = 1
                r9 = 0
                jq2.C33629d.m40145b(r9, r9, r8, r0)     // Catch:{ all -> 0x0603 }
                goto L_0x061d
            L_0x05fb:
                r8 = 1
                r9 = 0
                java.lang.String r0 = r0.f286539c     // Catch:{ all -> 0x0603 }
                jq2.C33629d.m40145b(r8, r9, r8, r0)     // Catch:{ all -> 0x0603 }
                goto L_0x061d
            L_0x0603:
                r0 = move-exception
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "reportAdPicCDNDownload, exp="
                r8.append(r9)
                java.lang.String r0 = r0.toString()
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            L_0x061d:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                r5 = 5
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r5 = 0
                r0[r5] = r10
                r5 = 1
                r0[r5] = r2
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                int r5 = r5.f286542f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 2
                r0[r6] = r5
                r5 = 3
                r0[r5] = r2
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                java.lang.String r5 = r5.f286538b
                r6 = 4
                r0[r6] = r5
                java.lang.String r5 = "[%s][media:%s]download succ start post to ui thread process, type: %d, mediaId:%s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r0)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
                es2.c$a$a r5 = new es2.c$a$a
                r5.<init>(r2, r4, r3)
                r0.post(r5)
                goto L_0x068f
            L_0x0654:
                r19 = r4
                r28 = r5
                if (r0 == 0) goto L_0x068f
                long r3 = r0.field_finishedLength
                float r3 = (float) r3
                long r4 = r0.field_toltalLength
                float r0 = (float) r4
                float r3 = r3 / r0
                float r0 = r6.f286549m
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x068f
                r6.f286549m = r3
                r4 = 4
                java.lang.Object[] r0 = new java.lang.Object[r4]
                int r4 = r6.mo136952d()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r0[r5] = r4
                r4 = 1
                r0[r4] = r2
                java.lang.Float r2 = java.lang.Float.valueOf(r3)
                r3 = 2
                r0[r3] = r2
                es2.c r2 = es2.C97696c.this
                es2.a r2 = r2.f286589f
                java.lang.String r2 = r2.f286539c
                r3 = 3
                r0[r3] = r2
                java.lang.String r2 = "Download sns image type: %d, mediaId: %s, progress: %f, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r0)
            L_0x068f:
                if (r40 == 0) goto L_0x0745
                r2 = 2
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r40)
                r3 = 0
                r0[r3] = r2
                es2.c r2 = es2.C97696c.this
                es2.a r2 = r2.f286589f
                int r2 = r2.f286542f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r0[r3] = r2
                java.lang.String r2 = "task build error! startRet: %d, type: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                int r0 = r0.f286542f
                r2 = 9
                if (r2 != r0) goto L_0x0745
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 13
                r3 = 1040(0x410, float:1.457E-42)
                r0.mo175911u(r3, r2)
                java.util.HashSet r0 = es2.C97696c.m125948g()
                es2.c r2 = es2.C97696c.this
                es2.a r2 = r2.f286589f
                java.lang.String r2 = r2.mo136953e()
                r0.remove(r2)
                es2.c r0 = es2.C97696c.this
                es2.c$b r2 = r0.f286586c
                r30 = 2
                r31 = 0
                es2.a r0 = r0.f286589f
                int r32 = r0.mo136952d()
                es2.c r0 = es2.C97696c.this
                es2.a r0 = r0.f286589f
                boolean r3 = r0.f286540d
                java.lang.String r34 = r0.mo136953e()
                r35 = -1
                r36 = -1
                r37 = 1
                r29 = r2
                com.tencent.mm.plugin.sns.model.e r29 = (com.tencent.p014mm.plugin.sns.model.C94853e) r29
                r33 = r3
                r29.mo130996u(r30, r31, r32, r33, r34, r35, r36, r37)
                gi.f r0 = r1.f286595d
                gi.e r0 = (p1081gi.C98122e) r0
                com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r2 = r0.f287627V0
                int r3 = r2.length
                r9 = 0
            L_0x06ff:
                if (r9 >= r3) goto L_0x0745
                r4 = r2[r9]
                int r4 = r4.picIndex
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                android.util.SparseArray<te3.kv2> r5 = r5.f286552p
                java.lang.Object r5 = r5.get(r4)
                r13 = r5
                te3.kv2 r13 = (te3.C101804kv2) r13
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                android.util.SparseArray<vr2.v> r5 = r5.f286553q
                java.lang.Object r5 = r5.get(r4)
                r15 = r5
                vr2.v r15 = (vr2.C102268v) r15
                com.tencent.mm.plugin.sns.model.e r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
                r14 = 1
                es2.c r5 = es2.C97696c.this
                es2.a r5 = r5.f286589f
                com.tencent.mm.storage.o3 r5 = r5.f286548l
                java.lang.String r6 = r0.f287624S0
                r16 = r5
                r17 = r6
                r12.mo130980e(r13, r14, r15, r16, r17)
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7 = 0
                r6[r7] = r4
                java.lang.String r4 = "group download err, retry single download. index: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r6)
                int r9 = r9 + 1
                goto L_0x06ff
            L_0x0745:
                r7 = 0
                r2 = r19
                r3 = r28
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: es2.C97696c.C97697a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1");
            SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1");
            byte[] bArr2 = new byte[0];
            SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1");
            return bArr2;
        }
    }

    /* renamed from: es2.c$b */
    public interface C97699b {
    }

    public C97696c(C97699b bVar, C97694a aVar) {
        this.f286586c = bVar;
        this.f286589f = aVar;
        if (aVar != null) {
            this.f286590g = aVar.f286537a;
            f286585l.add(aVar.mo136953e());
            aVar.mo136955g();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ HashSet m125948g() {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        HashSet<String> hashSet = f286585l;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return hashSet;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo57374a(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        Integer k = mo136960k((String[]) objArr);
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return k;
    }

    /* renamed from: b */
    public ExecutorService mo57375b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        ExecutorService Gx0 = C94866e1.Gx0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return Gx0;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo57376c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        mo136963p((Integer) obj);
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    /* renamed from: h */
    public abstract String mo136971h(String str);

    /* renamed from: i */
    public String mo136972i(String str, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return str;
    }

    /* renamed from: j */
    public void mo136973j() {
        SnsMethodCalculate.markStartTimeMs("checkCdnPath", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        C97694a aVar = this.f286589f;
        if (aVar != null) {
            Log.m105925i("MicroMsg.SnsCdnDownloadBase", "checkCdnPath: %s", Boolean.valueOf(C86013q1.m106461v(aVar.mo136951c())));
        }
        SnsMethodCalculate.markEndTimeMs("checkCdnPath", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x045b A[Catch:{ MalformedURLException -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0567 A[Catch:{ MalformedURLException -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0574 A[Catch:{ MalformedURLException -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0745  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0358 A[SYNTHETIC, Splitter:B:82:0x0358] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer mo136960k(java.lang.String... r33) {
        /*
            r32 = this;
            r7 = r32
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            boolean r0 = r0.mo121147n()
            r10 = 2
            if (r0 == 0) goto L_0x0782
            es2.a r0 = r7.f286589f
            if (r0 != 0) goto L_0x001f
            goto L_0x0782
        L_0x001f:
            boolean r0 = r32.mo136962o()
            r11 = 9
            java.lang.String r12 = "[image-flow]"
            r13 = 4
            java.lang.String r14 = "MicroMsg.SnsCdnDownloadBase"
            r15 = 3
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00bf
            es2.a r0 = r7.f286589f
            int r0 = r0.f286542f
            if (r11 != r0) goto L_0x0088
            r0 = 0
        L_0x0036:
            es2.a r2 = r7.f286589f
            android.util.SparseArray<te3.kv2> r2 = r2.f286552p
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x00bf
            es2.a r2 = r7.f286589f
            android.util.SparseArray<te3.kv2> r2 = r2.f286552p
            java.lang.Object r2 = r2.valueAt(r0)
            te3.kv2 r2 = (te3.C101804kv2) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            es2.a r5 = r7.f286589f
            java.lang.String r11 = r2.f298689d
            java.lang.String r5 = r5.mo136949a(r11)
            r3.append(r5)
            es2.a r5 = r7.f286589f
            java.lang.String r5 = r5.mo136950b(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r5 = new java.lang.Object[r13]
            r5[r4] = r12
            java.lang.String r2 = r2.f298689d
            r5[r6] = r2
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r10] = r2
            r5[r15] = r3
            java.lang.String r2 = "[%s][media:%s]delete sns exist:%b thumb1:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            int r0 = r0 + 1
            r11 = 9
            goto L_0x0036
        L_0x0088:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            es2.a r2 = r7.f286589f
            java.lang.String r2 = r2.f286545i
            r0.append(r2)
            es2.a r2 = r7.f286589f
            java.lang.String r2 = r2.mo136954f()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r4] = r12
            te3.kv2 r3 = r7.f286590g
            java.lang.String r3 = r3.f298689d
            r2[r6] = r3
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r10] = r3
            r2[r15] = r0
            java.lang.String r3 = "[%s][media:%s]delete sns exist:%b thumb2:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
        L_0x00bf:
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.sns.model.e r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()     // Catch:{ Exception -> 0x0103 }
            es2.a r5 = r7.f286589f     // Catch:{ Exception -> 0x0103 }
            java.lang.String r5 = r5.f286538b     // Catch:{ Exception -> 0x0103 }
            r0.getClass()     // Catch:{ Exception -> 0x0103 }
            java.lang.String r11 = "getReporter"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)     // Catch:{ Exception -> 0x0103 }
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0103 }
            if (r17 != 0) goto L_0x00e7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.sns.model.e$j> r0 = r0.f274831r     // Catch:{ Exception -> 0x0103 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0103 }
            com.tencent.mm.plugin.sns.model.e$j r0 = (com.tencent.p014mm.plugin.sns.model.C94853e.C94863j) r0     // Catch:{ Exception -> 0x0103 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)     // Catch:{ Exception -> 0x0103 }
            goto L_0x00eb
        L_0x00e7:
            r0 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)     // Catch:{ Exception -> 0x0103 }
        L_0x00eb:
            if (r0 == 0) goto L_0x0111
            r0.getClass()     // Catch:{ Exception -> 0x0103 }
            java.lang.String r5 = "isSetStartTime"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r11)     // Catch:{ Exception -> 0x0103 }
            boolean r13 = r0.f274846d     // Catch:{ Exception -> 0x0103 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r11)     // Catch:{ Exception -> 0x0103 }
            if (r13 != 0) goto L_0x0111
            r0.mo131013b(r2)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0111
        L_0x0103:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "exception msg: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r5)
        L_0x0111:
            es2.a r0 = r7.f286589f
            android.util.SparseArray<te3.kv2> r0 = r0.f286552p
            if (r0 == 0) goto L_0x011c
            int r0 = r0.size()
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "to downloadBitmap pack.mediaId: "
            r5.append(r11)
            es2.a r11 = r7.f286589f
            java.lang.String r11 = r11.f286538b
            r5.append(r11)
            java.lang.String r11 = " pack.mediaObjs.size: "
            r5.append(r11)
            r5.append(r0)
            java.lang.String r0 = " pack.snsId: "
            r5.append(r0)
            es2.a r0 = r7.f286589f
            java.lang.String r0 = r0.f286551o
            r5.append(r0)
            java.lang.String r0 = " pack.isthumb: "
            r5.append(r0)
            es2.a r0 = r7.f286589f
            boolean r0 = r0.f286540d
            r5.append(r0)
            java.lang.String r0 = " type: "
            r5.append(r0)
            es2.a r0 = r7.f286589f
            int r0 = r0.mo136952d()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            es2.a r0 = r7.f286589f
            com.tencent.mm.storage.o3 r0 = r0.f286548l
            java.lang.String r11 = ""
            if (r0 != 0) goto L_0x016e
        L_0x016c:
            r5 = r11
            goto L_0x01bd
        L_0x016e:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284132d
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0179
            java.lang.String r5 = "album_friend"
            goto L_0x01bd
        L_0x0179:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284133e
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0184
            java.lang.String r5 = "album_self"
            goto L_0x01bd
        L_0x0184:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284134f
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x018f
            java.lang.String r5 = "album_stranger"
            goto L_0x01bd
        L_0x018f:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284135g
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x019b
            java.lang.String r5 = "profile_friend"
            goto L_0x01bd
        L_0x019b:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284136h
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x01a7
            java.lang.String r5 = "profile_stranger"
            goto L_0x01bd
        L_0x01a7:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284137i
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x01b2
            java.lang.String r5 = "comment"
            goto L_0x01bd
        L_0x01b2:
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.f284131c
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x016c
            java.lang.String r5 = "timeline"
        L_0x01bd:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r13 != 0) goto L_0x01d4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "&scene="
            r13.append(r15)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
        L_0x01d4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "https://"
            r13.append(r15)
            r15 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r15)
            r13.append(r15)
            java.lang.String r15 = "/?version=%d&uin=%s&nettype=%d&signal=%d%s"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r15 = 5
            java.lang.Object[] r10 = new java.lang.Object[r15]
            int r19 = qe3.C89625d.f257841g
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r10[r4] = r19
            int r19 = com.tencent.p014mm.plugin.sns.model.C94866e1.Nx0()
            java.lang.String r19 = p823sg.C77710q.m93738a(r19)
            r10[r6] = r19
            android.content.Context r19 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r19 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r19)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r18 = 2
            r10[r18] = r19
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r19 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            int r19 = r19.getCompatMixStrength()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r17 = 3
            r10[r17] = r19
            r16 = 4
            r10[r16] = r5
            java.lang.String r10 = java.lang.String.format(r13, r10)
            es2.a r5 = r7.f286589f
            int r13 = r5.f286542f
            r15 = 9
            if (r15 != r13) goto L_0x0245
            java.lang.String r13 = r5.f286539c
            android.util.SparseArray<te3.kv2> r15 = r5.f286552p
            java.lang.Object r15 = r15.get(r4)
            te3.kv2 r15 = (te3.C101804kv2) r15
            java.lang.String r13 = r7.mo136972i(r13, r15)
            r5.f286539c = r13
            goto L_0x024d
        L_0x0245:
            java.lang.String r13 = r5.f286539c
            java.lang.String r13 = r7.mo136971h(r13)
            r5.f286539c = r13
        L_0x024d:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.f286591h = r4
            es2.a r4 = r7.f286589f
            boolean r4 = r4.f286541e
            if (r4 == 0) goto L_0x025c
            java.lang.String r5 = "SnsSightDomainList"
            goto L_0x025e
        L_0x025c:
            java.lang.String r5 = "SnsAlbumDomainList"
        L_0x025e:
            if (r4 == 0) goto L_0x0263
            java.lang.String r4 = "SnsSightMainStandbyIpSwitchTime"
            goto L_0x0265
        L_0x0263:
            java.lang.String r4 = "SnsAlbumMainStandbyIpSwitchTime"
        L_0x0265:
            k40.a r15 = f40.C86709a0.m107533q(r1)
            lc3.b r15 = (lc3.C10485b) r15
            pj.f r15 = r15.vh0()
            java.lang.String r15 = r15.mo107405c(r5)
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            r5 = 0
            int r1 = r1.mo107404b(r4, r5)
            long r6 = (long) r1
            r4 = 6
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r12
            r20 = r6
            r7 = r32
            es2.a r6 = r7.f286589f
            java.lang.String r4 = r6.f286538b
            r13 = 1
            r1[r13] = r4
            boolean r4 = r6.f286541e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 2
            r1[r6] = r4
            es2.a r4 = r7.f286589f
            boolean r4 = r4.f286540d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 3
            r1[r6] = r4
            r4 = 4
            r1[r4] = r15
            java.lang.Long r4 = java.lang.Long.valueOf(r20)
            r6 = 5
            r1[r6] = r4
            java.lang.String r4 = "[%s][media:%s]pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r1)
            r22 = 0
            int r1 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r1 > 0) goto L_0x02bf
            r20 = 259200(0x3f480, double:1.28062E-318)
        L_0x02bf:
            es2.a r1 = r7.f286589f
            java.lang.String r4 = r1.f286539c
            r1 = r32
            r24 = r2
            r2 = r0
            r3 = r4
            r6 = 0
            r13 = 6
            r4 = r20
            r13 = 0
            r6 = r15
            boolean r0 = r1.mo136961n(r2, r3, r4, r6)
            long r1 = r7.f286591h
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)
            r7.f286591h = r1
            es2.a r1 = r7.f286589f
            int r2 = r1.f286542f
            r3 = 9
            if (r3 != r2) goto L_0x0310
            gi.e r1 = new gi.e
            r1.<init>()
            java.lang.String r2 = "task_SnsCdnDownloadBase_1"
            r1.f287660d = r2
            r4 = 0
        L_0x02ee:
            es2.a r2 = r7.f286589f
            android.util.SparseArray<te3.kv2> r2 = r2.f286552p
            int r2 = r2.size()
            if (r4 >= r2) goto L_0x0321
            es2.a r2 = r7.f286589f
            android.util.SparseArray<te3.kv2> r2 = r2.f286552p
            java.lang.Object r2 = r2.valueAt(r4)
            te3.kv2 r2 = (te3.C101804kv2) r2
            es2.a r3 = r7.f286589f
            java.lang.String r2 = r2.f298689d
            java.lang.String r2 = r3.mo136949a(r2)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            int r4 = r4 + 1
            goto L_0x02ee
        L_0x0310:
            java.lang.String r1 = r1.mo136951c()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
            gi.f r1 = new gi.f
            r1.<init>()
            java.lang.String r2 = "task_SnsCdnDownloadBase_2"
            r1.f287660d = r2
        L_0x0321:
            java.lang.String r2 = "attachSnsImgTaskInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r9)
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0630 }
            es2.a r4 = r7.f286589f     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r4 = r4.f286539c     // Catch:{ MalformedURLException -> 0x0630 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r3 = r3.getHost()     // Catch:{ MalformedURLException -> 0x0630 }
            r7.f286594k = r3     // Catch:{ MalformedURLException -> 0x0630 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0630 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r4 = r7.f286594k     // Catch:{ MalformedURLException -> 0x0630 }
            int r4 = com.tencent.p014mm.network.C81035d.m98965f(r4, r13, r3)     // Catch:{ MalformedURLException -> 0x0630 }
            r7.f286592i = r4     // Catch:{ MalformedURLException -> 0x0630 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0630 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r5 = r7.f286594k     // Catch:{ MalformedURLException -> 0x0630 }
            r6 = 1
            int r5 = com.tencent.p014mm.network.C81035d.m98965f(r5, r6, r4)     // Catch:{ MalformedURLException -> 0x0630 }
            es2.a r6 = r7.f286589f     // Catch:{ MalformedURLException -> 0x0630 }
            int r6 = r6.f286542f     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r15 = "_"
            r13 = 9
            if (r13 != r6) goto L_0x045b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0630 }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x0630 }
            es2.a r13 = r7.f286589f     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r13 = r13.f286551o     // Catch:{ MalformedURLException -> 0x0630 }
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0630 }
            r6.append(r15)     // Catch:{ MalformedURLException -> 0x0630 }
            es2.a r13 = r7.f286589f     // Catch:{ MalformedURLException -> 0x0630 }
            int r13 = r13.f286542f     // Catch:{ MalformedURLException -> 0x0630 }
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0630 }
            java.lang.String r6 = r6.toString()     // Catch:{ MalformedURLException -> 0x0630 }
            r1.field_mediaId = r6     // Catch:{ MalformedURLException -> 0x0630 }
            boolean r6 = r1 instanceof p1081gi.C98122e     // Catch:{ MalformedURLException -> 0x0630 }
            if (r6 == 0) goto L_0x044d
            r6 = r1
            gi.e r6 = (p1081gi.C98122e) r6     // Catch:{ MalformedURLException -> 0x0630 }
            es2.a r13 = r7.f286589f     // Catch:{ MalformedURLException -> 0x0630 }
            r26 = r8
            java.lang.String r8 = r13.f286551o     // Catch:{ MalformedURLException -> 0x044a }
            r6.f287624S0 = r8     // Catch:{ MalformedURLException -> 0x044a }
            int r8 = r13.f286554r     // Catch:{ MalformedURLException -> 0x044a }
            r6.f287625T0 = r8     // Catch:{ MalformedURLException -> 0x044a }
            android.util.SparseArray<te3.kv2> r8 = r13.f286552p     // Catch:{ MalformedURLException -> 0x044a }
            int r8 = r8.size()     // Catch:{ MalformedURLException -> 0x044a }
            r6.f287626U0 = r8     // Catch:{ MalformedURLException -> 0x044a }
            com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r8 = new com.tencent.mars.cdn.CdnLogic.BatchSnsReqImageData[r8]     // Catch:{ MalformedURLException -> 0x044a }
            r6.f287627V0 = r8     // Catch:{ MalformedURLException -> 0x044a }
            r8 = 0
        L_0x0394:
            int r13 = r6.f287626U0     // Catch:{ MalformedURLException -> 0x044a }
            if (r8 >= r13) goto L_0x0441
            es2.a r13 = r7.f286589f     // Catch:{ MalformedURLException -> 0x044a }
            android.util.SparseArray<te3.kv2> r13 = r13.f286552p     // Catch:{ MalformedURLException -> 0x044a }
            int r13 = r13.keyAt(r8)     // Catch:{ MalformedURLException -> 0x044a }
            r27 = r2
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x043a }
            android.util.SparseArray<te3.kv2> r2 = r2.f286552p     // Catch:{ MalformedURLException -> 0x043a }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ MalformedURLException -> 0x043a }
            te3.kv2 r2 = (te3.C101804kv2) r2     // Catch:{ MalformedURLException -> 0x043a }
            r28 = r12
            com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData r12 = new com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData     // Catch:{ MalformedURLException -> 0x0438 }
            r12.<init>()     // Catch:{ MalformedURLException -> 0x0438 }
            r29 = r0
            java.lang.String r0 = "getURL"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)     // Catch:{ MalformedURLException -> 0x062d }
            r30 = r5
            java.lang.String r5 = r2.f298694i     // Catch:{ MalformedURLException -> 0x062d }
            boolean r22 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x062d }
            if (r22 == 0) goto L_0x03d0
            r22 = r5
            int r5 = r2.f298690e     // Catch:{ MalformedURLException -> 0x062d }
            r31 = r4
            r4 = 2
            if (r5 != r4) goto L_0x03d4
            java.lang.String r5 = r2.f298692g     // Catch:{ MalformedURLException -> 0x062d }
            goto L_0x03d6
        L_0x03d0:
            r31 = r4
            r22 = r5
        L_0x03d4:
            r5 = r22
        L_0x03d6:
            java.lang.String r4 = r7.mo136972i(r5, r2)     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)     // Catch:{ MalformedURLException -> 0x062d }
            r12.url = r4     // Catch:{ MalformedURLException -> 0x062d }
            r12.picIndex = r13     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 0
            r12.totalFileSize = r4     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r2.f298679L     // Catch:{ MalformedURLException -> 0x062d }
            r12.decryptKey = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r4 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r5 = r2.f298689d     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r4.mo136949a(r5)     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r4)     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r4 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r4.mo136950b(r2)     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r4)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 0
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r4)     // Catch:{ MalformedURLException -> 0x062d }
            r12.imageCachePath = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r2.f298689d     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r15)     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            int r2 = r2.f286542f     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
            r12.fileKey = r0     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.mars.cdn.CdnLogic$BatchSnsReqImageData[] r0 = r6.f287627V0     // Catch:{ MalformedURLException -> 0x062d }
            r0[r8] = r12     // Catch:{ MalformedURLException -> 0x062d }
            int r8 = r8 + 1
            r2 = r27
            r12 = r28
            r0 = r29
            r5 = r30
            r4 = r31
            goto L_0x0394
        L_0x0438:
            r0 = move-exception
            goto L_0x043d
        L_0x043a:
            r0 = move-exception
            r28 = r12
        L_0x043d:
            r2 = r27
            goto L_0x0635
        L_0x0441:
            r29 = r0
            r27 = r2
            r31 = r4
            r30 = r5
            goto L_0x0457
        L_0x044a:
            r0 = move-exception
            goto L_0x0633
        L_0x044d:
            r29 = r0
            r27 = r2
            r31 = r4
            r30 = r5
            r26 = r8
        L_0x0457:
            r28 = r12
            goto L_0x051c
        L_0x045b:
            r29 = r0
            r27 = r2
            r31 = r4
            r30 = r5
            r26 = r8
            r28 = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r2.f286538b     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r15)     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            int r2 = r2.f286542f     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
            r1.field_mediaId = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r2.mo136951c()     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r2.mo136954f()     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287635U = r0     // Catch:{ MalformedURLException -> 0x062d }
            r1.field_fullpath = r0     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r2 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            if (r2 == 0) goto L_0x051c
            java.lang.String r2 = "downloadImage mediaId:%s, isThumb:%s, thumbEncKey:%s, urlEncKey:%s, enckey:%s"
            r4 = 6
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r1.field_mediaId     // Catch:{ MalformedURLException -> 0x062d }
            r6 = 0
            r5[r6] = r4     // Catch:{ MalformedURLException -> 0x062d }
            boolean r0 = r0.f286540d     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 1
            r5[r4] = r0     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r0 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r0.f298679L     // Catch:{ MalformedURLException -> 0x062d }
            r6 = 2
            r5[r6] = r4     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r0.f298676I     // Catch:{ MalformedURLException -> 0x062d }
            r6 = 3
            r5[r6] = r4     // Catch:{ MalformedURLException -> 0x062d }
            long r12 = r0.f298672E     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 4
            r5[r4] = r0     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r0 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            long r12 = r0.f298672E     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 5
            r5[r4] = r0     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r5)     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r2 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r2.f298676I     // Catch:{ MalformedURLException -> 0x062d }
            boolean r0 = r0.f286540d     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 == 0) goto L_0x051a
            java.lang.String r0 = r2.f298679L     // Catch:{ MalformedURLException -> 0x062d }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 != 0) goto L_0x04fb
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r0 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r0.f298679L     // Catch:{ MalformedURLException -> 0x062d }
            goto L_0x051a
        L_0x04fb:
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r0 = r0.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            long r5 = r0.f298672E     // Catch:{ MalformedURLException -> 0x062d }
            int r0 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x051a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r2 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            te3.kv2 r2 = r2.f286537a     // Catch:{ MalformedURLException -> 0x062d }
            long r4 = r2.f298672E     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r4)     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r11)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r4 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
        L_0x051a:
            r1.f287643y0 = r4     // Catch:{ MalformedURLException -> 0x062d }
        L_0x051c:
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.f286539c     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287631R = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r7.f286594k     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287633S = r0     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287634T = r10     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String[] r0 = r7.mo136975m(r3)     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287636V = r0     // Catch:{ MalformedURLException -> 0x062d }
            r0 = r31
            java.lang.String[] r0 = r7.mo136975m(r0)     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287637W = r0     // Catch:{ MalformedURLException -> 0x062d }
            int r0 = r7.f286592i     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287638X = r0     // Catch:{ MalformedURLException -> 0x062d }
            r0 = r30
            r1.f287639Y = r0     // Catch:{ MalformedURLException -> 0x062d }
            r0 = r29
            r1.f287640Z = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x062d }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r11)     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r2 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x062d }
            int r2 = r2.getCompatMixStrength()     // Catch:{ MalformedURLException -> 0x062d }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287641p0 = r0     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.mm.storage.o3 r2 = r0.f286548l     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r2.f284144a     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287642x0 = r2     // Catch:{ MalformedURLException -> 0x062d }
            int r2 = r0.f286542f     // Catch:{ MalformedURLException -> 0x062d }
            r3 = 8
            if (r2 != r3) goto L_0x0574
            r3 = 3
            r1.f287663g = r3     // Catch:{ MalformedURLException -> 0x062d }
            r0 = 109(0x6d, float:1.53E-43)
            r1.f287630Q0 = r0     // Catch:{ MalformedURLException -> 0x062d }
            r0 = 20204(0x4eec, float:2.8312E-41)
            r1.f287632R0 = r0     // Catch:{ MalformedURLException -> 0x062d }
            goto L_0x0608
        L_0x0574:
            r3 = 6
            if (r2 == r3) goto L_0x05fd
            r3 = 4
            if (r2 != r3) goto L_0x057c
            goto L_0x05fd
        L_0x057c:
            r3 = 150(0x96, float:2.1E-43)
            r4 = 5
            if (r2 != r4) goto L_0x058c
            r4 = 3
            r1.f287663g = r4     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287630Q0 = r3     // Catch:{ MalformedURLException -> 0x062d }
            r0 = 20250(0x4f1a, float:2.8376E-41)
            r1.f287632R0 = r0     // Catch:{ MalformedURLException -> 0x062d }
            goto L_0x0608
        L_0x058c:
            r4 = 2
            if (r2 == r4) goto L_0x059a
            r4 = 1
            if (r2 == r4) goto L_0x059a
            r4 = 3
            if (r2 == r4) goto L_0x059b
            r5 = 9
            if (r2 != r5) goto L_0x0608
            goto L_0x059b
        L_0x059a:
            r4 = 3
        L_0x059b:
            r1.f287663g = r4     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 100
            r1.f287630Q0 = r4     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 20201(0x4ee9, float:2.8308E-41)
            r1.f287632R0 = r4     // Catch:{ MalformedURLException -> 0x062d }
            r5 = 1
            if (r2 != r5) goto L_0x05d6
            java.lang.String r0 = r0.f286539c     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = "http://wxapp.tc.qq.com"
            boolean r0 = r0.startsWith(r2)     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 != 0) goto L_0x05be
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.f286539c     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = "https://wxapp.tc.qq.com"
            boolean r0 = r0.startsWith(r2)     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 == 0) goto L_0x05d6
        L_0x05be:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ MalformedURLException -> 0x062d }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ MalformedURLException -> 0x062d }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_sns_download_wxapp_entry     // Catch:{ MalformedURLException -> 0x062d }
            r5 = 1
            int r0 = r0.mo58779Qe(r2, r5)     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 != r5) goto L_0x05d6
            r2 = 3
            r1.f287663g = r2     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287630Q0 = r3     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287632R0 = r4     // Catch:{ MalformedURLException -> 0x062d }
        L_0x05d6:
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            int r2 = r0.f286542f     // Catch:{ MalformedURLException -> 0x062d }
            r3 = 3
            if (r2 != r3) goto L_0x0608
            java.lang.String r0 = r0.f286539c     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = "https://wwfile.work.weixin.qq.com"
            boolean r0 = r0.startsWith(r2)     // Catch:{ MalformedURLException -> 0x062d }
            if (r0 == 0) goto L_0x0608
            r0 = 19
            r1.field_fileType = r0     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r0 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r2 = r0.f286555s     // Catch:{ MalformedURLException -> 0x062d }
            r1.field_aesKey = r2     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r0.f286556t     // Catch:{ MalformedURLException -> 0x062d }
            r1.field_authKey = r0     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r0 = r1.f287631R     // Catch:{ MalformedURLException -> 0x062d }
            r1.f287672s = r0     // Catch:{ MalformedURLException -> 0x062d }
            r2 = 1
            r1.field_totalLen = r2     // Catch:{ MalformedURLException -> 0x062d }
            goto L_0x0608
        L_0x05fd:
            r2 = 3
            r1.f287663g = r2     // Catch:{ MalformedURLException -> 0x062d }
            r0 = 105(0x69, float:1.47E-43)
            r1.f287630Q0 = r0     // Catch:{ MalformedURLException -> 0x062d }
            r0 = 20210(0x4ef2, float:2.832E-41)
            r1.f287632R0 = r0     // Catch:{ MalformedURLException -> 0x062d }
        L_0x0608:
            java.lang.String r0 = "[%s][media:%s]attachSnsImgTaskInfo success reqDownType:%d taskInfo:%s"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ MalformedURLException -> 0x062d }
            r3 = 0
            r2[r3] = r28     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.String r3 = r1.field_mediaId     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 1
            r2[r4] = r3     // Catch:{ MalformedURLException -> 0x062d }
            es2.a r3 = r7.f286589f     // Catch:{ MalformedURLException -> 0x062d }
            int r3 = r3.f286542f     // Catch:{ MalformedURLException -> 0x062d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ MalformedURLException -> 0x062d }
            r4 = 2
            r2[r4] = r3     // Catch:{ MalformedURLException -> 0x062d }
            r3 = 3
            r2[r3] = r1     // Catch:{ MalformedURLException -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r2)     // Catch:{ MalformedURLException -> 0x062d }
            r2 = r27
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            r6 = 1
            goto L_0x065d
        L_0x062d:
            r0 = move-exception
            goto L_0x043d
        L_0x0630:
            r0 = move-exception
            r26 = r8
        L_0x0633:
            r28 = r12
        L_0x0635:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r28
            java.lang.String r3 = r1.field_mediaId
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "[%s][media:%s]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "attachSnsImgTaskInfo fail:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            r6 = 0
        L_0x065d:
            if (r6 == 0) goto L_0x0776
            es2.a r0 = r7.f286589f
            if (r0 == 0) goto L_0x072e
            boolean r0 = r0.f286541e
            if (r0 == 0) goto L_0x072e
            te3.kv2 r2 = r7.f286590g
            java.lang.String r3 = "AdH265Helper"
            java.lang.String r4 = "checkAdDeviceSupportH265"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r2 == 0) goto L_0x072b
            boolean r0 = r2.f298681N
            if (r0 == 0) goto L_0x072b
            java.lang.String r0 = r2.f298692g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x072b
            java.lang.String r0 = r2.f298692g     // Catch:{ all -> 0x070f }
            java.lang.String r6 = "svpuseh265flag=1"
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x06f1
            r6 = 6
            boolean r6 = xb0.C102609h.m135510UY(r6)     // Catch:{ all -> 0x070f }
            if (r6 == 0) goto L_0x0696
            r8 = 2
            r1.field_requestVideoFormat = r8     // Catch:{ all -> 0x070f }
            goto L_0x06c1
        L_0x0696:
            r8 = 1
            r1.field_requestVideoFormat = r8     // Catch:{ all -> 0x070f }
            java.lang.String r0 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x06a8 }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x06a8 }
            java.lang.String r8 = "dev_disable_hevc"
            r10 = 0
            vr2.C37817q.m41545a(r8, r0, r10, r10, r11)     // Catch:{ all -> 0x06a8 }
            goto L_0x06c1
        L_0x06a8:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x070f }
            r8.<init>()     // Catch:{ all -> 0x070f }
            java.lang.String r10 = "checkAdDeviceSupportH265 report exp="
            r8.append(r10)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x070f }
            r8.append(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x070f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x070f }
        L_0x06c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x070f }
            r0.<init>()     // Catch:{ all -> 0x070f }
            java.lang.String r8 = "checkAppendAdH265Flag, isDeviceSupportHevc="
            r0.append(r8)     // Catch:{ all -> 0x070f }
            r0.append(r6)     // Catch:{ all -> 0x070f }
            java.lang.String r8 = ", requestVideoFormat="
            r0.append(r8)     // Catch:{ all -> 0x070f }
            int r8 = r1.field_requestVideoFormat     // Catch:{ all -> 0x070f }
            r0.append(r8)     // Catch:{ all -> 0x070f }
            java.lang.String r8 = ", url="
            r0.append(r8)     // Catch:{ all -> 0x070f }
            java.lang.String r2 = r2.f298692g     // Catch:{ all -> 0x070f }
            r0.append(r2)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x070f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x070f }
            r2 = 1
            r8 = 0
            lo2.C99556n.m129944g(r8, r2, r6)     // Catch:{ all -> 0x06ef }
            goto L_0x072b
        L_0x06ef:
            r0 = move-exception
            goto L_0x0711
        L_0x06f1:
            r6 = 1
            r1.field_requestVideoFormat = r6     // Catch:{ all -> 0x070f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x070f }
            r0.<init>()     // Catch:{ all -> 0x070f }
            java.lang.String r6 = "checkAppendAdH265Flag, url has no h265 flag, url="
            r0.append(r6)     // Catch:{ all -> 0x070f }
            java.lang.String r2 = r2.f298692g     // Catch:{ all -> 0x070f }
            r0.append(r2)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x070f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x070f }
            r2 = 0
            lo2.C99556n.m129944g(r2, r2, r2)     // Catch:{ all -> 0x070f }
            goto L_0x072b
        L_0x070f:
            r0 = move-exception
            r2 = 1
        L_0x0711:
            r1.field_requestVideoFormat = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "checkAppendAdH265Flag, exp="
            r2.append(r6)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x072b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x072e:
            es2.c$a r0 = new es2.c$a
            r2 = r24
            r0.<init>(r1, r2)
            r1.f287662f = r0
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.xf0(r1)
            if (r0 == 0) goto L_0x075e
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3 = 0
            r0[r3] = r28
            es2.a r2 = r7.f286589f
            java.lang.String r2 = r2.f286538b
            r4 = 1
            r0[r4] = r2
            java.lang.String r1 = r1.field_mediaId
            r5 = 2
            r0[r5] = r1
            java.lang.String r1 = "[%s][media:%s]SubCoreCdnTransport addRecvTask succ mediaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            r10 = 1
            goto L_0x0778
        L_0x075e:
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r28
            es2.a r2 = r7.f286589f
            java.lang.String r2 = r2.f286538b
            r0[r4] = r2
            java.lang.String r1 = r1.field_mediaId
            r0[r5] = r1
            java.lang.String r1 = "[%s][media:%s]SubCoreCdnTransport addRecvTask failed mediaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r1, r0)
            goto L_0x0777
        L_0x0776:
            r5 = 2
        L_0x0777:
            r10 = 2
        L_0x0778:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            return r0
        L_0x0782:
            r1 = r8
            r5 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97696c.mo136960k(java.lang.String[]):java.lang.Integer");
    }

    /* renamed from: l */
    public abstract int mo136974l();

    /* renamed from: m */
    public final String[] mo136975m(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (list == null) {
            String[] strArr = new String[0];
            SnsMethodCalculate.markEndTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return strArr;
        }
        int size = list.size();
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            strArr2[i] = list.get(i);
        }
        SnsMethodCalculate.markEndTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return strArr2;
    }

    /* renamed from: n */
    public boolean mo136961n(C96983o3 o3Var, String str, long j, String str2) {
        SnsMethodCalculate.markStartTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return false;
        }
        try {
            URL url = new URL(str);
            if (o3Var == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            } else if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            } else if (str2.indexOf(url.getHost()) == -1) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            } else {
                int i = o3Var.f284145b;
                if (i == 0) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    return false;
                } else if (Util.secondsToNow((long) i) > j) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    return true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    return false;
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", e.getMessage());
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return false;
        }
    }

    /* renamed from: o */
    public boolean mo136962o() {
        SnsMethodCalculate.markStartTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        SnsMethodCalculate.markEndTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return true;
    }

    /* renamed from: p */
    public void mo136963p(Integer num) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    /* renamed from: q */
    public abstract boolean mo136976q();

    /* renamed from: r */
    public boolean mo136977r(int i) {
        SnsMethodCalculate.markStartTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        SnsMethodCalculate.markEndTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return false;
    }

    /* renamed from: s */
    public void mo136964s() {
        String str;
        SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return;
        }
        System.currentTimeMillis();
        if (this.f286589f.f286544h.mo141829a() == 4) {
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
            String X = C102236a0.m134729X(this.f286590g);
            String str2 = this.f286589f.mo136951c() + X;
            this.f286587d = C92084a.m115750b(str2, this.f286589f.mo136951c() + C102236a0.m134720O(this.f286590g));
            C94901o Fx0 = C94866e1.Fx0();
            C97694a aVar = this.f286589f;
            Fx0.mo131085E(aVar.f286538b, this.f286587d, aVar.f286544h.mo141829a());
        } else if (this.f286589f.f286544h.mo141829a() == 5) {
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
            String X2 = C102236a0.m134729X(this.f286590g);
            String str3 = this.f286589f.mo136951c() + X2;
            this.f286587d = C92084a.m115750b(str3, this.f286589f.mo136951c() + C102236a0.m134719N(this.f286590g));
            C94901o Fx02 = C94866e1.Fx0();
            C97694a aVar2 = this.f286589f;
            Fx02.mo131085E(aVar2.f286538b, this.f286587d, aVar2.f286544h.mo141829a());
        } else if (this.f286589f.f286544h.mo141830b().size() <= 1) {
            C94901o Fx03 = C94866e1.Fx0();
            C97694a aVar3 = this.f286589f;
            Fx03.mo131085E(aVar3.f286538b, this.f286587d, aVar3.f286544h.mo141829a());
        } else {
            C94866e1.Fx0().mo131085E(this.f286589f.f286538b, this.f286587d, 0);
            LinkedList linkedList = new LinkedList();
            int i = 0;
            while (i < this.f286589f.f286544h.mo141830b().size() && i < 4) {
                C101804kv2 kv22 = this.f286589f.f286544h.mo141830b().get(i);
                C92714n h = C94866e1.Fx0().mo131119h(0, kv22.f298689d);
                if (C102236a0.m134742f(h)) {
                    linkedList.add(h);
                    Log.m105924i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + h + " " + kv22.f298689d);
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    return;
                }
            }
            this.f286587d = C92714n.m116851c(C102236a0.m134767r0(linkedList, C94866e1.Hx0()));
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.f286589f.f286544h.mo141831c() + " " + this.f286587d);
            C94866e1.Fx0().mo131085E(this.f286589f.f286544h.mo141831c(), this.f286587d, this.f286589f.f286544h.mo141829a());
        }
        if (this.f286589f.f286544h.mo141829a() == 0) {
            str = "0-" + this.f286589f.f286544h.mo141831c();
        } else if (this.f286589f.f286544h.mo141829a() == 1) {
            str = "1-" + this.f286589f.f286544h.mo141831c();
        } else if (this.f286589f.f286544h.mo141829a() == 4) {
            str = "4-" + this.f286589f.f286544h.mo141831c();
        } else if (this.f286589f.f286544h.mo141829a() == 5) {
            str = "5-" + this.f286589f.f286544h.mo141831c();
        } else {
            str = this.f286589f.f286544h.mo141829a() == 3 ? C102236a0.m134780y(3, this.f286589f.f286544h.mo141831c()) : null;
        }
        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]thumbAddDecode cacheName1: %s.", "[image-flow]", this.f286589f.f286538b, str);
        C94901o Fx04 = C94866e1.Fx0();
        String str4 = this.f286589f.f286538b;
        Fx04.getClass();
        SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Fx04.mo131126k0(str4, str, (C92714n) null);
        SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }
}
