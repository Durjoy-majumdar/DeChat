package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lf */
public class C50254lf extends C47465a {

    /* renamed from: d */
    public LinkedList<ey4> f137368d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f137369e = new LinkedList<>();

    /* renamed from: f */
    public String f137370f;

    /* renamed from: g */
    public String f137371g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50254lf)) {
            return false;
        }
        C50254lf lfVar = (C50254lf) aVar;
        return C46238a.m51546a(this.f137368d, lfVar.f137368d) && C46238a.m51546a(this.f137369e, lfVar.f137369e) && C46238a.m51546a(this.f137370f, lfVar.f137370f) && C46238a.m51546a(this.f137371g, lfVar.f137371g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(15, 8, this.f137368d);
            aVar.mo74320g(17, 1, this.f137369e);
            String str = this.f137370f;
            if (str != null) {
                aVar.mo74323j(18, str);
            }
            String str2 = this.f137371g;
            if (str2 != null) {
                aVar.mo74323j(19, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(15, 8, this.f137368d) + 0 + C52418a.m58680g(17, 1, this.f137369e);
            String str3 = this.f137370f;
            if (str3 != null) {
                g += C52418a.m58683j(18, str3);
            }
            String str4 = this.f137371g;
            return str4 != null ? g + C52418a.m58683j(19, str4) : g;
        } else if (i == 2) {
            this.f137368d.clear();
            this.f137369e.clear();
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
            C50254lf lfVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 15:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ey4 ey4 = new ey4();
                        if (bArr != null && bArr.length > 0) {
                            ey4.parseFrom(bArr);
                        }
                        lfVar.f137368d.add(ey4);
                    }
                    return 0;
                case 17:
                    lfVar.f137369e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 18:
                    lfVar.f137370f = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    lfVar.f137371g = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
