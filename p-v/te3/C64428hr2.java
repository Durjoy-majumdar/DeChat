package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hr2 */
public class C64428hr2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64452ir2> f183544d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64452ir2> f183545e = new LinkedList<>();

    /* renamed from: f */
    public C64452ir2 f183546f;

    /* renamed from: g */
    public int f183547g;

    /* renamed from: h */
    public int f183548h;

    /* renamed from: i */
    public long f183549i;

    /* renamed from: j */
    public String f183550j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64428hr2)) {
            return false;
        }
        C64428hr2 hr22 = (C64428hr2) aVar;
        return C46238a.m51546a(this.f183544d, hr22.f183544d) && C46238a.m51546a(this.f183545e, hr22.f183545e) && C46238a.m51546a(this.f183546f, hr22.f183546f) && C46238a.m51546a(Integer.valueOf(this.f183547g), Integer.valueOf(hr22.f183547g)) && C46238a.m51546a(Integer.valueOf(this.f183548h), Integer.valueOf(hr22.f183548h)) && C46238a.m51546a(Long.valueOf(this.f183549i), Long.valueOf(hr22.f183549i)) && C46238a.m51546a(this.f183550j, hr22.f183550j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f183544d);
            aVar.mo74320g(2, 8, this.f183545e);
            C64452ir2 ir22 = this.f183546f;
            if (ir22 != null) {
                aVar.mo74322i(3, ir22.computeSize());
                this.f183546f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f183547g);
            aVar.mo74318e(5, this.f183548h);
            aVar.mo74321h(6, this.f183549i);
            String str = this.f183550j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f183544d) + 0 + C52418a.m58680g(2, 8, this.f183545e);
            C64452ir2 ir23 = this.f183546f;
            if (ir23 != null) {
                g += C52418a.m58682i(3, ir23.computeSize());
            }
            int e = g + C52418a.m58678e(4, this.f183547g) + C52418a.m58678e(5, this.f183548h) + C52418a.m58681h(6, this.f183549i);
            String str2 = this.f183550j;
            return str2 != null ? e + C52418a.m58683j(7, str2) : e;
        } else if (i == 2) {
            this.f183544d.clear();
            this.f183545e.clear();
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
            C64428hr2 hr22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64452ir2 ir24 = new C64452ir2();
                        if (bArr != null && bArr.length > 0) {
                            ir24.parseFrom(bArr);
                        }
                        hr22.f183544d.add(ir24);
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64452ir2 ir25 = new C64452ir2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ir25.parseFrom(bArr2);
                        }
                        hr22.f183545e.add(ir25);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64452ir2 ir26 = new C64452ir2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ir26.parseFrom(bArr3);
                        }
                        hr22.f183546f = ir26;
                    }
                    return 0;
                case 4:
                    hr22.f183547g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hr22.f183548h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hr22.f183549i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    hr22.f183550j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
