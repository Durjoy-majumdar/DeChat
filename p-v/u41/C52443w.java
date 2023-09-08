package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.w */
public class C52443w extends C101820nt3 {

    /* renamed from: d */
    public int f146556d;

    /* renamed from: e */
    public String f146557e;

    /* renamed from: f */
    public String f146558f;

    /* renamed from: g */
    public int f146559g;

    /* renamed from: h */
    public int f146560h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52443w)) {
            return false;
        }
        C52443w wVar = (C52443w) aVar;
        return C46238a.m51546a(this.BaseRequest, wVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f146556d), Integer.valueOf(wVar.f146556d)) && C46238a.m51546a(this.f146557e, wVar.f146557e) && C46238a.m51546a(this.f146558f, wVar.f146558f) && C46238a.m51546a(Integer.valueOf(this.f146559g), Integer.valueOf(wVar.f146559g)) && C46238a.m51546a(Integer.valueOf(this.f146560h), Integer.valueOf(wVar.f146560h));
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
            aVar.mo74318e(2, this.f146556d);
            String str = this.f146557e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f146558f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f146559g);
            aVar.mo74318e(6, this.f146560h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146556d);
            String str3 = this.f146557e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f146558f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f146559g) + C52418a.m58678e(6, this.f146560h);
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
            C52443w wVar = objArr[1];
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
                        wVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wVar.f146556d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wVar.f146557e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wVar.f146558f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wVar.f146559g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wVar.f146560h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
