package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ht2 */
public class C101785ht2 extends C47465a {

    /* renamed from: d */
    public String f298354d;

    /* renamed from: e */
    public int f298355e;

    /* renamed from: f */
    public String f298356f;

    /* renamed from: g */
    public String f298357g;

    /* renamed from: h */
    public String f298358h;

    /* renamed from: i */
    public String f298359i;

    /* renamed from: j */
    public String f298360j;

    /* renamed from: n */
    public int f298361n;

    /* renamed from: o */
    public int f298362o;

    /* renamed from: p */
    public C101764ch2 f298363p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101785ht2)) {
            return false;
        }
        C101785ht2 ht22 = (C101785ht2) aVar;
        return C46238a.m51546a(this.f298354d, ht22.f298354d) && C46238a.m51546a(Integer.valueOf(this.f298355e), Integer.valueOf(ht22.f298355e)) && C46238a.m51546a(this.f298356f, ht22.f298356f) && C46238a.m51546a(this.f298357g, ht22.f298357g) && C46238a.m51546a(this.f298358h, ht22.f298358h) && C46238a.m51546a(this.f298359i, ht22.f298359i) && C46238a.m51546a(this.f298360j, ht22.f298360j) && C46238a.m51546a(Integer.valueOf(this.f298361n), Integer.valueOf(ht22.f298361n)) && C46238a.m51546a(Integer.valueOf(this.f298362o), Integer.valueOf(ht22.f298362o)) && C46238a.m51546a(this.f298363p, ht22.f298363p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298354d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f298355e);
            String str2 = this.f298356f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298357g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298358h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298359i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f298360j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f298361n);
            aVar.mo74318e(9, this.f298362o);
            C101764ch2 ch22 = this.f298363p;
            if (ch22 != null) {
                aVar.mo74322i(10, ch22.computeSize());
                this.f298363p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f298354d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.f298355e);
            String str8 = this.f298356f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f298357g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f298358h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f298359i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f298360j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            int e2 = e + C52418a.m58678e(8, this.f298361n) + C52418a.m58678e(9, this.f298362o);
            C101764ch2 ch23 = this.f298363p;
            return ch23 != null ? e2 + C52418a.m58682i(10, ch23.computeSize()) : e2;
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
            C101785ht2 ht22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ht22.f298354d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ht22.f298355e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ht22.f298356f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ht22.f298357g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ht22.f298358h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ht22.f298359i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ht22.f298360j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ht22.f298361n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ht22.f298362o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101764ch2 ch24 = new C101764ch2();
                        if (bArr != null && bArr.length > 0) {
                            ch24.parseFrom(bArr);
                        }
                        ht22.f298363p = ch24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
