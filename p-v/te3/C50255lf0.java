package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lf0 */
public class C50255lf0 extends C101820nt3 {

    /* renamed from: d */
    public String f137372d;

    /* renamed from: e */
    public long f137373e;

    /* renamed from: f */
    public String f137374f;

    /* renamed from: g */
    public String f137375g;

    /* renamed from: h */
    public int f137376h;

    /* renamed from: i */
    public C49842ig0 f137377i;

    /* renamed from: j */
    public C89349b f137378j;

    /* renamed from: n */
    public int f137379n;

    /* renamed from: o */
    public C49704hh0 f137380o;

    /* renamed from: p */
    public long f137381p;

    /* renamed from: q */
    public String f137382q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50255lf0)) {
            return false;
        }
        C50255lf0 lf02 = (C50255lf0) aVar;
        return C46238a.m51546a(this.BaseRequest, lf02.BaseRequest) && C46238a.m51546a(this.f137372d, lf02.f137372d) && C46238a.m51546a(Long.valueOf(this.f137373e), Long.valueOf(lf02.f137373e)) && C46238a.m51546a(this.f137374f, lf02.f137374f) && C46238a.m51546a(this.f137375g, lf02.f137375g) && C46238a.m51546a(Integer.valueOf(this.f137376h), Integer.valueOf(lf02.f137376h)) && C46238a.m51546a(this.f137377i, lf02.f137377i) && C46238a.m51546a(this.f137378j, lf02.f137378j) && C46238a.m51546a(Integer.valueOf(this.f137379n), Integer.valueOf(lf02.f137379n)) && C46238a.m51546a(this.f137380o, lf02.f137380o) && C46238a.m51546a(Long.valueOf(this.f137381p), Long.valueOf(lf02.f137381p)) && C46238a.m51546a(this.f137382q, lf02.f137382q);
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
            String str = this.f137372d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f137373e);
            String str2 = this.f137374f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f137375g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f137376h);
            C49842ig0 ig02 = this.f137377i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f137377i.writeFields(aVar);
            }
            C89349b bVar = this.f137378j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74318e(9, this.f137379n);
            C49704hh0 hh02 = this.f137380o;
            if (hh02 != null) {
                aVar.mo74322i(10, hh02.computeSize());
                this.f137380o.writeFields(aVar);
            }
            aVar.mo74321h(11, this.f137381p);
            String str4 = this.f137382q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f137372d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f137373e);
            String str6 = this.f137374f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f137375g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            int e = h + C52418a.m58678e(6, this.f137376h);
            C49842ig0 ig03 = this.f137377i;
            if (ig03 != null) {
                e += C52418a.m58682i(7, ig03.computeSize());
            }
            C89349b bVar2 = this.f137378j;
            if (bVar2 != null) {
                e += C52418a.m58675b(8, bVar2);
            }
            int e2 = e + C52418a.m58678e(9, this.f137379n);
            C49704hh0 hh03 = this.f137380o;
            if (hh03 != null) {
                e2 += C52418a.m58682i(10, hh03.computeSize());
            }
            int h2 = e2 + C52418a.m58681h(11, this.f137381p);
            String str8 = this.f137382q;
            return str8 != null ? h2 + C52418a.m58683j(12, str8) : h2;
        } else if (i == 2) {
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
            C50255lf0 lf02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        lf02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    lf02.f137372d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lf02.f137373e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    lf02.f137374f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lf02.f137375g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lf02.f137376h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        lf02.f137377i = ig04;
                    }
                    return 0;
                case 8:
                    lf02.f137378j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    lf02.f137379n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        lf02.f137380o = hh04;
                    }
                    return 0;
                case 11:
                    lf02.f137381p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    lf02.f137382q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
