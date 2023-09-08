package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ig3 */
public class C49843ig3 extends C101820nt3 {

    /* renamed from: d */
    public je4 f135325d;

    /* renamed from: e */
    public boolean f135326e;

    /* renamed from: f */
    public int f135327f;

    /* renamed from: g */
    public int f135328g;

    /* renamed from: h */
    public String f135329h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49843ig3)) {
            return false;
        }
        C49843ig3 ig32 = (C49843ig3) aVar;
        return C46238a.m51546a(this.BaseRequest, ig32.BaseRequest) && C46238a.m51546a(this.f135325d, ig32.f135325d) && C46238a.m51546a(Boolean.valueOf(this.f135326e), Boolean.valueOf(ig32.f135326e)) && C46238a.m51546a(Integer.valueOf(this.f135327f), Integer.valueOf(ig32.f135327f)) && C46238a.m51546a(Integer.valueOf(this.f135328g), Integer.valueOf(ig32.f135328g)) && C46238a.m51546a(this.f135329h, ig32.f135329h);
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
            je4 je4 = this.f135325d;
            if (je4 != null) {
                aVar.mo74322i(2, je4.computeSize());
                this.f135325d.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f135326e);
            aVar.mo74318e(4, this.f135327f);
            aVar.mo74318e(5, this.f135328g);
            String str = this.f135329h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            je4 je42 = this.f135325d;
            if (je42 != null) {
                i2 += C52418a.m58682i(2, je42.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f135326e) + C52418a.m58678e(4, this.f135327f) + C52418a.m58678e(5, this.f135328g);
            String str2 = this.f135329h;
            return str2 != null ? a + C52418a.m58683j(6, str2) : a;
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
            C49843ig3 ig32 = objArr[1];
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
                        ig32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        je4 je43 = new je4();
                        if (bArr2 != null && bArr2.length > 0) {
                            je43.parseFrom(bArr2);
                        }
                        ig32.f135325d = je43;
                    }
                    return 0;
                case 3:
                    ig32.f135326e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    ig32.f135327f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ig32.f135328g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ig32.f135329h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
