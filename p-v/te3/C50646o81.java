package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o81 */
public class C50646o81 extends C47465a {

    /* renamed from: d */
    public String f139017d;

    /* renamed from: e */
    public int f139018e;

    /* renamed from: f */
    public String f139019f;

    /* renamed from: g */
    public String f139020g;

    /* renamed from: h */
    public long f139021h;

    /* renamed from: i */
    public String f139022i;

    /* renamed from: j */
    public C49521g61 f139023j;

    /* renamed from: n */
    public int f139024n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50646o81)) {
            return false;
        }
        C50646o81 o812 = (C50646o81) aVar;
        return C46238a.m51546a(this.f139017d, o812.f139017d) && C46238a.m51546a(Integer.valueOf(this.f139018e), Integer.valueOf(o812.f139018e)) && C46238a.m51546a(this.f139019f, o812.f139019f) && C46238a.m51546a(this.f139020g, o812.f139020g) && C46238a.m51546a(Long.valueOf(this.f139021h), Long.valueOf(o812.f139021h)) && C46238a.m51546a(this.f139022i, o812.f139022i) && C46238a.m51546a(this.f139023j, o812.f139023j) && C46238a.m51546a(Integer.valueOf(this.f139024n), Integer.valueOf(o812.f139024n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139017d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f139018e);
            String str2 = this.f139019f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139020g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74321h(5, this.f139021h);
            String str4 = this.f139022i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C49521g61 g612 = this.f139023j;
            if (g612 != null) {
                aVar.mo74322i(7, g612.computeSize());
                this.f139023j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f139024n);
            return 0;
        } else if (i == 1) {
            String str5 = this.f139017d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f139018e);
            String str6 = this.f139019f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f139020g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int h = e + C52418a.m58681h(5, this.f139021h);
            String str8 = this.f139022i;
            if (str8 != null) {
                h += C52418a.m58683j(6, str8);
            }
            C49521g61 g613 = this.f139023j;
            if (g613 != null) {
                h += C52418a.m58682i(7, g613.computeSize());
            }
            return h + C52418a.m58678e(8, this.f139024n);
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
            C50646o81 o812 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o812.f139017d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o812.f139018e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o812.f139019f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o812.f139020g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o812.f139021h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    o812.f139022i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49521g61 g614 = new C49521g61();
                        if (bArr != null && bArr.length > 0) {
                            g614.parseFrom(bArr);
                        }
                        o812.f139023j = g614;
                    }
                    return 0;
                case 8:
                    o812.f139024n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
