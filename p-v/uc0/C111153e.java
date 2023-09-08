package uc0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.e */
public class C111153e extends C47465a {

    /* renamed from: d */
    public LinkedList<C65319f> f332877d = new LinkedList<>();

    /* renamed from: e */
    public String f332878e;

    /* renamed from: f */
    public int f332879f;

    /* renamed from: g */
    public int f332880g;

    /* renamed from: h */
    public int f332881h;

    /* renamed from: i */
    public int f332882i;

    /* renamed from: j */
    public String f332883j;

    /* renamed from: n */
    public int f332884n;

    /* renamed from: o */
    public C111156r f332885o;

    /* renamed from: p */
    public LinkedList<C111157v> f332886p = new LinkedList<>();

    /* renamed from: q */
    public int f332887q;

    /* renamed from: r */
    public C111152d f332888r;

    /* renamed from: s */
    public C111155i f332889s;

    /* renamed from: t */
    public int f332890t;

    /* renamed from: u */
    public String f332891u;

    /* renamed from: v */
    public C111154h f332892v;

    /* renamed from: w */
    public C65320l f332893w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C111153e)) {
            return false;
        }
        C111153e eVar = (C111153e) aVar;
        return C46238a.m51546a(this.f332877d, eVar.f332877d) && C46238a.m51546a(this.f332878e, eVar.f332878e) && C46238a.m51546a(Integer.valueOf(this.f332879f), Integer.valueOf(eVar.f332879f)) && C46238a.m51546a(Integer.valueOf(this.f332880g), Integer.valueOf(eVar.f332880g)) && C46238a.m51546a(Integer.valueOf(this.f332881h), Integer.valueOf(eVar.f332881h)) && C46238a.m51546a(Integer.valueOf(this.f332882i), Integer.valueOf(eVar.f332882i)) && C46238a.m51546a(this.f332883j, eVar.f332883j) && C46238a.m51546a(Integer.valueOf(this.f332884n), Integer.valueOf(eVar.f332884n)) && C46238a.m51546a(this.f332885o, eVar.f332885o) && C46238a.m51546a(this.f332886p, eVar.f332886p) && C46238a.m51546a(Integer.valueOf(this.f332887q), Integer.valueOf(eVar.f332887q)) && C46238a.m51546a(this.f332888r, eVar.f332888r) && C46238a.m51546a(this.f332889s, eVar.f332889s) && C46238a.m51546a(Integer.valueOf(this.f332890t), Integer.valueOf(eVar.f332890t)) && C46238a.m51546a(this.f332891u, eVar.f332891u) && C46238a.m51546a(this.f332892v, eVar.f332892v) && C46238a.m51546a(this.f332893w, eVar.f332893w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f332877d);
            String str = this.f332878e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f332879f);
            aVar.mo74318e(4, this.f332880g);
            aVar.mo74318e(5, this.f332881h);
            aVar.mo74318e(6, this.f332882i);
            String str2 = this.f332883j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f332884n);
            C111156r rVar = this.f332885o;
            if (rVar != null) {
                aVar.mo74322i(9, rVar.computeSize());
                this.f332885o.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f332886p);
            aVar.mo74318e(11, this.f332887q);
            C111152d dVar = this.f332888r;
            if (dVar != null) {
                aVar.mo74322i(12, dVar.computeSize());
                this.f332888r.writeFields(aVar);
            }
            C111155i iVar = this.f332889s;
            if (iVar != null) {
                aVar.mo74322i(13, iVar.computeSize());
                this.f332889s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f332890t);
            String str3 = this.f332891u;
            if (str3 != null) {
                aVar.mo74323j(15, str3);
            }
            C111154h hVar = this.f332892v;
            if (hVar != null) {
                aVar.mo74322i(16, hVar.computeSize());
                this.f332892v.writeFields(aVar);
            }
            C65320l lVar = this.f332893w;
            if (lVar != null) {
                aVar.mo74322i(17, lVar.computeSize());
                this.f332893w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int g = C52418a.m58680g(1, 8, this.f332877d) + 0;
            String str4 = this.f332878e;
            if (str4 != null) {
                g += C52418a.m58683j(2, str4);
            }
            int e = g + C52418a.m58678e(3, this.f332879f) + C52418a.m58678e(4, this.f332880g) + C52418a.m58678e(5, this.f332881h) + C52418a.m58678e(6, this.f332882i);
            String str5 = this.f332883j;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            int e2 = e + C52418a.m58678e(8, this.f332884n);
            C111156r rVar2 = this.f332885o;
            if (rVar2 != null) {
                e2 += C52418a.m58682i(9, rVar2.computeSize());
            }
            int g2 = e2 + C52418a.m58680g(10, 8, this.f332886p) + C52418a.m58678e(11, this.f332887q);
            C111152d dVar2 = this.f332888r;
            if (dVar2 != null) {
                g2 += C52418a.m58682i(12, dVar2.computeSize());
            }
            C111155i iVar2 = this.f332889s;
            if (iVar2 != null) {
                g2 += C52418a.m58682i(13, iVar2.computeSize());
            }
            int e3 = g2 + C52418a.m58678e(14, this.f332890t);
            String str6 = this.f332891u;
            if (str6 != null) {
                e3 += C52418a.m58683j(15, str6);
            }
            C111154h hVar2 = this.f332892v;
            if (hVar2 != null) {
                e3 += C52418a.m58682i(16, hVar2.computeSize());
            }
            C65320l lVar2 = this.f332893w;
            return lVar2 != null ? e3 + C52418a.m58682i(17, lVar2.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f332877d.clear();
            this.f332886p.clear();
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
            C111153e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C65319f fVar = new C65319f();
                        if (bArr != null && bArr.length > 0) {
                            fVar.parseFrom(bArr);
                        }
                        eVar.f332877d.add(fVar);
                    }
                    return 0;
                case 2:
                    eVar.f332878e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eVar.f332879f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    eVar.f332880g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    eVar.f332881h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    eVar.f332882i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    eVar.f332883j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    eVar.f332884n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C111156r rVar3 = new C111156r();
                        if (bArr2 != null && bArr2.length > 0) {
                            rVar3.parseFrom(bArr2);
                        }
                        eVar.f332885o = rVar3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C111157v vVar = new C111157v();
                        if (bArr3 != null && bArr3.length > 0) {
                            vVar.parseFrom(bArr3);
                        }
                        eVar.f332886p.add(vVar);
                    }
                    return 0;
                case 11:
                    eVar.f332887q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C111152d dVar3 = new C111152d();
                        if (bArr4 != null && bArr4.length > 0) {
                            dVar3.parseFrom(bArr4);
                        }
                        eVar.f332888r = dVar3;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C111155i iVar3 = new C111155i();
                        if (bArr5 != null && bArr5.length > 0) {
                            iVar3.parseFrom(bArr5);
                        }
                        eVar.f332889s = iVar3;
                    }
                    return 0;
                case 14:
                    eVar.f332890t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    eVar.f332891u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C111154h hVar3 = new C111154h();
                        if (bArr6 != null && bArr6.length > 0) {
                            hVar3.parseFrom(bArr6);
                        }
                        eVar.f332892v = hVar3;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C65320l lVar3 = new C65320l();
                        if (bArr7 != null && bArr7.length > 0) {
                            lVar3.parseFrom(bArr7);
                        }
                        eVar.f332893w = lVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
