package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class me4 extends C47465a {

    /* renamed from: d */
    public String f64239d;

    /* renamed from: e */
    public oe4 f64240e;

    /* renamed from: f */
    public String f64241f;

    /* renamed from: g */
    public LinkedList<ne4> f64242g = new LinkedList<>();

    /* renamed from: h */
    public String f64243h;

    /* renamed from: i */
    public long f64244i;

    /* renamed from: j */
    public qe4 f64245j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof me4)) {
            return false;
        }
        me4 me4 = (me4) aVar;
        return C46238a.m51546a(this.f64239d, me4.f64239d) && C46238a.m51546a(this.f64240e, me4.f64240e) && C46238a.m51546a(this.f64241f, me4.f64241f) && C46238a.m51546a(this.f64242g, me4.f64242g) && C46238a.m51546a(this.f64243h, me4.f64243h) && C46238a.m51546a(Long.valueOf(this.f64244i), Long.valueOf(me4.f64244i)) && C46238a.m51546a(this.f64245j, me4.f64245j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64239d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            oe4 oe4 = this.f64240e;
            if (oe4 != null) {
                aVar.mo74322i(2, oe4.computeSize());
                this.f64240e.writeFields(aVar);
            }
            String str2 = this.f64241f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f64242g);
            String str3 = this.f64243h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f64244i);
            qe4 qe4 = this.f64245j;
            if (qe4 != null) {
                aVar.mo74322i(7, qe4.computeSize());
                this.f64245j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f64239d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            oe4 oe42 = this.f64240e;
            if (oe42 != null) {
                i2 += C52418a.m58682i(2, oe42.computeSize());
            }
            String str5 = this.f64241f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int g = i2 + C52418a.m58680g(4, 8, this.f64242g);
            String str6 = this.f64243h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            int h = g + C52418a.m58681h(6, this.f64244i);
            qe4 qe42 = this.f64245j;
            return qe42 != null ? h + C52418a.m58682i(7, qe42.computeSize()) : h;
        } else if (i == 2) {
            this.f64242g.clear();
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
            me4 me4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    me4.f64239d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        oe4 oe43 = new oe4();
                        if (bArr != null && bArr.length > 0) {
                            oe43.parseFrom(bArr);
                        }
                        me4.f64240e = oe43;
                    }
                    return 0;
                case 3:
                    me4.f64241f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ne4 ne4 = new ne4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ne4.parseFrom(bArr2);
                        }
                        me4.f64242g.add(ne4);
                    }
                    return 0;
                case 5:
                    me4.f64243h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    me4.f64244i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        qe4 qe43 = new qe4();
                        if (bArr3 != null && bArr3.length > 0) {
                            qe43.parseFrom(bArr3);
                        }
                        me4.f64245j = qe43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
