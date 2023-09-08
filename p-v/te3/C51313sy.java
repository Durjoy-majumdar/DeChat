package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sy */
public class C51313sy extends C47465a {

    /* renamed from: d */
    public String f141820d;

    /* renamed from: e */
    public String f141821e;

    /* renamed from: f */
    public long f141822f;

    /* renamed from: g */
    public int f141823g;

    /* renamed from: h */
    public int f141824h;

    /* renamed from: i */
    public LinkedList<C51612uy> f141825i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51313sy)) {
            return false;
        }
        C51313sy syVar = (C51313sy) aVar;
        return C46238a.m51546a(this.f141820d, syVar.f141820d) && C46238a.m51546a(this.f141821e, syVar.f141821e) && C46238a.m51546a(Long.valueOf(this.f141822f), Long.valueOf(syVar.f141822f)) && C46238a.m51546a(Integer.valueOf(this.f141823g), Integer.valueOf(syVar.f141823g)) && C46238a.m51546a(Integer.valueOf(this.f141824h), Integer.valueOf(syVar.f141824h)) && C46238a.m51546a(this.f141825i, syVar.f141825i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141820d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141821e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f141822f);
            aVar.mo74318e(4, this.f141823g);
            aVar.mo74318e(5, this.f141824h);
            aVar.mo74320g(6, 8, this.f141825i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f141820d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f141821e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f141822f) + C52418a.m58678e(4, this.f141823g) + C52418a.m58678e(5, this.f141824h) + C52418a.m58680g(6, 8, this.f141825i);
        } else if (i == 2) {
            this.f141825i.clear();
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
            C51313sy syVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    syVar.f141820d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    syVar.f141821e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    syVar.f141822f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    syVar.f141823g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    syVar.f141824h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51612uy uyVar = new C51612uy();
                        if (bArr != null && bArr.length > 0) {
                            uyVar.parseFrom(bArr);
                        }
                        syVar.f141825i.add(uyVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
