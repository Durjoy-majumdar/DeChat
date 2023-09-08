package com.tencent.p014mm.plugin.forcenotify.p058ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import ev1.C31723b;
import ev1.C31724c;
import ev1.C31726h;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C89132b;
import p910lj.C76701a;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C48750aq1;
import te3.C49058cw3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld */
public final class ForceNotifyAcceptUIOld extends MMActivity {

    /* renamed from: d */
    public final String f81284d = "MicroMsg.ForceNotifyAcceptUI";

    /* renamed from: e */
    public final MMHandler f81285e = new MMHandler("MicroMsg.ForceNotifyAcceptUI");

    /* renamed from: f */
    public C89779i0 f81286f;

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$a */
    public static final class C30037a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyAcceptUIOld f81287d;

        public C30037a(ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
            this.f81287d = forceNotifyAcceptUIOld;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f81287d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$b */
    public static final class C30038b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C30038b f81288d = new C30038b();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$c */
    public static final class C30039c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f81289d;

        /* renamed from: e */
        public final /* synthetic */ ForceNotifyAcceptUIOld f81290e;

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$c$a */
        public static final class C30040a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ ForceNotifyAcceptUIOld f81291a;

            public C30040a(ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
                this.f81291a = forceNotifyAcceptUIOld;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    Log.m105924i(this.f81291a.f81284d, "get accept info successfully");
                    C48750aq1 aq12 = ((C49058cw3) cVar.f256796d).f131995d;
                    C31726h hVar = new C31726h();
                    hVar.field_UserName = aq12.f130728i;
                    hVar.field_ExpiredTime = ((long) aq12.f130725f) * 1000;
                    hVar.field_CreateTime = ((long) aq12.f130724e) * 1000;
                    hVar.field_Status = (C31543z5.m39453c() > hVar.field_ExpiredTime ? 1 : (C31543z5.m39453c() == hVar.field_ExpiredTime ? 0 : -1)) >= 0 ? 0 : 1;
                    hVar.field_ExtInfo = aq12.f130729j;
                    hVar.field_Description = aq12.f130726g;
                    hVar.field_UserIcon = aq12.f130727h;
                    hVar.field_ForcePushId = aq12.f130723d;
                    Log.m105925i(this.f81291a.f81284d, " item:%s", hVar);
                    ((TextView) this.f81291a.findViewById(C0966R.C0970id.f357845c22)).setText(Util.nullAsNil(hVar.field_Description));
                } else {
                    C76701a.makeText((Context) this.f81291a, (CharSequence) cVar.f256795c, 0).show();
                    this.f81291a.finish();
                }
                C89779i0 i0Var = this.f81291a.f81286f;
                if (i0Var == null) {
                    return null;
                }
                i0Var.dismiss();
                return C13598b0.f38549a;
            }
        }

        public C30039c(String str, ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
            this.f81289d = str;
            this.f81290e = forceNotifyAcceptUIOld;
        }

        public final void run() {
            new C31724c(this.f81289d).mo9225i().mo123062e(new C30040a(this.f81290e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$d */
    public static final class C30041d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyAcceptUIOld f81292d;

        /* renamed from: e */
        public final /* synthetic */ String f81293e;

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$d$a */
        public static final class C30042a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C30042a f81294d = new C30042a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$d$b */
        public static final class C30043b<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ ForceNotifyAcceptUIOld f81295a;

            public C30043b(ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
                this.f81295a = forceNotifyAcceptUIOld;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
                if (r1 != false) goto L_0x0050;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object call(java.lang.Object r5) {
                /*
                    r4 = this;
                    ob0.b$c r5 = (ob0.C89132b.C89134c) r5
                    int r0 = r5.f256793a
                    r1 = 0
                    if (r0 != 0) goto L_0x0039
                    int r0 = r5.f256794b
                    if (r0 != 0) goto L_0x0039
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r5 = r4.f81295a
                    java.lang.String r5 = r5.f81284d
                    java.lang.String r0 = "accept successfully"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r5 = r4.f81295a
                    qo3.i0 r5 = r5.f81286f
                    if (r5 == 0) goto L_0x001d
                    r5.dismiss()
                L_0x001d:
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r5 = r4.f81295a
                    android.content.res.Resources r0 = r5.getResources()
                    r2 = 2131830418(0x7f112692, float:1.9293833E38)
                    java.lang.String r0 = r0.getString(r2)
                    android.widget.Toast r5 = p910lj.C76701a.makeText((android.content.Context) r5, (java.lang.CharSequence) r0, (int) r1)
                    r5.show()
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r5 = r4.f81295a
                    r5.finish()
                    rx3.b0 r5 = rx3.C13598b0.f38549a
                    goto L_0x0072
                L_0x0039:
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r0 = r4.f81295a
                    qo3.i0 r0 = r0.f81286f
                    if (r0 == 0) goto L_0x0042
                    r0.dismiss()
                L_0x0042:
                    java.lang.String r0 = r5.f256795c
                    r2 = 1
                    if (r0 == 0) goto L_0x0050
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x004e
                    r1 = 1
                L_0x004e:
                    if (r1 == 0) goto L_0x005f
                L_0x0050:
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r0 = r4.f81295a
                    android.content.res.Resources r0 = r0.getResources()
                    r1 = 2131830416(0x7f112690, float:1.9293829E38)
                    java.lang.String r0 = r0.getString(r1)
                    r5.f256795c = r0
                L_0x005f:
                    com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld r0 = r4.f81295a
                    java.lang.String r5 = r5.f256795c
                    android.content.res.Resources r1 = r0.getResources()
                    r3 = 2131821704(0x7f110488, float:1.9276159E38)
                    java.lang.String r1 = r1.getString(r3)
                    qo3.g r5 = nj3.C76879j.m92712F(r0, r5, r1, r2)
                L_0x0072:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.forcenotify.p058ui.ForceNotifyAcceptUIOld.C30041d.C30043b.call(java.lang.Object):java.lang.Object");
            }
        }

        public C30041d(ForceNotifyAcceptUIOld forceNotifyAcceptUIOld, String str) {
            this.f81292d = forceNotifyAcceptUIOld;
            this.f81293e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ForceNotifyAcceptUIOld forceNotifyAcceptUIOld = this.f81292d;
            forceNotifyAcceptUIOld.f81286f = C76879j.m92723Q(forceNotifyAcceptUIOld, forceNotifyAcceptUIOld.getString(C0966R.string.a3h), this.f81292d.getString(C0966R.string.a4d), true, false, C30042a.f81294d);
            C89779i0 i0Var = this.f81292d.f81286f;
            if (i0Var != null) {
                i0Var.show();
            }
            new C31723b(this.f81293e).mo9225i().mo123062e(new C30043b(this.f81292d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld$e */
    public static final class C30044e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyAcceptUIOld f81296d;

        public C30044e(ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
            this.f81296d = forceNotifyAcceptUIOld;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f81296d.f81284d, "Cancel!");
            this.f81296d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.as7;
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        getWindow().addFlags(6815872);
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        setBackBtn(new C30037a(this));
        C89779i0 Q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, false, C30038b.f81288d);
        this.f81286f = Q;
        if (Q != null) {
            Q.show();
        }
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("data") : null;
        Log.m105919d(this.f81284d, "data:%s", string);
        if (string == null) {
            finish();
            Log.m105918d(this.f81284d, "data is null");
            return;
        }
        this.f81285e.post(new C30039c(string, this));
        ((Button) findViewById(C0966R.C0970id.f5299ba)).setOnClickListener(new C30041d(this, string));
        ((Button) findViewById(C0966R.C0970id.apu)).setOnClickListener(new C30044e(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f81286f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
