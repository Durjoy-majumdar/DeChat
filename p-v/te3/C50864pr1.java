package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pr1 */
public class C50864pr1 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f139911d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f139912e = new LinkedList<>();

    /* renamed from: f */
    public String f139913f;

    /* renamed from: g */
    public String f139914g;

    /* renamed from: h */
    public int f139915h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50864pr1)) {
            return false;
        }
        C50864pr1 pr12 = (C50864pr1) aVar;
        return C46238a.m51546a(this.BaseRequest, pr12.BaseRequest) && C46238a.m51546a(this.f139911d, pr12.f139911d) && C46238a.m51546a(this.f139912e, pr12.f139912e) && C46238a.m51546a(this.f139913f, pr12.f139913f) && C46238a.m51546a(this.f139914g, pr12.f139914g) && C46238a.m51546a(Integer.valueOf(this.f139915h), Integer.valueOf(pr12.f139915h));
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
            aVar.mo74320g(2, 1, this.f139911d);
            aVar.mo74320g(3, 1, this.f139912e);
            String str = this.f139913f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f139914g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f139915h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f139911d) + C52418a.m58680g(3, 1, this.f139912e);
            String str3 = this.f139913f;
            if (str3 != null) {
                g += C52418a.m58683j(4, str3);
            }
            String str4 = this.f139914g;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            return g + C52418a.m58678e(6, this.f139915h);
        } else if (i == 2) {
            this.f139911d.clear();
            this.f139912e.clear();
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
            C50864pr1 pr12 = objArr[1];
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
                        pr12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pr12.f139911d.add(aVar3.mo141633k(intValue));
                    return 0;
                case 3:
                    pr12.f139912e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    pr12.f139913f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pr12.f139914g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pr12.f139915h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
