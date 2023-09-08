package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oy4 extends C47465a {

    /* renamed from: d */
    public String f184719d;

    /* renamed from: e */
    public String f184720e;

    /* renamed from: f */
    public bz4 f184721f;

    /* renamed from: g */
    public int f184722g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oy4)) {
            return false;
        }
        oy4 oy4 = (oy4) aVar;
        return C46238a.m51546a(this.f184719d, oy4.f184719d) && C46238a.m51546a(this.f184720e, oy4.f184720e) && C46238a.m51546a(this.f184721f, oy4.f184721f) && C46238a.m51546a(Integer.valueOf(this.f184722g), Integer.valueOf(oy4.f184722g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184719d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184720e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            bz4 bz4 = this.f184721f;
            if (bz4 != null) {
                aVar.mo74322i(3, bz4.computeSize());
                this.f184721f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f184722g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f184719d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184720e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            bz4 bz42 = this.f184721f;
            if (bz42 != null) {
                i2 += C52418a.m58682i(3, bz42.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f184722g);
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
            oy4 oy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oy4.f184719d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                oy4.f184720e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    bz4 bz43 = new bz4();
                    if (bArr != null && bArr.length > 0) {
                        bz43.parseFrom(bArr);
                    }
                    oy4.f184721f = bz43;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                oy4.f184722g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
