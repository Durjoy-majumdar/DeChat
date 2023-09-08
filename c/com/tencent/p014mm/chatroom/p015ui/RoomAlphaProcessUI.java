package com.tencent.p014mm.chatroom.p015ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.C1226y1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import f40.C86709a0;
import nj3.C76879j;
import nj3.C88989a;
import p203mi.C10890a0;

@C88989a(3)
@Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomAlphaProcessUI */
public class RoomAlphaProcessUI extends MMActivity implements C1226y1.C1227a {

    /* renamed from: d */
    public String f10166d;

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10166d = getIntent().getStringExtra("RoomInfo_Id");
        initView();
        C10890a0 a0Var = new C10890a0(this.f10166d);
        C86709a0.m107529k().f251779b.mo123455a(C83051d.CTRL_INDEX, new C1224x1(false, C76879j.m92723Q(this, (String) null, getString(C0966R.string.gas), true, false, new C1222w1()), this, this));
        C86709a0.m107529k().f251779b.mo123460f(a0Var);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
