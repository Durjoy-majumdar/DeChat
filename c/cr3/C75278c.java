package cr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75279d;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: cr3.c */
public abstract class C75278c<T extends C75279d> implements C11385n {

    /* renamed from: d */
    public C11385n f221415d;

    /* renamed from: e */
    public int f221416e;

    /* renamed from: f */
    public T f221417f;

    /* renamed from: a */
    public abstract void mo97352a(C75279d dVar);

    /* renamed from: b */
    public abstract boolean mo97353b(int i, int i2, T t);

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C11385n nVar;
        T t;
        Log.m105919d("MicroMsg.IDelayQueryOrder", "errType: %d, errCode: %d, errMsg: %s scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if ((yVar instanceof C75279d) && !mo97353b(i, i2, (C75279d) yVar) && (nVar = this.f221415d) != null && (t = this.f221417f) != null && (t instanceof C117747y)) {
            nVar.onSceneEnd(i, i2, str, (C117747y) t);
        }
    }
}
