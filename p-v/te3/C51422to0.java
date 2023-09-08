package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.to0 */
public class C51422to0 extends C101820nt3 {

    /* renamed from: d */
    public long f142301d;

    /* renamed from: e */
    public String f142302e;

    /* renamed from: f */
    public C89349b f142303f;

    /* renamed from: g */
    public C49842ig0 f142304g;

    /* renamed from: h */
    public int f142305h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51422to0)) {
            return false;
        }
        C51422to0 to02 = (C51422to0) aVar;
        return C46238a.m51546a(this.BaseRequest, to02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f142301d), Long.valueOf(to02.f142301d)) && C46238a.m51546a(this.f142302e, to02.f142302e) && C46238a.m51546a(this.f142303f, to02.f142303f) && C46238a.m51546a(this.f142304g, to02.f142304g) && C46238a.m51546a(Integer.valueOf(this.f142305h), Integer.valueOf(to02.f142305h));
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
            aVar.mo74321h(2, this.f142301d);
            String str = this.f142302e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f142303f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C49842ig0 ig02 = this.f142304g;
            if (ig02 != null) {
                aVar.mo74322i(5, ig02.computeSize());
                this.f142304g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f142305h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f142301d);
            String str2 = this.f142302e;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f142303f;
            if (bVar2 != null) {
                h += C52418a.m58675b(4, bVar2);
            }
            C49842ig0 ig03 = this.f142304g;
            if (ig03 != null) {
                h += C52418a.m58682i(5, ig03.computeSize());
            }
            return h + C52418a.m58678e(6, this.f142305h);
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
            C51422to0 to02 = objArr[1];
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
                        to02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    to02.f142301d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    to02.f142302e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    to02.f142303f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        to02.f142304g = ig04;
                    }
                    return 0;
                case 6:
                    to02.f142305h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
