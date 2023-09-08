package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class kx4 extends C47465a {

    /* renamed from: d */
    public ew4 f137085d;

    /* renamed from: e */
    public LinkedList<mw4> f137086e = new LinkedList<>();

    /* renamed from: f */
    public int f137087f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kx4)) {
            return false;
        }
        kx4 kx4 = (kx4) aVar;
        return C46238a.m51546a(this.f137085d, kx4.f137085d) && C46238a.m51546a(this.f137086e, kx4.f137086e) && C46238a.m51546a(Integer.valueOf(this.f137087f), Integer.valueOf(kx4.f137087f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ew4 ew4 = this.f137085d;
            if (ew4 != null) {
                if (ew4 != null) {
                    aVar.mo74322i(1, ew4.computeSize());
                    this.f137085d.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f137086e);
                aVar.mo74318e(3, this.f137087f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i == 1) {
            ew4 ew42 = this.f137085d;
            if (ew42 != null) {
                i2 = 0 + C52418a.m58682i(1, ew42.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f137086e) + C52418a.m58678e(3, this.f137087f);
        } else if (i == 2) {
            this.f137086e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137085d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            kx4 kx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ew4 ew43 = new ew4();
                    if (bArr != null && bArr.length > 0) {
                        ew43.parseFrom(bArr);
                    }
                    kx4.f137085d = ew43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    mw4 mw4 = new mw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        mw4.parseFrom(bArr2);
                    }
                    kx4.f137086e.add(mw4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                kx4.f137087f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
