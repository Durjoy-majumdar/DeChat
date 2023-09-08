package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qh1 */
public class C64657qh1 extends C101820nt3 {

    /* renamed from: A */
    public int f185010A;

    /* renamed from: B */
    public long f185011B;

    /* renamed from: C */
    public int f185012C;

    /* renamed from: D */
    public int f185013D;

    /* renamed from: E */
    public long f185014E;

    /* renamed from: F */
    public int f185015F;

    /* renamed from: G */
    public C89349b f185016G;

    /* renamed from: d */
    public String f185017d;

    /* renamed from: e */
    public FinderObjectDesc f185018e;

    /* renamed from: f */
    public String f185019f;

    /* renamed from: g */
    public long f185020g;

    /* renamed from: h */
    public String f185021h;

    /* renamed from: i */
    public C49842ig0 f185022i;

    /* renamed from: j */
    public float f185023j;

    /* renamed from: n */
    public float f185024n;

    /* renamed from: o */
    public float f185025o;

    /* renamed from: p */
    public float f185026p;

    /* renamed from: q */
    public int f185027q;

    /* renamed from: r */
    public LinkedList<String> f185028r = new LinkedList<>();

    /* renamed from: s */
    public int f185029s;

    /* renamed from: t */
    public long f185030t;

    /* renamed from: u */
    public LinkedList<String> f185031u = new LinkedList<>();

    /* renamed from: v */
    public C89349b f185032v;

    /* renamed from: w */
    public String f185033w;

    /* renamed from: x */
    public C51388tf0 f185034x;

    /* renamed from: y */
    public String f185035y;

    /* renamed from: z */
    public int f185036z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64657qh1)) {
            return false;
        }
        C64657qh1 qh12 = (C64657qh1) aVar;
        return C46238a.m51546a(this.BaseRequest, qh12.BaseRequest) && C46238a.m51546a(this.f185017d, qh12.f185017d) && C46238a.m51546a(this.f185018e, qh12.f185018e) && C46238a.m51546a(this.f185019f, qh12.f185019f) && C46238a.m51546a(Long.valueOf(this.f185020g), Long.valueOf(qh12.f185020g)) && C46238a.m51546a(this.f185021h, qh12.f185021h) && C46238a.m51546a(this.f185022i, qh12.f185022i) && C46238a.m51546a(Float.valueOf(this.f185023j), Float.valueOf(qh12.f185023j)) && C46238a.m51546a(Float.valueOf(this.f185024n), Float.valueOf(qh12.f185024n)) && C46238a.m51546a(Float.valueOf(this.f185025o), Float.valueOf(qh12.f185025o)) && C46238a.m51546a(Float.valueOf(this.f185026p), Float.valueOf(qh12.f185026p)) && C46238a.m51546a(Integer.valueOf(this.f185027q), Integer.valueOf(qh12.f185027q)) && C46238a.m51546a(this.f185028r, qh12.f185028r) && C46238a.m51546a(Integer.valueOf(this.f185029s), Integer.valueOf(qh12.f185029s)) && C46238a.m51546a(Long.valueOf(this.f185030t), Long.valueOf(qh12.f185030t)) && C46238a.m51546a(this.f185031u, qh12.f185031u) && C46238a.m51546a(this.f185032v, qh12.f185032v) && C46238a.m51546a(this.f185033w, qh12.f185033w) && C46238a.m51546a(this.f185034x, qh12.f185034x) && C46238a.m51546a(this.f185035y, qh12.f185035y) && C46238a.m51546a(Integer.valueOf(this.f185036z), Integer.valueOf(qh12.f185036z)) && C46238a.m51546a(Integer.valueOf(this.f185010A), Integer.valueOf(qh12.f185010A)) && C46238a.m51546a(Long.valueOf(this.f185011B), Long.valueOf(qh12.f185011B)) && C46238a.m51546a(Integer.valueOf(this.f185012C), Integer.valueOf(qh12.f185012C)) && C46238a.m51546a(Integer.valueOf(this.f185013D), Integer.valueOf(qh12.f185013D)) && C46238a.m51546a(Long.valueOf(this.f185014E), Long.valueOf(qh12.f185014E)) && C46238a.m51546a(Integer.valueOf(this.f185015F), Integer.valueOf(qh12.f185015F)) && C46238a.m51546a(this.f185016G, qh12.f185016G);
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
            String str = this.f185017d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            FinderObjectDesc finderObjectDesc = this.f185018e;
            if (finderObjectDesc != null) {
                aVar.mo74322i(3, finderObjectDesc.computeSize());
                this.f185018e.writeFields(aVar);
            }
            String str2 = this.f185019f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f185020g);
            String str3 = this.f185021h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C49842ig0 ig02 = this.f185022i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f185022i.writeFields(aVar);
            }
            aVar.mo74317d(8, this.f185023j);
            aVar.mo74317d(9, this.f185024n);
            aVar.mo74317d(10, this.f185025o);
            aVar.mo74317d(11, this.f185026p);
            aVar.mo74318e(12, this.f185027q);
            aVar.mo74320g(13, 1, this.f185028r);
            aVar.mo74318e(14, this.f185029s);
            aVar.mo74321h(15, this.f185030t);
            aVar.mo74320g(16, 1, this.f185031u);
            C89349b bVar = this.f185032v;
            if (bVar != null) {
                aVar.mo74315b(17, bVar);
            }
            String str4 = this.f185033w;
            if (str4 != null) {
                aVar.mo74323j(18, str4);
            }
            C51388tf0 tf02 = this.f185034x;
            if (tf02 != null) {
                aVar.mo74322i(20, tf02.computeSize());
                this.f185034x.writeFields(aVar);
            }
            String str5 = this.f185035y;
            if (str5 != null) {
                aVar.mo74323j(21, str5);
            }
            aVar.mo74318e(22, this.f185036z);
            aVar.mo74318e(23, this.f185010A);
            aVar.mo74321h(24, this.f185011B);
            aVar.mo74318e(25, this.f185012C);
            aVar.mo74318e(26, this.f185013D);
            aVar.mo74321h(28, this.f185014E);
            aVar.mo74318e(29, this.f185015F);
            C89349b bVar2 = this.f185016G;
            if (bVar2 != null) {
                aVar.mo74315b(30, bVar2);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str6 = this.f185017d;
            if (str6 != null) {
                i3 += C52418a.m58683j(2, str6);
            }
            FinderObjectDesc finderObjectDesc2 = this.f185018e;
            if (finderObjectDesc2 != null) {
                i3 += C52418a.m58682i(3, finderObjectDesc2.computeSize());
            }
            String str7 = this.f185019f;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            int h = i3 + C52418a.m58681h(5, this.f185020g);
            String str8 = this.f185021h;
            if (str8 != null) {
                h += C52418a.m58683j(6, str8);
            }
            C49842ig0 ig03 = this.f185022i;
            if (ig03 != null) {
                h += C52418a.m58682i(7, ig03.computeSize());
            }
            int d = h + C52418a.m58677d(8, this.f185023j) + C52418a.m58677d(9, this.f185024n) + C52418a.m58677d(10, this.f185025o) + C52418a.m58677d(11, this.f185026p) + C52418a.m58678e(12, this.f185027q) + C52418a.m58680g(13, 1, this.f185028r) + C52418a.m58678e(14, this.f185029s) + C52418a.m58681h(15, this.f185030t) + C52418a.m58680g(16, 1, this.f185031u);
            C89349b bVar3 = this.f185032v;
            if (bVar3 != null) {
                d += C52418a.m58675b(17, bVar3);
            }
            String str9 = this.f185033w;
            if (str9 != null) {
                d += C52418a.m58683j(18, str9);
            }
            C51388tf0 tf03 = this.f185034x;
            if (tf03 != null) {
                d += C52418a.m58682i(20, tf03.computeSize());
            }
            String str10 = this.f185035y;
            if (str10 != null) {
                d += C52418a.m58683j(21, str10);
            }
            int e = d + C52418a.m58678e(22, this.f185036z) + C52418a.m58678e(23, this.f185010A) + C52418a.m58681h(24, this.f185011B) + C52418a.m58678e(25, this.f185012C) + C52418a.m58678e(26, this.f185013D) + C52418a.m58681h(28, this.f185014E) + C52418a.m58678e(29, this.f185015F);
            C89349b bVar4 = this.f185016G;
            return bVar4 != null ? e + C52418a.m58675b(30, bVar4) : e;
        } else if (i2 == 2) {
            this.f185028r.clear();
            this.f185031u.clear();
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
            C64657qh1 qh12 = objArr[1];
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
                        qh12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qh12.f185017d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObjectDesc finderObjectDesc3 = new FinderObjectDesc();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObjectDesc3.parseFrom(bArr2);
                        }
                        qh12.f185018e = finderObjectDesc3;
                    }
                    return 0;
                case 4:
                    qh12.f185019f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qh12.f185020g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    qh12.f185021h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ig04.parseFrom(bArr3);
                        }
                        qh12.f185022i = ig04;
                    }
                    return 0;
                case 8:
                    qh12.f185023j = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    qh12.f185024n = aVar3.mo141628f(intValue);
                    return 0;
                case 10:
                    qh12.f185025o = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    qh12.f185026p = aVar3.mo141628f(intValue);
                    return 0;
                case 12:
                    qh12.f185027q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    qh12.f185028r.add(aVar3.mo141633k(intValue));
                    return 0;
                case 14:
                    qh12.f185029s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    qh12.f185030t = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    qh12.f185031u.add(aVar3.mo141633k(intValue));
                    return 0;
                case 17:
                    qh12.f185032v = aVar3.mo141626d(intValue);
                    return 0;
                case 18:
                    qh12.f185033w = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51388tf0 tf04 = new C51388tf0();
                        if (bArr4 != null && bArr4.length > 0) {
                            tf04.parseFrom(bArr4);
                        }
                        qh12.f185034x = tf04;
                    }
                    return 0;
                case 21:
                    qh12.f185035y = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    qh12.f185036z = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    qh12.f185010A = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    qh12.f185011B = aVar3.mo141631i(intValue);
                    return 0;
                case 25:
                    qh12.f185012C = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    qh12.f185013D = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    qh12.f185014E = aVar3.mo141631i(intValue);
                    return 0;
                case 29:
                    qh12.f185015F = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    qh12.f185016G = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
