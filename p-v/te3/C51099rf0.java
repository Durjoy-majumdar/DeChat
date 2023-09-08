package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rf0 */
public class C51099rf0 extends C49335eu3 {

    /* renamed from: d */
    public FinderContact f140875d;

    /* renamed from: e */
    public String f140876e;

    /* renamed from: f */
    public String f140877f;

    /* renamed from: g */
    public C49965j93 f140878g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51099rf0)) {
            return false;
        }
        C51099rf0 rf02 = (C51099rf0) aVar;
        return C46238a.m51546a(this.BaseResponse, rf02.BaseResponse) && C46238a.m51546a(this.f140875d, rf02.f140875d) && C46238a.m51546a(this.f140876e, rf02.f140876e) && C46238a.m51546a(this.f140877f, rf02.f140877f) && C46238a.m51546a(this.f140878g, rf02.f140878g);
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
            FinderContact finderContact = this.f140875d;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f140875d.writeFields(aVar);
            }
            String str = this.f140876e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140877f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C49965j93 j932 = this.f140878g;
            if (j932 != null) {
                aVar.mo74322i(5, j932.computeSize());
                this.f140878g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            FinderContact finderContact2 = this.f140875d;
            if (finderContact2 != null) {
                i2 += C52418a.m58682i(2, finderContact2.computeSize());
            }
            String str3 = this.f140876e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140877f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C49965j93 j933 = this.f140878g;
            return j933 != null ? i2 + C52418a.m58682i(5, j933.computeSize()) : i2;
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
            C51099rf0 rf02 = objArr[1];
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
                    rf02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact3.parseFrom(bArr2);
                    }
                    rf02.f140875d = finderContact3;
                }
                return 0;
            } else if (intValue == 3) {
                rf02.f140876e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                rf02.f140877f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49965j93 j934 = new C49965j93();
                    if (bArr3 != null && bArr3.length > 0) {
                        j934.parseFrom(bArr3);
                    }
                    rf02.f140878g = j934;
                }
                return 0;
            }
        }
    }
}
