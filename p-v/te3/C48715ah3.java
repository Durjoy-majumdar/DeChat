package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ah3 */
public class C48715ah3 extends C101820nt3 {

    /* renamed from: d */
    public String f130532d;

    /* renamed from: e */
    public long f130533e;

    /* renamed from: f */
    public int f130534f;

    /* renamed from: g */
    public String f130535g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48715ah3)) {
            return false;
        }
        C48715ah3 ah32 = (C48715ah3) aVar;
        return C46238a.m51546a(this.BaseRequest, ah32.BaseRequest) && C46238a.m51546a(this.f130532d, ah32.f130532d) && C46238a.m51546a(Long.valueOf(this.f130533e), Long.valueOf(ah32.f130533e)) && C46238a.m51546a(Integer.valueOf(this.f130534f), Integer.valueOf(ah32.f130534f)) && C46238a.m51546a(this.f130535g, ah32.f130535g);
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
            String str = this.f130532d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f130533e);
            aVar.mo74318e(4, this.f130534f);
            String str2 = this.f130535g;
            if (str2 != null) {
                aVar.mo74323j(101, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f130532d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int h = i2 + C52418a.m58681h(3, this.f130533e) + C52418a.m58678e(4, this.f130534f);
            String str4 = this.f130535g;
            return str4 != null ? h + C52418a.m58683j(101, str4) : h;
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
            C48715ah3 ah32 = objArr[1];
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
                    ah32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ah32.f130532d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ah32.f130533e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                ah32.f130534f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 101) {
                return -1;
            } else {
                ah32.f130535g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
