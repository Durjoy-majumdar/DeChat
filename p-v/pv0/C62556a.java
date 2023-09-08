package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.a */
public class C62556a extends C47465a {

    /* renamed from: d */
    public String f177663d;

    /* renamed from: e */
    public long f177664e;

    /* renamed from: f */
    public int f177665f;

    /* renamed from: g */
    public LinkedList<C62558c> f177666g = new LinkedList<>();

    /* renamed from: h */
    public long f177667h;

    /* renamed from: i */
    public int f177668i;

    /* renamed from: j */
    public long f177669j;

    /* renamed from: n */
    public LinkedList<C62557b> f177670n = new LinkedList<>();

    /* renamed from: o */
    public int f177671o;

    /* renamed from: p */
    public long f177672p;

    /* renamed from: q */
    public LinkedList<C62557b> f177673q = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62556a)) {
            return false;
        }
        C62556a aVar2 = (C62556a) aVar;
        return C46238a.m51546a(this.f177663d, aVar2.f177663d) && C46238a.m51546a(Long.valueOf(this.f177664e), Long.valueOf(aVar2.f177664e)) && C46238a.m51546a(Integer.valueOf(this.f177665f), Integer.valueOf(aVar2.f177665f)) && C46238a.m51546a(this.f177666g, aVar2.f177666g) && C46238a.m51546a(Long.valueOf(this.f177667h), Long.valueOf(aVar2.f177667h)) && C46238a.m51546a(Integer.valueOf(this.f177668i), Integer.valueOf(aVar2.f177668i)) && C46238a.m51546a(Long.valueOf(this.f177669j), Long.valueOf(aVar2.f177669j)) && C46238a.m51546a(this.f177670n, aVar2.f177670n) && C46238a.m51546a(Integer.valueOf(this.f177671o), Integer.valueOf(aVar2.f177671o)) && C46238a.m51546a(Long.valueOf(this.f177672p), Long.valueOf(aVar2.f177672p)) && C46238a.m51546a(this.f177673q, aVar2.f177673q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f177663d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f177664e);
                aVar.mo74318e(3, this.f177665f);
                aVar.mo74320g(4, 8, this.f177666g);
                aVar.mo74321h(5, this.f177667h);
                aVar.mo74318e(6, this.f177668i);
                aVar.mo74321h(7, this.f177669j);
                aVar.mo74320g(8, 8, this.f177670n);
                aVar.mo74318e(9, this.f177671o);
                aVar.mo74321h(10, this.f177672p);
                aVar.mo74320g(11, 8, this.f177673q);
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceName");
        } else if (i2 == 1) {
            String str2 = this.f177663d;
            return (str2 != null ? 0 + C52418a.m58683j(1, str2) : 0) + C52418a.m58681h(2, this.f177664e) + C52418a.m58678e(3, this.f177665f) + C52418a.m58680g(4, 8, this.f177666g) + C52418a.m58681h(5, this.f177667h) + C52418a.m58678e(6, this.f177668i) + C52418a.m58681h(7, this.f177669j) + C52418a.m58680g(8, 8, this.f177670n) + C52418a.m58678e(9, this.f177671o) + C52418a.m58681h(10, this.f177672p) + C52418a.m58680g(11, 8, this.f177673q);
        } else if (i2 == 2) {
            this.f177666g.clear();
            this.f177670n.clear();
            this.f177673q.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177663d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceName");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62556a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    aVar4.f177663d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    aVar4.f177664e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    aVar4.f177665f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C62558c cVar = new C62558c();
                        if (bArr != null && bArr.length > 0) {
                            cVar.parseFrom(bArr);
                        }
                        aVar4.f177666g.add(cVar);
                    }
                    return 0;
                case 5:
                    aVar4.f177667h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    aVar4.f177668i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    aVar4.f177669j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C62557b bVar = new C62557b();
                        if (bArr2 != null && bArr2.length > 0) {
                            bVar.parseFrom(bArr2);
                        }
                        aVar4.f177670n.add(bVar);
                    }
                    return 0;
                case 9:
                    aVar4.f177671o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    aVar4.f177672p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C62557b bVar2 = new C62557b();
                        if (bArr3 != null && bArr3.length > 0) {
                            bVar2.parseFrom(bArr3);
                        }
                        aVar4.f177673q.add(bVar2);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
