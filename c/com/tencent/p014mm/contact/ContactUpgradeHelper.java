package com.tencent.p014mm.contact;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import oa1.C117731d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.contact.ContactUpgradeHelper */
public class ContactUpgradeHelper implements IStorageObserver<C72996z1> {

    /* renamed from: h */
    public static ContactUpgradeHelper f10280h = new ContactUpgradeHelper();

    /* renamed from: d */
    public volatile boolean f10281d;

    /* renamed from: e */
    public volatile boolean f10282e = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, false);

    /* renamed from: f */
    public boolean f10283f = true;

    /* renamed from: g */
    public IListener<DoingInitContactEvent> f10284g = new IListener<DoingInitContactEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1611655951;
        }

        public boolean callback(IEvent iEvent) {
            int i = ((DoingInitContactEvent) iEvent).f9047d.f9048a;
            if (i == 1) {
                Log.m105924i("MicroMsg.ContactUpgradeHelper", "do init start");
                ContactUpgradeHelper.this.f10281d = true;
            } else if (i == 2) {
                Log.m105924i("MicroMsg.ContactUpgradeHelper", "do init end");
                ContactUpgradeHelper.this.f10281d = false;
            }
            return false;
        }
    };

    public ContactUpgradeHelper() {
        this.f10284g.alive();
        boolean g = C117731d.m166007c().mo182445g("clicfg_db_opt_mode_on", true, true);
        this.f10283f = g;
        Log.m105925i("MicroMsg.ContactUpgradeHelper", "defalutOptOpen:%b", Boolean.valueOf(g));
    }

    /* renamed from: a */
    public boolean mo1134a() {
        return this.f10282e && this.f10283f;
    }

    public void onChanged(Object obj) {
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        if (this.f10281d) {
            Log.m105924i("MicroMsg.ContactUpgradeHelper", "refreshUserName, init doing");
        } else if (this.f10282e) {
            Log.m105924i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag is already done!");
        } else {
            Log.m105924i("MicroMsg.ContactUpgradeHelper", "checkUpgrade");
            this.f10281d = true;
            ((C119157j) C119157j.f356862d).mo183884o(new C1235c(this));
        }
    }
}
