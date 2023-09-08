package dc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: dc0.e */
public class C31115e implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ String f83439a;

    /* renamed from: b */
    public final /* synthetic */ C31113d f83440b;

    public C31115e(C31113d dVar, String str) {
        this.f83440b = dVar;
        this.f83439a = str;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C35488c cVar = (C35488c) bVar;
        C31113d dVar = this.f83440b;
        dVar.f83415a = false;
        if (i == 0 && i2 == 0) {
            if (!dVar.f83418d.isEmpty() && this.f83440b.f83422h.stopped()) {
                this.f83440b.f83422h.startTimer(500);
            }
            Log.m105925i("MicroMsg.ActionCallbackFunc", "getChatRoomInfoDetail onResult %s %s", Boolean.valueOf(C31118h.vx0().mo57989jo(this.f83439a)), this.f83439a);
            this.f83440b.mo57991h(this.f83439a, true);
            return;
        }
        Log.m105920e("MicroMsg.ActionCallbackFunc", "tryStartNetscene onSceneEnd openRoom errType:" + i + " errCode:" + i2 + " will retry");
        this.f83440b.f83422h.startTimer(10000);
        this.f83440b.mo57991h(this.f83439a, false);
    }
}
