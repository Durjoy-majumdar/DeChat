package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import di3.C86312j;
import f40.C86709a0;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;
import p286zl.C79396l;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI */
public class BindMContactStatusUI extends MMWizardActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f10535i = 0;

    /* renamed from: e */
    public ImageView f10536e;

    /* renamed from: f */
    public TextView f10537f;

    /* renamed from: g */
    public TextView f10538g;

    /* renamed from: h */
    public Button f10539h;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI$a */
    public class C1356a implements View.OnClickListener {
        public C1356a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobilePolicyUI.m161790T7();
            Intent intent = BindMContactStatusUI.this.getIntent();
            int i = BindMContactStatusUI.f10535i;
            if (intent.getBooleanExtra("intent_back_launcherui", false)) {
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent2, BindMContactStatusUI.this);
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            BindMContactStatusUI.this.mo7681K7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6574iq;
    }

    public void initView() {
        this.f10536e = (ImageView) findViewById(C0966R.C0970id.a9l);
        this.f10537f = (TextView) findViewById(C0966R.C0970id.a9j);
        this.f10538g = (TextView) findViewById(C0966R.C0970id.a9h);
        this.f10539h = (Button) findViewById(C0966R.C0970id.a9k);
        if (C76186t.m91534b() == C79396l.SUCC) {
            this.f10536e.setImageResource(C0966R.raw.mobile_binded_icon);
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            if (str == null || str.equals("")) {
                str = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
            }
            this.f10538g.setText(getString(C0966R.string.akm));
            this.f10537f.setText(getString(C0966R.string.alb, new Object[]{str}));
        } else {
            this.f10536e.setImageResource(C0966R.raw.mobile_unbind_icon);
            this.f10538g.setText(C0966R.string.aky);
            this.f10537f.setText(C0966R.string.aky);
            this.f10538g.setVisibility(8);
        }
        this.f10539h.setOnClickListener(new C1356a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.akq);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (getIntent().getBooleanExtra("intent_back_launcherui", false)) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, this);
            return true;
        }
        mo7681K7(1);
        return true;
    }
}
