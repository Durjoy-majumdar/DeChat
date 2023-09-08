package p341g7;

import java.util.Arrays;
import p294b7.C16738b;
import p294b7.C16742f;
import p333e8.C20528a;
import p333e8.C20541m;

/* renamed from: g7.d */
public final class C20796d {

    /* renamed from: a */
    public final C20797e f58760a = new C20797e();

    /* renamed from: b */
    public final C20541m f58761b = new C20541m(new byte[65025], 0);

    /* renamed from: c */
    public int f58762c = -1;

    /* renamed from: d */
    public int f58763d;

    /* renamed from: e */
    public boolean f58764e;

    /* renamed from: a */
    public boolean mo32498a(C16742f fVar) {
        int i;
        int i2;
        int i3;
        C20528a.m22240d(fVar != null);
        if (this.f58764e) {
            this.f58764e = false;
            this.f58761b.mo32109t();
        }
        while (!this.f58764e) {
            if (this.f58762c < 0) {
                if (!this.f58760a.mo32499a(fVar, true)) {
                    return false;
                }
                C20797e eVar = this.f58760a;
                int i4 = eVar.f58769d;
                if ((eVar.f58766a & 1) == 1 && this.f58761b.f57811c == 0) {
                    this.f58763d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f58763d;
                        int i7 = 0 + i6;
                        C20797e eVar2 = this.f58760a;
                        if (i7 >= eVar2.f58768c) {
                            break;
                        }
                        int[] iArr = eVar2.f58771f;
                        this.f58763d = i6 + 1;
                        i3 = iArr[i7];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f58763d + 0;
                } else {
                    i2 = 0;
                }
                ((C16738b) fVar).mo17738f(i4);
                this.f58762c = i2;
            }
            int i8 = this.f58762c;
            this.f58763d = 0;
            int i9 = 0;
            do {
                int i15 = this.f58763d;
                int i16 = i8 + i15;
                C20797e eVar3 = this.f58760a;
                if (i16 >= eVar3.f58768c) {
                    break;
                }
                int[] iArr2 = eVar3.f58771f;
                this.f58763d = i15 + 1;
                i = iArr2[i16];
                i9 += i;
            } while (i == 255);
            int i17 = this.f58762c + this.f58763d;
            if (i9 > 0) {
                int a = this.f58761b.mo32090a();
                C20541m mVar = this.f58761b;
                int i18 = mVar.f57811c + i9;
                if (a < i18) {
                    mVar.f57809a = Arrays.copyOf(mVar.f57809a, i18);
                }
                C20541m mVar2 = this.f58761b;
                ((C16738b) fVar).mo17737e(mVar2.f57809a, mVar2.f57811c, i9, false);
                C20541m mVar3 = this.f58761b;
                mVar3.mo32112w(mVar3.f57811c + i9);
                this.f58764e = this.f58760a.f58771f[i17 + -1] != 255;
            }
            if (i17 == this.f58760a.f58768c) {
                i17 = -1;
            }
            this.f58762c = i17;
        }
        return true;
    }
}
