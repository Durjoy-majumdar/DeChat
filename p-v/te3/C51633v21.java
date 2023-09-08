package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v21 */
public class C51633v21 extends C47465a {

    /* renamed from: d */
    public int f143256d;

    /* renamed from: e */
    public String f143257e;

    /* renamed from: f */
    public String f143258f;

    /* renamed from: g */
    public int f143259g;

    /* renamed from: h */
    public String f143260h;

    /* renamed from: i */
    public int f143261i;

    /* renamed from: j */
    public LinkedList<C48979cb1> f143262j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51633v21)) {
            return false;
        }
        C51633v21 v212 = (C51633v21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143256d), Integer.valueOf(v212.f143256d)) && C46238a.m51546a(this.f143257e, v212.f143257e) && C46238a.m51546a(this.f143258f, v212.f143258f) && C46238a.m51546a(Integer.valueOf(this.f143259g), Integer.valueOf(v212.f143259g)) && C46238a.m51546a(this.f143260h, v212.f143260h) && C46238a.m51546a(Integer.valueOf(this.f143261i), Integer.valueOf(v212.f143261i)) && C46238a.m51546a(this.f143262j, v212.f143262j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143256d);
            String str = this.f143257e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143258f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f143259g);
            String str3 = this.f143260h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f143261i);
            aVar.mo74320g(7, 8, this.f143262j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143256d) + 0;
            String str4 = this.f143257e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f143258f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f143259g);
            String str6 = this.f143260h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f143261i) + C52418a.m58680g(7, 8, this.f143262j);
        } else if (i == 2) {
            this.f143262j.clear();
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
            C51633v21 v212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v212.f143256d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    v212.f143257e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v212.f143258f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v212.f143259g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    v212.f143260h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v212.f143261i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48979cb1 cb12 = new C48979cb1();
                        if (bArr != null && bArr.length > 0) {
                            cb12.parseFrom(bArr);
                        }
                        v212.f143262j.add(cb12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
