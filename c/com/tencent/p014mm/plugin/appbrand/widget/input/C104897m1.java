package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import ct0.C86128a;
import java.util.Locale;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.m1 */
public final class C104897m1<Input extends EditText & C104863f1> {

    /* renamed from: a */
    public final Input f311468a;

    /* renamed from: b */
    public final String f311469b;

    /* renamed from: c */
    public final float f311470c;

    /* renamed from: d */
    public C90259e.C90265f f311471d;

    /* renamed from: e */
    public MotionEvent f311472e;

    /* renamed from: f */
    public boolean f311473f = false;

    /* renamed from: g */
    public final Runnable f311474g = new C104898a();

    /* renamed from: h */
    public final Runnable f311475h = new C104899b();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.m1$a */
    public class C104898a implements Runnable {
        public C104898a() {
        }

        public void run() {
            C104897m1 m1Var = C104897m1.this;
            m1Var.f311473f = true;
            Log.m105926v(m1Var.f311469b, "[apptouch] pendingCheckForTap run, pointerDown TRUE");
            C104897m1 m1Var2 = C104897m1.this;
            m1Var2.f311468a.postDelayed(m1Var2.f311475h, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.m1$b */
    public class C104899b implements Runnable {
        public C104899b() {
        }

        public void run() {
            C104897m1 m1Var = C104897m1.this;
            if (m1Var.f311473f) {
                C90259e.C90265f c = C90259e.m112995c(m1Var.f311468a);
                C90259e.C90265f fVar = C104897m1.this.f311471d;
                if (fVar == null || Math.abs(fVar.f259091b - c.f259091b) > 1.0f || Math.abs(C104897m1.this.f311471d.f259092c - c.f259092c) > 1.0f) {
                    Log.m105926v(C104897m1.this.f311469b, "check long press timeout, but view has moved.");
                    return;
                }
                C104897m1 m1Var2 = C104897m1.this;
                if (m1Var2.f311472e != null) {
                    m1Var2.f311473f = false;
                    m1Var2.f311468a.removeCallbacks(m1Var2.f311474g);
                }
            }
        }
    }

    public C104897m1(Input input) {
        this.f311468a = input;
        this.f311469b = "MicroMsg.AppBrand.InputFakeTapEventEmitter" + String.format(Locale.US, "[%s]", new Object[]{input.toString()});
        this.f311470c = (float) ViewConfiguration.get(input.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo148860a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float x = motionEvent.getX(motionEvent.getActionIndex());
        float y = motionEvent.getY(motionEvent.getActionIndex());
        float x2 = motionEvent2.getX(motionEvent2.getActionIndex());
        float y2 = motionEvent2.getY(motionEvent2.getActionIndex());
        Log.m105927v(this.f311469b, "[apptouch] checkTapArea touchSlop %f, X[%f:%f], Y[%f:%f], [%s : %s]", Float.valueOf(this.f311470c), Float.valueOf(x), Float.valueOf(x2), Float.valueOf(y), Float.valueOf(y2), C86128a.m106643b(motionEvent), C86128a.m106643b(motionEvent2));
        return Math.abs(y2 - y) <= this.f311470c && Math.abs(x2 - x) <= this.f311470c;
    }

    /* renamed from: b */
    public final void mo148861b() {
        this.f311473f = false;
        this.f311468a.removeCallbacks(this.f311474g);
        this.f311468a.removeCallbacks(this.f311475h);
        this.f311471d = null;
        MotionEvent motionEvent = this.f311472e;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f311472e = null;
        }
    }
}
