package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b92 */
public class C48824b92 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f131014d;

    /* renamed from: e */
    public String f131015e;

    /* renamed from: f */
    public int f131016f;

    /* renamed from: g */
    public int f131017g;

    /* renamed from: h */
    public int f131018h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48824b92)) {
            return false;
        }
        C48824b92 b922 = (C48824b92) aVar;
        return C46238a.m51546a(this.BaseRequest, b922.BaseRequest) && C46238a.m51546a(this.f131014d, b922.f131014d) && C46238a.m51546a(this.f131015e, b922.f131015e) && C46238a.m51546a(Integer.valueOf(this.f131016f), Integer.valueOf(b922.f131016f)) && C46238a.m51546a(Integer.valueOf(this.f131017g), Integer.valueOf(b922.f131017g)) && C46238a.m51546a(Integer.valueOf(this.f131018h), Integer.valueOf(b922.f131018h));
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
            C49842ig0 ig02 = this.f131014d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f131014d.writeFields(aVar);
            }
            String str = this.f131015e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f131016f);
            aVar.mo74318e(5, this.f131017g);
            aVar.mo74318e(6, this.f131018h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f131014d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f131015e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58678e(4, this.f131016f) + C52418a.m58678e(5, this.f131017g) + C52418a.m58678e(6, this.f131018h);
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
            C48824b92 b922 = objArr[1];
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
                        b922.BaseRequest = iaVar3;
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
                        b922.f131014d = ig04;
                    }
                    return 0;
                case 3:
                    b922.f131015e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b922.f131016f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    b922.f131017g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    b922.f131018h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
