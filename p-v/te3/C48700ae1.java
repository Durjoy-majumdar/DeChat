package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ae1 */
public class C48700ae1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f130466d = new LinkedList<>();

    /* renamed from: e */
    public FinderContact f130467e;

    /* renamed from: f */
    public int f130468f;

    /* renamed from: g */
    public C89349b f130469g;

    /* renamed from: h */
    public C51974xh1 f130470h;

    /* renamed from: i */
    public int f130471i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48700ae1)) {
            return false;
        }
        C48700ae1 ae12 = (C48700ae1) aVar;
        return C46238a.m51546a(this.BaseResponse, ae12.BaseResponse) && C46238a.m51546a(this.f130466d, ae12.f130466d) && C46238a.m51546a(this.f130467e, ae12.f130467e) && C46238a.m51546a(Integer.valueOf(this.f130468f), Integer.valueOf(ae12.f130468f)) && C46238a.m51546a(this.f130469g, ae12.f130469g) && C46238a.m51546a(this.f130470h, ae12.f130470h) && C46238a.m51546a(Integer.valueOf(this.f130471i), Integer.valueOf(ae12.f130471i));
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
                aVar.mo74320g(2, 8, this.f130466d);
                FinderContact finderContact = this.f130467e;
                if (finderContact != null) {
                    aVar.mo74322i(3, finderContact.computeSize());
                    this.f130467e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f130468f);
                C89349b bVar = this.f130469g;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                C51974xh1 xh12 = this.f130470h;
                if (xh12 != null) {
                    aVar.mo74322i(6, xh12.computeSize());
                    this.f130470h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f130471i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f130466d);
            FinderContact finderContact2 = this.f130467e;
            if (finderContact2 != null) {
                g += C52418a.m58682i(3, finderContact2.computeSize());
            }
            int e = g + C52418a.m58678e(4, this.f130468f);
            C89349b bVar2 = this.f130469g;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            C51974xh1 xh13 = this.f130470h;
            if (xh13 != null) {
                e += C52418a.m58682i(6, xh13.computeSize());
            }
            return e + C52418a.m58678e(7, this.f130471i);
        } else if (i == 2) {
            this.f130466d.clear();
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
            C48700ae1 ae12 = objArr[1];
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
                        ae12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        ae12.f130466d.add(finderObject);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderContact3.parseFrom(bArr3);
                        }
                        ae12.f130467e = finderContact3;
                    }
                    return 0;
                case 4:
                    ae12.f130468f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ae12.f130469g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr4 != null && bArr4.length > 0) {
                            xh14.parseFrom(bArr4);
                        }
                        ae12.f130470h = xh14;
                    }
                    return 0;
                case 7:
                    ae12.f130471i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
