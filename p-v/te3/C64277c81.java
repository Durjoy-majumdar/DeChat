package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c81 */
public class C64277c81 extends C101820nt3 {

    /* renamed from: d */
    public String f182426d;

    /* renamed from: e */
    public String f182427e;

    /* renamed from: f */
    public String f182428f;

    /* renamed from: g */
    public int f182429g;

    /* renamed from: h */
    public C64548ma0 f182430h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64277c81)) {
            return false;
        }
        C64277c81 c812 = (C64277c81) aVar;
        return C46238a.m51546a(this.BaseRequest, c812.BaseRequest) && C46238a.m51546a(this.f182426d, c812.f182426d) && C46238a.m51546a(this.f182427e, c812.f182427e) && C46238a.m51546a(this.f182428f, c812.f182428f) && C46238a.m51546a(Integer.valueOf(this.f182429g), Integer.valueOf(c812.f182429g)) && C46238a.m51546a(this.f182430h, c812.f182430h);
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
            String str = this.f182426d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182427e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182428f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f182429g);
            C64548ma0 ma02 = this.f182430h;
            if (ma02 != null) {
                aVar.mo74322i(6, ma02.computeSize());
                this.f182430h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f182426d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f182427e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f182428f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            int e = i2 + C52418a.m58678e(5, this.f182429g);
            C64548ma0 ma03 = this.f182430h;
            return ma03 != null ? e + C52418a.m58682i(6, ma03.computeSize()) : e;
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
            C64277c81 c812 = objArr[1];
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
                        c812.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    c812.f182426d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c812.f182427e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c812.f182428f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c812.f182429g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64548ma0 ma04 = new C64548ma0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ma04.parseFrom(bArr2);
                        }
                        c812.f182430h = ma04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
