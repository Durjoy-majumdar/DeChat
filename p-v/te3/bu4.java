package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bu4 extends C101820nt3 {

    /* renamed from: d */
    public int f131316d;

    /* renamed from: e */
    public long f131317e;

    /* renamed from: f */
    public long f131318f;

    /* renamed from: g */
    public String f131319g;

    /* renamed from: h */
    public long f131320h;

    /* renamed from: i */
    public int f131321i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bu4)) {
            return false;
        }
        bu4 bu4 = (bu4) aVar;
        return C46238a.m51546a(this.BaseRequest, bu4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131316d), Integer.valueOf(bu4.f131316d)) && C46238a.m51546a(Long.valueOf(this.f131317e), Long.valueOf(bu4.f131317e)) && C46238a.m51546a(Long.valueOf(this.f131318f), Long.valueOf(bu4.f131318f)) && C46238a.m51546a(this.f131319g, bu4.f131319g) && C46238a.m51546a(Long.valueOf(this.f131320h), Long.valueOf(bu4.f131320h)) && C46238a.m51546a(Integer.valueOf(this.f131321i), Integer.valueOf(bu4.f131321i));
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
            aVar.mo74318e(2, this.f131316d);
            aVar.mo74321h(3, this.f131317e);
            aVar.mo74321h(4, this.f131318f);
            String str = this.f131319g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f131320h);
            aVar.mo74318e(7, this.f131321i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131316d) + C52418a.m58681h(3, this.f131317e) + C52418a.m58681h(4, this.f131318f);
            String str2 = this.f131319g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58681h(6, this.f131320h) + C52418a.m58678e(7, this.f131321i);
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
            bu4 bu4 = objArr[1];
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
                        bu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bu4.f131316d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bu4.f131317e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    bu4.f131318f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    bu4.f131319g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bu4.f131320h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    bu4.f131321i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
