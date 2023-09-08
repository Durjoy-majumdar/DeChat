package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v62 */
public class C51653v62 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f143345d;

    /* renamed from: e */
    public int f143346e;

    /* renamed from: f */
    public int f143347f;

    /* renamed from: g */
    public C51163rv3 f143348g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51653v62)) {
            return false;
        }
        C51653v62 v622 = (C51653v62) aVar;
        return C46238a.m51546a(this.BaseRequest, v622.BaseRequest) && C46238a.m51546a(this.f143345d, v622.f143345d) && C46238a.m51546a(Integer.valueOf(this.f143346e), Integer.valueOf(v622.f143346e)) && C46238a.m51546a(Integer.valueOf(this.f143347f), Integer.valueOf(v622.f143347f)) && C46238a.m51546a(this.f143348g, v622.f143348g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143345d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f143345d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f143345d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f143346e);
                aVar.mo74318e(4, this.f143347f);
                C51163rv3 rv33 = this.f143348g;
                if (rv33 != null) {
                    aVar.mo74322i(5, rv33.computeSize());
                    this.f143348g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51163rv3 rv34 = this.f143345d;
            if (rv34 != null) {
                i2 += C52418a.m58682i(2, rv34.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f143346e) + C52418a.m58678e(4, this.f143347f);
            C51163rv3 rv35 = this.f143348g;
            return rv35 != null ? e + C52418a.m58682i(5, rv35.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143345d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51653v62 v622 = objArr[1];
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
                    v622.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv36 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv36.mo73356d(bArr2);
                    }
                    v622.f143345d = rv36;
                }
                return 0;
            } else if (intValue == 3) {
                v622.f143346e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                v622.f143347f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51163rv3 rv37 = new C51163rv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        rv37.mo73356d(bArr3);
                    }
                    v622.f143348g = rv37;
                }
                return 0;
            }
        }
    }
}
