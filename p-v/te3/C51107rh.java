package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rh */
public class C51107rh extends C101820nt3 {

    /* renamed from: d */
    public int f140912d;

    /* renamed from: e */
    public String f140913e;

    /* renamed from: f */
    public int f140914f;

    /* renamed from: g */
    public int f140915g;

    /* renamed from: h */
    public C51694vh f140916h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51107rh)) {
            return false;
        }
        C51107rh rhVar = (C51107rh) aVar;
        return C46238a.m51546a(this.BaseRequest, rhVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140912d), Integer.valueOf(rhVar.f140912d)) && C46238a.m51546a(this.f140913e, rhVar.f140913e) && C46238a.m51546a(Integer.valueOf(this.f140914f), Integer.valueOf(rhVar.f140914f)) && C46238a.m51546a(Integer.valueOf(this.f140915g), Integer.valueOf(rhVar.f140915g)) && C46238a.m51546a(this.f140916h, rhVar.f140916h);
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
            aVar.mo74318e(2, this.f140912d);
            String str = this.f140913e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f140914f);
            aVar.mo74318e(5, this.f140915g);
            C51694vh vhVar = this.f140916h;
            if (vhVar != null) {
                aVar.mo74322i(6, vhVar.computeSize());
                this.f140916h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140912d);
            String str2 = this.f140913e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f140914f) + C52418a.m58678e(5, this.f140915g);
            C51694vh vhVar2 = this.f140916h;
            return vhVar2 != null ? e2 + C52418a.m58682i(6, vhVar2.computeSize()) : e2;
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
            C51107rh rhVar = objArr[1];
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
                        rhVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rhVar.f140912d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rhVar.f140913e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rhVar.f140914f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rhVar.f140915g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51694vh vhVar3 = new C51694vh();
                        if (bArr2 != null && bArr2.length > 0) {
                            vhVar3.parseFrom(bArr2);
                        }
                        rhVar.f140916h = vhVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
