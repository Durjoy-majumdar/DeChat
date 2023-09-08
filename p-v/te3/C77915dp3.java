package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dp3 */
public class C77915dp3 extends C47465a {

    /* renamed from: d */
    public String f227153d;

    /* renamed from: e */
    public String f227154e;

    /* renamed from: f */
    public LinkedList<C101834rc0> f227155f = new LinkedList<>();

    /* renamed from: g */
    public String f227156g;

    /* renamed from: h */
    public C77911cd0 f227157h;

    /* renamed from: i */
    public long f227158i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77915dp3)) {
            return false;
        }
        C77915dp3 dp32 = (C77915dp3) aVar;
        return C46238a.m51546a(this.f227153d, dp32.f227153d) && C46238a.m51546a(this.f227154e, dp32.f227154e) && C46238a.m51546a(this.f227155f, dp32.f227155f) && C46238a.m51546a(this.f227156g, dp32.f227156g) && C46238a.m51546a(this.f227157h, dp32.f227157h) && C46238a.m51546a(Long.valueOf(this.f227158i), Long.valueOf(dp32.f227158i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227153d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227154e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f227155f);
            String str3 = this.f227156g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C77911cd0 cd02 = this.f227157h;
            if (cd02 != null) {
                aVar.mo74322i(5, cd02.computeSize());
                this.f227157h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f227158i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f227153d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f227154e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f227155f);
            String str6 = this.f227156g;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            C77911cd0 cd03 = this.f227157h;
            if (cd03 != null) {
                g += C52418a.m58682i(5, cd03.computeSize());
            }
            return g + C52418a.m58681h(6, this.f227158i);
        } else if (i == 2) {
            this.f227155f.clear();
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
            C77915dp3 dp32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dp32.f227153d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dp32.f227154e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101834rc0 rc02 = new C101834rc0();
                        if (bArr != null && bArr.length > 0) {
                            rc02.parseFrom(bArr);
                        }
                        dp32.f227155f.add(rc02);
                    }
                    return 0;
                case 4:
                    dp32.f227156g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77911cd0 cd04 = new C77911cd0();
                        if (bArr2 != null && bArr2.length > 0) {
                            cd04.parseFrom(bArr2);
                        }
                        dp32.f227157h = cd04;
                    }
                    return 0;
                case 6:
                    dp32.f227158i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
