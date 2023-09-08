package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nf */
public class C50532nf extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C49141dg> f138567d = new LinkedList<>();

    /* renamed from: e */
    public int f138568e;

    /* renamed from: f */
    public int f138569f;

    /* renamed from: g */
    public String f138570g;

    /* renamed from: h */
    public long f138571h;

    /* renamed from: i */
    public String f138572i;

    /* renamed from: j */
    public C50286ln f138573j;

    /* renamed from: n */
    public C50392mf f138574n;

    /* renamed from: o */
    public C49101d6 f138575o;

    /* renamed from: p */
    public String f138576p;

    /* renamed from: q */
    public String f138577q;

    /* renamed from: r */
    public LinkedList<C49456fp3> f138578r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50532nf)) {
            return false;
        }
        C50532nf nfVar = (C50532nf) aVar;
        return C46238a.m51546a(this.BaseRequest, nfVar.BaseRequest) && C46238a.m51546a(this.f138567d, nfVar.f138567d) && C46238a.m51546a(Integer.valueOf(this.f138568e), Integer.valueOf(nfVar.f138568e)) && C46238a.m51546a(Integer.valueOf(this.f138569f), Integer.valueOf(nfVar.f138569f)) && C46238a.m51546a(this.f138570g, nfVar.f138570g) && C46238a.m51546a(Long.valueOf(this.f138571h), Long.valueOf(nfVar.f138571h)) && C46238a.m51546a(this.f138572i, nfVar.f138572i) && C46238a.m51546a(this.f138573j, nfVar.f138573j) && C46238a.m51546a(this.f138574n, nfVar.f138574n) && C46238a.m51546a(this.f138575o, nfVar.f138575o) && C46238a.m51546a(this.f138576p, nfVar.f138576p) && C46238a.m51546a(this.f138577q, nfVar.f138577q) && C46238a.m51546a(this.f138578r, nfVar.f138578r);
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
            aVar.mo74320g(2, 8, this.f138567d);
            aVar.mo74318e(3, this.f138568e);
            aVar.mo74318e(4, this.f138569f);
            String str = this.f138570g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f138571h);
            String str2 = this.f138572i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C50286ln lnVar = this.f138573j;
            if (lnVar != null) {
                aVar.mo74322i(8, lnVar.computeSize());
                this.f138573j.writeFields(aVar);
            }
            C50392mf mfVar = this.f138574n;
            if (mfVar != null) {
                aVar.mo74322i(9, mfVar.computeSize());
                this.f138574n.writeFields(aVar);
            }
            C49101d6 d6Var = this.f138575o;
            if (d6Var != null) {
                aVar.mo74322i(10, d6Var.computeSize());
                this.f138575o.writeFields(aVar);
            }
            String str3 = this.f138576p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f138577q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74320g(13, 8, this.f138578r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58680g(2, 8, this.f138567d) + C52418a.m58678e(3, this.f138568e) + C52418a.m58678e(4, this.f138569f);
            String str5 = this.f138570g;
            if (str5 != null) {
                i3 += C52418a.m58683j(5, str5);
            }
            int h = i3 + C52418a.m58681h(6, this.f138571h);
            String str6 = this.f138572i;
            if (str6 != null) {
                h += C52418a.m58683j(7, str6);
            }
            C50286ln lnVar2 = this.f138573j;
            if (lnVar2 != null) {
                h += C52418a.m58682i(8, lnVar2.computeSize());
            }
            C50392mf mfVar2 = this.f138574n;
            if (mfVar2 != null) {
                h += C52418a.m58682i(9, mfVar2.computeSize());
            }
            C49101d6 d6Var2 = this.f138575o;
            if (d6Var2 != null) {
                h += C52418a.m58682i(10, d6Var2.computeSize());
            }
            String str7 = this.f138576p;
            if (str7 != null) {
                h += C52418a.m58683j(11, str7);
            }
            String str8 = this.f138577q;
            if (str8 != null) {
                h += C52418a.m58683j(12, str8);
            }
            return h + C52418a.m58680g(13, 8, this.f138578r);
        } else if (i2 == 2) {
            this.f138567d.clear();
            this.f138578r.clear();
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
            C50532nf nfVar = objArr[1];
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
                        nfVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49141dg dgVar = new C49141dg();
                        if (bArr2 != null && bArr2.length > 0) {
                            dgVar.parseFrom(bArr2);
                        }
                        nfVar.f138567d.add(dgVar);
                    }
                    return 0;
                case 3:
                    nfVar.f138568e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    nfVar.f138569f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nfVar.f138570g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    nfVar.f138571h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    nfVar.f138572i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50286ln lnVar3 = new C50286ln();
                        if (bArr3 != null && bArr3.length > 0) {
                            lnVar3.parseFrom(bArr3);
                        }
                        nfVar.f138573j = lnVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50392mf mfVar3 = new C50392mf();
                        if (bArr4 != null && bArr4.length > 0) {
                            mfVar3.parseFrom(bArr4);
                        }
                        nfVar.f138574n = mfVar3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49101d6 d6Var3 = new C49101d6();
                        if (bArr5 != null && bArr5.length > 0) {
                            d6Var3.parseFrom(bArr5);
                        }
                        nfVar.f138575o = d6Var3;
                    }
                    return 0;
                case 11:
                    nfVar.f138576p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    nfVar.f138577q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49456fp3 fp32 = new C49456fp3();
                        if (bArr6 != null && bArr6.length > 0) {
                            fp32.parseFrom(bArr6);
                        }
                        nfVar.f138578r.add(fp32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
