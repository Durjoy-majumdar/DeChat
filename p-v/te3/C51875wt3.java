package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wt3 */
public class C51875wt3 extends C47465a {

    /* renamed from: d */
    public C50767p11 f144287d;

    /* renamed from: e */
    public LinkedList<C51548uh3> f144288e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51875wt3)) {
            return false;
        }
        C51875wt3 wt32 = (C51875wt3) aVar;
        return C46238a.m51546a(this.f144287d, wt32.f144287d) && C46238a.m51546a(this.f144288e, wt32.f144288e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50767p11 p112 = this.f144287d;
            if (p112 != null) {
                aVar.mo74322i(1, p112.computeSize());
                this.f144287d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f144288e);
            return 0;
        } else if (i == 1) {
            C50767p11 p113 = this.f144287d;
            if (p113 != null) {
                i2 = 0 + C52418a.m58682i(1, p113.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f144288e);
        } else if (i == 2) {
            this.f144288e.clear();
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
            C51875wt3 wt32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    wt32.f144287d = p114;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51548uh3 uh32 = new C51548uh3();
                    if (bArr2 != null && bArr2.length > 0) {
                        uh32.parseFrom(bArr2);
                    }
                    wt32.f144288e.add(uh32);
                }
                return 0;
            }
        }
    }
}
