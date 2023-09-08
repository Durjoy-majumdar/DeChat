package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import p232rw.C77574q;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.x0 */
public class C82776x0 implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ JsApiChooseMedia.C82662d f242123d;

    public C82776x0(JsApiChooseMedia.C82662d dVar) {
        this.f242123d = dVar;
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }

    public void resumeWith(Object obj) {
        if (obj instanceof C77575r) {
            C77575r rVar = (C77575r) obj;
            JsApiChooseMedia.C82662d dVar = this.f242123d;
            dVar.f241878n = rVar.f226146a;
            int i = rVar.f226147b;
            if (i == 0) {
                JsApiChooseMedia.ChooseResult chooseResult = dVar.f241871d;
                chooseResult.f241859d = 0;
                dVar.finishProcess(chooseResult);
            } else if (i == -1 && rVar.f226148c == 0) {
                C77574q qVar = rVar.f226149d;
                if (qVar.mo107739a()) {
                    this.f242123d.mo114955j(qVar.f226143b, new Intent());
                } else {
                    this.f242123d.mo114954i(qVar.f226143b, qVar.f226144c);
                }
            } else {
                JsApiChooseMedia.ChooseResult chooseResult2 = dVar.f241871d;
                chooseResult2.f241859d = -2;
                dVar.finishProcess(chooseResult2);
            }
        } else {
            JsApiChooseMedia.C82662d dVar2 = this.f242123d;
            JsApiChooseMedia.ChooseResult chooseResult3 = dVar2.f241871d;
            chooseResult3.f241859d = -2;
            dVar2.finishProcess(chooseResult3);
        }
    }
}
