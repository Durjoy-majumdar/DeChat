package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rg1 */
public class C51104rg1 extends C101820nt3 {

    /* renamed from: d */
    public String f140888d;

    /* renamed from: e */
    public long f140889e;

    /* renamed from: f */
    public long f140890f;

    /* renamed from: g */
    public int f140891g;

    /* renamed from: h */
    public int f140892h;

    /* renamed from: i */
    public int f140893i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51104rg1)) {
            return false;
        }
        C51104rg1 rg12 = (C51104rg1) aVar;
        return C46238a.m51546a(this.BaseRequest, rg12.BaseRequest) && C46238a.m51546a(this.f140888d, rg12.f140888d) && C46238a.m51546a(Long.valueOf(this.f140889e), Long.valueOf(rg12.f140889e)) && C46238a.m51546a(Long.valueOf(this.f140890f), Long.valueOf(rg12.f140890f)) && C46238a.m51546a(Integer.valueOf(this.f140891g), Integer.valueOf(rg12.f140891g)) && C46238a.m51546a(Integer.valueOf(this.f140892h), Integer.valueOf(rg12.f140892h)) && C46238a.m51546a(Integer.valueOf(this.f140893i), Integer.valueOf(rg12.f140893i));
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
            String str = this.f140888d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f140889e);
            aVar.mo74321h(4, this.f140890f);
            aVar.mo74318e(5, this.f140891g);
            aVar.mo74318e(6, this.f140892h);
            aVar.mo74318e(7, this.f140893i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f140888d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(3, this.f140889e) + C52418a.m58681h(4, this.f140890f) + C52418a.m58678e(5, this.f140891g) + C52418a.m58678e(6, this.f140892h) + C52418a.m58678e(7, this.f140893i);
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
            C51104rg1 rg12 = objArr[1];
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
                        rg12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rg12.f140888d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rg12.f140889e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    rg12.f140890f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    rg12.f140891g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rg12.f140892h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rg12.f140893i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
