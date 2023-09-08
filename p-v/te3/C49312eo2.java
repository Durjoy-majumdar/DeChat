package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eo2 */
public class C49312eo2 extends C101820nt3 {

    /* renamed from: d */
    public String f133036d;

    /* renamed from: e */
    public int f133037e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f133038f = new LinkedList<>();

    /* renamed from: g */
    public int f133039g;

    /* renamed from: h */
    public LinkedList<C51163rv3> f133040h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49312eo2)) {
            return false;
        }
        C49312eo2 eo22 = (C49312eo2) aVar;
        return C46238a.m51546a(this.BaseRequest, eo22.BaseRequest) && C46238a.m51546a(this.f133036d, eo22.f133036d) && C46238a.m51546a(Integer.valueOf(this.f133037e), Integer.valueOf(eo22.f133037e)) && C46238a.m51546a(this.f133038f, eo22.f133038f) && C46238a.m51546a(Integer.valueOf(this.f133039g), Integer.valueOf(eo22.f133039g)) && C46238a.m51546a(this.f133040h, eo22.f133040h);
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
            String str = this.f133036d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f133037e);
            aVar.mo74320g(4, 8, this.f133038f);
            aVar.mo74318e(5, this.f133039g);
            aVar.mo74320g(6, 8, this.f133040h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f133036d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f133037e) + C52418a.m58680g(4, 8, this.f133038f) + C52418a.m58678e(5, this.f133039g) + C52418a.m58680g(6, 8, this.f133040h);
        } else if (i == 2) {
            this.f133038f.clear();
            this.f133040h.clear();
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
            C49312eo2 eo22 = objArr[1];
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
                        eo22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    eo22.f133036d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eo22.f133037e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        eo22.f133038f.add(rv32);
                    }
                    return 0;
                case 5:
                    eo22.f133039g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv33 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv33.mo73356d(bArr3);
                        }
                        eo22.f133040h.add(rv33);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
