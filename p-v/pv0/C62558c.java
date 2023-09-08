package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.c */
public class C62558c extends C47465a {

    /* renamed from: d */
    public String f177676d;

    /* renamed from: e */
    public long f177677e;

    /* renamed from: f */
    public int f177678f;

    /* renamed from: g */
    public long f177679g;

    /* renamed from: h */
    public LinkedList<C62557b> f177680h = new LinkedList<>();

    /* renamed from: i */
    public int f177681i;

    /* renamed from: j */
    public long f177682j;

    /* renamed from: n */
    public LinkedList<C62557b> f177683n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62558c)) {
            return false;
        }
        C62558c cVar = (C62558c) aVar;
        return C46238a.m51546a(this.f177676d, cVar.f177676d) && C46238a.m51546a(Long.valueOf(this.f177677e), Long.valueOf(cVar.f177677e)) && C46238a.m51546a(Integer.valueOf(this.f177678f), Integer.valueOf(cVar.f177678f)) && C46238a.m51546a(Long.valueOf(this.f177679g), Long.valueOf(cVar.f177679g)) && C46238a.m51546a(this.f177680h, cVar.f177680h) && C46238a.m51546a(Integer.valueOf(this.f177681i), Integer.valueOf(cVar.f177681i)) && C46238a.m51546a(Long.valueOf(this.f177682j), Long.valueOf(cVar.f177682j)) && C46238a.m51546a(this.f177683n, cVar.f177683n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f177676d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f177677e);
                aVar.mo74318e(3, this.f177678f);
                aVar.mo74321h(4, this.f177679g);
                aVar.mo74320g(5, 8, this.f177680h);
                aVar.mo74318e(6, this.f177681i);
                aVar.mo74321h(7, this.f177682j);
                aVar.mo74320g(8, 8, this.f177683n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: SessionName");
        } else if (i == 1) {
            String str2 = this.f177676d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f177677e) + C52418a.m58678e(3, this.f177678f) + C52418a.m58681h(4, this.f177679g) + C52418a.m58680g(5, 8, this.f177680h) + C52418a.m58678e(6, this.f177681i) + C52418a.m58681h(7, this.f177682j) + C52418a.m58680g(8, 8, this.f177683n);
        } else if (i == 2) {
            this.f177680h.clear();
            this.f177683n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177676d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SessionName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62558c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f177676d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cVar.f177677e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    cVar.f177678f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cVar.f177679g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C62557b bVar = new C62557b();
                        if (bArr != null && bArr.length > 0) {
                            bVar.parseFrom(bArr);
                        }
                        cVar.f177680h.add(bVar);
                    }
                    return 0;
                case 6:
                    cVar.f177681i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cVar.f177682j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C62557b bVar2 = new C62557b();
                        if (bArr2 != null && bArr2.length > 0) {
                            bVar2.parseFrom(bArr2);
                        }
                        cVar.f177683n.add(bVar2);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
