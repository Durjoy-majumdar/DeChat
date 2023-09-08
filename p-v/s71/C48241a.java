package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.a */
public class C48241a extends C48249i {

    /* renamed from: e */
    public C89349b f129235e;

    /* renamed from: f */
    public int f129236f;

    /* renamed from: g */
    public int f129237g;

    /* renamed from: h */
    public int f129238h;

    /* renamed from: i */
    public C89349b f129239i;

    /* renamed from: j */
    public C89349b f129240j;

    /* renamed from: n */
    public String f129241n;

    /* renamed from: o */
    public String f129242o;

    /* renamed from: p */
    public String f129243p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48241a)) {
            return false;
        }
        C48241a aVar2 = (C48241a) aVar;
        return C46238a.m51546a(this.f129266d, aVar2.f129266d) && C46238a.m51546a(this.f129235e, aVar2.f129235e) && C46238a.m51546a(Integer.valueOf(this.f129236f), Integer.valueOf(aVar2.f129236f)) && C46238a.m51546a(Integer.valueOf(this.f129237g), Integer.valueOf(aVar2.f129237g)) && C46238a.m51546a(Integer.valueOf(this.f129238h), Integer.valueOf(aVar2.f129238h)) && C46238a.m51546a(this.f129239i, aVar2.f129239i) && C46238a.m51546a(this.f129240j, aVar2.f129240j) && C46238a.m51546a(this.f129241n, aVar2.f129241n) && C46238a.m51546a(this.f129242o, aVar2.f129242o) && C46238a.m51546a(this.f129243p, aVar2.f129243p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48244d dVar = this.f129266d;
            if (dVar != null) {
                aVar.mo74322i(1, dVar.computeSize());
                this.f129266d.writeFields(aVar);
            }
            C89349b bVar = this.f129235e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f129236f);
            aVar.mo74318e(4, this.f129237g);
            aVar.mo74318e(5, this.f129238h);
            C89349b bVar2 = this.f129239i;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            C89349b bVar3 = this.f129240j;
            if (bVar3 != null) {
                aVar.mo74315b(7, bVar3);
            }
            String str = this.f129241n;
            if (str != null) {
                aVar.mo74323j(10, str);
            }
            String str2 = this.f129242o;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            String str3 = this.f129243p;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            return 0;
        } else if (i == 1) {
            C48244d dVar2 = this.f129266d;
            if (dVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dVar2.computeSize());
            }
            C89349b bVar4 = this.f129235e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            int e = i2 + C52418a.m58678e(3, this.f129236f) + C52418a.m58678e(4, this.f129237g) + C52418a.m58678e(5, this.f129238h);
            C89349b bVar5 = this.f129239i;
            if (bVar5 != null) {
                e += C52418a.m58675b(6, bVar5);
            }
            C89349b bVar6 = this.f129240j;
            if (bVar6 != null) {
                e += C52418a.m58675b(7, bVar6);
            }
            String str4 = this.f129241n;
            if (str4 != null) {
                e += C52418a.m58683j(10, str4);
            }
            String str5 = this.f129242o;
            if (str5 != null) {
                e += C52418a.m58683j(11, str5);
            }
            String str6 = this.f129243p;
            return str6 != null ? e + C52418a.m58683j(12, str6) : e;
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
            C48241a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48244d dVar3 = new C48244d();
                        if (bArr != null && bArr.length > 0) {
                            dVar3.parseFrom(bArr);
                        }
                        aVar4.f129266d = dVar3;
                    }
                    return 0;
                case 2:
                    aVar4.f129235e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    aVar4.f129236f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    aVar4.f129237g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    aVar4.f129238h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    aVar4.f129239i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    aVar4.f129240j = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    aVar4.f129241n = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    aVar4.f129242o = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    aVar4.f129243p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
