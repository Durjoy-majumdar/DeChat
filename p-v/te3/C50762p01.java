package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p01 */
public class C50762p01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139475d;

    /* renamed from: e */
    public String f139476e;

    /* renamed from: f */
    public C89349b f139477f;

    /* renamed from: g */
    public String f139478g;

    /* renamed from: h */
    public long f139479h;

    /* renamed from: i */
    public long f139480i;

    /* renamed from: j */
    public String f139481j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50762p01)) {
            return false;
        }
        C50762p01 p012 = (C50762p01) aVar;
        return C46238a.m51546a(this.BaseRequest, p012.BaseRequest) && C46238a.m51546a(this.f139475d, p012.f139475d) && C46238a.m51546a(this.f139476e, p012.f139476e) && C46238a.m51546a(this.f139477f, p012.f139477f) && C46238a.m51546a(this.f139478g, p012.f139478g) && C46238a.m51546a(Long.valueOf(this.f139479h), Long.valueOf(p012.f139479h)) && C46238a.m51546a(Long.valueOf(this.f139480i), Long.valueOf(p012.f139480i)) && C46238a.m51546a(this.f139481j, p012.f139481j);
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
            C49842ig0 ig02 = this.f139475d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139475d.writeFields(aVar);
            }
            String str = this.f139476e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f139477f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str2 = this.f139478g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f139479h);
            aVar.mo74321h(7, this.f139480i);
            String str3 = this.f139481j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139475d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f139476e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f139477f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            String str5 = this.f139478g;
            if (str5 != null) {
                i2 += C52418a.m58683j(5, str5);
            }
            int h = i2 + C52418a.m58681h(6, this.f139479h) + C52418a.m58681h(7, this.f139480i);
            String str6 = this.f139481j;
            return str6 != null ? h + C52418a.m58683j(8, str6) : h;
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
            C50762p01 p012 = objArr[1];
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
                        p012.BaseRequest = iaVar3;
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
                        p012.f139475d = ig04;
                    }
                    return 0;
                case 3:
                    p012.f139476e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p012.f139477f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    p012.f139478g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    p012.f139479h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    p012.f139480i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    p012.f139481j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
