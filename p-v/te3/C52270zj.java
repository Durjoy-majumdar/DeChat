package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zj */
public class C52270zj extends C101820nt3 {

    /* renamed from: d */
    public C77925f4 f145990d;

    /* renamed from: e */
    public String f145991e;

    /* renamed from: f */
    public int f145992f;

    /* renamed from: g */
    public int f145993g;

    /* renamed from: h */
    public long f145994h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52270zj)) {
            return false;
        }
        C52270zj zjVar = (C52270zj) aVar;
        return C46238a.m51546a(this.BaseRequest, zjVar.BaseRequest) && C46238a.m51546a(this.f145990d, zjVar.f145990d) && C46238a.m51546a(this.f145991e, zjVar.f145991e) && C46238a.m51546a(Integer.valueOf(this.f145992f), Integer.valueOf(zjVar.f145992f)) && C46238a.m51546a(Integer.valueOf(this.f145993g), Integer.valueOf(zjVar.f145993g)) && C46238a.m51546a(Long.valueOf(this.f145994h), Long.valueOf(zjVar.f145994h));
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
            C77925f4 f4Var = this.f145990d;
            if (f4Var != null) {
                aVar.mo74322i(2, f4Var.computeSize());
                this.f145990d.writeFields(aVar);
            }
            String str = this.f145991e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f145992f);
            aVar.mo74318e(5, this.f145993g);
            aVar.mo74321h(6, this.f145994h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C77925f4 f4Var2 = this.f145990d;
            if (f4Var2 != null) {
                i2 += C52418a.m58682i(2, f4Var2.computeSize());
            }
            String str2 = this.f145991e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58678e(4, this.f145992f) + C52418a.m58678e(5, this.f145993g) + C52418a.m58681h(6, this.f145994h);
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
            C52270zj zjVar = objArr[1];
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
                        zjVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77925f4 f4Var3 = new C77925f4();
                        if (bArr2 != null && bArr2.length > 0) {
                            f4Var3.parseFrom(bArr2);
                        }
                        zjVar.f145990d = f4Var3;
                    }
                    return 0;
                case 3:
                    zjVar.f145991e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zjVar.f145992f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zjVar.f145993g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zjVar.f145994h = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
