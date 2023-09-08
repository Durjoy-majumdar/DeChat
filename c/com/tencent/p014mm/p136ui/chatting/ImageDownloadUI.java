package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92805a0;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p158gt.C76053l;
import p158gt.C98201k;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.ImageDownloadUI */
public class ImageDownloadUI extends MMActivity implements C11385n, C47355o {

    /* renamed from: d */
    public ProgressBar f284305d;

    /* renamed from: e */
    public TextView f284306e;

    /* renamed from: f */
    public TextView f284307f;

    /* renamed from: g */
    public TextView f284308g;

    /* renamed from: h */
    public TextView f284309h;

    /* renamed from: i */
    public C92836k f284310i;

    /* renamed from: j */
    public C92805a0 f284311j;

    /* renamed from: n */
    public int f284312n;

    /* renamed from: o */
    public String f284313o;

    /* renamed from: p */
    public long f284314p = 0;

    /* renamed from: q */
    public long f284315q = 0;

    /* renamed from: com.tencent.mm.ui.chatting.ImageDownloadUI$a */
    public class C97011a implements MenuItem.OnMenuItemClickListener {
        public C97011a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C97625j3.m125815e().mo123458d(ImageDownloadUI.this.f284311j);
            ImageDownloadUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo135708H7(int i) {
        Class cls = C98201k.class;
        this.f284305d.setProgress(i);
        this.f284306e.setText(getString(C0966R.string.eze, new Object[]{Integer.valueOf(i)}));
        if (i >= this.f284305d.getMax()) {
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(this.f284311j.f267214h));
            String str = nP.f267378e;
            if (this.f284312n == 1) {
                str = ((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8(nP);
            }
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, (String) null, (String) null, true);
            if (TY == null || TY.equals("") || !C86013q1.m106450k(TY)) {
                Log.m105918d("ImageDownloadUI", "showImg : imgPath is null");
                return;
            }
            Log.m105924i("ImageDownloadUI", "[ImageGalleryUI] showImg");
            Intent intent = new Intent(this, ImageGalleryUI.class);
            intent.putExtra("key_message_id", this.f284314p);
            intent.putExtra("key_image_path", TY);
            intent.putExtra("key_compress_type", this.f284312n);
            intent.putExtra("key_favorite", true);
            intent.putExtra("img_gallery_msg_id", this.f284314p);
            intent.putExtra("img_gallery_talker", this.f284313o);
            finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbc;
    }

    public void initView() {
        this.f284306e = (TextView) findViewById(C0966R.C0970id.f45);
        this.f284307f = (TextView) findViewById(C0966R.C0970id.l5g);
        this.f284308g = (TextView) findViewById(C0966R.C0970id.l5h);
        this.f284309h = (TextView) findViewById(C0966R.C0970id.l5e);
        ((ImageView) findViewById(C0966R.C0970id.c9d)).setImageResource(C0966R.raw.download_image_icon);
        this.f284306e.setVisibility(0);
        this.f284307f.setVisibility(8);
        this.f284308g.setVisibility(8);
        this.f284309h.setVisibility(8);
        setBackBtn(new C97011a());
        this.f284305d = (ProgressBar) findViewById(C0966R.C0970id.l5f);
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        Log.m105918d("ImageDownloadUI", "offset " + i + "totaolLen  " + i2);
        if (yVar.getType() == 109) {
            mo135708H7(Math.max(0, i2 != 0 ? ((i * 100) / i2) - 1 : 0));
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C98201k.class;
        super.onCreate(bundle);
        this.f284314p = getIntent().getLongExtra("img_msg_id", 0);
        this.f284315q = getIntent().getLongExtra("img_server_id", 0);
        this.f284312n = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f284313o = getIntent().getStringExtra("img_download_username");
        initView();
        if (this.f284314p > 0) {
            this.f284310i = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(this.f284313o, this.f284314p);
        }
        C92836k kVar = this.f284310i;
        if ((kVar == null || kVar.f267374a <= 0) && this.f284315q > 0) {
            this.f284310i = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(this.f284313o, this.f284315q);
        }
        C92836k kVar2 = this.f284310i;
        if (kVar2 == null || kVar2.f267374a <= 0) {
            Log.m105920e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f284314p + ", or msgSvrId = " + this.f284315q);
            return;
        }
        if (this.f284314p <= 0 && this.f284315q > 0) {
            this.f284314p = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(this.f284313o, this.f284315q).getMsgId();
        }
        this.f284311j = new C92805a0(this.f284310i.f267374a, this.f284314p, this.f284312n, this);
        C97625j3.m125815e().mo123460f(this.f284311j);
    }

    public void onPause() {
        super.onPause();
        C97625j3.m125815e().mo123470p(109, this);
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(109, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 109) {
            if (i == 0 && i2 == 0) {
                mo135708H7(this.f284305d.getMax());
                return;
            }
            Log.m105920e("ImageDownloadUI", "onSceneEnd : fail, errType = " + i + ", errCode = " + i2);
            C76701a.makeText((Context) this, (int) C0966R.string.fqq, 1).show();
        }
    }
}
