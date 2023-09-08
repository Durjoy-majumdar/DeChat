package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t71 */
public class C51354t71 extends C49335eu3 {

    /* renamed from: d */
    public String f142015d;

    /* renamed from: e */
    public C89349b f142016e;

    /* renamed from: f */
    public C48779ay0 f142017f;

    /* renamed from: g */
    public C51628v11 f142018g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51354t71)) {
            return false;
        }
        C51354t71 t712 = (C51354t71) aVar;
        return C46238a.m51546a(this.BaseResponse, t712.BaseResponse) && C46238a.m51546a(this.f142015d, t712.f142015d) && C46238a.m51546a(this.f142016e, t712.f142016e) && C46238a.m51546a(this.f142017f, t712.f142017f) && C46238a.m51546a(this.f142018g, t712.f142018g);
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
            String str = this.f142015d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f142016e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C48779ay0 ay02 = this.f142017f;
            if (ay02 != null) {
                aVar.mo74322i(4, ay02.computeSize());
                this.f142017f.writeFields(aVar);
            }
            C51628v11 v112 = this.f142018g;
            if (v112 != null) {
                aVar.mo74322i(5, v112.computeSize());
                this.f142018g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f142015d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f142016e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C48779ay0 ay03 = this.f142017f;
            if (ay03 != null) {
                i2 += C52418a.m58682i(4, ay03.computeSize());
            }
            C51628v11 v113 = this.f142018g;
            return v113 != null ? i2 + C52418a.m58682i(5, v113.computeSize()) : i2;
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
            C51354t71 t712 = objArr[1];
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
                    t712.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                t712.f142015d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                t712.f142016e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48779ay0 ay04 = new C48779ay0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ay04.parseFrom(bArr2);
                    }
                    t712.f142017f = ay04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51628v11 v114 = new C51628v11();
                    if (bArr3 != null && bArr3.length > 0) {
                        v114.parseFrom(bArr3);
                    }
                    t712.f142018g = v114;
                }
                return 0;
            }
        }
    }
}
