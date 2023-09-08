package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y */
public class C52044y extends C101820nt3 {

    /* renamed from: d */
    public String f145048d;

    /* renamed from: e */
    public int f145049e;

    /* renamed from: f */
    public String f145050f;

    /* renamed from: g */
    public String f145051g;

    /* renamed from: h */
    public int f145052h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52044y)) {
            return false;
        }
        C52044y yVar = (C52044y) aVar;
        return C46238a.m51546a(this.BaseRequest, yVar.BaseRequest) && C46238a.m51546a(this.f145048d, yVar.f145048d) && C46238a.m51546a(Integer.valueOf(this.f145049e), Integer.valueOf(yVar.f145049e)) && C46238a.m51546a(this.f145050f, yVar.f145050f) && C46238a.m51546a(this.f145051g, yVar.f145051g) && C46238a.m51546a(Integer.valueOf(this.f145052h), Integer.valueOf(yVar.f145052h));
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
            String str = this.f145048d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145049e);
            String str2 = this.f145050f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f145051g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f145052h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f145048d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f145049e);
            String str5 = this.f145050f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f145051g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f145052h);
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
            C52044y yVar = objArr[1];
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
                        yVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    yVar.f145048d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yVar.f145049e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yVar.f145050f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yVar.f145051g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yVar.f145052h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
