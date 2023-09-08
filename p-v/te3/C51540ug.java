package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ug */
public class C51540ug extends C101820nt3 {

    /* renamed from: d */
    public C89349b f142841d;

    /* renamed from: e */
    public int f142842e;

    /* renamed from: f */
    public int f142843f;

    /* renamed from: g */
    public String f142844g;

    /* renamed from: h */
    public int f142845h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51540ug)) {
            return false;
        }
        C51540ug ugVar = (C51540ug) aVar;
        return C46238a.m51546a(this.BaseRequest, ugVar.BaseRequest) && C46238a.m51546a(this.f142841d, ugVar.f142841d) && C46238a.m51546a(Integer.valueOf(this.f142842e), Integer.valueOf(ugVar.f142842e)) && C46238a.m51546a(Integer.valueOf(this.f142843f), Integer.valueOf(ugVar.f142843f)) && C46238a.m51546a(this.f142844g, ugVar.f142844g) && C46238a.m51546a(Integer.valueOf(this.f142845h), Integer.valueOf(ugVar.f142845h));
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
            C89349b bVar = this.f142841d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f142842e);
            aVar.mo74318e(4, this.f142843f);
            String str = this.f142844g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f142845h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f142841d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int e = i2 + C52418a.m58678e(3, this.f142842e) + C52418a.m58678e(4, this.f142843f);
            String str2 = this.f142844g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58678e(6, this.f142845h);
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
            C51540ug ugVar = objArr[1];
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
                        ugVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ugVar.f142841d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    ugVar.f142842e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ugVar.f142843f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ugVar.f142844g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ugVar.f142845h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
