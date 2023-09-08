package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hd */
public class C77939hd extends C101820nt3 {

    /* renamed from: d */
    public int f227548d;

    /* renamed from: e */
    public String f227549e;

    /* renamed from: f */
    public String f227550f;

    /* renamed from: g */
    public String f227551g;

    /* renamed from: h */
    public String f227552h;

    /* renamed from: i */
    public int f227553i;

    /* renamed from: j */
    public C51163rv3 f227554j;

    /* renamed from: n */
    public C51018qv3 f227555n;

    /* renamed from: o */
    public int f227556o;

    /* renamed from: p */
    public String f227557p;

    /* renamed from: q */
    public String f227558q;

    /* renamed from: r */
    public C51018qv3 f227559r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77939hd)) {
            return false;
        }
        C77939hd hdVar = (C77939hd) aVar;
        return C46238a.m51546a(this.BaseRequest, hdVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f227548d), Integer.valueOf(hdVar.f227548d)) && C46238a.m51546a(this.f227549e, hdVar.f227549e) && C46238a.m51546a(this.f227550f, hdVar.f227550f) && C46238a.m51546a(this.f227551g, hdVar.f227551g) && C46238a.m51546a(this.f227552h, hdVar.f227552h) && C46238a.m51546a(Integer.valueOf(this.f227553i), Integer.valueOf(hdVar.f227553i)) && C46238a.m51546a(this.f227554j, hdVar.f227554j) && C46238a.m51546a(this.f227555n, hdVar.f227555n) && C46238a.m51546a(Integer.valueOf(this.f227556o), Integer.valueOf(hdVar.f227556o)) && C46238a.m51546a(this.f227557p, hdVar.f227557p) && C46238a.m51546a(this.f227558q, hdVar.f227558q) && C46238a.m51546a(this.f227559r, hdVar.f227559r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f227548d);
            String str = this.f227549e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f227550f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f227551g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f227552h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f227553i);
            C51163rv3 rv32 = this.f227554j;
            if (rv32 != null) {
                aVar.mo74322i(8, rv32.computeSize());
                this.f227554j.writeFields(aVar);
            }
            C51018qv3 qv32 = this.f227555n;
            if (qv32 != null) {
                aVar.mo74322i(9, qv32.computeSize());
                this.f227555n.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f227556o);
            String str5 = this.f227557p;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f227558q;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            C51018qv3 qv33 = this.f227559r;
            if (qv33 == null) {
                return 0;
            }
            aVar.mo74322i(13, qv33.computeSize());
            this.f227559r.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f227548d);
            String str7 = this.f227549e;
            if (str7 != null) {
                i3 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f227550f;
            if (str8 != null) {
                i3 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f227551g;
            if (str9 != null) {
                i3 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f227552h;
            if (str10 != null) {
                i3 += C52418a.m58683j(6, str10);
            }
            int e = i3 + C52418a.m58678e(7, this.f227553i);
            C51163rv3 rv33 = this.f227554j;
            if (rv33 != null) {
                e += C52418a.m58682i(8, rv33.computeSize());
            }
            C51018qv3 qv34 = this.f227555n;
            if (qv34 != null) {
                e += C52418a.m58682i(9, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(10, this.f227556o);
            String str11 = this.f227557p;
            if (str11 != null) {
                e2 += C52418a.m58683j(11, str11);
            }
            String str12 = this.f227558q;
            if (str12 != null) {
                e2 += C52418a.m58683j(12, str12);
            }
            C51018qv3 qv35 = this.f227559r;
            return qv35 != null ? e2 + C52418a.m58682i(13, qv35.computeSize()) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77939hd hdVar = objArr[1];
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
                        hdVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    hdVar.f227548d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hdVar.f227549e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hdVar.f227550f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hdVar.f227551g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hdVar.f227552h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hdVar.f227553i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv34.mo73356d(bArr2);
                        }
                        hdVar.f227554j = rv34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv36.mo73348f(bArr3);
                        }
                        hdVar.f227555n = qv36;
                    }
                    return 0;
                case 10:
                    hdVar.f227556o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    hdVar.f227557p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    hdVar.f227558q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv37.mo73348f(bArr4);
                        }
                        hdVar.f227559r = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
