package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class rs4 extends C47465a {

    /* renamed from: d */
    public String f141116d;

    /* renamed from: e */
    public long f141117e;

    /* renamed from: f */
    public String f141118f;

    /* renamed from: g */
    public String f141119g;

    /* renamed from: h */
    public String f141120h;

    /* renamed from: i */
    public C89349b f141121i;

    /* renamed from: j */
    public LinkedList<et4> f141122j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rs4)) {
            return false;
        }
        rs4 rs4 = (rs4) aVar;
        return C46238a.m51546a(this.f141116d, rs4.f141116d) && C46238a.m51546a(Long.valueOf(this.f141117e), Long.valueOf(rs4.f141117e)) && C46238a.m51546a(this.f141118f, rs4.f141118f) && C46238a.m51546a(this.f141119g, rs4.f141119g) && C46238a.m51546a(this.f141120h, rs4.f141120h) && C46238a.m51546a(this.f141121i, rs4.f141121i) && C46238a.m51546a(this.f141122j, rs4.f141122j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141116d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f141117e);
            String str2 = this.f141118f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141119g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141120h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C89349b bVar = this.f141121i;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            aVar.mo74320g(7, 8, this.f141122j);
            return 0;
        } else if (i == 1) {
            String str5 = this.f141116d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int h = i2 + C52418a.m58681h(2, this.f141117e);
            String str6 = this.f141118f;
            if (str6 != null) {
                h += C52418a.m58683j(3, str6);
            }
            String str7 = this.f141119g;
            if (str7 != null) {
                h += C52418a.m58683j(4, str7);
            }
            String str8 = this.f141120h;
            if (str8 != null) {
                h += C52418a.m58683j(5, str8);
            }
            C89349b bVar2 = this.f141121i;
            if (bVar2 != null) {
                h += C52418a.m58675b(6, bVar2);
            }
            return h + C52418a.m58680g(7, 8, this.f141122j);
        } else if (i == 2) {
            this.f141122j.clear();
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
            rs4 rs4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rs4.f141116d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rs4.f141117e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    rs4.f141118f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rs4.f141119g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rs4.f141120h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rs4.f141121i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        et4 et4 = new et4();
                        if (bArr != null && bArr.length > 0) {
                            et4.parseFrom(bArr);
                        }
                        rs4.f141122j.add(et4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
