package qj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import bl3.C39818r;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import ok1.C62042e;
import rj1.C63441b;
import rp1.C63486a;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C51059r51;
import te3.C64699s51;
import uj1.C65374a;
import xk1.C15794y1;

/* renamed from: qj1.o3 */
public final class C62911o3 extends C62660c implements C63486a {

    /* renamed from: p */
    public final C58124b f178528p;

    /* renamed from: q */
    public final String f178529q = "FinderLiveAnchorPromotionPlugin";

    /* renamed from: r */
    public final C63441b f178530r;

    /* renamed from: s */
    public final C65374a f178531s;

    /* renamed from: qj1.o3$a */
    public static final class C62912a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62911o3 f178532d;

        public C62912a(C62911o3 o3Var) {
            this.f178532d = o3Var;
        }

        public final void run() {
            this.f178532d.mo10792g(0);
            ((LiveBottomSheetPanel) ((C36570n) this.f178532d.f178531s.f188165g).getValue()).mo78804d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62911o3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178528p = bVar;
        if (C62042e.f176370a.mo87027N0() && ((C54991o) mo87696x0(C54991o.class)).f154301c3) {
            viewGroup.setElevation((float) viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.adb));
        }
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        C63441b bVar2 = new C63441b(context);
        bVar2.f179943e = this;
        this.f178530r = bVar2;
        C65374a aVar = new C65374a(viewGroup);
        aVar.mo89475e(this, bVar2.f179941c);
        this.f178531s = aVar;
    }

    /* renamed from: S0 */
    public void mo87693S0(Intent intent) {
        mo87858Z0(intent);
    }

    /* renamed from: S2 */
    public C45795b mo87856S2() {
        return mo87684A0();
    }

    /* renamed from: U */
    public void mo87857U(Context context, C51059r51 r512) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(r512, "item");
        this.f178530r.mo88311c(context, r512);
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87858Z0(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "KEY_PARAMS_DO_ACTION"
            r1 = 0
            if (r7 == 0) goto L_0x000a
            int r2 = r7.getIntExtra(r0, r1)
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            java.lang.String r3 = r6.f178529q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkAutoShow intent:"
            r4.append(r5)
            r5 = 0
            if (r7 == 0) goto L_0x0023
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0024
        L_0x0023:
            r7 = r5
        L_0x0024:
            r4.append(r7)
            java.lang.String r7 = ", doAction:"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            r7 = 5
            if (r2 != r7) goto L_0x007e
            android.view.ViewGroup r7 = r6.f166287d
            android.content.Context r7 = r7.getContext()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorSecondaryDeviceUI
            if (r7 != 0) goto L_0x004d
            android.view.ViewGroup r7 = r6.f166287d
            android.content.Context r7 = r7.getContext()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorSecondaryDeviceAffinityUI
            if (r7 == 0) goto L_0x0063
        L_0x004d:
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r6.mo87696x0(r7)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.mo75999e4()
            if (r7 != 0) goto L_0x0063
            java.lang.String r7 = r6.f178529q
            java.lang.String r0 = "secondary device ui, but has not joinLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        L_0x0063:
            r6.mo87859a1(r5)
            android.view.ViewGroup r7 = r6.f166287d
            android.content.Context r7 = r7.getContext()
            boolean r2 = r7 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0073
            r5 = r7
            android.app.Activity r5 = (android.app.Activity) r5
        L_0x0073:
            if (r5 == 0) goto L_0x007e
            android.content.Intent r7 = r5.getIntent()
            if (r7 == 0) goto L_0x007e
            r7.putExtra(r0, r1)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62911o3.mo87858Z0(android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8 A[EDGE_INSN: B:55:0x00b8->B:48:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87859a1(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0014
            java.lang.String r1 = "KEY_FINDER_NOTICE_ITEM"
            byte[] r1 = r11.getByteArray(r1)
            if (r1 == 0) goto L_0x0014
            te3.s51 r2 = new te3.s51
            r2.<init>()
            r2.parseFrom(r1)
            goto L_0x0015
        L_0x0014:
            r2 = r0
        L_0x0015:
            if (r11 == 0) goto L_0x001e
            java.lang.String r1 = "KEY_FINDER_NOTICE_DELED_ID"
            java.lang.String r11 = r11.getString(r1)
            goto L_0x001f
        L_0x001e:
            r11 = r0
        L_0x001f:
            if (r2 == 0) goto L_0x0040
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.mo87860k1(r2, r1)
            rj1.b r1 = r10.f178530r
            r1.getClass()
            fj1.b r3 = r10.mo87684A0()
            if (r3 == 0) goto L_0x0040
            dh1.b r2 = dh1.C7329b.f25441a
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            dh1.C7329b.m7473b(r2, r3, r4, r5, r6, r7, r8, r9)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            if (r1 != 0) goto L_0x00c8
            if (r11 == 0) goto L_0x00c1
            int r1 = r11.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x004f
            r1 = 1
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r11 = r0
        L_0x0054:
            if (r11 == 0) goto L_0x00c1
            uj1.a r1 = r10.f178531s
            r1.getClass()
            com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView r4 = r1.mo89473c()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x006c
            com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView r1 = r1.mo89473c()
            r1.mo3332d(r11)
        L_0x006c:
            rj1.b r1 = r10.f178530r
            java.util.LinkedList<te3.r51> r1 = r1.f179942d
            if (r1 == 0) goto L_0x00c1
            java.util.Iterator r1 = r1.iterator()
        L_0x0076:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b7
            java.lang.Object r4 = r1.next()
            r5 = r4
            te3.r51 r5 = (te3.C51059r51) r5
            int r6 = r5.f140706e
            if (r6 != r2) goto L_0x00b3
            te3.d51 r6 = new te3.d51
            r6.<init>()
            pe3.b r5 = r5.f140707f
            if (r5 == 0) goto L_0x0095
            byte[] r5 = r5.mo123703f()
            goto L_0x0096
        L_0x0095:
            r5 = r0
        L_0x0096:
            if (r5 != 0) goto L_0x0099
            goto L_0x00a9
        L_0x0099:
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x009d }
            goto L_0x00a9
        L_0x009d:
            r5 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r5
            java.lang.String r5 = "safeParser"
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r8, r7)
        L_0x00a9:
            java.lang.String r5 = r6.f132122h
            boolean r5 = gy3.C87412m.m108589b(r5, r11)
            if (r5 == 0) goto L_0x00b3
            r5 = 1
            goto L_0x00b4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            if (r5 == 0) goto L_0x0076
            goto L_0x00b8
        L_0x00b7:
            r4 = r0
        L_0x00b8:
            te3.r51 r4 = (te3.C51059r51) r4
            if (r4 == 0) goto L_0x00c1
            r10.mo87861t2(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00c1:
            if (r0 != 0) goto L_0x00c8
            rj1.b r11 = r10.f178530r
            r11.mo88312d()
        L_0x00c8:
            android.view.ViewGroup r11 = r10.f166287d
            qj1.o3$a r0 = new qj1.o3$a
            r0.<init>(r10)
            r11.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62911o3.mo87859a1(android.os.Bundle):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        boolean z = true;
        if (C54655b.f153178f1 != null) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            FinderLiveDescEditView finderLiveDescEditView = ((C15794y1) rVar.mo62443b(context).mo75002a(C15794y1.class)).f42558f;
            if (finderLiveDescEditView != null) {
                if (i != 0) {
                    z = false;
                }
                finderLiveDescEditView.setIntecerptKeyBoardEvent(z);
            }
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k1 */
    public void mo87860k1(C64699s51 s512, Boolean bool) {
        C87412m.m108594g(s512, "info");
        this.f178530r.mo88309a(s512, bool);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        boolean z;
        C65374a aVar = this.f178531s;
        if (aVar.mo89473c().getVisibility() == 0) {
            aVar.mo89473c().mo3333e();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (mo14483f0() != 0) {
            return false;
        }
        this.f178531s.mo89474d();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        Context context = this.f166287d.getContext();
        Intent intent = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            intent = activity.getIntent();
        }
        mo87858Z0(intent);
    }

    /* renamed from: t2 */
    public void mo87861t2(C51059r51 r512) {
        C87412m.m108594g(r512, "info");
        this.f178530r.mo88310b(r512);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            Context context = this.f166287d.getContext();
            Intent intent = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                intent = activity.getIntent();
            }
            mo87858Z0(intent);
        } else if (ordinal == 107) {
            mo87859a1(bundle);
        } else if (ordinal == 108) {
            this.f178531s.mo89474d();
        }
    }
}
