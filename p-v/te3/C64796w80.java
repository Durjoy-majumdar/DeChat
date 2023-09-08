package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w80 */
public class C64796w80 extends C47465a {

    /* renamed from: d */
    public C51937x80 f186063d;

    /* renamed from: e */
    public C64768v80 f186064e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64796w80)) {
            return false;
        }
        C64796w80 w802 = (C64796w80) aVar;
        return C46238a.m51546a(this.f186063d, w802.f186063d) && C46238a.m51546a(this.f186064e, w802.f186064e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51937x80 x802 = this.f186063d;
            if (x802 == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f186064e != null) {
                if (x802 != null) {
                    aVar.mo74322i(1, x802.computeSize());
                    this.f186063d.writeFields(aVar);
                }
                C64768v80 v802 = this.f186064e;
                if (v802 != null) {
                    aVar.mo74322i(2, v802.computeSize());
                    this.f186064e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i == 1) {
            C51937x80 x803 = this.f186063d;
            if (x803 != null) {
                i2 = 0 + C52418a.m58682i(1, x803.computeSize());
            }
            C64768v80 v803 = this.f186064e;
            return v803 != null ? i2 + C52418a.m58682i(2, v803.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186063d == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f186064e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64796w80 w802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51937x80 x804 = new C51937x80();
                    if (bArr != null && bArr.length > 0) {
                        x804.parseFrom(bArr);
                    }
                    w802.f186063d = x804;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64768v80 v804 = new C64768v80();
                    if (bArr2 != null && bArr2.length > 0) {
                        v804.parseFrom(bArr2);
                    }
                    w802.f186064e = v804;
                }
                return 0;
            }
        }
    }
}
