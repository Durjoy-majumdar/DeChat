package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mh3 */
public class C50403mh3 extends C47465a {

    /* renamed from: d */
    public boolean f138032d;

    /* renamed from: e */
    public u54 f138033e;

    /* renamed from: f */
    public u54 f138034f;

    /* renamed from: g */
    public String f138035g;

    /* renamed from: h */
    public String f138036h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50403mh3)) {
            return false;
        }
        C50403mh3 mh32 = (C50403mh3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f138032d), Boolean.valueOf(mh32.f138032d)) && C46238a.m51546a(this.f138033e, mh32.f138033e) && C46238a.m51546a(this.f138034f, mh32.f138034f) && C46238a.m51546a(this.f138035g, mh32.f138035g) && C46238a.m51546a(this.f138036h, mh32.f138036h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f138032d);
            u54 u54 = this.f138033e;
            if (u54 != null) {
                aVar.mo74322i(2, u54.computeSize());
                this.f138033e.writeFields(aVar);
            }
            u54 u542 = this.f138034f;
            if (u542 != null) {
                aVar.mo74322i(3, u542.computeSize());
                this.f138034f.writeFields(aVar);
            }
            String str = this.f138035g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f138036h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f138032d) + 0;
            u54 u543 = this.f138033e;
            if (u543 != null) {
                a += C52418a.m58682i(2, u543.computeSize());
            }
            u54 u544 = this.f138034f;
            if (u544 != null) {
                a += C52418a.m58682i(3, u544.computeSize());
            }
            String str3 = this.f138035g;
            if (str3 != null) {
                a += C52418a.m58683j(4, str3);
            }
            String str4 = this.f138036h;
            return str4 != null ? a + C52418a.m58683j(5, str4) : a;
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
            C50403mh3 mh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mh32.f138032d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    u54 u545 = new u54();
                    if (bArr != null && bArr.length > 0) {
                        u545.parseFrom(bArr);
                    }
                    mh32.f138033e = u545;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    u54 u546 = new u54();
                    if (bArr2 != null && bArr2.length > 0) {
                        u546.parseFrom(bArr2);
                    }
                    mh32.f138034f = u546;
                }
                return 0;
            } else if (intValue == 4) {
                mh32.f138035g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mh32.f138036h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
