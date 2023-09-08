package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sg */
public class C51237sg extends C101820nt3 {

    /* renamed from: d */
    public C89349b f141479d;

    /* renamed from: e */
    public int f141480e;

    /* renamed from: f */
    public String f141481f;

    /* renamed from: g */
    public String f141482g;

    /* renamed from: h */
    public String f141483h;

    /* renamed from: i */
    public int f141484i;

    /* renamed from: j */
    public int f141485j;

    /* renamed from: n */
    public int f141486n;

    /* renamed from: o */
    public LinkedList<C101856vd> f141487o = new LinkedList<>();

    /* renamed from: p */
    public long f141488p;

    /* renamed from: q */
    public int f141489q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51237sg)) {
            return false;
        }
        C51237sg sgVar = (C51237sg) aVar;
        return C46238a.m51546a(this.BaseRequest, sgVar.BaseRequest) && C46238a.m51546a(this.f141479d, sgVar.f141479d) && C46238a.m51546a(Integer.valueOf(this.f141480e), Integer.valueOf(sgVar.f141480e)) && C46238a.m51546a(this.f141481f, sgVar.f141481f) && C46238a.m51546a(this.f141482g, sgVar.f141482g) && C46238a.m51546a(this.f141483h, sgVar.f141483h) && C46238a.m51546a(Integer.valueOf(this.f141484i), Integer.valueOf(sgVar.f141484i)) && C46238a.m51546a(Integer.valueOf(this.f141485j), Integer.valueOf(sgVar.f141485j)) && C46238a.m51546a(Integer.valueOf(this.f141486n), Integer.valueOf(sgVar.f141486n)) && C46238a.m51546a(this.f141487o, sgVar.f141487o) && C46238a.m51546a(Long.valueOf(this.f141488p), Long.valueOf(sgVar.f141488p)) && C46238a.m51546a(Integer.valueOf(this.f141489q), Integer.valueOf(sgVar.f141489q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C89349b bVar = this.f141479d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f141480e);
            String str = this.f141481f;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f141482g;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f141483h;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f141484i);
            aVar.mo74318e(9, this.f141485j);
            aVar.mo74318e(10, this.f141486n);
            aVar.mo74320g(17, 8, this.f141487o);
            aVar.mo74321h(18, this.f141488p);
            aVar.mo74318e(22, this.f141489q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f141479d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int e = i2 + C52418a.m58678e(3, this.f141480e);
            String str4 = this.f141481f;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            String str5 = this.f141482g;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f141483h;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            return e + C52418a.m58678e(8, this.f141484i) + C52418a.m58678e(9, this.f141485j) + C52418a.m58678e(10, this.f141486n) + C52418a.m58680g(17, 8, this.f141487o) + C52418a.m58681h(18, this.f141488p) + C52418a.m58678e(22, this.f141489q);
        } else if (i == 2) {
            this.f141487o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51237sg sgVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    sgVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                sgVar.f141479d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                sgVar.f141480e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 17) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101856vd vdVar = new C101856vd();
                    if (bArr2 != null && bArr2.length > 0) {
                        vdVar.parseFrom(bArr2);
                    }
                    sgVar.f141487o.add(vdVar);
                }
                return 0;
            } else if (intValue == 18) {
                sgVar.f141488p = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 22) {
                switch (intValue) {
                    case 5:
                        sgVar.f141481f = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        sgVar.f141482g = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        sgVar.f141483h = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        sgVar.f141484i = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        sgVar.f141485j = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        sgVar.f141486n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                sgVar.f141489q = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
