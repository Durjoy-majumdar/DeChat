package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.e */
public class C77822e extends C47465a {

    /* renamed from: d */
    public String f226730d;

    /* renamed from: e */
    public String f226731e;

    /* renamed from: f */
    public int f226732f;

    /* renamed from: g */
    public String f226733g;

    /* renamed from: h */
    public String f226734h;

    /* renamed from: i */
    public C77824g f226735i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77822e)) {
            return false;
        }
        C77822e eVar = (C77822e) aVar;
        return C46238a.m51546a(this.f226730d, eVar.f226730d) && C46238a.m51546a(this.f226731e, eVar.f226731e) && C46238a.m51546a(Integer.valueOf(this.f226732f), Integer.valueOf(eVar.f226732f)) && C46238a.m51546a(this.f226733g, eVar.f226733g) && C46238a.m51546a(this.f226734h, eVar.f226734h) && C46238a.m51546a(this.f226735i, eVar.f226735i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226730d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226731e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f226732f);
            String str3 = this.f226733g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f226734h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C77824g gVar = this.f226735i;
            if (gVar != null) {
                aVar.mo74322i(6, gVar.computeSize());
                this.f226735i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f226730d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f226731e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f226732f);
            String str7 = this.f226733g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f226734h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            C77824g gVar2 = this.f226735i;
            return gVar2 != null ? e + C52418a.m58682i(6, gVar2.computeSize()) : e;
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
            C77822e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eVar.f226730d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    eVar.f226731e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eVar.f226732f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    eVar.f226733g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eVar.f226734h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77824g gVar3 = new C77824g();
                        if (bArr != null && bArr.length > 0) {
                            gVar3.parseFrom(bArr);
                        }
                        eVar.f226735i = gVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
