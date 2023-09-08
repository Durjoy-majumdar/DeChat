package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.z1 */
public class C106595z1 {

    /* renamed from: a */
    public boolean f318518a;

    /* renamed from: b */
    public C96814a.C96817e f318519b = C96814a.C96817e.DEFAULT;

    /* renamed from: c */
    public int f318520c;

    /* renamed from: d */
    public int f318521d;

    /* renamed from: e */
    public int f318522e;

    /* renamed from: f */
    public int f318523f;

    /* renamed from: g */
    public int f318524g;

    /* renamed from: h */
    public int f318525h;

    /* renamed from: a */
    public boolean mo153321a(int i, int i2, int i3, int i4) {
        if (this.f318520c == i && this.f318521d == i2 && this.f318522e == i3 && this.f318523f == i4) {
            return true;
        }
        this.f318520c = i;
        this.f318521d = i2;
        this.f318522e = i3;
        this.f318523f = i4;
        float f = (((float) i3) * 1.0f) / ((float) i4);
        float f2 = (((float) i) * 1.0f) / ((float) i2);
        C96814a.C96817e eVar = this.f318519b;
        if (eVar == C96814a.C96817e.DEFAULT) {
            mo153322b(f, f2);
        } else if (eVar == C96814a.C96817e.CONTAIN) {
            if (i < i2) {
                int i5 = (int) (((float) i) / f);
                this.f318525h = i5;
                this.f318524g = i;
                if (i5 > i2) {
                    this.f318524g = (int) (((float) i2) * f);
                    this.f318525h = i2;
                }
            } else {
                int i6 = (int) (((float) i2) * f);
                this.f318524g = i6;
                this.f318525h = i2;
                if (i6 > i) {
                    this.f318525h = (int) (((float) i) / f);
                    this.f318524g = i;
                }
            }
        } else if (eVar == C96814a.C96817e.FILL) {
            this.f318525h = i2;
            this.f318524g = i;
        } else if (eVar != C96814a.C96817e.COVER) {
            mo153322b(f, f2);
        } else if (i > i2) {
            int i7 = (int) (((float) i) / f);
            this.f318525h = i7;
            this.f318524g = i;
            if (i7 < i2) {
                this.f318524g = (int) (((float) i2) * f);
                this.f318525h = i2;
            }
        } else {
            int i8 = (int) (((float) i2) * f);
            this.f318524g = i8;
            this.f318525h = i2;
            if (i8 < i) {
                this.f318525h = (int) (((float) i) / f);
                this.f318524g = i;
            }
        }
        Log.m105919d("MicroMsg.ViewSizeCache", "screen[%d, %d], video[%d, %d], measure[%d, %d] scale[%f, %f]", Integer.valueOf(this.f318520c), Integer.valueOf(this.f318521d), Integer.valueOf(this.f318522e), Integer.valueOf(this.f318523f), Integer.valueOf(this.f318524g), Integer.valueOf(this.f318525h), Float.valueOf(f2), Float.valueOf(f));
        return false;
    }

    /* renamed from: b */
    public final void mo153322b(float f, float f2) {
        if (!this.f318518a) {
            int i = this.f318520c;
            int i2 = this.f318521d;
            if (i < i2) {
                this.f318525h = (int) (((float) i) / f);
                this.f318524g = i;
                return;
            }
            this.f318524g = (int) (((float) i2) * f);
            this.f318525h = i2;
        } else if (((double) Math.abs(f - f2)) > 0.05d) {
            int i3 = this.f318520c;
            int i4 = this.f318521d;
            if (i3 < i4) {
                this.f318525h = (int) (((float) i3) / f);
                this.f318524g = i3;
                return;
            }
            this.f318524g = (int) (((float) i4) * f);
            this.f318525h = i4;
        } else {
            int i5 = this.f318520c;
            int i6 = this.f318521d;
            if (i5 > i6) {
                this.f318525h = (int) (((float) i5) / f);
                this.f318524g = i5;
                return;
            }
            this.f318524g = (int) (((float) i6) * f);
            this.f318525h = i6;
        }
    }

    /* renamed from: c */
    public void mo153323c() {
        this.f318521d = 0;
        this.f318520c = 0;
        this.f318523f = 0;
        this.f318522e = 0;
        this.f318525h = 0;
        this.f318524g = 0;
    }

    /* renamed from: d */
    public boolean mo153324d(C96814a.C96817e eVar) {
        C96814a.C96817e eVar2 = this.f318519b;
        boolean z = eVar2 == eVar;
        Log.m105925i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", eVar2, eVar);
        this.f318519b = eVar;
        mo153323c();
        return !z;
    }
}
