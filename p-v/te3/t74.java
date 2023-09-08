package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class t74 extends C47465a {

    /* renamed from: d */
    public int f299479d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f299480e = new LinkedList<>();

    /* renamed from: f */
    public int f299481f;

    /* renamed from: g */
    public LinkedList<Integer> f299482g = new LinkedList<>();

    /* renamed from: h */
    public int f299483h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f299484i = new LinkedList<>();

    /* renamed from: j */
    public int f299485j;

    /* renamed from: n */
    public LinkedList<Integer> f299486n = new LinkedList<>();

    /* renamed from: o */
    public int f299487o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t74)) {
            return false;
        }
        t74 t74 = (t74) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299479d), Integer.valueOf(t74.f299479d)) && C46238a.m51546a(this.f299480e, t74.f299480e) && C46238a.m51546a(Integer.valueOf(this.f299481f), Integer.valueOf(t74.f299481f)) && C46238a.m51546a(this.f299482g, t74.f299482g) && C46238a.m51546a(Integer.valueOf(this.f299483h), Integer.valueOf(t74.f299483h)) && C46238a.m51546a(this.f299484i, t74.f299484i) && C46238a.m51546a(Integer.valueOf(this.f299485j), Integer.valueOf(t74.f299485j)) && C46238a.m51546a(this.f299486n, t74.f299486n) && C46238a.m51546a(Integer.valueOf(this.f299487o), Integer.valueOf(t74.f299487o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299479d);
            aVar.mo74320g(2, 8, this.f299480e);
            aVar.mo74318e(3, this.f299481f);
            aVar.mo74324k(4, 2, this.f299482g);
            aVar.mo74318e(5, this.f299483h);
            aVar.mo74320g(6, 8, this.f299484i);
            aVar.mo74318e(7, this.f299485j);
            aVar.mo74324k(8, 2, this.f299486n);
            aVar.mo74318e(9, this.f299487o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f299479d) + 0 + C52418a.m58680g(2, 8, this.f299480e) + C52418a.m58678e(3, this.f299481f) + C52418a.m58684k(4, 2, this.f299482g) + C52418a.m58678e(5, this.f299483h) + C52418a.m58680g(6, 8, this.f299484i) + C52418a.m58678e(7, this.f299485j) + C52418a.m58684k(8, 2, this.f299486n) + C52418a.m58678e(9, this.f299487o);
        } else {
            if (i == 2) {
                this.f299480e.clear();
                this.f299482g.clear();
                this.f299484i.clear();
                this.f299486n.clear();
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
                t74 t74 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        t74.f299479d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C51163rv3 rv32 = new C51163rv3();
                            if (bArr != null && bArr.length > 0) {
                                rv32.mo73356d(bArr);
                            }
                            t74.f299480e.add(rv32);
                        }
                        return 0;
                    case 3:
                        t74.f299481f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                        C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                        LinkedList<Integer> linkedList = new LinkedList<>();
                        while (aVar4.f301908c < aVar4.f301907b) {
                            linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                        }
                        t74.f299482g = linkedList;
                        return 0;
                    case 5:
                        t74.f299483h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            byte[] bArr3 = j2.get(i3);
                            C51163rv3 rv33 = new C51163rv3();
                            if (bArr3 != null && bArr3.length > 0) {
                                rv33.mo73356d(bArr3);
                            }
                            t74.f299484i.add(rv33);
                        }
                        return 0;
                    case 7:
                        t74.f299485j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        byte[] bArr4 = aVar3.mo141626d(intValue).f257327a;
                        C102536a aVar5 = new C102536a(bArr4, 0, bArr4.length);
                        LinkedList<Integer> linkedList2 = new LinkedList<>();
                        while (aVar5.f301908c < aVar5.f301907b) {
                            linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                        }
                        t74.f299486n = linkedList2;
                        return 0;
                    case 9:
                        t74.f299487o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
