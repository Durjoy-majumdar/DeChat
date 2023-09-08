package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uy0 */
public class C51613uy0 extends C47465a {

    /* renamed from: d */
    public C48899bs1 f143180d;

    /* renamed from: e */
    public int f143181e;

    /* renamed from: f */
    public String f143182f;

    /* renamed from: g */
    public String f143183g;

    /* renamed from: h */
    public String f143184h;

    /* renamed from: i */
    public int f143185i;

    /* renamed from: j */
    public String f143186j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51613uy0)) {
            return false;
        }
        C51613uy0 uy02 = (C51613uy0) aVar;
        return C46238a.m51546a(this.f143180d, uy02.f143180d) && C46238a.m51546a(Integer.valueOf(this.f143181e), Integer.valueOf(uy02.f143181e)) && C46238a.m51546a(this.f143182f, uy02.f143182f) && C46238a.m51546a(this.f143183g, uy02.f143183g) && C46238a.m51546a(this.f143184h, uy02.f143184h) && C46238a.m51546a(Integer.valueOf(this.f143185i), Integer.valueOf(uy02.f143185i)) && C46238a.m51546a(this.f143186j, uy02.f143186j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48899bs1 bs12 = this.f143180d;
            if (bs12 != null) {
                aVar.mo74322i(1, bs12.computeSize());
                this.f143180d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f143181e);
            String str = this.f143182f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f143183g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f143184h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f143185i);
            String str4 = this.f143186j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            C48899bs1 bs13 = this.f143180d;
            if (bs13 != null) {
                i2 = 0 + C52418a.m58682i(1, bs13.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143181e);
            String str5 = this.f143182f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f143183g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f143184h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f143185i);
            String str8 = this.f143186j;
            return str8 != null ? e2 + C52418a.m58683j(7, str8) : e2;
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
            C51613uy0 uy02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48899bs1 bs14 = new C48899bs1();
                        if (bArr != null && bArr.length > 0) {
                            bs14.parseFrom(bArr);
                        }
                        uy02.f143180d = bs14;
                    }
                    return 0;
                case 2:
                    uy02.f143181e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uy02.f143182f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uy02.f143183g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uy02.f143184h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    uy02.f143185i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uy02.f143186j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
