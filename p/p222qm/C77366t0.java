package p222qm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.NotifyNewFriendRequestEvent;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96931e;
import di3.C86312j;
import eb0.C97625j3;
import fd0.C75743h;
import p196ln.C76708i;
import p875ci.C67378t;

/* renamed from: qm.t0 */
public class C77366t0 extends IStaticListener<NotifyNewFriendRequestEvent> {
    public boolean callback(IEvent iEvent) {
        Notification notification;
        int i;
        String str;
        C80610p1 p1Var = C80610p1.f235824f;
        int Ow = C75743h.vx0().mo101166Ow();
        NotifyNewFriendRequestEvent.C40146a aVar = ((NotifyNewFriendRequestEvent) iEvent).f107665d;
        int i2 = aVar.f107668c;
        String str2 = aVar.f107666a;
        String c = C96931e.m124499a().mo135523c(aVar.f107667b);
        if (C80610p1.f235829n == null) {
            C80610p1.f235829n = new C67378t(MMApplicationContext.getContext());
        }
        C80610p1.f235829n.getClass();
        Notification notification2 = new Notification();
        notification2.icon = C0966R.C0969drawable.icon;
        notification2.when = System.currentTimeMillis();
        notification2.flags = 16;
        Intent intent = new Intent();
        intent.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageConversationUI");
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, intent, 134217728);
        if (i2 == 1 || i2 == 2) {
            String string = i2 == 1 ? MMApplicationContext.getContext().getString(C0966R.string.hbn) : MMApplicationContext.getContext().getString(C0966R.string.lr9);
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str2);
            String str3 = c + string;
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.hay);
            String string3 = MMApplicationContext.getContext().getString(C0966R.string.ey4);
            Intent intent2 = new Intent();
            intent2.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageTransferUI");
            intent2.putExtra("friend_message_transfer_username", str2);
            StringBuilder sb = new StringBuilder();
            sb.append("friend_message_ignore_");
            sb.append(str2);
            intent2.setAction(sb.toString());
            PendingIntent activity2 = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, intent2, 134217728);
            Intent intent3 = new Intent();
            intent3.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "subapp" + ".ui.friend.FMessageTransferUI");
            intent3.putExtra("friend_message_transfer_username", str2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("friend_message_accept_");
            sb4.append(str2);
            intent3.setAction(sb4.toString());
            PendingIntent activity3 = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, intent3, 134217728);
            ((MMNotification) C97625j3.m125816f()).getClass();
            i = 2;
            PendingIntent pendingIntent = activity2;
            str = str2;
            notification = C67845k.C67847b.f194757a.f194756a.f194754a.mo93225b(notification2, C0966R.C0969drawable.c9k, 1, activity, c, string, str3, N50, C0966R.C0969drawable.c9m, string2, pendingIntent, C0966R.C0969drawable.c9l, string3, activity3, str);
        } else {
            String string4 = MMApplicationContext.getContext().getString(C0966R.string.hbm);
            if (Ow > 2) {
                c = c + MMApplicationContext.getContext().getString(C0966R.string.hbj, new Object[]{Integer.valueOf(Ow)});
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.c9k);
            ((MMNotification) C97625j3.m125816f()).getClass();
            notification = C67845k.C67847b.f194757a.f194756a.f194754a.mo93226c(notification2, C0966R.C0969drawable.c9k, 1, activity, c, string4, c + string4, decodeResource, str2);
            str = str2;
            i = 2;
        }
        notification.priority = i;
        if (str != null) {
            C80610p1.f235827i = (str.hashCode() & 16777215) | 2130706432;
        } else {
            C80610p1.f235827i = 2130706432;
        }
        ((MMNotification) C97625j3.m125816f()).mo93215l(C80610p1.f235827i, notification, false);
        if (Ow == 0) {
            return true;
        }
        StringBuilder sb5 = C80610p1.f235828j;
        sb5.append(C80610p1.f235827i + ",");
        MMApplicationContext.getContext().getSharedPreferences("notify_newfriend_prep", 0).edit().putString("notify_newfriend_prep", sb5.toString()).commit();
        return true;
    }
}
