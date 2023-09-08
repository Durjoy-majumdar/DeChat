package jt0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import gy3.C87412m;

/* renamed from: jt0.d */
public interface C88029d {

    /* renamed from: a */
    public static final /* synthetic */ int f254647a = 0;

    /* renamed from: jt0.d$a */
    public static final class C88030a {

        /* renamed from: a */
        public static final C88029d f254648a = new C88031a();

        /* renamed from: jt0.d$a$a */
        public static final class C88031a implements C88029d {
            /* renamed from: a */
            public int mo122470a() {
                return 0;
            }

            /* renamed from: b */
            public void mo122471b() {
            }

            /* renamed from: c */
            public int mo122472c() {
                return 0;
            }

            /* renamed from: d */
            public void mo122473d() {
            }

            /* renamed from: e */
            public ValueAnimator mo122474e(int i, int i2, long j) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
                C87412m.m108593f(ofFloat, "ofFloat(0F,0F)");
                return ofFloat;
            }

            /* renamed from: f */
            public void mo122475f(Canvas canvas, View view) {
            }

            /* renamed from: g */
            public View mo122476g() {
                return null;
            }

            public void reset() {
            }

            public C88032b type() {
                return C88032b.TYPE_NONE;
            }
        }
    }

    /* renamed from: jt0.d$b */
    public enum C88032b {
        TYPE_NONE,
        TYPE_NORMAL,
        TYPE_EMBED
    }

    /* renamed from: a */
    int mo122470a();

    /* renamed from: b */
    void mo122471b();

    /* renamed from: c */
    int mo122472c();

    /* renamed from: d */
    void mo122473d();

    /* renamed from: e */
    ValueAnimator mo122474e(int i, int i2, long j);

    /* renamed from: f */
    void mo122475f(Canvas canvas, View view);

    /* renamed from: g */
    View mo122476g();

    void reset();

    C88032b type();
}
