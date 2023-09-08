package com.tencent.p014mm.booter.notification;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import p285zh.C119114c;
import p789bi.C67244b;
import p875ci.C67378t;
import p918s2.C77604h;

/* renamed from: com.tencent.mm.booter.notification.a */
public class C67839a {
    /* renamed from: a */
    public int mo93224a(NotificationItem notificationItem, C67378t tVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        int i = -1;
        if (notificationItem == null) {
            return -1;
        }
        synchronized (notificationItem) {
            int i2 = notificationItem.f194728d;
            if (i2 == -1) {
                i2 = C67244b.C67246b.f193087a.mo91397k(notificationItem.f194732h, notificationItem.f194735n);
            }
            notificationItem.f194728d = i2;
            Context context = MMApplicationContext.getContext();
            if (context == null) {
                Log.m105920e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            } else if (notificationItem.f194730f == null) {
                Log.m105920e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
            } else {
                C67244b bVar = C67244b.C67246b.f193087a;
                String str2 = notificationItem.f194732h;
                bVar.getClass();
                NotificationItem notificationItem2 = null;
                if (!Util.isNullOrNil(str2)) {
                    Iterator<NotificationItem> it = bVar.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            NotificationItem next = it.next();
                            if (next != null && (str = next.f194732h) != null && str.equals(str2)) {
                                notificationItem2 = next;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                int i3 = 0;
                if (notificationItem2 != null) {
                    C67244b bVar2 = C67244b.C67246b.f193087a;
                    int i4 = notificationItem2.f194728d;
                    bVar2.getClass();
                    Log.m105919d("MicroMsg.Notification.Queue", "mark: %d", Integer.valueOf(i4));
                    bVar2.f193084d = i4;
                }
                if (!(notificationItem2 == null || (charSequence = notificationItem2.f194730f.tickerText) == null || (charSequence2 = notificationItem.f194730f.tickerText) == null || !charSequence.equals(charSequence2))) {
                    Notification notification = notificationItem.f194730f;
                    notification.tickerText = notificationItem.f194730f.tickerText + " ";
                }
                C67244b bVar3 = C67244b.C67246b.f193087a;
                NotificationItem l = bVar3.mo91398l(notificationItem);
                if (l != null) {
                    bVar3.mo91393f(new C77604h(MMApplicationContext.getContext()), l.f194728d);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    Notification notification2 = notificationItem.f194730f;
                    if (tVar != null) {
                        i3 = tVar.mo91520b() - bVar3.mo91394h();
                    }
                    notification2.number = i3;
                    notificationItem.f194737p = i3;
                } else {
                    notificationItem.f194737p = C67843i.m80204a(notificationItem.f194730f, tVar);
                }
                C119114c.m167921f("launcher");
                notificationItem.mo93218a(context);
                i = notificationItem.f194728d;
            }
        }
        return i;
    }
}
