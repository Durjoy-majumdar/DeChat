package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ja2 */
public class C64462ja2 extends C101820nt3 {

    /* renamed from: d */
    public String f183768d;

    /* renamed from: e */
    public int f183769e;

    /* renamed from: f */
    public String f183770f;

    /* renamed from: g */
    public int f183771g;

    /* renamed from: h */
    public String f183772h;

    /* renamed from: i */
    public String f183773i;

    /* renamed from: j */
    public int f183774j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64462ja2)) {
            return false;
        }
        C64462ja2 ja22 = (C64462ja2) aVar;
        return C46238a.m51546a(this.BaseRequest, ja22.BaseRequest) && C46238a.m51546a(this.f183768d, ja22.f183768d) && C46238a.m51546a(Integer.valueOf(this.f183769e), Integer.valueOf(ja22.f183769e)) && C46238a.m51546a(this.f183770f, ja22.f183770f) && C46238a.m51546a(Integer.valueOf(this.f183771g), Integer.valueOf(ja22.f183771g)) && C46238a.m51546a(this.f183772h, ja22.f183772h) && C46238a.m51546a(this.f183773i, ja22.f183773i) && C46238a.m51546a(Integer.valueOf(this.f183774j), Integer.valueOf(ja22.f183774j));
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
            String str = this.f183768d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f183769e);
            String str2 = this.f183770f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f183771g);
            String str3 = this.f183772h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f183773i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f183774j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f183768d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f183769e);
            String str6 = this.f183770f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f183771g);
            String str7 = this.f183772h;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            String str8 = this.f183773i;
            if (str8 != null) {
                e2 += C52418a.m58683j(7, str8);
            }
            return e2 + C52418a.m58678e(8, this.f183774j);
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
            C64462ja2 ja22 = objArr[1];
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
                        ja22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ja22.f183768d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ja22.f183769e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ja22.f183770f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ja22.f183771g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ja22.f183772h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ja22.f183773i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ja22.f183774j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
