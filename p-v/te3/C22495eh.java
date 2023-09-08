package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eh */
public class C22495eh extends C47465a {

    /* renamed from: d */
    public int f63793d;

    /* renamed from: e */
    public String f63794e;

    /* renamed from: f */
    public String f63795f;

    /* renamed from: g */
    public String f63796g;

    /* renamed from: h */
    public String f63797h;

    /* renamed from: i */
    public String f63798i;

    /* renamed from: j */
    public String f63799j;

    /* renamed from: n */
    public LinkedList<C22493dh> f63800n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<String> f63801o = new LinkedList<>();

    /* renamed from: p */
    public int f63802p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22495eh)) {
            return false;
        }
        C22495eh ehVar = (C22495eh) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f63793d), Integer.valueOf(ehVar.f63793d)) && C46238a.m51546a(this.f63794e, ehVar.f63794e) && C46238a.m51546a(this.f63795f, ehVar.f63795f) && C46238a.m51546a(this.f63796g, ehVar.f63796g) && C46238a.m51546a(this.f63797h, ehVar.f63797h) && C46238a.m51546a(this.f63798i, ehVar.f63798i) && C46238a.m51546a(this.f63799j, ehVar.f63799j) && C46238a.m51546a(this.f63800n, ehVar.f63800n) && C46238a.m51546a(this.f63801o, ehVar.f63801o) && C46238a.m51546a(Integer.valueOf(this.f63802p), Integer.valueOf(ehVar.f63802p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f63793d);
            String str = this.f63794e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f63795f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f63796g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f63797h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f63798i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f63799j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74320g(8, 8, this.f63800n);
            aVar.mo74320g(9, 1, this.f63801o);
            aVar.mo74318e(10, this.f63802p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f63793d) + 0;
            String str7 = this.f63794e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            String str8 = this.f63795f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f63796g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f63797h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f63798i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f63799j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            return e + C52418a.m58680g(8, 8, this.f63800n) + C52418a.m58680g(9, 1, this.f63801o) + C52418a.m58678e(10, this.f63802p);
        } else if (i == 2) {
            this.f63800n.clear();
            this.f63801o.clear();
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
            C22495eh ehVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ehVar.f63793d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ehVar.f63794e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ehVar.f63795f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ehVar.f63796g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ehVar.f63797h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ehVar.f63798i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ehVar.f63799j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C22493dh dhVar = new C22493dh();
                        if (bArr != null && bArr.length > 0) {
                            dhVar.parseFrom(bArr);
                        }
                        ehVar.f63800n.add(dhVar);
                    }
                    return 0;
                case 9:
                    ehVar.f63801o.add(aVar3.mo141633k(intValue));
                    return 0;
                case 10:
                    ehVar.f63802p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
