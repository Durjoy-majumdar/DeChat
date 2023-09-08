package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qt2 */
public class C51012qt2 extends C101820nt3 {

    /* renamed from: d */
    public int f140541d;

    /* renamed from: e */
    public String f140542e;

    /* renamed from: f */
    public C89349b f140543f;

    /* renamed from: g */
    public int f140544g;

    /* renamed from: h */
    public int f140545h;

    /* renamed from: i */
    public int f140546i;

    /* renamed from: j */
    public int f140547j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51012qt2)) {
            return false;
        }
        C51012qt2 qt22 = (C51012qt2) aVar;
        return C46238a.m51546a(this.BaseRequest, qt22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140541d), Integer.valueOf(qt22.f140541d)) && C46238a.m51546a(this.f140542e, qt22.f140542e) && C46238a.m51546a(this.f140543f, qt22.f140543f) && C46238a.m51546a(Integer.valueOf(this.f140544g), Integer.valueOf(qt22.f140544g)) && C46238a.m51546a(Integer.valueOf(this.f140545h), Integer.valueOf(qt22.f140545h)) && C46238a.m51546a(Integer.valueOf(this.f140546i), Integer.valueOf(qt22.f140546i)) && C46238a.m51546a(Integer.valueOf(this.f140547j), Integer.valueOf(qt22.f140547j));
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
            aVar.mo74318e(2, this.f140541d);
            String str = this.f140542e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f140543f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f140544g);
            aVar.mo74318e(6, this.f140545h);
            aVar.mo74318e(7, this.f140546i);
            aVar.mo74318e(8, this.f140547j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140541d);
            String str2 = this.f140542e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f140543f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f140544g) + C52418a.m58678e(6, this.f140545h) + C52418a.m58678e(7, this.f140546i) + C52418a.m58678e(8, this.f140547j);
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
            C51012qt2 qt22 = objArr[1];
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
                        qt22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qt22.f140541d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qt22.f140542e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qt22.f140543f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    qt22.f140544g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qt22.f140545h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qt22.f140546i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qt22.f140547j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
