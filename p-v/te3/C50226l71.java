package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l71 */
public class C50226l71 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f137234d;

    /* renamed from: e */
    public long f137235e;

    /* renamed from: f */
    public long f137236f;

    /* renamed from: g */
    public String f137237g;

    /* renamed from: h */
    public int f137238h;

    /* renamed from: i */
    public String f137239i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50226l71)) {
            return false;
        }
        C50226l71 l712 = (C50226l71) aVar;
        return C46238a.m51546a(this.BaseRequest, l712.BaseRequest) && C46238a.m51546a(this.f137234d, l712.f137234d) && C46238a.m51546a(Long.valueOf(this.f137235e), Long.valueOf(l712.f137235e)) && C46238a.m51546a(Long.valueOf(this.f137236f), Long.valueOf(l712.f137236f)) && C46238a.m51546a(this.f137237g, l712.f137237g) && C46238a.m51546a(Integer.valueOf(this.f137238h), Integer.valueOf(l712.f137238h)) && C46238a.m51546a(this.f137239i, l712.f137239i);
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
            C49842ig0 ig02 = this.f137234d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f137234d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f137235e);
            aVar.mo74321h(4, this.f137236f);
            String str = this.f137237g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f137238h);
            String str2 = this.f137239i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f137234d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f137235e) + C52418a.m58681h(4, this.f137236f);
            String str3 = this.f137237g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            int e = h + C52418a.m58678e(6, this.f137238h);
            String str4 = this.f137239i;
            return str4 != null ? e + C52418a.m58683j(7, str4) : e;
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
            C50226l71 l712 = objArr[1];
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
                        l712.BaseRequest = iaVar3;
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
                        l712.f137234d = ig04;
                    }
                    return 0;
                case 3:
                    l712.f137235e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    l712.f137236f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    l712.f137237g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l712.f137238h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    l712.f137239i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
