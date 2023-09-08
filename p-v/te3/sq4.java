package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class sq4 extends C101820nt3 {

    /* renamed from: d */
    public nt4 f185438d;

    /* renamed from: e */
    public int f185439e;

    /* renamed from: f */
    public int f185440f;

    /* renamed from: g */
    public String f185441g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sq4)) {
            return false;
        }
        sq4 sq4 = (sq4) aVar;
        return C46238a.m51546a(this.BaseRequest, sq4.BaseRequest) && C46238a.m51546a(this.f185438d, sq4.f185438d) && C46238a.m51546a(Integer.valueOf(this.f185439e), Integer.valueOf(sq4.f185439e)) && C46238a.m51546a(Integer.valueOf(this.f185440f), Integer.valueOf(sq4.f185440f)) && C46238a.m51546a(this.f185441g, sq4.f185441g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185438d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                nt4 nt4 = this.f185438d;
                if (nt4 != null) {
                    aVar.mo74322i(2, nt4.computeSize());
                    this.f185438d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f185439e);
                aVar.mo74318e(4, this.f185440f);
                String str = this.f185441g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Piece");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            nt4 nt42 = this.f185438d;
            if (nt42 != null) {
                i2 += C52418a.m58682i(2, nt42.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f185439e) + C52418a.m58678e(4, this.f185440f);
            String str2 = this.f185441g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185438d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Piece");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            sq4 sq4 = objArr[1];
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
                    sq4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    nt4 nt43 = new nt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nt43.parseFrom(bArr2);
                    }
                    sq4.f185438d = nt43;
                }
                return 0;
            } else if (intValue == 3) {
                sq4.f185439e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                sq4.f185440f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sq4.f185441g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
