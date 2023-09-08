package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ho3 */
public class C49733ho3 extends C47465a {

    /* renamed from: d */
    public String f134788d;

    /* renamed from: e */
    public int f134789e;

    /* renamed from: f */
    public int f134790f;

    /* renamed from: g */
    public String f134791g;

    /* renamed from: h */
    public String f134792h;

    /* renamed from: i */
    public String f134793i;

    /* renamed from: j */
    public C52214z40 f134794j;

    /* renamed from: n */
    public String f134795n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49733ho3)) {
            return false;
        }
        C49733ho3 ho32 = (C49733ho3) aVar;
        return C46238a.m51546a(this.f134788d, ho32.f134788d) && C46238a.m51546a(Integer.valueOf(this.f134789e), Integer.valueOf(ho32.f134789e)) && C46238a.m51546a(Integer.valueOf(this.f134790f), Integer.valueOf(ho32.f134790f)) && C46238a.m51546a(this.f134791g, ho32.f134791g) && C46238a.m51546a(this.f134792h, ho32.f134792h) && C46238a.m51546a(this.f134793i, ho32.f134793i) && C46238a.m51546a(this.f134794j, ho32.f134794j) && C46238a.m51546a(this.f134795n, ho32.f134795n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134788d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f134789e);
            aVar.mo74318e(3, this.f134790f);
            String str2 = this.f134791g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134792h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f134793i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C52214z40 z402 = this.f134794j;
            if (z402 != null) {
                aVar.mo74322i(7, z402.computeSize());
                this.f134794j.writeFields(aVar);
            }
            String str5 = this.f134795n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f134788d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f134789e) + C52418a.m58678e(3, this.f134790f);
            String str7 = this.f134791g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f134792h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f134793i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            C52214z40 z403 = this.f134794j;
            if (z403 != null) {
                e += C52418a.m58682i(7, z403.computeSize());
            }
            String str10 = this.f134795n;
            return str10 != null ? e + C52418a.m58683j(8, str10) : e;
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
            C49733ho3 ho32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ho32.f134788d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ho32.f134789e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ho32.f134790f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ho32.f134791g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ho32.f134792h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ho32.f134793i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52214z40 z404 = new C52214z40();
                        if (bArr != null && bArr.length > 0) {
                            z404.parseFrom(bArr);
                        }
                        ho32.f134794j = z404;
                    }
                    return 0;
                case 8:
                    ho32.f134795n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
