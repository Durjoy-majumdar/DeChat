package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ik2 */
public class C90418ik2 extends C101820nt3 {

    /* renamed from: d */
    public String f259576d;

    /* renamed from: e */
    public LinkedList<String> f259577e = new LinkedList<>();

    /* renamed from: f */
    public int f259578f;

    /* renamed from: g */
    public String f259579g;

    /* renamed from: h */
    public String f259580h;

    /* renamed from: i */
    public int f259581i;

    /* renamed from: j */
    public w55 f259582j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90418ik2)) {
            return false;
        }
        C90418ik2 ik22 = (C90418ik2) aVar;
        return C46238a.m51546a(this.BaseRequest, ik22.BaseRequest) && C46238a.m51546a(this.f259576d, ik22.f259576d) && C46238a.m51546a(this.f259577e, ik22.f259577e) && C46238a.m51546a(Integer.valueOf(this.f259578f), Integer.valueOf(ik22.f259578f)) && C46238a.m51546a(this.f259579g, ik22.f259579g) && C46238a.m51546a(this.f259580h, ik22.f259580h) && C46238a.m51546a(Integer.valueOf(this.f259581i), Integer.valueOf(ik22.f259581i)) && C46238a.m51546a(this.f259582j, ik22.f259582j);
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
            String str = this.f259576d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f259577e);
            aVar.mo74318e(4, this.f259578f);
            String str2 = this.f259579g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f259580h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f259581i);
            w55 w55 = this.f259582j;
            if (w55 != null) {
                aVar.mo74322i(8, w55.computeSize());
                this.f259582j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f259576d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f259577e) + C52418a.m58678e(4, this.f259578f);
            String str5 = this.f259579g;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            String str6 = this.f259580h;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            int e = g + C52418a.m58678e(7, this.f259581i);
            w55 w552 = this.f259582j;
            return w552 != null ? e + C52418a.m58682i(8, w552.computeSize()) : e;
        } else if (i == 2) {
            this.f259577e.clear();
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
            C90418ik2 ik22 = objArr[1];
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
                        ik22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ik22.f259576d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ik22.f259577e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    ik22.f259578f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ik22.f259579g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ik22.f259580h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ik22.f259581i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w55 w553 = new w55();
                        if (bArr2 != null && bArr2.length > 0) {
                            w553.parseFrom(bArr2);
                        }
                        ik22.f259582j = w553;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
