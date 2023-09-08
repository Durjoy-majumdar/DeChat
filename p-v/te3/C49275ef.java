package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ef */
public class C49275ef extends C47465a {

    /* renamed from: d */
    public String f132889d;

    /* renamed from: e */
    public String f132890e;

    /* renamed from: f */
    public int f132891f;

    /* renamed from: g */
    public String f132892g;

    /* renamed from: h */
    public String f132893h;

    /* renamed from: i */
    public int f132894i;

    /* renamed from: j */
    public String f132895j;

    /* renamed from: n */
    public LinkedList<C49415ff> f132896n = new LinkedList<>();

    /* renamed from: o */
    public int f132897o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49275ef)) {
            return false;
        }
        C49275ef efVar = (C49275ef) aVar;
        return C46238a.m51546a(this.f132889d, efVar.f132889d) && C46238a.m51546a(this.f132890e, efVar.f132890e) && C46238a.m51546a(Integer.valueOf(this.f132891f), Integer.valueOf(efVar.f132891f)) && C46238a.m51546a(this.f132892g, efVar.f132892g) && C46238a.m51546a(this.f132893h, efVar.f132893h) && C46238a.m51546a(Integer.valueOf(this.f132894i), Integer.valueOf(efVar.f132894i)) && C46238a.m51546a(this.f132895j, efVar.f132895j) && C46238a.m51546a(this.f132896n, efVar.f132896n) && C46238a.m51546a(Integer.valueOf(this.f132897o), Integer.valueOf(efVar.f132897o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132889d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132890e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f132891f);
            String str3 = this.f132892g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f132893h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f132894i);
            String str5 = this.f132895j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74320g(8, 8, this.f132896n);
            aVar.mo74318e(9, this.f132897o);
            return 0;
        } else if (i == 1) {
            String str6 = this.f132889d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f132890e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f132891f);
            String str8 = this.f132892g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f132893h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f132894i);
            String str10 = this.f132895j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            return e2 + C52418a.m58680g(8, 8, this.f132896n) + C52418a.m58678e(9, this.f132897o);
        } else if (i == 2) {
            this.f132896n.clear();
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
            C49275ef efVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    efVar.f132889d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    efVar.f132890e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    efVar.f132891f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    efVar.f132892g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    efVar.f132893h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    efVar.f132894i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    efVar.f132895j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49415ff ffVar = new C49415ff();
                        if (bArr != null && bArr.length > 0) {
                            ffVar.parseFrom(bArr);
                        }
                        efVar.f132896n.add(ffVar);
                    }
                    return 0;
                case 9:
                    efVar.f132897o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
