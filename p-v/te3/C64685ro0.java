package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ro0 */
public class C64685ro0 extends C101820nt3 {

    /* renamed from: d */
    public int f185207d;

    /* renamed from: e */
    public C89349b f185208e;

    /* renamed from: f */
    public String f185209f;

    /* renamed from: g */
    public int f185210g;

    /* renamed from: h */
    public C49842ig0 f185211h;

    /* renamed from: i */
    public int f185212i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64685ro0)) {
            return false;
        }
        C64685ro0 ro02 = (C64685ro0) aVar;
        return C46238a.m51546a(this.BaseRequest, ro02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f185207d), Integer.valueOf(ro02.f185207d)) && C46238a.m51546a(this.f185208e, ro02.f185208e) && C46238a.m51546a(this.f185209f, ro02.f185209f) && C46238a.m51546a(Integer.valueOf(this.f185210g), Integer.valueOf(ro02.f185210g)) && C46238a.m51546a(this.f185211h, ro02.f185211h) && C46238a.m51546a(Integer.valueOf(this.f185212i), Integer.valueOf(ro02.f185212i));
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
            aVar.mo74318e(2, this.f185207d);
            C89349b bVar = this.f185208e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f185209f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f185210g);
            C49842ig0 ig02 = this.f185211h;
            if (ig02 != null) {
                aVar.mo74322i(6, ig02.computeSize());
                this.f185211h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f185212i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185207d);
            C89349b bVar2 = this.f185208e;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            String str2 = this.f185209f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            int e2 = e + C52418a.m58678e(5, this.f185210g);
            C49842ig0 ig03 = this.f185211h;
            if (ig03 != null) {
                e2 += C52418a.m58682i(6, ig03.computeSize());
            }
            return e2 + C52418a.m58678e(7, this.f185212i);
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
            C64685ro0 ro02 = objArr[1];
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
                        ro02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ro02.f185207d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ro02.f185208e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ro02.f185209f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ro02.f185210g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        ro02.f185211h = ig04;
                    }
                    return 0;
                case 7:
                    ro02.f185212i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
