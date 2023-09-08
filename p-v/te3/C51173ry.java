package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ry */
public class C51173ry extends C47465a {

    /* renamed from: d */
    public C110959d13 f141210d;

    /* renamed from: e */
    public String f141211e;

    /* renamed from: f */
    public boolean f141212f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51173ry)) {
            return false;
        }
        C51173ry ryVar = (C51173ry) aVar;
        return C46238a.m51546a(this.f141210d, ryVar.f141210d) && C46238a.m51546a(this.f141211e, ryVar.f141211e) && C46238a.m51546a(Boolean.valueOf(this.f141212f), Boolean.valueOf(ryVar.f141212f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C110959d13 d132 = this.f141210d;
            if (d132 != null) {
                aVar.mo74322i(1, d132.computeSize());
                this.f141210d.writeFields(aVar);
            }
            String str = this.f141211e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f141212f);
            return 0;
        } else if (i == 1) {
            C110959d13 d133 = this.f141210d;
            if (d133 != null) {
                i2 = 0 + C52418a.m58682i(1, d133.computeSize());
            }
            String str2 = this.f141211e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f141212f);
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
            C51173ry ryVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C110959d13 d134 = new C110959d13();
                    if (bArr != null && bArr.length > 0) {
                        d134.parseFrom(bArr);
                    }
                    ryVar.f141210d = d134;
                }
                return 0;
            } else if (intValue == 2) {
                ryVar.f141211e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ryVar.f141212f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C110959d13 d132 = this.f141210d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "animdata", d132, false);
            aVar.mo71655d(jSONObject, "contextId", this.f141211e, false);
            aVar.mo71655d(jSONObject, "isFromTaskBar", Boolean.valueOf(this.f141212f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
