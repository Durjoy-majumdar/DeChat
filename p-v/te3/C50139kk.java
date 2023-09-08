package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kk */
public class C50139kk extends C47465a {

    /* renamed from: d */
    public String f136832d;

    /* renamed from: e */
    public C50413mk f136833e;

    /* renamed from: f */
    public C49772hy3 f136834f;

    /* renamed from: g */
    public C51406tk f136835g;

    /* renamed from: h */
    public String f136836h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50139kk)) {
            return false;
        }
        C50139kk kkVar = (C50139kk) aVar;
        return C46238a.m51546a(this.f136832d, kkVar.f136832d) && C46238a.m51546a(this.f136833e, kkVar.f136833e) && C46238a.m51546a(this.f136834f, kkVar.f136834f) && C46238a.m51546a(this.f136835g, kkVar.f136835g) && C46238a.m51546a(this.f136836h, kkVar.f136836h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136832d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f136834f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C50413mk mkVar = this.f136833e;
                if (mkVar != null) {
                    aVar.mo74322i(2, mkVar.computeSize());
                    this.f136833e.writeFields(aVar);
                }
                C49772hy3 hy32 = this.f136834f;
                if (hy32 != null) {
                    aVar.mo74322i(3, hy32.computeSize());
                    this.f136834f.writeFields(aVar);
                }
                C51406tk tkVar = this.f136835g;
                if (tkVar != null) {
                    aVar.mo74322i(4, tkVar.computeSize());
                    this.f136835g.writeFields(aVar);
                }
                String str2 = this.f136836h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ContactItem");
            }
        } else if (i == 1) {
            String str3 = this.f136832d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C50413mk mkVar2 = this.f136833e;
            if (mkVar2 != null) {
                i2 += C52418a.m58682i(2, mkVar2.computeSize());
            }
            C49772hy3 hy33 = this.f136834f;
            if (hy33 != null) {
                i2 += C52418a.m58682i(3, hy33.computeSize());
            }
            C51406tk tkVar2 = this.f136835g;
            if (tkVar2 != null) {
                i2 += C52418a.m58682i(4, tkVar2.computeSize());
            }
            String str4 = this.f136836h;
            return str4 != null ? i2 + C52418a.m58683j(5, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136832d == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f136834f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ContactItem");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50139kk kkVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kkVar.f136832d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50413mk mkVar3 = new C50413mk();
                    if (bArr != null && bArr.length > 0) {
                        mkVar3.parseFrom(bArr);
                    }
                    kkVar.f136833e = mkVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49772hy3 hy34 = new C49772hy3();
                    if (bArr2 != null && bArr2.length > 0) {
                        hy34.parseFrom(bArr2);
                    }
                    kkVar.f136834f = hy34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51406tk tkVar3 = new C51406tk();
                    if (bArr3 != null && bArr3.length > 0) {
                        tkVar3.parseFrom(bArr3);
                    }
                    kkVar.f136835g = tkVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kkVar.f136836h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136832d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "NickName", str, false);
            aVar.mo71655d(jSONObject, "DetailInfo", this.f136833e, false);
            aVar.mo71655d(jSONObject, "ContactItem", this.f136834f, false);
            aVar.mo71655d(jSONObject, "ServiceInfo", this.f136835g, false);
            aVar.mo71655d(jSONObject, "JumpUrl", this.f136836h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
