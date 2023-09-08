package com.tencent.p014mm.plugin.textstatus.p112ui.card;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusCardFeedItemScrollEvent;
import com.tencent.p014mm.autogen.events.StatusSquareItemScrollEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import jq3.C60905o;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import qc0.C101093a;
import qy2.C47896n;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC */
public final class TextStatusCardFeedUIC extends UIComponent {

    /* renamed from: d */
    public boolean f117016d;

    /* renamed from: e */
    public WeakReference<C60905o> f117017e;

    /* renamed from: f */
    public String f117018f = "";

    /* renamed from: g */
    public String f117019g = "";

    /* renamed from: h */
    public final Set<C47896n> f117020h = new HashSet();

    /* renamed from: i */
    public int f117021i = -1;

    /* renamed from: j */
    public final HashMap<String, Boolean> f117022j = new HashMap<>();

    /* renamed from: n */
    public WeakReference<C60905o> f117023n;

    /* renamed from: o */
    public boolean f117024o;

    /* renamed from: p */
    public final GestureDetector f117025p;

    /* renamed from: q */
    public WeakReference<PAGView> f117026q;

    /* renamed from: r */
    public StatusCardFeedItemScrollEvent f117027r;

    /* renamed from: s */
    public final IListener<StatusSquareItemScrollEvent> f117028s;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC$a */
    public static final class C43243a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedUIC f117029d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f117030e;

        public C43243a(TextStatusCardFeedUIC textStatusCardFeedUIC, AppCompatActivity appCompatActivity) {
            this.f117029d = textStatusCardFeedUIC;
            this.f117030e = appCompatActivity;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
            r0 = r0.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onDoubleTap(android.view.MotionEvent r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1"
                java.lang.String r2 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r3 = "onDoubleTap"
                java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC r0 = r11.f117029d
                java.lang.ref.WeakReference<jq3.o> r0 = r0.f117023n
                r1 = 0
                if (r0 == 0) goto L_0x002d
                java.lang.Object r0 = r0.get()
                jq3.o r0 = (jq3.C60905o) r0
                if (r0 == 0) goto L_0x002d
                android.view.View r0 = r0.f44854d
                goto L_0x002e
            L_0x002d:
                r0 = r1
            L_0x002e:
                boolean r2 = r0 instanceof android.widget.RelativeLayout
                if (r2 == 0) goto L_0x0035
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                goto L_0x0036
            L_0x0035:
                r0 = r1
            L_0x0036:
                if (r0 == 0) goto L_0x00ce
                androidx.appcompat.app.AppCompatActivity r2 = r11.f117030e
                com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC r3 = r11.f117029d
                org.libpag.PAGView r4 = new org.libpag.PAGView
                r4.<init>(r2)
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2131165319(0x7f070087, float:1.7944852E38)
                float r2 = r2.getDimension(r5)
                int r2 = (int) r2
                r0.addView(r4)
                r4 = 0
                if (r12 == 0) goto L_0x005c
                float r5 = r12.getX()
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                goto L_0x0060
            L_0x005c:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            L_0x0060:
                int r5 = r5.intValue()
                if (r12 == 0) goto L_0x006f
                float r6 = r12.getY()
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                goto L_0x0073
            L_0x006f:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            L_0x0073:
                int r6 = r6.intValue()
                int r7 = r2 / 2
                int r8 = r5 - r7
                int r7 = r6 - r7
                r9 = 5
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9[r4] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                r4 = 1
                r9[r4] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r5 = 2
                r9[r5] = r2
                r2 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
                r9[r2] = r5
                r2 = 4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
                r9[r2] = r5
                java.lang.String r2 = "MicroMsg.TextStatus.TextStatusCardFeedUIC"
                java.lang.String r5 = "onDoubleTap() called width:%s, left:%s, top:%s, leftMargin:%s, topMargin:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r9)
                r3.mo67474e3(r0, r8, r7, r4)
                java.lang.ref.WeakReference<jq3.o> r0 = r3.f117023n
                if (r0 == 0) goto L_0x00bb
                java.lang.Object r0 = r0.get()
                jq3.o r0 = (jq3.C60905o) r0
                if (r0 == 0) goto L_0x00bb
                java.lang.Object r0 = r0.f173502D
                goto L_0x00bc
            L_0x00bb:
                r0 = r1
            L_0x00bc:
                boolean r2 = r0 instanceof yz2.C79284y
                if (r2 == 0) goto L_0x00c3
                r1 = r0
                yz2.y r1 = (yz2.C79284y) r1
            L_0x00c3:
                if (r1 == 0) goto L_0x00ce
                jz2.l r0 = r1.f232774y
                if (r0 == 0) goto L_0x00ce
                jz2.e r0 = (jz2.C76474e) r0
                r0.mo106705V(r4, r4)
            L_0x00ce:
                boolean r12 = super.onDoubleTap(r12)
                java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1"
                java.lang.String r8 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r9 = "onDoubleTap"
                java.lang.String r10 = "(Landroid/view/MotionEvent;)Z"
                r5 = r12
                r6 = r11
                j20.C117292a.m165362h(r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.card.TextStatusCardFeedUIC.C43243a.onDoubleTap(android.view.MotionEvent):boolean");
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC$b */
    public static final class C43244b extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ PAGView f117031d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f117032e;

        public C43244b(PAGView pAGView, RelativeLayout relativeLayout) {
            this.f117031d = pAGView;
            this.f117032e = relativeLayout;
        }

        public void onAnimationCancel(PAGView pAGView) {
            this.f117031d.removeListener(this);
            this.f117032e.removeView(this.f117031d);
        }

        public void onAnimationEnd(PAGView pAGView) {
            this.f117031d.removeListener(this);
            this.f117032e.removeView(this.f117031d);
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusCardFeedUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f117025p = new GestureDetector(appCompatActivity, new C43243a(this, appCompatActivity));
        this.f117028s = new TextStatusCardFeedUIC$squareScrollListener$1(this, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public final C60905o mo67472c3() {
        WeakReference<C60905o> weakReference = this.f117017e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d3 */
    public final boolean mo67473d3() {
        return (getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1) == -1 || getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1) == -1) ? false : true;
    }

    /* renamed from: e3 */
    public final void mo67474e3(RelativeLayout relativeLayout, int i, int i2, boolean z) {
        PAGView pAGView;
        C87412m.m108594g(relativeLayout, "itemView");
        WeakReference<PAGView> weakReference = this.f117026q;
        if (!(weakReference == null || (pAGView = weakReference.get()) == null)) {
            pAGView.stop();
        }
        PAGView pAGView2 = new PAGView(getActivity());
        int dimension = (int) getActivity().getResources().getDimension(C0966R.dimen.f3732cl);
        relativeLayout.addView(pAGView2);
        int i3 = 0;
        Log.m105919d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onDoubleTap() called width:%s, leftMargin:%s, topMargin:%s", Integer.valueOf(dimension), Integer.valueOf(i), Integer.valueOf(i2));
        ViewGroup.LayoutParams layoutParams = pAGView2.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = dimension;
            layoutParams2.height = dimension;
            if (!z) {
                layoutParams2.addRule(13, -1);
            } else {
                int i4 = i + dimension;
                if (i4 > relativeLayout.getWidth()) {
                    layoutParams2.addRule(11, -1);
                    layoutParams2.removeRule(9);
                    layoutParams2.rightMargin = relativeLayout.getWidth() - i4;
                    layoutParams2.leftMargin = 0;
                } else {
                    layoutParams2.addRule(9, -1);
                    layoutParams2.removeRule(11);
                    layoutParams2.leftMargin = i;
                    layoutParams2.rightMargin = 0;
                }
                int i5 = dimension + i2;
                if (i5 > relativeLayout.getHeight()) {
                    layoutParams2.addRule(12, -1);
                    layoutParams2.removeRule(10);
                    layoutParams2.bottomMargin = relativeLayout.getHeight() - i5;
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.addRule(10, -1);
                    layoutParams2.removeRule(12);
                    layoutParams2.topMargin = i2;
                    layoutParams2.bottomMargin = 0;
                }
            }
        }
        pAGView2.addListener(new C43244b(pAGView2, relativeLayout));
        pAGView2.setComposition(PAGFile.Load(getContext().getAssets(), "status_like_bmp.pag"));
        pAGView2.play();
        if (z) {
            i3 = new Random().nextInt(31) - 15;
        }
        pAGView2.setRotation((float) i3);
        this.f117026q = new WeakReference<>(pAGView2);
    }

    public boolean onBackPressed() {
        C60905o c3 = mo67472c3();
        C47896n nVar = null;
        Object obj = c3 != null ? c3.f173502D : null;
        if (obj instanceof C47896n) {
            nVar = (C47896n) obj;
        }
        if (nVar != null) {
            nVar.onBackPressed();
        }
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TEXT_STATUS_CARD_FEED_ENTER_TIMES_INT;
        boolean z = false;
        int j = i.mo119689j(aVar, 0);
        if (j < 3) {
            z = true;
        }
        this.f117016d = z;
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j + 1));
        if (mo67473d3()) {
            this.f117028s.alive();
        }
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        if (C101093a.m132481c()) {
            C101093a.m132490l();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        for (C47896n c : this.f117020h) {
            c.mo72647c();
        }
        ((HashSet) this.f117020h).clear();
        this.f117022j.clear();
        this.f117028s.dead();
    }

    public void onPause() {
        super.onPause();
        C60905o c3 = mo67472c3();
        C47896n nVar = null;
        Object obj = c3 != null ? c3.f173502D : null;
        C47896n nVar2 = obj instanceof C47896n ? (C47896n) obj : null;
        if (nVar2 != null) {
            nVar2.mo72649m();
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        Activity context = getContext();
        objArr[0] = context != null ? Boolean.valueOf(context.isFinishing()) : null;
        Log.m105919d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPause() called isFinishing:%s", objArr);
        Activity context2 = getContext();
        if (context2 == null || !context2.isFinishing()) {
            z = false;
        }
        if (z) {
            C60905o c35 = mo67472c3();
            Object obj2 = c35 != null ? c35.f173502D : null;
            if (obj2 instanceof C47896n) {
                nVar = (C47896n) obj2;
            }
            if (nVar != null) {
                nVar.mo72644p(203);
            }
        }
    }

    public void onResume() {
        super.onResume();
        C60905o c3 = mo67472c3();
        C47896n nVar = null;
        Object obj = c3 != null ? c3.f173502D : null;
        if (obj instanceof C47896n) {
            nVar = (C47896n) obj;
        }
        if (nVar != null) {
            nVar.mo72648k();
        }
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onResume() called");
    }

    public void onStart() {
        super.onStart();
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onStart() called");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onStop() called");
    }
}
