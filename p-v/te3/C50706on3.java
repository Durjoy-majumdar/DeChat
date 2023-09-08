package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.on3 */
public class C50706on3 extends C47465a {

    /* renamed from: d */
    public int f139269d;

    /* renamed from: e */
    public y35 f139270e;

    /* renamed from: f */
    public x35 f139271f;

    /* renamed from: g */
    public x35 f139272g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50706on3)) {
            return false;
        }
        C50706on3 on32 = (C50706on3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139269d), Integer.valueOf(on32.f139269d)) && C46238a.m51546a(this.f139270e, on32.f139270e) && C46238a.m51546a(this.f139271f, on32.f139271f) && C46238a.m51546a(this.f139272g, on32.f139272g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139269d);
            y35 y35 = this.f139270e;
            if (y35 != null) {
                aVar.mo74322i(2, y35.computeSize());
                this.f139270e.writeFields(aVar);
            }
            x35 x35 = this.f139271f;
            if (x35 != null) {
                aVar.mo74322i(3, x35.computeSize());
                this.f139271f.writeFields(aVar);
            }
            x35 x352 = this.f139272g;
            if (x352 != null) {
                aVar.mo74322i(4, x352.computeSize());
                this.f139272g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139269d) + 0;
            y35 y352 = this.f139270e;
            if (y352 != null) {
                e += C52418a.m58682i(2, y352.computeSize());
            }
            x35 x353 = this.f139271f;
            if (x353 != null) {
                e += C52418a.m58682i(3, x353.computeSize());
            }
            x35 x354 = this.f139272g;
            return x354 != null ? e + C52418a.m58682i(4, x354.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50706on3 on32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                on32.f139269d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    y35 y353 = new y35();
                    if (bArr != null && bArr.length > 0) {
                        y353.parseFrom(bArr);
                    }
                    on32.f139270e = y353;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    x35 x355 = new x35();
                    if (bArr2 != null && bArr2.length > 0) {
                        x355.parseFrom(bArr2);
                    }
                    on32.f139271f = x355;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    x35 x356 = new x35();
                    if (bArr3 != null && bArr3.length > 0) {
                        x356.parseFrom(bArr3);
                    }
                    on32.f139272g = x356;
                }
                return 0;
            }
        }
    }
}
