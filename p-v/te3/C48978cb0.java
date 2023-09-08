package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cb0 */
public class C48978cb0 extends C47465a {

    /* renamed from: d */
    public long f131607d;

    /* renamed from: e */
    public String f131608e;

    /* renamed from: f */
    public String f131609f;

    /* renamed from: g */
    public String f131610g;

    /* renamed from: h */
    public int f131611h;

    /* renamed from: i */
    public int f131612i;

    /* renamed from: j */
    public C49119db0 f131613j;

    /* renamed from: n */
    public C50784p51 f131614n;

    /* renamed from: o */
    public C51516ua1 f131615o;

    /* renamed from: p */
    public LinkedList<C49321er0> f131616p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48978cb0)) {
            return false;
        }
        C48978cb0 cb02 = (C48978cb0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131607d), Long.valueOf(cb02.f131607d)) && C46238a.m51546a(this.f131608e, cb02.f131608e) && C46238a.m51546a(this.f131609f, cb02.f131609f) && C46238a.m51546a(this.f131610g, cb02.f131610g) && C46238a.m51546a(Integer.valueOf(this.f131611h), Integer.valueOf(cb02.f131611h)) && C46238a.m51546a(Integer.valueOf(this.f131612i), Integer.valueOf(cb02.f131612i)) && C46238a.m51546a(this.f131613j, cb02.f131613j) && C46238a.m51546a(this.f131614n, cb02.f131614n) && C46238a.m51546a(this.f131615o, cb02.f131615o) && C46238a.m51546a(this.f131616p, cb02.f131616p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131607d);
            String str = this.f131608e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131609f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131610g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f131611h);
            aVar.mo74318e(6, this.f131612i);
            C49119db0 db02 = this.f131613j;
            if (db02 != null) {
                aVar.mo74322i(7, db02.computeSize());
                this.f131613j.writeFields(aVar);
            }
            C50784p51 p512 = this.f131614n;
            if (p512 != null) {
                aVar.mo74322i(10, p512.computeSize());
                this.f131614n.writeFields(aVar);
            }
            C51516ua1 ua12 = this.f131615o;
            if (ua12 != null) {
                aVar.mo74322i(11, ua12.computeSize());
                this.f131615o.writeFields(aVar);
            }
            aVar.mo74320g(12, 8, this.f131616p);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f131607d) + 0;
            String str4 = this.f131608e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.f131609f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f131610g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            int e = h + C52418a.m58678e(5, this.f131611h) + C52418a.m58678e(6, this.f131612i);
            C49119db0 db03 = this.f131613j;
            if (db03 != null) {
                e += C52418a.m58682i(7, db03.computeSize());
            }
            C50784p51 p513 = this.f131614n;
            if (p513 != null) {
                e += C52418a.m58682i(10, p513.computeSize());
            }
            C51516ua1 ua13 = this.f131615o;
            if (ua13 != null) {
                e += C52418a.m58682i(11, ua13.computeSize());
            }
            return e + C52418a.m58680g(12, 8, this.f131616p);
        } else if (i2 == 2) {
            this.f131616p.clear();
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
            C48978cb0 cb02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cb02.f131607d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    cb02.f131608e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cb02.f131609f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cb02.f131610g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cb02.f131611h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    cb02.f131612i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49119db0 db04 = new C49119db0();
                        if (bArr != null && bArr.length > 0) {
                            db04.parseFrom(bArr);
                        }
                        cb02.f131613j = db04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50784p51 p514 = new C50784p51();
                        if (bArr2 != null && bArr2.length > 0) {
                            p514.parseFrom(bArr2);
                        }
                        cb02.f131614n = p514;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51516ua1 ua14 = new C51516ua1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ua14.parseFrom(bArr3);
                        }
                        cb02.f131615o = ua14;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49321er0 er02 = new C49321er0();
                        if (bArr4 != null && bArr4.length > 0) {
                            er02.parseFrom(bArr4);
                        }
                        cb02.f131616p.add(er02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
