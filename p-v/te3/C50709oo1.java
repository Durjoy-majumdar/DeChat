package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oo1 */
public class C50709oo1 extends C49335eu3 {

    /* renamed from: d */
    public FinderContact f139277d;

    /* renamed from: e */
    public int f139278e;

    /* renamed from: f */
    public LinkedList<FinderObject> f139279f = new LinkedList<>();

    /* renamed from: g */
    public int f139280g;

    /* renamed from: h */
    public int f139281h;

    /* renamed from: i */
    public C51129rn0 f139282i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50709oo1)) {
            return false;
        }
        C50709oo1 oo12 = (C50709oo1) aVar;
        return C46238a.m51546a(this.BaseResponse, oo12.BaseResponse) && C46238a.m51546a(this.f139277d, oo12.f139277d) && C46238a.m51546a(Integer.valueOf(this.f139278e), Integer.valueOf(oo12.f139278e)) && C46238a.m51546a(this.f139279f, oo12.f139279f) && C46238a.m51546a(Integer.valueOf(this.f139280g), Integer.valueOf(oo12.f139280g)) && C46238a.m51546a(Integer.valueOf(this.f139281h), Integer.valueOf(oo12.f139281h)) && C46238a.m51546a(this.f139282i, oo12.f139282i);
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
            FinderContact finderContact = this.f139277d;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f139277d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139278e);
            aVar.mo74320g(4, 8, this.f139279f);
            aVar.mo74318e(5, this.f139280g);
            aVar.mo74318e(6, this.f139281h);
            C51129rn0 rn02 = this.f139282i;
            if (rn02 != null) {
                aVar.mo74322i(7, rn02.computeSize());
                this.f139282i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            FinderContact finderContact2 = this.f139277d;
            if (finderContact2 != null) {
                i2 += C52418a.m58682i(2, finderContact2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f139278e) + C52418a.m58680g(4, 8, this.f139279f) + C52418a.m58678e(5, this.f139280g) + C52418a.m58678e(6, this.f139281h);
            C51129rn0 rn03 = this.f139282i;
            return rn03 != null ? e + C52418a.m58682i(7, rn03.computeSize()) : e;
        } else if (i == 2) {
            this.f139279f.clear();
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
            C50709oo1 oo12 = objArr[1];
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
                        oo12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderContact3.parseFrom(bArr2);
                        }
                        oo12.f139277d = finderContact3;
                    }
                    return 0;
                case 3:
                    oo12.f139278e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObject.parseFrom(bArr3);
                        }
                        oo12.f139279f.add(finderObject);
                    }
                    return 0;
                case 5:
                    oo12.f139280g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    oo12.f139281h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51129rn0 rn04 = new C51129rn0();
                        if (bArr4 != null && bArr4.length > 0) {
                            rn04.parseFrom(bArr4);
                        }
                        oo12.f139282i = rn04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
