package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.un0 */
public class C51570un0 extends C101820nt3 {

    /* renamed from: d */
    public long f142955d;

    /* renamed from: e */
    public String f142956e;

    /* renamed from: f */
    public int f142957f;

    /* renamed from: g */
    public String f142958g;

    /* renamed from: h */
    public C64840xw0 f142959h;

    /* renamed from: i */
    public C50429mo2 f142960i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51570un0)) {
            return false;
        }
        C51570un0 un02 = (C51570un0) aVar;
        return C46238a.m51546a(this.BaseRequest, un02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f142955d), Long.valueOf(un02.f142955d)) && C46238a.m51546a(this.f142956e, un02.f142956e) && C46238a.m51546a(Integer.valueOf(this.f142957f), Integer.valueOf(un02.f142957f)) && C46238a.m51546a(this.f142958g, un02.f142958g) && C46238a.m51546a(this.f142959h, un02.f142959h) && C46238a.m51546a(this.f142960i, un02.f142960i);
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
            aVar.mo74321h(2, this.f142955d);
            String str = this.f142956e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f142957f);
            String str2 = this.f142958g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C64840xw0 xw02 = this.f142959h;
            if (xw02 != null) {
                aVar.mo74322i(6, xw02.computeSize());
                this.f142959h.writeFields(aVar);
            }
            C50429mo2 mo22 = this.f142960i;
            if (mo22 != null) {
                aVar.mo74322i(7, mo22.computeSize());
                this.f142960i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f142955d);
            String str3 = this.f142956e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int e = h + C52418a.m58678e(4, this.f142957f);
            String str4 = this.f142958g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C64840xw0 xw03 = this.f142959h;
            if (xw03 != null) {
                e += C52418a.m58682i(6, xw03.computeSize());
            }
            C50429mo2 mo23 = this.f142960i;
            return mo23 != null ? e + C52418a.m58682i(7, mo23.computeSize()) : e;
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
            C51570un0 un02 = objArr[1];
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
                        un02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    un02.f142955d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    un02.f142956e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    un02.f142957f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    un02.f142958g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr2 != null && bArr2.length > 0) {
                            xw04.parseFrom(bArr2);
                        }
                        un02.f142959h = xw04;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50429mo2 mo24 = new C50429mo2();
                        if (bArr3 != null && bArr3.length > 0) {
                            mo24.parseFrom(bArr3);
                        }
                        un02.f142960i = mo24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
