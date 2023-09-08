package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wk4 extends C47465a {

    /* renamed from: d */
    public String f186134d;

    /* renamed from: e */
    public String f186135e;

    /* renamed from: f */
    public String f186136f;

    /* renamed from: g */
    public String f186137g;

    /* renamed from: h */
    public C64861yn2 f186138h;

    /* renamed from: i */
    public LinkedList<uk4> f186139i = new LinkedList<>();

    /* renamed from: j */
    public int f186140j;

    /* renamed from: n */
    public int f186141n;

    /* renamed from: o */
    public vk4 f186142o;

    /* renamed from: p */
    public vk4 f186143p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wk4)) {
            return false;
        }
        wk4 wk4 = (wk4) aVar;
        return C46238a.m51546a(this.f186134d, wk4.f186134d) && C46238a.m51546a(this.f186135e, wk4.f186135e) && C46238a.m51546a(this.f186136f, wk4.f186136f) && C46238a.m51546a(this.f186137g, wk4.f186137g) && C46238a.m51546a(this.f186138h, wk4.f186138h) && C46238a.m51546a(this.f186139i, wk4.f186139i) && C46238a.m51546a(Integer.valueOf(this.f186140j), Integer.valueOf(wk4.f186140j)) && C46238a.m51546a(Integer.valueOf(this.f186141n), Integer.valueOf(wk4.f186141n)) && C46238a.m51546a(this.f186142o, wk4.f186142o) && C46238a.m51546a(this.f186143p, wk4.f186143p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186134d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186135e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186136f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186137g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C64861yn2 yn22 = this.f186138h;
            if (yn22 != null) {
                aVar.mo74322i(5, yn22.computeSize());
                this.f186138h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f186139i);
            aVar.mo74318e(7, this.f186140j);
            aVar.mo74318e(8, this.f186141n);
            vk4 vk4 = this.f186142o;
            if (vk4 != null) {
                aVar.mo74322i(9, vk4.computeSize());
                this.f186142o.writeFields(aVar);
            }
            vk4 vk42 = this.f186143p;
            if (vk42 != null) {
                aVar.mo74322i(10, vk42.computeSize());
                this.f186143p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f186134d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186135e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f186136f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f186137g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C64861yn2 yn23 = this.f186138h;
            if (yn23 != null) {
                i2 += C52418a.m58682i(5, yn23.computeSize());
            }
            int g = i2 + C52418a.m58680g(6, 8, this.f186139i) + C52418a.m58678e(7, this.f186140j) + C52418a.m58678e(8, this.f186141n);
            vk4 vk43 = this.f186142o;
            if (vk43 != null) {
                g += C52418a.m58682i(9, vk43.computeSize());
            }
            vk4 vk44 = this.f186143p;
            return vk44 != null ? g + C52418a.m58682i(10, vk44.computeSize()) : g;
        } else if (i == 2) {
            this.f186139i.clear();
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
            wk4 wk4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wk4.f186134d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wk4.f186135e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wk4.f186136f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wk4.f186137g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64861yn2 yn24 = new C64861yn2();
                        if (bArr != null && bArr.length > 0) {
                            yn24.parseFrom(bArr);
                        }
                        wk4.f186138h = yn24;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        uk4 uk4 = new uk4();
                        if (bArr2 != null && bArr2.length > 0) {
                            uk4.parseFrom(bArr2);
                        }
                        wk4.f186139i.add(uk4);
                    }
                    return 0;
                case 7:
                    wk4.f186140j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    wk4.f186141n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        vk4 vk45 = new vk4();
                        if (bArr3 != null && bArr3.length > 0) {
                            vk45.parseFrom(bArr3);
                        }
                        wk4.f186142o = vk45;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        vk4 vk46 = new vk4();
                        if (bArr4 != null && bArr4.length > 0) {
                            vk46.parseFrom(bArr4);
                        }
                        wk4.f186143p = vk46;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
