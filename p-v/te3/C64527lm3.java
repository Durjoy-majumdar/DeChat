package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lm3 */
public class C64527lm3 extends C101820nt3 {

    /* renamed from: d */
    public int f184114d;

    /* renamed from: e */
    public float f184115e;

    /* renamed from: f */
    public float f184116f;

    /* renamed from: g */
    public int f184117g;

    /* renamed from: h */
    public String f184118h;

    /* renamed from: i */
    public String f184119i;

    /* renamed from: j */
    public int f184120j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64527lm3)) {
            return false;
        }
        C64527lm3 lm32 = (C64527lm3) aVar;
        return C46238a.m51546a(this.BaseRequest, lm32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184114d), Integer.valueOf(lm32.f184114d)) && C46238a.m51546a(Float.valueOf(this.f184115e), Float.valueOf(lm32.f184115e)) && C46238a.m51546a(Float.valueOf(this.f184116f), Float.valueOf(lm32.f184116f)) && C46238a.m51546a(Integer.valueOf(this.f184117g), Integer.valueOf(lm32.f184117g)) && C46238a.m51546a(this.f184118h, lm32.f184118h) && C46238a.m51546a(this.f184119i, lm32.f184119i) && C46238a.m51546a(Integer.valueOf(this.f184120j), Integer.valueOf(lm32.f184120j));
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
            aVar.mo74318e(2, this.f184114d);
            aVar.mo74317d(3, this.f184115e);
            aVar.mo74317d(4, this.f184116f);
            aVar.mo74318e(5, this.f184117g);
            String str = this.f184118h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f184119i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f184120j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184114d) + C52418a.m58677d(3, this.f184115e) + C52418a.m58677d(4, this.f184116f) + C52418a.m58678e(5, this.f184117g);
            String str3 = this.f184118h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f184119i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            return e + C52418a.m58678e(8, this.f184120j);
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
            C64527lm3 lm32 = objArr[1];
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
                        lm32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    lm32.f184114d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lm32.f184115e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    lm32.f184116f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    lm32.f184117g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lm32.f184118h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lm32.f184119i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lm32.f184120j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
