package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.a */
public class C77818a extends C47465a {

    /* renamed from: d */
    public String f226694d;

    /* renamed from: e */
    public String f226695e;

    /* renamed from: f */
    public int f226696f;

    /* renamed from: g */
    public String f226697g;

    /* renamed from: h */
    public C77824g f226698h;

    /* renamed from: i */
    public String f226699i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77818a)) {
            return false;
        }
        C77818a aVar2 = (C77818a) aVar;
        return C46238a.m51546a(this.f226694d, aVar2.f226694d) && C46238a.m51546a(this.f226695e, aVar2.f226695e) && C46238a.m51546a(Integer.valueOf(this.f226696f), Integer.valueOf(aVar2.f226696f)) && C46238a.m51546a(this.f226697g, aVar2.f226697g) && C46238a.m51546a(this.f226698h, aVar2.f226698h) && C46238a.m51546a(this.f226699i, aVar2.f226699i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226694d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226695e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f226696f);
            String str3 = this.f226697g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C77824g gVar = this.f226698h;
            if (gVar != null) {
                aVar.mo74322i(5, gVar.computeSize());
                this.f226698h.writeFields(aVar);
            }
            String str4 = this.f226699i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f226694d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f226695e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f226696f);
            String str7 = this.f226697g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            C77824g gVar2 = this.f226698h;
            if (gVar2 != null) {
                e += C52418a.m58682i(5, gVar2.computeSize());
            }
            String str8 = this.f226699i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C77818a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    aVar4.f226694d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    aVar4.f226695e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    aVar4.f226696f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    aVar4.f226697g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77824g gVar3 = new C77824g();
                        if (bArr != null && bArr.length > 0) {
                            gVar3.parseFrom(bArr);
                        }
                        aVar4.f226698h = gVar3;
                    }
                    return 0;
                case 6:
                    aVar4.f226699i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
