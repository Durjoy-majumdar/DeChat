package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gk */
public class C49570gk extends C47465a {

    /* renamed from: d */
    public int f134080d;

    /* renamed from: e */
    public C50028jr3 f134081e;

    /* renamed from: f */
    public float f134082f;

    /* renamed from: g */
    public C51399ti f134083g;

    /* renamed from: h */
    public C51581up3 f134084h;

    /* renamed from: i */
    public int f134085i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49570gk)) {
            return false;
        }
        C49570gk gkVar = (C49570gk) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134080d), Integer.valueOf(gkVar.f134080d)) && C46238a.m51546a(this.f134081e, gkVar.f134081e) && C46238a.m51546a(Float.valueOf(this.f134082f), Float.valueOf(gkVar.f134082f)) && C46238a.m51546a(this.f134083g, gkVar.f134083g) && C46238a.m51546a(this.f134084h, gkVar.f134084h) && C46238a.m51546a(Integer.valueOf(this.f134085i), Integer.valueOf(gkVar.f134085i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134080d);
            C50028jr3 jr32 = this.f134081e;
            if (jr32 != null) {
                aVar.mo74322i(2, jr32.computeSize());
                this.f134081e.writeFields(aVar);
            }
            aVar.mo74317d(3, this.f134082f);
            C51399ti tiVar = this.f134083g;
            if (tiVar != null) {
                aVar.mo74322i(4, tiVar.computeSize());
                this.f134083g.writeFields(aVar);
            }
            C51581up3 up32 = this.f134084h;
            if (up32 != null) {
                aVar.mo74322i(5, up32.computeSize());
                this.f134084h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f134085i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134080d) + 0;
            C50028jr3 jr33 = this.f134081e;
            if (jr33 != null) {
                e += C52418a.m58682i(2, jr33.computeSize());
            }
            int d = e + C52418a.m58677d(3, this.f134082f);
            C51399ti tiVar2 = this.f134083g;
            if (tiVar2 != null) {
                d += C52418a.m58682i(4, tiVar2.computeSize());
            }
            C51581up3 up33 = this.f134084h;
            if (up33 != null) {
                d += C52418a.m58682i(5, up33.computeSize());
            }
            return d + C52418a.m58678e(6, this.f134085i);
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
            C49570gk gkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gkVar.f134080d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50028jr3 jr34 = new C50028jr3();
                        if (bArr != null && bArr.length > 0) {
                            jr34.parseFrom(bArr);
                        }
                        gkVar.f134081e = jr34;
                    }
                    return 0;
                case 3:
                    gkVar.f134082f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51399ti tiVar3 = new C51399ti();
                        if (bArr2 != null && bArr2.length > 0) {
                            tiVar3.parseFrom(bArr2);
                        }
                        gkVar.f134083g = tiVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51581up3 up34 = new C51581up3();
                        if (bArr3 != null && bArr3.length > 0) {
                            up34.parseFrom(bArr3);
                        }
                        gkVar.f134084h = up34;
                    }
                    return 0;
                case 6:
                    gkVar.f134085i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f134080d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "font_weight", valueOf, true);
            aVar.mo71655d(jSONObject, "background", this.f134081e, true);
            aVar.mo71655d(jSONObject, "radius", Float.valueOf(this.f134082f), true);
            aVar.mo71655d(jSONObject, "border", this.f134083g, true);
            aVar.mo71655d(jSONObject, "reddot_pendant", this.f134084h, true);
            aVar.mo71655d(jSONObject, "text_align", Integer.valueOf(this.f134085i), true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -2117277325:
                            if (next.equals("text_align")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1383304148:
                            if (next.equals("border")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1332194002:
                            if (next.equals("background")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -938578798:
                            if (next.equals("radius")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1474965877:
                            if (next.equals("reddot_pendant")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 2024311912:
                            if (next.equals("font_weight")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f134080d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C50028jr3 jr32 = new C50028jr3();
                            jr32.toPb(((JSONObject) opt).toString());
                            this.f134081e = jr32;
                        }
                    } else if (c == 2) {
                        this.f134082f = (float) jSONObject.optDouble(next);
                    } else if (c == 3) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C51399ti tiVar = new C51399ti();
                            tiVar.toPb(((JSONObject) opt2).toString());
                            this.f134083g = tiVar;
                        }
                    } else if (c == 4) {
                        Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof JSONObject) {
                            C51581up3 up32 = new C51581up3();
                            up32.toPb(((JSONObject) opt3).toString());
                            this.f134084h = up32;
                        }
                    } else if (c == 5) {
                        this.f134085i = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BusinessAttr", e, "", new Object[0]);
            }
        }
        return this;
    }
}
