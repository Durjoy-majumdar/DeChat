package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sl3 */
public class C51264sl3 extends C49335eu3 {

    /* renamed from: d */
    public ue4 f141593d;

    /* renamed from: e */
    public C50456mv3 f141594e;

    /* renamed from: f */
    public pz4 f141595f;

    /* renamed from: g */
    public long f141596g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51264sl3)) {
            return false;
        }
        C51264sl3 sl32 = (C51264sl3) aVar;
        return C46238a.m51546a(this.BaseResponse, sl32.BaseResponse) && C46238a.m51546a(this.f141593d, sl32.f141593d) && C46238a.m51546a(this.f141594e, sl32.f141594e) && C46238a.m51546a(this.f141595f, sl32.f141595f) && C46238a.m51546a(Long.valueOf(this.f141596g), Long.valueOf(sl32.f141596g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                ue4 ue4 = this.f141593d;
                if (ue4 != null) {
                    aVar.mo74322i(2, ue4.computeSize());
                    this.f141593d.writeFields(aVar);
                }
                C50456mv3 mv32 = this.f141594e;
                if (mv32 != null) {
                    aVar.mo74322i(3, mv32.computeSize());
                    this.f141594e.writeFields(aVar);
                }
                pz4 pz4 = this.f141595f;
                if (pz4 != null) {
                    aVar.mo74322i(4, pz4.computeSize());
                    this.f141595f.writeFields(aVar);
                }
                aVar.mo74321h(5, this.f141596g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            ue4 ue42 = this.f141593d;
            if (ue42 != null) {
                i2 += C52418a.m58682i(2, ue42.computeSize());
            }
            C50456mv3 mv33 = this.f141594e;
            if (mv33 != null) {
                i2 += C52418a.m58682i(3, mv33.computeSize());
            }
            pz4 pz42 = this.f141595f;
            if (pz42 != null) {
                i2 += C52418a.m58682i(4, pz42.computeSize());
            }
            return i2 + C52418a.m58681h(5, this.f141596g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51264sl3 sl32 = objArr[1];
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
                    sl32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ue4 ue43 = new ue4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ue43.parseFrom(bArr2);
                    }
                    sl32.f141593d = ue43;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        mv34.parseFrom(bArr3);
                    }
                    sl32.f141594e = mv34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    pz4 pz43 = new pz4();
                    if (bArr4 != null && bArr4.length > 0) {
                        pz43.parseFrom(bArr4);
                    }
                    sl32.f141595f = pz43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sl32.f141596g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
