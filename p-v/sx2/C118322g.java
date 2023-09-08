package sx2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import dd0.C116607d;
import di3.C86312j;
import eb0.C97625j3;
import p214om.C11502f;
import p918s2.C90116e;

/* renamed from: sx2.g */
public class C118322g implements C116607d {

    /* renamed from: d */
    public String f353607d = "";

    /* renamed from: e */
    public boolean f353608e = false;

    /* renamed from: f */
    public boolean f353609f = false;

    /* renamed from: g */
    public MMHandler f353610g = new MMHandler(Looper.getMainLooper());

    /* renamed from: h */
    public Notification f353611h;

    /* renamed from: i */
    public String f353612i;

    /* renamed from: A5 */
    public void mo176184A5(String str, String str2) {
        if (!this.f353609f) {
            mo183107d();
        }
    }

    /* renamed from: C2 */
    public void mo176185C2() {
        Log.m105926v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
        mo183105b();
    }

    /* renamed from: F5 */
    public void mo176186F5() {
    }

    /* renamed from: M6 */
    public void mo176194M6(int i) {
    }

    /* renamed from: O0 */
    public void mo176197O0(int i, int i2, String str) {
    }

    /* renamed from: S5 */
    public void mo176199S5() {
    }

    /* renamed from: U0 */
    public void mo176200U0(String str) {
    }

    /* renamed from: a */
    public final boolean mo183104a() {
        if (!Util.isNullOrNil(C118318d.yx0().f353649h)) {
            return true;
        }
        Log.m105928w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
        Log.m105926v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
        mo183105b();
        return false;
    }

    /* renamed from: b */
    public void mo183105b() {
        Log.m105926v("MicroMsg.TalkRoomDisplayMgr", "yy cancelNotify");
        ((MMNotification) C97625j3.m125816f()).mo93207e(100);
    }

    /* renamed from: c */
    public final void mo183106c(String str) {
        if (mo183104a()) {
            Log.m105926v("MicroMsg.TalkRoomDisplayMgr", "yy showNotify: " + str);
            this.f353612i = str;
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(str);
            cVar.f258814z.when = 0;
            Notification b = cVar.mo124378b();
            this.f353611h = b;
            b.icon = C0966R.C0969drawable.bmf;
            b.flags = 32;
            mo183107d();
        }
    }

    /* renamed from: d */
    public final void mo183107d() {
        String str;
        if (mo183104a()) {
            if (this.f353611h == null) {
                Log.m105920e("MicroMsg.TalkRoomDisplayMgr", "yy updateNotify error no notification");
                return;
            }
            String a = C13797p.m13101a(MMApplicationContext.getContext(), C118318d.yx0().f353649h);
            if (C118318d.yx0().f353664z) {
                str = MMApplicationContext.getContext().getString(C0966R.string.jti);
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.jtf, new Object[]{Integer.valueOf(C118318d.yx0().mo183118k().size())});
            }
            Intent cg = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93154cg();
            cg.putExtra("enter_chat_usrname", C118318d.yx0().f353649h);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 100, cg, 268435456);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(this.f353612i);
            cVar.f258814z.when = 0;
            cVar.mo124383h(a);
            cVar.mo124382g(str);
            cVar.f258795g = activity;
            Notification b = cVar.mo124378b();
            this.f353611h = b;
            b.icon = C0966R.C0969drawable.bmf;
            b.flags = 32;
            ((MMNotification) C97625j3.m125816f()).mo93215l(100, this.f353611h, false);
        }
    }

    /* renamed from: d0 */
    public void mo176201d0() {
        this.f353608e = false;
    }

    /* renamed from: q1 */
    public void mo176203q1(String str, int i, int i2) {
        this.f353608e = false;
    }

    /* renamed from: r0 */
    public void mo176204r0() {
    }

    /* renamed from: v1 */
    public void mo176205v1() {
    }

    /* renamed from: z3 */
    public void mo176206z3(String str) {
        this.f353607d = str;
    }
}
