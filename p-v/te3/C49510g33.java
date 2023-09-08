package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g33 */
public class C49510g33 extends C47465a {

    /* renamed from: d */
    public C52114yg2 f133826d;

    /* renamed from: e */
    public C49227e33 f133827e;

    /* renamed from: f */
    public C50270lj f133828f;

    /* renamed from: g */
    public int f133829g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49510g33)) {
            return false;
        }
        C49510g33 g332 = (C49510g33) aVar;
        return C46238a.m51546a(this.f133826d, g332.f133826d) && C46238a.m51546a(this.f133827e, g332.f133827e) && C46238a.m51546a(this.f133828f, g332.f133828f) && C46238a.m51546a(Integer.valueOf(this.f133829g), Integer.valueOf(g332.f133829g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52114yg2 yg22 = this.f133826d;
            if (yg22 != null) {
                aVar.mo74322i(1, yg22.computeSize());
                this.f133826d.writeFields(aVar);
            }
            C49227e33 e332 = this.f133827e;
            if (e332 != null) {
                aVar.mo74322i(2, e332.computeSize());
                this.f133827e.writeFields(aVar);
            }
            C50270lj ljVar = this.f133828f;
            if (ljVar != null) {
                aVar.mo74322i(3, ljVar.computeSize());
                this.f133828f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f133829g);
            return 0;
        } else if (i == 1) {
            C52114yg2 yg23 = this.f133826d;
            if (yg23 != null) {
                i2 = 0 + C52418a.m58682i(1, yg23.computeSize());
            }
            C49227e33 e333 = this.f133827e;
            if (e333 != null) {
                i2 += C52418a.m58682i(2, e333.computeSize());
            }
            C50270lj ljVar2 = this.f133828f;
            if (ljVar2 != null) {
                i2 += C52418a.m58682i(3, ljVar2.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f133829g);
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
            C49510g33 g332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52114yg2 yg24 = new C52114yg2();
                    if (bArr != null && bArr.length > 0) {
                        yg24.parseFrom(bArr);
                    }
                    g332.f133826d = yg24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49227e33 e334 = new C49227e33();
                    if (bArr2 != null && bArr2.length > 0) {
                        e334.parseFrom(bArr2);
                    }
                    g332.f133827e = e334;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50270lj ljVar3 = new C50270lj();
                    if (bArr3 != null && bArr3.length > 0) {
                        ljVar3.parseFrom(bArr3);
                    }
                    g332.f133828f = ljVar3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                g332.f133829g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
