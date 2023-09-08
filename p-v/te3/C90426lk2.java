package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lk2 */
public class C90426lk2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f259669d;

    /* renamed from: e */
    public C89349b f259670e;

    /* renamed from: f */
    public C90437rw3 f259671f;

    /* renamed from: g */
    public String f259672g;

    /* renamed from: h */
    public String f259673h;

    /* renamed from: i */
    public C51768w10 f259674i;

    /* renamed from: j */
    public boolean f259675j;

    /* renamed from: n */
    public String f259676n;

    /* renamed from: o */
    public String f259677o;

    /* renamed from: p */
    public String f259678p;

    /* renamed from: q */
    public mo4 f259679q;

    /* renamed from: r */
    public C90429p4 f259680r;

    /* renamed from: s */
    public gp4 f259681s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90426lk2)) {
            return false;
        }
        C90426lk2 lk22 = (C90426lk2) aVar;
        return C46238a.m51546a(this.BaseResponse, lk22.BaseResponse) && C46238a.m51546a(this.f259669d, lk22.f259669d) && C46238a.m51546a(this.f259670e, lk22.f259670e) && C46238a.m51546a(this.f259671f, lk22.f259671f) && C46238a.m51546a(this.f259672g, lk22.f259672g) && C46238a.m51546a(this.f259673h, lk22.f259673h) && C46238a.m51546a(this.f259674i, lk22.f259674i) && C46238a.m51546a(Boolean.valueOf(this.f259675j), Boolean.valueOf(lk22.f259675j)) && C46238a.m51546a(this.f259676n, lk22.f259676n) && C46238a.m51546a(this.f259677o, lk22.f259677o) && C46238a.m51546a(this.f259678p, lk22.f259678p) && C46238a.m51546a(this.f259679q, lk22.f259679q) && C46238a.m51546a(this.f259680r, lk22.f259680r) && C46238a.m51546a(this.f259681s, lk22.f259681s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C49713hj2 hj22 = this.f259669d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f259669d.writeFields(aVar);
                }
                C89349b bVar = this.f259670e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                C90437rw3 rw32 = this.f259671f;
                if (rw32 != null) {
                    aVar.mo74322i(4, rw32.computeSize());
                    this.f259671f.writeFields(aVar);
                }
                String str = this.f259672g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                String str2 = this.f259673h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                C51768w10 w102 = this.f259674i;
                if (w102 != null) {
                    aVar.mo74322i(7, w102.computeSize());
                    this.f259674i.writeFields(aVar);
                }
                aVar.mo74314a(8, this.f259675j);
                String str3 = this.f259676n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                String str4 = this.f259677o;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                String str5 = this.f259678p;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                mo4 mo4 = this.f259679q;
                if (mo4 != null) {
                    aVar.mo74322i(12, mo4.computeSize());
                    this.f259679q.writeFields(aVar);
                }
                C90429p4 p4Var = this.f259680r;
                if (p4Var != null) {
                    aVar.mo74322i(13, p4Var.computeSize());
                    this.f259680r.writeFields(aVar);
                }
                gp4 gp4 = this.f259681s;
                if (gp4 != null) {
                    aVar.mo74322i(15, gp4.computeSize());
                    this.f259681s.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C49713hj2 hj23 = this.f259669d;
            if (hj23 != null) {
                i3 += C52418a.m58682i(2, hj23.computeSize());
            }
            C89349b bVar2 = this.f259670e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            C90437rw3 rw33 = this.f259671f;
            if (rw33 != null) {
                i3 += C52418a.m58682i(4, rw33.computeSize());
            }
            String str6 = this.f259672g;
            if (str6 != null) {
                i3 += C52418a.m58683j(5, str6);
            }
            String str7 = this.f259673h;
            if (str7 != null) {
                i3 += C52418a.m58683j(6, str7);
            }
            C51768w10 w103 = this.f259674i;
            if (w103 != null) {
                i3 += C52418a.m58682i(7, w103.computeSize());
            }
            int a = i3 + C52418a.m58674a(8, this.f259675j);
            String str8 = this.f259676n;
            if (str8 != null) {
                a += C52418a.m58683j(9, str8);
            }
            String str9 = this.f259677o;
            if (str9 != null) {
                a += C52418a.m58683j(10, str9);
            }
            String str10 = this.f259678p;
            if (str10 != null) {
                a += C52418a.m58683j(11, str10);
            }
            mo4 mo42 = this.f259679q;
            if (mo42 != null) {
                a += C52418a.m58682i(12, mo42.computeSize());
            }
            C90429p4 p4Var2 = this.f259680r;
            if (p4Var2 != null) {
                a += C52418a.m58682i(13, p4Var2.computeSize());
            }
            gp4 gp42 = this.f259681s;
            return gp42 != null ? a + C52418a.m58682i(15, gp42.computeSize()) : a;
        } else if (i2 == 2) {
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
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90426lk2 lk22 = objArr[1];
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
                        lk22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49713hj2 hj24 = new C49713hj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hj24.parseFrom(bArr2);
                        }
                        lk22.f259669d = hj24;
                    }
                    return 0;
                case 3:
                    lk22.f259670e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C90437rw3 rw34 = new C90437rw3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rw34.parseFrom(bArr3);
                        }
                        lk22.f259671f = rw34;
                    }
                    return 0;
                case 5:
                    lk22.f259672g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lk22.f259673h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51768w10 w104 = new C51768w10();
                        if (bArr4 != null && bArr4.length > 0) {
                            w104.parseFrom(bArr4);
                        }
                        lk22.f259674i = w104;
                    }
                    return 0;
                case 8:
                    lk22.f259675j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    lk22.f259676n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    lk22.f259677o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    lk22.f259678p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        mo4 mo43 = new mo4();
                        if (bArr5 != null && bArr5.length > 0) {
                            mo43.parseFrom(bArr5);
                        }
                        lk22.f259679q = mo43;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C90429p4 p4Var3 = new C90429p4();
                        if (bArr6 != null && bArr6.length > 0) {
                            p4Var3.parseFrom(bArr6);
                        }
                        lk22.f259680r = p4Var3;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        gp4 gp43 = new gp4();
                        if (bArr7 != null && bArr7.length > 0) {
                            gp43.parseFrom(bArr7);
                        }
                        lk22.f259681s = gp43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
