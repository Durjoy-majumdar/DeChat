package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xo0 */
public class C64835xo0 extends C101820nt3 {

    /* renamed from: d */
    public int f186356d;

    /* renamed from: e */
    public String f186357e;

    /* renamed from: f */
    public C49842ig0 f186358f;

    /* renamed from: g */
    public String f186359g;

    /* renamed from: h */
    public long f186360h;

    /* renamed from: i */
    public long f186361i;

    /* renamed from: j */
    public String f186362j;

    /* renamed from: n */
    public int f186363n;

    /* renamed from: o */
    public boolean f186364o;

    /* renamed from: p */
    public long f186365p;

    /* renamed from: q */
    public C89349b f186366q;

    /* renamed from: r */
    public String f186367r;

    /* renamed from: s */
    public String f186368s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64835xo0)) {
            return false;
        }
        C64835xo0 xo02 = (C64835xo0) aVar;
        return C46238a.m51546a(this.BaseRequest, xo02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f186356d), Integer.valueOf(xo02.f186356d)) && C46238a.m51546a(this.f186357e, xo02.f186357e) && C46238a.m51546a(this.f186358f, xo02.f186358f) && C46238a.m51546a(this.f186359g, xo02.f186359g) && C46238a.m51546a(Long.valueOf(this.f186360h), Long.valueOf(xo02.f186360h)) && C46238a.m51546a(Long.valueOf(this.f186361i), Long.valueOf(xo02.f186361i)) && C46238a.m51546a(this.f186362j, xo02.f186362j) && C46238a.m51546a(Integer.valueOf(this.f186363n), Integer.valueOf(xo02.f186363n)) && C46238a.m51546a(Boolean.valueOf(this.f186364o), Boolean.valueOf(xo02.f186364o)) && C46238a.m51546a(Long.valueOf(this.f186365p), Long.valueOf(xo02.f186365p)) && C46238a.m51546a(this.f186366q, xo02.f186366q) && C46238a.m51546a(this.f186367r, xo02.f186367r) && C46238a.m51546a(this.f186368s, xo02.f186368s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f186356d);
            String str = this.f186357e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C49842ig0 ig02 = this.f186358f;
            if (ig02 != null) {
                aVar.mo74322i(4, ig02.computeSize());
                this.f186358f.writeFields(aVar);
            }
            String str2 = this.f186359g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f186360h);
            aVar.mo74321h(7, this.f186361i);
            String str3 = this.f186362j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f186363n);
            aVar.mo74314a(10, this.f186364o);
            aVar.mo74321h(11, this.f186365p);
            C89349b bVar = this.f186366q;
            if (bVar != null) {
                aVar.mo74315b(12, bVar);
            }
            String str4 = this.f186367r;
            if (str4 != null) {
                aVar.mo74323j(13, str4);
            }
            String str5 = this.f186368s;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f186356d);
            String str6 = this.f186357e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            C49842ig0 ig03 = this.f186358f;
            if (ig03 != null) {
                e += C52418a.m58682i(4, ig03.computeSize());
            }
            String str7 = this.f186359g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int h = e + C52418a.m58681h(6, this.f186360h) + C52418a.m58681h(7, this.f186361i);
            String str8 = this.f186362j;
            if (str8 != null) {
                h += C52418a.m58683j(8, str8);
            }
            int e2 = h + C52418a.m58678e(9, this.f186363n) + C52418a.m58674a(10, this.f186364o) + C52418a.m58681h(11, this.f186365p);
            C89349b bVar2 = this.f186366q;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(12, bVar2);
            }
            String str9 = this.f186367r;
            if (str9 != null) {
                e2 += C52418a.m58683j(13, str9);
            }
            String str10 = this.f186368s;
            return str10 != null ? e2 + C52418a.m58683j(14, str10) : e2;
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
            C64835xo0 xo02 = objArr[1];
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
                        xo02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xo02.f186356d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xo02.f186357e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        xo02.f186358f = ig04;
                    }
                    return 0;
                case 5:
                    xo02.f186359g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xo02.f186360h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    xo02.f186361i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    xo02.f186362j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xo02.f186363n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    xo02.f186364o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    xo02.f186365p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    xo02.f186366q = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    xo02.f186367r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    xo02.f186368s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
