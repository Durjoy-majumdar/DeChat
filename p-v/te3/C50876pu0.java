package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pu0 */
public class C50876pu0 extends C47465a {

    /* renamed from: d */
    public int f139978d;

    /* renamed from: e */
    public long f139979e;

    /* renamed from: f */
    public C49765hx0 f139980f;

    /* renamed from: g */
    public String f139981g;

    /* renamed from: h */
    public LinkedList<C50034jt0> f139982h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50876pu0)) {
            return false;
        }
        C50876pu0 pu02 = (C50876pu0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139978d), Integer.valueOf(pu02.f139978d)) && C46238a.m51546a(Long.valueOf(this.f139979e), Long.valueOf(pu02.f139979e)) && C46238a.m51546a(this.f139980f, pu02.f139980f) && C46238a.m51546a(this.f139981g, pu02.f139981g) && C46238a.m51546a(this.f139982h, pu02.f139982h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(101, this.f139978d);
            aVar.mo74321h(102, this.f139979e);
            C49765hx0 hx02 = this.f139980f;
            if (hx02 != null) {
                aVar.mo74322i(103, hx02.computeSize());
                this.f139980f.writeFields(aVar);
            }
            String str = this.f139981g;
            if (str != null) {
                aVar.mo74323j(104, str);
            }
            aVar.mo74320g(105, 8, this.f139982h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(101, this.f139978d) + 0 + C52418a.m58681h(102, this.f139979e);
            C49765hx0 hx03 = this.f139980f;
            if (hx03 != null) {
                e += C52418a.m58682i(103, hx03.computeSize());
            }
            String str2 = this.f139981g;
            if (str2 != null) {
                e += C52418a.m58683j(104, str2);
            }
            return e + C52418a.m58680g(105, 8, this.f139982h);
        } else if (i == 2) {
            this.f139982h.clear();
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
            C50876pu0 pu02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 101:
                    pu02.f139978d = aVar3.mo141629g(intValue);
                    return 0;
                case 102:
                    pu02.f139979e = aVar3.mo141631i(intValue);
                    return 0;
                case 103:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49765hx0 hx04 = new C49765hx0();
                        if (bArr != null && bArr.length > 0) {
                            hx04.parseFrom(bArr);
                        }
                        pu02.f139980f = hx04;
                    }
                    return 0;
                case 104:
                    pu02.f139981g = aVar3.mo141633k(intValue);
                    return 0;
                case 105:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50034jt0 jt02 = new C50034jt0();
                        if (bArr2 != null && bArr2.length > 0) {
                            jt02.parseFrom(bArr2);
                        }
                        pu02.f139982h.add(jt02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
