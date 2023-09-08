package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m91 */
public class C64547m91 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184239d;

    /* renamed from: e */
    public String f184240e;

    /* renamed from: f */
    public String f184241f;

    /* renamed from: g */
    public C89349b f184242g;

    /* renamed from: h */
    public long f184243h;

    /* renamed from: i */
    public long f184244i;

    /* renamed from: j */
    public LinkedList<ge4> f184245j = new LinkedList<>();

    /* renamed from: n */
    public String f184246n;

    /* renamed from: o */
    public C89349b f184247o;

    /* renamed from: p */
    public String f184248p;

    /* renamed from: q */
    public C64840xw0 f184249q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64547m91)) {
            return false;
        }
        C64547m91 m912 = (C64547m91) aVar;
        return C46238a.m51546a(this.BaseRequest, m912.BaseRequest) && C46238a.m51546a(this.f184239d, m912.f184239d) && C46238a.m51546a(this.f184240e, m912.f184240e) && C46238a.m51546a(this.f184241f, m912.f184241f) && C46238a.m51546a(this.f184242g, m912.f184242g) && C46238a.m51546a(Long.valueOf(this.f184243h), Long.valueOf(m912.f184243h)) && C46238a.m51546a(Long.valueOf(this.f184244i), Long.valueOf(m912.f184244i)) && C46238a.m51546a(this.f184245j, m912.f184245j) && C46238a.m51546a(this.f184246n, m912.f184246n) && C46238a.m51546a(this.f184247o, m912.f184247o) && C46238a.m51546a(this.f184248p, m912.f184248p) && C46238a.m51546a(this.f184249q, m912.f184249q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f184239d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184239d.writeFields(aVar);
            }
            String str = this.f184240e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f184241f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f184242g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f184243h);
            aVar.mo74321h(7, this.f184244i);
            aVar.mo74320g(8, 8, this.f184245j);
            String str3 = this.f184246n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            C89349b bVar2 = this.f184247o;
            if (bVar2 != null) {
                aVar.mo74315b(10, bVar2);
            }
            String str4 = this.f184248p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            C64840xw0 xw02 = this.f184249q;
            if (xw02 != null) {
                aVar.mo74322i(12, xw02.computeSize());
                this.f184249q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f184239d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str5 = this.f184240e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184241f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            C89349b bVar3 = this.f184242g;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(5, bVar3);
            }
            int h = i2 + C52418a.m58681h(6, this.f184243h) + C52418a.m58681h(7, this.f184244i) + C52418a.m58680g(8, 8, this.f184245j);
            String str7 = this.f184246n;
            if (str7 != null) {
                h += C52418a.m58683j(9, str7);
            }
            C89349b bVar4 = this.f184247o;
            if (bVar4 != null) {
                h += C52418a.m58675b(10, bVar4);
            }
            String str8 = this.f184248p;
            if (str8 != null) {
                h += C52418a.m58683j(11, str8);
            }
            C64840xw0 xw03 = this.f184249q;
            return xw03 != null ? h + C52418a.m58682i(12, xw03.computeSize()) : h;
        } else if (i == 2) {
            this.f184245j.clear();
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
            C64547m91 m912 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        m912.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        m912.f184239d = ig04;
                    }
                    return 0;
                case 3:
                    m912.f184240e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m912.f184241f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m912.f184242g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    m912.f184243h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    m912.f184244i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ge4 ge4 = new ge4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ge4.parseFrom(bArr3);
                        }
                        m912.f184245j.add(ge4);
                    }
                    return 0;
                case 9:
                    m912.f184246n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    m912.f184247o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    m912.f184248p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr4 != null && bArr4.length > 0) {
                            xw04.parseFrom(bArr4);
                        }
                        m912.f184249q = xw04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
