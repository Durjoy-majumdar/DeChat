package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qu3 */
public class C77988qu3 extends C101820nt3 {

    /* renamed from: d */
    public String f228133d;

    /* renamed from: e */
    public int f228134e;

    /* renamed from: f */
    public int f228135f;

    /* renamed from: g */
    public int f228136g;

    /* renamed from: h */
    public String f228137h;

    /* renamed from: i */
    public String f228138i;

    /* renamed from: j */
    public int f228139j;

    /* renamed from: n */
    public long f228140n;

    /* renamed from: o */
    public String f228141o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77988qu3)) {
            return false;
        }
        C77988qu3 qu32 = (C77988qu3) aVar;
        return C46238a.m51546a(this.BaseRequest, qu32.BaseRequest) && C46238a.m51546a(this.f228133d, qu32.f228133d) && C46238a.m51546a(Integer.valueOf(this.f228134e), Integer.valueOf(qu32.f228134e)) && C46238a.m51546a(Integer.valueOf(this.f228135f), Integer.valueOf(qu32.f228135f)) && C46238a.m51546a(Integer.valueOf(this.f228136g), Integer.valueOf(qu32.f228136g)) && C46238a.m51546a(this.f228137h, qu32.f228137h) && C46238a.m51546a(this.f228138i, qu32.f228138i) && C46238a.m51546a(Integer.valueOf(this.f228139j), Integer.valueOf(qu32.f228139j)) && C46238a.m51546a(Long.valueOf(this.f228140n), Long.valueOf(qu32.f228140n)) && C46238a.m51546a(this.f228141o, qu32.f228141o);
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
            String str = this.f228133d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f228134e);
            aVar.mo74318e(4, this.f228135f);
            aVar.mo74318e(5, this.f228136g);
            String str2 = this.f228137h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f228138i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f228139j);
            aVar.mo74321h(9, this.f228140n);
            String str4 = this.f228141o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f228133d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f228134e) + C52418a.m58678e(4, this.f228135f) + C52418a.m58678e(5, this.f228136g);
            String str6 = this.f228137h;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            String str7 = this.f228138i;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int e2 = e + C52418a.m58678e(8, this.f228139j) + C52418a.m58681h(9, this.f228140n);
            String str8 = this.f228141o;
            return str8 != null ? e2 + C52418a.m58683j(10, str8) : e2;
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
            C77988qu3 qu32 = objArr[1];
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
                        qu32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qu32.f228133d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qu32.f228134e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qu32.f228135f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qu32.f228136g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qu32.f228137h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qu32.f228138i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    qu32.f228139j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    qu32.f228140n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    qu32.f228141o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
