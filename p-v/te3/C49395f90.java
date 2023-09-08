package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f90 */
public class C49395f90 extends C101820nt3 {

    /* renamed from: d */
    public String f133354d;

    /* renamed from: e */
    public int f133355e;

    /* renamed from: f */
    public C89349b f133356f;

    /* renamed from: g */
    public C89349b f133357g;

    /* renamed from: h */
    public int f133358h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49395f90)) {
            return false;
        }
        C49395f90 f902 = (C49395f90) aVar;
        return C46238a.m51546a(this.BaseRequest, f902.BaseRequest) && C46238a.m51546a(this.f133354d, f902.f133354d) && C46238a.m51546a(Integer.valueOf(this.f133355e), Integer.valueOf(f902.f133355e)) && C46238a.m51546a(this.f133356f, f902.f133356f) && C46238a.m51546a(this.f133357g, f902.f133357g) && C46238a.m51546a(Integer.valueOf(this.f133358h), Integer.valueOf(f902.f133358h));
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
            String str = this.f133354d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f133355e);
            C89349b bVar = this.f133356f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C89349b bVar2 = this.f133357g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            aVar.mo74318e(6, this.f133358h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f133354d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f133355e);
            C89349b bVar3 = this.f133356f;
            if (bVar3 != null) {
                e += C52418a.m58675b(4, bVar3);
            }
            C89349b bVar4 = this.f133357g;
            if (bVar4 != null) {
                e += C52418a.m58675b(5, bVar4);
            }
            return e + C52418a.m58678e(6, this.f133358h);
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
            C49395f90 f902 = objArr[1];
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
                        f902.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    f902.f133354d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f902.f133355e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    f902.f133356f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    f902.f133357g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    f902.f133358h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
