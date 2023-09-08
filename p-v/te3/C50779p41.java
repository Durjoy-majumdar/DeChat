package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p41 */
public class C50779p41 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139570d;

    /* renamed from: e */
    public long f139571e;

    /* renamed from: f */
    public long f139572f;

    /* renamed from: g */
    public C50401mh0 f139573g;

    /* renamed from: h */
    public String f139574h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50779p41)) {
            return false;
        }
        C50779p41 p412 = (C50779p41) aVar;
        return C46238a.m51546a(this.BaseRequest, p412.BaseRequest) && C46238a.m51546a(this.f139570d, p412.f139570d) && C46238a.m51546a(Long.valueOf(this.f139571e), Long.valueOf(p412.f139571e)) && C46238a.m51546a(Long.valueOf(this.f139572f), Long.valueOf(p412.f139572f)) && C46238a.m51546a(this.f139573g, p412.f139573g) && C46238a.m51546a(this.f139574h, p412.f139574h);
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
            C49842ig0 ig02 = this.f139570d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139570d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f139571e);
            aVar.mo74321h(4, this.f139572f);
            C50401mh0 mh02 = this.f139573g;
            if (mh02 != null) {
                aVar.mo74322i(5, mh02.computeSize());
                this.f139573g.writeFields(aVar);
            }
            String str = this.f139574h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139570d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f139571e) + C52418a.m58681h(4, this.f139572f);
            C50401mh0 mh03 = this.f139573g;
            if (mh03 != null) {
                h += C52418a.m58682i(5, mh03.computeSize());
            }
            String str2 = this.f139574h;
            return str2 != null ? h + C52418a.m58683j(6, str2) : h;
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
            C50779p41 p412 = objArr[1];
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
                        p412.BaseRequest = iaVar3;
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
                        p412.f139570d = ig04;
                    }
                    return 0;
                case 3:
                    p412.f139571e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    p412.f139572f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50401mh0 mh04 = new C50401mh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            mh04.parseFrom(bArr3);
                        }
                        p412.f139573g = mh04;
                    }
                    return 0;
                case 6:
                    p412.f139574h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
