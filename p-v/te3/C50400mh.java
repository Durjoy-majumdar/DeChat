package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mh */
public class C50400mh extends C101820nt3 {

    /* renamed from: d */
    public long f138024d;

    /* renamed from: e */
    public int f138025e;

    /* renamed from: f */
    public String f138026f;

    /* renamed from: g */
    public String f138027g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50400mh)) {
            return false;
        }
        C50400mh mhVar = (C50400mh) aVar;
        return C46238a.m51546a(this.BaseRequest, mhVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f138024d), Long.valueOf(mhVar.f138024d)) && C46238a.m51546a(Integer.valueOf(this.f138025e), Integer.valueOf(mhVar.f138025e)) && C46238a.m51546a(this.f138026f, mhVar.f138026f) && C46238a.m51546a(this.f138027g, mhVar.f138027g);
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
            aVar.mo74321h(2, this.f138024d);
            aVar.mo74318e(3, this.f138025e);
            String str = this.f138026f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f138027g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f138024d) + C52418a.m58678e(3, this.f138025e);
            String str3 = this.f138026f;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            String str4 = this.f138027g;
            return str4 != null ? h + C52418a.m58683j(5, str4) : h;
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
            C50400mh mhVar = objArr[1];
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
                    mhVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mhVar.f138024d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                mhVar.f138025e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mhVar.f138026f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mhVar.f138027g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
