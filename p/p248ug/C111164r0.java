package p248ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: ug.r0 */
public abstract class C111164r0 {

    /* renamed from: a */
    public C111165a f332923a;

    /* renamed from: ug.r0$a */
    public static class C111165a {

        /* renamed from: a */
        public C111166b f332924a;

        /* renamed from: b */
        public boolean f332925b;

        /* renamed from: c */
        public boolean f332926c;

        /* renamed from: d */
        public String f332927d;

        /* renamed from: e */
        public Rect f332928e;

        /* renamed from: f */
        public boolean f332929f;

        /* renamed from: g */
        public Rect f332930g;

        /* renamed from: h */
        public int f332931h;

        /* renamed from: i */
        public Bitmap f332932i;

        /* renamed from: j */
        public int f332933j = -1;

        /* renamed from: k */
        public float f332934k;
    }

    /* renamed from: ug.r0$b */
    public enum C111166b {
        VIDEO,
        PHOTO,
        SCREEN,
        VIDEO_COVER
    }

    /* renamed from: a */
    public void mo162892a() {
    }

    /* renamed from: b */
    public abstract C111162m0 mo162893b();

    /* renamed from: c */
    public abstract C111159e mo162894c(Context context);

    /* renamed from: d */
    public void mo162895d(C111165a aVar) {
        this.f332923a = aVar;
    }

    /* renamed from: e */
    public abstract boolean mo162896e();

    /* renamed from: f */
    public abstract void mo162897f();

    /* renamed from: g */
    public abstract void mo162898g(C111161j0 j0Var);
}
