package p176jc;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.skyline.SkylineLogic;
import gy3.C87412m;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.editing.WxKeyboardAction;

/* renamed from: jc.i */
public final class C117319i implements C87929h {

    /* renamed from: a */
    public final C117310g f351212a;

    /* renamed from: b */
    public final int f351213b;

    /* renamed from: c */
    public final ViewGroup f351214c;

    /* renamed from: d */
    public final C87933j f351215d = C87933j.Legacy;

    public C117319i(C117310g gVar, int i, ViewGroup viewGroup) {
        C87412m.m108594g(gVar, "flutterView");
        C87412m.m108594g(viewGroup, "parent");
        this.f351212a = gVar;
        this.f351213b = i;
        this.f351214c = viewGroup;
        gVar.getRenderMode();
        RenderMode renderMode = RenderMode.surface;
        gVar.setEnableSwitchSurface(false);
    }

    /* renamed from: a */
    public void mo122395a(boolean z) {
        this.f351212a.setTranslationX(0.0f);
        if (!C87412m.m108589b(this.f351212a.getParent(), this.f351214c)) {
            ViewParent parent = this.f351212a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f351212a);
            }
            this.f351214c.addView(this.f351212a);
        }
        mo122401g();
    }

    /* renamed from: b */
    public void mo122396b(WxKeyboardAction wxKeyboardAction) {
        this.f351212a.setWxKeyboardAction(wxKeyboardAction);
    }

    /* renamed from: c */
    public void mo122397c() {
        SkylineLogic.INSTANCE.detachFlutterView(this.f351212a);
        C117309c.f351190a.mo181978c(this.f351212a);
    }

    /* renamed from: d */
    public void mo122398d(boolean z) {
        this.f351212a.setVisibility(z ? 0 : 4);
    }

    /* renamed from: e */
    public void mo122399e(boolean z) {
        C117310g gVar = this.f351212a;
        gVar.setTranslationX(-((float) gVar.getWidth()));
        SkylineLogic.INSTANCE.detachFlutterView(this.f351212a);
        ViewParent parent = this.f351212a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f351212a);
        }
    }

    /* renamed from: f */
    public void mo122400f(Context context) {
        C87412m.m108594g(context, "context");
        this.f351212a.mo181979c(context);
    }

    /* renamed from: g */
    public void mo122401g() {
        FlutterEngine attachedFlutterEngine = this.f351212a.getAttachedFlutterEngine();
        if (attachedFlutterEngine == null || !C87412m.m108589b(attachedFlutterEngine, SkylineLogic.INSTANCE.getFlutterEngine(this.f351213b))) {
            SkylineLogic.INSTANCE.attachFlutterEngine(this.f351213b, this.f351212a);
        }
    }

    public C87933j getMode() {
        return this.f351215d;
    }

    /* renamed from: h */
    public void mo122403h() {
    }

    public void setBackgroundColor(int i) {
        this.f351212a.setBackgroundColor(i);
    }
}
