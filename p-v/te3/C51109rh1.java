package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rh1 */
public class C51109rh1 extends C49335eu3 {

    /* renamed from: d */
    public FinderObject f140926d;

    /* renamed from: e */
    public FinderContact f140927e;

    /* renamed from: f */
    public String f140928f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51109rh1)) {
            return false;
        }
        C51109rh1 rh12 = (C51109rh1) aVar;
        return C46238a.m51546a(this.BaseResponse, rh12.BaseResponse) && C46238a.m51546a(this.f140926d, rh12.f140926d) && C46238a.m51546a(this.f140927e, rh12.f140927e) && C46238a.m51546a(this.f140928f, rh12.f140928f);
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
                FinderObject finderObject = this.f140926d;
                if (finderObject != null) {
                    aVar.mo74322i(2, finderObject.computeSize());
                    this.f140926d.writeFields(aVar);
                }
                FinderContact finderContact = this.f140927e;
                if (finderContact != null) {
                    aVar.mo74322i(3, finderContact.computeSize());
                    this.f140927e.writeFields(aVar);
                }
                String str = this.f140928f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            FinderObject finderObject2 = this.f140926d;
            if (finderObject2 != null) {
                i2 += C52418a.m58682i(2, finderObject2.computeSize());
            }
            FinderContact finderContact2 = this.f140927e;
            if (finderContact2 != null) {
                i2 += C52418a.m58682i(3, finderContact2.computeSize());
            }
            String str2 = this.f140928f;
            return str2 != null ? i2 + C52418a.m58683j(4, str2) : i2;
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
            C51109rh1 rh12 = objArr[1];
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
                    rh12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject3.parseFrom(bArr2);
                    }
                    rh12.f140926d = finderObject3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderContact3.parseFrom(bArr3);
                    }
                    rh12.f140927e = finderContact3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rh12.f140928f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
