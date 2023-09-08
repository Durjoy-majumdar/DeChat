package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import nj3.C11184p0;
import p225rc.C89916g;
import p225rc.g$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.d */
public class C82330d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C82324a f241291d;

    /* renamed from: e */
    public final /* synthetic */ Activity f241292e;

    /* renamed from: f */
    public final /* synthetic */ C82381f f241293f;

    /* renamed from: g */
    public final /* synthetic */ int f241294g;

    /* renamed from: h */
    public final /* synthetic */ C82327b f241295h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.d$a */
    public class C82331a implements g$$e {
        public C82331a() {
        }

        /* renamed from: a */
        public void mo1626a(int i, Intent intent) {
            C82330d dVar = C82330d.this;
            dVar.f241293f.mo109647a(dVar.f241294g, dVar.f241295h.mo115109j("ok"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.d$b */
    public class C82332b implements g$$e {
        public C82332b() {
        }

        /* renamed from: a */
        public void mo1626a(int i, Intent intent) {
            C82330d dVar = C82330d.this;
            dVar.f241293f.mo109647a(dVar.f241294g, dVar.f241295h.mo115109j("ok"));
        }
    }

    public C82330d(C82327b bVar, C82324a aVar, Activity activity, C82381f fVar, int i) {
        this.f241295h = bVar;
        this.f241291d = aVar;
        this.f241292e = activity;
        this.f241293f = fVar;
        this.f241294g = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Intent intent;
        C82331a aVar;
        int i2 = i;
        if (i2 == 0) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
            C82327b.m101071w(this.f241295h, intent, this.f241291d, this.f241292e, this.f241293f);
            Activity activity = this.f241292e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            aVar = new C82331a();
            try {
                C89916g.m112446a(this.f241292e).mo124236j(intent, aVar);
                return;
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case0, get RemoteException[%s] retry", e);
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("data");
                ContentValues contentValues = null;
                Iterator it = parcelableArrayListExtra.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ContentValues contentValues2 = (ContentValues) it.next();
                    if (contentValues2.containsKey("data15")) {
                        contentValues = contentValues2;
                        break;
                    }
                }
                if (contentValues != null) {
                    parcelableArrayListExtra.remove(contentValues);
                }
                intent.putParcelableArrayListExtra("data", parcelableArrayListExtra);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.JsApiAddPhoneContact", th, "removeContactAvatarDataFromIntent", new Object[0]);
            }
        } else if (i2 == 1) {
            Intent intent2 = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
            intent2.setType("vnd.android.cursor.item/person");
            C82327b.m101071w(this.f241295h, intent2, this.f241291d, this.f241292e, this.f241293f);
            C82332b bVar = new C82332b();
            try {
                C89916g.m112446a(this.f241292e).mo124236j(intent2, bVar);
                return;
            } catch (RemoteException e2) {
                Log.m105921e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case1, get RemoteException[%s] retry", e2);
                C89916g.m112446a(this.f241292e).mo124236j(intent2, bVar);
                return;
            }
        } else {
            return;
        }
        C89916g.m112446a(this.f241292e).mo124236j(intent, aVar);
    }
}
