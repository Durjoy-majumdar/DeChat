package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u10 */
public class C51477u10 extends C47465a {

    /* renamed from: d */
    public int f142536d;

    /* renamed from: e */
    public r85 f142537e;

    /* renamed from: f */
    public LinkedList<pa4> f142538f = new LinkedList<>();

    /* renamed from: g */
    public int f142539g;

    /* renamed from: h */
    public LinkedList<o85> f142540h = new LinkedList<>();

    /* renamed from: i */
    public boolean f142541i;

    /* renamed from: j */
    public LinkedList<oa4> f142542j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51477u10)) {
            return false;
        }
        C51477u10 u102 = (C51477u10) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142536d), Integer.valueOf(u102.f142536d)) && C46238a.m51546a(this.f142537e, u102.f142537e) && C46238a.m51546a(this.f142538f, u102.f142538f) && C46238a.m51546a(Integer.valueOf(this.f142539g), Integer.valueOf(u102.f142539g)) && C46238a.m51546a(this.f142540h, u102.f142540h) && C46238a.m51546a(Boolean.valueOf(this.f142541i), Boolean.valueOf(u102.f142541i)) && C46238a.m51546a(this.f142542j, u102.f142542j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142536d);
            r85 r85 = this.f142537e;
            if (r85 != null) {
                aVar.mo74322i(2, r85.computeSize());
                this.f142537e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f142538f);
            aVar.mo74318e(4, this.f142539g);
            aVar.mo74320g(5, 8, this.f142540h);
            aVar.mo74314a(6, this.f142541i);
            aVar.mo74320g(7, 8, this.f142542j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142536d) + 0;
            r85 r852 = this.f142537e;
            if (r852 != null) {
                e += C52418a.m58682i(2, r852.computeSize());
            }
            return e + C52418a.m58680g(3, 8, this.f142538f) + C52418a.m58678e(4, this.f142539g) + C52418a.m58680g(5, 8, this.f142540h) + C52418a.m58674a(6, this.f142541i) + C52418a.m58680g(7, 8, this.f142542j);
        } else if (i == 2) {
            this.f142538f.clear();
            this.f142540h.clear();
            this.f142542j.clear();
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
            C51477u10 u102 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u102.f142536d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        r85 r853 = new r85();
                        if (bArr != null && bArr.length > 0) {
                            r853.parseFrom(bArr);
                        }
                        u102.f142537e = r853;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        pa4 pa4 = new pa4();
                        if (bArr2 != null && bArr2.length > 0) {
                            pa4.parseFrom(bArr2);
                        }
                        u102.f142538f.add(pa4);
                    }
                    return 0;
                case 4:
                    u102.f142539g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        o85 o85 = new o85();
                        if (bArr3 != null && bArr3.length > 0) {
                            o85.parseFrom(bArr3);
                        }
                        u102.f142540h.add(o85);
                    }
                    return 0;
                case 6:
                    u102.f142541i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        oa4 oa4 = new oa4();
                        if (bArr4 != null && bArr4.length > 0) {
                            oa4.parseFrom(bArr4);
                        }
                        u102.f142542j.add(oa4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
