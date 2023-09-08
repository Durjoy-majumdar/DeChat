package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bo0 */
public class C64262bo0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182291d;

    /* renamed from: e */
    public long f182292e;

    /* renamed from: f */
    public String f182293f;

    /* renamed from: g */
    public long f182294g;

    /* renamed from: h */
    public String f182295h;

    /* renamed from: i */
    public int f182296i;

    /* renamed from: j */
    public boolean f182297j;

    /* renamed from: n */
    public int f182298n;

    /* renamed from: o */
    public C89349b f182299o;

    /* renamed from: p */
    public String f182300p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64262bo0)) {
            return false;
        }
        C64262bo0 bo02 = (C64262bo0) aVar;
        return C46238a.m51546a(this.BaseRequest, bo02.BaseRequest) && C46238a.m51546a(this.f182291d, bo02.f182291d) && C46238a.m51546a(Long.valueOf(this.f182292e), Long.valueOf(bo02.f182292e)) && C46238a.m51546a(this.f182293f, bo02.f182293f) && C46238a.m51546a(Long.valueOf(this.f182294g), Long.valueOf(bo02.f182294g)) && C46238a.m51546a(this.f182295h, bo02.f182295h) && C46238a.m51546a(Integer.valueOf(this.f182296i), Integer.valueOf(bo02.f182296i)) && C46238a.m51546a(Boolean.valueOf(this.f182297j), Boolean.valueOf(bo02.f182297j)) && C46238a.m51546a(Integer.valueOf(this.f182298n), Integer.valueOf(bo02.f182298n)) && C46238a.m51546a(this.f182299o, bo02.f182299o) && C46238a.m51546a(this.f182300p, bo02.f182300p);
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
            C49842ig0 ig02 = this.f182291d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182291d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f182292e);
            String str = this.f182293f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f182294g);
            String str2 = this.f182295h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f182296i);
            aVar.mo74314a(8, this.f182297j);
            aVar.mo74318e(9, this.f182298n);
            C89349b bVar = this.f182299o;
            if (bVar != null) {
                aVar.mo74315b(10, bVar);
            }
            String str3 = this.f182300p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f182291d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f182292e);
            String str4 = this.f182293f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            int h2 = h + C52418a.m58681h(5, this.f182294g);
            String str5 = this.f182295h;
            if (str5 != null) {
                h2 += C52418a.m58683j(6, str5);
            }
            int e = h2 + C52418a.m58678e(7, this.f182296i) + C52418a.m58674a(8, this.f182297j) + C52418a.m58678e(9, this.f182298n);
            C89349b bVar2 = this.f182299o;
            if (bVar2 != null) {
                e += C52418a.m58675b(10, bVar2);
            }
            String str6 = this.f182300p;
            return str6 != null ? e + C52418a.m58683j(11, str6) : e;
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
            C64262bo0 bo02 = objArr[1];
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
                        bo02.BaseRequest = iaVar3;
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
                        bo02.f182291d = ig04;
                    }
                    return 0;
                case 3:
                    bo02.f182292e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    bo02.f182293f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bo02.f182294g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bo02.f182295h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bo02.f182296i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    bo02.f182297j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    bo02.f182298n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    bo02.f182299o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    bo02.f182300p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
