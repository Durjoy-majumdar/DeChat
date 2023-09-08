package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hz1 */
public class C90415hz1 extends C47465a {

    /* renamed from: d */
    public int f259557d;

    /* renamed from: e */
    public String f259558e;

    /* renamed from: f */
    public String f259559f;

    /* renamed from: g */
    public int f259560g;

    /* renamed from: h */
    public int f259561h;

    /* renamed from: i */
    public boolean f259562i;

    /* renamed from: j */
    public boolean f259563j;

    /* renamed from: n */
    public C90424kt3 f259564n;

    /* renamed from: o */
    public String f259565o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90415hz1)) {
            return false;
        }
        C90415hz1 hz12 = (C90415hz1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f259557d), Integer.valueOf(hz12.f259557d)) && C46238a.m51546a(this.f259558e, hz12.f259558e) && C46238a.m51546a(this.f259559f, hz12.f259559f) && C46238a.m51546a(Integer.valueOf(this.f259560g), Integer.valueOf(hz12.f259560g)) && C46238a.m51546a(Integer.valueOf(this.f259561h), Integer.valueOf(hz12.f259561h)) && C46238a.m51546a(Boolean.valueOf(this.f259562i), Boolean.valueOf(hz12.f259562i)) && C46238a.m51546a(Boolean.valueOf(this.f259563j), Boolean.valueOf(hz12.f259563j)) && C46238a.m51546a(this.f259564n, hz12.f259564n) && C46238a.m51546a(this.f259565o, hz12.f259565o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f259557d);
            String str = this.f259558e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f259559f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f259560g);
            aVar.mo74318e(5, this.f259561h);
            aVar.mo74314a(6, this.f259562i);
            aVar.mo74314a(7, this.f259563j);
            C90424kt3 kt32 = this.f259564n;
            if (kt32 != null) {
                aVar.mo74322i(20, kt32.computeSize());
                this.f259564n.writeFields(aVar);
            }
            String str3 = this.f259565o;
            if (str3 != null) {
                aVar.mo74323j(21, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f259557d) + 0;
            String str4 = this.f259558e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f259559f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f259560g) + C52418a.m58678e(5, this.f259561h) + C52418a.m58674a(6, this.f259562i) + C52418a.m58674a(7, this.f259563j);
            C90424kt3 kt33 = this.f259564n;
            if (kt33 != null) {
                e2 += C52418a.m58682i(20, kt33.computeSize());
            }
            String str6 = this.f259565o;
            return str6 != null ? e2 + C52418a.m58683j(21, str6) : e2;
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
            C90415hz1 hz12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 20) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C90424kt3 kt34 = new C90424kt3();
                    if (bArr != null && bArr.length > 0) {
                        kt34.parseFrom(bArr);
                    }
                    hz12.f259564n = kt34;
                }
                return 0;
            } else if (intValue != 21) {
                switch (intValue) {
                    case 1:
                        hz12.f259557d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        hz12.f259558e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        hz12.f259559f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        hz12.f259560g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        hz12.f259561h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        hz12.f259562i = aVar3.mo141625c(intValue);
                        return 0;
                    case 7:
                        hz12.f259563j = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                hz12.f259565o = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
