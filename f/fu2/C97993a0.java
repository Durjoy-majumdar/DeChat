package fu2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.fake.SnsFakeVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import l31.C99333f;
import os2.C100417r0;
import pt2.C62497i;
import te3.C101779g1;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: fu2.a0 */
public final class C97993a0 extends C97987a {

    /* renamed from: h */
    public final C97994a f287393h;

    /* renamed from: fu2.a0$a */
    public static final class C97994a extends C96049p0 {

        /* renamed from: d */
        public final /* synthetic */ C97993a0 f287394d;

        /* renamed from: e */
        public final /* synthetic */ Context f287395e;

        public C97994a(C97993a0 a0Var, Context context) {
            this.f287394d = a0Var;
            this.f287395e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a5, code lost:
            if (r1 != false) goto L_0x00af;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo133570a(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
            /*
                r8 = this;
                java.lang.String r11 = "onMMCreateContextMenu"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
                java.lang.String r1 = "menu"
                gy3.C87412m.m108594g(r9, r1)
                java.lang.String r1 = "v"
                gy3.C87412m.m108594g(r10, r1)
                fu2.a0 r10 = r8.f287394d
                gu2.b r10 = r10.mo137310c()
                if (r10 != 0) goto L_0x0020
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
                return
            L_0x0020:
                r1 = 19
                android.content.Context r2 = r8.f287395e
                r3 = 2131823553(0x7f110bc1, float:1.9279909E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                r9.add(r3, r1, r3, r2)
                java.lang.Class<lc3.b> r1 = lc3.C10485b.class
                k40.a r1 = f40.C86709a0.m107533q(r1)
                lc3.b r1 = (lc3.C10485b) r1
                pj.f r1 = r1.vh0()
                java.lang.String r2 = "SIGHTCannotTransmitForFav"
                java.lang.String r1 = r1.mo107405c(r2)
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r10.mo137509G2()
                int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
                r4 = 1
                java.lang.String r5 = "MicroMsg.TimelineOnCreateContextMenuListener"
                if (r1 != 0) goto L_0x00ae
                te3.j00 r1 = r2.ContentObj
                java.util.LinkedList<te3.kv2> r1 = r1.f298427h
                int r1 = r1.size()
                if (r1 <= 0) goto L_0x00a8
                te3.j00 r1 = r2.ContentObj
                java.util.LinkedList<te3.kv2> r1 = r1.f298427h
                java.lang.Object r1 = r1.get(r3)
                te3.kv2 r1 = (te3.C101804kv2) r1
                java.lang.String r2 = r1.f298689d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
                java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r7, r2)
                r6.append(r2)
                java.lang.String r2 = vr2.C102236a0.m134729X(r1)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                java.lang.String r6 = r10.mo137503A2()
                java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120287f(r6, r1)
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                r6[r3] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
                r6[r4] = r7
                java.lang.String r7 = "config can forward sight, thumb existed %B, video existed %B"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r6)
                if (r2 == 0) goto L_0x00ae
                if (r1 == 0) goto L_0x00ae
                goto L_0x00af
            L_0x00a8:
                java.lang.String r1 = "sight item had not attch."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            L_0x00ae:
                r4 = 0
            L_0x00af:
                java.lang.String r1 = "favorite"
                ke3.C88144b.m109788f(r1)
                r1 = 10
                android.content.Context r2 = r8.f287395e
                r6 = 2131834033(0x7f1134b1, float:1.9301165E38)
                java.lang.String r2 = r2.getString(r6)
                r9.add(r3, r1, r3, r2)
                if (r4 == 0) goto L_0x0101
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "snsSightMenuListner local id:"
                r1.append(r2)
                java.lang.String r2 = r10.mo137503A2()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r1 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
                r1.<init>()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r2 = r1.f236178d
                java.lang.String r10 = r10.mo137503A2()
                r2.f236181b = r10
                r1.publish()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r10 = r1.f236179e
                boolean r10 = r10.f236182a
                if (r10 == 0) goto L_0x0101
                r10 = 18
                android.content.Context r1 = r8.f287395e
                r2 = 2131821618(0x7f110432, float:1.9275984E38)
                java.lang.String r1 = r1.getString(r2)
                r9.add(r3, r10, r3, r1)
            L_0x0101:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fu2.C97993a0.C97994a.mo133570a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
        }

        /* renamed from: b */
        public boolean mo133571b(View view) {
            SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
            C87412m.m108594g(view, "view");
            C98214b c = this.f287394d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
                return false;
            }
            this.f287394d.mo137312e().mo133554b(view, c.mo137503A2(), c.mo137509G2());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97993a0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287393h = new C97994a(this, context);
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        String str;
        View view2 = view;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        super.mo71269a(view);
        if (view2 == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        Log.m105924i("MicroMsg.Improve.VideoClick", "onsight click");
        TimeLineObject G2 = c.mo137509G2();
        LinkedList<C101804kv2> linkedList = G2.ContentObj.f298427h;
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.Improve.VideoClick", "the obj.ContentObj.MediaObjList is null");
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        C101804kv2 kv22 = G2.ContentObj.f298427h.get(0);
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
        String T = C102236a0.m134725T(kv22);
        C87412m.m108593f(T, "getSnsSightName(media)");
        String str2 = "";
        if (C86013q1.m106450k(e + T)) {
            str2 = e + T;
            str = e + C102236a0.m134729X(kv22);
        } else {
            str = str2;
        }
        if (C86013q1.m106450k(e + C102236a0.m134735b0(kv22))) {
            str2 = e + C102236a0.m134735b0(kv22);
            str = e + C102236a0.m134739d0(kv22);
        }
        int[] iArr = new int[2];
        if (C85875k4.m106208w()) {
            view2.getLocationOnScreen(iArr);
        } else {
            view2.getLocationInWindow(iArr);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        C115669n.INSTANCE.mo160131h(11444, 3);
        if (kv22.f298690e == 8) {
            Log.m105924i("MicroMsg.Improve.VideoClick", "click to play fake sns video");
            Intent intent = new Intent();
            intent.setClass(mo137309b(), SnsFakeVideoActivity.class);
            intent.putExtra("intent_video_is_preview", false);
            intent.putExtra("intent_video_sns_local_id", C100417r0.m131424m(c.mo137503A2()));
            intent.putExtra("intent_video_sns_create_time", c.getCreateTime());
            intent.putExtra("intent_left", iArr[0]);
            intent.putExtra("intent_top", iArr[1]);
            intent.putExtra("intent_width", width);
            intent.putExtra("intent_height", height);
            intent.putExtra("intent_video_thumb_path", str);
            Context b = mo137309b();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context = b;
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Log.m105924i("MicroMsg.Improve.VideoClick", "it not ad video, use online video activity to play.");
            Intent intent2 = new Intent();
            intent2.setClass(mo137309b(), SnsOnlineVideoActivity.class);
            intent2.putExtra("intent_videopath", str2);
            intent2.putExtra("intent_thumbpath", str);
            intent2.putExtra("intent_localid", c.mo137503A2());
            intent2.putExtra("intent_isad", false);
            intent2.putExtra("intent_from_scene", 0);
            intent2.putExtra("sns_video_scene", 2);
            C62497i iVar = C62497i.f177536a;
            C101779g1 g1Var = G2.actionInfo.f298580j;
            intent2.putExtra("intent_third_sdk_msg", iVar.mo87530b(g1Var.f298271d, g1Var.f298273f));
            intent2.putExtra("intent_publish_id", C102236a0.m134763p0(c.mo142401p2()));
            intent2.putExtra("intent_bottom_height", C75044y4.m89991c(mo137309b()));
            SnsTimelineVideoView b2 = C96254a.m123394d().mo133930b(G2.f283893Id);
            if (b2 != null && b2.mo132371x()) {
                intent2.putExtra("intent_fromplayingvideo", true);
                intent2.putExtra("intent_fromplayingvideo_tlobjid", G2.f283893Id);
                intent2.putExtra("intent_session_id", b2.getSessionId());
                intent2.putExtra("intent_session_timestamp", b2.getSessionTimestamp());
            }
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", width);
            intent2.putExtra("img_gallery_height", height);
            Context b3 = mo137309b();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            Context context2 = b3;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Context b4 = mo137309b();
            C87412m.m108592e(b4, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) b4).overridePendingTransition(0, 0);
            TimelineClickListener.m122978D(mo137309b(), c.mo137509G2());
        }
        mo137320n();
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        C97994a aVar = this.f287393h;
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return aVar;
    }

    /* renamed from: i */
    public boolean mo137315i(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        C87412m.m108594g(menuItem, "menuItem");
        if (menuItem.getItemId() == 18 || menuItem.getItemId() == 19) {
            mo137320n();
        } else if (menuItem.getItemId() == 10) {
            C98214b c = mo137310c();
            if (c != null) {
                ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "FavFeedCount", c.mo137504B2());
            } else {
                super.mo137315i(menuItem, i);
                SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return false;
            }
        }
        super.mo137315i(menuItem, i);
        SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return false;
    }

    /* renamed from: n */
    public final void mo137320n() {
        String str;
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        C98214b c = mo137310c();
        if (c != null) {
            String B2 = c.mo137504B2();
            C98214b c2 = mo137310c();
            Integer valueOf = c2 != null ? Integer.valueOf(c2.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 15) {
                str = "ClickSightFeedCount";
            } else if (valueOf != null && valueOf.intValue() == 5) {
                str = "ClickVideoFeedCount";
            } else {
                SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return;
            }
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, str, B2);
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "ClickFeedIdList", B2);
            ((C99333f) C86312j.m106911c(cls)).um0(12076, "BrowseFullScreenSightTime");
            SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }
}
