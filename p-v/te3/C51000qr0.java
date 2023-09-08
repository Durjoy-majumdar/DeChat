package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qr0 */
public class C51000qr0 extends C101820nt3 {

    /* renamed from: d */
    public long f140492d;

    /* renamed from: e */
    public long f140493e;

    /* renamed from: f */
    public int f140494f;

    /* renamed from: g */
    public long f140495g;

    /* renamed from: h */
    public int f140496h;

    /* renamed from: i */
    public String f140497i;

    /* renamed from: j */
    public int f140498j;

    /* renamed from: n */
    public String f140499n;

    /* renamed from: o */
    public C49842ig0 f140500o;

    /* renamed from: p */
    public String f140501p;

    /* renamed from: q */
    public String f140502q;

    /* renamed from: r */
    public int f140503r;

    /* renamed from: s */
    public int f140504s;

    /* renamed from: t */
    public LinkedList<Integer> f140505t = new LinkedList<>();

    /* renamed from: u */
    public int f140506u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51000qr0)) {
            return false;
        }
        C51000qr0 qr02 = (C51000qr0) aVar;
        return C46238a.m51546a(this.BaseRequest, qr02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f140492d), Long.valueOf(qr02.f140492d)) && C46238a.m51546a(Long.valueOf(this.f140493e), Long.valueOf(qr02.f140493e)) && C46238a.m51546a(Integer.valueOf(this.f140494f), Integer.valueOf(qr02.f140494f)) && C46238a.m51546a(Long.valueOf(this.f140495g), Long.valueOf(qr02.f140495g)) && C46238a.m51546a(Integer.valueOf(this.f140496h), Integer.valueOf(qr02.f140496h)) && C46238a.m51546a(this.f140497i, qr02.f140497i) && C46238a.m51546a(Integer.valueOf(this.f140498j), Integer.valueOf(qr02.f140498j)) && C46238a.m51546a(this.f140499n, qr02.f140499n) && C46238a.m51546a(this.f140500o, qr02.f140500o) && C46238a.m51546a(this.f140501p, qr02.f140501p) && C46238a.m51546a(this.f140502q, qr02.f140502q) && C46238a.m51546a(Integer.valueOf(this.f140503r), Integer.valueOf(qr02.f140503r)) && C46238a.m51546a(Integer.valueOf(this.f140504s), Integer.valueOf(qr02.f140504s)) && C46238a.m51546a(this.f140505t, qr02.f140505t) && C46238a.m51546a(Integer.valueOf(this.f140506u), Integer.valueOf(qr02.f140506u));
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
            aVar.mo74321h(2, this.f140492d);
            aVar.mo74321h(3, this.f140493e);
            aVar.mo74318e(4, this.f140494f);
            aVar.mo74321h(5, this.f140495g);
            aVar.mo74318e(6, this.f140496h);
            String str = this.f140497i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f140498j);
            String str2 = this.f140499n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            C49842ig0 ig02 = this.f140500o;
            if (ig02 != null) {
                aVar.mo74322i(10, ig02.computeSize());
                this.f140500o.writeFields(aVar);
            }
            String str3 = this.f140501p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f140502q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74318e(13, this.f140503r);
            aVar.mo74318e(14, this.f140504s);
            aVar.mo74320g(15, 2, this.f140505t);
            aVar.mo74318e(16, this.f140506u);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f140492d) + C52418a.m58681h(3, this.f140493e) + C52418a.m58678e(4, this.f140494f) + C52418a.m58681h(5, this.f140495g) + C52418a.m58678e(6, this.f140496h);
            String str5 = this.f140497i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            int e = h + C52418a.m58678e(8, this.f140498j);
            String str6 = this.f140499n;
            if (str6 != null) {
                e += C52418a.m58683j(9, str6);
            }
            C49842ig0 ig03 = this.f140500o;
            if (ig03 != null) {
                e += C52418a.m58682i(10, ig03.computeSize());
            }
            String str7 = this.f140501p;
            if (str7 != null) {
                e += C52418a.m58683j(11, str7);
            }
            String str8 = this.f140502q;
            if (str8 != null) {
                e += C52418a.m58683j(12, str8);
            }
            return e + C52418a.m58678e(13, this.f140503r) + C52418a.m58678e(14, this.f140504s) + C52418a.m58680g(15, 2, this.f140505t) + C52418a.m58678e(16, this.f140506u);
        } else if (i2 == 2) {
            this.f140505t.clear();
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
            C51000qr0 qr02 = objArr[1];
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
                        qr02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qr02.f140492d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    qr02.f140493e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    qr02.f140494f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qr02.f140495g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    qr02.f140496h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qr02.f140497i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    qr02.f140498j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    qr02.f140499n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        qr02.f140500o = ig04;
                    }
                    return 0;
                case 11:
                    qr02.f140501p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    qr02.f140502q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    qr02.f140503r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    qr02.f140504s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    qr02.f140505t.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 16:
                    qr02.f140506u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
