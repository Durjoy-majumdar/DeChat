package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qt3 */
public class C51013qt3 extends C101820nt3 {

    /* renamed from: d */
    public String f140548d;

    /* renamed from: e */
    public int f140549e;

    /* renamed from: f */
    public int f140550f;

    /* renamed from: g */
    public long f140551g;

    /* renamed from: h */
    public int f140552h;

    /* renamed from: i */
    public String f140553i;

    /* renamed from: j */
    public int f140554j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51013qt3)) {
            return false;
        }
        C51013qt3 qt32 = (C51013qt3) aVar;
        return C46238a.m51546a(this.BaseRequest, qt32.BaseRequest) && C46238a.m51546a(this.f140548d, qt32.f140548d) && C46238a.m51546a(Integer.valueOf(this.f140549e), Integer.valueOf(qt32.f140549e)) && C46238a.m51546a(Integer.valueOf(this.f140550f), Integer.valueOf(qt32.f140550f)) && C46238a.m51546a(Long.valueOf(this.f140551g), Long.valueOf(qt32.f140551g)) && C46238a.m51546a(Integer.valueOf(this.f140552h), Integer.valueOf(qt32.f140552h)) && C46238a.m51546a(this.f140553i, qt32.f140553i) && C46238a.m51546a(Integer.valueOf(this.f140554j), Integer.valueOf(qt32.f140554j));
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
            String str = this.f140548d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f140549e);
            aVar.mo74318e(4, this.f140550f);
            aVar.mo74321h(5, this.f140551g);
            aVar.mo74318e(6, this.f140552h);
            String str2 = this.f140553i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f140554j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f140548d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f140549e) + C52418a.m58678e(4, this.f140550f) + C52418a.m58681h(5, this.f140551g) + C52418a.m58678e(6, this.f140552h);
            String str4 = this.f140553i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            return e + C52418a.m58678e(8, this.f140554j);
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
            C51013qt3 qt32 = objArr[1];
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
                        qt32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qt32.f140548d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qt32.f140549e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qt32.f140550f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qt32.f140551g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    qt32.f140552h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qt32.f140553i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    qt32.f140554j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
