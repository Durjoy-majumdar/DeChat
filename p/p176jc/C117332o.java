package p176jc;

import android.content.Context;
import com.tencent.skyline.SkylineLogic;
import gy3.C87412m;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.editing.WxKeyboardAction;

/* renamed from: jc.o */
public final class C117332o implements C87929h {

    /* renamed from: a */
    public final C117310g f351260a;

    /* renamed from: b */
    public final int f351261b;

    /* renamed from: c */
    public final C87933j f351262c = C87933j.TextureViewAlways;

    public C117332o(C117310g gVar, int i) {
        C87412m.m108594g(gVar, "flutterView");
        this.f351260a = gVar;
        this.f351261b = i;
        gVar.getRenderMode();
        RenderMode renderMode = RenderMode.surface;
        gVar.setEnableSwitchSurface(false);
    }

    /* renamed from: a */
    public void mo122395a(boolean z) {
    }

    /* renamed from: b */
    public void mo122396b(WxKeyboardAction wxKeyboardAction) {
        this.f351260a.setWxKeyboardAction(wxKeyboardAction);
    }

    /* renamed from: c */
    public void mo122397c() {
        SkylineLogic.INSTANCE.detachFlutterView(this.f351260a);
        C117309c.f351190a.mo181978c(this.f351260a);
    }

    /* renamed from: d */
    public void mo122398d(boolean z) {
        this.f351260a.setVisibility(z ? 0 : 4);
    }

    /* renamed from: e */
    public void mo122399e(boolean z) {
    }

    /* renamed from: f */
    public void mo122400f(Context context) {
        C87412m.m108594g(context, "context");
        this.f351260a.mo181979c(context);
    }

    /* renamed from: g */
    public void mo122401g() {
        FlutterEngine attachedFlutterEngine = this.f351260a.getAttachedFlutterEngine();
        if (attachedFlutterEngine == null || !C87412m.m108589b(attachedFlutterEngine, SkylineLogic.INSTANCE.getFlutterEngine(this.f351261b))) {
            SkylineLogic.INSTANCE.attachFlutterEngine(this.f351261b, this.f351260a);
        }
    }

    public C87933j getMode() {
        return this.f351262c;
    }

    /* renamed from: h */
    public void mo122403h() {
    }

    public void setBackgroundColor(int i) {
        this.f351260a.setBackgroundColor(i);
    }
}
