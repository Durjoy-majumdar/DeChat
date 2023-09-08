package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o43 */
public class C64601o43 extends C101820nt3 {

    /* renamed from: d */
    public String f184614d;

    /* renamed from: e */
    public int f184615e;

    /* renamed from: f */
    public LinkedList<String> f184616f = new LinkedList<>();

    /* renamed from: g */
    public int f184617g;

    /* renamed from: h */
    public String f184618h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64601o43)) {
            return false;
        }
        C64601o43 o432 = (C64601o43) aVar;
        return C46238a.m51546a(this.BaseRequest, o432.BaseRequest) && C46238a.m51546a(this.f184614d, o432.f184614d) && C46238a.m51546a(Integer.valueOf(this.f184615e), Integer.valueOf(o432.f184615e)) && C46238a.m51546a(this.f184616f, o432.f184616f) && C46238a.m51546a(Integer.valueOf(this.f184617g), Integer.valueOf(o432.f184617g)) && C46238a.m51546a(this.f184618h, o432.f184618h);
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
            String str = this.f184614d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f184615e);
            aVar.mo74320g(4, 1, this.f184616f);
            aVar.mo74318e(5, this.f184617g);
            String str2 = this.f184618h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f184614d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f184615e) + C52418a.m58680g(4, 1, this.f184616f) + C52418a.m58678e(5, this.f184617g);
            String str4 = this.f184618h;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
        } else if (i == 2) {
            this.f184616f.clear();
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
            C64601o43 o432 = objArr[1];
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
                        o432.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o432.f184614d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o432.f184615e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o432.f184616f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    o432.f184617g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    o432.f184618h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
