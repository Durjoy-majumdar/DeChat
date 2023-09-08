package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l11 */
public class C64508l11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184010d;

    /* renamed from: e */
    public String f184011e;

    /* renamed from: f */
    public String f184012f;

    /* renamed from: g */
    public int f184013g;

    /* renamed from: h */
    public C64548ma0 f184014h;

    /* renamed from: i */
    public String f184015i;

    /* renamed from: j */
    public int f184016j;

    /* renamed from: n */
    public int f184017n;

    /* renamed from: o */
    public String f184018o;

    /* renamed from: p */
    public boolean f184019p;

    /* renamed from: q */
    public C64741tx0 f184020q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64508l11)) {
            return false;
        }
        C64508l11 l112 = (C64508l11) aVar;
        return C46238a.m51546a(this.BaseRequest, l112.BaseRequest) && C46238a.m51546a(this.f184010d, l112.f184010d) && C46238a.m51546a(this.f184011e, l112.f184011e) && C46238a.m51546a(this.f184012f, l112.f184012f) && C46238a.m51546a(Integer.valueOf(this.f184013g), Integer.valueOf(l112.f184013g)) && C46238a.m51546a(this.f184014h, l112.f184014h) && C46238a.m51546a(this.f184015i, l112.f184015i) && C46238a.m51546a(Integer.valueOf(this.f184016j), Integer.valueOf(l112.f184016j)) && C46238a.m51546a(Integer.valueOf(this.f184017n), Integer.valueOf(l112.f184017n)) && C46238a.m51546a(this.f184018o, l112.f184018o) && C46238a.m51546a(Boolean.valueOf(this.f184019p), Boolean.valueOf(l112.f184019p)) && C46238a.m51546a(this.f184020q, l112.f184020q);
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
            C49842ig0 ig02 = this.f184010d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184010d.writeFields(aVar);
            }
            String str = this.f184011e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f184012f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f184013g);
            C64548ma0 ma02 = this.f184014h;
            if (ma02 != null) {
                aVar.mo74322i(6, ma02.computeSize());
                this.f184014h.writeFields(aVar);
            }
            String str3 = this.f184015i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f184016j);
            aVar.mo74318e(9, this.f184017n);
            String str4 = this.f184018o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            aVar.mo74314a(11, this.f184019p);
            C64741tx0 tx02 = this.f184020q;
            if (tx02 != null) {
                aVar.mo74322i(12, tx02.computeSize());
                this.f184020q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f184010d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str5 = this.f184011e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184012f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            int e = i2 + C52418a.m58678e(5, this.f184013g);
            C64548ma0 ma03 = this.f184014h;
            if (ma03 != null) {
                e += C52418a.m58682i(6, ma03.computeSize());
            }
            String str7 = this.f184015i;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int e2 = e + C52418a.m58678e(8, this.f184016j) + C52418a.m58678e(9, this.f184017n);
            String str8 = this.f184018o;
            if (str8 != null) {
                e2 += C52418a.m58683j(10, str8);
            }
            int a = e2 + C52418a.m58674a(11, this.f184019p);
            C64741tx0 tx03 = this.f184020q;
            return tx03 != null ? a + C52418a.m58682i(12, tx03.computeSize()) : a;
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
            C64508l11 l112 = objArr[1];
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
                        l112.BaseRequest = iaVar3;
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
                        l112.f184010d = ig04;
                    }
                    return 0;
                case 3:
                    l112.f184011e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l112.f184012f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l112.f184013g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64548ma0 ma04 = new C64548ma0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ma04.parseFrom(bArr3);
                        }
                        l112.f184014h = ma04;
                    }
                    return 0;
                case 7:
                    l112.f184015i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    l112.f184016j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    l112.f184017n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    l112.f184018o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    l112.f184019p = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64741tx0 tx04 = new C64741tx0();
                        if (bArr4 != null && bArr4.length > 0) {
                            tx04.parseFrom(bArr4);
                        }
                        l112.f184020q = tx04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
