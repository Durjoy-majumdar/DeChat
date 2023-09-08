package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c74 extends C47465a {

    /* renamed from: d */
    public String f131560d;

    /* renamed from: e */
    public C51018qv3 f131561e;

    /* renamed from: f */
    public int f131562f;

    /* renamed from: g */
    public int f131563g;

    /* renamed from: h */
    public int f131564h;

    /* renamed from: i */
    public String f131565i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c74)) {
            return false;
        }
        c74 c74 = (c74) aVar;
        return C46238a.m51546a(this.f131560d, c74.f131560d) && C46238a.m51546a(this.f131561e, c74.f131561e) && C46238a.m51546a(Integer.valueOf(this.f131562f), Integer.valueOf(c74.f131562f)) && C46238a.m51546a(Integer.valueOf(this.f131563g), Integer.valueOf(c74.f131563g)) && C46238a.m51546a(Integer.valueOf(this.f131564h), Integer.valueOf(c74.f131564h)) && C46238a.m51546a(this.f131565i, c74.f131565i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131560d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51018qv3 qv32 = this.f131561e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f131561e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f131562f);
            aVar.mo74318e(4, this.f131563g);
            aVar.mo74318e(5, this.f131564h);
            String str2 = this.f131565i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f131560d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C51018qv3 qv33 = this.f131561e;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f131562f) + C52418a.m58678e(4, this.f131563g) + C52418a.m58678e(5, this.f131564h);
            String str4 = this.f131565i;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            c74 c74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c74.f131560d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        c74.f131561e = qv34;
                    }
                    return 0;
                case 3:
                    c74.f131562f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    c74.f131563g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    c74.f131564h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    c74.f131565i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
