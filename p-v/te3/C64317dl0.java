package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dl0 */
public class C64317dl0 extends C101820nt3 {

    /* renamed from: d */
    public String f182762d;

    /* renamed from: e */
    public int f182763e;

    /* renamed from: f */
    public long f182764f;

    /* renamed from: g */
    public String f182765g;

    /* renamed from: h */
    public String f182766h;

    /* renamed from: i */
    public C49842ig0 f182767i;

    /* renamed from: j */
    public String f182768j;

    /* renamed from: n */
    public int f182769n;

    /* renamed from: o */
    public C64414h71 f182770o;

    /* renamed from: p */
    public int f182771p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64317dl0)) {
            return false;
        }
        C64317dl0 dl02 = (C64317dl0) aVar;
        return C46238a.m51546a(this.BaseRequest, dl02.BaseRequest) && C46238a.m51546a(this.f182762d, dl02.f182762d) && C46238a.m51546a(Integer.valueOf(this.f182763e), Integer.valueOf(dl02.f182763e)) && C46238a.m51546a(Long.valueOf(this.f182764f), Long.valueOf(dl02.f182764f)) && C46238a.m51546a(this.f182765g, dl02.f182765g) && C46238a.m51546a(this.f182766h, dl02.f182766h) && C46238a.m51546a(this.f182767i, dl02.f182767i) && C46238a.m51546a(this.f182768j, dl02.f182768j) && C46238a.m51546a(Integer.valueOf(this.f182769n), Integer.valueOf(dl02.f182769n)) && C46238a.m51546a(this.f182770o, dl02.f182770o) && C46238a.m51546a(Integer.valueOf(this.f182771p), Integer.valueOf(dl02.f182771p));
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
            String str = this.f182762d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f182763e);
            aVar.mo74321h(4, this.f182764f);
            String str2 = this.f182765g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f182766h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C49842ig0 ig02 = this.f182767i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f182767i.writeFields(aVar);
            }
            String str4 = this.f182768j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f182769n);
            C64414h71 h712 = this.f182770o;
            if (h712 != null) {
                aVar.mo74322i(10, h712.computeSize());
                this.f182770o.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f182771p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f182762d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f182763e) + C52418a.m58681h(4, this.f182764f);
            String str6 = this.f182765g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f182766h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            C49842ig0 ig03 = this.f182767i;
            if (ig03 != null) {
                e += C52418a.m58682i(7, ig03.computeSize());
            }
            String str8 = this.f182768j;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            int e2 = e + C52418a.m58678e(9, this.f182769n);
            C64414h71 h713 = this.f182770o;
            if (h713 != null) {
                e2 += C52418a.m58682i(10, h713.computeSize());
            }
            return e2 + C52418a.m58678e(11, this.f182771p);
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
            C64317dl0 dl02 = objArr[1];
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
                        dl02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dl02.f182762d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dl02.f182763e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dl02.f182764f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    dl02.f182765g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dl02.f182766h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        dl02.f182767i = ig04;
                    }
                    return 0;
                case 8:
                    dl02.f182768j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dl02.f182769n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64414h71 h714 = new C64414h71();
                        if (bArr3 != null && bArr3.length > 0) {
                            h714.parseFrom(bArr3);
                        }
                        dl02.f182770o = h714;
                    }
                    return 0;
                case 11:
                    dl02.f182771p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
