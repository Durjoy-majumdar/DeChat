package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vv1 */
public class C101859vv1 extends C49335eu3 {

    /* renamed from: d */
    public long f299684d;

    /* renamed from: e */
    public C89349b f299685e;

    /* renamed from: f */
    public C49510g33 f299686f;

    /* renamed from: g */
    public C101827pd f299687g;

    /* renamed from: h */
    public C89349b f299688h;

    /* renamed from: i */
    public float f299689i = 0.5f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101859vv1)) {
            return false;
        }
        C101859vv1 vv12 = (C101859vv1) aVar;
        return C46238a.m51546a(this.BaseResponse, vv12.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f299684d), Long.valueOf(vv12.f299684d)) && C46238a.m51546a(this.f299685e, vv12.f299685e) && C46238a.m51546a(this.f299686f, vv12.f299686f) && C46238a.m51546a(this.f299687g, vv12.f299687g) && C46238a.m51546a(this.f299688h, vv12.f299688h) && C46238a.m51546a(Float.valueOf(this.f299689i), Float.valueOf(vv12.f299689i));
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
                aVar.mo74321h(2, this.f299684d);
                C89349b bVar = this.f299685e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                C49510g33 g332 = this.f299686f;
                if (g332 != null) {
                    aVar.mo74322i(4, g332.computeSize());
                    this.f299686f.writeFields(aVar);
                }
                C101827pd pdVar = this.f299687g;
                if (pdVar != null) {
                    aVar.mo74322i(5, pdVar.computeSize());
                    this.f299687g.writeFields(aVar);
                }
                C89349b bVar2 = this.f299688h;
                if (bVar2 != null) {
                    aVar.mo74315b(6, bVar2);
                }
                aVar.mo74317d(7, this.f299689i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f299684d);
            C89349b bVar3 = this.f299685e;
            if (bVar3 != null) {
                h += C52418a.m58675b(3, bVar3);
            }
            C49510g33 g333 = this.f299686f;
            if (g333 != null) {
                h += C52418a.m58682i(4, g333.computeSize());
            }
            C101827pd pdVar2 = this.f299687g;
            if (pdVar2 != null) {
                h += C52418a.m58682i(5, pdVar2.computeSize());
            }
            C89349b bVar4 = this.f299688h;
            if (bVar4 != null) {
                h += C52418a.m58675b(6, bVar4);
            }
            return h + C52418a.m58677d(7, this.f299689i);
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
            C101859vv1 vv12 = objArr[1];
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
                        vv12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    vv12.f299684d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    vv12.f299685e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49510g33 g334 = new C49510g33();
                        if (bArr2 != null && bArr2.length > 0) {
                            g334.parseFrom(bArr2);
                        }
                        vv12.f299686f = g334;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101827pd pdVar3 = new C101827pd();
                        if (bArr3 != null && bArr3.length > 0) {
                            pdVar3.parseFrom(bArr3);
                        }
                        vv12.f299687g = pdVar3;
                    }
                    return 0;
                case 6:
                    vv12.f299688h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    vv12.f299689i = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
