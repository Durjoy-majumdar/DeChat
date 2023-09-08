package com.tencent.p014mm.plugin.notification.base;

import android.content.Context;
import android.os.Looper;
import cd2.C0450b;
import cd2.C28541j;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotificationSendFailMsgFinishEvent;
import com.tencent.p014mm.autogen.events.UpdateFailedMsgIdEvent;
import com.tencent.p014mm.plugin.notification.p1186ui.FailSendMsgNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p918s2.C90116e;
import vc3.C78382a;

/* renamed from: com.tencent.mm.plugin.notification.base.AbstractSendMsgFailNotification */
public abstract class AbstractSendMsgFailNotification<T> {

    /* renamed from: a */
    public C115649j f346876a;

    /* renamed from: b */
    public FailSendMsgNotification f346877b;

    /* renamed from: c */
    public boolean f346878c;

    /* renamed from: d */
    public Context f346879d;

    /* renamed from: e */
    public ArrayList<Long> f346880e;

    /* renamed from: f */
    public ArrayList<Long> f346881f;

    /* renamed from: g */
    public ArrayList<Long> f346882g;

    /* renamed from: h */
    public ArrayList<MTimerHandler> f346883h;

    /* renamed from: i */
    public MTimerHandler f346884i;

    /* renamed from: j */
    public IListener f346885j;

    public AbstractSendMsgFailNotification() {
        this.f346876a = null;
        this.f346877b = null;
        this.f346878c = false;
        this.f346879d = null;
        this.f346880e = null;
        this.f346881f = null;
        this.f346882g = null;
        this.f346883h = new ArrayList<>();
        this.f346884i = null;
        this.f346885j = new IListener<UpdateFailedMsgIdEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1487136588;
            }

            public boolean callback(IEvent iEvent) {
                AbstractSendMsgFailNotification abstractSendMsgFailNotification = AbstractSendMsgFailNotification.this;
                UpdateFailedMsgIdEvent.C67806a aVar = ((UpdateFailedMsgIdEvent) iEvent).f193982d;
                long j = aVar.f193983a;
                long j2 = aVar.f193984b;
                abstractSendMsgFailNotification.getClass();
                Log.m105925i("MicroMsg.AbstractSendMsgFailNotification", "updateMsgIdInMsgList, oldMsgId:%d, newMsgId:%d", Long.valueOf(j), Long.valueOf(j2));
                if (abstractSendMsgFailNotification.f346876a.mo175864b(j)) {
                    C115649j jVar = abstractSendMsgFailNotification.f346876a;
                    int indexOf = jVar.f346897a.indexOf(Long.valueOf(j));
                    if (indexOf != -1) {
                        jVar.f346897a.set(indexOf, Long.valueOf(j2));
                    }
                }
                return false;
            }
        };
        this.f346876a = new C115649j();
        this.f346877b = new FailSendMsgNotification(mo56033k());
        this.f346878c = false;
        this.f346879d = MMApplicationContext.getContext();
        this.f346880e = new ArrayList<>();
        this.f346881f = new ArrayList<>();
        this.f346882g = new ArrayList<>();
        FailSendMsgNotification failSendMsgNotification = this.f346877b;
        failSendMsgNotification.f346903e = new C115642c(this);
        failSendMsgNotification.f346904f = new C115643d(this);
        failSendMsgNotification.f346905g = new C115644e(this);
        this.f346884i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C115645f(this), true);
    }

    /* renamed from: a */
    public void mo175846a() {
        String str;
        C115649j jVar = this.f346876a;
        if (jVar == null || jVar.mo175867e() == 0) {
            Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "autoResumeFromCrash");
            int k = mo56033k();
            C0450b.C0451a aVar = null;
            if (k == 1) {
                str = C0450b.m384a() + "/" + "normalMsg";
            } else if (k == 2) {
                str = C0450b.m384a() + "/" + "snsMsg";
            } else {
                str = null;
            }
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.FailMsgFileCache", "extractFromDisk error, cannot find filename");
            } else {
                Log.m105919d("MicroMsg.FailMsgFileCache", "extractFromDisk, filename:%s", str);
                try {
                    String N = C86013q1.m106432N(str);
                    Log.m105919d("MicroMsg.FailMsgFileCache", "extractFromDisk, cacheContent:%s", N);
                    C0450b.C0451a aVar2 = new C0450b.C0451a();
                    aVar2.mo491a(N);
                    aVar = aVar2;
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.FailMsgFileCache", e, "", new Object[0]);
                    Log.m105919d("MicroMsg.FailMsgFileCache", "extractFromDisk error:%s", e.toString());
                }
            }
            if (aVar == null) {
                Log.m105920e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
                return;
            }
            if (this.f346884i == null) {
                this.f346884i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C115645f(this), true);
            }
            C115649j jVar2 = aVar.f1076a;
            ArrayList<Long> arrayList = aVar.f1078c;
            ArrayList<Long> arrayList2 = aVar.f1079d;
            int i = aVar.f1077b;
            if (arrayList.size() == 0 && arrayList2.size() == 0 && i == 0) {
                Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, not start resend");
                C115649j jVar3 = this.f346876a;
                jVar3.f346897a.clear();
                jVar3.f346898b = 0;
                this.f346876a = jVar2;
                this.f346880e.clear();
                this.f346881f.clear();
                mo175856w();
            } else if (arrayList.size() + arrayList2.size() >= jVar2.mo175867e()) {
                Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, resendFinish");
                mo175854t();
            } else {
                Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, currently resending");
                C115649j jVar4 = this.f346876a;
                jVar4.f346897a.clear();
                jVar4.f346898b = 0;
                this.f346876a = jVar2;
                jVar2.f346898b = i;
                this.f346880e.clear();
                this.f346880e.addAll(arrayList);
                this.f346881f.clear();
                this.f346881f.addAll(arrayList2);
                mo175858y();
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo56026b(long j);

    /* renamed from: c */
    public String mo175847c() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < this.f346876a.mo175867e(); i++) {
            long c = this.f346876a.mo175865c(i);
            sb.append(c + ", ");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void mo175848d() {
        String str;
        C115649j jVar = this.f346876a;
        int i = jVar.f346898b;
        ArrayList<Long> arrayList = this.f346880e;
        ArrayList<Long> arrayList2 = this.f346881f;
        new C115649j();
        new ArrayList();
        new ArrayList();
        int k = mo56033k();
        String str2 = null;
        if (k == 1) {
            str = C0450b.m384a() + "/" + "normalMsg";
        } else if (k == 2) {
            str = C0450b.m384a() + "/" + "snsMsg";
        } else {
            str = null;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FailMsgFileCache", "flushToDisk error, cannot find filename");
            return;
        }
        Log.m105919d("MicroMsg.FailMsgFileCache", "flushToDisk, filename:%s", str);
        Log.m105918d("MicroMsg.FailMsgFileCache", "CacheObj, serializeToString");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < jVar.mo175867e(); i2++) {
                jSONArray.put(jVar.mo175865c(i2));
            }
            Log.m105919d("MicroMsg.FailMsgFileCache", "serializeToString, msgArray.size:%d", Integer.valueOf(jSONArray.length()));
            jSONObject.put("msg_list", jSONArray);
            Log.m105919d("MicroMsg.FailMsgFileCache", "serializeToString, currentSendIndex:%d", Integer.valueOf(i));
            jSONObject.put("current_send_index", i);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            Log.m105919d("MicroMsg.FailMsgFileCache", "serializeToString, successArray.size:%d", Integer.valueOf(jSONArray2.length()));
            jSONObject.put("success_msg_list", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            Iterator<Long> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                jSONArray3.put(it4.next());
            }
            Log.m105919d("MicroMsg.FailMsgFileCache", "serializeToString, failArray.size:%d", Integer.valueOf(jSONArray3.length()));
            jSONObject.put("fail_msg_list", jSONArray3);
            str2 = jSONObject.toString();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.FailMsgFileCache", e, "", new Object[0]);
        }
        Log.m105919d("MicroMsg.FailMsgFileCache", "flushToDisk, cacheContent:%s", str2);
        if (Util.isNullOrNil(str2)) {
            Log.m105918d("MicroMsg.FailMsgFileCache", "flushToDisk, content is empty");
        } else {
            C86013q1.m106438T(str, str2.getBytes(), 0, str2.length());
        }
    }

    /* renamed from: e */
    public abstract ArrayList<Long> mo56027e(T t);

    /* renamed from: f */
    public abstract String mo56028f(int i);

    /* renamed from: g */
    public abstract long mo56029g(T t);

    /* renamed from: h */
    public abstract String mo56030h(int i, int i2, int i3);

    /* renamed from: i */
    public abstract String mo56031i(int i, int i2, int i3);

    /* renamed from: j */
    public abstract String mo56032j(int i, int i2);

    /* renamed from: k */
    public abstract int mo56033k();

    /* renamed from: l */
    public void mo175849l() {
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "omitFailMsg, size:%d", Integer.valueOf(this.f346876a.mo175867e()));
        if (this.f346876a.mo175867e() > 0) {
            C115649j jVar = this.f346876a;
            jVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it = jVar.f346897a.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().longValue()));
            }
            mo56034m(arrayList);
        }
    }

    /* renamed from: m */
    public abstract void mo56034m(ArrayList<Long> arrayList);

    /* renamed from: n */
    public void mo56040n() {
    }

    /* renamed from: o */
    public abstract void mo56035o();

    /* renamed from: p */
    public void mo175850p(T t) {
        if (t != null) {
            Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, msgId:%d, msgList:%s, isResending:%b", Long.valueOf(mo56029g(t)), mo175847c(), Boolean.valueOf(this.f346878c));
            if (this.f346878c) {
                if (this.f346876a.mo175864b(mo56029g(t)) && !this.f346881f.contains(Long.valueOf(mo56029g(t)))) {
                    this.f346881f.add(Long.valueOf(mo56029g(t)));
                }
                if (!this.f346876a.mo175864b(mo56029g(t))) {
                    Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "sending msg, another fail msg");
                    this.f346876a.mo175863a(mo56029g(t));
                }
                mo175858y();
                Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, successlist.size:%d, faillist.size:%d", Integer.valueOf(this.f346880e.size()), Integer.valueOf(this.f346881f.size()));
                if (this.f346880e.size() + this.f346881f.size() < this.f346876a.mo175867e()) {
                    long d = this.f346876a.mo175866d();
                    if (d == -1) {
                        Log.m105920e("TAG", "resend error, next msg id is -1");
                        return;
                    }
                    Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", Long.valueOf(d));
                    mo175848d();
                    MMHandlerThread.postToMainThreadDelayed(new C115647h(this, d), 200);
                    return;
                }
                mo175854t();
            } else if (!this.f346882g.contains(Long.valueOf(mo56029g(t)))) {
                ArrayList<Long> e = mo56027e(t);
                if (e == null || e.size() <= 0) {
                    Log.m105920e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
                    return;
                }
                mo175855v();
                C115649j jVar = this.f346876a;
                jVar.getClass();
                if (e.size() > 0) {
                    jVar.f346897a.addAll(e);
                }
                mo175848d();
                Log.m105925i("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", Integer.valueOf(this.f346876a.mo175867e()), mo175847c());
                C115669n.INSTANCE.mo160131h(11426, Integer.valueOf(mo56033k()));
                MMHandlerThread.postToMainThreadDelayed(new C115646g(this), 1000);
            } else {
                this.f346882g.remove(Long.valueOf(mo56029g(t)));
            }
        }
    }

    /* renamed from: q */
    public void mo175851q(T t) {
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSucess, msgId:%d, msgList:%s", Long.valueOf(mo56029g(t)), mo175847c());
        if (this.f346876a.mo175864b(mo56029g(t))) {
            long g = mo56029g(t);
            if (this.f346882g.contains(Long.valueOf(g)) && this.f346881f.contains(Long.valueOf(g))) {
                Log.m105924i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
                this.f346882g.remove(Long.valueOf(g));
                this.f346881f.remove(Long.valueOf(g));
            }
            if (this.f346878c) {
                this.f346880e.add(Long.valueOf(g));
                mo175858y();
                Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSuccess, successlist.size:%d, faillist.size:%d", Integer.valueOf(this.f346880e.size()), Integer.valueOf(this.f346881f.size()));
                if (this.f346880e.size() + this.f346881f.size() < this.f346876a.mo175867e()) {
                    long d = this.f346876a.mo175866d();
                    if (d == -1) {
                        Log.m105920e("TAG", "resend error, next msg id is -1");
                        return;
                    }
                    Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", Long.valueOf(d));
                    mo175848d();
                    MMHandlerThread.postToMainThreadDelayed(new C115647h(this, d), 200);
                    return;
                }
                mo175854t();
                return;
            }
            this.f346876a.f346897a.remove(Long.valueOf(mo56029g(t)));
            if (this.f346876a.mo175867e() == 0) {
                this.f346877b.mo175868a();
                mo175855v();
                C0450b.m385b(mo56033k());
                return;
            }
            Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "maybe the user manually resend the message, update init wording");
            this.f346877b.mo175874g(mo56028f(this.f346876a.mo175867e()));
        }
    }

    /* renamed from: r */
    public final void mo175852r() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f346876a.mo175867e(); i++) {
            long c = this.f346876a.mo175865c(i);
            if (!mo56026b(c)) {
                arrayList.add(Long.valueOf(c));
            }
        }
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f346876a.f346897a.remove(Long.valueOf(((Long) it.next()).longValue()));
            }
        }
    }

    /* renamed from: s */
    public void mo175853s() {
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "resendAllMsg, mMsgList.size:%d", Integer.valueOf(this.f346876a.mo175867e()));
        this.f346878c = true;
        FailSendMsgNotification failSendMsgNotification = this.f346877b;
        failSendMsgNotification.getClass();
        failSendMsgNotification.f346900b = new C90116e.C90121c(failSendMsgNotification.f346901c, C78382a.m94651c());
        failSendMsgNotification.mo175870c();
        failSendMsgNotification.mo175872e();
        Log.m105918d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, removeActionButton");
        FailSendMsgNotification failSendMsgNotification2 = this.f346877b;
        failSendMsgNotification2.f346900b.mo124384i(2, true);
        failSendMsgNotification2.mo175872e();
        Log.m105918d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, setLockInNotificationBar");
        this.f346877b.mo175874g(mo56032j(this.f346876a.mo175867e(), 0));
        this.f346876a.f346898b = 0;
        mo175857x();
        this.f346885j.dead();
        this.f346885j.alive();
        MMHandlerThread.postToMainThreadDelayed(new C115647h(this, this.f346876a.mo175866d()), 200);
        MTimerHandler mTimerHandler = this.f346884i;
        if (mTimerHandler != null) {
            mTimerHandler.startTimer(300000);
        } else {
            Log.m105920e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
        }
    }

    /* renamed from: t */
    public final void mo175854t() {
        this.f346878c = false;
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "finish resend, msgList.size:%d, mFailList.size:%d, mSuccessList.size:%d", Integer.valueOf(this.f346876a.mo175867e()), Integer.valueOf(this.f346881f.size()), Integer.valueOf(this.f346880e.size()));
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, before check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", Integer.valueOf(this.f346876a.mo175867e()), Integer.valueOf(this.f346880e.size()), Integer.valueOf(this.f346881f.size()));
        mo175852r();
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = this.f346880e.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (!mo56026b(next.longValue())) {
                arrayList.add(next);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            this.f346880e.remove((Long) it4.next());
        }
        arrayList.clear();
        Iterator<Long> it5 = this.f346881f.iterator();
        while (it5.hasNext()) {
            Long next2 = it5.next();
            if (!mo56026b(next2.longValue())) {
                arrayList.add(next2);
            }
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            this.f346881f.remove((Long) it6.next());
        }
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, after check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", Integer.valueOf(this.f346876a.mo175867e()), Integer.valueOf(this.f346880e.size()), Integer.valueOf(this.f346881f.size()));
        if (this.f346881f.size() <= 0) {
            C0450b.m385b(mo56033k());
        }
        C115669n.INSTANCE.mo160131h(11425, Integer.valueOf(mo56033k()), 0, Integer.valueOf(this.f346880e.size()), Integer.valueOf(this.f346881f.size()));
        this.f346877b.mo175873f();
        this.f346877b.f346907i = mo56028f(this.f346876a.mo175867e());
        this.f346877b.mo175874g(mo56030h(this.f346876a.mo175867e(), this.f346880e.size(), this.f346881f.size()));
        this.f346877b.mo175871d(false);
        if (this.f346881f.size() > 0) {
            FailSendMsgNotification failSendMsgNotification = this.f346877b;
            failSendMsgNotification.f346900b = new C90116e.C90121c(failSendMsgNotification.f346901c, C78382a.m94651c());
            failSendMsgNotification.mo175869b();
            failSendMsgNotification.mo175870c();
            this.f346877b.mo175872e();
            this.f346876a.f346898b = 0;
            if (this.f346880e.size() > 0) {
                Iterator<Long> it7 = this.f346880e.iterator();
                while (it7.hasNext()) {
                    this.f346876a.f346897a.remove(Long.valueOf(it7.next().longValue()));
                }
            }
            this.f346880e.clear();
            this.f346881f.clear();
            mo175848d();
        }
        NotificationSendFailMsgFinishEvent notificationSendFailMsgFinishEvent = new NotificationSendFailMsgFinishEvent();
        notificationSendFailMsgFinishEvent.f343588d.f343589a = mo56033k();
        notificationSendFailMsgFinishEvent.publish();
        MTimerHandler mTimerHandler = this.f346884i;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        } else {
            Log.m105920e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
        }
        mo175857x();
        this.f346885j.dead();
        mo56040n();
    }

    /* renamed from: u */
    public abstract void mo56036u(long j);

    /* renamed from: v */
    public final void mo175855v() {
        C115649j jVar = this.f346876a;
        jVar.f346897a.clear();
        jVar.f346898b = 0;
        this.f346878c = false;
        this.f346880e.clear();
        this.f346881f.clear();
        mo175857x();
    }

    /* renamed from: w */
    public final void mo175856w() {
        C28541j.vx0().getClass();
        Boolean bool = Boolean.FALSE;
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, isInForeground:%b", bool);
        this.f346877b.f346907i = mo56028f(this.f346876a.mo175867e());
        FailSendMsgNotification failSendMsgNotification = this.f346877b;
        failSendMsgNotification.f346900b = new C90116e.C90121c(failSendMsgNotification.f346901c, C78382a.m94651c());
        failSendMsgNotification.mo175869b();
        failSendMsgNotification.mo175870c();
        C28541j.vx0().getClass();
        FailSendMsgNotification failSendMsgNotification2 = this.f346877b;
        boolean z = failSendMsgNotification2.f346910l;
        if (!z) {
            failSendMsgNotification2.f346906h = mo56028f(this.f346876a.mo175867e());
            this.f346877b.mo175873f();
            this.f346877b.mo175871d(false);
            Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, first show notification");
            this.f346877b.mo175872e();
            this.f346885j.dead();
            this.f346885j.alive();
        } else if (z) {
            failSendMsgNotification2.mo175873f();
            this.f346877b.mo175871d(false);
            Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, update notification content text");
            this.f346877b.mo175874g(mo56028f(this.f346876a.mo175867e()));
            this.f346885j.dead();
            this.f346885j.alive();
        } else {
            C28541j.vx0().getClass();
            Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, not show or update notification, isForeground:%b", bool);
        }
    }

    /* renamed from: x */
    public final void mo175857x() {
        Iterator<MTimerHandler> it = this.f346883h.iterator();
        while (it.hasNext()) {
            it.next().stopTimer();
        }
        this.f346883h.clear();
        this.f346882g.clear();
    }

    /* renamed from: y */
    public final void mo175858y() {
        this.f346877b.f346907i = mo56028f(this.f346876a.mo175867e());
        if (this.f346881f.size() <= 0) {
            this.f346877b.mo175874g(mo56032j(this.f346876a.mo175867e(), this.f346880e.size() + this.f346881f.size()));
        } else {
            this.f346877b.mo175874g(mo56031i(this.f346876a.mo175867e(), this.f346880e.size() + this.f346881f.size(), this.f346881f.size()));
        }
    }
}
