package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class st4 extends C49335eu3 {

    /* renamed from: d */
    public int f141749d;

    /* renamed from: e */
    public LinkedList<pt4> f141750e = new LinkedList<>();

    /* renamed from: f */
    public int f141751f;

    /* renamed from: g */
    public int f141752g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof st4)) {
            return false;
        }
        st4 st4 = (st4) aVar;
        return C46238a.m51546a(this.BaseResponse, st4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141749d), Integer.valueOf(st4.f141749d)) && C46238a.m51546a(this.f141750e, st4.f141750e) && C46238a.m51546a(Integer.valueOf(this.f141751f), Integer.valueOf(st4.f141751f)) && C46238a.m51546a(Integer.valueOf(this.f141752g), Integer.valueOf(st4.f141752g));
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
                aVar.mo74318e(2, this.f141749d);
                aVar.mo74320g(3, 8, this.f141750e);
                aVar.mo74318e(4, this.f141751f);
                aVar.mo74318e(5, this.f141752g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141749d) + C52418a.m58680g(3, 8, this.f141750e) + C52418a.m58678e(4, this.f141751f) + C52418a.m58678e(5, this.f141752g);
        } else if (i == 2) {
            this.f141750e.clear();
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
            st4 st4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    st4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                st4.f141749d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    pt4 pt4 = new pt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        pt4.parseFrom(bArr2);
                    }
                    st4.f141750e.add(pt4);
                }
                return 0;
            } else if (intValue == 4) {
                st4.f141751f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                st4.f141752g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
