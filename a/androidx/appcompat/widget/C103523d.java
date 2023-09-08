package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.widget.d */
public class C103523d {

    /* renamed from: a */
    public final View f305704a;

    /* renamed from: b */
    public final C103527f f305705b;

    /* renamed from: c */
    public int f305706c = -1;

    /* renamed from: d */
    public C103524d0 f305707d;

    /* renamed from: e */
    public C103524d0 f305708e;

    /* renamed from: f */
    public C103524d0 f305709f;

    public C103523d(View view) {
        this.f305704a = view;
        this.f305705b = C103527f.m137545g();
    }

    /* renamed from: a */
    public void mo144312a() {
        Drawable background = this.f305704a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f305707d != null) {
                if (this.f305709f == null) {
                    this.f305709f = new C103524d0();
                }
                C103524d0 d0Var = this.f305709f;
                d0Var.f305710a = null;
                d0Var.f305713d = false;
                d0Var.f305711b = null;
                d0Var.f305712c = false;
                View view = this.f305704a;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                ColorStateList g = C107207u.C107213g.m145222g(view);
                if (g != null) {
                    d0Var.f305713d = true;
                    d0Var.f305710a = g;
                }
                PorterDuff.Mode h = C107207u.C107213g.m145223h(this.f305704a);
                if (h != null) {
                    d0Var.f305712c = true;
                    d0Var.f305711b = h;
                }
                if (d0Var.f305713d || d0Var.f305712c) {
                    C103527f.m137548m(background, d0Var, this.f305704a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C103524d0 d0Var2 = this.f305708e;
            if (d0Var2 != null) {
                C103527f.m137548m(background, d0Var2, this.f305704a.getDrawableState());
                return;
            }
            C103524d0 d0Var3 = this.f305707d;
            if (d0Var3 != null) {
                C103527f.m137548m(background, d0Var3, this.f305704a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList mo144313b() {
        C103524d0 d0Var = this.f305708e;
        if (d0Var != null) {
            return d0Var.f305710a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo144314c() {
        C103524d0 d0Var = this.f305708e;
        if (d0Var != null) {
            return d0Var.f305711b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ all -> 0x00b1 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144315d(android.util.AttributeSet r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f305704a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p433g.C107593a.f321899E
            r2 = 0
            androidx.appcompat.widget.f0 r7 = androidx.appcompat.widget.C103533f0.m137562l(r0, r7, r1, r8, r2)
            boolean r8 = r7.mo144342k(r2)     // Catch:{ all -> 0x00b1 }
            r0 = -1
            if (r8 == 0) goto L_0x002d
            int r8 = r7.mo144340i(r2, r0)     // Catch:{ all -> 0x00b1 }
            r6.f305706c = r8     // Catch:{ all -> 0x00b1 }
            androidx.appcompat.widget.f r8 = r6.f305705b     // Catch:{ all -> 0x00b1 }
            android.view.View r1 = r6.f305704a     // Catch:{ all -> 0x00b1 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x00b1 }
            int r3 = r6.f305706c     // Catch:{ all -> 0x00b1 }
            android.content.res.ColorStateList r8 = r8.mo144330k(r1, r3)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x002d
            r6.mo144318g(r8)     // Catch:{ all -> 0x00b1 }
        L_0x002d:
            r8 = 1
            boolean r1 = r7.mo144342k(r8)     // Catch:{ all -> 0x00b1 }
            r3 = 21
            if (r1 == 0) goto L_0x006d
            android.view.View r1 = r6.f305704a     // Catch:{ all -> 0x00b1 }
            android.content.res.ColorStateList r4 = r7.mo144333b(r8)     // Catch:{ all -> 0x00b1 }
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a     // Catch:{ all -> 0x00b1 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b1 }
            p849e3.C107207u.C107213g.m145232q(r1, r4)     // Catch:{ all -> 0x00b1 }
            if (r5 != r3) goto L_0x006d
            android.graphics.drawable.Drawable r4 = r1.getBackground()     // Catch:{ all -> 0x00b1 }
            android.content.res.ColorStateList r5 = p849e3.C107207u.C107213g.m145222g(r1)     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x0058
            android.graphics.PorterDuff$Mode r5 = p849e3.C107207u.C107213g.m145223h(r1)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r5 = 0
            goto L_0x0059
        L_0x0058:
            r5 = 1
        L_0x0059:
            if (r4 == 0) goto L_0x006d
            if (r5 == 0) goto L_0x006d
            boolean r5 = r4.isStateful()     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x006a
            int[] r5 = r1.getDrawableState()     // Catch:{ all -> 0x00b1 }
            r4.setState(r5)     // Catch:{ all -> 0x00b1 }
        L_0x006a:
            p849e3.C107207u.C107208b.m145189q(r1, r4)     // Catch:{ all -> 0x00b1 }
        L_0x006d:
            r1 = 2
            boolean r4 = r7.mo144342k(r1)     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x00ad
            android.view.View r4 = r6.f305704a     // Catch:{ all -> 0x00b1 }
            int r0 = r7.mo144339h(r1, r0)     // Catch:{ all -> 0x00b1 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C103556p.m137674d(r0, r1)     // Catch:{ all -> 0x00b1 }
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a     // Catch:{ all -> 0x00b1 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b1 }
            p849e3.C107207u.C107213g.m145233r(r4, r0)     // Catch:{ all -> 0x00b1 }
            if (r1 != r3) goto L_0x00ad
            android.graphics.drawable.Drawable r0 = r4.getBackground()     // Catch:{ all -> 0x00b1 }
            android.content.res.ColorStateList r1 = p849e3.C107207u.C107213g.m145222g(r4)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0098
            android.graphics.PorterDuff$Mode r1 = p849e3.C107207u.C107213g.m145223h(r4)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0099
        L_0x0098:
            r2 = 1
        L_0x0099:
            if (r0 == 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00ad
            boolean r8 = r0.isStateful()     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x00aa
            int[] r8 = r4.getDrawableState()     // Catch:{ all -> 0x00b1 }
            r0.setState(r8)     // Catch:{ all -> 0x00b1 }
        L_0x00aa:
            p849e3.C107207u.C107208b.m145189q(r4, r0)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r7.mo144343m()
            return
        L_0x00b1:
            r8 = move-exception
            r7.mo144343m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103523d.mo144315d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void mo144316e(Drawable drawable) {
        this.f305706c = -1;
        mo144318g((ColorStateList) null);
        mo144312a();
    }

    /* renamed from: f */
    public void mo144317f(int i) {
        this.f305706c = i;
        C103527f fVar = this.f305705b;
        mo144318g(fVar != null ? fVar.mo144330k(this.f305704a.getContext(), i) : null);
        mo144312a();
    }

    /* renamed from: g */
    public void mo144318g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f305707d == null) {
                this.f305707d = new C103524d0();
            }
            C103524d0 d0Var = this.f305707d;
            d0Var.f305710a = colorStateList;
            d0Var.f305713d = true;
        } else {
            this.f305707d = null;
        }
        mo144312a();
    }

    /* renamed from: h */
    public void mo144319h(ColorStateList colorStateList) {
        if (this.f305708e == null) {
            this.f305708e = new C103524d0();
        }
        C103524d0 d0Var = this.f305708e;
        d0Var.f305710a = colorStateList;
        d0Var.f305713d = true;
        mo144312a();
    }

    /* renamed from: i */
    public void mo144320i(PorterDuff.Mode mode) {
        if (this.f305708e == null) {
            this.f305708e = new C103524d0();
        }
        C103524d0 d0Var = this.f305708e;
        d0Var.f305711b = mode;
        d0Var.f305712c = true;
        mo144312a();
    }
}
