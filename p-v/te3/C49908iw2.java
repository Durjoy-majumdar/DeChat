package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iw2 */
public class C49908iw2 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f135708d;

    /* renamed from: e */
    public int f135709e;

    /* renamed from: f */
    public C51163rv3 f135710f;

    /* renamed from: g */
    public C51163rv3 f135711g;

    /* renamed from: h */
    public C51163rv3 f135712h;

    /* renamed from: i */
    public int f135713i;

    /* renamed from: j */
    public C51163rv3 f135714j;

    /* renamed from: n */
    public C51163rv3 f135715n;

    /* renamed from: o */
    public C51163rv3 f135716o;

    /* renamed from: p */
    public int f135717p;

    /* renamed from: q */
    public String f135718q;

    /* renamed from: r */
    public String f135719r;

    /* renamed from: s */
    public String f135720s;

    /* renamed from: t */
    public int f135721t;

    /* renamed from: u */
    public int f135722u;

    /* renamed from: v */
    public String f135723v;

    /* renamed from: w */
    public String f135724w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49908iw2)) {
            return false;
        }
        C49908iw2 iw22 = (C49908iw2) aVar;
        return C46238a.m51546a(this.f135708d, iw22.f135708d) && C46238a.m51546a(Integer.valueOf(this.f135709e), Integer.valueOf(iw22.f135709e)) && C46238a.m51546a(this.f135710f, iw22.f135710f) && C46238a.m51546a(this.f135711g, iw22.f135711g) && C46238a.m51546a(this.f135712h, iw22.f135712h) && C46238a.m51546a(Integer.valueOf(this.f135713i), Integer.valueOf(iw22.f135713i)) && C46238a.m51546a(this.f135714j, iw22.f135714j) && C46238a.m51546a(this.f135715n, iw22.f135715n) && C46238a.m51546a(this.f135716o, iw22.f135716o) && C46238a.m51546a(Integer.valueOf(this.f135717p), Integer.valueOf(iw22.f135717p)) && C46238a.m51546a(this.f135718q, iw22.f135718q) && C46238a.m51546a(this.f135719r, iw22.f135719r) && C46238a.m51546a(this.f135720s, iw22.f135720s) && C46238a.m51546a(Integer.valueOf(this.f135721t), Integer.valueOf(iw22.f135721t)) && C46238a.m51546a(Integer.valueOf(this.f135722u), Integer.valueOf(iw22.f135722u)) && C46238a.m51546a(this.f135723v, iw22.f135723v) && C46238a.m51546a(this.f135724w, iw22.f135724w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f135708d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: MemberName");
            } else if (this.f135710f == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f135711g == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f135712h == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f135714j == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f135715n == null) {
                throw new C52419b("Not all required fields were included: RemarkPYInitial");
            } else if (this.f135716o != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f135708d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f135709e);
                C51163rv3 rv33 = this.f135710f;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f135710f.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f135711g;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f135711g.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f135712h;
                if (rv35 != null) {
                    aVar.mo74322i(5, rv35.computeSize());
                    this.f135712h.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f135713i);
                C51163rv3 rv36 = this.f135714j;
                if (rv36 != null) {
                    aVar.mo74322i(9, rv36.computeSize());
                    this.f135714j.writeFields(aVar);
                }
                C51163rv3 rv37 = this.f135715n;
                if (rv37 != null) {
                    aVar.mo74322i(10, rv37.computeSize());
                    this.f135715n.writeFields(aVar);
                }
                C51163rv3 rv38 = this.f135716o;
                if (rv38 != null) {
                    aVar.mo74322i(11, rv38.computeSize());
                    this.f135716o.writeFields(aVar);
                }
                aVar.mo74318e(12, this.f135717p);
                String str = this.f135718q;
                if (str != null) {
                    aVar.mo74323j(13, str);
                }
                String str2 = this.f135719r;
                if (str2 != null) {
                    aVar.mo74323j(14, str2);
                }
                String str3 = this.f135720s;
                if (str3 != null) {
                    aVar.mo74323j(15, str3);
                }
                aVar.mo74318e(16, this.f135721t);
                aVar.mo74318e(17, this.f135722u);
                String str4 = this.f135723v;
                if (str4 != null) {
                    aVar.mo74323j(18, str4);
                }
                String str5 = this.f135724w;
                if (str5 != null) {
                    aVar.mo74323j(19, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RemarkQuanPin");
            }
        } else if (i2 == 1) {
            C51163rv3 rv39 = this.f135708d;
            if (rv39 != null) {
                i3 = C52418a.m58682i(1, rv39.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f135709e);
            C51163rv3 rv310 = this.f135710f;
            if (rv310 != null) {
                e += C52418a.m58682i(3, rv310.computeSize());
            }
            C51163rv3 rv311 = this.f135711g;
            if (rv311 != null) {
                e += C52418a.m58682i(4, rv311.computeSize());
            }
            C51163rv3 rv312 = this.f135712h;
            if (rv312 != null) {
                e += C52418a.m58682i(5, rv312.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f135713i);
            C51163rv3 rv313 = this.f135714j;
            if (rv313 != null) {
                e2 += C52418a.m58682i(9, rv313.computeSize());
            }
            C51163rv3 rv314 = this.f135715n;
            if (rv314 != null) {
                e2 += C52418a.m58682i(10, rv314.computeSize());
            }
            C51163rv3 rv315 = this.f135716o;
            if (rv315 != null) {
                e2 += C52418a.m58682i(11, rv315.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f135717p);
            String str6 = this.f135718q;
            if (str6 != null) {
                e3 += C52418a.m58683j(13, str6);
            }
            String str7 = this.f135719r;
            if (str7 != null) {
                e3 += C52418a.m58683j(14, str7);
            }
            String str8 = this.f135720s;
            if (str8 != null) {
                e3 += C52418a.m58683j(15, str8);
            }
            int e4 = e3 + C52418a.m58678e(16, this.f135721t) + C52418a.m58678e(17, this.f135722u);
            String str9 = this.f135723v;
            if (str9 != null) {
                e4 += C52418a.m58683j(18, str9);
            }
            String str10 = this.f135724w;
            return str10 != null ? e4 + C52418a.m58683j(19, str10) : e4;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135708d == null) {
                throw new C52419b("Not all required fields were included: MemberName");
            } else if (this.f135710f == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f135711g == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f135712h == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f135714j == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f135715n == null) {
                throw new C52419b("Not all required fields were included: RemarkPYInitial");
            } else if (this.f135716o != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RemarkQuanPin");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49908iw2 iw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51163rv3 rv316 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv316.mo73356d(bArr);
                        }
                        iw22.f135708d = rv316;
                    }
                    return 0;
                case 2:
                    iw22.f135709e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv317 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv317.mo73356d(bArr2);
                        }
                        iw22.f135710f = rv317;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv318 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv318.mo73356d(bArr3);
                        }
                        iw22.f135711g = rv318;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv319 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv319.mo73356d(bArr4);
                        }
                        iw22.f135712h = rv319;
                    }
                    return 0;
                case 6:
                    iw22.f135713i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51163rv3 rv320 = new C51163rv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv320.mo73356d(bArr5);
                        }
                        iw22.f135714j = rv320;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51163rv3 rv321 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv321.mo73356d(bArr6);
                        }
                        iw22.f135715n = rv321;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51163rv3 rv322 = new C51163rv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            rv322.mo73356d(bArr7);
                        }
                        iw22.f135716o = rv322;
                    }
                    return 0;
                case 12:
                    iw22.f135717p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    iw22.f135718q = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    iw22.f135719r = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    iw22.f135720s = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    iw22.f135721t = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    iw22.f135722u = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    iw22.f135723v = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    iw22.f135724w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
