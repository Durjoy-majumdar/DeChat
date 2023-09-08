package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xp2 */
public class C64836xp2 extends C47465a {

    /* renamed from: d */
    public String f186369d;

    /* renamed from: e */
    public String f186370e;

    /* renamed from: f */
    public String f186371f;

    /* renamed from: g */
    public C64414h71 f186372g;

    /* renamed from: h */
    public long f186373h;

    /* renamed from: i */
    public boolean f186374i;

    /* renamed from: j */
    public int f186375j;

    /* renamed from: n */
    public long f186376n;

    /* renamed from: o */
    public String f186377o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64836xp2)) {
            return false;
        }
        C64836xp2 xp22 = (C64836xp2) aVar;
        return C46238a.m51546a(this.f186369d, xp22.f186369d) && C46238a.m51546a(this.f186370e, xp22.f186370e) && C46238a.m51546a(this.f186371f, xp22.f186371f) && C46238a.m51546a(this.f186372g, xp22.f186372g) && C46238a.m51546a(Long.valueOf(this.f186373h), Long.valueOf(xp22.f186373h)) && C46238a.m51546a(Boolean.valueOf(this.f186374i), Boolean.valueOf(xp22.f186374i)) && C46238a.m51546a(Integer.valueOf(this.f186375j), Integer.valueOf(xp22.f186375j)) && C46238a.m51546a(Long.valueOf(this.f186376n), Long.valueOf(xp22.f186376n)) && C46238a.m51546a(this.f186377o, xp22.f186377o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186369d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186370e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186371f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C64414h71 h712 = this.f186372g;
            if (h712 != null) {
                aVar.mo74322i(4, h712.computeSize());
                this.f186372g.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f186373h);
            aVar.mo74314a(6, this.f186374i);
            aVar.mo74318e(7, this.f186375j);
            aVar.mo74321h(8, this.f186376n);
            String str4 = this.f186377o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f186369d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186370e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f186371f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            C64414h71 h713 = this.f186372g;
            if (h713 != null) {
                i2 += C52418a.m58682i(4, h713.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f186373h) + C52418a.m58674a(6, this.f186374i) + C52418a.m58678e(7, this.f186375j) + C52418a.m58681h(8, this.f186376n);
            String str8 = this.f186377o;
            return str8 != null ? h + C52418a.m58683j(9, str8) : h;
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
            C64836xp2 xp22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xp22.f186369d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xp22.f186370e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xp22.f186371f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64414h71 h714 = new C64414h71();
                        if (bArr != null && bArr.length > 0) {
                            h714.parseFrom(bArr);
                        }
                        xp22.f186372g = h714;
                    }
                    return 0;
                case 5:
                    xp22.f186373h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    xp22.f186374i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    xp22.f186375j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    xp22.f186376n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    xp22.f186377o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
