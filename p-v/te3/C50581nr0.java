package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nr0 */
public class C50581nr0 extends C47465a {

    /* renamed from: d */
    public String f138724d;

    /* renamed from: e */
    public String f138725e;

    /* renamed from: f */
    public long f138726f;

    /* renamed from: g */
    public int f138727g;

    /* renamed from: h */
    public int f138728h;

    /* renamed from: i */
    public String f138729i;

    /* renamed from: j */
    public long f138730j;

    /* renamed from: n */
    public int f138731n;

    /* renamed from: o */
    public C50405mi0 f138732o;

    /* renamed from: p */
    public int f138733p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50581nr0)) {
            return false;
        }
        C50581nr0 nr02 = (C50581nr0) aVar;
        return C46238a.m51546a(this.f138724d, nr02.f138724d) && C46238a.m51546a(this.f138725e, nr02.f138725e) && C46238a.m51546a(Long.valueOf(this.f138726f), Long.valueOf(nr02.f138726f)) && C46238a.m51546a(Integer.valueOf(this.f138727g), Integer.valueOf(nr02.f138727g)) && C46238a.m51546a(Integer.valueOf(this.f138728h), Integer.valueOf(nr02.f138728h)) && C46238a.m51546a(this.f138729i, nr02.f138729i) && C46238a.m51546a(Long.valueOf(this.f138730j), Long.valueOf(nr02.f138730j)) && C46238a.m51546a(Integer.valueOf(this.f138731n), Integer.valueOf(nr02.f138731n)) && C46238a.m51546a(this.f138732o, nr02.f138732o) && C46238a.m51546a(Integer.valueOf(this.f138733p), Integer.valueOf(nr02.f138733p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138724d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138725e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f138726f);
            aVar.mo74318e(4, this.f138727g);
            aVar.mo74318e(5, this.f138728h);
            String str3 = this.f138729i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f138730j);
            aVar.mo74318e(8, this.f138731n);
            C50405mi0 mi02 = this.f138732o;
            if (mi02 != null) {
                aVar.mo74322i(9, mi02.computeSize());
                this.f138732o.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f138733p);
            return 0;
        } else if (i == 1) {
            String str4 = this.f138724d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f138725e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f138726f) + C52418a.m58678e(4, this.f138727g) + C52418a.m58678e(5, this.f138728h);
            String str6 = this.f138729i;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            int h2 = h + C52418a.m58681h(7, this.f138730j) + C52418a.m58678e(8, this.f138731n);
            C50405mi0 mi03 = this.f138732o;
            if (mi03 != null) {
                h2 += C52418a.m58682i(9, mi03.computeSize());
            }
            return h2 + C52418a.m58678e(10, this.f138733p);
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
            C50581nr0 nr02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nr02.f138724d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nr02.f138725e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nr02.f138726f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    nr02.f138727g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nr02.f138728h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nr02.f138729i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nr02.f138730j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    nr02.f138731n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50405mi0 mi04 = new C50405mi0();
                        if (bArr != null && bArr.length > 0) {
                            mi04.parseFrom(bArr);
                        }
                        nr02.f138732o = mi04;
                    }
                    return 0;
                case 10:
                    nr02.f138733p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
