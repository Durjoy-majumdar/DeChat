package p006bk;

import android.content.Context;
import android.util.DisplayMetrics;
import p850ek.C58612c;
import p871zj.C66836c;

/* renamed from: bk.i */
public class C54486i {

    /* renamed from: q */
    public static boolean f152753q = true;

    /* renamed from: a */
    public int f152754a;

    /* renamed from: b */
    public int f152755b;

    /* renamed from: c */
    public int f152756c;

    /* renamed from: d */
    public int f152757d;

    /* renamed from: e */
    public int f152758e;

    /* renamed from: f */
    public float f152759f;

    /* renamed from: g */
    public float f152760g;

    /* renamed from: h */
    public boolean f152761h = true;

    /* renamed from: i */
    public boolean f152762i;

    /* renamed from: j */
    public int f152763j;

    /* renamed from: k */
    public int f152764k;

    /* renamed from: l */
    public float f152765l;

    /* renamed from: m */
    public float f152766m;

    /* renamed from: n */
    public float f152767n;

    /* renamed from: o */
    public float f152768o;

    /* renamed from: p */
    public boolean f152769p = false;

    public C54486i() {
        Context context = C66836c.f191967a;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (this.f152769p) {
                this.f152764k = Math.max(i, i2);
                this.f152763j = Math.min(i, i2);
            } else {
                this.f152764k = Math.min(i, i2);
                this.f152763j = Math.max(i, i2);
            }
            this.f152754a = 8000;
            this.f152755b = C58612c.m68061a((float) 12);
            this.f152756c = 3;
            this.f152757d = C58612c.m68061a(1.5f);
            this.f152758e = C58612c.m68061a((float) 1);
            this.f152759f = (float) C58612c.m68061a(5.0f);
            this.f152760g = (float) C58612c.m68061a(5.0f);
            this.f152761h = true;
            this.f152762i = true;
            this.f152765l = (float) C58612c.m68061a(16.0f);
            this.f152766m = 0.0f;
            this.f152767n = (float) C58612c.m68061a(5.0f);
            this.f152768o = (float) C58612c.m68061a(4.0f);
            return;
        }
        throw new RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
    }

    /* renamed from: a */
    public void mo75310a(boolean z) {
        if (this.f152769p != z) {
            int i = this.f152763j;
            this.f152763j = this.f152764k;
            this.f152764k = i;
        }
        this.f152769p = z;
    }
}
