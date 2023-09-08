package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v94 extends C101820nt3 {

    /* renamed from: d */
    public int f143399d;

    /* renamed from: e */
    public String f143400e;

    /* renamed from: f */
    public String f143401f;

    /* renamed from: g */
    public int f143402g;

    /* renamed from: h */
    public int f143403h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v94)) {
            return false;
        }
        v94 v94 = (v94) aVar;
        return C46238a.m51546a(this.BaseRequest, v94.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f143399d), Integer.valueOf(v94.f143399d)) && C46238a.m51546a(this.f143400e, v94.f143400e) && C46238a.m51546a(this.f143401f, v94.f143401f) && C46238a.m51546a(Integer.valueOf(this.f143402g), Integer.valueOf(v94.f143402g)) && C46238a.m51546a(Integer.valueOf(this.f143403h), Integer.valueOf(v94.f143403h));
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
            aVar.mo74318e(2, this.f143399d);
            String str = this.f143400e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f143401f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f143402g);
            aVar.mo74318e(6, this.f143403h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143399d);
            String str3 = this.f143400e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f143401f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f143402g) + C52418a.m58678e(6, this.f143403h);
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
            v94 v94 = objArr[1];
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
                        v94.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    v94.f143399d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    v94.f143400e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v94.f143401f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    v94.f143402g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    v94.f143403h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
