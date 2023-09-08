package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wp */
public class C51862wp extends C49335eu3 {

    /* renamed from: d */
    public String f144182d;

    /* renamed from: e */
    public int f144183e;

    /* renamed from: f */
    public int f144184f;

    /* renamed from: g */
    public long f144185g;

    /* renamed from: h */
    public String f144186h;

    /* renamed from: i */
    public C89349b f144187i;

    /* renamed from: j */
    public boolean f144188j;

    /* renamed from: n */
    public String f144189n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51862wp)) {
            return false;
        }
        C51862wp wpVar = (C51862wp) aVar;
        return C46238a.m51546a(this.BaseResponse, wpVar.BaseResponse) && C46238a.m51546a(this.f144182d, wpVar.f144182d) && C46238a.m51546a(Integer.valueOf(this.f144183e), Integer.valueOf(wpVar.f144183e)) && C46238a.m51546a(Integer.valueOf(this.f144184f), Integer.valueOf(wpVar.f144184f)) && C46238a.m51546a(Long.valueOf(this.f144185g), Long.valueOf(wpVar.f144185g)) && C46238a.m51546a(this.f144186h, wpVar.f144186h) && C46238a.m51546a(this.f144187i, wpVar.f144187i) && C46238a.m51546a(Boolean.valueOf(this.f144188j), Boolean.valueOf(wpVar.f144188j)) && C46238a.m51546a(this.f144189n, wpVar.f144189n);
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
                String str = this.f144182d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f144183e);
                aVar.mo74318e(4, this.f144184f);
                aVar.mo74321h(5, this.f144185g);
                String str2 = this.f144186h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                C89349b bVar = this.f144187i;
                if (bVar != null) {
                    aVar.mo74315b(7, bVar);
                }
                aVar.mo74314a(8, this.f144188j);
                String str3 = this.f144189n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f144182d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f144183e) + C52418a.m58678e(4, this.f144184f) + C52418a.m58681h(5, this.f144185g);
            String str5 = this.f144186h;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            C89349b bVar2 = this.f144187i;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            int a = e + C52418a.m58674a(8, this.f144188j);
            String str6 = this.f144189n;
            return str6 != null ? a + C52418a.m58683j(9, str6) : a;
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
            C51862wp wpVar = objArr[1];
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
                        wpVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    wpVar.f144182d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wpVar.f144183e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wpVar.f144184f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wpVar.f144185g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    wpVar.f144186h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wpVar.f144187i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    wpVar.f144188j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    wpVar.f144189n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
