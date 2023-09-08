package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dc0 */
public class C49123dc0 extends C101820nt3 {

    /* renamed from: d */
    public String f132226d;

    /* renamed from: e */
    public String f132227e;

    /* renamed from: f */
    public int f132228f;

    /* renamed from: g */
    public int f132229g;

    /* renamed from: h */
    public C89349b f132230h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49123dc0)) {
            return false;
        }
        C49123dc0 dc02 = (C49123dc0) aVar;
        return C46238a.m51546a(this.BaseRequest, dc02.BaseRequest) && C46238a.m51546a(this.f132226d, dc02.f132226d) && C46238a.m51546a(this.f132227e, dc02.f132227e) && C46238a.m51546a(Integer.valueOf(this.f132228f), Integer.valueOf(dc02.f132228f)) && C46238a.m51546a(Integer.valueOf(this.f132229g), Integer.valueOf(dc02.f132229g)) && C46238a.m51546a(this.f132230h, dc02.f132230h);
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
            String str = this.f132226d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f132227e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f132228f);
            aVar.mo74318e(5, this.f132229g);
            C89349b bVar = this.f132230h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132226d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f132227e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f132228f) + C52418a.m58678e(5, this.f132229g);
            C89349b bVar2 = this.f132230h;
            return bVar2 != null ? e + C52418a.m58675b(6, bVar2) : e;
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
            C49123dc0 dc02 = objArr[1];
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
                        dc02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dc02.f132226d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dc02.f132227e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dc02.f132228f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dc02.f132229g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dc02.f132230h = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
