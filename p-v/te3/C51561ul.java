package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ul */
public class C51561ul extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<Integer> f142922d = new LinkedList<>();

    /* renamed from: e */
    public C51122rl f142923e;

    /* renamed from: f */
    public LinkedList<C50974ql> f142924f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51561ul)) {
            return false;
        }
        C51561ul ulVar = (C51561ul) aVar;
        return C46238a.m51546a(this.BaseResponse, ulVar.BaseResponse) && C46238a.m51546a(this.f142922d, ulVar.f142922d) && C46238a.m51546a(this.f142923e, ulVar.f142923e) && C46238a.m51546a(this.f142924f, ulVar.f142924f);
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
                aVar.mo74320g(2, 2, this.f142922d);
                C51122rl rlVar = this.f142923e;
                if (rlVar != null) {
                    aVar.mo74322i(3, rlVar.computeSize());
                    this.f142923e.writeFields(aVar);
                }
                aVar.mo74320g(4, 8, this.f142924f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f142922d);
            C51122rl rlVar2 = this.f142923e;
            if (rlVar2 != null) {
                g += C52418a.m58682i(3, rlVar2.computeSize());
            }
            return g + C52418a.m58680g(4, 8, this.f142924f);
        } else if (i == 2) {
            this.f142922d.clear();
            this.f142924f.clear();
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
            C51561ul ulVar = objArr[1];
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
                    ulVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ulVar.f142922d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51122rl rlVar3 = new C51122rl();
                    if (bArr2 != null && bArr2.length > 0) {
                        rlVar3.parseFrom(bArr2);
                    }
                    ulVar.f142923e = rlVar3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50974ql qlVar = new C50974ql();
                    if (bArr3 != null && bArr3.length > 0) {
                        qlVar.parseFrom(bArr3);
                    }
                    ulVar.f142924f.add(qlVar);
                }
                return 0;
            }
        }
    }
}
