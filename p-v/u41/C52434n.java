package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.n */
public class C52434n extends C101820nt3 {

    /* renamed from: d */
    public int f146529d;

    /* renamed from: e */
    public String f146530e;

    /* renamed from: f */
    public String f146531f;

    /* renamed from: g */
    public int f146532g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52434n)) {
            return false;
        }
        C52434n nVar = (C52434n) aVar;
        return C46238a.m51546a(this.BaseRequest, nVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f146529d), Integer.valueOf(nVar.f146529d)) && C46238a.m51546a(this.f146530e, nVar.f146530e) && C46238a.m51546a(this.f146531f, nVar.f146531f) && C46238a.m51546a(Integer.valueOf(this.f146532g), Integer.valueOf(nVar.f146532g));
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
            aVar.mo74318e(2, this.f146529d);
            String str = this.f146530e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f146531f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f146532g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146529d);
            String str3 = this.f146530e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f146531f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f146532g);
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
            C52434n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    nVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                nVar.f146529d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                nVar.f146530e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                nVar.f146531f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                nVar.f146532g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
