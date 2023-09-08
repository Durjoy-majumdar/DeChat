package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class en4 extends C101820nt3 {

    /* renamed from: d */
    public int f183008d;

    /* renamed from: e */
    public int f183009e;

    /* renamed from: f */
    public int f183010f;

    /* renamed from: g */
    public C51018qv3 f183011g;

    /* renamed from: h */
    public String f183012h;

    /* renamed from: i */
    public String f183013i;

    /* renamed from: j */
    public C51018qv3 f183014j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof en4)) {
            return false;
        }
        en4 en4 = (en4) aVar;
        return C46238a.m51546a(this.BaseRequest, en4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f183008d), Integer.valueOf(en4.f183008d)) && C46238a.m51546a(Integer.valueOf(this.f183009e), Integer.valueOf(en4.f183009e)) && C46238a.m51546a(Integer.valueOf(this.f183010f), Integer.valueOf(en4.f183010f)) && C46238a.m51546a(this.f183011g, en4.f183011g) && C46238a.m51546a(this.f183012h, en4.f183012h) && C46238a.m51546a(this.f183013i, en4.f183013i) && C46238a.m51546a(this.f183014j, en4.f183014j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f183011g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f183008d);
                aVar.mo74318e(3, this.f183009e);
                aVar.mo74318e(4, this.f183010f);
                C51018qv3 qv32 = this.f183011g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f183011g.writeFields(aVar);
                }
                String str = this.f183012h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                String str2 = this.f183013i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                C51018qv3 qv33 = this.f183014j;
                if (qv33 != null) {
                    aVar.mo74322i(8, qv33.computeSize());
                    this.f183014j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f183008d) + C52418a.m58678e(3, this.f183009e) + C52418a.m58678e(4, this.f183010f);
            C51018qv3 qv34 = this.f183011g;
            if (qv34 != null) {
                e += C52418a.m58682i(5, qv34.computeSize());
            }
            String str3 = this.f183012h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f183013i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            C51018qv3 qv35 = this.f183014j;
            return qv35 != null ? e + C52418a.m58682i(8, qv35.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f183011g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            en4 en4 = objArr[1];
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
                        en4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    en4.f183008d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    en4.f183009e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    en4.f183010f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        en4.f183011g = qv36;
                    }
                    return 0;
                case 6:
                    en4.f183012h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    en4.f183013i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        en4.f183014j = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
