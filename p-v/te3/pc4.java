package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pc4 extends C47465a {

    /* renamed from: d */
    public String f299132d;

    /* renamed from: e */
    public String f299133e;

    /* renamed from: f */
    public int f299134f;

    /* renamed from: g */
    public C101765cp3 f299135g;

    /* renamed from: h */
    public sb4 f299136h;

    /* renamed from: i */
    public long f299137i;

    /* renamed from: j */
    public String f299138j;

    /* renamed from: n */
    public int f299139n;

    /* renamed from: o */
    public int f299140o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pc4)) {
            return false;
        }
        pc4 pc4 = (pc4) aVar;
        return C46238a.m51546a(this.f299132d, pc4.f299132d) && C46238a.m51546a(this.f299133e, pc4.f299133e) && C46238a.m51546a(Integer.valueOf(this.f299134f), Integer.valueOf(pc4.f299134f)) && C46238a.m51546a(this.f299135g, pc4.f299135g) && C46238a.m51546a(this.f299136h, pc4.f299136h) && C46238a.m51546a(Long.valueOf(this.f299137i), Long.valueOf(pc4.f299137i)) && C46238a.m51546a(this.f299138j, pc4.f299138j) && C46238a.m51546a(Integer.valueOf(this.f299139n), Integer.valueOf(pc4.f299139n)) && C46238a.m51546a(Integer.valueOf(this.f299140o), Integer.valueOf(pc4.f299140o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299132d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299133e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f299134f);
            C101765cp3 cp32 = this.f299135g;
            if (cp32 != null) {
                aVar.mo74322i(4, cp32.computeSize());
                this.f299135g.writeFields(aVar);
            }
            sb4 sb4 = this.f299136h;
            if (sb4 != null) {
                aVar.mo74322i(5, sb4.computeSize());
                this.f299136h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f299137i);
            String str3 = this.f299138j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f299139n);
            aVar.mo74318e(9, this.f299140o);
            return 0;
        } else if (i == 1) {
            String str4 = this.f299132d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f299133e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f299134f);
            C101765cp3 cp33 = this.f299135g;
            if (cp33 != null) {
                e += C52418a.m58682i(4, cp33.computeSize());
            }
            sb4 sb42 = this.f299136h;
            if (sb42 != null) {
                e += C52418a.m58682i(5, sb42.computeSize());
            }
            int h = e + C52418a.m58681h(6, this.f299137i);
            String str6 = this.f299138j;
            if (str6 != null) {
                h += C52418a.m58683j(7, str6);
            }
            return h + C52418a.m58678e(8, this.f299139n) + C52418a.m58678e(9, this.f299140o);
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
            pc4 pc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pc4.f299132d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pc4.f299133e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pc4.f299134f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101765cp3 cp34 = new C101765cp3();
                        if (bArr != null && bArr.length > 0) {
                            cp34.parseFrom(bArr);
                        }
                        pc4.f299135g = cp34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        sb4 sb43 = new sb4();
                        if (bArr2 != null && bArr2.length > 0) {
                            sb43.parseFrom(bArr2);
                        }
                        pc4.f299136h = sb43;
                    }
                    return 0;
                case 6:
                    pc4.f299137i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    pc4.f299138j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pc4.f299139n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pc4.f299140o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
