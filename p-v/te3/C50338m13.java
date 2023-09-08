package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m13 */
public class C50338m13 extends C49335eu3 {

    /* renamed from: d */
    public long f137750d;

    /* renamed from: e */
    public String f137751e;

    /* renamed from: f */
    public String f137752f;

    /* renamed from: g */
    public String f137753g;

    /* renamed from: h */
    public String f137754h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50338m13)) {
            return false;
        }
        C50338m13 m132 = (C50338m13) aVar;
        return C46238a.m51546a(this.BaseResponse, m132.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f137750d), Long.valueOf(m132.f137750d)) && C46238a.m51546a(this.f137751e, m132.f137751e) && C46238a.m51546a(this.f137752f, m132.f137752f) && C46238a.m51546a(this.f137753g, m132.f137753g) && C46238a.m51546a(this.f137754h, m132.f137754h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f137750d);
            String str = this.f137751e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f137752f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f137753g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f137754h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f137750d);
            String str5 = this.f137751e;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f137752f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f137753g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f137754h;
            return str8 != null ? h + C52418a.m58683j(6, str8) : h;
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
            C50338m13 m132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        m132.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    m132.f137750d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    m132.f137751e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m132.f137752f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m132.f137753g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m132.f137754h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
