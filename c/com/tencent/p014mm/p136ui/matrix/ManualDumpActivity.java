package com.tencent.p014mm.p136ui.matrix;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.resource.C80530h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kj2.C117407d;
import nj3.C76879j;
import p761yd.C91441c;
import p910lj.C76701a;
import p937cf.C80018a;
import p982if.C87719c;
import p982if.C87725f;
import p987jf.C87954a;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.matrix.ManualDumpActivity */
public class ManualDumpActivity extends MatrixBaseLeakResultUI implements View.OnLongClickListener {

    /* renamed from: q */
    public static final /* synthetic */ int f250190q = 0;

    /* renamed from: g */
    public String f250191g;

    /* renamed from: h */
    public String f250192h;

    /* renamed from: i */
    public String f250193i;

    /* renamed from: j */
    public TextView f250194j;

    /* renamed from: n */
    public TextView f250195n;

    /* renamed from: o */
    public TextView f250196o;

    /* renamed from: p */
    public C85881b f250197p = C85881b.DISMISS;

    /* renamed from: com.tencent.mm.ui.matrix.ManualDumpActivity$a */
    public class C45031a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f122130d;

        /* renamed from: com.tencent.mm.ui.matrix.ManualDumpActivity$a$a */
        public class C45032a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f122132d;

            public C45032a(String str) {
                this.f122132d = str;
            }

            public void run() {
                C45031a.this.f122130d.dismiss();
                ManualDumpActivity manualDumpActivity = ManualDumpActivity.this;
                String str = this.f122132d;
                int i = ManualDumpActivity.f250190q;
                manualDumpActivity.getClass();
                if (str == null || str.length() == 0) {
                    Log.m105920e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is empty");
                    C76701a.makeText((Context) manualDumpActivity, (int) C0966R.string.j6y, 1).show();
                    manualDumpActivity.finish();
                } else if (!Util.isFilePathSafeToBeCopySrc(str)) {
                    Log.m105920e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is refer to private file.");
                    C76701a.makeText((Context) manualDumpActivity, (int) C0966R.string.j6y, 1).show();
                    manualDumpActivity.finish();
                } else {
                    long l = C86013q1.m106451l(str);
                    Log.m105925i("MicroMsg.ManualDumpActivity", "filelength: [%d]", Long.valueOf(l));
                    if (l == 0) {
                        Log.m105920e("MicroMsg.ManualDumpActivity", "dealWithFile fail, fileLength is 0");
                        C76701a.makeText((Context) manualDumpActivity, (int) C0966R.string.j6y, 1).show();
                        manualDumpActivity.finish();
                        return;
                    }
                    WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXFileObject(str));
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    String path2 = n.getPath();
                    int lastIndexOf = path2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        path2 = path2.substring(lastIndexOf + 1);
                    }
                    wXMediaMessage.title = path2;
                    wXMediaMessage.description = Util.getSizeKB(l);
                    SendMessageToWX.Req req = new SendMessageToWX.Req();
                    req.transaction = null;
                    req.message = wXMediaMessage;
                    Bundle bundle = new Bundle();
                    req.toBundle(bundle);
                    bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                    bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
                    bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
                    Intent className = new Intent().setClassName(manualDumpActivity, "com.tencent.mm.ui.transmit.SelectConversationUI");
                    className.putExtra("Select_Conv_NextStep", new Intent().setClassName(manualDumpActivity, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI").putExtras(bundle).putExtra("animation_pop_in", true));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(className);
                    C117292a.m165358d(manualDumpActivity, aVar.mo10232b(), "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    manualDumpActivity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(manualDumpActivity, "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }

        public C45031a(ProgressDialog progressDialog) {
            this.f122130d = progressDialog;
        }

        public void run() {
            Uri n = C116299g2.m163858n(ManualDumpActivity.this.f250195n.getText().toString());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ManualDumpActivity.this.getExternalCacheDir());
            sb.append("/");
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            sb.append(path2);
            sb.append(".zip");
            String sb4 = sb.toString();
            C86013q1.m106439U(C116299g2.m163865u(n), sb4);
            ((C119157j) C119157j.f356862d).mo183895z(new C45032a(sb4));
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.ManualDumpActivity$b */
    public enum C85881b {
        DISMISS {
            /* renamed from: a */
            public String mo119795a() {
                return "manual-dump-dismiss";
            }

            /* renamed from: b */
            public int mo119796b() {
                return 1;
            }
        },
        SHARE {
            /* renamed from: a */
            public String mo119795a() {
                return "manual-dump-share";
            }

            /* renamed from: b */
            public int mo119796b() {
                return 2;
            }
        },
        MUTE {
            /* renamed from: a */
            public String mo119795a() {
                return "manual-dump-mute";
            }

            /* renamed from: b */
            public int mo119796b() {
                return 3;
            }
        };

        /* access modifiers changed from: public */
        C85881b(C45031a aVar) {
        }

        /* renamed from: a */
        public abstract String mo119795a();

        /* renamed from: b */
        public abstract int mo119796b();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359876bb1;
    }

    public void mute(View view) {
        C87954a aVar;
        C80530h hVar = (C80530h) C91441c.m114730d().mo125377a(C80530h.class);
        if (hVar != null && (aVar = hVar.f235549i) != null) {
            C87719c cVar = aVar.f254533n;
            if (cVar instanceof C87725f) {
                ((C87725f) cVar).f254012g = true;
                C76701a.makeText((Context) this, (CharSequence) "won't notify you util reboot", 0).show();
                if (this.f250197p == C85881b.DISMISS) {
                    this.f250197p = C85881b.MUTE;
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C80530h.class;
        super.onCreate(bundle);
        setMMTitle(BuildInfo.DEBUG ? "Activity Leak(debug)" : WeChatEnvironment.hasDebugger() ? "Activity Leak(coolassist)" : "Activity Leak");
        TextView textView = (TextView) findViewById(C0966R.C0970id.fma);
        this.f250195n = (TextView) findViewById(C0966R.C0970id.f0n);
        this.f250194j = (TextView) findViewById(C0966R.C0970id.fmb);
        this.f250196o = (TextView) findViewById(C0966R.C0970id.fmc);
        textView.setOnLongClickListener(this);
        this.f250195n.setOnLongClickListener(this);
        this.f250194j.setOnLongClickListener(this);
        this.f250192h = getIntent().getStringExtra(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f250191g = getIntent().getStringExtra("ref_key");
        this.f250193i = getIntent().getStringExtra("leak_process");
        textView.setText(this.f250192h);
        if (((C80530h) C91441c.m114730d().mo125377a(cls)) != null) {
            String str = "反馈提供【截图】【Reference 文本】【uin/微信号】\n";
            if (!BuildInfo.DEBUG) {
                str = str + "\nbuild=" + BuildInfo.BUILD_TAG + "\nrev=" + BuildInfo.REV;
            }
            this.f250196o.setText(str);
        }
        Log.m105925i("MicroMsg.ManualDumpActivity", "onCreate:mLeakedActivity:%s, mRefString:%s, mLeakProcess:%s", this.f250192h, this.f250191g, this.f250193i);
        String stringExtra = getIntent().getStringExtra("hprof_path");
        String stringExtra2 = getIntent().getStringExtra("leak_detail");
        C80530h hVar = (C80530h) C91441c.m114730d().mo125377a(cls);
        if (hVar == null) {
            Log.m105920e("MicroMsg.ManualDumpActivity", "plugin == null");
            C76701a.makeText((Context) this, (CharSequence) "plugin == null", 0).show();
        } else if (hVar.f235549i == null) {
            Log.m105920e("MicroMsg.ManualDumpActivity", "watcher == null");
            C76701a.makeText((Context) this, (CharSequence) "watcher == null", 0).show();
        } else {
            C80018a.C80020b bVar = hVar.f235548h.f234432b;
            if (bVar != C80018a.C80020b.MANUAL_DUMP) {
                Log.m105921e("MicroMsg.ManualDumpActivity", "current dump mode [%s] is not MANUAL_DUMP", bVar.name());
                C76701a.makeText((Context) this, (CharSequence) "current dump mode [" + bVar.name() + "] is not MANUAL_DUMP, pls confirm that you are in the debug/coolassist env.", 1).show();
            } else if (stringExtra != null) {
                Log.m105925i("MicroMsg.ManualDumpActivity", "dump success! leak process = %s, leak activity = %s, leak instance = %s", this.f250193i, this.f250192h, this.f250191g);
                Log.m105925i("MicroMsg.ManualDumpActivity", "dump success! hprof = %s", stringExtra);
                Log.m105925i("MicroMsg.ManualDumpActivity", "dump success! refChain = %s", stringExtra2);
                this.f250195n.setText(stringExtra);
                this.f250194j.setText(stringExtra2 == null ? "reference is null, pls pull hprof." : stringExtra2.replace(";", ";\n"));
            } else {
                Log.m105920e("MicroMsg.ManualDumpActivity", "analyze failed");
                C76701a.makeText((Context) this, (CharSequence) "analyze failed", 0).show();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C85881b bVar = this.f250197p;
        C117407d.INSTANCE.mo160131h(18573, bVar.mo119795a(), String.valueOf(bVar.mo119796b()), "0", 18, 0, BuildInfo.BUILD_TAG, BuildInfo.REV);
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view instanceof TextView) {
            ClipboardHelper.setText(((TextView) view).getText().toString());
            C76879j.m92726T(this, getString(C0966R.string.f7938wv));
        }
        C117292a.m165362h(true, this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    public void onResume() {
        super.onResume();
    }

    public void share(View view) {
        C89779i0 e = C89779i0.m112248e(this, "compressing...", false, 0, (DialogInterface.OnCancelListener) null);
        ((C119157j) C119157j.f356862d).mo183885p(new C45031a(e), "MicroMsg.ManualDumpActivity");
        if (this.f250197p == C85881b.DISMISS) {
            this.f250197p = C85881b.SHARE;
        }
    }
}
