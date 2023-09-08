package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rn0 */
public class C51129rn0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f141036d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f141037e;

    /* renamed from: f */
    public int f141038f;

    /* renamed from: g */
    public int f141039g;

    /* renamed from: h */
    public String f141040h;

    /* renamed from: i */
    public int f141041i;

    /* renamed from: j */
    public int f141042j;

    /* renamed from: n */
    public C51974xh1 f141043n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51129rn0)) {
            return false;
        }
        C51129rn0 rn02 = (C51129rn0) aVar;
        return C46238a.m51546a(this.BaseResponse, rn02.BaseResponse) && C46238a.m51546a(this.f141036d, rn02.f141036d) && C46238a.m51546a(this.f141037e, rn02.f141037e) && C46238a.m51546a(Integer.valueOf(this.f141038f), Integer.valueOf(rn02.f141038f)) && C46238a.m51546a(Integer.valueOf(this.f141039g), Integer.valueOf(rn02.f141039g)) && C46238a.m51546a(this.f141040h, rn02.f141040h) && C46238a.m51546a(Integer.valueOf(this.f141041i), Integer.valueOf(rn02.f141041i)) && C46238a.m51546a(Integer.valueOf(this.f141042j), Integer.valueOf(rn02.f141042j)) && C46238a.m51546a(this.f141043n, rn02.f141043n);
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
                aVar.mo74320g(2, 8, this.f141036d);
                C89349b bVar = this.f141037e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f141038f);
                aVar.mo74318e(5, this.f141039g);
                String str = this.f141040h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                aVar.mo74318e(7, this.f141041i);
                aVar.mo74318e(8, this.f141042j);
                C51974xh1 xh12 = this.f141043n;
                if (xh12 != null) {
                    aVar.mo74322i(9, xh12.computeSize());
                    this.f141043n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f141036d);
            C89349b bVar2 = this.f141037e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f141038f) + C52418a.m58678e(5, this.f141039g);
            String str2 = this.f141040h;
            if (str2 != null) {
                e += C52418a.m58683j(6, str2);
            }
            int e2 = e + C52418a.m58678e(7, this.f141041i) + C52418a.m58678e(8, this.f141042j);
            C51974xh1 xh13 = this.f141043n;
            return xh13 != null ? e2 + C52418a.m58682i(9, xh13.computeSize()) : e2;
        } else if (i == 2) {
            this.f141036d.clear();
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
            C51129rn0 rn02 = objArr[1];
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
                        rn02.BaseResponse = jaVar3;
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
                        rn02.f141036d.add(finderObject);
                    }
                    return 0;
                case 3:
                    rn02.f141037e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    rn02.f141038f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rn02.f141039g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rn02.f141040h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rn02.f141041i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rn02.f141042j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh14.parseFrom(bArr3);
                        }
                        rn02.f141043n = xh14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
