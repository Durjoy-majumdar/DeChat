package te3;

import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qv3 */
public class C51018qv3 extends C47465a {

    /* renamed from: d */
    public int f140572d;

    /* renamed from: e */
    public boolean f140573e;

    /* renamed from: f */
    public C89349b f140574f;

    /* renamed from: g */
    public boolean f140575g;

    /* renamed from: b */
    public byte[] mo73346b() {
        return this.f140574f.f257327a;
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51018qv3) && this.f140572d == ((C51018qv3) aVar).f140572d;
    }

    public int computeSize() {
        int e = C52418a.m58678e(1, this.f140572d) + 0;
        if (this.f140575g) {
            e += C52418a.m58675b(2, this.f140574f);
        }
        return e + 0;
    }

    /* renamed from: d */
    public int mo73347d() {
        return this.f140572d;
    }

    /* renamed from: f */
    public C51018qv3 mo73348f(byte[] bArr) {
        C102122a aVar = new C102122a(bArr, C47465a.unknownTagHandler);
        for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.mo141624b();
            }
        }
        mo73351l();
        return this;
    }

    /* renamed from: j */
    public C51018qv3 mo73349j(C89349b bVar) {
        if (bVar == null) {
            mo73350k((byte[]) null);
        }
        this.f140574f = bVar;
        this.f140575g = true;
        this.f140572d = bVar.f257327a.length;
        this.f140573e = true;
        return this;
    }

    /* renamed from: k */
    public C51018qv3 mo73350k(byte[] bArr) {
        C89349b a = C89349b.m111674a(bArr);
        mo73349j(a);
        this.f140572d = a.f257327a.length;
        this.f140573e = true;
        return this;
    }

    /* renamed from: l */
    public C51018qv3 mo73351l() {
        if (this.f140573e) {
            return this;
        }
        throw new C52419b("Not all required fields were included (false = not included in message),  iLen:" + this.f140573e + "");
    }

    public /* bridge */ /* synthetic */ C47465a parseFrom(byte[] bArr) {
        mo73348f(bArr);
        return this;
    }

    public final boolean populateBuilderWithField(C102122a aVar, C47465a aVar2, int i) {
        C51018qv3 qv32 = (C51018qv3) aVar2;
        if (i == 1) {
            qv32.f140572d = aVar.mo141629g(i);
            qv32.f140573e = true;
            return true;
        } else if (i != 2) {
            return false;
        } else {
            qv32.mo73349j(aVar.mo141626d(i));
            return true;
        }
    }

    public byte[] toByteArray() {
        mo73351l();
        return super.toByteArray();
    }

    public Object toJSON() {
        return "";
    }

    public String toString() {
        String str = ("" + C51018qv3.class.getName() + "(") + "iLen = " + this.f140572d + "   ";
        if (this.f140575g) {
            str = str + "Buffer = " + this.f140574f + "   ";
        }
        return str + ")";
    }

    public /* bridge */ /* synthetic */ C47465a validate() {
        mo73351l();
        return this;
    }

    public void writeFields(C53733a aVar) {
        aVar.mo74318e(1, this.f140572d);
        if (this.f140575g) {
            aVar.mo74315b(2, this.f140574f);
        }
    }
}
