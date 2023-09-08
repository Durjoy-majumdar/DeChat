package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h01 */
public class C49634h01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134379d;

    /* renamed from: e */
    public String f134380e;

    /* renamed from: f */
    public long f134381f;

    /* renamed from: g */
    public long f134382g;

    /* renamed from: h */
    public boolean f134383h;

    /* renamed from: i */
    public C89349b f134384i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49634h01)) {
            return false;
        }
        C49634h01 h012 = (C49634h01) aVar;
        return C46238a.m51546a(this.BaseRequest, h012.BaseRequest) && C46238a.m51546a(this.f134379d, h012.f134379d) && C46238a.m51546a(this.f134380e, h012.f134380e) && C46238a.m51546a(Long.valueOf(this.f134381f), Long.valueOf(h012.f134381f)) && C46238a.m51546a(Long.valueOf(this.f134382g), Long.valueOf(h012.f134382g)) && C46238a.m51546a(Boolean.valueOf(this.f134383h), Boolean.valueOf(h012.f134383h)) && C46238a.m51546a(this.f134384i, h012.f134384i);
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
            C49842ig0 ig02 = this.f134379d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134379d.writeFields(aVar);
            }
            String str = this.f134380e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f134381f);
            aVar.mo74321h(5, this.f134382g);
            aVar.mo74314a(6, this.f134383h);
            C89349b bVar = this.f134384i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134379d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f134380e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            int h = i2 + C52418a.m58681h(4, this.f134381f) + C52418a.m58681h(5, this.f134382g) + C52418a.m58674a(6, this.f134383h);
            C89349b bVar2 = this.f134384i;
            return bVar2 != null ? h + C52418a.m58675b(7, bVar2) : h;
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
            C49634h01 h012 = objArr[1];
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
                        h012.BaseRequest = iaVar3;
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
                        h012.f134379d = ig04;
                    }
                    return 0;
                case 3:
                    h012.f134380e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    h012.f134381f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    h012.f134382g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    h012.f134383h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    h012.f134384i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
