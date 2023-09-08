package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: l03.f */
public final class C99279f {

    /* renamed from: a */
    public static final C99279f f291124a = new C99279f();

    /* renamed from: b */
    public static final HashMap<String, MomentsVideoDownloadSourceStruct> f291125b = new HashMap<>();

    /* renamed from: l03.f$a */
    public static final class C99280a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f291126d;

        /* renamed from: e */
        public final /* synthetic */ String f291127e;

        /* renamed from: f */
        public final /* synthetic */ int f291128f;

        /* renamed from: g */
        public final /* synthetic */ boolean f291129g;

        /* renamed from: h */
        public final /* synthetic */ boolean f291130h;

        /* renamed from: i */
        public final /* synthetic */ int f291131i;

        /* renamed from: j */
        public final /* synthetic */ String f291132j;

        /* renamed from: n */
        public final /* synthetic */ long f291133n;

        /* renamed from: o */
        public final /* synthetic */ int f291134o;

        /* renamed from: p */
        public final /* synthetic */ int f291135p;

        /* renamed from: q */
        public final /* synthetic */ boolean f291136q;

        /* renamed from: r */
        public final /* synthetic */ int f291137r;

        /* renamed from: s */
        public final /* synthetic */ boolean f291138s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99280a(String str, String str2, int i, boolean z, boolean z2, int i2, String str3, long j, int i3, int i4, boolean z3, int i5, boolean z4) {
            super(0);
            this.f291126d = str;
            this.f291127e = str2;
            this.f291128f = i;
            this.f291129g = z;
            this.f291130h = z2;
            this.f291131i = i2;
            this.f291132j = str3;
            this.f291133n = j;
            this.f291134o = i3;
            this.f291135p = i4;
            this.f291136q = z3;
            this.f291137r = i5;
            this.f291138s = z4;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "initStruct >> mediaId: " + this.f291126d + "， feedId: " + this.f291127e + ", wsType: " + this.f291128f + ", isMine: " + this.f291129g + ", canSwitchSource: " + this.f291130h + ", previewSourceModeResult: " + this.f291131i + ", previewReqFlag: " + this.f291132j + ", predictStartTimeMS: " + this.f291133n + ", predictCost: " + this.f291134o + ", reqFlagReason: " + this.f291135p + ", " + Thread.currentThread().getName());
            HashMap<String, MomentsVideoDownloadSourceStruct> hashMap = C99279f.f291125b;
            if (hashMap.containsKey(this.f291126d)) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "mediaId is no report " + this.f291126d);
            } else {
                MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct = new MomentsVideoDownloadSourceStruct();
                boolean z = this.f291129g;
                String str = this.f291127e;
                String str2 = this.f291126d;
                int i = this.f291128f;
                boolean z2 = this.f291136q;
                int i2 = this.f291137r;
                boolean z3 = this.f291138s;
                boolean z4 = this.f291130h;
                int i3 = this.f291131i;
                long j = this.f291133n;
                int i4 = this.f291134o;
                int i5 = this.f291135p;
                momentsVideoDownloadSourceStruct.f265720h = 1;
                momentsVideoDownloadSourceStruct.f265719g = z ? 1 : 0;
                momentsVideoDownloadSourceStruct.f265716d = momentsVideoDownloadSourceStruct.mo86045b("Feed_ItemID", str, true);
                momentsVideoDownloadSourceStruct.f265717e = momentsVideoDownloadSourceStruct.mo86045b("Feed_MediaID", str2, true);
                momentsVideoDownloadSourceStruct.f265718f = i;
                momentsVideoDownloadSourceStruct.f265721i = z2 ? 1 : 0;
                momentsVideoDownloadSourceStruct.f265722j = i2;
                momentsVideoDownloadSourceStruct.f265723k = z3 ? 1 : 0;
                momentsVideoDownloadSourceStruct.f265724l = z4 ? 1 : 0;
                momentsVideoDownloadSourceStruct.f265725m = i3;
                momentsVideoDownloadSourceStruct.f265712L = j;
                momentsVideoDownloadSourceStruct.mo86046c("Prediction_PredictStartTimeMS", j);
                momentsVideoDownloadSourceStruct.f265713M = i4;
                momentsVideoDownloadSourceStruct.f265735w = i5;
                hashMap.put(this.f291126d, momentsVideoDownloadSourceStruct);
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "initStruct >> add finish " + this.f291126d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l03.f$b */
    public static final class C99281b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f291139d;

        public C99281b(C32224a<C13598b0> aVar) {
            this.f291139d = aVar;
        }

        public final void run() {
            this.f291139d.invoke();
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m129430c(C99279f fVar, String str, String str2, int i, boolean z, boolean z2, int i2, String str3, int i3, long j, int i4, boolean z3, int i5, boolean z4, int i6, Object obj) {
        int i7 = i6;
        fVar.mo138690b(str, str2, (i7 & 4) != 0 ? -1 : i, (i7 & 8) != 0 ? false : z, (i7 & 16) != 0 ? false : z2, (i7 & 32) != 0 ? -1 : i2, (i7 & 64) != 0 ? "" : str3, (i7 & 128) != 0 ? -1 : i3, (i7 & 256) != 0 ? 0 : j, (i7 & 512) != 0 ? 0 : i4, z3, i5, z4);
    }

    /* renamed from: a */
    public final MomentsVideoDownloadSourceStruct mo138689a(String str) {
        return f291125b.get(str);
    }

    /* renamed from: b */
    public final void mo138690b(String str, String str2, int i, boolean z, boolean z2, int i2, String str3, int i3, long j, int i4, boolean z3, int i5, boolean z4) {
        String str4 = str;
        C87412m.m108594g(str4, "mediaId");
        String str5 = str2;
        C87412m.m108594g(str5, "feedId");
        String str6 = str3;
        C87412m.m108594g(str6, "previewReqFlag");
        mo138692e(new C99280a(str4, str5, i, z, z2, i2, str6, j, i4, i3, z3, i5, z4));
    }

    /* renamed from: d */
    public final void mo138691d(String str) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "mediaId");
        MomentsVideoDownloadSourceStruct a = mo138689a(str);
        if (a != null) {
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + str + ", " + a.f265714N);
            a.f265714N = a.f265714N + 1;
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + str + " but data is no find");
        }
    }

    /* renamed from: e */
    public final void mo138692e(C32224a<C13598b0> aVar) {
        ((C119157j) C119157j.f356862d).mo183876g(new C99281b(aVar), "SnsVideoReportThread");
    }
}
