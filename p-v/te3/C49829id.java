package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.id */
public class C49829id extends C49335eu3 {

    /* renamed from: d */
    public String f135226d;

    /* renamed from: e */
    public C51018qv3 f135227e;

    /* renamed from: f */
    public int f135228f;

    /* renamed from: g */
    public int f135229g;

    /* renamed from: h */
    public String f135230h;

    /* renamed from: i */
    public int f135231i;

    /* renamed from: j */
    public String f135232j;

    /* renamed from: n */
    public C51163rv3 f135233n;

    /* renamed from: o */
    public C51018qv3 f135234o;

    /* renamed from: p */
    public C51018qv3 f135235p;

    /* renamed from: q */
    public C51604uv3 f135236q;

    /* renamed from: r */
    public int f135237r;

    /* renamed from: s */
    public C51018qv3 f135238s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49829id)) {
            return false;
        }
        C49829id idVar = (C49829id) aVar;
        return C46238a.m51546a(this.BaseResponse, idVar.BaseResponse) && C46238a.m51546a(this.f135226d, idVar.f135226d) && C46238a.m51546a(this.f135227e, idVar.f135227e) && C46238a.m51546a(Integer.valueOf(this.f135228f), Integer.valueOf(idVar.f135228f)) && C46238a.m51546a(Integer.valueOf(this.f135229g), Integer.valueOf(idVar.f135229g)) && C46238a.m51546a(this.f135230h, idVar.f135230h) && C46238a.m51546a(Integer.valueOf(this.f135231i), Integer.valueOf(idVar.f135231i)) && C46238a.m51546a(this.f135232j, idVar.f135232j) && C46238a.m51546a(this.f135233n, idVar.f135233n) && C46238a.m51546a(this.f135234o, idVar.f135234o) && C46238a.m51546a(this.f135235p, idVar.f135235p) && C46238a.m51546a(this.f135236q, idVar.f135236q) && C46238a.m51546a(Integer.valueOf(this.f135237r), Integer.valueOf(idVar.f135237r)) && C46238a.m51546a(this.f135238s, idVar.f135238s);
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
            } else if (this.f135227e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f135226d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f135227e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f135227e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f135228f);
                aVar.mo74318e(5, this.f135229g);
                String str2 = this.f135230h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74318e(7, this.f135231i);
                String str3 = this.f135232j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                C51163rv3 rv32 = this.f135233n;
                if (rv32 != null) {
                    aVar.mo74322i(9, rv32.computeSize());
                    this.f135233n.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f135234o;
                if (qv33 != null) {
                    aVar.mo74322i(10, qv33.computeSize());
                    this.f135234o.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f135235p;
                if (qv34 != null) {
                    aVar.mo74322i(11, qv34.computeSize());
                    this.f135235p.writeFields(aVar);
                }
                C51604uv3 uv32 = this.f135236q;
                if (uv32 != null) {
                    aVar.mo74322i(12, uv32.computeSize());
                    this.f135236q.writeFields(aVar);
                }
                aVar.mo74318e(13, this.f135237r);
                C51018qv3 qv35 = this.f135238s;
                if (qv35 != null) {
                    aVar.mo74322i(14, qv35.computeSize());
                    this.f135238s.writeFields(aVar);
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
            String str4 = this.f135226d;
            if (str4 != null) {
                i3 += C52418a.m58683j(2, str4);
            }
            C51018qv3 qv36 = this.f135227e;
            if (qv36 != null) {
                i3 += C52418a.m58682i(3, qv36.computeSize());
            }
            int e = i3 + C52418a.m58678e(4, this.f135228f) + C52418a.m58678e(5, this.f135229g);
            String str5 = this.f135230h;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            int e2 = e + C52418a.m58678e(7, this.f135231i);
            String str6 = this.f135232j;
            if (str6 != null) {
                e2 += C52418a.m58683j(8, str6);
            }
            C51163rv3 rv33 = this.f135233n;
            if (rv33 != null) {
                e2 += C52418a.m58682i(9, rv33.computeSize());
            }
            C51018qv3 qv37 = this.f135234o;
            if (qv37 != null) {
                e2 += C52418a.m58682i(10, qv37.computeSize());
            }
            C51018qv3 qv38 = this.f135235p;
            if (qv38 != null) {
                e2 += C52418a.m58682i(11, qv38.computeSize());
            }
            C51604uv3 uv33 = this.f135236q;
            if (uv33 != null) {
                e2 += C52418a.m58682i(12, uv33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.f135237r);
            C51018qv3 qv39 = this.f135238s;
            return qv39 != null ? e3 + C52418a.m58682i(14, qv39.computeSize()) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135227e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49829id idVar = objArr[1];
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
                        idVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    idVar.f135226d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv310.mo73348f(bArr2);
                        }
                        idVar.f135227e = qv310;
                    }
                    return 0;
                case 4:
                    idVar.f135228f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    idVar.f135229g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    idVar.f135230h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    idVar.f135231i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    idVar.f135232j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv34.mo73356d(bArr3);
                        }
                        idVar.f135233n = rv34;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv311 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv311.mo73348f(bArr4);
                        }
                        idVar.f135234o = qv311;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv312.mo73348f(bArr5);
                        }
                        idVar.f135235p = qv312;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51604uv3 uv34 = new C51604uv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            uv34.parseFrom(bArr6);
                        }
                        idVar.f135236q = uv34;
                    }
                    return 0;
                case 13:
                    idVar.f135237r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv313.mo73348f(bArr7);
                        }
                        idVar.f135238s = qv313;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
