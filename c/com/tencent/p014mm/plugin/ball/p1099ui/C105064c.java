package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import bw0.C104178q;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105050r;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xv0.C112181e;
import xv0.C112186j;
import yv0.C112506c;
import zv0.C112691a;

/* renamed from: com.tencent.mm.plugin.ball.ui.c */
public class C105064c implements C112186j {

    /* renamed from: a */
    public int f311837a = 0;

    /* renamed from: b */
    public final /* synthetic */ C105070f f311838b;

    /* renamed from: com.tencent.mm.plugin.ball.ui.c$a */
    public class C105065a extends AnimatorListenerAdapter {
        public C105065a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C105064c.this.f311838b.mo149223f(131072);
        }
    }

    public C105064c(C105070f fVar) {
        this.f311838b = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14547a(com.tencent.p014mm.plugin.ball.model.BallInfo r6, int r7, int r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r5.f311837a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1 = 1
            r0[r1] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3 = 2
            r0[r3] = r7
            java.lang.String r7 = "MicroMsg.FloatBallContainer"
            java.lang.String r4 = "onCollapseStateChanged current: %d, old: %d, new: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            int r7 = r5.f311837a
            if (r7 != 0) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x003d
            if (r8 == r1) goto L_0x0034
            if (r8 != r3) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            r7 = 17
            com.tencent.p014mm.plugin.ball.service.C105034a.m140876b(r6, r7)
            goto L_0x0053
        L_0x003d:
            if (r7 == r1) goto L_0x0044
            if (r7 != r3) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r7 = 0
            goto L_0x0045
        L_0x0044:
            r7 = 1
        L_0x0045:
            if (r7 == 0) goto L_0x0053
            if (r8 != 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x0053
            r7 = 18
            com.tencent.p014mm.plugin.ball.service.C105034a.m140876b(r6, r7)
        L_0x0053:
            if (r8 == r1) goto L_0x005a
            if (r8 != r3) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = 1
        L_0x005b:
            if (r6 != 0) goto L_0x0062
            if (r8 != 0) goto L_0x0060
            r2 = 1
        L_0x0060:
            if (r2 == 0) goto L_0x0064
        L_0x0062:
            r5.f311837a = r8
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.p1099ui.C105064c.mo14547a(com.tencent.mm.plugin.ball.model.BallInfo, int, int):void");
    }

    /* renamed from: b */
    public void mo14548b() {
        Log.m105924i("MicroMsg.FloatBallContainer", "onBallLongPressed");
        C112691a aVar = this.f311838b.f311849g;
        aVar.getClass();
        aVar.f337412a = Util.nowMilliSecond();
        this.f311838b.f311845c.mo149342x(false, (AnimatorListenerAdapter) null);
        this.f311838b.f311846d.setInLongPressMode(true);
        this.f311838b.f311846d.mo149365g((AnimatorListenerAdapter) null);
    }

    /* renamed from: c */
    public void mo14549c() {
        C112181e eVar;
        Log.m105925i("MicroMsg.FloatBallContainer", "onBallDragEnd needProcessFloatViewFlags: %b", Boolean.valueOf(this.f311838b.f311848f));
        C105070f fVar = this.f311838b;
        if (fVar.f311848f && (eVar = fVar.f311844b) != null && !eVar.mo149096N(true, new C105065a())) {
            this.f311838b.mo149223f(131072);
        }
    }

    /* renamed from: d */
    public void mo14550d() {
        Log.m105924i("MicroMsg.FloatBallContainer", "onBallClicked");
        C112691a aVar = this.f311838b.f311849g;
        aVar.getClass();
        aVar.f337412a = Util.nowMilliSecond();
        this.f311838b.f311845c.mo149342x(false, (AnimatorListenerAdapter) null);
        this.f311838b.f311846d.setInLongPressMode(false);
        this.f311838b.f311846d.mo149365g((AnimatorListenerAdapter) null);
    }

    /* renamed from: e */
    public void mo14551e(int i, int i2) {
        Log.m105925i("MicroMsg.FloatBallContainer", "onBallDragStart needProcessFloatViewFlags: %b", Boolean.valueOf(this.f311838b.f311848f));
        C105070f fVar = this.f311838b;
        if (fVar.f311848f) {
            fVar.mo149219b(131072);
        }
    }

    /* renamed from: f */
    public void mo5834f(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        if (z) {
            Log.m105925i("MicroMsg.FloatBallContainer", "onBallSettled, x:%s, y:%s, height:%s, isDockLeft: %s, collapseState: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2), Integer.valueOf(i4));
            FloatMenuView floatMenuView = this.f311838b.f311846d;
            floatMenuView.f312049u = z2;
            if (!(i == floatMenuView.f312035d && i2 == floatMenuView.f312036e && i3 == floatMenuView.f312048t)) {
                Log.m105925i("MicroMsg.FloatMenuView", "onBallPositionChanged, position:[%s, %s], height:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                floatMenuView.f312048t = i3;
                floatMenuView.post(new C104178q(floatMenuView, i, i2, z2));
            }
            C105050r d = C105050r.m140969d();
            d.getClass();
            if (i != C105050r.f311801e) {
                C105050r.f311801e = i;
                MultiProcessMMKV.getMMKV(d.mo149194c()).encode("pos_x", C105050r.f311801e);
            }
            if (i2 != C105050r.f311802f) {
                C105050r.f311802f = i2;
                MultiProcessMMKV.getMMKV(d.mo149194c()).encode("pos_y", C105050r.f311802f);
            }
            if (z2 != C105050r.f311804h) {
                C105050r.f311804h = z2;
                MultiProcessMMKV.getMMKV(d.mo149194c()).encode("dock_left", C105050r.f311804h);
            }
            if (C105050r.f311803g != i4) {
                C105050r.f311803g = i4;
                MultiProcessMMKV.getMMKV(d.mo149194c()).encode("collapse_state", C105050r.f311803g);
            }
        }
    }

    /* renamed from: g */
    public void mo14552g(MotionEvent motionEvent) {
        Log.m105924i("MicroMsg.FloatBallContainer", "onBallLongPressTouchEvent");
        FloatMenuView floatMenuView = this.f311838b.f311846d;
        if (floatMenuView.f312050v) {
            int action = motionEvent.getAction();
            if (action == 1) {
                floatMenuView.mo149361d(motionEvent);
                View view = floatMenuView.f312054z;
                if (view == null || !(view.getTag() instanceof BallInfo)) {
                    Log.m105924i("MicroMsg.FloatMenuView", "no lastTouchedItemView, call back pressed");
                    floatMenuView.mo149360c();
                } else {
                    floatMenuView.mo149364f(floatMenuView.f312054z);
                    BallInfo ballInfo = (BallInfo) floatMenuView.f312054z.getTag();
                    if (ballInfo.f311680E) {
                        Log.m105924i("MicroMsg.FloatMenuView", "passive ballInfo, call back pressed");
                        floatMenuView.mo149360c();
                    } else {
                        ballInfo.f311683H.f311721j = 2;
                        Iterator it = ((CopyOnWriteArraySet) floatMenuView.f312041j).iterator();
                        while (it.hasNext()) {
                            ((C112506c) it.next()).mo145797a(ballInfo);
                        }
                    }
                }
                floatMenuView.f312050v = false;
                floatMenuView.f312054z = null;
                floatMenuView.f312030A = -1;
            } else if (action == 2) {
                floatMenuView.mo149361d(motionEvent);
            } else if (action == 3) {
                Log.m105925i("MicroMsg.FloatMenuView", "onBallLongPressTouchEvent, CANCEL(%s, %s)", Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            }
        }
    }

    public void onOrientationChange(int i) {
        C105070f.m141010a(this.f311838b, i);
    }
}
