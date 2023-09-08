package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lv0 */
public class C50313lv0 extends C49335eu3 {

    /* renamed from: d */
    public String f137653d;

    /* renamed from: e */
    public long f137654e;

    /* renamed from: f */
    public String f137655f;

    /* renamed from: g */
    public C64265bq2 f137656g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50313lv0)) {
            return false;
        }
        C50313lv0 lv02 = (C50313lv0) aVar;
        return C46238a.m51546a(this.BaseResponse, lv02.BaseResponse) && C46238a.m51546a(this.f137653d, lv02.f137653d) && C46238a.m51546a(Long.valueOf(this.f137654e), Long.valueOf(lv02.f137654e)) && C46238a.m51546a(this.f137655f, lv02.f137655f) && C46238a.m51546a(this.f137656g, lv02.f137656g);
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
            String str = this.f137653d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f137654e);
            String str2 = this.f137655f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C64265bq2 bq22 = this.f137656g;
            if (bq22 != null) {
                aVar.mo74322i(5, bq22.computeSize());
                this.f137656g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f137653d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int h = i2 + C52418a.m58681h(3, this.f137654e);
            String str4 = this.f137655f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            C64265bq2 bq23 = this.f137656g;
            return bq23 != null ? h + C52418a.m58682i(5, bq23.computeSize()) : h;
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
            C50313lv0 lv02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    lv02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                lv02.f137653d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lv02.f137654e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                lv02.f137655f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64265bq2 bq24 = new C64265bq2();
                    if (bArr2 != null && bArr2.length > 0) {
                        bq24.parseFrom(bArr2);
                    }
                    lv02.f137656g = bq24;
                }
                return 0;
            }
        }
    }
}
