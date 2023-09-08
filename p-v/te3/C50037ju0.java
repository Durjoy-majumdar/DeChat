package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ju0 */
public class C50037ju0 extends C47465a {

    /* renamed from: d */
    public String f136329d;

    /* renamed from: e */
    public int f136330e;

    /* renamed from: f */
    public int f136331f;

    /* renamed from: g */
    public C50767p11 f136332g;

    /* renamed from: h */
    public String f136333h;

    /* renamed from: i */
    public int f136334i;

    /* renamed from: j */
    public String f136335j;

    /* renamed from: n */
    public C48928bz0 f136336n;

    /* renamed from: o */
    public C51600uu3 f136337o;

    /* renamed from: p */
    public LinkedList<C51769w11> f136338p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50037ju0)) {
            return false;
        }
        C50037ju0 ju02 = (C50037ju0) aVar;
        return C46238a.m51546a(this.f136329d, ju02.f136329d) && C46238a.m51546a(Integer.valueOf(this.f136330e), Integer.valueOf(ju02.f136330e)) && C46238a.m51546a(Integer.valueOf(this.f136331f), Integer.valueOf(ju02.f136331f)) && C46238a.m51546a(this.f136332g, ju02.f136332g) && C46238a.m51546a(this.f136333h, ju02.f136333h) && C46238a.m51546a(Integer.valueOf(this.f136334i), Integer.valueOf(ju02.f136334i)) && C46238a.m51546a(this.f136335j, ju02.f136335j) && C46238a.m51546a(this.f136336n, ju02.f136336n) && C46238a.m51546a(this.f136337o, ju02.f136337o) && C46238a.m51546a(this.f136338p, ju02.f136338p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136329d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f136330e);
            aVar.mo74318e(3, this.f136331f);
            C50767p11 p112 = this.f136332g;
            if (p112 != null) {
                aVar.mo74322i(4, p112.computeSize());
                this.f136332g.writeFields(aVar);
            }
            String str2 = this.f136333h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f136334i);
            String str3 = this.f136335j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C48928bz0 bz02 = this.f136336n;
            if (bz02 != null) {
                aVar.mo74322i(8, bz02.computeSize());
                this.f136336n.writeFields(aVar);
            }
            C51600uu3 uu32 = this.f136337o;
            if (uu32 != null) {
                aVar.mo74322i(9, uu32.computeSize());
                this.f136337o.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f136338p);
            return 0;
        } else if (i == 1) {
            String str4 = this.f136329d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f136330e) + C52418a.m58678e(3, this.f136331f);
            C50767p11 p113 = this.f136332g;
            if (p113 != null) {
                e += C52418a.m58682i(4, p113.computeSize());
            }
            String str5 = this.f136333h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f136334i);
            String str6 = this.f136335j;
            if (str6 != null) {
                e2 += C52418a.m58683j(7, str6);
            }
            C48928bz0 bz03 = this.f136336n;
            if (bz03 != null) {
                e2 += C52418a.m58682i(8, bz03.computeSize());
            }
            C51600uu3 uu33 = this.f136337o;
            if (uu33 != null) {
                e2 += C52418a.m58682i(9, uu33.computeSize());
            }
            return e2 + C52418a.m58680g(10, 8, this.f136338p);
        } else if (i == 2) {
            this.f136338p.clear();
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
            C50037ju0 ju02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ju02.f136329d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ju02.f136330e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ju02.f136331f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50767p11 p114 = new C50767p11();
                        if (bArr != null && bArr.length > 0) {
                            p114.parseFrom(bArr);
                        }
                        ju02.f136332g = p114;
                    }
                    return 0;
                case 5:
                    ju02.f136333h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ju02.f136334i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ju02.f136335j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48928bz0 bz04 = new C48928bz0();
                        if (bArr2 != null && bArr2.length > 0) {
                            bz04.parseFrom(bArr2);
                        }
                        ju02.f136336n = bz04;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51600uu3 uu34 = new C51600uu3();
                        if (bArr3 != null && bArr3.length > 0) {
                            uu34.parseFrom(bArr3);
                        }
                        ju02.f136337o = uu34;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51769w11 w112 = new C51769w11();
                        if (bArr4 != null && bArr4.length > 0) {
                            w112.parseFrom(bArr4);
                        }
                        ju02.f136338p.add(w112);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
