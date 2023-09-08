package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tc3 */
public class C77998tc3 extends C101820nt3 {

    /* renamed from: d */
    public String f228232d;

    /* renamed from: e */
    public String f228233e;

    /* renamed from: f */
    public C89349b f228234f;

    /* renamed from: g */
    public int f228235g;

    /* renamed from: h */
    public int f228236h;

    /* renamed from: i */
    public int f228237i;

    /* renamed from: j */
    public C77963l1 f228238j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77998tc3)) {
            return false;
        }
        C77998tc3 tc32 = (C77998tc3) aVar;
        return C46238a.m51546a(this.BaseRequest, tc32.BaseRequest) && C46238a.m51546a(this.f228232d, tc32.f228232d) && C46238a.m51546a(this.f228233e, tc32.f228233e) && C46238a.m51546a(this.f228234f, tc32.f228234f) && C46238a.m51546a(Integer.valueOf(this.f228235g), Integer.valueOf(tc32.f228235g)) && C46238a.m51546a(Integer.valueOf(this.f228236h), Integer.valueOf(tc32.f228236h)) && C46238a.m51546a(Integer.valueOf(this.f228237i), Integer.valueOf(tc32.f228237i)) && C46238a.m51546a(this.f228238j, tc32.f228238j);
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
            String str = this.f228232d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f228233e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C89349b bVar = this.f228234f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f228235g);
            aVar.mo74318e(6, this.f228236h);
            aVar.mo74318e(7, this.f228237i);
            C77963l1 l1Var = this.f228238j;
            if (l1Var != null) {
                aVar.mo74322i(8, l1Var.computeSize());
                this.f228238j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f228232d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f228233e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f228234f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            int e = i2 + C52418a.m58678e(5, this.f228235g) + C52418a.m58678e(6, this.f228236h) + C52418a.m58678e(7, this.f228237i);
            C77963l1 l1Var2 = this.f228238j;
            return l1Var2 != null ? e + C52418a.m58682i(8, l1Var2.computeSize()) : e;
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
            C77998tc3 tc32 = objArr[1];
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
                        tc32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tc32.f228232d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tc32.f228233e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tc32.f228234f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    tc32.f228235g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tc32.f228236h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tc32.f228237i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        tc32.f228238j = l1Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
