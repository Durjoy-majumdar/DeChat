package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tg0 */
public class C51392tg0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142206d;

    /* renamed from: e */
    public LinkedList<String> f142207e = new LinkedList<>();

    /* renamed from: f */
    public String f142208f;

    /* renamed from: g */
    public float f142209g;

    /* renamed from: h */
    public float f142210h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51392tg0)) {
            return false;
        }
        C51392tg0 tg02 = (C51392tg0) aVar;
        return C46238a.m51546a(this.BaseRequest, tg02.BaseRequest) && C46238a.m51546a(this.f142206d, tg02.f142206d) && C46238a.m51546a(this.f142207e, tg02.f142207e) && C46238a.m51546a(this.f142208f, tg02.f142208f) && C46238a.m51546a(Float.valueOf(this.f142209g), Float.valueOf(tg02.f142209g)) && C46238a.m51546a(Float.valueOf(this.f142210h), Float.valueOf(tg02.f142210h));
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
            C49842ig0 ig02 = this.f142206d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142206d.writeFields(aVar);
            }
            aVar.mo74320g(3, 1, this.f142207e);
            String str = this.f142208f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74317d(5, this.f142209g);
            aVar.mo74317d(6, this.f142210h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142206d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f142207e);
            String str2 = this.f142208f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            return g + C52418a.m58677d(5, this.f142209g) + C52418a.m58677d(6, this.f142210h);
        } else if (i == 2) {
            this.f142207e.clear();
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
            C51392tg0 tg02 = objArr[1];
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
                        tg02.BaseRequest = iaVar3;
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
                        tg02.f142206d = ig04;
                    }
                    return 0;
                case 3:
                    tg02.f142207e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    tg02.f142208f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tg02.f142209g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    tg02.f142210h = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
