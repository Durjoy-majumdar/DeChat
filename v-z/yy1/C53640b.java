package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.b */
public class C53640b extends C47465a {

    /* renamed from: d */
    public String f150681d;

    /* renamed from: e */
    public String f150682e;

    /* renamed from: f */
    public String f150683f;

    /* renamed from: g */
    public int f150684g;

    /* renamed from: h */
    public String f150685h;

    /* renamed from: i */
    public C53650l f150686i;

    /* renamed from: j */
    public int f150687j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53640b)) {
            return false;
        }
        C53640b bVar = (C53640b) aVar;
        return C46238a.m51546a(this.f150681d, bVar.f150681d) && C46238a.m51546a(this.f150682e, bVar.f150682e) && C46238a.m51546a(this.f150683f, bVar.f150683f) && C46238a.m51546a(Integer.valueOf(this.f150684g), Integer.valueOf(bVar.f150684g)) && C46238a.m51546a(this.f150685h, bVar.f150685h) && C46238a.m51546a(this.f150686i, bVar.f150686i) && C46238a.m51546a(Integer.valueOf(this.f150687j), Integer.valueOf(bVar.f150687j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f150681d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f150682e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f150683f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.f150684g);
                String str4 = this.f150685h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                C53650l lVar = this.f150686i;
                if (lVar != null) {
                    aVar.mo74322i(6, lVar.computeSize());
                    this.f150686i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f150687j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            String str5 = this.f150681d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f150682e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f150683f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f150684g);
            String str8 = this.f150685h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            C53650l lVar2 = this.f150686i;
            if (lVar2 != null) {
                e += C52418a.m58682i(6, lVar2.computeSize());
            }
            return e + C52418a.m58678e(7, this.f150687j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f150681d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C53640b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f150681d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bVar.f150682e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bVar.f150683f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f150684g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bVar.f150685h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C53650l lVar3 = new C53650l();
                        if (bArr != null && bArr.length > 0) {
                            lVar3.parseFrom(bArr);
                        }
                        bVar.f150686i = lVar3;
                    }
                    return 0;
                case 7:
                    bVar.f150687j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
