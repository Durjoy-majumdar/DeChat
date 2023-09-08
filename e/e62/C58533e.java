package e62;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import bd2.C54451c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import p918s2.C90116e;
import vc3.C78382a;

/* renamed from: e62.e */
public final class C58533e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f167568d;

    public C58533e(String str) {
        this.f167568d = str;
    }

    public final void run() {
        ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
        Intent intent = new Intent(MMApplicationContext.getContext(), LauncherUI.class);
        intent.addFlags(268435456).addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 36, intent, 1073741824);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), C78382a.m94649a());
        cVar.mo124390o((CharSequence) null);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.f258795g = activity;
        cVar.mo124383h(MMApplicationContext.getContext().getString(C0966R.string.a0u));
        cVar.mo124382g(this.f167568d);
        Notification b = cVar.mo124378b();
        C87412m.m108593f(b, "getNotificationBuilder(M…tentText(content).build()");
        b.icon = C0966R.C0969drawable.c9k;
        b.flags |= 16;
        b.sound = RingtoneManager.getDefaultUri(2);
        ((C54451c) C86312j.m106911c(C54451c.class)).mo56287sT(48, b);
    }
}
