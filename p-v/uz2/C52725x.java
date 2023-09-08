package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.x */
public class C52725x extends C47465a {

    /* renamed from: d */
    public String f147281d;

    /* renamed from: e */
    public long f147282e;

    /* renamed from: f */
    public LinkedList<C52722w> f147283f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C52722w> f147284g = new LinkedList<>();

    /* renamed from: h */
    public int f147285h;

    /* renamed from: i */
    public int f147286i;

    /* renamed from: j */
    public String f147287j;

    /* renamed from: n */
    public int f147288n;

    /* renamed from: o */
    public LinkedList<C52722w> f147289o = new LinkedList<>();

    /* renamed from: p */
    public String f147290p;

    /* renamed from: q */
    public String f147291q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52725x)) {
            return false;
        }
        C52725x xVar = (C52725x) aVar;
        return C46238a.m51546a(this.f147281d, xVar.f147281d) && C46238a.m51546a(Long.valueOf(this.f147282e), Long.valueOf(xVar.f147282e)) && C46238a.m51546a(this.f147283f, xVar.f147283f) && C46238a.m51546a(this.f147284g, xVar.f147284g) && C46238a.m51546a(Integer.valueOf(this.f147285h), Integer.valueOf(xVar.f147285h)) && C46238a.m51546a(Integer.valueOf(this.f147286i), Integer.valueOf(xVar.f147286i)) && C46238a.m51546a(this.f147287j, xVar.f147287j) && C46238a.m51546a(Integer.valueOf(this.f147288n), Integer.valueOf(xVar.f147288n)) && C46238a.m51546a(this.f147289o, xVar.f147289o) && C46238a.m51546a(this.f147290p, xVar.f147290p) && C46238a.m51546a(this.f147291q, xVar.f147291q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147281d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f147282e);
            aVar.mo74320g(3, 8, this.f147283f);
            aVar.mo74320g(4, 8, this.f147284g);
            aVar.mo74318e(5, this.f147285h);
            aVar.mo74318e(6, this.f147286i);
            String str2 = this.f147287j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f147288n);
            aVar.mo74320g(9, 8, this.f147289o);
            String str3 = this.f147290p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            String str4 = this.f147291q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f147281d;
            if (str5 != null) {
                i3 = 0 + C52418a.m58683j(1, str5);
            }
            int h = i3 + C52418a.m58681h(2, this.f147282e) + C52418a.m58680g(3, 8, this.f147283f) + C52418a.m58680g(4, 8, this.f147284g) + C52418a.m58678e(5, this.f147285h) + C52418a.m58678e(6, this.f147286i);
            String str6 = this.f147287j;
            if (str6 != null) {
                h += C52418a.m58683j(7, str6);
            }
            int e = h + C52418a.m58678e(8, this.f147288n) + C52418a.m58680g(9, 8, this.f147289o);
            String str7 = this.f147290p;
            if (str7 != null) {
                e += C52418a.m58683j(10, str7);
            }
            String str8 = this.f147291q;
            return str8 != null ? e + C52418a.m58683j(11, str8) : e;
        } else if (i2 == 2) {
            this.f147283f.clear();
            this.f147284g.clear();
            this.f147289o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52725x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xVar.f147281d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xVar.f147282e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C52722w wVar = new C52722w();
                        if (bArr != null && bArr.length > 0) {
                            wVar.parseFrom(bArr);
                        }
                        xVar.f147283f.add(wVar);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52722w wVar2 = new C52722w();
                        if (bArr2 != null && bArr2.length > 0) {
                            wVar2.parseFrom(bArr2);
                        }
                        xVar.f147284g.add(wVar2);
                    }
                    return 0;
                case 5:
                    xVar.f147285h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xVar.f147286i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xVar.f147287j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xVar.f147288n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52722w wVar3 = new C52722w();
                        if (bArr3 != null && bArr3.length > 0) {
                            wVar3.parseFrom(bArr3);
                        }
                        xVar.f147289o.add(wVar3);
                    }
                    return 0;
                case 10:
                    xVar.f147290p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    xVar.f147291q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147281d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "url", str, false);
            aVar.mo71655d(jSONObject, "extOption", Long.valueOf(this.f147282e), false);
            aVar.mo71655d(jSONObject, "iconDescriptions", this.f147283f, false);
            aVar.mo71655d(jSONObject, "clusterDescriptions", this.f147284g, false);
            aVar.mo71655d(jSONObject, "beginTime", Integer.valueOf(this.f147285h), false);
            aVar.mo71655d(jSONObject, "endTime", Integer.valueOf(this.f147286i), false);
            aVar.mo71655d(jSONObject, "groupId", this.f147287j, false);
            aVar.mo71655d(jSONObject, "order", Integer.valueOf(this.f147288n), false);
            aVar.mo71655d(jSONObject, "otherClusterDescriptions", this.f147289o, false);
            aVar.mo71655d(jSONObject, "bigIconUrl", this.f147290p, false);
            aVar.mo71655d(jSONObject, "unreadTextColor", this.f147291q, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
