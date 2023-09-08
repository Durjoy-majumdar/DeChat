package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.f */
public class C77823f extends C47465a {

    /* renamed from: d */
    public String f226736d;

    /* renamed from: e */
    public String f226737e;

    /* renamed from: f */
    public String f226738f;

    /* renamed from: g */
    public String f226739g;

    /* renamed from: h */
    public String f226740h;

    /* renamed from: i */
    public int f226741i;

    /* renamed from: j */
    public C77822e f226742j;

    /* renamed from: n */
    public C89349b f226743n;

    /* renamed from: o */
    public C89349b f226744o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77823f)) {
            return false;
        }
        C77823f fVar = (C77823f) aVar;
        return C46238a.m51546a(this.f226736d, fVar.f226736d) && C46238a.m51546a(this.f226737e, fVar.f226737e) && C46238a.m51546a(this.f226738f, fVar.f226738f) && C46238a.m51546a(this.f226739g, fVar.f226739g) && C46238a.m51546a(this.f226740h, fVar.f226740h) && C46238a.m51546a(Integer.valueOf(this.f226741i), Integer.valueOf(fVar.f226741i)) && C46238a.m51546a(this.f226742j, fVar.f226742j) && C46238a.m51546a(this.f226743n, fVar.f226743n) && C46238a.m51546a(this.f226744o, fVar.f226744o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226736d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226737e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f226738f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f226739g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f226740h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f226741i);
            C77822e eVar = this.f226742j;
            if (eVar != null) {
                aVar.mo74322i(7, eVar.computeSize());
                this.f226742j.writeFields(aVar);
            }
            C89349b bVar = this.f226743n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            C89349b bVar2 = this.f226744o;
            if (bVar2 != null) {
                aVar.mo74315b(9, bVar2);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f226736d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f226737e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f226738f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f226739g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f226740h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            int e = i2 + C52418a.m58678e(6, this.f226741i);
            C77822e eVar2 = this.f226742j;
            if (eVar2 != null) {
                e += C52418a.m58682i(7, eVar2.computeSize());
            }
            C89349b bVar3 = this.f226743n;
            if (bVar3 != null) {
                e += C52418a.m58675b(8, bVar3);
            }
            C89349b bVar4 = this.f226744o;
            return bVar4 != null ? e + C52418a.m58675b(9, bVar4) : e;
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
            C77823f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fVar.f226736d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fVar.f226737e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fVar.f226738f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fVar.f226739g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fVar.f226740h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fVar.f226741i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77822e eVar3 = new C77822e();
                        if (bArr != null && bArr.length > 0) {
                            eVar3.parseFrom(bArr);
                        }
                        fVar.f226742j = eVar3;
                    }
                    return 0;
                case 8:
                    fVar.f226743n = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    fVar.f226744o = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
