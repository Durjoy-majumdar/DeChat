package com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage;

import android.os.Message;
import android.text.TextUtils;
import ar1.C54324i;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelvideo.APIVideoTransPara;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import dp1.C58384l1;
import dp1.C58408t0;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import id3.C24618b;
import java.util.List;
import my3.C109647f;
import my3.C34688d;
import p232rw.C63679m;
import p707tz.C65000f;
import p707tz.C65002h;
import rx3.C13598b0;
import te3.C101758az;
import te3.C64477jr2;
import te3.C64689rq2;
import te3.C64899zy;
import te3.zr4;
import up1.C37521f;
import wp1.C15585f;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage */
public final class FinderMediaProcessStage extends C66177f {

    /* renamed from: p */
    public static final C24279a f161539p = new C24279a((C8480h) null);

    /* renamed from: h */
    public final FinderItem f161540h;

    /* renamed from: i */
    public final String f161541i = "LogPost.FinderMediaProcessStage";

    /* renamed from: j */
    public C57463v f161542j;

    /* renamed from: n */
    public C66408e f161543n;

    /* renamed from: o */
    public final FinderMediaProcessStage$feedDeleteListener$1 f161544o;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$a */
    public static final class C24279a {

        /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$a$a */
        public static final class C24280a {

            /* renamed from: a */
            public final int f69707a;

            /* renamed from: b */
            public final int f69708b;

            /* renamed from: c */
            public final int f69709c;

            /* renamed from: d */
            public final int f69710d;

            /* renamed from: e */
            public final ABAPrams f69711e;

            public C24280a(int i, int i2, int i3, int i4, ABAPrams aBAPrams) {
                this.f69707a = i;
                this.f69708b = i2;
                this.f69709c = i3;
                this.f69710d = i4;
                this.f69711e = aBAPrams;
            }

            /* renamed from: a */
            public final ABAPrams mo41039a() {
                return this.f69711e;
            }

            /* renamed from: b */
            public final int mo41040b() {
                return this.f69710d;
            }

            /* renamed from: c */
            public final int mo41041c() {
                return this.f69707a;
            }

            /* renamed from: d */
            public final int mo41042d() {
                return this.f69709c;
            }

            /* renamed from: e */
            public final int mo41043e() {
                return this.f69708b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C24280a)) {
                    return false;
                }
                C24280a aVar = (C24280a) obj;
                return this.f69707a == aVar.f69707a && this.f69708b == aVar.f69708b && this.f69709c == aVar.f69709c && this.f69710d == aVar.f69710d && C87412m.m108589b(this.f69711e, aVar.f69711e);
            }

            public int hashCode() {
                int i = ((((((this.f69707a * 31) + this.f69708b) * 31) + this.f69709c) * 31) + this.f69710d) * 31;
                ABAPrams aBAPrams = this.f69711e;
                return i + (aBAPrams == null ? 0 : aBAPrams.hashCode());
            }

            public String toString() {
                return "ABAResult(errCode=" + this.f69707a + ", width=" + this.f69708b + ", height=" + this.f69709c + ", bitrate=" + this.f69710d + ", abaParams=" + this.f69711e + ')';
            }
        }

        public C24279a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo41037a(String str, int i, int i2, VideoTransPara videoTransPara, long j, boolean z) {
            int i3;
            String str2 = str;
            VideoTransPara videoTransPara2 = videoTransPara;
            Class cls = C24618b.class;
            C87412m.m108594g(videoTransPara2, "videoParams");
            long l = C86013q1.m106451l(str);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 3, l);
            if (z) {
                nVar.mo175913w(1523, 3, l);
            }
            C37521f fVar = C37521f.f99374d;
            long R = fVar.mo61164R();
            if (l <= R || fVar.mo61181g() == 1) {
                fVar.getClass();
                if (C37521f.f99309V3.mo60266n().intValue() != 1) {
                    C24279a aVar = FinderMediaProcessStage.f161539p;
                    Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "checkRemuxVideo, no need remux");
                    return 0;
                }
            }
            C24279a aVar2 = FinderMediaProcessStage.f161539p;
            Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "checkRemuxVideo need remux zip");
            String str3 = "Finder.LogPost.FinderMediaProcessStage";
            nVar.mo175913w(1253, 4, 1);
            if (z) {
                nVar.mo175913w(1523, 4, 1);
            }
            long currentTicks = Util.currentTicks();
            String str4 = str2 + ".remux";
            if (str2 != null) {
                APIVideoTransPara aPIVideoTransPara = new APIVideoTransPara();
                aPIVideoTransPara.f69664d = i;
                aPIVideoTransPara.f69665e = i2;
                aPIVideoTransPara.f69666f = videoTransPara2.f267168f;
                aPIVideoTransPara.f69667g = videoTransPara2.f267169g;
                aPIVideoTransPara.f69668h = videoTransPara2.f267170h;
                aPIVideoTransPara.f69670j = videoTransPara2.f267172j;
                aPIVideoTransPara.f69671n = videoTransPara2.f267173n;
                aPIVideoTransPara.f69672o = videoTransPara2.f267174o;
                aPIVideoTransPara.f69674q = videoTransPara2.f267176q;
                aPIVideoTransPara.f69675r = videoTransPara2.f267177r;
                aPIVideoTransPara.f69676s = videoTransPara2.f267178s;
                aPIVideoTransPara.f69677t = videoTransPara2.f267179t;
                aPIVideoTransPara.f69678u = videoTransPara2.f267180u;
                aPIVideoTransPara.f69679v = videoTransPara2.f267181v;
                aPIVideoTransPara.f69680w = videoTransPara2.f267182w;
                aPIVideoTransPara.f69681x = videoTransPara2.f267183x;
                aPIVideoTransPara.f69682y = videoTransPara2.f267184y;
                aPIVideoTransPara.f69683z = videoTransPara2.f267185z;
                aPIVideoTransPara.f69653A = videoTransPara2.f267154A;
                aPIVideoTransPara.f69654B = videoTransPara2.f267155B;
                aPIVideoTransPara.f69655C = videoTransPara2.f267156C;
                aPIVideoTransPara.f69656D = videoTransPara2.f267157D;
                aPIVideoTransPara.f69657E = videoTransPara2.f267158E;
                aPIVideoTransPara.f69658F = videoTransPara2.f267159F;
                aPIVideoTransPara.f69659G = videoTransPara2.f267160G;
                aPIVideoTransPara.f69660H = videoTransPara2.f267161H;
                aPIVideoTransPara.f69661I = videoTransPara2.f267162I;
                aPIVideoTransPara.f69673p = videoTransPara2.f267175p;
                aPIVideoTransPara.f69662J = videoTransPara2.f267163J;
                aPIVideoTransPara.f69663K = videoTransPara2.f267164K;
                aPIVideoTransPara.f69669i = videoTransPara2.f267171i;
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(IImportVideoT…nsferService::class.java)");
                int i4 = ((C24618b) c).mo51328do(str2, str4, aPIVideoTransPara, false);
                if (i4 < 0) {
                    i4 = ((C24618b) C86312j.m106911c(cls)).mo51328do(str2, str4, aPIVideoTransPara, true);
                }
                i3 = i4;
            } else {
                i3 = -1;
            }
            C24279a aVar3 = FinderMediaProcessStage.f161539p;
            Log.m105924i(str3, "checkRemuxVideo remux cost:" + Util.ticksToNow(currentTicks) + "ms, ret:" + i3 + " localId:" + j);
            long ticksToNow = Util.ticksToNow(currentTicks);
            nVar.mo175913w(1253, 5, ticksToNow);
            if (z) {
                nVar.mo175913w(1523, 5, ticksToNow);
            }
            if (i3 >= 0) {
                C86013q1.m106463x(str4, str2);
                long l2 = C86013q1.m106451l(str4);
                nVar.mo175913w(1253, 7, l2);
                if (z) {
                    nVar.mo175913w(1523, 7, l2);
                }
                return l2 > R ? -3 : 0;
            }
            nVar.mo175913w(1253, 6, 1);
            if (z) {
                nVar.mo175913w(1523, 6, 1);
            }
            return -2;
        }

        /* renamed from: b */
        public final C24280a mo41038b(String str, int i, int i2, float f, float f2, VideoTransPara videoTransPara, boolean z) {
            int i3;
            int i4;
            VideoTransPara videoTransPara2 = videoTransPara;
            C87412m.m108594g(str, "input");
            C87412m.m108594g(videoTransPara2, "videoTransPara");
            if (z) {
                try {
                    C37521f fVar = C37521f.f99374d;
                    fVar.getClass();
                    fVar.getClass();
                    videoTransPara2.f267156C = (int) ((((float) fVar.mo61147A()) / (((float) C37521f.f99383e) * 1.0f)) * C37521f.f99392f);
                    C24279a aVar = FinderMediaProcessStage.f161539p;
                    Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "ABA:  finder video maxVideoSize:" + videoTransPara2 + ".maxVideoSize");
                } catch (Throwable unused) {
                }
            }
            C24279a aVar2 = FinderMediaProcessStage.f161539p;
            Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "ABA:  finder video video endtime:" + f + " starttime:" + f2);
            if (C37521f.f99374d.mo61153G()) {
                ABAPrams b = AdaptiveAdjustBitrate.m119557b(str, i2, i, videoTransPara2.f267168f, videoTransPara2.f267169g, f, f2, 4, videoTransPara2.f267182w, 0.0f, videoTransPara2.f267184y, videoTransPara2.f267185z, videoTransPara2.f267154A, videoTransPara2.f267155B, videoTransPara2.f267156C, false);
                int i5 = videoTransPara2.f267169g;
                int i6 = -1;
                if (b != null) {
                    i5 = b.outputKbps * 1000;
                    Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "getABAResult use videoBitrate:" + i5);
                    i6 = 0;
                }
                if (b == null || b.resolutionAdjust <= 0) {
                    i4 = i;
                    i3 = i2;
                } else {
                    int i7 = b.outputWidth;
                    i3 = b.outputHeight;
                    i4 = i7;
                    i6 = 0;
                }
                Log.m105924i("Finder.LogPost.FinderMediaProcessStage", "ABA:  finder video bitrate:" + i5 + " width: " + i4 + " height:" + i3);
                C87412m.m108593f(b, "abaParams");
                ((C65000f) C86312j.m106911c(C65000f.class)).mo89181XD(b);
                return new C24280a(i6, i4, i3, i5, b);
            }
            return new C24280a(-1, 0, 0, 0, (ABAPrams) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$b */
    public static final class C56481b implements MMHandler.Callback {

        /* renamed from: d */
        public static final C56481b f161545d = new C56481b();

        public final boolean handleMessage(Message message) {
            Message message2 = message;
            C87412m.m108594g(message2, "msg");
            boolean z = false;
            boolean z2 = message2.arg1 == 1;
            long j = (long) message2.what;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 54, 1);
            if (z2) {
                nVar.mo175913w(1523, 54, 1);
            }
            FinderItem Lo = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0().mo13662Lo(j);
            if (Lo != null) {
                FinderFeedReportObject finderFeedReportObject = Lo.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.uploadLogicError = 3;
                }
                C15585f.f42211a.mo14345h(Lo);
                FinderItem d = C15585f.f42211a.mo14341d(Lo.getLocalId());
                if (d != null) {
                    C58408t0.f167336a.mo83262h(d, false);
                }
            }
            C24279a aVar = FinderMediaProcessStage.f161539p;
            StringBuilder sb = new StringBuilder();
            sb.append("[checkProgressException] timeout update progress, item is null=");
            if (Lo == null) {
                z = true;
            }
            sb.append(z);
            sb.append(" localId=");
            sb.append(Lo != null ? Long.valueOf(Lo.getLocalId()) : null);
            Log.m105920e("Finder.LogPost.FinderMediaProcessStage", sb.toString());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$c */
    public static final class C56482c extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f161546d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaProcessStage f161547e;

        /* renamed from: f */
        public final /* synthetic */ int f161548f;

        /* renamed from: g */
        public final /* synthetic */ int f161549g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56482c(C59741c0 c0Var, FinderMediaProcessStage finderMediaProcessStage, int i, int i2) {
            super(1);
            this.f161546d = c0Var;
            this.f161547e = finderMediaProcessStage;
            this.f161548f = i;
            this.f161549g = i2;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            if (floatValue - this.f161546d.f170634d > 0.1f) {
                this.f161547e.f161540h.getLocalId();
                this.f161547e.mo79362r((((float) this.f161548f) + floatValue) / ((float) this.f161549g));
                this.f161546d.f170634d = floatValue;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$d */
    public static final class C56483d extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaProcessStage f161550d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f161551e;

        /* renamed from: f */
        public final /* synthetic */ int f161552f;

        /* renamed from: g */
        public final /* synthetic */ FinderMediaReportObject f161553g;

        /* renamed from: h */
        public final /* synthetic */ long f161554h;

        /* renamed from: i */
        public final /* synthetic */ String f161555i;

        /* renamed from: j */
        public final /* synthetic */ C101758az f161556j;

        /* renamed from: n */
        public final /* synthetic */ VideoTransPara f161557n;

        /* renamed from: o */
        public final /* synthetic */ C64899zy f161558o;

        /* renamed from: p */
        public final /* synthetic */ Object f161559p;

        /* renamed from: q */
        public final /* synthetic */ C8477a0 f161560q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56483d(FinderMediaProcessStage finderMediaProcessStage, C8478d0 d0Var, int i, FinderMediaReportObject finderMediaReportObject, long j, String str, C101758az azVar, VideoTransPara videoTransPara, C64899zy zyVar, Object obj, C8477a0 a0Var) {
            super(1);
            this.f161550d = finderMediaProcessStage;
            this.f161551e = d0Var;
            this.f161552f = i;
            this.f161553g = finderMediaReportObject;
            this.f161554h = j;
            this.f161555i = str;
            this.f161556j = azVar;
            this.f161557n = videoTransPara;
            this.f161558o = zyVar;
            this.f161559p = obj;
            this.f161560q = a0Var;
        }

        public Object invoke(Object obj) {
            C96553q qVar = (C96553q) obj;
            C87412m.m108594g(qVar, "result");
            FinderMediaProcessStage finderMediaProcessStage = this.f161550d;
            finderMediaProcessStage.f161542j = null;
            finderMediaProcessStage.f161540h.getLocalId();
            FinderItem finderItem = this.f161550d.f161540h;
            C87412m.m108594g(finderItem, "finderObj");
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            if (C37521f.f99562y.mo60266n().intValue() == 5) {
                qVar.f282583b = false;
                qVar.f282582a = false;
            }
            if (!qVar.f282583b && !qVar.f282582a) {
                finderItem.setPostFailedAndNotRetry(0);
                C15585f.f42211a.mo14345h(finderItem);
            }
            C8478d0 d0Var = this.f161551e;
            int i = -1;
            if (!qVar.f282582a) {
                String str = this.f161550d.f161541i;
                Log.m105924i(str, "remuxer failed " + this.f161552f + " localId:" + this.f161550d.f161540h.getLocalId() + " isCancel:" + qVar.f282584c);
                C115669n.INSTANCE.mo175913w(1253, 2, 1);
                this.f161553g.remuxTime = (int) Util.ticksToNow(this.f161554h);
                this.f161553g.remuxRetCode = -1;
            } else {
                this.f161553g.remuxTime = (int) Util.ticksToNow(this.f161554h);
                this.f161553g.remuxRetCode = 0;
                C115669n.INSTANCE.mo175913w(1253, 1, Util.ticksToNow(this.f161554h));
                String str2 = this.f161550d.f161541i;
                Log.m105924i(str2, "remuxer succ " + this.f161552f + ", cost: " + Util.ticksToNow(this.f161554h) + ", path:" + this.f161555i + " localId:" + this.f161550d.f161540h.getLocalId());
                long l = C86013q1.m106451l(this.f161555i);
                long currentTicks = Util.currentTicks();
                C24279a aVar = FinderMediaProcessStage.f161539p;
                String str3 = this.f161555i;
                C101758az azVar = this.f161556j;
                int a = aVar.mo41037a(str3, azVar.f297901i, azVar.f297902j, this.f161557n, this.f161550d.f161540h.getLocalId(), false);
                if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                    this.f161553g.zipTime = (int) Util.ticksToNow(currentTicks);
                    if (a == 0) {
                        this.f161553g.zipRetCode = 1;
                    } else {
                        this.f161553g.zipRetCode = 2;
                    }
                }
                if (!TextUtils.isEmpty(this.f161558o.f186903h) || this.f161558o.f186899d.size() > 1 || this.f161558o.f186906n.f186611e.size() > 0 || this.f161558o.f186906n.f186612f) {
                    ((C65000f) C86312j.m106911c(C65000f.class)).uw0(this.f161555i);
                }
                i = a;
            }
            d0Var.f27483d = i;
            Object obj2 = this.f161559p;
            C8477a0 a0Var = this.f161560q;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notify();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$e */
    public static final class C56484e extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f161561d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaProcessStage f161562e;

        /* renamed from: f */
        public final /* synthetic */ int f161563f;

        /* renamed from: g */
        public final /* synthetic */ int f161564g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56484e(C59741c0 c0Var, FinderMediaProcessStage finderMediaProcessStage, int i, int i2) {
            super(1);
            this.f161561d = c0Var;
            this.f161562e = finderMediaProcessStage;
            this.f161563f = i;
            this.f161564g = i2;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            if (floatValue - this.f161561d.f170634d > 0.1f) {
                this.f161562e.f161540h.getLocalId();
                this.f161562e.mo79362r((((float) this.f161563f) + floatValue) / ((float) this.f161564g));
                this.f161561d.f170634d = floatValue;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$f */
    public static final class C56485f extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderMediaProcessStage f161565d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f161566e;

        /* renamed from: f */
        public final /* synthetic */ FinderMediaReportObject f161567f;

        /* renamed from: g */
        public final /* synthetic */ long f161568g;

        /* renamed from: h */
        public final /* synthetic */ String f161569h;

        /* renamed from: i */
        public final /* synthetic */ boolean f161570i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f161571j;

        /* renamed from: n */
        public final /* synthetic */ C8478d0 f161572n;

        /* renamed from: o */
        public final /* synthetic */ VideoTransPara f161573o;

        /* renamed from: p */
        public final /* synthetic */ Object f161574p;

        /* renamed from: q */
        public final /* synthetic */ C8477a0 f161575q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56485f(FinderMediaProcessStage finderMediaProcessStage, C8478d0 d0Var, FinderMediaReportObject finderMediaReportObject, long j, String str, boolean z, C8478d0 d0Var2, C8478d0 d0Var3, VideoTransPara videoTransPara, Object obj, C8477a0 a0Var) {
            super(1);
            this.f161565d = finderMediaProcessStage;
            this.f161566e = d0Var;
            this.f161567f = finderMediaReportObject;
            this.f161568g = j;
            this.f161569h = str;
            this.f161570i = z;
            this.f161571j = d0Var2;
            this.f161572n = d0Var3;
            this.f161573o = videoTransPara;
            this.f161574p = obj;
            this.f161575q = a0Var;
        }

        public Object invoke(Object obj) {
            C96553q qVar = (C96553q) obj;
            C87412m.m108594g(qVar, "result");
            String str = this.f161565d.f161541i;
            Log.m105924i(str, "buildFromFilePath: success " + qVar.f282582a);
            FinderMediaProcessStage finderMediaProcessStage = this.f161565d;
            finderMediaProcessStage.f161542j = null;
            FinderItem finderItem = finderMediaProcessStage.f161540h;
            C87412m.m108594g(finderItem, "finderObj");
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            int i = 0;
            if (C37521f.f99562y.mo60266n().intValue() == 5) {
                qVar.f282583b = false;
                qVar.f282582a = false;
            }
            if (!qVar.f282583b && !qVar.f282582a) {
                finderItem.setPostFailedAndNotRetry(0);
                C15585f.f42211a.mo14345h(finderItem);
            }
            C8478d0 d0Var = this.f161566e;
            int i2 = -1;
            if (!qVar.f282582a) {
                String str2 = this.f161565d.f161541i;
                Log.m105924i(str2, "remuxer failed longvideo localId:" + this.f161565d.f161540h.getLocalId() + ", isCancel:" + qVar.f282584c);
                C58384l1.C58385a aVar = C58384l1.C58385a.f167283a;
                aVar.mo83218a(true);
                aVar.mo83218a(true);
                this.f161567f.remuxTime = (int) Util.ticksToNow(this.f161568g);
                this.f161567f.remuxRetCode = -1;
            } else {
                this.f161567f.remuxTime = (int) Util.ticksToNow(this.f161568g);
                this.f161567f.remuxRetCode = 0;
                long ticksToNow = Util.ticksToNow(this.f161568g);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1253, 1, ticksToNow);
                nVar.mo175913w(1523, 1, ticksToNow);
                long l = C86013q1.m106451l(this.f161569h);
                String str3 = this.f161565d.f161541i;
                Log.m105924i(str3, "remuxer succ longvideo, size:" + l + ", cost: " + Util.ticksToNow(this.f161568g) + ", path:" + this.f161569h + " localId:" + this.f161565d.f161540h.getLocalId());
                if (!this.f161570i) {
                    long currentTicks = Util.currentTicks();
                    i = FinderMediaProcessStage.f161539p.mo41037a(this.f161569h, this.f161571j.f27483d, this.f161572n.f27483d, this.f161573o, this.f161565d.f161540h.getLocalId(), !this.f161570i);
                    if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                        this.f161567f.zipTime = (int) Util.ticksToNow(currentTicks);
                        if (i == 0) {
                            this.f161567f.zipRetCode = 1;
                        } else {
                            this.f161567f.zipRetCode = 2;
                        }
                    }
                } else if (l > fVar.mo61148B()) {
                    Log.m105924i(this.f161565d.f161541i, "remux longvideo, size out of range");
                    nVar.mo175913w(1523, 101, 1);
                    FinderMediaProcessStage finderMediaProcessStage2 = this.f161565d;
                    FinderFeedReportObject finderFeedReportObject = finderMediaProcessStage2.f161540h.field_reportObject;
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.longVideoSizeInvalid = 1;
                    }
                    finderMediaProcessStage2.mo79359o();
                    i = -4;
                }
                i2 = i;
            }
            d0Var.f27483d = i2;
            Object obj2 = this.f161574p;
            C8477a0 a0Var = this.f161575q;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notifyAll();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$g */
    public static final class C56486g extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Float, C13598b0> f161576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56486g(C32226l<? super Float, C13598b0> lVar) {
            super(1);
            this.f161576d = lVar;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            C32226l<Float, C13598b0> lVar = this.f161576d;
            if (lVar != null) {
                lVar.invoke(Float.valueOf(floatValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$h */
    public static final class C56487h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64689rq2 f161577d;

        /* renamed from: e */
        public final /* synthetic */ VideoCompositionPerformanceStruct f161578e;

        /* renamed from: f */
        public final /* synthetic */ long f161579f;

        /* renamed from: g */
        public final /* synthetic */ boolean f161580g;

        /* renamed from: h */
        public final /* synthetic */ C8478d0 f161581h;

        /* renamed from: i */
        public final /* synthetic */ FinderMediaProcessStage f161582i;

        /* renamed from: j */
        public final /* synthetic */ int f161583j;

        /* renamed from: n */
        public final /* synthetic */ boolean f161584n;

        /* renamed from: o */
        public final /* synthetic */ FinderMediaReportObject f161585o;

        /* renamed from: p */
        public final /* synthetic */ int f161586p;

        /* renamed from: q */
        public final /* synthetic */ int f161587q;

        /* renamed from: r */
        public final /* synthetic */ VideoTransPara f161588r;

        /* renamed from: s */
        public final /* synthetic */ Object f161589s;

        /* renamed from: t */
        public final /* synthetic */ C8477a0 f161590t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56487h(C64689rq2 rq22, VideoCompositionPerformanceStruct videoCompositionPerformanceStruct, long j, boolean z, C8478d0 d0Var, FinderMediaProcessStage finderMediaProcessStage, int i, boolean z2, FinderMediaReportObject finderMediaReportObject, int i2, int i3, VideoTransPara videoTransPara, Object obj, C8477a0 a0Var) {
            super(1);
            this.f161577d = rq22;
            this.f161578e = videoCompositionPerformanceStruct;
            this.f161579f = j;
            this.f161580g = z;
            this.f161581h = d0Var;
            this.f161582i = finderMediaProcessStage;
            this.f161583j = i;
            this.f161584n = z2;
            this.f161585o = finderMediaReportObject;
            this.f161586p = i2;
            this.f161587q = i3;
            this.f161588r = videoTransPara;
            this.f161589s = obj;
            this.f161590t = a0Var;
        }

        public Object invoke(Object obj) {
            long j;
            String str = (String) obj;
            C64899zy zyVar = this.f161577d.f185235B;
            if (zyVar != null) {
                VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = this.f161578e;
                videoCompositionPerformanceStruct.f266480l = videoCompositionPerformanceStruct.mo86045b("EditId", zyVar.f186911s, true);
                videoCompositionPerformanceStruct.f266476h = (long) zyVar.f186904i.f297904o;
            }
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct2 = this.f161578e;
            videoCompositionPerformanceStruct2.f266482n = 0;
            long ticksToNow = Util.ticksToNow(this.f161579f);
            videoCompositionPerformanceStruct2.f266484p = ticksToNow;
            videoCompositionPerformanceStruct2.mo86046c("RemuxVideoTimeMs", ticksToNow);
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct3 = this.f161578e;
            videoCompositionPerformanceStruct3.f266491w = this.f161580g ? 1 : 0;
            videoCompositionPerformanceStruct3.f266444A = 0;
            if (C86013q1.m106450k(str)) {
                this.f161578e.f266481m = 0;
                ((C65002h) C86312j.m106911c(C65002h.class)).mo89211dH(this.f161578e, str);
            } else {
                this.f161578e.f266481m = 1;
            }
            C8478d0 d0Var = this.f161581h;
            int i = -1;
            int i2 = 0;
            if (Util.isNullOrNil(str)) {
                String str2 = this.f161582i.f161541i;
                Log.m105924i(str2, "remuxer failed " + this.f161583j + " localId:" + this.f161582i.f161540h.getLocalId());
                if (this.f161580g || this.f161584n) {
                    i2 = 1;
                }
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1253, 2, 1);
                if (i2 != 0) {
                    nVar.mo175913w(1523, 2, 1);
                }
                this.f161585o.remuxTime = (int) Util.ticksToNow(this.f161579f);
                this.f161585o.remuxRetCode = -1;
            } else {
                this.f161585o.remuxTime = (int) Util.ticksToNow(this.f161579f);
                this.f161585o.remuxRetCode = 0;
                long ticksToNow2 = Util.ticksToNow(this.f161579f);
                boolean z = this.f161580g || this.f161584n;
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175913w(1253, 1, ticksToNow2);
                if (z) {
                    nVar2.mo175913w(1523, 1, ticksToNow2);
                }
                String str3 = this.f161582i.f161541i;
                StringBuilder sb = new StringBuilder();
                sb.append("remuxer succ ");
                sb.append(this.f161583j);
                sb.append(", cost: ");
                sb.append(Util.ticksToNow(this.f161579f));
                sb.append(", path:");
                sb.append(str);
                sb.append(" localId:");
                sb.append(this.f161582i.f161540h.getLocalId());
                sb.append(' ');
                sb.append(Util.getSizeKB(C86013q1.m106451l(str == null ? "" : str)));
                Log.m105924i(str3, sb.toString());
                long l = C86013q1.m106451l(str);
                long currentTicks = Util.currentTicks();
                if (!this.f161580g) {
                    i2 = FinderMediaProcessStage.f161539p.mo41037a(str, this.f161586p, this.f161587q, this.f161588r, this.f161582i.f161540h.getLocalId(), this.f161584n);
                }
                if (!this.f161580g || l <= C37521f.f99374d.mo61148B()) {
                    j = l;
                    i = i2;
                } else {
                    j = l;
                    nVar2.mo175913w(1523, 101, 1);
                    FinderMediaProcessStage finderMediaProcessStage = this.f161582i;
                    FinderFeedReportObject finderFeedReportObject = finderMediaProcessStage.f161540h.field_reportObject;
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.longVideoSizeInvalid = 1;
                    }
                    finderMediaProcessStage.mo79359o();
                    String str4 = this.f161582i.f161541i;
                    Log.m105924i(str4, "remux longvideo, size out of range " + j);
                    i = -4;
                }
                if (j > (this.f161580g ? C37521f.f99374d.mo61148B() : C37521f.f99374d.mo61164R()) && C37521f.f99374d.mo61181g() != 1) {
                    this.f161585o.zipTime = (int) Util.ticksToNow(currentTicks);
                    if (i == 0) {
                        this.f161585o.zipRetCode = 1;
                    } else {
                        this.f161585o.zipRetCode = 2;
                    }
                }
            }
            d0Var.f27483d = i;
            Object obj2 = this.f161589s;
            C8477a0 a0Var = this.f161590t;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notify();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$i */
    public static final class C56488i extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f161591d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaProcessStage f161592e;

        /* renamed from: f */
        public final /* synthetic */ int f161593f;

        /* renamed from: g */
        public final /* synthetic */ List<C64689rq2> f161594g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56488i(C59741c0 c0Var, FinderMediaProcessStage finderMediaProcessStage, int i, List<C64689rq2> list) {
            super(1);
            this.f161591d = c0Var;
            this.f161592e = finderMediaProcessStage;
            this.f161593f = i;
            this.f161594g = list;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            if (floatValue - this.f161591d.f170634d > 0.1f) {
                this.f161592e.mo79362r((((float) this.f161593f) + floatValue) / ((float) this.f161594g.size()));
                this.f161591d.f170634d = floatValue;
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new MMHandler("Finder.LogPost.FinderMediaProcessStage" + "#checkProgressExceptionHandler", (MMHandler.Callback) C56481b.f161545d).setLogging(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaProcessStage(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f161540h = finderItem;
        this.f161543n = new C54324i(finderItem, 2);
        this.f161544o = new FinderMediaProcessStage$feedDeleteListener$1(this, C40008f.f107254d);
    }

    /* renamed from: a */
    public int mo75100a() {
        return 2;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161540h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 20, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 20, 1);
            }
        }
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161540h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 20, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 20, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x036a, code lost:
        if ((r9 == null || r9.length() == 0) != false) goto L_0x036c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0590 A[SYNTHETIC, Splitter:B:210:0x0590] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0884  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0962  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x09c4  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x09cc  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x09cf  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x09d8  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0a14  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0a45  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0a51  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0b7a  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0c35  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0c7b  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0c8d  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0cd8  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0d06  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0d3f  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0abb A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r66 = this;
            r15 = r66
            java.lang.Class<h81.h> r19 = h81.C32735h.class
            java.lang.Class<tz.e> r20 = p707tz.C64999e.class
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r21 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            java.lang.Class<rw.m> r22 = p232rw.C63679m.class
            java.lang.Class<tz.h> r23 = p707tz.C65002h.class
            java.lang.Class<tz.f> r24 = p707tz.C65000f.class
            java.lang.String r0 = r15.f161541i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start localId:"
            r1.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r15.f161540h
            long r2 = r2.getLocalId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1 r0 = r15.f161544o
            r0.alive()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            java.lang.String r1 = "mediaProcess"
            r0.trackPost(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            r14 = 2
            if (r0 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0.postStage = r14
        L_0x0041:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            java.util.LinkedList r0 = r0.getHalfVideoMediaExtList()
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r1 = r0.hasNext()
            r12 = 1
            r11 = 0
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r0.next()
            te3.rq2 r1 = (te3.C64689rq2) r1
            te3.zy r2 = r1.f185235B
            if (r2 == 0) goto L_0x0067
            boolean r2 = r2.f186905j
            if (r2 != r12) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            if (r12 == 0) goto L_0x0050
            r13.add(r1)
            goto L_0x0050
        L_0x006e:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            boolean r10 = r0.isLongVideo()
            if (r10 == 0) goto L_0x0079
            r13.clear()
        L_0x0079:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            java.util.LinkedList r0 = r0.getMediaList()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0084:
            boolean r2 = r0.hasNext()
            r25 = 0
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L_0x00bf
            te3.rq2 r2 = (te3.C64689rq2) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r15.f161540h
            boolean r4 = r4.isNeedCrop(r1)
            if (r4 == 0) goto L_0x00aa
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r15.f161540h
            te3.rq2 r1 = r4.getCropInfo(r1)
            if (r1 == 0) goto L_0x00bd
            r13.add(r2)
            goto L_0x00bd
        L_0x00aa:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r15.f161540h
            boolean r4 = r4.isNeedVideoCompositionPlay(r1)
            if (r4 == 0) goto L_0x00bd
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r15.f161540h
            te3.rq2 r1 = r4.getCropInfo(r1)
            if (r1 == 0) goto L_0x00bd
            r13.add(r2)
        L_0x00bd:
            r1 = r3
            goto L_0x0084
        L_0x00bf:
            sx3.C64197v.m75542k()
            throw r25
        L_0x00c3:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99562y
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x00e3
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r15.f161540h
            r0.<init>(r1, r14)
            r15.mo79360p(r0)
            xq1.e r0 = r15.f161543n
            return r0
        L_0x00e3:
            int r0 = r13.size()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0102
            java.lang.String r0 = r15.f161541i
            java.lang.String r1 = "nothing need to be processed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r15.mo79362r(r9)
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r0 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r15.f161540h
            r0.<init>(r1)
            r15.mo79360p(r0)
            xq1.e r0 = r15.f161543n
            return r0
        L_0x0102:
            java.lang.String r0 = r15.f161541i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "process media count "
            r1.append(r2)
            int r2 = r13.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 19
            r26 = 1
            r2 = 1253(0x4e5, double:6.19E-321)
            r4 = 19
            r6 = 1
            r1 = r8
            r1.mo175913w(r2, r4, r6)
            r28 = 0
            if (r0 == 0) goto L_0x0140
            r2 = 1523(0x5f3, double:7.525E-321)
            r1 = r8
            r4 = r16
            r6 = r26
            r1.mo175913w(r2, r4, r6)
        L_0x0140:
            java.util.Iterator r26 = r13.iterator()
            r8 = 0
        L_0x0145:
            boolean r0 = r26.hasNext()
            if (r0 == 0) goto L_0x0d9f
            java.lang.Object r0 = r26.next()
            int r27 = r8 + 1
            if (r8 < 0) goto L_0x0d9a
            r7 = r0
            te3.rq2 r7 = (te3.C64689rq2) r7
            te3.jr2 r0 = r7.f185281u
            if (r0 == 0) goto L_0x015d
            int r0 = r0.f183837n
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            up1.f r1 = up1.C37521f.f99374d
            int r2 = r1.mo61165S()
            if (r0 <= r2) goto L_0x0173
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r15.f161540h
            r0.<init>(r1, r14)
            r15.mo79360p(r0)
            xq1.e r0 = r15.f161543n
            return r0
        L_0x0173:
            if (r10 == 0) goto L_0x017c
            dq1.c r0 = dq1.C31252c.f83719a
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.mo58041a()
            goto L_0x0180
        L_0x017c:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.mo61161O()
        L_0x0180:
            r6 = r0
            java.lang.String r0 = r15.f161541i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FinderMediaProcessTask index "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " isLongVideo:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " videoParams "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            te3.jr2 r0 = r7.f185281u
            if (r0 != 0) goto L_0x01ac
            goto L_0x01b1
        L_0x01ac:
            int r1 = r0.f183837n
            int r1 = r1 + r12
            r0.f183837n = r1
        L_0x01b1:
            if (r10 == 0) goto L_0x01bd
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x01ba
            goto L_0x01bd
        L_0x01ba:
            r1 = 6
            r0.postStage = r1
        L_0x01bd:
            wp1.f$a r0 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r15.f161540h
            r0.mo14345h(r1)
            er1.w3 r0 = er1.C58784w3.f168295a
            boolean r0 = r0.mo83894P0(r7)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r5 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject
            r5.<init>()
            int r1 = r7.f185268f
            r5.mediaType = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r5.multiMediaInfo = r1
            te3.zy r1 = r7.f185235B
            java.lang.String r2 = "track.path"
            if (r1 == 0) goto L_0x0264
            java.util.LinkedList<te3.hi4> r1 = r1.f186899d
            if (r1 == 0) goto L_0x0264
            java.util.Iterator r1 = r1.iterator()
        L_0x01e9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x025f
            java.lang.Object r3 = r1.next()
            te3.hi4 r3 = (te3.hi4) r3
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r4.<init>()
            java.lang.String r9 = r3.f183504d
            r39 = r13
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r9 = (int) r12
            r4.fileSize = r9
            di3.d r9 = di3.C86312j.m106911c(r22)
            rw.m r9 = (p232rw.C63679m) r9
            java.lang.String r3 = r3.f183504d
            gy3.C87412m.m108593f(r3, r2)
            rw.m$a r3 = r9.mo88483M1(r3)
            if (r3 == 0) goto L_0x0254
            int r9 = r3.mo88492f()
            r4.width = r9
            int r9 = r3.mo88490e()
            r4.height = r9
            int r9 = r3.mo88487b()
            r4.videoBitrate = r9
            long r12 = r3.mo88488c()
            int r9 = (int) r12
            r4.videoDuration = r9
            int r9 = r3.mo88486a()
            r4.audioBitrate = r9
            float r9 = r3.mo88489d()
            int r9 = (int) r9
            r4.fps = r9
            java.lang.String r9 = r15.f161541i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "put multiMediaInfo:"
            r12.append(r13)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0254:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r3 = r5.multiMediaInfo
            r3.add(r4)
            r13 = r39
            r9 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            goto L_0x01e9
        L_0x025f:
            r39 = r13
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0266
        L_0x0264:
            r39 = r13
        L_0x0266:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r1 = r5.multiMediaInfo
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r1 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportInfo) r1
            if (r1 != 0) goto L_0x0277
        L_0x0272:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r1 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r1.<init>()
        L_0x0277:
            r5.origin = r1
            java.lang.String r1 = r7.f185275p
            if (r1 != 0) goto L_0x0285
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
        L_0x0285:
            r13 = r1
            java.lang.String r1 = "it.mediaId ?: UUID.randomUUID().toString()"
            gy3.C87412m.m108593f(r13, r1)
            long r41 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            pl1.r0 r1 = new pl1.r0
            up1.y r32 = up1.C27696y.V99_VIDEO
            java.lang.String r33 = r32.mo55546a()
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 56
            r38 = 0
            r30 = r1
            r31 = r7
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)
            er1.j5 r3 = er1.C58741j5.f168184a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r15.f161540h
            long r14 = r9.getCreateTime()
            r4.append(r14)
            boolean r9 = r7.f185255T
            java.lang.String r12 = ""
            if (r9 == 0) goto L_0x02c1
            java.lang.String r9 = "_half"
            goto L_0x02c2
        L_0x02c1:
            r9 = r12
        L_0x02c2:
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = r3.mo83734h(r1, r4)
            di3.d r1 = di3.C86312j.m106911c(r24)
            tz.f r1 = (p707tz.C65000f) r1
            int r14 = r1.mo89178Tj()
            di3.d r1 = di3.C86312j.m106911c(r20)
            tz.e r1 = (p707tz.C64999e) r1
            boolean r1 = r1.mo89162fm()
            if (r1 == 0) goto L_0x02ee
            di3.d r1 = di3.C86312j.m106911c(r20)
            tz.e r1 = (p707tz.C64999e) r1
            int r1 = r1.qe0()
            goto L_0x02fa
        L_0x02ee:
            di3.d r1 = di3.C86312j.m106911c(r19)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_use_origin_remuxer
            int r1 = r1.mo58779Qe(r3, r11)
        L_0x02fa:
            di3.d r3 = di3.C86312j.m106911c(r19)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_use_check_no_need_remux
            r9 = 1
            int r3 = r3.mo58779Qe(r4, r9)
            te3.zy r4 = r7.f185235B
            if (r4 == 0) goto L_0x0316
            java.util.LinkedList<te3.hi4> r4 = r4.f186899d
            if (r4 == 0) goto L_0x0316
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            te3.hi4 r4 = (te3.hi4) r4
            goto L_0x0318
        L_0x0316:
            r4 = r25
        L_0x0318:
            te3.zy r9 = r7.f185235B
            if (r9 == 0) goto L_0x0329
            java.util.LinkedList<te3.hi4> r9 = r9.f186899d
            if (r9 == 0) goto L_0x0329
            int r9 = r9.size()
            r11 = 1
            if (r9 != r11) goto L_0x0329
            r9 = 1
            goto L_0x032a
        L_0x0329:
            r9 = 0
        L_0x032a:
            if (r9 == 0) goto L_0x0383
            te3.zy r9 = r7.f185235B
            if (r9 == 0) goto L_0x033d
            te3.yy r9 = r9.f186906n
            if (r9 == 0) goto L_0x033d
            java.util.LinkedList<te3.ea> r9 = r9.f186611e
            if (r9 == 0) goto L_0x033d
            int r9 = r9.size()
            goto L_0x033e
        L_0x033d:
            r9 = 0
        L_0x033e:
            if (r9 != 0) goto L_0x0383
            te3.zy r9 = r7.f185235B
            if (r9 == 0) goto L_0x034a
            boolean r11 = r9.f186909q
            if (r11 != 0) goto L_0x034a
            r11 = 1
            goto L_0x034b
        L_0x034a:
            r11 = 0
        L_0x034b:
            if (r11 == 0) goto L_0x0383
            if (r9 == 0) goto L_0x0352
            te3.rr4 r9 = r9.f186908p
            goto L_0x0354
        L_0x0352:
            r9 = r25
        L_0x0354:
            if (r9 != 0) goto L_0x0383
            if (r4 == 0) goto L_0x0383
            te3.tj4 r9 = r4.f183517t
            if (r9 == 0) goto L_0x036c
            java.lang.String r9 = r9.f142248d
            if (r9 == 0) goto L_0x0369
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0367
            goto L_0x0369
        L_0x0367:
            r9 = 0
            goto L_0x036a
        L_0x0369:
            r9 = 1
        L_0x036a:
            if (r9 == 0) goto L_0x0383
        L_0x036c:
            r11 = r8
            long r8 = r4.f183507g
            r18 = r11
            r17 = r12
            long r11 = r4.f183506f
            long r8 = r8 - r11
            long r11 = r4.f183509i
            r32 = r5
            long r4 = r4.f183508h
            long r11 = r11 - r4
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0389
            r9 = 1
            goto L_0x038a
        L_0x0383:
            r32 = r5
            r18 = r8
            r17 = r12
        L_0x0389:
            r9 = 0
        L_0x038a:
            r12 = r66
            java.lang.String r4 = r12.f161541i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "process: config: "
            r5.append(r8)
            r5.append(r1)
            java.lang.String r8 = ", checkNoNeedRemux:"
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = ", trackSize: "
            r5.append(r8)
            te3.zy r8 = r7.f185235B
            if (r8 == 0) goto L_0x03b9
            java.util.LinkedList<te3.hi4> r8 = r8.f186899d
            if (r8 == 0) goto L_0x03b9
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x03bb
        L_0x03b9:
            r8 = r25
        L_0x03bb:
            r5.append(r8)
            java.lang.String r8 = ", editSize: "
            r5.append(r8)
            te3.zy r8 = r7.f185235B
            if (r8 == 0) goto L_0x03d8
            te3.yy r8 = r8.f186906n
            if (r8 == 0) goto L_0x03d8
            java.util.LinkedList<te3.ea> r8 = r8.f186611e
            if (r8 == 0) goto L_0x03d8
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x03da
        L_0x03d8:
            r8 = r25
        L_0x03da:
            r5.append(r8)
            java.lang.String r8 = ", videoIsNoEffect:"
            r5.append(r8)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            di3.d r4 = di3.C86312j.m106911c(r19)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_audio_quality_analysis_switch
            r8 = 0
            int r4 = r4.mo58779Qe(r5, r8)
            r5 = 1
            if (r4 != r5) goto L_0x03fe
            r11 = 1
            goto L_0x03ff
        L_0x03fe:
            r11 = 0
        L_0x03ff:
            int r4 = r6.f267173n
            float r4 = (float) r4
            r33 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r4 / r33
            int r4 = r6.f267174o
            float r5 = (float) r4
            int r4 = r6.f267175p
            r34 = r0
            te3.zy r0 = r7.f185235B
            r35 = r4
            if (r0 == 0) goto L_0x0418
            boolean r4 = r0.f186902g
            r36 = r11
            goto L_0x041b
        L_0x0418:
            r36 = r11
            r4 = 1
        L_0x041b:
            java.lang.String r11 = ", "
            r37 = 0
            r38 = r4
            r4 = 1
            if (r3 != r4) goto L_0x05e8
            if (r9 == 0) goto L_0x05e8
            if (r0 == 0) goto L_0x0435
            java.util.LinkedList<te3.hi4> r0 = r0.f186899d
            if (r0 == 0) goto L_0x0435
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            te3.hi4 r0 = (te3.hi4) r0
            if (r0 != 0) goto L_0x043a
        L_0x0435:
            te3.hi4 r0 = new te3.hi4
            r0.<init>()
        L_0x043a:
            java.lang.String r3 = r0.f183504d
            gy3.C87412m.m108593f(r3, r2)
            boolean r3 = r12.mo79352h(r3, r6)
            te3.zy r4 = r7.f185235B
            if (r4 == 0) goto L_0x044a
            java.lang.String r4 = r4.f186903h
            goto L_0x044c
        L_0x044a:
            r4 = r25
        L_0x044c:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r55 = r5
            java.lang.String r5 = r12.f161541i
            r56 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r57 = r14
            java.lang.String r14 = "isVideoSizeMatch:"
            r8.append(r14)
            r8.append(r3)
            java.lang.String r14 = "， noMusic:"
            r8.append(r14)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            if (r3 == 0) goto L_0x05e4
            if (r4 == 0) goto L_0x05e4
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            di3.d r5 = di3.C86312j.m106911c(r24)
            tz.f r5 = (p707tz.C65000f) r5
            te3.m10 r8 = r0.f183515r
            te3.ep3 r8 = r8.f184196e
            r5.mo89209x8(r8, r3)
            di3.d r5 = di3.C86312j.m106911c(r24)
            tz.f r5 = (p707tz.C65000f) r5
            te3.m10 r8 = r0.f183515r
            te3.ep3 r8 = r8.f184198g
            r5.mo89209x8(r8, r4)
            java.lang.String r5 = r12.f161541i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "cropRect:"
            r8.append(r14)
            r8.append(r3)
            java.lang.String r14 = ", contentRect:"
            r8.append(r14)
            r8.append(r4)
            java.lang.String r14 = ", track:["
            r8.append(r14)
            r58 = r13
            long r13 = r0.f183508h
            r8.append(r13)
            r8.append(r11)
            long r13 = r0.f183509i
            r8.append(r13)
            r8.append(r11)
            long r13 = r0.f183510j
            r8.append(r13)
            r13 = 93
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            long r13 = r0.f183508h
            int r5 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r5 != 0) goto L_0x05e2
            long r13 = r0.f183510j
            r5 = r9
            long r8 = r0.f183509i
            long r8 = r13 - r8
            r43 = 10
            int r45 = (r8 > r43 ? 1 : (r8 == r43 ? 0 : -1))
            if (r45 > 0) goto L_0x05f1
            int r8 = r6.f267170h
            int r8 = r8 * 1000
            long r8 = (long) r8
            int r43 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r43 > 0) goto L_0x05f1
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x05f1
            di3.d r3 = di3.C86312j.m106911c(r21)
            com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
            java.lang.String r4 = r0.f183504d
            boolean r3 = r3.optimizeMP4VFS(r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            java.lang.String r8 = r0.f183504d
            gy3.C87412m.m108593f(r8, r2)
            boolean r2 = r4.mo83883L0(r8)
            java.lang.String r4 = r12.f161541i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "moovSucc:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = ", isOptimize:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            if (r2 == 0) goto L_0x05c3
            java.lang.String r2 = r12.f161541i
            java.lang.String r4 = "no need remux!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.String r2 = r0.f183504d
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r15)
            int r2 = r0.f183511n     // Catch:{ all -> 0x059f }
            int r4 = r0.f183512o     // Catch:{ all -> 0x059f }
            int r8 = r6.f267168f     // Catch:{ all -> 0x059f }
            int r9 = r6.f267169g     // Catch:{ all -> 0x059f }
            long r13 = r0.f183510j     // Catch:{ all -> 0x059f }
            float r0 = (float) r13     // Catch:{ all -> 0x059f }
            float r48 = r0 / r33
            r49 = 0
            r50 = 4
            float r0 = r6.f267182w     // Catch:{ all -> 0x059f }
            r52 = 0
            int r13 = r6.f267154A     // Catch:{ all -> 0x059f }
            int r14 = r6.f267155B     // Catch:{ all -> 0x059f }
            r43 = r15
            r44 = r2
            r45 = r4
            r46 = r8
            r47 = r9
            r51 = r0
            r53 = r13
            r54 = r14
            com.tencent.mm.plugin.sight.base.ABAPrams r0 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119560f(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x058c
            int r2 = r0.qualityLevel     // Catch:{ all -> 0x059f }
            float r2 = (float) r2
            di3.d r4 = di3.C86312j.m106911c(r24)     // Catch:{ all -> 0x058a }
            tz.f r4 = (p707tz.C65000f) r4     // Catch:{ all -> 0x058a }
            r4.mo89181XD(r0)     // Catch:{ all -> 0x058a }
            int r4 = r0.skipVideoCompress     // Catch:{ all -> 0x058a }
            r8 = 1
            if (r4 == r8) goto L_0x058d
            java.lang.String r4 = r12.f161541i     // Catch:{ all -> 0x058a }
            java.lang.String r8 = "AdaptiveAdjustBitrate, check need compress, change type to remux"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ all -> 0x058a }
            r4 = 2
            goto L_0x058e
        L_0x058a:
            goto L_0x05a1
        L_0x058c:
            r2 = 0
        L_0x058d:
            r4 = 3
        L_0x058e:
            if (r3 == 0) goto L_0x05a2
            di3.d r3 = di3.C86312j.m106911c(r21)     // Catch:{ all -> 0x059d }
            com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3     // Catch:{ all -> 0x059d }
            int r8 = r6.f267180u     // Catch:{ all -> 0x059d }
            r9 = 0
            r3.addReportMetadata(r15, r0, r8, r9)     // Catch:{ all -> 0x059d }
            goto L_0x05a2
        L_0x059d:
            goto L_0x05a2
        L_0x059f:
            r2 = 0
        L_0x05a1:
            r4 = 3
        L_0x05a2:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 36
            r13 = 1
            r44 = 1253(0x4e5, double:6.19E-321)
            r46 = 36
            r48 = 1
            r43 = r0
            r43.mo175913w(r44, r46, r48)
            if (r10 == 0) goto L_0x05c0
            r44 = 1523(0x5f3, double:7.525E-321)
            r43 = r0
            r46 = r8
            r48 = r13
            r43.mo175913w(r44, r46, r48)
        L_0x05c0:
            r13 = r4
            r0 = 3
            goto L_0x05f4
        L_0x05c3:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 64
            r8 = 1
            r47 = 1253(0x4e5, double:6.19E-321)
            r49 = 64
            r51 = 1
            r46 = r0
            r46.mo175913w(r47, r49, r51)
            if (r10 == 0) goto L_0x05f1
            r47 = 1523(0x5f3, double:7.525E-321)
            r46 = r0
            r49 = r2
            r51 = r8
            r46.mo175913w(r47, r49, r51)
            goto L_0x05f1
        L_0x05e2:
            r5 = r9
            goto L_0x05f1
        L_0x05e4:
            r5 = r9
            r58 = r13
            goto L_0x05f1
        L_0x05e8:
            r55 = r5
            r56 = r8
            r5 = r9
            r58 = r13
            r57 = r14
        L_0x05f1:
            r0 = 3
            r2 = 0
            r13 = 2
        L_0x05f4:
            if (r13 == r0) goto L_0x0c35
            te3.zy r0 = r7.f185235B
            if (r0 == 0) goto L_0x0607
            java.util.LinkedList<te3.hi4> r0 = r0.f186899d
            if (r0 == 0) goto L_0x0607
            r14 = 0
            java.lang.Object r0 = r0.get(r14)
            te3.hi4 r0 = (te3.hi4) r0
            r9 = r0
            goto L_0x060a
        L_0x0607:
            r14 = 0
            r9 = r25
        L_0x060a:
            if (r5 == 0) goto L_0x0657
            if (r9 == 0) goto L_0x0657
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            di3.d r4 = di3.C86312j.m106911c(r24)
            tz.f r4 = (p707tz.C65000f) r4
            te3.m10 r8 = r9.f183515r
            te3.ep3 r8 = r8.f184196e
            r4.mo89209x8(r8, r0)
            di3.d r4 = di3.C86312j.m106911c(r24)
            tz.f r4 = (p707tz.C65000f) r4
            te3.m10 r8 = r9.f183515r
            te3.ep3 r8 = r8.f184199h
            r4.mo89209x8(r8, r3)
            boolean r8 = r3.contains(r0)
            java.lang.String r4 = r12.f161541i
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r43 = r2
            java.lang.String r2 = "process: crop: "
            r14.append(r2)
            r14.append(r0)
            java.lang.String r0 = ", content: "
            r14.append(r0)
            r14.append(r3)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x065a
        L_0x0657:
            r43 = r2
            r8 = 0
        L_0x065a:
            java.lang.String r14 = "remuxVideo file error: "
            r4 = 32
            if (r10 == 0) goto L_0x0756
            r0 = 1
            if (r1 == r0) goto L_0x0737
            int r34 = r39.size()
            r0 = r66
            r1 = r41
            r3 = r6
            r8 = r35
            r5 = r38
            r35 = r13
            r13 = 32
            r4 = r7
            r44 = r5
            r38 = r32
            r5 = r15
            r59 = r6
            r6 = r38
            r60 = r7
            r7 = r10
            r46 = r8
            r45 = r18
            r8 = r45
            r61 = r9
            r47 = 1065353216(0x3f800000, float:1.0)
            r9 = r34
            rx3.l r0 = r0.mo79356l(r1, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r0.mo12991a()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.mo12992b()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            if (r1 >= 0) goto L_0x06c0
            di3.d r0 = di3.C86312j.m106911c(r23)
            tz.h r0 = (p707tz.C65002h) r0
            r9 = r58
            r0.mo89213hQ(r9)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.f161540h
            r2 = 2
            r0.<init>(r1, r2)
            r12.mo79360p(r0)
            xq1.e r0 = r12.f161543n
            return r0
        L_0x06c0:
            r9 = r58
            di3.d r0 = di3.C86312j.m106911c(r22)
            rw.m r0 = (p232rw.C63679m) r0
            rw.m$a r0 = r0.mo88483M1(r15)
            if (r0 == 0) goto L_0x06ed
            int r1 = r0.mo88492f()
            if (r1 <= 0) goto L_0x06ed
            int r1 = r0.mo88490e()
            if (r1 <= 0) goto L_0x06ed
            long r3 = r0.mo88488c()
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 > 0) goto L_0x06e3
            goto L_0x06ed
        L_0x06e3:
            r8 = r60
            r0 = r61
            r32 = 1
            r34 = 0
            goto L_0x087e
        L_0x06ed:
            java.lang.String r1 = r12.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            if (r0 == 0) goto L_0x0702
            int r3 = r0.mo88492f()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0704
        L_0x0702:
            r3 = r25
        L_0x0704:
            r2.append(r3)
            r2.append(r13)
            if (r0 == 0) goto L_0x0714
            int r0 = r0.mo88490e()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
        L_0x0714:
            r0 = r25
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r23)
            tz.h r0 = (p707tz.C65002h) r0
            r0.mo89213hQ(r9)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.f161540h
            r2 = 2
            r0.<init>(r1, r2)
            r12.mo79360p(r0)
            xq1.e r0 = r12.f161543n
            return r0
        L_0x0737:
            r59 = r6
            r61 = r9
            r45 = r18
            r46 = r35
            r44 = r38
            r9 = r58
            r47 = 1065353216(0x3f800000, float:1.0)
            r35 = r13
            r38 = r32
            r13 = 32
            r8 = r7
            r2 = r25
            r1 = r57
            r0 = r61
            r32 = 1
            goto L_0x086b
        L_0x0756:
            r59 = r6
            r60 = r7
            r61 = r9
            r45 = r18
            r46 = r35
            r44 = r38
            r9 = r58
            r0 = 1
            r47 = 1065353216(0x3f800000, float:1.0)
            r35 = r13
            r38 = r32
            r13 = 32
            if (r1 != r0) goto L_0x0877
            if (r5 == 0) goto L_0x0877
            if (r8 == 0) goto L_0x0877
            r0 = r61
            if (r0 == 0) goto L_0x0872
            java.lang.String r1 = r12.f161541i
            java.lang.String r2 = "process, force use normal video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r8 = r60
            te3.zy r1 = r8.f185235B
            te3.jr2 r2 = r8.f185281u
            r12.mo79354j(r1, r2)
            java.lang.String r1 = r0.f183504d
            r8.f185266d = r1
            te3.zy r1 = r8.f185235B
            if (r1 == 0) goto L_0x0793
            java.lang.String r2 = r1.f186903h
            if (r2 != 0) goto L_0x0795
        L_0x0793:
            r2 = r17
        L_0x0795:
            if (r1 == 0) goto L_0x079a
            boolean r1 = r1.f186902g
            goto L_0x079b
        L_0x079a:
            r1 = 0
        L_0x079b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r32 = 1
            r3 = r3 ^ 1
            int r1 = r12.mo79353i(r1, r3)
            java.lang.String r3 = r12.f161541i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "process, time: ["
            r4.append(r5)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x07be
            int r5 = r5.f183832f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x07c0
        L_0x07be:
            r5 = r25
        L_0x07c0:
            r4.append(r5)
            r4.append(r11)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x07d1
            int r5 = r5.f183833g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x07d3
        L_0x07d1:
            r5 = r25
        L_0x07d3:
            r4.append(r5)
            java.lang.String r5 = "], size: ["
            r4.append(r5)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x07e6
            int r5 = r5.f183834h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x07e8
        L_0x07e6:
            r5 = r25
        L_0x07e8:
            r4.append(r5)
            r4.append(r11)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x07f9
            int r5 = r5.f183835i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x07fb
        L_0x07f9:
            r5 = r25
        L_0x07fb:
            r4.append(r5)
            java.lang.String r5 = "], crop: ["
            r4.append(r5)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x0812
            te3.zr4 r5 = r5.f183830d
            if (r5 == 0) goto L_0x0812
            int r5 = r5.f186847d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0814
        L_0x0812:
            r5 = r25
        L_0x0814:
            r4.append(r5)
            r4.append(r11)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x0829
            te3.zr4 r5 = r5.f183830d
            if (r5 == 0) goto L_0x0829
            int r5 = r5.f186848e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x082b
        L_0x0829:
            r5 = r25
        L_0x082b:
            r4.append(r5)
            r4.append(r11)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x0840
            te3.zr4 r5 = r5.f183830d
            if (r5 == 0) goto L_0x0840
            int r5 = r5.f186849f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0842
        L_0x0840:
            r5 = r25
        L_0x0842:
            r4.append(r5)
            r4.append(r11)
            te3.jr2 r5 = r8.f185281u
            if (r5 == 0) goto L_0x0857
            te3.zr4 r5 = r5.f183830d
            if (r5 == 0) goto L_0x0857
            int r5 = r5.f186850g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0859
        L_0x0857:
            r5 = r25
        L_0x0859:
            r4.append(r5)
            java.lang.String r5 = "], mixType: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x086b:
            r57 = r1
            r40 = r2
            r34 = 1
            goto L_0x0882
        L_0x0872:
            r8 = r60
        L_0x0874:
            r32 = 1
            goto L_0x087c
        L_0x0877:
            r8 = r60
            r0 = r61
            goto L_0x0874
        L_0x087c:
            r2 = r43
        L_0x087e:
            r43 = r2
            r40 = r25
        L_0x0882:
            if (r34 == 0) goto L_0x0b7a
            r7 = r38
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r1 = r7.origin
            if (r1 != 0) goto L_0x088b
            goto L_0x0894
        L_0x088b:
            java.lang.String r2 = r8.f185266d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (int) r2
            r1.fileSize = r3
        L_0x0894:
            di3.d r1 = di3.C86312j.m106911c(r22)
            rw.m r1 = (p232rw.C63679m) r1
            java.lang.String r2 = r8.f185266d
            if (r2 != 0) goto L_0x08a0
            r2 = r17
        L_0x08a0:
            rw.m$a r1 = r1.mo88483M1(r2)
            if (r1 == 0) goto L_0x08f8
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08ab
            goto L_0x08b2
        L_0x08ab:
            long r3 = r1.mo88488c()
            int r4 = (int) r3
            r2.videoDuration = r4
        L_0x08b2:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08b7
            goto L_0x08bd
        L_0x08b7:
            int r3 = r1.mo88492f()
            r2.width = r3
        L_0x08bd:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08c2
            goto L_0x08c8
        L_0x08c2:
            int r3 = r1.mo88490e()
            r2.height = r3
        L_0x08c8:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08cd
            goto L_0x08d3
        L_0x08cd:
            int r3 = r1.mo88487b()
            r2.videoBitrate = r3
        L_0x08d3:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08d8
            goto L_0x08de
        L_0x08d8:
            int r3 = r1.mo88486a()
            r2.audioBitrate = r3
        L_0x08de:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r2 = r7.origin
            if (r2 != 0) goto L_0x08e3
            goto L_0x08ea
        L_0x08e3:
            float r3 = r1.mo88489d()
            int r3 = (int) r3
            r2.fps = r3
        L_0x08ea:
            int r2 = r1.mo88492f()
            int r3 = r1.mo88490e()
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r14 = r2
            r34 = r3
            goto L_0x08fb
        L_0x08f8:
            r14 = 0
            r34 = 0
        L_0x08fb:
            if (r1 != 0) goto L_0x090b
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.f161540h
            r6 = 2
            r0.<init>(r1, r6)
            r12.mo79360p(r0)
            xq1.e r0 = r12.f161543n
            return r0
        L_0x090b:
            r6 = 2
            gy3.c0 r5 = new gy3.c0
            r5.<init>()
            di3.d r1 = di3.C86312j.m106911c(r21)
            com.tencent.mm.feature.sight.api.ISightJNIService r1 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r1
            java.lang.String r2 = r8.f185266d
            int r1 = r1.getMp4RotateVFS(r2)
            te3.jr2 r2 = r8.f185281u
            if (r2 == 0) goto L_0x0924
            int r3 = r2.f183834h
            goto L_0x0925
        L_0x0924:
            r3 = 0
        L_0x0925:
            if (r2 == 0) goto L_0x092a
            int r4 = r2.f183835i
            goto L_0x092b
        L_0x092a:
            r4 = 0
        L_0x092b:
            r6 = 90
            if (r1 == r6) goto L_0x0935
            r6 = 270(0x10e, float:3.78E-43)
            if (r1 == r6) goto L_0x0935
        L_0x0933:
            r6 = r3
            goto L_0x0942
        L_0x0935:
            if (r2 == 0) goto L_0x093a
            int r3 = r2.f183835i
            goto L_0x093b
        L_0x093a:
            r3 = 0
        L_0x093b:
            if (r2 == 0) goto L_0x0940
            int r4 = r2.f183834h
            goto L_0x0933
        L_0x0940:
            r6 = r3
            r4 = 0
        L_0x0942:
            if (r0 != 0) goto L_0x0949
            if (r2 == 0) goto L_0x0949
            r12.mo79358n(r1, r2)
        L_0x0949:
            r0 = r59
            int r3 = r0.f267169g
            dp1.l1$a r2 = dp1.C58384l1.C58385a.f167283a
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r58 = 0
            r60 = 1
            r49 = 1253(0x4e5, double:6.19E-321)
            r51 = 0
            r53 = 1
            r48 = r16
            r48.mo175913w(r49, r51, r53)
            if (r10 == 0) goto L_0x096d
            r49 = 1523(0x5f3, double:7.525E-321)
            r48 = r16
            r51 = r58
            r53 = r60
            r48.mo175913w(r49, r51, r53)
        L_0x096d:
            java.lang.String r13 = r12.f161541i
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r18 = r3
            java.lang.String r3 = "video rotate:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", width:"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r3 = ", height:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r1 = " url "
            r2.append(r1)
            java.lang.String r1 = r8.f185266d
            r2.append(r1)
            java.lang.String r1 = " thumbUrl: "
            r2.append(r1)
            java.lang.String r1 = r8.f185267e
            r2.append(r1)
            java.lang.String r1 = " size:"
            r2.append(r1)
            java.lang.String r1 = r8.f185266d
            long r48 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r48)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$a r1 = f161539p
            java.lang.String r2 = r8.f185266d
            if (r2 != 0) goto L_0x09c6
            r2 = r17
        L_0x09c6:
            te3.jr2 r13 = r8.f185281u
            r17 = r3
            if (r13 == 0) goto L_0x09cf
            int r3 = r13.f183833g
            goto L_0x09d0
        L_0x09cf:
            r3 = 0
        L_0x09d0:
            float r3 = (float) r3
            float r35 = r3 / r33
            if (r13 == 0) goto L_0x09d8
            int r3 = r13.f183832f
            goto L_0x09d9
        L_0x09d8:
            r3 = 0
        L_0x09d9:
            float r3 = (float) r3
            float r13 = r3 / r33
            r3 = r16
            r62 = r3
            r33 = r14
            r14 = r17
            r16 = r18
            r3 = r6
            r17 = r4
            r48 = r15
            r15 = r5
            r5 = r35
            r18 = r6
            r30 = 2
            r6 = r13
            r49 = r7
            r7 = r0
            r13 = r8
            r8 = r10
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$a$a r35 = r1.mo41038b(r2, r3, r4, r5, r6, r7, r8)
            int r1 = r35.mo41041c()
            if (r1 != 0) goto L_0x0a45
            int r1 = r35.mo41043e()
            if (r1 <= 0) goto L_0x0a45
            int r1 = r35.mo41042d()
            if (r1 <= 0) goto L_0x0a45
            int r1 = r35.mo41040b()
            if (r1 <= 0) goto L_0x0a45
            int r6 = r35.mo41043e()
            int r4 = r35.mo41042d()
            int r1 = r35.mo41040b()
            java.lang.String r2 = r12.f161541i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "video abaResult, width:"
            r3.append(r5)
            r3.append(r6)
            r3.append(r14)
            r3.append(r4)
            r3.append(r11)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r11 = r1
            goto L_0x0a4b
        L_0x0a45:
            r11 = r16
            r4 = r17
            r6 = r18
        L_0x0a4b:
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r35.mo41039a()
            if (r1 == 0) goto L_0x0a5a
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r35.mo41039a()
            int r1 = r1.qualityLevel
            float r1 = (float) r1
            r43 = r1
        L_0x0a5a:
            di3.d r1 = di3.C86312j.m106911c(r24)
            tz.f r1 = (p707tz.C65000f) r1
            int r7 = r1.mo89190f3(r6)
            di3.d r1 = di3.C86312j.m106911c(r24)
            tz.f r1 = (p707tz.C65000f) r1
            int r8 = r1.mo89190f3(r4)
            di3.d r1 = di3.C86312j.m106911c(r23)
            tz.h r1 = (p707tz.C65002h) r1
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r50 = r1.s30(r9)
            r17 = r50
            r16 = 0
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$i r1 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$i
            r18 = r1
            r14 = r39
            r6 = r45
            r1.<init>(r15, r12, r6, r14)
            r15 = r0
            r0 = r66
            r1 = r41
            r3 = r6
            r4 = r48
            r5 = r33
            r6 = r34
            r33 = r9
            r9 = r11
            r11 = r10
            r10 = r15
            r39 = r11
            r51 = r36
            r11 = r13
            r52 = 1
            r12 = r49
            r38 = r14
            r63 = r33
            r14 = r13
            r13 = r40
            r60 = r14
            r14 = r57
            r64 = r15
            r65 = r48
            r15 = r39
            int r0 = r0.mo79357m(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r41)
            if (r0 >= 0) goto L_0x0ad6
            di3.d r0 = di3.C86312j.m106911c(r23)
            tz.h r0 = (p707tz.C65002h) r0
            r9 = r63
            r0.mo89213hQ(r9)
            ar1.i r0 = new ar1.i
            r10 = r66
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f161540h
            r11 = 2
            r0.<init>(r1, r11)
            r10.mo79360p(r0)
            xq1.e r0 = r10.f161543n
            return r0
        L_0x0ad6:
            r11 = 2
            r10 = r66
            r9 = r63
            di3.d r0 = di3.C86312j.m106911c(r22)
            rw.m r0 = (p232rw.C63679m) r0
            r12 = r65
            rw.m$a r0 = r0.mo88483M1(r12)
            if (r0 == 0) goto L_0x0b23
            int r1 = r0.mo88492f()
            if (r1 <= 0) goto L_0x0b23
            int r1 = r0.mo88490e()
            if (r1 <= 0) goto L_0x0b23
            long r1 = r0.mo88488c()
            int r3 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r3 > 0) goto L_0x0afe
            goto L_0x0b23
        L_0x0afe:
            com.tencent.mm.plugin.sight.base.ABAPrams r0 = r35.mo41039a()
            if (r0 == 0) goto L_0x0b17
            di3.d r0 = di3.C86312j.m106911c(r21)     // Catch:{ all -> 0x0b17 }
            com.tencent.mm.feature.sight.api.ISightJNIService r0 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r0     // Catch:{ all -> 0x0b17 }
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r35.mo41039a()     // Catch:{ all -> 0x0b17 }
            r13 = r64
            int r2 = r13.f267180u     // Catch:{ all -> 0x0b19 }
            r15 = 0
            r0.addReportMetadata(r12, r1, r2, r15)     // Catch:{ all -> 0x0b1a }
            goto L_0x0b1a
        L_0x0b17:
            r13 = r64
        L_0x0b19:
            r15 = 0
        L_0x0b1a:
            r17 = r39
            r8 = r43
            r0 = r50
            r14 = 1
            goto L_0x0c58
        L_0x0b23:
            java.lang.String r1 = r10.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "normal video remuxVideo file error: "
            r2.append(r3)
            if (r0 == 0) goto L_0x0b3a
            int r3 = r0.mo88492f()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0b3c
        L_0x0b3a:
            r3 = r25
        L_0x0b3c:
            r2.append(r3)
            r8 = 32
            r2.append(r8)
            if (r0 == 0) goto L_0x0b4e
            int r0 = r0.mo88490e()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
        L_0x0b4e:
            r0 = r25
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r7 = r39
            r0 = r62
            r0.mo83218a(r7)
            r0.mo83219b(r7)
            di3.d r0 = di3.C86312j.m106911c(r23)
            tz.h r0 = (p707tz.C65002h) r0
            r0.mo89213hQ(r9)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f161540h
            r0.<init>(r1, r11)
            r10.mo79360p(r0)
            xq1.e r0 = r10.f161543n
            return r0
        L_0x0b7a:
            r60 = r8
            r7 = r10
            r10 = r12
            r12 = r15
            r51 = r36
            r49 = r38
            r38 = r39
            r13 = r59
            r8 = 32
            r11 = 2
            r15 = 0
            r52 = 1
            if (r7 != 0) goto L_0x0c30
            int r16 = r38.size()
            r0 = r66
            r1 = r41
            r3 = r45
            r4 = r12
            r5 = r13
            r6 = r60
            r17 = r7
            r7 = r49
            r15 = 32
            r8 = r16
            rx3.l r0 = r0.mo79355k(r1, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.mo12991a()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.mo12992b()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            if (r1 >= 0) goto L_0x0bcc
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f161540h
            r0.<init>(r1, r11)
            r10.mo79360p(r0)
            xq1.e r0 = r10.f161543n
            return r0
        L_0x0bcc:
            di3.d r1 = di3.C86312j.m106911c(r22)
            rw.m r1 = (p232rw.C63679m) r1
            rw.m$a r1 = r1.mo88483M1(r12)
            if (r1 == 0) goto L_0x0bf0
            int r2 = r1.mo88492f()
            if (r2 <= 0) goto L_0x0bf0
            int r2 = r1.mo88490e()
            if (r2 <= 0) goto L_0x0bf0
            long r2 = r1.mo88488c()
            int r4 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r4 > 0) goto L_0x0bed
            goto L_0x0bf0
        L_0x0bed:
            r8 = r0
            goto L_0x0c54
        L_0x0bf0:
            java.lang.String r0 = r10.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            if (r1 == 0) goto L_0x0c05
            int r3 = r1.mo88492f()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0c07
        L_0x0c05:
            r3 = r25
        L_0x0c07:
            r2.append(r3)
            r2.append(r15)
            if (r1 == 0) goto L_0x0c17
            int r1 = r1.mo88490e()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r1)
        L_0x0c17:
            r1 = r25
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f161540h
            r0.<init>(r1, r11)
            r10.mo79360p(r0)
            xq1.e r0 = r10.f161543n
            return r0
        L_0x0c30:
            r17 = r7
            r2 = r43
            goto L_0x0c53
        L_0x0c35:
            r43 = r2
            r60 = r7
            r17 = r10
            r10 = r12
            r12 = r15
            r45 = r18
            r49 = r32
            r46 = r35
            r51 = r36
            r44 = r38
            r38 = r39
            r9 = r58
            r11 = 2
            r47 = 1065353216(0x3f800000, float:1.0)
            r52 = 1
            r35 = r13
            r13 = r6
        L_0x0c53:
            r8 = r2
        L_0x0c54:
            r0 = r25
            r14 = r35
        L_0x0c58:
            java.lang.String r1 = r10.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hseasunhan, video quality level: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r1 = "input"
            gy3.C87412m.m108594g(r12, r1)
            up1.f r1 = up1.C37521f.f99374d
            boolean r1 = r1.mo61155I()
            if (r1 == 0) goto L_0x0c8d
            r31 = r12
            r32 = r56
            r33 = r55
            r34 = r46
            r35 = r51
            r36 = r44
            float r1 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119556a(r31, r32, r33, r34, r35, r36)
            r7 = r1
            goto L_0x0c8e
        L_0x0c8d:
            r7 = 0
        L_0x0c8e:
            java.lang.String r1 = r10.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "qipengfeng, audio quality level: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", bitrate:"
            r2.append(r3)
            r4 = r56
            r2.append(r4)
            java.lang.String r3 = ", samplerate:"
            r2.append(r3)
            r3 = r55
            r2.append(r3)
            java.lang.String r3 = ", channels:"
            r2.append(r3)
            r3 = r46
            r2.append(r3)
            java.lang.String r3 = ", enableAuQA:"
            r2.append(r3)
            r3 = r51
            r2.append(r3)
            java.lang.String r3 = ", useOriAu:"
            r2.append(r3)
            r4 = r44
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r0 == 0) goto L_0x0cf2
            r1 = 100
            float r1 = (float) r1
            float r2 = r1 * r8
            long r2 = (long) r2
            r0.mo126633t(r2)
            float r1 = r1 * r7
            long r1 = (long) r1
            r0.mo126632s(r1)
            di3.d r0 = di3.C86312j.m106911c(r23)
            tz.h r0 = (p707tz.C65002h) r0
            r0.mo89213hQ(r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0cf2:
            r5 = r45
            float r0 = (float) r5
            float r0 = r0 + r47
            int r1 = r38.size()
            float r1 = (float) r1
            float r0 = r0 / r1
            r10.mo79362r(r0)
            r2 = r60
            boolean r0 = r2.f185255T
            if (r0 == 0) goto L_0x0d3f
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r10.f161540h
            java.util.LinkedList r0 = r0.getHalfVideoMediaExtList()
            java.util.Iterator r0 = r0.iterator()
        L_0x0d10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0d28
            java.lang.Object r1 = r0.next()
            r3 = r1
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r4 = r2.f185275p
            java.lang.String r3 = r3.f185275p
            boolean r3 = gy3.C87412m.m108589b(r4, r3)
            if (r3 == 0) goto L_0x0d10
            goto L_0x0d2a
        L_0x0d28:
            r1 = r25
        L_0x0d2a:
            r4 = r1
            te3.rq2 r4 = (te3.C64689rq2) r4
            if (r4 == 0) goto L_0x0d8c
            r9 = 0
            r0 = r66
            r1 = r13
            r3 = r12
            r6 = r49
            r0.mo79361q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r66.mo79359o()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0d8c
        L_0x0d3f:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r10.f161540h
            java.util.LinkedList r15 = r0.getMediaList()
            java.util.Iterator r0 = r15.iterator()
        L_0x0d49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0d61
            java.lang.Object r1 = r0.next()
            r3 = r1
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r4 = r2.f185275p
            java.lang.String r3 = r3.f185275p
            boolean r3 = gy3.C87412m.m108589b(r4, r3)
            if (r3 == 0) goto L_0x0d49
            goto L_0x0d63
        L_0x0d61:
            r1 = r25
        L_0x0d63:
            r4 = r1
            te3.rq2 r4 = (te3.C64689rq2) r4
            if (r4 == 0) goto L_0x0d8c
            r9 = 0
            r0 = r66
            r1 = r13
            r3 = r12
            r6 = r49
            r0.mo79361q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r10.f161540h
            r0.setMediaList(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r10.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 == 0) goto L_0x0d87
            long r1 = eb0.C31543z5.m39453c()
            r0.remuxEndTime = r1
            r0.remuxType = r14
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0d87:
            r66.mo79359o()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0d8c:
            r15 = r10
            r10 = r17
            r8 = r27
            r13 = r38
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = 1
            r14 = 2
            goto L_0x0145
        L_0x0d9a:
            r10 = r15
            sx3.C64197v.m75542k()
            throw r25
        L_0x0d9f:
            r10 = r15
            di3.d r0 = di3.C86312j.m106911c(r20)
            tz.e r0 = (p707tz.C64999e) r0
            r0.reset()
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r0 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f161540h
            r0.<init>(r1)
            r10.mo79360p(r0)
            xq1.e r0 = r10.f161543n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo75105g():xq1.e");
    }

    /* renamed from: h */
    public final boolean mo79352h(String str, VideoTransPara videoTransPara) {
        C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str);
        if (M1 == null) {
            return false;
        }
        int i = M1.f180530f;
        double d = (1.0d * ((double) ((i == 90 || i == 270) ? M1.f180526b : M1.f180525a))) / ((double) ((i == 90 || i == 270) ? M1.f180525a : M1.f180526b));
        String str2 = this.f161541i;
        Log.m105924i(str2, "origin videoInfo:" + M1 + ", videoParams:" + videoTransPara + ", videoRatio:" + d);
        String str3 = this.f161541i;
        StringBuilder sb = new StringBuilder();
        sb.append("videoRatio in range:");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C109647f<Double> fVar2 = C37521f.f99341Z;
        sb.append(((C34688d) fVar2).mo59684a(Double.valueOf(d)));
        sb.append(", finderVideoRatioRange:");
        fVar.getClass();
        sb.append(fVar2);
        Log.m105924i(str3, sb.toString());
        return !M1.f180531g && M1.f180529e <= videoTransPara.f267169g && M1.f180527c <= ((float) videoTransPara.f267168f);
    }

    /* renamed from: i */
    public final int mo79353i(boolean z, boolean z2) {
        Class cls = C65000f.class;
        return z ? z2 ? ((C65000f) C86312j.m106911c(cls)).mo89176SM() : ((C65000f) C86312j.m106911c(cls)).mo89178Tj() : z2 ? ((C65000f) C86312j.m106911c(cls)).Ye0() : ((C65000f) C86312j.m106911c(cls)).mo89186bx();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0173, code lost:
        r3 = r15.f183830d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79354j(te3.C64899zy r14, te3.C64477jr2 r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x021c
            java.util.LinkedList<te3.hi4> r0 = r14.f186899d
            if (r0 == 0) goto L_0x021c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            te3.hi4 r0 = (te3.hi4) r0
            if (r0 != 0) goto L_0x0011
            goto L_0x021c
        L_0x0011:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r2 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.feature.sight.api.ISightJNIService r2 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r2
            java.lang.String r3 = r0.f183504d
            int r2 = r2.getMp4RotateVFS(r3)
            if (r15 != 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            long r3 = r14.f186900e
            long r5 = r0.f183508h
            long r3 = r3 + r5
            int r4 = (int) r3
            r15.f183832f = r4
        L_0x002a:
            if (r15 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            long r3 = r14.f186901f
            long r5 = r0.f183508h
            long r3 = r3 + r5
            int r4 = (int) r3
            r15.f183833g = r4
        L_0x0035:
            int r3 = r0.f183511n
            float r3 = (float) r3
            float r4 = r0.f183513p
            float r3 = r3 * r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            te3.m10 r5 = r0.f183515r
            te3.ep3 r5 = r5.f184198g
            java.util.LinkedList<java.lang.Integer> r5 = r5.f183015d
            r6 = 2
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184198g
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r8 = "track.cropInfo.contentRect.values[0]"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r5 = r5 - r7
            float r5 = (float) r5
            float r3 = r3 / r5
            te3.zr4 r5 = new te3.zr4
            r5.<init>()
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184196e
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r7 = r7.get(r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            te3.m10 r9 = r0.f183515r
            te3.ep3 r9 = r9.f184198g
            java.util.LinkedList<java.lang.Integer> r9 = r9.f183015d
            java.lang.Object r9 = r9.get(r1)
            gy3.C87412m.m108593f(r9, r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 - r9
            float r7 = (float) r7
            float r7 = r7 * r3
            int r7 = (int) r7
            r5.f186847d = r7
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184196e
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            r9 = 1
            java.lang.Object r7 = r7.get(r9)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            te3.m10 r10 = r0.f183515r
            te3.ep3 r10 = r10.f184198g
            java.util.LinkedList<java.lang.Integer> r10 = r10.f183015d
            java.lang.Object r10 = r10.get(r9)
            java.lang.String r11 = "track.cropInfo.contentRect.values[1]"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r7 = r7 - r10
            float r7 = (float) r7
            float r7 = r7 * r3
            int r7 = (int) r7
            r5.f186850g = r7
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184196e
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r7 = r7.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            te3.m10 r10 = r0.f183515r
            te3.ep3 r10 = r10.f184198g
            java.util.LinkedList<java.lang.Integer> r10 = r10.f183015d
            java.lang.Object r10 = r10.get(r1)
            gy3.C87412m.m108593f(r10, r8)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r7 = r7 - r10
            float r7 = (float) r7
            float r7 = r7 * r3
            int r7 = (int) r7
            r5.f186849f = r7
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184196e
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            r10 = 3
            java.lang.Object r7 = r7.get(r10)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            te3.m10 r12 = r0.f183515r
            te3.ep3 r12 = r12.f184198g
            java.util.LinkedList<java.lang.Integer> r12 = r12.f183015d
            java.lang.Object r12 = r12.get(r9)
            gy3.C87412m.m108593f(r12, r11)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r7 = r7 - r12
            float r7 = (float) r7
            float r7 = r7 * r3
            int r7 = (int) r7
            r5.f186848e = r7
            if (r15 != 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r15.f183830d = r5
        L_0x0121:
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184198g
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r6 = r7.get(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184198g
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r7 = r7.get(r1)
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r6 = r6 - r7
            float r6 = (float) r6
            float r6 = r6 * r3
            int r6 = (int) r6
            te3.m10 r7 = r0.f183515r
            te3.ep3 r7 = r7.f184198g
            java.util.LinkedList<java.lang.Integer> r7 = r7.f183015d
            java.lang.Object r7 = r7.get(r10)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            te3.m10 r0 = r0.f183515r
            te3.ep3 r0 = r0.f184198g
            java.util.LinkedList<java.lang.Integer> r0 = r0.f183015d
            java.lang.Object r0 = r0.get(r9)
            gy3.C87412m.m108593f(r0, r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r7 = r7 - r0
            float r0 = (float) r7
            float r0 = r0 * r3
            int r0 = (int) r0
            if (r15 == 0) goto L_0x017a
            te3.zr4 r3 = r15.f183830d
            if (r3 == 0) goto L_0x017a
            int r3 = r3.f186849f
            goto L_0x017b
        L_0x017a:
            r3 = 0
        L_0x017b:
            if (r15 == 0) goto L_0x0184
            te3.zr4 r7 = r15.f183830d
            if (r7 == 0) goto L_0x0184
            int r7 = r7.f186847d
            goto L_0x0185
        L_0x0184:
            r7 = 0
        L_0x0185:
            int r3 = r3 - r7
            float r3 = (float) r3
            float r3 = r3 * r4
            te3.az r14 = r14.f186904i
            if (r14 == 0) goto L_0x018f
            int r9 = r14.f297901i
        L_0x018f:
            float r7 = (float) r9
            float r3 = r3 / r7
            int r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r4 = r3
        L_0x0197:
            if (r15 != 0) goto L_0x019a
            goto L_0x01a6
        L_0x019a:
            if (r14 == 0) goto L_0x019f
            int r3 = r14.f297901i
            goto L_0x01a0
        L_0x019f:
            r3 = 0
        L_0x01a0:
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
            r15.f183834h = r3
        L_0x01a6:
            if (r15 != 0) goto L_0x01a9
            goto L_0x01b3
        L_0x01a9:
            if (r14 == 0) goto L_0x01ad
            int r1 = r14.f297902j
        L_0x01ad:
            float r14 = (float) r1
            float r14 = r14 * r4
            int r14 = (int) r14
            r15.f183835i = r14
        L_0x01b3:
            r14 = 90
            if (r2 == r14) goto L_0x0202
            r14 = 180(0xb4, float:2.52E-43)
            if (r2 == r14) goto L_0x01e1
            r14 = 270(0x10e, float:3.78E-43)
            if (r2 == r14) goto L_0x01c0
            goto L_0x021c
        L_0x01c0:
            te3.zr4 r14 = new te3.zr4
            r14.<init>()
            int r1 = r5.f186848e
            int r1 = r0 - r1
            r14.f186847d = r1
            int r1 = r5.f186847d
            int r1 = r6 - r1
            r14.f186848e = r1
            int r1 = r5.f186850g
            int r0 = r0 - r1
            r14.f186849f = r0
            int r0 = r5.f186849f
            int r6 = r6 - r0
            r14.f186850g = r6
            if (r15 != 0) goto L_0x01de
            goto L_0x021c
        L_0x01de:
            r15.f183830d = r14
            goto L_0x021c
        L_0x01e1:
            te3.zr4 r14 = new te3.zr4
            r14.<init>()
            int r1 = r5.f186849f
            int r1 = r6 - r1
            r14.f186847d = r1
            int r1 = r5.f186850g
            int r1 = r0 - r1
            r14.f186848e = r1
            int r1 = r5.f186847d
            int r6 = r6 - r1
            r14.f186849f = r6
            int r1 = r5.f186848e
            int r0 = r0 - r1
            r14.f186850g = r0
            if (r15 != 0) goto L_0x01ff
            goto L_0x021c
        L_0x01ff:
            r15.f183830d = r14
            goto L_0x021c
        L_0x0202:
            te3.zr4 r14 = new te3.zr4
            r14.<init>()
            int r0 = r5.f186850g
            r14.f186847d = r0
            int r0 = r5.f186849f
            r14.f186848e = r0
            int r0 = r5.f186848e
            r14.f186849f = r0
            int r0 = r5.f186847d
            r14.f186850g = r0
            if (r15 != 0) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            r15.f183830d = r14
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo79354j(te3.zy, te3.jr2):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:21|22|23|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0120 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, java.lang.Float> mo79355k(long r22, int r24, java.lang.String r25, com.tencent.p014mm.modelcontrol.VideoTransPara r26, te3.C64689rq2 r27, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r28, int r29) {
        /*
            r21 = this;
            r14 = r21
            r0 = r24
            r8 = r25
            r10 = r26
            r1 = r27
            java.lang.Class<tz.f> r2 = p707tz.C65000f.class
            java.lang.String r3 = r14.f161541i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "remuxComposition outputPath:"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            te3.zy r3 = r1.f185235B
            if (r3 != 0) goto L_0x002b
            te3.zy r3 = new te3.zy
            r3.<init>()
        L_0x002b:
            r15 = r3
            gy3.d0 r13 = new gy3.d0
            r13.<init>()
            r3 = -1
            r13.f27483d = r3
            te3.az r3 = r15.f186904i
            if (r3 != 0) goto L_0x003d
            te3.az r3 = new te3.az
            r3.<init>()
        L_0x003d:
            r9 = r3
            r9.f297896d = r8
            di3.d r3 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(IFinderVlogFinderService::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            tz.f r3 = (p707tz.C65000f) r3
            r4 = 0
            r5 = 0
            boolean r3 = r3.vm0(r4, r5)
            r9.f297913x = r3
            java.lang.Object r16 = new java.lang.Object
            r16.<init>()
            gy3.a0 r12 = new gy3.a0
            r12.<init>()
            di3.d r2 = di3.C86312j.m106911c(r2)
            tz.f r2 = (p707tz.C65000f) r2
            com.tencent.mm.plugin.vlog.model.v r11 = r2.mo89198mn()
            java.lang.Class<tz.h> r2 = p707tz.C65002h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tz.h r2 = (p707tz.C65002h) r2
            int r2 = r2.j50()
            r11.mo81175c(r2)
            te3.jr2 r1 = r1.f185281u
            if (r1 == 0) goto L_0x007d
            int r4 = r1.f183837n
        L_0x007d:
            r11.mo81178f(r4)
            r1 = 1
            r11.mo81176d(r1)
            up1.f r2 = up1.C37521f.f99374d
            boolean r3 = r2.mo61153G()
            if (r3 == 0) goto L_0x00bf
            long r2 = r2.mo61164R()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bc
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = up1.C37521f.f99383e
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 / r4
            float r3 = up1.C37521f.f99392f
            float r2 = r2 * r3
            int r2 = (int) r2
            r10.f267156C = r2
            java.lang.String r2 = r14.f161541i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ABA finder video maxVideoSize:"
            r3.append(r4)
            int r4 = r10.f267156C
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
        L_0x00bc:
            r11.mo81173a(r1, r10)
        L_0x00bf:
            gy3.c0 r1 = new gy3.c0
            r1.<init>()
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$c r2 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$c
            r3 = r29
            r2.<init>(r1, r14, r0, r3)
            r11.mo81174b(r2)
            r14.f161542j = r11
            r17 = 0
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$d r18 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$d
            r1 = r18
            r2 = r21
            r3 = r13
            r4 = r24
            r5 = r28
            r6 = r22
            r8 = r25
            r10 = r26
            r19 = r11
            r11 = r15
            r22 = r12
            r12 = r16
            r20 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            r8 = 2
            r9 = 0
            r4 = r19
            r5 = r15
            r6 = r17
            r7 = r18
            float r1 = com.tencent.p014mm.plugin.vlog.model.C57463v.C57464a.m66220b(r4, r5, r6, r7, r8, r9)
            monitor-enter(r16)
            r2 = r22
            boolean r2 = r2.f27482d     // Catch:{ all -> 0x016e }
            if (r2 != 0) goto L_0x014b
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r3.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = "wait "
            r3.append(r4)     // Catch:{ all -> 0x016e }
            r3.append(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x016e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x016e }
            r16.wait()     // Catch:{ InterruptedException -> 0x0120 }
            goto L_0x0128
        L_0x0120:
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x016e }
            java.lang.String r3 = "wait interrupted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x016e }
        L_0x0128:
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r3.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = "notify "
            r3.append(r4)     // Catch:{ all -> 0x016e }
            r3.append(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = ", "
            r3.append(r0)     // Catch:{ all -> 0x016e }
            r0 = r20
            int r4 = r0.f27483d     // Catch:{ all -> 0x016e }
            r3.append(r4)     // Catch:{ all -> 0x016e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x016e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x016e }
            goto L_0x014d
        L_0x014b:
            r0 = r20
        L_0x014d:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x016e }
            monitor-exit(r16)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = r2.field_reportObject
            if (r2 != 0) goto L_0x0157
            goto L_0x015b
        L_0x0157:
            int r3 = r0.f27483d
            r2.mpError = r3
        L_0x015b:
            r21.mo79359o()
            rx3.l r2 = new rx3.l
            int r0 = r0.f27483d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.<init>(r0, r1)
            return r2
        L_0x016e:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo79355k(long, int, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, int):rx3.l");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x026c  */
    /* renamed from: l */
    public final rx3.C13604l<java.lang.Integer, java.lang.Float> mo79356l(long r26, com.tencent.p014mm.modelcontrol.VideoTransPara r28, te3.C64689rq2 r29, java.lang.String r30, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r31, boolean r32, int r33, int r34) {
        /*
            r25 = this;
            r14 = r25
            r0 = r28
            r8 = r29
            r9 = r32
            java.lang.Class<tz.f> r10 = p707tz.C65000f.class
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1253(0x4e5, double:6.19E-321)
            r15 = 0
            r17 = 1
            r1 = r11
            r2 = r12
            r4 = r15
            r6 = r17
            r1.mo175913w(r2, r4, r6)
            r1 = 1523(0x5f3, double:7.525E-321)
            r3 = 1253(0x4e5, double:6.19E-321)
            r5 = 0
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
            r19 = r1
            goto L_0x0029
        L_0x0027:
            r19 = r5
        L_0x0029:
            int r7 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0033
            r2 = r1
            goto L_0x0034
        L_0x0033:
            r2 = r5
        L_0x0034:
            r1 = r11
            r4 = r15
            r6 = r17
            r1.mo175913w(r2, r4, r6)
        L_0x003b:
            java.lang.Class<tz.e> r1 = p707tz.C64999e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.e r1 = (p707tz.C64999e) r1
            r1.mo89164pj(r9)
            java.lang.Object r15 = new java.lang.Object
            r15.<init>()
            gy3.a0 r13 = new gy3.a0
            r13.<init>()
            java.lang.String r1 = r8.f185266d
            r2 = 0
            if (r1 != 0) goto L_0x0065
            rx3.l r0 = new rx3.l
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
        L_0x0065:
            te3.jr2 r11 = r8.f185281u
            if (r11 != 0) goto L_0x0079
            rx3.l r0 = new rx3.l
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
        L_0x0079:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            gy3.d0 r7 = new gy3.d0
            r7.<init>()
            int r3 = r0.f267169g
            java.lang.Class<rw.m> r3 = p232rw.C63679m.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rw.m r3 = (p232rw.C63679m) r3
            r6 = 1
            rw.m$a r3 = r3.mo88484UU(r1, r6)
            di3.d r4 = di3.C86312j.m106911c(r10)
            java.lang.String r6 = "getService(IFinderVlogFinderService::class.java)"
            gy3.C87412m.m108593f(r4, r6)
            tz.f r4 = (p707tz.C65000f) r4
            r6 = 2
            r2 = 0
            r18 = r13
            r13 = 0
            com.tencent.mm.plugin.vlog.model.y r1 = p707tz.C65000f.C65001a.m76631a(r4, r1, r13, r6, r2)
            int r2 = r11.f183833g
            long r13 = (long) r2
            r1.mo81188b(r13)
            int r2 = r11.f183833g
            long r13 = (long) r2
            r1.mo81187a(r13)
            di3.d r2 = di3.C86312j.m106911c(r10)
            tz.f r2 = (p707tz.C65000f) r2
            java.util.List r4 = sx3.C26236u.m33719b(r1)
            com.tencent.mm.plugin.vlog.model.x r13 = r2.mo89196la(r4)
            if (r3 == 0) goto L_0x011d
            int r2 = r3.f180525a
            int r4 = r3.f180526b
            int r6 = r3.f180530f
            r14 = 90
            if (r6 == r14) goto L_0x00d5
            r14 = 270(0x10e, float:3.78E-43)
            if (r6 != r14) goto L_0x00da
        L_0x00d5:
            r24 = r4
            r4 = r2
            r2 = r24
        L_0x00da:
            com.tencent.mm.plugin.vlog.model.p r1 = r1.mo81192f()
            android.graphics.Rect r1 = r1.f316486d
            r14 = 0
            r1.set(r14, r14, r2, r4)
            r13.mo81184c(r2, r4)
            r5.set(r14, r14, r2, r4)
            r6 = r31
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r1 = r6.origin
            r19 = r15
            if (r1 != 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            long r14 = r3.f180528d
            int r15 = (int) r14
            r1.videoDuration = r15
        L_0x00f8:
            if (r1 != 0) goto L_0x00fb
            goto L_0x00ff
        L_0x00fb:
            int r14 = r3.f180525a
            r1.width = r14
        L_0x00ff:
            if (r1 != 0) goto L_0x0102
            goto L_0x0106
        L_0x0102:
            int r14 = r3.f180526b
            r1.height = r14
        L_0x0106:
            if (r1 != 0) goto L_0x0109
            goto L_0x010d
        L_0x0109:
            int r14 = r3.f180529e
            r1.videoBitrate = r14
        L_0x010d:
            if (r1 != 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            int r14 = r3.f180532h
            r1.audioBitrate = r14
        L_0x0114:
            if (r1 != 0) goto L_0x0117
            goto L_0x0123
        L_0x0117:
            float r14 = r3.f180527c
            int r14 = (int) r14
            r1.fps = r14
            goto L_0x0123
        L_0x011d:
            r6 = r31
            r19 = r15
            r2 = 0
            r4 = 0
        L_0x0123:
            te3.zr4 r1 = r11.f183830d
            if (r1 == 0) goto L_0x0197
            if (r9 == 0) goto L_0x0135
            int r14 = r1.f186847d
            int r15 = r1.f186850g
            int r6 = r1.f186849f
            int r1 = r1.f186848e
            r5.set(r14, r15, r6, r1)
            goto L_0x0197
        L_0x0135:
            te3.bp1 r6 = r11.f183831e
            if (r6 == 0) goto L_0x0197
            java.util.LinkedList<java.lang.Float> r6 = r6.f131245d
            if (r6 == 0) goto L_0x0197
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            float[] r6 = sx3.C110818d0.m150950v0(r6)
            r14.setValues(r6)
            float r6 = uq1.C65451n.m77120a(r14)
            double r14 = (double) r6
            r21 = 0
            int r6 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r6 > 0) goto L_0x0156
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0156:
            er1.w3 r6 = er1.C58784w3.f168295a
            int r8 = r1.f186848e
            r21 = r2
            int r2 = r1.f186850g
            int r8 = r8 - r2
            r22 = r3
            double r2 = (double) r8
            double r2 = r2 / r14
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            int r2 = r6.mo83981y1(r2)
            int r3 = r1.f186849f
            int r8 = r1.f186847d
            int r3 = r3 - r8
            r8 = r4
            double r3 = (double) r3
            double r3 = r3 / r14
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            int r3 = r6.mo83981y1(r3)
            int r4 = r1.f186847d
            r23 = r7
            double r6 = (double) r4
            double r6 = r6 / r14
            double r6 = java.lang.Math.floor(r6)
            int r4 = (int) r6
            int r1 = r1.f186850g
            double r6 = (double) r1
            double r6 = r6 / r14
            double r6 = java.lang.Math.floor(r6)
            int r1 = (int) r6
            int r3 = r3 + r4
            int r2 = r2 + r1
            r5.set(r4, r1, r3, r2)
            goto L_0x019e
        L_0x0197:
            r21 = r2
            r22 = r3
            r8 = r4
            r23 = r7
        L_0x019e:
            if (r9 == 0) goto L_0x01a3
            int r1 = r11.f183834h
            goto L_0x01ab
        L_0x01a3:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r2 = r11.f183834h
            int r1 = r1.mo83981y1(r2)
        L_0x01ab:
            r12.f27483d = r1
            if (r9 == 0) goto L_0x01b2
            int r1 = r11.f183835i
            goto L_0x01ba
        L_0x01b2:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r2 = r11.f183835i
            int r1 = r1.mo83981y1(r2)
        L_0x01ba:
            r7 = r23
            r7.f27483d = r1
            r13.mo81183b(r5)
            if (r22 == 0) goto L_0x01c8
            r1 = r22
            float r1 = r1.f180527c
            goto L_0x01c9
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d3
            int r2 = r0.f267168f
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
        L_0x01d3:
            if (r9 == 0) goto L_0x020c
            up1.f r1 = up1.C37521f.f99374d
            long r2 = r1.mo61147A()
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.getClass()
            int r4 = up1.C37521f.f99383e
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 / r4
            r1.getClass()
            float r1 = up1.C37521f.f99392f
            float r2 = r2 * r1
            int r1 = (int) r2
            r0.f267156C = r1
            r14 = r25
            java.lang.String r1 = r14.f161541i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ABA:  finder video maxVideoSize:"
            r2.append(r3)
            int r3 = r0.f267156C
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x020e
        L_0x020c:
            r14 = r25
        L_0x020e:
            di3.d r1 = di3.C86312j.m106911c(r10)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.vlog.model.w r15 = r1.mo89207wN(r13)
            android.util.Size r4 = new android.util.Size
            r1 = r8
            r2 = r21
            r4.<init>(r2, r1)
            r6 = 0
            r8 = 1
            r1 = r15
            r2 = r30
            r3 = r28
            r16 = r12
            r12 = 1
            r17 = r7
            r7 = r8
            r1.mo81181b(r2, r3, r4, r5, r6, r7)
            te3.zy r15 = r15.mo81180a()
            te3.az r1 = r15.f186904i
            r7 = r30
            r1.f297896d = r7
            di3.d r2 = di3.C86312j.m106911c(r10)
            tz.f r2 = (p707tz.C65000f) r2
            long r3 = r13.getDurationMs()
            boolean r2 = r2.vm0(r9, r3)
            r1.f297913x = r2
            di3.d r1 = di3.C86312j.m106911c(r10)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.vlog.model.v r13 = r1.mo89198mn()
            java.lang.Class<tz.h> r1 = p707tz.C65002h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.h r1 = (p707tz.C65002h) r1
            int r1 = r1.mo89212hE()
            r13.mo81175c(r1)
            r1 = r29
            te3.jr2 r1 = r1.f185281u
            if (r1 == 0) goto L_0x026c
            int r1 = r1.f183837n
            goto L_0x026d
        L_0x026c:
            r1 = 0
        L_0x026d:
            r13.mo81178f(r1)
            r13.mo81173a(r12, r0)
            gy3.c0 r1 = new gy3.c0
            r1.<init>()
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$e r2 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$e
            r3 = r33
            r4 = r34
            r2.<init>(r1, r14, r3, r4)
            r13.mo81174b(r2)
            r14.f161542j = r13
            java.lang.String r1 = r11.f183838o
            r15.f186911s = r1
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            r1 = -1
            r12.f27483d = r1
            r20 = 0
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$f r21 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$f
            r1 = r21
            r2 = r25
            r3 = r12
            r4 = r31
            r5 = r26
            r7 = r30
            r8 = r32
            r9 = r16
            r10 = r17
            r11 = r28
            r0 = r12
            r12 = r19
            r16 = r13
            r32 = r18
            r13 = r32
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            r1 = 2
            r2 = 0
            r26 = r16
            r27 = r15
            r28 = r20
            r29 = r21
            r30 = r1
            r31 = r2
            float r1 = com.tencent.p014mm.plugin.vlog.model.C57463v.C57464a.m66220b(r26, r27, r28, r29, r30, r31)
            monitor-enter(r19)
            r2 = r32
            boolean r2 = r2.f27482d     // Catch:{ all -> 0x031b }
            if (r2 != 0) goto L_0x02fa
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "wait longvideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x031b }
            r19.wait()     // Catch:{ InterruptedException -> 0x02da }
            goto L_0x02e2
        L_0x02da:
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "wait interrupted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x031b }
        L_0x02e2:
            java.lang.String r2 = r14.f161541i     // Catch:{ all -> 0x031b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x031b }
            r3.<init>()     // Catch:{ all -> 0x031b }
            java.lang.String r4 = "notify longvideo, "
            r3.append(r4)     // Catch:{ all -> 0x031b }
            int r4 = r0.f27483d     // Catch:{ all -> 0x031b }
            r3.append(r4)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x031b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x031b }
        L_0x02fa:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x031b }
            monitor-exit(r19)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = r2.field_reportObject
            if (r2 != 0) goto L_0x0304
            goto L_0x0308
        L_0x0304:
            int r3 = r0.f27483d
            r2.mpError = r3
        L_0x0308:
            r25.mo79359o()
            rx3.l r2 = new rx3.l
            int r0 = r0.f27483d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.<init>(r0, r1)
            return r2
        L_0x031b:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo79356l(long, com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, java.lang.String, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, boolean, int, int):rx3.l");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:27|28|29|30|31|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        r0 = r1.f161540h.field_reportObject;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (r0 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
        r0.mpError = r4.f27483d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        mo79359o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        return r4.f27483d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00e8 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo79357m(long r49, int r51, java.lang.String r52, int r53, int r54, int r55, int r56, int r57, com.tencent.p014mm.modelcontrol.VideoTransPara r58, te3.C64689rq2 r59, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r60, java.lang.String r61, int r62, boolean r63, boolean r64, com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r65, fy3.C32226l<? super java.lang.Float, rx3.C13598b0> r66) {
        /*
            r48 = this;
            r15 = r48
            r0 = r51
            r14 = r58
            r2 = r59
            gy3.d0 r13 = new gy3.d0
            r13.<init>()
            r1 = -1
            r13.f27483d = r1
            java.lang.Object r17 = new java.lang.Object
            r17.<init>()
            gy3.a0 r12 = new gy3.a0
            r12.<init>()
            r18 = 0
            java.lang.Class<tz.f> r1 = p707tz.C65000f.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0138 }
            r20 = r1
            tz.f r20 = (p707tz.C65000f) r20     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = r2.f185266d     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = ""
        L_0x002c:
            r22 = r1
            te3.jr2 r1 = r2.f185281u     // Catch:{ all -> 0x0138 }
            if (r1 == 0) goto L_0x0036
            te3.zr4 r1 = r1.f183830d     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x003b
        L_0x0036:
            te3.zr4 r1 = new te3.zr4     // Catch:{ all -> 0x0138 }
            r1.<init>()     // Catch:{ all -> 0x0138 }
        L_0x003b:
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ all -> 0x0138 }
            int r3 = r1.f186847d     // Catch:{ all -> 0x0138 }
            int r4 = r1.f186848e     // Catch:{ all -> 0x0138 }
            int r5 = r1.f186849f     // Catch:{ all -> 0x0138 }
            int r1 = r1.f186850g     // Catch:{ all -> 0x0138 }
            r11.<init>(r3, r4, r5, r1)     // Catch:{ all -> 0x0138 }
            int r10 = r14.f267173n     // Catch:{ all -> 0x0138 }
            int r9 = r14.f267174o     // Catch:{ all -> 0x0138 }
            int r8 = r14.f267175p     // Catch:{ all -> 0x0138 }
            int r7 = r14.f267168f     // Catch:{ all -> 0x0138 }
            te3.jr2 r1 = r2.f185281u     // Catch:{ all -> 0x0138 }
            if (r1 == 0) goto L_0x005a
            int r3 = r1.f183832f     // Catch:{ all -> 0x0138 }
            long r3 = (long) r3     // Catch:{ all -> 0x0138 }
            r33 = r3
            goto L_0x005c
        L_0x005a:
            r33 = r18
        L_0x005c:
            if (r1 == 0) goto L_0x0064
            int r1 = r1.f183833g     // Catch:{ all -> 0x0138 }
            long r3 = (long) r1     // Catch:{ all -> 0x0138 }
            r35 = r3
            goto L_0x0066
        L_0x0064:
            r35 = r18
        L_0x0066:
            int r6 = r14.f267172j     // Catch:{ all -> 0x0138 }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$g r4 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$g     // Catch:{ all -> 0x0138 }
            r1 = r66
            r4.<init>(r1)     // Catch:{ all -> 0x0138 }
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$h r44 = new com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$h     // Catch:{ all -> 0x0138 }
            r1 = r44
            r2 = r59
            r3 = r65
            r43 = r4
            r4 = r49
            r42 = r6
            r6 = r63
            r32 = r7
            r7 = r13
            r31 = r8
            r8 = r48
            r30 = r9
            r9 = r51
            r29 = r10
            r10 = r64
            r25 = r11
            r11 = r60
            r49 = r12
            r12 = r55
            r47 = r13
            r13 = r56
            r14 = r58
            r15 = r17
            r16 = r49
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0132 }
            r21 = r61
            r23 = r62
            r24 = r52
            r26 = r55
            r27 = r56
            r28 = r57
            r45 = r53
            r46 = r54
            r80.g r1 = r20.c20(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0132 }
            r1.mo88285b()
            monitor-enter(r17)
            r1 = r49
            boolean r1 = r1.f27482d     // Catch:{ all -> 0x012d }
            if (r1 != 0) goto L_0x0113
            r1 = r48
            java.lang.String r2 = r1.f161541i     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r3.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r4 = "wait "
            r3.append(r4)     // Catch:{ all -> 0x012b }
            r3.append(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x012b }
            r17.wait()     // Catch:{ InterruptedException -> 0x00e8 }
            goto L_0x00f0
        L_0x00e8:
            java.lang.String r2 = r1.f161541i     // Catch:{ all -> 0x012b }
            java.lang.String r3 = "wait interrupted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x012b }
        L_0x00f0:
            java.lang.String r2 = r1.f161541i     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r3.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r4 = "notify "
            r3.append(r4)     // Catch:{ all -> 0x012b }
            r3.append(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = ", "
            r3.append(r0)     // Catch:{ all -> 0x012b }
            r4 = r47
            int r0 = r4.f27483d     // Catch:{ all -> 0x012b }
            r3.append(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x012b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x012b }
            goto L_0x0117
        L_0x0113:
            r1 = r48
            r4 = r47
        L_0x0117:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x012b }
            monitor-exit(r17)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161540h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0121
            goto L_0x0125
        L_0x0121:
            int r2 = r4.f27483d
            r0.mpError = r2
        L_0x0125:
            r48.mo79359o()
            int r0 = r4.f27483d
            return r0
        L_0x012b:
            r0 = move-exception
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            r1 = r48
        L_0x0130:
            monitor-exit(r17)
            throw r0
        L_0x0132:
            r0 = move-exception
            r1 = r48
            r4 = r47
            goto L_0x013b
        L_0x0138:
            r0 = move-exception
            r4 = r13
            r1 = r15
        L_0x013b:
            java.lang.String r2 = r1.f161541i
            java.lang.String r3 = "create remuxer failed"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r6)
            if (r63 != 0) goto L_0x0149
            if (r64 == 0) goto L_0x014a
        L_0x0149:
            r5 = 1
        L_0x014a:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1253(0x4e5, double:6.19E-321)
            r6 = 2
            r8 = 1
            r49 = r0
            r50 = r2
            r52 = r6
            r54 = r8
            r49.mo175913w(r50, r52, r54)
            if (r5 == 0) goto L_0x0180
            r10 = 1523(0x5f3, double:7.525E-321)
            r12 = 1253(0x4e5, double:6.19E-321)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0169
            r14 = r10
            goto L_0x016b
        L_0x0169:
            r14 = r18
        L_0x016b:
            int r5 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x0180
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0175
            r18 = r10
        L_0x0175:
            r49 = r0
            r50 = r18
            r52 = r6
            r54 = r8
            r49.mo175913w(r50, r52, r54)
        L_0x0180:
            int r0 = r4.f27483d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo79357m(long, int, java.lang.String, int, int, int, int, int, com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, java.lang.String, int, boolean, boolean, com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct, fy3.l):int");
    }

    /* renamed from: n */
    public final void mo79358n(int i, C64477jr2 jr22) {
        zr4 zr4 = jr22.f183830d;
        if (zr4 != null) {
            int i2 = zr4.f186849f - zr4.f186847d;
            int i3 = zr4.f186848e - zr4.f186850g;
            if (i == 90) {
                zr4 zr42 = new zr4();
                zr42.f186847d = zr4.f186850g;
                zr42.f186848e = zr4.f186849f;
                zr42.f186849f = zr4.f186848e;
                zr42.f186850g = zr4.f186847d;
                jr22.f183830d = zr42;
            } else if (i == 180) {
                zr4 zr43 = new zr4();
                zr43.f186847d = i2 - zr4.f186849f;
                zr43.f186848e = i3 - zr4.f186850g;
                zr43.f186849f = i2 - zr4.f186847d;
                zr43.f186850g = i3 - zr4.f186848e;
                jr22.f183830d = zr43;
            } else if (i == 270) {
                zr4 zr44 = new zr4();
                zr44.f186847d = i3 - zr4.f186848e;
                zr44.f186848e = i2 - zr4.f186847d;
                zr44.f186849f = i3 - zr4.f186850g;
                zr44.f186850g = i2 - zr4.f186849f;
                jr22.f183830d = zr44;
            }
        }
    }

    /* renamed from: o */
    public final void mo79359o() {
        C15585f.f42211a.mo14345h(this.f161540h);
    }

    /* renamed from: p */
    public final void mo79360p(C66408e eVar) {
        this.f161544o.dead();
        this.f161543n = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79361q(com.tencent.p014mm.modelcontrol.VideoTransPara r20, te3.C64689rq2 r21, java.lang.String r22, te3.C64689rq2 r23, int r24, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r25, float r26, float r27, boolean r28) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r9 = r22
            r10 = r23
            r3 = r25
            r11 = r27
            r12 = r28
            java.lang.Class<tz.e> r13 = p707tz.C64999e.class
            java.lang.Class<rw.m> r14 = p232rw.C63679m.class
            java.lang.String r4 = "videoParams"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "localMedia"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "outputPath"
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r4 = "media"
            gy3.C87412m.m108594g(r10, r4)
            java.lang.String r4 = "reportObject"
            gy3.C87412m.m108594g(r3, r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.sight.base.a r4 = r4.mo83971v0(r9)
            if (r4 == 0) goto L_0x0046
            int r5 = r4.f273445c
            float r6 = (float) r5
            r2.f185270h = r6
            int r4 = r4.f273446d
            float r6 = (float) r4
            r2.f185271i = r6
            float r5 = (float) r5
            r10.f185270h = r5
            float r4 = (float) r4
            r10.f185271i = r4
        L_0x0046:
            r15 = 1
            r10.f185254S0 = r15
            r8 = 0
            r10.f185252R0 = r8
            di3.d r4 = di3.C86312j.m106911c(r14)
            rw.m r4 = (p232rw.C63679m) r4
            rw.m$a r4 = r4.mo88484UU(r9, r15)
            if (r4 == 0) goto L_0x005f
            boolean r4 = r4.f180531g
            if (r4 == 0) goto L_0x005f
            r4 = 2
            r10.f185254S0 = r4
        L_0x005f:
            java.lang.String r4 = r1.f161541i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "updateMedia videoInfo type:"
            r5.append(r6)
            int r6 = r10.f185254S0
            r5.append(r6)
            java.lang.String r6 = ", dynamic_range:"
            r5.append(r6)
            int r6 = r10.f185252R0
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            int r4 = r0.f267179t
            float r5 = r2.f185271i
            float r6 = r2.f185270h
            float r5 = r5 / r6
            float r6 = (float) r4
            float r5 = r5 * r6
            int r5 = (int) r5
            uq1.e r6 = uq1.C65433e.f188292a
            r7 = 0
            java.lang.String r15 = r6.mo89555f(r9, r4, r5, r7)
            up1.f r16 = up1.C37521f.f99374d
            boolean r17 = r16.mo61155I()
            if (r17 == 0) goto L_0x00ac
            r16.getClass()
            int r7 = up1.C37521f.f99419i
            r17 = r13
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            int r4 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119559e(r7, r8, r4, r5, r13)
            r13 = r4
            goto L_0x00af
        L_0x00ac:
            r17 = r13
            r13 = 0
        L_0x00af:
            r10.f185262W0 = r3
            r10.f185266d = r9
            r10.f185267e = r15
            if (r12 != 0) goto L_0x019e
            boolean r3 = r2.f185255T
            if (r3 != 0) goto L_0x019e
            te3.iq0 r3 = r10.f185248P
            if (r3 == 0) goto L_0x019e
            te3.zy r4 = r2.f185235B     // Catch:{ Exception -> 0x0175 }
            if (r4 == 0) goto L_0x019e
            te3.az r4 = r4.f186904i     // Catch:{ Exception -> 0x0175 }
            if (r4 == 0) goto L_0x019e
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0175 }
            r5.<init>()     // Catch:{ Exception -> 0x0175 }
            te3.n93 r5 = r4.f297915z     // Catch:{ Exception -> 0x0175 }
            if (r5 == 0) goto L_0x0112
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0175 }
            r5.<init>()     // Catch:{ Exception -> 0x0175 }
            java.lang.Class<tz.f> r7 = p707tz.C65000f.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0175 }
            tz.f r7 = (p707tz.C65000f) r7     // Catch:{ Exception -> 0x0175 }
            te3.n93 r4 = r4.f297915z     // Catch:{ Exception -> 0x0175 }
            te3.ep3 r4 = r4.f184446d     // Catch:{ Exception -> 0x0175 }
            r7.mo89209x8(r4, r5)     // Catch:{ Exception -> 0x0175 }
            float r4 = r10.f185270h     // Catch:{ Exception -> 0x0175 }
            int r5 = r5.width()     // Catch:{ Exception -> 0x0175 }
            float r5 = (float) r5     // Catch:{ Exception -> 0x0175 }
            float r4 = r4 / r5
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0175 }
            float r7 = r3.f183717d     // Catch:{ Exception -> 0x0175 }
            int r7 = (int) r7     // Catch:{ Exception -> 0x0175 }
            float r8 = r3.f183718e     // Catch:{ Exception -> 0x0175 }
            float r8 = r8 * r4
            int r8 = (int) r8     // Catch:{ Exception -> 0x0175 }
            float r12 = r3.f183719f     // Catch:{ Exception -> 0x0175 }
            float r12 = r12 * r4
            int r12 = (int) r12     // Catch:{ Exception -> 0x0175 }
            float r3 = r3.f183720g     // Catch:{ Exception -> 0x0175 }
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch:{ Exception -> 0x0175 }
            r5.<init>(r7, r8, r12, r3)     // Catch:{ Exception -> 0x0175 }
            int r3 = r5.bottom     // Catch:{ Exception -> 0x0175 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0175 }
            float r4 = r10.f185271i     // Catch:{ Exception -> 0x0175 }
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            int r3 = (int) r4     // Catch:{ Exception -> 0x0175 }
            r5.bottom = r3     // Catch:{ Exception -> 0x0175 }
        L_0x010f:
            r18 = r14
            goto L_0x013a
        L_0x0112:
            float r5 = r10.f185270h     // Catch:{ Exception -> 0x0175 }
            int r7 = r4.f297897e     // Catch:{ Exception -> 0x0175 }
            float r7 = (float) r7     // Catch:{ Exception -> 0x0175 }
            float r5 = r5 / r7
            float r7 = r10.f185271i     // Catch:{ Exception -> 0x0175 }
            int r4 = r4.f297898f     // Catch:{ Exception -> 0x0175 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0175 }
            float r7 = r7 / r4
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ Exception -> 0x0175 }
            float r8 = r3.f183717d     // Catch:{ Exception -> 0x0175 }
            float r8 = r8 * r5
            int r8 = (int) r8     // Catch:{ Exception -> 0x0175 }
            float r12 = r3.f183718e     // Catch:{ Exception -> 0x0175 }
            float r12 = r12 * r7
            int r12 = (int) r12
            r18 = r14
            float r14 = r3.f183719f     // Catch:{ Exception -> 0x0173 }
            float r14 = r14 * r5
            int r5 = (int) r14     // Catch:{ Exception -> 0x0173 }
            float r3 = r3.f183720g     // Catch:{ Exception -> 0x0173 }
            float r3 = r3 * r7
            int r3 = (int) r3     // Catch:{ Exception -> 0x0173 }
            r4.<init>(r8, r12, r5, r3)     // Catch:{ Exception -> 0x0173 }
            r5 = r4
        L_0x013a:
            int r0 = r0.f267179t     // Catch:{ Exception -> 0x0173 }
            int r3 = r5.height()     // Catch:{ Exception -> 0x0173 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0173 }
            int r4 = r5.width()     // Catch:{ Exception -> 0x0173 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0173 }
            float r3 = r3 / r4
            float r4 = (float) r0     // Catch:{ Exception -> 0x0173 }
            float r3 = r3 * r4
            int r7 = (int) r3     // Catch:{ Exception -> 0x0173 }
            er1.j5 r3 = er1.C58741j5.f168184a     // Catch:{ Exception -> 0x0173 }
            java.lang.String r8 = r3.mo83733g(r9)     // Catch:{ Exception -> 0x0173 }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ Exception -> 0x0173 }
            int r3 = r5.left     // Catch:{ Exception -> 0x0173 }
            int r4 = r5.bottom     // Catch:{ Exception -> 0x0173 }
            int r14 = r5.right     // Catch:{ Exception -> 0x0173 }
            int r5 = r5.top     // Catch:{ Exception -> 0x0173 }
            r12.<init>(r3, r4, r14, r5)     // Catch:{ Exception -> 0x0173 }
            r3 = r6
            r4 = r22
            r5 = r8
            r6 = r0
            r14 = 0
            r14 = 0
            r8 = r12
            java.lang.String r0 = r3.mo89556g(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0171 }
            r10.f185267e = r0     // Catch:{ Exception -> 0x0171 }
            r10.f185239F = r15     // Catch:{ Exception -> 0x0171 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0171 }
            goto L_0x01a1
        L_0x0171:
            r0 = move-exception
            goto L_0x0179
        L_0x0173:
            r0 = move-exception
            goto L_0x0178
        L_0x0175:
            r0 = move-exception
            r18 = r14
        L_0x0178:
            r14 = 0
        L_0x0179:
            java.lang.String r3 = r1.f161541i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "crop halfThumb from "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r5 = " fail:"
            r4.append(r5)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x01a1
        L_0x019e:
            r18 = r14
            r14 = 0
        L_0x01a1:
            r10.f185280t = r14
            java.lang.String r0 = r2.f185266d
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r10.f185275p = r0
            er1.w3 r0 = er1.C58784w3.f168295a
            java.lang.String r3 = r2.f185267e
            java.lang.String r0 = r0.mo83984z1(r3)
            r10.f185285x0 = r0
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r22)
            int r0 = (int) r3
            r10.f185273n = r0
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 != 0) goto L_0x01c1
            goto L_0x01c8
        L_0x01c1:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r3 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r3.<init>()
            r0.target = r3
        L_0x01c8:
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 == 0) goto L_0x01cf
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r0.target
            goto L_0x01d0
        L_0x01cf:
            r7 = 0
        L_0x01d0:
            if (r7 != 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            int r3 = r10.f185273n
            r7.fileSize = r3
        L_0x01d7:
            if (r0 != 0) goto L_0x01da
            goto L_0x01e6
        L_0x01da:
            if (r0 == 0) goto L_0x01e3
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r3 = r0.target
            if (r3 == 0) goto L_0x01e3
            int r8 = r3.fileSize
            goto L_0x01e4
        L_0x01e3:
            r8 = 0
        L_0x01e4:
            r0.videoFinalSize = r8
        L_0x01e6:
            te3.zy r0 = r10.f185235B
            if (r0 != 0) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            r0.f186905j = r14
        L_0x01ed:
            te3.xb1 r0 = r10.f185236C
            if (r0 != 0) goto L_0x01f8
            te3.xb1 r0 = new te3.xb1
            r0.<init>()
            r10.f185236C = r0
        L_0x01f8:
            te3.xb1 r0 = r10.f185236C
            if (r0 == 0) goto L_0x0280
            r0.f186282d = r11
            r3 = r26
            r0.f186284f = r3
            float r3 = (float) r13
            r0.f186285g = r3
            te3.zy r3 = r10.f185235B
            if (r3 == 0) goto L_0x0216
            te3.yy r3 = r3.f186906n
            if (r3 == 0) goto L_0x0216
            java.util.LinkedList<te3.ea> r3 = r3.f186611e
            if (r3 == 0) goto L_0x0216
            int r8 = r3.size()
            goto L_0x0217
        L_0x0216:
            r8 = 0
        L_0x0217:
            if (r8 <= 0) goto L_0x021b
            r8 = 1
            goto L_0x021c
        L_0x021b:
            r8 = 0
        L_0x021c:
            r0.f186287i = r8
            te3.nr3 r3 = r10.f185258U0
            if (r3 == 0) goto L_0x0229
            int r3 = r3.f184548n
            r4 = 1
            if (r3 != r4) goto L_0x0229
            r15 = 1
            goto L_0x022a
        L_0x0229:
            r15 = 0
        L_0x022a:
            r0.f186288j = r15
            java.lang.String r3 = r1.f161541i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "codec_info use_algorithm_cover:"
            r4.append(r5)
            boolean r5 = r0.f186288j
            r4.append(r5)
            java.lang.String r5 = " video_score:"
            r4.append(r5)
            float r5 = r0.f186282d
            r4.append(r5)
            java.lang.String r5 = ",video_cover_score:"
            r4.append(r5)
            float r5 = r0.f186283e
            r4.append(r5)
            java.lang.String r5 = ",video_audio_score:"
            r4.append(r5)
            float r5 = r0.f186284f
            r4.append(r5)
            java.lang.String r5 = ",thumb_score:"
            r4.append(r5)
            float r5 = r0.f186285g
            r4.append(r5)
            java.lang.String r5 = ",hdimg_score:"
            r4.append(r5)
            float r5 = r0.f186286h
            r4.append(r5)
            java.lang.String r5 = ",has_stickers:"
            r4.append(r5)
            boolean r0 = r0.f186287i
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0280:
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 == 0) goto L_0x0287
            te3.xb1 r7 = r0.codecInfo
            goto L_0x0288
        L_0x0287:
            r7 = 0
        L_0x0288:
            if (r7 != 0) goto L_0x0291
            if (r0 != 0) goto L_0x028d
            goto L_0x0291
        L_0x028d:
            te3.xb1 r3 = r10.f185236C
            r0.codecInfo = r3
        L_0x0291:
            di3.d r0 = di3.C86312j.m106911c(r18)
            rw.m r0 = (p232rw.C63679m) r0
            rw.m$a r0 = r0.mo88483M1(r9)
            if (r0 == 0) goto L_0x02fb
            long r3 = r0.f180528d
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            int r3 = iy3.C60641c.m70921b(r3)
            r10.f185269g = r3
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r3 = r10.f185262W0
            if (r3 == 0) goto L_0x02b0
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02b1
        L_0x02b0:
            r7 = 0
        L_0x02b1:
            if (r7 != 0) goto L_0x02b4
            goto L_0x02b9
        L_0x02b4:
            long r4 = r0.f180528d
            int r5 = (int) r4
            r7.videoDuration = r5
        L_0x02b9:
            if (r3 == 0) goto L_0x02be
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02bf
        L_0x02be:
            r7 = 0
        L_0x02bf:
            if (r7 != 0) goto L_0x02c2
            goto L_0x02c6
        L_0x02c2:
            int r4 = r0.f180525a
            r7.width = r4
        L_0x02c6:
            if (r3 == 0) goto L_0x02cb
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02cc
        L_0x02cb:
            r7 = 0
        L_0x02cc:
            if (r7 != 0) goto L_0x02cf
            goto L_0x02d3
        L_0x02cf:
            int r4 = r0.f180526b
            r7.height = r4
        L_0x02d3:
            if (r3 == 0) goto L_0x02d8
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02d9
        L_0x02d8:
            r7 = 0
        L_0x02d9:
            if (r7 != 0) goto L_0x02dc
            goto L_0x02e0
        L_0x02dc:
            int r4 = r0.f180529e
            r7.videoBitrate = r4
        L_0x02e0:
            if (r3 == 0) goto L_0x02e5
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02e6
        L_0x02e5:
            r7 = 0
        L_0x02e6:
            if (r7 != 0) goto L_0x02e9
            goto L_0x02ed
        L_0x02e9:
            int r4 = r0.f180532h
            r7.audioBitrate = r4
        L_0x02ed:
            if (r3 == 0) goto L_0x02f2
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r7 = r3.target
            goto L_0x02f3
        L_0x02f2:
            r7 = 0
        L_0x02f3:
            if (r7 != 0) goto L_0x02f6
            goto L_0x02fb
        L_0x02f6:
            float r0 = r0.f180527c
            int r0 = (int) r0
            r7.fps = r0
        L_0x02fb:
            java.lang.String r0 = r1.f161541i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "processList index "
            r3.append(r4)
            r4 = r24
            r3.append(r4)
            java.lang.String r4 = " url "
            r3.append(r4)
            java.lang.String r4 = r2.f185266d
            r3.append(r4)
            java.lang.String r4 = " thumbUrl: "
            r3.append(r4)
            java.lang.String r4 = r2.f185267e
            r3.append(r4)
            java.lang.String r4 = " newMd5: "
            r3.append(r4)
            java.lang.String r4 = r2.f185266d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            r3.append(r4)
            java.lang.String r4 = " size:"
            r3.append(r4)
            java.lang.String r2 = r2.f185266d
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r17)
            tz.e r0 = (p707tz.C64999e) r0
            r2 = r28
            r0.R60(r9, r11, r2)
            di3.d r0 = di3.C86312j.m106911c(r17)
            tz.e r0 = (p707tz.C64999e) r0
            r0.mo89163kC()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.mo79361q(com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, java.lang.String, te3.rq2, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    /* renamed from: r */
    public final void mo79362r(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        C37521f.f99374d.getClass();
        int i = (int) (((float) C37521f.f99138C) * f);
        String str = this.f161541i;
        Log.m105924i(str, "feed " + this.f161540h.getLocalId() + " updateProgress  " + f + ", " + i);
        if (this.f161540h.getPostInfo().f185649h < i) {
            this.f161540h.getPostInfo().f185649h = i;
            C15585f.f42211a.mo14345h(this.f161540h);
        }
        FeedPostProgressEvent feedPostProgressEvent = new FeedPostProgressEvent();
        feedPostProgressEvent.f154751d.f154752a = this.f161540h.getLocalId();
        feedPostProgressEvent.f154751d.f154753b = this.f161540h.getPostInfo().f185649h;
        feedPostProgressEvent.publish();
    }
}
