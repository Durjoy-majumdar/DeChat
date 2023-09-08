package bf3;

import af3.C79525e;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.p064hp.net.C85235a;
import com.tencent.p014mm.plugin.p064hp.net.SimpleHttpLogic;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicInteger;
import p329d3.C86165a;
import te3.C90432q93;

/* renamed from: bf3.c */
public class C79701c {

    /* renamed from: bf3.c$a */
    public class C79702a implements C85235a.C85238c {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f233606a;

        /* renamed from: b */
        public final /* synthetic */ C86165a f233607b;

        /* renamed from: c */
        public final /* synthetic */ Context f233608c;

        /* renamed from: d */
        public final /* synthetic */ boolean f233609d;

        public C79702a(AtomicInteger atomicInteger, C86165a aVar, Context context, boolean z) {
            this.f233606a = atomicInteger;
            this.f233607b = aVar;
            this.f233608c = context;
            this.f233609d = z;
        }

        /* renamed from: a */
        public void mo109572a(int i, TinkerSyncResponse tinkerSyncResponse) {
            C85671c.m105784b("MicroMsg.recovery.operatorFallback", "onCheckEnd, error = " + i + ", response = " + tinkerSyncResponse);
            if (i == 0 || i == -5) {
                C85671c.m105784b("MicroMsg.recovery.operatorFallback", "fetchTinkerPatch cgi rsp successful");
                if (i == -5 || tinkerSyncResponse == null || TextUtils.isEmpty(tinkerSyncResponse.f248342h)) {
                    this.f233606a.set(1);
                    this.f233607b.accept(Integer.valueOf(this.f233606a.get()));
                    return;
                }
                String str = tinkerSyncResponse.f248343i;
                C79525e.m96547b(this.f233608c, tinkerSyncResponse.f248342h, (long) Math.max(tinkerSyncResponse.f248345n, 0), str, this.f233607b, this.f233609d);
                return;
            }
            Log.m105928w("MicroMsg.recovery.operatorFallback", "fetchTinkerPatch cgi rsp error, abort");
            C85692k.C85693a.m105840a(5, "MicroMsg.recovery.operatorFallback", "fetchTinkerPatch cgi rsp error, abort");
            this.f233606a.set(Math.abs(i) + 20);
            this.f233607b.accept(Integer.valueOf(this.f233606a.get()));
        }
    }

    /* renamed from: a */
    public static void m96819a(Context context, C90432q93 q932, C86165a<Integer> aVar, boolean z) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C85235a aVar2 = new C85235a(q932);
        C85671c.m105784b("MicroMsg.recovery.operatorFallback", "NetSceneBaseMMTLSCheck#doSceneSync()");
        aVar2.f248329c = new C79702a(atomicInteger, aVar, context, z);
        if (aVar2.f248327a == null) {
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "doScene failed. request is null.");
            aVar2.f248329c.mo109572a(-3, (TinkerSyncResponse) null);
            return;
        }
        Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "start check");
        SimpleHttpLogic.startRequest(aVar2.f248327a, aVar2.f248328b, BuildInfo.DEBUG ? "101.227.131.113" : "");
    }
}
