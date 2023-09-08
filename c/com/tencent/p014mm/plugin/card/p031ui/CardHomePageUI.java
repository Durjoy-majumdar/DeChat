package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83119r;
import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dz0.C20483c;
import dz0.C31352e;
import f40.C86709a0;
import f40.C86737h0;
import gz0.C45995o;
import hz0.C46142c0;
import hz0.C46153l0;
import hz0.C46154m;
import ie3.C76328d;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l20.C21388a;
import ob0.C117747y;
import oz0.C47407b;
import oz0.C47410c;
import p327ct.C30914c;
import p447aw.C103918d;
import pz0.C47717b;
import te3.C50569no;
import te3.C51997xn;
import te3.C52284zn;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53267r;

@C86737h0
/* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI */
public class CardHomePageUI extends CardBaseUI implements C31352e, MStorage.IOnStorageChange {

    /* renamed from: P */
    public static final /* synthetic */ int f109757P = 0;

    /* renamed from: A */
    public boolean f109758A = true;

    /* renamed from: B */
    public boolean f109759B = false;

    /* renamed from: C */
    public String f109760C = "";

    /* renamed from: D */
    public boolean f109761D = true;

    /* renamed from: E */
    public boolean f109762E = false;

    /* renamed from: F */
    public boolean f109763F = false;

    /* renamed from: G */
    public boolean f109764G = false;

    /* renamed from: H */
    public boolean f109765H = false;

    /* renamed from: I */
    public long f109766I = 0;

    /* renamed from: J */
    public long f109767J = 0;

    /* renamed from: K */
    public int f109768K = 0;

    /* renamed from: L */
    public TextView f109769L;

    /* renamed from: M */
    public LinearLayout f109770M;

    /* renamed from: N */
    public boolean f109771N = false;

    /* renamed from: w */
    public C40858b0 f109772w;

    /* renamed from: x */
    public C40869q f109773x;

    /* renamed from: y */
    public C40869q f109774y;

    /* renamed from: z */
    public C47407b f109775z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI$d */
    public class C2157d implements View.OnClickListener {
        public C2157d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(CardHomePageUI.this, CardIndexUI.class);
            intent.putExtra("key_card_type", 1);
            CardHomePageUI cardHomePageUI = CardHomePageUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(cardHomePageUI, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardHomePageUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(cardHomePageUI, "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo160131h(11324, "GotoMemberCardUI", 0, "", "", 0, 0, "", 0, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI$a */
    public class C40831a implements Runnable {
        public C40831a(CardHomePageUI cardHomePageUI) {
        }

        public void run() {
            C46153l0.zx0().mo71391h(C53267r.EN_DYNAMIC_CODE_SCENE_ENTER_WXCARD);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI$b */
    public class C40832b implements MenuItem.OnMenuItemClickListener {
        public C40832b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C53246b.m59670b(CardHomePageUI.this, true);
            C115669n.INSTANCE.mo160131h(11582, "CardListMsgMenu", 2, 0, "", "");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI$c */
    public class C40833c implements MenuItem.OnMenuItemClickListener {
        public C40833c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardHomePageUI cardHomePageUI = CardHomePageUI.this;
            int i = cardHomePageUI.f109768K;
            if (i == 1 || i == 2) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                intent.putExtra("preferred_tab", 3);
                C88144b.m109801s(cardHomePageUI, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
                cardHomePageUI.finish();
            } else {
                cardHomePageUI.finish();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI$e */
    public class C40834e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52284zn f109778d;

        public C40834e(C52284zn znVar) {
            this.f109778d = znVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52284zn znVar = this.f109778d;
            int i = znVar.f146107h;
            if (i == 1) {
                C53246b.m59678j(CardHomePageUI.this, znVar.f146108i, 0);
            } else if (i == 2) {
                if (znVar.f146109j != null) {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    C51997xn xnVar = this.f109778d.f146109j;
                    aVar.f9526a = xnVar.f144755d;
                    aVar.f9527b = Util.nullAs(xnVar.f144756e, "");
                    startAppBrandUIFromOuterEvent.f9522d.f9529d = 1028;
                    startAppBrandUIFromOuterEvent.publish();
                }
            } else if (i != 3) {
                Log.m105929w("MicroMsg.CardHomePageUI", "unknown op action: %s", Integer.valueOf(i));
            } else if ("weixin://wccard/sharecarddetail".equals(znVar.f146110n)) {
                Log.m105918d("MicroMsg.CardHomePageUI", "go to share card ui");
                Intent intent = new Intent(CardHomePageUI.this, ShareCardListUI.class);
                intent.putExtra("key_layout_buff", CardHomePageUI.this.f109760C);
                CardHomePageUI cardHomePageUI = CardHomePageUI.this;
                cardHomePageUI.f109761D = true;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                CardHomePageUI cardHomePageUI2 = cardHomePageUI;
                C117292a.m165358d(cardHomePageUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                cardHomePageUI.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(cardHomePageUI2, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(11324, "ClickShareCard", 0, "", "", 0, 0, "", 0, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H4 */
    public void mo58084H4() {
        this.f109762E = true;
    }

    /* renamed from: I7 */
    public C46154m mo63747I7() {
        return C46154m.HOME_MEMBER_CARD_TYPE;
    }

    /* renamed from: J7 */
    public void mo63748J7() {
        setMMTitle((int) C0966R.string.aym);
        addTextOptionMenu(0, getString(C0966R.string.f360225b00), new C40832b());
        C47407b bVar = new C47407b(this);
        this.f109775z = bVar;
        bVar.mo72438j();
        C50569no noVar = null;
        if (this.f109772w == null) {
            C40858b0 b0Var = new C40858b0(this, getContentView());
            this.f109772w = b0Var;
            View inflate = View.inflate(this, C0966R.C0971layout.f6759nr, (ViewGroup) null);
            b0Var.f109857f = inflate;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(inflate, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b0Var.f109858g = (TextView) b0Var.f109857f.findViewById(C0966R.C0970id.avb);
            b0Var.f109859h = (ImageView) b0Var.f109857f.findViewById(C0966R.C0970id.av_);
            b0Var.f109857f.setOnClickListener(new C40889z(b0Var));
            b0Var.mo63822a();
            if (b0Var.f109860i == null) {
                View inflate2 = ((ViewStub) b0Var.f109855d.findViewById(C0966R.C0970id.aw4)).inflate();
                b0Var.f109860i = inflate2;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(inflate2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(inflate2, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b0Var.f109861j = (TextView) b0Var.f109860i.findViewById(C0966R.C0970id.avb);
                b0Var.f109862n = (ImageView) b0Var.f109860i.findViewById(C0966R.C0970id.av_);
                b0Var.f109860i.setOnClickListener(new C40855a0(b0Var));
            }
            this.f109772w.f109863o = true;
        }
        if (this.f109773x == null) {
            this.f109773x = new C40869q(this, findViewById(C0966R.C0970id.f357630aw1), 1, this.f109775z);
        }
        if (this.f109774y == null) {
            this.f109774y = new C40869q(this, findViewById(C0966R.C0970id.axe), 3, this.f109775z);
        }
        C40869q qVar = this.f109773x;
        if (qVar != null) {
            qVar.f109902c.setOnClickListener(new C2161s(this));
        }
        C40869q qVar2 = this.f109774y;
        if (qVar2 != null) {
            qVar2.f109902c.setOnClickListener(new C2162t(this));
        }
        this.f109770M = (LinearLayout) findViewById(C0966R.C0970id.ath);
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_LIST_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            C50569no noVar2 = new C50569no();
            try {
                noVar2.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                noVar = noVar2;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.CardHomePageUI", e, "", new Object[0]);
            }
        }
        if (noVar != null) {
            mo63778Z7(noVar);
        }
        setBackBtn(new C40833c());
    }

    /* renamed from: K7 */
    public boolean mo63749K7() {
        return true;
    }

    /* renamed from: L7 */
    public boolean mo63750L7() {
        return true;
    }

    /* renamed from: M7 */
    public void mo63751M7() {
        mo63780b8();
    }

    /* renamed from: Q7 */
    public void mo63755Q7(C20483c cVar, int i) {
        super.mo63755Q7(cVar, i);
    }

    /* renamed from: R7 */
    public void mo63756R7(C20483c cVar) {
        super.mo63756R7(cVar);
    }

    /* renamed from: S7 */
    public void mo63757S7() {
        if (this.f109764G || this.f109763F) {
            mo63760V7();
            return;
        }
        this.f109764G = true;
        Log.m105924i("MicroMsg.CardHomePageUI", "onLocationFail()");
        mo63777Y7();
    }

    /* renamed from: T7 */
    public void mo63758T7() {
        if (this.f109763F) {
            Log.m105920e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.f109765H) {
                mo63760V7();
                return;
            }
            return;
        }
        Log.m105918d("MicroMsg.CardHomePageUI", "onLocationFinish()");
        this.f109763F = true;
        mo63777Y7();
        mo63760V7();
    }

    /* renamed from: U7 */
    public void mo63759U7() {
        Log.m105924i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.f109765H);
        if (!this.f109765H) {
            this.f109765H = true;
            Log.m105918d("MicroMsg.CardHomePageUI", "initLocation");
            C86709a0.m107525e().postToWorker(new C40870r(this));
        }
    }

    /* renamed from: Y7 */
    public final void mo63777Y7() {
        Log.m105918d("MicroMsg.CardHomePageUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
        if (!this.f109761D) {
            Log.m105924i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
        } else if (this.f109759B) {
            Log.m105920e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        } else {
            if (this.f109758A && !Util.isNullOrNil(this.f109760C)) {
                this.f109760C = "";
            }
            this.f109759B = true;
            this.f109761D = false;
            C86709a0.m107529k().f251779b.mo123460f(new C47717b((double) C46153l0.Jx0().f124035d, (double) C46153l0.Jx0().f124036e, this.f109760C));
        }
        if (C22945n.m27020t()) {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_GET_LAYOUT_SCENE_INT_SYNC, 1)).intValue();
            Log.m105924i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + intValue);
            C86709a0.m107529k().f251779b.mo123460f(new C46142c0((double) C46153l0.Jx0().f124035d, (double) C46153l0.Jx0().f124036e, intValue));
        } else {
            Log.m105924i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
        }
        C46153l0.Jx0().mo71409a("", "", 4);
    }

    /* renamed from: Z7 */
    public final void mo63778Z7(C50569no noVar) {
        LinkedList<C52284zn> linkedList;
        this.f109770M.removeAllViews();
        if (noVar != null && (linkedList = noVar.f138693d) != null && !linkedList.isEmpty()) {
            Iterator<C52284zn> it = noVar.f138693d.iterator();
            while (it.hasNext()) {
                C52284zn next = it.next();
                View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6720mp, this.f109770M, false);
                C40869q qVar = new C40869q(this, inflate, 4, this.f109775z, next);
                qVar.f109902c.setOnClickListener(new C40834e(next));
                this.f109770M.addView(inflate);
            }
        }
    }

    /* renamed from: a8 */
    public final void mo63779a8() {
        Class cls = C30914c.class;
        int intExtra = getIntent().getIntExtra("key_from_scene", 22);
        boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262152, 266256);
        boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262152, 266256);
        boolean f = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        boolean f2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, (Object) null));
        if (e) {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 2, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (b) {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 1, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f && !f2) {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 3, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f && f2) {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 4, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f2) {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 5, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else {
            C115669n.INSTANCE.mo160131h(11324, "CardHomePageUI", 0, "", "", 0, Integer.valueOf(intExtra), "", 0, nullAsNil);
        }
    }

    /* renamed from: b8 */
    public final void mo63780b8() {
        Log.m105924i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
        C40859c cVar = (C40859c) this.f109700e;
        if (this.f109769L == null) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.grh);
            this.f109769L = textView;
            textView.setOnClickListener(new C2157d());
        }
        if (cVar.getCount() > 0) {
            this.f109769L.setVisibility(0);
            this.f109769L.setText(getString(C0966R.string.b1j, new Object[]{Integer.valueOf(this.f109775z.mo72437g())}));
            this.f109773x.mo63837a(8);
            return;
        }
        this.f109769L.setVisibility(0);
        this.f109769L.setText(getString(C0966R.string.b1j, new Object[]{Integer.valueOf(this.f109775z.mo72437g())}));
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.aus);
        if (linearLayout != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.topMargin = C76577a.m92151b(this, 29);
            layoutParams.bottomMargin = C76577a.m92151b(this, 29);
            linearLayout.setLayoutParams(layoutParams);
        }
        this.f109773x.mo63837a(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6732n1;
    }

    public void initView() {
        boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, (String) null, (String) null);
        Log.m105925i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
        this.f109765H = Uu0;
        if (Uu0) {
            Log.m105918d("MicroMsg.CardHomePageUI", "initLocation");
            C86709a0.m107525e().postToWorker(new C40870r(this));
        } else {
            Log.m105920e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
            mo63777Y7();
        }
        super.initView();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109768K = getIntent().getIntExtra("key_home_page_from_scene", 0);
        long currentTimeMillis = System.currentTimeMillis();
        this.f109766I = currentTimeMillis;
        this.f109767J = currentTimeMillis;
        initView();
        C40858b0 b0Var = this.f109772w;
        b0Var.getClass();
        C45995o Bx0 = C46153l0.Bx0();
        if (Bx0.f124032a == null) {
            Bx0.f124032a = new ArrayList();
        }
        ((ArrayList) Bx0.f124032a).add(new WeakReference(b0Var));
        C86709a0.m107529k().f251779b.mo123455a(C83119r.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(1054, this);
        C46153l0.Kx0().mo60216a();
        C46153l0.vx0().mo58722a(1);
        mo63779a8();
        Looper.myQueue().addIdleHandler(new C40871u(this));
        C46153l0.Kx0().mo60219d(this);
        C46153l0.Gx0().add(this);
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this, 8, 2);
    }

    public void onDestroy() {
        if (this.f109765H) {
            mo63760V7();
        }
        C40858b0 b0Var = this.f109772w;
        b0Var.getClass();
        C46153l0.Bx0().mo71407f(b0Var);
        this.f109775z.getClass();
        C86709a0.m107529k().f251779b.mo123470p(C83119r.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1054, this);
        C46153l0.Kx0().mo60220e(this);
        C46153l0.Gx0().remove(this);
        C45995o.m51273a();
        Log.m105924i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        ThreadPool.post(new C47410c(), "delelteAllIllegalStatusCard");
        long currentTimeMillis = System.currentTimeMillis() - this.f109767J;
        C115669n.INSTANCE.mo160131h(13219, "CardHomePageUI", Integer.valueOf(this.f109768K), "", "", Long.valueOf(currentTimeMillis));
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            int i2 = this.f109768K;
            if (i2 == 1 || i2 == 2) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                intent.putExtra("preferred_tab", 3);
                C88144b.m109801s(this, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
                finish();
            } else {
                finish();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo63779a8();
        this.f109762E = true;
        this.f109761D = true;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        this.f109762E = true;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        Log.m105925i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", Boolean.valueOf(this.f109765H), Boolean.valueOf(this.f109771N), Boolean.valueOf(this.f109762E));
        if (this.f109765H) {
            if (this.f109771N && this.f109762E) {
                this.f109760C = "";
                this.f109763F = false;
                C92411b bVar = this.f109709q;
                if (bVar != null) {
                    bVar.mo126407a(this.f109713u, true);
                    C5139t.m5183e(22, 10);
                }
            }
        } else if (this.f109762E) {
            this.f109760C = "";
            mo63777Y7();
        }
        this.f109762E = false;
        Log.m105924i("MicroMsg.CardHomePageUI", "updateView()");
        this.f109772w.mo63822a();
        mo63780b8();
        this.f109774y.mo63838b();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f109766I;
        if (j != 0) {
            int i = (int) (currentTimeMillis - j);
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(0);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(1);
            iDKey2.SetValue((long) i);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, true);
            this.f109766I = 0;
        }
        C86709a0.m107525e().postToWorker(new C40831a(this));
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (i != 0 || i2 != 0) {
            if (yVar instanceof C47717b) {
                this.f109759B = false;
            }
            Log.m105925i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        } else if (yVar instanceof C46142c0) {
            mo63780b8();
            this.f109707o.onNotify();
            this.f109774y.mo63838b();
            mo63778Z7(((C46142c0) yVar).f124348g);
        } else if (yVar instanceof C47717b) {
            C47717b bVar = (C47717b) yVar;
            this.f109759B = false;
            this.f109760C = bVar.f128197g;
            this.f109775z.mo72443q(bVar.f128196f, this.f109758A);
            if (!this.f109775z.mo72439k() || !this.f109775z.mo72440l()) {
                this.f109758A = false;
            }
            Log.m105924i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
            Log.m105924i("MicroMsg.CardHomePageUI", "updateView()");
            this.f109772w.mo63822a();
            mo63780b8();
            this.f109774y.mo63838b();
        }
    }
}
