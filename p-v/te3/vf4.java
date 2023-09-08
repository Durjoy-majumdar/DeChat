package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vf4 extends C47465a {

    /* renamed from: d */
    public long f143461d;

    /* renamed from: e */
    public String f143462e;

    /* renamed from: f */
    public String f143463f;

    /* renamed from: g */
    public float f143464g;

    /* renamed from: h */
    public C50456mv3 f143465h;

    /* renamed from: i */
    public int f143466i;

    /* renamed from: j */
    public String f143467j;

    /* renamed from: n */
    public C52219z50 f143468n;

    /* renamed from: o */
    public C52219z50 f143469o;

    /* renamed from: p */
    public float f143470p;

    /* renamed from: q */
    public int f143471q;

    /* renamed from: r */
    public C50059k00 f143472r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vf4)) {
            return false;
        }
        vf4 vf4 = (vf4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f143461d), Long.valueOf(vf4.f143461d)) && C46238a.m51546a(this.f143462e, vf4.f143462e) && C46238a.m51546a(this.f143463f, vf4.f143463f) && C46238a.m51546a(Float.valueOf(this.f143464g), Float.valueOf(vf4.f143464g)) && C46238a.m51546a(this.f143465h, vf4.f143465h) && C46238a.m51546a(Integer.valueOf(this.f143466i), Integer.valueOf(vf4.f143466i)) && C46238a.m51546a(this.f143467j, vf4.f143467j) && C46238a.m51546a(this.f143468n, vf4.f143468n) && C46238a.m51546a(this.f143469o, vf4.f143469o) && C46238a.m51546a(Float.valueOf(this.f143470p), Float.valueOf(vf4.f143470p)) && C46238a.m51546a(Integer.valueOf(this.f143471q), Integer.valueOf(vf4.f143471q)) && C46238a.m51546a(this.f143472r, vf4.f143472r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f143461d);
            String str = this.f143462e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143463f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74317d(4, this.f143464g);
            C50456mv3 mv32 = this.f143465h;
            if (mv32 != null) {
                aVar.mo74322i(5, mv32.computeSize());
                this.f143465h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f143466i);
            String str3 = this.f143467j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C52219z50 z502 = this.f143468n;
            if (z502 != null) {
                aVar.mo74322i(8, z502.computeSize());
                this.f143468n.writeFields(aVar);
            }
            C52219z50 z503 = this.f143469o;
            if (z503 != null) {
                aVar.mo74322i(9, z503.computeSize());
                this.f143469o.writeFields(aVar);
            }
            aVar.mo74317d(10, this.f143470p);
            aVar.mo74318e(11, this.f143471q);
            C50059k00 k002 = this.f143472r;
            if (k002 == null) {
                return 0;
            }
            aVar.mo74322i(12, k002.computeSize());
            this.f143472r.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f143461d) + 0;
            String str4 = this.f143462e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.f143463f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            int d = h + C52418a.m58677d(4, this.f143464g);
            C50456mv3 mv33 = this.f143465h;
            if (mv33 != null) {
                d += C52418a.m58682i(5, mv33.computeSize());
            }
            int e = d + C52418a.m58678e(6, this.f143466i);
            String str6 = this.f143467j;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            C52219z50 z504 = this.f143468n;
            if (z504 != null) {
                e += C52418a.m58682i(8, z504.computeSize());
            }
            C52219z50 z505 = this.f143469o;
            if (z505 != null) {
                e += C52418a.m58682i(9, z505.computeSize());
            }
            int d2 = e + C52418a.m58677d(10, this.f143470p) + C52418a.m58678e(11, this.f143471q);
            C50059k00 k003 = this.f143472r;
            return k003 != null ? d2 + C52418a.m58682i(12, k003.computeSize()) : d2;
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
            vf4 vf4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vf4.f143461d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    vf4.f143462e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vf4.f143463f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vf4.f143464g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr != null && bArr.length > 0) {
                            mv34.parseFrom(bArr);
                        }
                        vf4.f143465h = mv34;
                    }
                    return 0;
                case 6:
                    vf4.f143466i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vf4.f143467j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52219z50 z506 = new C52219z50();
                        if (bArr2 != null && bArr2.length > 0) {
                            z506.parseFrom(bArr2);
                        }
                        vf4.f143468n = z506;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52219z50 z507 = new C52219z50();
                        if (bArr3 != null && bArr3.length > 0) {
                            z507.parseFrom(bArr3);
                        }
                        vf4.f143469o = z507;
                    }
                    return 0;
                case 10:
                    vf4.f143470p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    vf4.f143471q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50059k00 k004 = new C50059k00();
                        if (bArr4 != null && bArr4.length > 0) {
                            k004.parseFrom(bArr4);
                        }
                        vf4.f143472r = k004;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
