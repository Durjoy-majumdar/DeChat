package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qs0 */
public class C51005qs0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140517d;

    /* renamed from: e */
    public String f140518e;

    /* renamed from: f */
    public int f140519f;

    /* renamed from: g */
    public C50326ly0 f140520g;

    /* renamed from: h */
    public C50172ks0 f140521h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51005qs0)) {
            return false;
        }
        C51005qs0 qs02 = (C51005qs0) aVar;
        return C46238a.m51546a(this.BaseRequest, qs02.BaseRequest) && C46238a.m51546a(this.f140517d, qs02.f140517d) && C46238a.m51546a(this.f140518e, qs02.f140518e) && C46238a.m51546a(Integer.valueOf(this.f140519f), Integer.valueOf(qs02.f140519f)) && C46238a.m51546a(this.f140520g, qs02.f140520g) && C46238a.m51546a(this.f140521h, qs02.f140521h);
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
            C49842ig0 ig02 = this.f140517d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140517d.writeFields(aVar);
            }
            String str = this.f140518e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f140519f);
            C50326ly0 ly02 = this.f140520g;
            if (ly02 != null) {
                aVar.mo74322i(5, ly02.computeSize());
                this.f140520g.writeFields(aVar);
            }
            C50172ks0 ks02 = this.f140521h;
            if (ks02 != null) {
                aVar.mo74322i(6, ks02.computeSize());
                this.f140521h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140517d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f140518e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            int e = i2 + C52418a.m58678e(4, this.f140519f);
            C50326ly0 ly03 = this.f140520g;
            if (ly03 != null) {
                e += C52418a.m58682i(5, ly03.computeSize());
            }
            C50172ks0 ks03 = this.f140521h;
            return ks03 != null ? e + C52418a.m58682i(6, ks03.computeSize()) : e;
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
            C51005qs0 qs02 = objArr[1];
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
                        qs02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        qs02.f140517d = ig04;
                    }
                    return 0;
                case 3:
                    qs02.f140518e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qs02.f140519f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50326ly0 ly04 = new C50326ly0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ly04.parseFrom(bArr3);
                        }
                        qs02.f140520g = ly04;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50172ks0 ks04 = new C50172ks0();
                        if (bArr4 != null && bArr4.length > 0) {
                            ks04.parseFrom(bArr4);
                        }
                        qs02.f140521h = ks04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
