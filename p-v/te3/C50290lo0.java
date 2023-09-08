package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lo0 */
public class C50290lo0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f137534d;

    /* renamed from: e */
    public long f137535e;

    /* renamed from: f */
    public long f137536f;

    /* renamed from: g */
    public String f137537g;

    /* renamed from: h */
    public String f137538h;

    /* renamed from: i */
    public C89349b f137539i;

    /* renamed from: j */
    public int f137540j;

    /* renamed from: n */
    public C89349b f137541n;

    /* renamed from: o */
    public String f137542o;

    /* renamed from: p */
    public int f137543p;

    /* renamed from: q */
    public int f137544q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50290lo0)) {
            return false;
        }
        C50290lo0 lo02 = (C50290lo0) aVar;
        return C46238a.m51546a(this.BaseRequest, lo02.BaseRequest) && C46238a.m51546a(this.f137534d, lo02.f137534d) && C46238a.m51546a(Long.valueOf(this.f137535e), Long.valueOf(lo02.f137535e)) && C46238a.m51546a(Long.valueOf(this.f137536f), Long.valueOf(lo02.f137536f)) && C46238a.m51546a(this.f137537g, lo02.f137537g) && C46238a.m51546a(this.f137538h, lo02.f137538h) && C46238a.m51546a(this.f137539i, lo02.f137539i) && C46238a.m51546a(Integer.valueOf(this.f137540j), Integer.valueOf(lo02.f137540j)) && C46238a.m51546a(this.f137541n, lo02.f137541n) && C46238a.m51546a(this.f137542o, lo02.f137542o) && C46238a.m51546a(Integer.valueOf(this.f137543p), Integer.valueOf(lo02.f137543p)) && C46238a.m51546a(Integer.valueOf(this.f137544q), Integer.valueOf(lo02.f137544q));
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
            C49842ig0 ig02 = this.f137534d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f137534d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f137535e);
            aVar.mo74321h(4, this.f137536f);
            String str = this.f137537g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f137538h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C89349b bVar = this.f137539i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74318e(8, this.f137540j);
            C89349b bVar2 = this.f137541n;
            if (bVar2 != null) {
                aVar.mo74315b(9, bVar2);
            }
            String str3 = this.f137542o;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74318e(11, this.f137543p);
            aVar.mo74318e(12, this.f137544q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f137534d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f137535e) + C52418a.m58681h(4, this.f137536f);
            String str4 = this.f137537g;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            String str5 = this.f137538h;
            if (str5 != null) {
                h += C52418a.m58683j(6, str5);
            }
            C89349b bVar3 = this.f137539i;
            if (bVar3 != null) {
                h += C52418a.m58675b(7, bVar3);
            }
            int e = h + C52418a.m58678e(8, this.f137540j);
            C89349b bVar4 = this.f137541n;
            if (bVar4 != null) {
                e += C52418a.m58675b(9, bVar4);
            }
            String str6 = this.f137542o;
            if (str6 != null) {
                e += C52418a.m58683j(10, str6);
            }
            return e + C52418a.m58678e(11, this.f137543p) + C52418a.m58678e(12, this.f137544q);
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
            C50290lo0 lo02 = objArr[1];
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
                        lo02.BaseRequest = iaVar3;
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
                        lo02.f137534d = ig04;
                    }
                    return 0;
                case 3:
                    lo02.f137535e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    lo02.f137536f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    lo02.f137537g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lo02.f137538h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lo02.f137539i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    lo02.f137540j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    lo02.f137541n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    lo02.f137542o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    lo02.f137543p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    lo02.f137544q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
