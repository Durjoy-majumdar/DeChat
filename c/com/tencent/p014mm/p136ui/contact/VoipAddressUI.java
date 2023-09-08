package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import lc3.C10485b;
import nj3.C76879j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.ui.contact.VoipAddressUI */
public class VoipAddressUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public List<String> f218886C;

    /* renamed from: D */
    public boolean f218887D = false;

    /* renamed from: E */
    public boolean f218888E = false;

    /* renamed from: F */
    public String f218889F = "";

    /* renamed from: G */
    public IListener f218890G = new IListener<VoipEvent>(C40008f.f107254d) {
        {
            this.__eventId = -797557590;
        }

        public boolean callback(IEvent iEvent) {
            int i = ((VoipEvent) iEvent).f194019d.f194022b;
            if (i == 7) {
                VoipAddressUI.this.finish();
                return false;
            } else if (i != 8) {
                return false;
            } else {
                VoipAddressUI.this.finish();
                return false;
            }
        }
    };

    /* renamed from: com.tencent.mm.ui.contact.VoipAddressUI$a */
    public class C74449a implements DialogInterface.OnClickListener {
        public C74449a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VoipAddressUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.VoipAddressUI$b */
    public class C74450b implements DialogInterface.OnClickListener {
        public C74450b(VoipAddressUI voipAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.VoipAddressUI$c */
    public class C74451c implements DialogInterface.OnClickListener {
        public C74451c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VoipAddressUI.this.getContext());
        }
    }

    /* renamed from: j8 */
    public static void m89067j8(Context context) {
        boolean z = 1 == Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VOIPCallType"), 0);
        Intent intent = new Intent(context, VoipAddressUI.class);
        intent.putExtra("Add_address_titile", context.getString(C0966R.string.f7496hv));
        intent.putExtra("voip_video", z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(11034, 1, Integer.valueOf(z ^ true ? 1 : 0));
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74572v vVar = new C74572v();
        vVar.f219205b = true;
        vVar.f219204a = true;
        return new C74568u(this, this.f218886C, true, false, vVar);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f218886C, false, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String stringExtra = getIntent().getStringExtra("Add_address_titile");
        return !Util.isNullOrNil(stringExtra) ? getString(C0966R.string.f7496hv) : stringExtra;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C75922b bVar = (C75922b) this.f218605d.getAdapter().getItem(i);
        if (bVar != null && (str = bVar.f222621r) != null) {
            this.f218889F = str;
            if (this.f218888E) {
                mo103496i8();
            } else {
                mo103495g8();
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        String stringExtra = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
        this.f218888E = getIntent().getBooleanExtra("voip_video", true);
        if (stringExtra != null) {
            this.f218887D = true;
            if (stringExtra.equals("launch_type_voip")) {
                this.f218888E = true;
            } else if (stringExtra.equals("launch_type_voip_audio")) {
                this.f218888E = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        this.f218886C = arrayList;
        arrayList.addAll(C74560s1.m89273b());
        this.f218886C.addAll(C45628s0.m50776h());
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        if (this.f218887D) {
            Intent intent = new Intent(this, LauncherUI.class);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        hideVKB();
        finish();
    }

    /* renamed from: g8 */
    public void mo103495g8() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 82, "", "");
        Log.m105925i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
        if (z1) {
            VoipEvent voipEvent = new VoipEvent();
            VoipEvent.C67818a aVar = voipEvent.f194019d;
            aVar.f194022b = 5;
            aVar.f194025e = this.f218889F;
            aVar.f194024d = this;
            int i = this.f218887D ? 2 : 1;
            aVar.f194026f = 3;
            C115669n.INSTANCE.mo160131h(11033, Integer.valueOf(i), 2, 0);
            voipEvent.publish();
            hideVKB();
        }
    }

    /* renamed from: i8 */
    public final void mo103496i8() {
        Class cls = C103918d.class;
        boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.CAMERA", 19, "", "");
        Log.m105925i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
        if (z1) {
            boolean z15 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.RECORD_AUDIO", 19, "", "");
            Log.m105925i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z15), Util.getStack(), this);
            if (z15) {
                VoipEvent voipEvent = new VoipEvent();
                VoipEvent.C67818a aVar = voipEvent.f194019d;
                aVar.f194022b = 5;
                aVar.f194025e = this.f218889F;
                aVar.f194024d = this;
                int i = this.f218887D ? 2 : 1;
                aVar.f194026f = 2;
                C115669n.INSTANCE.mo160131h(11033, Integer.valueOf(i), 1, 0);
                voipEvent.publish();
                hideVKB();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f218890G.alive();
    }

    public void onDestroy() {
        this.f218890G.dead();
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 19) {
            if (i == 82) {
                if (iArr[0] == 0) {
                    mo103495g8();
                } else {
                    C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C74451c(), (DialogInterface.OnClickListener) null);
                }
            }
        } else if (iArr[0] == 0) {
            mo103496i8();
        } else {
            int i2 = "android.permission.CAMERA".equals(strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
            if (iArr[0] != 0) {
                C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C74449a(), new C74450b(this));
            }
        }
    }
}
