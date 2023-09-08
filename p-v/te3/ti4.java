package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ti4 extends C101820nt3 {

    /* renamed from: d */
    public String f185563d;

    /* renamed from: e */
    public String f185564e;

    /* renamed from: f */
    public C101766ct2 f185565f;

    /* renamed from: g */
    public int f185566g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ti4)) {
            return false;
        }
        ti4 ti4 = (ti4) aVar;
        return C46238a.m51546a(this.BaseRequest, ti4.BaseRequest) && C46238a.m51546a(this.f185563d, ti4.f185563d) && C46238a.m51546a(this.f185564e, ti4.f185564e) && C46238a.m51546a(this.f185565f, ti4.f185565f) && C46238a.m51546a(Integer.valueOf(this.f185566g), Integer.valueOf(ti4.f185566g));
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
            String str = this.f185563d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185564e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C101766ct2 ct22 = this.f185565f;
            if (ct22 != null) {
                aVar.mo74322i(4, ct22.computeSize());
                this.f185565f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f185566g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f185563d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f185564e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C101766ct2 ct23 = this.f185565f;
            if (ct23 != null) {
                i2 += C52418a.m58682i(4, ct23.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f185566g);
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
            ti4 ti4 = objArr[1];
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
                    ti4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ti4.f185563d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ti4.f185564e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101766ct2 ct24 = new C101766ct2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ct24.parseFrom(bArr2);
                    }
                    ti4.f185565f = ct24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ti4.f185566g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
