package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bv2 */
public class C48912bv2 extends C47465a {

    /* renamed from: d */
    public long f131329d;

    /* renamed from: e */
    public LinkedList<C89349b> f131330e = new LinkedList<>();

    /* renamed from: f */
    public C51696vh2 f131331f;

    /* renamed from: g */
    public long f131332g;

    /* renamed from: h */
    public long f131333h;

    /* renamed from: i */
    public long f131334i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48912bv2)) {
            return false;
        }
        C48912bv2 bv22 = (C48912bv2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131329d), Long.valueOf(bv22.f131329d)) && C46238a.m51546a(this.f131330e, bv22.f131330e) && C46238a.m51546a(this.f131331f, bv22.f131331f) && C46238a.m51546a(Long.valueOf(this.f131332g), Long.valueOf(bv22.f131332g)) && C46238a.m51546a(Long.valueOf(this.f131333h), Long.valueOf(bv22.f131333h)) && C46238a.m51546a(Long.valueOf(this.f131334i), Long.valueOf(bv22.f131334i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131329d);
            aVar.mo74320g(2, 6, this.f131330e);
            C51696vh2 vh22 = this.f131331f;
            if (vh22 != null) {
                aVar.mo74322i(3, vh22.computeSize());
                this.f131331f.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f131332g);
            aVar.mo74321h(5, this.f131333h);
            aVar.mo74321h(6, this.f131334i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131329d) + 0 + C52418a.m58680g(2, 6, this.f131330e);
            C51696vh2 vh23 = this.f131331f;
            if (vh23 != null) {
                h += C52418a.m58682i(3, vh23.computeSize());
            }
            return h + C52418a.m58681h(4, this.f131332g) + C52418a.m58681h(5, this.f131333h) + C52418a.m58681h(6, this.f131334i);
        } else if (i == 2) {
            this.f131330e.clear();
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
            C48912bv2 bv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bv22.f131329d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    bv22.f131330e.add(aVar3.mo141626d(intValue));
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51696vh2 vh24 = new C51696vh2();
                        if (bArr != null && bArr.length > 0) {
                            vh24.parseFrom(bArr);
                        }
                        bv22.f131331f = vh24;
                    }
                    return 0;
                case 4:
                    bv22.f131332g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    bv22.f131333h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bv22.f131334i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
