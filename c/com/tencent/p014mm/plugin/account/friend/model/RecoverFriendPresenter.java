package com.tencent.p014mm.plugin.account.friend.model;

import android.app.Activity;
import android.content.DialogInterface;
import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecoverAccountFriendEvent;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.plugin.account.friend.widget.RecoverFriendSortView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import hg0.C46059o0;
import hg0.C76187y0;
import hg0.C76188z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lu3.C76725h;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qj3.C47864f;
import qo3.C89779i0;
import sf0.C77691f;
import te3.C50913q42;
import te3.C51057r42;
import te3.C51061r53;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter */
public class RecoverFriendPresenter extends IListener<RecoverAccountFriendEvent> implements C11385n {

    /* renamed from: d */
    public Activity f196526d;

    /* renamed from: e */
    public RecoverFriendSortView f196527e;

    /* renamed from: f */
    public C89779i0 f196528f;

    /* renamed from: g */
    public String f196529g;

    /* renamed from: h */
    public String f196530h;

    /* renamed from: i */
    public ArrayList<C47864f> f196531i = new ArrayList<>();

    /* renamed from: j */
    public int f196532j = 65;

    /* renamed from: n */
    public boolean f196533n;

    /* renamed from: o */
    public AtomicInteger f196534o = new AtomicInteger();

    /* renamed from: com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter$a */
    public class C68396a extends C76725h {

        /* renamed from: d */
        public final /* synthetic */ String f196535d;

        /* renamed from: e */
        public final /* synthetic */ List f196536e;

        public C68396a(String str, List list) {
            this.f196535d = str;
            this.f196536e = list;
        }

        /* renamed from: a */
        public void mo93948a(Object obj) {
            Runnable runnable = (Runnable) obj;
            Log.m105924i("MicroMsg.RecoverFriendPresenter", "after running insert task");
            if (RecoverFriendPresenter.this.f196534o.decrementAndGet() == 0 && !RecoverFriendPresenter.this.f196533n) {
                Log.m105924i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
                MMHandlerThread.postToMainThread(new C68400c(this));
            }
        }

        /* renamed from: b */
        public void mo93949b(Object obj) {
            Runnable runnable = (Runnable) obj;
            Log.m105924i("MicroMsg.RecoverFriendPresenter", "before running insert task");
        }

        /* renamed from: c */
        public void mo93950c() {
            boolean z;
            char c;
            String str = this.f196535d;
            List<C51061r53> list = this.f196536e;
            int i = 0;
            for (C51061r53 r532 : list) {
                Class cls = C76754b.class;
                if (!Util.isNullOrNil(r532.f140715h)) {
                    C76188z a = C68397a.m80735a(str, r532.f140715h);
                    if (a == null) {
                        a = new C76188z();
                    }
                    a.field_encryptUsername = r532.f140715h;
                    String str2 = r532.f140714g;
                    a.field_nickname = str2;
                    String upperCase = Util.nullAsNil(C77691f.m93686a(str2)).toUpperCase();
                    a.field_pinyinName = upperCase;
                    if (Util.isNullOrNil(upperCase) || (c = upperCase.charAt(0)) < 'A' || c > 'Z') {
                        c = '[';
                    }
                    a.field_showHead = c;
                    a.field_ticket = r532.f140712e;
                    a.field_username = r532.f140711d;
                    a.field_oldUsername = str;
                    a.field_seq = r532.f140713f;
                    if (a.systemRowid == -1) {
                        z = ((C76187y0) ((C76754b) C86312j.m106911c(cls)).mo105753zo()).insert(a);
                        Log.m105925i("MicroMsg.RecoverFriendLogic", "insert local old friend (%s,%s), success %s", r532.f140715h, r532.f140714g, Boolean.valueOf(z));
                    } else {
                        z = ((C76187y0) ((C76754b) C86312j.m106911c(cls)).mo105753zo()).replace(a);
                        Log.m105925i("MicroMsg.RecoverFriendLogic", "replace local old friend (%s,%s), success %s", r532.f140715h, r532.f140714g, Boolean.valueOf(z));
                    }
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                }
            }
            Log.m105925i("MicroMsg.RecoverFriendLogic", "insert local old %d, success %d", Integer.valueOf(list.size()), Integer.valueOf(i));
            Log.m105925i("MicroMsg.RecoverFriendPresenter", "insert old account friend %d, success %d", Integer.valueOf(this.f196536e.size()), Integer.valueOf(i));
        }
    }

    public RecoverFriendPresenter(Activity activity) {
        super(C40008f.f107254d);
        this.f196526d = activity;
        this.__eventId = 41785987;
    }

    public boolean callback(IEvent iEvent) {
        RecoverAccountFriendEvent recoverAccountFriendEvent = (RecoverAccountFriendEvent) iEvent;
        Log.m105925i("MicroMsg.RecoverFriendPresenter", "received RecoverAccountFriendEvent type %d, username %s", Integer.valueOf(recoverAccountFriendEvent.f193880d.f193882b), recoverAccountFriendEvent.f193880d.f193881a);
        RecoverAccountFriendEvent.C67773a aVar = recoverAccountFriendEvent.f193880d;
        if (aVar.f193882b == 1 && !Util.isNullOrNil(aVar.f193881a)) {
            Iterator<C47864f> it = this.f196531i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C47864f next = it.next();
                if (recoverAccountFriendEvent.f193880d.f193881a.equals(((C68397a.C68398a) next.f128466b).f196538a.field_encryptUsername)) {
                    ((C68397a.C68398a) next.f128466b).f196538a = C68397a.m80735a(this.f196529g, recoverAccountFriendEvent.f193880d.f193881a);
                    C44721b bVar = this.f196527e.f121300g;
                    bVar.mo69954b(bVar.f121310d);
                    break;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo93945e(int i) {
        Log.m105925i("MicroMsg.RecoverFriendPresenter", "do next scene, oldWx %s,seq %d", this.f196529g, Integer.valueOf(i));
        C86709a0.m107524d().mo123460f(new C46059o0(this.f196529g, i, this.f196530h));
        if (this.f196528f == null) {
            Activity activity = this.f196526d;
            this.f196528f = C76879j.m92723Q(activity, "", activity.getString(C0966R.string.a05), false, false, (DialogInterface.OnCancelListener) null);
        }
    }

    /* renamed from: f */
    public final void mo93946f() {
        int i;
        String str = this.f196529g;
        Cursor rawQuery = ((C76754b) C86312j.m106911c(C76754b.class)).mo105753zo().rawQuery("SELECT COUNT(oldUsername) FROM OldAccountFriend WHERE oldUsername = " + C91753f.m115264e(str), new String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    i = rawQuery.getInt(0);
                    Log.m105925i("MicroMsg.RecoverFriendPresenter", "totalCount %d", Integer.valueOf(i));
                    if (this.f196532j == 65 || i >= 20) {
                        do {
                            mo93947g();
                            if (this.f196531i.size() >= 20 || this.f196532j <= 91) {
                            }
                            mo93947g();
                            return;
                        } while (this.f196532j <= 91);
                    }
                    ArrayList arrayList = (ArrayList) C68397a.m80736b(this.f196529g, -1);
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C68397a.C68398a aVar = (C68397a.C68398a) it.next();
                            C47864f fVar = new C47864f();
                            fVar.f128466b = aVar;
                            int i2 = aVar.f196538a.field_showHead;
                            if (i2 < 65 || i2 > 90) {
                                fVar.f128465a = "#";
                            } else {
                                fVar.f128465a = "" + ((char) i2);
                            }
                            this.f196531i.add(fVar);
                        }
                        this.f196527e.mo69938e(this.f196531i);
                    }
                    this.f196532j = 92;
                    return;
                }
                rawQuery.close();
            } finally {
                rawQuery.close();
            }
        }
        i = 0;
        Log.m105925i("MicroMsg.RecoverFriendPresenter", "totalCount %d", Integer.valueOf(i));
        if (this.f196532j == 65) {
        }
        do {
            mo93947g();
            return;
        } while (this.f196532j <= 91);
    }

    /* renamed from: g */
    public final void mo93947g() {
        ArrayList arrayList;
        do {
            int i = this.f196532j;
            if (i <= 91) {
                List<C68397a.C68398a> b = C68397a.m80736b(this.f196529g, i);
                this.f196532j++;
                arrayList = (ArrayList) b;
            } else {
                return;
            }
        } while (arrayList.isEmpty());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C68397a.C68398a aVar = (C68397a.C68398a) it.next();
            C47864f fVar = new C47864f();
            fVar.f128466b = aVar;
            int i2 = aVar.f196538a.field_showHead;
            if (i2 < 65 || i2 > 90) {
                fVar.f128465a = "#";
            } else {
                fVar.f128465a = "" + ((char) i2);
            }
            this.f196531i.add(fVar);
        }
        this.f196527e.mo69938e(this.f196531i);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.RecoverFriendPresenter", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C46059o0 o0Var = (C46059o0) yVar;
            C47350c cVar = o0Var.f124184d;
            C47465a aVar = cVar.f127056b.f127083a;
            boolean z = ((C51057r42) aVar).f140689e;
            this.f196533n = z;
            LinkedList<C51061r53> linkedList = ((C51057r42) aVar).f140688d;
            String str2 = ((C50913q42) cVar.f127055a.f127080a).f140128d;
            Log.m105925i("MicroMsg.RecoverFriendPresenter", "hasContinue %s, oldAccount friend %d", Boolean.valueOf(z), Integer.valueOf(linkedList.size()));
            if (!this.f196529g.equals(str2)) {
                Log.m105929w("MicroMsg.RecoverFriendPresenter", "(%s,%s), not my old username, ignore", this.f196529g, str2);
                return;
            }
            this.f196534o.getAndIncrement();
            ((C119157j) C119157j.f356862d).mo183876g(new C68396a(str2, linkedList), "Insert_Old_Account_Friend");
            if (this.f196533n) {
                mo93945e(o0Var.f124186f);
            } else if (this.f196534o.get() == 0) {
                Log.m105924i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
                C89779i0 i0Var = this.f196528f;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                mo93946f();
            }
        } else {
            mo93946f();
            C89779i0 i0Var2 = this.f196528f;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            if (Util.isNullOrNil(str)) {
                str = this.f196526d.getString(C0966R.string.f7966xq);
            }
            C76879j.m92726T(this.f196526d, str);
        }
    }
}
