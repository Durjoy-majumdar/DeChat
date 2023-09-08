package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class v05 extends C47465a {

    /* renamed from: d */
    public String f143228d;

    /* renamed from: e */
    public String f143229e;

    /* renamed from: f */
    public String f143230f;

    /* renamed from: g */
    public long f143231g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v05)) {
            return false;
        }
        v05 v05 = (v05) aVar;
        return C46238a.m51546a(this.f143228d, v05.f143228d) && C46238a.m51546a(this.f143229e, v05.f143229e) && C46238a.m51546a(this.f143230f, v05.f143230f) && C46238a.m51546a(Long.valueOf(this.f143231g), Long.valueOf(v05.f143231g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143228d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f143229e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f143230f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f143229e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f143230f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74321h(4, this.f143231g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i == 1) {
            String str4 = this.f143228d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143229e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143230f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f143231g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143228d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f143229e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f143230f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            v05 v05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v05.f143228d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v05.f143229e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                v05.f143230f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                v05.f143231g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
