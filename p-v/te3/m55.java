package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m55 extends C101820nt3 {

    /* renamed from: d */
    public String f137852d;

    /* renamed from: e */
    public C89349b f137853e;

    /* renamed from: f */
    public String f137854f;

    /* renamed from: g */
    public String f137855g;

    /* renamed from: h */
    public int f137856h;

    /* renamed from: i */
    public C90422jy f137857i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m55)) {
            return false;
        }
        m55 m55 = (m55) aVar;
        return C46238a.m51546a(this.BaseRequest, m55.BaseRequest) && C46238a.m51546a(this.f137852d, m55.f137852d) && C46238a.m51546a(this.f137853e, m55.f137853e) && C46238a.m51546a(this.f137854f, m55.f137854f) && C46238a.m51546a(this.f137855g, m55.f137855g) && C46238a.m51546a(Integer.valueOf(this.f137856h), Integer.valueOf(m55.f137856h)) && C46238a.m51546a(this.f137857i, m55.f137857i);
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
            String str = this.f137852d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f137853e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f137854f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f137855g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f137856h);
            C90422jy jyVar = this.f137857i;
            if (jyVar != null) {
                aVar.mo74322i(7, jyVar.computeSize());
                this.f137857i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f137852d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f137853e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str5 = this.f137854f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f137855g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            int e = i2 + C52418a.m58678e(6, this.f137856h);
            C90422jy jyVar2 = this.f137857i;
            return jyVar2 != null ? e + C52418a.m58682i(7, jyVar2.computeSize()) : e;
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
            m55 m55 = objArr[1];
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
                        m55.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    m55.f137852d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m55.f137853e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    m55.f137854f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m55.f137855g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m55.f137856h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C90422jy jyVar3 = new C90422jy();
                        if (bArr2 != null && bArr2.length > 0) {
                            jyVar3.parseFrom(bArr2);
                        }
                        m55.f137857i = jyVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
