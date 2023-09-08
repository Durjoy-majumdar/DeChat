package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gz0 */
public class C64408gz0 extends C49335eu3 {

    /* renamed from: d */
    public String f183380d;

    /* renamed from: e */
    public C64226a81 f183381e;

    /* renamed from: f */
    public C48779ay0 f183382f;

    /* renamed from: g */
    public String f183383g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64408gz0)) {
            return false;
        }
        C64408gz0 gz02 = (C64408gz0) aVar;
        return C46238a.m51546a(this.BaseResponse, gz02.BaseResponse) && C46238a.m51546a(this.f183380d, gz02.f183380d) && C46238a.m51546a(this.f183381e, gz02.f183381e) && C46238a.m51546a(this.f183382f, gz02.f183382f) && C46238a.m51546a(this.f183383g, gz02.f183383g);
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
            String str = this.f183380d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64226a81 a812 = this.f183381e;
            if (a812 != null) {
                aVar.mo74322i(3, a812.computeSize());
                this.f183381e.writeFields(aVar);
            }
            C48779ay0 ay02 = this.f183382f;
            if (ay02 != null) {
                aVar.mo74322i(4, ay02.computeSize());
                this.f183382f.writeFields(aVar);
            }
            String str2 = this.f183383g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f183380d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C64226a81 a813 = this.f183381e;
            if (a813 != null) {
                i2 += C52418a.m58682i(3, a813.computeSize());
            }
            C48779ay0 ay03 = this.f183382f;
            if (ay03 != null) {
                i2 += C52418a.m58682i(4, ay03.computeSize());
            }
            String str4 = this.f183383g;
            return str4 != null ? i2 + C52418a.m58683j(5, str4) : i2;
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
            C64408gz0 gz02 = objArr[1];
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
                    gz02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gz02.f183380d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64226a81 a814 = new C64226a81();
                    if (bArr2 != null && bArr2.length > 0) {
                        a814.parseFrom(bArr2);
                    }
                    gz02.f183381e = a814;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48779ay0 ay04 = new C48779ay0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ay04.parseFrom(bArr3);
                    }
                    gz02.f183382f = ay04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gz02.f183383g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
