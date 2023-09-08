package p1046ue;

import com.tencent.matrix.openglleak.hook.OpenGLHook;
import java.util.Arrays;
import p1046ue.C90650d;
import p1053ve.C90771e;
import p723vf.C118672d;

/* renamed from: ue.b */
public class C90648b {

    /* renamed from: a */
    public int f260425a;

    /* renamed from: b */
    public int f260426b;

    /* renamed from: c */
    public int f260427c;

    /* renamed from: d */
    public int f260428d;

    /* renamed from: e */
    public int f260429e;

    /* renamed from: f */
    public long f260430f;

    /* renamed from: g */
    public int f260431g;

    /* renamed from: h */
    public C90771e.C90772a f260432h;

    /* renamed from: i */
    public long f260433i = 0;

    /* renamed from: j */
    public final C90650d.C90651a f260434j;

    /* renamed from: k */
    public long f260435k;

    /* renamed from: l */
    public C90647a[] f260436l;

    public C90648b(C90650d.C90651a aVar) {
        this.f260434j = aVar;
        if (aVar == C90650d.C90651a.TEXTURE) {
            this.f260436l = new C90647a[6];
        }
    }

    /* renamed from: a */
    public String mo124781a() {
        long j = this.f260433i;
        return j != 0 ? OpenGLHook.dumpNativeStack(j) : "";
    }

    /* renamed from: b */
    public long mo124782b() {
        if (this.f260434j != C90650d.C90651a.TEXTURE) {
            return this.f260435k;
        }
        long j = 0;
        for (C90647a aVar : this.f260436l) {
            if (aVar != null) {
                j += aVar.f260413a;
            }
        }
        return j;
    }

    /* renamed from: c */
    public void mo124783c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, long j, long j2, C90771e.C90772a aVar, long j3) {
        char c;
        int i16 = i;
        if (!(i16 == 3553 || i16 == 32879 || i16 == 35866)) {
            switch (i16) {
                case 34069:
                    break;
                case 34070:
                    c = 1;
                    break;
                case 34071:
                    c = 2;
                    break;
                case 34072:
                    c = 3;
                    break;
                case 34073:
                    c = 4;
                    break;
                case 34074:
                    c = 5;
                    break;
                default:
                    c = 65535;
                    break;
            }
        }
        c = 0;
        if (c == 65535) {
            C118672d.m167352b("MicroMsg.OpenGLHook", "setTexturesInfo faceId = -1, target = " + i, new Object[0]);
            return;
        }
        long j4 = this.f260433i;
        if (j4 != 0) {
            OpenGLHook.releaseNative(j4);
        }
        if (this.f260432h != null) {
            aVar.mo124896a();
        }
        this.f260432h = aVar;
        this.f260433i = j3;
        C90647a[] aVarArr = this.f260436l;
        C90647a aVar2 = aVarArr[c];
        if (aVar2 == null) {
            aVar2 = new C90647a();
        }
        aVar2.f260414b = i16;
        aVar2.f260415c = i15;
        aVar2.f260416d = j;
        aVar2.f260417e = i2;
        aVar2.f260418f = i3;
        aVar2.f260419g = i4;
        aVar2.f260420h = i5;
        aVar2.f260421i = i6;
        aVar2.f260422j = i7;
        aVar2.f260423k = i8;
        aVar2.f260424l = i9;
        aVar2.f260413a = j2;
        aVarArr[c] = aVar2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MemoryInfo{target=");
        sb.append(this.f260425a);
        sb.append(", internalFormat=");
        sb.append(this.f260426b);
        sb.append(", width=");
        sb.append(this.f260427c);
        sb.append(", height=");
        sb.append(this.f260428d);
        sb.append(", id=");
        sb.append(this.f260429e);
        sb.append(", eglContextId=");
        sb.append(this.f260430f);
        sb.append(", usage=");
        sb.append(this.f260431g);
        sb.append(", javaStack='");
        C90771e.C90772a aVar = this.f260432h;
        sb.append(aVar == null ? "" : aVar.f260668a);
        sb.append('\'');
        sb.append(", nativeStack='");
        sb.append(mo124781a());
        sb.append('\'');
        sb.append(", resType=");
        sb.append(this.f260434j);
        sb.append(", size=");
        sb.append(mo124782b());
        sb.append(", faces=");
        sb.append(Arrays.toString(this.f260436l));
        sb.append('}');
        return sb.toString();
    }
}
