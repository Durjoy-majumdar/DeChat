package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wo1 */
public class C51861wo1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144171d;

    /* renamed from: e */
    public String f144172e;

    /* renamed from: f */
    public int f144173f;

    /* renamed from: g */
    public String f144174g;

    /* renamed from: h */
    public int f144175h;

    /* renamed from: i */
    public int f144176i;

    /* renamed from: j */
    public C50401mh0 f144177j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51861wo1)) {
            return false;
        }
        C51861wo1 wo12 = (C51861wo1) aVar;
        return C46238a.m51546a(this.BaseRequest, wo12.BaseRequest) && C46238a.m51546a(this.f144171d, wo12.f144171d) && C46238a.m51546a(this.f144172e, wo12.f144172e) && C46238a.m51546a(Integer.valueOf(this.f144173f), Integer.valueOf(wo12.f144173f)) && C46238a.m51546a(this.f144174g, wo12.f144174g) && C46238a.m51546a(Integer.valueOf(this.f144175h), Integer.valueOf(wo12.f144175h)) && C46238a.m51546a(Integer.valueOf(this.f144176i), Integer.valueOf(wo12.f144176i)) && C46238a.m51546a(this.f144177j, wo12.f144177j);
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
            C49842ig0 ig02 = this.f144171d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144171d.writeFields(aVar);
            }
            String str = this.f144172e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f144173f);
            String str2 = this.f144174g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f144175h);
            aVar.mo74318e(7, this.f144176i);
            C50401mh0 mh02 = this.f144177j;
            if (mh02 != null) {
                aVar.mo74322i(8, mh02.computeSize());
                this.f144177j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144171d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f144172e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f144173f);
            String str4 = this.f144174g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            int e2 = e + C52418a.m58678e(6, this.f144175h) + C52418a.m58678e(7, this.f144176i);
            C50401mh0 mh03 = this.f144177j;
            return mh03 != null ? e2 + C52418a.m58682i(8, mh03.computeSize()) : e2;
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
            C51861wo1 wo12 = objArr[1];
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
                        wo12.BaseRequest = iaVar3;
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
                        wo12.f144171d = ig04;
                    }
                    return 0;
                case 3:
                    wo12.f144172e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wo12.f144173f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wo12.f144174g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wo12.f144175h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    wo12.f144176i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50401mh0 mh04 = new C50401mh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            mh04.parseFrom(bArr3);
                        }
                        wo12.f144177j = mh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
