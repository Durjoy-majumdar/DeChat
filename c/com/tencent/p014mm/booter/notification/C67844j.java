package com.tencent.p014mm.booter.notification;

import android.app.NotificationManager;
import android.content.Context;
import com.tencent.p014mm.booter.notification.queue.NotificationQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.LinkedList;
import p789bi.C67242a;
import p789bi.C67244b;
import p918s2.C77604h;

/* renamed from: com.tencent.mm.booter.notification.j */
public class C67844j extends C67839a {

    /* renamed from: a */
    public C67840f f194754a = new C67840f();

    /* renamed from: b */
    public Context f194755b;

    public C67844j() {
        Context context = MMApplicationContext.getContext();
        this.f194755b = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public void mo93232b() {
        C77604h hVar = new C77604h(MMApplicationContext.getContext());
        LinkedList linkedList = new LinkedList();
        C67244b bVar = C67244b.C67246b.f193087a;
        bVar.getClass();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (int i = 4097; i < 4102; i++) {
            linkedList2.add(Integer.valueOf(i));
        }
        LinkedList linkedList3 = new LinkedList();
        LinkedList<NotificationItem> linkedList4 = new LinkedList<>();
        NotificationQueue notificationQueue = bVar.f193085e;
        if (notificationQueue.f194758a == null) {
            notificationQueue.mo93235a();
        }
        linkedList4.addAll(notificationQueue.f194758a);
        for (NotificationItem notificationItem : linkedList4) {
            if (notificationItem.f194735n) {
                linkedList3.add(Integer.valueOf(notificationItem.f194728d));
                Log.m105919d("MicroMsg.Notification.Queue", "remove allcustom: %d", Integer.valueOf(notificationItem.f194728d));
            }
        }
        linkedList4.clear();
        LinkedList<C67242a.C67243a> linkedList5 = new LinkedList<>();
        C67242a aVar = bVar.f193086f;
        if (aVar.f193077d == null) {
            aVar.mo91388i();
        }
        linkedList5.addAll(aVar.f193077d);
        for (C67242a.C67243a aVar2 : linkedList5) {
            if (aVar2.f193082h) {
                linkedList3.add(Integer.valueOf(aVar2.f193078d));
                Log.m105919d("MicroMsg.Notification.Queue", "remove allcustom: %d", Integer.valueOf(aVar2.f193078d));
            }
        }
        linkedList5.clear();
        linkedList2.addAll(linkedList3);
        StringBuilder sb = new StringBuilder();
        for (Integer num : linkedList2) {
            sb.append(num + ";");
            if (!linkedList.contains(num)) {
                C67244b.C67246b.f193087a.mo91393f(hVar, num.intValue());
                linkedList.add(num);
            }
        }
        Log.m105925i("MicroMsg.Notification.Handle", "needRemoveNotificationId:%s", sb);
    }
}
