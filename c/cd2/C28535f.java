package cd2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ResendMsgEvent;
import com.tencent.p014mm.plugin.notification.base.AbstractSendMsgFailNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import ke3.C88144b;

/* renamed from: cd2.f */
public class C28535f extends AbstractSendMsgFailNotification<C72963f4> {

    /* renamed from: cd2.f$a */
    public class C28536a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f78380d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f78381e;

        public C28536a(C28535f fVar, long j, C72963f4 f4Var) {
            this.f78380d = j;
            this.f78381e = f4Var;
        }

        public void run() {
            Log.m105919d("MicroMsg.SendNormalMsgFailNotificaiton", "resend msgId:%d", Long.valueOf(this.f78380d));
            ResendMsgEvent resendMsgEvent = new ResendMsgEvent();
            resendMsgEvent.f78932d.f78933a = this.f78381e;
            resendMsgEvent.publish();
        }
    }

    /* renamed from: b */
    public boolean mo56026b(long j) {
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        Log.m105919d("MicroMsg.SendNormalMsgFailNotificaiton", "checkMsgIfExist, msgId:%d, msg.getMsgId:%d", Long.valueOf(j), Long.valueOf(b002.getMsgId()));
        return b002.getMsgId() != 0;
    }

    /* renamed from: e */
    public ArrayList mo56027e(Object obj) {
        C72963f4 f4Var = (C72963f4) obj;
        if (f4Var == null) {
            return null;
        }
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        ArrayList<C72963f4> NQ = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101077NQ();
        ArrayList arrayList = new ArrayList();
        Iterator<C72963f4> it = NQ.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getMsgId()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public String mo56028f(int i) {
        return this.f346879d.getString(C0966R.string.ha9, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: g */
    public long mo56029g(Object obj) {
        return ((C72963f4) obj).getMsgId();
    }

    /* renamed from: h */
    public String mo56030h(int i, int i2, int i3) {
        if (i3 <= 0) {
            return this.f346879d.getString(C0966R.string.hbr, new Object[]{Integer.valueOf(i2)});
        }
        return this.f346879d.getString(C0966R.string.hbq, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: i */
    public String mo56031i(int i, int i2, int i3) {
        return this.f346879d.getString(C0966R.string.hbu, new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3)});
    }

    /* renamed from: j */
    public String mo56032j(int i, int i2) {
        return this.f346879d.getString(C0966R.string.hbt, new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
    }

    /* renamed from: k */
    public int mo56033k() {
        return 1;
    }

    /* renamed from: m */
    public void mo56034m(ArrayList<Long> arrayList) {
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C72972g4 g4Var = (C72972g4) C97625j3.m125812b().mo105911z();
            long a = g4Var.f212775p.mo125613a();
            try {
                Iterator<Long> it = arrayList.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    C72963f4 b002 = g4Var.b00(longValue);
                    b002.mo108743W2(b002.f230723F | 32);
                    Log.m105919d("MicroMsg.MsgInfoStorage", "msgId:%d, setOmitFailResend", Long.valueOf(longValue));
                    g4Var.xy0(longValue, b002);
                }
            } finally {
                g4Var.f212775p.endTransaction(a);
            }
        } else {
            Log.m105920e("MicroMsg.SendNormalMsgFailNotificaiton", "omitAllFailMsgImpl account no initialized");
        }
    }

    /* renamed from: o */
    public void mo56035o() {
        Log.m105925i("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", Integer.valueOf(this.f346876a.mo175867e()));
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105928w("MicroMsg.SendNormalMsgFailNotificaiton", "account not ready.");
        } else if (this.f346876a.mo175867e() > 1) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            intent.putExtra("From_fail_notify", true);
            Log.m105918d("MicroMsg.SendNormalMsgFailNotificaiton", "startMainUI");
            C88144b.m109801s(this.f346879d, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
        } else if (this.f346876a.mo175867e() == 1) {
            String t = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f346876a.mo175865c(0)).mo108768t();
            Intent intent2 = new Intent();
            intent2.putExtra("Main_User", t);
            intent2.putExtra("From_fail_notify", true);
            intent2.addFlags(67108864);
            intent2.addFlags(536870912);
            C88144b.m109801s(this.f346879d, "com.tencent.mm.ui.LauncherUI", intent2, (Bundle) null);
        }
    }

    /* renamed from: u */
    public void mo56036u(long j) {
        MMHandlerThread.postToMainThread(new C28536a(this, j, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j)));
    }
}
