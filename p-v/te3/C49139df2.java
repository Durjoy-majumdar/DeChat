package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.df2 */
public class C49139df2 extends C47465a {

    /* renamed from: d */
    public xg4 f132287d;

    /* renamed from: e */
    public String f132288e;

    /* renamed from: f */
    public C118479xj3 f132289f;

    /* renamed from: g */
    public C118479xj3 f132290g;

    /* renamed from: h */
    public int f132291h;

    /* renamed from: i */
    public LinkedList<String> f132292i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49139df2)) {
            return false;
        }
        C49139df2 df22 = (C49139df2) aVar;
        return C46238a.m51546a(this.f132287d, df22.f132287d) && C46238a.m51546a(this.f132288e, df22.f132288e) && C46238a.m51546a(this.f132289f, df22.f132289f) && C46238a.m51546a(this.f132290g, df22.f132290g) && C46238a.m51546a(Integer.valueOf(this.f132291h), Integer.valueOf(df22.f132291h)) && C46238a.m51546a(this.f132292i, df22.f132292i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            xg4 xg4 = this.f132287d;
            if (xg4 != null) {
                aVar.mo74322i(1, xg4.computeSize());
                this.f132287d.writeFields(aVar);
            }
            String str = this.f132288e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C118479xj3 xj32 = this.f132289f;
            if (xj32 != null) {
                aVar.mo74322i(3, xj32.computeSize());
                this.f132289f.writeFields(aVar);
            }
            C118479xj3 xj33 = this.f132290g;
            if (xj33 != null) {
                aVar.mo74322i(4, xj33.computeSize());
                this.f132290g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f132291h);
            aVar.mo74320g(6, 1, this.f132292i);
            return 0;
        } else if (i == 1) {
            xg4 xg42 = this.f132287d;
            if (xg42 != null) {
                i2 = 0 + C52418a.m58682i(1, xg42.computeSize());
            }
            String str2 = this.f132288e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C118479xj3 xj34 = this.f132289f;
            if (xj34 != null) {
                i2 += C52418a.m58682i(3, xj34.computeSize());
            }
            C118479xj3 xj35 = this.f132290g;
            if (xj35 != null) {
                i2 += C52418a.m58682i(4, xj35.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f132291h) + C52418a.m58680g(6, 1, this.f132292i);
        } else if (i == 2) {
            this.f132292i.clear();
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
            C49139df2 df22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        xg4 xg43 = new xg4();
                        if (bArr != null && bArr.length > 0) {
                            xg43.parseFrom(bArr);
                        }
                        df22.f132287d = xg43;
                    }
                    return 0;
                case 2:
                    df22.f132288e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C118479xj3 xj36 = new C118479xj3();
                        if (bArr2 != null && bArr2.length > 0) {
                            xj36.parseFrom(bArr2);
                        }
                        df22.f132289f = xj36;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C118479xj3 xj37 = new C118479xj3();
                        if (bArr3 != null && bArr3.length > 0) {
                            xj37.parseFrom(bArr3);
                        }
                        df22.f132290g = xj37;
                    }
                    return 0;
                case 5:
                    df22.f132291h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    df22.f132292i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
