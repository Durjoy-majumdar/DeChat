package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wj3 */
public class C118477wj3 extends C47465a {

    /* renamed from: d */
    public int f354516d;

    /* renamed from: e */
    public C49139df2 f354517e;

    /* renamed from: f */
    public C118461r00 f354518f;

    /* renamed from: g */
    public C51549ui f354519g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118477wj3)) {
            return false;
        }
        C118477wj3 wj32 = (C118477wj3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354516d), Integer.valueOf(wj32.f354516d)) && C46238a.m51546a(this.f354517e, wj32.f354517e) && C46238a.m51546a(this.f354518f, wj32.f354518f) && C46238a.m51546a(this.f354519g, wj32.f354519g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f354516d);
            C49139df2 df22 = this.f354517e;
            if (df22 != null) {
                aVar.mo74322i(2, df22.computeSize());
                this.f354517e.writeFields(aVar);
            }
            C118461r00 r002 = this.f354518f;
            if (r002 != null) {
                aVar.mo74322i(3, r002.computeSize());
                this.f354518f.writeFields(aVar);
            }
            C51549ui uiVar = this.f354519g;
            if (uiVar != null) {
                aVar.mo74322i(4, uiVar.computeSize());
                this.f354519g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f354516d) + 0;
            C49139df2 df23 = this.f354517e;
            if (df23 != null) {
                e += C52418a.m58682i(2, df23.computeSize());
            }
            C118461r00 r003 = this.f354518f;
            if (r003 != null) {
                e += C52418a.m58682i(3, r003.computeSize());
            }
            C51549ui uiVar2 = this.f354519g;
            return uiVar2 != null ? e + C52418a.m58682i(4, uiVar2.computeSize()) : e;
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
            C118477wj3 wj32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wj32.f354516d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49139df2 df24 = new C49139df2();
                    if (bArr != null && bArr.length > 0) {
                        df24.parseFrom(bArr);
                    }
                    wj32.f354517e = df24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C118461r00 r004 = new C118461r00();
                    if (bArr2 != null && bArr2.length > 0) {
                        r004.parseFrom(bArr2);
                    }
                    wj32.f354518f = r004;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C51549ui uiVar3 = new C51549ui();
                    if (bArr3 != null && bArr3.length > 0) {
                        uiVar3.parseFrom(bArr3);
                    }
                    wj32.f354519g = uiVar3;
                }
                return 0;
            }
        }
    }
}
