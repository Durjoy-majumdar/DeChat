package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j84 extends C47465a {

    /* renamed from: d */
    public int f135923d;

    /* renamed from: e */
    public int f135924e;

    /* renamed from: f */
    public int f135925f;

    /* renamed from: g */
    public int f135926g;

    /* renamed from: h */
    public d94 f135927h;

    /* renamed from: i */
    public C49726hm3 f135928i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j84)) {
            return false;
        }
        j84 j84 = (j84) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135923d), Integer.valueOf(j84.f135923d)) && C46238a.m51546a(Integer.valueOf(this.f135924e), Integer.valueOf(j84.f135924e)) && C46238a.m51546a(Integer.valueOf(this.f135925f), Integer.valueOf(j84.f135925f)) && C46238a.m51546a(Integer.valueOf(this.f135926g), Integer.valueOf(j84.f135926g)) && C46238a.m51546a(this.f135927h, j84.f135927h) && C46238a.m51546a(this.f135928i, j84.f135928i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135923d);
            aVar.mo74318e(2, this.f135924e);
            aVar.mo74318e(4, this.f135925f);
            aVar.mo74318e(5, this.f135926g);
            d94 d94 = this.f135927h;
            if (d94 != null) {
                aVar.mo74322i(6, d94.computeSize());
                this.f135927h.writeFields(aVar);
            }
            C49726hm3 hm32 = this.f135928i;
            if (hm32 != null) {
                aVar.mo74322i(7, hm32.computeSize());
                this.f135928i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135923d) + 0 + C52418a.m58678e(2, this.f135924e) + C52418a.m58678e(4, this.f135925f) + C52418a.m58678e(5, this.f135926g);
            d94 d942 = this.f135927h;
            if (d942 != null) {
                e += C52418a.m58682i(6, d942.computeSize());
            }
            C49726hm3 hm33 = this.f135928i;
            return hm33 != null ? e + C52418a.m58682i(7, hm33.computeSize()) : e;
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
            j84 j84 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j84.f135923d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                j84.f135924e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                j84.f135925f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                j84.f135926g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 6) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    d94 d943 = new d94();
                    if (bArr != null && bArr.length > 0) {
                        d943.parseFrom(bArr);
                    }
                    j84.f135927h = d943;
                }
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49726hm3 hm34 = new C49726hm3();
                    if (bArr2 != null && bArr2.length > 0) {
                        hm34.parseFrom(bArr2);
                    }
                    j84.f135928i = hm34;
                }
                return 0;
            }
        }
    }
}
