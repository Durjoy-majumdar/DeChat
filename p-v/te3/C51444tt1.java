package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tt1 */
public class C51444tt1 extends C101820nt3 {

    /* renamed from: d */
    public int f142396d;

    /* renamed from: e */
    public int f142397e;

    /* renamed from: f */
    public int f142398f;

    /* renamed from: g */
    public int f142399g;

    /* renamed from: h */
    public String f142400h;

    /* renamed from: i */
    public String f142401i;

    /* renamed from: j */
    public int f142402j;

    /* renamed from: n */
    public LinkedList<C51296st1> f142403n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C89349b> f142404o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51444tt1)) {
            return false;
        }
        C51444tt1 tt12 = (C51444tt1) aVar;
        return C46238a.m51546a(this.BaseRequest, tt12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f142396d), Integer.valueOf(tt12.f142396d)) && C46238a.m51546a(Integer.valueOf(this.f142397e), Integer.valueOf(tt12.f142397e)) && C46238a.m51546a(Integer.valueOf(this.f142398f), Integer.valueOf(tt12.f142398f)) && C46238a.m51546a(Integer.valueOf(this.f142399g), Integer.valueOf(tt12.f142399g)) && C46238a.m51546a(this.f142400h, tt12.f142400h) && C46238a.m51546a(this.f142401i, tt12.f142401i) && C46238a.m51546a(Integer.valueOf(this.f142402j), Integer.valueOf(tt12.f142402j)) && C46238a.m51546a(this.f142403n, tt12.f142403n) && C46238a.m51546a(this.f142404o, tt12.f142404o);
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
            aVar.mo74318e(2, this.f142396d);
            aVar.mo74318e(3, this.f142397e);
            aVar.mo74318e(4, this.f142398f);
            aVar.mo74318e(5, this.f142399g);
            String str = this.f142400h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f142401i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f142402j);
            aVar.mo74320g(9, 8, this.f142403n);
            aVar.mo74320g(10, 6, this.f142404o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142396d) + C52418a.m58678e(3, this.f142397e) + C52418a.m58678e(4, this.f142398f) + C52418a.m58678e(5, this.f142399g);
            String str3 = this.f142400h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f142401i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            return e + C52418a.m58678e(8, this.f142402j) + C52418a.m58680g(9, 8, this.f142403n) + C52418a.m58680g(10, 6, this.f142404o);
        } else if (i == 2) {
            this.f142403n.clear();
            this.f142404o.clear();
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
            C51444tt1 tt12 = objArr[1];
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
                        tt12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tt12.f142396d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tt12.f142397e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tt12.f142398f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tt12.f142399g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tt12.f142400h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tt12.f142401i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tt12.f142402j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51296st1 st12 = new C51296st1();
                        if (bArr2 != null && bArr2.length > 0) {
                            st12.parseFrom(bArr2);
                        }
                        tt12.f142403n.add(st12);
                    }
                    return 0;
                case 10:
                    tt12.f142404o.add(aVar3.mo141626d(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
