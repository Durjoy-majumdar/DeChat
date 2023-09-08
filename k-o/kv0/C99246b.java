package kv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ov0.C100546d;

/* renamed from: kv0.b */
public class C99246b {

    /* renamed from: a */
    public long f290988a = -1;

    /* renamed from: b */
    public long f290989b = 0;

    /* renamed from: c */
    public boolean f290990c = false;

    /* renamed from: a */
    public void mo138595a() {
        Log.m105918d("MicroMsg.Recoverfaster", "begin");
        if (C100546d.m131563g().mo139995h().f294624n != null) {
            this.f290988a = C100546d.m131563g().mo139995h().f294624n.beginTransaction(Thread.currentThread().getId());
            this.f290990c = true;
        }
        this.f290989b = Util.nowMilliSecond();
    }

    /* renamed from: b */
    public void mo138596b() {
        if (this.f290990c && C100546d.m131563g().mo139995h().f294624n != null) {
            C100546d.m131563g().mo139995h().f294624n.endTransaction(this.f290988a);
            this.f290990c = false;
        }
    }
}
