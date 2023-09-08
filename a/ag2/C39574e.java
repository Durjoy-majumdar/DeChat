package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.e */
public class C39574e extends C101820nt3 {

    /* renamed from: d */
    public int f106230d;

    /* renamed from: e */
    public String f106231e;

    /* renamed from: f */
    public String f106232f;

    /* renamed from: g */
    public String f106233g;

    /* renamed from: h */
    public String f106234h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39574e)) {
            return false;
        }
        C39574e eVar = (C39574e) aVar;
        return C46238a.m51546a(this.BaseRequest, eVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f106230d), Integer.valueOf(eVar.f106230d)) && C46238a.m51546a(this.f106231e, eVar.f106231e) && C46238a.m51546a(this.f106232f, eVar.f106232f) && C46238a.m51546a(this.f106233g, eVar.f106233g) && C46238a.m51546a(this.f106234h, eVar.f106234h);
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
            aVar.mo74318e(2, this.f106230d);
            String str = this.f106231e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f106232f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f106233g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f106234h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f106230d);
            String str5 = this.f106231e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f106232f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f106233g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f106234h;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C39574e eVar = objArr[1];
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
                        eVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    eVar.f106230d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    eVar.f106231e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eVar.f106232f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eVar.f106233g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eVar.f106234h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
