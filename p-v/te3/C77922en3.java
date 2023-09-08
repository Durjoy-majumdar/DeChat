package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.en3 */
public class C77922en3 extends C47465a {

    /* renamed from: d */
    public C64507l10 f227260d;

    /* renamed from: e */
    public boolean f227261e;

    /* renamed from: f */
    public boolean f227262f;

    /* renamed from: g */
    public boolean f227263g;

    /* renamed from: h */
    public boolean f227264h;

    /* renamed from: i */
    public boolean f227265i;

    /* renamed from: j */
    public boolean f227266j;

    /* renamed from: n */
    public boolean f227267n;

    /* renamed from: o */
    public boolean f227268o;

    /* renamed from: p */
    public boolean f227269p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77922en3)) {
            return false;
        }
        C77922en3 en32 = (C77922en3) aVar;
        return C46238a.m51546a(this.f227260d, en32.f227260d) && C46238a.m51546a(Boolean.valueOf(this.f227261e), Boolean.valueOf(en32.f227261e)) && C46238a.m51546a(Boolean.valueOf(this.f227262f), Boolean.valueOf(en32.f227262f)) && C46238a.m51546a(Boolean.valueOf(this.f227263g), Boolean.valueOf(en32.f227263g)) && C46238a.m51546a(Boolean.valueOf(this.f227264h), Boolean.valueOf(en32.f227264h)) && C46238a.m51546a(Boolean.valueOf(this.f227265i), Boolean.valueOf(en32.f227265i)) && C46238a.m51546a(Boolean.valueOf(this.f227266j), Boolean.valueOf(en32.f227266j)) && C46238a.m51546a(Boolean.valueOf(this.f227267n), Boolean.valueOf(en32.f227267n)) && C46238a.m51546a(Boolean.valueOf(this.f227268o), Boolean.valueOf(en32.f227268o)) && C46238a.m51546a(Boolean.valueOf(this.f227269p), Boolean.valueOf(en32.f227269p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64507l10 l102 = this.f227260d;
            if (l102 != null) {
                aVar.mo74322i(1, l102.computeSize());
                this.f227260d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f227261e);
            aVar.mo74314a(3, this.f227262f);
            aVar.mo74314a(4, this.f227263g);
            aVar.mo74314a(5, this.f227264h);
            aVar.mo74314a(6, this.f227265i);
            aVar.mo74314a(7, this.f227266j);
            aVar.mo74314a(8, this.f227267n);
            aVar.mo74314a(9, this.f227268o);
            aVar.mo74314a(10, this.f227269p);
            return 0;
        } else if (i == 1) {
            C64507l10 l103 = this.f227260d;
            if (l103 != null) {
                i2 = 0 + C52418a.m58682i(1, l103.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f227261e) + C52418a.m58674a(3, this.f227262f) + C52418a.m58674a(4, this.f227263g) + C52418a.m58674a(5, this.f227264h) + C52418a.m58674a(6, this.f227265i) + C52418a.m58674a(7, this.f227266j) + C52418a.m58674a(8, this.f227267n) + C52418a.m58674a(9, this.f227268o) + C52418a.m58674a(10, this.f227269p);
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
            C77922en3 en32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64507l10 l104 = new C64507l10();
                        if (bArr != null && bArr.length > 0) {
                            l104.parseFrom(bArr);
                        }
                        en32.f227260d = l104;
                    }
                    return 0;
                case 2:
                    en32.f227261e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    en32.f227262f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    en32.f227263g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    en32.f227264h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    en32.f227265i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    en32.f227266j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    en32.f227267n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    en32.f227268o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    en32.f227269p = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
