package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75355a0;
import di3.C86312j;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import ly2.C10679m;
import ly2.C10684p;
import ly2.C10685q;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C89132b;
import qo3.C89779i0;
import te3.C48909bv;
import wd3.C53155r0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro */
public class SettingsTeenModeIntro extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f21460g = 0;

    /* renamed from: d */
    public Button f21461d;

    /* renamed from: e */
    public CheckBox f21462e;

    /* renamed from: f */
    public TextView f21463f;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro$a */
    public class C5572a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro$a$a */
        public class C5573a implements C87581a<Object, C89132b.C89134c<C48909bv>> {

            /* renamed from: a */
            public final /* synthetic */ C89779i0 f21465a;

            public C5573a(C89779i0 i0Var) {
                this.f21465a = i0Var;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class<SettingsTeenModeMain> cls = SettingsTeenModeMain.class;
                Class<TeenModePrivatePwdUI> cls2 = TeenModePrivatePwdUI.class;
                this.f21465a.dismiss();
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C48909bv bvVar = (C48909bv) cVar.f256796d;
                    if (bvVar.f131322d) {
                        Intent intent = new Intent(SettingsTeenModeIntro.this, cls2);
                        intent.putExtra("intent_process", 1);
                        MMWizardActivity.m7018M7(SettingsTeenModeIntro.this, intent, new Intent(SettingsTeenModeIntro.this, cls));
                    } else if (bvVar.f131323e) {
                        Intent intent2 = new Intent(SettingsTeenModeIntro.this, cls2);
                        intent2.putExtra("intent_process", 3);
                        SettingsTeenModeIntro settingsTeenModeIntro = SettingsTeenModeIntro.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        SettingsTeenModeIntro settingsTeenModeIntro2 = settingsTeenModeIntro;
                        C117292a.m165358d(settingsTeenModeIntro2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        settingsTeenModeIntro.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(settingsTeenModeIntro2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        ((C10685q) C86312j.m106911c(C10685q.class)).mo10757ri(10);
                    } else {
                        Intent intent3 = new Intent(SettingsTeenModeIntro.this, TeenModeVerifyPwdUI.class);
                        intent3.putExtra("key_scenen", 3);
                        MMWizardActivity.m7018M7(SettingsTeenModeIntro.this, intent3, new Intent(SettingsTeenModeIntro.this, cls));
                    }
                    C119179t tVar = C119157j.f356862d;
                    C5626b bVar = new C5626b(this);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183886q(bVar, 200, (String) null);
                }
                return null;
            }
        }

        public C5572a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C89779i0 Q = C76879j.m92723Q(SettingsTeenModeIntro.this.getContext(), "", SettingsTeenModeIntro.this.getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
            C89059e i = new C10679m().mo9225i();
            i.mo11397F(SettingsTeenModeIntro.this);
            i.mo123062e(new C5573a(Q));
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro$b */
    public class C5574b implements CompoundButton.OnCheckedChangeListener {
        public C5574b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                SettingsTeenModeIntro.this.f21461d.setEnabled(true);
            } else {
                SettingsTeenModeIntro.this.f21461d.setEnabled(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro$c */
    public class C5575c extends C10684p {
        public C5575c(int i, C53155r0 r0Var) {
            super(i, r0Var);
        }

        /* renamed from: a */
        public void mo6600a(View view) {
            SettingsTeenModeIntro settingsTeenModeIntro = SettingsTeenModeIntro.this;
            int i = SettingsTeenModeIntro.f21460g;
            settingsTeenModeIntro.getClass();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=weixin_agreement&s=teens_mode_agreement&lang=zh_CN");
            C88144b.m109791i(settingsTeenModeIntro, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro$d */
    public class C5576d implements MenuItem.OnMenuItemClickListener {
        public C5576d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeIntro.this.onBackPressed();
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359974by1;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        Button button = (Button) findViewById(C0966R.C0970id.kg4);
        this.f21461d = button;
        button.setEnabled(false);
        this.f21461d.setOnClickListener(new C5572a());
        CheckBox checkBox = (CheckBox) findViewById(C0966R.C0970id.fj7);
        this.f21462e = checkBox;
        Util.expandViewTouchArea(checkBox, 250, 250, 250, 250);
        this.f21462e.setOnCheckedChangeListener(new C5574b());
        String string = getString(C0966R.string.jws);
        String string2 = getString(C0966R.string.jwt);
        int lastIndexOf = string.lastIndexOf(string2);
        if (lastIndexOf >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new C5575c(1, (C53155r0) null), lastIndexOf, string2.length() + lastIndexOf, 18);
            TextView textView = (TextView) findViewById(C0966R.C0970id.fj8);
            this.f21463f = textView;
            textView.setOnTouchListener(new C75355a0(this));
            this.f21463f.setClickable(true);
            this.f21463f.setText(spannableStringBuilder);
            setBackBtn(new C5576d());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        initView();
    }

    public void onPointerCaptureChanged(boolean z) {
    }
}
