package cd2;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OmitAllResendSnsEvent;
import com.tencent.p014mm.autogen.events.ResendSnsEvent;
import com.tencent.p014mm.plugin.notification.base.AbstractSendMsgFailNotification;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.List;
import jr2.C99019x;
import ke3.C88144b;
import os2.C100400e0;

/* renamed from: cd2.i */
public class C28539i extends AbstractSendMsgFailNotification<C28534c> {

    /* renamed from: cd2.i$a */
    public class C28540a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f78386d;

        public C28540a(C28539i iVar, long j) {
            this.f78386d = j;
        }

        public void run() {
            Log.m105925i("MicroMsg.SendSnsFailNotification", "resend snsInfo id:%d", Long.valueOf(this.f78386d));
            ResendSnsEvent resendSnsEvent = new ResendSnsEvent();
            resendSnsEvent.f78937d.f78938a = (int) this.f78386d;
            resendSnsEvent.publish();
        }
    }

    /* renamed from: b */
    public boolean mo56026b(long j) {
        if (C99019x.m128973e() == null) {
            return false;
        }
        C100400e0 e0Var = (C100400e0) C99019x.m128973e();
        e0Var.getClass();
        SnsMethodCalculate.markStartTimeMs("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean z = e0Var.mo139800LL((int) j) != null;
        SnsMethodCalculate.markEndTimeMs("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Log.m105919d("MicroMsg.SendSnsFailNotification", "checkMsgIfExist, msgId:%d, result:%b", Long.valueOf(j), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public ArrayList mo56027e(Object obj) {
        C28534c cVar = (C28534c) obj;
        ArrayList<Long> mI = ((C100400e0) C99019x.m128973e()).mo139825mI();
        if (mI.size() == 0) {
            Log.m105920e("MicroMsg.SendSnsFailNotification", "getAllFailMsgFromDb, resendList is empty");
        }
        return mI;
    }

    /* renamed from: f */
    public String mo56028f(int i) {
        return this.f346879d.getString(C0966R.string.ha_, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: g */
    public long mo56029g(Object obj) {
        return ((C28534c) obj).f78379a;
    }

    /* renamed from: h */
    public String mo56030h(int i, int i2, int i3) {
        if (i3 <= 0) {
            return this.f346879d.getString(C0966R.string.hbs, new Object[]{Integer.valueOf(i2)});
        }
        return this.f346879d.getString(C0966R.string.haa, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: i */
    public String mo56031i(int i, int i2, int i3) {
        return this.f346879d.getString(C0966R.string.hbw, new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3)});
    }

    /* renamed from: j */
    public String mo56032j(int i, int i2) {
        return this.f346879d.getString(C0966R.string.hbv, new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
    }

    /* renamed from: k */
    public int mo56033k() {
        return 2;
    }

    /* renamed from: m */
    public void mo56034m(ArrayList<Long> arrayList) {
        OmitAllResendSnsEvent omitAllResendSnsEvent = new OmitAllResendSnsEvent();
        omitAllResendSnsEvent.f78885d.f78886a = arrayList;
        omitAllResendSnsEvent.publish();
    }

    /* renamed from: n */
    public void mo56040n() {
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105906u().mo119676J(589825, Boolean.FALSE);
        }
    }

    /* renamed from: o */
    public void mo56035o() {
        ComponentName componentName;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f346879d.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
        if (!(runningTasks == null || runningTasks.size() <= 0 || (componentName = runningTasks.get(0).topActivity) == null)) {
            String className = componentName.getClassName();
            Log.m105919d("MicroMsg.SendSnsFailNotification", "onNotificationClick, currentActivity name:%s", className);
            if (className.contains("SnsTimeLineUI")) {
                Log.m105918d("MicroMsg.SendSnsFailNotification", "onNotificationClick, already in SnsTimlineUI");
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("sns_resume_state", false);
        intent.putExtra("sns_timeline_NeedFirstLoadint", true);
        intent.putExtra("preferred_tab", 2);
        intent.putExtra("From_fail_notify", true);
        intent.putExtra("jump_sns_from_notify", true);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        C88144b.m109801s(this.f346879d, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
    }

    /* renamed from: u */
    public void mo56036u(long j) {
        MMHandlerThread.postToMainThread(new C28540a(this, j));
    }
}
