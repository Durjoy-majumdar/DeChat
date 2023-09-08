package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xa2 */
public class C51947xa2 extends C101820nt3 {

    /* renamed from: d */
    public String f144561d;

    /* renamed from: e */
    public boolean f144562e;

    /* renamed from: f */
    public LinkedList<String> f144563f = new LinkedList<>();

    /* renamed from: g */
    public int f144564g;

    /* renamed from: h */
    public int f144565h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51947xa2)) {
            return false;
        }
        C51947xa2 xa22 = (C51947xa2) aVar;
        return C46238a.m51546a(this.BaseRequest, xa22.BaseRequest) && C46238a.m51546a(this.f144561d, xa22.f144561d) && C46238a.m51546a(Boolean.valueOf(this.f144562e), Boolean.valueOf(xa22.f144562e)) && C46238a.m51546a(this.f144563f, xa22.f144563f) && C46238a.m51546a(Integer.valueOf(this.f144564g), Integer.valueOf(xa22.f144564g)) && C46238a.m51546a(Integer.valueOf(this.f144565h), Integer.valueOf(xa22.f144565h));
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
            String str = this.f144561d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f144562e);
            aVar.mo74320g(4, 1, this.f144563f);
            aVar.mo74318e(5, this.f144564g);
            aVar.mo74318e(6, this.f144565h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f144561d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f144562e) + C52418a.m58680g(4, 1, this.f144563f) + C52418a.m58678e(5, this.f144564g) + C52418a.m58678e(6, this.f144565h);
        } else if (i == 2) {
            this.f144563f.clear();
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
            C51947xa2 xa22 = objArr[1];
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
                        xa22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xa22.f144561d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xa22.f144562e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    xa22.f144563f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    xa22.f144564g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xa22.f144565h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
