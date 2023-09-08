package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82385f3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import f40.C86709a0;
import pv2.C77290d;
import qo3.C77390c0;
import rt1.C22249a;
import rt1.C22250b;
import rt1.C22251c;
import st1.C77761h0;
import vt1.C78473a;
import vt1.C78475c;
import yt3.C23319f;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog */
public class WalletFaceIdDialog extends C77390c0 implements C0124r {

    /* renamed from: d */
    public FrameAnimatorImageView f52617d;

    /* renamed from: e */
    public TextView f52618e;

    /* renamed from: f */
    public TextView f52619f;

    /* renamed from: g */
    public TextView f52620g;

    /* renamed from: h */
    public ViewGroup f52621h;

    /* renamed from: i */
    public View f52622i;

    /* renamed from: j */
    public ViewGroup f52623j;

    /* renamed from: n */
    public C18798c f52624n;

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog$a */
    public class C18796a extends C7089c0 {
        public C18796a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d("MicroMsg.WalletFaceIdDialog", "click dismiss btn");
            C18798c cVar = WalletFaceIdDialog.this.f52624n;
            cVar.getClass();
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "click left btn");
            if (cVar.f52632i) {
                cVar.mo23728b(-1);
            } else {
                cVar.mo23727a();
            }
            WalletFaceIdDialog.this.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog$b */
    public class C18797b extends C7089c0 {
        public C18797b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d("MicroMsg.WalletFaceIdDialog", "click right btn");
            C18798c cVar = WalletFaceIdDialog.this.f52624n;
            cVar.getClass();
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "click right btn");
            WalletFaceIdDialog walletFaceIdDialog = cVar.f52627d;
            walletFaceIdDialog.f52619f.setEnabled(false);
            walletFaceIdDialog.f52618e.setText(C0966R.string.clq);
            walletFaceIdDialog.f52618e.post(new C22251c(walletFaceIdDialog));
            cVar.mo23729c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog$c */
    public static class C18798c implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* renamed from: d */
        public WalletFaceIdDialog f52627d;

        /* renamed from: e */
        public C78473a f52628e;

        /* renamed from: f */
        public C22249a f52629f;

        /* renamed from: g */
        public int f52630g;

        /* renamed from: h */
        public int f52631h = 0;

        /* renamed from: i */
        public boolean f52632i = false;

        /* renamed from: j */
        public C78475c f52633j = new C18799a();

        /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog$c$a */
        public class C18799a implements C78475c {
            public C18799a() {
            }

            /* renamed from: a */
            public void mo23733a(int i, int i2, int i3, int i4) {
                Log.m105925i("MicroMsg.WalletFaceIdDialog", "auth result: %s, retry: %s", Integer.valueOf(i), Integer.valueOf(C18798c.this.f52631h));
                if (i != 0) {
                    if (!(i == 2005 || i == 2007 || i == 2009 || i == 10308)) {
                        switch (i) {
                            case 2000:
                            case 2001:
                            case 2002:
                                break;
                            default:
                                return;
                        }
                    }
                    C18798c cVar = C18798c.this;
                    int i5 = cVar.f52631h + 1;
                    cVar.f52631h = i5;
                    if (i5 < 2) {
                        WalletFaceIdDialog walletFaceIdDialog = cVar.f52627d;
                        walletFaceIdDialog.getWindow().setDimAmount(0.5f);
                        walletFaceIdDialog.f52622i.setBackgroundResource(C0966R.C0969drawable.am6);
                        walletFaceIdDialog.f52623j.setBackground((Drawable) null);
                        cVar.f52627d.mo23723d((Animation.AnimationListener) null);
                        WalletFaceIdDialog walletFaceIdDialog2 = cVar.f52627d;
                        walletFaceIdDialog2.f52621h.setVisibility(0);
                        walletFaceIdDialog2.f52619f.setVisibility(0);
                        walletFaceIdDialog2.f52618e.setText(C0966R.string.f360412cm0);
                        walletFaceIdDialog2.f52619f.setText(C0966R.string.clz);
                        walletFaceIdDialog2.f52618e.post(new C22250b(walletFaceIdDialog2));
                        C77290d.m93106d(2);
                        return;
                    }
                    Log.m105929w("MicroMsg.WalletFaceIdDialog", "face id failed: %s", Integer.valueOf(cVar.f52630g));
                    WalletFaceIdDialog walletFaceIdDialog3 = cVar.f52627d;
                    walletFaceIdDialog3.getWindow().setDimAmount(0.5f);
                    walletFaceIdDialog3.f52622i.setBackgroundResource(C0966R.C0969drawable.am6);
                    walletFaceIdDialog3.f52623j.setBackground((Drawable) null);
                    C77290d.m93106d(1);
                    C115669n.INSTANCE.mo175911u(C82385f3.CTRL_INDEX, 5);
                    cVar.f52632i = true;
                    if (cVar.f52630g == 0) {
                        cVar.f52627d.mo23723d((Animation.AnimationListener) null);
                        WalletFaceIdDialog walletFaceIdDialog4 = cVar.f52627d;
                        walletFaceIdDialog4.f52618e.setText(C0966R.string.cls);
                        walletFaceIdDialog4.f52619f.setVisibility(8);
                        if (i == 10308) {
                            C77290d.m93107e(6, -1000223, i, "too many trial");
                        } else {
                            C77290d.m93107e(1000, -1000223, i, "fingerprint error");
                        }
                    } else {
                        cVar.f52627d.mo23723d(new C18802e(cVar));
                    }
                } else {
                    Log.m105924i("MicroMsg.WalletFaceIdDialog", "identify success");
                    C18798c.this.getClass();
                    C18798c cVar2 = C18798c.this;
                    cVar2.f52631h++;
                    cVar2.getClass();
                    Log.m105924i("MicroMsg.WalletFaceIdDialog", "auth success");
                    if (cVar2.f52631h == 0) {
                        C115669n.INSTANCE.mo175911u(C82385f3.CTRL_INDEX, 3);
                    } else {
                        C115669n.INSTANCE.mo175911u(C82385f3.CTRL_INDEX, 4);
                    }
                    C77290d.m93106d(0);
                    cVar2.f52627d.f52617d.mo149945a(C0966R.C0969drawable.f4972st, new C18801d(cVar2, i2));
                }
            }
        }

        public C18798c(WalletFaceIdDialog walletFaceIdDialog, C22249a aVar, Bundle bundle) {
            this.f52627d = walletFaceIdDialog;
            this.f52629f = aVar;
            if (bundle != null) {
                this.f52630g = bundle.getInt("face_auth_scene");
            }
        }

        /* renamed from: a */
        public final void mo23727a() {
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "auth cancel");
            C22249a aVar = this.f52629f;
            if (aVar != null) {
                aVar.onAuthCancel();
                this.f52629f = null;
            }
        }

        /* renamed from: b */
        public final void mo23728b(int i) {
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "auth fail");
            C22249a aVar = this.f52629f;
            if (aVar != null) {
                aVar.onAuthFail(i);
                this.f52629f = null;
            }
            this.f52627d.dismiss();
        }

        /* renamed from: c */
        public final void mo23729c() {
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "req faceid auth");
            C78473a aVar = this.f52628e;
            if (aVar == null) {
                Log.m105928w("MicroMsg.WalletFaceIdDialog", "mgr is null");
                return;
            }
            aVar.userCancel();
            if (!this.f52628e.mo107913l3()) {
                Log.m105928w("MicroMsg.WalletFaceIdDialog", "no faceid enrolled");
                mo23728b(-2);
            } else if (Util.isNullOrNil(C77761h0.IML.f226590d)) {
                Log.m105924i("MicroMsg.WalletFaceIdDialog", "no challenge");
                mo23728b(-3);
            } else {
                this.f52628e.mo107910hq(this.f52633j, 3000);
                WalletFaceIdDialog walletFaceIdDialog = this.f52627d;
                walletFaceIdDialog.getClass();
                Log.m105918d("MicroMsg.WalletFaceIdDialog", "trigger load start");
                walletFaceIdDialog.f52617d.mo149945a(C0966R.C0969drawable.f4974sv, new C18800c(walletFaceIdDialog));
            }
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105918d("MicroMsg.WalletFaceIdDialog", "face id dialog cancel");
            mo23727a();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "face id dialog dismiss");
            this.f52628e.userCancel();
            if (this.f52630g == 1) {
                mo23727a();
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WalletFaceIdDialog", "face id dialog show");
            this.f52628e = (C78473a) C86709a0.m107533q(C78473a.class);
            C23319f.m27817c().mo36811b();
            mo23729c();
        }
    }

    public WalletFaceIdDialog(Context context, C22249a aVar) {
        this(context, aVar, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo23722c() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a67, (ViewGroup) null);
        this.f52622i = inflate;
        this.f52623j = (ViewGroup) inflate.findViewById(C0966R.C0970id.d09);
        this.f52617d = (FrameAnimatorImageView) this.f52622i.findViewById(C0966R.C0970id.d05);
        this.f52618e = (TextView) this.f52622i.findViewById(C0966R.C0970id.d08);
        this.f52619f = (TextView) this.f52622i.findViewById(C0966R.C0970id.d07);
        this.f52620g = (TextView) this.f52622i.findViewById(C0966R.C0970id.d06);
        this.f52621h = (ViewGroup) this.f52622i.findViewById(C0966R.C0970id.f358011d04);
        C85875k4.m106189j0(this.f52620g.getPaint(), 0.8f);
        C85875k4.m106189j0(this.f52619f.getPaint(), 0.8f);
        this.f52622i.setBackgroundColor(0);
        this.f52620g.setOnClickListener(new C18796a());
        this.f52619f.setOnClickListener(new C18797b());
    }

    /* renamed from: d */
    public void mo23723d(Animation.AnimationListener animationListener) {
        this.f52617d.setImageResource(C0966R.C0969drawable.c0t);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2386bn);
        this.f52617d.startAnimation(loadAnimation);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public void onActivityStop() {
        Log.m105924i("MicroMsg.WalletFaceIdDialog", "activity pause");
        this.f52624n.f52628e.userCancel();
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f52622i);
    }

    public void onStart() {
        super.onStart();
    }

    public WalletFaceIdDialog(Context context, C22249a aVar, Bundle bundle) {
        this(context);
        C18798c cVar = new C18798c(this, aVar, bundle);
        this.f52624n = cVar;
        setOnShowListener(cVar);
        setOnDismissListener(this.f52624n);
        setOnCancelListener(this.f52624n);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    private WalletFaceIdDialog(Context context) {
        super(context, C0966R.style.f8453j6);
        mo23722c();
    }

    private WalletFaceIdDialog(Context context, int i) {
        super(context, C0966R.style.f8453j6);
        mo23722c();
    }
}
