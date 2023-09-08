package eq1;

import a11.C39479c;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58745l0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Locale;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76879j;
import p240sx.C77797h;
import z04.C112551y;

/* renamed from: eq1.g */
public final class C58672g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f167968d;

    /* renamed from: e */
    public final /* synthetic */ C58666b f167969e;

    public C58672g(BaseFinderFeed baseFinderFeed, C58666b bVar) {
        this.f167968d = baseFinderFeed;
        this.f167969e = bVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f167968d.mo3513o().getMsgId());
        C58666b bVar = this.f167969e;
        BaseFinderFeed baseFinderFeed = this.f167968d;
        int itemId = menuItem.getItemId();
        bVar.getClass();
        Log.m105925i("Finder.ConvSearchFeedViewCallback", "[handleSelectedItem] index:%s", Integer.valueOf(itemId));
        if (itemId == 1) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
            if (u == null || 51 != u.f195582i || WeChatBrands.Business.Entries.SessionChannels.checkAvailable(bVar.f167947a)) {
                C115669n.INSTANCE.idkeyStat(219, 19, 1, true);
                String str = bVar.f167951e;
                Locale locale = Locale.getDefault();
                C87412m.m108593f(locale, "getDefault()");
                String lowerCase = str.toLowerCase(locale);
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                boolean h = C112551y.m153808h(lowerCase, "@chatroom", false, 2, (Object) null);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(b002);
                ((C77797h) C86312j.m106911c(C77797h.class)).Rb0(bVar.f167947a, arrayList, h, bVar.f167951e, new C58668c());
            }
        } else if (itemId == 2) {
            C58745l0.f168212a.mo83743a(baseFinderFeed, bVar.f167947a);
        } else if (itemId == 3) {
            String str2 = bVar.f167951e;
            long msgId = b002.getMsgId();
            Log.m105925i("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] msgLocalId:%s", Long.valueOf(msgId));
            if (!C72996z1.m85820U5(str2)) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str2);
                if (z1Var == null || !z1Var.mo62927s3()) {
                    if (z1Var == null) {
                        Log.m105929w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] contact is null! username:%s", str2);
                    } else {
                        Log.m105929w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] isContact not ! username:%s", str2);
                    }
                    Activity activity = bVar.f167947a;
                    C76879j.m92749t(activity, activity.getString(C0966R.string.f8161q2), bVar.f167947a.getString(C0966R.string.f8162q3), (DialogInterface.OnClickListener) null);
                    return;
                }
            } else if (((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str2) == null) {
                Log.m105929w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] member is null! username:%s", str2);
                Activity activity2 = bVar.f167947a;
                C76879j.m92749t(activity2, activity2.getString(C0966R.string.f8161q2), bVar.f167947a.getString(C0966R.string.f8162q3), (DialogInterface.OnClickListener) null);
                return;
            }
            Intent putExtra = new Intent().putExtra("Chat_User", str2).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
            C87412m.m108593f(putExtra, "Intent()\n            .pu….KMsgLocalId, msgLocalId)");
            C88144b.m109801s(bVar.f167947a, ".ui.chatting.ChattingUI", putExtra, (Bundle) null);
        }
    }
}
