package b90;

import com.tencent.p014mm.hardcoder.C104630a;
import com.tencent.p014mm.hardcoder.C104631d;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.hardcoder.HardCoderJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: b90.c */
public final class C104060c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104064e f307772d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f307773e;

    /* renamed from: b90.c$a */
    public static final class C104061a implements C104630a {

        /* renamed from: a */
        public final /* synthetic */ C104064e f307774a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f307775b;

        public C104061a(C104064e eVar, C32224a<C13598b0> aVar) {
            this.f307774a = eVar;
            this.f307775b = aVar;
        }

        public final void onGetParameters(int i, JSONObject jSONObject) {
            if (i == 2) {
                this.f307774a.f307782d = jSONObject.optJSONArray("CameraRequestTags");
                this.f307774a.f307783e = jSONObject.optJSONArray("CameraResultTags");
                this.f307774a.f307784f = jSONObject.optJSONArray("CaptureSessionType");
                this.f307775b.invoke();
            }
        }
    }

    /* renamed from: b90.c$b */
    public static final class C104062b implements HardCoderJNI.HCPerfManagerThread {

        /* renamed from: a */
        public static final C104062b f307776a = new C104062b();

        public final Thread newThread(Runnable runnable, String str, int i) {
            return new Thread(runnable, str);
        }
    }

    public C104060c(C104064e eVar, C32224a<C13598b0> aVar) {
        this.f307772d = eVar;
        this.f307773e = aVar;
    }

    public final void run() {
        HardCoderJNI.stopPerformance(0);
        String readServerAddr = HardCoderJNI.readServerAddr();
        boolean z = true;
        HardCoderJNI.setCheckEnv(readServerAddr != null && !C87412m.m108589b(readServerAddr, ""));
        int initHardCoder = HardCoderJNI.initHardCoder(readServerAddr, 0, HardCoderJNI.CLIENT_SOCK, C104062b.f307776a, (C104631d) null);
        String str = this.f307772d.f307780b;
        Log.m105924i(str, "Read remote persist.sys.hardcoder.name:" + readServerAddr + " initHardCoder:" + initHardCoder);
        C104064e eVar = this.f307772d;
        if (initHardCoder != 0) {
            z = false;
        }
        eVar.f307781c = z;
        if (this.f307772d.f307781c) {
            C40318k.m43492a().getParameters(2, (C104630a) new C104061a(this.f307772d, this.f307773e), new String[0]);
        }
    }
}
