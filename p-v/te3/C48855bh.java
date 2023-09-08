package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bh */
public class C48855bh extends C101820nt3 {

    /* renamed from: d */
    public String f131109d;

    /* renamed from: e */
    public int f131110e;

    /* renamed from: f */
    public C89349b f131111f;

    /* renamed from: g */
    public int f131112g;

    /* renamed from: h */
    public long f131113h;

    /* renamed from: i */
    public int f131114i;

    /* renamed from: j */
    public int f131115j;

    /* renamed from: n */
    public String f131116n;

    /* renamed from: o */
    public int f131117o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48855bh)) {
            return false;
        }
        C48855bh bhVar = (C48855bh) aVar;
        return C46238a.m51546a(this.BaseRequest, bhVar.BaseRequest) && C46238a.m51546a(this.f131109d, bhVar.f131109d) && C46238a.m51546a(Integer.valueOf(this.f131110e), Integer.valueOf(bhVar.f131110e)) && C46238a.m51546a(this.f131111f, bhVar.f131111f) && C46238a.m51546a(Integer.valueOf(this.f131112g), Integer.valueOf(bhVar.f131112g)) && C46238a.m51546a(Long.valueOf(this.f131113h), Long.valueOf(bhVar.f131113h)) && C46238a.m51546a(Integer.valueOf(this.f131114i), Integer.valueOf(bhVar.f131114i)) && C46238a.m51546a(Integer.valueOf(this.f131115j), Integer.valueOf(bhVar.f131115j)) && C46238a.m51546a(this.f131116n, bhVar.f131116n) && C46238a.m51546a(Integer.valueOf(this.f131117o), Integer.valueOf(bhVar.f131117o));
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
            String str = this.f131109d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f131110e);
            C89349b bVar = this.f131111f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f131112g);
            aVar.mo74321h(6, this.f131113h);
            aVar.mo74318e(7, this.f131114i);
            aVar.mo74318e(8, this.f131115j);
            String str2 = this.f131116n;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            aVar.mo74318e(13, this.f131117o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f131109d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f131110e);
            C89349b bVar2 = this.f131111f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            int e2 = e + C52418a.m58678e(5, this.f131112g) + C52418a.m58681h(6, this.f131113h) + C52418a.m58678e(7, this.f131114i) + C52418a.m58678e(8, this.f131115j);
            String str4 = this.f131116n;
            if (str4 != null) {
                e2 += C52418a.m58683j(12, str4);
            }
            return e2 + C52418a.m58678e(13, this.f131117o);
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
            C48855bh bhVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 12) {
                bhVar.f131116n = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 13) {
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
                            bhVar.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        bhVar.f131109d = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        bhVar.f131110e = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        bhVar.f131111f = aVar3.mo141626d(intValue);
                        return 0;
                    case 5:
                        bhVar.f131112g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        bhVar.f131113h = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        bhVar.f131114i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        bhVar.f131115j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                bhVar.f131117o = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
