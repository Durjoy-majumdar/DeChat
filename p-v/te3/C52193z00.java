package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z00 */
public class C52193z00 extends C49335eu3 {

    /* renamed from: d */
    public C51163rv3 f145602d;

    /* renamed from: e */
    public C51163rv3 f145603e;

    /* renamed from: f */
    public C51163rv3 f145604f;

    /* renamed from: g */
    public int f145605g;

    /* renamed from: h */
    public LinkedList<C49908iw2> f145606h = new LinkedList<>();

    /* renamed from: i */
    public C51163rv3 f145607i;

    /* renamed from: j */
    public C51018qv3 f145608j;

    /* renamed from: n */
    public String f145609n;

    /* renamed from: o */
    public String f145610o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52193z00)) {
            return false;
        }
        C52193z00 z002 = (C52193z00) aVar;
        return C46238a.m51546a(this.BaseResponse, z002.BaseResponse) && C46238a.m51546a(this.f145602d, z002.f145602d) && C46238a.m51546a(this.f145603e, z002.f145603e) && C46238a.m51546a(this.f145604f, z002.f145604f) && C46238a.m51546a(Integer.valueOf(this.f145605g), Integer.valueOf(z002.f145605g)) && C46238a.m51546a(this.f145606h, z002.f145606h) && C46238a.m51546a(this.f145607i, z002.f145607i) && C46238a.m51546a(this.f145608j, z002.f145608j) && C46238a.m51546a(this.f145609n, z002.f145609n) && C46238a.m51546a(this.f145610o, z002.f145610o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145602d == null) {
                throw new C52419b("Not all required fields were included: Topic");
            } else if (this.f145603e == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f145604f == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f145607i == null) {
                throw new C52419b("Not all required fields were included: ChatRoomName");
            } else if (this.f145608j != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f145602d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f145602d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f145603e;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f145603e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f145604f;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f145604f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f145605g);
                aVar.mo74320g(6, 8, this.f145606h);
                C51163rv3 rv35 = this.f145607i;
                if (rv35 != null) {
                    aVar.mo74322i(7, rv35.computeSize());
                    this.f145607i.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f145608j;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f145608j.writeFields(aVar);
                }
                String str = this.f145609n;
                if (str != null) {
                    aVar.mo74323j(9, str);
                }
                String str2 = this.f145610o;
                if (str2 != null) {
                    aVar.mo74323j(10, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C51163rv3 rv36 = this.f145602d;
            if (rv36 != null) {
                i3 += C52418a.m58682i(2, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f145603e;
            if (rv37 != null) {
                i3 += C52418a.m58682i(3, rv37.computeSize());
            }
            C51163rv3 rv38 = this.f145604f;
            if (rv38 != null) {
                i3 += C52418a.m58682i(4, rv38.computeSize());
            }
            int e = i3 + C52418a.m58678e(5, this.f145605g) + C52418a.m58680g(6, 8, this.f145606h);
            C51163rv3 rv39 = this.f145607i;
            if (rv39 != null) {
                e += C52418a.m58682i(7, rv39.computeSize());
            }
            C51018qv3 qv33 = this.f145608j;
            if (qv33 != null) {
                e += C52418a.m58682i(8, qv33.computeSize());
            }
            String str3 = this.f145609n;
            if (str3 != null) {
                e += C52418a.m58683j(9, str3);
            }
            String str4 = this.f145610o;
            return str4 != null ? e + C52418a.m58683j(10, str4) : e;
        } else if (i2 == 2) {
            this.f145606h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145602d == null) {
                throw new C52419b("Not all required fields were included: Topic");
            } else if (this.f145603e == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f145604f == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f145607i == null) {
                throw new C52419b("Not all required fields were included: ChatRoomName");
            } else if (this.f145608j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52193z00 z002 = objArr[1];
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
                        z002.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv310.mo73356d(bArr2);
                        }
                        z002.f145602d = rv310;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv311 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv311.mo73356d(bArr3);
                        }
                        z002.f145603e = rv311;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv312 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv312.mo73356d(bArr4);
                        }
                        z002.f145604f = rv312;
                    }
                    return 0;
                case 5:
                    z002.f145605g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49908iw2 iw22 = new C49908iw2();
                        if (bArr5 != null && bArr5.length > 0) {
                            iw22.parseFrom(bArr5);
                        }
                        z002.f145606h.add(iw22);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51163rv3 rv313 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv313.mo73356d(bArr6);
                        }
                        z002.f145607i = rv313;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv34.mo73348f(bArr7);
                        }
                        z002.f145608j = qv34;
                    }
                    return 0;
                case 9:
                    z002.f145609n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    z002.f145610o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
