package rs1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.xweb.util.WXWebReporter;
import de1.C7287o;
import di3.C86312j;
import dp1.C7435f2;
import er1.C58739j4;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13248h;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import tf0.C64916p1;

/* renamed from: rs1.g */
public final class C13238g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f37590d;

    /* renamed from: e */
    public final /* synthetic */ C13248h.C13249a f37591e;

    /* renamed from: f */
    public final /* synthetic */ C13248h.C13251c f37592f;

    /* renamed from: g */
    public final /* synthetic */ int f37593g;

    public C13238g(FinderObject finderObject, C13248h.C13249a aVar, C13248h.C13251c cVar, int i) {
        this.f37590d = finderObject;
        this.f37591e = aVar;
        this.f37592f = cVar;
        this.f37593g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f37590d.username;
        if (str != null) {
            C13248h.C13249a aVar = this.f37591e;
            C13248h.C13251c cVar = this.f37592f;
            int i = this.f37593g;
            View view2 = cVar.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            List<FinderObject> list = aVar.f37612e;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList2.add(FinderItem.Companion.mo79056a((FinderObject) it.next(), 0));
            }
            Context context = view2.getContext();
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C64916p1) C86312j.m106911c(C64916p1.class)).B40((FinderItem) it4.next()));
            }
            Intent intent = new Intent();
            long j = ((FinderItem) arrayList2.get(i)).getFeedObject().f164794id;
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            C87412m.m108593f(context, "context");
            C13442s8.C13443a.m12791e(aVar2, context, intent, j, (String) null, 0, 0, false, 0, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            C13442s8.C13443a aVar3 = aVar2;
            int i2 = i;
            int i3 = i;
            ArrayList arrayList4 = arrayList2;
            long j2 = j;
            C58739j4.f168176a.mo83701b0(i2, arrayList3, (C89349b) null, intent, (C2780c) null);
            intent.putExtra("finder_username", str);
            intent.putExtra("KEY_FINDER_SELF_FLAG", false);
            intent.putExtra("KEY_FINDER_FEEDID", j2);
            C7287o.m7447c(intent, view2, 0, false, false, (C32227p) null, 30, (Object) null);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Li0(context, intent);
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = aVar3.mo12873f(context);
            String str2 = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            FinderContact finderContact = ((FinderItem) arrayList4.get(i3)).getFinderObject().contact;
            if (finderContact != null) {
                str2 = finderContact.nickname;
            }
            jSONObject.put("finder_nickname", str2);
            jSONObject.put("click_item", 2);
            jSONObject.put("feedid", C61926c.m72691p(j2));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, "channel_profile_otherfrdfollow_authorcard", 1, jSONObject);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
