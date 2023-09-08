package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.du2 */
public class C101772du2 extends C47465a {

    /* renamed from: d */
    public int f298139d;

    /* renamed from: e */
    public int f298140e;

    /* renamed from: f */
    public C48884bn2 f298141f;

    /* renamed from: g */
    public int f298142g;

    /* renamed from: h */
    public String f298143h;

    /* renamed from: i */
    public long f298144i;

    /* renamed from: j */
    public String f298145j;

    /* renamed from: n */
    public String f298146n;

    /* renamed from: o */
    public C64816wv f298147o;

    /* renamed from: p */
    public LinkedList<C49768hy> f298148p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101772du2)) {
            return false;
        }
        C101772du2 du22 = (C101772du2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298139d), Integer.valueOf(du22.f298139d)) && C46238a.m51546a(Integer.valueOf(this.f298140e), Integer.valueOf(du22.f298140e)) && C46238a.m51546a(this.f298141f, du22.f298141f) && C46238a.m51546a(Integer.valueOf(this.f298142g), Integer.valueOf(du22.f298142g)) && C46238a.m51546a(this.f298143h, du22.f298143h) && C46238a.m51546a(Long.valueOf(this.f298144i), Long.valueOf(du22.f298144i)) && C46238a.m51546a(this.f298145j, du22.f298145j) && C46238a.m51546a(this.f298146n, du22.f298146n) && C46238a.m51546a(this.f298147o, du22.f298147o) && C46238a.m51546a(this.f298148p, du22.f298148p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298139d);
            aVar.mo74318e(2, this.f298140e);
            C48884bn2 bn22 = this.f298141f;
            if (bn22 != null) {
                aVar.mo74322i(3, bn22.computeSize());
                this.f298141f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f298142g);
            String str = this.f298143h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f298144i);
            String str2 = this.f298145j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f298146n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            C64816wv wvVar = this.f298147o;
            if (wvVar != null) {
                aVar.mo74322i(9, wvVar.computeSize());
                this.f298147o.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f298148p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298139d) + 0 + C52418a.m58678e(2, this.f298140e);
            C48884bn2 bn23 = this.f298141f;
            if (bn23 != null) {
                e += C52418a.m58682i(3, bn23.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f298142g);
            String str4 = this.f298143h;
            if (str4 != null) {
                e2 += C52418a.m58683j(5, str4);
            }
            int h = e2 + C52418a.m58681h(6, this.f298144i);
            String str5 = this.f298145j;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            String str6 = this.f298146n;
            if (str6 != null) {
                h += C52418a.m58683j(8, str6);
            }
            C64816wv wvVar2 = this.f298147o;
            if (wvVar2 != null) {
                h += C52418a.m58682i(9, wvVar2.computeSize());
            }
            return h + C52418a.m58680g(10, 8, this.f298148p);
        } else if (i == 2) {
            this.f298148p.clear();
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
            C101772du2 du22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    du22.f298139d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    du22.f298140e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        du22.f298141f = bn24;
                    }
                    return 0;
                case 4:
                    du22.f298142g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    du22.f298143h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    du22.f298144i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    du22.f298145j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    du22.f298146n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64816wv wvVar3 = new C64816wv();
                        if (bArr2 != null && bArr2.length > 0) {
                            wvVar3.parseFrom(bArr2);
                        }
                        du22.f298147o = wvVar3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C49768hy hyVar = new C49768hy();
                        if (bArr3 != null && bArr3.length > 0) {
                            hyVar.parseFrom(bArr3);
                        }
                        du22.f298148p.add(hyVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f298139d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Scene", valueOf, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f298140e), false);
            aVar.mo71655d(jSONObject, "Location", this.f298141f, false);
            aVar.mo71655d(jSONObject, "BusinessType", Integer.valueOf(this.f298142g), false);
            aVar.mo71655d(jSONObject, "Language", this.f298143h, false);
            aVar.mo71655d(jSONObject, "ConfigParam", Long.valueOf(this.f298144i), false);
            aVar.mo71655d(jSONObject, "SessionId", this.f298145j, false);
            aVar.mo71655d(jSONObject, "GuideInfo", this.f298146n, false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f298147o, false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f298148p, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
