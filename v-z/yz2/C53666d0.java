package yz2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl3.C45413b;
import ej3.C31608f;
import ej3.C31609o;
import ej3.C45665d;
import ej3.C45669g;
import ej3.C45671i;
import ej3.C45674l;
import ej3.C45675m;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;
import ob0.C11385n;
import ob0.C117747y;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import qy2.C47896n;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: yz2.d0 */
public final class C53666d0 extends C53684j implements C11385n {

    /* renamed from: e */
    public final Context f150734e;

    /* renamed from: f */
    public final String f150735f;

    /* renamed from: g */
    public C47896n f150736g;

    /* renamed from: h */
    public final C45413b f150737h = new C53668b(this);

    /* renamed from: i */
    public final GestureDetector f150738i;

    /* renamed from: j */
    public WeakReference<PAGView> f150739j;

    /* renamed from: yz2.d0$a */
    public static final class C53667a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C53666d0 f150740d;

        public C53667a(C53666d0 d0Var) {
            this.f150740d = d0Var;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onContextClick() called with: res = " + onContextClick + " e = " + motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        /* JADX WARNING: type inference failed for: r14v7, types: [qy2.n] */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0068, code lost:
            r1 = ((yz2.C79284y) r1).f232762j;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onDoubleTap(android.view.MotionEvent r14) {
            /*
                r13 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r14)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1"
                java.lang.String r2 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r3 = "onDoubleTap"
                java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
                r5 = r13
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                boolean r0 = super.onDoubleTap(r14)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onDoubleTap() called with: res = "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = " e = "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r2 = "  "
                r1.append(r2)
                yz2.d0 r2 = r13.f150740d
                java.lang.String r2 = r2.f150735f
                java.lang.String r3 = su0.C13781a.m13082a()
                boolean r2 = gy3.C87412m.m108589b(r2, r3)
                r3 = 1
                r2 = r2 ^ r3
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.TextStatus.TextStatusCardDialog"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
                yz2.d0 r1 = r13.f150740d
                java.lang.String r1 = r1.f150735f
                java.lang.String r2 = su0.C13781a.m13082a()
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 != 0) goto L_0x010a
                yz2.d0 r1 = r13.f150740d
                qy2.n r1 = r1.f150736g
                r2 = 0
                if (r1 == 0) goto L_0x0078
                yz2.y r1 = (yz2.C79284y) r1
                android.view.View r1 = r1.f232762j
                if (r1 == 0) goto L_0x0078
                r4 = 2131307102(0x7f092a5e, float:1.8232422E38)
                android.view.View r1 = r1.findViewById(r4)
                android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
                goto L_0x0079
            L_0x0078:
                r1 = r2
            L_0x0079:
                boolean r4 = r1 instanceof android.widget.RelativeLayout
                if (r4 == 0) goto L_0x007e
                goto L_0x007f
            L_0x007e:
                r1 = r2
            L_0x007f:
                if (r1 == 0) goto L_0x010a
                yz2.d0 r4 = r13.f150740d
                org.libpag.PAGView r5 = new org.libpag.PAGView
                android.content.Context r6 = r4.f150734e
                r5.<init>(r6)
                android.content.Context r6 = r4.f150734e
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131165319(0x7f070087, float:1.7944852E38)
                float r6 = r6.getDimension(r7)
                int r6 = (int) r6
                r1.addView(r5)
                r5 = 0
                if (r14 == 0) goto L_0x00a7
                float r7 = r14.getX()
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                goto L_0x00ab
            L_0x00a7:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            L_0x00ab:
                int r7 = r7.intValue()
                if (r14 == 0) goto L_0x00ba
                float r14 = r14.getY()
                java.lang.Float r14 = java.lang.Float.valueOf(r14)
                goto L_0x00be
            L_0x00ba:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            L_0x00be:
                int r14 = r14.intValue()
                int r8 = r6 / 2
                int r9 = r7 - r8
                int r8 = r14 - r8
                r10 = 5
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r10[r5] = r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
                r10[r3] = r5
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r5 = 2
                r10[r5] = r14
                r14 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
                r10[r14] = r5
                r14 = 4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
                r10[r14] = r5
                java.lang.String r14 = "MicroMsg.TextStatus.TextStatusCardFeedUIC"
                java.lang.String r5 = "onDoubleTap() called width:%s, left:%s, top:%s, leftMargin:%s, topMargin:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r5, r10)
                r4.mo74260a(r1, r9, r8, r3)
                qy2.n r14 = r4.f150736g
                boolean r1 = r14 instanceof yz2.C79284y
                if (r1 == 0) goto L_0x00ff
                r2 = r14
                yz2.y r2 = (yz2.C79284y) r2
            L_0x00ff:
                if (r2 == 0) goto L_0x010a
                jz2.l r14 = r2.f232774y
                if (r14 == 0) goto L_0x010a
                jz2.e r14 = (jz2.C76474e) r14
                r14.mo106705V(r3, r3)
            L_0x010a:
                java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1"
                java.lang.String r10 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r11 = "onDoubleTap"
                java.lang.String r12 = "(Landroid/view/MotionEvent;)Z"
                r7 = r0
                r8 = r13
                j20.C117292a.m165362h(r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yz2.C53666d0.C53667a.onDoubleTap(android.view.MotionEvent):boolean");
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            boolean onDoubleTapEvent = super.onDoubleTapEvent(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onDoubleTapEvent() called with: res = " + onDoubleTapEvent + " e = " + motionEvent);
            return onDoubleTapEvent;
        }

        public boolean onDown(MotionEvent motionEvent) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onDown() called with: res = " + true + " e = " + motionEvent);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            boolean onSingleTapConfirmed = super.onSingleTapConfirmed(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onSingleTapConfirmed() called with: res = " + onSingleTapConfirmed + " e = " + motionEvent);
            C53666d0 d0Var = this.f150740d;
            d0Var.dismiss();
            C47896n nVar = d0Var.f150736g;
            if (nVar != null) {
                ((C79284y) nVar).mo72644p(103);
            }
            return onSingleTapConfirmed;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onSingleTapUp() called with: res=" + onSingleTapUp + " e = " + motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: yz2.d0$b */
    public static final class C53668b implements C45413b {

        /* renamed from: d */
        public final /* synthetic */ C53666d0 f150741d;

        public C53668b(C53666d0 d0Var) {
            this.f150741d = d0Var;
        }

        public String getTag() {
            return "TextStatusCardDialog";
        }

        public void onActivityResult(int i, int i2, Intent intent) {
        }

        public boolean onBackPressed() {
            return false;
        }

        public void onBeforeFinish(Intent intent) {
        }

        public void onConfigurationChanged(Configuration configuration) {
            C87412m.m108594g(configuration, "newConfig");
        }

        public void onCreateAfter(Bundle bundle) {
        }

        public void onCreateBefore(Bundle bundle) {
        }

        public void onDestroy() {
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            return false;
        }

        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            return false;
        }

        public void onNewIntent(Intent intent) {
        }

        public void onPause() {
            C47896n nVar = this.f150741d.f150736g;
            if (nVar != null) {
                ((C79284y) nVar).mo72649m();
            }
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            C87412m.m108594g(strArr, "permissions");
            C87412m.m108594g(iArr, "grantResults");
        }

        public void onRestoreInstanceState(Bundle bundle) {
        }

        public void onResume() {
            C47896n nVar = this.f150741d.f150736g;
            if (nVar != null) {
                ((C79284y) nVar).mo72648k();
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    /* renamed from: yz2.d0$c */
    public static final class C53669c extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ PAGView f150742d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f150743e;

        public C53669c(PAGView pAGView, RelativeLayout relativeLayout) {
            this.f150742d = pAGView;
            this.f150743e = relativeLayout;
        }

        public void onAnimationCancel(PAGView pAGView) {
            this.f150742d.removeListener(this);
            this.f150743e.removeView(this.f150742d);
        }

        public void onAnimationEnd(PAGView pAGView) {
            this.f150742d.removeListener(this);
            this.f150743e.removeView(this.f150742d);
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    /* renamed from: yz2.d0$d */
    public static final class C53670d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C53670d f150744d = new C53670d();

        public C53670d() {
            super(0);
        }

        public Object invoke() {
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "show() end called");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53666d0(Context context, String str) {
        super(context);
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(str, "username");
        this.f150734e = context;
        this.f150735f = str;
        this.f150738i = new GestureDetector(context, new C53667a(this));
    }

    /* renamed from: a */
    public final void mo74260a(RelativeLayout relativeLayout, int i, int i2, boolean z) {
        PAGView pAGView;
        C87412m.m108594g(relativeLayout, "itemView");
        WeakReference<PAGView> weakReference = this.f150739j;
        if (!(weakReference == null || (pAGView = weakReference.get()) == null)) {
            pAGView.stop();
        }
        PAGView pAGView2 = new PAGView(this.f150734e);
        int dimension = (int) this.f150734e.getResources().getDimension(C0966R.dimen.f3732cl);
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
        pAGView2.addListener(new C53669c(pAGView2, relativeLayout));
        pAGView2.setComposition(PAGFile.Load(getContext().getAssets(), "status_like_bmp.pag"));
        pAGView2.play();
        if (z) {
            i3 = new Random().nextInt(31) - 15;
        }
        pAGView2.setRotation((float) i3);
        this.f150739j = new WeakReference<>(pAGView2);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
            r12 = this;
            java.lang.Class<qy2.x> r0 = qy2.C47904x.class
            java.lang.ref.WeakReference<org.libpag.PAGView> r1 = r12.f150739j
            if (r1 == 0) goto L_0x0011
            java.lang.Object r1 = r1.get()
            org.libpag.PAGView r1 = (org.libpag.PAGView) r1
            if (r1 == 0) goto L_0x0011
            r1.stop()
        L_0x0011:
            android.widget.LinearLayout r1 = r12.f150769d
            r2 = 0
            if (r1 == 0) goto L_0x005b
            ej3.h r3 = new ej3.h
            r4 = 4
            r3.<init>(r4)
            ej3.l r9 = ej3.C45674l.f123481a
            java.lang.String r4 = "scaleType"
            gy3.C87412m.m108594g(r9, r4)
            ej3.i r4 = new ej3.i
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r11 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            ej3.f r5 = r3.f123471a
            if (r5 != 0) goto L_0x0033
            r5 = r2
        L_0x0033:
            r3.f123471a = r5
            ej3.i r5 = r3.f123472b
            if (r5 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r5
        L_0x003b:
            r3.f123472b = r4
            ej3.o r4 = r3.f123473c
            if (r4 != 0) goto L_0x0042
            r4 = r2
        L_0x0042:
            r3.f123473c = r4
            r4 = 200(0xc8, double:9.9E-322)
            r3.f123474d = r1
            boolean r1 = r3.mo71168f()
            if (r1 == 0) goto L_0x004f
            goto L_0x005b
        L_0x004f:
            android.view.View r1 = r3.f123474d
            if (r1 == 0) goto L_0x005b
            ej3.d r6 = new ej3.d
            r6.<init>(r3, r4, r2)
            r1.post(r6)
        L_0x005b:
            super.dismiss()
            qy2.n r1 = r12.f150736g
            if (r1 == 0) goto L_0x0067
            yz2.y r1 = (yz2.C79284y) r1
            r1.mo72647c()
        L_0x0067:
            di3.d r1 = di3.C86312j.m106911c(r0)
            qy2.x r1 = (qy2.C47904x) r1
            r1.mo72663Tr()
            di3.d r0 = di3.C86312j.m106911c(r0)
            qy2.x r0 = (qy2.C47904x) r0
            r0.mo72660Dj()
            android.content.Context r0 = r12.f150734e
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r1 == 0) goto L_0x0082
            r2 = r0
            com.tencent.mm.ui.MMFragmentActivity r2 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r2
        L_0x0082:
            if (r2 == 0) goto L_0x008e
            dl3.b r0 = r12.f150737h
            yz2.d0$b r0 = (yz2.C53666d0.C53668b) r0
            r0.getClass()
            dl3.C45413b.C45414a.m50358b(r0, r2)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C53666d0.dismiss():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    public void onStart() {
        super.onStart();
    }

    public void show() {
        super.show();
        LinearLayout linearLayout = this.f150769d;
        if (linearLayout != null) {
            C45669g gVar = new C45669g(0.0f);
            C45675m mVar = new C45675m(0.0f, 0.0f, C45674l.f123481a, 3, (C8480h) null);
            C31608f fVar = gVar.f123471a;
            if (fVar == null) {
                fVar = mVar.f123471a;
            }
            gVar.f123471a = fVar;
            C45671i iVar = gVar.f123472b;
            if (iVar == null) {
                iVar = mVar.f123472b;
            }
            gVar.f123472b = iVar;
            C31609o oVar = gVar.f123473c;
            if (oVar == null) {
                oVar = mVar.f123473c;
            }
            gVar.f123473c = oVar;
            C53670d dVar = C53670d.f150744d;
            gVar.f123474d = linearLayout;
            gVar.mo71166f();
            View view = gVar.f123474d;
            if (view != null) {
                view.post(new C45665d(gVar, 200, dVar));
            }
        }
    }
}
