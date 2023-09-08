package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.us */
public class C51589us extends C101820nt3 {

    /* renamed from: d */
    public String f143057d;

    /* renamed from: e */
    public String f143058e;

    /* renamed from: f */
    public String f143059f;

    /* renamed from: g */
    public String f143060g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51589us)) {
            return false;
        }
        C51589us usVar = (C51589us) aVar;
        return C46238a.m51546a(this.BaseRequest, usVar.BaseRequest) && C46238a.m51546a(this.f143057d, usVar.f143057d) && C46238a.m51546a(this.f143058e, usVar.f143058e) && C46238a.m51546a(this.f143059f, usVar.f143059f) && C46238a.m51546a(this.f143060g, usVar.f143060g);
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
            String str = this.f143057d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143058e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143059f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f143060g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f143057d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143058e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f143059f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f143060g;
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
            C51589us usVar = objArr[1];
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
                    usVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                usVar.f143057d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                usVar.f143058e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                usVar.f143059f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                usVar.f143060g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
