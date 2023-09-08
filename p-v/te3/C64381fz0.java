package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fz0 */
public class C64381fz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f183257d;

    /* renamed from: e */
    public String f183258e;

    /* renamed from: f */
    public String f183259f;

    /* renamed from: g */
    public String f183260g;

    /* renamed from: h */
    public String f183261h;

    /* renamed from: i */
    public int f183262i;

    /* renamed from: j */
    public int f183263j;

    /* renamed from: n */
    public int f183264n;

    /* renamed from: o */
    public String f183265o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64381fz0)) {
            return false;
        }
        C64381fz0 fz02 = (C64381fz0) aVar;
        return C46238a.m51546a(this.BaseRequest, fz02.BaseRequest) && C46238a.m51546a(this.f183257d, fz02.f183257d) && C46238a.m51546a(this.f183258e, fz02.f183258e) && C46238a.m51546a(this.f183259f, fz02.f183259f) && C46238a.m51546a(this.f183260g, fz02.f183260g) && C46238a.m51546a(this.f183261h, fz02.f183261h) && C46238a.m51546a(Integer.valueOf(this.f183262i), Integer.valueOf(fz02.f183262i)) && C46238a.m51546a(Integer.valueOf(this.f183263j), Integer.valueOf(fz02.f183263j)) && C46238a.m51546a(Integer.valueOf(this.f183264n), Integer.valueOf(fz02.f183264n)) && C46238a.m51546a(this.f183265o, fz02.f183265o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f183257d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f183257d.writeFields(aVar);
            }
            String str = this.f183258e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f183259f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f183260g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183261h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f183262i);
            aVar.mo74318e(8, this.f183263j);
            aVar.mo74318e(9, this.f183264n);
            String str5 = this.f183265o;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f183257d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str6 = this.f183258e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f183259f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f183260g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f183261h;
            if (str9 != null) {
                i2 += C52418a.m58683j(6, str9);
            }
            int e = i2 + C52418a.m58678e(7, this.f183262i) + C52418a.m58678e(8, this.f183263j) + C52418a.m58678e(9, this.f183264n);
            String str10 = this.f183265o;
            return str10 != null ? e + C52418a.m58683j(10, str10) : e;
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
            C64381fz0 fz02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        fz02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        fz02.f183257d = ig04;
                    }
                    return 0;
                case 3:
                    fz02.f183258e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fz02.f183259f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fz02.f183260g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fz02.f183261h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fz02.f183262i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    fz02.f183263j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fz02.f183264n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    fz02.f183265o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
