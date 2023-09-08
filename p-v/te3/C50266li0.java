package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.li0 */
public class C50266li0 extends C47465a {

    /* renamed from: d */
    public long f137430d;

    /* renamed from: e */
    public int f137431e;

    /* renamed from: f */
    public int f137432f;

    /* renamed from: g */
    public C51887ww2 f137433g;

    /* renamed from: h */
    public C49882ip2 f137434h;

    /* renamed from: i */
    public int f137435i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50266li0)) {
            return false;
        }
        C50266li0 li02 = (C50266li0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137430d), Long.valueOf(li02.f137430d)) && C46238a.m51546a(Integer.valueOf(this.f137431e), Integer.valueOf(li02.f137431e)) && C46238a.m51546a(Integer.valueOf(this.f137432f), Integer.valueOf(li02.f137432f)) && C46238a.m51546a(this.f137433g, li02.f137433g) && C46238a.m51546a(this.f137434h, li02.f137434h) && C46238a.m51546a(Integer.valueOf(this.f137435i), Integer.valueOf(li02.f137435i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f137430d);
            aVar.mo74318e(2, this.f137431e);
            aVar.mo74318e(3, this.f137432f);
            C51887ww2 ww22 = this.f137433g;
            if (ww22 != null) {
                aVar.mo74322i(4, ww22.computeSize());
                this.f137433g.writeFields(aVar);
            }
            C49882ip2 ip22 = this.f137434h;
            if (ip22 != null) {
                aVar.mo74322i(5, ip22.computeSize());
                this.f137434h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f137435i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137430d) + 0 + C52418a.m58678e(2, this.f137431e) + C52418a.m58678e(3, this.f137432f);
            C51887ww2 ww23 = this.f137433g;
            if (ww23 != null) {
                h += C52418a.m58682i(4, ww23.computeSize());
            }
            C49882ip2 ip23 = this.f137434h;
            if (ip23 != null) {
                h += C52418a.m58682i(5, ip23.computeSize());
            }
            return h + C52418a.m58678e(6, this.f137435i);
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
            C50266li0 li02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    li02.f137430d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    li02.f137431e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    li02.f137432f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51887ww2 ww24 = new C51887ww2();
                        if (bArr != null && bArr.length > 0) {
                            ww24.parseFrom(bArr);
                        }
                        li02.f137433g = ww24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49882ip2 ip24 = new C49882ip2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ip24.parseFrom(bArr2);
                        }
                        li02.f137434h = ip24;
                    }
                    return 0;
                case 6:
                    li02.f137435i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
