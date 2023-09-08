package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import dv0.C86406l;
import gv0.C20842c;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C11385n;
import pe3.C47465a;
import pv0.C118128c0;
import pv0.C118129d0;

/* renamed from: gv0.h */
public class C20852h extends C20842c {

    /* renamed from: u */
    public C118128c0 f58922u = new C118128c0();

    /* renamed from: v */
    public C118129d0 f58923v = new C118129d0();

    /* renamed from: w */
    public C11385n f58924w;

    public C20852h(String str, long j, long j2, String str2, String str3, C11385n nVar) {
        Log.m105925i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d", str, Long.valueOf(j), Long.valueOf(j2));
        C118128c0 c0Var = this.f58922u;
        c0Var.f353132d = str;
        c0Var.f353133e = j;
        c0Var.f353134f = j2;
        c0Var.f353135g = str2;
        c0Var.f353136h = str3;
        this.f58924w = nVar;
    }

    public int getType() {
        return 15;
    }

    /* renamed from: o1 */
    public boolean mo32547o1() {
        boolean z;
        try {
            byte[] byteArray = this.f58922u.toByteArray();
            ConcurrentHashMap<Integer, C20842c> concurrentHashMap = C20842c.f58876g;
            synchronized (concurrentHashMap) {
                int i = C20842c.f58885s;
                C20842c.f58885s = i + 1;
                this.f58887d = i;
                C86406l.m107073a(byteArray, i, (short) 15, this.f58888e, C20842c.f58880n);
                C20842c.C20843b bVar = C20842c.f58879j;
                if (bVar != null) {
                    bVar.mo32549b(this.f58887d, this.f58888e.value, 15);
                }
                concurrentHashMap.put(Integer.valueOf(this.f58887d), this);
            }
            z = true;
        } catch (Exception e) {
            z = false;
            Log.printErrStackTrace("MicroMsg.BackupBaseScene", e, "req to buf fail: " + e.toString(), new Object[0]);
        }
        if (!z) {
            C118129d0 d0Var = this.f58923v;
            C118128c0 c0Var = this.f58922u;
            d0Var.f353138d = c0Var.f353132d;
            d0Var.f353139e = c0Var.f353133e;
            d0Var.f353140f = c0Var.f353134f;
            d0Var.f353141g = c0Var.f353135g;
            this.f58924w.onSceneEnd(1, -2, "doScene failed", this);
        }
        return z;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f58922u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f58923v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        mo32546m1(0, 0, "success");
        this.f58924w.onSceneEnd(0, 0, "", this);
    }
}
