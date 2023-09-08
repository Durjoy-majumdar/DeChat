package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class u25 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f299563d = new LinkedList<>();

    /* renamed from: e */
    public int f299564e;

    /* renamed from: f */
    public String f299565f;

    /* renamed from: g */
    public int f299566g;

    /* renamed from: h */
    public long f299567h;

    /* renamed from: i */
    public String f299568i;

    /* renamed from: j */
    public C48884bn2 f299569j;

    /* renamed from: n */
    public LinkedList<C49768hy> f299570n = new LinkedList<>();

    /* renamed from: o */
    public C64816wv f299571o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u25)) {
            return false;
        }
        u25 u25 = (u25) aVar;
        return C46238a.m51546a(this.f299563d, u25.f299563d) && C46238a.m51546a(Integer.valueOf(this.f299564e), Integer.valueOf(u25.f299564e)) && C46238a.m51546a(this.f299565f, u25.f299565f) && C46238a.m51546a(Integer.valueOf(this.f299566g), Integer.valueOf(u25.f299566g)) && C46238a.m51546a(Long.valueOf(this.f299567h), Long.valueOf(u25.f299567h)) && C46238a.m51546a(this.f299568i, u25.f299568i) && C46238a.m51546a(this.f299569j, u25.f299569j) && C46238a.m51546a(this.f299570n, u25.f299570n) && C46238a.m51546a(this.f299571o, u25.f299571o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f299563d);
            aVar.mo74318e(2, this.f299564e);
            String str = this.f299565f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f299566g);
            aVar.mo74321h(5, this.f299567h);
            String str2 = this.f299568i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C48884bn2 bn22 = this.f299569j;
            if (bn22 != null) {
                aVar.mo74322i(7, bn22.computeSize());
                this.f299569j.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f299570n);
            C64816wv wvVar = this.f299571o;
            if (wvVar != null) {
                aVar.mo74322i(9, wvVar.computeSize());
                this.f299571o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f299563d) + 0 + C52418a.m58678e(2, this.f299564e);
            String str3 = this.f299565f;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            int e = g + C52418a.m58678e(4, this.f299566g) + C52418a.m58681h(5, this.f299567h);
            String str4 = this.f299568i;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            C48884bn2 bn23 = this.f299569j;
            if (bn23 != null) {
                e += C52418a.m58682i(7, bn23.computeSize());
            }
            int g2 = e + C52418a.m58680g(8, 8, this.f299570n);
            C64816wv wvVar2 = this.f299571o;
            return wvVar2 != null ? g2 + C52418a.m58682i(9, wvVar2.computeSize()) : g2;
        } else if (i == 2) {
            this.f299563d.clear();
            this.f299570n.clear();
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
            u25 u25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u25.f299563d.add(aVar3.mo141633k(intValue));
                    return 0;
                case 2:
                    u25.f299564e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    u25.f299565f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u25.f299566g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    u25.f299567h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    u25.f299568i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        u25.f299569j = bn24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49768hy hyVar = new C49768hy();
                        if (bArr2 != null && bArr2.length > 0) {
                            hyVar.parseFrom(bArr2);
                        }
                        u25.f299570n.add(hyVar);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64816wv wvVar3 = new C64816wv();
                        if (bArr3 != null && bArr3.length > 0) {
                            wvVar3.parseFrom(bArr3);
                        }
                        u25.f299571o = wvVar3;
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
            LinkedList<String> linkedList = this.f299563d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ConfigKeys", linkedList, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f299564e), false);
            aVar.mo71655d(jSONObject, "Language", this.f299565f, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f299566g), false);
            aVar.mo71655d(jSONObject, "BusinessType", Long.valueOf(this.f299567h), false);
            aVar.mo71655d(jSONObject, "NetType", this.f299568i, false);
            aVar.mo71655d(jSONObject, "Location", this.f299569j, false);
            aVar.mo71655d(jSONObject, "ExtParams", this.f299570n, false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f299571o, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
