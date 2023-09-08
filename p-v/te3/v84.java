package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v84 extends C47465a {

    /* renamed from: d */
    public String f299654d;

    /* renamed from: e */
    public long f299655e = 0;

    /* renamed from: f */
    public long f299656f = 0;

    /* renamed from: g */
    public long f299657g = 0;

    /* renamed from: h */
    public LinkedList<e74> f299658h = new LinkedList<>();

    /* renamed from: i */
    public String f299659i;

    /* renamed from: j */
    public String f299660j;

    /* renamed from: n */
    public String f299661n;

    /* renamed from: o */
    public String f299662o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v84)) {
            return false;
        }
        v84 v84 = (v84) aVar;
        return C46238a.m51546a(this.f299654d, v84.f299654d) && C46238a.m51546a(Long.valueOf(this.f299655e), Long.valueOf(v84.f299655e)) && C46238a.m51546a(Long.valueOf(this.f299656f), Long.valueOf(v84.f299656f)) && C46238a.m51546a(Long.valueOf(this.f299657g), Long.valueOf(v84.f299657g)) && C46238a.m51546a(this.f299658h, v84.f299658h) && C46238a.m51546a(this.f299659i, v84.f299659i) && C46238a.m51546a(this.f299660j, v84.f299660j) && C46238a.m51546a(this.f299661n, v84.f299661n) && C46238a.m51546a(this.f299662o, v84.f299662o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299654d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f299655e);
            aVar.mo74321h(3, this.f299656f);
            aVar.mo74321h(4, this.f299657g);
            aVar.mo74320g(5, 8, this.f299658h);
            String str2 = this.f299659i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f299660j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f299661n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f299662o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f299654d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int h = i2 + C52418a.m58681h(2, this.f299655e) + C52418a.m58681h(3, this.f299656f) + C52418a.m58681h(4, this.f299657g) + C52418a.m58680g(5, 8, this.f299658h);
            String str7 = this.f299659i;
            if (str7 != null) {
                h += C52418a.m58683j(6, str7);
            }
            String str8 = this.f299660j;
            if (str8 != null) {
                h += C52418a.m58683j(7, str8);
            }
            String str9 = this.f299661n;
            if (str9 != null) {
                h += C52418a.m58683j(8, str9);
            }
            String str10 = this.f299662o;
            return str10 != null ? h + C52418a.m58683j(9, str10) : h;
        } else if (i == 2) {
            this.f299658h.clear();
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
            v84 v84 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v84.f299654d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    v84.f299655e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    v84.f299656f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    v84.f299657g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        e74 e74 = new e74();
                        if (bArr != null && bArr.length > 0) {
                            e74.parseFrom(bArr);
                        }
                        v84.f299658h.add(e74);
                    }
                    return 0;
                case 6:
                    v84.f299659i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    v84.f299660j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v84.f299661n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    v84.f299662o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
