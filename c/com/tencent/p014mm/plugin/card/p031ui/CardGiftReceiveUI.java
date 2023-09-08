package com.tencent.p014mm.plugin.card.p031ui;

import a70.C112760b;
import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GotoCardHomePageEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83121t;
import com.tencent.p014mm.plugin.card.model.CardGiftInfo;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dz0.C20483c;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C21038y;
import hz0.C46157t;
import hz0.C76251l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import p755xs.C102720b;
import p823sg.C77710q;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;
import te3.C50289lo;
import te3.xa4;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53248d;
import wz0.C78740a;

/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI */
public class CardGiftReceiveUI extends MMActivity implements View.OnClickListener, C11385n {

    /* renamed from: A */
    public ImageView f51841A;

    /* renamed from: B */
    public View f51842B;

    /* renamed from: C */
    public TextView f51843C;

    /* renamed from: D */
    public LinearLayout f51844D;

    /* renamed from: E */
    public ListView f51845E;

    /* renamed from: F */
    public RelativeLayout f51846F;

    /* renamed from: G */
    public LinearLayout f51847G;

    /* renamed from: H */
    public ImageView f51848H;

    /* renamed from: I */
    public TextView f51849I;

    /* renamed from: J */
    public LinearLayout f51850J;

    /* renamed from: K */
    public TextView f51851K;

    /* renamed from: L */
    public RelativeLayout f51852L;

    /* renamed from: M */
    public RelativeLayout f51853M;

    /* renamed from: N */
    public ImageView f51854N;

    /* renamed from: P */
    public ImageView f51855P;

    /* renamed from: Q */
    public TextView f51856Q;

    /* renamed from: R */
    public Button f51857R;

    /* renamed from: S */
    public TextView f51858S;

    /* renamed from: T */
    public ListView f51859T;

    /* renamed from: U */
    public RelativeLayout f51860U;

    /* renamed from: V */
    public TextView f51861V;

    /* renamed from: W */
    public TextView f51862W;

    /* renamed from: X */
    public View f51863X;

    /* renamed from: Y */
    public MMHandler f51864Y = new MMHandler(Looper.getMainLooper());

    /* renamed from: Z */
    public ProgressBar f51865Z;

    /* renamed from: d */
    public int f51866d;

    /* renamed from: e */
    public String f51867e;

    /* renamed from: f */
    public CardGiftInfo f51868f;

    /* renamed from: g */
    public C89779i0 f51869g = null;

    /* renamed from: h */
    public ScrollView f51870h;

    /* renamed from: i */
    public LinearLayout f51871i;

    /* renamed from: j */
    public ImageView f51872j;

    /* renamed from: n */
    public TextView f51873n;

    /* renamed from: o */
    public TextView f51874o;

    /* renamed from: p */
    public ImageView f51875p;

    /* renamed from: p0 */
    public RelativeLayout f51876p0;

    /* renamed from: q */
    public ImageView f51877q;

    /* renamed from: r */
    public LinearLayout f51878r;

    /* renamed from: s */
    public RelativeLayout f51879s;

    /* renamed from: t */
    public RelativeLayout f51880t;

    /* renamed from: u */
    public TextView f51881u;

    /* renamed from: v */
    public ImageView f51882v;

    /* renamed from: w */
    public TextView f51883w;

    /* renamed from: x */
    public TextView f51884x;

    /* renamed from: x0 */
    public C78740a.C78742b f51885x0 = new C18585d();

    /* renamed from: y */
    public TextView f51886y;

    /* renamed from: z */
    public ImageView f51887z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$a */
    public class C18582a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$a$a */
        public class C18583a implements DialogInterface.OnClickListener {
            public C18583a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CardGiftInfo cardGiftInfo = CardGiftReceiveUI.this.f51868f;
                int i2 = cardGiftInfo.f51575X;
                if (i2 == 1) {
                    if ("cardhomepage".equals(cardGiftInfo.f51576Y)) {
                        GotoCardHomePageEvent gotoCardHomePageEvent = new GotoCardHomePageEvent();
                        gotoCardHomePageEvent.f107606d.f107608a = CardGiftReceiveUI.this.getContext();
                        gotoCardHomePageEvent.publish();
                    } else if (!"cardhomepage/couponandgiftcard".equals(CardGiftReceiveUI.this.f51868f.f51576Y)) {
                    } else {
                        if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, Boolean.TRUE)).booleanValue()) {
                            Intent intent = new Intent();
                            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                            C88144b.m109791i(CardGiftReceiveUI.this.getContext(), "card", ".ui.v3.CouponCardListUI", intent, (Bundle) null);
                            return;
                        }
                        GotoCardHomePageEvent gotoCardHomePageEvent2 = new GotoCardHomePageEvent();
                        gotoCardHomePageEvent2.f107606d.f107608a = CardGiftReceiveUI.this.getContext();
                        gotoCardHomePageEvent2.publish();
                    }
                } else if (i2 == 2) {
                    C53246b.m59672d(cardGiftInfo.f51560H, cardGiftInfo.f51577Z, cardGiftInfo.f51588p0, 1028, 0);
                }
            }
        }

        public C18582a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(CardGiftReceiveUI.this.f51868f.f51597x0)) {
                AppCompatActivity context = CardGiftReceiveUI.this.getContext();
                C77389a aVar = new C77389a();
                aVar.f225660q = CardGiftReceiveUI.this.f51868f.f51597x0;
                aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.f7564js);
                aVar.f225620C = new C18583a();
                aVar.f225641X = true;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
            } else {
                CardGiftInfo cardGiftInfo = CardGiftReceiveUI.this.f51868f;
                int i = cardGiftInfo.f51575X;
                if (i == 1) {
                    if ("cardhomepage".equals(cardGiftInfo.f51576Y)) {
                        GotoCardHomePageEvent gotoCardHomePageEvent = new GotoCardHomePageEvent();
                        gotoCardHomePageEvent.f107606d.f107608a = CardGiftReceiveUI.this.getContext();
                        gotoCardHomePageEvent.publish();
                    } else if ("cardhomepage/couponandgiftcard".equals(CardGiftReceiveUI.this.f51868f.f51576Y)) {
                        if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, Boolean.TRUE)).booleanValue()) {
                            Intent intent = new Intent();
                            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                            C88144b.m109791i(CardGiftReceiveUI.this.getContext(), "card", ".ui.v3.CouponCardListUI", intent, (Bundle) null);
                        } else {
                            GotoCardHomePageEvent gotoCardHomePageEvent2 = new GotoCardHomePageEvent();
                            gotoCardHomePageEvent2.f107606d.f107608a = CardGiftReceiveUI.this.getContext();
                            gotoCardHomePageEvent2.publish();
                        }
                    }
                } else if (i == 2) {
                    C53246b.m59672d(cardGiftInfo.f51560H, cardGiftInfo.f51577Z, cardGiftInfo.f51588p0, 1028, 0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$c */
    public class C18584c implements MenuItem.OnMenuItemClickListener {
        public C18584c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardGiftReceiveUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$d */
    public class C18585d implements C78740a.C78742b {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$d$a */
        public class C18586a implements Runnable {
            public C18586a() {
            }

            public void run() {
                if (CardGiftReceiveUI.this.f51865Z.getVisibility() != 0) {
                    CardGiftReceiveUI.this.f51865Z.setVisibility(0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$d$b */
        public class C18587b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f51893d;

            /* renamed from: e */
            public final /* synthetic */ String f51894e;

            public C18587b(String str, String str2) {
                this.f51893d = str;
                this.f51894e = str2;
            }

            public void run() {
                if (CardGiftReceiveUI.this.f51865Z.getVisibility() != 8) {
                    CardGiftReceiveUI.this.f51865Z.setVisibility(8);
                }
                if (Util.isNullOrNil(this.f51893d) || Util.isNullOrNil(CardGiftReceiveUI.this.f51868f.f51584j) || !this.f51893d.equals(CardGiftReceiveUI.this.f51868f.f51584j)) {
                    CardGiftReceiveUI.this.f51853M.setVisibility(8);
                } else {
                    CardGiftReceiveUI.this.f51853M.setVisibility(0);
                }
                Bitmap Ou = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(this.f51894e);
                if (Ou == null) {
                    CardGiftReceiveUI.this.f51854N.setImageResource(C0966R.raw.download_image_icon);
                } else {
                    CardGiftReceiveUI.this.f51854N.setImageBitmap(Ou);
                }
            }
        }

        public C18585d() {
        }

        /* renamed from: J6 */
        public void mo23387J6(String str) {
            Log.m105920e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:" + str);
        }

        /* renamed from: j5 */
        public void mo23388j5(String str, String str2) {
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:" + str);
            if (CardGiftReceiveUI.this.f51868f == null) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
            } else if (Util.isNullOrNil(str) || Util.isNullOrNil(CardGiftReceiveUI.this.f51868f.f51583i) || !str.equals(CardGiftReceiveUI.this.f51868f.f51583i)) {
                CardGiftReceiveUI.this.f51864Y.post(new C18587b(str, str2));
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
            }
        }

        /* renamed from: q5 */
        public void mo23389q5(String str, int i, int i2) {
            if (CardGiftReceiveUI.this.f51868f == null) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
            } else if (Util.isNullOrNil(str) || Util.isNullOrNil(CardGiftReceiveUI.this.f51868f.f51583i) || !str.equals(CardGiftReceiveUI.this.f51868f.f51583i)) {
                CardGiftReceiveUI.this.f51864Y.post(new C18586a());
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$e */
    public class C18588e extends BaseAdapter {
        public C18588e() {
        }

        public int getCount() {
            return CardGiftReceiveUI.this.f51868f.f51566N.size();
        }

        public Object getItem(int i) {
            return CardGiftReceiveUI.this.f51868f.f51566N.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C18589f fVar;
            ImageView imageView;
            CardGiftInfo.AccepterItem accepterItem = CardGiftReceiveUI.this.f51868f.f51566N.get(i);
            if (view == null) {
                view = View.inflate(CardGiftReceiveUI.this, C0966R.C0971layout.f6714mj, (ViewGroup) null);
                fVar = new C18589f(CardGiftReceiveUI.this);
                fVar.f51897a = (ImageView) view.findViewById(C0966R.C0970id.f358447f60);
                fVar.f51898b = (TextView) view.findViewById(C0966R.C0970id.kva);
                fVar.f51899c = (TextView) view.findViewById(C0966R.C0970id.kvc);
                fVar.f51900d = (TextView) view.findViewById(C0966R.C0970id.kvb);
                view.setTag(fVar);
            } else {
                fVar = (C18589f) view.getTag();
            }
            if (accepterItem != null) {
                String str = accepterItem.f51605g;
                if (!(str == null || (imageView = fVar.f51897a) == null || TextUtils.isEmpty(str))) {
                    if (!TextUtils.isEmpty(str)) {
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59351g = C112760b.m154195C();
                        bVar.f59350f = C76251l.m91644m(str);
                        bVar.f59346b = true;
                        bVar.f59364t = true;
                        bVar.f59365u = (float) 3;
                        bVar.f59345a = true;
                        bVar.f59355k = 34;
                        bVar.f59354j = 34;
                        bVar.f59359o = C0966R.C0969drawable.f357296c91;
                        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
                    } else {
                        imageView.setImageResource(C0966R.C0969drawable.f357296c91);
                    }
                }
                fVar.f51898b.setText(accepterItem.f51604f);
                fVar.f51899c.setText(accepterItem.f51602d);
                TextView textView = fVar.f51900d;
                textView.setText(accepterItem.f51603e + CardGiftReceiveUI.this.getContext().getString(C0966R.string.axk));
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$f */
    public class C18589f {

        /* renamed from: a */
        public ImageView f51897a;

        /* renamed from: b */
        public TextView f51898b;

        /* renamed from: c */
        public TextView f51899c;

        /* renamed from: d */
        public TextView f51900d;

        public C18589f(CardGiftReceiveUI cardGiftReceiveUI) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$g */
    public class C18590g extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<CardGiftInfo.AcceptedCardItem> f51901d;

        public C18590g(LinkedList<CardGiftInfo.AcceptedCardItem> linkedList) {
            this.f51901d = linkedList;
        }

        public int getCount() {
            return this.f51901d.size();
        }

        public Object getItem(int i) {
            return this.f51901d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C18591h hVar;
            CardGiftInfo.AcceptedCardItem acceptedCardItem = this.f51901d.get(i);
            if (view == null) {
                view = View.inflate(CardGiftReceiveUI.this, C0966R.C0971layout.f6713mi, (ViewGroup) null);
                hVar = new C18591h(CardGiftReceiveUI.this);
                hVar.f51903a = (TextView) view.findViewById(C0966R.C0970id.kvr);
                hVar.f51904b = (TextView) view.findViewById(C0966R.C0970id.kvq);
                view.setTag(hVar);
            } else {
                hVar = (C18591h) view.getTag();
            }
            hVar.f51903a.setText(acceptedCardItem.f51600d);
            TextView textView = hVar.f51904b;
            textView.setText(acceptedCardItem.f51601e + CardGiftReceiveUI.this.getContext().getString(C0966R.string.axk));
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$h */
    public class C18591h {

        /* renamed from: a */
        public TextView f51903a;

        /* renamed from: b */
        public TextView f51904b;

        public C18591h(CardGiftReceiveUI cardGiftReceiveUI) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI$b */
    public class C18592b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C18592b() {
        }

        public void onGlobalLayout() {
            int b = C76577a.m92151b(CardGiftReceiveUI.this.getContext(), 67);
            int height = CardGiftReceiveUI.this.f51870h.getChildAt(0).getHeight() + b;
            int height2 = CardGiftReceiveUI.this.getWindow().findViewById(16908290).getHeight();
            Log.m105925i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", Integer.valueOf(b), Integer.valueOf(height), Integer.valueOf(height2));
            CardGiftReceiveUI.this.f51870h.setFillViewport(true);
            if (height > height2) {
                CardGiftReceiveUI.m19354H7(CardGiftReceiveUI.this, true);
            } else {
                CardGiftReceiveUI.m19354H7(CardGiftReceiveUI.this, false);
            }
            CardGiftReceiveUI.this.f51870h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: H7 */
    public static void m19354H7(CardGiftReceiveUI cardGiftReceiveUI, boolean z) {
        if (cardGiftReceiveUI.f51876p0 == null) {
            RelativeLayout relativeLayout = (RelativeLayout) View.inflate(cardGiftReceiveUI, C0966R.C0971layout.f6715mk, (ViewGroup) null);
            cardGiftReceiveUI.f51876p0 = relativeLayout;
            cardGiftReceiveUI.f51863X = relativeLayout.findViewById(C0966R.C0970id.ah9);
            cardGiftReceiveUI.f51861V = (TextView) cardGiftReceiveUI.f51876p0.findViewById(C0966R.C0970id.kwm);
            cardGiftReceiveUI.f51862W = (TextView) cardGiftReceiveUI.f51876p0.findViewById(C0966R.C0970id.kwl);
            cardGiftReceiveUI.f51861V.setOnClickListener(cardGiftReceiveUI);
            cardGiftReceiveUI.f51862W.setOnClickListener(cardGiftReceiveUI);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (z) {
                if (cardGiftReceiveUI.f51860U.getVisibility() == 0) {
                    layoutParams.addRule(3, C0966R.C0970id.f5308bk);
                } else {
                    layoutParams.addRule(3, C0966R.C0970id.aug);
                }
                layoutParams.bottomMargin = cardGiftReceiveUI.mo23378J7(30);
                layoutParams.topMargin = cardGiftReceiveUI.mo23378J7(40);
            } else {
                layoutParams.addRule(12, -1);
                layoutParams.bottomMargin = cardGiftReceiveUI.mo23378J7(30);
                layoutParams.topMargin = cardGiftReceiveUI.mo23378J7(40);
            }
            if (cardGiftReceiveUI.f51860U.getVisibility() == 0) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                if (cardGiftReceiveUI.f51852L.getVisibility() == 0) {
                    layoutParams2.topMargin = cardGiftReceiveUI.mo23378J7(0);
                    cardGiftReceiveUI.f51860U.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2.topMargin = cardGiftReceiveUI.mo23378J7(60);
                }
                cardGiftReceiveUI.f51860U.setLayoutParams(layoutParams2);
                cardGiftReceiveUI.f51860U.addView(cardGiftReceiveUI.f51876p0, layoutParams);
            } else {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.topMargin = cardGiftReceiveUI.mo23378J7(60);
                cardGiftReceiveUI.f51846F.setLayoutParams(layoutParams3);
                cardGiftReceiveUI.f51846F.addView(cardGiftReceiveUI.f51876p0, layoutParams);
            }
            if (!Util.isNullOrNil(cardGiftReceiveUI.f51868f.f51571T)) {
                cardGiftReceiveUI.f51861V.setVisibility(0);
                cardGiftReceiveUI.f51861V.setText(cardGiftReceiveUI.f51868f.f51571T);
            } else {
                cardGiftReceiveUI.f51861V.setVisibility(8);
            }
            if (!Util.isNullOrNil(cardGiftReceiveUI.f51868f.f51572U)) {
                View view = cardGiftReceiveUI.f51863X;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                cardGiftReceiveUI.f51862W.setVisibility(0);
                cardGiftReceiveUI.f51862W.setText(cardGiftReceiveUI.f51868f.f51572U);
            } else {
                View view3 = cardGiftReceiveUI.f51863X;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                cardGiftReceiveUI.f51862W.setVisibility(8);
            }
            if (Util.isNullOrNil(cardGiftReceiveUI.f51868f.f51581g)) {
                cardGiftReceiveUI.f51846F.setVisibility(8);
            }
        }
    }

    /* renamed from: I7 */
    public final void mo23377I7() {
        CardGiftInfo cardGiftInfo = this.f51868f;
        if (cardGiftInfo == null) {
            Log.m105920e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
            return;
        }
        Log.m105925i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", Integer.valueOf(cardGiftInfo.f51555C));
        int i = this.f51868f.f51555C;
        if (i == 1) {
            mo23382N7();
        } else if (i == 2) {
            this.f51878r.setVisibility(8);
            this.f51871i.setVisibility(0);
            this.f51873n.setText(this.f51868f.f51553A);
            TextView textView = this.f51874o;
            textView.setText(this.f51868f.f51591s + "     " + this.f51868f.f51592t + getContext().getString(C0966R.string.axk));
            if (!Util.isNullOrNil(this.f51868f.f51554B)) {
                this.f51872j.setVisibility(0);
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C76251l.m91644m(this.f51868f.f51554B);
                bVar.f59346b = true;
                bVar.f59345a = true;
                C20828a.m22825b().mo32519h(this.f51868f.f51554B, this.f51872j, bVar.mo32666a());
            } else {
                this.f51872j.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f51868f.f51557E)) {
                this.f51873n.setTextColor(Util.convertStringToRGB(this.f51868f.f51557E, getResources().getColor(C0966R.color.a7f)));
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            }
            if (!Util.isNullOrNil(this.f51868f.f51558F)) {
                this.f51874o.setTextColor(Util.convertStringToRGB(this.f51868f.f51558F, getResources().getColor(C0966R.color.a7f)));
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
            }
            if (!Util.isNullOrNil(this.f51868f.f51590r)) {
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59351g = C112760b.m154195C();
                bVar2.f59350f = C76251l.m91644m(this.f51868f.f51590r);
                bVar2.f59364t = true;
                bVar2.f59346b = true;
                bVar2.f59345a = true;
                bVar2.f59360p = new ColorDrawable(C22945n.m27004d("#CCCCCC"));
                C20828a.m22825b().mo32519h(this.f51868f.f51590r, this.f51877q, bVar2.mo32666a());
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
            }
            if (!Util.isNullOrNil(this.f51868f.f51589q)) {
                C20937c.C20939b bVar3 = new C20937c.C20939b();
                bVar3.f59351g = C112760b.m154195C();
                bVar3.f59350f = C76251l.m91644m(this.f51868f.f51589q);
                bVar3.f59346b = true;
                bVar3.f59345a = true;
                bVar3.f59360p = new ColorDrawable(C22945n.m27004d("#CCCCCC"));
                bVar3.f59364t = true;
                bVar3.f59365u = (float) C76577a.m92151b(this, 8);
                C20828a.m22825b().mo32519h(this.f51868f.f51589q, this.f51875p, bVar3.mo32666a());
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
            }
        } else {
            mo23382N7();
        }
        Class cls = C76979h.class;
        if (this.f51868f.f51568Q == 1) {
            this.f51847G.setVisibility(0);
            this.f51850J.setVisibility(8);
            this.f51846F.setVisibility(8);
            this.f51849I.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f51868f.f51579e, this.f51849I.getTextSize()));
            mo23381M7(this.f51848H);
        } else {
            this.f51847G.setVisibility(8);
            this.f51850J.setVisibility(0);
            this.f51846F.setVisibility(0);
            mo23381M7(this.f51855P);
            this.f51856Q.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f51868f.f51579e, this.f51856Q.getTextSize()));
            if ((Util.isNullOrNil(this.f51868f.f51582h) || "undefined".equals(this.f51868f.f51582h)) && (Util.isNullOrNil(this.f51868f.f51583i) || "undefined".equals(this.f51868f.f51583i))) {
                this.f51852L.setVisibility(8);
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
            } else {
                this.f51852L.setVisibility(0);
            }
            CardGiftInfo cardGiftInfo2 = this.f51868f;
            if (cardGiftInfo2 == null || Util.isNullOrNil(cardGiftInfo2.f51582h)) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
            } else {
                CardGiftInfo cardGiftInfo3 = this.f51868f;
                C78740a.m95079a(cardGiftInfo3.f51582h, cardGiftInfo3.f51585n, cardGiftInfo3.f51596x, 2);
            }
            CardGiftInfo cardGiftInfo4 = this.f51868f;
            if (cardGiftInfo4 == null || Util.isNullOrNil(cardGiftInfo4.f51584j)) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
            } else {
                CardGiftInfo cardGiftInfo5 = this.f51868f;
                C78740a.m95079a(cardGiftInfo5.f51584j, cardGiftInfo5.f51587p, cardGiftInfo5.f51599z, 2);
            }
            if (!Util.isNullOrNil(this.f51868f.f51581g)) {
                this.f51851K.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f51868f.f51581g, this.f51851K.getTextSize()));
            }
        }
        if (this.f51868f.f51565M.size() > 0) {
            View view = this.f51842B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f51845E.setVisibility(8);
            if (this.f51868f.f51565M.size() <= 2) {
                this.f51843C.setVisibility(8);
                mo23379K7(this.f51868f.f51565M);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.f51868f.f51565M.get(0));
                linkedList.add(this.f51868f.f51565M.get(1));
                mo23379K7(linkedList);
                this.f51843C.setVisibility(0);
                this.f51843C.setOnClickListener(this);
                LinkedList linkedList2 = new LinkedList();
                for (int i2 = 0; i2 < this.f51868f.f51565M.size(); i2++) {
                    if (!(i2 == 0 || i2 == 1)) {
                        linkedList2.add(this.f51868f.f51565M.get(i2));
                    }
                }
                this.f51845E.setAdapter(new C18590g(linkedList2));
                mo23380L7(this.f51845E);
            }
        } else {
            View view3 = this.f51842B;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f51843C.setVisibility(8);
            this.f51845E.setVisibility(8);
        }
        if (this.f51868f.f51566N.size() > 0) {
            this.f51860U.setVisibility(0);
            this.f51859T.setVisibility(0);
            this.f51859T.setAdapter(new C18588e());
            mo23380L7(this.f51859T);
            if (!Util.isNullOrNil(this.f51868f.f51567P)) {
                this.f51858S.setVisibility(0);
                this.f51858S.setText(this.f51868f.f51567P);
            }
        } else if (!Util.isNullOrNil(this.f51868f.f51567P)) {
            this.f51860U.setVisibility(0);
            this.f51858S.setVisibility(0);
            this.f51858S.setText(this.f51868f.f51567P);
            this.f51859T.setVisibility(8);
        } else {
            this.f51860U.setVisibility(8);
            this.f51858S.setVisibility(8);
            this.f51859T.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f51868f.f51574W)) {
            this.f51857R.setVisibility(0);
            this.f51857R.setText(this.f51868f.f51574W);
            this.f51857R.setOnClickListener(new C18582a());
        } else {
            this.f51857R.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f51868f.f51561I) || !Util.isNullOrNil(this.f51868f.f51593u) || !Util.isNullOrNil(this.f51868f.f51571T) || !Util.isNullOrNil(this.f51868f.f51572U)) {
            this.f51870h.getViewTreeObserver().addOnGlobalLayoutListener(new C18592b());
        } else {
            this.f51870h.setFillViewport(true);
        }
    }

    /* renamed from: J7 */
    public final int mo23378J7(int i) {
        return C76577a.m92151b(getContext(), i);
    }

    /* renamed from: K7 */
    public final void mo23379K7(LinkedList<CardGiftInfo.AcceptedCardItem> linkedList) {
        Iterator<CardGiftInfo.AcceptedCardItem> it = linkedList.iterator();
        while (it.hasNext()) {
            CardGiftInfo.AcceptedCardItem next = it.next();
            View inflate = View.inflate(this, C0966R.C0971layout.f6713mi, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.kvr)).setText(next.f51600d);
            ((TextView) inflate.findViewById(C0966R.C0970id.kvq)).setText(next.f51601e + getContext().getString(C0966R.string.axk));
            this.f51844D.addView(inflate);
        }
    }

    /* renamed from: L7 */
    public void mo23380L7(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int i = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                view.measure(0, 0);
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: M7 */
    public final void mo23381M7(ImageView imageView) {
        if (!Util.isNullOrNil(this.f51868f.f51580f)) {
            int b = C76577a.m92151b(this, 20);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C112760b.m154195C();
            bVar.f59350f = C76251l.m91644m(this.f51868f.f51580f);
            bVar.f59346b = true;
            bVar.f59364t = true;
            bVar.f59365u = (float) 3;
            bVar.f59345a = true;
            bVar.f59355k = b;
            bVar.f59354j = b;
            bVar.f59360p = new ColorDrawable(C22945n.m27004d("#CCCCCC"));
            C20828a.m22825b().mo32519h(this.f51868f.f51580f, imageView, bVar.mo32666a());
            return;
        }
        Log.m105924i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
    }

    /* renamed from: N7 */
    public final void mo23382N7() {
        this.f51871i.setVisibility(8);
        this.f51878r.setVisibility(0);
        this.f51883w.setText(this.f51868f.f51591s);
        if (this.f51868f.f51568Q == 1) {
            this.f51887z.setAlpha(0.5f);
            this.f51884x.setVisibility(8);
            this.f51886y.setVisibility(8);
            this.f51880t.setVisibility(8);
            this.f51879s.setVisibility(8);
        } else {
            this.f51884x.setVisibility(0);
            this.f51886y.setVisibility(0);
            this.f51880t.setVisibility(0);
            this.f51879s.setVisibility(0);
            this.f51884x.setText(this.f51868f.f51592t);
            this.f51886y.setText(C0966R.string.axk);
            if (Util.isNullOrNil(this.f51868f.f51592t)) {
                this.f51884x.setVisibility(8);
                this.f51886y.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f51868f.f51559G)) {
                this.f51884x.setTextColor(Util.convertStringToRGB(this.f51868f.f51559G, getResources().getColor(C0966R.color.a7f)));
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
            }
        }
        if (!Util.isNullOrNil(this.f51868f.f51554B)) {
            this.f51882v.setVisibility(0);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C112760b.m154195C();
            bVar.f59350f = C76251l.m91644m(this.f51868f.f51554B);
            bVar.f59346b = true;
            bVar.f59345a = true;
            C20828a.m22825b().mo32519h(this.f51868f.f51554B, this.f51882v, bVar.mo32666a());
        } else {
            this.f51882v.setVisibility(8);
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        }
        if (!Util.isNullOrNil(this.f51868f.f51553A)) {
            this.f51881u.setVisibility(0);
            this.f51881u.setText(this.f51868f.f51553A);
            if (!Util.isNullOrNil(this.f51868f.f51557E)) {
                this.f51881u.setTextColor(Util.convertStringToRGB(this.f51868f.f51557E, getResources().getColor(C0966R.color.a7f)));
            } else {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            }
        } else {
            this.f51881u.setVisibility(8);
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        }
        if (!Util.isNullOrNil(this.f51868f.f51558F)) {
            this.f51883w.setTextColor(Util.convertStringToRGB(this.f51868f.f51558F, getResources().getColor(C0966R.color.a7f)));
        } else {
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
        }
        if (!Util.isNullOrNil(this.f51868f.f51590r)) {
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59351g = C112760b.m154195C();
            bVar2.f59350f = C76251l.m91644m(this.f51868f.f51590r);
            bVar2.f59364t = true;
            bVar2.f59346b = true;
            bVar2.f59345a = true;
            bVar2.f59360p = new ColorDrawable(C22945n.m27004d("#CCCCCC"));
            C20828a.m22825b().mo32519h(this.f51868f.f51590r, this.f51841A, bVar2.mo32666a());
        } else {
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
        }
        if (!Util.isNullOrNil(this.f51868f.f51589q)) {
            C20937c.C20939b bVar3 = new C20937c.C20939b();
            bVar3.f59351g = C112760b.m154195C();
            bVar3.f59350f = C76251l.m91644m(this.f51868f.f51589q);
            bVar3.f59346b = true;
            bVar3.f59345a = true;
            bVar3.f59360p = new ColorDrawable(C22945n.m27004d("#CCCCCC"));
            bVar3.f59364t = true;
            bVar3.f59365u = (float) C76577a.m92151b(this, 8);
            C20828a.m22825b().mo32519h(this.f51868f.f51589q, this.f51887z, bVar3.mo32666a());
            return;
        }
        Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6717mm;
    }

    public void initView() {
        this.f51870h = (ScrollView) findViewById(C0966R.C0970id.auq);
        this.f51871i = (LinearLayout) findViewById(C0966R.C0970id.axk);
        this.f51872j = (ImageView) findViewById(C0966R.C0970id.fdi);
        this.f51873n = (TextView) findViewById(C0966R.C0970id.ky4);
        this.f51874o = (TextView) findViewById(C0966R.C0970id.f359447ky3);
        this.f51875p = (ImageView) findViewById(C0966R.C0970id.fdg);
        this.f51877q = (ImageView) findViewById(C0966R.C0970id.fdh);
        this.f51875p.setOnClickListener(this);
        this.f51878r = (LinearLayout) findViewById(C0966R.C0970id.axj);
        this.f51879s = (RelativeLayout) findViewById(C0966R.C0970id.a8l);
        this.f51880t = (RelativeLayout) findViewById(C0966R.C0970id.a8o);
        this.f51881u = (TextView) findViewById(C0966R.C0970id.kw5);
        this.f51883w = (TextView) findViewById(C0966R.C0970id.kxz);
        this.f51882v = (ImageView) findViewById(C0966R.C0970id.fdd);
        this.f51884x = (TextView) findViewById(C0966R.C0970id.kyh);
        this.f51886y = (TextView) findViewById(C0966R.C0970id.kyi);
        this.f51887z = (ImageView) findViewById(C0966R.C0970id.fcv);
        this.f51841A = (ImageView) findViewById(C0966R.C0970id.fcw);
        this.f51887z.setOnClickListener(this);
        this.f51842B = findViewById(C0966R.C0970id.avw);
        this.f51843C = (TextView) findViewById(C0966R.C0970id.ky6);
        this.f51844D = (LinearLayout) findViewById(C0966R.C0970id.avv);
        this.f51845E = (ListView) findViewById(C0966R.C0970id.avx);
        this.f51846F = (RelativeLayout) findViewById(C0966R.C0970id.auf);
        this.f51847G = (LinearLayout) findViewById(C0966R.C0970id.epm);
        this.f51848H = (ImageView) findViewById(C0966R.C0970id.fcy);
        this.f51849I = (TextView) findViewById(C0966R.C0970id.kwp);
        this.f51850J = (LinearLayout) findViewById(C0966R.C0970id.epl);
        this.f51855P = (ImageView) findViewById(C0966R.C0970id.fcx);
        this.f51856Q = (TextView) findViewById(C0966R.C0970id.kwo);
        this.f51851K = (TextView) findViewById(C0966R.C0970id.kwn);
        this.f51852L = (RelativeLayout) findViewById(C0966R.C0970id.av9);
        this.f51853M = (RelativeLayout) findViewById(C0966R.C0970id.f6d);
        this.f51854N = (ImageView) findViewById(C0966R.C0970id.kwu);
        this.f51852L.setOnClickListener(this);
        this.f51853M.setOnClickListener(this);
        this.f51858S = (TextView) findViewById(C0966R.C0970id.kv_);
        this.f51859T = (ListView) findViewById(C0966R.C0970id.f5308bk);
        this.f51860U = (RelativeLayout) findViewById(C0966R.C0970id.aud);
        this.f51857R = (Button) findViewById(C0966R.C0970id.avi);
        this.f51865Z = (ProgressBar) findViewById(C0966R.C0970id.f4v);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle("");
        setBackBtn(new C18584c());
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.f6d) {
            if (!Util.isNullOrNil(this.f51868f.f51583i)) {
                Intent intent = new Intent(this, CardGiftVideoUI.class);
                intent.putExtra("key_gift_into", this.f51868f);
                intent.putExtra("key_is_mute", false);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                C115669n.INSTANCE.mo160131h(13866, 3, this.f51867e, C77710q.m93738a(this.f51866d));
            }
        } else if (view.getId() == C0966R.C0970id.av9) {
            if (this.f51865Z.getVisibility() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (!Util.isNullOrNil(this.f51868f.f51582h)) {
                Intent intent2 = new Intent(this, CardGiftImageUI.class);
                intent2.putExtra("key_gift_into", this.f51868f);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                C115669n.INSTANCE.mo160131h(13866, 4, this.f51867e, C77710q.m93738a(this.f51866d));
            }
        } else if (view.getId() == C0966R.C0970id.kwl) {
            CardGiftInfo cardGiftInfo = this.f51868f;
            if (cardGiftInfo != null && cardGiftInfo.f51595w) {
                C115669n.INSTANCE.mo160131h(13866, 7, this.f51867e, C77710q.m93738a(this.f51866d));
                if (!"cardhomepage/couponandgiftcard".equals(this.f51868f.f51573V)) {
                    GotoCardHomePageEvent gotoCardHomePageEvent = new GotoCardHomePageEvent();
                    gotoCardHomePageEvent.f107606d.f107608a = getContext();
                    gotoCardHomePageEvent.f107606d.f107609b = 2;
                    gotoCardHomePageEvent.publish();
                    Log.m105924i("MicroMsg.CardGiftReceiveUI", "enter to cardhome");
                } else if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, Boolean.TRUE)).booleanValue()) {
                    Intent intent3 = new Intent();
                    intent3.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                    C88144b.m109791i(getContext(), "card", ".ui.v3.CouponCardListUI", intent3, (Bundle) null);
                } else {
                    GotoCardHomePageEvent gotoCardHomePageEvent2 = new GotoCardHomePageEvent();
                    gotoCardHomePageEvent2.f107606d.f107608a = getContext();
                    gotoCardHomePageEvent2.publish();
                }
                finish();
                overridePendingTransition(0, 0);
            }
        } else if (view.getId() == C0966R.C0970id.kwm) {
            if (!TextUtils.isEmpty(this.f51868f.f51569R) && !TextUtils.isEmpty(this.f51868f.f51570S)) {
                int intExtra = getIntent().getIntExtra("key_from_appbrand_type", 0);
                CardGiftInfo cardGiftInfo2 = this.f51868f;
                C53246b.m59672d(cardGiftInfo2.f51560H, cardGiftInfo2.f51569R, cardGiftInfo2.f51570S, 1062, intExtra);
                C115669n.INSTANCE.mo160131h(13866, 8, this.f51867e, C77710q.m93738a(this.f51866d));
            } else if (!Util.isNullOrNil(this.f51868f.f51562J)) {
                C53246b.m59678j(this, this.f51868f.f51562J, 0);
                C115669n.INSTANCE.mo160131h(13866, 8, this.f51867e, C77710q.m93738a(this.f51866d));
            }
        } else if (view.getId() == C0966R.C0970id.fcv || view.getId() == C0966R.C0970id.fdg) {
            if (Util.isNullOrNil(this.f51868f.f51563K) || Util.isNullOrNil(this.f51868f.f51564L)) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
            } else {
                LinkedList linkedList = new LinkedList();
                C50289lo loVar = new C50289lo();
                CardGiftInfo cardGiftInfo3 = this.f51868f;
                loVar.f137530d = cardGiftInfo3.f51563K;
                loVar.f137531e = cardGiftInfo3.f51564L;
                linkedList.add(loVar);
                String stringExtra = getIntent().getStringExtra("key_template_id");
                xa4 xa4 = new xa4();
                xa4.f144572d = stringExtra;
                Log.m105925i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", stringExtra);
                C86709a0.m107529k().f251779b.mo123460f(new C46157t(linkedList, xa4, 27));
                C115669n.INSTANCE.mo160131h(13866, 9, this.f51867e, C77710q.m93738a(this.f51866d));
            }
        } else if (view.getId() == C0966R.C0970id.ky6) {
            if (this.f51845E.getVisibility() == 0) {
                this.f51845E.setVisibility(8);
                this.f51843C.setText("查看全部");
            } else {
                this.f51845E.setVisibility(0);
                this.f51843C.setText("收起");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51867e = getIntent().getStringExtra("key_order_id");
        this.f51866d = getIntent().getIntExtra("key_biz_uin", -1);
        this.f51868f = (CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        Log.m105925i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", this.f51867e, Integer.valueOf(this.f51866d));
        initView();
        C86709a0.m107529k().f251779b.mo123455a(C83121t.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(1099, this);
        C78740a.m95080b(this.f51885x0);
        if (this.f51868f == null) {
            Log.m105924i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
            if (this.f51866d == -1) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
                return;
            }
            if (this.f51867e == null) {
                Log.m105920e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
            }
            Log.m105920e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
            C86709a0.m107529k().f251779b.mo123460f(new C21038y(this.f51866d, this.f51867e));
            C89779i0 Q = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C68784m(this));
            this.f51869g = Q;
            if (Q != null) {
                Q.show();
                return;
            }
            return;
        }
        mo23377I7();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(C83121t.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1099, this);
        C78740a.m95081c(this.f51885x0);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f51869g;
        if (i0Var != null && i0Var.isShowing()) {
            this.f51869g.dismiss();
        }
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C21038y) {
                Log.m105924i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
                this.f51868f = ((C21038y) yVar).f59528f;
                mo23377I7();
            } else if (yVar instanceof C46157t) {
                Intent intent = new Intent(this, CardDetailUI.class);
                LinkedList<CardInfo> linkedList = ((C46157t) yVar).f124429f;
                if (linkedList == null || linkedList.size() == 0) {
                    Log.m105920e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
                    return;
                }
                C20483c cVar = linkedList.get(0);
                if (cVar == null || !(cVar instanceof CardInfo)) {
                    Log.m105920e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<CardInfo> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                intent.putExtra("key_card_info", (CardInfo) cVar);
                intent.putExtra("key_previous_scene", 27);
                intent.putExtra("key_from_scene", 27);
                intent.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
                intent.putExtra("key_card_git_info", this.f51868f);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (yVar instanceof C21038y) {
            Log.m105921e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C53248d.m59685e(this, str, true);
        } else if (yVar instanceof C46157t) {
            Log.m105921e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }
}
