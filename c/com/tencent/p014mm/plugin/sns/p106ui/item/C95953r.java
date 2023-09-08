package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import bv2.C92312b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lu2.i$$a;
import p599lr.C61381b;
import vr2.C102236a0;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.r */
public class C95953r extends BaseTimeLineItem implements C92312b {

    /* renamed from: q */
    public boolean f280177q;

    /* renamed from: r */
    public boolean f280178r = false;

    /* renamed from: s */
    public SnsInfo f280179s;

    /* renamed from: t */
    public View.OnClickListener f280180t = new i$$a(this);

    /* renamed from: u */
    public BaseTimeLineItem.BaseViewHolder f280181u;

    /* renamed from: v */
    public View f280182v = null;

    /* renamed from: w */
    public String f280183w = "";

    /* renamed from: x */
    public View f280184x = null;

    /* renamed from: y */
    public boolean f280185y = false;

    /* renamed from: z */
    public View.OnClickListener f280186z = new C95958e();

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.r$a */
    public class C95954a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280187a;

        public C95954a(C95953r rVar, SnsInfo snsInfo) {
            this.f280187a = snsInfo;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$3");
            long j = (long) this.f280187a.localid;
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$3");
            return j;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$3");
            if (z) {
                SnsInfo snsInfo = this.f280187a;
                ((C61381b) C86312j.m106911c(C61381b.class)).fd0(false, snsInfo.field_snsId, "", (long) snsInfo.localid, false);
            }
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.r$b */
    public class C95955b implements SightPlayController.C94564e {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280188a;

        /* renamed from: b */
        public final /* synthetic */ long f280189b;

        public C95955b(SnsInfo snsInfo, long j) {
            this.f280188a = snsInfo;
            this.f280189b = j;
        }

        /* renamed from: a */
        public void mo130064a(SightPlayController sightPlayController, int i) {
            BaseTimeLine baseTimeLine;
            C98963o oVar;
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
            if (i != -1) {
                SnsInfo snsInfo = this.f280188a;
                if (snsInfo == null || !snsInfo.isAd()) {
                    Log.m105920e("MicroMsg.VideoTimeLineItem", "onCompletion, !isAd,  snsId=" + C102236a0.m134765q0(this.f280189b));
                    SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
                    return;
                }
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = C95953r.this.f279906g;
                if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
                    SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
                    return;
                }
                oVar.mo138295b(this.f280189b);
                Log.m105918d("MicroMsg.VideoTimeLineItem", "onCompletion, retCode=" + i + ", snsId=" + C102236a0.m134765q0(this.f280189b));
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.r$c */
    public class C95956c implements SightPlayController.C94565f {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280191a;

        /* renamed from: b */
        public final /* synthetic */ long f280192b;

        public C95956c(SnsInfo snsInfo, long j) {
            this.f280191a = snsInfo;
            this.f280192b = j;
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
            BaseTimeLine baseTimeLine;
            C98963o oVar;
            SnsMethodCalculate.markStartTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
            SnsInfo snsInfo = this.f280191a;
            if (snsInfo == null || !snsInfo.isAd()) {
                Log.m105918d("MicroMsg.VideoTimeLineItem", "onDecodeProgress, !isAd, currentTime=" + j + ", snsId=" + C102236a0.m134765q0(this.f280192b));
                SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
                return;
            }
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = C95953r.this.f279906g;
            if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
                SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
                return;
            }
            SnsInfo snsInfo2 = this.f280191a;
            if (snsInfo2 != null) {
                oVar.mo138316w(snsInfo2.field_snsId);
                C95953r.this.f279906g.f278568b.f276699f.mo138318y(this.f280191a.field_snsId, 1000 * j);
            }
            if (!C95953r.this.f279906g.f278568b.f276699f.mo138310q(this.f280192b)) {
                int f = (int) sightPlayController.mo130046f();
                C95953r.this.f279906g.f278568b.f276699f.mo138286A(this.f280192b, Util.currentTicks());
                C95953r.this.f279906g.f278568b.f276699f.mo138288C(this.f280192b, f, true);
                C98963o oVar2 = C95953r.this.f279906g.f278568b.f276699f;
                long j2 = this.f280192b;
                oVar2.mo138298e(j2, j2);
                Log.m105918d("MicroMsg.VideoTimeLineItem", "onDecodeProgress, addPlay3s, snsId=" + C102236a0.m134765q0(this.f280192b));
            }
            Log.m105918d("MicroMsg.VideoTimeLineItem", "onDecodeProgress, currentTime=" + j + ", snsId=" + C102236a0.m134765q0(this.f280192b));
            SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.r$d */
    public class C95957d implements SnsTimelineVideoView.C96253d {
        public C95957d() {
        }

        /* renamed from: O3 */
        public void mo133426O3(String str) {
            View view;
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
            C95953r rVar = C95953r.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            String str2 = rVar.f280183w;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            Log.m105925i("MicroMsg.VideoTimeLineItem", "onDestroy UICallback %s, %s", str, str2);
            if (!Util.isNullOrNil(str)) {
                C95953r rVar2 = C95953r.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
                String str3 = rVar2.f280183w;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
                if (str.equals(str3) && (view = C95953r.this.f280184x) != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Log.m105924i("MicroMsg.VideoTimeLineItem", "onDestroy show videoStatusIv");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.r$e */
    public class C95958e implements View.OnClickListener {
        public C95958e() {
        }

        public void onClick(View view) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
            Log.m105924i("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick");
            try {
                if (C95953r.this.f279906g.f278568b.mo132093o() == 0) {
                    C95953r.this.f279906g.f278572f.f280353I.onClick(view);
                } else if (C95953r.this.f279906g.f278568b.mo132093o() == 1) {
                    C95953r.this.f279906g.f278572f.f280353I.onClick(view);
                }
                C95953r rVar = C95953r.this;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
                rVar.f280178r = true;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick, exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
        }
    }

    /* renamed from: C */
    public void mo133476C() {
        C96066m2 m2Var;
        BaseTimeLine baseTimeLine;
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105925i("MicroMsg.VideoTimeLineItem", "%s Ad Video doPause", this);
        BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f280181u;
        if (!(baseViewHolder == null || (m2Var = baseViewHolder.f279953e0) == null)) {
            m2Var.f280502e.pause();
            SnsInfo snsInfo = this.f280179s;
            SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
            if (!(snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null || snsInfo == null)) {
                oVar.mo138314u(snsInfo.field_snsId);
            }
            SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
        this.f280177q = false;
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* renamed from: D */
    public final void mo133477D(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        if (z) {
            Log.m105925i("MicroMsg.VideoTimeLineItem", "lxl setVideoStatusIvVisibility %s, but isPlaying", Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            return;
        }
        baseViewHolder.f279953e0.f280506i.setVisibility(i);
        SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* renamed from: E */
    public void mo133478E() {
        SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105924i("MicroMsg.VideoTimeLineItem", "try show play btn");
        BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f280181u;
        if (!(baseViewHolder == null || baseViewHolder.f279953e0 == null || this.f280177q)) {
            Log.m105924i("MicroMsg.VideoTimeLineItem", "show play btn");
            this.f280181u.f279953e0.f280506i.setVisibility(0);
            this.f280181u.f279953e0.f280507j.setVisibility(8);
            this.f280181u.f279953e0.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
            this.f280181u.f279953e0.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
        }
        SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105924i("MicroMsg.VideoTimeLineItem", "onUIPause");
        mo133476C();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x021e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126295e(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "play"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r1.f279956g
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139798DN(r5)
            java.lang.String r5 = "MicroMsg.VideoTimeLineItem"
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L_0x002c
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r1 = r1.f279956g
            r4[r6] = r1
            java.lang.String r1 = "play error, snsId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x002c:
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r4.getTimeLine()
            te3.j00 r9 = r8.ContentObj
            r10 = 0
            if (r9 == 0) goto L_0x0048
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            int r9 = r9.size()
            if (r9 < r7) goto L_0x0048
            te3.j00 r9 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            java.lang.Object r9 = r9.get(r6)
            te3.kv2 r9 = (te3.C101804kv2) r9
            goto L_0x0049
        L_0x0048:
            r9 = r10
        L_0x0049:
            if (r9 != 0) goto L_0x004f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x004f:
            int r11 = r9.f298690e
            r12 = 8
            if (r11 != r12) goto L_0x005e
            java.lang.String r1 = "background video no auto play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x005e:
            boolean r11 = r4.isAd()
            if (r11 == 0) goto L_0x00e0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r0
            java.lang.String r9 = "%s Ad autoPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r8)
            long r8 = r4.field_snsId
            boolean r10 = r0.f280185y
            if (r10 != 0) goto L_0x008e
            r0.f280185y = r7
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            com.tencent.mm.plugin.sns.ui.item.r$b r11 = new com.tencent.mm.plugin.sns.ui.item.r$b
            r11.<init>(r4, r8)
            r10.setOnCompletionListener(r11)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r1 = r1.f280502e
            com.tencent.mm.plugin.sns.ui.item.r$c r10 = new com.tencent.mm.plugin.sns.ui.item.r$c
            r10.<init>(r4, r8)
            r1.setOnDecodeDurationListener(r10)
            goto L_0x0094
        L_0x008e:
            java.lang.String r1 = "play, hasSetListener=true"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
        L_0x0094:
            com.tencent.mm.plugin.sns.ui.video.a r1 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r1.mo133938k()
            bv2.c r1 = bv2.C92313c.m116089a()
            r1.mo126302e(r0)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r1 = r0.f280181u
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r1 = r1.f280502e
            r1.start()
            java.lang.String r1 = "hidePlayBtn"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            java.lang.String r4 = "try hide play btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r4 = r0.f280181u
            if (r4 == 0) goto L_0x00d5
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f279953e0
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = "hide play btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r4 = r0.f280181u
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f279953e0
            android.widget.ImageView r4 = r4.f280506i
            r4.setVisibility(r12)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r4 = r0.f280181u
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r4.f280507j
            r4.setVisibility(r12)
        L_0x00d5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r0.f280177q = r7
            r0.f280178r = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x00e0:
            bv2.c r11 = bv2.C92313c.m116089a()
            r11.mo126301d()
            bv2.f r15 = new bv2.f
            r15.<init>()
            r15.f264168a = r9
            java.lang.String r9 = r1.f279956g
            r15.f264169b = r9
            long r13 = r4.field_snsId
            java.lang.String r9 = vr2.C102236a0.m134765q0(r13)
            r15.f264171d = r9
            os2.e0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r11 = r1.f279950d
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r9.mo139807TE(r11)
            if (r9 == 0) goto L_0x010d
            int r9 = r9.getCreateTime()
            r15.f264170c = r9
            goto L_0x0118
        L_0x010d:
            long r13 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r16
            int r9 = (int) r13
            r15.f264170c = r9
        L_0x0118:
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.view.View r9 = r9.f280501d
            r11 = 2131314162(0x7f0945f2, float:1.8246741E38)
            android.view.View r9 = r9.findViewById(r11)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            int r11 = r9.getChildCount()
            if (r11 <= 0) goto L_0x0132
            android.view.View r11 = r9.getChildAt(r6)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r11 = (com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView) r11
            goto L_0x0133
        L_0x0132:
            r11 = r10
        L_0x0133:
            if (r11 == 0) goto L_0x016a
            bv2.f r13 = r11.f281250J1
            if (r13 == 0) goto L_0x016a
            boolean r13 = r11.f281254N1
            if (r13 != 0) goto L_0x016a
            java.lang.String r13 = r8.f283893Id
            java.lang.String r14 = r11.f281251K1
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r14)
            if (r13 == 0) goto L_0x016a
            bv2.f r13 = r11.f281250J1
            te3.kv2 r13 = r13.f264168a
            java.lang.String r13 = r13.f298689d
            te3.kv2 r14 = r15.f264168a
            java.lang.String r14 = r14.f298689d
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r14)
            if (r13 == 0) goto L_0x016a
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r13 = r11.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r6] = r13
            java.lang.String r13 = "reuse videoview:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r9)
            goto L_0x018c
        L_0x016a:
            com.tencent.mm.plugin.sns.ui.video.a r13 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            boolean r13 = r13.mo133929a()
            if (r13 == 0) goto L_0x018e
            if (r11 == 0) goto L_0x018e
            bv2.f r13 = r11.f281250J1
            if (r13 != 0) goto L_0x018e
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r13 = r11.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r6] = r13
            java.lang.String r13 = "reuse videoview by precreate View:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r9)
        L_0x018c:
            r14 = r11
            goto L_0x01c2
        L_0x018e:
            if (r11 == 0) goto L_0x0193
            r9.removeViewAt(r6)
        L_0x0193:
            com.tencent.mm.plugin.sns.ui.video.a r5 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            android.content.Context r11 = r9.getContext()
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r5.mo133931c(r11)
            android.view.ViewParent r11 = r5.getParent()
            if (r11 == 0) goto L_0x01b3
            r5.mo133915c0()
            r5.f281255O1 = r7
            android.view.ViewParent r11 = r5.getParent()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r11.removeView(r5)
        L_0x01b3:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r13 = -1
            r11.<init>(r13, r13)
            r9.addView(r5, r11)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setThumbViewScaleType(r9)
            r14 = r5
        L_0x01c2:
            r14.setVisibility(r6)
            com.tencent.mm.pluginsdk.ui.a$e r5 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r14.setVideoScaleType(r5)
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.view.View r5 = r5.f280501d
            r9 = 2131315202(0x7f094a02, float:1.824885E38)
            android.view.View r5 = r5.findViewById(r9)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r11)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r19 = "play"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r9.mo10231a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r18 = "play"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            android.widget.ImageView r1 = r1.f280506i
            if (r1 == 0) goto L_0x0221
            r1.setVisibility(r12)
        L_0x0221:
            com.tencent.mm.plugin.sns.ui.item.r$d r1 = new com.tencent.mm.plugin.sns.ui.item.r$d
            r1.<init>()
            r14.setUICallback(r1)
            r14.setVideoCallback(r10)
            r14.setWindowType(r7)
            ds2.j r1 = ds2.C97540j.f286244a
            te3.kv2 r5 = r15.f264168a
            r1.mo136810b(r4, r5, r7)
            com.tencent.mm.plugin.sns.ui.video.a r13 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r17 = 0
            r18 = 1
            java.lang.String r1 = r8.f283893Id
            java.lang.String r16 = ""
            r19 = r1
            r13.mo133939l(r14, r15, r16, r17, r18, r19)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95953r.mo126295e(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    public Rect getDisplayRect() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        View view = this.f280182v;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, this.f280182v.getMeasuredWidth() + i, this.f280182v.getMeasuredHeight() + i2);
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            return rect;
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        this.f279904e.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.f280181u = baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3k);
            ViewStub viewStub2 = (ViewStub) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5g);
            if (!baseViewHolder.f279951d0) {
                baseViewHolder.f279953e0.f280501d = viewStub2.inflate();
                baseViewHolder.f279951d0 = true;
            }
        } else {
            baseViewHolder.f279953e0.f280501d = baseViewHolder.f279960i.findViewById(C0966R.C0970id.jua);
            baseViewHolder.f279951d0 = true;
        }
        C96066m2 m2Var = baseViewHolder.f279953e0;
        m2Var.f280505h = m2Var.f280501d.findViewById(C0966R.C0970id.b47);
        C96066m2 m2Var2 = baseViewHolder.f279953e0;
        m2Var2.f280502e = (VideoSightView) m2Var2.f280501d.findViewById(C0966R.C0970id.f39);
        baseViewHolder.f279953e0.f280502e.setMute(true);
        baseViewHolder.f279953e0.f280505h.setOnClickListener(this.f280186z);
        C96066m2 m2Var3 = baseViewHolder.f279953e0;
        m2Var3.f280506i = (ImageView) m2Var3.f280501d.findViewById(C0966R.C0970id.k17);
        C96066m2 m2Var4 = baseViewHolder.f279953e0;
        m2Var4.f280507j = (MMPinProgressBtn) m2Var4.f280501d.findViewById(C0966R.C0970id.i7j);
        C96066m2 m2Var5 = baseViewHolder.f279953e0;
        m2Var5.f280509l = (TextView) m2Var5.f280501d.findViewById(C0966R.C0970id.f357936ck1);
        C96066m2 m2Var6 = baseViewHolder.f279953e0;
        m2Var6.f280508k = (TextView) m2Var6.f280501d.findViewById(C0966R.C0970id.ckr);
        C96066m2 m2Var7 = baseViewHolder.f279953e0;
        m2Var7.f280510m = (ImageView) m2Var7.f280501d.findViewById(C0966R.C0970id.jvp);
        C86709a0.m107528h();
        if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(344065, Boolean.FALSE)).booleanValue()) {
            baseViewHolder.f279953e0.f280502e.setSightInfoView((TextView) ((ViewStub) baseViewHolder.f279953e0.f280501d.findViewById(C0966R.C0970id.jl4)).inflate());
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0777  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x082d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x082f  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r38, int r39, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r40, com.tencent.p014mm.protocal.protobuf.TimeLineObject r41, int r42, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r43) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r8 = r39
            r12 = r40
            r2 = r41
            r13 = r43
            com.tencent.mm.ui.widget.QImageView$a r3 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            java.lang.String r14 = "fillItem"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r12.f281367a
            r0.f280179s = r4
            te3.j00 r4 = r2.ContentObj
            r11 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r10 = 1
            if (r4 == 0) goto L_0x0037
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            int r4 = r4.size()
            if (r4 < r10) goto L_0x0037
            te3.j00 r4 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            java.lang.Object r4 = r4.get(r11)
            te3.kv2 r4 = (te3.C101804kv2) r4
            r9 = r4
            goto L_0x0038
        L_0x0037:
            r9 = 0
        L_0x0038:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280179s
            java.lang.String r7 = ", hash="
            java.lang.String r10 = ", snsId="
            java.lang.String r6 = "MicroMsg.VideoTimeLineItem"
            if (r4 == 0) goto L_0x006f
            boolean r4 = r4.isAd()
            if (r4 == 0) goto L_0x006f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "ad fillItem, videoItem, pos="
            r4.append(r11)
            r4.append(r8)
            r4.append(r10)
            java.lang.String r10 = r2.f283893Id
            r4.append(r10)
            r4.append(r7)
            int r7 = r37.hashCode()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            goto L_0x0096
        L_0x006f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "videoTImeline, pos="
            r4.append(r11)
            r4.append(r8)
            r4.append(r10)
            java.lang.String r10 = r2.f283893Id
            r4.append(r10)
            r4.append(r7)
            int r7 = r37.hashCode()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
        L_0x0096:
            yn2.s0 r4 = yn2.C102882s0.f303681a
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f280179s
            java.lang.String r7 = r7.getLocalid()
            boolean r4 = r4.mo142590b(r7)
            if (r4 == 0) goto L_0x0122
            android.view.View r4 = r1.f279981s0
            r10 = 2131314079(0x7f09459f, float:1.8246573E38)
            if (r4 != 0) goto L_0x00d1
            android.view.ViewStub r4 = r1.f279979r0
            android.view.View r4 = r4.inflate()
            r1.f279981s0 = r4
            android.view.View$OnClickListener r11 = r0.f280180t
            r4.setOnClickListener(r11)
            android.view.View r4 = r1.f279981s0
            android.view.View r4 = r4.findViewById(r10)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Class<lr.b> r11 = p599lr.C61381b.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            lr.b r11 = (p599lr.C61381b) r11
            com.tencent.mm.ui.MMActivity r7 = r13.f278575i
            java.lang.String r7 = r11.mo78553iZ(r7)
            r4.setText(r7)
        L_0x00d1:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r12.f281367a
            android.view.View r7 = r1.f279981s0
            android.view.View r7 = r7.findViewById(r10)
            com.tencent.mm.plugin.sns.ui.item.r$a r10 = new com.tencent.mm.plugin.sns.ui.item.r$a
            r10.<init>(r0, r4)
            zp3.C23564m.m28138h(r7, r10)
            android.view.View r4 = r1.f279981s0
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r22 = "fillItem"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r4
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r10 = 0
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r21 = "fillItem"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x016a
        L_0x0122:
            android.view.View r4 = r1.f279981s0
            if (r4 == 0) goto L_0x016a
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo10233c(r11)
            java.lang.Object[] r27 = r7.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r29 = "fillItem"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r4
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r10 = 0
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.setVisibility(r7)
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r28 = "fillItem"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x016a:
            com.tencent.mm.plugin.sns.ui.video.a r4 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r7 = r2.f283893Id
            boolean r4 = r4.mo133933f(r7)
            java.lang.String r7 = r2.f283893Id
            r0.f280183w = r7
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            android.widget.ImageView r7 = r7.f280506i
            r0.f280184x = r7
            com.tencent.mm.plugin.sns.model.o r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r10 = r12.f281391r
            if (r10 != 0) goto L_0x019c
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            r11 = 0
            r10.setOnSightCompletionAction(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            r10.setOnCompletionListener(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            r10.setOnDecodeDurationListener(r11)
        L_0x019c:
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            boolean r11 = r12.f281391r
            r10.setIsAdVideo(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.f280498a
            if (r10 == 0) goto L_0x01d8
            java.lang.String r10 = r10.f283893Id
            java.lang.String r11 = r2.f283893Id
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r11)
            if (r10 != 0) goto L_0x01d8
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.f280498a
            java.lang.String r10 = r10.f283893Id
            r19 = r14
            r14 = 0
            r11[r14] = r10
            java.lang.String r10 = "need clear sightView %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            android.app.Activity r11 = r0.f279904e
            int r11 = r11.hashCode()
            r13 = -1
            r7.mo131117g(r10, r13, r11, r14)
            goto L_0x01da
        L_0x01d8:
            r19 = r14
        L_0x01da:
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            java.lang.String r11 = r12.f281381h
            boolean r13 = r12.f281391r
            r10.mo133598a(r2, r8, r11, r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.TextView r10 = r10.f280508k
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280510m
            r10.setVisibility(r11)
            te3.j00 r10 = r2.ContentObj
            if (r10 == 0) goto L_0x083a
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            int r10 = r10.size()
            r11 = 1
            if (r10 < r11) goto L_0x083a
            long r13 = java.lang.System.nanoTime()
            boolean r10 = r7.mo131141x(r9)
            long r20 = java.lang.System.nanoTime()
            long r20 = r20 - r13
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r10)
            r17 = 0
            r14[r17] = r22
            java.lang.Long r20 = java.lang.Long.valueOf(r20)
            r14[r11] = r20
            java.lang.String r11 = "isMediaSightExist %b duration %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r14)
            r11 = 2131834031(0x7f1134af, float:1.930116E38)
            r14 = 2131756957(0x7f10079d, float:1.9144836E38)
            r13 = 5
            if (r10 != 0) goto L_0x02e6
            boolean r10 = r7.mo131140w(r9)
            if (r10 == 0) goto L_0x024a
            r10 = 8
            r0.mo133477D(r1, r10, r4)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r11 = 0
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r10.mo153891a()
            goto L_0x0374
        L_0x024a:
            boolean r10 = r12.f281391r
            if (r10 == 0) goto L_0x026f
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f281367a
            int r10 = r7.mo131133p(r10)
            if (r10 != r13) goto L_0x026f
            r7.mo131097Q(r9)
            r10 = 8
            r0.mo133477D(r1, r10, r4)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r11 = 0
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r10.mo153891a()
            goto L_0x0374
        L_0x026f:
            boolean r10 = r7.mo131137t(r9)
            if (r10 == 0) goto L_0x028e
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            r11 = 2131756959(0x7f10079f, float:1.914484E38)
            r10.setImageResource(r11)
            r10 = 0
            r0.mo133477D(r1, r10, r4)
            goto L_0x0374
        L_0x028e:
            r10 = 0
            r13 = 8
            r7.mo131098R(r9)
            r0.mo133477D(r1, r10, r4)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r10.setVisibility(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            android.graphics.drawable.Drawable r13 = kg3.C76577a.m92158i(r13, r14)
            r10.setImageDrawable(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            java.lang.String r11 = r13.getString(r11)
            r10.setContentDescription(r11)
            boolean r10 = r12.f281391r
            if (r10 != 0) goto L_0x02cf
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f281367a
            int r10 = r7.mo131135r(r10)
            r11 = 4
            if (r10 != r11) goto L_0x02d0
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.TextView r10 = r10.f280508k
            r13 = 0
            r10.setVisibility(r13)
            goto L_0x0374
        L_0x02cf:
            r11 = 4
        L_0x02d0:
            r13 = 0
            boolean r10 = r12.f281391r
            if (r10 == 0) goto L_0x0374
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f281367a
            int r10 = r7.mo131133p(r10)
            if (r10 != r11) goto L_0x0374
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.TextView r10 = r10.f280508k
            r10.setVisibility(r13)
            goto L_0x0374
        L_0x02e6:
            r13 = 0
            boolean r10 = r7.mo131143z(r9)
            if (r10 == 0) goto L_0x0314
            r0.mo133477D(r1, r13, r4)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r13 = 8
            r10.setVisibility(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            android.graphics.drawable.Drawable r13 = kg3.C76577a.m92158i(r13, r14)
            r10.setImageDrawable(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            java.lang.String r11 = r13.getString(r11)
            r10.setContentDescription(r11)
            goto L_0x036b
        L_0x0314:
            boolean r10 = r7.mo131139v(r9)
            if (r10 == 0) goto L_0x0327
            r10 = 8
            r0.mo133477D(r1, r10, r4)
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r11 = r11.f280507j
            r11.setVisibility(r10)
            goto L_0x036b
        L_0x0327:
            boolean r10 = r12.f281391r
            if (r10 == 0) goto L_0x0341
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f281367a
            int r10 = r7.mo131133p(r10)
            r13 = 5
            if (r10 > r13) goto L_0x0341
            boolean r10 = r0.f280178r
            if (r10 != 0) goto L_0x036b
            java.lang.String r10 = "fillItem, showPlayBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            r37.mo133478E()
            goto L_0x036b
        L_0x0341:
            r7.mo131098R(r9)
            r10 = 0
            r0.mo133477D(r1, r10, r4)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r13 = 8
            r10.setVisibility(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            android.graphics.drawable.Drawable r13 = kg3.C76577a.m92158i(r13, r14)
            r10.setImageDrawable(r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r13 = r0.f279904e
            java.lang.String r11 = r13.getString(r11)
            r10.setContentDescription(r11)
        L_0x036b:
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            com.tencent.mm.plugin.sight.decode.model.SightPlayController r10 = r10.f273545M
            r10.mo130049i()
        L_0x0374:
            boolean r10 = r12.f281391r
            if (r10 == 0) goto L_0x03e4
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r1.timeLineObject
            boolean r10 = vr2.C102260r.m134846O(r10)
            if (r10 == 0) goto L_0x03e4
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r0.f280179s
            if (r10 == 0) goto L_0x038b
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()
            int r10 = r10.verticalVideoDisplayType
            goto L_0x038c
        L_0x038b:
            r10 = 0
        L_0x038c:
            r11 = 1
            if (r10 != r11) goto L_0x039c
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r10 = r10.f280502e
            android.content.Context r10 = r10.getUIContext()
            android.util.Pair r10 = ad0.C91999u.m115568n(r10)
            goto L_0x03ab
        L_0x039c:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r1.timeLineObject
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r11 = r11.f280502e
            android.content.Context r11 = r11.getUIContext()
            r13 = 0
            android.util.Pair r10 = ad0.C91999u.m115566l(r10, r11, r13)
        L_0x03ab:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "isVerticalAdVideo=true, snsId="
            r11.append(r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r12.f281367a
            if (r13 != 0) goto L_0x03bd
            java.lang.String r13 = ""
            goto L_0x03c3
        L_0x03bd:
            long r13 = r13.field_snsId
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
        L_0x03c3:
            r11.append(r13)
            java.lang.String r13 = ", showW="
            r11.append(r13)
            java.lang.Object r13 = r10.first
            r11.append(r13)
            java.lang.String r13 = ", showH="
            r11.append(r13)
            java.lang.Object r13 = r10.second
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            r11 = r10
            r10 = 1
            goto L_0x03f6
        L_0x03e4:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r1.timeLineObject
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r11 = r11.f280502e
            android.content.Context r11 = r11.getUIContext()
            boolean r13 = r12.f281391r
            android.util.Pair r10 = ad0.C91999u.m115566l(r10, r11, r13)
            r11 = r10
            r10 = 0
        L_0x03f6:
            boolean r13 = r12.f281391r
            if (r13 == 0) goto L_0x0549
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r12.f281367a
            com.tencent.mm.plugin.sns.storage.ADXml r14 = r13.getAdXml()
            r18 = r11
            android.app.Activity r11 = r0.f279904e
            java.lang.String r8 = "window"
            java.lang.Object r8 = r11.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.Display r8 = r8.getDefaultDisplay()
            int r8 = r8.getWidth()
            if (r14 == 0) goto L_0x0515
            float r11 = r14.adMediaDisplayWidth
            r23 = 0
            int r24 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r24 <= 0) goto L_0x0515
            r24 = r7
            float r7 = r14.adMediaDisplayHeight
            int r7 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r7 <= 0) goto L_0x0510
            r23 = r6
            double r6 = (double) r11
            int r11 = r14.adBasicRemWidth
            r25 = r15
            int r15 = r14.adBasicRootFontSize
            r26 = r9
            r9 = 1
            float r6 = ps2.C100894u.m132234n(r6, r9, r11, r15)
            float r7 = r14.adMediaDisplayHeight
            r11 = r10
            double r9 = (double) r7
            int r7 = r14.adBasicRemWidth
            int r15 = r14.adBasicRootFontSize
            r27 = r4
            r4 = 1
            float r7 = ps2.C100894u.m132234n(r9, r4, r7, r15)
            int r4 = r14.adMediaDisplayMode
            r9 = 50
            r10 = 12
            if (r4 != 0) goto L_0x0498
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r9)
            int r4 = r8 - r4
            android.app.Activity r15 = r0.f279904e
            int r15 = kg3.C76577a.m92151b(r15, r10)
            int r4 = r4 - r15
            android.app.Activity r15 = r0.f279904e
            int r15 = kg3.C76577a.m92151b(r15, r10)
            int r4 = r4 - r15
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0488
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r9)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            float r6 = (float) r8
            float r4 = r14.adMediaDisplayHeight
            float r4 = r4 * r6
            float r7 = r14.adMediaDisplayWidth
            float r4 = r4 / r7
            int r4 = (int) r4
            float r7 = (float) r4
        L_0x0488:
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r6 = (int) r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Pair r4 = android.util.Pair.create(r4, r6)
            goto L_0x0522
        L_0x0498:
            r6 = -2
            r7 = 1
            if (r4 != r7) goto L_0x04d8
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r9)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r9)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            float r4 = (float) r8
            float r7 = r14.adMediaDisplayHeight
            float r4 = r4 * r7
            float r7 = r14.adMediaDisplayWidth
            float r4 = r4 / r7
            int r4 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.util.Pair r4 = android.util.Pair.create(r7, r4)
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r7 = r1.f279968m
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r8, r6)
            r7.setLayoutParams(r9)
            goto L_0x0522
        L_0x04d8:
            r7 = 2
            if (r4 != r7) goto L_0x0520
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r9)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            android.app.Activity r4 = r0.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            int r8 = r8 - r4
            float r4 = (float) r8
            float r7 = r14.adMediaDisplayHeight
            float r4 = r4 * r7
            float r7 = r14.adMediaDisplayWidth
            float r4 = r4 / r7
            int r4 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.util.Pair r4 = android.util.Pair.create(r7, r4)
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r7 = r1.f279968m
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r8, r6)
            r7.setLayoutParams(r9)
            goto L_0x0522
        L_0x0510:
            r27 = r4
            r23 = r6
            goto L_0x051b
        L_0x0515:
            r27 = r4
            r23 = r6
            r24 = r7
        L_0x051b:
            r26 = r9
            r11 = r10
            r25 = r15
        L_0x0520:
            r4 = r18
        L_0x0522:
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r13.getAdXml()
            boolean r6 = r6.isLandingPagesAd()
            if (r6 != 0) goto L_0x0558
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r13.getAdInfo()
            boolean r6 = r6.isWeapp()
            if (r6 == 0) goto L_0x0558
            com.tencent.mm.plugin.sns.ui.m2 r6 = r1.f279953e0
            android.widget.ImageView r6 = r6.f280510m
            r7 = 0
            r6.setVisibility(r7)
            com.tencent.mm.plugin.sns.ui.m2 r6 = r1.f279953e0
            android.widget.ImageView r6 = r6.f280510m
            r7 = 2131235646(0x7f08133e, float:1.8087492E38)
            r6.setImageResource(r7)
            goto L_0x0558
        L_0x0549:
            r27 = r4
            r23 = r6
            r24 = r7
            r26 = r9
            r18 = r11
            r25 = r15
            r11 = r10
            r4 = r18
        L_0x0558:
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r7 = r7.f280502e
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView
            if (r8 == 0) goto L_0x059b
            boolean r8 = r12.f281391r
            if (r8 != 0) goto L_0x0580
            r8 = 1
            r7.setScaleMode(r8)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r7 = r7.f280502e
            r7.setScaleType(r3)
            goto L_0x059b
        L_0x0580:
            r8 = 1
            if (r11 == 0) goto L_0x058e
            r7.setScaleMode(r8)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r7 = r7.f280502e
            r7.setScaleType(r3)
            goto L_0x059b
        L_0x058e:
            r3 = 0
            r7.setScaleMode(r3)
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r3 = r3.f280502e
            com.tencent.mm.ui.widget.QImageView$a r7 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.FIT_XY
            r3.setScaleType(r7)
        L_0x059b:
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r3 = r3.f280502e
            r3.mo130072c(r6, r4)
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r3 = r3.f280502e
            boolean r7 = r3 instanceof com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView
            if (r7 == 0) goto L_0x05b4
            if (r11 == 0) goto L_0x05b0
            r7 = 1
            r3.f273547P = r7
            goto L_0x05b4
        L_0x05b0:
            r7 = 0
            r3.setDrawWidthAndHeightFix(r7)
        L_0x05b4:
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r3 = r3.f280502e
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r29 = r7.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r31 = "fillItem"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r3
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r5 = 0
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r5 = r7.intValue()
            r3.setVisibility(r5)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r30 = "fillItem"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            android.widget.TextView r3 = r3.f280509l
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r3.width = r6
            r3.height = r4
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.widget.TextView r5 = r5.f280509l
            r5.setLayoutParams(r3)
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.view.View r5 = r5.f280501d
            r7 = 2131314162(0x7f0945f2, float:1.8246741E38)
            android.view.View r5 = r5.findViewById(r7)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            r7.width = r6
            r7.height = r4
            r5.setLayoutParams(r7)
            com.tencent.mm.plugin.sns.ui.m2 r4 = r1.f279953e0
            android.view.View r4 = r4.f280501d
            r6 = 2131315202(0x7f094a02, float:1.824885E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r3)
            r4.setLayoutParams(r6)
            k20.a r3 = new k20.a
            r3.<init>()
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r6)
            java.lang.Object[] r29 = r3.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r31 = "fillItem"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r4
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r6 = 0
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.setVisibility(r3)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem"
            java.lang.String r30 = "fillItem"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            r0.f280182v = r5
            com.tencent.mm.plugin.sns.ui.video.a r3 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r4 = r2.f283893Id
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r3 = r3.mo133930b(r4)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r2.f283893Id
            r7 = 0
            r4[r7] = r6
            r6 = 1
            r4[r6] = r3
            int r8 = r5.getChildCount()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 2
            r4[r9] = r8
            java.lang.String r8 = "lxl fill itemview check videoView reAttach, tlObjId:%s, vv:%s, count:%s"
            r9 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r4)
            int r4 = r5.getChildCount()
            if (r4 != r6) goto L_0x06bd
            android.view.View r4 = r5.getChildAt(r7)
            boolean r4 = r4 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x06bd
            r5.removeAllViews()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r8 = r2.f283893Id
            r4[r7] = r8
            java.lang.String r8 = "find thumbView thne remove it %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r4)
        L_0x06bd:
            int r4 = r5.getChildCount()
            if (r4 != r6) goto L_0x06ef
            android.view.View r4 = r5.getChildAt(r7)
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView
            if (r4 == 0) goto L_0x06ef
            android.view.View r4 = r5.getChildAt(r7)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r4 = (com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView) r4
            java.lang.String r6 = r2.f283893Id
            java.lang.String r8 = r4.f281251K1
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x06ef
            r5.removeAllViews()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = r2.f283893Id
            r6[r7] = r8
            java.lang.String r4 = r4.f281251K1
            r7 = 1
            r6[r7] = r4
            java.lang.String r4 = "find diff id then remove it %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r6)
        L_0x06ef:
            if (r3 == 0) goto L_0x0728
            int r4 = r5.getChildCount()
            if (r4 != 0) goto L_0x0728
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0759
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == r5) goto L_0x0759
            r4 = 1
            r3.f281255O1 = r4
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r3)
            r4 = 0
            r3.setVisibility(r4)
            com.tencent.mm.pluginsdk.ui.a$e r4 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r3.setVideoScaleType(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r4.<init>(r6, r6)
            r5.addView(r3, r4)
            java.lang.String r4 = "lxl reAttach succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            goto L_0x0759
        L_0x0728:
            if (r27 != 0) goto L_0x0759
            int r4 = r5.getChildCount()
            if (r4 <= 0) goto L_0x0759
            com.tencent.mm.plugin.sns.ui.video.a r4 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r6 = r2.f283893Id
            boolean r4 = r4.mo133932e(r6)
            if (r4 != 0) goto L_0x0759
            long r6 = java.lang.System.currentTimeMillis()
            r11 = 0
            r5.removeViewAt(r11)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r5[r11] = r4
            java.lang.String r4 = "lxl item remove videoview cost:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r5)
            goto L_0x075a
        L_0x0759:
            r11 = 0
        L_0x075a:
            if (r3 == 0) goto L_0x0777
            ds2.j r4 = ds2.C97540j.f286244a
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f280179s
            r9 = r26
            r10 = 1
            r4.mo136810b(r5, r9, r10)
            r3.setWindowType(r10)
            java.lang.String r4 = r1.f279956g
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r1.timeLineObject
            if (r5 != 0) goto L_0x0771
            r5 = 0
            goto L_0x0773
        L_0x0771:
            int r5 = r5.CreateTime
        L_0x0773:
            r3.mo132324P(r9, r4, r5)
            goto L_0x077a
        L_0x0777:
            r9 = r26
            r10 = 1
        L_0x077a:
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r4 = r3.f280502e
            r4.setTagObject(r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r12.f281367a
            if (r3 == 0) goto L_0x0797
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L_0x0797
            java.lang.String r3 = "isAdOnLinePlayer"
            r13 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)
            goto L_0x0799
        L_0x0797:
            r13 = r25
        L_0x0799:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r12.f281367a
            com.tencent.mm.plugin.sns.ui.m2 r4 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r4.f280502e
            r6 = -1
            android.app.Activity r4 = r0.f279904e
            int r7 = r4.hashCode()
            com.tencent.mm.storage.o3 r14 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r2 = r2.CreateTime
            r14.f284145b = r2
            boolean r15 = r12.f281391r
            r16 = 1
            r2 = r24
            r4 = r9
            r8 = r39
            r36 = r9
            r9 = r14
            r14 = 1
            r10 = r15
            r15 = 0
            r11 = r16
            r2.mo131112d0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.view.View r3 = r2.f280505h
            r3.setTag(r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            r4 = r36
            java.lang.String r3 = r4.f298689d
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r2, r3)
            java.lang.String r3 = vr2.C102236a0.m134725T(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0800
            r2 = r43
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r3 = r2.f278568b
            jp2.o r3 = r3.f276699f
            long r5 = r12.f281383j
            float r4 = r4.f298684R
            int r4 = (int) r4
            r3.mo138292G(r5, r4, r14)
            lo2.C99556n.m129942e()
            goto L_0x080e
        L_0x0800:
            r2 = r43
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r3 = r2.f278568b
            jp2.o r3 = r3.f276699f
            long r5 = r12.f281383j
            float r4 = r4.f298684R
            int r4 = (int) r4
            r3.mo138292G(r5, r4, r15)
        L_0x080e:
            boolean r3 = r12.f281391r
            if (r3 == 0) goto L_0x0820
            com.tencent.mm.plugin.sns.model.o r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r12.f281367a
            int r3 = r3.mo131133p(r4)
            r4 = 5
            if (r3 != r4) goto L_0x082f
            goto L_0x082d
        L_0x0820:
            r4 = 5
            com.tencent.mm.plugin.sns.model.o r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r12.f281367a
            int r3 = r3.mo131135r(r5)
            if (r3 != r4) goto L_0x082f
        L_0x082d:
            r11 = 1
            goto L_0x0830
        L_0x082f:
            r11 = 0
        L_0x0830:
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r3 = r2.f278568b
            jp2.o r3 = r3.f276699f
            long r4 = r12.f281383j
            r3.mo138290E(r4, r11, r14)
            goto L_0x0852
        L_0x083a:
            r2 = r43
            r24 = r7
            r13 = r15
            r14 = 1
            com.tencent.mm.plugin.sns.ui.m2 r3 = r1.f279953e0
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r3 = r3.f280502e
            android.app.Activity r4 = r0.f279904e
            int r4 = r4.hashCode()
            r5 = r39
            r6 = r24
            r7 = -1
            r6.mo131117g(r3, r7, r4, r5)
        L_0x0852:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r12.f281367a
            if (r3 == 0) goto L_0x086d
            boolean r3 = r3.isCardAd()
            if (r3 != 0) goto L_0x086d
            uo3.a r3 = r43.mo132921k()
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            android.view.View r1 = r1.f280505h
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r2.f278572f
            com.tencent.mm.plugin.sns.ui.listener.p0 r4 = r2.f280345A
            com.tencent.mm.plugin.sns.ui.listener.c r2 = r2.f280381k
            r3.mo108275j(r1, r4, r2)
        L_0x086d:
            r0.mo133391g(r12, r14)
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95953r.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105924i("MicroMsg.VideoTimeLineItem", "pause");
        mo133476C();
        mo133478E();
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    public void stop() {
        C96066m2 m2Var;
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105925i("MicroMsg.VideoTimeLineItem", "%s Ad Video stop", this);
        BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f280181u;
        if (!(baseViewHolder == null || (m2Var = baseViewHolder.f279953e0) == null)) {
            m2Var.f280502e.clear();
        }
        this.f280177q = false;
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return "VideoTimeLineItem";
    }
}
