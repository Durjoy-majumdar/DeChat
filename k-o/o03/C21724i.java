package o03;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p03.C47419f;
import r03.C22194c;
import te3.C51593us3;
import te3.uh4;
import u73.C52459d0;

/* renamed from: o03.i */
public class C21724i implements C47419f {

    /* renamed from: a */
    public MMHandler f61502a = new C21725a(this, "TopStoryReportExposeTask");

    /* renamed from: b */
    public Map<Long, C21726b> f61503b = new ConcurrentHashMap();

    /* renamed from: o03.i$a */
    public class C21725a extends MMHandler {
        public C21725a(C21724i iVar, String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((C21726b) message.obj).run();
            }
        }
    }

    /* renamed from: o03.i$b */
    public class C21726b implements Runnable {

        /* renamed from: d */
        public HashSet<C22194c> f61504d = new HashSet<>();

        /* renamed from: e */
        public uh4 f61505e;

        /* renamed from: o03.i$b$a */
        public class C21727a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C51593us3 f61507d;

            public C21727a(C21726b bVar, C51593us3 us32) {
                this.f61507d = us32;
            }

            public void run() {
                C86709a0.m107524d().mo123460f(new C52459d0(this.f61507d));
            }
        }

        public C21726b(C21725a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01f4 A[LOOP:0: B:1:0x0025->B:68:0x01f4, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01f3 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r2 = "MicroMsg.TopStory.TopStoryReporterImpl"
                java.lang.String r0 = "Star to run ReportExposeTask"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                o03.i r0 = o03.C21724i.this
                java.util.Map<java.lang.Long, o03.i$b> r0 = r0.f61503b
                te3.uh4 r3 = r1.f61505e
                long r3 = r3.f64641h
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                r0.remove(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.HashSet<r03.c> r0 = r1.f61504d
                r3.addAll(r0)
                r0 = 0
            L_0x0025:
                int r5 = r0 + 20
                int r6 = r3.size()
                if (r5 < r6) goto L_0x0036
                int r6 = r3.size()
                java.util.List r0 = r3.subList(r0, r6)
                goto L_0x003a
            L_0x0036:
                java.util.List r0 = r3.subList(r0, r5)
            L_0x003a:
                r6 = r0
                te3.uh4 r7 = r1.f61505e
                java.lang.String r8 = "utf-8"
                java.lang.String r9 = "&"
                java.lang.String r10 = ""
                int r0 = r6.size()     // Catch:{ Exception -> 0x01a7 }
                if (r0 != 0) goto L_0x0050
                r16 = r5
                r17 = r6
                goto L_0x01bb
            L_0x0050:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
                r13.<init>(r10)     // Catch:{ Exception -> 0x01a7 }
                java.lang.String r0 = "isexpose=1&content="
                r13.append(r0)     // Catch:{ Exception -> 0x01a7 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
                r0.<init>(r10)     // Catch:{ Exception -> 0x01a7 }
                java.util.Iterator r14 = r6.iterator()     // Catch:{ Exception -> 0x01a7 }
            L_0x0063:
                boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x01a7 }
                java.lang.String r11 = ";"
                java.lang.String r12 = ":"
                if (r15 == 0) goto L_0x009e
                java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x01a7 }
                r03.c r15 = (r03.C22194c) r15     // Catch:{ Exception -> 0x01a7 }
                te3.xh4 r4 = r15.f62827a     // Catch:{ Exception -> 0x01a7 }
                r16 = r5
                r17 = r6
                long r5 = r4.f64708I     // Catch:{ Exception -> 0x01a5 }
                r0.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r12)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r5 = r4.f64706G     // Catch:{ Exception -> 0x01a5 }
                r0.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r12)     // Catch:{ Exception -> 0x01a5 }
                long r5 = r15.f62829c     // Catch:{ Exception -> 0x01a5 }
                r0.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r12)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r4 = r4.f64743x     // Catch:{ Exception -> 0x01a5 }
                r0.append(r4)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r11)     // Catch:{ Exception -> 0x01a5 }
                r5 = r16
                r6 = r17
                goto L_0x0063
            L_0x009e:
                r16 = r5
                r17 = r6
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ae }
                java.lang.String r0 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ Exception -> 0x00ae }
                r13.append(r0)     // Catch:{ Exception -> 0x00ae }
                goto L_0x00b5
            L_0x00ae:
                r0 = move-exception
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01a5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r10, r5)     // Catch:{ Exception -> 0x01a5 }
            L_0x00b5:
                java.lang.String r0 = "&resulttype="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r0 = r17.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x00be:
                boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r4 == 0) goto L_0x00dd
                java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x01a5 }
                r03.c r4 = (r03.C22194c) r4     // Catch:{ Exception -> 0x01a5 }
                te3.xh4 r4 = r4.f62827a     // Catch:{ Exception -> 0x01a5 }
                long r5 = r4.f64708I     // Catch:{ Exception -> 0x01a5 }
                r13.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r12)     // Catch:{ Exception -> 0x01a5 }
                long r4 = r4.f64707H     // Catch:{ Exception -> 0x01a5 }
                r13.append(r4)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r11)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x00be
            L_0x00dd:
                java.lang.String r0 = "&expand="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a5 }
                r0.<init>(r10)     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r4 = r17.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x00eb:
                boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r5 == 0) goto L_0x010a
                java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x01a5 }
                r03.c r5 = (r03.C22194c) r5     // Catch:{ Exception -> 0x01a5 }
                te3.xh4 r5 = r5.f62827a     // Catch:{ Exception -> 0x01a5 }
                long r14 = r5.f64708I     // Catch:{ Exception -> 0x01a5 }
                r0.append(r14)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r12)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r5 = r5.f64701B     // Catch:{ Exception -> 0x01a5 }
                r0.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r11)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x00eb
            L_0x010a:
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0116 }
                java.lang.String r0 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x0116 }
                r13.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0116 }
                goto L_0x011d
            L_0x0116:
                r0 = move-exception
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01a5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r10, r5)     // Catch:{ Exception -> 0x01a5 }
            L_0x011d:
                java.lang.String r0 = "&itemtype="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a5 }
                r0.<init>(r10)     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r4 = r17.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x012b:
                boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r5 == 0) goto L_0x0142
                java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x01a5 }
                r03.c r5 = (r03.C22194c) r5     // Catch:{ Exception -> 0x01a5 }
                te3.xh4 r5 = r5.f62827a     // Catch:{ Exception -> 0x01a5 }
                int r5 = r5.f64700A     // Catch:{ Exception -> 0x01a5 }
                r0.append(r5)     // Catch:{ Exception -> 0x01a5 }
                r0.append(r11)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x012b
            L_0x0142:
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                if (r7 == 0) goto L_0x01a0
                r13.append(r9)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "searchid="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = r7.f64643j     // Catch:{ Exception -> 0x01a5 }
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r9)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "query="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = r7.f64644n     // Catch:{ Exception -> 0x0167 }
                java.lang.String r0 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ Exception -> 0x0167 }
                r13.append(r0)     // Catch:{ Exception -> 0x0167 }
                goto L_0x016e
            L_0x0167:
                r0 = move-exception
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01a5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r10, r5)     // Catch:{ Exception -> 0x01a5 }
            L_0x016e:
                r13.append(r9)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "ishomepage=0"
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r9)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "sessionid="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                int r0 = r7.f64642i     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = u73.C101987v0.m134271e(r0)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                r13.append(r9)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "scene="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                int r0 = r7.f64642i     // Catch:{ Exception -> 0x01a5 }
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = "&rec_category="
                r13.append(r0)     // Catch:{ Exception -> 0x01a5 }
                long r4 = r7.f64641h     // Catch:{ Exception -> 0x01a5 }
                r13.append(r4)     // Catch:{ Exception -> 0x01a5 }
            L_0x01a0:
                java.lang.String r11 = r13.toString()     // Catch:{ Exception -> 0x01a5 }
                goto L_0x01bc
            L_0x01a5:
                r0 = move-exception
                goto L_0x01ac
            L_0x01a7:
                r0 = move-exception
                r16 = r5
                r17 = r6
            L_0x01ac:
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r4 = r0.getMessage()
                r6 = 0
                r5[r6] = r4
                java.lang.String r4 = "build14057VideoInfoExposeString error: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)
            L_0x01bb:
                r11 = 0
            L_0x01bc:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r0 != 0) goto L_0x01ea
                te3.us3 r0 = new te3.us3
                r0.<init>()
                r0.f143104t = r11
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r5 = r17.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = r0.f143104t
                r7 = 1
                r4[r7] = r5
                java.lang.String r5 = "build14057VideoInfoExposeString %d report string: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
                o03.i$b$a r4 = new o03.i$b$a
                r4.<init>(r1, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)
                goto L_0x01eb
            L_0x01ea:
                r6 = 0
            L_0x01eb:
                int r0 = r3.size()
                r4 = r16
                if (r4 < r0) goto L_0x01f4
                return
            L_0x01f4:
                r0 = r4
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: o03.C21724i.C21726b.run():void");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0109 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x00c7 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011b A[Catch:{ Exception -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0122 A[Catch:{ Exception -> 0x0144 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34016a(te3.uh4 r8, te3.xh4 r9, int r10, int r11, java.lang.String r12) {
        /*
            r7 = this;
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = "&"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            r3 = 0
            r4 = 1
            java.lang.String r5 = "scene="
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            int r5 = r8.f64642i     // Catch:{ Exception -> 0x0144 }
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "businesstype=3"
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "mediatype=2"
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "docid="
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = r9.f64706G     // Catch:{ Exception -> 0x0144 }
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "typepos="
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "0"
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "docpos="
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            int r10 = r10 + r4
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "searchid="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = r8.f64643j     // Catch:{ Exception -> 0x0144 }
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "ishomepage="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r3)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "&rec_category="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            long r5 = r9.f64741v     // Catch:{ Exception -> 0x0144 }
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "timestamp="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0144 }
            r2.append(r5)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "clicktype="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r11)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "clickcontent="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = p206nj.C117627q.m165909b(r12, r0)     // Catch:{ Exception -> 0x009d }
            r2.append(r10)     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "clicksource="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "4"
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "sceneactiontype="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r4)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "query="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = r8.f64644n     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r10 = p206nj.C117627q.m165909b(r10, r0)     // Catch:{ Exception -> 0x00c7 }
            r2.append(r10)     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "resulttype="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            long r10 = r9.f64707H     // Catch:{ Exception -> 0x0144 }
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = "sessionid="
            r2.append(r10)     // Catch:{ Exception -> 0x0144 }
            int r8 = r8.f64642i     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = u73.C101987v0.m134271e(r8)     // Catch:{ Exception -> 0x0144 }
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = "expand="
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = r9.f64743x     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r8 = p206nj.C117627q.m165909b(r8, r0)     // Catch:{ Exception -> 0x00f7 }
            r2.append(r8)     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = "title="
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = r9.f64725d     // Catch:{ Exception -> 0x0109 }
            java.lang.String r8 = p206nj.C117627q.m165909b(r8, r0)     // Catch:{ Exception -> 0x0109 }
            r2.append(r8)     // Catch:{ Exception -> 0x0109 }
        L_0x0109:
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = "nettype="
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0144 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r8)     // Catch:{ Exception -> 0x0144 }
            if (r8 == 0) goto L_0x0122
            java.lang.String r8 = "wifi"
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            goto L_0x0137
        L_0x0122:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0144 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r8)     // Catch:{ Exception -> 0x0144 }
            if (r8 == 0) goto L_0x0132
            java.lang.String r8 = "4g"
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            goto L_0x0137
        L_0x0132:
            java.lang.String r8 = "3g"
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
        L_0x0137:
            r2.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r8 = "itemtype="
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
            int r8 = r9.f64700A     // Catch:{ Exception -> 0x0144 }
            r2.append(r8)     // Catch:{ Exception -> 0x0144 }
        L_0x0144:
            java.lang.String r8 = r2.toString()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x016c
            te3.us3 r9 = new te3.us3
            r9.<init>()
            r9.f143104t = r8
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r3] = r8
            java.lang.String r8 = "MicroMsg.TopStory.TopStoryReporterImpl"
            java.lang.String r11 = "do12721ClickVideoReport %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r10)
            u73.d0 r8 = new u73.d0
            r8.<init>(r9)
            ob0.b0 r9 = f40.C86709a0.m107524d()
            r9.mo123460f(r8)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o03.C21724i.mo34016a(te3.uh4, te3.xh4, int, int, java.lang.String):void");
    }
}
