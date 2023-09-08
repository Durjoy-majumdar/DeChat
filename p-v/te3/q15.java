package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class q15 extends C47465a {

    /* renamed from: d */
    public String f140091d;

    /* renamed from: e */
    public long f140092e;

    /* renamed from: f */
    public C89349b f140093f;

    /* renamed from: g */
    public int f140094g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q15)) {
            return false;
        }
        q15 q15 = (q15) aVar;
        return C46238a.m51546a(this.f140091d, q15.f140091d) && C46238a.m51546a(Long.valueOf(this.f140092e), Long.valueOf(q15.f140092e)) && C46238a.m51546a(this.f140093f, q15.f140093f) && C46238a.m51546a(Integer.valueOf(this.f140094g), Integer.valueOf(q15.f140094g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140091d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f140093f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f140092e);
                C89349b bVar = this.f140093f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f140094g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: VoiceData");
            }
        } else if (i == 1) {
            String str2 = this.f140091d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int h = i2 + C52418a.m58681h(2, this.f140092e);
            C89349b bVar2 = this.f140093f;
            if (bVar2 != null) {
                h += C52418a.m58675b(3, bVar2);
            }
            return h + C52418a.m58678e(4, this.f140094g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140091d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f140093f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: VoiceData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            q15 q15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q15.f140091d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                q15.f140092e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                q15.f140093f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                q15.f140094g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
