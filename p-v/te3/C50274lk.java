package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lk */
public class C50274lk extends C47465a {

    /* renamed from: d */
    public long f137468d;

    /* renamed from: e */
    public int f137469e;

    /* renamed from: f */
    public String f137470f;

    /* renamed from: g */
    public LinkedList<String> f137471g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C51256sk> f137472h = new LinkedList<>();

    /* renamed from: i */
    public int f137473i;

    /* renamed from: j */
    public String f137474j;

    /* renamed from: n */
    public int f137475n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50274lk)) {
            return false;
        }
        C50274lk lkVar = (C50274lk) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137468d), Long.valueOf(lkVar.f137468d)) && C46238a.m51546a(Integer.valueOf(this.f137469e), Integer.valueOf(lkVar.f137469e)) && C46238a.m51546a(this.f137470f, lkVar.f137470f) && C46238a.m51546a(this.f137471g, lkVar.f137471g) && C46238a.m51546a(this.f137472h, lkVar.f137472h) && C46238a.m51546a(Integer.valueOf(this.f137473i), Integer.valueOf(lkVar.f137473i)) && C46238a.m51546a(this.f137474j, lkVar.f137474j) && C46238a.m51546a(Integer.valueOf(this.f137475n), Integer.valueOf(lkVar.f137475n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137474j != null) {
                aVar.mo74321h(1, this.f137468d);
                aVar.mo74318e(2, this.f137469e);
                String str = this.f137470f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 1, this.f137471g);
                aVar.mo74320g(5, 8, this.f137472h);
                aVar.mo74318e(6, this.f137473i);
                String str2 = this.f137474j;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                aVar.mo74318e(8, this.f137475n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: SearchID");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137468d) + 0 + C52418a.m58678e(2, this.f137469e);
            String str3 = this.f137470f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int g = h + C52418a.m58680g(4, 1, this.f137471g) + C52418a.m58680g(5, 8, this.f137472h) + C52418a.m58678e(6, this.f137473i);
            String str4 = this.f137474j;
            if (str4 != null) {
                g += C52418a.m58683j(7, str4);
            }
            return g + C52418a.m58678e(8, this.f137475n);
        } else if (i == 2) {
            this.f137471g.clear();
            this.f137472h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137474j != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SearchID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50274lk lkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lkVar.f137468d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    lkVar.f137469e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lkVar.f137470f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lkVar.f137471g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51256sk skVar = new C51256sk();
                        if (bArr != null && bArr.length > 0) {
                            skVar.parseFrom(bArr);
                        }
                        lkVar.f137472h.add(skVar);
                    }
                    return 0;
                case 6:
                    lkVar.f137473i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    lkVar.f137474j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lkVar.f137475n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f137468d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BusinessType", valueOf, false);
            aVar.mo71655d(jSONObject, "ContinueFlag", Integer.valueOf(this.f137469e), false);
            aVar.mo71655d(jSONObject, "Title", this.f137470f, false);
            aVar.mo71655d(jSONObject, "KeyWordList", this.f137471g, false);
            aVar.mo71655d(jSONObject, "ItemList", this.f137472h, false);
            aVar.mo71655d(jSONObject, "TotalCount", Integer.valueOf(this.f137473i), false);
            aVar.mo71655d(jSONObject, "SearchID", this.f137474j, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f137475n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
