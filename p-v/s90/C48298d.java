package s90;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s90.d */
public class C48298d extends C47465a {

    /* renamed from: d */
    public String f129330d;

    /* renamed from: e */
    public String f129331e;

    /* renamed from: f */
    public String f129332f;

    /* renamed from: g */
    public C48297c f129333g;

    /* renamed from: h */
    public C48296b f129334h;

    /* renamed from: i */
    public String f129335i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48298d)) {
            return false;
        }
        C48298d dVar = (C48298d) aVar;
        return C46238a.m51546a(this.f129330d, dVar.f129330d) && C46238a.m51546a(this.f129331e, dVar.f129331e) && C46238a.m51546a(this.f129332f, dVar.f129332f) && C46238a.m51546a(this.f129333g, dVar.f129333g) && C46238a.m51546a(this.f129334h, dVar.f129334h) && C46238a.m51546a(this.f129335i, dVar.f129335i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f129330d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f129331e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f129332f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C48297c cVar = this.f129333g;
            if (cVar != null) {
                aVar.mo74322i(4, cVar.computeSize());
                this.f129333g.writeFields(aVar);
            }
            C48296b bVar = this.f129334h;
            if (bVar != null) {
                aVar.mo74322i(5, bVar.computeSize());
                this.f129334h.writeFields(aVar);
            }
            String str4 = this.f129335i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f129330d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f129331e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f129332f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            C48297c cVar2 = this.f129333g;
            if (cVar2 != null) {
                i2 += C52418a.m58682i(4, cVar2.computeSize());
            }
            C48296b bVar2 = this.f129334h;
            if (bVar2 != null) {
                i2 += C52418a.m58682i(5, bVar2.computeSize());
            }
            String str8 = this.f129335i;
            return str8 != null ? i2 + C52418a.m58683j(6, str8) : i2;
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
            C48298d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dVar.f129330d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dVar.f129331e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dVar.f129332f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48297c cVar3 = new C48297c();
                        if (bArr != null && bArr.length > 0) {
                            cVar3.parseFrom(bArr);
                        }
                        dVar.f129333g = cVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48296b bVar3 = new C48296b();
                        if (bArr2 != null && bArr2.length > 0) {
                            bVar3.parseFrom(bArr2);
                        }
                        dVar.f129334h = bVar3;
                    }
                    return 0;
                case 6:
                    dVar.f129335i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
