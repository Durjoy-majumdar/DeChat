package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xn1 */
public class C64833xn1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186339d;

    /* renamed from: e */
    public String f186340e;

    /* renamed from: f */
    public String f186341f;

    /* renamed from: g */
    public String f186342g;

    /* renamed from: h */
    public String f186343h;

    /* renamed from: i */
    public long f186344i;

    /* renamed from: j */
    public String f186345j;

    /* renamed from: n */
    public long f186346n;

    /* renamed from: o */
    public long f186347o;

    /* renamed from: p */
    public int f186348p;

    /* renamed from: q */
    public int f186349q;

    /* renamed from: r */
    public LinkedList<C64829xh0> f186350r = new LinkedList<>();

    /* renamed from: s */
    public C89349b f186351s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64833xn1)) {
            return false;
        }
        C64833xn1 xn12 = (C64833xn1) aVar;
        return C46238a.m51546a(this.BaseRequest, xn12.BaseRequest) && C46238a.m51546a(this.f186339d, xn12.f186339d) && C46238a.m51546a(this.f186340e, xn12.f186340e) && C46238a.m51546a(this.f186341f, xn12.f186341f) && C46238a.m51546a(this.f186342g, xn12.f186342g) && C46238a.m51546a(this.f186343h, xn12.f186343h) && C46238a.m51546a(Long.valueOf(this.f186344i), Long.valueOf(xn12.f186344i)) && C46238a.m51546a(this.f186345j, xn12.f186345j) && C46238a.m51546a(Long.valueOf(this.f186346n), Long.valueOf(xn12.f186346n)) && C46238a.m51546a(Long.valueOf(this.f186347o), Long.valueOf(xn12.f186347o)) && C46238a.m51546a(Integer.valueOf(this.f186348p), Integer.valueOf(xn12.f186348p)) && C46238a.m51546a(Integer.valueOf(this.f186349q), Integer.valueOf(xn12.f186349q)) && C46238a.m51546a(this.f186350r, xn12.f186350r) && C46238a.m51546a(this.f186351s, xn12.f186351s);
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
            C49842ig0 ig02 = this.f186339d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186339d.writeFields(aVar);
            }
            String str = this.f186340e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f186341f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f186342g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f186343h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74321h(7, this.f186344i);
            String str5 = this.f186345j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74321h(9, this.f186346n);
            aVar.mo74321h(10, this.f186347o);
            aVar.mo74318e(11, this.f186348p);
            aVar.mo74318e(12, this.f186349q);
            aVar.mo74320g(13, 8, this.f186350r);
            C89349b bVar = this.f186351s;
            if (bVar != null) {
                aVar.mo74315b(100, bVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f186339d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str6 = this.f186340e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f186341f;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f186342g;
            if (str8 != null) {
                i3 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f186343h;
            if (str9 != null) {
                i3 += C52418a.m58683j(6, str9);
            }
            int h = i3 + C52418a.m58681h(7, this.f186344i);
            String str10 = this.f186345j;
            if (str10 != null) {
                h += C52418a.m58683j(8, str10);
            }
            int h2 = h + C52418a.m58681h(9, this.f186346n) + C52418a.m58681h(10, this.f186347o) + C52418a.m58678e(11, this.f186348p) + C52418a.m58678e(12, this.f186349q) + C52418a.m58680g(13, 8, this.f186350r);
            C89349b bVar2 = this.f186351s;
            return bVar2 != null ? h2 + C52418a.m58675b(100, bVar2) : h2;
        } else if (i2 == 2) {
            this.f186350r.clear();
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
            C64833xn1 xn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            xn12.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49842ig0 ig04 = new C49842ig0();
                            if (bArr2 != null && bArr2.length > 0) {
                                ig04.parseFrom(bArr2);
                            }
                            xn12.f186339d = ig04;
                        }
                        return 0;
                    case 3:
                        xn12.f186340e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        xn12.f186341f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        xn12.f186342g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        xn12.f186343h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        xn12.f186344i = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        xn12.f186345j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        xn12.f186346n = aVar3.mo141631i(intValue);
                        return 0;
                    case 10:
                        xn12.f186347o = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        xn12.f186348p = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        xn12.f186349q = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C64829xh0 xh02 = new C64829xh0();
                            if (bArr3 != null && bArr3.length > 0) {
                                xh02.parseFrom(bArr3);
                            }
                            xn12.f186350r.add(xh02);
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                xn12.f186351s = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
