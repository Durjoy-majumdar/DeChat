package q34;

import java.util.concurrent.TimeUnit;
import l34.C117459k;
import n34.C117603a;
import n34.C117605d;
import p34.C117932b;

/* renamed from: q34.i */
public class C118162i implements C117605d<C117603a, C117459k> {

    /* renamed from: a */
    public final /* synthetic */ C117932b f353192a;

    public C118162i(C89453l lVar, C117932b bVar) {
        this.f353192a = bVar;
    }

    public Object call(Object obj) {
        C117932b.C117937c cVar;
        C117603a aVar = (C117603a) obj;
        C117932b.C117936b bVar = this.f353192a.f352490f.get();
        int i = bVar.f352499a;
        if (i == 0) {
            cVar = C117932b.f352487h;
        } else {
            C117932b.C117937c[] cVarArr = bVar.f352500b;
            long j = bVar.f352501c;
            bVar.f352501c = 1 + j;
            cVar = cVarArr[(int) (j % ((long) i))];
        }
        return cVar.mo182714h(aVar, -1, TimeUnit.NANOSECONDS);
    }
}
