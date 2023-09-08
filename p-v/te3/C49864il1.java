package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.il1 */
public class C49864il1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f135463d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f135464e;

    /* renamed from: f */
    public int f135465f;

    /* renamed from: g */
    public C49576gl1 f135466g;

    /* renamed from: h */
    public LinkedList<C49439fl1> f135467h = new LinkedList<>();

    /* renamed from: i */
    public boolean f135468i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49864il1)) {
            return false;
        }
        C49864il1 il12 = (C49864il1) aVar;
        return C46238a.m51546a(this.BaseResponse, il12.BaseResponse) && C46238a.m51546a(this.f135463d, il12.f135463d) && C46238a.m51546a(this.f135464e, il12.f135464e) && C46238a.m51546a(Integer.valueOf(this.f135465f), Integer.valueOf(il12.f135465f)) && C46238a.m51546a(this.f135466g, il12.f135466g) && C46238a.m51546a(this.f135467h, il12.f135467h) && C46238a.m51546a(Boolean.valueOf(this.f135468i), Boolean.valueOf(il12.f135468i));
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
            aVar.mo74320g(2, 8, this.f135463d);
            C89349b bVar = this.f135464e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f135465f);
            C49576gl1 gl12 = this.f135466g;
            if (gl12 != null) {
                aVar.mo74322i(5, gl12.computeSize());
                this.f135466g.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f135467h);
            aVar.mo74314a(7, this.f135468i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f135463d);
            C89349b bVar2 = this.f135464e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f135465f);
            C49576gl1 gl13 = this.f135466g;
            if (gl13 != null) {
                e += C52418a.m58682i(5, gl13.computeSize());
            }
            return e + C52418a.m58680g(6, 8, this.f135467h) + C52418a.m58674a(7, this.f135468i);
        } else if (i == 2) {
            this.f135463d.clear();
            this.f135467h.clear();
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
            C49864il1 il12 = objArr[1];
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
                        il12.BaseResponse = jaVar3;
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
                        il12.f135463d.add(finderObject);
                    }
                    return 0;
                case 3:
                    il12.f135464e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    il12.f135465f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49576gl1 gl14 = new C49576gl1();
                        if (bArr3 != null && bArr3.length > 0) {
                            gl14.parseFrom(bArr3);
                        }
                        il12.f135466g = gl14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49439fl1 fl12 = new C49439fl1();
                        if (bArr4 != null && bArr4.length > 0) {
                            fl12.parseFrom(bArr4);
                        }
                        il12.f135467h.add(fl12);
                    }
                    return 0;
                case 7:
                    il12.f135468i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
