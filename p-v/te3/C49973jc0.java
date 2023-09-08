package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jc0 */
public class C49973jc0 extends C101820nt3 {

    /* renamed from: d */
    public int f136006d;

    /* renamed from: e */
    public String f136007e;

    /* renamed from: f */
    public float f136008f;

    /* renamed from: g */
    public float f136009g;

    /* renamed from: h */
    public int f136010h;

    /* renamed from: i */
    public String f136011i;

    /* renamed from: j */
    public String f136012j;

    /* renamed from: n */
    public int f136013n;

    /* renamed from: o */
    public String f136014o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49973jc0)) {
            return false;
        }
        C49973jc0 jc02 = (C49973jc0) aVar;
        return C46238a.m51546a(this.BaseRequest, jc02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f136006d), Integer.valueOf(jc02.f136006d)) && C46238a.m51546a(this.f136007e, jc02.f136007e) && C46238a.m51546a(Float.valueOf(this.f136008f), Float.valueOf(jc02.f136008f)) && C46238a.m51546a(Float.valueOf(this.f136009g), Float.valueOf(jc02.f136009g)) && C46238a.m51546a(Integer.valueOf(this.f136010h), Integer.valueOf(jc02.f136010h)) && C46238a.m51546a(this.f136011i, jc02.f136011i) && C46238a.m51546a(this.f136012j, jc02.f136012j) && C46238a.m51546a(Integer.valueOf(this.f136013n), Integer.valueOf(jc02.f136013n)) && C46238a.m51546a(this.f136014o, jc02.f136014o);
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
            aVar.mo74318e(2, this.f136006d);
            String str = this.f136007e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74317d(4, this.f136008f);
            aVar.mo74317d(5, this.f136009g);
            aVar.mo74318e(6, this.f136010h);
            String str2 = this.f136011i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f136012j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f136013n);
            String str4 = this.f136014o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136006d);
            String str5 = this.f136007e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int d = e + C52418a.m58677d(4, this.f136008f) + C52418a.m58677d(5, this.f136009g) + C52418a.m58678e(6, this.f136010h);
            String str6 = this.f136011i;
            if (str6 != null) {
                d += C52418a.m58683j(7, str6);
            }
            String str7 = this.f136012j;
            if (str7 != null) {
                d += C52418a.m58683j(8, str7);
            }
            int e2 = d + C52418a.m58678e(9, this.f136013n);
            String str8 = this.f136014o;
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
            C49973jc0 jc02 = objArr[1];
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
                        jc02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jc02.f136006d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jc02.f136007e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jc02.f136008f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    jc02.f136009g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    jc02.f136010h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jc02.f136011i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jc02.f136012j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jc02.f136013n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jc02.f136014o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
