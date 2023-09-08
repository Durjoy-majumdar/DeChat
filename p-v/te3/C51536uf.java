package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uf */
public class C51536uf extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f142820d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f142821e;

    /* renamed from: f */
    public int f142822f;

    /* renamed from: g */
    public int f142823g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51536uf)) {
            return false;
        }
        C51536uf ufVar = (C51536uf) aVar;
        return C46238a.m51546a(this.BaseRequest, ufVar.BaseRequest) && C46238a.m51546a(this.f142820d, ufVar.f142820d) && C46238a.m51546a(this.f142821e, ufVar.f142821e) && C46238a.m51546a(Integer.valueOf(this.f142822f), Integer.valueOf(ufVar.f142822f)) && C46238a.m51546a(Integer.valueOf(this.f142823g), Integer.valueOf(ufVar.f142823g));
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
            aVar.mo74320g(2, 1, this.f142820d);
            C89349b bVar = this.f142821e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f142822f);
            aVar.mo74318e(5, this.f142823g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f142820d);
            C89349b bVar2 = this.f142821e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f142822f) + C52418a.m58678e(5, this.f142823g);
        } else if (i == 2) {
            this.f142820d.clear();
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
            C51536uf ufVar = objArr[1];
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
                    ufVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ufVar.f142820d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                ufVar.f142821e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                ufVar.f142822f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ufVar.f142823g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
