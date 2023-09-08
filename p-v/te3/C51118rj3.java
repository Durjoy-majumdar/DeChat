package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rj3 */
public class C51118rj3 extends C101820nt3 {

    /* renamed from: d */
    public int f140949d;

    /* renamed from: e */
    public long f140950e;

    /* renamed from: f */
    public long f140951f;

    /* renamed from: g */
    public long f140952g;

    /* renamed from: h */
    public int f140953h;

    /* renamed from: i */
    public int f140954i;

    /* renamed from: j */
    public int f140955j;

    /* renamed from: n */
    public long f140956n;

    /* renamed from: o */
    public long f140957o;

    /* renamed from: p */
    public int f140958p;

    /* renamed from: q */
    public String f140959q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51118rj3)) {
            return false;
        }
        C51118rj3 rj32 = (C51118rj3) aVar;
        return C46238a.m51546a(this.BaseRequest, rj32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140949d), Integer.valueOf(rj32.f140949d)) && C46238a.m51546a(Long.valueOf(this.f140950e), Long.valueOf(rj32.f140950e)) && C46238a.m51546a(Long.valueOf(this.f140951f), Long.valueOf(rj32.f140951f)) && C46238a.m51546a(Long.valueOf(this.f140952g), Long.valueOf(rj32.f140952g)) && C46238a.m51546a(Integer.valueOf(this.f140953h), Integer.valueOf(rj32.f140953h)) && C46238a.m51546a(Integer.valueOf(this.f140954i), Integer.valueOf(rj32.f140954i)) && C46238a.m51546a(Integer.valueOf(this.f140955j), Integer.valueOf(rj32.f140955j)) && C46238a.m51546a(Long.valueOf(this.f140956n), Long.valueOf(rj32.f140956n)) && C46238a.m51546a(Long.valueOf(this.f140957o), Long.valueOf(rj32.f140957o)) && C46238a.m51546a(Integer.valueOf(this.f140958p), Integer.valueOf(rj32.f140958p)) && C46238a.m51546a(this.f140959q, rj32.f140959q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f140949d);
            aVar.mo74321h(3, this.f140950e);
            aVar.mo74321h(4, this.f140951f);
            aVar.mo74321h(5, this.f140952g);
            aVar.mo74318e(6, this.f140953h);
            aVar.mo74318e(7, this.f140954i);
            aVar.mo74318e(8, this.f140955j);
            aVar.mo74321h(9, this.f140956n);
            aVar.mo74321h(10, this.f140957o);
            aVar.mo74318e(11, this.f140958p);
            String str = this.f140959q;
            if (str != null) {
                aVar.mo74323j(12, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140949d) + C52418a.m58681h(3, this.f140950e) + C52418a.m58681h(4, this.f140951f) + C52418a.m58681h(5, this.f140952g) + C52418a.m58678e(6, this.f140953h) + C52418a.m58678e(7, this.f140954i) + C52418a.m58678e(8, this.f140955j) + C52418a.m58681h(9, this.f140956n) + C52418a.m58681h(10, this.f140957o) + C52418a.m58678e(11, this.f140958p);
            String str2 = this.f140959q;
            return str2 != null ? e + C52418a.m58683j(12, str2) : e;
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
            C51118rj3 rj32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        rj32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rj32.f140949d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rj32.f140950e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    rj32.f140951f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    rj32.f140952g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    rj32.f140953h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rj32.f140954i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rj32.f140955j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rj32.f140956n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    rj32.f140957o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    rj32.f140958p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    rj32.f140959q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
