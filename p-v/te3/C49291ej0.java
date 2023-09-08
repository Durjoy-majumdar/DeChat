package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ej0 */
public class C49291ej0 extends C49335eu3 {

    /* renamed from: d */
    public FinderObject f132950d;

    /* renamed from: e */
    public String f132951e;

    /* renamed from: f */
    public C48779ay0 f132952f;

    /* renamed from: g */
    public C52158yr0 f132953g;

    /* renamed from: h */
    public long f132954h;

    /* renamed from: i */
    public C49430fj0 f132955i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49291ej0)) {
            return false;
        }
        C49291ej0 ej02 = (C49291ej0) aVar;
        return C46238a.m51546a(this.BaseResponse, ej02.BaseResponse) && C46238a.m51546a(this.f132950d, ej02.f132950d) && C46238a.m51546a(this.f132951e, ej02.f132951e) && C46238a.m51546a(this.f132952f, ej02.f132952f) && C46238a.m51546a(this.f132953g, ej02.f132953g) && C46238a.m51546a(Long.valueOf(this.f132954h), Long.valueOf(ej02.f132954h)) && C46238a.m51546a(this.f132955i, ej02.f132955i);
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
            FinderObject finderObject = this.f132950d;
            if (finderObject != null) {
                aVar.mo74322i(2, finderObject.computeSize());
                this.f132950d.writeFields(aVar);
            }
            String str = this.f132951e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C48779ay0 ay02 = this.f132952f;
            if (ay02 != null) {
                aVar.mo74322i(4, ay02.computeSize());
                this.f132952f.writeFields(aVar);
            }
            C52158yr0 yr02 = this.f132953g;
            if (yr02 != null) {
                aVar.mo74322i(5, yr02.computeSize());
                this.f132953g.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f132954h);
            C49430fj0 fj02 = this.f132955i;
            if (fj02 != null) {
                aVar.mo74322i(7, fj02.computeSize());
                this.f132955i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            FinderObject finderObject2 = this.f132950d;
            if (finderObject2 != null) {
                i2 += C52418a.m58682i(2, finderObject2.computeSize());
            }
            String str2 = this.f132951e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C48779ay0 ay03 = this.f132952f;
            if (ay03 != null) {
                i2 += C52418a.m58682i(4, ay03.computeSize());
            }
            C52158yr0 yr03 = this.f132953g;
            if (yr03 != null) {
                i2 += C52418a.m58682i(5, yr03.computeSize());
            }
            int h = i2 + C52418a.m58681h(6, this.f132954h);
            C49430fj0 fj03 = this.f132955i;
            return fj03 != null ? h + C52418a.m58682i(7, fj03.computeSize()) : h;
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
            C49291ej0 ej02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ej02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject3.parseFrom(bArr2);
                        }
                        ej02.f132950d = finderObject3;
                    }
                    return 0;
                case 3:
                    ej02.f132951e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48779ay0 ay04 = new C48779ay0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ay04.parseFrom(bArr3);
                        }
                        ej02.f132952f = ay04;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C52158yr0 yr04 = new C52158yr0();
                        if (bArr4 != null && bArr4.length > 0) {
                            yr04.parseFrom(bArr4);
                        }
                        ej02.f132953g = yr04;
                    }
                    return 0;
                case 6:
                    ej02.f132954h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49430fj0 fj04 = new C49430fj0();
                        if (bArr5 != null && bArr5.length > 0) {
                            fj04.parseFrom(bArr5);
                        }
                        ej02.f132955i = fj04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
