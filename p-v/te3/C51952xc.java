package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xc */
public class C51952xc extends C101820nt3 {

    /* renamed from: d */
    public int f144581d;

    /* renamed from: e */
    public String f144582e;

    /* renamed from: f */
    public int f144583f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51952xc)) {
            return false;
        }
        C51952xc xcVar = (C51952xc) aVar;
        return C46238a.m51546a(this.BaseRequest, xcVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f144581d), Integer.valueOf(xcVar.f144581d)) && C46238a.m51546a(this.f144582e, xcVar.f144582e) && C46238a.m51546a(Integer.valueOf(this.f144583f), Integer.valueOf(xcVar.f144583f));
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
            aVar.mo74318e(2, this.f144581d);
            String str = this.f144582e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f144583f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144581d);
            String str2 = this.f144582e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f144583f);
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
            C51952xc xcVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    xcVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xcVar.f144581d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xcVar.f144582e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xcVar.f144583f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
