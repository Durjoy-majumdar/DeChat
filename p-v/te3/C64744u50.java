package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u50 */
public class C64744u50 extends C101820nt3 {

    /* renamed from: d */
    public int f185707d;

    /* renamed from: e */
    public int f185708e;

    /* renamed from: f */
    public int f185709f;

    /* renamed from: g */
    public String f185710g;

    /* renamed from: h */
    public long f185711h;

    /* renamed from: i */
    public String f185712i;

    /* renamed from: j */
    public long f185713j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64744u50)) {
            return false;
        }
        C64744u50 u502 = (C64744u50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185707d), Integer.valueOf(u502.f185707d)) && C46238a.m51546a(Integer.valueOf(this.f185708e), Integer.valueOf(u502.f185708e)) && C46238a.m51546a(Integer.valueOf(this.f185709f), Integer.valueOf(u502.f185709f)) && C46238a.m51546a(this.f185710g, u502.f185710g) && C46238a.m51546a(this.BaseRequest, u502.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f185711h), Long.valueOf(u502.f185711h)) && C46238a.m51546a(this.f185712i, u502.f185712i) && C46238a.m51546a(Long.valueOf(this.f185713j), Long.valueOf(u502.f185713j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185707d);
            aVar.mo74318e(2, this.f185708e);
            aVar.mo74318e(3, this.f185709f);
            String str = this.f185710g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(5, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f185711h);
            String str2 = this.f185712i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74321h(8, this.f185713j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185707d) + 0 + C52418a.m58678e(2, this.f185708e) + C52418a.m58678e(3, this.f185709f);
            String str3 = this.f185710g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                e += C52418a.m58682i(5, iaVar2.computeSize());
            }
            int h = e + C52418a.m58681h(6, this.f185711h);
            String str4 = this.f185712i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58681h(8, this.f185713j);
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
            C64744u50 u502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u502.f185707d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    u502.f185708e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    u502.f185709f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    u502.f185710g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        u502.BaseRequest = iaVar3;
                    }
                    return 0;
                case 6:
                    u502.f185711h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    u502.f185712i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    u502.f185713j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
