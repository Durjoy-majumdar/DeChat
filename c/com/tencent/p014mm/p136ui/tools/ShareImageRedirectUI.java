package com.tencent.p014mm.p136ui.tools;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.transmit.ShareImageSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p140cw.C7138g;
import p447aw.C103918d;
import p910lj.C76701a;

@C88989a(7)
/* renamed from: com.tencent.mm.ui.tools.ShareImageRedirectUI */
public class ShareImageRedirectUI extends MMBaseActivity {

    /* renamed from: e */
    public String f24737e;

    /* renamed from: com.tencent.mm.ui.tools.ShareImageRedirectUI$a */
    public class C7000a implements View.OnTouchListener {
        public C7000a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C76701a.makeText((Context) ShareImageRedirectUI.this, (int) C0966R.string.f361357j71, 1).show();
            ShareImageRedirectUI.this.finish();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImageRedirectUI$b */
    public class C7001b implements DialogInterface.OnClickListener {
        public C7001b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ShareImageRedirectUI.this);
            ShareImageRedirectUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImageRedirectUI$c */
    public class C7002c implements DialogInterface.OnClickListener {
        public C7002c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ShareImageRedirectUI.this.finish();
        }
    }

    /* renamed from: E7 */
    public final void mo8033E7() {
        String l = C112760b.m154240l();
        ((C7138g) C86312j.m106911c(C7138g.class)).Gl0(this, l, "microMsg." + System.currentTimeMillis() + ".jpg", 0);
        getWindow().getDecorView().setOnTouchListener(new C7000a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        getWindow().getDecorView().setOnTouchListener((View.OnTouchListener) null);
        if (i2 != -1) {
            finish();
        } else if (i == 0) {
            Context applicationContext = getApplicationContext();
            C97625j3.m125812b().getClass();
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent, C7970a.m8127a());
            this.f24737e = g6;
            if (g6 != null) {
                Intent intent2 = new Intent(this, ShareImageSelectorUI.class);
                intent2.putExtra("intent_extra_image_path", this.f24737e);
                startActivityForResult(intent2, 2);
            }
        } else if (i == 2) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
            if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                Intent intent3 = new Intent(this, ChattingUI.class);
                intent3.putExtra("Chat_User", stringArrayListExtra.get(0));
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent3);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            } else if (stringArrayListExtra == null || stringArrayListExtra.size() <= 1) {
                Intent intent4 = new Intent();
                intent4.putExtra("Ksnsupload_type", 0);
                intent4.putExtra("sns_kemdia_path", this.f24737e);
                C88144b.m109791i(this, "sns", ".ui.SnsUploadUI", intent4, (Bundle) null);
                finish();
            } else {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 16, "", "");
        Log.m105925i("MicroMsg.ShareImageRedirectUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
        if (z1) {
            mo8033E7();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr[0] == 0) {
                mo8033E7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C7001b(), new C7002c());
        }
    }
}
