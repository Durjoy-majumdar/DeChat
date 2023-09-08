package mf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rf1.C12982a;
import rx3.C13598b0;
import te3.uc4;

/* renamed from: mf1.x */
public final class C10879x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12982a f32479d;

    /* renamed from: e */
    public final /* synthetic */ C12982a f32480e;

    /* renamed from: f */
    public final /* synthetic */ C10882y f32481f;

    /* renamed from: g */
    public final /* synthetic */ long f32482g;

    /* renamed from: mf1.x$a */
    public static final class C10880a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10882y f32483d;

        /* renamed from: e */
        public final /* synthetic */ long f32484e;

        /* renamed from: f */
        public final /* synthetic */ C12982a f32485f;

        /* renamed from: g */
        public final /* synthetic */ View f32486g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10880a(C10882y yVar, long j, C12982a aVar, View view) {
            super(0);
            this.f32483d = yVar;
            this.f32484e = j;
            this.f32485f = aVar;
            this.f32486g = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r3 = r3.f37017f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                mf1.y r0 = r11.f32483d
                long r1 = r11.f32484e
                rf1.a r3 = r11.f32485f
                if (r3 == 0) goto L_0x000f
                te3.uc4 r3 = r3.f37017f
                if (r3 == 0) goto L_0x000f
                int r3 = r3.f142762h
                goto L_0x0010
            L_0x000f:
                r3 = -1
            L_0x0010:
                java.util.HashMap<java.lang.Long, java.lang.Integer> r4 = mf1.C10882y.f32490q
                r0.mo11102x(r1, r3)
                rf1.a r5 = r11.f32485f
                r6 = 400(0x190, double:1.976E-321)
                android.view.View r8 = r11.f32486g
                r9 = 1
                r10 = 0
                r5.mo12509e(r6, r8, r9, r10)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mf1.C10879x.C10880a.invoke():java.lang.Object");
        }
    }

    public C10879x(C12982a aVar, C12982a aVar2, C10882y yVar, long j) {
        this.f32479d = aVar;
        this.f32480e = aVar2;
        this.f32481f = yVar;
        this.f32482g = j;
    }

    public final void run() {
        View findViewById;
        C12982a aVar = this.f32479d;
        View view = aVar.f37012a;
        C12982a aVar2 = this.f32480e;
        View view2 = aVar2.f37012a;
        C10882y yVar = this.f32481f;
        long j = this.f32482g;
        if (view != null && view2 != null) {
            uc4 uc4 = aVar.f37017f;
            boolean z = true;
            if (uc4 != null && uc4.f142762h == 0) {
                uc4 uc42 = aVar2.f37017f;
                if (uc42 == null || uc42.f142762h != 5) {
                    z = false;
                }
                if (z) {
                    if (view != null && view2 != null) {
                        yVar.mo11102x(j, uc42 != null ? uc42.f142762h : -1);
                        View findViewById2 = view.findViewById(C0966R.C0970id.f358405m20);
                        if (findViewById2 != null && (findViewById = view2.findViewById(C0966R.C0970id.f358405m20)) != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(Float.valueOf(0.0f));
                            View view4 = findViewById;
                            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            findViewById.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            findViewById.post(new C10876w(findViewById2, yVar, findViewById, view2));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            aVar.mo12510f(200, view, true, new C10880a(yVar, j, aVar2, view2));
        }
    }
}
