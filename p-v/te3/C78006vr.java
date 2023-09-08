package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vr */
public class C78006vr extends C49335eu3 {

    /* renamed from: d */
    public int f228327d;

    /* renamed from: e */
    public String f228328e;

    /* renamed from: f */
    public int f228329f;

    /* renamed from: g */
    public long f228330g;

    /* renamed from: h */
    public String f228331h;

    /* renamed from: i */
    public String f228332i;

    /* renamed from: j */
    public C50298lr f228333j;

    /* renamed from: n */
    public C77950j43 f228334n;

    /* renamed from: o */
    public LinkedList<bl4> f228335o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<wf4> f228336p = new LinkedList<>();

    /* renamed from: q */
    public String f228337q;

    /* renamed from: r */
    public String f228338r;

    /* renamed from: s */
    public String f228339s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78006vr)) {
            return false;
        }
        C78006vr vrVar = (C78006vr) aVar;
        return C46238a.m51546a(this.BaseResponse, vrVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228327d), Integer.valueOf(vrVar.f228327d)) && C46238a.m51546a(this.f228328e, vrVar.f228328e) && C46238a.m51546a(Integer.valueOf(this.f228329f), Integer.valueOf(vrVar.f228329f)) && C46238a.m51546a(Long.valueOf(this.f228330g), Long.valueOf(vrVar.f228330g)) && C46238a.m51546a(this.f228331h, vrVar.f228331h) && C46238a.m51546a(this.f228332i, vrVar.f228332i) && C46238a.m51546a(this.f228333j, vrVar.f228333j) && C46238a.m51546a(this.f228334n, vrVar.f228334n) && C46238a.m51546a(this.f228335o, vrVar.f228335o) && C46238a.m51546a(this.f228336p, vrVar.f228336p) && C46238a.m51546a(this.f228337q, vrVar.f228337q) && C46238a.m51546a(this.f228338r, vrVar.f228338r) && C46238a.m51546a(this.f228339s, vrVar.f228339s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f228327d);
            String str = this.f228328e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f228329f);
            aVar.mo74321h(5, this.f228330g);
            String str2 = this.f228331h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f228332i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C50298lr lrVar = this.f228333j;
            if (lrVar != null) {
                aVar.mo74322i(8, lrVar.computeSize());
                this.f228333j.writeFields(aVar);
            }
            C77950j43 j432 = this.f228334n;
            if (j432 != null) {
                aVar.mo74322i(9, j432.computeSize());
                this.f228334n.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f228335o);
            aVar.mo74320g(11, 8, this.f228336p);
            String str4 = this.f228337q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f228338r;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f228339s;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228327d);
            String str7 = this.f228328e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            int e2 = e + C52418a.m58678e(4, this.f228329f) + C52418a.m58681h(5, this.f228330g);
            String str8 = this.f228331h;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f228332i;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            C50298lr lrVar2 = this.f228333j;
            if (lrVar2 != null) {
                e2 += C52418a.m58682i(8, lrVar2.computeSize());
            }
            C77950j43 j433 = this.f228334n;
            if (j433 != null) {
                e2 += C52418a.m58682i(9, j433.computeSize());
            }
            int g = e2 + C52418a.m58680g(10, 8, this.f228335o) + C52418a.m58680g(11, 8, this.f228336p);
            String str10 = this.f228337q;
            if (str10 != null) {
                g += C52418a.m58683j(12, str10);
            }
            String str11 = this.f228338r;
            if (str11 != null) {
                g += C52418a.m58683j(13, str11);
            }
            String str12 = this.f228339s;
            return str12 != null ? g + C52418a.m58683j(14, str12) : g;
        } else if (i2 == 2) {
            this.f228335o.clear();
            this.f228336p.clear();
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
            C78006vr vrVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        vrVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    vrVar.f228327d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vrVar.f228328e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vrVar.f228329f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vrVar.f228330g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    vrVar.f228331h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vrVar.f228332i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50298lr lrVar3 = new C50298lr();
                        if (bArr2 != null && bArr2.length > 0) {
                            lrVar3.parseFrom(bArr2);
                        }
                        vrVar.f228333j = lrVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77950j43 j434 = new C77950j43();
                        if (bArr3 != null && bArr3.length > 0) {
                            j434.parseFrom(bArr3);
                        }
                        vrVar.f228334n = j434;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        bl4 bl4 = new bl4();
                        if (bArr4 != null && bArr4.length > 0) {
                            bl4.parseFrom(bArr4);
                        }
                        vrVar.f228335o.add(bl4);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        wf4 wf4 = new wf4();
                        if (bArr5 != null && bArr5.length > 0) {
                            wf4.parseFrom(bArr5);
                        }
                        vrVar.f228336p.add(wf4);
                    }
                    return 0;
                case 12:
                    vrVar.f228337q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    vrVar.f228338r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    vrVar.f228339s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
