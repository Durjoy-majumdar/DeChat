package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qi3 */
public class C50966qi3 extends C101820nt3 {

    /* renamed from: d */
    public String f140333d;

    /* renamed from: e */
    public String f140334e;

    /* renamed from: f */
    public String f140335f;

    /* renamed from: g */
    public String f140336g;

    /* renamed from: h */
    public String f140337h;

    /* renamed from: i */
    public int f140338i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50966qi3)) {
            return false;
        }
        C50966qi3 qi32 = (C50966qi3) aVar;
        return C46238a.m51546a(this.BaseRequest, qi32.BaseRequest) && C46238a.m51546a(this.f140333d, qi32.f140333d) && C46238a.m51546a(this.f140334e, qi32.f140334e) && C46238a.m51546a(this.f140335f, qi32.f140335f) && C46238a.m51546a(this.f140336g, qi32.f140336g) && C46238a.m51546a(this.f140337h, qi32.f140337h) && C46238a.m51546a(Integer.valueOf(this.f140338i), Integer.valueOf(qi32.f140338i));
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
            String str = this.f140333d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140334e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f140335f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f140336g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f140337h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f140338i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f140333d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f140334e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f140335f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f140336g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f140337h;
            if (str10 != null) {
                i2 += C52418a.m58683j(6, str10);
            }
            return i2 + C52418a.m58678e(7, this.f140338i);
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
            C50966qi3 qi32 = objArr[1];
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
                        qi32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qi32.f140333d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qi32.f140334e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qi32.f140335f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qi32.f140336g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qi32.f140337h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qi32.f140338i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
