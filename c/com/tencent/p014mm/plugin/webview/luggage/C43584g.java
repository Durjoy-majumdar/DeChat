package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.g */
public class C43584g extends RelativeLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f117821n = 0;

    /* renamed from: d */
    public WebView f117822d;

    /* renamed from: e */
    public C43661n0 f117823e;

    /* renamed from: f */
    public boolean f117824f = true;

    /* renamed from: g */
    public GestureDetector f117825g = new GestureDetector(getContext(), new C43587b(), (Handler) null);

    /* renamed from: h */
    public boolean f117826h;

    /* renamed from: i */
    public Runnable f117827i = new C43585a();

    /* renamed from: j */
    public int f117828j;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.g$a */
    public class C43585a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.webview.luggage.g$a$a */
        public class C43586a implements Runnable {
            public C43586a() {
            }

            public void run() {
                C43584g gVar = C43584g.this;
                int i = C43584g.f117821n;
                gVar.mo67872a();
            }
        }

        public C43585a() {
        }

        public void run() {
            C43584g gVar = C43584g.this;
            if (gVar.f117826h && !gVar.f117824f) {
                int webScrollY = gVar.f117822d.getWebScrollY();
                C43584g gVar2 = C43584g.this;
                if (gVar2.f117828j != webScrollY) {
                    gVar2.f117828j = webScrollY;
                    gVar2.post(new C43586a());
                    ((C119157j) C119157j.f356862d).mo183878i(C43584g.this.f117827i, 100);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.g$b */
    public class C43587b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: com.tencent.mm.plugin.webview.luggage.g$b$a */
        public class C43588a implements Runnable {
            public C43588a() {
            }

            public void run() {
                C43584g gVar = C43584g.this;
                int i = C43584g.f117821n;
                gVar.mo67872a();
            }
        }

        public C43587b() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C43584g gVar = C43584g.this;
            if (gVar.f117824f) {
                return false;
            }
            gVar.f117826h = true;
            gVar.f117828j = gVar.f117822d.getWebScrollY();
            C43584g.this.post(new C43588a());
            ((C119157j) C119157j.f356862d).mo183878i(C43584g.this.f117827i, 100);
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/webview/luggage/ImmersivePageView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    public C43584g(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo67872a() {
        int webScrollY = this.f117822d.getWebScrollY();
        if (webScrollY < 300) {
            this.f117823e.mo67962i();
        } else if (webScrollY > 450) {
            this.f117823e.setAlpha(1.0f);
        } else {
            this.f117823e.setAlpha(((float) (webScrollY - 300)) / 150.0f);
        }
        Log.m105925i("MicroMsg.ImmersivePageView", "setActionBarAlpha, scrollY : %d", Integer.valueOf(webScrollY));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f117826h = false;
        if (this.f117824f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = this.f117825g;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int action = motionEvent.getAction();
        if (action == 2 || action == 1) {
            mo67872a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setActionBar(C43661n0 n0Var) {
        this.f117823e = n0Var;
    }

    public void setDisable(boolean z) {
        this.f117824f = z;
    }

    public void setWebView(WebView webView) {
        this.f117822d = webView;
    }
}
