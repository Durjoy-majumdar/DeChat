package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wg1 */
public class C51829wg1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144035d;

    /* renamed from: e */
    public String f144036e;

    /* renamed from: f */
    public String f144037f;

    /* renamed from: g */
    public float f144038g;

    /* renamed from: h */
    public float f144039h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51829wg1)) {
            return false;
        }
        C51829wg1 wg12 = (C51829wg1) aVar;
        return C46238a.m51546a(this.BaseRequest, wg12.BaseRequest) && C46238a.m51546a(this.f144035d, wg12.f144035d) && C46238a.m51546a(this.f144036e, wg12.f144036e) && C46238a.m51546a(this.f144037f, wg12.f144037f) && C46238a.m51546a(Float.valueOf(this.f144038g), Float.valueOf(wg12.f144038g)) && C46238a.m51546a(Float.valueOf(this.f144039h), Float.valueOf(wg12.f144039h));
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
            C49842ig0 ig02 = this.f144035d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144035d.writeFields(aVar);
            }
            String str = this.f144036e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f144037f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74317d(5, this.f144038g);
            aVar.mo74317d(6, this.f144039h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144035d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f144036e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f144037f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            return i2 + C52418a.m58677d(5, this.f144038g) + C52418a.m58677d(6, this.f144039h);
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
            C51829wg1 wg12 = objArr[1];
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
                        wg12.BaseRequest = iaVar3;
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
                        wg12.f144035d = ig04;
                    }
                    return 0;
                case 3:
                    wg12.f144036e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wg12.f144037f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wg12.f144038g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    wg12.f144039h = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
