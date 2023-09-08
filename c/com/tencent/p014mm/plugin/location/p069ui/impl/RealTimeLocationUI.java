package com.tencent.p014mm.plugin.location.p069ui.impl;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import cc0.C92411b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.location.p069ui.ShareHeader;
import com.tencent.p014mm.plugin.location.p069ui.TipSayingWidget;
import com.tencent.p014mm.plugin.location.p069ui.VolumeMeter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import p702ts.C78085c;
import qo3.C77389a;
import qo3.C77398g;
import sx2.C118325m;
import t22.C118355y;
import t22.C77832s;
import te3.ep4;
import x22.C112033j;
import x22.C118796l;
import x22.C118805o;
import x22.C118811r;
import x22.C118812s;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI */
public class RealTimeLocationUI extends C94163b1 implements C118805o.C118808c {

    /* renamed from: Q0 */
    public ShareHeader f346452Q0;

    /* renamed from: R */
    public Button f346453R;

    /* renamed from: R0 */
    public String f346454R0;

    /* renamed from: S */
    public LocationCrossHairView f346455S;

    /* renamed from: S0 */
    public long f346456S0 = 0;

    /* renamed from: T */
    public CustomIndoorPicker f346457T;

    /* renamed from: T0 */
    public C118355y.C118360e f346458T0 = new C115532a();

    /* renamed from: U */
    public View f346459U;

    /* renamed from: U0 */
    public C118355y.C118359d f346460U0 = new C115533b();

    /* renamed from: V */
    public TipSayingWidget f346461V;

    /* renamed from: V0 */
    public C92411b.C92412a f346462V0 = new C115534c();

    /* renamed from: W */
    public C118812s f346463W;

    /* renamed from: W0 */
    public IListener f346464W0 = new IListener<VoipEvent>(C40008f.f107254d) {
        {
            this.__eventId = -797557590;
        }

        public boolean callback(IEvent iEvent) {
            VoipEvent voipEvent = (VoipEvent) iEvent;
            if (!C86709a0.m107522a()) {
                return false;
            }
            if (voipEvent.f194019d.f194022b == 3) {
                RealTimeLocationUI.this.f346463W.mo183521d(false);
                RealTimeLocationUI.this.f346465X.mo183163f();
                RealTimeLocationUI.this.f346465X.mo183158a(2);
                RealTimeLocationUI.this.f346468Z.mo183508c();
                RealTimeLocationUI.this.f271948d.finish();
            }
            return true;
        }
    };

    /* renamed from: X */
    public C118355y f346465X = C77832s.Ax0();

    /* renamed from: X0 */
    public HashMap<String, ep4> f346466X0 = new HashMap<>();

    /* renamed from: Y */
    public C118805o f346467Y;

    /* renamed from: Z */
    public C118796l f346468Z;

    /* renamed from: p0 */
    public C112033j f346469p0;

    /* renamed from: x0 */
    public C92411b f346470x0 = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();

    /* renamed from: y0 */
    public PowerManager.WakeLock f346471y0;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI$a */
    public class C115532a implements C118355y.C118360e {
        public C115532a() {
        }

        /* renamed from: a */
        public void mo175548a(int i, String str) {
            Log.m105927v("MicroMsg.RealTimeLocationUI", "onError type %d msg %s", Integer.valueOf(i), str);
            C115669n.INSTANCE.mo160131h(10997, "7", "", 0, 0);
            C118805o oVar = RealTimeLocationUI.this.f346467Y;
            oVar.getClass();
            Log.m105919d("MicroMsg.TrackPoiDialogMgr", "showErrorDialog, errMsg=%s", str);
            Context context = MMApplicationContext.getContext();
            if (Util.isNullOrNil(str)) {
                str = i == 0 ? context.getString(C0966R.string.gb5) : i == 1 ? context.getString(C0966R.string.gba) : i == 2 ? context.getString(C0966R.string.gbb) : null;
            }
            C76879j.m92711E(oVar.f355453a, str, "", oVar.f355455c.getString(C0966R.string.a18), false, new C118811r(oVar, i));
        }

        /* renamed from: b */
        public void mo175549b() {
            Log.m105924i("MicroMsg.RealTimeLocationUI", "onJoinSucess");
            C118355y yVar = RealTimeLocationUI.this.f346465X;
            yVar.f353748q = true;
            int i = yVar.f353744j;
            if (i == 1) {
                yVar.f353744j = 3;
            } else if (i == 3) {
                yVar.f353744j = 2;
            }
            yVar.mo183161d();
            RealTimeLocationUI.this.f346463W.mo183521d(true);
            C118796l lVar = RealTimeLocationUI.this.f346468Z;
            if (lVar != null) {
                lVar.mo183509d();
            }
        }

        /* renamed from: c */
        public void mo175550c() {
            RealTimeLocationUI.this.f346463W.mo183521d(false);
            RealTimeLocationUI.this.f346465X.mo183163f();
            RealTimeLocationUI.this.f346465X.mo183158a(3);
            RealTimeLocationUI.this.f346468Z.mo183508c();
            RealTimeLocationUI.this.f271948d.finish();
            RealTimeLocationUI.this.f271948d.overridePendingTransition(C0966R.C0968anim.f2470du, C0966R.C0968anim.f2472dw);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b4, code lost:
            r11 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r11;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo175551d(te3.C118428eq3 r29) {
            /*
                r28 = this;
                r1 = r28
                r0 = r29
                com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI r2 = com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI.this
                java.lang.String r3 = "MicroMsg.RealTimeLocationUI"
                java.lang.String r4 = "refreshSuccess, timeout = %b"
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                t22.y r7 = r2.f346465X
                boolean r7 = r7.f353753v
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r8 = 0
                r6[r8] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r6)
                java.util.LinkedList<te3.ep4> r3 = r0.f353981e
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                t22.z r6 = t22.C77832s.Bx0()
                java.lang.String r7 = r2.f271960s
                s22.a r6 = r6.mo107951d(r7)
                if (r6 != 0) goto L_0x003c
                s22.a r6 = new s22.a
                r6.<init>()
                r9 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
                r6.f226270g = r9
                r6.f226269f = r9
            L_0x003c:
                java.util.LinkedList r11 = new java.util.LinkedList
                r11.<init>()
                java.util.Iterator r7 = r3.iterator()
            L_0x0045:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0057
                java.lang.Object r9 = r7.next()
                te3.ep4 r9 = (te3.ep4) r9
                java.lang.String r9 = r9.f353978d
                r11.add(r9)
                goto L_0x0045
            L_0x0057:
                java.lang.String r7 = eb0.C75592q0.m90789s()
                boolean r7 = r11.contains(r7)
                if (r7 != 0) goto L_0x0068
                java.lang.String r7 = eb0.C75592q0.m90789s()
                r11.add(r7)
            L_0x0068:
                t22.z r9 = t22.C77832s.Bx0()
                java.lang.String r10 = r2.f271960s
                double r12 = r6.f226270g
                double r14 = r6.f226269f
                java.lang.String r6 = r6.f226271h
                java.lang.String r17 = ""
                java.lang.String r18 = ""
                r16 = r6
                r9.mo107956i(r10, r11, r12, r14, r16, r17, r18)
                java.util.Iterator r3 = r3.iterator()
            L_0x0081:
                boolean r6 = r3.hasNext()
                r7 = 2
                r9 = 5
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r3.next()
                te3.ep4 r6 = (te3.ep4) r6
                te3.vf3 r12 = r6.f353979e
                double r12 = r12.f354501e
                double r12 = java.lang.Math.abs(r12)
                r14 = 4640537203540230144(0x4066800000000000, double:180.0)
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x00b6
                te3.vf3 r12 = r6.f353979e
                double r12 = r12.f354500d
                double r12 = java.lang.Math.abs(r12)
                r14 = 4636033603912859648(0x4056800000000000, double:90.0)
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 <= 0) goto L_0x00b2
                goto L_0x00b6
            L_0x00b2:
                r4.add(r6)
                goto L_0x0081
            L_0x00b6:
                java.util.HashMap<java.lang.String, te3.ep4> r12 = r2.f346466X0
                java.lang.String r13 = r6.f353978d
                java.lang.Object r12 = r12.get(r13)
                te3.ep4 r12 = (te3.ep4) r12
                if (r12 == 0) goto L_0x00fd
                r4.add(r12)
                java.lang.String r13 = "MicroMsg.RealTimeLocationUI"
                java.lang.String r14 = "error from server get latlng %s %f %f and use old one %f %f"
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.String r15 = r6.f353978d
                r9[r8] = r15
                te3.vf3 r15 = r6.f353979e
                double r10 = r15.f354500d
                java.lang.Double r10 = java.lang.Double.valueOf(r10)
                r9[r5] = r10
                te3.vf3 r6 = r6.f353979e
                double r10 = r6.f354501e
                java.lang.Double r6 = java.lang.Double.valueOf(r10)
                r9[r7] = r6
                te3.vf3 r6 = r12.f353979e
                double r6 = r6.f354500d
                java.lang.Double r6 = java.lang.Double.valueOf(r6)
                r10 = 3
                r9[r10] = r6
                te3.vf3 r6 = r12.f353979e
                double r6 = r6.f354501e
                java.lang.Double r6 = java.lang.Double.valueOf(r6)
                r7 = 4
                r9[r7] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r9)
                goto L_0x0081
            L_0x00fd:
                r10 = 3
                java.lang.String r9 = "MicroMsg.RealTimeLocationUI"
                java.lang.String r11 = "error from server get latlng %s %f %f cannot user old one"
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.String r12 = r6.f353978d
                r10[r8] = r12
                te3.vf3 r12 = r6.f353979e
                double r12 = r12.f354500d
                java.lang.Double r12 = java.lang.Double.valueOf(r12)
                r10[r5] = r12
                te3.vf3 r6 = r6.f353979e
                double r12 = r6.f354501e
                java.lang.Double r6 = java.lang.Double.valueOf(r12)
                r10[r7] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
                goto L_0x0081
            L_0x0121:
                java.util.HashMap<java.lang.String, te3.ep4> r3 = r2.f346466X0
                r3.clear()
                java.util.Iterator r3 = r4.iterator()
            L_0x012a:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x013e
                java.lang.Object r6 = r3.next()
                te3.ep4 r6 = (te3.ep4) r6
                java.util.HashMap<java.lang.String, te3.ep4> r10 = r2.f346466X0
                java.lang.String r11 = r6.f353978d
                r10.put(r11, r6)
                goto L_0x012a
            L_0x013e:
                int r3 = r4.size()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.String r10 = eb0.C75592q0.m90789s()
                r6.add(r10)
                if (r3 < 0) goto L_0x045a
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "refreshSuccess, count =  "
                r11.append(r12)
                r11.append(r3)
                java.lang.String r3 = r11.toString()
                r10.append(r3)
                r3 = 0
            L_0x016a:
                int r11 = r4.size()
                if (r3 >= r11) goto L_0x01e1
                java.lang.Object r11 = r4.get(r3)
                te3.ep4 r11 = (te3.ep4) r11
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "["
                r12.append(r13)
                java.lang.String r13 = r11.f353978d
                r12.append(r13)
                java.lang.String r13 = " ] "
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r10.append(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                te3.vf3 r13 = r11.f353979e
                double r13 = r13.f354502f
                r12.append(r13)
                java.lang.String r13 = " "
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r10.append(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                te3.vf3 r13 = r11.f353979e
                double r13 = r13.f354500d
                r12.append(r13)
                java.lang.String r13 = " "
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r10.append(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                te3.vf3 r13 = r11.f353979e
                double r13 = r13.f354501e
                r12.append(r13)
                java.lang.String r13 = " "
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r10.append(r12)
                java.lang.String r11 = r11.f353978d
                r6.add(r11)
                int r3 = r3 + 1
                goto L_0x016a
            L_0x01e1:
                java.lang.String r3 = "MicroMsg.RealTimeLocationUI"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "refreshSuccess TrackRoom num: "
                r11.append(r12)
                java.lang.String r10 = r10.toString()
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r10)
                x22.s r3 = r2.f346463W
                if (r3 == 0) goto L_0x045a
                r3.f355465e = r5
                java.util.List<te3.ep4> r10 = r3.f355462b
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                int r10 = r10.size()
                int r10 = r10 + r5
                java.lang.Object r11 = x22.C118812s.f355460x
                monitor-enter(r11)
                java.util.List<te3.ep4> r12 = r3.f355462b     // Catch:{ all -> 0x0457 }
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0457 }
                r12.clear()     // Catch:{ all -> 0x0457 }
                r12 = 0
            L_0x0215:
                int r13 = r4.size()     // Catch:{ all -> 0x0457 }
                if (r12 >= r13) goto L_0x022b
                java.util.List<te3.ep4> r13 = r3.f355462b     // Catch:{ all -> 0x0457 }
                java.lang.Object r14 = r4.get(r12)     // Catch:{ all -> 0x0457 }
                te3.ep4 r14 = (te3.ep4) r14     // Catch:{ all -> 0x0457 }
                java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x0457 }
                r13.add(r14)     // Catch:{ all -> 0x0457 }
                int r12 = r12 + 1
                goto L_0x0215
            L_0x022b:
                monitor-exit(r11)     // Catch:{ all -> 0x0457 }
                java.util.List<te3.ep4> r4 = r3.f355462b
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                int r4 = r4.size()
                int r4 = r4 + r5
                java.lang.Object r12 = x22.C118812s.f355460x
                monitor-enter(r12)
                y22.e r11 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.util.Set r11 = r11.getTags()     // Catch:{ all -> 0x0454 }
                java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x0454 }
                r13.<init>()     // Catch:{ all -> 0x0454 }
                r14 = 0
            L_0x0244:
                java.util.List<te3.ep4> r15 = r3.f355462b     // Catch:{ all -> 0x0454 }
                java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x0454 }
                int r15 = r15.size()     // Catch:{ all -> 0x0454 }
                if (r14 >= r15) goto L_0x0260
                java.util.List<te3.ep4> r15 = r3.f355462b     // Catch:{ all -> 0x0454 }
                java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x0454 }
                java.lang.Object r15 = r15.get(r14)     // Catch:{ all -> 0x0454 }
                te3.ep4 r15 = (te3.ep4) r15     // Catch:{ all -> 0x0454 }
                java.lang.String r15 = r15.f353978d     // Catch:{ all -> 0x0454 }
                r13.add(r15)     // Catch:{ all -> 0x0454 }
                int r14 = r14 + 1
                goto L_0x0244
            L_0x0260:
                java.util.LinkedList r14 = new java.util.LinkedList     // Catch:{ all -> 0x0454 }
                r14.<init>()     // Catch:{ all -> 0x0454 }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0454 }
            L_0x0269:
                boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0454 }
                if (r15 == 0) goto L_0x029a
                java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0454 }
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0454 }
                boolean r18 = r13.contains(r15)     // Catch:{ all -> 0x0454 }
                if (r18 != 0) goto L_0x0269
                java.lang.String r7 = "myAnim"
                boolean r7 = r15.endsWith(r7)     // Catch:{ all -> 0x0454 }
                if (r7 != 0) goto L_0x0297
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r7 = r3.f355464d     // Catch:{ all -> 0x0454 }
                if (r7 == 0) goto L_0x0294
                y22.e r5 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.lang.Object r5 = r5.getViewByItag(r15)     // Catch:{ all -> 0x0454 }
                boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0454 }
                if (r5 == 0) goto L_0x0294
                goto L_0x0297
            L_0x0294:
                r14.add(r15)     // Catch:{ all -> 0x0454 }
            L_0x0297:
                r5 = 1
                r7 = 2
                goto L_0x0269
            L_0x029a:
                java.util.Iterator r5 = r14.iterator()     // Catch:{ all -> 0x0454 }
            L_0x029e:
                boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0454 }
                if (r7 == 0) goto L_0x02cc
                java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0454 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0454 }
                y22.e r11 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.lang.Object r11 = r11.getViewByItag(r7)     // Catch:{ all -> 0x0454 }
                boolean r13 = r11 instanceof com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                if (r13 == 0) goto L_0x02c6
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r11 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r11     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r13 = r11.f346485p     // Catch:{ all -> 0x0454 }
                if (r13 == 0) goto L_0x02c6
                android.widget.FrameLayout r14 = r11.f346477e     // Catch:{ all -> 0x0454 }
                r13.removeView(r14)     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r13 = r11.f346485p     // Catch:{ all -> 0x0454 }
                android.widget.ImageView r11 = r11.f346478f     // Catch:{ all -> 0x0454 }
                r13.removeView(r11)     // Catch:{ all -> 0x0454 }
            L_0x02c6:
                y22.e r11 = r3.f355472l     // Catch:{ all -> 0x0454 }
                r11.removeViewByTag(r7)     // Catch:{ all -> 0x0454 }
                goto L_0x029e
            L_0x02cc:
                r5 = 0
            L_0x02cd:
                java.util.List<te3.ep4> r7 = r3.f355462b     // Catch:{ all -> 0x0454 }
                java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0454 }
                int r7 = r7.size()     // Catch:{ all -> 0x0454 }
                if (r5 >= r7) goto L_0x03d7
                java.util.List<te3.ep4> r7 = r3.f355462b     // Catch:{ all -> 0x0454 }
                java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0454 }
                java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0454 }
                te3.ep4 r7 = (te3.ep4) r7     // Catch:{ all -> 0x0454 }
                y22.e r11 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.lang.String r13 = r7.f353978d     // Catch:{ all -> 0x0454 }
                java.lang.Object r11 = r11.getViewByItag(r13)     // Catch:{ all -> 0x0454 }
                java.lang.String r13 = "MicroMsg.TrackPointViewMgrImpl"
                java.lang.String r14 = "position %d %s %f %f %f"
                java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x0454 }
                java.lang.Integer r20 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0454 }
                r15[r8] = r20     // Catch:{ all -> 0x0454 }
                java.lang.String r9 = r7.f353978d     // Catch:{ all -> 0x0454 }
                r19 = 1
                r15[r19] = r9     // Catch:{ all -> 0x0454 }
                te3.vf3 r9 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r8 = r9.f354500d     // Catch:{ all -> 0x0454 }
                java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ all -> 0x0454 }
                r9 = 2
                r15[r9] = r8     // Catch:{ all -> 0x0454 }
                te3.vf3 r8 = r7.f353979e     // Catch:{ all -> 0x0454 }
                r18 = r10
                double r9 = r8.f354501e     // Catch:{ all -> 0x0454 }
                java.lang.Double r8 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x0454 }
                r9 = 3
                r15[r9] = r8     // Catch:{ all -> 0x0454 }
                te3.vf3 r8 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r8 = r8.f354502f     // Catch:{ all -> 0x0454 }
                java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ all -> 0x0454 }
                r9 = 4
                r15[r9] = r8     // Catch:{ all -> 0x0454 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r14, r15)     // Catch:{ all -> 0x0454 }
                if (r11 == 0) goto L_0x0355
                boolean r8 = r11 instanceof com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                if (r8 == 0) goto L_0x03ab
                r8 = r11
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r8 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r8     // Catch:{ all -> 0x0454 }
                te3.vf3 r9 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r13 = r9.f354500d     // Catch:{ all -> 0x0454 }
                double r9 = r9.f354501e     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r15 = r8.f346485p     // Catch:{ all -> 0x0454 }
                if (r15 == 0) goto L_0x03ab
                android.widget.FrameLayout r1 = r8.f346477e     // Catch:{ all -> 0x0454 }
                r27 = 0
                r21 = r15
                r22 = r1
                r23 = r13
                r25 = r9
                r21.updateViewLayout(r22, r23, r25, r27)     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r1 = r8.f346485p     // Catch:{ all -> 0x0454 }
                android.widget.ImageView r8 = r8.f346478f     // Catch:{ all -> 0x0454 }
                r27 = 0
                r21 = r1
                r22 = r8
                r23 = r13
                r25 = r9
                r21.updateLocationPinLayout(r22, r23, r25, r27)     // Catch:{ all -> 0x0454 }
                goto L_0x03ab
            L_0x0355:
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r11 = new com.tencent.mm.plugin.location.ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                android.content.Context r1 = r3.f355461a     // Catch:{ all -> 0x0454 }
                y22.e r8 = r3.f355472l     // Catch:{ all -> 0x0454 }
                y22.f r8 = r8.getViewManager()     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r8 = (com.tencent.p014mm.plugin.location_soso.ViewManager) r8     // Catch:{ all -> 0x0454 }
                r11.<init>((android.content.Context) r1, (com.tencent.p014mm.plugin.location_soso.ViewManager) r8)     // Catch:{ all -> 0x0454 }
                y22.e r1 = r3.f355472l     // Catch:{ all -> 0x0454 }
                te3.vf3 r8 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r9 = r8.f354500d     // Catch:{ all -> 0x0454 }
                double r13 = r8.f354501e     // Catch:{ all -> 0x0454 }
                java.lang.String r8 = r7.f353978d     // Catch:{ all -> 0x0454 }
                r21 = r1
                r22 = r11
                r23 = r9
                r25 = r13
                r27 = r8
                r21.addView(r22, r23, r25, r27)     // Catch:{ all -> 0x0454 }
                te3.vf3 r1 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r8 = r1.f354500d     // Catch:{ all -> 0x0454 }
                double r13 = r1.f354501e     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r1 = r11.f346485p     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03a1
                android.widget.FrameLayout r10 = r11.f346477e     // Catch:{ all -> 0x0454 }
                r21 = r1
                r22 = r10
                r23 = r8
                r25 = r13
                r21.addView(r22, r23, r25)     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r1 = r11.f346485p     // Catch:{ all -> 0x0454 }
                android.widget.ImageView r10 = r11.f346478f     // Catch:{ all -> 0x0454 }
                r21 = r1
                r22 = r10
                r23 = r8
                r25 = r13
                r21.addView(r22, r23, r25)     // Catch:{ all -> 0x0454 }
            L_0x03a1:
                android.view.View$OnClickListener r1 = r3.f355481u     // Catch:{ all -> 0x0454 }
                r11.setOnAvatarOnClickListener(r1)     // Catch:{ all -> 0x0454 }
                android.view.View$OnClickListener r1 = r3.f355480t     // Catch:{ all -> 0x0454 }
                r11.setOnLocationOnClickListener(r1)     // Catch:{ all -> 0x0454 }
            L_0x03ab:
                boolean r1 = r11 instanceof com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03cd
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r11 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r11     // Catch:{ all -> 0x0454 }
                java.lang.String r1 = r7.f353978d     // Catch:{ all -> 0x0454 }
                r11.setAvatar(r1)     // Catch:{ all -> 0x0454 }
                te3.vf3 r1 = r7.f353979e     // Catch:{ all -> 0x0454 }
                double r7 = r1.f354502f     // Catch:{ all -> 0x0454 }
                r11.f346479g = r7     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r1 = r11.f346485p     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03c6
                android.widget.ImageView r9 = r11.f346478f     // Catch:{ all -> 0x0454 }
                float r7 = (float) r7     // Catch:{ all -> 0x0454 }
                r1.updateRotation(r9, r7)     // Catch:{ all -> 0x0454 }
            L_0x03c6:
                boolean r1 = r3.f355468h     // Catch:{ all -> 0x0454 }
                if (r1 != 0) goto L_0x03cd
                r11.mo175553a()     // Catch:{ all -> 0x0454 }
            L_0x03cd:
                int r5 = r5 + 1
                r1 = r28
                r10 = r18
                r8 = 0
                r9 = 5
                goto L_0x02cd
            L_0x03d7:
                r18 = r10
                boolean r1 = r3.f355473m     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03fe
                boolean r1 = r3.f355465e     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03fe
                t22.y r1 = t22.C77832s.Ax0()     // Catch:{ all -> 0x0454 }
                java.lang.String r1 = r1.f353752u     // Catch:{ all -> 0x0454 }
                boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)     // Catch:{ all -> 0x0454 }
                if (r1 == 0) goto L_0x03f1
                r3.mo183522e()     // Catch:{ all -> 0x0454 }
                goto L_0x03fe
            L_0x03f1:
                java.util.List<te3.ep4> r1 = r3.f355462b     // Catch:{ all -> 0x0454 }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0454 }
                int r1 = r1.size()     // Catch:{ all -> 0x0454 }
                if (r1 <= 0) goto L_0x03fe
                r3.mo183522e()     // Catch:{ all -> 0x0454 }
            L_0x03fe:
                r1 = 10
                r10 = r18
                if (r10 >= r1) goto L_0x0424
                if (r4 < r1) goto L_0x0424
                y22.e r1 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.util.Collection r1 = r1.getChilds()     // Catch:{ all -> 0x0454 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0454 }
            L_0x0410:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0454 }
                if (r3 == 0) goto L_0x0452
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0454 }
                boolean r4 = r3 instanceof com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                if (r4 == 0) goto L_0x0410
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r3 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r3     // Catch:{ all -> 0x0454 }
                r3.mo175553a()     // Catch:{ all -> 0x0454 }
                goto L_0x0410
            L_0x0424:
                if (r10 < r1) goto L_0x0452
                if (r4 >= r1) goto L_0x0452
                y22.e r1 = r3.f355472l     // Catch:{ all -> 0x0454 }
                java.util.Collection r1 = r1.getChilds()     // Catch:{ all -> 0x0454 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0454 }
            L_0x0432:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0454 }
                if (r3 == 0) goto L_0x0452
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0454 }
                boolean r4 = r3 instanceof com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint     // Catch:{ all -> 0x0454 }
                if (r4 == 0) goto L_0x0432
                com.tencent.mm.plugin.location.ui.impl.TrackPoint r3 = (com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint) r3     // Catch:{ all -> 0x0454 }
                android.widget.FrameLayout r4 = r3.f346477e     // Catch:{ all -> 0x0454 }
                r5 = 0
                r4.setVisibility(r5)     // Catch:{ all -> 0x0454 }
                com.tencent.mm.plugin.location_soso.ViewManager r4 = r3.f346485p     // Catch:{ all -> 0x0454 }
                if (r4 == 0) goto L_0x0432
                android.widget.FrameLayout r3 = r3.f346477e     // Catch:{ all -> 0x0454 }
                r4.toggleViewVisible(r3)     // Catch:{ all -> 0x0454 }
                goto L_0x0432
            L_0x0452:
                monitor-exit(r12)     // Catch:{ all -> 0x0454 }
                goto L_0x045a
            L_0x0454:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0454 }
                throw r0
            L_0x0457:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0457 }
                throw r0
            L_0x045a:
                x22.s r1 = r2.f346463W
                boolean r3 = r1.f355468h
                if (r3 == 0) goto L_0x049f
                te3.ii4 r0 = r0.f353984h
                te3.ii4 r3 = r1.f355471k
                if (r3 != 0) goto L_0x046d
                te3.ii4 r3 = new te3.ii4
                r3.<init>()
                r1.f355471k = r3
            L_0x046d:
                if (r0 == 0) goto L_0x049f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "set trackitem  "
                r3.append(r4)
                double r4 = r0.f354055d
                r3.append(r4)
                java.lang.String r4 = " "
                r3.append(r4)
                double r4 = r0.f354056e
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.TrackPointViewMgrImpl"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                te3.ii4 r1 = r1.f355471k
                java.lang.String r3 = r0.f354058g
                r1.f354058g = r3
                double r3 = r0.f354055d
                r1.f354055d = r3
                double r3 = r0.f354056e
                r1.f354056e = r3
            L_0x049f:
                x22.j r0 = r2.f346469p0
                r0.getClass()
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                int r1 = r6.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "MicroMsg.ShareHeaderMgr"
                java.lang.String r3 = "onRefreshMemberList, members.size=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r2)
                x22.i r1 = r0.f335374d
                r1.mo163741b(r6)
                x22.k r0 = r0.f335375e
                r0.getClass()
                java.lang.Class<d62.i> r1 = d62.C75339i.class
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                int r2 = r6.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 0
                r3[r4] = r2
                java.lang.String r2 = "MicroMsg.ShareHeaderMsgMgr"
                java.lang.String r4 = "onRefreshMemberList, size=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r3)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r6.iterator()
            L_0x04e8:
                boolean r5 = r4.hasNext()
                r7 = -1
                if (r5 == 0) goto L_0x0501
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.util.ArrayList<java.lang.String> r8 = r0.f335384c
                int r8 = r8.indexOf(r5)
                if (r8 != r7) goto L_0x04e8
                r2.add(r5)
                goto L_0x04e8
            L_0x0501:
                java.util.ArrayList<java.lang.String> r4 = r0.f335384c
                java.util.Iterator r4 = r4.iterator()
            L_0x0507:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x051d
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                int r8 = r6.indexOf(r5)
                if (r8 != r7) goto L_0x0507
                r3.add(r5)
                goto L_0x0507
            L_0x051d:
                boolean r4 = r0.f335386e
                if (r4 == 0) goto L_0x0546
                r4 = 0
                r0.f335386e = r4
                int r1 = r2.size()
                if (r1 <= 0) goto L_0x0540
                java.util.Iterator r1 = r2.iterator()
            L_0x052e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0540
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.util.ArrayList<java.lang.String> r3 = r0.f335384c
                r3.add(r2)
                goto L_0x052e
            L_0x0540:
                r4 = 0
                r0.mo163753c(r4)
                goto L_0x05c5
            L_0x0546:
                r4 = 0
                int r5 = r2.size()
                if (r5 <= 0) goto L_0x057f
                java.lang.Object r2 = r2.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                java.util.ArrayList<java.lang.String> r4 = r0.f335384c
                r4.add(r2)
                di3.d r4 = di3.C86312j.m106911c(r1)
                d62.i r4 = (d62.C75339i) r4
                java.lang.String r4 = r4.getDisplayName(r2)
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x057f
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f335394m
                r5 = 3
                r4.removeMessages(r5)
                android.os.Message r4 = android.os.Message.obtain()
                r4.what = r5
                r4.obj = r2
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f335394m
                r2.sendMessage(r4)
                r2 = 1
                r0.mo163753c(r2)
            L_0x057f:
                int r2 = r3.size()
                if (r2 <= 0) goto L_0x05c5
                r2 = 0
                java.lang.Object r2 = r3.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r3 != 0) goto L_0x05c5
                java.util.ArrayList<java.lang.String> r3 = r0.f335384c
                int r3 = r3.indexOf(r2)
                if (r3 == r7) goto L_0x05c5
                java.util.ArrayList<java.lang.String> r3 = r0.f335384c
                int r4 = r3.indexOf(r2)
                r3.remove(r4)
                di3.d r1 = di3.C86312j.m106911c(r1)
                d62.i r1 = (d62.C75339i) r1
                java.lang.String r1 = r1.getDisplayName(r2)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x05c5
                android.os.Message r1 = android.os.Message.obtain()
                r3 = 4
                r1.what = r3
                r1.obj = r2
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f335394m
                r2.sendMessage(r1)
                r1 = 1
                r0.mo163753c(r1)
            L_0x05c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI.C115532a.mo175551d(te3.eq3):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI$b */
    public class C115533b implements C118355y.C118359d {
        public C115533b() {
        }

        /* renamed from: a */
        public void mo175552a() {
            RealTimeLocationUI realTimeLocationUI = RealTimeLocationUI.this;
            Activity activity = realTimeLocationUI.f271948d;
            C77389a aVar = new C77389a();
            aVar.f225660q = C0086a.m38a(activity).getString(C0966R.string.k5w);
            aVar.f225663t = C0086a.m38a(activity).getString(C0966R.string.a18);
            aVar.f225620C = new C115574r(realTimeLocationUI);
            C77398g gVar = new C77398g(activity, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI$c */
    public class C115534c implements C92411b.C92412a {
        public C115534c() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return false;
            }
            Log.m105919d("MicroMsg.RealTimeLocationUI", "onGetLocation, latitude=%f, longtitude=%f, speed=%f", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(d));
            if ((d >= 4.0d) && !RealTimeLocationUI.this.f346463W.f355469i) {
                Log.m105918d("MicroMsg.RealTimeLocationUI", "set driving mode");
                C118812s sVar = RealTimeLocationUI.this.f346463W;
                sVar.f355474n = false;
                sVar.mo183520c(true);
                RealTimeLocationUI.this.f346455S.setSelected(false);
            }
            return true;
        }
    }

    public RealTimeLocationUI(Activity activity) {
        super(activity);
    }

    /* renamed from: C */
    public void mo129370C() {
        C118812s sVar = this.f346463W;
        if (sVar != null) {
            sVar.f355474n = false;
            sVar.mo183520c(false);
            this.f346455S.setSelected(false);
        }
    }

    /* renamed from: F */
    public void mo129373F() {
    }

    /* renamed from: I */
    public void mo175547I() {
        mo129363p();
        this.f346463W.mo183521d(false);
        this.f346465X.mo183163f();
        this.f346465X.mo183158a(3);
        this.f346468Z.mo183508c();
        this.f346465X.f353756y = this.f271953i.f271972f.getZoom();
        this.f271948d.finish();
    }

    /* renamed from: a */
    public boolean mo129355a(KeyEvent keyEvent) {
        return super.mo129355a(keyEvent);
    }

    /* renamed from: d */
    public void mo129356d() {
        C115669n.INSTANCE.mo160131h(10997, "11", 0, 0, 0);
        this.f346467Y.mo183512a();
    }

    /* renamed from: e */
    public void mo129378e(Bundle bundle) {
        super.mo129378e(bundle);
        Log.m105924i("MicroMsg.RealTimeLocationUI", "onCreate");
        this.f346456S0 = System.currentTimeMillis();
        this.f346464W0.alive();
    }

    /* renamed from: f */
    public void mo129379f() {
        super.mo129379f();
        C118355y yVar = this.f346465X;
        C118355y.C118360e eVar = this.f346458T0;
        Iterator<WeakReference<C118355y.C118360e>> it = yVar.f353742h.iterator();
        while (true) {
            if (it.hasNext()) {
                WeakReference next = it.next();
                if (next != null && next.get() != null && ((C118355y.C118360e) next.get()).equals(eVar)) {
                    yVar.f353742h.remove(next);
                    break;
                }
            } else {
                break;
            }
        }
        this.f346465X.getClass();
        this.f346464W0.dead();
        this.f346465X.f353755x = null;
        C118796l lVar = this.f346468Z;
        if (lVar != null) {
            lVar.f355426d = null;
            ((C118325m) lVar.f355441v).mo183125r(lVar);
            VolumeMeter volumeMeter = lVar.f355428f;
            volumeMeter.f346410n.removeCallbacks(volumeMeter);
            volumeMeter.f346410n.post(volumeMeter.f346402B);
        }
        C118812s sVar = this.f346463W;
        if (sVar != null) {
            synchronized (C118812s.f355460x) {
                List<ep4> list = sVar.f355462b;
                if (list != null) {
                    ((ArrayList) list).clear();
                }
                sVar.f355472l.clean();
            }
        }
        Log.m105924i("MicroMsg.RealTimeLocationUI", "onDestory");
    }

    /* renamed from: g */
    public boolean mo129380g(int i, KeyEvent keyEvent) {
        return true;
    }

    /* renamed from: h */
    public void mo129381h() {
        Log.m105924i("MicroMsg.RealTimeLocationUI", "pause");
        super.mo129381h();
        PowerManager.WakeLock wakeLock = this.f346471y0;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        C118355y yVar = this.f346465X;
        yVar.getClass();
        Log.m105918d("MicorMsg.TrackRefreshManager", "pause isShared:" + yVar.f353748q);
        if (!yVar.f353748q) {
            yVar.f353740f.mo126408b(yVar.f353736G);
            yVar.f353741g.mo183154d(yVar.f353737H);
            yVar.f353749r = true;
            yVar.f353757z = true;
        }
        C118355y yVar2 = this.f346465X;
        C118913e eVar = this.f271953i.f271972f;
        yVar2.f353751t = yVar2.f353744j;
        yVar2.f353744j = 0;
        Log.m105918d("MicorMsg.TrackRefreshManager", "saveStatus pause_save_upload_status: " + yVar2.f353751t);
        if (yVar2.mo183160c()) {
            yVar2.f353732C = (((double) eVar.getMapCenterX()) * 1.0d) / 1000000.0d;
            yVar2.f353733D = (((double) eVar.getMapCenterY()) * 1.0d) / 1000000.0d;
            yVar2.f353734E = eVar.getZoom();
        }
        C115669n.INSTANCE.mo160131h(10997, "17", 0, 0, Long.valueOf(System.currentTimeMillis() - this.f346456S0));
        this.f346456S0 = System.currentTimeMillis();
        C92411b bVar = this.f346470x0;
        if (bVar != null) {
            bVar.mo126408b(this.f346462V0);
        }
        C118812s sVar = this.f346463W;
        if (sVar != null) {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(sVar.f355482v);
            C77832s.xx0().mo183154d(sVar.f355483w);
        }
    }

    /* renamed from: i */
    public void mo129382i() {
        boolean z;
        Log.m105924i("MicroMsg.RealTimeLocationUI", "resume");
        super.mo129382i();
        PowerManager.WakeLock wakeLock = this.f346471y0;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        C118355y yVar = this.f346465X;
        yVar.getClass();
        Log.m105918d("MicorMsg.TrackRefreshManager", "resume isPuase:" + yVar.f353749r);
        if (yVar.f353749r) {
            yVar.f353730A = System.currentTimeMillis();
            yVar.f353740f.mo126412f(yVar.f353736G, true);
            yVar.f353741g.mo183152b(yVar.f353737H);
        }
        yVar.f353749r = false;
        yVar.mo183162e();
        C118355y yVar2 = this.f346465X;
        C118913e eVar = this.f271953i.f271972f;
        yVar2.f353744j = yVar2.f353751t;
        Log.m105919d("MicorMsg.TrackRefreshManager", "resumeStatus upload_status  " + yVar2.f353744j + " %f %f %d ", Double.valueOf(yVar2.f353732C), Double.valueOf(yVar2.f353733D), Integer.valueOf(yVar2.f353734E));
        if (yVar2.f353732C == -1000.0d || yVar2.f353733D == -1000.0d || yVar2.f353734E == -1) {
            z = false;
        } else {
            eVar.getIController().setCenter(yVar2.f353732C, yVar2.f353733D);
            eVar.getIController().setZoom(yVar2.f353734E);
            z = true;
        }
        if (z) {
            this.f346455S.setSelected(false);
            C118812s sVar = this.f346463W;
            sVar.f355474n = false;
            sVar.f355466f = true;
        }
        C118355y yVar3 = this.f346465X;
        C118913e eVar2 = this.f271953i.f271972f;
        if (yVar3.f353756y != -1) {
            eVar2.getIController().setZoom(yVar3.f353756y);
        }
        C92411b bVar = this.f346470x0;
        if (bVar != null) {
            bVar.mo126412f(this.f346462V0, true);
        }
        C118812s sVar2 = this.f346463W;
        if (sVar2 != null) {
            sVar2.mo183519b();
        }
    }

    /* renamed from: j */
    public void mo129357j() {
        super.mo129357j();
    }

    /* renamed from: k */
    public void mo129358k() {
    }

    /* renamed from: o */
    public int mo129362o() {
        return C0966R.C0971layout.d8u;
    }

    public void onBusinessPermissionDenied(String str) {
        if (str.equals(FirebaseAnalytics.C113379b.LOCATION)) {
            this.f346463W.mo183521d(false);
            this.f346465X.mo183163f();
            this.f346465X.mo183158a(0);
            this.f346468Z.mo183508c();
            this.f271948d.finish();
        }
    }

    public void onBusinessPermissionGranted(String str) {
        this.f271948d.recreate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02e0, code lost:
        if (r0.f346454R0.equals("fromMessage") != false) goto L_0x02e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0301  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129388z() {
        /*
            r17 = this;
            r0 = r17
            super.mo129388z()
            android.app.Activity r1 = r0.f271948d
            java.lang.String r2 = "power"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            r2 = 26
            java.lang.String r3 = "Track Lock"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)
            r0.f346471y0 = r1
            x22.u r1 = r0.f271979B
            r2 = 4
            if (r1 == 0) goto L_0x0023
            android.widget.FrameLayout r1 = r1.f301958j
            r1.setVisibility(r2)
        L_0x0023:
            r1 = 2131305897(0x7f0925a9, float:1.8229978E38)
            android.view.View r1 = r0.mo129360m(r1)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI"
            java.lang.String r6 = "initHeaderBar"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = 0
            java.lang.Object r3 = r11.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI"
            java.lang.String r5 = "initHeaderBar"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            r1 = 2131300652(0x7f09112c, float:1.821934E38)
            android.view.View r1 = r0.mo129360m(r1)
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = (com.tencent.p014mm.plugin.location.p069ui.impl.CustomIndoorPicker) r1
            r0.f346457T = r1
            com.tencent.mm.plugin.location_soso.api.SoSoMapView r1 = r0.f271961t
            y22.f r1 = r1.getViewManager()
            com.tencent.tencentmap.mapsdk.map.TencentMap r1 = r1.getTencentMap()
            r3 = 1
            if (r1 == 0) goto L_0x00a1
            com.tencent.mm.plugin.location_soso.api.SoSoMapView r4 = r0.f271961t
            r4.enableIndoorLevelPick(r10)
            r1.setIndoorEnabled(r10)
            android.content.Intent r4 = r17.mo129361n()
            java.lang.String r5 = "map_indoor_support"
            int r4 = r4.getIntExtra(r5, r10)
            if (r4 != r3) goto L_0x00a1
            r1.setIndoorEnabled(r3)
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r4 = r0.f346457T
            r5 = 0
            r4.mo175534x1(r1, r5)
        L_0x00a1:
            r1 = 2131308065(0x7f092e21, float:1.8234375E38)
            android.view.View r1 = r0.mo129360m(r1)
            com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView r1 = (com.tencent.p014mm.plugin.location.p069ui.impl.LocationCrossHairView) r1
            r0.f346455S = r1
            r1.setSelected(r3)
            com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView r1 = r0.f346455S
            com.tencent.mm.plugin.location.ui.impl.s r4 = new com.tencent.mm.plugin.location.ui.impl.s
            r4.<init>(r0)
            r1.setOnClickListener(r4)
            r1 = 2131305896(0x7f0925a8, float:1.8229976E38)
            android.view.View r1 = r0.mo129360m(r1)
            r0.f346459U = r1
            r1 = 2131313435(0x7f09431b, float:1.8245267E38)
            android.view.View r1 = r0.mo129360m(r1)
            com.tencent.mm.plugin.location.ui.ShareHeader r1 = (com.tencent.p014mm.plugin.location.p069ui.ShareHeader) r1
            r0.f346452Q0 = r1
            r1.setVisibility(r10)
            com.tencent.mm.plugin.location.ui.ShareHeader r1 = r0.f346452Q0
            android.app.Activity r4 = r0.f271948d
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r4)
            r1.setPadding(r10, r4, r10, r10)
            x22.j r1 = new x22.j
            android.app.Activity r12 = r0.f271948d
            com.tencent.mm.plugin.location.ui.ShareHeader r4 = r0.f346452Q0
            android.view.ViewGroup r13 = r4.getHeaderBar()
            android.view.View r14 = r0.f346459U
            java.lang.String r15 = r0.f271960s
            com.tencent.mm.plugin.location.ui.impl.a$$c r4 = r0.f271953i
            y22.e r4 = r4.f271972f
            r11 = r1
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r0.f346469p0 = r1
            com.tencent.mm.plugin.location.ui.impl.t r4 = new com.tencent.mm.plugin.location.ui.impl.t
            r4.<init>(r0)
            r1.f335381k = r4
            t22.y r1 = r0.f346465X
            t22.y$d r4 = r0.f346460U0
            r1.f353755x = r4
            x22.s r1 = r0.f346463W
            if (r1 != 0) goto L_0x0113
            x22.s r1 = new x22.s
            android.app.Activity r4 = r0.f271948d
            com.tencent.mm.plugin.location.ui.impl.a$$c r5 = r0.f271953i
            y22.e r5 = r5.f271972f
            r1.<init>(r4, r5, r3)
            r0.f346463W = r1
        L_0x0113:
            x22.s r1 = r0.f346463W
            r1.getClass()
            x22.s r1 = r0.f346463W
            r1.f355467g = r10
            x22.o r1 = new x22.o
            android.app.Activity r4 = r0.f271948d
            r1.<init>(r4, r0)
            r0.f346467Y = r1
            r1 = 2131312731(0x7f09405b, float:1.8243839E38)
            android.view.View r1 = r0.mo129360m(r1)
            com.tencent.mm.plugin.location.ui.TipSayingWidget r1 = (com.tencent.p014mm.plugin.location.p069ui.TipSayingWidget) r1
            r0.f346461V = r1
            r1 = 2131313456(0x7f094330, float:1.824531E38)
            android.view.View r1 = r0.mo129360m(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f346453R = r1
            r1.setVisibility(r10)
            x22.l r1 = new x22.l
            android.app.Activity r4 = r0.f271948d
            android.widget.Button r5 = r0.f346453R
            com.tencent.mm.plugin.location.ui.TipSayingWidget r6 = r0.f346461V
            r1.<init>(r4, r5, r6)
            r0.f346468Z = r1
            x22.j r4 = r0.f346469p0
            r1.f355442w = r4
            com.tencent.mm.plugin.location.ui.ShareHeader r1 = r0.f346452Q0
            com.tencent.mm.plugin.location.ui.impl.u r4 = new com.tencent.mm.plugin.location.ui.impl.u
            r4.<init>(r0)
            r1.setOnLeftClickListener(r4)
            com.tencent.mm.plugin.location.ui.ShareHeader r1 = r0.f346452Q0
            com.tencent.mm.plugin.location.ui.impl.v r4 = new com.tencent.mm.plugin.location.ui.impl.v
            r4.<init>(r0)
            r1.setOnRightClickListener(r4)
            t22.y r1 = r0.f346465X
            com.tencent.mm.plugin.location.model.LocationInfo r4 = r0.f271951g
            r1.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            r1.f353730A = r5
            java.lang.Class<ts.c> r5 = p702ts.C78085c.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ts.c r5 = (p702ts.C78085c) r5
            cc0.b r5 = r5.mo108056ms()
            r1.f353740f = r5
            cc0.b$a r6 = r1.f353736G
            r5.mo126412f(r6, r3)
            t22.p r5 = r1.f353741g
            if (r5 != 0) goto L_0x018d
            t22.p r5 = t22.C77832s.xx0()
            r1.f353741g = r5
        L_0x018d:
            t22.p r5 = r1.f353741g
            t22.p$b r6 = r1.f353737H
            r5.mo183152b(r6)
            if (r4 == 0) goto L_0x0198
            r1.f353747p = r4
        L_0x0198:
            boolean r4 = r1.f353750s
            java.lang.String r5 = " "
            java.lang.String r6 = "MicorMsg.TrackRefreshManager"
            if (r4 == 0) goto L_0x01c3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "start location "
            r4.append(r7)
            com.tencent.mm.plugin.location.model.LocationInfo r7 = r1.f353747p
            double r7 = r7.f271930e
            r4.append(r7)
            r4.append(r5)
            com.tencent.mm.plugin.location.model.LocationInfo r1 = r1.f353747p
            double r7 = r1.f271931f
            r4.append(r7)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x0221
        L_0x01c3:
            r1.f353744j = r3
            te3.ep4 r4 = new te3.ep4
            r4.<init>()
            r1.f353746o = r4
            te3.vf3 r7 = new te3.vf3
            r7.<init>()
            r4.f353979e = r7
            te3.ep4 r4 = r1.f353746o
            te3.vf3 r4 = r4.f353979e
            r7 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
            r4.f354500d = r7
            r4.f354501e = r7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "start location imp "
            r4.append(r7)
            com.tencent.mm.plugin.location.model.LocationInfo r7 = r1.f353747p
            double r7 = r7.f271930e
            r4.append(r7)
            r4.append(r5)
            com.tencent.mm.plugin.location.model.LocationInfo r5 = r1.f353747p
            double r7 = r5.f271931f
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r5 = 492(0x1ec, float:6.9E-43)
            r4.mo123455a(r5, r1)
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r5 = 490(0x1ea, float:6.87E-43)
            r4.mo123455a(r5, r1)
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r5 = 491(0x1eb, float:6.88E-43)
            r4.mo123455a(r5, r1)
            r1.f353753v = r10
            r1.f353750s = r3
        L_0x0221:
            t22.y r1 = r0.f346465X
            t22.y$e r4 = r0.f346458T0
            java.util.HashSet<java.lang.ref.WeakReference<t22.y$e>> r5 = r1.f353742h
            java.util.Iterator r5 = r5.iterator()
        L_0x022b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x024c
            java.lang.Object r7 = r5.next()
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto L_0x022b
            java.lang.Object r8 = r7.get()
            if (r8 == 0) goto L_0x022b
            java.lang.Object r7 = r7.get()
            t22.y$e r7 = (t22.C118355y.C118360e) r7
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x022b
            goto L_0x0256
        L_0x024c:
            java.util.HashSet<java.lang.ref.WeakReference<t22.y$e>> r1 = r1.f353742h
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r4)
            r1.add(r5)
        L_0x0256:
            android.app.Activity r1 = r0.f271948d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r4 = "fromWhereShare"
            java.lang.String r1 = r1.getStringExtra(r4)
            r0.f346454R0 = r1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r10] = r1
            java.lang.String r1 = "MicroMsg.RealTimeLocationUI"
            java.lang.String r5 = "fromWhere=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r5, r4)
            t22.y r4 = r0.f346465X
            boolean r4 = r4.mo183159b()
            if (r4 == 0) goto L_0x0288
            java.lang.String r2 = "has join"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            x22.s r1 = r0.f346463W
            r1.mo183521d(r3)
            x22.l r1 = r0.f346468Z
            r1.mo183509d()
            goto L_0x033a
        L_0x0288:
            java.lang.Class<bh3.k> r1 = bh3.C113177k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            bh3.k r1 = (bh3.C113177k) r1
            bh3.k$b r4 = bh3.C113177k.C113179b.LOCAION
            com.tencent.mm.plugin.location.ui.impl.q r5 = new com.tencent.mm.plugin.location.ui.impl.q
            r5.<init>(r0)
            boolean r1 = r1.mo165704UG(r4, r5)
            if (r1 != 0) goto L_0x033a
            t22.y r1 = r0.f346465X
            java.lang.String r4 = r0.f271960s
            java.lang.String r5 = r0.f346454R0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x02e3
            java.lang.String r5 = r0.f346454R0
            java.lang.String r7 = "fromBanner"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x02b5
            r2 = 0
            goto L_0x02e4
        L_0x02b5:
            java.lang.String r5 = r0.f346454R0
            java.lang.String r7 = "fromPluginLocation"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x02c0
            goto L_0x02e3
        L_0x02c0:
            java.lang.String r5 = r0.f346454R0
            java.lang.String r7 = "fromPluginTalk"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x02cc
            r2 = 2
            goto L_0x02e4
        L_0x02cc:
            java.lang.String r5 = r0.f346454R0
            java.lang.String r7 = "fromTrackButton"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x02d8
            r2 = 3
            goto L_0x02e4
        L_0x02d8:
            java.lang.String r5 = r0.f346454R0
            java.lang.String r7 = "fromMessage"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x02e3
            goto L_0x02e4
        L_0x02e3:
            r2 = 1
        L_0x02e4:
            r1.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r10] = r4
            java.lang.String r5 = "track join %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r3)
            r1.f353752u = r4
            w22.b r1 = new w22.b
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r5 = "@chatroom"
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x0301
            goto L_0x0326
        L_0x0301:
            int r5 = r3.compareTo(r4)
            if (r5 <= 0) goto L_0x0317
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            goto L_0x0326
        L_0x0317:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x0326:
            r1.<init>(r4)
            ob0.c r3 = r1.f148136e
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.vk2 r3 = (te3.C51706vk2) r3
            r3.f143543e = r2
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI.mo129388z():void");
    }
}
