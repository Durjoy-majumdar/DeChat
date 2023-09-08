package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b01 */
public class C48787b01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f130862d;

    /* renamed from: e */
    public long f130863e;

    /* renamed from: f */
    public long f130864f;

    /* renamed from: g */
    public C89349b f130865g;

    /* renamed from: h */
    public String f130866h;

    /* renamed from: i */
    public String f130867i;

    /* renamed from: j */
    public int f130868j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48787b01)) {
            return false;
        }
        C48787b01 b012 = (C48787b01) aVar;
        return C46238a.m51546a(this.BaseRequest, b012.BaseRequest) && C46238a.m51546a(this.f130862d, b012.f130862d) && C46238a.m51546a(Long.valueOf(this.f130863e), Long.valueOf(b012.f130863e)) && C46238a.m51546a(Long.valueOf(this.f130864f), Long.valueOf(b012.f130864f)) && C46238a.m51546a(this.f130865g, b012.f130865g) && C46238a.m51546a(this.f130866h, b012.f130866h) && C46238a.m51546a(this.f130867i, b012.f130867i) && C46238a.m51546a(Integer.valueOf(this.f130868j), Integer.valueOf(b012.f130868j));
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
            C49842ig0 ig02 = this.f130862d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130862d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f130863e);
            aVar.mo74321h(4, this.f130864f);
            C89349b bVar = this.f130865g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str = this.f130866h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f130867i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f130868j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f130862d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f130863e) + C52418a.m58681h(4, this.f130864f);
            C89349b bVar2 = this.f130865g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            String str3 = this.f130866h;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            String str4 = this.f130867i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58678e(8, this.f130868j);
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
            C48787b01 b012 = objArr[1];
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
                        b012.BaseRequest = iaVar3;
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
                        b012.f130862d = ig04;
                    }
                    return 0;
                case 3:
                    b012.f130863e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    b012.f130864f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    b012.f130865g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    b012.f130866h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    b012.f130867i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    b012.f130868j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
