package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92805a0;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p158gt.C76053l;
import p158gt.C98201k;
import p158gt.C98203p;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI */
public class MailImageDownloadUI extends MMActivity implements C11385n, C47355o {

    /* renamed from: d */
    public ProgressBar f272480d;

    /* renamed from: e */
    public TextView f272481e;

    /* renamed from: f */
    public TextView f272482f;

    /* renamed from: g */
    public TextView f272483g;

    /* renamed from: h */
    public TextView f272484h;

    /* renamed from: i */
    public RelativeLayout f272485i;

    /* renamed from: j */
    public C92836k f272486j;

    /* renamed from: n */
    public C98203p f272487n;

    /* renamed from: o */
    public ImageView f272488o;

    /* renamed from: p */
    public LinearLayout f272489p;

    /* renamed from: q */
    public int f272490q;

    /* renamed from: r */
    public String f272491r;

    /* renamed from: s */
    public long f272492s = 0;

    /* renamed from: t */
    public long f272493t = 0;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI$a */
    public class C94312a implements MenuItem.OnMenuItemClickListener {
        public C94312a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C86709a0.m107529k().f251779b.mo123458d((C117747y) MailImageDownloadUI.this.f272487n);
            MailImageDownloadUI.this.finish();
            return true;
        }
    }

    public MailImageDownloadUI() {
        new MMHandler(Looper.getMainLooper());
    }

    /* renamed from: H7 */
    public final void mo129648H7(int i) {
        this.f272481e.setText(getString(C0966R.string.eze, new Object[]{Integer.valueOf(i)}));
        if (i >= this.f272480d.getMax()) {
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127194nP(Long.valueOf(((C92805a0) this.f272487n).f267214h));
            if (this.f272490q == 1) {
                ((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8(nP);
            }
            finish();
            Intent intent = getIntent();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_q;
    }

    public void initView() {
        this.f272481e = (TextView) findViewById(C0966R.C0970id.f45);
        this.f272482f = (TextView) findViewById(C0966R.C0970id.f45);
        this.f272483g = (TextView) findViewById(C0966R.C0970id.f46);
        this.f272484h = (TextView) findViewById(C0966R.C0970id.f358440f43);
        this.f272488o = (ImageView) findViewById(C0966R.C0970id.gki);
        this.f272481e.setVisibility(0);
        this.f272489p = (LinearLayout) findViewById(C0966R.C0970id.f3l);
        this.f272485i = (RelativeLayout) findViewById(C0966R.C0970id.gkj);
        this.f272482f.setVisibility(8);
        this.f272483g.setVisibility(8);
        this.f272484h.setVisibility(8);
        setTitleVisibility(8);
        setBackBtn(new C94312a());
        this.f272480d = (ProgressBar) findViewById(C0966R.C0970id.f44);
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        Log.m105918d("MicroMsg.MailImageDownloadUI", "offset " + i + "totaolLen  " + i2);
        if (yVar.getType() == 109) {
            mo129648H7(Math.max(0, i2 != 0 ? ((i * 100) / i2) - 1 : 0));
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C98201k.class;
        super.onCreate(bundle);
        this.f272492s = getIntent().getLongExtra("img_msg_id", 0);
        this.f272493t = getIntent().getLongExtra("img_server_id", 0);
        this.f272490q = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f272491r = getIntent().getStringExtra("img_download_username");
        initView();
        if (this.f272492s > 0) {
            this.f272486j = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(this.f272491r, this.f272492s);
        }
        C92836k kVar = this.f272486j;
        if ((kVar == null || kVar.f267374a <= 0) && this.f272493t > 0) {
            this.f272486j = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(this.f272491r, this.f272493t);
        }
        C92836k kVar2 = this.f272486j;
        if (kVar2 == null || kVar2.f267374a <= 0) {
            Log.m105920e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f272492s + ", or msgSvrId = " + this.f272493t);
            return;
        }
        if (this.f272492s <= 0 && this.f272493t > 0) {
            this.f272492s = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(this.f272491r, this.f272493t).getMsgId();
        }
        String str = this.f272486j.f267378e;
        String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, (String) null, (String) null, true);
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(TY)) {
            this.f272487n = ((C98201k) C86312j.m106911c(cls)).mo137273CF(this.f272486j.f267374a, this.f272492s, this.f272490q, this);
            C86709a0.m107529k().f251779b.mo123460f((C117747y) this.f272487n);
            return;
        }
        Log.m105925i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", str, Boolean.valueOf(this.f272486j.mo127145p()), TY);
        this.f272486j.mo127145p();
        if (TY == null || TY.equals("") || !C86013q1.m106450k(TY)) {
            Log.m105918d("MicroMsg.MailImageDownloadUI", "showImg : imgPath is null");
            return;
        }
        this.f272489p.setVisibility(8);
        this.f272480d.setVisibility(8);
        this.f272488o.setVisibility(0);
        this.f272488o.setImageBitmap(BitmapUtil.getBitmapNative(TY));
        this.f272485i.invalidate();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107529k().f251779b.mo123470p(109, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107529k().f251779b.mo123455a(109, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 109) {
            if (i == 0 && i2 == 0) {
                mo129648H7(this.f272480d.getMax());
                return;
            }
            Log.m105920e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + i + ", errCode = " + i2);
            C76701a.makeText((Context) this, (int) C0966R.string.fqq, 1).show();
        }
    }
}
