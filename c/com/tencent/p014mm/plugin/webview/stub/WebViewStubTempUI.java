package com.tencent.p014mm.plugin.webview.stub;

import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p385u2.C111105a;
import p447aw.C103918d;
import qo3.C77398g;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI */
public class WebViewStubTempUI extends MMActivity implements MMActivity.C6739d {

    /* renamed from: d */
    public int f22454d = 0;

    /* renamed from: e */
    public boolean f22455e = false;

    /* renamed from: f */
    public Dialog f22456f = null;

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI$StartActivityForResultTask */
    public static final class StartActivityForResultTask implements Parcelable {
        public static final Parcelable.Creator<StartActivityForResultTask> CREATOR = new C6099a();

        /* renamed from: d */
        public String f22459d;

        /* renamed from: e */
        public String f22460e;

        /* renamed from: f */
        public Intent f22461f;

        /* renamed from: g */
        public int f22462g;

        /* renamed from: h */
        public boolean f22463h;

        /* renamed from: i */
        public int f22464i;

        /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI$StartActivityForResultTask$a */
        public class C6099a implements Parcelable.Creator<StartActivityForResultTask> {
            public Object createFromParcel(Parcel parcel) {
                return new StartActivityForResultTask(parcel);
            }

            public Object[] newArray(int i) {
                return new StartActivityForResultTask[i];
            }
        }

        public StartActivityForResultTask() {
        }

        public StartActivityForResultTask(Parcel parcel) {
            this.f22459d = parcel.readString();
            this.f22460e = parcel.readString();
            this.f22461f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
            this.f22462g = parcel.readInt();
            this.f22463h = parcel.readByte() != 0;
            this.f22464i = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f22459d);
            parcel.writeString(this.f22460e);
            parcel.writeParcelable(this.f22461f, i);
            parcel.writeInt(this.f22462g);
            parcel.writeByte(this.f22463h ? (byte) 1 : 0);
            parcel.writeInt(this.f22464i);
        }
    }

    /* renamed from: H7 */
    public static boolean m5971H7(Context context, C6107m mVar, String[] strArr, int i, int i2) {
        if (context == null || strArr == null || strArr.length == 0) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C111105a.m151499a(context, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_action_code", 1);
        bundle.putStringArray("key_permission_types", (String[]) arrayList.toArray(new String[arrayList.size()]));
        bundle.putInt("key_permission_request_code", i);
        bundle.putInt("key_binder_id", i2);
        C6600v.m6910e(bundle, "webview", ".stub.WebViewStubTempUI", mVar, (Runnable) null);
        return false;
    }

    /* renamed from: I7 */
    public static void m5972I7(Context context, C6107m mVar, boolean z, String str, String str2, String str3, String str4, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        Intent intent = new Intent(context, WebViewStubTempUI.class);
        if (context instanceof Service) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_action_code", 0);
        intent.putExtra("key_alert_cancelable", z);
        intent.putExtra("key_alert_message", str);
        intent.putExtra("key_alert_title", str2);
        intent.putExtra("key_alert_yes", str3);
        intent.putExtra("key_alert_no", str4);
        intent.putExtra("key_alert_result_receiver", new ResultReceiver(new Handler(Looper.getMainLooper())) {
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == 0) {
                    onClickListener.onClick((DialogInterface) null, 0);
                } else if (i == 1) {
                    onClickListener2.onClick((DialogInterface) null, 0);
                }
            }
        });
        C6600v.m6910e(intent.getExtras(), "webview", ".stub.WebViewStubTempUI", mVar, (Runnable) null);
    }

    /* renamed from: J7 */
    public static void m5973J7(Context context, String str, String str2, Intent intent, int i, boolean z, int i2) {
        Intent intent2 = new Intent(context, WebViewStubTempUI.class);
        if (context instanceof Service) {
            intent2.addFlags(268435456);
        }
        intent2.putExtra("key_action_code", 2);
        StartActivityForResultTask startActivityForResultTask = new StartActivityForResultTask();
        startActivityForResultTask.f22459d = str;
        startActivityForResultTask.f22460e = str2;
        startActivityForResultTask.f22461f = intent;
        startActivityForResultTask.f22462g = i;
        startActivityForResultTask.f22463h = z;
        startActivityForResultTask.f22464i = i2;
        intent2.putExtra("key_activity_result_task", startActivityForResultTask);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return -1;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        MsgHandler a;
        if (this.f22455e && (a = C44040v3.m48330a(this.f22454d)) != null) {
            a.mmOnActivityResult(i, i2, intent);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_action_code", -1);
        if (intExtra == 0) {
            ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("key_alert_result_receiver");
            if (resultReceiver == null) {
                finish();
                return;
            }
            C77398g K = C76879j.m92717K(this, getIntent().getBooleanExtra("key_alert_cancelable", false), getIntent().getStringExtra("key_alert_message"), getIntent().getStringExtra("key_alert_title"), getIntent().getStringExtra("key_alert_yes"), getIntent().getStringExtra("key_alert_no"), new C6104i(this, resultReceiver), new C6105j(this, resultReceiver));
            this.f22456f = K;
            K.setOnCancelListener(new C6106k(this));
        } else if (intExtra == 1) {
            ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0), (String) null, (String) null);
        } else if (intExtra != 2) {
            finish();
        } else {
            StartActivityForResultTask startActivityForResultTask = (StartActivityForResultTask) getIntent().getParcelableExtra("key_activity_result_task");
            this.f22454d = startActivityForResultTask.f22464i;
            this.f22455e = true;
            mmSetOnActivityResultCallback(this);
            C88144b.m109796n(this, startActivityForResultTask.f22459d, startActivityForResultTask.f22460e, startActivityForResultTask.f22461f, startActivityForResultTask.f22462g, startActivityForResultTask.f22463h);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f22456f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int intExtra = getIntent().getIntExtra("key_binder_id", 0);
        if (!(i == 72 || i == 75 || i == 113)) {
            switch (i) {
                case 115:
                case 116:
                case 117:
                case 118:
                    break;
            }
        }
        if (iArr.length != 0) {
            if (iArr[0] == 0) {
                C44040v3.m48330a(intExtra).mmOnActivityResult(i, -1, (Intent) null);
            } else {
                C44040v3.m48330a(intExtra).mmOnActivityResult(i, 0, (Intent) null);
            }
        }
        finish();
    }
}
