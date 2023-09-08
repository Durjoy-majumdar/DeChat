package com.tencent.p014mm.plugin.finder.live.multistream;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f50.C58924d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import mj1.C61487b;
import mj1.C61489c;
import mj1.C61490d;
import nj1.C61755b;
import nk1.C11193b;
import oj1.C62034b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64890zp2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048B@\u0002X\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamViewLayout;", "Landroid/widget/RelativeLayout;", "Lf50/d;", "getPlayer", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getPlayerView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "d", "Lrx3/g;", "getBgView", "()Landroid/widget/ImageView;", "bgView", "Landroid/widget/ProgressBar;", "e", "getLoadingView", "()Landroid/widget/ProgressBar;", "loadingView", "liveTxLivePlayerPreview", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getLiveTxLivePlayerPreview", "()Lcom/tencent/mm/live/core/view/LiveVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout */
public final class FinderLiveMultiStreamViewLayout extends RelativeLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f159421i = 0;

    /* renamed from: d */
    public final C13601g f159422d = C36568h.m40985a(new C61489c(this));

    /* renamed from: e */
    public final C13601g f159423e = C36568h.m40985a(new C61490d(this));

    /* renamed from: f */
    public C62034b f159424f;

    /* renamed from: g */
    public C61755b f159425g;

    /* renamed from: h */
    public C58924d f159426h;

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout$a */
    public static final class C55934a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C55934a f159427d = new C55934a();

        public C55934a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final ImageView getBgView() {
        return (ImageView) this.f159422d.getValue();
    }

    private final LiveVideoView getLiveTxLivePlayerPreview() {
        return (LiveVideoView) findViewById(C0966R.C0970id.mta);
    }

    private final ProgressBar getLoadingView() {
        return (ProgressBar) this.f159423e.getValue();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77665a(f50.C58924d r6, com.tencent.rtmp.p899ui.TXCloudVideoView r7, oj1.C62034b r8) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bindCurrentPlayer "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " currentBindData: "
            r0.append(r1)
            oj1.b r1 = r5.f159424f
            r0.append(r1)
            java.lang.String r1 = " curView: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " parent: "
            r0.append(r1)
            r1 = 0
            if (r7 == 0) goto L_0x0031
            android.view.ViewParent r2 = r7.getParent()
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MultiStreamViewLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 0
            r5.mo77668d(r0)
            if (r6 == 0) goto L_0x00f9
            if (r7 == 0) goto L_0x00f9
            java.lang.String r3 = "onPreDraw finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r5.f159424f = r8
            r5.f159426h = r6
            android.view.ViewParent r8 = r7.getParent()
            boolean r2 = r8 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x005a
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.removeView(r7)
        L_0x005f:
            boolean r8 = r1 instanceof com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout
            r2 = 2131307825(0x7f092d31, float:1.8233888E38)
            if (r8 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout r1 = (com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) r1
            com.tencent.mm.live.core.view.LiveVideoView r8 = new com.tencent.mm.live.core.view.LiveVideoView
            android.content.Context r3 = r5.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r8.<init>(r3)
            r8.setId(r2)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r1.addView(r8, r3)
        L_0x0082:
            com.tencent.mm.live.core.view.LiveVideoView r8 = r5.getLiveTxLivePlayerPreview()
            r5.removeView(r8)
            r7.setId(r2)
            r5.addView(r7)
            com.tencent.mm.live.core.view.LiveVideoView r7 = (com.tencent.p014mm.live.core.view.LiveVideoView) r7
            oj1.b r7 = r5.f159424f
            if (r7 == 0) goto L_0x00c2
            java.util.HashMap<java.lang.String, f50.d> r8 = mj1.C61487b.f174813a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "savePlayer key: "
            r8.append(r1)
            java.lang.String r1 = r7.mo86978a()
            r8.append(r1)
            java.lang.String r1 = " player: "
            r8.append(r1)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "MultiStreamPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            java.util.HashMap<java.lang.String, f50.d> r8 = mj1.C61487b.f174813a
            java.lang.String r7 = r7.mo86978a()
            r8.put(r7, r6)
        L_0x00c2:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r6.mo77630e(r7)
            cl1.o r7 = (cl1.C54991o) r7
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.f154291a1
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            r8 = 524288(0x80000, float:7.34684E-40)
            boolean r7 = o40.C61926c.m72696u(r7, r8)
            f50.d r8 = r5.f159426h
            if (r8 == 0) goto L_0x00fc
            nj1.b r1 = r5.f159425g
            r2 = 1
            if (r1 == 0) goto L_0x00e9
            boolean r1 = r1.mo86653H()
            if (r1 != r2) goto L_0x00e9
            r1 = 1
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            if (r1 != 0) goto L_0x00f4
            boolean r6 = r6.mo77644r()
            if (r6 != 0) goto L_0x00f4
            if (r7 == 0) goto L_0x00f5
        L_0x00f4:
            r0 = 1
        L_0x00f5:
            r8.setMute(r0)
            goto L_0x00fc
        L_0x00f9:
            r5.mo77667c(r8)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout.mo77665a(f50.d, com.tencent.rtmp.ui.TXCloudVideoView, oj1.b):void");
    }

    /* renamed from: b */
    public final void mo77666b(C62034b bVar) {
        String str;
        C87412m.m108594g(bVar, "data");
        Log.m105924i("MultiStreamViewLayout", "bindViewData: " + bVar);
        this.f159424f = bVar;
        mo77670f(false);
        C11193b bVar2 = C11193b.f33003a;
        String str2 = bVar.f176354a;
        C61755b bVar3 = this.f159425g;
        if (bVar3 == null || (str = bVar3.mo86662y()) == null) {
            str = "";
        }
        ImageView bgView = getBgView();
        C87412m.m108593f(bgView, "bgView");
        bVar2.mo11281b(str2, str, bgView, C55934a.f159427d);
    }

    /* renamed from: c */
    public final void mo77667c(C62034b bVar) {
        boolean z;
        C87412m.m108594g(bVar, "data");
        this.f159424f = bVar;
        HashMap<String, C58924d> hashMap = C61487b.f174813a;
        Iterator<Map.Entry<String, C58924d>> it = C61487b.f174813a.entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (!C87412m.m108589b(next.getKey(), bVar.mo86978a())) {
                ((C58924d) next.getValue()).stopPlay(false);
            }
        }
        mo77668d(true);
        C58924d dVar = this.f159426h;
        if (dVar != null && dVar.isPlaying()) {
            Log.m105924i("MultiStreamViewLayout", "onItemStartPlay: data: " + bVar.mo86978a() + " is playing");
            C58924d dVar2 = this.f159426h;
            if (dVar2 != null) {
                C61755b bVar2 = this.f159425g;
                if (bVar2 != null && bVar2.mo86653H()) {
                    z = true;
                }
                dVar2.setMute(z);
                return;
            }
            return;
        }
        Log.m105924i("MultiStreamViewLayout", "onItemStartPlay: data: " + bVar.mo86978a() + " start play");
        mo77669e();
        C58924d dVar3 = this.f159426h;
        if (dVar3 != null) {
            C61755b bVar3 = this.f159425g;
            if (bVar3 != null && bVar3.mo86653H()) {
                z = true;
            }
            dVar3.setMute(z);
        }
    }

    /* renamed from: d */
    public final void mo77668d(boolean z) {
        ImageView bgView = getBgView();
        Integer num = 0;
        num.intValue();
        Integer num2 = z ? num : null;
        int i = 8;
        bgView.setVisibility(num2 != null ? num2.intValue() : 8);
        ProgressBar loadingView = getLoadingView();
        num.intValue();
        if (!z) {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        }
        loadingView.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x017e, code lost:
        if (r2 == null) goto L_0x0180;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77669e() {
        /*
            r13 = this;
            oj1.b r0 = r13.f159424f
            if (r0 == 0) goto L_0x0189
            java.util.HashMap<java.lang.String, f50.d> r1 = mj1.C61487b.f174813a
            android.content.Context r1 = r13.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r1, r2)
            android.content.Context r2 = r13.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 != r4) goto L_0x0024
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getPlayer key: "
            r6.append(r7)
            java.lang.String r8 = r0.mo86978a()
            r6.append(r8)
            java.lang.String r8 = " player: "
            r6.append(r8)
            java.util.HashMap<java.lang.String, f50.d> r8 = mj1.C61487b.f174813a
            java.lang.String r9 = r0.mo86978a()
            java.lang.Object r9 = r8.get(r9)
            r6.append(r9)
            java.lang.String r9 = " isForceCreate: "
            r6.append(r9)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "MultiStreamPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            int r6 = g50.C59364c.m69282e(r3)
            r10 = 5
            if (r6 == r10) goto L_0x0065
            r10 = 6
            if (r6 == r10) goto L_0x0065
            r6 = 0
            goto L_0x0066
        L_0x0065:
            r6 = 2
        L_0x0066:
            g50.c r10 = new g50.c
            r10.<init>(r1, r3, r6)
            r10.enableHardwareDecode(r3)
            mj1.b$a r1 = new mj1.b$a
            r1.<init>(r10, r2, r0)
            r10.setPlayListener(r1)
            er1.j4 r1 = er1.C58739j4.f168176a
            r2 = 0
            com.tencent.rtmp.TXLivePlayConfig r1 = er1.C58739j4.m68256z(r1, r3, r5, r4, r2)
            r10.setConfig(r1)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.v1> r4 = cl1.C55004v1.class
            androidx.lifecycle.i0 r1 = r1.mo77630e(r4)
            cl1.v1 r1 = (cl1.C55004v1) r1
            r10.setRenderMode(r5)
            r10.setMute(r3)
            java.lang.String r1 = r0.mo86978a()
            java.lang.Object r1 = r8.get(r1)
            f50.d r1 = (f50.C58924d) r1
            if (r1 == 0) goto L_0x009f
            r1.stopPlay(r3)
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r4 = r0.mo86978a()
            r1.append(r4)
            java.lang.String r4 = " return player: "
            r1.append(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            java.lang.String r1 = r0.mo86978a()
            r8.put(r1, r10)
            r13.f159426h = r10
            nj1.b r1 = r13.f159425g
            if (r1 == 0) goto L_0x0189
            b50.g r1 = r1.mo86661u()
            if (r1 == 0) goto L_0x0189
            f50.d r4 = r13.f159426h
            if (r4 == 0) goto L_0x00db
            com.tencent.mm.live.core.view.LiveVideoView r6 = r13.getLiveTxLivePlayerPreview()
            r4.setPlayerView(r6)
        L_0x00db:
            f50.d r4 = r13.f159426h
            if (r4 == 0) goto L_0x0189
            te3.aq2 r6 = r0.f176355b
            java.lang.String r7 = "paramsDesc"
            gy3.C87412m.m108594g(r6, r7)
            d50.g r7 = r1.f152628b
            if (r7 == 0) goto L_0x0180
            int r1 = r1.f152631e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getMultiCdnUrl cdnQualityTag:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = ", liveInfo:"
            r8.append(r9)
            java.util.HashMap<java.lang.Integer, d50.j> r9 = r7.f166241k
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Object r9 = r9.get(r10)
            r8.append(r9)
            java.lang.String r9 = ", cdnQualitySvrcfg:"
            r8.append(r9)
            int r9 = r7.f166238h
            r8.append(r9)
            java.lang.String r9 = ",cdnCustomerSwitchCfg:"
            r8.append(r9)
            int r7 = r7.f166240j
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "LiveRoomInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            te3.zp2 r6 = r6.f182131d
            java.util.LinkedList<te3.to> r6 = r6.f186812j
            if (r6 == 0) goto L_0x015d
            java.util.Iterator r6 = r6.iterator()
        L_0x0137:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x015d
            java.lang.Object r8 = r6.next()
            te3.to r8 = (te3.C64733to) r8
            int r9 = r8.f185623f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            d50.j r10 = new d50.j
            java.lang.String r11 = r8.f185622e
            java.lang.String r12 = "it.url"
            gy3.C87412m.m108593f(r11, r12)
            int r12 = r8.f185627j
            java.lang.String r8 = r8.f185628n
            r10.<init>(r11, r12, r8)
            r7.put(r9, r10)
            goto L_0x0137
        L_0x015d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r7.get(r1)
            d50.j r1 = (d50.C7170j) r1
            if (r1 == 0) goto L_0x0170
            java.lang.String r1 = r1.f25142a
            if (r1 != 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r2 = r1
            goto L_0x017e
        L_0x0170:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r7.get(r1)
            d50.j r1 = (d50.C7170j) r1
            if (r1 == 0) goto L_0x017e
            java.lang.String r2 = r1.f25142a
        L_0x017e:
            if (r2 != 0) goto L_0x0182
        L_0x0180:
            java.lang.String r2 = ""
        L_0x0182:
            te3.aq2 r0 = r0.f176355b
            te3.zp2 r0 = r0.f182131d
            r4.mo84115f(r2, r3, r0)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout.mo77669e():void");
    }

    /* renamed from: f */
    public final void mo77670f(boolean z) {
        int i;
        C62034b bVar = this.f159424f;
        if (bVar != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Integer num = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                C64890zp2 zp22 = bVar.f176355b.f182131d;
                boolean z2 = true;
                if (zp22 != null && zp22.f186801V >= zp22.f186802W) {
                    if (((zp22 == null || zp22.f186801V == 0 || zp22.f186802W == 0) ? false : true) && getContext().getResources().getConfiguration().orientation != 2) {
                        C64890zp2 zp23 = bVar.f176355b.f182131d;
                        int i2 = zp23.f186801V;
                        int i3 = zp23.f186802W;
                        C61755b bVar2 = this.f159425g;
                        marginLayoutParams.topMargin = bVar2 != null ? bVar2.mo86654L(i2, i3) : 0;
                        if (!C85875k4.m106157N() || z) {
                            i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
                        } else {
                            C61755b bVar3 = this.f159425g;
                            if (bVar3 != null) {
                                Integer valueOf = Integer.valueOf(bVar3.mo86659l());
                                if (valueOf.intValue() <= 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    num = valueOf;
                                }
                                if (num != null) {
                                    i = num.intValue();
                                }
                            }
                            i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
                        }
                        marginLayoutParams.width = i;
                        marginLayoutParams.height = (int) (((float) i) / (((float) i2) / ((float) i3)));
                    }
                }
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
            }
            requestLayout();
        }
    }

    public final C58924d getPlayer() {
        return this.f159426h;
    }

    public final LiveVideoView getPlayerView() {
        return getLiveTxLivePlayerPreview();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
