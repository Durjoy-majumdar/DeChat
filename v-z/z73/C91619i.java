package z73;

import android.app.Activity;
import android.content.Context;
import bh3.C113177k;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import p918s2.C90111a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.i */
public final class C91619i extends C15053a {

    /* renamed from: d */
    public static final C91619i f262475d = new C91619i();

    /* renamed from: z73.i$a */
    public static final class C91620a implements C113177k.C79704f {

        /* renamed from: a */
        public final /* synthetic */ Activity f262476a;

        /* renamed from: b */
        public final /* synthetic */ String f262477b;

        /* renamed from: c */
        public final /* synthetic */ C13855j f262478c;

        /* renamed from: d */
        public final /* synthetic */ C13851h1 f262479d;

        /* renamed from: z73.i$a$a */
        public /* synthetic */ class C91621a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f262480a;

            static {
                int[] iArr = new int[C113177k.C79703c.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                f262480a = iArr;
            }
        }

        public C91620a(Activity activity, String str, C13855j jVar, C13851h1 h1Var) {
            this.f262476a = activity;
            this.f262477b = str;
            this.f262478c = jVar;
            this.f262479d = h1Var;
        }

        /* renamed from: a */
        public final void mo109818a(C113177k.C79703c cVar) {
            int i;
            int i2 = cVar == null ? -1 : C91621a.f262480a[cVar.ordinal()];
            if (i2 == 1) {
                i = C90111a.m112742f(this.f262476a, this.f262477b) ? 2 : 6;
            } else if (i2 == 2) {
                i = 3;
            } else if (i2 != 3) {
                Log.m105920e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "requestPermission error: " + cVar.f233615d);
                return;
            } else {
                i = 1;
            }
            Map f = C90364q0.m113147f(new C13604l("retCode", 0), new C13604l("status", Integer.valueOf(i)), new C13604l(StateEvent.ProcessResult.SUCCEED, Boolean.valueOf(cVar == C113177k.C79703c.GRANTED)));
            C13849g gVar = this.f262478c.f39001d;
            String str = this.f262479d.f38990c;
            gVar.mo10774a(str, this.f262479d.f38996i + ":ok", f);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C113177k.C113178a aVar;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + h1Var.f38983a);
        Map<String, Object> map = h1Var.f38983a;
        int e = C43471q.m46981e(map, "capability", -1);
        int e2 = C43471q.m46981e(map, "authScene", -1);
        if (e == 1) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else if (e == 6) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        } else if (e != 11) {
            Log.m105920e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "capability error: " + e);
            return true;
        } else {
            str = "android.permission.CAMERA";
        }
        String str2 = str;
        if (e2 == 10) {
            aVar = C113177k.C113178a.STORY;
        } else if (e2 != 11) {
            Log.m105920e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "authScene error: " + e2);
            return true;
        } else {
            aVar = C113177k.C113178a.SEARCH;
        }
        Context context = jVar.f38998a;
        C13598b0 b0Var = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ((C113177k) C86312j.m106911c(C113177k.class)).mo165713kx(activity, aVar.f338661d, str2, aVar.f338662e, new C91620a(activity, str2, jVar, h1Var));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "env.context as? Activity = null");
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "requestSystemCapabilityAuthorization";
    }
}
