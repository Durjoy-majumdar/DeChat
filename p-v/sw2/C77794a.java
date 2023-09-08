package sw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import sw2.C77795b;

/* renamed from: sw2.a */
public class C77794a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ int f226650d;

    /* renamed from: e */
    public final /* synthetic */ C77795b f226651e;

    public C77794a(C77795b bVar, int i) {
        this.f226651e = bVar;
        this.f226650d = i;
    }

    public boolean onTimerExpired() {
        if (this.f226651e.f226660j) {
            return false;
        }
        Log.m105919d("ExtTranslateVoiceEventListener", "timmer get, delay:%d", Integer.valueOf(this.f226650d));
        this.f226651e.mo107934q(C77795b.C77796a.GET);
        return false;
    }
}
