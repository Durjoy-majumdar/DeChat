package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.op0 */
public class C50712op0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139297d;

    /* renamed from: e */
    public String f139298e;

    /* renamed from: f */
    public long f139299f;

    /* renamed from: g */
    public long f139300g;

    /* renamed from: h */
    public int f139301h;

    /* renamed from: i */
    public long f139302i;

    /* renamed from: j */
    public int f139303j;

    /* renamed from: n */
    public C89349b f139304n;

    /* renamed from: o */
    public String f139305o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50712op0)) {
            return false;
        }
        C50712op0 op02 = (C50712op0) aVar;
        return C46238a.m51546a(this.BaseRequest, op02.BaseRequest) && C46238a.m51546a(this.f139297d, op02.f139297d) && C46238a.m51546a(this.f139298e, op02.f139298e) && C46238a.m51546a(Long.valueOf(this.f139299f), Long.valueOf(op02.f139299f)) && C46238a.m51546a(Long.valueOf(this.f139300g), Long.valueOf(op02.f139300g)) && C46238a.m51546a(Integer.valueOf(this.f139301h), Integer.valueOf(op02.f139301h)) && C46238a.m51546a(Long.valueOf(this.f139302i), Long.valueOf(op02.f139302i)) && C46238a.m51546a(Integer.valueOf(this.f139303j), Integer.valueOf(op02.f139303j)) && C46238a.m51546a(this.f139304n, op02.f139304n) && C46238a.m51546a(this.f139305o, op02.f139305o);
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
            C49842ig0 ig02 = this.f139297d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139297d.writeFields(aVar);
            }
            String str = this.f139298e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f139299f);
            aVar.mo74321h(5, this.f139300g);
            aVar.mo74318e(6, this.f139301h);
            aVar.mo74321h(7, this.f139302i);
            aVar.mo74318e(8, this.f139303j);
            C89349b bVar = this.f139304n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            String str2 = this.f139305o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139297d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f139298e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int h = i2 + C52418a.m58681h(4, this.f139299f) + C52418a.m58681h(5, this.f139300g) + C52418a.m58678e(6, this.f139301h) + C52418a.m58681h(7, this.f139302i) + C52418a.m58678e(8, this.f139303j);
            C89349b bVar2 = this.f139304n;
            if (bVar2 != null) {
                h += C52418a.m58675b(9, bVar2);
            }
            String str4 = this.f139305o;
            return str4 != null ? h + C52418a.m58683j(10, str4) : h;
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
            C50712op0 op02 = objArr[1];
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
                        op02.BaseRequest = iaVar3;
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
                        op02.f139297d = ig04;
                    }
                    return 0;
                case 3:
                    op02.f139298e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    op02.f139299f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    op02.f139300g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    op02.f139301h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    op02.f139302i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    op02.f139303j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    op02.f139304n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    op02.f139305o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
