package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dt2 */
public class C101771dt2 extends C47465a {

    /* renamed from: d */
    public String f298128d;

    /* renamed from: e */
    public String f298129e;

    /* renamed from: f */
    public int f298130f;

    /* renamed from: g */
    public String f298131g;

    /* renamed from: h */
    public String f298132h;

    /* renamed from: i */
    public String f298133i;

    /* renamed from: j */
    public String f298134j;

    /* renamed from: n */
    public String f298135n;

    /* renamed from: o */
    public int f298136o;

    /* renamed from: p */
    public int f298137p;

    /* renamed from: q */
    public C101764ch2 f298138q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101771dt2)) {
            return false;
        }
        C101771dt2 dt22 = (C101771dt2) aVar;
        return C46238a.m51546a(this.f298128d, dt22.f298128d) && C46238a.m51546a(this.f298129e, dt22.f298129e) && C46238a.m51546a(Integer.valueOf(this.f298130f), Integer.valueOf(dt22.f298130f)) && C46238a.m51546a(this.f298131g, dt22.f298131g) && C46238a.m51546a(this.f298132h, dt22.f298132h) && C46238a.m51546a(this.f298133i, dt22.f298133i) && C46238a.m51546a(this.f298134j, dt22.f298134j) && C46238a.m51546a(this.f298135n, dt22.f298135n) && C46238a.m51546a(Integer.valueOf(this.f298136o), Integer.valueOf(dt22.f298136o)) && C46238a.m51546a(Integer.valueOf(this.f298137p), Integer.valueOf(dt22.f298137p)) && C46238a.m51546a(this.f298138q, dt22.f298138q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298128d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298129e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298130f);
            String str3 = this.f298131g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298132h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298133i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f298134j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f298135n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f298136o);
            aVar.mo74318e(10, this.f298137p);
            C101764ch2 ch22 = this.f298138q;
            if (ch22 != null) {
                aVar.mo74322i(11, ch22.computeSize());
                this.f298138q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f298128d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f298129e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f298130f);
            String str10 = this.f298131g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f298132h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f298133i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f298134j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f298135n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            int e2 = e + C52418a.m58678e(9, this.f298136o) + C52418a.m58678e(10, this.f298137p);
            C101764ch2 ch23 = this.f298138q;
            return ch23 != null ? e2 + C52418a.m58682i(11, ch23.computeSize()) : e2;
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
            C101771dt2 dt22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dt22.f298128d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dt22.f298129e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dt22.f298130f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dt22.f298131g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dt22.f298132h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dt22.f298133i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dt22.f298134j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dt22.f298135n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dt22.f298136o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    dt22.f298137p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101764ch2 ch24 = new C101764ch2();
                        if (bArr != null && bArr.length > 0) {
                            ch24.parseFrom(bArr);
                        }
                        dt22.f298138q = ch24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
