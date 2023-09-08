package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qy3 */
public class C51031qy3 extends C49335eu3 {

    /* renamed from: d */
    public ko4 f140616d;

    /* renamed from: e */
    public LinkedList<io4> f140617e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f140618f;

    /* renamed from: g */
    public int f140619g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51031qy3)) {
            return false;
        }
        C51031qy3 qy32 = (C51031qy3) aVar;
        return C46238a.m51546a(this.BaseResponse, qy32.BaseResponse) && C46238a.m51546a(this.f140616d, qy32.f140616d) && C46238a.m51546a(this.f140617e, qy32.f140617e) && C46238a.m51546a(this.f140618f, qy32.f140618f) && C46238a.m51546a(Integer.valueOf(this.f140619g), Integer.valueOf(qy32.f140619g));
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
                ko4 ko4 = this.f140616d;
                if (ko4 != null) {
                    aVar.mo74322i(2, ko4.computeSize());
                    this.f140616d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f140617e);
                C89349b bVar = this.f140618f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74318e(5, this.f140619g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            ko4 ko42 = this.f140616d;
            if (ko42 != null) {
                i2 += C52418a.m58682i(2, ko42.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f140617e);
            C89349b bVar2 = this.f140618f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            return g + C52418a.m58678e(5, this.f140619g);
        } else if (i == 2) {
            this.f140617e.clear();
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
            C51031qy3 qy32 = objArr[1];
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
                    qy32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ko4 ko43 = new ko4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ko43.parseFrom(bArr2);
                    }
                    qy32.f140616d = ko43;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    io4 io4 = new io4();
                    if (bArr3 != null && bArr3.length > 0) {
                        io4.parseFrom(bArr3);
                    }
                    qy32.f140617e.add(io4);
                }
                return 0;
            } else if (intValue == 4) {
                qy32.f140618f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                qy32.f140619g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
