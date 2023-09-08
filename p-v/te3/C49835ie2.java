package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ie2 */
public class C49835ie2 extends C101820nt3 {

    /* renamed from: d */
    public int f135253d;

    /* renamed from: e */
    public String f135254e;

    /* renamed from: f */
    public C51018qv3 f135255f;

    /* renamed from: g */
    public String f135256g;

    /* renamed from: h */
    public C49569gj3 f135257h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49835ie2)) {
            return false;
        }
        C49835ie2 ie22 = (C49835ie2) aVar;
        return C46238a.m51546a(this.BaseRequest, ie22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135253d), Integer.valueOf(ie22.f135253d)) && C46238a.m51546a(this.f135254e, ie22.f135254e) && C46238a.m51546a(this.f135255f, ie22.f135255f) && C46238a.m51546a(this.f135256g, ie22.f135256g) && C46238a.m51546a(this.f135257h, ie22.f135257h);
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
            aVar.mo74318e(2, this.f135253d);
            String str = this.f135254e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51018qv3 qv32 = this.f135255f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f135255f.writeFields(aVar);
            }
            String str2 = this.f135256g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C49569gj3 gj32 = this.f135257h;
            if (gj32 != null) {
                aVar.mo74322i(6, gj32.computeSize());
                this.f135257h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135253d);
            String str3 = this.f135254e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C51018qv3 qv33 = this.f135255f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            String str4 = this.f135256g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C49569gj3 gj33 = this.f135257h;
            return gj33 != null ? e + C52418a.m58682i(6, gj33.computeSize()) : e;
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
            C49835ie2 ie22 = objArr[1];
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
                        ie22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ie22.f135253d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ie22.f135254e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        ie22.f135255f = qv34;
                    }
                    return 0;
                case 5:
                    ie22.f135256g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49569gj3 gj34 = new C49569gj3();
                        if (bArr3 != null && bArr3.length > 0) {
                            gj34.parseFrom(bArr3);
                        }
                        ie22.f135257h = gj34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
