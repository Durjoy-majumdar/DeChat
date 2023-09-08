package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.u */
public class C47536u extends C47465a {

    /* renamed from: d */
    public String f127539d;

    /* renamed from: e */
    public int f127540e;

    /* renamed from: f */
    public int f127541f;

    /* renamed from: g */
    public int f127542g;

    /* renamed from: h */
    public long f127543h;

    /* renamed from: i */
    public long f127544i;

    /* renamed from: j */
    public long f127545j;

    /* renamed from: n */
    public LinkedList<C47537w> f127546n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C47537w> f127547o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47536u)) {
            return false;
        }
        C47536u uVar = (C47536u) aVar;
        return C46238a.m51546a(this.f127539d, uVar.f127539d) && C46238a.m51546a(Integer.valueOf(this.f127540e), Integer.valueOf(uVar.f127540e)) && C46238a.m51546a(Integer.valueOf(this.f127541f), Integer.valueOf(uVar.f127541f)) && C46238a.m51546a(Integer.valueOf(this.f127542g), Integer.valueOf(uVar.f127542g)) && C46238a.m51546a(Long.valueOf(this.f127543h), Long.valueOf(uVar.f127543h)) && C46238a.m51546a(Long.valueOf(this.f127544i), Long.valueOf(uVar.f127544i)) && C46238a.m51546a(Long.valueOf(this.f127545j), Long.valueOf(uVar.f127545j)) && C46238a.m51546a(this.f127546n, uVar.f127546n) && C46238a.m51546a(this.f127547o, uVar.f127547o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127539d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f127540e);
                aVar.mo74318e(3, this.f127541f);
                aVar.mo74318e(4, this.f127542g);
                aVar.mo74321h(5, this.f127543h);
                aVar.mo74321h(6, this.f127544i);
                aVar.mo74321h(7, this.f127545j);
                aVar.mo74320g(8, 8, this.f127546n);
                aVar.mo74320g(9, 8, this.f127547o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            String str2 = this.f127539d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f127540e) + C52418a.m58678e(3, this.f127541f) + C52418a.m58678e(4, this.f127542g) + C52418a.m58681h(5, this.f127543h) + C52418a.m58681h(6, this.f127544i) + C52418a.m58681h(7, this.f127545j) + C52418a.m58680g(8, 8, this.f127546n) + C52418a.m58680g(9, 8, this.f127547o);
        } else if (i == 2) {
            this.f127546n.clear();
            this.f127547o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127539d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47536u uVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uVar.f127539d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uVar.f127540e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uVar.f127541f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uVar.f127542g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uVar.f127543h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    uVar.f127544i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    uVar.f127545j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47537w wVar = new C47537w();
                        if (bArr != null && bArr.length > 0) {
                            wVar.parseFrom(bArr);
                        }
                        uVar.f127546n.add(wVar);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47537w wVar2 = new C47537w();
                        if (bArr2 != null && bArr2.length > 0) {
                            wVar2.parseFrom(bArr2);
                        }
                        uVar.f127547o.add(wVar2);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
