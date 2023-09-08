package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gn4 extends C101820nt3 {

    /* renamed from: d */
    public String f134146d;

    /* renamed from: e */
    public C51018qv3 f134147e;

    /* renamed from: f */
    public int f134148f;

    /* renamed from: g */
    public String f134149g;

    /* renamed from: h */
    public int f134150h;

    /* renamed from: i */
    public int f134151i;

    /* renamed from: j */
    public int f134152j;

    /* renamed from: n */
    public int f134153n;

    /* renamed from: o */
    public int f134154o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gn4)) {
            return false;
        }
        gn4 gn4 = (gn4) aVar;
        return C46238a.m51546a(this.BaseRequest, gn4.BaseRequest) && C46238a.m51546a(this.f134146d, gn4.f134146d) && C46238a.m51546a(this.f134147e, gn4.f134147e) && C46238a.m51546a(Integer.valueOf(this.f134148f), Integer.valueOf(gn4.f134148f)) && C46238a.m51546a(this.f134149g, gn4.f134149g) && C46238a.m51546a(Integer.valueOf(this.f134150h), Integer.valueOf(gn4.f134150h)) && C46238a.m51546a(Integer.valueOf(this.f134151i), Integer.valueOf(gn4.f134151i)) && C46238a.m51546a(Integer.valueOf(this.f134152j), Integer.valueOf(gn4.f134152j)) && C46238a.m51546a(Integer.valueOf(this.f134153n), Integer.valueOf(gn4.f134153n)) && C46238a.m51546a(Integer.valueOf(this.f134154o), Integer.valueOf(gn4.f134154o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134147e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f134146d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f134147e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f134147e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f134148f);
                String str2 = this.f134149g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f134150h);
                aVar.mo74318e(7, this.f134151i);
                aVar.mo74318e(8, this.f134152j);
                aVar.mo74318e(9, this.f134153n);
                aVar.mo74318e(10, this.f134154o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f134146d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C51018qv3 qv33 = this.f134147e;
            if (qv33 != null) {
                i2 += C52418a.m58682i(3, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f134148f);
            String str4 = this.f134149g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f134150h) + C52418a.m58678e(7, this.f134151i) + C52418a.m58678e(8, this.f134152j) + C52418a.m58678e(9, this.f134153n) + C52418a.m58678e(10, this.f134154o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134147e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            gn4 gn4 = objArr[1];
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
                        gn4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gn4.f134146d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        gn4.f134147e = qv34;
                    }
                    return 0;
                case 4:
                    gn4.f134148f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gn4.f134149g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gn4.f134150h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gn4.f134151i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gn4.f134152j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    gn4.f134153n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    gn4.f134154o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
