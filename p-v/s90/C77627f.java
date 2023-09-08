package s90;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s90.f */
public class C77627f extends C47465a {

    /* renamed from: d */
    public int f226290d;

    /* renamed from: e */
    public String f226291e;

    /* renamed from: f */
    public String f226292f;

    /* renamed from: g */
    public String f226293g;

    /* renamed from: h */
    public String f226294h;

    /* renamed from: i */
    public LinkedList<C77630j> f226295i = new LinkedList<>();

    /* renamed from: j */
    public int f226296j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77627f)) {
            return false;
        }
        C77627f fVar = (C77627f) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f226290d), Integer.valueOf(fVar.f226290d)) && C46238a.m51546a(this.f226291e, fVar.f226291e) && C46238a.m51546a(this.f226292f, fVar.f226292f) && C46238a.m51546a(this.f226293g, fVar.f226293g) && C46238a.m51546a(this.f226294h, fVar.f226294h) && C46238a.m51546a(this.f226295i, fVar.f226295i) && C46238a.m51546a(Integer.valueOf(this.f226296j), Integer.valueOf(fVar.f226296j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f226290d);
            String str = this.f226291e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f226292f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f226293g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f226294h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74320g(6, 8, this.f226295i);
            aVar.mo74318e(7, this.f226296j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f226290d) + 0;
            String str5 = this.f226291e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f226292f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f226293g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f226294h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58680g(6, 8, this.f226295i) + C52418a.m58678e(7, this.f226296j);
        } else if (i == 2) {
            this.f226295i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77627f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fVar.f226290d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    fVar.f226291e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fVar.f226292f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fVar.f226293g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fVar.f226294h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C77630j jVar = new C77630j();
                        if (bArr != null && bArr.length > 0) {
                            jVar.parseFrom(bArr);
                        }
                        fVar.f226295i.add(jVar);
                    }
                    return 0;
                case 7:
                    fVar.f226296j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
