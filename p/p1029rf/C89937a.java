package p1029rf;

import java.util.List;
import java.util.ListIterator;
import p1023pf.C89350a;
import p1029rf.C89938b;
import p1035sf.C90179b;
import p723vf.C118672d;

/* renamed from: rf.a */
public class C89937a implements C90179b.C90181b {
    public C89937a(C89938b.C89939a aVar) {
    }

    /* renamed from: a */
    public int mo124261a() {
        return 60;
    }

    /* renamed from: b */
    public boolean mo124262b(long j, int i) {
        return j < ((long) i) * 5;
    }

    /* renamed from: c */
    public void mo124263c(List<C89350a> list, int i) {
        C118672d.m167356f("Matrix.EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), 30, list);
        ListIterator<C89350a> listIterator = list.listIterator(Math.min(i, 30));
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }
    }
}
