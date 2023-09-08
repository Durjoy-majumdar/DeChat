package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.C1226y1;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import eb0.C45612m0;
import eb0.C75592q0;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p203mi.C10890a0;

/* renamed from: com.tencent.mm.chatroom.ui.x1 */
public class C1224x1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ boolean f10264d;

    /* renamed from: e */
    public final /* synthetic */ ProgressDialog f10265e;

    /* renamed from: f */
    public final /* synthetic */ Activity f10266f;

    /* renamed from: g */
    public final /* synthetic */ C1226y1.C1227a f10267g;

    public C1224x1(boolean z, ProgressDialog progressDialog, Activity activity, C1226y1.C1227a aVar) {
        this.f10264d = z;
        this.f10265e = progressDialog;
        this.f10266f = activity;
        this.f10267g = aVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C86709a0.m107529k().f251779b.mo123470p(C83051d.CTRL_INDEX, this);
        if (!this.f10264d) {
            this.f10265e.cancel();
        }
        this.f10266f.getString(C0966R.string.i_5);
        C10890a0 a0Var = (C10890a0) yVar;
        if (i == 0 && i2 == 0) {
            z = true;
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(a0Var.f32507f);
            if (Lo == null) {
                Lo = new C44661m1();
            }
            Lo.mo69783F2(C75592q0.m90789s(), a0Var.f32508g);
            C45612m0.m50680G(Lo);
        } else {
            z = false;
        }
        C1226y1.C1227a aVar = this.f10267g;
        if (aVar != null) {
            int i3 = a0Var.f32509h;
            RoomAlphaProcessUI roomAlphaProcessUI = (RoomAlphaProcessUI) aVar;
            if (z) {
                C76879j.m92728V(roomAlphaProcessUI, roomAlphaProcessUI.getString(C0966R.string.i_6), 0, (DialogInterface.OnDismissListener) null);
                new MMHandler().postDelayed(new C1218q1(roomAlphaProcessUI, z, i3), 200);
                return;
            }
            C76879j.m92749t(roomAlphaProcessUI, roomAlphaProcessUI.getString(C0966R.string.i_5), "", (DialogInterface.OnClickListener) null);
            new MMHandler().postDelayed(new C1219r1(roomAlphaProcessUI, z), 200);
        }
    }
}
