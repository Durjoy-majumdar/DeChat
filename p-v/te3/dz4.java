package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dz4 extends C47465a {

    /* renamed from: d */
    public int f132590d;

    /* renamed from: e */
    public ez4 f132591e;

    /* renamed from: f */
    public String f132592f;

    /* renamed from: g */
    public String f132593g;

    /* renamed from: h */
    public String f132594h;

    /* renamed from: i */
    public String f132595i;

    /* renamed from: j */
    public String f132596j;

    /* renamed from: n */
    public String f132597n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dz4)) {
            return false;
        }
        dz4 dz4 = (dz4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132590d), Integer.valueOf(dz4.f132590d)) && C46238a.m51546a(this.f132591e, dz4.f132591e) && C46238a.m51546a(this.f132592f, dz4.f132592f) && C46238a.m51546a(this.f132593g, dz4.f132593g) && C46238a.m51546a(this.f132594h, dz4.f132594h) && C46238a.m51546a(this.f132595i, dz4.f132595i) && C46238a.m51546a(this.f132596j, dz4.f132596j) && C46238a.m51546a(this.f132597n, dz4.f132597n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132590d);
            ez4 ez4 = this.f132591e;
            if (ez4 != null) {
                aVar.mo74322i(2, ez4.computeSize());
                this.f132591e.writeFields(aVar);
            }
            String str = this.f132592f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132593g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f132594h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f132595i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f132596j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f132597n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132590d) + 0;
            ez4 ez42 = this.f132591e;
            if (ez42 != null) {
                e += C52418a.m58682i(2, ez42.computeSize());
            }
            String str7 = this.f132592f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f132593g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f132594h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f132595i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f132596j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f132597n;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            dz4 dz4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dz4.f132590d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ez4 ez43 = new ez4();
                        if (bArr != null && bArr.length > 0) {
                            ez43.parseFrom(bArr);
                        }
                        dz4.f132591e = ez43;
                    }
                    return 0;
                case 3:
                    dz4.f132592f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dz4.f132593g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dz4.f132594h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dz4.f132595i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dz4.f132596j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dz4.f132597n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
