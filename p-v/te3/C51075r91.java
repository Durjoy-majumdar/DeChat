package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r91 */
public class C51075r91 extends C47465a {

    /* renamed from: d */
    public long f140771d;

    /* renamed from: e */
    public C50767p11 f140772e;

    /* renamed from: f */
    public String f140773f;

    /* renamed from: g */
    public C89349b f140774g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51075r91)) {
            return false;
        }
        C51075r91 r912 = (C51075r91) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140771d), Long.valueOf(r912.f140771d)) && C46238a.m51546a(this.f140772e, r912.f140772e) && C46238a.m51546a(this.f140773f, r912.f140773f) && C46238a.m51546a(this.f140774g, r912.f140774g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140771d);
            C50767p11 p112 = this.f140772e;
            if (p112 != null) {
                aVar.mo74322i(2, p112.computeSize());
                this.f140772e.writeFields(aVar);
            }
            String str = this.f140773f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f140774g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140771d) + 0;
            C50767p11 p113 = this.f140772e;
            if (p113 != null) {
                h += C52418a.m58682i(2, p113.computeSize());
            }
            String str2 = this.f140773f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f140774g;
            return bVar2 != null ? h + C52418a.m58675b(4, bVar2) : h;
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
            C51075r91 r912 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r912.f140771d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    r912.f140772e = p114;
                }
                return 0;
            } else if (intValue == 3) {
                r912.f140773f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r912.f140774g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
