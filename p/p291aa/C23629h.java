package p291aa;

import java.util.ConcurrentModificationException;

/* renamed from: aa.h */
public abstract class C23629h {

    /* renamed from: d */
    public C23618b f67813d;

    /* renamed from: e */
    public int f67814e;

    /* renamed from: f */
    public int f67815f;

    public C23629h(C23618b bVar) {
        this.f67813d = bVar;
        this.f67814e = bVar.f67798d;
        this.f67815f = bVar.mo37125f();
    }

    public boolean hasNext() {
        return nextIndex() >= 0;
    }

    public abstract int nextIndex();

    /* JADX INFO: finally extract failed */
    public void remove() {
        int i = this.f67814e;
        C23618b bVar = this.f67813d;
        if (i == bVar.f67798d) {
            int i2 = bVar.f67800f;
            if (i2 >= 0) {
                bVar.f67800f = i2 - bVar.mo37125f();
                try {
                    this.f67813d.mo37132p(this.f67815f);
                    C23618b bVar2 = this.f67813d;
                    int i3 = bVar2.f67800f;
                    if (i3 < 0) {
                        bVar2.f67800f = i3 + bVar2.mo37125f();
                        this.f67814e--;
                        return;
                    }
                    throw new IllegalStateException("Unpaired stop/startCompactingOnRemove");
                } catch (Throwable th) {
                    C23618b bVar3 = this.f67813d;
                    int i4 = bVar3.f67800f;
                    if (i4 < 0) {
                        bVar3.f67800f = i4 + bVar3.mo37125f();
                        throw th;
                    }
                    throw new IllegalStateException("Unpaired stop/startCompactingOnRemove");
                }
            } else {
                throw new IllegalStateException("Unpaired stop/startCompactingOnRemove");
            }
        } else {
            throw new ConcurrentModificationException();
        }
    }
}
