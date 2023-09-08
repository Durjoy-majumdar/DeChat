package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.no1 */
public class C50571no1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138697d;

    /* renamed from: e */
    public String f138698e;

    /* renamed from: f */
    public int f138699f;

    /* renamed from: g */
    public String f138700g;

    /* renamed from: h */
    public int f138701h;

    /* renamed from: i */
    public String f138702i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50571no1)) {
            return false;
        }
        C50571no1 no12 = (C50571no1) aVar;
        return C46238a.m51546a(this.BaseRequest, no12.BaseRequest) && C46238a.m51546a(this.f138697d, no12.f138697d) && C46238a.m51546a(this.f138698e, no12.f138698e) && C46238a.m51546a(Integer.valueOf(this.f138699f), Integer.valueOf(no12.f138699f)) && C46238a.m51546a(this.f138700g, no12.f138700g) && C46238a.m51546a(Integer.valueOf(this.f138701h), Integer.valueOf(no12.f138701h)) && C46238a.m51546a(this.f138702i, no12.f138702i);
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
            C49842ig0 ig02 = this.f138697d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138697d.writeFields(aVar);
            }
            String str = this.f138698e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f138699f);
            String str2 = this.f138700g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f138701h);
            String str3 = this.f138702i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138697d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f138698e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f138699f);
            String str5 = this.f138700g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f138701h);
            String str6 = this.f138702i;
            return str6 != null ? e2 + C52418a.m58683j(7, str6) : e2;
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
            C50571no1 no12 = objArr[1];
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
                        no12.BaseRequest = iaVar3;
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
                        no12.f138697d = ig04;
                    }
                    return 0;
                case 3:
                    no12.f138698e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    no12.f138699f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    no12.f138700g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    no12.f138701h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    no12.f138702i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
