package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rl1 */
public class C51124rl1 extends C47465a {

    /* renamed from: d */
    public int f140998d;

    /* renamed from: e */
    public String f140999e;

    /* renamed from: f */
    public int f141000f;

    /* renamed from: g */
    public long f141001g;

    /* renamed from: h */
    public C51262sl1 f141002h;

    /* renamed from: i */
    public String f141003i;

    /* renamed from: j */
    public int f141004j;

    /* renamed from: n */
    public String f141005n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51124rl1)) {
            return false;
        }
        C51124rl1 rl12 = (C51124rl1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140998d), Integer.valueOf(rl12.f140998d)) && C46238a.m51546a(this.f140999e, rl12.f140999e) && C46238a.m51546a(Integer.valueOf(this.f141000f), Integer.valueOf(rl12.f141000f)) && C46238a.m51546a(Long.valueOf(this.f141001g), Long.valueOf(rl12.f141001g)) && C46238a.m51546a(this.f141002h, rl12.f141002h) && C46238a.m51546a(this.f141003i, rl12.f141003i) && C46238a.m51546a(Integer.valueOf(this.f141004j), Integer.valueOf(rl12.f141004j)) && C46238a.m51546a(this.f141005n, rl12.f141005n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140998d);
            String str = this.f140999e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f141000f);
            aVar.mo74321h(4, this.f141001g);
            C51262sl1 sl12 = this.f141002h;
            if (sl12 != null) {
                aVar.mo74322i(5, sl12.computeSize());
                this.f141002h.writeFields(aVar);
            }
            String str2 = this.f141003i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f141004j);
            String str3 = this.f141005n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140998d) + 0;
            String str4 = this.f140999e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f141000f) + C52418a.m58681h(4, this.f141001g);
            C51262sl1 sl13 = this.f141002h;
            if (sl13 != null) {
                e2 += C52418a.m58682i(5, sl13.computeSize());
            }
            String str5 = this.f141003i;
            if (str5 != null) {
                e2 += C52418a.m58683j(6, str5);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f141004j);
            String str6 = this.f141005n;
            return str6 != null ? e3 + C52418a.m58683j(8, str6) : e3;
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
            C51124rl1 rl12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rl12.f140998d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    rl12.f140999e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rl12.f141000f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rl12.f141001g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51262sl1 sl14 = new C51262sl1();
                        if (bArr != null && bArr.length > 0) {
                            sl14.parseFrom(bArr);
                        }
                        rl12.f141002h = sl14;
                    }
                    return 0;
                case 6:
                    rl12.f141003i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rl12.f141004j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rl12.f141005n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
