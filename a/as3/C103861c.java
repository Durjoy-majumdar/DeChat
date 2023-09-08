package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.c */
public final class C103861c extends C108421e {

    /* renamed from: b */
    public C103911y[] f306914b;

    public C103861c() {
        if (C103911y.f307219d == null) {
            synchronized (C108419c.f324642a) {
                if (C103911y.f307219d == null) {
                    C103911y.f307219d = new C103911y[0];
                }
            }
        }
        this.f306914b = C103911y.f307219d;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        C103911y[] yVarArr = this.f306914b;
        int i = 0;
        if (yVarArr == null || yVarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C103911y[] yVarArr2 = this.f306914b;
            if (i >= yVarArr2.length) {
                return i2;
            }
            C103911y yVar = yVarArr2[i];
            if (yVar != null) {
                i2 += C108418b.m146884d(1, yVar);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                int a = C108422g.m146910a(aVar, 10);
                C103911y[] yVarArr = this.f306914b;
                int length = yVarArr == null ? 0 : yVarArr.length;
                int i = a + length;
                C103911y[] yVarArr2 = new C103911y[i];
                if (length != 0) {
                    System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                }
                while (length < i - 1) {
                    C103911y yVar = new C103911y();
                    yVarArr2[length] = yVar;
                    aVar.mo158943e(yVar);
                    aVar.mo158949k();
                    length++;
                }
                C103911y yVar2 = new C103911y();
                yVarArr2[length] = yVar2;
                aVar.mo158943e(yVar2);
                this.f306914b = yVarArr2;
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        C103911y[] yVarArr = this.f306914b;
        if (yVarArr != null && yVarArr.length > 0) {
            int i = 0;
            while (true) {
                C103911y[] yVarArr2 = this.f306914b;
                if (i < yVarArr2.length) {
                    C103911y yVar = yVarArr2[i];
                    if (yVar != null) {
                        bVar.mo158956o(1, yVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
