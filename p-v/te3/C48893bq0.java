package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bq0 */
public class C48893bq0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderContact> f131256d = new LinkedList<>();

    /* renamed from: e */
    public C52274zj3 f131257e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48893bq0)) {
            return false;
        }
        C48893bq0 bq02 = (C48893bq0) aVar;
        return C46238a.m51546a(this.BaseResponse, bq02.BaseResponse) && C46238a.m51546a(this.f131256d, bq02.f131256d) && C46238a.m51546a(this.f131257e, bq02.f131257e);
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
            aVar.mo74320g(2, 8, this.f131256d);
            C52274zj3 zj32 = this.f131257e;
            if (zj32 != null) {
                aVar.mo74322i(3, zj32.computeSize());
                this.f131257e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f131256d);
            C52274zj3 zj33 = this.f131257e;
            return zj33 != null ? g + C52418a.m58682i(3, zj33.computeSize()) : g;
        } else if (i == 2) {
            this.f131256d.clear();
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
            C48893bq0 bq02 = objArr[1];
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
                    bq02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact.parseFrom(bArr2);
                    }
                    bq02.f131256d.add(finderContact);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52274zj3 zj34 = new C52274zj3();
                    if (bArr3 != null && bArr3.length > 0) {
                        zj34.parseFrom(bArr3);
                    }
                    bq02.f131257e = zj34;
                }
                return 0;
            }
        }
    }
}
