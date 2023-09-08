package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t72 */
public class C51355t72 extends C101820nt3 {

    /* renamed from: d */
    public String f142019d;

    /* renamed from: e */
    public String f142020e;

    /* renamed from: f */
    public int f142021f;

    /* renamed from: g */
    public int f142022g;

    /* renamed from: h */
    public int f142023h;

    /* renamed from: i */
    public C89349b f142024i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51355t72)) {
            return false;
        }
        C51355t72 t722 = (C51355t72) aVar;
        return C46238a.m51546a(this.BaseRequest, t722.BaseRequest) && C46238a.m51546a(this.f142019d, t722.f142019d) && C46238a.m51546a(this.f142020e, t722.f142020e) && C46238a.m51546a(Integer.valueOf(this.f142021f), Integer.valueOf(t722.f142021f)) && C46238a.m51546a(Integer.valueOf(this.f142022g), Integer.valueOf(t722.f142022g)) && C46238a.m51546a(Integer.valueOf(this.f142023h), Integer.valueOf(t722.f142023h)) && C46238a.m51546a(this.f142024i, t722.f142024i);
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
            String str = this.f142019d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f142020e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f142021f);
            aVar.mo74318e(5, this.f142022g);
            aVar.mo74318e(6, this.f142023h);
            C89349b bVar = this.f142024i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f142019d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f142020e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f142021f) + C52418a.m58678e(5, this.f142022g) + C52418a.m58678e(6, this.f142023h);
            C89349b bVar2 = this.f142024i;
            return bVar2 != null ? e + C52418a.m58675b(7, bVar2) : e;
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
            C51355t72 t722 = objArr[1];
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
                        t722.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t722.f142019d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t722.f142020e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t722.f142021f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t722.f142022g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t722.f142023h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    t722.f142024i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
