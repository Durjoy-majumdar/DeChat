package com.tencent.p014mm.pluginsdk.platformtools;

import android.database.Cursor;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.ContactBlackListHelper */
public class ContactBlackListHelper implements MStorageEx.IOnStorageChange {

    /* renamed from: g */
    public static ContactBlackListHelper f23985g = new ContactBlackListHelper();

    /* renamed from: h */
    public static Set<String> f23986h = new HashSet();

    /* renamed from: i */
    public static Set<String> f23987i = new HashSet();

    /* renamed from: j */
    public static volatile boolean f23988j = false;

    /* renamed from: d */
    public volatile boolean f23989d;

    /* renamed from: e */
    public IListener<DoingInitContactEvent> f23990e = new IListener<DoingInitContactEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1611655951;
        }

        public boolean callback(IEvent iEvent) {
            int i = ((DoingInitContactEvent) iEvent).f9047d.f9048a;
            if (i == 1) {
                Log.m105924i("MicroMsg.ContactBlackListHelper", "do init start");
                ContactBlackListHelper.this.f23989d = true;
            } else if (i == 2) {
                Log.m105924i("MicroMsg.ContactBlackListHelper", "do init end");
                ContactBlackListHelper.this.f23989d = false;
            }
            return false;
        }
    };

    /* renamed from: f */
    public volatile boolean f23991f = false;

    /* renamed from: com.tencent.mm.pluginsdk.platformtools.ContactBlackListHelper$a */
    public class C6664a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f23993d;

        public C6664a(String str) {
            this.f23993d = str;
        }

        public void run() {
            ContactBlackListHelper contactBlackListHelper = ContactBlackListHelper.this;
            String str = this.f23993d;
            contactBlackListHelper.getClass();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                Log.m105925i("MicroMsg.ContactBlackListHelper", "onContactStorageNotifyChange isBLackListContact: %s, isSnsBlack: %s,", Boolean.valueOf(z1Var.mo62920o3()), Boolean.valueOf(z1Var.mo62943y3()));
                synchronized (ContactBlackListHelper.f23986h) {
                    if (z1Var.mo62920o3()) {
                        ((HashSet) ContactBlackListHelper.f23986h).add(str);
                    } else {
                        ((HashSet) ContactBlackListHelper.f23986h).remove(str);
                    }
                }
                synchronized (ContactBlackListHelper.f23987i) {
                    if (z1Var.mo62943y3()) {
                        ((HashSet) ContactBlackListHelper.f23987i).add(str);
                    } else {
                        ((HashSet) ContactBlackListHelper.f23987i).remove(str);
                    }
                }
            }
        }
    }

    public ContactBlackListHelper() {
        this.f23990e.alive();
        mo7581c();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List, android.database.Cursor] */
    /* renamed from: a */
    public static List<String> m6942a() {
        ArrayList arrayList;
        Log.m105924i("MicroMsg.ContactBlackListHelper", "getBlackListContacts");
        f23985g.mo7581c();
        synchronized (f23986h) {
            Log.m105925i("MicroMsg.ContactBlackListHelper", "getBlackListContacts cacheReady = %b", Boolean.valueOf(f23988j));
            if (((HashSet) f23986h).isEmpty() && !f23988j) {
                long currentTimeMillis = System.currentTimeMillis();
                ? r4 = 0;
                try {
                    C86709a0.m107528h();
                    Cursor i4 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69705i4("@black.android", "", r4, false);
                    i4.moveToFirst();
                    while (!i4.isAfterLast()) {
                        ((HashSet) f23986h).add(i4.getString(0));
                        i4.moveToNext();
                    }
                    f23988j = true;
                    i4.close();
                    Log.m105925i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    if (r4 != 0) {
                        r4.close();
                    }
                    Log.m105925i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    throw th;
                }
            }
            Log.m105925i("MicroMsg.ContactBlackListHelper", "[get black list] %s", f23986h);
            arrayList = new ArrayList(f23986h);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m6943b() {
        ArrayList arrayList;
        Log.m105924i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts");
        f23985g.mo7581c();
        synchronized (f23987i) {
            Log.m105925i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts snsCacheReady = %b", Boolean.FALSE);
            if (((HashSet) f23987i).isEmpty()) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    f23987i.addAll(C45628s0.m50806w());
                    f23988j = true;
                    Log.m105925i("MicroMsg.ContactBlackListHelper", "[select sns black list] cost:%d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    Log.m105921e("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts failed, message = %s", th.getMessage());
                }
            }
            Log.m105925i("MicroMsg.ContactBlackListHelper", "[get black list] %s", f23987i);
            arrayList = new ArrayList(f23987i);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo7581c() {
        if (MMApplicationContext.isMainProcess() && C86709a0.m107523b().mo121114l() && !this.f23991f) {
            synchronized (this) {
                if (!this.f23991f) {
                    ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
                    this.f23991f = true;
                }
            }
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (!(obj instanceof String)) {
            Log.m105919d("MicroMsg.ContactBlackListHelper", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        Log.m105925i("MicroMsg.ContactBlackListHelper", "onNotifyChange %s", str);
        if ((mStorageEx instanceof C44668u3) && !this.f23989d && !Util.isNullOrNil(str)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C6664a(str), "Thread-ContactBlackListHelper-onNotifyChange");
        }
    }
}
