package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x14 */
public class C118478x14 extends C47465a {

    /* renamed from: d */
    public C22505ka3 f354526d;

    /* renamed from: e */
    public C118430fa3 f354527e;

    /* renamed from: f */
    public C22505ka3 f354528f;

    /* renamed from: g */
    public C118430fa3 f354529g;

    /* renamed from: h */
    public boolean f354530h = false;

    /* renamed from: i */
    public boolean f354531i = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118478x14)) {
            return false;
        }
        C118478x14 x142 = (C118478x14) aVar;
        return C46238a.m51546a(this.f354526d, x142.f354526d) && C46238a.m51546a(this.f354527e, x142.f354527e) && C46238a.m51546a(this.f354528f, x142.f354528f) && C46238a.m51546a(this.f354529g, x142.f354529g) && C46238a.m51546a(Boolean.valueOf(this.f354530h), Boolean.valueOf(x142.f354530h)) && C46238a.m51546a(Boolean.valueOf(this.f354531i), Boolean.valueOf(x142.f354531i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C22505ka3 ka32 = this.f354526d;
            if (ka32 != null) {
                aVar.mo74322i(1, ka32.computeSize());
                this.f354526d.writeFields(aVar);
            }
            C118430fa3 fa32 = this.f354527e;
            if (fa32 != null) {
                aVar.mo74322i(2, fa32.computeSize());
                this.f354527e.writeFields(aVar);
            }
            C22505ka3 ka33 = this.f354528f;
            if (ka33 != null) {
                aVar.mo74322i(3, ka33.computeSize());
                this.f354528f.writeFields(aVar);
            }
            C118430fa3 fa33 = this.f354529g;
            if (fa33 != null) {
                aVar.mo74322i(4, fa33.computeSize());
                this.f354529g.writeFields(aVar);
            }
            aVar.mo74314a(5, this.f354530h);
            aVar.mo74314a(6, this.f354531i);
            return 0;
        } else if (i == 1) {
            C22505ka3 ka34 = this.f354526d;
            if (ka34 != null) {
                i2 = 0 + C52418a.m58682i(1, ka34.computeSize());
            }
            C118430fa3 fa34 = this.f354527e;
            if (fa34 != null) {
                i2 += C52418a.m58682i(2, fa34.computeSize());
            }
            C22505ka3 ka35 = this.f354528f;
            if (ka35 != null) {
                i2 += C52418a.m58682i(3, ka35.computeSize());
            }
            C118430fa3 fa35 = this.f354529g;
            if (fa35 != null) {
                i2 += C52418a.m58682i(4, fa35.computeSize());
            }
            return i2 + C52418a.m58674a(5, this.f354530h) + C52418a.m58674a(6, this.f354531i);
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
            C118478x14 x142 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C22505ka3 ka36 = new C22505ka3();
                        if (bArr != null && bArr.length > 0) {
                            ka36.parseFrom(bArr);
                        }
                        x142.f354526d = ka36;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C118430fa3 fa36 = new C118430fa3();
                        if (bArr2 != null && bArr2.length > 0) {
                            fa36.parseFrom(bArr2);
                        }
                        x142.f354527e = fa36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22505ka3 ka37 = new C22505ka3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ka37.parseFrom(bArr3);
                        }
                        x142.f354528f = ka37;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C118430fa3 fa37 = new C118430fa3();
                        if (bArr4 != null && bArr4.length > 0) {
                            fa37.parseFrom(bArr4);
                        }
                        x142.f354529g = fa37;
                    }
                    return 0;
                case 5:
                    x142.f354530h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    x142.f354531i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
