package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class cq4 extends C49335eu3 {

    /* renamed from: d */
    public C51163rv3 f131902d;

    /* renamed from: e */
    public C51018qv3 f131903e;

    /* renamed from: f */
    public String f131904f;

    /* renamed from: g */
    public C51163rv3 f131905g;

    /* renamed from: h */
    public C51018qv3 f131906h;

    /* renamed from: i */
    public C51018qv3 f131907i;

    /* renamed from: j */
    public String f131908j;

    /* renamed from: n */
    public C51018qv3 f131909n;

    /* renamed from: o */
    public C51018qv3 f131910o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cq4)) {
            return false;
        }
        cq4 cq4 = (cq4) aVar;
        return C46238a.m51546a(this.BaseResponse, cq4.BaseResponse) && C46238a.m51546a(this.f131902d, cq4.f131902d) && C46238a.m51546a(this.f131903e, cq4.f131903e) && C46238a.m51546a(this.f131904f, cq4.f131904f) && C46238a.m51546a(this.f131905g, cq4.f131905g) && C46238a.m51546a(this.f131906h, cq4.f131906h) && C46238a.m51546a(this.f131907i, cq4.f131907i) && C46238a.m51546a(this.f131908j, cq4.f131908j) && C46238a.m51546a(this.f131909n, cq4.f131909n) && C46238a.m51546a(this.f131910o, cq4.f131910o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131902d == null) {
                throw new C52419b("Not all required fields were included: ImgSid");
            } else if (this.f131903e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f131902d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f131902d.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f131903e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f131903e.writeFields(aVar);
                }
                String str = this.f131904f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C51163rv3 rv33 = this.f131905g;
                if (rv33 != null) {
                    aVar.mo74322i(5, rv33.computeSize());
                    this.f131905g.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f131906h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f131906h.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f131907i;
                if (qv34 != null) {
                    aVar.mo74322i(7, qv34.computeSize());
                    this.f131907i.writeFields(aVar);
                }
                String str2 = this.f131908j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                C51018qv3 qv35 = this.f131909n;
                if (qv35 != null) {
                    aVar.mo74322i(9, qv35.computeSize());
                    this.f131909n.writeFields(aVar);
                }
                C51018qv3 qv36 = this.f131910o;
                if (qv36 == null) {
                    return 0;
                }
                aVar.mo74322i(10, qv36.computeSize());
                this.f131910o.writeFields(aVar);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? C52418a.m58682i(1, jaVar2.computeSize()) + 0 : 0;
            C51163rv3 rv34 = this.f131902d;
            if (rv34 != null) {
                i3 += C52418a.m58682i(2, rv34.computeSize());
            }
            C51018qv3 qv37 = this.f131903e;
            if (qv37 != null) {
                i3 += C52418a.m58682i(3, qv37.computeSize());
            }
            String str3 = this.f131904f;
            if (str3 != null) {
                i3 += C52418a.m58683j(4, str3);
            }
            C51163rv3 rv35 = this.f131905g;
            if (rv35 != null) {
                i3 += C52418a.m58682i(5, rv35.computeSize());
            }
            C51018qv3 qv38 = this.f131906h;
            if (qv38 != null) {
                i3 += C52418a.m58682i(6, qv38.computeSize());
            }
            C51018qv3 qv39 = this.f131907i;
            if (qv39 != null) {
                i3 += C52418a.m58682i(7, qv39.computeSize());
            }
            String str4 = this.f131908j;
            if (str4 != null) {
                i3 += C52418a.m58683j(8, str4);
            }
            C51018qv3 qv310 = this.f131909n;
            if (qv310 != null) {
                i3 += C52418a.m58682i(9, qv310.computeSize());
            }
            C51018qv3 qv311 = this.f131910o;
            return qv311 != null ? i3 + C52418a.m58682i(10, qv311.computeSize()) : i3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131902d == null) {
                throw new C52419b("Not all required fields were included: ImgSid");
            } else if (this.f131903e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            cq4 cq4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        cq4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        cq4.f131902d = rv36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv312.mo73348f(bArr3);
                        }
                        cq4.f131903e = qv312;
                    }
                    return 0;
                case 4:
                    cq4.f131904f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv37.mo73356d(bArr4);
                        }
                        cq4.f131905g = rv37;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv313.mo73348f(bArr5);
                        }
                        cq4.f131906h = qv313;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv314 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv314.mo73348f(bArr6);
                        }
                        cq4.f131907i = qv314;
                    }
                    return 0;
                case 8:
                    cq4.f131908j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv315 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv315.mo73348f(bArr7);
                        }
                        cq4.f131909n = qv315;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51018qv3 qv316 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv316.mo73348f(bArr8);
                        }
                        cq4.f131910o = qv316;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
