package nu2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96081n3;
import com.tencent.p014mm.plugin.sns.p106ui.C96098o3;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTouchProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import jp2.C98963o;
import nq2.C100151a;
import zt3.C119157j;

/* renamed from: nu2.i */
public class C100209i extends C100198b {

    /* renamed from: k */
    public SnsAdTouchProgressView f293610k;

    /* renamed from: l */
    public ViewGroup f293611l;

    /* renamed from: m */
    public C96098o3 f293612m;

    /* renamed from: n */
    public SnsAdTouchProgressView.C96297b f293613n = new C100210a();

    /* renamed from: nu2.i$a */
    public class C100210a implements SnsAdTouchProgressView.C96297b {
        public C100210a() {
        }

        public void onCancel() {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        }

        public void onClick(View view) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
            try {
                Log.m105924i("LongPressAdBusiness", "SnsAdTouchProgressView onClick");
                C100209i.this.f293576c.f293368m.f280501d.performClick();
            } catch (Exception e) {
                Log.m105920e("LongPressAdBusiness", "SnsAdTouchProgressView onClick exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        }

        public void onFinish() {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
            C100209i.this.f293576c.f293355K.f293341b = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("ad_no_click_anim", true);
            C100209i.this.mo139500o(bundle);
            C100209i.this.mo139494i();
            C100209i.this.mo139493h(28);
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        }

        public void onStart() {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        }
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293610k == null) {
            this.f293610k = (SnsAdTouchProgressView) ((ViewStub) dVar.f293379x.findViewById(C0966R.C0970id.f359244jr3)).inflate();
        } else {
            Log.m105920e("LongPressAdBusiness", "buildContent many times");
        }
        if (this.f293611l == null) {
            View inflate = ((ViewStub) dVar.f293379x.findViewById(C0966R.C0970id.f5556i_)).inflate();
            this.f293611l = (ViewGroup) inflate;
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.g6s);
        } else {
            Log.m105920e("LongPressAdBusiness", "buildContent many times2");
        }
        this.f293610k.setVisibility(8);
        C96098o3 o3Var = new C96098o3(this.f293574a, this.f293610k, dVar.f293368m, this.f293582i == 0 ? 1 : 2, this.f293611l);
        this.f293612m = o3Var;
        SnsAdTouchProgressView.C96297b bVar = this.f293613n;
        SnsMethodCalculate.markStartTimeMs("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        o3Var.f280678o = bVar;
        SnsMethodCalculate.markEndTimeMs("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139490d(int r9, com.tencent.p014mm.plugin.sns.storage.SnsInfo r10, com.tencent.p014mm.plugin.sns.storage.ADXml.C95018g r11, android.view.ViewGroup.LayoutParams r12) {
        /*
            r8 = this;
            java.lang.String r0 = "onRefresh"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.mo139490d(r9, r10, r11, r12)
            com.tencent.mm.plugin.sns.ui.o3 r9 = r8.f293612m
            com.tencent.mm.plugin.sns.storage.ADXml$p r11 = r11.f275696l
            r9.getClass()
            java.lang.String r12 = "initData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r9.f280665b
            if (r3 == 0) goto L_0x0025
            long r3 = r3.field_snsId
            long r5 = r10.field_snsId
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x016d
        L_0x0025:
            r9.f280666c = r11
            r9.f280665b = r10
            java.lang.String r3 = "isValidLongPressGestureAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.lang.String r4 = "SnsAdPressGestureCtrl"
            if (r11 == 0) goto L_0x0078
            if (r10 != 0) goto L_0x0036
            goto L_0x0078
        L_0x0036:
            int r5 = r11.f275743a     // Catch:{ Exception -> 0x005a }
            if (r5 <= 0) goto L_0x0056
            int r6 = r11.f275744b     // Catch:{ Exception -> 0x005a }
            if (r6 > r5) goto L_0x003f
            goto L_0x0056
        L_0x003f:
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r10.getAdXml()     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = r5.getGestureCanvasInfo()     // Catch:{ Exception -> 0x005a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x0051
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x007b
        L_0x0051:
            r5 = 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x007c
        L_0x0056:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x007b
        L_0x005a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isValidLongPressGestureAd, exp="
            r6.append(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x007b
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
        L_0x007b:
            r5 = 0
        L_0x007c:
            r9.f280672i = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "initData, isValidGestureAd="
            r3.append(r5)
            boolean r5 = r9.f280672i
            r3.append(r5)
            java.lang.String r5 = ", snsId="
            r3.append(r5)
            long r5 = r10.field_snsId
            r3.append(r5)
            java.lang.String r10 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView r10 = r9.f280667d
            if (r10 != 0) goto L_0x00ac
            java.lang.String r9 = "initData, imLongTouchProgressView==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
            goto L_0x0170
        L_0x00ac:
            boolean r10 = r9.f280672i
            if (r10 == 0) goto L_0x015b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "initData, start="
            r10.append(r3)
            com.tencent.mm.plugin.sns.storage.ADXml$p r3 = r9.f280666c
            int r3 = r3.f275743a
            r10.append(r3)
            java.lang.String r3 = ", end="
            r10.append(r3)
            com.tencent.mm.plugin.sns.storage.ADXml$p r3 = r9.f280666c
            int r3 = r3.f275744b
            r10.append(r3)
            java.lang.String r3 = ", minimumDuration="
            r10.append(r3)
            com.tencent.mm.plugin.sns.storage.ADXml$p r3 = r9.f280666c
            int r3 = r3.f275750h
            r10.append(r3)
            java.lang.String r3 = ", pressDuration="
            r10.append(r3)
            com.tencent.mm.plugin.sns.storage.ADXml$p r3 = r9.f280666c
            int r3 = r3.f275745c
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView r10 = r9.f280667d
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$b r3 = r9.f280675l
            r10.setActionListener(r3)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView r10 = r9.f280667d
            int r3 = r11.f275750h
            r10.setPressDuration(r3)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r9.f280668e
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r10 = r10.f280504g
            r3 = 250(0xfa, float:3.5E-43)
            r10.setTimerInterval(r3)
            java.lang.String r10 = r11.f275746d
            java.lang.String r11 = "loadSpriteImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 == 0) goto L_0x0115
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            goto L_0x016d
        L_0x0115:
            java.lang.String r3 = r9.f280677n
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0136
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "loadSpriteImage, hasPreload, url="
            r9.append(r3)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            goto L_0x016d
        L_0x0136:
            r9.f280677n = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "loadSpriteImage:"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.sns.ui.p3 r3 = new com.tencent.mm.plugin.sns.ui.p3
            r3.<init>(r9, r10)
            java.lang.String r9 = "adId"
            rq2.C63489a.m74827b(r10, r9, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            goto L_0x016d
        L_0x015b:
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView r10 = r9.f280667d
            r11 = 0
            r10.setActionListener(r11)
            r9.mo133657d()
            com.tencent.mm.plugin.sns.ui.m2 r9 = r9.f280668e
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r9 = r9.f280504g
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.setTimerInterval(r10)
        L_0x016d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
        L_0x0170:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nu2.C100209i.mo139490d(int, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.ADXml$g, android.view.ViewGroup$LayoutParams):void");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        C96098o3 o3Var = this.f293612m;
        o3Var.getClass();
        SnsMethodCalculate.markStartTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        if (!o3Var.f280672i) {
            SnsMethodCalculate.markEndTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C96081n3(o3Var, j));
            SnsMethodCalculate.markEndTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    public void onVideoPause() {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.onVideoPause();
        this.f293612m.mo133657d();
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }
}
