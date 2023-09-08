package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e21 */
public class C49219e21 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f132638d;

    /* renamed from: e */
    public String f132639e;

    /* renamed from: f */
    public long f132640f;

    /* renamed from: g */
    public long f132641g;

    /* renamed from: h */
    public String f132642h;

    /* renamed from: i */
    public int f132643i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49219e21)) {
            return false;
        }
        C49219e21 e212 = (C49219e21) aVar;
        return C46238a.m51546a(this.BaseRequest, e212.BaseRequest) && C46238a.m51546a(this.f132638d, e212.f132638d) && C46238a.m51546a(this.f132639e, e212.f132639e) && C46238a.m51546a(Long.valueOf(this.f132640f), Long.valueOf(e212.f132640f)) && C46238a.m51546a(Long.valueOf(this.f132641g), Long.valueOf(e212.f132641g)) && C46238a.m51546a(this.f132642h, e212.f132642h) && C46238a.m51546a(Integer.valueOf(this.f132643i), Integer.valueOf(e212.f132643i));
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
            C49842ig0 ig02 = this.f132638d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f132638d.writeFields(aVar);
            }
            String str = this.f132639e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f132640f);
            aVar.mo74321h(5, this.f132641g);
            String str2 = this.f132642h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f132643i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f132638d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f132639e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int h = i2 + C52418a.m58681h(4, this.f132640f) + C52418a.m58681h(5, this.f132641g);
            String str4 = this.f132642h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            return h + C52418a.m58678e(7, this.f132643i);
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
            C49219e21 e212 = objArr[1];
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
                        e212.BaseRequest = iaVar3;
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
                        e212.f132638d = ig04;
                    }
                    return 0;
                case 3:
                    e212.f132639e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e212.f132640f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    e212.f132641g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    e212.f132642h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e212.f132643i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
