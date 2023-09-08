package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BindQQEvent;
import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44667s4;
import di3.C86312j;
import eb0.C75592q0;
import eg0.C45656e;
import f40.C86709a0;
import f62.C75700k0;
import g62.C8235p;
import hg0.C76189z0;
import j20.C117292a;
import java.util.ArrayList;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76706g;
import p214om.C11502f;
import p823sg.C77710q;
import qo3.C77398g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ */
public class StartUnbindQQ extends MMWizardActivity implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f196502i = 0;

    /* renamed from: e */
    public View f196503e;

    /* renamed from: f */
    public C77398g f196504f;

    /* renamed from: g */
    public C89779i0 f196505g;

    /* renamed from: h */
    public String f196506h = null;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ$a */
    public class C68386a implements MenuItem.OnMenuItemClickListener {
        public C68386a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            StartUnbindQQ.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ$b */
    public class C68387b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ$b$a */
        public class C68388a implements DialogInterface.OnClickListener {
            public C68388a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C86709a0.m107524d().mo123460f(new C45656e(""));
                StartUnbindQQ startUnbindQQ = StartUnbindQQ.this;
                startUnbindQQ.f196505g = C76879j.m92723Q(startUnbindQQ, startUnbindQQ.getString(C0966R.string.a3h), StartUnbindQQ.this.getString(C0966R.string.ior), true, true, (DialogInterface.OnCancelListener) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ$b$b */
        public class C68389b implements DialogInterface.OnClickListener {
            public C68389b(C68387b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C68387b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StartUnbindQQ startUnbindQQ = StartUnbindQQ.this;
            C77398g gVar = startUnbindQQ.f196504f;
            if (gVar == null) {
                startUnbindQQ.f196504f = C76879j.m92750u(startUnbindQQ, startUnbindQQ.getString(C0966R.string.ioq), (String) null, new C68388a(), new C68389b(this));
            } else {
                gVar.show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ$c */
    public class C68390c implements DialogInterface.OnClickListener {
        public C68390c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            StartUnbindQQ startUnbindQQ = StartUnbindQQ.this;
            int i2 = StartUnbindQQ.f196502i;
            startUnbindQQ.mo7681K7(1);
        }
    }

    /* renamed from: N7 */
    public final boolean mo93933N7() {
        Class cls = C75700k0.class;
        Class cls2 = C76706g.class;
        new BindQQEvent().publish();
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0);
        String str = "" + new C77710q(nullAs) + "@qqim";
        ((C44667s4) ((C75700k0) C86709a0.m107533q(cls)).V50()).mo69820c(str);
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c(str);
        ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93610qq(str);
        String str2 = C75592q0.m90789s() + "@qqim";
        ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93610qq(str2);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93566o(str, false);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93566o(str, true);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93566o(str2, false);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93566o(str2, true);
        C76189z0 z0Var = (C76189z0) ((C76754b) C86312j.m106911c(C76754b.class)).mo105736BP();
        z0Var.getClass();
        Log.m105918d("MicroMsg.QQGroupStorage", "delete all");
        if (z0Var.f223226d.delete("qqgroup", (String) null, (String[]) null) > 0) {
            z0Var.doNotify();
        }
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5n;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.k6b);
        this.f196503e = findViewById(C0966R.C0970id.jdo);
        setBackBtn(new C68386a());
        this.f196503e.setOnClickListener(new C68387b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(253, this);
        this.f196506h = getIntent().getStringExtra("notice");
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(253, this);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        initView();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.StartUnbindQQ", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        if (yVar.getType() == 253) {
            C89779i0 i0Var = this.f196505g;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f196505g = null;
            }
            if (i == 0 && i2 == 0) {
                int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0);
                Log.m105918d("MicroMsg.StartUnbindQQ", "iBindUin " + nullAs);
                if (nullAs != 0) {
                    C8235p V50 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50();
                    ((C44667s4) V50).mo69820c(new C77710q(nullAs) + "@qqim");
                }
                Object e = C86709a0.m107535s().mo121142i().mo119684e(102407, (Object) null);
                if (e != null && ((String) e).length() > 0) {
                    C86709a0.m107535s().mo121142i().mo119676J(102407, (Object) null);
                }
                try {
                    mo93933N7();
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.StartUnbindQQ", e2, "", new Object[0]);
                    Log.printErrStackTrace("MicroMsg.StartUnbindQQ", e2, "", new Object[0]);
                }
                C86709a0.m107535s().mo121142i().mo119676J(9, 0);
                UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new UpdateLocalVerifySwitchEvent();
                UpdateLocalVerifySwitchEvent.C67808a aVar = updateLocalVerifySwitchEvent.f193987d;
                aVar.f193988a = false;
                aVar.f193989b = true;
                updateLocalVerifySwitchEvent.publish();
                if (!Util.isNullOrNil(this.f196506h)) {
                    C76879j.m92754y(this, this.f196506h, "", getString(C0966R.string.f8029zr), new C68390c());
                } else {
                    mo7681K7(1);
                }
            }
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            }
        }
    }
}
