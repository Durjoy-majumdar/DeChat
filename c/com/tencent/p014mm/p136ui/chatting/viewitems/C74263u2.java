package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import xo3.C78950d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u2 */
public class C74263u2 implements C78950d.C78962l {

    /* renamed from: a */
    public C78950d f218130a;

    public C74263u2(C78950d dVar) {
        this.f218130a = dVar;
    }

    /* renamed from: a */
    public void mo103130a() {
        Log.m105918d("OnTouchOutside", "touchOutside");
        this.f218130a.mo108922f();
        C78950d dVar = this.f218130a;
        dVar.f231829D = true;
        dVar.mo108919c();
        C78950d dVar2 = this.f218130a;
        dVar2.f231828C = true;
        dVar2.mo108920d();
        C78950d.C78963m mVar = this.f218130a.f231845g;
        if (mVar != null) {
            mVar.mo103116a();
        }
    }
}
