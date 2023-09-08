package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r8 */
public class C90434r8 extends C101820nt3 {

    /* renamed from: d */
    public int f259778d;

    /* renamed from: e */
    public C51018qv3 f259779e;

    /* renamed from: f */
    public String f259780f;

    /* renamed from: g */
    public String f259781g;

    /* renamed from: h */
    public String f259782h;

    /* renamed from: i */
    public String f259783i;

    /* renamed from: j */
    public String f259784j;

    /* renamed from: n */
    public String f259785n;

    /* renamed from: o */
    public String f259786o;

    /* renamed from: p */
    public int f259787p;

    /* renamed from: q */
    public C51018qv3 f259788q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90434r8)) {
            return false;
        }
        C90434r8 r8Var = (C90434r8) aVar;
        return C46238a.m51546a(this.BaseRequest, r8Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f259778d), Integer.valueOf(r8Var.f259778d)) && C46238a.m51546a(this.f259779e, r8Var.f259779e) && C46238a.m51546a(this.f259780f, r8Var.f259780f) && C46238a.m51546a(this.f259781g, r8Var.f259781g) && C46238a.m51546a(this.f259782h, r8Var.f259782h) && C46238a.m51546a(this.f259783i, r8Var.f259783i) && C46238a.m51546a(this.f259784j, r8Var.f259784j) && C46238a.m51546a(this.f259785n, r8Var.f259785n) && C46238a.m51546a(this.f259786o, r8Var.f259786o) && C46238a.m51546a(Integer.valueOf(this.f259787p), Integer.valueOf(r8Var.f259787p)) && C46238a.m51546a(this.f259788q, r8Var.f259788q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f259779e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f259778d);
                C51018qv3 qv32 = this.f259779e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f259779e.writeFields(aVar);
                }
                String str = this.f259780f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f259781g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259782h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f259783i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f259784j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f259785n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.f259786o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                aVar.mo74318e(11, this.f259787p);
                C51018qv3 qv33 = this.f259788q;
                if (qv33 == null) {
                    return 0;
                }
                aVar.mo74322i(12, qv33.computeSize());
                this.f259788q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: AxTicket");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f259778d);
            C51018qv3 qv34 = this.f259779e;
            if (qv34 != null) {
                i3 += C52418a.m58682i(3, qv34.computeSize());
            }
            String str8 = this.f259780f;
            if (str8 != null) {
                i3 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f259781g;
            if (str9 != null) {
                i3 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f259782h;
            if (str10 != null) {
                i3 += C52418a.m58683j(6, str10);
            }
            String str11 = this.f259783i;
            if (str11 != null) {
                i3 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f259784j;
            if (str12 != null) {
                i3 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f259785n;
            if (str13 != null) {
                i3 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f259786o;
            if (str14 != null) {
                i3 += C52418a.m58683j(10, str14);
            }
            int e = i3 + C52418a.m58678e(11, this.f259787p);
            C51018qv3 qv35 = this.f259788q;
            return qv35 != null ? e + C52418a.m58682i(12, qv35.computeSize()) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f259779e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AxTicket");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90434r8 r8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        r8Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    r8Var.f259778d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        r8Var.f259779e = qv36;
                    }
                    return 0;
                case 4:
                    r8Var.f259780f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r8Var.f259781g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r8Var.f259782h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r8Var.f259783i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r8Var.f259784j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r8Var.f259785n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    r8Var.f259786o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    r8Var.f259787p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        r8Var.f259788q = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
