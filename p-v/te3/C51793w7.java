package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w7 */
public class C51793w7 extends C47465a {

    /* renamed from: d */
    public String f143896d;

    /* renamed from: e */
    public String f143897e;

    /* renamed from: f */
    public int f143898f;

    /* renamed from: g */
    public mo4 f143899g;

    /* renamed from: h */
    public String f143900h;

    /* renamed from: i */
    public C51608uw3 f143901i;

    /* renamed from: j */
    public String f143902j;

    /* renamed from: n */
    public String f143903n;

    /* renamed from: o */
    public String f143904o;

    /* renamed from: p */
    public String f143905p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51793w7)) {
            return false;
        }
        C51793w7 w7Var = (C51793w7) aVar;
        return C46238a.m51546a(this.f143896d, w7Var.f143896d) && C46238a.m51546a(this.f143897e, w7Var.f143897e) && C46238a.m51546a(Integer.valueOf(this.f143898f), Integer.valueOf(w7Var.f143898f)) && C46238a.m51546a(this.f143899g, w7Var.f143899g) && C46238a.m51546a(this.f143900h, w7Var.f143900h) && C46238a.m51546a(this.f143901i, w7Var.f143901i) && C46238a.m51546a(this.f143902j, w7Var.f143902j) && C46238a.m51546a(this.f143903n, w7Var.f143903n) && C46238a.m51546a(this.f143904o, w7Var.f143904o) && C46238a.m51546a(this.f143905p, w7Var.f143905p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143897e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f143898f);
            mo4 mo4 = this.f143899g;
            if (mo4 != null) {
                aVar.mo74322i(4, mo4.computeSize());
                this.f143899g.writeFields(aVar);
            }
            String str3 = this.f143900h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C51608uw3 uw32 = this.f143901i;
            if (uw32 != null) {
                aVar.mo74322i(6, uw32.computeSize());
                this.f143901i.writeFields(aVar);
            }
            String str4 = this.f143902j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f143903n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f143904o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f143905p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f143896d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f143897e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f143898f);
            mo4 mo42 = this.f143899g;
            if (mo42 != null) {
                e += C52418a.m58682i(4, mo42.computeSize());
            }
            String str10 = this.f143900h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            C51608uw3 uw33 = this.f143901i;
            if (uw33 != null) {
                e += C52418a.m58682i(6, uw33.computeSize());
            }
            String str11 = this.f143902j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f143903n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f143904o;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f143905p;
            return str14 != null ? e + C52418a.m58683j(10, str14) : e;
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
            C51793w7 w7Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w7Var.f143896d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w7Var.f143897e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w7Var.f143898f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        mo4 mo43 = new mo4();
                        if (bArr != null && bArr.length > 0) {
                            mo43.parseFrom(bArr);
                        }
                        w7Var.f143899g = mo43;
                    }
                    return 0;
                case 5:
                    w7Var.f143900h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51608uw3 uw34 = new C51608uw3();
                        if (bArr2 != null && bArr2.length > 0) {
                            uw34.parseFrom(bArr2);
                        }
                        w7Var.f143901i = uw34;
                    }
                    return 0;
                case 7:
                    w7Var.f143902j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    w7Var.f143903n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    w7Var.f143904o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    w7Var.f143905p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f143896d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "scope", str, false);
            aVar.mo71655d(jSONObject, "scopeDesc", this.f143897e, false);
            aVar.mo71655d(jSONObject, "state", Integer.valueOf(this.f143898f), false);
            aVar.mo71655d(jSONObject, "userAvatarInfo", this.f143899g, false);
            aVar.mo71655d(jSONObject, "scope_sub_desc", this.f143900h, false);
            aVar.mo71655d(jSONObject, "risk_popup_info", this.f143901i, false);
            aVar.mo71655d(jSONObject, "auth_wording", this.f143902j, false);
            aVar.mo71655d(jSONObject, "bottom_desc", this.f143903n, false);
            aVar.mo71655d(jSONObject, "scope_sec_desc", this.f143904o, false);
            aVar.mo71655d(jSONObject, "item_title", this.f143905p, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
