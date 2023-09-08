package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m84 extends C47465a {

    /* renamed from: d */
    public long f137907d;

    /* renamed from: e */
    public String f137908e;

    /* renamed from: f */
    public int f137909f;

    /* renamed from: g */
    public LinkedList<C51163rv3> f137910g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m84)) {
            return false;
        }
        m84 m84 = (m84) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137907d), Long.valueOf(m84.f137907d)) && C46238a.m51546a(this.f137908e, m84.f137908e) && C46238a.m51546a(Integer.valueOf(this.f137909f), Integer.valueOf(m84.f137909f)) && C46238a.m51546a(this.f137910g, m84.f137910g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f137907d);
            String str = this.f137908e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f137909f);
            aVar.mo74320g(4, 8, this.f137910g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137907d) + 0;
            String str2 = this.f137908e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f137909f) + C52418a.m58680g(4, 8, this.f137910g);
        } else if (i == 2) {
            this.f137910g.clear();
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
            m84 m84 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m84.f137907d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                m84.f137908e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m84.f137909f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51163rv3 rv32 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv32.mo73356d(bArr);
                    }
                    m84.f137910g.add(rv32);
                }
                return 0;
            }
        }
    }
}
