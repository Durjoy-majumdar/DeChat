package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pq2 */
public class C64636pq2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64689rq2> f184875d = new LinkedList<>();

    /* renamed from: e */
    public C64726td1 f184876e;

    /* renamed from: f */
    public String f184877f;

    /* renamed from: g */
    public String f184878g;

    /* renamed from: h */
    public String f184879h;

    /* renamed from: i */
    public boolean f184880i;

    /* renamed from: j */
    public boolean f184881j;

    /* renamed from: n */
    public int f184882n;

    /* renamed from: o */
    public String f184883o;

    /* renamed from: p */
    public boolean f184884p;

    /* renamed from: q */
    public String f184885q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64636pq2)) {
            return false;
        }
        C64636pq2 pq22 = (C64636pq2) aVar;
        return C46238a.m51546a(this.f184875d, pq22.f184875d) && C46238a.m51546a(this.f184876e, pq22.f184876e) && C46238a.m51546a(this.f184877f, pq22.f184877f) && C46238a.m51546a(this.f184878g, pq22.f184878g) && C46238a.m51546a(this.f184879h, pq22.f184879h) && C46238a.m51546a(Boolean.valueOf(this.f184880i), Boolean.valueOf(pq22.f184880i)) && C46238a.m51546a(Boolean.valueOf(this.f184881j), Boolean.valueOf(pq22.f184881j)) && C46238a.m51546a(Integer.valueOf(this.f184882n), Integer.valueOf(pq22.f184882n)) && C46238a.m51546a(this.f184883o, pq22.f184883o) && C46238a.m51546a(Boolean.valueOf(this.f184884p), Boolean.valueOf(pq22.f184884p)) && C46238a.m51546a(this.f184885q, pq22.f184885q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f184875d);
            C64726td1 td12 = this.f184876e;
            if (td12 != null) {
                aVar.mo74322i(2, td12.computeSize());
                this.f184876e.writeFields(aVar);
            }
            String str = this.f184877f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f184878g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f184879h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74314a(6, this.f184880i);
            aVar.mo74314a(7, this.f184881j);
            aVar.mo74318e(8, this.f184882n);
            String str4 = this.f184883o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74314a(10, this.f184884p);
            String str5 = this.f184885q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f184875d) + 0;
            C64726td1 td13 = this.f184876e;
            if (td13 != null) {
                g += C52418a.m58682i(2, td13.computeSize());
            }
            String str6 = this.f184877f;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            String str7 = this.f184878g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f184879h;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            int a = g + C52418a.m58674a(6, this.f184880i) + C52418a.m58674a(7, this.f184881j) + C52418a.m58678e(8, this.f184882n);
            String str9 = this.f184883o;
            if (str9 != null) {
                a += C52418a.m58683j(9, str9);
            }
            int a2 = a + C52418a.m58674a(10, this.f184884p);
            String str10 = this.f184885q;
            return str10 != null ? a2 + C52418a.m58683j(11, str10) : a2;
        } else if (i == 2) {
            this.f184875d.clear();
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
            C64636pq2 pq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64689rq2 rq22 = new C64689rq2();
                        if (bArr != null && bArr.length > 0) {
                            rq22.parseFrom(bArr);
                        }
                        pq22.f184875d.add(rq22);
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64726td1 td14 = new C64726td1();
                        if (bArr2 != null && bArr2.length > 0) {
                            td14.parseFrom(bArr2);
                        }
                        pq22.f184876e = td14;
                    }
                    return 0;
                case 3:
                    pq22.f184877f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pq22.f184878g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pq22.f184879h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pq22.f184880i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    pq22.f184881j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    pq22.f184882n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pq22.f184883o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    pq22.f184884p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    pq22.f184885q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
