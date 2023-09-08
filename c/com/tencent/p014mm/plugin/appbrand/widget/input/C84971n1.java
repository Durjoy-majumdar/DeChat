package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.appbrand.page.C83763b2;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n1 */
public final class C84971n1 {

    /* renamed from: a */
    public final C84957h f247633a;

    /* renamed from: b */
    public boolean f247634b = false;

    /* renamed from: c */
    public boolean f247635c = false;

    /* renamed from: d */
    public boolean f247636d = false;

    /* renamed from: e */
    public final C84974c<ViewGroup, C83763b2> f247637e = new C84973b(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n1$a */
    public class C84972a extends C84974c<ViewGroup, C84957h> {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n1$b */
    public class C84973b extends C84974c<ViewGroup, C83763b2> {
        public C84973b(C84971n1 n1Var) {
            super((C84972a) null);
        }

        /* renamed from: b */
        public View mo117853b(View view) {
            return (C83763b2) view;
        }

        /* renamed from: c */
        public boolean mo117854c(View view) {
            return view instanceof C83763b2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n1$c */
    public static abstract class C84974c<Source extends View, Target extends View> {

        /* renamed from: a */
        public Target f247638a;

        public C84974c(C84972a aVar) {
        }

        /* renamed from: a */
        public final Target mo117855a(Source source) {
            Target target = this.f247638a;
            if (target != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(target)) {
                    return this.f247638a;
                }
            }
            if (source != null) {
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(source)) {
                    ViewParent parent = source.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (!mo117854c(view)) {
                            parent = parent.getParent();
                        } else {
                            Target b = mo117853b(view);
                            this.f247638a = b;
                            return b;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public abstract Target mo117853b(View view);

        /* renamed from: c */
        public abstract boolean mo117854c(View view);
    }

    public C84971n1(C84957h hVar) {
        this.f247633a = hVar;
    }
}
