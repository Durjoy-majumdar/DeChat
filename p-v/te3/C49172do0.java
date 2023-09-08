package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.do0 */
public class C49172do0 extends C101820nt3 {

    /* renamed from: d */
    public String f132441d;

    /* renamed from: e */
    public C49946j51 f132442e;

    /* renamed from: f */
    public String f132443f;

    /* renamed from: g */
    public int f132444g;

    /* renamed from: h */
    public int f132445h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49172do0)) {
            return false;
        }
        C49172do0 do02 = (C49172do0) aVar;
        return C46238a.m51546a(this.BaseRequest, do02.BaseRequest) && C46238a.m51546a(this.f132441d, do02.f132441d) && C46238a.m51546a(this.f132442e, do02.f132442e) && C46238a.m51546a(this.f132443f, do02.f132443f) && C46238a.m51546a(Integer.valueOf(this.f132444g), Integer.valueOf(do02.f132444g)) && C46238a.m51546a(Integer.valueOf(this.f132445h), Integer.valueOf(do02.f132445h));
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
            String str = this.f132441d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49946j51 j512 = this.f132442e;
            if (j512 != null) {
                aVar.mo74322i(3, j512.computeSize());
                this.f132442e.writeFields(aVar);
            }
            String str2 = this.f132443f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f132444g);
            aVar.mo74318e(6, this.f132445h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132441d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C49946j51 j513 = this.f132442e;
            if (j513 != null) {
                i2 += C52418a.m58682i(3, j513.computeSize());
            }
            String str4 = this.f132443f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            return i2 + C52418a.m58678e(5, this.f132444g) + C52418a.m58678e(6, this.f132445h);
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
            C49172do0 do02 = objArr[1];
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
                        do02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    do02.f132441d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49946j51 j514 = new C49946j51();
                        if (bArr2 != null && bArr2.length > 0) {
                            j514.parseFrom(bArr2);
                        }
                        do02.f132442e = j514;
                    }
                    return 0;
                case 4:
                    do02.f132443f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    do02.f132444g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    do02.f132445h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
