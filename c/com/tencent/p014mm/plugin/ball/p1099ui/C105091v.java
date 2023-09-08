package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Util;
import zv0.C112691a;

/* renamed from: com.tencent.mm.plugin.ball.ui.v */
public class C105091v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311882d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f311883e;

    /* renamed from: f */
    public final /* synthetic */ C105085q f311884f;

    public C105091v(C105085q qVar, boolean z, ResultReceiver resultReceiver) {
        this.f311884f = qVar;
        this.f311882d = z;
        this.f311883e = resultReceiver;
    }

    public void run() {
        if (this.f311884f.mo149235e()) {
            C105070f fVar = this.f311884f.f311870d;
            boolean z = this.f311882d;
            ResultReceiver resultReceiver = this.f311883e;
            C112691a aVar = fVar.f311849g;
            aVar.getClass();
            aVar.f337412a = Util.nowMilliSecond();
            FloatBallView floatBallView = fVar.f311845c;
            if (floatBallView != null && fVar.f311846d != null) {
                floatBallView.mo149342x(false, (AnimatorListenerAdapter) null);
                fVar.f311846d.setInLongPressMode(false);
                fVar.f311846d.setForceShowFloatMenu(true);
                fVar.f311846d.mo149366h((AnimatorListenerAdapter) null, resultReceiver);
                fVar.f311851i = z;
            }
        }
    }
}
