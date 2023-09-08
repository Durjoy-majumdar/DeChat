package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dd1 */
public class C49128dd1 extends C101820nt3 {

    /* renamed from: d */
    public int f132248d;

    /* renamed from: e */
    public String f132249e;

    /* renamed from: f */
    public LinkedList<Long> f132250f = new LinkedList<>();

    /* renamed from: g */
    public C49842ig0 f132251g;

    /* renamed from: h */
    public LinkedList<C51895wy2> f132252h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49128dd1)) {
            return false;
        }
        C49128dd1 dd12 = (C49128dd1) aVar;
        return C46238a.m51546a(this.BaseRequest, dd12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132248d), Integer.valueOf(dd12.f132248d)) && C46238a.m51546a(this.f132249e, dd12.f132249e) && C46238a.m51546a(this.f132250f, dd12.f132250f) && C46238a.m51546a(this.f132251g, dd12.f132251g) && C46238a.m51546a(this.f132252h, dd12.f132252h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f132248d);
            String str = this.f132249e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 3, this.f132250f);
            C49842ig0 ig02 = this.f132251g;
            if (ig02 != null) {
                aVar.mo74322i(5, ig02.computeSize());
                this.f132251g.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f132252h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132248d);
            String str2 = this.f132249e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int g = e + C52418a.m58680g(4, 3, this.f132250f);
            C49842ig0 ig03 = this.f132251g;
            if (ig03 != null) {
                g += C52418a.m58682i(5, ig03.computeSize());
            }
            return g + C52418a.m58680g(6, 8, this.f132252h);
        } else if (i == 2) {
            this.f132250f.clear();
            this.f132252h.clear();
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
            C49128dd1 dd12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        dd12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dd12.f132248d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dd12.f132249e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dd12.f132250f.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        dd12.f132251g = ig04;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51895wy2 wy22 = new C51895wy2();
                        if (bArr3 != null && bArr3.length > 0) {
                            wy22.parseFrom(bArr3);
                        }
                        dd12.f132252h.add(wy22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
