package com.tencent.p014mm.plugin.flash.action;

import android.app.Activity;
import android.content.DialogInterface;
import au1.C0222b;

/* renamed from: com.tencent.mm.plugin.flash.action.m */
public class C4380m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f19012d;

    public C4380m(Activity activity) {
        this.f19012d = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0222b.m173l("msgVerify", "camera or mic 正在被占用");
        C0222b.m164c().f9724q = 1;
        C0222b.m169h(90033);
        this.f19012d.setResult(1, FaceFlashActionUI.m4554Q7(4, 90030, "finish by voip call"));
        this.f19012d.finish();
    }
}
