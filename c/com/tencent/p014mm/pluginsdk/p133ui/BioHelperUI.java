package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI */
public class BioHelperUI extends MMActivity {

    /* renamed from: d */
    public int f23999d;

    /* renamed from: e */
    public String f24000e;

    /* renamed from: f */
    public String f24001f;

    /* renamed from: g */
    public String f24002g;

    /* renamed from: h */
    public String f24003h;

    /* renamed from: i */
    public int f24004i;

    /* renamed from: j */
    public C6671e f24005j;

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$a */
    public class C6667a implements MenuItem.OnMenuItemClickListener {
        public C6667a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BioHelperUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$b */
    public class C6668b implements View.OnClickListener {
        public C6668b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/BioHelperUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BioHelperUI bioHelperUI = BioHelperUI.this;
            bioHelperUI.f24005j.mo7593g(bioHelperUI);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/BioHelperUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$c */
    public class C6669c implements View.OnClickListener {
        public C6669c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/BioHelperUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", new StringBuilder(BioHelperUI.this.f24002g).toString());
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109791i(BioHelperUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            BioHelperUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/BioHelperUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$d */
    public class C6670d implements C6671e {
        public C6670d(C6667a aVar) {
        }

        /* renamed from: a */
        public String mo7587a() {
            return BioHelperUI.this.getString(C0966R.string.amg);
        }

        /* renamed from: b */
        public String mo7588b() {
            return BioHelperUI.this.getString(C0966R.string.amh);
        }

        /* renamed from: c */
        public void mo7589c(int i, int i2, Intent intent) {
            if (i2 == 2 && intent != null) {
                BioHelperUI.this.finish();
                String stringExtra = intent.getStringExtra("KFaceLoginAuthPwd");
                Object[] objArr = new Object[2];
                int i3 = 0;
                objArr[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
                if (!Util.isNullOrNil(stringExtra)) {
                    i3 = stringExtra.length();
                }
                objArr[1] = Integer.valueOf(i3);
                Log.m105925i("MicroMsg.BioHelperUI", "hy: secondary check onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
            }
        }

        /* renamed from: d */
        public void mo7590d(Intent intent) {
        }

        /* renamed from: e */
        public int mo7591e() {
            return C0966R.C0969drawable.c05;
        }

        /* renamed from: f */
        public String mo7592f() {
            return BioHelperUI.this.getString(C0966R.string.ame);
        }

        /* renamed from: g */
        public void mo7593g(Context context) {
            Intent intent = new Intent();
            intent.putExtra("k_user_name", BioHelperUI.this.f24000e);
            intent.putExtra("k_purpose", 2);
            intent.putExtra("k_need_signature", true);
            intent.putExtra("k_ticket", BioHelperUI.this.f24001f);
            C88144b.m109795m(BioHelperUI.this.getContext(), "facedetect", ".ui.FaceDetectUI", intent, 1025);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$e */
    public interface C6671e {
        /* renamed from: a */
        String mo7587a();

        /* renamed from: b */
        String mo7588b();

        /* renamed from: c */
        void mo7589c(int i, int i2, Intent intent);

        /* renamed from: d */
        void mo7590d(Intent intent);

        /* renamed from: e */
        int mo7591e();

        /* renamed from: f */
        String mo7592f();

        /* renamed from: g */
        void mo7593g(Context context);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI$f */
    public class C6672f implements C6671e {

        /* renamed from: a */
        public int f24010a;

        public C6672f(C6667a aVar) {
        }

        /* renamed from: a */
        public String mo7587a() {
            return BioHelperUI.this.getString(C0966R.string.amk);
        }

        /* renamed from: b */
        public String mo7588b() {
            return BioHelperUI.this.getString(C0966R.string.amj);
        }

        /* renamed from: c */
        public void mo7589c(int i, int i2, Intent intent) {
            if (i2 == -1) {
                if (i == 1024 && intent != null) {
                    String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                    Object[] objArr = new Object[2];
                    int i3 = 0;
                    objArr[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
                    if (!Util.isNullOrNil(stringExtra)) {
                        i3 = stringExtra.length();
                    }
                    objArr[1] = Integer.valueOf(i3);
                    Log.m105919d("MicroMsg.BioHelperUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
                    Intent intent2 = new Intent();
                    intent2.putExtra("VoiceLoginAuthPwd", stringExtra);
                    intent2.putExtra("KVoiceHelpCode", BioHelperUI.this.f24004i);
                    BioHelperUI.this.setResult(-1, intent2);
                }
                BioHelperUI.this.finish();
            }
        }

        /* renamed from: d */
        public void mo7590d(Intent intent) {
            if (intent != null) {
                this.f24010a = intent.getIntExtra("kscene_type", 73);
            }
        }

        /* renamed from: e */
        public int mo7591e() {
            return C0966R.C0969drawable.bsb;
        }

        /* renamed from: f */
        public String mo7592f() {
            return BioHelperUI.this.getString(C0966R.string.amf);
        }

        /* renamed from: g */
        public void mo7593g(Context context) {
            Intent intent = new Intent();
            intent.putExtra("kscene_type", this.f24010a);
            intent.putExtra("Kusername", BioHelperUI.this.f24000e);
            intent.putExtra("Kvertify_key", BioHelperUI.this.f24001f);
            C88144b.m109795m(context, "voiceprint", ".ui.VoiceLoginUI", intent, 1024);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6580iw;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (intent == null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.BioHelperUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        this.f24005j.mo7589c(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "k_type"
            r1 = 1
            int r6 = r6.getIntExtra(r0, r1)
            r5.f23999d = r6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r0[r2] = r6
            java.lang.String r6 = "MicroMsg.BioHelperUI"
            java.lang.String r3 = "hy: starting to bio helper ui, type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r0)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r3 = "Kusername"
            java.lang.String r0 = r0.getStringExtra(r3)
            r3 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
            r5.f24000e = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r4 = "Kvertify_key"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
            r5.f24001f = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r4 = "KVoiceHelpUrl"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
            r5.f24002g = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r4 = "KVoiceHelpWording"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
            r5.f24003h = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r4 = "KVoiceHelpCode"
            int r0 = r0.getIntExtra(r4, r2)
            r5.f24004i = r0
            int r0 = r5.f23999d
            if (r0 != 0) goto L_0x0078
            com.tencent.mm.pluginsdk.ui.BioHelperUI$f r0 = new com.tencent.mm.pluginsdk.ui.BioHelperUI$f
            r0.<init>(r3)
        L_0x0076:
            r3 = r0
            goto L_0x0085
        L_0x0078:
            if (r0 != r1) goto L_0x0080
            com.tencent.mm.pluginsdk.ui.BioHelperUI$d r0 = new com.tencent.mm.pluginsdk.ui.BioHelperUI$d
            r0.<init>(r3)
            goto L_0x0076
        L_0x0080:
            java.lang.String r0 = "hy: invalid type!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0085:
            r5.f24005j = r3
            if (r3 == 0) goto L_0x0110
            java.lang.String r0 = r5.f24000e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = r5.f24001f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x009a
            goto L_0x0110
        L_0x009a:
            r6 = 2131297823(0x7f09061f, float:1.8213602E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r0 = r5.f24003h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = r5.f24003h
            r6.setText(r0)
            goto L_0x00ba
        L_0x00b1:
            com.tencent.mm.pluginsdk.ui.BioHelperUI$e r0 = r5.f24005j
            java.lang.String r0 = r0.mo7592f()
            r6.setText(r0)
        L_0x00ba:
            com.tencent.mm.pluginsdk.ui.BioHelperUI$e r6 = r5.f24005j
            java.lang.String r6 = r6.mo7587a()
            r5.setMMTitle((java.lang.String) r6)
            r6 = 2131297821(0x7f09061d, float:1.8213598E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.tencent.mm.pluginsdk.ui.BioHelperUI$e r0 = r5.f24005j
            int r0 = r0.mo7591e()
            r6.setImageResource(r0)
            com.tencent.mm.pluginsdk.ui.BioHelperUI$a r6 = new com.tencent.mm.pluginsdk.ui.BioHelperUI$a
            r6.<init>()
            r5.setBackBtn(r6)
            com.tencent.mm.pluginsdk.ui.BioHelperUI$e r6 = r5.f24005j
            android.content.Intent r0 = r5.getIntent()
            r6.mo7590d(r0)
            r6 = 2131297824(0x7f090620, float:1.8213604E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            com.tencent.mm.pluginsdk.ui.BioHelperUI$e r0 = r5.f24005j
            java.lang.String r0 = r0.mo7588b()
            r6.setText(r0)
            com.tencent.mm.pluginsdk.ui.BioHelperUI$b r0 = new com.tencent.mm.pluginsdk.ui.BioHelperUI$b
            r0.<init>()
            r6.setOnClickListener(r0)
            r6 = 2131297822(0x7f09061e, float:1.82136E38)
            android.view.View r6 = r5.findViewById(r6)
            com.tencent.mm.pluginsdk.ui.BioHelperUI$c r0 = new com.tencent.mm.pluginsdk.ui.BioHelperUI$c
            r0.<init>()
            r6.setOnClickListener(r0)
            return
        L_0x0110:
            java.lang.String r0 = "type or username or ticket is null and finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.BioHelperUI.onCreate(android.os.Bundle):void");
    }
}
