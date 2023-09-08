package l03;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TPVideoPlayReportStruct;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import gy3.C87412m;
import hd0.C98403m0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l03.s */
public final class C99294s implements C21387c, C99276a {

    /* renamed from: a */
    public final TPVideoPlayReportStruct f291171a;

    /* renamed from: b */
    public final long f291172b;

    /* renamed from: c */
    public final int f291173c;

    /* renamed from: d */
    public boolean f291174d;

    /* renamed from: e */
    public long f291175e;

    /* renamed from: f */
    public long f291176f;

    /* renamed from: g */
    public long f291177g;

    /* renamed from: h */
    public long f291178h;

    /* renamed from: i */
    public long f291179i;

    /* renamed from: j */
    public int f291180j;

    /* renamed from: k */
    public int f291181k;

    /* renamed from: l */
    public long f291182l;

    /* renamed from: m */
    public long f291183m;

    /* renamed from: n */
    public boolean f291184n;

    /* renamed from: o */
    public long f291185o;

    /* renamed from: p */
    public String f291186p;

    /* renamed from: q */
    public int f291187q;

    /* renamed from: r */
    public int f291188r;

    /* renamed from: s */
    public long f291189s;

    /* renamed from: t */
    public boolean f291190t;

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.reporter.TPPlayerReporter$report$1", mo125469f = "TPPlayerReporter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: l03.s$a */
    public static final class C99295a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C99294s f291191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99295a(C99294s sVar, C15601d<? super C99295a> dVar) {
            super(2, dVar);
            this.f291191d = sVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C99295a(this.f291191d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C99295a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C94554a c;
            ResultKt.throwOnFailure(obj);
            if (C86013q1.m106450k(this.f291191d.f291186p) && (c = C94555d.m119567c(this.f291191d.f291186p, true)) != null) {
                C99294s sVar = this.f291191d;
                TPVideoPlayReportStruct tPVideoPlayReportStruct = sVar.f291171a;
                tPVideoPlayReportStruct.f266317L = (long) c.f273449g;
                tPVideoPlayReportStruct.f266318M = (long) c.f273448f;
                tPVideoPlayReportStruct.f266315J = (long) c.f273450h;
                tPVideoPlayReportStruct.f266308C = (long) c.f273444b;
                tPVideoPlayReportStruct.f266312G = (long) c.f273443a;
                tPVideoPlayReportStruct.f266310E = (long) c.f273445c;
                tPVideoPlayReportStruct.f266311F = (long) c.f273446d;
                tPVideoPlayReportStruct.f266313H = (long) c.f273447e;
                if (c.f273455m) {
                    tPVideoPlayReportStruct.f266309D = 1;
                } else if (C98403m0.m127702b(sVar.f291186p)) {
                    this.f291191d.f291171a.f266309D = 2;
                }
                C99294s sVar2 = this.f291191d;
                TPVideoPlayReportStruct tPVideoPlayReportStruct2 = sVar2.f291171a;
                if (tPVideoPlayReportStruct2.f266338h <= 0) {
                    tPVideoPlayReportStruct2.f266338h = C86013q1.m106451l(sVar2.f291186p);
                }
            }
            this.f291191d.f291171a.mo86054n();
            return C13598b0.f38549a;
        }
    }

    public C99294s(TPVideoPlayReportStruct tPVideoPlayReportStruct, long j, int i) {
        C87412m.m108594g(tPVideoPlayReportStruct, "struct");
        this.f291171a = tPVideoPlayReportStruct;
        this.f291172b = j;
        this.f291173c = i;
    }

    /* renamed from: a */
    public void mo33480a() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onCompleted");
        if (this.f291171a.f266326U <= 0) {
            long j = this.f291176f;
            if (j > 0) {
                this.f291177g += Util.milliSecondsToNow(j);
                this.f291176f = 0;
            }
            mo138695z();
        }
    }

    /* renamed from: b */
    public void mo135882b() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onStartDownload");
        this.f291189s = Util.nowMilliSecond();
    }

    /* renamed from: c */
    public void mo135883c(long j) {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onDownloadStarted, timestamp=" + j);
        this.f291171a.f266347q = (long) NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
        this.f291171a.f266348r = j - this.f291189s;
    }

    /* renamed from: d */
    public void mo33481d(int i) {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onError: " + i);
        this.f291171a.f266342l = i;
        long j = this.f291176f;
        if (j > 0) {
            this.f291177g += Util.milliSecondsToNow(j);
            this.f291176f = 0;
        }
        mo138695z();
    }

    /* renamed from: e */
    public void mo33482e(int i, int i2) {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onSeek: " + i2);
        this.f291181k = this.f291181k + 1;
        this.f291184n = false;
        this.f291182l = Util.nowMilliSecond();
    }

    /* renamed from: f */
    public void mo33483f() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onBufferingStopped");
        long j = this.f291178h;
        if (j > 0) {
            if (!this.f291184n) {
                this.f291179i += Util.milliSecondsToNow(j);
            }
            this.f291178h = 0;
        }
        this.f291184n = false;
    }

    /* renamed from: g */
    public void mo135884g() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onDuplicateFileFound");
        this.f291171a.f266340j = 5;
    }

    /* renamed from: h */
    public void mo135885h() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onNeedCompletion");
    }

    /* renamed from: i */
    public void mo135886i(int i) {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onDownloadError: " + i);
        TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
        tPVideoPlayReportStruct.f266350t = (long) i;
        tPVideoPlayReportStruct.f266349s = Util.milliSecondsToNow(this.f291189s);
    }

    /* renamed from: j */
    public void mo33484j() {
        if (this.f291171a.f266344n <= 0 && this.f291185o > 0) {
            Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onFirstVideoFrame");
            this.f291171a.f266344n = Util.milliSecondsToNow(this.f291185o);
        }
    }

    /* renamed from: k */
    public void mo33485k(int i, long j, long j2) {
        int i2 = 0;
        if (i == 203) {
            int i3 = (int) j;
            if (i3 == 1) {
                i2 = 2;
            } else if (i3 == 2) {
                i2 = 1;
            }
            this.f291187q = i2;
        } else if (i == 204) {
            int i4 = (int) j;
            if (i4 == 101) {
                i2 = 2;
            } else if (i4 == 102) {
                i2 = 1;
            }
            this.f291188r = i2;
        }
    }

    /* renamed from: l */
    public void mo135887l() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onRequestH264");
    }

    /* renamed from: m */
    public void mo135888m(long j) {
        Log.m105924i("MicroMsg.TPPlayerReporter", "onDownloadProgress");
        C99279f fVar = C99279f.f291124a;
        String str = this.f291171a.f266337g;
        C87412m.m108593f(str, "struct.mediaId");
        Long valueOf = Long.valueOf(j);
        int i = this.f291171a.f266323R;
        fVar.getClass();
        fVar.mo138692e(new C99287l(i, str, valueOf));
    }

    /* renamed from: n */
    public void mo33486n() {
        C13598b0 b0Var;
        Log.m105918d("MicroMsg.TPPlayerReporter", "onBufferingStarted");
        long nowMilliSecond = Util.nowMilliSecond();
        this.f291178h = nowMilliSecond;
        boolean z = nowMilliSecond - this.f291182l < 300;
        this.f291184n = z;
        if (!z) {
            this.f291180j++;
        }
        C99279f fVar = C99279f.f291124a;
        String str = this.f291171a.f266337g;
        C87412m.m108593f(str, "struct.mediaId");
        fVar.getClass();
        MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
        if (a != null) {
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setVideoLoading >> " + str + ", " + a.f265715O);
            a.f265715O = a.f265715O + 1;
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setVideoLoadingCount >> " + str + ", but data is no find");
        }
    }

    /* renamed from: o */
    public void mo135889o(long j, long j2) {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onMoovReady, offset=" + j + ", length=" + j2);
        this.f291171a.f266354x = Math.max(Util.nowMilliSecond() - this.f291189s, 0);
        TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
        tPVideoPlayReportStruct.f266355y = j;
        tPVideoPlayReportStruct.f266356z = j2;
        tPVideoPlayReportStruct.f266307B = 1;
    }

    public void onPause() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onPause");
        long j = this.f291176f;
        if (j > 0) {
            this.f291177g += Util.milliSecondsToNow(j);
            this.f291176f = 0;
        }
    }

    public void onStart() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onStart");
        long nowMilliSecond = Util.nowMilliSecond();
        this.f291176f = nowMilliSecond;
        if (this.f291175e == 0) {
            this.f291175e = nowMilliSecond;
        }
    }

    public void onStop() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onStop");
        long j = this.f291176f;
        if (j > 0) {
            this.f291177g += Util.milliSecondsToNow(j);
            this.f291176f = 0;
        }
        TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
        if (tPVideoPlayReportStruct.f266340j != 5) {
            if (this.f291189s <= 0) {
                tPVideoPlayReportStruct.f266340j = 3;
            } else if (this.f291190t) {
                tPVideoPlayReportStruct.f266340j = 1;
            } else {
                tPVideoPlayReportStruct.f266340j = 2;
            }
        }
        mo138695z();
    }

    /* renamed from: p */
    public void mo135890p() {
        Log.m105928w("MicroMsg.TPPlayerReporter", "onRequestAllData");
    }

    /* renamed from: q */
    public void mo33490q(boolean z, String str) {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onPrepare: isOnline=" + z + ", path=" + str);
        this.f291186p = str;
        this.f291190t = z;
        this.f291185o = Util.nowMilliSecond();
    }

    /* renamed from: r */
    public void mo135891r() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onMoovLack");
    }

    /* renamed from: s */
    public void mo135892s() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onDownloadSucceed");
        TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
        tPVideoPlayReportStruct.f266350t = 0;
        tPVideoPlayReportStruct.f266349s = Util.milliSecondsToNow(this.f291189s);
        C99279f fVar = C99279f.f291124a;
        String str = this.f291171a.f266337g;
        C87412m.m108593f(str, "struct.mediaId");
        int i = this.f291171a.f266323R;
        fVar.getClass();
        fVar.mo138692e(new C99284i(i, str));
    }

    /* renamed from: t */
    public void mo135893t() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onMoovParseSucceed");
        this.f291171a.f266306A = 0;
    }

    /* renamed from: u */
    public void mo135894u() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onStopDownload");
    }

    /* renamed from: v */
    public void mo33491v(int i) {
    }

    /* renamed from: w */
    public void mo33492w() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]onSeekCompleted");
        long j = this.f291182l;
        if (j >= 0) {
            this.f291183m += Util.milliSecondsToNow(j);
        }
    }

    /* renamed from: x */
    public void mo135895x() {
        Log.m105918d("MicroMsg.TPPlayerReporter", "onMoovParseFailed");
        this.f291171a.f266306A = 2;
    }

    /* renamed from: y */
    public void mo138694y(String str) {
        Log.m105920e("MicroMsg.TPPlayerReporter", "markRequestVideoFlag media id:" + this.f291171a.f266337g + " flag:" + str);
        TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
        tPVideoPlayReportStruct.f266324S = tPVideoPlayReportStruct.mo86045b("ReqVideoFlag", str, true);
    }

    /* renamed from: z */
    public final void mo138695z() {
        Log.m105924i("MicroMsg.TPPlayerReporter", '[' + this.f291171a.f266337g + "]report: enter=" + this.f291172b);
        if (!this.f291174d) {
            boolean z = true;
            this.f291174d = true;
            this.f291171a.f266334d = Util.milliSecondsToNow(this.f291172b);
            int i = this.f291180j;
            if (i > 0) {
                TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f291171a;
                tPVideoPlayReportStruct.f266346p = this.f291179i / ((long) i);
                tPVideoPlayReportStruct.f266345o = (long) i;
            }
            TPVideoPlayReportStruct tPVideoPlayReportStruct2 = this.f291171a;
            tPVideoPlayReportStruct2.f266341k = this.f291177g;
            int i2 = this.f291181k;
            if (i2 > 0) {
                tPVideoPlayReportStruct2.f266319N = (long) i2;
                tPVideoPlayReportStruct2.f266320O = this.f291183m / ((long) i2);
            }
            tPVideoPlayReportStruct2.f266343m = Math.max(this.f291175e - this.f291185o, 0);
            TPVideoPlayReportStruct tPVideoPlayReportStruct3 = this.f291171a;
            tPVideoPlayReportStruct3.f266335e = (long) this.f291173c;
            tPVideoPlayReportStruct3.f266314I = (long) this.f291188r;
            tPVideoPlayReportStruct3.f266316K = (long) this.f291187q;
            tPVideoPlayReportStruct3.f266329X = System.currentTimeMillis();
            TPVideoPlayReportStruct tPVideoPlayReportStruct4 = this.f291171a;
            C34152e eVar = C34152e.f92126a;
            String str = tPVideoPlayReportStruct4.f266337g;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            int i3 = -1;
            if (!z) {
                Integer num = C34152e.f92127b.get(str);
                if (num == null) {
                    num = -1;
                }
                i3 = num.intValue();
                C34152e.f92127b.remove(str);
                Log.m105924i("MicroMsg.SnsPredictDataReport", "getPredictStatusToReport >> " + str + ", " + i3);
            }
            tPVideoPlayReportStruct4.f266333b0 = i3;
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151117a, (C53934p0) null, new C99295a(this, (C15601d<? super C99295a>) null), 2, (Object) null);
        }
    }
}
