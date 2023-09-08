package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.d */
public class C77821d extends C47465a {

    /* renamed from: d */
    public int f226719d;

    /* renamed from: e */
    public String f226720e;

    /* renamed from: f */
    public String f226721f;

    /* renamed from: g */
    public String f226722g;

    /* renamed from: h */
    public long f226723h;

    /* renamed from: i */
    public String f226724i;

    /* renamed from: j */
    public int f226725j;

    /* renamed from: n */
    public C77825h f226726n;

    /* renamed from: o */
    public String f226727o;

    /* renamed from: p */
    public String f226728p;

    /* renamed from: q */
    public String f226729q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77821d)) {
            return false;
        }
        C77821d dVar = (C77821d) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f226719d), Integer.valueOf(dVar.f226719d)) && C46238a.m51546a(this.f226720e, dVar.f226720e) && C46238a.m51546a(this.f226721f, dVar.f226721f) && C46238a.m51546a(this.f226722g, dVar.f226722g) && C46238a.m51546a(Long.valueOf(this.f226723h), Long.valueOf(dVar.f226723h)) && C46238a.m51546a(this.f226724i, dVar.f226724i) && C46238a.m51546a(Integer.valueOf(this.f226725j), Integer.valueOf(dVar.f226725j)) && C46238a.m51546a(this.f226726n, dVar.f226726n) && C46238a.m51546a(this.f226727o, dVar.f226727o) && C46238a.m51546a(this.f226728p, dVar.f226728p) && C46238a.m51546a(this.f226729q, dVar.f226729q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f226719d);
            String str = this.f226720e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f226721f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f226722g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f226723h);
            String str4 = this.f226724i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f226725j);
            C77825h hVar = this.f226726n;
            if (hVar != null) {
                aVar.mo74322i(9, hVar.computeSize());
                this.f226726n.writeFields(aVar);
            }
            String str5 = this.f226727o;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f226728p;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            String str7 = this.f226729q;
            if (str7 != null) {
                aVar.mo74323j(12, str7);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f226719d) + 0;
            String str8 = this.f226720e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f226721f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f226722g;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int h = e + C52418a.m58681h(6, this.f226723h);
            String str11 = this.f226724i;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            int e2 = h + C52418a.m58678e(8, this.f226725j);
            C77825h hVar2 = this.f226726n;
            if (hVar2 != null) {
                e2 += C52418a.m58682i(9, hVar2.computeSize());
            }
            String str12 = this.f226727o;
            if (str12 != null) {
                e2 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f226728p;
            if (str13 != null) {
                e2 += C52418a.m58683j(11, str13);
            }
            String str14 = this.f226729q;
            return str14 != null ? e2 + C52418a.m58683j(12, str14) : e2;
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
            C77821d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dVar.f226719d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dVar.f226720e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dVar.f226721f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dVar.f226722g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dVar.f226723h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    dVar.f226724i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dVar.f226725j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C77825h hVar3 = new C77825h();
                        if (bArr != null && bArr.length > 0) {
                            hVar3.parseFrom(bArr);
                        }
                        dVar.f226726n = hVar3;
                    }
                    return 0;
                case 10:
                    dVar.f226727o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dVar.f226728p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    dVar.f226729q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
