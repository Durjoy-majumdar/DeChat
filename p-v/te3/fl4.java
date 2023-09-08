package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class fl4 extends C101820nt3 {

    /* renamed from: d */
    public String f133581d;

    /* renamed from: e */
    public String f133582e;

    /* renamed from: f */
    public C48702af f133583f;

    /* renamed from: g */
    public C48702af f133584g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fl4)) {
            return false;
        }
        fl4 fl4 = (fl4) aVar;
        return C46238a.m51546a(this.BaseRequest, fl4.BaseRequest) && C46238a.m51546a(this.f133581d, fl4.f133581d) && C46238a.m51546a(this.f133582e, fl4.f133582e) && C46238a.m51546a(this.f133583f, fl4.f133583f) && C46238a.m51546a(this.f133584g, fl4.f133584g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133581d == null) {
                throw new C52419b("Not all required fields were included: brand_user_name");
            } else if (this.f133582e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f133581d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133582e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                C48702af afVar = this.f133583f;
                if (afVar != null) {
                    aVar.mo74322i(4, afVar.computeSize());
                    this.f133583f.writeFields(aVar);
                }
                C48702af afVar2 = this.f133584g;
                if (afVar2 != null) {
                    aVar.mo74322i(5, afVar2.computeSize());
                    this.f133584g.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: bizchat_id");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f133581d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f133582e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C48702af afVar3 = this.f133583f;
            if (afVar3 != null) {
                i2 += C52418a.m58682i(4, afVar3.computeSize());
            }
            C48702af afVar4 = this.f133584g;
            return afVar4 != null ? i2 + C52418a.m58682i(5, afVar4.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133581d == null) {
                throw new C52419b("Not all required fields were included: brand_user_name");
            } else if (this.f133582e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: bizchat_id");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            fl4 fl4 = objArr[1];
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
                    fl4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fl4.f133581d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fl4.f133582e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48702af afVar5 = new C48702af();
                    if (bArr2 != null && bArr2.length > 0) {
                        afVar5.parseFrom(bArr2);
                    }
                    fl4.f133583f = afVar5;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48702af afVar6 = new C48702af();
                    if (bArr3 != null && bArr3.length > 0) {
                        afVar6.parseFrom(bArr3);
                    }
                    fl4.f133584g = afVar6;
                }
                return 0;
            }
        }
    }
}
