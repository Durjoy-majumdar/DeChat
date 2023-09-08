package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fn0 */
public class C49447fn0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51270sn1> f133593d = new LinkedList<>();

    /* renamed from: e */
    public int f133594e;

    /* renamed from: f */
    public C89349b f133595f;

    /* renamed from: g */
    public int f133596g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49447fn0)) {
            return false;
        }
        C49447fn0 fn02 = (C49447fn0) aVar;
        return C46238a.m51546a(this.BaseResponse, fn02.BaseResponse) && C46238a.m51546a(this.f133593d, fn02.f133593d) && C46238a.m51546a(Integer.valueOf(this.f133594e), Integer.valueOf(fn02.f133594e)) && C46238a.m51546a(this.f133595f, fn02.f133595f) && C46238a.m51546a(Integer.valueOf(this.f133596g), Integer.valueOf(fn02.f133596g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f133593d);
            aVar.mo74318e(3, this.f133594e);
            C89349b bVar = this.f133595f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f133596g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f133593d) + C52418a.m58678e(3, this.f133594e);
            C89349b bVar2 = this.f133595f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            return g + C52418a.m58678e(5, this.f133596g);
        } else if (i == 2) {
            this.f133593d.clear();
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
            C49447fn0 fn02 = objArr[1];
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
                    fn02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51270sn1 sn12 = new C51270sn1();
                    if (bArr2 != null && bArr2.length > 0) {
                        sn12.parseFrom(bArr2);
                    }
                    fn02.f133593d.add(sn12);
                }
                return 0;
            } else if (intValue == 3) {
                fn02.f133594e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                fn02.f133595f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fn02.f133596g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
