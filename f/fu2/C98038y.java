package fu2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C96227t4;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ft2.C97979c;
import ft2.C97981f;
import ft2.c$$e;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import jp2.C98963o;
import jq3.C60905o;
import ke3.C88144b;
import l31.C99333f;
import p214om.C11502f;
import p823sg.C90193h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101804kv2;
import te3.C101833r5;
import ut2.C102107v;
import vr2.C102236a0;
import z31.C102972b;

/* renamed from: fu2.y */
public class C98038y extends C97987a {

    /* renamed from: h */
    public final C13601g f287450h;

    /* renamed from: i */
    public final C96049p0 f287451i;

    /* renamed from: j */
    public String f287452j = "";

    /* renamed from: fu2.y$a */
    public static final class C98039a extends C87413o implements C32224a<C96227t4> {

        /* renamed from: d */
        public final /* synthetic */ Context f287453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98039a(Context context) {
            super(0);
            this.f287453d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$dialogShowerMgr$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$dialogShowerMgr$2");
            Context context = this.f287453d;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C96227t4 t4Var = new C96227t4((Activity) context);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$dialogShowerMgr$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$dialogShowerMgr$2");
            return t4Var;
        }
    }

    /* renamed from: fu2.y$b */
    public static final class C98040b extends C96049p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f287454d;

        /* renamed from: e */
        public final /* synthetic */ C98038y f287455e;

        public C98040b(Context context, C98038y yVar) {
            this.f287454d = context;
            this.f287455e = yVar;
        }

        /* renamed from: a */
        public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            C87412m.m108594g(contextMenu, "menu");
            C87412m.m108594g(view, "v");
            if (view.getTag() instanceof C96235u4) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                C96235u4 u4Var = (C96235u4) tag;
                String str = u4Var.f281206a;
                C87412m.m108592e(str, "null cannot be cast to non-null type kotlin.String");
                SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
                int i = u4Var.f281207b;
                HashMap<Long, c$$e> hashMap = C97979c.f287345j;
                SnsMethodCalculate.markStartTimeMs("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                C94866e1.my0().post(new C97981f(DN, i));
                SnsMethodCalculate.markEndTimeMs("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                C97979c.m126546k(DN, u4Var.f281207b);
                C88144b.m109788f("favorite");
                if (DN != null && !DN.isAd()) {
                    contextMenu.add(0, 2, 0, this.f287454d.getString(C0966R.string.f361137hk2));
                }
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = str;
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, this.f287454d.getString(C0966R.string.a19));
                }
                NotInteresetABTestManager.m119627b(contextMenu, DN);
                MenuItem add = contextMenu.add(0, 21, 0, this.f287454d.getString(C0966R.string.jby));
                C87412m.m108593f(add, "menu.add(\n              …_image)\n                )");
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationInWindow(iArr);
                Intent intent = new Intent();
                intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                add.setIntent(intent);
                if (!((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                    contextMenu.add(0, 26, 0, this.f287454d.getString(C0966R.string.cwg));
                    C87412m.m108591d(DN);
                    TimeLineObject timeLine = DN.getTimeLine();
                    C87412m.m108593f(timeLine, "info!!.timeLine");
                    C101804kv2 kv22 = u4Var.f281207b < timeLine.ContentObj.f298427h.size() ? timeLine.ContentObj.f298427h.get(u4Var.f281207b) : new C101804kv2();
                    ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
                    chatImageWebSearchActionStruct.mo126611w("");
                    chatImageWebSearchActionStruct.mo126609u(C102236a0.m134765q0(DN.field_snsId));
                    chatImageWebSearchActionStruct.f265370f = 10;
                    chatImageWebSearchActionStruct.f265369e = 1;
                    chatImageWebSearchActionStruct.f265371g = 81;
                    chatImageWebSearchActionStruct.mo126608t("");
                    chatImageWebSearchActionStruct.mo126607s("");
                    chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22)));
                    chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
                    chatImageWebSearchActionStruct.mo86054n();
                    ((C92330r) C86312j.m106911c(C92330r.class)).Ec0(chatImageWebSearchActionStruct);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        }

        /* renamed from: b */
        public boolean mo133571b(View view) {
            SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            C87412m.m108594g(view, "view");
            if (view.getTag() instanceof C96235u4) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                String str = ((C96235u4) tag).f281206a;
                C87412m.m108592e(str, "null cannot be cast to non-null type kotlin.String");
                SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
                if (DN == null) {
                    Log.m105920e("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView error,localId:" + str);
                    SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
                    return true;
                }
                this.f287455e.mo137312e().mo133554b(view, str, DN.getTimeLine());
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98038y(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287450h = C36568h.m40985a(new C98039a(context));
        this.f287451i = new C98040b(context, this);
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        long j;
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        } else if (view == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        } else {
            SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            Object tag = view.getTag();
            if (tag instanceof C96235u4) {
                C96235u4 u4Var = (C96235u4) tag;
                u4Var.f281208c = mo137316j();
                C102107v vVar = (C102107v) C39818r.f106831a.mo62443b(mo137309b()).mo75002a(C102107v.class);
                vVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                C98963o oVar = vVar.f300669d;
                SnsMethodCalculate.markEndTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                j = oVar.mo138306m(u4Var.f281206a, 6);
            } else {
                j = 0;
            }
            SnsMethodCalculate.markStartTimeMs("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            C96227t4 t4Var = (C96227t4) ((C36570n) this.f287450h).getValue();
            SnsMethodCalculate.markEndTimeMs("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            t4Var.getClass();
            SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            t4Var.mo133893d(view, 1, 0, (C94895m2) null, j, false, 0);
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            mo137333n();
            SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            TimeLineObject G2 = c.mo137509G2();
            C101833r5 r5Var = G2.AppInfo;
            String str = r5Var == null ? null : r5Var.f299236d;
            if (!Util.isNullOrNil(str)) {
                ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93162s5((Context) null, str, ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(str, false), G2.UserName, 2, 4, 4, G2.statisticsData, 0, G2.f283893Id);
            }
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        }
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        C96049p0 p0Var = this.f287451i;
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return p0Var;
    }

    /* renamed from: i */
    public boolean mo137315i(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 2) {
            C98214b c = mo137310c();
            if (c != null) {
                ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "FavFeedCount", c.mo137504B2());
            } else {
                super.mo137315i(menuItem, i);
                SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                C102972b.f303874a.mo142713g(12076, "ClickImageFeedCount", this.f287452j);
                return false;
            }
        } else if (itemId == 21) {
            mo137333n();
        }
        super.mo137315i(menuItem, i);
        SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return false;
    }

    /* renamed from: m */
    public void mo137318m(C60905o oVar, C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "info");
        super.mo137318m(oVar, bVar);
        this.f287452j = bVar.mo137504B2();
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }

    /* renamed from: n */
    public final void mo137333n() {
        SnsMethodCalculate.markStartTimeMs("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "ClickFeedIdList", this.f287452j);
        SnsMethodCalculate.markEndTimeMs("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142713g(12076, "ClickImageFeedCount", this.f287452j);
        bVar.mo142712f(12076, "BrowseFullScreenImageTime");
    }
}
