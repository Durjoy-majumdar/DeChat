package x10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: x10.e */
public class C53281e extends C101820nt3 {

    /* renamed from: d */
    public String f148868d;

    /* renamed from: e */
    public int f148869e;

    /* renamed from: f */
    public int f148870f;

    /* renamed from: g */
    public int f148871g;

    /* renamed from: h */
    public String f148872h;

    /* renamed from: i */
    public String f148873i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53281e)) {
            return false;
        }
        C53281e eVar = (C53281e) aVar;
        return C46238a.m51546a(this.BaseRequest, eVar.BaseRequest) && C46238a.m51546a(this.f148868d, eVar.f148868d) && C46238a.m51546a(Integer.valueOf(this.f148869e), Integer.valueOf(eVar.f148869e)) && C46238a.m51546a(Integer.valueOf(this.f148870f), Integer.valueOf(eVar.f148870f)) && C46238a.m51546a(Integer.valueOf(this.f148871g), Integer.valueOf(eVar.f148871g)) && C46238a.m51546a(this.f148872h, eVar.f148872h) && C46238a.m51546a(this.f148873i, eVar.f148873i);
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
            String str = this.f148868d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f148869e);
            aVar.mo74318e(4, this.f148870f);
            aVar.mo74318e(5, this.f148871g);
            String str2 = this.f148872h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f148873i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f148868d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f148869e) + C52418a.m58678e(4, this.f148870f) + C52418a.m58678e(5, this.f148871g);
            String str5 = this.f148872h;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f148873i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
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
            C53281e eVar = objArr[1];
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
                        eVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    eVar.f148868d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eVar.f148869e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    eVar.f148870f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    eVar.f148871g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    eVar.f148872h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eVar.f148873i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
