package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n72 */
public class C64571n72 extends C101820nt3 {

    /* renamed from: d */
    public int f184438d;

    /* renamed from: e */
    public int f184439e;

    /* renamed from: f */
    public C50854po f184440f;

    /* renamed from: g */
    public long f184441g;

    /* renamed from: h */
    public C64716sw f184442h;

    /* renamed from: i */
    public int f184443i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64571n72)) {
            return false;
        }
        C64571n72 n722 = (C64571n72) aVar;
        return C46238a.m51546a(this.BaseRequest, n722.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184438d), Integer.valueOf(n722.f184438d)) && C46238a.m51546a(Integer.valueOf(this.f184439e), Integer.valueOf(n722.f184439e)) && C46238a.m51546a(this.f184440f, n722.f184440f) && C46238a.m51546a(Long.valueOf(this.f184441g), Long.valueOf(n722.f184441g)) && C46238a.m51546a(this.f184442h, n722.f184442h) && C46238a.m51546a(Integer.valueOf(this.f184443i), Integer.valueOf(n722.f184443i));
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
            aVar.mo74318e(2, this.f184438d);
            aVar.mo74318e(3, this.f184439e);
            C50854po poVar = this.f184440f;
            if (poVar != null) {
                aVar.mo74322i(4, poVar.computeSize());
                this.f184440f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f184441g);
            C64716sw swVar = this.f184442h;
            if (swVar != null) {
                aVar.mo74322i(6, swVar.computeSize());
                this.f184442h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f184443i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184438d) + C52418a.m58678e(3, this.f184439e);
            C50854po poVar2 = this.f184440f;
            if (poVar2 != null) {
                e += C52418a.m58682i(4, poVar2.computeSize());
            }
            int h = e + C52418a.m58681h(5, this.f184441g);
            C64716sw swVar2 = this.f184442h;
            if (swVar2 != null) {
                h += C52418a.m58682i(6, swVar2.computeSize());
            }
            return h + C52418a.m58678e(7, this.f184443i);
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
            C64571n72 n722 = objArr[1];
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
                        n722.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n722.f184438d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n722.f184439e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50854po poVar3 = new C50854po();
                        if (bArr2 != null && bArr2.length > 0) {
                            poVar3.parseFrom(bArr2);
                        }
                        n722.f184440f = poVar3;
                    }
                    return 0;
                case 5:
                    n722.f184441g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64716sw swVar3 = new C64716sw();
                        if (bArr3 != null && bArr3.length > 0) {
                            swVar3.parseFrom(bArr3);
                        }
                        n722.f184442h = swVar3;
                    }
                    return 0;
                case 7:
                    n722.f184443i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
