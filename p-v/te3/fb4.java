package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fb4 extends C101820nt3 {

    /* renamed from: d */
    public int f133398d;

    /* renamed from: e */
    public String f133399e;

    /* renamed from: f */
    public String f133400f;

    /* renamed from: g */
    public String f133401g;

    /* renamed from: h */
    public int f133402h;

    /* renamed from: i */
    public LinkedList<hb4> f133403i = new LinkedList<>();

    /* renamed from: j */
    public eb4 f133404j;

    /* renamed from: n */
    public int f133405n;

    /* renamed from: o */
    public LinkedList<eb4> f133406o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fb4)) {
            return false;
        }
        fb4 fb4 = (fb4) aVar;
        return C46238a.m51546a(this.BaseRequest, fb4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133398d), Integer.valueOf(fb4.f133398d)) && C46238a.m51546a(this.f133399e, fb4.f133399e) && C46238a.m51546a(this.f133400f, fb4.f133400f) && C46238a.m51546a(this.f133401g, fb4.f133401g) && C46238a.m51546a(Integer.valueOf(this.f133402h), Integer.valueOf(fb4.f133402h)) && C46238a.m51546a(this.f133403i, fb4.f133403i) && C46238a.m51546a(this.f133404j, fb4.f133404j) && C46238a.m51546a(Integer.valueOf(this.f133405n), Integer.valueOf(fb4.f133405n)) && C46238a.m51546a(this.f133406o, fb4.f133406o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133398d);
            String str = this.f133399e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f133400f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f133401g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f133402h);
            aVar.mo74320g(7, 8, this.f133403i);
            eb4 eb4 = this.f133404j;
            if (eb4 != null) {
                aVar.mo74322i(8, eb4.computeSize());
                this.f133404j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f133405n);
            aVar.mo74320g(10, 8, this.f133406o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133398d);
            String str4 = this.f133399e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f133400f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f133401g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f133402h) + C52418a.m58680g(7, 8, this.f133403i);
            eb4 eb42 = this.f133404j;
            if (eb42 != null) {
                e2 += C52418a.m58682i(8, eb42.computeSize());
            }
            return e2 + C52418a.m58678e(9, this.f133405n) + C52418a.m58680g(10, 8, this.f133406o);
        } else if (i == 2) {
            this.f133403i.clear();
            this.f133406o.clear();
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
            fb4 fb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        fb4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fb4.f133398d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fb4.f133399e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fb4.f133400f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fb4.f133401g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fb4.f133402h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        hb4 hb4 = new hb4();
                        if (bArr2 != null && bArr2.length > 0) {
                            hb4.parseFrom(bArr2);
                        }
                        fb4.f133403i.add(hb4);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        eb4 eb43 = new eb4();
                        if (bArr3 != null && bArr3.length > 0) {
                            eb43.parseFrom(bArr3);
                        }
                        fb4.f133404j = eb43;
                    }
                    return 0;
                case 9:
                    fb4.f133405n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        eb4 eb44 = new eb4();
                        if (bArr4 != null && bArr4.length > 0) {
                            eb44.parseFrom(bArr4);
                        }
                        fb4.f133406o.add(eb44);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
