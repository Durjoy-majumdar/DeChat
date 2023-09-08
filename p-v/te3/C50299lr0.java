package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lr0 */
public class C50299lr0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f137606d;

    /* renamed from: e */
    public long f137607e;

    /* renamed from: f */
    public long f137608f;

    /* renamed from: g */
    public long f137609g;

    /* renamed from: h */
    public int f137610h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50299lr0)) {
            return false;
        }
        C50299lr0 lr02 = (C50299lr0) aVar;
        return C46238a.m51546a(this.BaseRequest, lr02.BaseRequest) && C46238a.m51546a(this.f137606d, lr02.f137606d) && C46238a.m51546a(Long.valueOf(this.f137607e), Long.valueOf(lr02.f137607e)) && C46238a.m51546a(Long.valueOf(this.f137608f), Long.valueOf(lr02.f137608f)) && C46238a.m51546a(Long.valueOf(this.f137609g), Long.valueOf(lr02.f137609g)) && C46238a.m51546a(Integer.valueOf(this.f137610h), Integer.valueOf(lr02.f137610h));
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
            C49842ig0 ig02 = this.f137606d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f137606d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f137607e);
            aVar.mo74321h(4, this.f137608f);
            aVar.mo74321h(5, this.f137609g);
            aVar.mo74318e(6, this.f137610h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f137606d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            return i2 + C52418a.m58681h(3, this.f137607e) + C52418a.m58681h(4, this.f137608f) + C52418a.m58681h(5, this.f137609g) + C52418a.m58678e(6, this.f137610h);
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
            C50299lr0 lr02 = objArr[1];
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
                        lr02.BaseRequest = iaVar3;
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
                        lr02.f137606d = ig04;
                    }
                    return 0;
                case 3:
                    lr02.f137607e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    lr02.f137608f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    lr02.f137609g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    lr02.f137610h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
