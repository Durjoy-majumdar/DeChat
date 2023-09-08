package kv1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import lv1.C99681n;

/* renamed from: kv1.b */
public abstract class C99248b implements C99259n {

    /* renamed from: d */
    public boolean f291002d;

    public C99248b() {
        Log.m105925i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", getName());
    }

    /* renamed from: a */
    public abstract boolean mo128809a();

    /* renamed from: b */
    public abstract boolean mo128810b();

    public synchronized void create() {
        Log.m105925i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", getName(), Boolean.valueOf(this.f291002d));
        if (!this.f291002d && mo128809a()) {
            Log.m105924i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
            this.f291002d = true;
        }
    }

    public void destroy() {
        Log.m105925i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isCreated %b", getName(), Boolean.valueOf(this.f291002d));
        if (this.f291002d && mo128810b()) {
            Log.m105924i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
            this.f291002d = false;
        }
    }

    public boolean isCreated() {
        return this.f291002d;
    }

    /* renamed from: j4 */
    public void mo128838j4(String str, String str2) {
    }

    /* renamed from: k4 */
    public void mo128843k4(String str, C99681n nVar, int i, HashMap<String, String> hashMap) {
    }

    /* renamed from: x2 */
    public void mo128839x2(String str) {
    }

    /* renamed from: x3 */
    public void mo128840x3() {
    }
}
