package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class tt4 extends C101820nt3 {

    /* renamed from: d */
    public int f332265d;

    /* renamed from: e */
    public long f332266e;

    /* renamed from: f */
    public String f332267f;

    /* renamed from: g */
    public int f332268g;

    /* renamed from: h */
    public pv4 f332269h;

    /* renamed from: i */
    public pv4 f332270i;

    /* renamed from: j */
    public int f332271j;

    /* renamed from: n */
    public String f332272n;

    /* renamed from: o */
    public int f332273o;

    /* renamed from: p */
    public long f332274p;

    /* renamed from: q */
    public int f332275q;

    /* renamed from: r */
    public int f332276r;

    /* renamed from: s */
    public LinkedList<C101864x23> f332277s = new LinkedList<>();

    /* renamed from: t */
    public int f332278t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tt4)) {
            return false;
        }
        tt4 tt4 = (tt4) aVar;
        return C46238a.m51546a(this.BaseRequest, tt4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f332265d), Integer.valueOf(tt4.f332265d)) && C46238a.m51546a(Long.valueOf(this.f332266e), Long.valueOf(tt4.f332266e)) && C46238a.m51546a(this.f332267f, tt4.f332267f) && C46238a.m51546a(Integer.valueOf(this.f332268g), Integer.valueOf(tt4.f332268g)) && C46238a.m51546a(this.f332269h, tt4.f332269h) && C46238a.m51546a(this.f332270i, tt4.f332270i) && C46238a.m51546a(Integer.valueOf(this.f332271j), Integer.valueOf(tt4.f332271j)) && C46238a.m51546a(this.f332272n, tt4.f332272n) && C46238a.m51546a(Integer.valueOf(this.f332273o), Integer.valueOf(tt4.f332273o)) && C46238a.m51546a(Long.valueOf(this.f332274p), Long.valueOf(tt4.f332274p)) && C46238a.m51546a(Integer.valueOf(this.f332275q), Integer.valueOf(tt4.f332275q)) && C46238a.m51546a(Integer.valueOf(this.f332276r), Integer.valueOf(tt4.f332276r)) && C46238a.m51546a(this.f332277s, tt4.f332277s) && C46238a.m51546a(Integer.valueOf(this.f332278t), Integer.valueOf(tt4.f332278t));
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
            aVar.mo74318e(2, this.f332265d);
            aVar.mo74321h(3, this.f332266e);
            String str = this.f332267f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f332268g);
            pv4 pv4 = this.f332269h;
            if (pv4 != null) {
                aVar.mo74322i(6, pv4.computeSize());
                this.f332269h.writeFields(aVar);
            }
            pv4 pv42 = this.f332270i;
            if (pv42 != null) {
                aVar.mo74322i(7, pv42.computeSize());
                this.f332270i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f332271j);
            String str2 = this.f332272n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74318e(10, this.f332273o);
            aVar.mo74321h(11, this.f332274p);
            aVar.mo74318e(12, this.f332275q);
            aVar.mo74318e(13, this.f332276r);
            aVar.mo74320g(14, 8, this.f332277s);
            aVar.mo74318e(15, this.f332278t);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f332265d) + C52418a.m58681h(3, this.f332266e);
            String str3 = this.f332267f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f332268g);
            pv4 pv43 = this.f332269h;
            if (pv43 != null) {
                e2 += C52418a.m58682i(6, pv43.computeSize());
            }
            pv4 pv44 = this.f332270i;
            if (pv44 != null) {
                e2 += C52418a.m58682i(7, pv44.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(8, this.f332271j);
            String str4 = this.f332272n;
            if (str4 != null) {
                e3 += C52418a.m58683j(9, str4);
            }
            return e3 + C52418a.m58678e(10, this.f332273o) + C52418a.m58681h(11, this.f332274p) + C52418a.m58678e(12, this.f332275q) + C52418a.m58678e(13, this.f332276r) + C52418a.m58680g(14, 8, this.f332277s) + C52418a.m58678e(15, this.f332278t);
        } else if (i2 == 2) {
            this.f332277s.clear();
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
            tt4 tt4 = objArr[1];
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
                        tt4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tt4.f332265d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tt4.f332266e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    tt4.f332267f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tt4.f332268g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        pv4 pv45 = new pv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            pv45.parseFrom(bArr2);
                        }
                        tt4.f332269h = pv45;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        pv4 pv46 = new pv4();
                        if (bArr3 != null && bArr3.length > 0) {
                            pv46.parseFrom(bArr3);
                        }
                        tt4.f332270i = pv46;
                    }
                    return 0;
                case 8:
                    tt4.f332271j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tt4.f332272n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    tt4.f332273o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    tt4.f332274p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    tt4.f332275q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    tt4.f332276r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C101864x23 x232 = new C101864x23();
                        if (bArr4 != null && bArr4.length > 0) {
                            x232.parseFrom(bArr4);
                        }
                        tt4.f332277s.add(x232);
                    }
                    return 0;
                case 15:
                    tt4.f332278t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
