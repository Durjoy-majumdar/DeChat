package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gk2 */
public class C90412gk2 extends C101820nt3 {

    /* renamed from: d */
    public String f259525d;

    /* renamed from: e */
    public LinkedList<String> f259526e = new LinkedList<>();

    /* renamed from: f */
    public int f259527f;

    /* renamed from: g */
    public String f259528g;

    /* renamed from: h */
    public int f259529h;

    /* renamed from: i */
    public int f259530i;

    /* renamed from: j */
    public w55 f259531j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90412gk2)) {
            return false;
        }
        C90412gk2 gk22 = (C90412gk2) aVar;
        return C46238a.m51546a(this.BaseRequest, gk22.BaseRequest) && C46238a.m51546a(this.f259525d, gk22.f259525d) && C46238a.m51546a(this.f259526e, gk22.f259526e) && C46238a.m51546a(Integer.valueOf(this.f259527f), Integer.valueOf(gk22.f259527f)) && C46238a.m51546a(this.f259528g, gk22.f259528g) && C46238a.m51546a(Integer.valueOf(this.f259529h), Integer.valueOf(gk22.f259529h)) && C46238a.m51546a(Integer.valueOf(this.f259530i), Integer.valueOf(gk22.f259530i)) && C46238a.m51546a(this.f259531j, gk22.f259531j);
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
            String str = this.f259525d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f259526e);
            aVar.mo74318e(4, this.f259527f);
            String str2 = this.f259528g;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f259529h);
            aVar.mo74318e(8, this.f259530i);
            w55 w55 = this.f259531j;
            if (w55 != null) {
                aVar.mo74322i(9, w55.computeSize());
                this.f259531j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f259525d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f259526e) + C52418a.m58678e(4, this.f259527f);
            String str4 = this.f259528g;
            if (str4 != null) {
                g += C52418a.m58683j(6, str4);
            }
            int e = g + C52418a.m58678e(7, this.f259529h) + C52418a.m58678e(8, this.f259530i);
            w55 w552 = this.f259531j;
            return w552 != null ? e + C52418a.m58682i(9, w552.computeSize()) : e;
        } else if (i == 2) {
            this.f259526e.clear();
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
            C90412gk2 gk22 = objArr[1];
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
                        gk22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gk22.f259525d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gk22.f259526e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    gk22.f259527f = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gk22.f259528g = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gk22.f259529h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gk22.f259530i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w55 w553 = new w55();
                        if (bArr2 != null && bArr2.length > 0) {
                            w553.parseFrom(bArr2);
                        }
                        gk22.f259531j = w553;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
