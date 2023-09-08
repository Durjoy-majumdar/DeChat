package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vp3 */
public class C64782vp3 extends C47465a {

    /* renamed from: d */
    public int f185968d;

    /* renamed from: e */
    public String f185969e;

    /* renamed from: f */
    public C64714sp3 f185970f;

    /* renamed from: g */
    public C64714sp3 f185971g;

    /* renamed from: h */
    public int f185972h;

    /* renamed from: i */
    public String f185973i;

    /* renamed from: j */
    public LinkedList<C64714sp3> f185974j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C64714sp3> f185975n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64782vp3)) {
            return false;
        }
        C64782vp3 vp32 = (C64782vp3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185968d), Integer.valueOf(vp32.f185968d)) && C46238a.m51546a(this.f185969e, vp32.f185969e) && C46238a.m51546a(this.f185970f, vp32.f185970f) && C46238a.m51546a(this.f185971g, vp32.f185971g) && C46238a.m51546a(Integer.valueOf(this.f185972h), Integer.valueOf(vp32.f185972h)) && C46238a.m51546a(this.f185973i, vp32.f185973i) && C46238a.m51546a(this.f185974j, vp32.f185974j) && C46238a.m51546a(this.f185975n, vp32.f185975n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185968d);
            String str = this.f185969e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64714sp3 sp32 = this.f185970f;
            if (sp32 != null) {
                aVar.mo74322i(3, sp32.computeSize());
                this.f185970f.writeFields(aVar);
            }
            C64714sp3 sp33 = this.f185971g;
            if (sp33 != null) {
                aVar.mo74322i(4, sp33.computeSize());
                this.f185971g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f185972h);
            String str2 = this.f185973i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74320g(7, 8, this.f185974j);
            aVar.mo74320g(8, 8, this.f185975n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185968d) + 0;
            String str3 = this.f185969e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            C64714sp3 sp34 = this.f185970f;
            if (sp34 != null) {
                e += C52418a.m58682i(3, sp34.computeSize());
            }
            C64714sp3 sp35 = this.f185971g;
            if (sp35 != null) {
                e += C52418a.m58682i(4, sp35.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f185972h);
            String str4 = this.f185973i;
            if (str4 != null) {
                e2 += C52418a.m58683j(6, str4);
            }
            return e2 + C52418a.m58680g(7, 8, this.f185974j) + C52418a.m58680g(8, 8, this.f185975n);
        } else if (i == 2) {
            this.f185974j.clear();
            this.f185975n.clear();
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
            C64782vp3 vp32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vp32.f185968d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    vp32.f185969e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64714sp3 sp36 = new C64714sp3();
                        if (bArr != null && bArr.length > 0) {
                            sp36.parseFrom(bArr);
                        }
                        vp32.f185970f = sp36;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64714sp3 sp37 = new C64714sp3();
                        if (bArr2 != null && bArr2.length > 0) {
                            sp37.parseFrom(bArr2);
                        }
                        vp32.f185971g = sp37;
                    }
                    return 0;
                case 5:
                    vp32.f185972h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vp32.f185973i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64714sp3 sp38 = new C64714sp3();
                        if (bArr3 != null && bArr3.length > 0) {
                            sp38.parseFrom(bArr3);
                        }
                        vp32.f185974j.add(sp38);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C64714sp3 sp39 = new C64714sp3();
                        if (bArr4 != null && bArr4.length > 0) {
                            sp39.parseFrom(bArr4);
                        }
                        vp32.f185975n.add(sp39);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
