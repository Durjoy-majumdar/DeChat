package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ja3 */
public class C118438ja3 extends C47465a {

    /* renamed from: d */
    public String f354059d;

    /* renamed from: e */
    public String f354060e;

    /* renamed from: f */
    public String f354061f;

    /* renamed from: g */
    public String f354062g;

    /* renamed from: h */
    public C50562nl2 f354063h;

    /* renamed from: i */
    public boolean f354064i = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118438ja3)) {
            return false;
        }
        C118438ja3 ja32 = (C118438ja3) aVar;
        return C46238a.m51546a(this.f354059d, ja32.f354059d) && C46238a.m51546a(this.f354060e, ja32.f354060e) && C46238a.m51546a(this.f354061f, ja32.f354061f) && C46238a.m51546a(this.f354062g, ja32.f354062g) && C46238a.m51546a(this.f354063h, ja32.f354063h) && C46238a.m51546a(Boolean.valueOf(this.f354064i), Boolean.valueOf(ja32.f354064i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354059d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354060e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354061f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f354062g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C50562nl2 nl22 = this.f354063h;
            if (nl22 != null) {
                aVar.mo74322i(5, nl22.computeSize());
                this.f354063h.writeFields(aVar);
            }
            aVar.mo74314a(6, this.f354064i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f354059d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f354060e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f354061f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f354062g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C50562nl2 nl23 = this.f354063h;
            if (nl23 != null) {
                i2 += C52418a.m58682i(5, nl23.computeSize());
            }
            return i2 + C52418a.m58674a(6, this.f354064i);
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
            C118438ja3 ja32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ja32.f354059d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ja32.f354060e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ja32.f354061f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ja32.f354062g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50562nl2 nl24 = new C50562nl2();
                        if (bArr != null && bArr.length > 0) {
                            nl24.parseFrom(bArr);
                        }
                        ja32.f354063h = nl24;
                    }
                    return 0;
                case 6:
                    ja32.f354064i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
