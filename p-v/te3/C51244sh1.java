package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sh1 */
public class C51244sh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141512d;

    /* renamed from: e */
    public String f141513e;

    /* renamed from: f */
    public String f141514f;

    /* renamed from: g */
    public String f141515g;

    /* renamed from: h */
    public String f141516h;

    /* renamed from: i */
    public long f141517i;

    /* renamed from: j */
    public int f141518j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51244sh1)) {
            return false;
        }
        C51244sh1 sh12 = (C51244sh1) aVar;
        return C46238a.m51546a(this.BaseRequest, sh12.BaseRequest) && C46238a.m51546a(this.f141512d, sh12.f141512d) && C46238a.m51546a(this.f141513e, sh12.f141513e) && C46238a.m51546a(this.f141514f, sh12.f141514f) && C46238a.m51546a(this.f141515g, sh12.f141515g) && C46238a.m51546a(this.f141516h, sh12.f141516h) && C46238a.m51546a(Long.valueOf(this.f141517i), Long.valueOf(sh12.f141517i)) && C46238a.m51546a(Integer.valueOf(this.f141518j), Integer.valueOf(sh12.f141518j));
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
            C49842ig0 ig02 = this.f141512d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141512d.writeFields(aVar);
            }
            String str = this.f141513e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f141514f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f141515g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f141516h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74321h(7, this.f141517i);
            aVar.mo74318e(8, this.f141518j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141512d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str5 = this.f141513e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f141514f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            String str7 = this.f141515g;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f141516h;
            if (str8 != null) {
                i2 += C52418a.m58683j(6, str8);
            }
            return i2 + C52418a.m58681h(7, this.f141517i) + C52418a.m58678e(8, this.f141518j);
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
            C51244sh1 sh12 = objArr[1];
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
                        sh12.BaseRequest = iaVar3;
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
                        sh12.f141512d = ig04;
                    }
                    return 0;
                case 3:
                    sh12.f141513e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sh12.f141514f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sh12.f141515g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sh12.f141516h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sh12.f141517i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    sh12.f141518j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
