package com.tencent.p014mm.plugin.card.sharecard.p317ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83119r;
import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dz0.C20483c;
import dz0.C31352e;
import f40.C86709a0;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l20.C21388a;
import ob0.C117747y;
import oz0.C47407b;
import oz0.C47410c;
import p327ct.C30914c;
import p447aw.C103918d;
import pz0.C47717b;
import pz0.C47720h;
import pz0.C47724o;
import qz0.C47905b;
import qz0.C47907d;
import qz0.C47908e;
import qz0.C47910h;
import qz0.C47911i;
import wz0.C53248d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI */
public class ShareCardListUI extends CardBaseUI implements C31352e, MStorage.IOnStorageChange {

    /* renamed from: T */
    public static final /* synthetic */ int f109725T = 0;

    /* renamed from: A */
    public String f109726A = null;

    /* renamed from: B */
    public boolean f109727B = true;

    /* renamed from: C */
    public boolean f109728C = false;

    /* renamed from: D */
    public boolean f109729D = true;

    /* renamed from: E */
    public boolean f109730E = true;

    /* renamed from: F */
    public boolean f109731F = false;

    /* renamed from: G */
    public String f109732G = "";

    /* renamed from: H */
    public boolean f109733H = false;

    /* renamed from: I */
    public boolean f109734I = false;

    /* renamed from: J */
    public boolean f109735J = false;

    /* renamed from: K */
    public int f109736K = 0;

    /* renamed from: L */
    public boolean f109737L = false;

    /* renamed from: M */
    public long f109738M = 0;

    /* renamed from: N */
    public long f109739N = 0;

    /* renamed from: P */
    public boolean f109740P = false;

    /* renamed from: Q */
    public long f109741Q = 0;

    /* renamed from: R */
    public boolean f109742R = false;

    /* renamed from: S */
    public boolean f109743S = false;

    /* renamed from: w */
    public C47908e f109744w;

    /* renamed from: x */
    public C47907d f109745x;

    /* renamed from: y */
    public C47911i f109746y;

    /* renamed from: z */
    public C47407b f109747z;

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI$a */
    public class C40828a implements View.OnClickListener {
        public C40828a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0083  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                oz0.b r8 = r8.f109747z
                boolean r8 = oz0.C47407b.m52740b()
                r0 = 3
                r1 = 2
                if (r8 == 0) goto L_0x0036
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                oz0.b r8 = r8.f109747z
                boolean r8 = oz0.C47407b.m52741c()
                if (r8 == 0) goto L_0x0036
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                r8.f109736K = r1
                goto L_0x0044
            L_0x0036:
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                oz0.b r8 = r8.f109747z
                boolean r8 = oz0.C47407b.m52741c()
                if (r8 == 0) goto L_0x0044
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                r8.f109736K = r0
            L_0x0044:
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 11582(0x2d3e, float:1.623E-41)
                r3 = 6
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                java.lang.String r5 = "OperChangeOtherCity "
                r3[r4] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = 1
                r3[r6] = r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r1] = r4
                java.lang.String r1 = ""
                r3[r0] = r1
                r0 = 4
                r3[r0] = r1
                r0 = 5
                r3[r0] = r1
                r8.mo160131h(r2, r3)
                gz0.f r8 = hz0.C46153l0.yx0()
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r0 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                int r0 = r0.f109736K
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "key_share_card_show_type"
                r8.mo71383b(r1, r0)
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                android.widget.BaseAdapter r0 = r8.f109700e
                boolean r1 = r0 instanceof qz0.C47905b
                if (r1 == 0) goto L_0x008c
                qz0.b r0 = (qz0.C47905b) r0
                int r8 = r8.f109736K
                r0.f128524q = r8
                r0.mo7991f()
            L_0x008c:
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                qz0.d r8 = r8.f109745x
                r8.mo72673a()
                com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI r8 = com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.this
                oz0.b r8 = r8.f109747z
                r8.getClass()
                oz0.C47407b.f127189c = r6
                java.lang.String r8 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI.C40828a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI$b */
    public class C40829b implements AbsListView.OnScrollListener {
        public C40829b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                ShareCardListUI shareCardListUI = ShareCardListUI.this;
                if (!shareCardListUI.f109730E && shareCardListUI.f109736K != 4) {
                    Log.m105918d("MicroMsg.ShareCardListUI", "onScroll() >> doNetSceneGetCardsHomePageLayout()");
                    ShareCardListUI.this.mo63768Z7();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI$c */
    public class C40830c implements Runnable {
        public C40830c() {
        }

        public void run() {
            ShareCardListUI shareCardListUI = ShareCardListUI.this;
            shareCardListUI.f109742R = false;
            if (!shareCardListUI.isFinishing()) {
                ShareCardListUI.this.mo63771c8();
            } else {
                Log.m105928w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
            }
        }
    }

    /* renamed from: H4 */
    public void mo58084H4() {
        this.f109747z.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
        Log.m105924i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
        ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_local_city_category_info_list");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_category_info_list");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C47720h hVar = (C47720h) arrayList.get(i);
            C46153l0.Lx0().mo72540SE(hVar.f128210a, 10, hVar.f128211b);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            C47720h hVar2 = (C47720h) arrayList2.get(i2);
            C46153l0.Lx0().mo72540SE(hVar2.f128210a, 0, hVar2.f128211b);
        }
        C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
        Log.m105925i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        this.f109727B = true;
        Log.m105925i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", Boolean.valueOf(this.f109728C), Boolean.valueOf(this.f109706n), Boolean.valueOf(this.f109735J));
        if (!this.f109728C || !this.f109706n || !this.f109735J) {
            mo63771c8();
        } else {
            mo63769a8(false);
        }
        this.f109728C = false;
    }

    /* renamed from: H7 */
    public BaseAdapter mo63746H7() {
        return new C47905b(getContext());
    }

    /* renamed from: J7 */
    public void mo63748J7() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CARD_IS_SHOW_SHARE_CARD_ENTRANCE_TIP_INT_SYNC;
        setMMTitle((int) C0966R.string.b0z);
        C47407b bVar = new C47407b(this);
        this.f109747z = bVar;
        bVar.mo72438j();
        this.f109736K = C47407b.m52740b() ? 1 : C47407b.m52741c() ? C47407b.f127189c ? 3 : 4 : 0;
        if (this.f109746y == null) {
            C47911i iVar = new C47911i(this, getContentView());
            this.f109746y = iVar;
            View inflate = View.inflate(this, C0966R.C0971layout.f6773o5, (ViewGroup) null);
            iVar.f128544c = inflate;
            iVar.f128545d = (TextView) inflate.findViewById(C0966R.C0970id.avd);
            iVar.f128546e = (TextView) iVar.f128544c.findViewById(C0966R.C0970id.avh);
            iVar.mo72675a();
        }
        if (this.f109744w == null) {
            View contentView = getContentView();
            C47908e eVar = new C47908e(this, contentView);
            this.f109744w = eVar;
            eVar.f128537c = (ImageView) contentView.findViewById(C0966R.C0970id.hg9);
            eVar.f128539e = (TextView) eVar.f128535a.findViewById(C0966R.C0970id.hga);
            eVar.f128538d = (TextView) eVar.f128535a.findViewById(C0966R.C0970id.hgb);
            this.f109744w.getClass();
        }
        if (this.f109745x == null) {
            C47907d dVar = new C47907d(this, getContentView());
            this.f109745x = dVar;
            dVar.f128530c = this.f109747z;
            if (dVar.f128529b == null) {
                View inflate2 = View.inflate(this, C0966R.C0971layout.f6762nu, (ViewGroup) null);
                dVar.f128529b = inflate2;
                dVar.f128531d = (ImageView) inflate2.findViewById(C0966R.C0970id.f5740nb);
                dVar.f128534g = (TextView) dVar.f128529b.findViewById(C0966R.C0970id.jk_);
                dVar.f128532e = (LinearLayout) dVar.f128529b.findViewById(C0966R.C0970id.g3g);
                dVar.f128533f = (LinearLayout) dVar.f128529b.findViewById(C0966R.C0970id.g39);
                dVar.f128532e.setVisibility(8);
                dVar.f128533f.setVisibility(8);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                dVar.f128531d.startAnimation(rotateAnimation);
            }
            dVar.mo72673a();
            C47907d dVar2 = this.f109745x;
            C40828a aVar2 = new C40828a();
            View view = dVar2.f128529b;
            if (view != null) {
                view.setOnClickListener(aVar2);
            }
        }
        LinearLayout linearLayout = this.f109703h;
        if (linearLayout != null) {
            linearLayout.addView(this.f109746y.f128544c);
        }
        LinearLayout linearLayout2 = this.f109704i;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.f109745x.f128529b);
        }
        this.f109699d.setVisibility(0);
        this.f109699d.setOnScrollListener(new C40829b());
        if (getIntent() == null || !getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)) {
            Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0);
            if (!(num == null || num.intValue() == 1)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            }
        } else {
            Integer num2 = (Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0);
            if (num2 == null || num2.intValue() != 1) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                C53248d.m59686f(this, C0966R.C0971layout.f6780ob, C0966R.string.b19, "");
            }
        }
        this.f109726A = getIntent().getStringExtra("KEY_CARD_TP_ID");
        String stringExtra = getIntent().getStringExtra("key_layout_buff");
        this.f109732G = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f109727B = false;
        }
        if (!Util.isNullOrNil(this.f109726A)) {
            this.f109728C = true;
        }
    }

    /* renamed from: K7 */
    public boolean mo63749K7() {
        return true;
    }

    /* renamed from: O7 */
    public void mo63753O7(C20483c cVar, int i) {
        Intent intent = new Intent(this, CardDetailUI.class);
        Log.m105924i("MicroMsg.ShareCardListUI", "card tp id:" + cVar.mo23270R0());
        Log.m105924i("MicroMsg.ShareCardListUI", "card id:" + cVar.getCardId());
        intent.putExtra("key_card_id", C46153l0.Lx0().mo72541Yt(cVar.mo23270R0()));
        intent.putExtra("key_card_tp_id", cVar.mo23270R0());
        intent.putExtra("key_is_share_card", true);
        intent.putExtra("key_from_scene", 3);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        int i2 = 0;
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        String R0 = cVar.mo23270R0();
        if (!TextUtils.isEmpty(R0)) {
            ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_top_info_list");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            while (i2 < arrayList.size()) {
                C47724o oVar = (C47724o) arrayList.get(i2);
                if (oVar == null || !R0.equals(oVar.f128227a) || oVar.f128228b != 1) {
                    i2++;
                } else {
                    arrayList.set(i2, oVar);
                    C46153l0.yx0().mo71383b("key_share_card_other_city_top_info_list", arrayList);
                    return;
                }
            }
        }
    }

    /* renamed from: Q7 */
    public void mo63755Q7(C20483c cVar, int i) {
        if (cVar != null) {
            C47407b.m52749r(cVar.mo23270R0());
        }
        super.mo63755Q7(cVar, i);
    }

    /* renamed from: R7 */
    public void mo63756R7(C20483c cVar) {
        super.mo63756R7(cVar);
    }

    /* renamed from: S7 */
    public void mo63757S7() {
        if (this.f109734I || this.f109733H) {
            mo63760V7();
            return;
        }
        this.f109734I = true;
        Log.m105924i("MicroMsg.ShareCardListUI", "onLocationFail()");
        mo63767Y7();
    }

    /* renamed from: T7 */
    public void mo63758T7() {
        this.f109735J = true;
        if (this.f109733H) {
            Log.m105920e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.f109737L) {
                mo63760V7();
                return;
            }
            return;
        }
        Log.m105918d("MicroMsg.ShareCardListUI", "onLocationFinish()");
        this.f109733H = true;
        mo63767Y7();
        mo63760V7();
    }

    /* renamed from: U7 */
    public void mo63759U7() {
        Log.m105924i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.f109737L);
        if (!this.f109737L) {
            this.f109737L = true;
            Log.m105918d("MicroMsg.ShareCardListUI", "initLocation");
            ((C119157j) C119157j.f356862d).mo183876g(new C47910h(this), "MicroMsg.ShareCardListUI");
        }
    }

    /* renamed from: Y7 */
    public final void mo63767Y7() {
        if (!this.f109747z.mo72439k() || !this.f109747z.mo72440l()) {
            if (!this.f109747z.mo72439k() || !this.f109747z.mo72440l()) {
                this.f109729D = false;
            }
            Log.m105924i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
            mo63768Z7();
            C46153l0.Jx0().mo71409a("", "", 4);
            return;
        }
        Log.m105924i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
        this.f109730E = true;
    }

    /* renamed from: Z7 */
    public final void mo63768Z7() {
        if (this.f109731F) {
            Log.m105920e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
            return;
        }
        if (Util.isNullOrNil(this.f109732G) && !C47407b.m52740b() && !C47407b.m52741c() && !C47407b.m52740b() && !C47407b.m52741c()) {
            C47907d dVar = this.f109745x;
            dVar.f128532e.setVisibility(0);
            dVar.f128533f.setVisibility(8);
            this.f109699d.setEmptyView((View) null);
            this.f109699d.invalidate();
            this.f109743S = true;
        }
        if (this.f109729D && !Util.isNullOrNil(this.f109732G)) {
            this.f109732G = "";
        }
        this.f109731F = true;
        C86709a0.m107529k().f251779b.mo123460f(new C47717b((double) C46153l0.Jx0().f124035d, (double) C46153l0.Jx0().f124036e, this.f109732G));
    }

    /* renamed from: a8 */
    public final void mo63769a8(boolean z) {
        C92411b bVar;
        Log.m105925i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", Boolean.valueOf(this.f109727B), Boolean.valueOf(z));
        if (this.f109727B) {
            this.f109727B = false;
            this.f109733H = false;
            this.f109729D = true;
            this.f109732G = "";
            Log.m105918d("MicroMsg.ShareCardListUI", "doRefreshData() >> doNetSceneGetCardsHomePageLayout()");
            if (!z) {
                mo63768Z7();
            } else if (this.f109737L && this.f109740P && (bVar = this.f109709q) != null) {
                bVar.mo126407a(this.f109713u, true);
                C5139t.m5183e(22, 10);
            }
        }
        mo63771c8();
    }

    /* renamed from: b8 */
    public final void mo63770b8() {
        Class cls = C30914c.class;
        int intExtra = getIntent().getIntExtra("key_from_scene", 22);
        boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262152, 266256);
        boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262152, 266256);
        boolean f = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        boolean f2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, (Object) null));
        if (e) {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 2, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (b) {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 1, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f && !f2) {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 3, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f && f2) {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 4, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else if (f2) {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 5, Integer.valueOf(intExtra), "", 0, nullAsNil);
        } else {
            C115669n.INSTANCE.mo160131h(11324, "ShareCardListUI", 0, "", "", 0, Integer.valueOf(intExtra), "", 0, nullAsNil);
        }
    }

    /* renamed from: c8 */
    public final void mo63771c8() {
        long currentTimeMillis = System.currentTimeMillis() - this.f109741Q;
        boolean z = this.f109742R;
        if (!z || currentTimeMillis >= 1000) {
            Log.m105919d("MicroMsg.ShareCardListUI", "try2UpdateView isDoingUpdateView %s,interval %s", Boolean.valueOf(z), Long.valueOf(currentTimeMillis));
            this.f109742R = true;
            if (currentTimeMillis < 500) {
                MMHandlerThread.postToMainThreadDelayed(new C40830c(), 500);
                return;
            }
            int i = this.f109736K;
            if (i == 0 || i == 4 || ((i == 2 && (!C47407b.m52740b() || !C47407b.m52741c())) || ((this.f109736K == 1 && (!C47407b.m52740b() || C47407b.m52741c())) || (this.f109736K == 3 && (!C47407b.m52741c() || C47407b.m52740b()))))) {
                this.f109736K = C47407b.m52740b() ? 1 : C47407b.m52741c() ? C47407b.f127189c ? 3 : 4 : 0;
            }
            C46153l0.yx0().mo71383b("key_share_card_show_type", Integer.valueOf(this.f109736K));
            Log.m105925i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", Integer.valueOf(this.f109736K), Boolean.valueOf(C47407b.m52740b()), Boolean.valueOf(C47407b.m52741c()));
            C47908e eVar = this.f109744w;
            eVar.f128538d.setVisibility(0);
            eVar.f128537c.setImageDrawable(eVar.f128536b.getResources().getDrawable(C0966R.C0969drawable.bx6));
            eVar.f128538d.setText(C0966R.string.b0s);
            eVar.f128539e.setText(C0966R.string.b0r);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eVar.f128537c.getLayoutParams();
            layoutParams.topMargin = eVar.f128536b.getResources().getDimensionPixelOffset(C0966R.dimen.f4239x9);
            eVar.f128537c.setLayoutParams(layoutParams);
            eVar.f128537c.invalidate();
            if (C47407b.m52740b() || C47407b.m52741c()) {
                this.f109745x.mo72673a();
                this.f109746y.mo72675a();
                if (this.f109736K == 4 && this.f109699d.getEmptyView() != null) {
                    this.f109699d.setEmptyView((View) null);
                    this.f109699d.invalidate();
                }
            } else {
                C47907d dVar = this.f109745x;
                dVar.f128532e.setVisibility(8);
                dVar.f128533f.setVisibility(8);
                dVar.f128534g.setVisibility(8);
                View view = this.f109746y.f128544c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View emptyView = this.f109699d.getEmptyView();
                RelativeLayout relativeLayout = this.f109701f;
                if (emptyView != relativeLayout) {
                    this.f109699d.setEmptyView(relativeLayout);
                    this.f109699d.invalidate();
                }
            }
            BaseAdapter baseAdapter = this.f109700e;
            if (baseAdapter instanceof C47905b) {
                C47905b bVar = (C47905b) baseAdapter;
                bVar.f128524q = this.f109736K;
                bVar.mo7991f();
            }
            this.f109741Q = System.currentTimeMillis();
            this.f109742R = false;
            return;
        }
        Log.m105918d("MicroMsg.ShareCardListUI", "DoingUpdateView return");
    }

    public void initView() {
        super.initView();
        boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, (String) null, (String) null);
        Log.m105925i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
        this.f109737L = Uu0;
        if (Uu0) {
            Log.m105918d("MicroMsg.ShareCardListUI", "initLocation");
            ((C119157j) C119157j.f356862d).mo183876g(new C47910h(this), "MicroMsg.ShareCardListUI");
            return;
        }
        Log.m105920e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
        mo63767Y7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        this.f109738M = currentTimeMillis;
        this.f109739N = currentTimeMillis;
        initView();
        this.f109744w.getClass();
        this.f109745x.getClass();
        this.f109746y.getClass();
        C86709a0.m107529k().f251779b.mo123455a(C83119r.CTRL_INDEX, this);
        C46153l0.Kx0().mo60219d(this);
        mo63770b8();
        C46153l0.Lx0().add(this);
    }

    public void onDestroy() {
        if (this.f109737L) {
            mo63760V7();
        }
        this.f109744w.getClass();
        this.f109745x.f128530c = null;
        this.f109746y.getClass();
        this.f109747z.getClass();
        C86709a0.m107529k().f251779b.mo123470p(C83119r.CTRL_INDEX, this);
        C46153l0.Kx0().mo60220e(this);
        Log.m105924i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        ThreadPool.post(new C47410c(), "delelteAllIllegalStatusCard");
        C46153l0.Lx0().remove(this);
        long currentTimeMillis = System.currentTimeMillis() - this.f109739N;
        if (!TextUtils.isEmpty(this.f109726A)) {
            C115669n.INSTANCE.mo160131h(13219, "ShareCardListUI", 0, "", "", Long.valueOf(currentTimeMillis));
        } else {
            C115669n.INSTANCE.mo160131h(13219, "ShareCardListUI", 1, "", "", Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo63770b8();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("KEY_CARD_TP_ID");
            this.f109726A = stringExtra;
            if (!Util.isNullOrNil(stringExtra)) {
                this.f109728C = true;
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105918d("MicroMsg.ShareCardListUI", "onNotifyChange");
        this.f109727B = true;
    }

    public void onPause() {
        super.onPause();
        this.f109727B = false;
        this.f109728C = true;
    }

    public void onResume() {
        mo63769a8(true);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f109738M;
        if (j != 0) {
            int i = (int) (currentTimeMillis - j);
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(56);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(57);
            iDKey2.SetValue((long) i);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, true);
            this.f109738M = 0;
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        boolean z = true;
        if (i != 0 || i2 != 0) {
            if (yVar instanceof C47717b) {
                if (this.f109743S) {
                    this.f109743S = false;
                    this.f109745x.f128532e.setVisibility(8);
                    this.f109699d.setEmptyView(this.f109701f);
                    this.f109699d.invalidate();
                }
                this.f109731F = false;
                this.f109730E = true;
            }
            Log.m105925i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        } else if (yVar instanceof C47717b) {
            C47717b bVar = (C47717b) yVar;
            this.f109731F = false;
            this.f109732G = bVar.f128197g;
            this.f109747z.mo72443q(bVar.f128196f, this.f109729D);
            if (!this.f109747z.mo72439k() || !this.f109747z.mo72440l()) {
                this.f109729D = false;
            }
            if (!this.f109747z.mo72439k() || !this.f109747z.mo72440l()) {
                z = false;
            }
            this.f109730E = z;
            Log.m105924i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
            mo63771c8();
        }
    }
}
