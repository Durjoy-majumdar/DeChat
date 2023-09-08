package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o40.C61926c;
import pe3.C89349b;
import sx3.C36907w;
import tf0.C64916p1;

/* renamed from: qj1.zf */
public final class C12785zf implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12738xf f36600d;

    /* renamed from: e */
    public final /* synthetic */ List<FinderItem> f36601e;

    /* renamed from: f */
    public final /* synthetic */ int f36602f;

    /* renamed from: g */
    public final /* synthetic */ C89349b f36603g;

    /* renamed from: h */
    public final /* synthetic */ ViewGroup f36604h;

    /* renamed from: i */
    public final /* synthetic */ FinderItem f36605i;

    public C12785zf(C12738xf xfVar, List<? extends FinderItem> list, int i, C89349b bVar, ViewGroup viewGroup, FinderItem finderItem) {
        this.f36600d = xfVar;
        this.f36601e = list;
        this.f36602f = i;
        this.f36603g = bVar;
        this.f36604h = viewGroup;
        this.f36605i = finderItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12738xf xfVar = this.f36600d;
        List<FinderItem> list = this.f36601e;
        int i = this.f36602f;
        C89349b bVar = this.f36603g;
        ViewGroup viewGroup = this.f36604h;
        xfVar.getClass();
        Class cls = C64916p1.class;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (FinderItem B40 : list) {
            arrayList2.add(((C64916p1) C86312j.m106911c(cls)).B40(B40));
        }
        Intent intent = new Intent();
        C58739j4.f168176a.mo83701b0(i, arrayList2, bVar, intent, (C2780c) null);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        Context context = xfVar.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
        intent.putExtra("finder_username", ((C54991o) xfVar.mo87696x0(C54991o.class)).f154345o);
        intent.putExtra("KEY_FINDER_SELF_FLAG", false);
        intent.putExtra("KEY_FINDER_FEEDID", list.get(i).getFeedObject().f164794id);
        if (viewGroup != null) {
            C7287o.m7447c(intent, viewGroup, 0, false, false, (C32227p) null, 30, (Object) null);
        }
        Context context2 = xfVar.f166287d.getContext();
        C87412m.m108593f(context2, "root.context");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Li0(context2, intent);
        String p = C61926c.m72691p(this.f36605i.getFeedObject().f164794id);
        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put("feed_id", p);
        C7335d c2 = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.LIVE_END_FEED, hashMap, (String) null, 4, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, page_id = " + ((String) hashMap.get("page_id")) + ", feed_id = " + ((String) hashMap.get("feed_id")));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
