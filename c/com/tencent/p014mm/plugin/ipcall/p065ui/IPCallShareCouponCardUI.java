package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11800g;
import p196ln.C76705f;
import p214om.C11502f;
import pc0.C62259q;
import q12.C12029d;
import r12.C12940b;
import t12.C110899d;
import te3.C49828ic2;
import te3.vx4;
import tn3.C101905a;
import tn3.C118493b;
import vc0.C52809a;
import wd3.C15153w0;
import wd3.C65953v0;
import wd3.C78575u;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI */
public class IPCallShareCouponCardUI extends MMActivity implements C11385n, C101905a.C101907b, C101905a.C101906a {

    /* renamed from: F */
    public static final /* synthetic */ int f19552F = 0;

    /* renamed from: A */
    public String f19553A = null;

    /* renamed from: B */
    public vx4 f19554B = null;

    /* renamed from: C */
    public String f19555C = null;

    /* renamed from: D */
    public int f19556D = 0;

    /* renamed from: E */
    public View f19557E;

    /* renamed from: d */
    public View f19558d;

    /* renamed from: e */
    public TextView f19559e;

    /* renamed from: f */
    public TextView f19560f;

    /* renamed from: g */
    public TextView f19561g;

    /* renamed from: h */
    public TextView f19562h;

    /* renamed from: i */
    public Button f19563i;

    /* renamed from: j */
    public ImageView f19564j;

    /* renamed from: n */
    public C118493b f19565n = new C118493b();

    /* renamed from: o */
    public ProgressDialog f19566o = null;

    /* renamed from: p */
    public ProgressDialog f19567p = null;

    /* renamed from: q */
    public ProgressDialog f19568q = null;

    /* renamed from: r */
    public ImageView f19569r = null;

    /* renamed from: s */
    public ProgressBar f19570s = null;

    /* renamed from: t */
    public C12029d f19571t = new C12029d();

    /* renamed from: u */
    public String f19572u = null;

    /* renamed from: v */
    public String f19573v = null;

    /* renamed from: w */
    public String f19574w = null;

    /* renamed from: x */
    public String f19575x = null;

    /* renamed from: y */
    public String f19576y = null;

    /* renamed from: z */
    public String f19577z = null;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI$a */
    public class C4662a implements C15153w0 {

        /* renamed from: a */
        public final /* synthetic */ EditText f19578a;

        /* renamed from: b */
        public final /* synthetic */ String f19579b;

        /* renamed from: c */
        public final /* synthetic */ int f19580c;

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI$a$a */
        public class C4663a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C62259q f19582d;

            public C4663a(C4662a aVar, C62259q qVar) {
                this.f19582d = qVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f19582d);
            }
        }

        public C4662a(EditText editText, String str, int i) {
            this.f19578a = editText;
            this.f19579b = str;
            this.f19580c = i;
        }

        /* renamed from: a */
        public void mo5557a(boolean z) {
            if (z) {
                EditText editText = this.f19578a;
                C62259q qVar = new C62259q(this.f19580c, editText == null ? this.f19579b : editText.getText().toString());
                IPCallShareCouponCardUI iPCallShareCouponCardUI = IPCallShareCouponCardUI.this;
                iPCallShareCouponCardUI.f19566o = C76879j.m92723Q(iPCallShareCouponCardUI, iPCallShareCouponCardUI.getString(C0966R.string.a3h), IPCallShareCouponCardUI.this.getString(C0966R.string.a2w), true, true, new C4663a(this, qVar));
                C97625j3.m125815e().mo123460f(qVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI$b */
    public class C4664b implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f19583a;

        public C4664b(String str) {
            this.f19583a = str;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                IPCallShareCouponCardUI iPCallShareCouponCardUI = IPCallShareCouponCardUI.this;
                bVar.f195570f = iPCallShareCouponCardUI.f19575x;
                bVar.f195586j = iPCallShareCouponCardUI.f19576y;
                bVar.f195574g = iPCallShareCouponCardUI.f19573v;
                bVar.f195646y = iPCallShareCouponCardUI.f19574w;
                bVar.f195582i = 5;
                C72695v.m85053F(bVar, (String) null, (String) null, this.f19583a, "", (byte[]) null, (String) null);
                if (!Util.isNullOrNil(str)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                    String str2 = this.f19583a;
                    aVar.f9497a = str2;
                    aVar.f9498b = str;
                    aVar.f9499c = C45628s0.m50810y(str2);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
                C76879j.m92726T(IPCallShareCouponCardUI.this.getContext(), IPCallShareCouponCardUI.this.getResources().getString(C0966R.string.f360099a34));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI$c */
    public class C4665c implements DialogInterface.OnClickListener {
        public C4665c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            IPCallShareCouponCardUI.this.finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060 A[SYNTHETIC, Splitter:B:22:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f A[SYNTHETIC, Splitter:B:31:0x006f] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo5553H7() {
        /*
            r8 = this;
            java.lang.String r0 = eb0.C75592q0.m90789s()
            eb0.c r1 = eb0.C97625j3.m125812b()
            r1.getClass()
            java.lang.String r2 = f12.C7970a.m8127a()
            eb0.c r1 = eb0.C97625j3.m125812b()
            r1.getClass()
            java.lang.String r3 = f12.C7970a.m8128b()
            byte[] r0 = r0.getBytes()
            java.lang.String r5 = p823sg.C90193h.m112878f(r0)
            r7 = 1
            java.lang.String r4 = "qr_"
            java.lang.String r6 = ".png"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.defGenPathWithOld(r2, r3, r4, r5, r6, r7)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.IPCallShareCouponCardUI"
            r3 = 0
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "filename is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0039:
            r4 = r3
            goto L_0x0064
        L_0x003b:
            r1 = 0
            java.io.RandomAccessFile r0 = com.tencent.p014mm.vfs.C86013q1.m106420B(r0, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            long r4 = r0.length()     // Catch:{ Exception -> 0x0051 }
            int r5 = (int) r4     // Catch:{ Exception -> 0x0051 }
            byte[] r4 = new byte[r5]     // Catch:{ Exception -> 0x0051 }
            r0.read(r4)     // Catch:{ Exception -> 0x0051 }
            r0.close()     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x004e:
            r1 = move-exception
            r3 = r0
            goto L_0x006c
        L_0x0051:
            r4 = move-exception
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            goto L_0x006d
        L_0x0055:
            r4 = move-exception
            r0 = r3
        L_0x0057:
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x004e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r5, r1)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0039
        L_0x0064:
            if (r4 != 0) goto L_0x0067
            return r3
        L_0x0067:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r4)
            return r0
        L_0x006c:
            r0 = r1
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            r3.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.IPCallShareCouponCardUI.mo5553H7():android.graphics.Bitmap");
    }

    /* renamed from: I7 */
    public final void mo5554I7(int i, String str, String str2) {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f7041vw, (ViewGroup) null);
        this.f19557E = inflate;
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.blm);
        this.f19569r = (ImageView) this.f19557E.findViewById(C0966R.C0970id.blj);
        this.f19570s = (ProgressBar) this.f19557E.findViewById(C0966R.C0970id.g3h);
        editText.setText(str);
        Bitmap H7 = mo5553H7();
        if (H7 == null) {
            C97625j3.m125815e().mo123460f(new C52809a(C75592q0.m90789s(), Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(66561, (Object) null)), 0));
            this.f19570s.setVisibility(0);
        } else {
            ImageView imageView = this.f19569r;
            if (imageView != null) {
                imageView.setImageBitmap(H7);
            }
        }
        C78575u.m94942k(this.mController, str2, this.f19557E, getResources().getString(C0966R.string.a2s), new C4662a(editText, str, i));
    }

    /* renamed from: Y6 */
    public void mo5555Y6(C101905a.C101908c cVar) {
        ProgressDialog progressDialog = this.f19567p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92743n(getContext(), C0966R.string.k64, C0966R.string.a3h, new C4677d1(this), new C4678e1(this));
        } else if (ordinal == 1) {
            C76879j.m92743n(getContext(), C0966R.string.f361477k63, C0966R.string.a3h, new C4677d1(this), new C4678e1(this));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b28;
    }

    /* renamed from: o5 */
    public void mo5556o5(C101905a.C101908c cVar) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                C78575u.m94943l(getController(), this.f19575x, this.f19574w, this.f19573v, (String) null, true, getResources().getString(C0966R.string.a2s), new C4664b(stringExtra));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.fx7);
        setBackBtn(new C4733y0(this));
        this.f19558d = findViewById(C0966R.C0970id.fja);
        this.f19559e = (TextView) findViewById(C0966R.C0970id.buk);
        this.f19560f = (TextView) findViewById(C0966R.C0970id.byz);
        this.f19561g = (TextView) findViewById(C0966R.C0970id.bue);
        this.f19562h = (TextView) findViewById(C0966R.C0970id.bul);
        this.f19563i = (Button) findViewById(C0966R.C0970id.jhs);
        this.f19564j = (ImageView) findViewById(C0966R.C0970id.eur);
        View view = this.f19558d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f19564j, C75592q0.m90789s(), 0.5f);
        this.f19568q = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.fug), true, true, new C4738z0(this));
        if (C12940b.f36960b == null) {
            C12940b.f36960b = new C12940b();
        }
        C12940b.f36960b.mo12490a(false);
        this.f19556D = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
        C97625j3.m125815e().mo123455a(257, this);
        C97625j3.m125815e().mo123455a(1804, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(257, this);
        C97625j3.m125815e().mo123470p(1804, this);
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C11800g) {
            if (i == 0 && i2 == 0) {
                C11800g gVar = (C11800g) yVar;
                View view = this.f19558d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C49828ic2 e = C110899d.m151191e();
                if (e != null) {
                    this.f19572u = e.f135206d;
                    this.f19573v = e.f135209g;
                    this.f19574w = e.f135210h;
                    this.f19575x = e.f135208f;
                    this.f19576y = e.f135211i;
                    this.f19577z = e.f135214o;
                    this.f19553A = e.f135216q;
                    this.f19554B = e.f135215p;
                    this.f19555C = e.f135217r;
                }
                this.f19559e.setText(this.f19553A);
                int i3 = 1;
                this.f19560f.setText(String.format(getContext().getString(C0966R.string.f360916fx0), new Object[]{this.f19572u}));
                this.f19563i.setOnClickListener(new C4672a1(this));
                this.f19561g.setText(String.format(getString(C0966R.string.f360918fx2), new Object[]{this.f19553A}));
                TextView textView = this.f19562h;
                String format = String.format(getString(C0966R.string.f360917fx1), new Object[]{this.f19553A});
                String string = getString(C0966R.string.fx6);
                if (Util.isNullOrNil(string)) {
                    textView.setText(format);
                } else {
                    String string2 = getString(C0966R.string.fx9);
                    TextPaint paint = textView.getPaint();
                    float measureText = paint.measureText(format);
                    float measureText2 = paint.measureText(string2);
                    float A = (float) (C76577a.m92145A(getContext()) - (((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin + ((LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin));
                    int ceil = (int) Math.ceil((double) (measureText / A));
                    int ceil2 = (int) Math.ceil((double) ((measureText + measureText2) / A));
                    if (ceil != 0) {
                        i3 = ceil;
                    }
                    if (ceil2 > i3) {
                        string2 = "\n" + string2;
                    }
                    textView.setGravity(17);
                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(format + string2);
                    newSpannable.setSpan(new C4729x0(this, string), format.length(), format.length() + string2.length(), 33);
                    textView.setText(newSpannable);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                ProgressDialog progressDialog = this.f19568q;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f19568q.dismiss();
                    return;
                }
                return;
            }
            ProgressDialog progressDialog2 = this.f19568q;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f19568q.dismiss();
                C76879j.m92749t(getContext(), getString(C0966R.string.fue), getString(C0966R.string.fu8), new C4665c());
            }
        } else if (yVar instanceof C62259q) {
            ProgressDialog progressDialog3 = this.f19566o;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
                this.f19566o = null;
            }
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93165v5(getContext(), i, i2, str)) {
                if (i == 0 && i2 == 0) {
                    C76879j.m92726T(this, getResources().getString(C0966R.string.bjc));
                } else {
                    C76879j.m92738i(getContext(), C0966R.string.ilv, C0966R.string.a3h);
                }
            }
        } else if ((yVar instanceof C52809a) && i == 0 && i2 == 0 && this.f19569r != null) {
            ProgressBar progressBar = this.f19570s;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.f19569r.setImageBitmap(mo5553H7());
        }
    }
}
