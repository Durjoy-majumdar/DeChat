package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m72 */
public class C64546m72 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C22508lo3> f184214d = new LinkedList<>();

    /* renamed from: e */
    public C64614oo3 f184215e;

    /* renamed from: f */
    public String f184216f;

    /* renamed from: g */
    public C89349b f184217g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64546m72)) {
            return false;
        }
        C64546m72 m722 = (C64546m72) aVar;
        return C46238a.m51546a(this.BaseResponse, m722.BaseResponse) && C46238a.m51546a(this.f184214d, m722.f184214d) && C46238a.m51546a(this.f184215e, m722.f184215e) && C46238a.m51546a(this.f184216f, m722.f184216f) && C46238a.m51546a(this.f184217g, m722.f184217g);
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
                aVar.mo74320g(2, 8, this.f184214d);
                C64614oo3 oo32 = this.f184215e;
                if (oo32 != null) {
                    aVar.mo74322i(3, oo32.computeSize());
                    this.f184215e.writeFields(aVar);
                }
                String str = this.f184216f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C89349b bVar = this.f184217g;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f184214d);
            C64614oo3 oo33 = this.f184215e;
            if (oo33 != null) {
                g += C52418a.m58682i(3, oo33.computeSize());
            }
            String str2 = this.f184216f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            C89349b bVar2 = this.f184217g;
            return bVar2 != null ? g + C52418a.m58675b(5, bVar2) : g;
        } else if (i == 2) {
            this.f184214d.clear();
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
            C64546m72 m722 = objArr[1];
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
                    m722.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C22508lo3 lo32 = new C22508lo3();
                    if (bArr2 != null && bArr2.length > 0) {
                        lo32.parseFrom(bArr2);
                    }
                    m722.f184214d.add(lo32);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64614oo3 oo34 = new C64614oo3();
                    if (bArr3 != null && bArr3.length > 0) {
                        oo34.parseFrom(bArr3);
                    }
                    m722.f184215e = oo34;
                }
                return 0;
            } else if (intValue == 4) {
                m722.f184216f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m722.f184217g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
