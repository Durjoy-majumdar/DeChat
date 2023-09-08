package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ww */
public class C51884ww extends C101820nt3 {

    /* renamed from: d */
    public int f144316d;

    /* renamed from: e */
    public int f144317e;

    /* renamed from: f */
    public int f144318f;

    /* renamed from: g */
    public int f144319g;

    /* renamed from: h */
    public int f144320h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51884ww)) {
            return false;
        }
        C51884ww wwVar = (C51884ww) aVar;
        return C46238a.m51546a(this.BaseRequest, wwVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f144316d), Integer.valueOf(wwVar.f144316d)) && C46238a.m51546a(Integer.valueOf(this.f144317e), Integer.valueOf(wwVar.f144317e)) && C46238a.m51546a(Integer.valueOf(this.f144318f), Integer.valueOf(wwVar.f144318f)) && C46238a.m51546a(Integer.valueOf(this.f144319g), Integer.valueOf(wwVar.f144319g)) && C46238a.m51546a(Integer.valueOf(this.f144320h), Integer.valueOf(wwVar.f144320h));
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
            aVar.mo74318e(2, this.f144316d);
            aVar.mo74318e(3, this.f144317e);
            aVar.mo74318e(4, this.f144318f);
            aVar.mo74318e(5, this.f144319g);
            aVar.mo74318e(6, this.f144320h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144316d) + C52418a.m58678e(3, this.f144317e) + C52418a.m58678e(4, this.f144318f) + C52418a.m58678e(5, this.f144319g) + C52418a.m58678e(6, this.f144320h);
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
            C51884ww wwVar = objArr[1];
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
                        wwVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wwVar.f144316d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wwVar.f144317e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wwVar.f144318f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wwVar.f144319g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wwVar.f144320h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
