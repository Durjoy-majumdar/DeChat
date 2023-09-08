package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.st */
public class C51294st extends C49335eu3 {

    /* renamed from: d */
    public int f141731d;

    /* renamed from: e */
    public C89349b f141732e;

    /* renamed from: f */
    public C89349b f141733f;

    /* renamed from: g */
    public String f141734g;

    /* renamed from: h */
    public C50871pt f141735h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51294st)) {
            return false;
        }
        C51294st stVar = (C51294st) aVar;
        return C46238a.m51546a(this.BaseResponse, stVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141731d), Integer.valueOf(stVar.f141731d)) && C46238a.m51546a(this.f141732e, stVar.f141732e) && C46238a.m51546a(this.f141733f, stVar.f141733f) && C46238a.m51546a(this.f141734g, stVar.f141734g) && C46238a.m51546a(this.f141735h, stVar.f141735h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f141731d);
                C89349b bVar = this.f141732e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                C89349b bVar2 = this.f141733f;
                if (bVar2 != null) {
                    aVar.mo74315b(4, bVar2);
                }
                String str = this.f141734g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                C50871pt ptVar = this.f141735h;
                if (ptVar != null) {
                    aVar.mo74322i(6, ptVar.computeSize());
                    this.f141735h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141731d);
            C89349b bVar3 = this.f141732e;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            C89349b bVar4 = this.f141733f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            String str2 = this.f141734g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            C50871pt ptVar2 = this.f141735h;
            return ptVar2 != null ? e + C52418a.m58682i(6, ptVar2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51294st stVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        stVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    stVar.f141731d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    stVar.f141732e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    stVar.f141733f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    stVar.f141734g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50871pt ptVar3 = new C50871pt();
                        if (bArr2 != null && bArr2.length > 0) {
                            ptVar3.parseFrom(bArr2);
                        }
                        stVar.f141735h = ptVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
