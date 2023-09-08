package com.tencent.p014mm.plugin.subapp.p109ui.voicereminder;

import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import bx2.C67329a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75601x2;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nj3.C88989a;
import p214om.C11502f;
import qo3.C77389a;
import qo3.C77398g;
import uw2.C78291e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog */
public class RemindDialog extends HellActivity {

    /* renamed from: i */
    public static List<String> f206371i = new ArrayList();

    /* renamed from: j */
    public static boolean f206372j = false;

    /* renamed from: d */
    public String f206373d = "";

    /* renamed from: e */
    public List<String> f206374e = new ArrayList();

    /* renamed from: f */
    public MMHandler f206375f = new MMHandler();

    /* renamed from: g */
    public C77398g f206376g;

    /* renamed from: h */
    public C75601x2 f206377h = new C71291a();

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog$a */
    public class C71291a implements C75601x2 {
        public C71291a() {
        }

        /* renamed from: a */
        public void mo98148a(String str, long j) {
            Log.m105918d("MicroMsg.RemindDialog", "onVoiceRemind " + str);
            ((ArrayList) RemindDialog.this.f206374e).add(str);
            RemindDialog remindDialog = RemindDialog.this;
            remindDialog.f206375f.post(new C67329a(remindDialog));
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog$b */
    public class C71292b implements DialogInterface.OnClickListener {
        public C71292b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C78291e vx02 = C78291e.vx0();
            if (vx02 != null) {
                vx02.Ax0(RemindDialog.this.f206373d);
            }
            if (C72996z1.m85803I5(((MMNotification) C97625j3.m125816f()).f194715b)) {
                RemindDialog.this.finish();
                return;
            }
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(new Intent().putExtra("Chat_User", RemindDialog.this.f206373d), RemindDialog.this);
            RemindDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog$c */
    public class C71293c implements DialogInterface.OnClickListener {
        public C71293c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C78291e vx02 = C78291e.vx0();
            if (vx02 != null) {
                vx02.Ax0(RemindDialog.this.f206373d);
            }
            RemindDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog$d */
    public class C71294d implements DialogInterface.OnDismissListener {
        public C71294d() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RemindDialog.this.finish();
        }
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.kdt);
        aVar.f225660q = " ";
        aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.kdq);
        aVar.f225620C = new C71292b();
        aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.kds);
        aVar.f225621D = new C71293c();
        aVar.f225623F = new C71294d();
        this.f206373d = getIntent().getStringExtra("_RemindDialog_User");
        String stringExtra = getIntent().getStringExtra("_RemindDialog_Remind");
        ((ArrayList) this.f206374e).clear();
        ((ArrayList) this.f206374e).add(stringExtra);
        Iterator it = ((ArrayList) f206371i).iterator();
        while (it.hasNext()) {
            ((ArrayList) this.f206374e).add((String) it.next());
        }
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        this.f206376g = gVar;
        gVar.setCanceledOnTouchOutside(false);
        this.f206376g.show();
        this.f206375f.post(new C67329a(this));
    }

    public void onPause() {
        f206372j = false;
        C78291e vx02 = C78291e.vx0();
        if (vx02 != null) {
            C75601x2 x2Var = this.f206377h;
            Log.m105918d("MicroMsg.SubCoreVoiceRemind", "removeVoiceRemind ");
            if (x2Var != null) {
                ((HashSet) vx02.f229339h).remove(x2Var);
            }
        }
        super.onPause();
    }

    public void onResume() {
        f206372j = true;
        C78291e vx02 = C78291e.vx0();
        if (vx02 != null) {
            C75601x2 x2Var = this.f206377h;
            Log.m105918d("MicroMsg.SubCoreVoiceRemind", "addVoiceRemind ");
            if (x2Var != null) {
                ((HashSet) vx02.f229339h).add(x2Var);
            }
        }
        super.onResume();
    }
}
