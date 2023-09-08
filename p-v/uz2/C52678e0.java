package uz2;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.e0 */
public class C52678e0 extends C47465a {

    /* renamed from: d */
    public String f147087d;

    /* renamed from: e */
    public String f147088e;

    /* renamed from: f */
    public LinkedList<String> f147089f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C65488a0> f147090g = new LinkedList<>();

    /* renamed from: h */
    public String f147091h;

    /* renamed from: i */
    public String f147092i;

    /* renamed from: j */
    public LinkedList<C52725x> f147093j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C52731z> f147094n = new LinkedList<>();

    /* renamed from: o */
    public C52720v f147095o;

    /* renamed from: p */
    public String f147096p;

    /* renamed from: q */
    public C52708q f147097q;

    /* renamed from: r */
    public C89349b f147098r;

    /* renamed from: s */
    public int f147099s;

    /* renamed from: t */
    public LinkedList<C52708q> f147100t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52678e0)) {
            return false;
        }
        C52678e0 e0Var = (C52678e0) aVar;
        return C46238a.m51546a(this.f147087d, e0Var.f147087d) && C46238a.m51546a(this.f147088e, e0Var.f147088e) && C46238a.m51546a(this.f147089f, e0Var.f147089f) && C46238a.m51546a(this.f147090g, e0Var.f147090g) && C46238a.m51546a(this.f147091h, e0Var.f147091h) && C46238a.m51546a(this.f147092i, e0Var.f147092i) && C46238a.m51546a(this.f147093j, e0Var.f147093j) && C46238a.m51546a(this.f147094n, e0Var.f147094n) && C46238a.m51546a(this.f147095o, e0Var.f147095o) && C46238a.m51546a(this.f147096p, e0Var.f147096p) && C46238a.m51546a(this.f147097q, e0Var.f147097q) && C46238a.m51546a(this.f147098r, e0Var.f147098r) && C46238a.m51546a(Integer.valueOf(this.f147099s), Integer.valueOf(e0Var.f147099s)) && C46238a.m51546a(this.f147100t, e0Var.f147100t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147087d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147088e;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            aVar.mo74320g(13, 1, this.f147089f);
            aVar.mo74320g(15, 8, this.f147090g);
            String str3 = this.f147091h;
            if (str3 != null) {
                aVar.mo74323j(16, str3);
            }
            String str4 = this.f147092i;
            if (str4 != null) {
                aVar.mo74323j(17, str4);
            }
            aVar.mo74320g(19, 8, this.f147093j);
            aVar.mo74320g(20, 8, this.f147094n);
            C52720v vVar = this.f147095o;
            if (vVar != null) {
                aVar.mo74322i(22, vVar.computeSize());
                this.f147095o.writeFields(aVar);
            }
            String str5 = this.f147096p;
            if (str5 != null) {
                aVar.mo74323j(23, str5);
            }
            C52708q qVar = this.f147097q;
            if (qVar != null) {
                aVar.mo74322i(24, qVar.computeSize());
                this.f147097q.writeFields(aVar);
            }
            C89349b bVar = this.f147098r;
            if (bVar != null) {
                aVar.mo74315b(25, bVar);
            }
            aVar.mo74318e(26, this.f147099s);
            aVar.mo74320g(27, 8, this.f147100t);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f147087d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            String str7 = this.f147088e;
            if (str7 != null) {
                i3 += C52418a.m58683j(10, str7);
            }
            int g = i3 + C52418a.m58680g(13, 1, this.f147089f) + C52418a.m58680g(15, 8, this.f147090g);
            String str8 = this.f147091h;
            if (str8 != null) {
                g += C52418a.m58683j(16, str8);
            }
            String str9 = this.f147092i;
            if (str9 != null) {
                g += C52418a.m58683j(17, str9);
            }
            int g2 = g + C52418a.m58680g(19, 8, this.f147093j) + C52418a.m58680g(20, 8, this.f147094n);
            C52720v vVar2 = this.f147095o;
            if (vVar2 != null) {
                g2 += C52418a.m58682i(22, vVar2.computeSize());
            }
            String str10 = this.f147096p;
            if (str10 != null) {
                g2 += C52418a.m58683j(23, str10);
            }
            C52708q qVar2 = this.f147097q;
            if (qVar2 != null) {
                g2 += C52418a.m58682i(24, qVar2.computeSize());
            }
            C89349b bVar2 = this.f147098r;
            if (bVar2 != null) {
                g2 += C52418a.m58675b(25, bVar2);
            }
            return g2 + C52418a.m58678e(26, this.f147099s) + C52418a.m58680g(27, 8, this.f147100t);
        } else if (i2 == 2) {
            this.f147089f.clear();
            this.f147090g.clear();
            this.f147093j.clear();
            this.f147094n.clear();
            this.f147100t.clear();
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
            C52678e0 e0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e0Var.f147087d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 10) {
                e0Var.f147088e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 13) {
                e0Var.f147089f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 19) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C52725x xVar = new C52725x();
                    if (bArr != null && bArr.length > 0) {
                        xVar.parseFrom(bArr);
                    }
                    e0Var.f147093j.add(xVar);
                }
                return 0;
            } else if (intValue != 20) {
                switch (intValue) {
                    case 15:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C65488a0 a0Var = new C65488a0();
                            if (bArr2 != null && bArr2.length > 0) {
                                a0Var.parseFrom(bArr2);
                            }
                            e0Var.f147090g.add(a0Var);
                        }
                        return 0;
                    case 16:
                        e0Var.f147091h = aVar3.mo141633k(intValue);
                        return 0;
                    case 17:
                        e0Var.f147092i = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 22:
                                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                                int size3 = j3.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    byte[] bArr3 = j3.get(i6);
                                    C52720v vVar3 = new C52720v();
                                    if (bArr3 != null && bArr3.length > 0) {
                                        vVar3.parseFrom(bArr3);
                                    }
                                    e0Var.f147095o = vVar3;
                                }
                                return 0;
                            case 23:
                                e0Var.f147096p = aVar3.mo141633k(intValue);
                                return 0;
                            case 24:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    byte[] bArr4 = j4.get(i7);
                                    C52708q qVar3 = new C52708q();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        qVar3.parseFrom(bArr4);
                                    }
                                    e0Var.f147097q = qVar3;
                                }
                                return 0;
                            case 25:
                                e0Var.f147098r = aVar3.mo141626d(intValue);
                                return 0;
                            case 26:
                                e0Var.f147099s = aVar3.mo141629g(intValue);
                                return 0;
                            case 27:
                                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                int size5 = j5.size();
                                for (int i8 = 0; i8 < size5; i8++) {
                                    byte[] bArr5 = j5.get(i8);
                                    C52708q qVar4 = new C52708q();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        qVar4.parseFrom(bArr5);
                                    }
                                    e0Var.f147100t.add(qVar4);
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                int size6 = j6.size();
                for (int i9 = 0; i9 < size6; i9++) {
                    byte[] bArr6 = j6.get(i9);
                    C52731z zVar = new C52731z();
                    if (bArr6 != null && bArr6.length > 0) {
                        zVar.parseFrom(bArr6);
                    }
                    e0Var.f147094n.add(zVar);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147087d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "topicId", str, false);
            aVar.mo71655d(jSONObject, "iconId", this.f147088e, false);
            aVar.mo71655d(jSONObject, "topics", this.f147089f, false);
            aVar.mo71655d(jSONObject, "jumpInfos", this.f147090g, false);
            aVar.mo71655d(jSONObject, "verifyInfo", this.f147091h, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f147092i, false);
            aVar.mo71655d(jSONObject, "iconActions", this.f147093j, false);
            aVar.mo71655d(jSONObject, "jumpElements", this.f147094n, false);
            aVar.mo71655d(jSONObject, "footer", this.f147095o, false);
            aVar.mo71655d(jSONObject, "clusterIdDeprecated", this.f147096p, false);
            aVar.mo71655d(jSONObject, "clusterPresentDeprecated", this.f147097q, false);
            aVar.mo71655d(jSONObject, "deprecatedBuffer", this.f147098r, false);
            aVar.mo71655d(jSONObject, "characterSetType", Integer.valueOf(this.f147099s), false);
            aVar.mo71655d(jSONObject, "clusterPresents", this.f147100t, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
