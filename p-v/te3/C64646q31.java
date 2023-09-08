package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q31 */
public class C64646q31 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64538lx2> f184942d = new LinkedList<>();

    /* renamed from: e */
    public String f184943e;

    /* renamed from: f */
    public long f184944f;

    /* renamed from: g */
    public long f184945g;

    /* renamed from: h */
    public String f184946h;

    /* renamed from: i */
    public String f184947i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64646q31)) {
            return false;
        }
        C64646q31 q312 = (C64646q31) aVar;
        return C46238a.m51546a(this.f184942d, q312.f184942d) && C46238a.m51546a(this.f184943e, q312.f184943e) && C46238a.m51546a(Long.valueOf(this.f184944f), Long.valueOf(q312.f184944f)) && C46238a.m51546a(Long.valueOf(this.f184945g), Long.valueOf(q312.f184945g)) && C46238a.m51546a(this.f184946h, q312.f184946h) && C46238a.m51546a(this.f184947i, q312.f184947i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f184942d);
            String str = this.f184943e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f184944f);
            aVar.mo74321h(4, this.f184945g);
            String str2 = this.f184946h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f184947i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f184942d) + 0;
            String str4 = this.f184943e;
            if (str4 != null) {
                g += C52418a.m58683j(2, str4);
            }
            int h = g + C52418a.m58681h(3, this.f184944f) + C52418a.m58681h(4, this.f184945g);
            String str5 = this.f184946h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f184947i;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
        } else if (i == 2) {
            this.f184942d.clear();
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
            C64646q31 q312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64538lx2 lx22 = new C64538lx2();
                        if (bArr != null && bArr.length > 0) {
                            lx22.parseFrom(bArr);
                        }
                        q312.f184942d.add(lx22);
                    }
                    return 0;
                case 2:
                    q312.f184943e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q312.f184944f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    q312.f184945g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    q312.f184946h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q312.f184947i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
