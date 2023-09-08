package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wm0 */
public class C51851wm0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144131d;

    /* renamed from: e */
    public String f144132e;

    /* renamed from: f */
    public int f144133f;

    /* renamed from: g */
    public C89349b f144134g;

    /* renamed from: h */
    public long f144135h;

    /* renamed from: i */
    public int f144136i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51851wm0)) {
            return false;
        }
        C51851wm0 wm02 = (C51851wm0) aVar;
        return C46238a.m51546a(this.BaseRequest, wm02.BaseRequest) && C46238a.m51546a(this.f144131d, wm02.f144131d) && C46238a.m51546a(this.f144132e, wm02.f144132e) && C46238a.m51546a(Integer.valueOf(this.f144133f), Integer.valueOf(wm02.f144133f)) && C46238a.m51546a(this.f144134g, wm02.f144134g) && C46238a.m51546a(Long.valueOf(this.f144135h), Long.valueOf(wm02.f144135h)) && C46238a.m51546a(Integer.valueOf(this.f144136i), Integer.valueOf(wm02.f144136i));
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
            C49842ig0 ig02 = this.f144131d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144131d.writeFields(aVar);
            }
            String str = this.f144132e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f144133f);
            C89349b bVar = this.f144134g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f144135h);
            aVar.mo74318e(7, this.f144136i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144131d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f144132e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            int e = i2 + C52418a.m58678e(4, this.f144133f);
            C89349b bVar2 = this.f144134g;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58681h(6, this.f144135h) + C52418a.m58678e(7, this.f144136i);
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
            C51851wm0 wm02 = objArr[1];
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
                        wm02.BaseRequest = iaVar3;
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
                        wm02.f144131d = ig04;
                    }
                    return 0;
                case 3:
                    wm02.f144132e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wm02.f144133f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wm02.f144134g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    wm02.f144135h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    wm02.f144136i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
