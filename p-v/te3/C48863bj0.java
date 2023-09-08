package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bj0 */
public class C48863bj0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f131140d;

    /* renamed from: e */
    public String f131141e;

    /* renamed from: f */
    public String f131142f;

    /* renamed from: g */
    public long f131143g;

    /* renamed from: h */
    public long f131144h;

    /* renamed from: i */
    public String f131145i;

    /* renamed from: j */
    public LinkedList<C48928bz0> f131146j = new LinkedList<>();

    /* renamed from: n */
    public long f131147n;

    /* renamed from: o */
    public int f131148o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48863bj0)) {
            return false;
        }
        C48863bj0 bj02 = (C48863bj0) aVar;
        return C46238a.m51546a(this.BaseRequest, bj02.BaseRequest) && C46238a.m51546a(this.f131140d, bj02.f131140d) && C46238a.m51546a(this.f131141e, bj02.f131141e) && C46238a.m51546a(this.f131142f, bj02.f131142f) && C46238a.m51546a(Long.valueOf(this.f131143g), Long.valueOf(bj02.f131143g)) && C46238a.m51546a(Long.valueOf(this.f131144h), Long.valueOf(bj02.f131144h)) && C46238a.m51546a(this.f131145i, bj02.f131145i) && C46238a.m51546a(this.f131146j, bj02.f131146j) && C46238a.m51546a(Long.valueOf(this.f131147n), Long.valueOf(bj02.f131147n)) && C46238a.m51546a(Integer.valueOf(this.f131148o), Integer.valueOf(bj02.f131148o));
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
            C49842ig0 ig02 = this.f131140d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f131140d.writeFields(aVar);
            }
            String str = this.f131141e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f131142f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f131143g);
            aVar.mo74321h(6, this.f131144h);
            String str3 = this.f131145i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74320g(10, 8, this.f131146j);
            aVar.mo74321h(11, this.f131147n);
            aVar.mo74318e(12, this.f131148o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f131140d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f131141e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f131142f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            int h = i2 + C52418a.m58681h(5, this.f131143g) + C52418a.m58681h(6, this.f131144h);
            String str6 = this.f131145i;
            if (str6 != null) {
                h += C52418a.m58683j(7, str6);
            }
            return h + C52418a.m58680g(10, 8, this.f131146j) + C52418a.m58681h(11, this.f131147n) + C52418a.m58678e(12, this.f131148o);
        } else if (i == 2) {
            this.f131146j.clear();
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
            C48863bj0 bj02 = objArr[1];
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
                        bj02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        bj02.f131140d = ig04;
                    }
                    return 0;
                case 3:
                    bj02.f131141e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bj02.f131142f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bj02.f131143g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bj02.f131144h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    bj02.f131145i = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48928bz0 bz02 = new C48928bz0();
                        if (bArr3 != null && bArr3.length > 0) {
                            bz02.parseFrom(bArr3);
                        }
                        bj02.f131146j.add(bz02);
                    }
                    return 0;
                case 11:
                    bj02.f131147n = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    bj02.f131148o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
