package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a11.C39479c;
import an2.C0104a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75590o4;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import g62.C8232g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117792a0;
import p196ln.C76705f;
import p200lx.C10661v;
import p200lx.C46896e0;
import p206nj.C88956h;
import p227rn.C48053v;
import p239sv.C13783h;
import p239sv.C13786m;
import p629ny.C76979h;
import p640ox.C77049b;
import p910lj.C76701a;
import qo3.C77407n;
import te3.C48810b52;
import te3.C51567um2;
import tm2.C14049d;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI */
public class SelfQRCodeUI extends MMSecDataActivity implements C11385n {

    /* renamed from: D */
    public static final String f20752D = (C88956h.m111061b().toString() + "/Pictures/Screenshots/");

    /* renamed from: A */
    public Set<String> f20753A = new HashSet();

    /* renamed from: B */
    public final MTimerHandler f20754B = new MTimerHandler(new C5251g(), true);

    /* renamed from: C */
    public MStorage.IOnStorageChange f20755C = new C5252h();

    /* renamed from: d */
    public ProgressDialog f20756d = null;

    /* renamed from: e */
    public ImageView f20757e = null;

    /* renamed from: f */
    public ImageView f20758f = null;

    /* renamed from: g */
    public TextView f20759g = null;

    /* renamed from: h */
    public TextView f20760h = null;

    /* renamed from: i */
    public String f20761i = "";

    /* renamed from: j */
    public boolean f20762j = false;

    /* renamed from: n */
    public byte[] f20763n = null;

    /* renamed from: o */
    public Bitmap f20764o = null;

    /* renamed from: p */
    public long f20765p;

    /* renamed from: q */
    public LinearLayout f20766q;

    /* renamed from: r */
    public LinearLayout f20767r;

    /* renamed from: s */
    public View f20768s;

    /* renamed from: t */
    public TextView f20769t;

    /* renamed from: u */
    public ImageView f20770u;

    /* renamed from: v */
    public ImageView f20771v;

    /* renamed from: w */
    public ImageView f20772w;

    /* renamed from: x */
    public boolean f20773x = false;

    /* renamed from: y */
    public C5255k f20774y;

    /* renamed from: z */
    public List<C72979k3> f20775z;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$a */
    public class C5245a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f20776d;

        public C5245a(C117747y yVar) {
            this.f20776d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f20776d);
            if (C72996z1.m85820U5(SelfQRCodeUI.this.f20761i) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(SelfQRCodeUI.this.f20761i)) {
                SelfQRCodeUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$b */
    public class C5246b implements View.OnClickListener {
        public C5246b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SelfQRCodeUI.m5238H7(SelfQRCodeUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$c */
    public class C5247c implements Runnable {
        public C5247c() {
        }

        public void run() {
            int width = SelfQRCodeUI.this.f20757e.getWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SelfQRCodeUI.this.f20757e.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = width;
            SelfQRCodeUI.this.f20757e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$d */
    public class C5248d implements ViewTreeObserver.OnPreDrawListener {
        public C5248d() {
        }

        public boolean onPreDraw() {
            SelfQRCodeUI.this.f20766q.getViewTreeObserver().removeOnPreDrawListener(this);
            int a = C74942w4.m89784a(SelfQRCodeUI.this.getContext(), 500);
            if (SelfQRCodeUI.this.f20766q.getWidth() > a) {
                ViewGroup.LayoutParams layoutParams = SelfQRCodeUI.this.f20766q.getLayoutParams();
                layoutParams.width = a;
                SelfQRCodeUI.this.f20766q.setLayoutParams(layoutParams);
            }
            LinearLayout linearLayout = SelfQRCodeUI.this.f20767r;
            if (linearLayout == null || linearLayout.getWidth() <= a) {
                return true;
            }
            ViewGroup.LayoutParams layoutParams2 = SelfQRCodeUI.this.f20767r.getLayoutParams();
            layoutParams2.width = a;
            SelfQRCodeUI.this.f20767r.setLayoutParams(layoutParams2);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$e */
    public class C5249e implements MenuItem.OnMenuItemClickListener {
        public C5249e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelfQRCodeUI selfQRCodeUI = SelfQRCodeUI.this;
            String str = SelfQRCodeUI.f20752D;
            selfQRCodeUI.getClass();
            C77407n nVar = new C77407n((Context) selfQRCodeUI, 1, false);
            nVar.f225771i = new C5338b0(selfQRCodeUI);
            nVar.f225782p = new C5343c0(selfQRCodeUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$f */
    public class C5250f implements MenuItem.OnMenuItemClickListener {
        public C5250f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelfQRCodeUI.this.hideVKB();
            SelfQRCodeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$g */
    public class C5251g implements MTimerHandler.CallBack {
        public C5251g() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.SelfQRCodeNewUI", "refresh timer expired, update");
            SelfQRCodeUI selfQRCodeUI = SelfQRCodeUI.this;
            String str = SelfQRCodeUI.f20752D;
            selfQRCodeUI.mo6207K7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$h */
    public class C5252h implements MStorage.IOnStorageChange {
        public C5252h() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105918d("MicroMsg.SelfQRCodeNewUI", "onNotifyChange, fmsg change");
            if (!SelfQRCodeUI.this.f20754B.stopped()) {
                SelfQRCodeUI.this.f20754B.stopTimer();
            }
            SelfQRCodeUI.this.f20754B.startTimer(1000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$i */
    public class C5253i implements View.OnClickListener {
        public C5253i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107535s().mo121142i().mo119676J(143618, 0);
            C88144b.m109791i(SelfQRCodeUI.this.getContext(), "subapp", ".ui.friend.FMessageConversationUI", new Intent(), (Bundle) null);
            SelfQRCodeUI selfQRCodeUI = SelfQRCodeUI.this;
            selfQRCodeUI.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C5357g0(selfQRCodeUI, 1));
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$j */
    public interface C5254j {
        /* renamed from: b */
        byte[] mo6217b();

        /* renamed from: c */
        String mo6218c();

        /* renamed from: e */
        String mo6219e();
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI$k */
    public class C5255k extends FileObserver {

        /* renamed from: a */
        public MMActivity f20786a;

        /* renamed from: b */
        public String f20787b;

        public C5255k(MMActivity mMActivity) {
            super(SelfQRCodeUI.f20752D, 8);
            this.f20786a = mMActivity;
        }

        public void onEvent(int i, String str) {
            if (str != null && i == 8) {
                String str2 = this.f20787b;
                if (str2 == null || !str.equalsIgnoreCase(str2)) {
                    this.f20787b = str;
                    C86009m1 m1Var = new C86009m1(SelfQRCodeUI.f20752D + str);
                    SelfQRCodeUI selfQRCodeUI = SelfQRCodeUI.this;
                    FileProviderHelper.getUriForFile(selfQRCodeUI.getContext(), m1Var);
                    selfQRCodeUI.getClass();
                    C115669n.INSTANCE.idkeyStat(219, 14, 1, true);
                    Log.m105924i("MicroMsg.SelfQRCodeNewUI$ScreenshotObserver", "Send event to listener.");
                }
            }
        }
    }

    /* renamed from: H7 */
    public static void m5238H7(SelfQRCodeUI selfQRCodeUI) {
        C76879j.m92717K(selfQRCodeUI, true, selfQRCodeUI.getString(C0966R.string.i4n), selfQRCodeUI.getString(C0966R.string.i4o), selfQRCodeUI.getString(C0966R.string.i4p), selfQRCodeUI.getString(C0966R.string.f7926wf), new C5345d0(selfQRCodeUI), (DialogInterface.OnClickListener) null);
    }

    /* renamed from: I7 */
    public final void mo6205I7(int i) {
        C117747y yVar;
        int nullAsNil = this.f20762j ? Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(66561, (Object) null)) : 0;
        if (C72996z1.m85847r5(this.f20761i)) {
            yVar = ((C13786m) C86312j.m106911c(C13786m.class)).ig0(this.f20761i);
            C86709a0.m107524d().mo123460f(yVar);
        } else {
            yVar = (C117747y) ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71988dU(this.f20761i, nullAsNil, i);
            C86709a0.m107524d().mo123460f(yVar);
        }
        this.f20756d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ikf), true, true, new C5245a(yVar));
    }

    /* renamed from: J7 */
    public final void mo6206J7(int i, int i2, String str, C5254j jVar) {
        if (!C14049d.m13402a().mo93165v5(getContext(), i, i2, str)) {
            if (i == 0 && i2 == 0) {
                byte[] b = jVar.mo6217b();
                this.f20763n = b;
                this.f20764o = BitmapUtil.decodeByteArray(b);
                if (C72996z1.m85820U5(this.f20761i) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f20761i)) {
                    enableOptionMenu(true);
                    String c = jVar.mo6218c();
                    if (!Util.isNullOrNil(c)) {
                        ((TextView) findViewById(C0966R.C0970id.i_y)).setText(c);
                    }
                } else if (this.f20762j) {
                    String e = jVar.mo6219e();
                    TextView textView = (TextView) findViewById(C0966R.C0970id.f359387kn3);
                    View view = (View) textView.getParent();
                    if (!Util.isNullOrNil(e)) {
                        textView.setText(e);
                        view.setOnClickListener(new C5246b());
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = view;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f20757e.setImageBitmap(this.f20764o);
                return;
            }
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f0a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }

    /* renamed from: K7 */
    public final void mo6207K7() {
        Log.m105925i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, selfCode = %s", Boolean.valueOf(this.f20773x));
        if (this.f20773x) {
            C8232g M5 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96096M5();
            if (M5 instanceof C72982l3) {
                C72982l3 l3Var = (C72982l3) M5;
                try {
                    int bD = l3Var.mo101170bD();
                    Log.m105925i("MicroMsg.SelfQRCodeNewUI", "initView, newCount = %s", Integer.valueOf(bD));
                    if (bD > 0) {
                        this.f20767r.setVisibility(0);
                        View view = this.f20768s;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f20766q.setBackground(getResources().getDrawable(C0966R.C0969drawable.b9k));
                        ((C119157j) C119157j.f356862d).mo183875f(new C5357g0(this, 2));
                        this.f20769t.setText(getString(C0966R.string.m9c, new Object[]{Integer.valueOf(bD)}));
                        this.f20767r.setOnClickListener(new C5253i());
                        List<C72979k3> kD = l3Var.mo101173kD(3);
                        this.f20775z = kD;
                        if (kD.size() >= 3) {
                            mo6208L7(this.f20775z.get(2), this.f20775z.get(1), this.f20775z.get(0));
                        } else if (this.f20775z.size() >= 2) {
                            mo6208L7(this.f20775z.get(1), this.f20775z.get(0), (C72979k3) null);
                        } else if (this.f20775z.size() >= 1) {
                            mo6208L7(this.f20775z.get(0), (C72979k3) null, (C72979k3) null);
                        } else {
                            mo6208L7((C72979k3) null, (C72979k3) null, (C72979k3) null);
                        }
                    } else {
                        this.f20767r.setVisibility(4);
                        View view2 = this.f20768s;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(4);
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f20766q.setBackground(getResources().getDrawable(C0966R.C0969drawable.aqt));
                    }
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, e = %s", e);
                }
            }
        }
    }

    /* renamed from: L7 */
    public final void mo6208L7(C72979k3 k3Var, C72979k3 k3Var2, C72979k3 k3Var3) {
        Class cls = C76705f.class;
        if (k3Var != null) {
            this.f20770u.setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z(this.f20770u, k3Var.field_talker);
            ((HashSet) this.f20753A).add(k3Var.field_talker);
        } else {
            this.f20770u.setVisibility(8);
        }
        if (k3Var2 != null) {
            this.f20771v.setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z(this.f20771v, k3Var2.field_talker);
            ((HashSet) this.f20753A).add(k3Var2.field_talker);
        } else {
            this.f20771v.setVisibility(8);
        }
        if (k3Var3 != null) {
            this.f20772w.setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z(this.f20772w, k3Var3.field_talker);
            ((HashSet) this.f20753A).add(k3Var3.field_talker);
            return;
        }
        this.f20772w.setVisibility(8);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwl;
    }

    public void initView() {
        String str;
        Class cls = C76979h.class;
        Class cls2 = C76705f.class;
        Class cls3 = C48053v.class;
        String stringExtra = getIntent().getStringExtra("from_userName");
        this.f20761i = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f20761i = C75592q0.m90789s();
        }
        if (C75592q0.m90789s().equals(this.f20761i)) {
            this.f20762j = true;
        }
        String str2 = "";
        if (C72996z1.m85820U5(this.f20761i)) {
            setMMTitle((int) C0966R.string.iy8);
            ((TextView) findViewById(C0966R.C0970id.i_y)).setText(str2);
            enableOptionMenu(false);
        } else if (((C48053v) C86312j.m106911c(cls3)).mo72617gl(this.f20761i)) {
            setMMTitle((int) C0966R.string.cb_);
            ((TextView) findViewById(C0966R.C0970id.i_y)).setText(C0966R.string.cba);
            enableOptionMenu(false);
        } else {
            setMMTitle((int) C0966R.string.ixe);
            this.f20773x = true;
        }
        this.f20767r = (LinearLayout) findViewById(C0966R.C0970id.mlm);
        this.f20768s = findViewById(C0966R.C0970id.muw);
        this.f20769t = (TextView) findViewById(C0966R.C0970id.mmi);
        this.f20770u = (ImageView) findViewById(C0966R.C0970id.mln);
        this.f20771v = (ImageView) findViewById(C0966R.C0970id.mlo);
        this.f20772w = (ImageView) findViewById(C0966R.C0970id.mlp);
        this.f20766q = (LinearLayout) findViewById(C0966R.C0970id.i_l);
        this.f20757e = (ImageView) findViewById(C0966R.C0970id.jax);
        this.f20758f = (ImageView) findViewById(C0966R.C0970id.eur);
        this.f20759g = (TextView) findViewById(C0966R.C0970id.hfo);
        this.f20760h = (TextView) findViewById(C0966R.C0970id.c7l);
        this.f20766q.getViewTreeObserver().addOnPreDrawListener(new C5248d());
        if (C72996z1.m85820U5(this.f20761i) || ((C48053v) C86312j.m106911c(cls3)).mo72617gl(this.f20761i)) {
            mo6205I7(1);
            ((C76705f) C86312j.m106911c(cls2)).mo106849z(this.f20758f, this.f20761i);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f20761i);
            this.f20759g.setSingleLine(false);
            this.f20759g.setMaxLines(3);
            if (C45628s0.m50748M(this.f20761i)) {
                this.f20759g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getResources().getDrawable(C0966R.raw.open_im_main_logo), (Drawable) null);
            } else {
                this.f20759g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (z1Var != null) {
                String nickname = z1Var.getNickname();
                if (Util.isNullOrNil(nickname)) {
                    nickname = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f20761i).field_displayname;
                }
                this.f20759g.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, nickname, this.f20759g.getTextSize()));
            } else {
                this.f20759g.setVisibility(8);
            }
            this.f20760h.setVisibility(8);
        } else {
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(42, (Object) null);
            String string = getString(C0966R.string.f7993yn);
            if (!Util.isNullOrNil(str3)) {
                str = string + str3;
            } else {
                String str4 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
                C72996z1.m85802I4(str4);
                str = string + str4;
            }
            Log.m105919d("MicroMsg.SelfQRCodeNewUI", "display user name = %s", str);
            Bitmap bitmap = this.f20764o;
            if (bitmap == null) {
                Log.m105919d("MicroMsg.SelfQRCodeNewUI", "%s", "bitmap == null");
                mo6205I7(1);
            } else {
                this.f20757e.setImageBitmap(bitmap);
            }
            ((C76705f) C86312j.m106911c(cls2)).mo106849z(this.f20758f, C75592q0.m90789s());
            String str5 = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
            Log.m105919d("MicroMsg.SelfQRCodeNewUI", "nick name = %s", str5);
            this.f20759g.setText(((C76979h) C86312j.m106911c(cls)).op0(this, str5, C76577a.m92157h(getContext(), C0966R.dimen.f3881hq)));
            C75590o4 a = C75590o4.m90740a();
            String nullAsNil = Util.nullAsNil(a.mo105937d());
            String str6 = ((C75339i) C86312j.m106911c(C75339i.class)).K90(nullAsNil) + " " + Util.nullAsNil(a.mo105936c());
            Log.m105919d("MicroMsg.SelfQRCodeNewUI", "display location = %s", str6);
            this.f20760h.setText(str6);
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
            if (nullAs == 1) {
                this.f20759g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this, C0966R.raw.ic_sex_male), (Drawable) null);
                str2 = getResources().getString(C0966R.string.f361346j32);
            } else if (nullAs == 2) {
                this.f20759g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this, C0966R.raw.ic_sex_female), (Drawable) null);
                str2 = getResources().getString(C0966R.string.f361345j31);
            }
            ((C0104a) C39818r.f106831a.mo62444c(getContext()).mo75002a(C0104a.class)).setValue("sex_key", str2);
        }
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5249e());
        setBackBtn(new C5250f());
    }

    public boolean isLayoutInDecorView() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        C5255k kVar = new C5255k(this);
        this.f20774y = kVar;
        kVar.startWatching();
        C86709a0.m107524d().mo123455a(168, this);
        C86709a0.m107524d().mo123455a(C117792a0.CTRL_INDEX, this);
        initView();
        this.f20757e.post(new C5247c());
        C51567um2 um22 = (C51567um2) ((C77049b) C86312j.m106911c(C77049b.class)).mo72358wi(this, 1, 3, C51567um2.class);
        if (um22 != null && "launch_type_my_qrcode".equals(um22.f142940d)) {
            WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new WC3DTouchHomeShortCutStruct();
            wC3DTouchHomeShortCutStruct.f10090d = 3;
            wC3DTouchHomeShortCutStruct.f10091e = 1;
            wC3DTouchHomeShortCutStruct.mo86054n();
            wC3DTouchHomeShortCutStruct.mo86056r();
        }
        if (this.f20773x) {
            C8232g M5 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96096M5();
            if (M5 instanceof C72982l3) {
                ((C72982l3) M5).add(this.f20755C);
            }
            mo6207K7();
        }
    }

    public void onDestroy() {
        Class cls = C75700k0.class;
        C86709a0.m107524d().mo123470p(168, this);
        C86709a0.m107524d().mo123470p(C117792a0.CTRL_INDEX, this);
        C5255k kVar = this.f20774y;
        if (kVar != null) {
            kVar.stopWatching();
        }
        Bitmap bitmap = this.f20764o;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.SelfQRCodeNewUI", "bitmap recycle %s", this.f20764o.toString());
            this.f20764o.recycle();
        }
        if (this.f20773x) {
            List<C72979k3> list = this.f20775z;
            if (list != null && !list.isEmpty()) {
                C8232g M5 = ((C75700k0) C86709a0.m107533q(cls)).mo96096M5();
                if (M5 instanceof C72982l3) {
                    C72982l3 l3Var = (C72982l3) M5;
                    Iterator it = ((HashSet) this.f20753A).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!Util.isNullOrNil(str)) {
                            Log.m105925i("MicroMsg.SelfQRCodeNewUI", "onDestroy, unsetNew item.field_talker = %s,", str);
                            l3Var.mo101167SE(str);
                        }
                    }
                } else {
                    return;
                }
            }
            C86709a0.m107528h();
            if (C86709a0.m107522a()) {
                C8232g M52 = ((C75700k0) C86709a0.m107533q(cls)).mo96096M5();
                if (M52 instanceof C72982l3) {
                    ((C72982l3) M52).remove(this.f20755C);
                }
            }
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        if (!C72996z1.m85820U5(this.f20761i) && !((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f20761i)) {
            View findViewById = findViewById(C0966R.C0970id.f359155jb0);
            this.f20765p = C75592q0.m90781k();
            Log.m105918d("MicroMsg.SelfQRCodeNewUI", "" + (this.f20765p & 2) + ",extstatus:" + this.f20765p);
            if ((this.f20765p & 2) != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f20757e.setAlpha(0.1f);
                findViewById(C0966R.C0970id.jaz).setOnClickListener(new C5359h0(this));
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f20757e.setAlpha(1.0f);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.SelfQRCodeNewUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f20756d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f20756d = null;
        }
        if (yVar instanceof C10661v) {
            mo6206J7(i, i2, str, new C5348e0(this, (C10661v) yVar));
        } else if (yVar instanceof C13783h) {
            C48810b52 b522 = (C48810b52) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
            mo6206J7(i, i2, str, new C5351f0(this, b522.f130948d.f257327a, b522.f130949e));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0104a.class);
    }
}
