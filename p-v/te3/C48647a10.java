package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a10 */
public class C48647a10 extends C101820nt3 {

    /* renamed from: d */
    public String f130196d;

    /* renamed from: e */
    public long f130197e;

    /* renamed from: f */
    public String f130198f;

    /* renamed from: g */
    public String f130199g;

    /* renamed from: h */
    public int f130200h;

    /* renamed from: i */
    public String f130201i;

    /* renamed from: j */
    public boolean f130202j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48647a10)) {
            return false;
        }
        C48647a10 a102 = (C48647a10) aVar;
        return C46238a.m51546a(this.BaseRequest, a102.BaseRequest) && C46238a.m51546a(this.f130196d, a102.f130196d) && C46238a.m51546a(Long.valueOf(this.f130197e), Long.valueOf(a102.f130197e)) && C46238a.m51546a(this.f130198f, a102.f130198f) && C46238a.m51546a(this.f130199g, a102.f130199g) && C46238a.m51546a(Integer.valueOf(this.f130200h), Integer.valueOf(a102.f130200h)) && C46238a.m51546a(this.f130201i, a102.f130201i) && C46238a.m51546a(Boolean.valueOf(this.f130202j), Boolean.valueOf(a102.f130202j));
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
            String str = this.f130196d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f130197e);
            String str2 = this.f130198f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f130199g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f130200h);
            String str4 = this.f130201i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74314a(8, this.f130202j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f130196d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f130197e);
            String str6 = this.f130198f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f130199g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            int e = h + C52418a.m58678e(6, this.f130200h);
            String str8 = this.f130201i;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            return e + C52418a.m58674a(8, this.f130202j);
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
            C48647a10 a102 = objArr[1];
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
                        a102.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    a102.f130196d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a102.f130197e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    a102.f130198f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    a102.f130199g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a102.f130200h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a102.f130201i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    a102.f130202j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
