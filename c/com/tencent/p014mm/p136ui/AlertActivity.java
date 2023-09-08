package com.tencent.p014mm.p136ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import nj3.C100124v0;
import qo3.C101217d;
import qo3.C101218e0;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.AlertActivity */
public class AlertActivity extends AppCompatActivity {

    /* renamed from: j */
    public static C77398g.C77402i f284187j;

    /* renamed from: n */
    public static C100124v0.C100126b f284188n;

    /* renamed from: o */
    public static C101218e0.C101229l f284189o;

    /* renamed from: p */
    public static C89779i0.C89780a f284190p;

    /* renamed from: d */
    public DialogInterface.OnDismissListener f284191d;

    /* renamed from: e */
    public DialogInterface.OnCancelListener f284192e;

    /* renamed from: f */
    public C101218e0.C77394n f284193f;

    /* renamed from: g */
    public C101218e0.C101230o f284194g;

    /* renamed from: h */
    public boolean f284195h = false;

    /* renamed from: i */
    public int f284196i = 1;

    /* renamed from: com.tencent.mm.ui.AlertActivity$h */
    public class C85809h implements C89779i0.C89780a.C89781a {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f249915a;

        public C85809h(C89779i0 i0Var) {
            this.f249915a = i0Var;
        }

        /* renamed from: a */
        public void mo119712a(DialogInterface.OnKeyListener onKeyListener) {
            this.f249915a.setOnKeyListener(onKeyListener);
        }

        /* renamed from: b */
        public void mo119713b(DialogInterface.OnShowListener onShowListener) {
            this.f249915a.setOnShowListener(onShowListener);
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$a */
    public class C96987a implements DialogInterface.OnDismissListener {
        public C96987a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = AlertActivity.this.f284191d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            AlertActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$b */
    public class C96988b implements DialogInterface.OnCancelListener {
        public C96988b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = AlertActivity.this.f284192e;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
            AlertActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$c */
    public class C96989c implements DialogInterface.OnDismissListener {
        public C96989c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C85975v4.m106306c("MicroMsg.AlertActivity", "mTipsBuilder onDismiss", new Object[0]);
            DialogInterface.OnDismissListener onDismissListener = AlertActivity.this.f284191d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            AlertActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$d */
    public class C96990d implements DialogInterface.OnCancelListener {
        public C96990d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = AlertActivity.this.f284192e;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
            AlertActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$e */
    public class C96991e implements C101218e0.C77394n {
        public C96991e() {
        }

        public void dismiss() {
            C101218e0.C77394n nVar = AlertActivity.this.f284193f;
            if (nVar != null) {
                nVar.dismiss();
            }
            AlertActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$f */
    public class C96992f implements C101218e0.C101230o {
        public C96992f() {
        }

        /* renamed from: a */
        public void mo32720a(Dialog dialog, int i) {
            C101218e0.C101230o oVar = AlertActivity.this.f284194g;
            if (oVar != null) {
                oVar.mo32720a(dialog, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.AlertActivity$g */
    public class C96993g implements DialogInterface.OnCancelListener {
        public C96993g() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C85975v4.m106306c("MicroMsg.AlertActivity", "mTipsBuilder onDismiss", new Object[0]);
            DialogInterface.OnDismissListener onDismissListener = AlertActivity.this.f284191d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            AlertActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        C89779i0.C89780a aVar;
        Window window;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        int i = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(getResources().getColor(17170445));
        this.f284195h = getIntent().getBooleanExtra("dialog_show_top", false);
        int intExtra = getIntent().getIntExtra("dialog_scene", 1);
        this.f284196i = intExtra;
        C85975v4.m106306c("MicroMsg.AlertActivity", "show alert, scene:%s", Integer.valueOf(intExtra));
        int i2 = this.f284196i;
        if (i2 == 1) {
            C77398g.C77402i iVar = f284187j;
            if (iVar != null) {
                iVar.f225713a = this;
                C77389a aVar2 = iVar.f225714b;
                this.f284191d = aVar2.f225623F;
                this.f284192e = aVar2.f225622E;
                aVar2.f225623F = new C96987a();
                aVar2.f225622E = new C96988b();
                C77398g a = iVar.mo107548a();
                if (this.f284195h && (window = a.getWindow()) != null) {
                    if (i >= 26) {
                        window.setType(2038);
                    } else {
                        window.setType(2002);
                    }
                    C85975v4.m106304a("MicroMsg.AlertActivity", "show top window not null!!", new Object[0]);
                }
                a.show();
                if (!a.isShowing()) {
                    C85975v4.m106305b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new Object[0]);
                    finish();
                    return;
                }
                return;
            }
            C85975v4.m106305b("MicroMsg.AlertActivity", "mBuilder is null, finish AlertActivity!", new Object[0]);
            finish();
        } else if (i2 == 2) {
            C100124v0.C100126b bVar = f284188n;
            if (bVar != null) {
                bVar.f293290b = this;
                C97212f4 f4Var = bVar.f293291c;
                this.f284191d = f4Var.f285237f;
                f4Var.f285237f = new C96989c();
                f4Var.f285238g = new C96990d();
                C100124v0 a2 = bVar.mo139424a();
                a2.show();
                if (!a2.isShowing()) {
                    C85975v4.m106305b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new Object[0]);
                    finish();
                    return;
                }
                return;
            }
            C85975v4.m106305b("MicroMsg.AlertActivity", "mTipsBuilder is null, finish AlertActivity!", new Object[0]);
            finish();
        } else if (i2 == 3) {
            C101218e0.C101229l lVar = f284189o;
            if (lVar != null) {
                lVar.f296415a = this;
                C101217d dVar = lVar.f296416b;
                this.f284193f = dVar.f296369j;
                this.f284194g = dVar.f296368i;
                dVar.f296369j = new C96991e();
                dVar.f296368i = new C96992f();
                C101218e0 e0Var = new C101218e0(this);
                C101217d dVar2 = lVar.f296416b;
                int i3 = dVar2.f296360a;
                if (i3 != 0) {
                    e0Var.f296390p = i3;
                    e0Var.mo140657d();
                }
                int i4 = dVar2.f296361b;
                if (i4 != 0) {
                    e0Var.f296391q = i4;
                    e0Var.mo140658e();
                }
                Dialog dialog = e0Var.f296381d;
                if (dialog != null) {
                    dialog.setCancelable(dVar2.f296362c);
                }
                CharSequence charSequence = dVar2.f296364e;
                if (charSequence != null) {
                    e0Var.mo140677w(charSequence);
                }
                int i5 = dVar2.f296365f;
                if (i5 != 0) {
                    e0Var.mo140676v(i5);
                }
                CharSequence charSequence2 = dVar2.f296366g;
                if (charSequence2 != null) {
                    e0Var.mo140671q(charSequence2);
                }
                int i6 = dVar2.f296367h;
                if (i6 != 0) {
                    e0Var.mo140662i(i6);
                }
                View view = dVar2.f296363d;
                if (view != null) {
                    e0Var.mo140663j(view);
                }
                C101218e0.C77394n nVar = dVar2.f296369j;
                if (nVar != null) {
                    e0Var.mo140665l(nVar);
                }
                C101218e0.C101230o oVar = dVar2.f296368i;
                if (oVar != null) {
                    e0Var.f296380K = oVar;
                    C101218e0.C101229l lVar2 = e0Var.f296382e;
                    if (lVar2 != null) {
                        lVar2.f296416b.f296368i = oVar;
                    }
                }
                e0Var.mo140655A();
                if (!e0Var.mo140661h()) {
                    C85975v4.m106305b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new Object[0]);
                    finish();
                }
            }
        } else if (i2 == 4 && (aVar = f284190p) != null) {
            aVar.f258152b = this;
            this.f284192e = aVar.f258157g;
            aVar.f258157g = new C96993g();
            C89779i0 a3 = aVar.mo124065a();
            a3.show();
            if (!a3.isShowing()) {
                C85975v4.m106305b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new Object[0]);
                finish();
            }
            f284190p.f258158h = new C85809h(a3);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f284187j = null;
        f284188n = null;
        f284189o = null;
        f284190p = null;
    }

    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (f284187j == null && f284188n == null && f284189o == null && f284190p == null) {
            C85975v4.m106305b("MicroMsg.AlertActivity", "AlertActivity onResume() with null mBuilder, exiting this transparent proxy activity...", new Object[0]);
            finish();
        }
    }
}
