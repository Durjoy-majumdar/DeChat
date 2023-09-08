package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ck2 */
public class C49014ck2 extends C101820nt3 {

    /* renamed from: d */
    public String f131795d;

    /* renamed from: e */
    public LinkedList<String> f131796e = new LinkedList<>();

    /* renamed from: f */
    public int f131797f;

    /* renamed from: g */
    public int f131798g;

    /* renamed from: h */
    public w55 f131799h;

    /* renamed from: i */
    public boolean f131800i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49014ck2)) {
            return false;
        }
        C49014ck2 ck22 = (C49014ck2) aVar;
        return C46238a.m51546a(this.BaseRequest, ck22.BaseRequest) && C46238a.m51546a(this.f131795d, ck22.f131795d) && C46238a.m51546a(this.f131796e, ck22.f131796e) && C46238a.m51546a(Integer.valueOf(this.f131797f), Integer.valueOf(ck22.f131797f)) && C46238a.m51546a(Integer.valueOf(this.f131798g), Integer.valueOf(ck22.f131798g)) && C46238a.m51546a(this.f131799h, ck22.f131799h) && C46238a.m51546a(Boolean.valueOf(this.f131800i), Boolean.valueOf(ck22.f131800i));
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
            String str = this.f131795d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f131796e);
            aVar.mo74318e(4, this.f131797f);
            aVar.mo74318e(5, this.f131798g);
            w55 w55 = this.f131799h;
            if (w55 != null) {
                aVar.mo74322i(6, w55.computeSize());
                this.f131799h.writeFields(aVar);
            }
            aVar.mo74314a(7, this.f131800i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131795d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f131796e) + C52418a.m58678e(4, this.f131797f) + C52418a.m58678e(5, this.f131798g);
            w55 w552 = this.f131799h;
            if (w552 != null) {
                g += C52418a.m58682i(6, w552.computeSize());
            }
            return g + C52418a.m58674a(7, this.f131800i);
        } else if (i == 2) {
            this.f131796e.clear();
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
            C49014ck2 ck22 = objArr[1];
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
                        ck22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ck22.f131795d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ck22.f131796e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    ck22.f131797f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ck22.f131798g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w55 w553 = new w55();
                        if (bArr2 != null && bArr2.length > 0) {
                            w553.parseFrom(bArr2);
                        }
                        ck22.f131799h = w553;
                    }
                    return 0;
                case 7:
                    ck22.f131800i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
