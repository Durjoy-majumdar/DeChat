package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C54429o0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewCloseWindowEvent;
import com.tencent.p014mm.autogen.events.WebViewUIDestroyEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import ie3.C76324c;
import j20.C117292a;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import s52.C63723i;
import sf0.C48374j0;
import te3.qy4;
import te3.ry4;
import te3.uy4;
import te3.yy4;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI */
public class MallIndexOSUI extends MallIndexBaseUI {

    /* renamed from: A */
    public boolean f201201A = false;

    /* renamed from: B */
    public boolean f201202B = false;

    /* renamed from: C */
    public long f201203C = 0;

    /* renamed from: D */
    public boolean f201204D = false;

    /* renamed from: E */
    public String f201205E = "";

    /* renamed from: F */
    public boolean f201206F = true;

    /* renamed from: G */
    public IListener f201207G;

    /* renamed from: H */
    public IListener f201208H;

    /* renamed from: v */
    public C69740c[] f201209v = new C69740c[4];

    /* renamed from: w */
    public C54429o0 f201210w = new C54429o0();

    /* renamed from: x */
    public TextView f201211x = null;

    /* renamed from: y */
    public long f201212y = 0;

    /* renamed from: z */
    public View f201213z = null;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$b */
    public class C56874b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$b$a */
        public class C56875a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ yy4 f162921a;

            /* renamed from: b */
            public final /* synthetic */ boolean f162922b;

            public C56875a(yy4 yy4, boolean z) {
                this.f162921a = yy4;
                this.f162922b = z;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i < this.f162921a.f186614d.size()) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", C48374j0.m53713b(this.f162921a.f186614d.get(i).f186915e));
                    intent.putExtra(C74928u.C45093i.f122326r, true);
                    C75228t.m90217J(MallIndexOSUI.this.getContext(), intent);
                } else if (this.f162922b) {
                    MallIndexOSUI mallIndexOSUI = MallIndexOSUI.this;
                    mallIndexOSUI.getClass();
                    C88144b.m109794l(mallIndexOSUI, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
                }
            }
        }

        public C56874b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String[] strArr;
            C54429o0 o0Var = MallIndexOSUI.this.f201210w;
            yy4 yy4 = o0Var.f152663r;
            boolean z = o0Var.f152664s;
            if (z) {
                strArr = new String[(yy4.f186614d.size() + 1)];
                strArr[yy4.f186614d.size()] = MallIndexOSUI.this.getString(C0966R.string.kue);
            } else {
                strArr = new String[yy4.f186614d.size()];
            }
            String[] strArr2 = strArr;
            for (int i = 0; i < yy4.f186614d.size(); i++) {
                strArr2[i] = C48374j0.m53713b(yy4.f186614d.get(i).f186914d);
            }
            C76879j.m92737h(MallIndexOSUI.this.getContext(), (String) null, strArr2, (String) null, false, new C56875a(yy4, z));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$d */
    public static class C56876d extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$d$a */
        public class C56877a implements C32226l<View, String> {
            public C56877a(C56876d dVar) {
            }

            public Object invoke(Object obj) {
                return (String) ((View) obj).getTag(C0966R.C0970id.f359346ke3);
            }
        }

        public C56876d(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            focusOrder().next((int) C0966R.C0970id.hl8);
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.euj);
            ViewSetter view = root.view(C0966R.C0970id.hl8);
            ViewType viewType = ViewType.Button;
            view.type(viewType).descFormat(C0966R.string.f7357dt).valueByView(C0966R.C0970id.hli);
            root.view(C0966R.C0970id.a4z).type(viewType).descFormat(C0966R.string.f7358du).valueByView(C0966R.C0970id.a5g).valueByView(C0966R.C0970id.a5_);
            root.view(C0966R.C0970id.a6b).type(viewType).descFormat(C0966R.string.f7357dt).valueByView(C0966R.C0970id.a7c);
            root(C0966R.C0970id.glq).view(C0966R.C0970id.glr).type(viewType).desc((C32226l<? super View, String>) new C56877a(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$a */
    public class C69739a extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ ry4 f201216g;

        public C69739a(ry4 ry4) {
            this.f201216g = ry4;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            String b = C48374j0.m53713b(this.f201216g.f185307f);
            C115669n.INSTANCE.mo160131h(13867, b, Integer.valueOf(MallIndexOSUI.this.f201175p));
            if (b.equals("wxpay://bizmall/hk_offlinepay")) {
                Log.m105924i("MicroMsg.MallIndexOSUI", "click native hk offlinepay url");
                ((C76324c) C86312j.m106911c(C76324c.class)).startHKOfflinePrePay(MallIndexOSUI.this.getContext(), 1);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", b);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(MallIndexOSUI.this.getContext(), intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$c */
    public class C69740c {

        /* renamed from: a */
        public View f201218a;

        /* renamed from: b */
        public CdnImageView f201219b;

        /* renamed from: c */
        public TextView f201220c;

        /* renamed from: d */
        public TextView f201221d;

        public C69740c(MallIndexOSUI mallIndexOSUI) {
        }
    }

    public MallIndexOSUI() {
        C40008f fVar = C40008f.f107254d;
        this.f201207G = new IListener<WebViewCloseWindowEvent>(fVar) {
            {
                this.__eventId = -704562821;
            }

            public boolean callback(IEvent iEvent) {
                WebViewCloseWindowEvent webViewCloseWindowEvent = (WebViewCloseWindowEvent) iEvent;
                Log.m105925i("MicroMsg.MallIndexOSUI", "WebViewCloseWindowEventListener %s", webViewCloseWindowEvent.f9608d.f9609a);
                String str = MallIndexOSUI.this.f201205E;
                if (str != null && str.equals(webViewCloseWindowEvent.f9608d.f9609a)) {
                    MallIndexOSUI.this.f201204D = true;
                }
                return false;
            }
        };
        this.f201208H = new IListener<WebViewUIDestroyEvent>(fVar) {
            {
                this.__eventId = -1681666147;
            }

            public boolean callback(IEvent iEvent) {
                WebViewUIDestroyEvent webViewUIDestroyEvent = (WebViewUIDestroyEvent) iEvent;
                Log.m105925i("MicroMsg.MallIndexOSUI", "WebViewUIDestroyEvent %s isCloseWindow %s", webViewUIDestroyEvent.f194105d.f194106a, Boolean.valueOf(MallIndexOSUI.this.f201204D));
                String str = MallIndexOSUI.this.f201205E;
                if (str != null && str.equals(webViewUIDestroyEvent.f194105d.f194106a)) {
                    MallIndexOSUI.this.getClass();
                    MMHandlerThread.postToMainThreadDelayed(new C69791n(this), 500);
                }
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public void mo95931H7() {
        removeAllOptionMenu();
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C56874b());
    }

    /* renamed from: I7 */
    public void mo95932I7() {
        int color = getResources().getColor(C0966R.color.a3o);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(C0966R.C0970id.iwk).setBackgroundColor(color);
    }

    /* renamed from: L7 */
    public void mo95935L7(MallFunction mallFunction, int i) {
        super.mo95935L7(mallFunction, i);
        C115669n nVar = C115669n.INSTANCE;
        C86709a0.m107528h();
        nVar.mo160131h(13720, mallFunction.f209737j, Long.valueOf(Util.safeParseLong(mallFunction.f209731d)), (Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    /* renamed from: M7 */
    public void mo95936M7() {
    }

    /* renamed from: N7 */
    public boolean mo95937N7() {
        View view;
        qy4 qy4 = this.f201210w.f152662q;
        int i = 0;
        while (true) {
            C69740c[] cVarArr = this.f201209v;
            if (i >= cVarArr.length) {
                break;
            }
            View view2 = cVarArr[i].f201218a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201209v[i].f201219b.setImageBitmap((Bitmap) null);
            i++;
        }
        int i2 = 0;
        while (i2 < qy4.f185096d.size() && i2 < this.f201209v.length) {
            ry4 ry4 = qy4.f185096d.get(i2);
            View view4 = this.f201209v[i2].f201218a;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201209v[i2].f201219b.setUrl(C48374j0.m53713b(ry4.f185306e));
            this.f201209v[i2].f201219b.setVisibility(0);
            this.f201209v[i2].f201220c.setText(C48374j0.m53713b(ry4.f185305d));
            Log.m105925i("MicroMsg.MallIndexOSUI", "item %d url %s", Integer.valueOf(i2), C48374j0.m53713b(ry4.f185306e));
            this.f201209v[i2].f201221d.setVisibility(8);
            String b = C48374j0.m53713b(ry4.f185308g);
            if (!Util.isNullOrNil(b)) {
                this.f201209v[i2].f201221d.setText(b);
                this.f201209v[i2].f201221d.setVisibility(0);
            }
            this.f201209v[i2].f201218a.setOnClickListener(new C69739a(ry4));
            i2++;
        }
        ListView listView = this.f201166d;
        if (!(listView == null || (view = this.f201213z) == null || this.f201201A)) {
            listView.addFooterView(view);
            this.f201201A = true;
        }
        if (!Util.isNullOrNil(this.f201210w.f152669x)) {
            this.f201211x.setText(this.f201210w.f152669x);
            this.f201211x.setVisibility(0);
        }
        return true;
    }

    /* renamed from: O7 */
    public void mo95938O7(View view) {
        C69740c[] cVarArr = this.f201209v;
        C69740c cVar = new C69740c(this);
        cVarArr[0] = cVar;
        cVar.f201218a = view.findViewById(C0966R.C0970id.hl8);
        this.f201209v[0].f201219b = (CdnImageView) view.findViewById(C0966R.C0970id.hla);
        this.f201209v[0].f201219b.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.f201209v[0].f201220c = (TextView) view.findViewById(C0966R.C0970id.hli);
        this.f201209v[0].f201221d = (TextView) view.findViewById(C0966R.C0970id.co4);
        this.f201209v[0].f201219b.setVisibility(4);
        C69740c[] cVarArr2 = this.f201209v;
        C69740c cVar2 = new C69740c(this);
        cVarArr2[1] = cVar2;
        cVar2.f201218a = view.findViewById(C0966R.C0970id.a4z);
        this.f201209v[1].f201219b = (CdnImageView) view.findViewById(C0966R.C0970id.a5a);
        this.f201209v[1].f201219b.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.f201209v[1].f201220c = (TextView) view.findViewById(C0966R.C0970id.a5g);
        this.f201209v[1].f201221d = (TextView) view.findViewById(C0966R.C0970id.a5_);
        this.f201209v[1].f201219b.setVisibility(4);
        C69740c[] cVarArr3 = this.f201209v;
        C69740c cVar3 = new C69740c(this);
        cVarArr3[2] = cVar3;
        cVar3.f201218a = view.findViewById(C0966R.C0970id.a6b);
        this.f201209v[2].f201219b = (CdnImageView) view.findViewById(C0966R.C0970id.a77);
        this.f201209v[2].f201219b.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.f201209v[2].f201220c = (TextView) view.findViewById(C0966R.C0970id.a7c);
        this.f201209v[2].f201221d = (TextView) view.findViewById(C0966R.C0970id.co5);
        this.f201209v[2].f201219b.setVisibility(4);
        C69740c[] cVarArr4 = this.f201209v;
        C69740c cVar4 = new C69740c(this);
        cVarArr4[3] = cVar4;
        cVar4.f201218a = view.findViewById(C0966R.C0970id.g9b);
        this.f201209v[3].f201219b = (CdnImageView) view.findViewById(C0966R.C0970id.f358659gb3);
        this.f201209v[3].f201220c = (TextView) view.findViewById(C0966R.C0970id.gbl);
        this.f201209v[3].f201219b.setVisibility(4);
        View view2 = this.f201209v[3].f201218a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: P7 */
    public void mo95939P7() {
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.baa, (ViewGroup) null);
        this.f201177r = inflate;
        this.f201166d.addHeaderView(inflate);
    }

    /* renamed from: R7 */
    public void mo95941R7() {
    }

    /* renamed from: S7 */
    public void mo95942S7() {
        C54429o0 o0Var = this.f201210w;
        String str = o0Var.f152665t;
        String str2 = o0Var.f152666u;
        setMMTitle(str);
        if (!Util.isNullOrNil(str2)) {
            setMMSubTitle(str2);
        }
    }

    /* renamed from: T7 */
    public void mo95943T7() {
    }

    /* renamed from: U7 */
    public void mo95944U7() {
        TextView textView = this.f201169g;
        C54429o0 o0Var = this.f201210w;
        C75228t.m90247g0((ViewGroup) findViewById(C0966R.C0970id.hji), textView, "1", o0Var.f152667v, o0Var.f152668w);
        if (!Util.isNullOrNil(this.f201210w.f152667v)) {
            C56876d dVar = (C56876d) component(C56876d.class);
            dVar.focusOrder().next((int) C0966R.C0970id.hji).next((int) C0966R.C0970id.hl8);
            dVar.findViewById(C0966R.C0970id.hji).sendAccessibilityEvent(8);
        }
    }

    /* renamed from: V7 */
    public void mo95945V7() {
    }

    /* renamed from: W7 */
    public void mo95946W7() {
    }

    public void finish() {
        this.f201202B = true;
        super.finish();
    }

    public void initView() {
        super.initView();
        ListView listView = this.f201166d;
        int i = C69770b.f201320a;
        listView.setPadding(i, 0, i, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.MallIndexOSUI", "onActivityResult requestCode %s resultCode %s", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        LinkedList<ry4> linkedList;
        boolean z = true;
        C69803z.f201412a = true;
        C69770b.m82207b(this, false, false);
        customfixStatusbar(true);
        super.onCreate(bundle);
        View inflate = View.inflate(this, C0966R.C0971layout.ba4, (ViewGroup) null);
        this.f201213z = inflate;
        inflate.setClickable(false);
        this.f201213z.setEnabled(false);
        this.f201211x = (TextView) this.f201213z.findViewById(C0966R.C0970id.lje);
        this.f201210w = ((C79173v) C86312j.m106911c(C79173v.class)).Hx0().mo58171jo(this.f201175p);
        addSceneEndListener(1577);
        C63723i iVar = new C63723i();
        C54429o0 o0Var = this.f201210w;
        if (o0Var != null) {
            qy4 qy4 = o0Var.f152662q;
            if (!(qy4 == null || (linkedList = qy4.f185096d) == null || linkedList.size() == 0)) {
                z = false;
            }
            if (!z) {
                doSceneProgress(iVar, false);
                return;
            }
        }
        doSceneForceProgress(iVar);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1577);
        this.f201207G.dead();
        this.f201208H.dead();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!this.f201206F) {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105919d("MicroMsg.MallIndexOSUI", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", Integer.valueOf(b), Long.valueOf(this.f201212y), Long.valueOf(currentTimeMillis));
            if (currentTimeMillis - this.f201212y >= ((long) b)) {
                this.f201212y = System.currentTimeMillis();
                doSceneProgress(new C63723i(), false);
            }
        } else {
            this.f201206F = false;
        }
        mo95942S7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar.getType() == 1577) {
            C63723i iVar = (C63723i) yVar;
            uy4 uy4 = iVar.f180624f;
            boolean z = false;
            if ((uy4 == null ? 0 : uy4.f185809d) == 1) {
                String str2 = "";
                if (!Util.isNullOrNil(uy4 == null ? str2 : uy4.f185810e)) {
                    if (this.f201202B) {
                        return true;
                    }
                    if (System.currentTimeMillis() - this.f201203C > 500) {
                        this.f201203C = System.currentTimeMillis();
                        this.f201207G.alive();
                        this.f201208H.alive();
                        Bundle bundle = new Bundle();
                        uy4 uy42 = iVar.f180624f;
                        if (uy42 != null) {
                            str2 = uy42.f185810e;
                        }
                        this.f201205E = str2;
                        Intent intent = new Intent();
                        Log.m105925i("MicroMsg.MallIndexOSUI", "startWebViewUI %s", this.f201205E);
                        bundle.putString("KoriginUrl", this.f201205E);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.f201205E);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", C75592q0.m90789s());
                        intent.putExtra("pay_channel", 1);
                        C75228t.m90218K(getContext(), intent, 4);
                    }
                }
            }
            this.f201210w = ((C79173v) C86312j.m106911c(C79173v.class)).Hx0().mo58171jo(this.f201175p);
            mo95944U7();
            mo95937N7();
            mo95942S7();
            Log.m105924i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip call");
            boolean z2 = this.f201210w.f152664s;
            C86709a0.m107528h();
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            Object f = i3.mo119685f(aVar, Boolean.FALSE);
            if (f != null) {
                z = ((Boolean) f).booleanValue();
            }
            Log.m105924i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip hadShow=" + z + ";isswc=" + z2);
            if (!z && z2) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                C76879j.m92713G(this, getString(C0966R.string.gn9), (String) null, true, (DialogInterface.OnClickListener) null);
            }
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C56876d.class);
    }
}
