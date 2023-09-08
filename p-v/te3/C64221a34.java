package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a34 */
public class C64221a34 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f182012d;

    /* renamed from: e */
    public String f182013e;

    /* renamed from: f */
    public String f182014f;

    /* renamed from: g */
    public int f182015g;

    /* renamed from: h */
    public String f182016h;

    /* renamed from: i */
    public int f182017i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64221a34)) {
            return false;
        }
        C64221a34 a342 = (C64221a34) aVar;
        return C46238a.m51546a(this.BaseRequest, a342.BaseRequest) && C46238a.m51546a(this.f182012d, a342.f182012d) && C46238a.m51546a(this.f182013e, a342.f182013e) && C46238a.m51546a(this.f182014f, a342.f182014f) && C46238a.m51546a(Integer.valueOf(this.f182015g), Integer.valueOf(a342.f182015g)) && C46238a.m51546a(this.f182016h, a342.f182016h) && C46238a.m51546a(Integer.valueOf(this.f182017i), Integer.valueOf(a342.f182017i));
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
            C89349b bVar = this.f182012d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f182013e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f182014f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f182015g);
            String str3 = this.f182016h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f182017i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f182012d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str4 = this.f182013e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f182014f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            int e = i2 + C52418a.m58678e(5, this.f182015g);
            String str6 = this.f182016h;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58678e(7, this.f182017i);
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
            C64221a34 a342 = objArr[1];
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
                        a342.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    a342.f182012d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    a342.f182013e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a342.f182014f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    a342.f182015g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a342.f182016h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    a342.f182017i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
