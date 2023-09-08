package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xd1 */
public class C51959xd1 extends C47465a {

    /* renamed from: d */
    public long f144600d;

    /* renamed from: e */
    public String f144601e;

    /* renamed from: f */
    public LinkedList<C49018cl1> f144602f = new LinkedList<>();

    /* renamed from: g */
    public C64726td1 f144603g;

    /* renamed from: h */
    public int f144604h;

    /* renamed from: i */
    public int f144605i;

    /* renamed from: j */
    public C52101yd1 f144606j;

    /* renamed from: n */
    public String f144607n;

    /* renamed from: o */
    public int f144608o;

    /* renamed from: p */
    public int f144609p;

    /* renamed from: q */
    public String f144610q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51959xd1)) {
            return false;
        }
        C51959xd1 xd12 = (C51959xd1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144600d), Long.valueOf(xd12.f144600d)) && C46238a.m51546a(this.f144601e, xd12.f144601e) && C46238a.m51546a(this.f144602f, xd12.f144602f) && C46238a.m51546a(this.f144603g, xd12.f144603g) && C46238a.m51546a(Integer.valueOf(this.f144604h), Integer.valueOf(xd12.f144604h)) && C46238a.m51546a(Integer.valueOf(this.f144605i), Integer.valueOf(xd12.f144605i)) && C46238a.m51546a(this.f144606j, xd12.f144606j) && C46238a.m51546a(this.f144607n, xd12.f144607n) && C46238a.m51546a(Integer.valueOf(this.f144608o), Integer.valueOf(xd12.f144608o)) && C46238a.m51546a(Integer.valueOf(this.f144609p), Integer.valueOf(xd12.f144609p)) && C46238a.m51546a(this.f144610q, xd12.f144610q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144600d);
            String str = this.f144601e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f144602f);
            C64726td1 td12 = this.f144603g;
            if (td12 != null) {
                aVar.mo74322i(4, td12.computeSize());
                this.f144603g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f144604h);
            aVar.mo74318e(6, this.f144605i);
            C52101yd1 yd12 = this.f144606j;
            if (yd12 != null) {
                aVar.mo74322i(7, yd12.computeSize());
                this.f144606j.writeFields(aVar);
            }
            String str2 = this.f144607n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f144608o);
            aVar.mo74318e(10, this.f144609p);
            String str3 = this.f144610q;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f144600d) + 0;
            String str4 = this.f144601e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int g = h + C52418a.m58680g(3, 8, this.f144602f);
            C64726td1 td13 = this.f144603g;
            if (td13 != null) {
                g += C52418a.m58682i(4, td13.computeSize());
            }
            int e = g + C52418a.m58678e(5, this.f144604h) + C52418a.m58678e(6, this.f144605i);
            C52101yd1 yd13 = this.f144606j;
            if (yd13 != null) {
                e += C52418a.m58682i(7, yd13.computeSize());
            }
            String str5 = this.f144607n;
            if (str5 != null) {
                e += C52418a.m58683j(8, str5);
            }
            int e2 = e + C52418a.m58678e(9, this.f144608o) + C52418a.m58678e(10, this.f144609p);
            String str6 = this.f144610q;
            return str6 != null ? e2 + C52418a.m58683j(13, str6) : e2;
        } else if (i2 == 2) {
            this.f144602f.clear();
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
            C51959xd1 xd12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 13) {
                switch (intValue) {
                    case 1:
                        xd12.f144600d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        xd12.f144601e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C49018cl1 cl12 = new C49018cl1();
                            if (bArr != null && bArr.length > 0) {
                                cl12.parseFrom(bArr);
                            }
                            xd12.f144602f.add(cl12);
                        }
                        return 0;
                    case 4:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C64726td1 td14 = new C64726td1();
                            if (bArr2 != null && bArr2.length > 0) {
                                td14.parseFrom(bArr2);
                            }
                            xd12.f144603g = td14;
                        }
                        return 0;
                    case 5:
                        xd12.f144604h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        xd12.f144605i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C52101yd1 yd14 = new C52101yd1();
                            if (bArr3 != null && bArr3.length > 0) {
                                yd14.parseFrom(bArr3);
                            }
                            xd12.f144606j = yd14;
                        }
                        return 0;
                    case 8:
                        xd12.f144607n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        xd12.f144608o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        xd12.f144609p = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                xd12.f144610q = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
