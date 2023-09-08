package e03;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o40.C61926c;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p501dz.C58463e;
import p606mm.C99933h;
import p663qo.C101211h;
import rx3.C13598b0;
import te3.C64755uo;

/* renamed from: e03.c */
public final class C20486c implements C58463e {

    /* renamed from: a */
    public final String f57655a = "MicroMsg.TP.CdnTaskController";

    /* renamed from: b */
    public final HashMap<String, C98127h> f57656b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C98127h> f57657c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C98127h> f57658d;

    /* renamed from: e */
    public final HashMap<String, C98121d> f57659e;

    /* renamed from: f */
    public final ArrayList<C20485a> f57660f;

    /* renamed from: e03.c$a */
    public final class C20487a implements C98119b {

        /* renamed from: e03.c$a$a */
        public static final class C20488a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C20486c f57662d;

            /* renamed from: e */
            public final /* synthetic */ String f57663e;

            /* renamed from: f */
            public final /* synthetic */ C98120c f57664f;

            /* renamed from: g */
            public final /* synthetic */ String f57665g;

            /* renamed from: h */
            public final /* synthetic */ C98121d f57666h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20488a(C20486c cVar, String str, C98120c cVar2, String str2, C98121d dVar) {
                super(0);
                this.f57662d = cVar;
                this.f57663e = str;
                this.f57664f = cVar2;
                this.f57665g = str2;
                this.f57666h = dVar;
            }

            public Object invoke() {
                C98127h hVar = this.f57662d.f57657c.get(this.f57663e);
                if (hVar != null) {
                    C98120c cVar = this.f57664f;
                    C20486c cVar2 = this.f57662d;
                    String str = this.f57665g;
                    C98121d dVar = this.f57666h;
                    C98124g.C98125a aVar = hVar.f287662f;
                    if (!(aVar == null || cVar == null)) {
                        String str2 = cVar2.f57655a;
                        Log.m105924i(str2, "callback by CdnTaskController onProgress mediaId:" + str + " progressFinishLength:" + cVar.field_finishedLength);
                        aVar.mo1773g0(str, 0, cVar, dVar, hVar.field_onlycheckexist);
                        ArrayList<C20485a> arrayList = cVar2.f57660f;
                        String str3 = hVar.field_mediaId;
                        C87412m.m108593f(str3, "task.field_mediaId");
                        C20501e.m22179b(arrayList, str3, cVar.field_finishedLength, cVar.field_toltalLength);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: e03.c$a$b */
        public static final class C20489b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C20486c f57667d;

            /* renamed from: e */
            public final /* synthetic */ String f57668e;

            /* renamed from: f */
            public final /* synthetic */ C98121d f57669f;

            /* renamed from: g */
            public final /* synthetic */ String f57670g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20489b(C20486c cVar, String str, C98121d dVar, String str2) {
                super(0);
                this.f57667d = cVar;
                this.f57668e = str;
                this.f57669f = dVar;
                this.f57670g = str2;
            }

            public Object invoke() {
                C98127h hVar = this.f57667d.f57657c.get(this.f57668e);
                if (hVar != null) {
                    C20486c cVar = this.f57667d;
                    String str = this.f57668e;
                    C98121d dVar = this.f57669f;
                    String str2 = this.f57670g;
                    cVar.f57657c.remove(str);
                    C98124g.C98126b bVar = hVar.f287656M;
                    if (!(bVar == null || dVar == null)) {
                        String str3 = cVar.f57655a;
                        Log.m105924i(str3, "callback by CdnTaskController onPreloadCompleted mediaId:" + str2 + " retCode:" + dVar.field_retCode);
                        bVar.mo31987b(str, dVar);
                        ArrayList<C20485a> arrayList = cVar.f57660f;
                        String str4 = hVar.field_mediaId;
                        C87412m.m108593f(str4, "task.field_mediaId");
                        C20501e.m22178a(arrayList, str4, 0, dVar);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C20487a() {
        }

        /* renamed from: a */
        public int mo17770a(String str, C98120c cVar, C98121d dVar) {
            String str2 = C20486c.this.f57655a;
            StringBuilder sb = new StringBuilder();
            sb.append("callback preload by jni mediaId:");
            sb.append(str);
            sb.append(" progressFinishLength:");
            sb.append(cVar != null ? cVar.field_finishedLength : 0);
            sb.append(" sceneResultRet:");
            sb.append(dVar != null ? dVar.field_retCode : 0);
            Log.m105918d(str2, sb.toString());
            if (str != null) {
                C20486c cVar2 = C20486c.this;
                if (cVar2.f57657c.containsKey(str)) {
                    C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20488a(cVar2, str, cVar, str, dVar));
                    return 1;
                }
            }
            return 0;
        }

        /* renamed from: b */
        public int mo17771b(String str, C98121d dVar) {
            String str2 = C20486c.this.f57655a;
            StringBuilder sb = new StringBuilder();
            sb.append("callback by jni onPreloadCompleted mediaId:");
            sb.append(str);
            sb.append(" retCode:");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105918d(str2, sb.toString());
            if (str == null) {
                return 0;
            }
            C20486c cVar = C20486c.this;
            if (!cVar.f57657c.containsKey(str)) {
                return 0;
            }
            C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20489b(cVar, str, dVar, str));
            return 1;
        }

        /* renamed from: h */
        public void mo17772h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo17773j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: e03.c$b */
    public final class C20490b implements C101211h.C101212a {

        /* renamed from: e03.c$b$a */
        public static final class C20491a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C20486c f57672d;

            /* renamed from: e */
            public final /* synthetic */ String f57673e;

            /* renamed from: f */
            public final /* synthetic */ C98120c f57674f;

            /* renamed from: g */
            public final /* synthetic */ C98121d f57675g;

            /* renamed from: h */
            public final /* synthetic */ String f57676h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20491a(C20486c cVar, String str, C98120c cVar2, C98121d dVar, String str2) {
                super(0);
                this.f57672d = cVar;
                this.f57673e = str;
                this.f57674f = cVar2;
                this.f57675g = dVar;
                this.f57676h = str2;
            }

            public Object invoke() {
                C98127h hVar = this.f57672d.f57656b.get(this.f57673e);
                if (hVar != null) {
                    C98120c cVar = this.f57674f;
                    C98121d dVar = this.f57675g;
                    C20486c cVar2 = this.f57672d;
                    String str = this.f57676h;
                    String str2 = this.f57673e;
                    C98127h.C98128a aVar = hVar.f287704f1;
                    if (aVar != null) {
                        if (cVar != null) {
                            String str3 = cVar2.f57655a;
                            Log.m105924i(str3, "callback by CdnTaskController onProgress mediaId:" + str + " progressFinishLength:" + cVar.field_finishedLength);
                            aVar.mo17917e(str, cVar.field_finishedLength, cVar.field_toltalLength);
                            ArrayList<C20485a> arrayList = cVar2.f57660f;
                            String str4 = hVar.field_mediaId;
                            C87412m.m108593f(str4, "task.field_mediaId");
                            C20501e.m22179b(arrayList, str4, cVar.field_finishedLength, cVar.field_toltalLength);
                        }
                        if (dVar != null) {
                            String str5 = cVar2.f57655a;
                            Log.m105924i(str5, "callback by CdnTaskController onFinish mediaId:" + str + " sceneResultRet:" + dVar.field_retCode);
                            cVar2.f57656b.remove(str2);
                            cVar2.f57658d.put(str2, hVar);
                            cVar2.f57659e.put(str2, dVar);
                            aVar.mo17918g(str, dVar.field_retCode, dVar);
                            ArrayList<C20485a> arrayList2 = cVar2.f57660f;
                            String str6 = hVar.field_mediaId;
                            C87412m.m108593f(str6, "task.field_mediaId");
                            C20501e.m22178a(arrayList2, str6, dVar.field_retCode, dVar);
                            if (hVar.f287702d1 && dVar.field_retCode == 0) {
                                C64755uo uoVar = new C64755uo();
                                uoVar.f185780d = hVar.field_fullpath;
                                uoVar.f185781e = dVar.field_fileLength;
                                ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(6, hVar.field_mediaId, uoVar, new C20500d(cVar2));
                            }
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: e03.c$b$b */
        public static final class C20492b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C20486c f57677d;

            /* renamed from: e */
            public final /* synthetic */ String f57678e;

            /* renamed from: f */
            public final /* synthetic */ int f57679f;

            /* renamed from: g */
            public final /* synthetic */ int f57680g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20492b(C20486c cVar, String str, int i, int i2) {
                super(0);
                this.f57677d = cVar;
                this.f57678e = str;
                this.f57679f = i;
                this.f57680g = i2;
            }

            public Object invoke() {
                C98127h hVar = this.f57677d.f57656b.get(this.f57678e);
                if (hVar != null) {
                    int i = this.f57679f;
                    C20486c cVar = this.f57677d;
                    String str = this.f57678e;
                    int i2 = this.f57680g;
                    long j = (long) i;
                    hVar.f287694X0 = j;
                    C98127h.C98128a aVar = hVar.f287704f1;
                    if (aVar != null) {
                        String str2 = cVar.f57655a;
                        Log.m105924i(str2, "callback by CdnTaskController onDataAvailable mediaId:" + str + " offset:" + i + " length:" + i2 + " callback:" + aVar.hashCode());
                        long j2 = (long) i2;
                        String str3 = str;
                        aVar.onDataAvailable(str3, j, j2);
                        C20501e.m22179b(cVar.f57660f, str3, j + j2, -1);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: e03.c$b$c */
        public static final class C20493c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C20486c f57681d;

            /* renamed from: e */
            public final /* synthetic */ String f57682e;

            /* renamed from: f */
            public final /* synthetic */ int f57683f;

            /* renamed from: g */
            public final /* synthetic */ int f57684g;

            /* renamed from: h */
            public final /* synthetic */ CdnLogic.VideoInfo f57685h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20493c(C20486c cVar, String str, int i, int i2, CdnLogic.VideoInfo videoInfo) {
                super(0);
                this.f57681d = cVar;
                this.f57682e = str;
                this.f57683f = i;
                this.f57684g = i2;
                this.f57685h = videoInfo;
            }

            public Object invoke() {
                C98127h hVar = this.f57681d.f57656b.get(this.f57682e);
                if (hVar != null) {
                    int i = this.f57683f;
                    C20486c cVar = this.f57681d;
                    String str = this.f57682e;
                    int i2 = this.f57684g;
                    CdnLogic.VideoInfo videoInfo = this.f57685h;
                    long j = (long) i;
                    hVar.f287694X0 = j;
                    C98127h.C98128a aVar = hVar.f287704f1;
                    if (aVar != null) {
                        String str2 = cVar.f57655a;
                        Log.m105924i(str2, "callback by CdnTaskController onMoovReady mediaId:" + str + " offset:" + i + " length:" + i2);
                        aVar.onMoovReady(str, j, (long) i2, videoInfo);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C20490b() {
        }

        /* renamed from: a */
        public int mo17774a(String str, C98120c cVar, C98121d dVar) {
            String str2 = C20486c.this.f57655a;
            StringBuilder sb = new StringBuilder();
            sb.append("callback stream by jni mediaId:");
            sb.append(str);
            sb.append(" progressFinishLength:");
            sb.append(cVar != null ? cVar.field_finishedLength : 0);
            sb.append(" sceneResultRet:");
            sb.append(dVar != null ? dVar.field_retCode : 0);
            Log.m105918d(str2, sb.toString());
            if (str != null) {
                C20486c cVar2 = C20486c.this;
                if (cVar2.f57656b.containsKey(str)) {
                    C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20491a(cVar2, str, cVar, dVar, str));
                    return 1;
                }
            }
            return 0;
        }

        /* renamed from: b */
        public int mo17775b(String str, int i, int i2) {
            String str2 = C20486c.this.f57655a;
            Log.m105918d(str2, "callback by jni onDownloadToEnd mediaId:" + str + " offset:" + i + " length:" + i2);
            return 0;
        }

        /* renamed from: c */
        public int mo17776c(String str, int i, int i2) {
            String str2 = C20486c.this.f57655a;
            Log.m105918d(str2, "callback by jni onDataAvailable mediaId:" + str + " offset:" + i + " length:" + i2);
            if (str == null) {
                return 0;
            }
            C20486c cVar = C20486c.this;
            if (!cVar.f57656b.containsKey(str)) {
                return 0;
            }
            C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20492b(cVar, str, i, i2));
            return 1;
        }

        /* renamed from: d */
        public int mo17777d(String str, int i, int i2, CdnLogic.VideoInfo videoInfo) {
            C87412m.m108594g(videoInfo, "info");
            String str2 = C20486c.this.f57655a;
            Log.m105918d(str2, "callback by jni onMoovReady mediaId:" + str + " offset:" + i + " length:" + i2);
            if (str == null) {
                return 0;
            }
            C20486c cVar = C20486c.this;
            if (!cVar.f57656b.containsKey(str)) {
                return 0;
            }
            C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20493c(cVar, str, i, i2, videoInfo));
            return 1;
        }

        public int onM3U8Ready(String str, String str2) {
            return 0;
        }
    }

    /* renamed from: e03.c$c */
    public static final class C20494c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20486c f57686d;

        /* renamed from: e */
        public final /* synthetic */ String f57687e;

        /* renamed from: f */
        public final /* synthetic */ int f57688f;

        /* renamed from: g */
        public final /* synthetic */ int f57689g;

        /* renamed from: h */
        public final /* synthetic */ int f57690h;

        /* renamed from: i */
        public final /* synthetic */ C20503g f57691i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20494c(C20486c cVar, String str, int i, int i2, int i3, C20503g gVar) {
            super(0);
            this.f57686d = cVar;
            this.f57687e = str;
            this.f57688f = i;
            this.f57689g = i2;
            this.f57690h = i3;
            this.f57691i = gVar;
        }

        public Object invoke() {
            if (this.f57686d.f57656b.containsKey(this.f57687e)) {
                int bm = ((C101211h) C86312j.m106911c(C101211h.class)).mo140286bm(this.f57687e, (long) this.f57688f, (long) this.f57689g, this.f57690h);
                C20503g gVar = this.f57691i;
                if (gVar != null) {
                    gVar.mo32065a(bm);
                }
                String str = this.f57686d.f57655a;
                Log.m105924i(str, "requestVideoData in cdn thread mediaId:" + this.f57687e + " offset:" + this.f57688f + " length:" + this.f57689g + " ret:" + bm);
            } else {
                C20503g gVar2 = this.f57691i;
                if (gVar2 != null) {
                    gVar2.mo32065a(-1);
                }
                String str2 = this.f57686d.f57655a;
                Log.m105924i(str2, "requestVideoData not running id " + this.f57687e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e03.c$d */
    public static final class C20495d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20486c f57692d;

        /* renamed from: e */
        public final /* synthetic */ C98127h f57693e;

        /* renamed from: f */
        public final /* synthetic */ C20504h f57694f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20495d(C20486c cVar, C98127h hVar, C20504h hVar2) {
            super(0);
            this.f57692d = cVar;
            this.f57693e = hVar;
            this.f57694f = hVar2;
        }

        public Object invoke() {
            int i = -1;
            if (this.f57692d.f57656b.containsKey(this.f57693e.field_mediaId)) {
                C20504h hVar = this.f57694f;
                if (hVar != null) {
                    hVar.mo32066a(-1, this.f57693e);
                }
            } else {
                C98121d dVar = new C98121d();
                C20486c cVar = this.f57692d;
                String str = this.f57693e.field_mediaId;
                C87412m.m108593f(str, "task.field_mediaId");
                C20486c.m22158l(cVar, str, dVar);
                this.f57693e.field_startTime = C31543z5.m39453c();
                C98127h hVar2 = this.f57693e;
                if (hVar2.f287655L == 8) {
                    i = C20486c.m22156j(this.f57692d, hVar2);
                }
                C20504h hVar3 = this.f57694f;
                if (hVar3 != null) {
                    hVar3.mo32066a(i, this.f57693e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e03.c$e */
    public static final class C20496e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20502f f57695d;

        /* renamed from: e */
        public final /* synthetic */ String f57696e;

        /* renamed from: f */
        public final /* synthetic */ C20486c f57697f;

        /* renamed from: g */
        public final /* synthetic */ C20504h f57698g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20496e(C20502f fVar, String str, C20486c cVar, C20504h hVar) {
            super(0);
            this.f57695d = fVar;
            this.f57696e = str;
            this.f57697f = cVar;
            this.f57698g = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
            if (r6 == null) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                e03.f r0 = r9.f57695d
                java.lang.String r1 = r9.f57696e
                gi.h r0 = r0.mo32064a(r1)
                r1 = -1
                if (r0 == 0) goto L_0x0060
                e03.c r2 = r9.f57697f
                e03.h r3 = r9.f57698g
                java.lang.String r4 = r0.field_fileId
                java.lang.String r5 = ""
                if (r4 != 0) goto L_0x0017
                r0.field_fileId = r5
            L_0x0017:
                java.lang.String r4 = r0.field_aesKey
                if (r4 != 0) goto L_0x001d
                r0.field_aesKey = r5
            L_0x001d:
                r4 = 0
                r0.f287661e = r4
                java.util.HashMap<java.lang.String, gi.h> r5 = r2.f57656b
                java.lang.String r6 = r0.field_mediaId
                boolean r5 = r5.containsKey(r6)
                r6 = 0
                if (r5 == 0) goto L_0x0033
                if (r3 == 0) goto L_0x005e
                r3.mo32066a(r1, r0)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                goto L_0x005e
            L_0x0033:
                gi.d r5 = new gi.d
                r5.<init>()
                java.lang.String r7 = r0.field_mediaId
                java.lang.String r8 = "it.field_mediaId"
                gy3.C87412m.m108593f(r7, r8)
                e03.C20486c.m22158l(r2, r7, r5)
                long r7 = eb0.C31543z5.m39453c()
                r0.field_startTime = r7
                int r5 = r0.f287655L
                r7 = 8
                if (r5 != r7) goto L_0x004f
                r4 = 1
            L_0x004f:
                if (r4 == 0) goto L_0x0056
                int r2 = e03.C20486c.m22156j(r2, r0)
                goto L_0x0057
            L_0x0056:
                r2 = -1
            L_0x0057:
                if (r3 == 0) goto L_0x005e
                r3.mo32066a(r2, r0)
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x005e:
                if (r6 != 0) goto L_0x0072
            L_0x0060:
                java.lang.String r0 = r9.f57696e
                e03.h r2 = r9.f57698g
                gi.h r3 = new gi.h
                r3.<init>()
                r3.field_mediaId = r0
                if (r2 == 0) goto L_0x0072
                r2.mo32066a(r1, r3)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0072:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e03.C20486c.C20496e.invoke():java.lang.Object");
        }
    }

    /* renamed from: e03.c$f */
    public static final class C20497f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20502f f57699d;

        /* renamed from: e */
        public final /* synthetic */ String f57700e;

        /* renamed from: f */
        public final /* synthetic */ C20486c f57701f;

        /* renamed from: g */
        public final /* synthetic */ C20505i f57702g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20497f(C20502f fVar, String str, C20486c cVar, C20505i iVar) {
            super(0);
            this.f57699d = fVar;
            this.f57700e = str;
            this.f57701f = cVar;
            this.f57702g = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                java.lang.Class<mm.h> r0 = p606mm.C99933h.class
                e03.f r1 = r12.f57699d
                java.lang.String r2 = r12.f57700e
                gi.h r1 = r1.mo32064a(r2)
                r2 = -1
                if (r1 == 0) goto L_0x012d
                e03.c r3 = r12.f57701f
                java.lang.String r4 = r12.f57700e
                e03.i r5 = r12.f57702g
                java.lang.String r6 = r1.field_fileId
                java.lang.String r7 = ""
                if (r6 != 0) goto L_0x001b
                r1.field_fileId = r7
            L_0x001b:
                java.lang.String r6 = r1.field_aesKey
                if (r6 != 0) goto L_0x0021
                r1.field_aesKey = r7
            L_0x0021:
                r6 = 0
                r1.f287661e = r6
                boolean r7 = r1.f287701c1
                r8 = 1
                if (r7 == 0) goto L_0x0088
                di3.d r7 = di3.C86312j.m106911c(r0)
                mm.h r7 = (p606mm.C99933h) r7
                java.lang.String r9 = r1.field_mediaId
                java.lang.Class<te3.uo> r10 = te3.C64755uo.class
                r11 = 6
                pe3.a r7 = r7.mo84401EA(r11, r9, r10)
                te3.uo r7 = (te3.C64755uo) r7
                if (r7 == 0) goto L_0x007d
                java.lang.String r9 = r7.f185780d
                boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
                if (r9 == 0) goto L_0x0045
                goto L_0x0046
            L_0x0045:
                r7 = 0
            L_0x0046:
                if (r7 == 0) goto L_0x007d
                java.lang.String r0 = r7.f185780d
                java.lang.String r9 = r1.field_fullpath
                boolean r0 = gy3.C87412m.m108589b(r0, r9)
                if (r0 != 0) goto L_0x005e
                java.lang.String r0 = r1.field_fullpath
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
                java.lang.String r0 = r7.f185780d
                java.lang.String r7 = r1.field_fullpath
                com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r7)
            L_0x005e:
                if (r5 == 0) goto L_0x0063
                r5.mo32067a(r8, r1)
            L_0x0063:
                java.lang.String r0 = r3.f57655a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "common cache already exist video, copy to target path "
                r7.append(r9)
                java.lang.String r9 = r1.field_fullpath
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
                r0 = 0
                goto L_0x0089
            L_0x007d:
                di3.d r0 = di3.C86312j.m106911c(r0)
                mm.h r0 = (p606mm.C99933h) r0
                java.lang.String r7 = r1.field_mediaId
                r0.Rr0(r11, r7)
            L_0x0088:
                r0 = 1
            L_0x0089:
                if (r0 == 0) goto L_0x0142
                java.lang.String r0 = r1.field_mediaId
                java.lang.String r7 = "it.field_mediaId"
                gy3.C87412m.m108593f(r0, r7)
                gi.d r7 = new gi.d
                r7.<init>()
                e03.C20486c.m22158l(r3, r0, r7)
                int r0 = r1.f287696Y0
                if (r0 <= r8) goto L_0x00b7
                java.util.HashMap<java.lang.String, gi.h> r0 = r3.f57656b
                java.lang.Object r0 = r0.get(r4)
                gi.h r0 = (p1081gi.C98127h) r0
                if (r0 == 0) goto L_0x00ba
                gi.d r7 = new gi.d
                r7.<init>()
                int r4 = r3.mo32062m(r4, r7)
                if (r5 == 0) goto L_0x00ba
                r5.mo32068b(r4, r0, r7)
                goto L_0x00ba
            L_0x00b7:
                e03.C20486c.m22157k(r3)
            L_0x00ba:
                long r9 = eb0.C31543z5.m39453c()
                r1.field_startTime = r9
                java.lang.Class<qo.h> r0 = p663qo.C101211h.class
                java.util.HashMap<java.lang.String, gi.h> r4 = r3.f57656b
                java.lang.String r7 = r1.field_mediaId
                java.lang.String r9 = "task.field_mediaId"
                gy3.C87412m.m108593f(r7, r9)
                r4.put(r7, r1)
                int r4 = r1.f287655L
                r7 = 8
                if (r4 != r7) goto L_0x00d6
                r6 = 1
            L_0x00d6:
                if (r6 == 0) goto L_0x00e3
                di3.d r0 = di3.C86312j.m106911c(r0)
                qo.h r0 = (p663qo.C101211h) r0
                int r2 = r0.Xi0(r1)
                goto L_0x00f3
            L_0x00e3:
                boolean r4 = r1.mo137414b()
                if (r4 == 0) goto L_0x00f3
                di3.d r0 = di3.C86312j.m106911c(r0)
                qo.h r0 = (p663qo.C101211h) r0
                int r2 = r0.mo140281YZ(r1)
            L_0x00f3:
                if (r2 == 0) goto L_0x00fc
                java.util.HashMap<java.lang.String, gi.h> r0 = r3.f57656b
                java.lang.String r4 = r1.field_mediaId
                r0.remove(r4)
            L_0x00fc:
                java.util.ArrayList<e03.a> r0 = r3.f57660f
                java.lang.String r4 = r1.field_mediaId
                gy3.C87412m.m108593f(r4, r9)
                e03.C20501e.m22180c(r0, r4, r2, r1)
                java.lang.String r0 = r3.f57655a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "startJniStreamTask "
                r3.append(r4)
                java.lang.String r4 = r1.field_mediaId
                r3.append(r4)
                r4 = 32
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                if (r5 == 0) goto L_0x0142
                r5.mo32067a(r2, r1)
                goto L_0x0142
            L_0x012d:
                java.lang.String r0 = r12.f57700e
                e03.i r1 = r12.f57702g
                gi.h r3 = new gi.h
                r3.<init>()
                java.lang.String r4 = "task_CdnTaskController"
                r3.f287660d = r4
                r3.field_mediaId = r0
                if (r1 == 0) goto L_0x0142
                r1.mo32067a(r2, r3)
            L_0x0142:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e03.C20486c.C20497f.invoke():java.lang.Object");
        }
    }

    /* renamed from: e03.c$g */
    public static final class C20498g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20486c f57703d;

        /* renamed from: e */
        public final /* synthetic */ String f57704e;

        /* renamed from: f */
        public final /* synthetic */ C58470j f57705f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20498g(C20486c cVar, String str, C58470j jVar) {
            super(0);
            this.f57703d = cVar;
            this.f57704e = str;
            this.f57705f = jVar;
        }

        public Object invoke() {
            if (!this.f57703d.f57657c.containsKey(this.f57704e)) {
                C58470j jVar = this.f57705f;
                if (jVar != null) {
                    jVar.mo79503a(-1, (C98121d) null);
                }
            } else {
                C98121d dVar = new C98121d();
                int l = C20486c.m22158l(this.f57703d, this.f57704e, dVar);
                C58470j jVar2 = this.f57705f;
                if (jVar2 != null) {
                    jVar2.mo79503a(l, dVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e03.c$h */
    public static final class C20499h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C20486c f57706d;

        /* renamed from: e */
        public final /* synthetic */ String f57707e;

        /* renamed from: f */
        public final /* synthetic */ C58471k f57708f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20499h(C20486c cVar, String str, C58471k kVar) {
            super(0);
            this.f57706d = cVar;
            this.f57707e = str;
            this.f57708f = kVar;
        }

        public Object invoke() {
            C13598b0 b0Var;
            C98127h hVar = this.f57706d.f57656b.get(this.f57707e);
            boolean z = true;
            if (hVar != null) {
                C20486c cVar = this.f57706d;
                String str = this.f57707e;
                C58471k kVar = this.f57708f;
                C98121d dVar = new C98121d();
                int m = cVar.mo32062m(str, dVar);
                if (kVar != null) {
                    kVar.mo79502b(m, hVar, dVar);
                }
                if (hVar.f287696Y0 <= 1) {
                    C20486c.m22157k(cVar);
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C20486c cVar2 = this.f57706d;
                String str2 = this.f57707e;
                C58471k kVar2 = this.f57708f;
                C98127h remove = cVar2.f57658d.remove(str2);
                C98121d remove2 = cVar2.f57659e.remove(str2);
                if (kVar2 != null) {
                    kVar2.mo79502b(remove2 != null ? remove2.field_retCode : 0, remove, remove2);
                }
                if (remove == null || remove.f287696Y0 != 1) {
                    z = false;
                }
                if (z) {
                    C20486c.m22157k(cVar2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C20486c() {
        new HashMap();
        new HashMap();
        this.f57658d = new HashMap<>();
        this.f57659e = new HashMap<>();
        this.f57660f = new ArrayList<>();
    }

    /* renamed from: j */
    public static final int m22156j(C20486c cVar, C98127h hVar) {
        HashMap<String, C98127h> hashMap = cVar.f57657c;
        String str = hVar.field_mediaId;
        C87412m.m108593f(str, "task.field_mediaId");
        hashMap.put(str, hVar);
        int Xi0 = ((C101211h) C86312j.m106911c(C101211h.class)).Xi0(hVar);
        if (Xi0 != 0) {
            cVar.f57657c.remove(hVar.field_mediaId);
        }
        ArrayList<C20485a> arrayList = cVar.f57660f;
        String str2 = hVar.field_mediaId;
        C87412m.m108593f(str2, "task.field_mediaId");
        C20501e.m22180c(arrayList, str2, Xi0, hVar);
        String str3 = cVar.f57655a;
        Log.m105924i(str3, "startJniPreloadTask " + hVar.field_mediaId + ' ' + Xi0);
        return Xi0;
    }

    /* renamed from: k */
    public static final HashMap m22157k(C20486c cVar) {
        if (cVar.f57656b.size() <= 0) {
            return null;
        }
        Object clone = cVar.f57656b.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.tencent.mm.cdn.keep_VideoTaskInfo>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.tencent.mm.cdn.keep_VideoTaskInfo> }");
        HashMap hashMap = (HashMap) clone;
        for (Map.Entry entry : hashMap.entrySet()) {
            C98121d dVar = new C98121d();
            cVar.mo32062m((String) entry.getKey(), dVar);
            cVar.f57658d.put(entry.getKey(), entry.getValue());
            cVar.f57659e.put(entry.getKey(), dVar);
        }
        return hashMap;
    }

    /* renamed from: l */
    public static final int m22158l(C20486c cVar, String str, C98121d dVar) {
        C98124g.C98126b bVar;
        cVar.getClass();
        int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(str, dVar);
        C98127h remove = cVar.f57657c.remove(str);
        boolean z = false;
        C98124g.C98126b bVar2 = null;
        if (!(remove == null || (bVar = remove.f287656M) == null)) {
            if (yY == 0) {
                dVar.field_recvedTotalBytes = dVar.field_recvedBytes;
                bVar.mo31987b(str, dVar);
            } else {
                bVar.mo31987b(str, (C98121d) null);
            }
            ArrayList<C20485a> arrayList = cVar.f57660f;
            String str2 = remove.field_mediaId;
            C87412m.m108593f(str2, "task.field_mediaId");
            C20501e.m22178a(arrayList, str2, 0, dVar);
        }
        C20501e.m22181d(cVar.f57660f, str, yY, dVar);
        String str3 = cVar.f57655a;
        StringBuilder sb = new StringBuilder();
        sb.append("stopJniPreloadTask ");
        sb.append(str);
        sb.append(' ');
        sb.append(yY);
        sb.append(" preloadCallback is null?");
        if (remove != null) {
            bVar2 = remove.f287656M;
        }
        if (bVar2 == null) {
            z = true;
        }
        sb.append(z);
        sb.append(" result:");
        sb.append(dVar);
        Log.m105924i(str3, sb.toString());
        return yY;
    }

    /* renamed from: a */
    public boolean mo32053a(String str, C58471k kVar) {
        C87412m.m108594g(str, "mediaId");
        String str2 = this.f57655a;
        Log.m105924i(str2, "stopStreamDownloadTask " + str + ' ' + kVar + " runningStreamTask:" + this.f57656b.size());
        C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20499h(this, str, kVar));
        return true;
    }

    /* renamed from: b */
    public boolean mo32054b(C98127h hVar, C20504h hVar2) {
        C87412m.m108594g(hVar, "task");
        if (Util.isNullOrNil(hVar.field_mediaId)) {
            Log.m105920e(this.f57655a, "add download task, but task mediaId is null.");
            return false;
        }
        String str = this.f57655a;
        Log.m105924i(str, "startPreloadDownloadTask: " + hVar.field_mediaId + " current run tasks " + this.f57657c.size());
        if (hVar.field_fileId == null) {
            hVar.field_fileId = "";
        }
        if (hVar.field_aesKey == null) {
            hVar.field_aesKey = "";
        }
        hVar.f287661e = false;
        C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20495d(this, hVar, hVar2));
        return true;
    }

    /* renamed from: c */
    public int mo32055c(String str, int i, int i2, int i3, C20503g gVar) {
        C87412m.m108594g(str, "mediaId");
        if (this.f57656b.containsKey(str)) {
            C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20494c(this, str, i, i2, i3, gVar));
            return 1;
        }
        String str2 = this.f57655a;
        Log.m105924i(str2, "requestVideoData not running id mediaId:" + str + " offset:" + i + " length:" + i2);
        return 0;
    }

    /* renamed from: d */
    public boolean mo32056d(String str, C58470j jVar) {
        C87412m.m108594g(str, "mediaId");
        C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20498g(this, str, jVar));
        return true;
    }

    /* renamed from: e */
    public boolean mo32057e(String str) {
        C87412m.m108594g(str, "mediaId");
        return this.f57656b.containsKey(str);
    }

    /* renamed from: f */
    public boolean mo32058f(String str, C20502f fVar, C20504h hVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(fVar, "createCallback");
        if (str.length() == 0) {
            return false;
        }
        C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20496e(fVar, str, this, hVar));
        return true;
    }

    /* renamed from: g */
    public void mo32059g(C20485a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f57660f.remove(aVar);
    }

    /* renamed from: h */
    public void mo32060h(C20485a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f57660f.add(aVar);
    }

    /* renamed from: i */
    public boolean mo32061i(String str, C20502f fVar, C20505i iVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(fVar, "createCallback");
        if (str.length() == 0) {
            return false;
        }
        String str2 = this.f57655a;
        Log.m105924i(str2, "startStreamDownloadTaskAsync mediaId:" + str);
        C61926c.m72661F("MicroMsg.Cdn.ThreadName", new C20497f(fVar, str, this, iVar));
        return true;
    }

    /* renamed from: m */
    public final int mo32062m(String str, C98121d dVar) {
        int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(str, dVar);
        if (yY == -21008 || yY == -21007 || yY == 0) {
            this.f57656b.remove(str);
        }
        C20501e.m22181d(this.f57660f, str, yY, dVar);
        String str2 = this.f57655a;
        Log.m105924i(str2, "stopJniStreamTask " + str + ' ' + yY);
        return yY;
    }
}
