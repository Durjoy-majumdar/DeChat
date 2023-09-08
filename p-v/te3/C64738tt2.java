package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tt2 */
public class C64738tt2 extends C101820nt3 {

    /* renamed from: d */
    public int f185672d;

    /* renamed from: e */
    public float f185673e;

    /* renamed from: f */
    public float f185674f;

    /* renamed from: g */
    public LinkedList<C89349b> f185675g = new LinkedList<>();

    /* renamed from: h */
    public long f185676h;

    /* renamed from: i */
    public long f185677i;

    /* renamed from: j */
    public long f185678j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64738tt2)) {
            return false;
        }
        C64738tt2 tt22 = (C64738tt2) aVar;
        return C46238a.m51546a(this.BaseRequest, tt22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f185672d), Integer.valueOf(tt22.f185672d)) && C46238a.m51546a(Float.valueOf(this.f185673e), Float.valueOf(tt22.f185673e)) && C46238a.m51546a(Float.valueOf(this.f185674f), Float.valueOf(tt22.f185674f)) && C46238a.m51546a(this.f185675g, tt22.f185675g) && C46238a.m51546a(Long.valueOf(this.f185676h), Long.valueOf(tt22.f185676h)) && C46238a.m51546a(Long.valueOf(this.f185677i), Long.valueOf(tt22.f185677i)) && C46238a.m51546a(Long.valueOf(this.f185678j), Long.valueOf(tt22.f185678j));
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
            aVar.mo74318e(2, this.f185672d);
            aVar.mo74317d(3, this.f185673e);
            aVar.mo74317d(4, this.f185674f);
            aVar.mo74320g(5, 6, this.f185675g);
            aVar.mo74321h(6, this.f185676h);
            aVar.mo74321h(7, this.f185677i);
            aVar.mo74321h(8, this.f185678j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f185672d) + C52418a.m58677d(3, this.f185673e) + C52418a.m58677d(4, this.f185674f) + C52418a.m58680g(5, 6, this.f185675g) + C52418a.m58681h(6, this.f185676h) + C52418a.m58681h(7, this.f185677i) + C52418a.m58681h(8, this.f185678j);
        } else if (i == 2) {
            this.f185675g.clear();
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
            C64738tt2 tt22 = objArr[1];
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
                        tt22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tt22.f185672d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tt22.f185673e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    tt22.f185674f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    tt22.f185675g.add(aVar3.mo141626d(intValue));
                    return 0;
                case 6:
                    tt22.f185676h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    tt22.f185677i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    tt22.f185678j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
