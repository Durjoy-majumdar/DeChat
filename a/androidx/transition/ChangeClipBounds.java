package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108353o;

public class ChangeClipBounds extends Transition {

    /* renamed from: K */
    public static final String[] f306658K = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    public class C103802a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f306659d;

        public C103802a(ChangeClipBounds changeClipBounds, View view) {
            this.f306659d = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f306659d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107210d.m145205c(view, (Rect) null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: S */
    public final void mo145284S(C108353o oVar) {
        View view = oVar.f324392b;
        if (view.getVisibility() != 8) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            Rect a = C107207u.C107210d.m145203a(view);
            ((HashMap) oVar.f324391a).put("android:clipBounds:clip", a);
            if (a == null) {
                ((HashMap) oVar.f324391a).put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145284S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145284S(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r8, p853i4.C108353o r9, p853i4.C108353o r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x008c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x001c
            goto L_0x008c
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f324391a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x003c
            if (r1 != 0) goto L_0x003c
            return r8
        L_0x003c:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x004c
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f324391a
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x0059
        L_0x004c:
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f324391a
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x0059:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0060
            return r8
        L_0x0060:
            android.view.View r8 = r10.f324392b
            java.util.WeakHashMap<android.view.View, e3.a0> r9 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107210d.m145205c(r8, r0)
            i4.g r8 = new i4.g
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f324392b
            android.util.Property<android.view.View, android.graphics.Rect> r5 = p853i4.C108360v.f324405e
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x008c
            android.view.View r9 = r10.f324392b
            androidx.transition.ChangeClipBounds$a r10 = new androidx.transition.ChangeClipBounds$a
            r10.<init>(r7, r9)
            r8.addListener(r10)
        L_0x008c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306658K;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
