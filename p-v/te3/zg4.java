package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zg4 extends C47465a {

    /* renamed from: d */
    public int f145937d;

    /* renamed from: e */
    public int f145938e;

    /* renamed from: f */
    public String f145939f;

    /* renamed from: g */
    public String f145940g;

    /* renamed from: h */
    public int f145941h;

    /* renamed from: i */
    public int f145942i;

    /* renamed from: j */
    public LinkedList<yg4> f145943j = new LinkedList<>();

    /* renamed from: n */
    public boolean f145944n;

    /* renamed from: o */
    public String f145945o;

    /* renamed from: p */
    public LinkedList<bh4> f145946p = new LinkedList<>();

    /* renamed from: q */
    public String f145947q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zg4)) {
            return false;
        }
        zg4 zg4 = (zg4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145937d), Integer.valueOf(zg4.f145937d)) && C46238a.m51546a(Integer.valueOf(this.f145938e), Integer.valueOf(zg4.f145938e)) && C46238a.m51546a(this.f145939f, zg4.f145939f) && C46238a.m51546a(this.f145940g, zg4.f145940g) && C46238a.m51546a(Integer.valueOf(this.f145941h), Integer.valueOf(zg4.f145941h)) && C46238a.m51546a(Integer.valueOf(this.f145942i), Integer.valueOf(zg4.f145942i)) && C46238a.m51546a(this.f145943j, zg4.f145943j) && C46238a.m51546a(Boolean.valueOf(this.f145944n), Boolean.valueOf(zg4.f145944n)) && C46238a.m51546a(this.f145945o, zg4.f145945o) && C46238a.m51546a(this.f145946p, zg4.f145946p) && C46238a.m51546a(this.f145947q, zg4.f145947q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145937d);
            aVar.mo74318e(2, this.f145938e);
            String str = this.f145939f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f145940g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f145941h);
            aVar.mo74318e(6, this.f145942i);
            aVar.mo74320g(7, 8, this.f145943j);
            aVar.mo74314a(8, this.f145944n);
            String str3 = this.f145945o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74320g(10, 8, this.f145946p);
            String str4 = this.f145947q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145937d) + 0 + C52418a.m58678e(2, this.f145938e);
            String str5 = this.f145939f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f145940g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f145941h) + C52418a.m58678e(6, this.f145942i) + C52418a.m58680g(7, 8, this.f145943j) + C52418a.m58674a(8, this.f145944n);
            String str7 = this.f145945o;
            if (str7 != null) {
                e2 += C52418a.m58683j(9, str7);
            }
            int g = e2 + C52418a.m58680g(10, 8, this.f145946p);
            String str8 = this.f145947q;
            return str8 != null ? g + C52418a.m58683j(11, str8) : g;
        } else if (i == 2) {
            this.f145943j.clear();
            this.f145946p.clear();
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
            zg4 zg4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zg4.f145937d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zg4.f145938e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zg4.f145939f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zg4.f145940g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zg4.f145941h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zg4.f145942i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        yg4 yg4 = new yg4();
                        if (bArr != null && bArr.length > 0) {
                            yg4.parseFrom(bArr);
                        }
                        zg4.f145943j.add(yg4);
                    }
                    return 0;
                case 8:
                    zg4.f145944n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    zg4.f145945o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        bh4 bh4 = new bh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            bh4.parseFrom(bArr2);
                        }
                        zg4.f145946p.add(bh4);
                    }
                    return 0;
                case 11:
                    zg4.f145947q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
