package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cv2 */
public class C49053cv2 extends C47465a {

    /* renamed from: d */
    public long f131973d;

    /* renamed from: e */
    public long f131974e;

    /* renamed from: f */
    public long f131975f;

    /* renamed from: g */
    public long f131976g;

    /* renamed from: h */
    public long f131977h;

    /* renamed from: i */
    public long f131978i;

    /* renamed from: j */
    public long f131979j;

    /* renamed from: n */
    public LinkedList<u35> f131980n = new LinkedList<>();

    /* renamed from: o */
    public long f131981o;

    /* renamed from: p */
    public boolean f131982p;

    /* renamed from: q */
    public double f131983q;

    /* renamed from: r */
    public LinkedList<u35> f131984r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<uj4> f131985s = new LinkedList<>();

    /* renamed from: t */
    public si4 f131986t;

    /* renamed from: u */
    public String f131987u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49053cv2)) {
            return false;
        }
        C49053cv2 cv22 = (C49053cv2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131973d), Long.valueOf(cv22.f131973d)) && C46238a.m51546a(Long.valueOf(this.f131974e), Long.valueOf(cv22.f131974e)) && C46238a.m51546a(Long.valueOf(this.f131975f), Long.valueOf(cv22.f131975f)) && C46238a.m51546a(Long.valueOf(this.f131976g), Long.valueOf(cv22.f131976g)) && C46238a.m51546a(Long.valueOf(this.f131977h), Long.valueOf(cv22.f131977h)) && C46238a.m51546a(Long.valueOf(this.f131978i), Long.valueOf(cv22.f131978i)) && C46238a.m51546a(Long.valueOf(this.f131979j), Long.valueOf(cv22.f131979j)) && C46238a.m51546a(this.f131980n, cv22.f131980n) && C46238a.m51546a(Long.valueOf(this.f131981o), Long.valueOf(cv22.f131981o)) && C46238a.m51546a(Boolean.valueOf(this.f131982p), Boolean.valueOf(cv22.f131982p)) && C46238a.m51546a(Double.valueOf(this.f131983q), Double.valueOf(cv22.f131983q)) && C46238a.m51546a(this.f131984r, cv22.f131984r) && C46238a.m51546a(this.f131985s, cv22.f131985s) && C46238a.m51546a(this.f131986t, cv22.f131986t) && C46238a.m51546a(this.f131987u, cv22.f131987u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131973d);
            aVar.mo74321h(2, this.f131974e);
            aVar.mo74321h(3, this.f131975f);
            aVar.mo74321h(4, this.f131976g);
            aVar.mo74321h(5, this.f131977h);
            aVar.mo74321h(6, this.f131978i);
            aVar.mo74321h(7, this.f131979j);
            aVar.mo74320g(8, 8, this.f131980n);
            aVar.mo74321h(9, this.f131981o);
            aVar.mo74314a(10, this.f131982p);
            aVar.mo74316c(11, this.f131983q);
            aVar.mo74320g(12, 8, this.f131984r);
            aVar.mo74320g(13, 8, this.f131985s);
            si4 si4 = this.f131986t;
            if (si4 != null) {
                aVar.mo74322i(14, si4.computeSize());
                this.f131986t.writeFields(aVar);
            }
            String str = this.f131987u;
            if (str != null) {
                aVar.mo74323j(15, str);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f131973d) + 0 + C52418a.m58681h(2, this.f131974e) + C52418a.m58681h(3, this.f131975f) + C52418a.m58681h(4, this.f131976g) + C52418a.m58681h(5, this.f131977h) + C52418a.m58681h(6, this.f131978i) + C52418a.m58681h(7, this.f131979j) + C52418a.m58680g(8, 8, this.f131980n) + C52418a.m58681h(9, this.f131981o) + C52418a.m58674a(10, this.f131982p) + C52418a.m58676c(11, this.f131983q) + C52418a.m58680g(12, 8, this.f131984r) + C52418a.m58680g(13, 8, this.f131985s);
            si4 si42 = this.f131986t;
            if (si42 != null) {
                h += C52418a.m58682i(14, si42.computeSize());
            }
            String str2 = this.f131987u;
            return str2 != null ? h + C52418a.m58683j(15, str2) : h;
        } else if (i2 == 2) {
            this.f131980n.clear();
            this.f131984r.clear();
            this.f131985s.clear();
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
            C49053cv2 cv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cv22.f131973d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    cv22.f131974e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    cv22.f131975f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    cv22.f131976g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    cv22.f131977h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    cv22.f131978i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    cv22.f131979j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        u35 u35 = new u35();
                        if (bArr != null && bArr.length > 0) {
                            u35.parseFrom(bArr);
                        }
                        cv22.f131980n.add(u35);
                    }
                    return 0;
                case 9:
                    cv22.f131981o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    cv22.f131982p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    cv22.f131983q = aVar3.mo141627e(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        u35 u352 = new u35();
                        if (bArr2 != null && bArr2.length > 0) {
                            u352.parseFrom(bArr2);
                        }
                        cv22.f131984r.add(u352);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        uj4 uj4 = new uj4();
                        if (bArr3 != null && bArr3.length > 0) {
                            uj4.parseFrom(bArr3);
                        }
                        cv22.f131985s.add(uj4);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        si4 si43 = new si4();
                        if (bArr4 != null && bArr4.length > 0) {
                            si43.parseFrom(bArr4);
                        }
                        cv22.f131986t = si43;
                    }
                    return 0;
                case 15:
                    cv22.f131987u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
