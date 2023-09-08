package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ly0 */
public class C50326ly0 extends C47465a {

    /* renamed from: d */
    public String f137706d;

    /* renamed from: e */
    public boolean f137707e;

    /* renamed from: f */
    public int f137708f;

    /* renamed from: g */
    public String f137709g;

    /* renamed from: h */
    public boolean f137710h;

    /* renamed from: i */
    public int f137711i;

    /* renamed from: j */
    public int f137712j;

    /* renamed from: n */
    public C50689oj f137713n;

    /* renamed from: o */
    public boolean f137714o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50326ly0)) {
            return false;
        }
        C50326ly0 ly02 = (C50326ly0) aVar;
        return C46238a.m51546a(this.f137706d, ly02.f137706d) && C46238a.m51546a(Boolean.valueOf(this.f137707e), Boolean.valueOf(ly02.f137707e)) && C46238a.m51546a(Integer.valueOf(this.f137708f), Integer.valueOf(ly02.f137708f)) && C46238a.m51546a(this.f137709g, ly02.f137709g) && C46238a.m51546a(Boolean.valueOf(this.f137710h), Boolean.valueOf(ly02.f137710h)) && C46238a.m51546a(Integer.valueOf(this.f137711i), Integer.valueOf(ly02.f137711i)) && C46238a.m51546a(Integer.valueOf(this.f137712j), Integer.valueOf(ly02.f137712j)) && C46238a.m51546a(this.f137713n, ly02.f137713n) && C46238a.m51546a(Boolean.valueOf(this.f137714o), Boolean.valueOf(ly02.f137714o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137706d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f137707e);
            aVar.mo74318e(3, this.f137708f);
            String str2 = this.f137709g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f137710h);
            aVar.mo74318e(6, this.f137711i);
            aVar.mo74318e(7, this.f137712j);
            C50689oj ojVar = this.f137713n;
            if (ojVar != null) {
                aVar.mo74322i(8, ojVar.computeSize());
                this.f137713n.writeFields(aVar);
            }
            aVar.mo74314a(9, this.f137714o);
            return 0;
        } else if (i == 1) {
            String str3 = this.f137706d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int a = i2 + C52418a.m58674a(2, this.f137707e) + C52418a.m58678e(3, this.f137708f);
            String str4 = this.f137709g;
            if (str4 != null) {
                a += C52418a.m58683j(4, str4);
            }
            int a2 = a + C52418a.m58674a(5, this.f137710h) + C52418a.m58678e(6, this.f137711i) + C52418a.m58678e(7, this.f137712j);
            C50689oj ojVar2 = this.f137713n;
            if (ojVar2 != null) {
                a2 += C52418a.m58682i(8, ojVar2.computeSize());
            }
            return a2 + C52418a.m58674a(9, this.f137714o);
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
            C50326ly0 ly02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ly02.f137706d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ly02.f137707e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    ly02.f137708f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ly02.f137709g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ly02.f137710h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    ly02.f137711i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ly02.f137712j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50689oj ojVar3 = new C50689oj();
                        if (bArr != null && bArr.length > 0) {
                            ojVar3.parseFrom(bArr);
                        }
                        ly02.f137713n = ojVar3;
                    }
                    return 0;
                case 9:
                    ly02.f137714o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
