package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gt1.C20838b;
import ie3.C76324c;
import in3.C87771d;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import ly2.C10685q;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import ny2.C11317s;
import ny2.C11318t;
import ny2.C11321u;
import ny2.r$$a;
import ny2.r$$b;
import oa1.C117731d;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import tc0.C77885p;
import te3.C51018qv3;
import te3.C64266br1;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain */
public class SettingsTeenModeMain extends MMActivity {

    /* renamed from: x */
    public static final /* synthetic */ int f21470x = 0;

    /* renamed from: d */
    public View f21471d;

    /* renamed from: e */
    public C77407n f21472e;

    /* renamed from: f */
    public RelativeLayout f21473f;

    /* renamed from: g */
    public RelativeLayout f21474g;

    /* renamed from: h */
    public RelativeLayout f21475h;

    /* renamed from: i */
    public TextView f21476i;

    /* renamed from: j */
    public View f21477j;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: n */
    public byte[] f21478n;

    /* renamed from: o */
    public RelativeLayout f21479o;

    /* renamed from: p */
    public RelativeLayout f21480p;

    /* renamed from: q */
    public TextView f21481q;

    /* renamed from: r */
    public TextView f21482r;

    /* renamed from: s */
    public TextView f21483s;

    /* renamed from: t */
    public int f21484t = 0;

    /* renamed from: u */
    public int f21485u = 0;

    /* renamed from: v */
    public int f21486v = 0;

    /* renamed from: w */
    public View f21487w;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$a */
    public class C5577a implements View.OnClickListener {
        public C5577a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 2);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$b */
    public class C5578b implements View.OnClickListener {
        public C5578b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 3);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$c */
    public class C5579c implements View.OnClickListener {
        public C5579c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 4);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$d */
    public class C5580d implements View.OnClickListener {
        public C5580d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 8);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$e */
    public class C5581e implements View.OnClickListener {
        public C5581e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 5);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$f */
    public class C5582f implements View.OnClickListener {
        public C5582f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 6);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$15", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$15", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$g */
    public class C5583g implements View.OnClickListener {
        public C5583g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 10);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$16", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$16", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$h */
    public class C5584h implements View.OnClickListener {
        public C5584h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 7);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$17", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$17", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$i */
    public class C5585i implements View.OnClickListener {
        public C5585i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            int i = SettingsTeenModeMain.f21470x;
            settingsTeenModeMain.getClass();
            settingsTeenModeMain.f21472e = new C77407n((Context) settingsTeenModeMain, 1, true);
            TextView textView = new TextView(settingsTeenModeMain.getContext());
            textView.setGravity(17);
            textView.setHeight(C76577a.m92151b(settingsTeenModeMain.getContext(), 40));
            textView.setTextSize(12.0f);
            textView.setTextColor(settingsTeenModeMain.getResources().getColor(C0966R.color.FG_1));
            textView.setText(settingsTeenModeMain.getString(C0966R.string.jwl));
            settingsTeenModeMain.f21472e.mo107569n(textView, false);
            C77407n nVar = settingsTeenModeMain.f21472e;
            nVar.f225771i = new C11317s(settingsTeenModeMain);
            nVar.f225782p = new C11318t(settingsTeenModeMain);
            nVar.f225774j1 = true;
            nVar.f225779n1 = true;
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$j */
    public class C5586j implements MenuItem.OnMenuItemClickListener {
        public C5586j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeMain.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$k */
    public class C5587k implements View.OnScrollChangeListener {
        public C5587k() {
        }

        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view.getScrollY() > C76577a.m92151b(SettingsTeenModeMain.this.getContext(), 144)) {
                SettingsTeenModeMain.this.setMMTitle((int) C0966R.string.j0p);
                SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
                settingsTeenModeMain.setActionbarColor(settingsTeenModeMain.getResources().getColor(C0966R.color.al6));
                SettingsTeenModeMain.this.supportLightStatusBar();
                return;
            }
            SettingsTeenModeMain.this.setMMTitle("");
            SettingsTeenModeMain settingsTeenModeMain2 = SettingsTeenModeMain.this;
            settingsTeenModeMain2.setActionbarColor(settingsTeenModeMain2.getResources().getColor(C0966R.color.ahf));
            SettingsTeenModeMain settingsTeenModeMain3 = SettingsTeenModeMain.this;
            settingsTeenModeMain3.setActionbarElementColor(settingsTeenModeMain3.getContext().getResources().getColor(C0966R.color.FG_0));
            SettingsTeenModeMain.this.supportLightStatusBar();
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$l */
    public class C5588l implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$l$a */
        public class C5589a implements C11182m0 {
            public C5589a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                if (((C10685q) C86312j.m106911c(C10685q.class)).f32106f != null) {
                    e0Var.mo107142f(0, SettingsTeenModeMain.this.getString(C0966R.string.jy4));
                    e0Var.mo107142f(1, SettingsTeenModeMain.this.getString(C0966R.string.jxr));
                    return;
                }
                e0Var.mo107142f(2, SettingsTeenModeMain.this.getString(C0966R.string.jxy));
            }
        }

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$l$b */
        public class C5590b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$l$b$a */
            public class C5591a implements C47883u {
                public C5591a() {
                }

                /* renamed from: a */
                public void mo353a(boolean z, String str) {
                    if (z) {
                        Intent intent = new Intent(SettingsTeenModeMain.this.getContext(), TeenModePrivatePwdUI.class);
                        intent.putExtra("intent_process", 5);
                        SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
                        C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$20$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$20$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }

            public C5590b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Class<TeenModePrivatePwdUI> cls = TeenModePrivatePwdUI.class;
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Intent intent = new Intent(SettingsTeenModeMain.this, cls);
                    intent.putExtra("intent_process", 1);
                    intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                    Intent intent2 = new Intent(SettingsTeenModeMain.this, cls);
                    intent2.putExtra("intent_process", 2);
                    intent2.putExtra("WizardRootClass", "com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain");
                    MMWizardActivity.m7018M7(SettingsTeenModeMain.this, intent, intent2);
                } else if (itemId == 1) {
                    C77426q qVar = new C77426q(SettingsTeenModeMain.this.getContext());
                    qVar.mo107606r(SettingsTeenModeMain.this.getString(C0966R.string.jxu));
                    qVar.mo107595g(SettingsTeenModeMain.this.getString(C0966R.string.jxs));
                    qVar.mo107601m(C0966R.string.jxt);
                    qVar.mo107599k(SettingsTeenModeMain.this.getContext().getResources().getColor(C0966R.color.a_3));
                    qVar.mo107590b(new C5591a());
                    qVar.mo107603o();
                } else if (itemId == 2) {
                    Intent intent3 = new Intent(SettingsTeenModeMain.this.getContext(), cls);
                    intent3.putExtra("intent_process", 3);
                    intent3.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                    SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
                    C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$20$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$20$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((C10685q) C86312j.m106911c(C10685q.class)).mo10757ri(18);
                }
            }
        }

        public C5588l() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) SettingsTeenModeMain.this.getContext(), 1, false);
            nVar.f225771i = new C5589a();
            nVar.f225782p = new C5590b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$m */
    public class C5592m implements View.OnClickListener {
        public C5592m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, BindGuardianUI.class);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$n */
    public class C5593n implements View.OnClickListener {
        public C5593n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainFinder.class);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$o */
    public class C5594o implements View.OnClickListener {
        public C5594o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 9);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$p */
    public class C5595p implements View.OnClickListener {
        public C5595p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 9);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$q */
    public class C5596q implements View.OnClickListener {
        public C5596q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainBizAcct.class);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$r */
    public class C5597r implements View.OnClickListener {
        public C5597r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainMiniProgram.class);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$s */
    public class C5598s implements View.OnClickListener {
        public C5598s() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsTeenModeMain.this, SettingsTeenModeMainOther.class);
            intent.putExtra("biz_type", 1);
            SettingsTeenModeMain settingsTeenModeMain = SettingsTeenModeMain.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsTeenModeMain settingsTeenModeMain2 = settingsTeenModeMain;
            C117292a.m165358d(settingsTeenModeMain2, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsTeenModeMain.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsTeenModeMain2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo6602H7() {
        findViewById(C0966R.C0970id.esb).setOnClickListener(new C5592m());
        C72996z1 BD = ((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD();
        TextView textView = (TextView) findViewById(C0966R.C0970id.esc);
        if (BD != null) {
            textView.setText(BD.mo62898f());
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: I7 */
    public final void mo6603I7(boolean z) {
        Class cls = C10432i.class;
        if (this.f21481q != null) {
            int Mn = ((C10432i) C86312j.m106911c(cls)).mo10740Mn();
            if (z) {
                this.f21484t = Mn;
            }
            if (Mn == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
            } else if (Mn == 1) {
                this.f21481q.setText(SettingsTeenModeMainFinder.m5448H7());
            } else if (Mn != 2) {
                this.f21481q.setText("");
            }
            this.f21481q.setText(SettingsTeenModeMainFinder.m5449I7());
        }
        if (this.f21482r != null) {
            int fd = ((C10432i) C86312j.m106911c(cls)).mo10751fd();
            if (z) {
                this.f21485u = fd;
            }
            if (fd == 0) {
                this.f21482r.setText(C0966R.string.jxj);
            } else if (fd == 1) {
                this.f21482r.setText(C0966R.string.jxm);
            } else if (fd != 2) {
                this.f21482r.setText("");
            } else {
                this.f21482r.setText(C0966R.string.jxo);
            }
        }
        if (this.f21483s != null) {
            int Oh0 = ((C10432i) C86312j.m106911c(cls)).Oh0();
            if (z) {
                this.f21486v = Oh0;
            }
            if (Oh0 == 0) {
                this.f21483s.setText(C0966R.string.jwx);
            } else if (Oh0 == 1) {
                this.f21483s.setText(C0966R.string.jxm);
            } else if (Oh0 != 2) {
                this.f21483s.setText("");
            } else {
                this.f21483s.setText(C0966R.string.jww);
            }
        }
        this.f21479o.setVisibility(0);
        this.f21480p.setVisibility(8);
    }

    /* renamed from: J7 */
    public final void mo6604J7() {
        String f = C117731d.m166007c().mo182444f("clicfg_teenager_mode_pay_limit_open_android", "", false, false);
        if (!(!Util.isNullOrNil(f) && Util.getInt(f, 0) != 0) ? false : C75592q0.m90761I()) {
            this.f21475h.setVisibility(0);
            ((C76324c) C86312j.m106911c(C76324c.class)).startTeenagerPayGetDetail(this, new r$$b(this));
            return;
        }
        this.f21475h.setVisibility(8);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359975by2;
    }

    public void initView() {
        Class cls = C10432i.class;
        Class cls2 = C10685q.class;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC;
        boolean nullAsFalse = Util.nullAsFalse(Boolean.valueOf(i.mo119686g(aVar, false)));
        if (!nullAsFalse) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            ((C10432i) C86312j.m106911c(cls)).I40();
            new FinderTeenModeChangeEvent().publish();
        }
        boolean nullAsFalse2 = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_ALREADY_SWITCH_OFF_BOOLEAN, false)));
        if (!nullAsFalse && nullAsFalse2) {
            ((C10432i) C86312j.m106911c(cls)).mo10757ri(5);
        }
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 59;
        br12.f182325e = 1;
        if (((C10685q) C86312j.m106911c(cls2)).f32106f != null) {
            C51018qv3 qv32 = new C51018qv3();
            br12.f182326f = qv32;
            qv32.mo73350k(((C10685q) C86312j.m106911c(cls2)).f32106f.getBytes());
        }
        br12.f182327g = ((C10685q) C86312j.m106911c(cls2)).f32107g;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        this.f21481q = (TextView) findViewById(C0966R.C0970id.kg8);
        ((RelativeLayout) findViewById(C0966R.C0970id.e2q)).setOnClickListener(new C5593n());
        this.f21473f = (RelativeLayout) findViewById(C0966R.C0970id.dqe);
        this.f21474g = (RelativeLayout) findViewById(C0966R.C0970id.dqf);
        if (((C20838b) C86312j.m106911c(C20838b.class)).mo32539RP()) {
            this.f21473f.setVisibility(8);
            this.f21474g.setVisibility(0);
        } else {
            this.f21473f.setVisibility(0);
            this.f21474g.setVisibility(8);
        }
        this.f21473f.setOnClickListener(new C5594o());
        this.f21474g.setOnClickListener(new C5595p());
        this.f21475h = (RelativeLayout) findViewById(C0966R.C0970id.muh);
        this.f21476i = (TextView) findViewById(C0966R.C0970id.mwn);
        View findViewById = findViewById(C0966R.C0970id.mwo);
        this.f21477j = findViewById;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f21476i.setVisibility(8);
        mo6604J7();
        this.f21475h.setOnClickListener(new r$$a(this));
        this.f21482r = (TextView) findViewById(C0966R.C0970id.kgb);
        ((RelativeLayout) findViewById(C0966R.C0970id.h0k)).setOnClickListener(new C5596q());
        this.f21483s = (TextView) findViewById(C0966R.C0970id.kg5);
        ((RelativeLayout) findViewById(C0966R.C0970id.f5938st)).setOnClickListener(new C5597r());
        ((RelativeLayout) findViewById(C0966R.C0970id.krz)).setOnClickListener(new C5598s());
        ((RelativeLayout) findViewById(C0966R.C0970id.c7i)).setOnClickListener(new C5577a());
        ((RelativeLayout) findViewById(C0966R.C0970id.ei_)).setOnClickListener(new C5578b());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.hai);
        this.f21479o = relativeLayout;
        relativeLayout.setOnClickListener(new C5579c());
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C0966R.C0970id.haj);
        this.f21480p = relativeLayout2;
        relativeLayout2.setOnClickListener(new C5580d());
        ((RelativeLayout) findViewById(C0966R.C0970id.jfs)).setOnClickListener(new C5581e());
        ((RelativeLayout) findViewById(C0966R.C0970id.jjo)).setOnClickListener(new C5582f());
        findViewById(C0966R.C0970id.chw).setOnClickListener(new C5583g());
        ((RelativeLayout) findViewById(C0966R.C0970id.log)).setOnClickListener(new C5584h());
        View findViewById2 = findViewById(C0966R.C0970id.bey);
        this.f21471d = findViewById2;
        findViewById2.setOnClickListener(new C5585i());
        setBackBtn(new C5586j());
        mo6603I7(true);
        mo6602H7();
        addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C5588l());
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        customfixStatusbar(true);
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.f5383do);
        this.f21487w = findViewById;
        if (findViewById != null && C87771d.f254121g) {
            C87771d b = C87771d.m109203b(this);
            C11321u uVar = new C11321u(this);
            this.mStatusBarHeightCallback = uVar;
            b.mo122180d(uVar);
            getWindow().getDecorView().requestApplyInsets();
            C87773e.m109211d(getWindow());
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        setActionbarElementColor(getContext().getResources().getColor(C0966R.color.FG_0));
        initView();
        if (getIntent().getBooleanExtra("intent_close_me", false)) {
            finish();
        }
        supportLightStatusBar();
        ((ScrollView) findViewById(C0966R.C0970id.br6)).setOnScrollChangeListener(new C5587k());
    }

    public void onDestroy() {
        Class cls = C10432i.class;
        boolean z = true;
        if (!((this.f21484t != ((C10432i) C86312j.m106911c(cls)).mo10740Mn()) || this.f21485u != ((C10432i) C86312j.m106911c(cls)).mo10751fd()) && this.f21486v == ((C10432i) C86312j.m106911c(cls)).mo10751fd()) {
            z = false;
        }
        if (z) {
            ((C10432i) C86312j.m106911c(cls)).mo10757ri(3);
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        mo6603I7(false);
        mo6602H7();
        mo6604J7();
    }

    public void setActionbarColor(int i) {
        super.setActionbarColor(i);
        View view = this.f21487w;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
            C87773e.m109211d(getWindow());
        }
    }
}
