package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fx0.C32212w;
import fx0.C45839q;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;
import pe3.C47465a;
import pj3.C47511g;
import te3.C50869ps2;
import te3.C51150rs2;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI */
public class ReceiveTemplateMsgMgrUI extends MMPreference implements C11385n {

    /* renamed from: h */
    public static LinkedList<C50869ps2> f109159h;

    /* renamed from: d */
    public C47511g f109160d;

    /* renamed from: e */
    public String f109161e;

    /* renamed from: f */
    public boolean f109162f = false;

    /* renamed from: g */
    public ProgressDialog f109163g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI$a */
    public class C40637a implements MenuItem.OnMenuItemClickListener {
        public C40637a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ReceiveTemplateMsgMgrUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI$b */
    public class C40638b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45839q f109165d;

        public C40638b(ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI, C45839q qVar) {
            this.f109165d = qVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f109165d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI$c */
    public class C40639c implements Runnable {
        public C40639c() {
        }

        public void run() {
            ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI = ReceiveTemplateMsgMgrUI.this;
            if (receiveTemplateMsgMgrUI.f109162f) {
                receiveTemplateMsgMgrUI.f109162f = false;
                C86709a0.m107524d().mo123460f(new C32212w(receiveTemplateMsgMgrUI.f109161e, ReceiveTemplateMsgMgrUI.f109159h));
            }
        }
    }

    /* renamed from: H7 */
    public final void mo63531H7(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.ifb);
        View findViewById2 = findViewById(C0966R.C0970id.ifc);
        if (findViewById == null) {
            return;
        }
        if (z) {
            ((TextView) findViewById).setVisibility(0);
            if (findViewById2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        ((TextView) findViewById).setVisibility(8);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.bpx;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bpy;
    }

    public int getResourceId() {
        return C0966R.xml.f8930bn;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.bpx);
        this.f109160d = getPreferenceScreen();
        String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f109161e = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
            finish();
            return;
        }
        setBackBtn(new C40637a());
        C45839q qVar = new C45839q(this.f109161e);
        C86709a0.m107524d().mo123460f(qVar);
        this.f109163g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hsr), true, true, new C40638b(this, qVar));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1031, this);
        C86709a0.m107524d().mo123455a(1030, this);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(1031, this);
        C86709a0.m107524d().mo123470p(1030, this);
        super.onDestroy();
    }

    public void onPause() {
        if (this.f109162f) {
            Log.m105918d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onPause option change");
            this.f109162f = false;
            C86709a0.m107524d().mo123460f(new C32212w(this.f109161e, f109159h));
        }
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (f109159h == null) {
            Log.m105928w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
            return false;
        }
        String str = preference.f121285r;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
            return false;
        }
        Iterator<C50869ps2> it = f109159h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C50869ps2 next = it.next();
            if (str.equals(Util.nullAsNil(next.f139938d))) {
                this.f109162f = true;
                if (((CheckBoxPreference) preference).mo6804J()) {
                    next.f139940f = 0;
                } else {
                    next.f139940f = 1;
                }
            }
        }
        if (this.f109162f) {
            Log.m105918d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "option change, do scene");
            MMHandlerThread.postToMainThreadDelayed(new C40639c(), 4000);
        }
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C47465a aVar;
        if (yVar == null) {
            Log.m105921e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", Integer.valueOf(i), Integer.valueOf(i2), str);
            return;
        }
        Log.m105925i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        if (yVar.getType() == 1031) {
            ProgressDialog progressDialog = this.f109163g;
            C51150rs2 rs22 = null;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f109163g.dismiss();
                this.f109163g = null;
            }
            if (i == 0 && i2 == 0) {
                C47350c cVar = ((C45839q) yVar).f123770e;
                if (!(cVar == null || (aVar = cVar.f127056b.f127083a) == null)) {
                    rs22 = (C51150rs2) aVar;
                }
                LinkedList<C50869ps2> linkedList = rs22.f141113d;
                f109159h = linkedList;
                this.f109160d.removeAll();
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105920e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
                    mo63531H7(true);
                    return;
                }
                mo63531H7(false);
                Log.m105919d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBody options.size = %d", Integer.valueOf(linkedList.size()));
                Iterator<C50869ps2> it = linkedList.iterator();
                while (it.hasNext()) {
                    C50869ps2 next = it.next();
                    CheckBoxPreference checkBoxPreference = new CheckBoxPreference(this);
                    checkBoxPreference.f121290w = false;
                    checkBoxPreference.mo26273A(next.f139938d);
                    checkBoxPreference.mo69924H(next.f139939e);
                    checkBoxPreference.f24210J = next.f139940f == 0;
                    this.f109160d.mo72527k(checkBoxPreference);
                }
                this.f109160d.notifyDataSetChanged();
                Log.m105918d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBodyView finish");
                return;
            }
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.hso), 1).show();
            mo63531H7(true);
        } else if (yVar.getType() != 1030) {
        } else {
            if (i != 0 || i2 != 0) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.hsp), 0).show();
            }
        }
    }
}
