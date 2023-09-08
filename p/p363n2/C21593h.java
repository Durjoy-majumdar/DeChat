package p363n2;

import java.util.Arrays;

/* renamed from: n2.h */
public class C21593h {

    /* renamed from: a */
    public int f61151a = -1;

    /* renamed from: b */
    public int f61152b = -1;

    /* renamed from: c */
    public int f61153c = 0;

    /* renamed from: d */
    public float f61154d;

    /* renamed from: e */
    public float[] f61155e = new float[7];

    /* renamed from: f */
    public C21594a f61156f;

    /* renamed from: g */
    public C21586b[] f61157g = new C21586b[8];

    /* renamed from: h */
    public int f61158h = 0;

    /* renamed from: i */
    public int f61159i = 0;

    /* renamed from: n2.h$a */
    public enum C21594a {
        UNRESTRICTED,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C21593h(C21594a aVar, String str) {
        this.f61156f = aVar;
    }

    /* renamed from: a */
    public final void mo33852a(C21586b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f61158h;
            if (i >= i2) {
                C21586b[] bVarArr = this.f61157g;
                if (i2 >= bVarArr.length) {
                    this.f61157g = (C21586b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C21586b[] bVarArr2 = this.f61157g;
                int i3 = this.f61158h;
                bVarArr2[i3] = bVar;
                this.f61158h = i3 + 1;
                return;
            } else if (this.f61157g[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo33853b(C21586b bVar) {
        int i = this.f61158h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f61157g[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C21586b[] bVarArr = this.f61157g;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f61158h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo33854c() {
        this.f61156f = C21594a.UNKNOWN;
        this.f61153c = 0;
        this.f61151a = -1;
        this.f61152b = -1;
        this.f61154d = 0.0f;
        this.f61158h = 0;
        this.f61159i = 0;
    }

    /* renamed from: d */
    public final void mo33855d(C21586b bVar) {
        int i = this.f61158h;
        for (int i2 = 0; i2 < i; i2++) {
            C21586b bVar2 = this.f61157g[i2];
            C21585a aVar = bVar2.f61129c;
            int i3 = aVar.f61124h;
            while (true) {
                int i4 = 0;
                while (i3 != -1 && i4 < aVar.f61117a) {
                    int i5 = aVar.f61121e[i3];
                    C21593h hVar = bVar.f61127a;
                    if (i5 == hVar.f61151a) {
                        float f = aVar.f61123g[i3];
                        aVar.mo33826g(hVar, false);
                        C21585a aVar2 = bVar.f61129c;
                        int i6 = aVar2.f61124h;
                        int i7 = 0;
                        while (i6 != -1 && i7 < aVar2.f61117a) {
                            aVar.mo33820a(aVar.f61119c.f61133c[aVar2.f61121e[i6]], aVar2.f61123g[i6] * f, false);
                            i6 = aVar2.f61122f[i6];
                            i7++;
                        }
                        bVar2.f61128b += bVar.f61128b * f;
                        i3 = aVar.f61124h;
                    } else {
                        i3 = aVar.f61122f[i3];
                        i4++;
                    }
                }
            }
        }
        this.f61158h = 0;
    }

    public String toString() {
        return "null";
    }
}
