package com.tencent.p014mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import av0.C16686a;
import av0.C16710c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cv0.C20369i;
import cv0.C20370j;
import di3.C86312j;
import gv0.C20842c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import nj3.C76879j;
import nj3.C88989a;
import p214om.C11502f;
import yu0.C102909e;
import yu0.C102911g;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI */
public class BackupMoveUI extends MMWizardActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f50057o = 0;

    /* renamed from: e */
    public TextView f50058e;

    /* renamed from: f */
    public TextView f50059f;

    /* renamed from: g */
    public TextView f50060g;

    /* renamed from: h */
    public TextView f50061h;

    /* renamed from: i */
    public TextView f50062i;

    /* renamed from: j */
    public ImageView f50063j;

    /* renamed from: n */
    public C102909e f50064n = new C18108a();

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI$a */
    public class C18108a implements C102909e {

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI$a$a */
        public class C18109a implements View.OnClickListener {
            public C18109a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C16686a.m16193i().mo17660h().mo37036e();
                C16686a.m16193i().mo17662k().mo17701e(true);
                C16686a.m16193i().mo142622e().mo142628f(-100);
                BackupMoveUI backupMoveUI = BackupMoveUI.this;
                int i = BackupMoveUI.f50057o;
                backupMoveUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C18108a() {
        }

        /* renamed from: K */
        public void mo17667K(int i) {
            C102911g e = C16686a.m16193i().mo142622e();
            Log.m105925i("MicroMsg.BackupMoveUI", "onUpdateUIProgress state:%d, transferSession:%d, totalSession:%d", Integer.valueOf(i), Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c));
            if (i == -100) {
                BackupMoveUI backupMoveUI = BackupMoveUI.this;
                int i2 = BackupMoveUI.f50057o;
                backupMoveUI.mo7681K7(1);
            } else if (i == -23) {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveUI.this.f50060g.setText(C0966R.string.aak);
                BackupMoveUI.this.f50061h.setVisibility(4);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            } else if (i == -21) {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveUI.this.f50060g.setText(C0966R.string.aaz);
                BackupMoveUI.this.f50061h.setVisibility(4);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            } else if (i == -11) {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.raw.backup_move_qrcode_dark);
                BackupMoveUI backupMoveUI2 = BackupMoveUI.this;
                backupMoveUI2.f50060g.setText(backupMoveUI2.getString(C0966R.string.ab7, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), "0M"}));
                BackupMoveUI.this.f50061h.setText(C0966R.string.aap);
                BackupMoveUI backupMoveUI3 = BackupMoveUI.this;
                backupMoveUI3.f50061h.setTextColor(backupMoveUI3.getContext().getResources().getColor(C0966R.color.a_0));
                BackupMoveUI.this.f50061h.setVisibility(0);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            } else if (i == -4) {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.raw.backup_move_qrcode_dark);
                C16686a.m16193i().mo17662k().f45196q.mo75111c((String) null, (String) null);
                BackupMoveUI backupMoveUI4 = BackupMoveUI.this;
                backupMoveUI4.f50060g.setText(backupMoveUI4.getString(C0966R.string.ab7, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), "0M"}));
                BackupMoveUI.this.f50061h.setText(C0966R.string.aar);
                BackupMoveUI backupMoveUI5 = BackupMoveUI.this;
                backupMoveUI5.f50061h.setTextColor(backupMoveUI5.getContext().getResources().getColor(C0966R.color.a_0));
                BackupMoveUI.this.f50061h.setVisibility(0);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI backupMoveUI6 = BackupMoveUI.this;
                backupMoveUI6.f50062i.setText(C0966R.string.f360130aa1);
                backupMoveUI6.f50062i.setOnClickListener(new C20370j(backupMoveUI6));
                C16686a.m16193i().mo17662k().f45185f = 1;
            } else if (i == 1) {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv9);
                BackupMoveUI.this.f50060g.setText(C0966R.string.aa_);
                BackupMoveUI.this.f50061h.setText(C0966R.string.ab6);
                BackupMoveUI.this.f50061h.setVisibility(0);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            } else if (i == 51) {
                byte[] bArr = C16686a.m16193i().mo17662k().f45195p;
                BackupMoveUI.this.f50063j.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                BackupMoveUI.this.f50060g.setText(C0966R.string.abf);
                BackupMoveUI backupMoveUI7 = BackupMoveUI.this;
                backupMoveUI7.f50060g.setTextColor(backupMoveUI7.getContext().getResources().getColor(C0966R.color.a7f));
                BackupMoveUI.this.f50061h.setVisibility(4);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            } else if (i == 3) {
                BackupMoveUI.this.finish();
            } else if (i != 4) {
                switch (i) {
                    case 12:
                        BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv9);
                        BackupMoveUI.this.f50060g.setText(C0966R.string.abc);
                        BackupMoveUI.this.f50061h.setText(C0966R.string.ab6);
                        BackupMoveUI backupMoveUI8 = BackupMoveUI.this;
                        backupMoveUI8.f50061h.setTextColor(backupMoveUI8.getResources().getColor(C0966R.color.f3115fr));
                        BackupMoveUI.this.f50061h.setVisibility(0);
                        BackupMoveUI.this.f50058e.setVisibility(4);
                        BackupMoveUI.this.f50059f.setVisibility(4);
                        BackupMoveUI.m18715N7(BackupMoveUI.this);
                        return;
                    case 13:
                        BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv9);
                        BackupMoveUI backupMoveUI9 = BackupMoveUI.this;
                        backupMoveUI9.f50060g.setText(backupMoveUI9.getString(C0966R.string.f360134aa3, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c)}));
                        BackupMoveUI.this.f50061h.setText(C0966R.string.ab6);
                        BackupMoveUI backupMoveUI10 = BackupMoveUI.this;
                        backupMoveUI10.f50061h.setTextColor(backupMoveUI10.getResources().getColor(C0966R.color.f3115fr));
                        BackupMoveUI.this.f50061h.setVisibility(0);
                        BackupMoveUI.this.f50058e.setVisibility(4);
                        BackupMoveUI.this.f50059f.setVisibility(4);
                        BackupMoveUI.m18715N7(BackupMoveUI.this);
                        return;
                    case 14:
                        BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv9);
                        BackupMoveUI backupMoveUI11 = BackupMoveUI.this;
                        TextView textView = backupMoveUI11.f50060g;
                        C16686a.m16193i().mo17662k().getClass();
                        textView.setText(backupMoveUI11.getString(C0966R.string.f360142ac2, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                        BackupMoveUI.this.f50061h.setText(C0966R.string.ab6);
                        BackupMoveUI backupMoveUI12 = BackupMoveUI.this;
                        backupMoveUI12.f50061h.setTextColor(backupMoveUI12.getResources().getColor(C0966R.color.f3115fr));
                        BackupMoveUI.this.f50061h.setVisibility(0);
                        BackupMoveUI.this.f50058e.setVisibility(4);
                        BackupMoveUI.this.f50059f.setVisibility(4);
                        BackupMoveUI.m18715N7(BackupMoveUI.this);
                        return;
                    case 15:
                        BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv_);
                        BackupMoveUI.this.f50060g.setText(C0966R.string.f360137ab1);
                        BackupMoveUI backupMoveUI13 = BackupMoveUI.this;
                        backupMoveUI13.f50061h.setText(backupMoveUI13.getString(C0966R.string.f360138ab2, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c)}));
                        BackupMoveUI backupMoveUI14 = BackupMoveUI.this;
                        backupMoveUI14.f50061h.setTextColor(backupMoveUI14.getResources().getColor(C0966R.color.f3115fr));
                        BackupMoveUI.this.f50058e.setText(C0966R.string.f360129aa0);
                        BackupMoveUI.this.f50061h.setVisibility(0);
                        BackupMoveUI.this.f50058e.setVisibility(0);
                        BackupMoveUI.this.f50059f.setVisibility(4);
                        BackupMoveUI.this.f50058e.setOnClickListener(new C18109a());
                        BackupMoveUI.m18715N7(BackupMoveUI.this);
                        return;
                    default:
                        return;
                }
            } else {
                BackupMoveUI.this.f50063j.setImageResource(C0966R.C0969drawable.bv9);
                BackupMoveUI backupMoveUI15 = BackupMoveUI.this;
                TextView textView2 = backupMoveUI15.f50060g;
                C16686a.m16193i().mo17662k().getClass();
                textView2.setText(backupMoveUI15.getString(C0966R.string.f360142ac2, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                BackupMoveUI.this.f50061h.setText(C0966R.string.f360143ac3);
                BackupMoveUI backupMoveUI16 = BackupMoveUI.this;
                backupMoveUI16.f50061h.setTextColor(backupMoveUI16.getResources().getColor(C0966R.color.f3115fr));
                BackupMoveUI.this.f50061h.setVisibility(0);
                BackupMoveUI.this.f50058e.setVisibility(4);
                BackupMoveUI.this.f50059f.setVisibility(4);
                BackupMoveUI.m18715N7(BackupMoveUI.this);
            }
        }

        /* renamed from: P */
        public void mo17668P() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI$b */
    public class C18110b implements DialogInterface.OnClickListener {
        public C18110b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.BackupMoveUI", "user click close. stop move.");
            C115669n.INSTANCE.idkeyStat(485, 25, 1, false);
            C16686a.m16193i().mo17660h().mo37036e();
            C16686a.m16193i().mo17662k().mo17701e(false);
            C16686a.m16193i().mo142622e().mo142628f(-100);
            BackupMoveUI backupMoveUI = BackupMoveUI.this;
            int i2 = BackupMoveUI.f50057o;
            backupMoveUI.mo7681K7(1);
        }
    }

    /* renamed from: N7 */
    public static void m18715N7(BackupMoveUI backupMoveUI) {
        backupMoveUI.f50062i.setText(C0966R.string.a_z);
        backupMoveUI.f50062i.setOnClickListener(new C20369i(backupMoveUI));
    }

    /* renamed from: O7 */
    public final void mo22687O7() {
        int a = C16686a.m16193i().mo142622e().mo142623a();
        Log.m105925i("MicroMsg.BackupMoveUI", "close btn, backupMoveState:%d", Integer.valueOf(a));
        if (!(a == -23 || a == -21 || a == -11 || a == -4 || a == 1 || a == 4 || a == 51)) {
            switch (a) {
                case 12:
                case 13:
                case 14:
                    break;
                case 15:
                    Log.m105924i("MicroMsg.BackupMoveUI", "backup move finish, user click close.");
                    C16686a.m16193i().mo17663l().mo140765b();
                    C16686a.m16193i().mo17662k().mo17701e(true);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo142622e().mo142628f(-100);
                    mo7681K7(1);
                    return;
                default:
                    mo7681K7(1);
                    return;
            }
        }
        C76879j.m92741l(this, C0966R.string.abe, C0966R.string.abd, C0966R.string.abz, C0966R.string.a_u, false, new C18110b(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6537hk;
    }

    public void initView() {
        this.f50062i = (TextView) findViewById(C0966R.C0970id.a45);
        this.f50063j = (ImageView) findViewById(C0966R.C0970id.a46);
        this.f50060g = (TextView) findViewById(C0966R.C0970id.a4e);
        this.f50061h = (TextView) findViewById(C0966R.C0970id.a4d);
        this.f50058e = (TextView) findViewById(C0966R.C0970id.a3m);
        this.f50059f = (TextView) findViewById(C0966R.C0970id.a3l);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            Log.m105924i("MicroMsg.BackupMoveUI", "onCreate.");
            getSupportActionBar().mo91104o();
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).getClass();
            MMAppMgr.m85986f();
            initView();
            try {
                C16686a.m16193i().mo17662k().f45188i = ((Boolean) WifiManager.class.getMethod("isWifiApEnabled", new Class[0]).invoke((WifiManager) getSystemService("wifi"), new Object[0])).booleanValue();
                Log.m105919d("MicroMsg.BackupMoveUI", "old isWifiAp:%s", Boolean.valueOf(C16686a.m16193i().mo17662k().f45188i));
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.BackupMoveUI", "no such method WifiManager.isWifiApEnabled:%s", Util.getStack());
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo22687O7();
        return true;
    }

    public void onPause() {
        super.onPause();
        C16710c k = C16686a.m16193i().mo17662k();
        C102909e eVar = this.f50064n;
        synchronized (k.f45190k) {
            ((HashSet) k.f45190k).remove(eVar);
        }
        if (C16686a.m16193i().mo17662k().f45196q != null) {
            C16686a.m16193i().mo17662k().f45196q.mo75112d();
        }
    }

    public void onResume() {
        super.onResume();
        C16686a.m16193i().mo17662k().mo17699c(this.f50064n);
        ((C18108a) this.f50064n).mo17667K(C16686a.m16193i().mo142622e().mo142623a());
    }
}
