package zb2;

import androidx.recyclerview.widget.C54258u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zb2.k */
public final class C103008k implements C54258u {

    /* renamed from: a */
    public final List<C102999b> f303958a = new ArrayList();

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        List<C102999b> list = this.f303958a;
        C102999b bVar = new C102999b(C103000c.Remove);
        bVar.f303935b = i;
        bVar.f303936c = i2;
        ((ArrayList) list).add(bVar);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        List<C102999b> list = this.f303958a;
        C102999b bVar = new C102999b(C103000c.Insert);
        bVar.f303935b = i;
        bVar.f303936c = i2;
        ((ArrayList) list).add(bVar);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        List<C102999b> list = this.f303958a;
        C102999b bVar = new C102999b(C103000c.Change);
        bVar.f303935b = i;
        bVar.f303936c = i2;
        bVar.f303939f = obj;
        ((ArrayList) list).add(bVar);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        List<C102999b> list = this.f303958a;
        C102999b bVar = new C102999b(C103000c.Move);
        bVar.f303937d = i;
        bVar.f303938e = i2;
        ((ArrayList) list).add(bVar);
    }
}
