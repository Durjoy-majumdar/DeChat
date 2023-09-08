package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tk1 */
public class C64730tk1 extends C47465a {

    /* renamed from: d */
    public String f185603d;

    /* renamed from: e */
    public int f185604e;

    /* renamed from: f */
    public String f185605f;

    /* renamed from: g */
    public String f185606g;

    /* renamed from: h */
    public C64609ok1 f185607h;

    /* renamed from: i */
    public String f185608i;

    /* renamed from: j */
    public C64258bf0 f185609j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64730tk1)) {
            return false;
        }
        C64730tk1 tk12 = (C64730tk1) aVar;
        return C46238a.m51546a(this.f185603d, tk12.f185603d) && C46238a.m51546a(Integer.valueOf(this.f185604e), Integer.valueOf(tk12.f185604e)) && C46238a.m51546a(this.f185605f, tk12.f185605f) && C46238a.m51546a(this.f185606g, tk12.f185606g) && C46238a.m51546a(this.f185607h, tk12.f185607h) && C46238a.m51546a(this.f185608i, tk12.f185608i) && C46238a.m51546a(this.f185609j, tk12.f185609j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185603d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185604e);
            String str2 = this.f185605f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185606g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C64609ok1 ok12 = this.f185607h;
            if (ok12 != null) {
                aVar.mo74322i(5, ok12.computeSize());
                this.f185607h.writeFields(aVar);
            }
            String str4 = this.f185608i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C64258bf0 bf02 = this.f185609j;
            if (bf02 != null) {
                aVar.mo74322i(7, bf02.computeSize());
                this.f185609j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f185603d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f185604e);
            String str6 = this.f185605f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f185606g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            C64609ok1 ok13 = this.f185607h;
            if (ok13 != null) {
                e += C52418a.m58682i(5, ok13.computeSize());
            }
            String str8 = this.f185608i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            C64258bf0 bf03 = this.f185609j;
            return bf03 != null ? e + C52418a.m58682i(7, bf03.computeSize()) : e;
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
            C64730tk1 tk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tk12.f185603d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tk12.f185604e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tk12.f185605f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tk12.f185606g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64609ok1 ok14 = new C64609ok1();
                        if (bArr != null && bArr.length > 0) {
                            ok14.parseFrom(bArr);
                        }
                        tk12.f185607h = ok14;
                    }
                    return 0;
                case 6:
                    tk12.f185608i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64258bf0 bf04 = new C64258bf0();
                        if (bArr2 != null && bArr2.length > 0) {
                            bf04.parseFrom(bArr2);
                        }
                        tk12.f185609j = bf04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
