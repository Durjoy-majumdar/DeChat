package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qj */
public class C50967qj extends C49335eu3 {

    /* renamed from: d */
    public int f140341d;

    /* renamed from: e */
    public String f140342e;

    /* renamed from: f */
    public C52127yk f140343f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50967qj)) {
            return false;
        }
        C50967qj qjVar = (C50967qj) aVar;
        return C46238a.m51546a(this.BaseResponse, qjVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140341d), Integer.valueOf(qjVar.f140341d)) && C46238a.m51546a(this.f140342e, qjVar.f140342e) && C46238a.m51546a(this.f140343f, qjVar.f140343f);
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
                aVar.mo74318e(2, this.f140341d);
                String str = this.f140342e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C52127yk ykVar = this.f140343f;
                if (ykVar != null) {
                    aVar.mo74322i(4, ykVar.computeSize());
                    this.f140343f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140341d);
            String str2 = this.f140342e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C52127yk ykVar2 = this.f140343f;
            return ykVar2 != null ? e + C52418a.m58682i(4, ykVar2.computeSize()) : e;
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
            C50967qj qjVar = objArr[1];
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
                    qjVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qjVar.f140341d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qjVar.f140342e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52127yk ykVar3 = new C52127yk();
                    if (bArr2 != null && bArr2.length > 0) {
                        ykVar3.parseFrom(bArr2);
                    }
                    qjVar.f140343f = ykVar3;
                }
                return 0;
            }
        }
    }
}
