package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k01 */
public class C50060k01 extends C49335eu3 {

    /* renamed from: d */
    public C49538gb1 f136491d;

    /* renamed from: e */
    public C89349b f136492e;

    /* renamed from: f */
    public int f136493f;

    /* renamed from: g */
    public long f136494g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50060k01)) {
            return false;
        }
        C50060k01 k012 = (C50060k01) aVar;
        return C46238a.m51546a(this.BaseResponse, k012.BaseResponse) && C46238a.m51546a(this.f136491d, k012.f136491d) && C46238a.m51546a(this.f136492e, k012.f136492e) && C46238a.m51546a(Integer.valueOf(this.f136493f), Integer.valueOf(k012.f136493f)) && C46238a.m51546a(Long.valueOf(this.f136494g), Long.valueOf(k012.f136494g));
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
            C49538gb1 gb12 = this.f136491d;
            if (gb12 != null) {
                aVar.mo74322i(2, gb12.computeSize());
                this.f136491d.writeFields(aVar);
            }
            C89349b bVar = this.f136492e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f136493f);
            aVar.mo74321h(5, this.f136494g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49538gb1 gb13 = this.f136491d;
            if (gb13 != null) {
                i2 += C52418a.m58682i(2, gb13.computeSize());
            }
            C89349b bVar2 = this.f136492e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            return i2 + C52418a.m58678e(4, this.f136493f) + C52418a.m58681h(5, this.f136494g);
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
            C50060k01 k012 = objArr[1];
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
                    k012.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49538gb1 gb14 = new C49538gb1();
                    if (bArr2 != null && bArr2.length > 0) {
                        gb14.parseFrom(bArr2);
                    }
                    k012.f136491d = gb14;
                }
                return 0;
            } else if (intValue == 3) {
                k012.f136492e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                k012.f136493f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                k012.f136494g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
