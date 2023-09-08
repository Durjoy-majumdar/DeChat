package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g11 */
public class C49498g11 extends C49335eu3 {

    /* renamed from: d */
    public C51507u81 f133780d;

    /* renamed from: e */
    public String f133781e;

    /* renamed from: f */
    public C64370fp1 f133782f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49498g11)) {
            return false;
        }
        C49498g11 g112 = (C49498g11) aVar;
        return C46238a.m51546a(this.BaseResponse, g112.BaseResponse) && C46238a.m51546a(this.f133780d, g112.f133780d) && C46238a.m51546a(this.f133781e, g112.f133781e) && C46238a.m51546a(this.f133782f, g112.f133782f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C51507u81 u812 = this.f133780d;
            if (u812 != null) {
                aVar.mo74322i(2, u812.computeSize());
                this.f133780d.writeFields(aVar);
            }
            String str = this.f133781e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C64370fp1 fp12 = this.f133782f;
            if (fp12 != null) {
                aVar.mo74322i(4, fp12.computeSize());
                this.f133782f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51507u81 u813 = this.f133780d;
            if (u813 != null) {
                i2 += C52418a.m58682i(2, u813.computeSize());
            }
            String str2 = this.f133781e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C64370fp1 fp13 = this.f133782f;
            return fp13 != null ? i2 + C52418a.m58682i(4, fp13.computeSize()) : i2;
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
            C49498g11 g112 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    g112.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51507u81 u814 = new C51507u81();
                    if (bArr2 != null && bArr2.length > 0) {
                        u814.parseFrom(bArr2);
                    }
                    g112.f133780d = u814;
                }
                return 0;
            } else if (intValue == 3) {
                g112.f133781e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64370fp1 fp14 = new C64370fp1();
                    if (bArr3 != null && bArr3.length > 0) {
                        fp14.parseFrom(bArr3);
                    }
                    g112.f133782f = fp14;
                }
                return 0;
            }
        }
    }
}
