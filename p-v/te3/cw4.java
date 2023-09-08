package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class cw4 extends C49335eu3 {

    /* renamed from: d */
    public int f131996d;

    /* renamed from: e */
    public C51018qv3 f131997e;

    /* renamed from: f */
    public su4 f131998f;

    /* renamed from: g */
    public int f131999g;

    /* renamed from: h */
    public long f132000h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cw4)) {
            return false;
        }
        cw4 cw4 = (cw4) aVar;
        return C46238a.m51546a(this.BaseResponse, cw4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131996d), Integer.valueOf(cw4.f131996d)) && C46238a.m51546a(this.f131997e, cw4.f131997e) && C46238a.m51546a(this.f131998f, cw4.f131998f) && C46238a.m51546a(Integer.valueOf(this.f131999g), Integer.valueOf(cw4.f131999g)) && C46238a.m51546a(Long.valueOf(this.f132000h), Long.valueOf(cw4.f132000h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131997e == null) {
                throw new C52419b("Not all required fields were included: KeyBuf");
            } else if (this.f131998f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f131996d);
                C51018qv3 qv32 = this.f131997e;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f131997e.writeFields(aVar);
                }
                su4 su4 = this.f131998f;
                if (su4 != null) {
                    aVar.mo74322i(5, su4.computeSize());
                    this.f131998f.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f131999g);
                aVar.mo74321h(8, this.f132000h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CmdList");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f131996d);
            C51018qv3 qv33 = this.f131997e;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            su4 su42 = this.f131998f;
            if (su42 != null) {
                e += C52418a.m58682i(5, su42.computeSize());
            }
            return e + C52418a.m58678e(7, this.f131999g) + C52418a.m58681h(8, this.f132000h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131997e == null) {
                throw new C52419b("Not all required fields were included: KeyBuf");
            } else if (this.f131998f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CmdList");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            cw4 cw4 = objArr[1];
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
                    cw4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 3) {
                cw4.f131996d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    cw4.f131997e = qv34;
                }
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    su4 su43 = new su4();
                    if (bArr3 != null && bArr3.length > 0) {
                        su43.parseFrom(bArr3);
                    }
                    cw4.f131998f = su43;
                }
                return 0;
            } else if (intValue == 7) {
                cw4.f131999g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 8) {
                return -1;
            } else {
                cw4.f132000h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
