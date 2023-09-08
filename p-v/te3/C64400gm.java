package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gm */
public class C64400gm extends C101820nt3 {

    /* renamed from: d */
    public C89349b f183345d;

    /* renamed from: e */
    public int f183346e;

    /* renamed from: f */
    public C89349b f183347f;

    /* renamed from: g */
    public int f183348g;

    /* renamed from: h */
    public int f183349h;

    /* renamed from: i */
    public int f183350i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64400gm)) {
            return false;
        }
        C64400gm gmVar = (C64400gm) aVar;
        return C46238a.m51546a(this.BaseRequest, gmVar.BaseRequest) && C46238a.m51546a(this.f183345d, gmVar.f183345d) && C46238a.m51546a(Integer.valueOf(this.f183346e), Integer.valueOf(gmVar.f183346e)) && C46238a.m51546a(this.f183347f, gmVar.f183347f) && C46238a.m51546a(Integer.valueOf(this.f183348g), Integer.valueOf(gmVar.f183348g)) && C46238a.m51546a(Integer.valueOf(this.f183349h), Integer.valueOf(gmVar.f183349h)) && C46238a.m51546a(Integer.valueOf(this.f183350i), Integer.valueOf(gmVar.f183350i));
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
            C89349b bVar = this.f183345d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f183346e);
            C89349b bVar2 = this.f183347f;
            if (bVar2 != null) {
                aVar.mo74315b(4, bVar2);
            }
            aVar.mo74318e(5, this.f183348g);
            aVar.mo74318e(6, this.f183349h);
            aVar.mo74318e(7, this.f183350i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar3 = this.f183345d;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            int e = i2 + C52418a.m58678e(3, this.f183346e);
            C89349b bVar4 = this.f183347f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            return e + C52418a.m58678e(5, this.f183348g) + C52418a.m58678e(6, this.f183349h) + C52418a.m58678e(7, this.f183350i);
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
            C64400gm gmVar = objArr[1];
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
                        gmVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gmVar.f183345d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    gmVar.f183346e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gmVar.f183347f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    gmVar.f183348g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gmVar.f183349h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gmVar.f183350i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
