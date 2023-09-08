package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mo4 extends C47465a {

    /* renamed from: d */
    public LinkedList<no4> f259692d = new LinkedList<>();

    /* renamed from: e */
    public boolean f259693e;

    /* renamed from: f */
    public int f259694f;

    /* renamed from: g */
    public int f259695g;

    /* renamed from: h */
    public String f259696h;

    /* renamed from: i */
    public String f259697i;

    /* renamed from: j */
    public String f259698j;

    /* renamed from: n */
    public String f259699n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mo4)) {
            return false;
        }
        mo4 mo4 = (mo4) aVar;
        return C46238a.m51546a(this.f259692d, mo4.f259692d) && C46238a.m51546a(Boolean.valueOf(this.f259693e), Boolean.valueOf(mo4.f259693e)) && C46238a.m51546a(Integer.valueOf(this.f259694f), Integer.valueOf(mo4.f259694f)) && C46238a.m51546a(Integer.valueOf(this.f259695g), Integer.valueOf(mo4.f259695g)) && C46238a.m51546a(this.f259696h, mo4.f259696h) && C46238a.m51546a(this.f259697i, mo4.f259697i) && C46238a.m51546a(this.f259698j, mo4.f259698j) && C46238a.m51546a(this.f259699n, mo4.f259699n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f259692d);
            aVar.mo74314a(2, this.f259693e);
            aVar.mo74318e(3, this.f259694f);
            aVar.mo74318e(4, this.f259695g);
            String str = this.f259696h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f259697i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f259698j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f259699n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f259692d) + 0 + C52418a.m58674a(2, this.f259693e) + C52418a.m58678e(3, this.f259694f) + C52418a.m58678e(4, this.f259695g);
            String str5 = this.f259696h;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            String str6 = this.f259697i;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            String str7 = this.f259698j;
            if (str7 != null) {
                g += C52418a.m58683j(7, str7);
            }
            String str8 = this.f259699n;
            return str8 != null ? g + C52418a.m58683j(8, str8) : g;
        } else if (i == 2) {
            this.f259692d.clear();
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
            mo4 mo4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        no4 no4 = new no4();
                        if (bArr != null && bArr.length > 0) {
                            no4.parseFrom(bArr);
                        }
                        mo4.f259692d.add(no4);
                    }
                    return 0;
                case 2:
                    mo4.f259693e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    mo4.f259694f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mo4.f259695g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mo4.f259696h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mo4.f259697i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mo4.f259698j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mo4.f259699n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
