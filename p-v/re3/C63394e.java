package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.e */
public class C63394e extends C47465a {

    /* renamed from: d */
    public int f179828d;

    /* renamed from: e */
    public int f179829e;

    /* renamed from: f */
    public int f179830f;

    /* renamed from: g */
    public LinkedList<C63393d> f179831g = new LinkedList<>();

    /* renamed from: h */
    public String f179832h;

    /* renamed from: i */
    public String f179833i;

    /* renamed from: j */
    public String f179834j;

    /* renamed from: n */
    public String f179835n;

    /* renamed from: o */
    public String f179836o;

    /* renamed from: p */
    public int f179837p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63394e)) {
            return false;
        }
        C63394e eVar = (C63394e) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179828d), Integer.valueOf(eVar.f179828d)) && C46238a.m51546a(Integer.valueOf(this.f179829e), Integer.valueOf(eVar.f179829e)) && C46238a.m51546a(Integer.valueOf(this.f179830f), Integer.valueOf(eVar.f179830f)) && C46238a.m51546a(this.f179831g, eVar.f179831g) && C46238a.m51546a(this.f179832h, eVar.f179832h) && C46238a.m51546a(this.f179833i, eVar.f179833i) && C46238a.m51546a(this.f179834j, eVar.f179834j) && C46238a.m51546a(this.f179835n, eVar.f179835n) && C46238a.m51546a(this.f179836o, eVar.f179836o) && C46238a.m51546a(Integer.valueOf(this.f179837p), Integer.valueOf(eVar.f179837p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179828d);
            aVar.mo74318e(2, this.f179829e);
            aVar.mo74318e(3, this.f179830f);
            aVar.mo74320g(4, 8, this.f179831g);
            String str = this.f179832h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f179833i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f179834j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f179835n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f179836o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f179837p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179828d) + 0 + C52418a.m58678e(2, this.f179829e) + C52418a.m58678e(3, this.f179830f) + C52418a.m58680g(4, 8, this.f179831g);
            String str6 = this.f179832h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f179833i;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f179834j;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f179835n;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f179836o;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            return e + C52418a.m58678e(10, this.f179837p);
        } else if (i == 2) {
            this.f179831g.clear();
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
            C63394e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eVar.f179828d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    eVar.f179829e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    eVar.f179830f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C63393d dVar = new C63393d();
                        if (bArr != null && bArr.length > 0) {
                            dVar.parseFrom(bArr);
                        }
                        eVar.f179831g.add(dVar);
                    }
                    return 0;
                case 5:
                    eVar.f179832h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eVar.f179833i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eVar.f179834j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    eVar.f179835n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    eVar.f179836o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    eVar.f179837p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
