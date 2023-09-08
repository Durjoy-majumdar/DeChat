package com.tencent.p014mm.plugin.expt.p472ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.List;
import la1.C61258b;

/* renamed from: com.tencent.mm.plugin.expt.ui.KvInfoUI */
public class KvInfoUI extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f158368j = 0;

    /* renamed from: d */
    public EditText f158369d;

    /* renamed from: e */
    public ListView f158370e;

    /* renamed from: f */
    public ArrayAdapter f158371f;

    /* renamed from: g */
    public TextView f158372g;

    /* renamed from: h */
    public MMSwitchBtn f158373h;

    /* renamed from: i */
    public String f158374i;

    /* renamed from: H7 */
    public final void mo77152H7(String str) {
        Log.m105925i("MicroMsg.KvInfoUI", "updateData new[%s] old[%s]", str, this.f158374i);
        this.f158374i = str;
        List list = C61258b.vx0().f174353f.get(this.f158374i);
        if (list != null) {
            TextView textView = this.f158372g;
            textView.setText(this.f158374i + XVFSFile.PATH_SEPARATOR + list.size());
            this.f158371f.setNotifyOnChange(false);
            this.f158371f.clear();
            this.f158371f.addAll(list);
            this.f158371f.notifyDataSetChanged();
            return;
        }
        TextView textView2 = this.f158372g;
        textView2.setText(this.f158374i + XVFSFile.PATH_SEPARATOR + 0);
        this.f158371f.clear();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3j;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Debug show kv log");
        setBackBtn(new C55649o(this));
        this.f158369d = (EditText) mo176895$(C0966R.C0970id.f7r);
        this.f158372g = (TextView) mo176895$(C0966R.C0970id.j_6);
        ((Button) mo176895$(C0966R.C0970id.g57)).setOnClickListener(new C55650p(this));
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) mo176895$(C0966R.C0970id.bzi);
        this.f158373h = mMSwitchBtn;
        mMSwitchBtn.setCheck(C61258b.vx0().f174352e);
        this.f158373h.setSwitchListener(new C55652q(this));
        ((Button) mo176895$(C0966R.C0970id.f357756bl2)).setOnClickListener(new C55653r(this));
        this.f158370e = (ListView) mo176895$(C0966R.C0970id.fgp);
        C55654s sVar = new C55654s(this, this, C0966R.C0971layout.b3k, C0966R.C0970id.fgo);
        this.f158371f = sVar;
        this.f158370e.setAdapter(sVar);
    }

    public void onDestroy() {
        ArrayAdapter arrayAdapter = this.f158371f;
        if (arrayAdapter != null) {
            arrayAdapter.setNotifyOnChange(false);
            this.f158371f.clear();
        }
        hideVKB();
        super.onDestroy();
    }

    public void onResume() {
        if (!Util.isNullOrNil(this.f158374i)) {
            mo77152H7(this.f158374i);
        }
        super.onResume();
    }
}
