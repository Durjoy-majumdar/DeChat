package com.tencent.p014mm.plugin.performance.watchdogs;

import android.os.Process;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.matrix.util.StatusInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import lu3.C34379c;
import org.json.JSONObject;
import p269xe.C91190k;
import p269xe.C91191l;
import rx3.C13604l;
import sx3.C90364q0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.c */
public final class C85326c implements C80407h {

    /* renamed from: d */
    public C34379c<?> f248643d;

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.c$a */
    public static final class C85327a implements Runnable {

        /* renamed from: d */
        public static final C85327a f248644d = new C85327a();

        public final void run() {
            JSONObject jSONObject;
            int i;
            StatusInfo a = StatusInfo.f235698o.mo112189a(Process.myPid());
            if (ProcessUIResumedStateOwner.INSTANCE.active()) {
                int i2 = a.f235705j;
                if ((i2 != 0 && i2 != Integer.MAX_VALUE) || ((i = a.f235706n) != 0 && i != Integer.MAX_VALUE)) {
                    Log.m105920e("MicroMsg.ForegroundOomAdjWatchDog", "foreground oom_adj/oom_score_adj error: " + a.f235705j + ", " + a.f235706n);
                    C91190k.C26537a aVar = C91190k.f261451a;
                    try {
                        jSONObject = new JSONObject(C90364q0.m113147f(new C13604l("oom_adj", Integer.valueOf(a.f235705j)), new C13604l("oom_score_adj", Integer.valueOf(a.f235706n))));
                    } catch (Throwable unused) {
                        jSONObject = null;
                    }
                    C91190k.C26538b bVar = r2;
                    C91190k.C26538b bVar2 = new C91190k.C26538b(7, (String) null, 0, 0, 0, 0, 0, 0, (String) null, 0, (String) null, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, jSONObject != null ? C91191l.m114455a(jSONObject) : null, 0, 0, (String) null, (String) null, 0, 0, -67108866, 1, (C8480h) null);
                    aVar.mo53491a(bVar);
                }
            }
        }
    }

    public void off() {
        C34379c<?> cVar = this.f248643d;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    /* renamed from: on */
    public void mo60742on() {
        C119179t tVar = C119157j.f356862d;
        C85327a aVar = C85327a.f248644d;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f248643d = jVar.mo183886q(aVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, (String) null);
    }
}
