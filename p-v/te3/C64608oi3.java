package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oi3 */
public class C64608oi3 extends C101820nt3 {

    /* renamed from: d */
    public int f184661d;

    /* renamed from: e */
    public long f184662e;

    /* renamed from: f */
    public String f184663f;

    /* renamed from: g */
    public long f184664g;

    /* renamed from: h */
    public int f184665h;

    /* renamed from: i */
    public String f184666i;

    /* renamed from: j */
    public long f184667j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64608oi3)) {
            return false;
        }
        C64608oi3 oi32 = (C64608oi3) aVar;
        return C46238a.m51546a(this.BaseRequest, oi32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184661d), Integer.valueOf(oi32.f184661d)) && C46238a.m51546a(Long.valueOf(this.f184662e), Long.valueOf(oi32.f184662e)) && C46238a.m51546a(this.f184663f, oi32.f184663f) && C46238a.m51546a(Long.valueOf(this.f184664g), Long.valueOf(oi32.f184664g)) && C46238a.m51546a(Integer.valueOf(this.f184665h), Integer.valueOf(oi32.f184665h)) && C46238a.m51546a(this.f184666i, oi32.f184666i) && C46238a.m51546a(Long.valueOf(this.f184667j), Long.valueOf(oi32.f184667j));
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
            aVar.mo74318e(2, this.f184661d);
            aVar.mo74321h(3, this.f184662e);
            String str = this.f184663f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f184664g);
            aVar.mo74318e(6, this.f184665h);
            String str2 = this.f184666i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74321h(8, this.f184667j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184661d) + C52418a.m58681h(3, this.f184662e);
            String str3 = this.f184663f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int h = e + C52418a.m58681h(5, this.f184664g) + C52418a.m58678e(6, this.f184665h);
            String str4 = this.f184666i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58681h(8, this.f184667j);
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
            C64608oi3 oi32 = objArr[1];
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
                        oi32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    oi32.f184661d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oi32.f184662e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    oi32.f184663f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oi32.f184664g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    oi32.f184665h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    oi32.f184666i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    oi32.f184667j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
