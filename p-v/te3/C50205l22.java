package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l22 */
public class C50205l22 extends C101820nt3 {

    /* renamed from: d */
    public String f137135d;

    /* renamed from: e */
    public String f137136e;

    /* renamed from: f */
    public String f137137f;

    /* renamed from: g */
    public String f137138g;

    /* renamed from: h */
    public String f137139h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50205l22)) {
            return false;
        }
        C50205l22 l222 = (C50205l22) aVar;
        return C46238a.m51546a(this.BaseRequest, l222.BaseRequest) && C46238a.m51546a(this.f137135d, l222.f137135d) && C46238a.m51546a(this.f137136e, l222.f137136e) && C46238a.m51546a(this.f137137f, l222.f137137f) && C46238a.m51546a(this.f137138g, l222.f137138g) && C46238a.m51546a(this.f137139h, l222.f137139h);
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
            String str = this.f137135d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f137136e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f137137f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f137138g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f137139h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f137135d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f137136e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f137137f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f137138g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f137139h;
            return str10 != null ? i2 + C52418a.m58683j(6, str10) : i2;
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
            C50205l22 l222 = objArr[1];
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
                        l222.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    l222.f137135d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l222.f137136e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l222.f137137f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l222.f137138g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l222.f137139h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
