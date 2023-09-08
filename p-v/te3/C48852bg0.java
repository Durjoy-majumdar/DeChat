package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bg0 */
public class C48852bg0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f131093d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f131094e;

    /* renamed from: f */
    public int f131095f;

    /* renamed from: g */
    public int f131096g;

    /* renamed from: h */
    public C51974xh1 f131097h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48852bg0)) {
            return false;
        }
        C48852bg0 bg02 = (C48852bg0) aVar;
        return C46238a.m51546a(this.BaseResponse, bg02.BaseResponse) && C46238a.m51546a(this.f131093d, bg02.f131093d) && C46238a.m51546a(this.f131094e, bg02.f131094e) && C46238a.m51546a(Integer.valueOf(this.f131095f), Integer.valueOf(bg02.f131095f)) && C46238a.m51546a(Integer.valueOf(this.f131096g), Integer.valueOf(bg02.f131096g)) && C46238a.m51546a(this.f131097h, bg02.f131097h);
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
            aVar.mo74320g(2, 8, this.f131093d);
            C89349b bVar = this.f131094e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f131095f);
            aVar.mo74318e(5, this.f131096g);
            C51974xh1 xh12 = this.f131097h;
            if (xh12 != null) {
                aVar.mo74322i(6, xh12.computeSize());
                this.f131097h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f131093d);
            C89349b bVar2 = this.f131094e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f131095f) + C52418a.m58678e(5, this.f131096g);
            C51974xh1 xh13 = this.f131097h;
            return xh13 != null ? e + C52418a.m58682i(6, xh13.computeSize()) : e;
        } else if (i == 2) {
            this.f131093d.clear();
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
            C48852bg0 bg02 = objArr[1];
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
                        bg02.BaseResponse = jaVar3;
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
                        bg02.f131093d.add(finderObject);
                    }
                    return 0;
                case 3:
                    bg02.f131094e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    bg02.f131095f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bg02.f131096g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh14.parseFrom(bArr3);
                        }
                        bg02.f131097h = xh14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
