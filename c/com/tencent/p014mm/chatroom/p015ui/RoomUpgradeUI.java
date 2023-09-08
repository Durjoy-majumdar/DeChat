package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import em0.C86570p;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p203mi.C10891r;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI */
public class RoomUpgradeUI extends MMActivity implements C11385n {

    /* renamed from: x */
    public static final /* synthetic */ int f10181x = 0;

    /* renamed from: d */
    public String f10182d;

    /* renamed from: e */
    public ProgressDialog f10183e = null;

    /* renamed from: f */
    public TextView f10184f;

    /* renamed from: g */
    public View f10185g;

    /* renamed from: h */
    public View f10186h;

    /* renamed from: i */
    public ImageView f10187i;

    /* renamed from: j */
    public TextView f10188j;

    /* renamed from: n */
    public TextView f10189n;

    /* renamed from: o */
    public TextView f10190o;

    /* renamed from: p */
    public TextView f10191p;

    /* renamed from: q */
    public C10891r f10192q;

    /* renamed from: r */
    public C44661m1 f10193r;

    /* renamed from: s */
    public String f10194s;

    /* renamed from: t */
    public int f10195t;

    /* renamed from: u */
    public int f10196u;

    /* renamed from: v */
    public boolean f10197v;

    /* renamed from: w */
    public boolean f10198w;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI$a */
    public class C1190a implements MenuItem.OnMenuItemClickListener {
        public C1190a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RoomUpgradeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI$b */
    public class C1191b implements View.OnClickListener {
        public C1191b() {
        }

        public void onClick(View view) {
            Class<RoomAnnouncementUI> cls = RoomAnnouncementUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomUpgradeUI roomUpgradeUI = RoomUpgradeUI.this;
            int i = roomUpgradeUI.f10196u;
            if (i != 1) {
                if (i == 2 || i == 5) {
                    if (roomUpgradeUI.f10198w) {
                        roomUpgradeUI.mo1093H7();
                    } else {
                        Intent intent = new Intent(roomUpgradeUI, cls);
                        intent.putExtra("need_bind_mobile", false);
                        intent.putExtra("RoomInfo_Id", roomUpgradeUI.f10182d);
                        roomUpgradeUI.startActivityForResult(intent, 600);
                    }
                }
            } else if (roomUpgradeUI.f10198w) {
                C1226y1.m1351a(roomUpgradeUI, roomUpgradeUI.f10182d, true);
            } else {
                Intent intent2 = new Intent(roomUpgradeUI, cls);
                intent2.putExtra("need_bind_mobile", true);
                intent2.putExtra("RoomInfo_Id", roomUpgradeUI.f10182d);
                roomUpgradeUI.startActivityForResult(intent2, 600);
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI$c */
    public class C1192c implements View.OnClickListener {
        public C1192c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (RoomUpgradeUI.this.f10184f.getVisibility() == 0) {
                Intent intent = new Intent();
                RoomUpgradeUI roomUpgradeUI = RoomUpgradeUI.this;
                roomUpgradeUI.f10194s = roomUpgradeUI.getString(C0966R.string.b5y, new Object[]{LocaleUtil.getApplicationLanguage()});
                intent.putExtra("rawUrl", RoomUpgradeUI.this.f10194s);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                intent.putExtra("showShare", false);
                C88144b.m109795m(RoomUpgradeUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 500);
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI$d */
    public class C1193d implements DialogInterface.OnClickListener {
        public C1193d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RoomUpgradeUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo1093H7() {
        Intent intent = new Intent(this, RoomAlphaProcessUI.class);
        intent.addFlags(67108864);
        intent.addFlags(65536);
        intent.putExtra("RoomInfo_Id", this.f10182d);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public void mo1094I7() {
        String stringExtra = getIntent().getStringExtra("room_name");
        this.f10182d = stringExtra;
        Log.m105925i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", stringExtra);
        C86709a0.m107529k().f251779b.mo123455a(C86570p.CTRL_INDEX, this);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f10182d);
        this.f10193r = Lo;
        if (Lo == null) {
            finish();
            return;
        }
        this.f10197v = C75592q0.m90789s().equals(this.f10193r.field_roomowner);
        this.f10198w = !LocaleUtil.isSimplifiedChineseAppLang();
    }

    /* renamed from: J7 */
    public final void mo1095J7(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        String str2 = null;
        String n2 = (z1Var == null || ((int) z1Var.f108320R1) <= 0) ? null : z1Var.mo73969n2();
        if (Util.isNullOrNil(n2)) {
            C44661m1 m1Var = this.f10193r;
            if (m1Var != null) {
                str2 = m1Var.mo69789q2(str);
            }
            n2 = str2;
        }
        if (Util.isNullOrNil(n2) && z1Var != null && ((int) z1Var.f108320R1) > 0) {
            n2 = z1Var.mo62909j3();
        }
        if (Util.isNullOrNil(n2)) {
            n2 = str;
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f10187i, str);
        this.f10188j.setVisibility(0);
        this.f10188j.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(this, n2, (int) this.f10188j.getTextSize()));
    }

    /* renamed from: K7 */
    public final void mo1096K7() {
        String str = this.f10193r.field_roomowner;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) > 0) {
            mo1095J7(str);
        } else {
            C31519v2.m39436a().mo55988e(str, this.f10182d, new C1202a2(this, str));
        }
        int o2 = this.f10193r.mo69787o2();
        this.f10189n.setVisibility(0);
        if (o2 <= 40) {
            this.f10189n.setText(getString(C0966R.string.i_1, new Object[]{getString(C0966R.string.i9v)}));
            return;
        }
        this.f10189n.setText(getString(C0966R.string.i_1, new Object[]{getString(C0966R.string.i9u)}));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6822ph;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i9t);
        setBackBtn(new C1190a());
        this.f10185g = findViewById(C0966R.C0970id.l0z);
        this.f10186h = findViewById(C0966R.C0970id.f359463l11);
        this.f10187i = (ImageView) findViewById(C0966R.C0970id.l0y);
        this.f10188j = (TextView) findViewById(C0966R.C0970id.f359462l10);
        this.f10189n = (TextView) findViewById(C0966R.C0970id.l0v);
        this.f10191p = (TextView) findViewById(C0966R.C0970id.l0w);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l0u);
        this.f10190o = textView;
        textView.setOnClickListener(new C1191b());
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.exk);
        this.f10184f = textView2;
        textView2.setOnClickListener(new C1192c());
        if (this.f10197v) {
            this.f10183e = C76879j.m92723Q(this, (String) null, getString(C0966R.string.gas), true, true, new C1209b2(this));
            this.f10192q = new C10891r(this.f10182d);
            C86709a0.m107529k().f251779b.mo123460f(this.f10192q);
        } else {
            mo1096K7();
            if (!this.f10198w) {
                this.f10184f.setVisibility(0);
            }
            this.f10184f.setText(C0966R.string.i9w);
            this.f10190o.setVisibility(8);
            this.f10191p.setVisibility(8);
        }
        if (this.f10198w) {
            this.f10184f.setVisibility(8);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105918d("MicroMsg.RoomUpgradeProductsUI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        if (i != 400) {
            Log.m105920e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo1094I7();
        initView();
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123458d(this.f10192q);
        C86709a0.m107529k().f251779b.mo123470p(C86570p.CTRL_INDEX, this);
        ProgressDialog progressDialog = this.f10183e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        boolean z;
        if (intent.hasExtra("upgrade_success")) {
            z = intent.getBooleanExtra("upgrade_success", false);
        } else {
            if (intent.hasExtra("wizard_activity_result_code") && intent.getIntExtra("wizard_activity_result_code", -1) == -1) {
                mo1093H7();
            }
            if (intent.hasExtra("announce_ok")) {
                mo1093H7();
            }
            z = false;
        }
        if (z) {
            mo1094I7();
            int intExtra = intent.getIntExtra("left_quota", 0);
            mo1096K7();
            this.f10190o.setVisibility(8);
            this.f10195t = intExtra;
            if (intExtra > 0) {
                this.f10191p.setText(getString(C0966R.string.i9z, new Object[]{Integer.valueOf(intExtra)}));
            } else {
                this.f10191p.setText(getString(C0966R.string.i_0));
            }
            if (!this.f10198w) {
                this.f10184f.setVisibility(0);
            }
            this.f10184f.setText(C0966R.string.i9w);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.RoomUpgradeProductsUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f10183e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i != 0 || i2 != 0) {
            C76879j.m92713G(this, getString(C0966R.string.i9y), getString(C0966R.string.a3h), false, new C1193d());
        } else if (i == 0 && i2 == 0 && yVar.getType() == 519) {
            C10891r rVar = (C10891r) yVar;
            this.f10196u = rVar.f32512f;
            this.f10195t = rVar.f32513g;
            mo1096K7();
            this.f10191p.setVisibility(0);
            this.f10190o.setText(getString(C0966R.string.i9s));
            int i3 = this.f10195t;
            if (i3 > 0) {
                this.f10191p.setText(getString(C0966R.string.i9z, new Object[]{Integer.valueOf(i3)}));
            } else {
                this.f10191p.setText(getString(C0966R.string.i_0));
            }
            if (!this.f10198w) {
                this.f10184f.setVisibility(0);
            }
            switch (this.f10196u) {
                case 1:
                case 2:
                case 5:
                    this.f10190o.setVisibility(0);
                    this.f10184f.setText(C0966R.string.i9x);
                    return;
                case 3:
                case 4:
                case 6:
                    this.f10190o.setVisibility(0);
                    this.f10190o.setEnabled(false);
                    this.f10184f.setText(C0966R.string.i9x);
                    return;
                case 7:
                    this.f10190o.setVisibility(8);
                    this.f10184f.setText(C0966R.string.i9w);
                    this.f10190o.setEnabled(false);
                    return;
                default:
                    return;
            }
        }
    }
}
