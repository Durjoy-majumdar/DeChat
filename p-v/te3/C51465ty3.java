package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ty3 */
public class C51465ty3 extends C47465a {

    /* renamed from: d */
    public String f142473d;

    /* renamed from: e */
    public String f142474e;

    /* renamed from: f */
    public LinkedList<C49768hy> f142475f = new LinkedList<>();

    /* renamed from: g */
    public C48884bn2 f142476g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51465ty3)) {
            return false;
        }
        C51465ty3 ty32 = (C51465ty3) aVar;
        return C46238a.m51546a(this.f142473d, ty32.f142473d) && C46238a.m51546a(this.f142474e, ty32.f142474e) && C46238a.m51546a(this.f142475f, ty32.f142475f) && C46238a.m51546a(this.f142476g, ty32.f142476g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142473d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142474e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f142475f);
            C48884bn2 bn22 = this.f142476g;
            if (bn22 != null) {
                aVar.mo74322i(4, bn22.computeSize());
                this.f142476g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f142473d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f142474e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f142475f);
            C48884bn2 bn23 = this.f142476g;
            return bn23 != null ? g + C52418a.m58682i(4, bn23.computeSize()) : g;
        } else if (i == 2) {
            this.f142475f.clear();
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
            C51465ty3 ty32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ty32.f142473d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ty32.f142474e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49768hy hyVar = new C49768hy();
                    if (bArr != null && bArr.length > 0) {
                        hyVar.parseFrom(bArr);
                    }
                    ty32.f142475f.add(hyVar);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48884bn2 bn24 = new C48884bn2();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn24.parseFrom(bArr2);
                    }
                    ty32.f142476g = bn24;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f142473d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "commReq", str, false);
            aVar.mo71655d(jSONObject, "requestId", this.f142474e, false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f142475f, false);
            aVar.mo71655d(jSONObject, "Location", this.f142476g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
