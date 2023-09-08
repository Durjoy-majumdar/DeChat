package tn3;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import d34.C116557a;
import d34.C116559c;
import e34.C116679a;
import e34.C116680b;
import f40.C86709a0;
import f62.C75700k0;
import g34.C116910a;
import g34.C116917h;
import g34.C116918i;
import h34.C117065a;
import h34.C117066b;
import j34.C117296c;
import java.io.OutputStream;
import java.util.ArrayList;
import tc0.C37007j;
import tc0.C77885p;
import tn3.C101905a;
import tn3.C118501f;

/* renamed from: tn3.b */
public class C118493b implements C118501f.C118502a, C101905a {

    /* renamed from: a */
    public C117066b f354642a = null;

    /* renamed from: b */
    public C116918i f354643b = null;

    /* renamed from: c */
    public C116918i f354644c = null;

    /* renamed from: d */
    public boolean f354645d = false;

    /* renamed from: e */
    public boolean f354646e = false;

    /* renamed from: f */
    public C101905a.C101907b f354647f = null;

    /* renamed from: g */
    public C101905a.C101906a f354648g = null;

    /* renamed from: h */
    public Context f354649h = null;

    /* renamed from: i */
    public MMHandler f354650i = new C118494a();

    /* renamed from: tn3.b$a */
    public class C118494a extends MMHandler {
        public C118494a() {
        }

        public void handleMessage(Message message) {
            C101905a.C101908c cVar = C101905a.C101908c.Failed;
            if (message.what == 1000) {
                String str = (String) message.obj;
                if (str != null) {
                    C118493b bVar = C118493b.this;
                    Context context = bVar.f354649h;
                    if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setTitle("Error");
                        builder.setMessage("Application requires permission to access the Internet");
                        builder.create().show();
                    } else {
                        new C118501f(context, str, bVar).show();
                    }
                } else {
                    C118493b.this.mo183213a(cVar);
                }
            }
            if (message.what == 1010) {
                C101905a.C101908c cVar2 = (C101905a.C101908c) message.obj;
                C118493b bVar2 = C118493b.this;
                bVar2.f354646e = false;
                if (cVar2 == cVar) {
                    bVar2.f354644c = null;
                    bVar2.mo183217e((C116918i) null);
                }
                C101905a.C101906a aVar = bVar2.f354648g;
                if (aVar != null) {
                    aVar.mo5556o5(cVar2);
                }
            }
        }
    }

    /* renamed from: tn3.b$b */
    public class C118495b implements Runnable {
        public C118495b() {
        }

        public void run() {
            String str = null;
            try {
                C118493b bVar = C118493b.this;
                bVar.f354644c = ((C117065a) bVar.f354642a).mo180996e();
                C118493b bVar2 = C118493b.this;
                str = ((C117065a) bVar2.f354642a).mo180995d(bVar2.f354644c);
            } catch (C116679a | C116680b unused) {
            }
            C118493b.this.f354650i.sendMessage(C118493b.this.f354650i.obtainMessage(1000, str));
        }
    }

    public C118493b() {
        C116917h hVar = C116917h.Header;
        C116918i iVar = null;
        Class<C116559c.C116560a> cls = C116559c.C116560a.class;
        C117296c.m165375b(cls, "Api class cannot be null");
        try {
            C116557a newInstance = cls.newInstance();
            C117296c.m165374a("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
            C117296c.m165374a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
            C117296c.m165375b("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
            C117296c.m165375b(newInstance, "You must specify a valid api through the provider() method");
            C117296c.m165374a("XMr2y8FEVEqZBcZ1TU3gLA", "You must provide an api key");
            C117296c.m165374a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "You must provide an api secret");
            this.f354642a = newInstance.mo180537a(new C116910a("XMr2y8FEVEqZBcZ1TU3gLA", "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "wechatapp://sign-in-twitter.wechatapp.com/", hVar, (String) null, (OutputStream) null));
            if (C86709a0.m107523b().mo121114l()) {
                String str = (String) C86709a0.m107535s().mo121142i().mo119684e(69377, (Object) null);
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(69378, (Object) null);
                if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
                    iVar = new C116918i(str, str2, (String) null);
                }
            } else {
                Log.m105920e("Twitter", "acchas not ready for restoreTwitterAccessToken");
            }
            this.f354643b = iVar;
        } catch (Exception e) {
            throw new C116680b("Error while creating the Api object", e);
        }
    }

    /* renamed from: a */
    public final void mo183213a(C101905a.C101908c cVar) {
        this.f354645d = false;
        this.f354644c = null;
        C101905a.C101907b bVar = this.f354647f;
        if (bVar != null) {
            bVar.mo5555Y6(cVar);
        }
    }

    /* renamed from: b */
    public void mo183214b(C101905a.C101907b bVar, Context context) {
        if (!this.f354645d) {
            C115669n.INSTANCE.idkeyStat(583, 0, 1, false);
            this.f354647f = bVar;
            this.f354649h = context;
            this.f354645d = true;
            ThreadPool.post(new C118495b(), "Twitter_doOAuth");
        }
    }

    /* renamed from: c */
    public void mo183215c() {
        mo183216d(false);
        mo183213a(C101905a.C101908c.Canceled);
        C115669n.INSTANCE.idkeyStat(583, 3, 1, false);
    }

    /* renamed from: d */
    public final void mo183216d(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C37007j.C37008a(10251, z ? "1" : "2"));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C37007j(arrayList));
    }

    /* renamed from: e */
    public final void mo183217e(C116918i iVar) {
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        if (iVar == null) {
            C86709a0.m107535s().mo121142i().mo119676J(69377, "");
            C86709a0.m107535s().mo121142i().mo119676J(69378, "");
            return;
        }
        C86709a0.m107535s().mo121142i().mo119676J(69377, iVar.f350347d);
        C86709a0.m107535s().mo121142i().mo119676J(69378, iVar.f350348e);
    }
}
