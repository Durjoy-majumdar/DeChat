package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C74851q0;
import com.tencent.p014mm.p136ui.tools.C74854r0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.ui.widget.a */
public class C74965a extends C74851q0 {

    /* renamed from: b */
    public View f220475b;

    /* renamed from: c */
    public C74969d f220476c;

    /* renamed from: d */
    public Rect f220477d = new Rect();

    /* renamed from: e */
    public boolean f220478e = false;

    /* renamed from: f */
    public int f220479f;

    /* renamed from: g */
    public int f220480g;

    /* renamed from: h */
    public int f220481h;

    /* renamed from: i */
    public int f220482i;

    /* renamed from: j */
    public boolean f220483j = false;

    /* renamed from: k */
    public Runnable f220484k;

    /* renamed from: l */
    public Runnable f220485l;

    /* renamed from: m */
    public C74968c f220486m;

    /* renamed from: n */
    public boolean f220487n = true;

    /* renamed from: com.tencent.mm.ui.widget.a$a */
    public class C74966a implements Runnable {
        public C74966a() {
        }

        public void run() {
            if (C74965a.this.f220484k != null) {
                Log.m105928w("MicroMsg.InputPanelHelper", "onKeyboardShowOnce not run in measure");
                C74965a.this.f220484k.run();
                C74965a.this.f220484k = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.a$b */
    public class C74967b implements Runnable {
        public C74967b() {
        }

        public void run() {
            if (C74965a.this.f220485l != null) {
                Log.m105928w("MicroMsg.InputPanelHelper", "onKeyboardHideOnce not run in measure");
                C74965a.this.f220485l.run();
                C74965a.this.f220485l = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.a$c */
    public interface C74968c {
        /* renamed from: a */
        void mo104367a(boolean z);
    }

    /* renamed from: com.tencent.mm.ui.widget.a$d */
    public interface C74969d {
        /* renamed from: i0 */
        void mo1072i0(boolean z, int i);
    }

    public C74965a(View view, C74969d dVar) {
        this.f220475b = view;
        Activity activity = (Activity) view.getContext();
        this.f220081a = activity;
        Log.m105925i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        this.f220476c = dVar;
        this.f220481h = C85875k4.m106188j(view.getContext()) * 2;
        this.f220482i = KeyBoardUtil.getKeyBordHeightPx(view.getContext(), true);
    }

    /* renamed from: b */
    public void mo104020b(int i, boolean z) {
        if (z) {
            this.f220482i = i;
            this.f220476c.mo1072i0(true, i);
        } else {
            this.f220476c.mo1072i0(false, this.f220482i);
        }
        C74968c cVar = this.f220486m;
        if (cVar != null) {
            cVar.mo104367a(z);
        }
    }

    /* renamed from: c */
    public void mo104360c() {
        if (C11171e.m11046c(30) && this.f220487n) {
            Log.m105925i("MicroMsg.InputPanelHelper", "close. observer:%s", this);
            C74854r0.f220091a.mo104081b(this);
        }
    }

    /* renamed from: d */
    public void mo104361d(int i) {
        if (KeyBoardUtil.isPortOrientation(this.f220475b.getContext())) {
            if (!((!C11171e.m11046c(24) || !(this.f220475b.getContext() instanceof Activity)) ? false : ((Activity) this.f220475b.getContext()).isInMultiWindowMode())) {
                int i2 = this.f220479f;
                int i3 = this.f220477d.bottom;
                this.f220479f = View.MeasureSpec.getSize(i);
                this.f220475b.getWindowVisibleDisplayFrame(this.f220477d);
                if (!this.f220478e) {
                    this.f220478e = i3 != this.f220477d.bottom;
                }
                int i4 = this.f220477d.bottom;
                int i5 = this.f220480g;
                int i6 = this.f220481h;
                if (i4 > i5 - i6) {
                    this.f220480g = i4;
                }
                int i7 = this.f220480g - i4;
                boolean z = i7 > i6;
                if (z) {
                    this.f220482i = i7;
                }
                if (this.f220478e && z != this.f220483j && (C11171e.m11044a(30) || !this.f220487n)) {
                    if (i7 == this.f220481h) {
                        this.f220476c.mo1072i0(false, this.f220482i - i7);
                        C74968c cVar = this.f220486m;
                        if (cVar != null) {
                            cVar.mo104367a(false);
                        }
                    } else {
                        this.f220476c.mo1072i0(z, this.f220482i);
                        C74968c cVar2 = this.f220486m;
                        if (cVar2 != null) {
                            cVar2.mo104367a(z);
                        }
                    }
                }
                this.f220483j = z;
                if ((this.f220478e && i2 > this.f220479f + this.f220481h) || i2 < this.f220479f - this.f220481h) {
                    Log.m105925i("MicroMsg.InputPanelHelper", "onMeasure: run, %s", Boolean.valueOf(z));
                    this.f220478e = false;
                    if (z) {
                        Runnable runnable = this.f220484k;
                        if (runnable != null) {
                            runnable.run();
                            this.f220484k = null;
                            return;
                        }
                        return;
                    }
                    Runnable runnable2 = this.f220485l;
                    if (runnable2 != null) {
                        runnable2.run();
                        this.f220485l = null;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.m105924i("MicroMsg.InputPanelHelper", "onMeasure: delay call runnable");
    }

    /* renamed from: e */
    public void mo104362e(Runnable runnable) {
        this.f220485l = runnable;
        this.f220484k = null;
        this.f220475b.postDelayed(new C74967b(), 200);
    }

    /* renamed from: f */
    public void mo104363f(Runnable runnable) {
        this.f220484k = runnable;
        this.f220485l = null;
        this.f220475b.postDelayed(new C74966a(), 200);
    }

    /* renamed from: g */
    public void mo104364g() {
        if (C11171e.m11046c(30) && this.f220487n) {
            Log.m105925i("MicroMsg.InputPanelHelper", "start: observer:%s，context:%s", this, this.f220475b.getContext());
            C74854r0.f220091a.mo104080a(this, (Activity) this.f220475b.getContext(), true);
        }
    }
}
