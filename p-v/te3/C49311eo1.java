package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eo1 */
public class C49311eo1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133030d;

    /* renamed from: e */
    public LinkedList<String> f133031e = new LinkedList<>();

    /* renamed from: f */
    public long f133032f;

    /* renamed from: g */
    public long f133033g;

    /* renamed from: h */
    public long f133034h;

    /* renamed from: i */
    public String f133035i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49311eo1)) {
            return false;
        }
        C49311eo1 eo12 = (C49311eo1) aVar;
        return C46238a.m51546a(this.BaseRequest, eo12.BaseRequest) && C46238a.m51546a(this.f133030d, eo12.f133030d) && C46238a.m51546a(this.f133031e, eo12.f133031e) && C46238a.m51546a(Long.valueOf(this.f133032f), Long.valueOf(eo12.f133032f)) && C46238a.m51546a(Long.valueOf(this.f133033g), Long.valueOf(eo12.f133033g)) && C46238a.m51546a(Long.valueOf(this.f133034h), Long.valueOf(eo12.f133034h)) && C46238a.m51546a(this.f133035i, eo12.f133035i);
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
            C49842ig0 ig02 = this.f133030d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133030d.writeFields(aVar);
            }
            aVar.mo74320g(3, 1, this.f133031e);
            aVar.mo74321h(4, this.f133032f);
            aVar.mo74321h(5, this.f133033g);
            aVar.mo74321h(6, this.f133034h);
            String str = this.f133035i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133030d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f133031e) + C52418a.m58681h(4, this.f133032f) + C52418a.m58681h(5, this.f133033g) + C52418a.m58681h(6, this.f133034h);
            String str2 = this.f133035i;
            return str2 != null ? g + C52418a.m58683j(7, str2) : g;
        } else if (i == 2) {
            this.f133031e.clear();
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
            C49311eo1 eo12 = objArr[1];
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
                        eo12.BaseRequest = iaVar3;
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
                        eo12.f133030d = ig04;
                    }
                    return 0;
                case 3:
                    eo12.f133031e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    eo12.f133032f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    eo12.f133033g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    eo12.f133034h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    eo12.f133035i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
