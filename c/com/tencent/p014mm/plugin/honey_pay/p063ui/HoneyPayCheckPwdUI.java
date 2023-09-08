package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import gr3.C76024a;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import p910lj.C76701a;
import q02.C47739c;
import q02.C47740d;
import q02.C47743g;
import q02.C47744h;
import q02.C47750n;
import te3.C50452mu2;
import te3.C50957qg2;
import te3.C51175ry1;
import te3.eh4;
import v53.C52766c0;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI */
public class HoneyPayCheckPwdUI extends HoneyPayBaseUI {

    /* renamed from: f */
    public EditHintPasswdView f114796f;

    /* renamed from: g */
    public TextView f114797g;

    /* renamed from: h */
    public TextView f114798h;

    /* renamed from: i */
    public String f114799i;

    /* renamed from: j */
    public String f114800j;

    /* renamed from: n */
    public String f114801n;

    /* renamed from: o */
    public String f114802o;

    /* renamed from: p */
    public long f114803p;

    /* renamed from: q */
    public int f114804q;

    /* renamed from: r */
    public eh4 f114805r;

    /* renamed from: s */
    public int f114806s;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$a */
    public class C42418a implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47740d f114807a;

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$a$a */
        public class C42419a implements DialogInterface.OnClickListener {
            public C42419a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                HoneyPayCheckPwdUI.m46090I7(HoneyPayCheckPwdUI.this);
            }
        }

        public C42418a(C47740d dVar) {
            this.f114807a = dVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            C50452mu2 mu22 = this.f114807a.f128255r.f141219g;
            if (mu22 != null) {
                C76879j.m92709C(HoneyPayCheckPwdUI.this, mu22.f138212d, "", mu22.f138214f, mu22.f138213e, false, new C42419a(), (DialogInterface.OnClickListener) null);
                HoneyPayCheckPwdUI.this.hideProgress();
                return;
            }
            EditHintPasswdView editHintPasswdView = HoneyPayCheckPwdUI.this.f114796f;
            if (editHintPasswdView != null) {
                editHintPasswdView.mo105043a();
            }
            HoneyPayCheckPwdUI.this.hideProgress();
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$b */
    public class C42420b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47740d f114810a;

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$b$a */
        public class C42421a implements DialogInterface.OnClickListener {
            public C42421a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                HoneyPayCheckPwdUI.m46090I7(HoneyPayCheckPwdUI.this);
            }
        }

        public C42420b(C47740d dVar) {
            this.f114810a = dVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayCheckPwdUI honeyPayCheckPwdUI = HoneyPayCheckPwdUI.this;
            C51175ry1 ry12 = this.f114810a.f128255r;
            honeyPayCheckPwdUI.f114805r = ry12.f141218f;
            C50452mu2 mu22 = ry12.f141219g;
            if (mu22 != null) {
                C76879j.m92709C(honeyPayCheckPwdUI, mu22.f138212d, "", mu22.f138214f, mu22.f138213e, false, new C42421a(), (DialogInterface.OnClickListener) null);
                HoneyPayCheckPwdUI.this.hideProgress();
                return;
            }
            HoneyPayCheckPwdUI.m46090I7(honeyPayCheckPwdUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$c */
    public class C42422c implements EditHintPasswdView.C75206c {
        public C42422c() {
        }

        public void onInputValidChange(boolean z) {
            if (z) {
                HoneyPayCheckPwdUI honeyPayCheckPwdUI = HoneyPayCheckPwdUI.this;
                int i = honeyPayCheckPwdUI.f114804q;
                if (i == 1) {
                    honeyPayCheckPwdUI.getClass();
                    Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "do get create token sign");
                    honeyPayCheckPwdUI.showSafeProgress();
                    C47740d dVar = new C47740d(honeyPayCheckPwdUI.f114800j, honeyPayCheckPwdUI.f114803p);
                    dVar.mo104821m1(honeyPayCheckPwdUI);
                    honeyPayCheckPwdUI.doSceneProgress(dVar, false);
                } else if (i == 2) {
                    HoneyPayCheckPwdUI.m46090I7(honeyPayCheckPwdUI);
                } else if (i == 3) {
                    HoneyPayCheckPwdUI.m46090I7(honeyPayCheckPwdUI);
                } else {
                    Log.m105929w("MicroMsg.HoneyPayCheckPwdUI", "unknown scene: %s", Integer.valueOf(i));
                }
                HoneyPayCheckPwdUI.this.hideTenpayKB();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$d */
    public class C42423d implements DialogInterface.OnClickListener {
        public C42423d(HoneyPayCheckPwdUI honeyPayCheckPwdUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$e */
    public class C42424e implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47739c f114814a;

        public C42424e(C47739c cVar) {
            this.f114814a = cVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "create success");
            Intent intent = new Intent(HoneyPayCheckPwdUI.this.getContext(), HoneyPayMainUI.class);
            intent.putExtra("key_create_succ", true);
            C50957qg2 qg22 = this.f114814a.f128254r.f130883f;
            if (qg22 != null) {
                intent.putExtra("key_card_no", qg22.f140296d);
                intent.putExtra("key_card_type", this.f114814a.f128254r.f130883f.f140308s);
            }
            C76701a.makeText((Context) HoneyPayCheckPwdUI.this.getContext(), (int) C0966R.string.fk_, 1).show();
            HoneyPayCheckPwdUI honeyPayCheckPwdUI = HoneyPayCheckPwdUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            HoneyPayCheckPwdUI honeyPayCheckPwdUI2 = honeyPayCheckPwdUI;
            C117292a.m165358d(honeyPayCheckPwdUI2, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayCheckPwdUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(honeyPayCheckPwdUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo175913w(875, 2, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI$f */
    public class C42425f implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47744h f114816a;

        public C42425f(C47744h hVar) {
            this.f114816a = hVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "modify success");
            Intent intent = new Intent();
            intent.putExtra("key_modify_create_line_succ", true);
            intent.putExtra("key_credit_line", this.f114816a.f128260s);
            HoneyPayCheckPwdUI.this.setResult(-1, intent);
            HoneyPayCheckPwdUI.this.finish();
            C115669n.INSTANCE.mo175913w(875, 8, 1);
        }
    }

    /* renamed from: I7 */
    public static void m46090I7(HoneyPayCheckPwdUI honeyPayCheckPwdUI) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (honeyPayCheckPwdUI.f114805r != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.HoneyPayCheckPwdUI", "do get pwd token: %s", objArr);
        if (honeyPayCheckPwdUI.f114805r != null) {
            honeyPayCheckPwdUI.showSafeProgress();
            String text = honeyPayCheckPwdUI.f114796f.getText();
            eh4 eh4 = honeyPayCheckPwdUI.f114805r;
            honeyPayCheckPwdUI.doSceneProgress(new C52766c0(text, eh4.f132933g, eh4.f132930d, eh4.f132931e, eh4.f132932f, eh4.f132934h), false);
        }
    }

    public void cleanUiData(int i) {
        super.cleanUiData(i);
        EditHintPasswdView editHintPasswdView = this.f114796f;
        if (editHintPasswdView != null) {
            editHintPasswdView.mo105043a();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azl;
    }

    public void initView() {
        EditHintPasswdView editHintPasswdView = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        this.f114796f = editHintPasswdView;
        C76024a.m91321b(editHintPasswdView);
        this.f114796f.setOnInputValidListener(new C42422c());
        setEditFocusListener(this.f114796f, 0, false);
        this.f114798h = (TextView) findViewById(C0966R.C0970id.lja);
        this.f114797g = (TextView) findViewById(C0966R.C0970id.lj7);
        int i = this.f114804q;
        if (i == 1) {
            this.f114798h.setText(C0966R.string.fk5);
        } else if (i == 2) {
            this.f114798h.setText(C0966R.string.fk6);
        } else {
            this.f114798h.setText(C0966R.string.fk8);
        }
        this.f114797g.setText(C0966R.string.fk7);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f114799i = getIntent().getStringExtra("key_username");
        this.f114800j = getIntent().getStringExtra("key_take_message");
        this.f114803p = getIntent().getLongExtra("key_credit_line", 0);
        this.f114804q = getIntent().getIntExtra("key_scene", 0);
        this.f114801n = getIntent().getStringExtra("key_card_no");
        this.f114802o = getIntent().getStringExtra("key_wishing");
        if (this.f114804q == 1) {
            int intExtra = getIntent().getIntExtra("key_cardtype", 0);
            this.f114806s = intExtra;
            if (intExtra == 0) {
                Log.m105929w("MicroMsg.HoneyPayCheckPwdUI", "error card type: %s", Integer.valueOf(intExtra));
                finish();
            }
        }
        int i = this.f114804q;
        if (i == 3 || i == 2) {
            eh4 eh4 = new eh4();
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_toke_mess");
                if (byteArrayExtra == null || byteArrayExtra.length == 0) {
                    Log.m105928w("MicroMsg.HoneyPayCheckPwdUI", "toke mess is null when unbind !!!");
                    finish();
                }
                eh4.parseFrom(byteArrayExtra);
                this.f114805r = eh4;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.HoneyPayCheckPwdUI", e, "", new Object[0]);
                finish();
            }
        }
        setMMTitle("");
        addSceneEndListener(2662);
        addSceneEndListener(2685);
        addSceneEndListener(2630);
        addSceneEndListener(2815);
        addSceneEndListener(2659);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2662);
        removeSceneEndListener(2685);
        removeSceneEndListener(2630);
        removeSceneEndListener(2815);
        removeSceneEndListener(2659);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = str;
        C117747y yVar2 = yVar;
        Log.m105919d("MicroMsg.HoneyPayCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (yVar2 instanceof C52766c0) {
            C52766c0 c0Var = (C52766c0) yVar2;
            if (i == 0 && i2 == 0) {
                int i3 = this.f114804q;
                if (i3 == 1) {
                    String str3 = c0Var.f147431d;
                    Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "do give card");
                    showSafeProgress();
                    C47739c cVar = new C47739c(str3, this.f114803p, this.f114799i, this.f114800j, this.f114806s, this.f114802o);
                    cVar.mo104821m1(this);
                    doSceneProgress(cVar, false);
                } else if (i3 == 2) {
                    String str4 = c0Var.f147431d;
                    Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "do modify quota");
                    showSafeProgress();
                    C47744h hVar = new C47744h(this.f114803p, str4, this.f114801n);
                    hVar.mo104821m1(this);
                    doSceneProgress(hVar, false);
                } else if (i3 == 3) {
                    String str5 = c0Var.f147431d;
                    Log.m105925i("MicroMsg.HoneyPayCheckPwdUI", "do unbind: %s", this.f114801n);
                    showSafeProgress();
                    C47750n nVar = new C47750n(this.f114801n, str5);
                    nVar.mo104821m1(this);
                    doSceneProgress(nVar, false);
                }
            } else {
                EditHintPasswdView editHintPasswdView = this.f114796f;
                if (editHintPasswdView != null) {
                    editHintPasswdView.mo105043a();
                }
                hideProgress();
                if (!c0Var.hasProcessWalletError() && !Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.HoneyPayCheckPwdUI", "show normal error msg");
                    C76879j.m92713G(getContext(), str2, (String) null, false, new C42423d(this));
                }
                return true;
            }
        } else if (yVar2 instanceof C47739c) {
            C47739c cVar2 = (C47739c) yVar2;
            hideProgress();
            cVar2.mo104823q1(new C42424e(cVar2));
            if (cVar2.f221040j) {
                EditHintPasswdView editHintPasswdView2 = this.f114796f;
                if (editHintPasswdView2 != null) {
                    editHintPasswdView2.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 3, 1);
            }
            if (cVar2.f221039i) {
                EditHintPasswdView editHintPasswdView3 = this.f114796f;
                if (editHintPasswdView3 != null) {
                    editHintPasswdView3.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 3, 1);
            }
        } else if (yVar2 instanceof C47744h) {
            hideProgress();
            C47744h hVar2 = (C47744h) yVar2;
            hVar2.mo104823q1(new C42425f(hVar2));
            if (hVar2.f221040j) {
                EditHintPasswdView editHintPasswdView4 = this.f114796f;
                if (editHintPasswdView4 != null) {
                    editHintPasswdView4.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 9, 1);
            }
            if (hVar2.f221039i) {
                EditHintPasswdView editHintPasswdView5 = this.f114796f;
                if (editHintPasswdView5 != null) {
                    editHintPasswdView5.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 9, 1);
            }
        } else if (yVar2 instanceof C47740d) {
            C47740d dVar = (C47740d) yVar2;
            dVar.mo104823q1(new C42420b(dVar));
            dVar.mo104820l1(new C42418a(dVar));
            if (dVar.f221039i) {
                EditHintPasswdView editHintPasswdView6 = this.f114796f;
                if (editHintPasswdView6 != null) {
                    editHintPasswdView6.mo105043a();
                }
                hideProgress();
            }
        } else if (yVar2 instanceof C47743g) {
            C47743g gVar = (C47743g) yVar2;
            this.f114805r = gVar.f128258r.f137813d;
            if (!gVar.f221039i && !gVar.f221040j) {
                m46090I7(this);
            }
            if (gVar.f221040j) {
                EditHintPasswdView editHintPasswdView7 = this.f114796f;
                if (editHintPasswdView7 != null) {
                    editHintPasswdView7.mo105043a();
                }
                hideProgress();
            }
            if (gVar.f221039i) {
                EditHintPasswdView editHintPasswdView8 = this.f114796f;
                if (editHintPasswdView8 != null) {
                    editHintPasswdView8.mo105043a();
                }
                hideProgress();
            }
        } else if (yVar2 instanceof C47750n) {
            hideProgress();
            C47750n nVar2 = (C47750n) yVar2;
            if (!nVar2.f221039i && !nVar2.f221040j) {
                setResult(-1);
                finish();
                C115669n.INSTANCE.mo175913w(875, 6, 1);
            }
            if (nVar2.f221040j) {
                EditHintPasswdView editHintPasswdView9 = this.f114796f;
                if (editHintPasswdView9 != null) {
                    editHintPasswdView9.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 7, 1);
            }
            if (nVar2.f221039i) {
                EditHintPasswdView editHintPasswdView10 = this.f114796f;
                if (editHintPasswdView10 != null) {
                    editHintPasswdView10.mo105043a();
                }
                C115669n.INSTANCE.mo175913w(875, 7, 1);
            }
        }
        return true;
    }
}
