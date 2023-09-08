package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import t14.C77820c;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kp */
public class C50158kp extends C49335eu3 {

    /* renamed from: d */
    public int f136921d;

    /* renamed from: e */
    public String f136922e;

    /* renamed from: f */
    public long f136923f;

    /* renamed from: g */
    public C77820c f136924g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50158kp)) {
            return false;
        }
        C50158kp kpVar = (C50158kp) aVar;
        return C46238a.m51546a(this.BaseResponse, kpVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136921d), Integer.valueOf(kpVar.f136921d)) && C46238a.m51546a(this.f136922e, kpVar.f136922e) && C46238a.m51546a(Long.valueOf(this.f136923f), Long.valueOf(kpVar.f136923f)) && C46238a.m51546a(this.f136924g, kpVar.f136924g);
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
                aVar.mo74318e(2, this.f136921d);
                String str = this.f136922e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f136923f);
                C77820c cVar = this.f136924g;
                if (cVar != null) {
                    aVar.mo74322i(5, cVar.computeSize());
                    this.f136924g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136921d);
            String str2 = this.f136922e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int h = e + C52418a.m58681h(4, this.f136923f);
            C77820c cVar2 = this.f136924g;
            return cVar2 != null ? h + C52418a.m58682i(5, cVar2.computeSize()) : h;
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
            C50158kp kpVar = objArr[1];
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
                    kpVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kpVar.f136921d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                kpVar.f136922e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                kpVar.f136923f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77820c cVar3 = new C77820c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar3.parseFrom(bArr2);
                    }
                    kpVar.f136924g = cVar3;
                }
                return 0;
            }
        }
    }
}
