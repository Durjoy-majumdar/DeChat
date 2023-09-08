package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r71 */
public class C51068r71 extends C47465a {

    /* renamed from: d */
    public int f140741d;

    /* renamed from: e */
    public LinkedList<C49658h43> f140742e = new LinkedList<>();

    /* renamed from: f */
    public C52173yv0 f140743f;

    /* renamed from: g */
    public String f140744g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51068r71)) {
            return false;
        }
        C51068r71 r712 = (C51068r71) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140741d), Integer.valueOf(r712.f140741d)) && C46238a.m51546a(this.f140742e, r712.f140742e) && C46238a.m51546a(this.f140743f, r712.f140743f) && C46238a.m51546a(this.f140744g, r712.f140744g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140741d);
            aVar.mo74320g(2, 8, this.f140742e);
            C52173yv0 yv02 = this.f140743f;
            if (yv02 != null) {
                aVar.mo74322i(3, yv02.computeSize());
                this.f140743f.writeFields(aVar);
            }
            String str = this.f140744g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140741d) + 0 + C52418a.m58680g(2, 8, this.f140742e);
            C52173yv0 yv03 = this.f140743f;
            if (yv03 != null) {
                e += C52418a.m58682i(3, yv03.computeSize());
            }
            String str2 = this.f140744g;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f140742e.clear();
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
            C51068r71 r712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r712.f140741d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49658h43 h432 = new C49658h43();
                    if (bArr != null && bArr.length > 0) {
                        h432.parseFrom(bArr);
                    }
                    r712.f140742e.add(h432);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C52173yv0 yv04 = new C52173yv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        yv04.parseFrom(bArr2);
                    }
                    r712.f140743f = yv04;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r712.f140744g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
