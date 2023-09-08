package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l72 */
public class C64515l72 extends C101820nt3 {

    /* renamed from: d */
    public int f184044d;

    /* renamed from: e */
    public C89349b f184045e;

    /* renamed from: f */
    public C64635po3 f184046f;

    /* renamed from: g */
    public C64522lg f184047g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64515l72)) {
            return false;
        }
        C64515l72 l722 = (C64515l72) aVar;
        return C46238a.m51546a(this.BaseRequest, l722.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184044d), Integer.valueOf(l722.f184044d)) && C46238a.m51546a(this.f184045e, l722.f184045e) && C46238a.m51546a(this.f184046f, l722.f184046f) && C46238a.m51546a(this.f184047g, l722.f184047g);
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
            aVar.mo74318e(2, this.f184044d);
            C89349b bVar = this.f184045e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C64635po3 po32 = this.f184046f;
            if (po32 != null) {
                aVar.mo74322i(4, po32.computeSize());
                this.f184046f.writeFields(aVar);
            }
            C64522lg lgVar = this.f184047g;
            if (lgVar != null) {
                aVar.mo74322i(5, lgVar.computeSize());
                this.f184047g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184044d);
            C89349b bVar2 = this.f184045e;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            C64635po3 po33 = this.f184046f;
            if (po33 != null) {
                e += C52418a.m58682i(4, po33.computeSize());
            }
            C64522lg lgVar2 = this.f184047g;
            return lgVar2 != null ? e + C52418a.m58682i(5, lgVar2.computeSize()) : e;
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
            C64515l72 l722 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    l722.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l722.f184044d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                l722.f184045e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64635po3 po34 = new C64635po3();
                    if (bArr2 != null && bArr2.length > 0) {
                        po34.parseFrom(bArr2);
                    }
                    l722.f184046f = po34;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64522lg lgVar3 = new C64522lg();
                    if (bArr3 != null && bArr3.length > 0) {
                        lgVar3.parseFrom(bArr3);
                    }
                    l722.f184047g = lgVar3;
                }
                return 0;
            }
        }
    }
}
