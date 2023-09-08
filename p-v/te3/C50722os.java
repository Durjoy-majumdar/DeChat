package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.os */
public class C50722os extends C101820nt3 {

    /* renamed from: d */
    public String f139342d;

    /* renamed from: e */
    public String f139343e;

    /* renamed from: f */
    public String f139344f;

    /* renamed from: g */
    public String f139345g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50722os)) {
            return false;
        }
        C50722os osVar = (C50722os) aVar;
        return C46238a.m51546a(this.BaseRequest, osVar.BaseRequest) && C46238a.m51546a(this.f139342d, osVar.f139342d) && C46238a.m51546a(this.f139343e, osVar.f139343e) && C46238a.m51546a(this.f139344f, osVar.f139344f) && C46238a.m51546a(this.f139345g, osVar.f139345g);
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
            String str = this.f139342d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139343e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139344f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f139345g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f139342d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f139343e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f139344f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f139345g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C50722os osVar = objArr[1];
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
                    osVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                osVar.f139342d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                osVar.f139343e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                osVar.f139344f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                osVar.f139345g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
