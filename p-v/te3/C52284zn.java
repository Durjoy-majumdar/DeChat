package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zn */
public class C52284zn extends C47465a {

    /* renamed from: d */
    public int f146103d;

    /* renamed from: e */
    public String f146104e;

    /* renamed from: f */
    public String f146105f;

    /* renamed from: g */
    public String f146106g;

    /* renamed from: h */
    public int f146107h;

    /* renamed from: i */
    public String f146108i;

    /* renamed from: j */
    public C51997xn f146109j;

    /* renamed from: n */
    public String f146110n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52284zn)) {
            return false;
        }
        C52284zn znVar = (C52284zn) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146103d), Integer.valueOf(znVar.f146103d)) && C46238a.m51546a(this.f146104e, znVar.f146104e) && C46238a.m51546a(this.f146105f, znVar.f146105f) && C46238a.m51546a(this.f146106g, znVar.f146106g) && C46238a.m51546a(Integer.valueOf(this.f146107h), Integer.valueOf(znVar.f146107h)) && C46238a.m51546a(this.f146108i, znVar.f146108i) && C46238a.m51546a(this.f146109j, znVar.f146109j) && C46238a.m51546a(this.f146110n, znVar.f146110n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146103d);
            String str = this.f146104e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146105f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f146106g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f146107h);
            String str4 = this.f146108i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C51997xn xnVar = this.f146109j;
            if (xnVar != null) {
                aVar.mo74322i(7, xnVar.computeSize());
                this.f146109j.writeFields(aVar);
            }
            String str5 = this.f146110n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146103d) + 0;
            String str6 = this.f146104e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f146105f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f146106g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f146107h);
            String str9 = this.f146108i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            C51997xn xnVar2 = this.f146109j;
            if (xnVar2 != null) {
                e2 += C52418a.m58682i(7, xnVar2.computeSize());
            }
            String str10 = this.f146110n;
            return str10 != null ? e2 + C52418a.m58683j(8, str10) : e2;
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
            C52284zn znVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    znVar.f146103d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    znVar.f146104e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    znVar.f146105f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    znVar.f146106g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    znVar.f146107h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    znVar.f146108i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        znVar.f146109j = xnVar3;
                    }
                    return 0;
                case 8:
                    znVar.f146110n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
