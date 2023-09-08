package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.h */
public class C53646h extends C101820nt3 {

    /* renamed from: d */
    public String f150696d;

    /* renamed from: e */
    public String f150697e;

    /* renamed from: f */
    public int f150698f;

    /* renamed from: g */
    public C89349b f150699g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53646h)) {
            return false;
        }
        C53646h hVar = (C53646h) aVar;
        return C46238a.m51546a(this.BaseRequest, hVar.BaseRequest) && C46238a.m51546a(this.f150696d, hVar.f150696d) && C46238a.m51546a(this.f150697e, hVar.f150697e) && C46238a.m51546a(Integer.valueOf(this.f150698f), Integer.valueOf(hVar.f150698f)) && C46238a.m51546a(this.f150699g, hVar.f150699g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f150697e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f150696d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f150697e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f150698f);
                C89349b bVar = this.f150699g;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: to_username");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f150696d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f150697e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f150698f);
            C89349b bVar2 = this.f150699g;
            return bVar2 != null ? e + C52418a.m58675b(5, bVar2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f150697e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: to_username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C53646h hVar = objArr[1];
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
                    hVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hVar.f150696d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hVar.f150697e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                hVar.f150698f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                hVar.f150699g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
