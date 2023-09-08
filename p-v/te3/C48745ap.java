package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ap */
public class C48745ap extends C49335eu3 {

    /* renamed from: d */
    public String f130701d;

    /* renamed from: e */
    public boolean f130702e;

    /* renamed from: f */
    public LinkedList<C49718hk3> f130703f = new LinkedList<>();

    /* renamed from: g */
    public C118479xj3 f130704g;

    /* renamed from: h */
    public C118479xj3 f130705h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48745ap)) {
            return false;
        }
        C48745ap apVar = (C48745ap) aVar;
        return C46238a.m51546a(this.BaseResponse, apVar.BaseResponse) && C46238a.m51546a(this.f130701d, apVar.f130701d) && C46238a.m51546a(Boolean.valueOf(this.f130702e), Boolean.valueOf(apVar.f130702e)) && C46238a.m51546a(this.f130703f, apVar.f130703f) && C46238a.m51546a(this.f130704g, apVar.f130704g) && C46238a.m51546a(this.f130705h, apVar.f130705h);
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
                String str = this.f130701d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.f130702e);
                aVar.mo74320g(4, 8, this.f130703f);
                C118479xj3 xj32 = this.f130704g;
                if (xj32 != null) {
                    aVar.mo74322i(5, xj32.computeSize());
                    this.f130704g.writeFields(aVar);
                }
                C118479xj3 xj33 = this.f130705h;
                if (xj33 != null) {
                    aVar.mo74322i(6, xj33.computeSize());
                    this.f130705h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f130701d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int a = i2 + C52418a.m58674a(3, this.f130702e) + C52418a.m58680g(4, 8, this.f130703f);
            C118479xj3 xj34 = this.f130704g;
            if (xj34 != null) {
                a += C52418a.m58682i(5, xj34.computeSize());
            }
            C118479xj3 xj35 = this.f130705h;
            return xj35 != null ? a + C52418a.m58682i(6, xj35.computeSize()) : a;
        } else if (i == 2) {
            this.f130703f.clear();
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
            C48745ap apVar = objArr[1];
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
                        apVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    apVar.f130701d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    apVar.f130702e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49718hk3 hk32 = new C49718hk3();
                        if (bArr2 != null && bArr2.length > 0) {
                            hk32.parseFrom(bArr2);
                        }
                        apVar.f130703f.add(hk32);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C118479xj3 xj36 = new C118479xj3();
                        if (bArr3 != null && bArr3.length > 0) {
                            xj36.parseFrom(bArr3);
                        }
                        apVar.f130704g = xj36;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C118479xj3 xj37 = new C118479xj3();
                        if (bArr4 != null && bArr4.length > 0) {
                            xj37.parseFrom(bArr4);
                        }
                        apVar.f130705h = xj37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
