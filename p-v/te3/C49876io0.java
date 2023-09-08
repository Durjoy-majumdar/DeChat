package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.io0 */
public class C49876io0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f135529d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f135530e;

    /* renamed from: f */
    public int f135531f;

    /* renamed from: g */
    public C50497n51 f135532g;

    /* renamed from: h */
    public int f135533h;

    /* renamed from: i */
    public C51942x91 f135534i;

    /* renamed from: j */
    public boolean f135535j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49876io0)) {
            return false;
        }
        C49876io0 io02 = (C49876io0) aVar;
        return C46238a.m51546a(this.BaseResponse, io02.BaseResponse) && C46238a.m51546a(this.f135529d, io02.f135529d) && C46238a.m51546a(this.f135530e, io02.f135530e) && C46238a.m51546a(Integer.valueOf(this.f135531f), Integer.valueOf(io02.f135531f)) && C46238a.m51546a(this.f135532g, io02.f135532g) && C46238a.m51546a(Integer.valueOf(this.f135533h), Integer.valueOf(io02.f135533h)) && C46238a.m51546a(this.f135534i, io02.f135534i) && C46238a.m51546a(Boolean.valueOf(this.f135535j), Boolean.valueOf(io02.f135535j));
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
            aVar.mo74320g(2, 8, this.f135529d);
            C89349b bVar = this.f135530e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f135531f);
            C50497n51 n512 = this.f135532g;
            if (n512 != null) {
                aVar.mo74322i(5, n512.computeSize());
                this.f135532g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f135533h);
            C51942x91 x912 = this.f135534i;
            if (x912 != null) {
                aVar.mo74322i(7, x912.computeSize());
                this.f135534i.writeFields(aVar);
            }
            aVar.mo74314a(8, this.f135535j);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f135529d);
            C89349b bVar2 = this.f135530e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f135531f);
            C50497n51 n513 = this.f135532g;
            if (n513 != null) {
                e += C52418a.m58682i(5, n513.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f135533h);
            C51942x91 x913 = this.f135534i;
            if (x913 != null) {
                e2 += C52418a.m58682i(7, x913.computeSize());
            }
            return e2 + C52418a.m58674a(8, this.f135535j);
        } else if (i == 2) {
            this.f135529d.clear();
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
            C49876io0 io02 = objArr[1];
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
                        io02.BaseResponse = jaVar3;
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
                        io02.f135529d.add(finderObject);
                    }
                    return 0;
                case 3:
                    io02.f135530e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    io02.f135531f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50497n51 n514 = new C50497n51();
                        if (bArr3 != null && bArr3.length > 0) {
                            n514.parseFrom(bArr3);
                        }
                        io02.f135532g = n514;
                    }
                    return 0;
                case 6:
                    io02.f135533h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51942x91 x914 = new C51942x91();
                        if (bArr4 != null && bArr4.length > 0) {
                            x914.parseFrom(bArr4);
                        }
                        io02.f135534i = x914;
                    }
                    return 0;
                case 8:
                    io02.f135535j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
