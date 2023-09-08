package z72;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: z72.d */
public class C53757d extends C101820nt3 {

    /* renamed from: d */
    public long f150899d;

    /* renamed from: e */
    public long f150900e;

    /* renamed from: f */
    public int f150901f;

    /* renamed from: g */
    public C102978c f150902g;

    /* renamed from: h */
    public LinkedList<C53755a> f150903h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53757d)) {
            return false;
        }
        C53757d dVar = (C53757d) aVar;
        return C46238a.m51546a(this.BaseRequest, dVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f150899d), Long.valueOf(dVar.f150899d)) && C46238a.m51546a(Long.valueOf(this.f150900e), Long.valueOf(dVar.f150900e)) && C46238a.m51546a(Integer.valueOf(this.f150901f), Integer.valueOf(dVar.f150901f)) && C46238a.m51546a(this.f150902g, dVar.f150902g) && C46238a.m51546a(this.f150903h, dVar.f150903h);
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
            aVar.mo74321h(2, this.f150899d);
            aVar.mo74321h(3, this.f150900e);
            aVar.mo74318e(4, this.f150901f);
            C102978c cVar = this.f150902g;
            if (cVar != null) {
                aVar.mo74322i(5, cVar.computeSize());
                this.f150902g.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f150903h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f150899d) + C52418a.m58681h(3, this.f150900e) + C52418a.m58678e(4, this.f150901f);
            C102978c cVar2 = this.f150902g;
            if (cVar2 != null) {
                h += C52418a.m58682i(5, cVar2.computeSize());
            }
            return h + C52418a.m58680g(6, 8, this.f150903h);
        } else if (i == 2) {
            this.f150903h.clear();
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
            C53757d dVar = objArr[1];
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
                        dVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dVar.f150899d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    dVar.f150900e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    dVar.f150901f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C102978c cVar3 = new C102978c();
                        if (bArr2 != null && bArr2.length > 0) {
                            cVar3.parseFrom(bArr2);
                        }
                        dVar.f150902g = cVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C53755a aVar4 = new C53755a();
                        if (bArr3 != null && bArr3.length > 0) {
                            aVar4.parseFrom(bArr3);
                        }
                        dVar.f150903h.add(aVar4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
