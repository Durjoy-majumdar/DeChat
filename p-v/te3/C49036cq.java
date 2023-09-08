package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cq */
public class C49036cq extends C101820nt3 {

    /* renamed from: d */
    public int f131895d;

    /* renamed from: e */
    public C89349b f131896e;

    /* renamed from: f */
    public C89349b f131897f;

    /* renamed from: g */
    public String f131898g;

    /* renamed from: h */
    public int f131899h = 4;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49036cq)) {
            return false;
        }
        C49036cq cqVar = (C49036cq) aVar;
        return C46238a.m51546a(this.BaseRequest, cqVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131895d), Integer.valueOf(cqVar.f131895d)) && C46238a.m51546a(this.f131896e, cqVar.f131896e) && C46238a.m51546a(this.f131897f, cqVar.f131897f) && C46238a.m51546a(this.f131898g, cqVar.f131898g) && C46238a.m51546a(Integer.valueOf(this.f131899h), Integer.valueOf(cqVar.f131899h));
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
            aVar.mo74318e(2, this.f131895d);
            C89349b bVar = this.f131896e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C89349b bVar2 = this.f131897f;
            if (bVar2 != null) {
                aVar.mo74315b(4, bVar2);
            }
            String str = this.f131898g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f131899h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131895d);
            C89349b bVar3 = this.f131896e;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            C89349b bVar4 = this.f131897f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            String str2 = this.f131898g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58678e(6, this.f131899h);
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
            C49036cq cqVar = objArr[1];
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
                        cqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cqVar.f131895d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cqVar.f131896e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    cqVar.f131897f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    cqVar.f131898g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cqVar.f131899h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
