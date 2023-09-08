package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C92328i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsEditText;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C45335p;
import di3.C86312j;
import f40.C86709a0;
import fc1.C8010d;
import g83.C59390n;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76978g;
import p629ny.C76979h;
import p763ym.C39072t;
import p763ym.C79138l;
import qo3.C89779i0;
import s03.C63690g;
import t03.C22426h;
import t83.C13841a;
import te3.C48778ay;
import te3.C49966ja;
import te3.C51163rv3;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI */
public class TopStoryUploadUI extends MMActivity implements C11385n {

    /* renamed from: D */
    public static C20937c f207300D;

    /* renamed from: A */
    public boolean f207301A = false;

    /* renamed from: B */
    public C89779i0 f207302B = null;

    /* renamed from: C */
    public C45335p f207303C = new C71545d();

    /* renamed from: d */
    public int f207304d;

    /* renamed from: e */
    public String f207305e;

    /* renamed from: f */
    public String f207306f;

    /* renamed from: g */
    public String f207307g;

    /* renamed from: h */
    public String f207308h;

    /* renamed from: i */
    public String f207309i;

    /* renamed from: j */
    public String f207310j;

    /* renamed from: n */
    public String f207311n;

    /* renamed from: o */
    public View f207312o;

    /* renamed from: p */
    public View f207313p;

    /* renamed from: q */
    public ImageView f207314q;

    /* renamed from: r */
    public TextView f207315r;

    /* renamed from: s */
    public TextView f207316s;

    /* renamed from: t */
    public TextView f207317t;

    /* renamed from: u */
    public TextView f207318u;

    /* renamed from: v */
    public TextView f207319v;

    /* renamed from: w */
    public TextView f207320w;

    /* renamed from: x */
    public SnsEditText f207321x;

    /* renamed from: y */
    public TextView f207322y;

    /* renamed from: z */
    public long f207323z = 0;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI$a */
    public class C71542a implements DialogInterface.OnClickListener {
        public C71542a(TopStoryUploadUI topStoryUploadUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI$b */
    public class C71543b implements MenuItem.OnMenuItemClickListener {
        public C71543b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TopStoryUploadUI topStoryUploadUI = TopStoryUploadUI.this;
            C20937c cVar = TopStoryUploadUI.f207300D;
            topStoryUploadUI.mo98658H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI$c */
    public class C71544c implements C92328i {
        public C71544c() {
        }

        /* renamed from: a */
        public void mo7501a(boolean z) {
            C59390n.m69304a(2, 1, 3);
            Log.m105924i("micromsg.topstory.TopStoryUploadUI", "dismiss");
            TopStoryUploadUI topStoryUploadUI = TopStoryUploadUI.this;
            C20937c cVar = TopStoryUploadUI.f207300D;
            topStoryUploadUI.mo98658H7();
        }

        /* renamed from: b */
        public void mo7502b() {
            Log.m105924i("micromsg.topstory.TopStoryUploadUI", "onPosition");
            C59390n.m69304a(1, 1, 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI$d */
    public class C71545d implements C45335p {
        public C71545d() {
        }

        /* renamed from: a */
        public Object mo22792a(C53155r0 r0Var) {
            return null;
        }

        /* renamed from: b */
        public Object mo22793b(C53155r0 r0Var) {
            C115669n.INSTANCE.mo160131h(17080, 5, 2, TopStoryUploadUI.this.f207306f);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI$e */
    public class C71546e implements DialogInterface.OnClickListener {
        public C71546e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TopStoryUploadUI topStoryUploadUI = TopStoryUploadUI.this;
            C20937c cVar = TopStoryUploadUI.f207300D;
            topStoryUploadUI.mo98659I7(false);
        }
    }

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59347c = true;
        bVar.f59364t = false;
        bVar.f59359o = C0966R.color.f3549xe;
        f207300D = bVar.mo32666a();
    }

    /* renamed from: H7 */
    public final void mo98658H7() {
        C115669n.INSTANCE.mo160131h(17080, 3, 2, this.f207306f);
        if (this.f207321x.getText().toString().length() > 0) {
            C76879j.m92741l(this, C0966R.string.k56, 0, C0966R.string.a4h, C0966R.string.f360090a14, true, new C71546e(), new C71542a(this), C0966R.color.f3154h3);
            return;
        }
        mo98659I7(false);
    }

    /* renamed from: I7 */
    public final void mo98659I7(boolean z) {
        if (z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 110);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f207306f);
            WXOpenBusinessView.Resp resp = new WXOpenBusinessView.Resp();
            resp.extMsg = "";
            resp.errStr = "";
            resp.openId = appInfo.field_openId;
            resp.errCode = 0;
            resp.businessType = this.f207305e;
            Bundle bundle = new Bundle();
            resp.toBundle(bundle);
            bundle.putString("_openbusinessview_app_name", appInfo.field_appName);
            bundle.putString("_openbusinessview_package_name", appInfo.field_packageName);
            C22426h.m26109k(this, 54, bundle, "", (C13841a) null);
        } else {
            ((C39072t) C86312j.m106911c(C39072t.class)).r10(this.f207305e, "", this.f207306f, 0, "");
        }
        finish();
        this.f207301A = true;
    }

    /* renamed from: J7 */
    public final void mo98660J7() {
        int length = this.f207321x.getText().toString().length();
        if (length <= 0) {
            this.f207321x.setHint(C0966R.string.k55);
        } else {
            this.f207321x.setHint("");
        }
        if (length < 180) {
            this.f207317t.setVisibility(8);
            this.f207318u.setVisibility(8);
            return;
        }
        this.f207317t.setVisibility(0);
        this.f207318u.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(C0966R.color.ah_) : getResources().getColor(C0966R.color.a_0);
        TextView textView = this.f207317t;
        textView.setText("" + length);
        this.f207317t.setTextColor(color);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mo98658H7();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cao;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("micromsg.topstory.TopStoryUploadUI", "onCreate");
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.k5_);
        addTextOptionMenu(0, getString(C0966R.string.a2s), new C71551x(this), (View.OnLongClickListener) null, MMActivityController.C73075r.YELLOW);
        setBackBtn(new C71543b());
        C86709a0.m107524d().mo123455a(2534, this);
        this.f207304d = getIntent().getIntExtra("KEY_TYPE", 0);
        this.f207305e = getIntent().getStringExtra("KEY_BIZTYPE");
        this.f207306f = getIntent().getStringExtra("KEY_APPID");
        this.f207309i = getIntent().getStringExtra("KEY_EXTINFO");
        this.f207307g = getIntent().getStringExtra("KEY_TITLE");
        getIntent().getStringExtra("KEY_DESC");
        this.f207308h = getIntent().getStringExtra("KEY_THUMBURL");
        this.f207310j = getIntent().getStringExtra("KEY_APPVERSION");
        this.f207311n = getIntent().getStringExtra("KEY_MEDIANAME");
        getIntent().getStringExtra("KEY_MEDIAHEADURL");
        Log.m105925i("micromsg.topstory.TopStoryUploadUI", "onCreate, thumbUrl:%s", this.f207308h);
        this.f207312o = findViewById(C0966R.C0970id.l65);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.l64);
        this.f207315r = (TextView) findViewById(C0966R.C0970id.l7s);
        this.f207316s = (TextView) findViewById(C0966R.C0970id.l5b);
        this.f207321x = (SnsEditText) findViewById(C0966R.C0970id.bk8);
        this.f207322y = (TextView) findViewById(C0966R.C0970id.fmd);
        this.f207317t = (TextView) findViewById(C0966R.C0970id.f359599lr2);
        this.f207318u = (TextView) findViewById(C0966R.C0970id.f359600lr3);
        this.f207313p = findViewById(C0966R.C0970id.f6053w0);
        this.f207314q = (ImageView) findViewById(C0966R.C0970id.f6052vz);
        this.f207319v = (TextView) findViewById(C0966R.C0970id.f6055w2);
        this.f207320w = (TextView) findViewById(C0966R.C0970id.f6050vx);
        Log.m105924i("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap type = " + this.f207304d + "， isfile exist = " + C86013q1.m106450k(this.f207308h));
        if (this.f207304d == 1) {
            View view = this.f207312o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f207313p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207315r.setText(this.f207307g);
            this.f207316s.setText(this.f207311n);
            C20828a.m22825b().mo32520i(this.f207308h, this.f207314q, f207300D, new C5653t(this));
        } else {
            View view5 = this.f207312o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f207313p;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207319v.setText(this.f207307g);
            this.f207320w.setText(this.f207311n);
            C20828a.m22825b().mo32519h(this.f207308h, this.f207314q, f207300D);
        }
        this.f207322y.setText(String.format("<a href='%s'>%s</a>", new Object[]{HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmd) + "/cgi-bin/recweb/clientjump?tag=colikefirstsight#wechat_redirect", getString(C0966R.string.k58)}));
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(this.f207322y, 1);
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f207303C);
        mo98660J7();
        this.f207321x.addTextChangedListener(new C71547u(this));
        this.f207321x.setOnFocusChangeListener(new C71548v(this));
        this.mController.f348065F.mo91099j().postDelayed(new C71550w(this), 150);
        C115669n.INSTANCE.mo160131h(17080, 6, 1, this.f207306f);
        if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_init_dialog", false)) {
            C59390n.f169735a.mo84517d(this, new C71544c(), getResources().getString(C0966R.string.m2j));
        }
    }

    public void onDestroy() {
        Log.m105924i("micromsg.topstory.TopStoryUploadUI", "onDestroy");
        super.onDestroy();
        C89779i0 i0Var = this.f207302B;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f207302B = null;
        }
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f207303C);
        C86709a0.m107524d().mo123470p(2534, this);
        if (!this.f207301A) {
            C115669n.INSTANCE.mo160131h(17080, 3, 2, this.f207306f);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f207302B;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f207302B = null;
        }
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C63690g) {
                C49966ja jaVar = ((C48778ay) ((C63690g) yVar).f180546e.f127056b.f127083a).BaseResponse;
                if (jaVar.f135955d == 0) {
                    mo98659I7(true);
                    return;
                }
                C51163rv3 rv32 = jaVar.f135956e;
                if (rv32 == null || Util.isNullOrNil(rv32.f141175d)) {
                    C76879j.m92748s(this, getString(C0966R.string.k59), getString(C0966R.string.k57));
                } else {
                    C76879j.m92748s(this, jaVar.f135956e.f141175d, getString(C0966R.string.k57));
                }
            }
        } else if (Util.isNullOrNil(str)) {
            C76879j.m92748s(this, getString(C0966R.string.k47), getString(C0966R.string.k57));
        } else {
            C76879j.m92748s(this, str, getString(C0966R.string.k57));
        }
        C117407d.INSTANCE.idkeyStat(1032, 2, 1, false);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8010d.class);
    }
}
