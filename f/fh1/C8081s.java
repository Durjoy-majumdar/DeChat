package fh1;

import ak1.C54108o;
import android.widget.LinearLayout;
import c50.C54655b;
import di3.C86312j;
import fh1.C8048h;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedHashMap;
import rx3.C13598b0;

/* renamed from: fh1.s */
public final class C8081s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8070p f26893d;

    /* renamed from: e */
    public final /* synthetic */ String f26894e;

    /* renamed from: f */
    public final /* synthetic */ String f26895f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8081s(C8070p pVar, String str, String str2) {
        super(0);
        this.f26893d = pVar;
        this.f26894e = str;
        this.f26895f = str2;
    }

    public Object invoke() {
        C8048h.C8053d dVar;
        LinearLayout linearLayout = this.f26893d.f26835n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        C8048h hVar = (C8048h) this.f26893d.controller(C8048h.class);
        if (!(hVar == null || (dVar = hVar.f26772j) == null)) {
            dVar.mo9141c();
        }
        boolean z = false;
        int i = 1;
        if (C54655b.f153178f1 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.f26894e.length() == 0) {
                z = true;
            }
            if (!z) {
                i = 2;
            }
            linkedHashMap.put("features_stage", Integer.valueOf(i));
            linkedHashMap.put("features_type", this.f26895f);
            ((C54108o) C86312j.m106911c(C54108o.class)).Rx0("live_anchor_gesture_features", "view_exp", linkedHashMap);
        }
        return C13598b0.f38549a;
    }
}
