package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iu1 */
public class C49898iu1 extends C101820nt3 {

    /* renamed from: d */
    public long f135671d;

    /* renamed from: e */
    public String f135672e;

    /* renamed from: f */
    public int f135673f;

    /* renamed from: g */
    public String f135674g;

    /* renamed from: h */
    public int f135675h;

    /* renamed from: i */
    public int f135676i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49898iu1)) {
            return false;
        }
        C49898iu1 iu12 = (C49898iu1) aVar;
        return C46238a.m51546a(this.BaseRequest, iu12.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f135671d), Long.valueOf(iu12.f135671d)) && C46238a.m51546a(this.f135672e, iu12.f135672e) && C46238a.m51546a(Integer.valueOf(this.f135673f), Integer.valueOf(iu12.f135673f)) && C46238a.m51546a(this.f135674g, iu12.f135674g) && C46238a.m51546a(Integer.valueOf(this.f135675h), Integer.valueOf(iu12.f135675h)) && C46238a.m51546a(Integer.valueOf(this.f135676i), Integer.valueOf(iu12.f135676i));
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
            aVar.mo74321h(2, this.f135671d);
            String str = this.f135672e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f135673f);
            String str2 = this.f135674g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f135675h);
            aVar.mo74318e(7, this.f135676i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f135671d);
            String str3 = this.f135672e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int e = h + C52418a.m58678e(4, this.f135673f);
            String str4 = this.f135674g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f135675h) + C52418a.m58678e(7, this.f135676i);
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
            C49898iu1 iu12 = objArr[1];
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
                        iu12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    iu12.f135671d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    iu12.f135672e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    iu12.f135673f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    iu12.f135674g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    iu12.f135675h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    iu12.f135676i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
