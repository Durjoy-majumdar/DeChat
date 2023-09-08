package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C54429o0;
import com.tencent.kinda.gen.ITransmitKvData;
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
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.plugin.wallet_core.utils.C72504p;
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
import fy3.C32227p;
import gy3.C87412m;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import lg3.C76695c;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import rx3.C13598b0;
import s52.C63723i;
import sf0.C48374j0;
import te3.C50536nf3;
import te3.C64419hc3;
import te3.qy4;
import te3.ry4;
import te3.uy4;
import te3.yy4;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 */
public class MallIndexOSUIv2 extends MallIndexBaseUIv2 {

    /* renamed from: A */
    public View f201222A = null;

    /* renamed from: B */
    public long f201223B = 0;

    /* renamed from: C */
    public boolean f201224C = false;

    /* renamed from: D */
    public long f201225D = 0;

    /* renamed from: E */
    public boolean f201226E = false;

    /* renamed from: F */
    public String f201227F = "";

    /* renamed from: G */
    public int f201228G;

    /* renamed from: H */
    public IListener f201229H;

    /* renamed from: I */
    public IListener f201230I;

    /* renamed from: w */
    public int f201231w = 1;

    /* renamed from: x */
    public C69745d[] f201232x = new C69745d[3];

    /* renamed from: y */
    public C54429o0 f201233y = new C54429o0();

    /* renamed from: z */
    public TextView f201234z = null;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$c */
    public class C56878c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$c$a */
        public class C56879a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ yy4 f162925a;

            /* renamed from: b */
            public final /* synthetic */ boolean f162926b;

            public C56879a(yy4 yy4, boolean z) {
                this.f162925a = yy4;
                this.f162926b = z;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i < this.f162925a.f186614d.size()) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", C48374j0.m53713b(this.f162925a.f186614d.get(i).f186915e));
                    intent.putExtra(C74928u.C45093i.f122326r, true);
                    C75228t.m90217J(MallIndexOSUIv2.this.getContext(), intent);
                } else if (this.f162926b) {
                    MallIndexOSUIv2 mallIndexOSUIv2 = MallIndexOSUIv2.this;
                    mallIndexOSUIv2.getClass();
                    C88144b.m109794l(mallIndexOSUIv2, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
                }
            }
        }

        public C56878c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String[] strArr;
            C54429o0 o0Var = MallIndexOSUIv2.this.f201233y;
            yy4 yy4 = o0Var.f152663r;
            boolean z = o0Var.f152664s;
            if (z) {
                strArr = new String[(yy4.f186614d.size() + 1)];
                strArr[yy4.f186614d.size()] = MallIndexOSUIv2.this.getString(C0966R.string.kue);
            } else {
                strArr = new String[yy4.f186614d.size()];
            }
            String[] strArr2 = strArr;
            for (int i = 0; i < yy4.f186614d.size(); i++) {
                strArr2[i] = C48374j0.m53713b(yy4.f186614d.get(i).f186914d);
            }
            C76879j.m92737h(MallIndexOSUIv2.this.getContext(), (String) null, strArr2, (String) null, false, new C56879a(yy4, z));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$e */
    public static class C56880e extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$e$a */
        public class C56881a implements C32226l<View, String> {
            public C56881a(C56880e eVar) {
            }

            public Object invoke(Object obj) {
                return (String) ((View) obj).getTag(C0966R.C0970id.f359346ke3);
            }
        }

        public C56880e(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            focusOrder().next((int) C0966R.C0970id.mte);
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.euj);
            ViewSetter view = root.view(C0966R.C0970id.mte);
            ViewType viewType = ViewType.Button;
            view.type(viewType).descFormat(C0966R.string.f7358du).valueByView(C0966R.C0970id.f358474fc2).valueByView(C0966R.C0970id.faa);
            root.view(C0966R.C0970id.mtf).type(viewType).descFormat(C0966R.string.f7358du).valueByView(C0966R.C0970id.f358474fc2).valueByView(C0966R.C0970id.faa);
            root.view(C0966R.C0970id.mtg).type(viewType).descFormat(C0966R.string.f7358du).valueByView(C0966R.C0970id.f358474fc2).valueByView(C0966R.C0970id.faa);
            root(C0966R.C0970id.glq).view(C0966R.C0970id.glr).type(viewType).desc((C32226l<? super View, String>) new C56881a(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$a */
    public class C69743a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f201237d;

        public C69743a(LinearLayout linearLayout) {
            this.f201237d = linearLayout;
        }

        public void run() {
            MallIndexOSUIv2.this.f201228G = this.f201237d.getHeight();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$b */
    public class C69744b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ ry4 f201239g;

        public C69744b(ry4 ry4) {
            this.f201239g = ry4;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            String b = C48374j0.m53713b(this.f201239g.f185307f);
            C115669n.INSTANCE.mo160131h(13867, b, Integer.valueOf(MallIndexOSUIv2.this.f201193q));
            if (b.equals("wxpay://bizmall/hk_offlinepay")) {
                Log.m105924i("MicroMsg.MallIndexOSUIv2", "click native hk offlinepay url");
                ((C76324c) C86312j.m106911c(C76324c.class)).startHKOfflinePrePay(MallIndexOSUIv2.this.getContext(), 1);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", b);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(MallIndexOSUIv2.this.getContext(), intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$d */
    public static class C69745d {

        /* renamed from: a */
        public View f201241a;

        /* renamed from: b */
        public CdnImageView f201242b;

        /* renamed from: c */
        public TextView f201243c;

        /* renamed from: d */
        public TextView f201244d;
    }

    public MallIndexOSUIv2() {
        C40008f fVar = C40008f.f107254d;
        this.f201229H = new IListener<WebViewCloseWindowEvent>(fVar) {
            {
                this.__eventId = -704562821;
            }

            public boolean callback(IEvent iEvent) {
                WebViewCloseWindowEvent webViewCloseWindowEvent = (WebViewCloseWindowEvent) iEvent;
                Log.m105925i("MicroMsg.MallIndexOSUIv2", "WebViewCloseWindowEventListener %s", webViewCloseWindowEvent.f9608d.f9609a);
                String str = MallIndexOSUIv2.this.f201227F;
                if (str != null && str.equals(webViewCloseWindowEvent.f9608d.f9609a)) {
                    MallIndexOSUIv2.this.f201226E = true;
                }
                return false;
            }
        };
        this.f201230I = new IListener<WebViewUIDestroyEvent>(fVar) {
            {
                this.__eventId = -1681666147;
            }

            public boolean callback(IEvent iEvent) {
                WebViewUIDestroyEvent webViewUIDestroyEvent = (WebViewUIDestroyEvent) iEvent;
                Log.m105925i("MicroMsg.MallIndexOSUIv2", "WebViewUIDestroyEvent %s isCloseWindow %s", webViewUIDestroyEvent.f194105d.f194106a, Boolean.valueOf(MallIndexOSUIv2.this.f201226E));
                String str = MallIndexOSUIv2.this.f201227F;
                if (str != null && str.equals(webViewUIDestroyEvent.f194105d.f194106a)) {
                    MallIndexOSUIv2.this.getClass();
                    MMHandlerThread.postToMainThreadDelayed(new C69792o(this), 500);
                }
                return false;
            }
        };
    }

    /* renamed from: J7 */
    public void mo95954J7() {
        removeAllOptionMenu();
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C56878c());
    }

    /* renamed from: K7 */
    public void mo95955K7() {
        View view = this.f201194r;
        if (view == null) {
            Log.m105924i("MicroMsg.MallIndexOSUIv2", "header = null");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.euj);
        if (linearLayout == null) {
            Log.m105924i("MicroMsg.MallIndexOSUIv2", "headerContentLayout = null");
            return;
        }
        if (C76695c.m92341b()) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.af9);
        }
        linearLayout.post(new C69743a(linearLayout));
    }

    /* renamed from: L7 */
    public void mo95956L7() {
        int color = getResources().getColor(C0966R.color.a3o);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(C0966R.C0970id.iwk).setBackgroundColor(color);
    }

    /* renamed from: M7 */
    public int mo95957M7() {
        return this.f201228G;
    }

    /* renamed from: P7 */
    public void mo95958P7(MallFunction mallFunction, int i) {
        super.mo95958P7(mallFunction, i);
        C115669n nVar = C115669n.INSTANCE;
        C86709a0.m107528h();
        nVar.mo160131h(13720, mallFunction.f209737j, Long.valueOf(Util.safeParseLong(mallFunction.f209731d)), (Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    /* renamed from: Q7 */
    public void mo95959Q7() {
        View inflate = View.inflate(this, C0966R.C0971layout.ba4, (ViewGroup) null);
        this.f201222A = inflate;
        inflate.setClickable(false);
        this.f201222A.setEnabled(false);
        this.f201234z = (TextView) this.f201222A.findViewById(C0966R.C0970id.lje);
    }

    /* renamed from: R7 */
    public boolean mo95960R7() {
        View view;
        qy4 qy4 = this.f201233y.f152662q;
        int i = 0;
        while (true) {
            C69745d[] dVarArr = this.f201232x;
            if (i >= dVarArr.length) {
                break;
            }
            View view2 = dVarArr[i].f201241a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201232x[i].f201242b.setImageBitmap((Bitmap) null);
            i++;
        }
        int i2 = 0;
        while (i2 < qy4.f185096d.size() && i2 < this.f201232x.length) {
            ry4 ry4 = qy4.f185096d.get(i2);
            View view4 = this.f201232x[i2].f201241a;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201232x[i2].f201242b.setUrl(C48374j0.m53713b(ry4.f185306e));
            this.f201232x[i2].f201242b.setVisibility(0);
            this.f201232x[i2].f201243c.setText(C48374j0.m53713b(ry4.f185305d));
            String b = C48374j0.m53713b(ry4.f185308g);
            if (!Util.isNullOrNil(b)) {
                this.f201232x[i2].f201244d.setText(b);
                this.f201232x[i2].f201244d.setVisibility(0);
            } else {
                this.f201232x[i2].f201244d.setVisibility(8);
            }
            Log.m105925i("MicroMsg.MallIndexOSUIv2", "item %s name: %s,desc:%s,url %s,", Integer.valueOf(i2), ry4.f185305d, b, C48374j0.m53713b(ry4.f185306e));
            this.f201232x[i2].f201241a.setOnClickListener(new C69744b(ry4));
            i2++;
        }
        ListView listView = this.f201183d;
        if (!(listView == null || (view = this.f201222A) == null || this.f201224C)) {
            listView.addFooterView(view);
            this.f201224C = true;
        }
        if (Util.isNullOrNil(this.f201233y.f152669x)) {
            return true;
        }
        this.f201234z.setText(this.f201233y.f152669x);
        this.f201234z.setVisibility(0);
        return true;
    }

    /* renamed from: S7 */
    public void mo95961S7(View view) {
        C69745d[] dVarArr = this.f201232x;
        C69745d dVar = new C69745d();
        dVarArr[0] = dVar;
        dVar.f201241a = view.findViewById(C0966R.C0970id.mte);
        mo95972a8(this.f201232x[0]);
        C69745d[] dVarArr2 = this.f201232x;
        C69745d dVar2 = new C69745d();
        dVarArr2[1] = dVar2;
        dVar2.f201241a = view.findViewById(C0966R.C0970id.mtf);
        mo95972a8(this.f201232x[1]);
        C69745d[] dVarArr3 = this.f201232x;
        C69745d dVar3 = new C69745d();
        dVarArr3[2] = dVar3;
        dVar3.f201241a = view.findViewById(C0966R.C0970id.mtg);
        mo95972a8(this.f201232x[2]);
    }

    /* renamed from: T7 */
    public void mo95962T7() {
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ctp, (ViewGroup) null);
        this.f201194r = inflate;
        this.f201183d.addHeaderView(inflate);
        mo95955K7();
    }

    /* renamed from: U7 */
    public void mo95963U7() {
    }

    /* renamed from: V7 */
    public void mo95964V7() {
        C54429o0 o0Var = this.f201233y;
        String str = o0Var.f152665t;
        String str2 = o0Var.f152666u;
        setMMTitle(str);
        if (!Util.isNullOrNil(str2)) {
            setMMSubTitle(str2);
        }
    }

    /* renamed from: W7 */
    public void mo95965W7() {
        TextView textView = this.f201186g;
        C54429o0 o0Var = this.f201233y;
        C75228t.m90247g0((ViewGroup) findViewById(C0966R.C0970id.hji), textView, "1", o0Var.f152667v, o0Var.f152668w);
        if (!Util.isNullOrNil(this.f201233y.f152667v)) {
            C56880e eVar = (C56880e) component(C56880e.class);
            eVar.focusOrder().next((int) C0966R.C0970id.hji).next((int) C0966R.C0970id.hl8);
            eVar.findViewById(C0966R.C0970id.hji).sendAccessibilityEvent(8);
        }
    }

    /* renamed from: X7 */
    public void mo95966X7() {
    }

    /* renamed from: Y7 */
    public void mo95967Y7() {
    }

    /* renamed from: a8 */
    public final void mo95972a8(C69745d dVar) {
        dVar.f201242b = (CdnImageView) dVar.f201241a.findViewById(C0966R.C0970id.msx);
        dVar.f201243c = (TextView) dVar.f201241a.findViewById(C0966R.C0970id.f358474fc2);
        dVar.f201244d = (TextView) dVar.f201241a.findViewById(C0966R.C0970id.faa);
        if (C76695c.m92341b()) {
            dVar.f201244d.setTextColor(getContext().getResources().getColor(C0966R.color.al_));
        } else {
            dVar.f201244d.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
    }

    public void initView() {
        super.initView();
        ListView listView = this.f201183d;
        int i = C69770b.f201320a;
        listView.setPadding(i, 0, i, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.MallIndexOSUIv2", "onActivityResult requestCode %s resultCode %s", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r3 = r3.f185096d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            r0 = 1
            com.tencent.p014mm.plugin.mall.p075ui.C69803z.f201412a = r0
            com.tencent.p014mm.plugin.mall.p075ui.C69770b.m82208c(r2)
            r2.customfixStatusbar(r0)
            super.onCreate(r3)
            java.lang.Class<yz.v> r3 = p281yz.C79173v.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            yz.v r3 = (p281yz.C79173v) r3
            e63.k r3 = r3.Hx0()
            int r1 = r2.f201193q
            b63.o0 r3 = r3.mo58171jo(r1)
            r2.f201233y = r3
            r3 = 1577(0x629, float:2.21E-42)
            r2.addSceneEndListener(r3)
            b63.o0 r3 = r2.f201233y
            if (r3 == 0) goto L_0x0048
            te3.qy4 r3 = r3.f152662q
            r1 = 0
            if (r3 == 0) goto L_0x003b
            java.util.LinkedList<te3.ry4> r3 = r3.f185096d
            if (r3 == 0) goto L_0x003b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r3 = 0
            goto L_0x003c
        L_0x003b:
            r3 = 1
        L_0x003c:
            if (r3 == 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            s52.i r3 = new s52.i
            r3.<init>()
            r2.doSceneProgress(r3, r1)
            goto L_0x0050
        L_0x0048:
            s52.i r3 = new s52.i
            r3.<init>()
            r2.doSceneProgress(r3, r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.MallIndexOSUIv2.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1577);
        this.f201229H.dead();
        this.f201230I.dead();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        int i = this.f201231w;
        if (i == 1 || i == 2) {
            this.f201231w = 0;
        } else {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105919d("MicroMsg.MallIndexOSUIv2", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", Integer.valueOf(b), Long.valueOf(this.f201223B), Long.valueOf(currentTimeMillis));
            if (currentTimeMillis - this.f201223B >= ((long) b)) {
                this.f201223B = System.currentTimeMillis();
                doSceneProgress(new C63723i(), false);
            }
        }
        mo95964V7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C50536nf3 nf32;
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar.getType() == 1577) {
            C63723i iVar = (C63723i) yVar;
            C64419hc3 hc32 = iVar.f180625g;
            uy4 uy4 = iVar.f180624f;
            boolean z = false;
            if ((uy4 == null ? 0 : uy4.f185809d) == 1) {
                String str2 = "";
                if (!Util.isNullOrNil(uy4 == null ? str2 : uy4.f185810e)) {
                    if (isFinishing() || isDestroyed()) {
                        return true;
                    }
                    if (System.currentTimeMillis() - this.f201225D > 500) {
                        this.f201225D = System.currentTimeMillis();
                        this.f201229H.alive();
                        this.f201230I.alive();
                        Bundle bundle = new Bundle();
                        uy4 uy42 = iVar.f180624f;
                        if (uy42 != null) {
                            str2 = uy42.f185810e;
                        }
                        this.f201227F = str2;
                        Intent intent = new Intent();
                        Log.m105925i("MicroMsg.MallIndexOSUIv2", "startWebViewUI %s", this.f201227F);
                        bundle.putString("KoriginUrl", this.f201227F);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.f201227F);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", C75592q0.m90789s());
                        intent.putExtra("pay_channel", 1);
                        C75228t.m90218K(getContext(), intent, 4);
                    }
                }
            }
            this.f201233y = ((C79173v) C86312j.m106911c(C79173v.class)).Hx0().mo58171jo(this.f201193q);
            mo95965W7();
            mo95960R7();
            mo95964V7();
            Log.m105924i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip call");
            boolean z2 = this.f201233y.f152664s;
            C86709a0.m107528h();
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            Object f = i3.mo119685f(aVar, Boolean.FALSE);
            boolean booleanValue = f != null ? ((Boolean) f).booleanValue() : false;
            Log.m105924i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + z2);
            if (!booleanValue && z2) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                C76879j.m92713G(this, getString(C0966R.string.gn9), (String) null, true, (DialogInterface.OnClickListener) null);
            }
            Log.m105924i("MicroMsg.MallIndexOSUIv2", "[checkShowComplianceHalfPage]");
            if (isFinishing() || isDestroyed()) {
                Log.m105924i("MicroMsg.MallIndexOSUIv2", "isFinishing() || isDestroyed()");
            } else if (!(hc32 == null || (nf32 = hc32.f183476r) == null || !nf32.f138583d)) {
                try {
                    String encodeToString = Base64.encodeToString(nf32.f138584e.toByteArray(), 2);
                    C87412m.m108594g(encodeToString, "base64Data");
                    byte[] decode = Base64.decode(encodeToString, 0);
                    C87412m.m108593f(decode, "decode(base64Data, Base64.DEFAULT)");
                    if (decode.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        long currentTimeMillis = System.currentTimeMillis();
                        ITransmitKvData create = ITransmitKvData.create();
                        create.putBinary("half_page_view_data", decode);
                        create.putLong("usecase_platform_session", currentTimeMillis);
                        C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
                        if (cVar != null) {
                            cVar.startUseCase("complianceHalfPage", create, new C72504p((C32227p<? super C72502o.C72503a, ? super Long, C13598b0>) null));
                        }
                    }
                    this.f201231w = 2;
                } catch (IOException unused) {
                }
            }
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C56880e.class);
    }
}
