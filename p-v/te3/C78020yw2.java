package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yw2 */
public class C78020yw2 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f228642d;

    /* renamed from: e */
    public String f228643e;

    /* renamed from: f */
    public int f228644f;

    /* renamed from: g */
    public int f228645g;

    /* renamed from: h */
    public int f228646h;

    /* renamed from: i */
    public String f228647i;

    /* renamed from: j */
    public String f228648j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78020yw2)) {
            return false;
        }
        C78020yw2 yw22 = (C78020yw2) aVar;
        return C46238a.m51546a(this.f228642d, yw22.f228642d) && C46238a.m51546a(this.f228643e, yw22.f228643e) && C46238a.m51546a(Integer.valueOf(this.f228644f), Integer.valueOf(yw22.f228644f)) && C46238a.m51546a(Integer.valueOf(this.f228645g), Integer.valueOf(yw22.f228645g)) && C46238a.m51546a(Integer.valueOf(this.f228646h), Integer.valueOf(yw22.f228646h)) && C46238a.m51546a(this.f228647i, yw22.f228647i) && C46238a.m51546a(this.f228648j, yw22.f228648j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f228642d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f228642d.writeFields(aVar);
                }
                String str = this.f228643e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f228644f);
                aVar.mo74318e(4, this.f228645g);
                aVar.mo74318e(5, this.f228646h);
                String str2 = this.f228647i;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f228648j;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ToUserName");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f228642d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            String str4 = this.f228643e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f228644f) + C52418a.m58678e(4, this.f228645g) + C52418a.m58678e(5, this.f228646h);
            String str5 = this.f228647i;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f228648j;
            return str6 != null ? e + C52418a.m58683j(9, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f228642d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ToUserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78020yw2 yw22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 9) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C51163rv3 rv34 = new C51163rv3();
                            if (bArr != null && bArr.length > 0) {
                                rv34.mo73356d(bArr);
                            }
                            yw22.f228642d = rv34;
                        }
                        return 0;
                    case 2:
                        yw22.f228643e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        yw22.f228644f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        yw22.f228645g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        yw22.f228646h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        yw22.f228647i = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                yw22.f228648j = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
