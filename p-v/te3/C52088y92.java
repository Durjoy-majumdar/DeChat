package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y92 */
public class C52088y92 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<pr4> f145188d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f145189e;

    /* renamed from: f */
    public LinkedList<C50988qo> f145190f = new LinkedList<>();

    /* renamed from: g */
    public int f145191g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52088y92)) {
            return false;
        }
        C52088y92 y922 = (C52088y92) aVar;
        return C46238a.m51546a(this.BaseResponse, y922.BaseResponse) && C46238a.m51546a(this.f145188d, y922.f145188d) && C46238a.m51546a(this.f145189e, y922.f145189e) && C46238a.m51546a(this.f145190f, y922.f145190f) && C46238a.m51546a(Integer.valueOf(this.f145191g), Integer.valueOf(y922.f145191g));
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
            aVar.mo74320g(2, 8, this.f145188d);
            C89349b bVar = this.f145189e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74320g(4, 8, this.f145190f);
            aVar.mo74318e(5, this.f145191g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f145188d);
            C89349b bVar2 = this.f145189e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58680g(4, 8, this.f145190f) + C52418a.m58678e(5, this.f145191g);
        } else if (i == 2) {
            this.f145188d.clear();
            this.f145190f.clear();
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
            C52088y92 y922 = objArr[1];
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
                    y922.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    pr4 pr4 = new pr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        pr4.parseFrom(bArr2);
                    }
                    y922.f145188d.add(pr4);
                }
                return 0;
            } else if (intValue == 3) {
                y922.f145189e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50988qo qoVar = new C50988qo();
                    if (bArr3 != null && bArr3.length > 0) {
                        qoVar.parseFrom(bArr3);
                    }
                    y922.f145190f.add(qoVar);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                y922.f145191g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
