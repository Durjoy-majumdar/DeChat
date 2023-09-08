package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yz1 */
public class C52189yz1 extends C47465a {

    /* renamed from: d */
    public long f145589d;

    /* renamed from: e */
    public String f145590e;

    /* renamed from: f */
    public C49028cn3 f145591f;

    /* renamed from: g */
    public h35 f145592g;

    /* renamed from: h */
    public int f145593h;

    /* renamed from: i */
    public long f145594i;

    /* renamed from: j */
    public C50292lo2 f145595j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52189yz1)) {
            return false;
        }
        C52189yz1 yz12 = (C52189yz1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145589d), Long.valueOf(yz12.f145589d)) && C46238a.m51546a(this.f145590e, yz12.f145590e) && C46238a.m51546a(this.f145591f, yz12.f145591f) && C46238a.m51546a(this.f145592g, yz12.f145592g) && C46238a.m51546a(Integer.valueOf(this.f145593h), Integer.valueOf(yz12.f145593h)) && C46238a.m51546a(Long.valueOf(this.f145594i), Long.valueOf(yz12.f145594i)) && C46238a.m51546a(this.f145595j, yz12.f145595j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145589d);
            String str = this.f145590e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49028cn3 cn32 = this.f145591f;
            if (cn32 != null) {
                aVar.mo74322i(3, cn32.computeSize());
                this.f145591f.writeFields(aVar);
            }
            h35 h35 = this.f145592g;
            if (h35 != null) {
                aVar.mo74322i(4, h35.computeSize());
                this.f145592g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f145593h);
            aVar.mo74321h(6, this.f145594i);
            C50292lo2 lo22 = this.f145595j;
            if (lo22 != null) {
                aVar.mo74322i(7, lo22.computeSize());
                this.f145595j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f145589d) + 0;
            String str2 = this.f145590e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            C49028cn3 cn33 = this.f145591f;
            if (cn33 != null) {
                h += C52418a.m58682i(3, cn33.computeSize());
            }
            h35 h352 = this.f145592g;
            if (h352 != null) {
                h += C52418a.m58682i(4, h352.computeSize());
            }
            int e = h + C52418a.m58678e(5, this.f145593h) + C52418a.m58681h(6, this.f145594i);
            C50292lo2 lo23 = this.f145595j;
            return lo23 != null ? e + C52418a.m58682i(7, lo23.computeSize()) : e;
        } else if (i == 2) {
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
            C52189yz1 yz12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yz12.f145589d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    yz12.f145590e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49028cn3 cn34 = new C49028cn3();
                        if (bArr != null && bArr.length > 0) {
                            cn34.parseFrom(bArr);
                        }
                        yz12.f145591f = cn34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        h35 h353 = new h35();
                        if (bArr2 != null && bArr2.length > 0) {
                            h353.parseFrom(bArr2);
                        }
                        yz12.f145592g = h353;
                    }
                    return 0;
                case 5:
                    yz12.f145593h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yz12.f145594i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C50292lo2 lo24 = new C50292lo2();
                        if (bArr3 != null && bArr3.length > 0) {
                            lo24.parseFrom(bArr3);
                        }
                        yz12.f145595j = lo24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
