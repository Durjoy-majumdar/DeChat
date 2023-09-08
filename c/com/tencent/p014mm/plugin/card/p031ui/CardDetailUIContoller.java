package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ConsumedCardByOfflinePayEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.CardConsumeCodeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import eb0.C75592q0;
import f40.C86709a0;
import gz0.C20871g;
import gz0.C45988h;
import gz0.C45991n;
import hz0.C21034b;
import hz0.C21036o;
import hz0.C46153l0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import oz0.C47407b;
import pz0.C22061g;
import rz0.C22280a;
import rz0.C22281b;
import rz0.C22282c;
import rz0.C22283d;
import rz0.C22284e;
import rz0.C22285f;
import rz0.C22286g;
import rz0.C22287h;
import te3.C22498fy;
import te3.C22511m1;
import te3.C22513m40;
import te3.C49029co;
import te3.n44;
import te3.xa4;
import te3.y34;
import vz0.C22809a0;
import vz0.C22813c;
import vz0.C22814c0;
import vz0.C22815d;
import vz0.C22816e;
import vz0.C22817f;
import vz0.C22818f0;
import vz0.C22819h;
import vz0.C22821l;
import vz0.C22822n;
import vz0.C22824y;
import vz0.C53049m;
import vz0.C53050p;
import vz0.C53056u;
import vz0.C78496d0;
import vz0.C78497o;
import wd3.C15148g1;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53247c;
import wz0.C53248d;
import xz0.C23145a;
import xz0.C23148d;
import xz0.C23150e;
import xz0.C23151f;
import xz0.C23152g;
import xz0.C23153h;
import xz0.C23154i;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller */
public class CardDetailUIContoller implements MMActivity.C6739d, C18609n0, C45988h.C45990b {

    /* renamed from: A */
    public C22816e f51772A;

    /* renamed from: B */
    public C22821l f51773B;

    /* renamed from: C */
    public C18596g0 f51774C;

    /* renamed from: D */
    public boolean f51775D = true;

    /* renamed from: E */
    public C20483c f51776E;

    /* renamed from: F */
    public ArrayList<C49029co> f51777F;

    /* renamed from: G */
    public List<C21034b> f51778G = new ArrayList();

    /* renamed from: H */
    public C20871g f51779H;

    /* renamed from: I */
    public String f51780I = "";

    /* renamed from: J */
    public String f51781J = "";

    /* renamed from: K */
    public int f51782K = 0;

    /* renamed from: L */
    public String f51783L = "";

    /* renamed from: M */
    public String f51784M = "";

    /* renamed from: N */
    public ArrayList<String> f51785N = new ArrayList<>();

    /* renamed from: P */
    public ArrayList<String> f51786P = new ArrayList<>();

    /* renamed from: Q */
    public HashMap<Integer, String> f51787Q = new HashMap<>();

    /* renamed from: R */
    public HashMap<String, C18574f> f51788R = new HashMap<>();

    /* renamed from: S */
    public ArrayList<String> f51789S = new ArrayList<>();

    /* renamed from: T */
    public C18581j f51790T;

    /* renamed from: U */
    public C18575g f51791U;

    /* renamed from: V */
    public boolean f51792V = false;

    /* renamed from: W */
    public MMHandler f51793W = new C18572b();

    /* renamed from: X */
    public View.OnClickListener f51794X = new C18573e();

    /* renamed from: Y */
    public IListener f51795Y = new IListener<ConsumedCardByOfflinePayEvent>(C40008f.f107254d) {
        {
            this.__eventId = -270499818;
        }

        public boolean callback(IEvent iEvent) {
            ConsumedCardByOfflinePayEvent consumedCardByOfflinePayEvent = (ConsumedCardByOfflinePayEvent) iEvent;
            if (C86709a0.m107522a()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "deal with card notify event ConsumedCardByOfflinePayEvent");
                if (consumedCardByOfflinePayEvent instanceof ConsumedCardByOfflinePayEvent) {
                    consumedCardByOfflinePayEvent.f193542d.getClass();
                    MMActivity mMActivity = CardDetailUIContoller.this.f51797e;
                    C53248d.m59683c(mMActivity, mMActivity.getResources().getString(C0966R.string.b2f));
                    return true;
                }
            }
            return false;
        }
    };

    /* renamed from: d */
    public View f51796d;

    /* renamed from: e */
    public MMActivity f51797e;

    /* renamed from: f */
    public C22286g f51798f;

    /* renamed from: g */
    public C22821l f51799g;

    /* renamed from: h */
    public boolean f51800h = false;

    /* renamed from: i */
    public C22821l f51801i;

    /* renamed from: j */
    public C22821l f51802j;

    /* renamed from: n */
    public C23154i f51803n;

    /* renamed from: o */
    public LinearLayout f51804o;

    /* renamed from: p */
    public C22819h f51805p;

    /* renamed from: q */
    public ListView f51806q;

    /* renamed from: r */
    public C18604l0 f51807r;

    /* renamed from: s */
    public C22821l f51808s;

    /* renamed from: t */
    public C22821l f51809t;

    /* renamed from: u */
    public C22821l f51810u;

    /* renamed from: v */
    public C22821l f51811v;

    /* renamed from: w */
    public C22821l f51812w;

    /* renamed from: x */
    public C22821l f51813x;

    /* renamed from: y */
    public C22821l f51814y;

    /* renamed from: z */
    public C22821l f51815z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$a */
    public class C18571a implements DialogInterface.OnClickListener {
        public C18571a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C18581j jVar = CardDetailUIContoller.this.f51790T;
            if (jVar != null) {
                CardDetailUI cardDetailUI = CardDetailUI.this;
                int i2 = CardDetailUI.f51728S;
                cardDetailUI.mo23356q();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$b */
    public class C18572b extends MMHandler {
        public C18572b() {
        }

        public void handleMessage(Message message) {
            C20483c cVar;
            ViewGroup viewGroup;
            Object obj = message.obj;
            if (obj != null && (obj instanceof C18577i)) {
                C18577i iVar = (C18577i) obj;
                C18576h hVar = iVar.f51835a;
                if (hVar == C18576h.onGetCodeFail) {
                    CardDetailUIContoller cardDetailUIContoller = CardDetailUIContoller.this;
                    if (cardDetailUIContoller.f51805p != null) {
                        C53248d.m59685e(cardDetailUIContoller.f51797e, iVar.f51836b, false);
                        C22819h hVar2 = CardDetailUIContoller.this.f51805p;
                        C22818f0 f0Var = hVar2.f65611h;
                        if (f0Var != null && (cVar = hVar2.f65607d) != null && (viewGroup = hVar2.f65610g) != null) {
                            f0Var.mo35956c(viewGroup, cVar);
                        }
                    }
                } else if (hVar == C18576h.onShowTimeExpired) {
                    C22819h hVar3 = CardDetailUIContoller.this.f51805p;
                    if (hVar3 != null) {
                        hVar3.mo35966l(C53247c.CARDCODEREFRESHACTION_SHOWING_TIMEOUT);
                    }
                } else {
                    C22819h hVar4 = CardDetailUIContoller.this.f51805p;
                    if (hVar4 != null) {
                        hVar4.mo35966l(iVar.f51837c);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$e */
    public class C18573e implements View.OnClickListener {
        public C18573e() {
        }

        public void onClick(View view) {
            C18581j jVar;
            int i;
            int i2;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.art || view.getId() == C0966R.C0970id.ark) {
                if (CardDetailUIContoller.this.f51776E.mo23267O()) {
                    C18581j jVar2 = CardDetailUIContoller.this.f51790T;
                    if (jVar2 != null) {
                        CardDetailUI cardDetailUI = CardDetailUI.this;
                        int i3 = CardDetailUI.f51728S;
                        cardDetailUI.mo23351Q7(true);
                        String R0 = cardDetailUI.f51730B == 6 ? cardDetailUI.f51749g : !TextUtils.isEmpty(cardDetailUI.f51748f.mo23270R0()) ? cardDetailUI.f51748f.mo23270R0() : cardDetailUI.f51749g;
                        C20871g gVar = cardDetailUI.f51747e.f51779H;
                        if (gVar != null) {
                            C21034b bVar = gVar.f58973e;
                            if (bVar == null ? false : bVar.f59504w) {
                                i2 = 1;
                                xa4 xa4 = new xa4();
                                String str = cardDetailUI.f51760u;
                                xa4.f144572d = str;
                                xa4.f144573e = cardDetailUI.f51761v;
                                Log.m105925i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str);
                                C86709a0.m107529k().f251779b.mo123460f(new C21036o(R0, cardDetailUI.f51730B, cardDetailUI.f51750h, cardDetailUI.f51752j, cardDetailUI.f51753n, cardDetailUI.f51754o, cardDetailUI.f51731C, i2, xa4));
                            }
                        }
                        i2 = 0;
                        xa4 xa42 = new xa4();
                        String str2 = cardDetailUI.f51760u;
                        xa42.f144572d = str2;
                        xa42.f144573e = cardDetailUI.f51761v;
                        Log.m105925i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str2);
                        C86709a0.m107529k().f251779b.mo123460f(new C21036o(R0, cardDetailUI.f51730B, cardDetailUI.f51750h, cardDetailUI.f51752j, cardDetailUI.f51753n, cardDetailUI.f51754o, cardDetailUI.f51731C, i2, xa42));
                    }
                } else if (CardDetailUIContoller.this.f51776E.mo23272T0() && (jVar = CardDetailUIContoller.this.f51790T) != null) {
                    CardDetailUI cardDetailUI2 = CardDetailUI.this;
                    int i4 = CardDetailUI.f51728S;
                    cardDetailUI2.mo23351Q7(true);
                    y34 y34 = new y34();
                    if (cardDetailUI2.f51730B == 3) {
                        y34.f64815d = cardDetailUI2.f51749g;
                        i = 1;
                    } else {
                        y34.f64816e = cardDetailUI2.f51749g;
                        i = 0;
                    }
                    y34.f64817f = cardDetailUI2.f51752j;
                    y34.f64819h = cardDetailUI2.f51753n;
                    y34.f64818g = cardDetailUI2.f51754o;
                    y34.f64820i = cardDetailUI2.f51731C;
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(y34);
                    CardDetailUIContoller cardDetailUIContoller = cardDetailUI2.f51747e;
                    n44 o = C22945n.m27015o(cardDetailUIContoller.f51782K, cardDetailUIContoller.f51785N, cardDetailUIContoller.f51786P);
                    xa4 xa43 = new xa4();
                    String str3 = cardDetailUI2.f51760u;
                    xa43.f144572d = str3;
                    xa43.f144573e = cardDetailUI2.f51761v;
                    Log.m105925i("MicroMsg.CardDetailUI", "ShareCardItem upload templateId:%s", str3);
                    C86709a0.m107529k().f251779b.mo123460f(new C22061g(i, linkedList, cardDetailUI2.f51748f.mo23264L0().f64139g, cardDetailUI2.f51755p, o, cardDetailUI2.f51730B, xa43));
                }
            } else if (view.getId() == C0966R.C0970id.efx || view.getId() == C0966R.C0970id.f5303be) {
                CardDetailUIContoller cardDetailUIContoller2 = CardDetailUIContoller.this;
                C53246b.m59677i(cardDetailUIContoller2.f51797e, cardDetailUIContoller2.f51791U.f51825d);
            } else if (view.getId() == C0966R.C0970id.bfr || view.getId() == C0966R.C0970id.bfb) {
                if (view.getId() == C0966R.C0970id.bfr) {
                    CardDetailUIContoller.this.f51775D = false;
                } else if (view.getId() == C0966R.C0970id.bfb) {
                    CardDetailUIContoller.this.f51775D = true;
                }
                C22819h hVar = CardDetailUIContoller.this.f51805p;
                if (hVar instanceof C53056u) {
                    CardDetailUIContoller.this.f51774C.f51936r = ((C53056u) hVar).mo35962h(C53247c.CARDCODEREFRESHACTION_DOREFRESH);
                }
                CardDetailUIContoller cardDetailUIContoller3 = CardDetailUIContoller.this;
                cardDetailUIContoller3.f51774C.mo23406a(view2, cardDetailUIContoller3.f51775D);
            } else if (view.getId() == C0966R.C0970id.ati || view.getId() == C0966R.C0970id.atb || view.getId() == C0966R.C0970id.ata || view.getId() == C0966R.C0970id.bfz || view.getId() == C0966R.C0970id.at_) {
                if (view.getId() == C0966R.C0970id.ati) {
                    if (CardDetailUIContoller.this.f51776E.mo23272T0()) {
                        C115669n nVar = C115669n.INSTANCE;
                        CardDetailUIContoller cardDetailUIContoller4 = CardDetailUIContoller.this;
                        nVar.mo160131h(11324, "CardConsumedCodeUI", Integer.valueOf(CardDetailUIContoller.this.f51776E.mo23264L0().f64141i), CardDetailUIContoller.this.f51776E.mo23270R0(), CardDetailUIContoller.this.f51776E.getCardId(), 0, Integer.valueOf(CardDetailUIContoller.this.f51791U.f51823b), cardDetailUIContoller4.f51791U.f51825d, Integer.valueOf(cardDetailUIContoller4.f51776E.mo23277X0() ? 1 : 0), "");
                        C18581j jVar3 = CardDetailUIContoller.this.f51790T;
                        if (jVar3 != null) {
                            ((CardDetailUI.C18563c) jVar3).mo23358a(true);
                        }
                    } else {
                        CardDetailUIContoller.this.mo23365e(true, new C45991n.C45994c(), false);
                    }
                } else if (view.getId() == C0966R.C0970id.bfz && CardDetailUIContoller.this.f51776E.mo23264L0().f64119Q0) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (CardDetailUIContoller.this.f51776E.mo23272T0()) {
                    C18581j jVar4 = CardDetailUIContoller.this.f51790T;
                    if (jVar4 != null) {
                        ((CardDetailUI.C18563c) jVar4).mo23358a(false);
                    }
                } else {
                    CardDetailUIContoller.this.mo23365e(false, new C45991n.C45994c(), false);
                }
            } else if (view.getId() == C0966R.C0970id.f5649kt) {
                if (!TextUtils.isEmpty(CardDetailUIContoller.this.f51776E.mo23264L0().f64131W0)) {
                    C53246b.m59674f(CardDetailUIContoller.this.f51776E.mo23264L0().f64131W0, CardDetailUIContoller.this.f51776E.mo23264L0().f64133X0, 0);
                    C115669n.INSTANCE.mo160131h(11941, 13, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", CardDetailUIContoller.this.f51776E.mo23264L0().f64108F);
                } else if (!TextUtils.isEmpty(CardDetailUIContoller.this.f51776E.mo23264L0().f64109G)) {
                    CardDetailUIContoller cardDetailUIContoller5 = CardDetailUIContoller.this;
                    C53246b.m59678j(cardDetailUIContoller5.f51797e, cardDetailUIContoller5.f51776E.mo23264L0().f64109G, 3);
                    C115669n.INSTANCE.mo160131h(11941, 13, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", CardDetailUIContoller.this.f51776E.mo23264L0().f64108F);
                }
            } else if (view.getId() == C0966R.C0970id.awm) {
                C115669n.INSTANCE.mo160131h(11582, "OpenShareUserSelectView", 0, Integer.valueOf(CardDetailUIContoller.this.f51776E.mo23264L0().f64141i), CardDetailUIContoller.this.f51776E.mo23270R0(), CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51791U.f51825d);
                Intent intent = new Intent();
                intent.putExtra("KLabel_range_index", CardDetailUIContoller.this.f51782K);
                intent.putExtra("Klabel_name_list", CardDetailUIContoller.this.f51783L);
                intent.putExtra("Kother_user_name_list", CardDetailUIContoller.this.f51784M);
                intent.putExtra("k_sns_label_ui_title", CardDetailUIContoller.this.f51797e.getString(C0966R.string.b15));
                intent.putExtra("k_sns_label_ui_style", 0);
                intent.putExtra("KLabel_is_filter_private", true);
                C88144b.m109795m(CardDetailUIContoller.this.f51797e, "sns", ".ui.SnsLabelUI", intent, 2);
                CardDetailUIContoller cardDetailUIContoller6 = CardDetailUIContoller.this;
                cardDetailUIContoller6.f51797e.mmSetOnActivityResultCallback(cardDetailUIContoller6);
            } else {
                int i5 = 10;
                if (view.getId() == C0966R.C0970id.f357633ax0) {
                    if (CardDetailUIContoller.this.f51776E.mo23263J0().f63952q != null) {
                        LinkedList<C22498fy> linkedList2 = CardDetailUIContoller.this.f51776E.mo23263J0().f63952q;
                        int intValue = ((Integer) view.getTag()).intValue();
                        C22498fy fyVar = linkedList2.get(intValue);
                        String cardId = CardDetailUIContoller.this.f51776E.getCardId();
                        C18575g gVar2 = CardDetailUIContoller.this.f51791U;
                        if (C53246b.m59673e(cardId, fyVar, gVar2.f51823b, gVar2.f51829h)) {
                            C115669n.INSTANCE.mo160131h(11941, 19, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", fyVar.f63884d);
                        } else if (fyVar != null && !TextUtils.isEmpty(fyVar.f63887g)) {
                            C53246b.m59678j(CardDetailUIContoller.this.f51797e, fyVar.f63887g, 1);
                            C115669n nVar2 = C115669n.INSTANCE;
                            Object[] objArr = new Object[5];
                            CardDetailUIContoller.this.getClass();
                            if (intValue == 1) {
                                i5 = 11;
                            } else if (intValue == 2) {
                                i5 = 12;
                            } else if (intValue == 3) {
                                i5 = 16;
                            }
                            objArr[0] = Integer.valueOf(i5);
                            objArr[1] = CardDetailUIContoller.this.f51776E.getCardId();
                            objArr[2] = CardDetailUIContoller.this.f51776E.mo23270R0();
                            objArr[3] = "";
                            objArr[4] = fyVar.f63884d;
                            nVar2.mo160131h(11941, objArr);
                            if (C22945n.m26990C(fyVar, CardDetailUIContoller.this.f51776E.getCardId())) {
                                C22945n.m26999L(CardDetailUIContoller.this.f51776E.getCardId(), fyVar.f63884d);
                                CardDetailUIContoller cardDetailUIContoller7 = CardDetailUIContoller.this;
                                C53246b.m59676h(cardDetailUIContoller7.f51797e, cardDetailUIContoller7.f51776E.mo23264L0().f64142j);
                            }
                        }
                    }
                } else if (view.getId() == C0966R.C0970id.f357634ax1) {
                    if (CardDetailUIContoller.this.f51776E.mo23263J0().f63952q != null) {
                        C22498fy fyVar2 = CardDetailUIContoller.this.f51776E.mo23263J0().f63952q.get(0);
                        String cardId2 = CardDetailUIContoller.this.f51776E.getCardId();
                        C18575g gVar3 = CardDetailUIContoller.this.f51791U;
                        if (C53246b.m59673e(cardId2, fyVar2, gVar3.f51823b, gVar3.f51829h)) {
                            C115669n.INSTANCE.mo160131h(11941, 19, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", fyVar2.f63884d);
                        } else if (fyVar2 != null && !TextUtils.isEmpty(fyVar2.f63887g)) {
                            C53246b.m59678j(CardDetailUIContoller.this.f51797e, fyVar2.f63887g, 1);
                            C115669n.INSTANCE.mo160131h(11941, 10, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", fyVar2.f63884d);
                            if (C22945n.m26990C(fyVar2, CardDetailUIContoller.this.f51776E.getCardId())) {
                                C22945n.m26999L(CardDetailUIContoller.this.f51776E.getCardId(), fyVar2.f63884d);
                                CardDetailUIContoller cardDetailUIContoller8 = CardDetailUIContoller.this;
                                C53246b.m59676h(cardDetailUIContoller8.f51797e, cardDetailUIContoller8.f51776E.mo23264L0().f64142j);
                            }
                        }
                    }
                } else if (view.getId() == C0966R.C0970id.axt || view.getId() == C0966R.C0970id.awc) {
                    if (CardDetailUIContoller.this.f51776E.mo23263J0().f63959x != null) {
                        if (CardDetailUIContoller.this.f51776E.mo23287j()) {
                            if (CardDetailUIContoller.this.f51776E.mo23272T0()) {
                                C18581j jVar5 = CardDetailUIContoller.this.f51790T;
                                if (jVar5 != null) {
                                    ((CardDetailUI.C18563c) jVar5).mo23358a(false);
                                }
                            } else {
                                CardDetailUIContoller.this.mo23365e(false, new C45991n.C45994c(), false);
                            }
                        } else if (CardDetailUIContoller.this.f51776E.mo23286i2()) {
                            CardDetailUIContoller cardDetailUIContoller9 = CardDetailUIContoller.this;
                            C53246b.m59675g(cardDetailUIContoller9.f51797e, 0, (String) null, false, cardDetailUIContoller9.f51776E);
                        } else {
                            C22498fy fyVar3 = CardDetailUIContoller.this.f51776E.mo23263J0().f63959x;
                            String cardId3 = CardDetailUIContoller.this.f51776E.getCardId();
                            C18575g gVar4 = CardDetailUIContoller.this.f51791U;
                            if (C53246b.m59673e(cardId3, fyVar3, gVar4.f51823b, gVar4.f51829h)) {
                                C115669n.INSTANCE.mo160131h(11941, 20, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", fyVar3.f63884d);
                            } else if (fyVar3 != null && !TextUtils.isEmpty(fyVar3.f63887g)) {
                                C53246b.m59678j(CardDetailUIContoller.this.f51797e, C22945n.m27011k(fyVar3.f63887g, fyVar3.f63888h), 1);
                                C115669n.INSTANCE.mo160131h(11941, 9, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", fyVar3.f63884d);
                                if (C22945n.m26990C(fyVar3, CardDetailUIContoller.this.f51776E.getCardId())) {
                                    C22945n.m26999L(CardDetailUIContoller.this.f51776E.getCardId(), fyVar3.f63884d);
                                    CardDetailUIContoller cardDetailUIContoller10 = CardDetailUIContoller.this;
                                    C53246b.m59676h(cardDetailUIContoller10.f51797e, cardDetailUIContoller10.f51776E.mo23264L0().f64142j);
                                }
                            }
                        }
                    }
                } else if (view.getId() == C0966R.C0970id.aty || view.getId() == C0966R.C0970id.f357614as1) {
                    C22513m40 m402 = CardDetailUIContoller.this.f51776E.mo23264L0().f64115M;
                    C115669n nVar3 = C115669n.INSTANCE;
                    CardDetailUIContoller cardDetailUIContoller11 = CardDetailUIContoller.this;
                    nVar3.mo160131h(11324, "CardLeftRightIntroduceView", Integer.valueOf(CardDetailUIContoller.this.f51776E.mo23264L0().f64141i), CardDetailUIContoller.this.f51776E.mo23270R0(), CardDetailUIContoller.this.f51776E.getCardId(), 0, Integer.valueOf(CardDetailUIContoller.this.f51791U.f51823b), cardDetailUIContoller11.f51791U.f51825d, Integer.valueOf(cardDetailUIContoller11.f51776E.mo23277X0() ? 1 : 0), "");
                    if (m402 == null || TextUtils.isEmpty(m402.f64221e)) {
                        Intent intent2 = new Intent();
                        C20483c cVar = CardDetailUIContoller.this.f51776E;
                        if (cVar instanceof CardInfo) {
                            intent2.putExtra("key_card_info_data", (CardInfo) cVar);
                        } else if (cVar instanceof ShareCardInfo) {
                            intent2.putExtra("key_card_info_data", (ShareCardInfo) cVar);
                        }
                        intent2.setClass(CardDetailUIContoller.this.f51797e, CardDetailPreference.class);
                        MMActivity mMActivity = CardDetailUIContoller.this.f51797e;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        MMActivity mMActivity2 = mMActivity;
                        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        C53246b.m59678j(CardDetailUIContoller.this.f51797e, m402.f64221e, 1);
                    }
                } else if (view.getId() == C0966R.C0970id.f359195jj1) {
                    if (C47407b.m52742d(CardDetailUIContoller.this.f51776E.mo23270R0()) <= 1) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    CardDetailUIContoller cardDetailUIContoller12 = CardDetailUIContoller.this;
                    cardDetailUIContoller12.f51800h = true ^ cardDetailUIContoller12.f51800h;
                    cardDetailUIContoller12.mo23367h();
                } else if (view.getId() == C0966R.C0970id.as5) {
                    if (CardDetailUIContoller.this.f51776E.mo23264L0().f64111I != null && !TextUtils.isEmpty(CardDetailUIContoller.this.f51776E.mo23264L0().f64111I.f145415f)) {
                        CardDetailUIContoller cardDetailUIContoller13 = CardDetailUIContoller.this;
                        C53246b.m59678j(cardDetailUIContoller13.f51797e, cardDetailUIContoller13.f51776E.mo23264L0().f64111I.f145415f, 3);
                        C115669n.INSTANCE.mo160131h(11941, 3, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", CardDetailUIContoller.this.f51776E.mo23264L0().f64111I.f145414e);
                    }
                } else if (view.getId() == C0966R.C0970id.arr) {
                    if (CardDetailUIContoller.this.f51776E.mo23264L0().f64118Q != null && !Util.isNullOrNil(CardDetailUIContoller.this.f51776E.mo23264L0().f64118Q.f64199e)) {
                        CardDetailUIContoller cardDetailUIContoller14 = CardDetailUIContoller.this;
                        C53246b.m59678j(cardDetailUIContoller14.f51797e, cardDetailUIContoller14.f51776E.mo23264L0().f64118Q.f64199e, 1);
                        C115669n.INSTANCE.mo160131h(11941, 14, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", CardDetailUIContoller.this.f51776E.mo23264L0().f64118Q.f64198d);
                    }
                } else if (view.getId() == C0966R.C0970id.jjb || view.getId() == C0966R.C0970id.jjc) {
                    if (CardDetailUIContoller.this.f51776E.mo23264L0().f64154x >= 1) {
                        ArrayList<C49029co> arrayList2 = CardDetailUIContoller.this.f51777F;
                        if (arrayList2 == null || arrayList2.size() == 0) {
                            Log.m105920e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        C49029co coVar = CardDetailUIContoller.this.f51777F.get(0);
                        C53246b.m59671c(CardDetailUIContoller.this.f51797e, coVar.f131857p, coVar.f131856o, (String) null, coVar.f131854j);
                        C115669n nVar4 = C115669n.INSTANCE;
                        CardDetailUIContoller cardDetailUIContoller15 = CardDetailUIContoller.this;
                        nVar4.mo160131h(11324, "UsedStoresView", Integer.valueOf(CardDetailUIContoller.this.f51776E.mo23264L0().f64141i), CardDetailUIContoller.this.f51776E.mo23270R0(), CardDetailUIContoller.this.f51776E.getCardId(), 0, Integer.valueOf(CardDetailUIContoller.this.f51791U.f51823b), cardDetailUIContoller15.f51791U.f51825d, Integer.valueOf(cardDetailUIContoller15.f51776E.mo23277X0() ? 1 : 0), "");
                        nVar4.mo160131h(11941, 5, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", coVar.f131848d);
                    }
                } else if (view.getId() == C0966R.C0970id.kke) {
                    ArrayList<C49029co> arrayList3 = CardDetailUIContoller.this.f51777F;
                    if (arrayList3 == null || arrayList3.size() == 0) {
                        Log.m105920e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C49029co coVar2 = CardDetailUIContoller.this.f51777F.get(0);
                    String str4 = (String) view.getTag();
                    if (!TextUtils.isEmpty(str4) && str4.equals(CardDetailUIContoller.this.f51797e.getString(C0966R.string.aw7))) {
                        CardDetailUIContoller.m19341f(CardDetailUIContoller.this);
                        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (!TextUtils.isEmpty(coVar2.f131858q)) {
                        C53246b.m59678j(CardDetailUIContoller.this.f51797e, coVar2.f131858q, 1);
                        C115669n.INSTANCE.mo160131h(11941, 4, CardDetailUIContoller.this.f51776E.getCardId(), CardDetailUIContoller.this.f51776E.mo23270R0(), "", coVar2.f131848d);
                    }
                } else if (view.getId() == C0966R.C0970id.kk_) {
                    CardDetailUIContoller.m19341f(CardDetailUIContoller.this);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$f */
    public static class C18574f {

        /* renamed from: a */
        public String f51819a;

        /* renamed from: b */
        public String f51820b;

        /* renamed from: c */
        public String f51821c;

        public C18574f(C22511m1 m1Var) {
            this.f51819a = m1Var.f64199e;
            this.f51820b = m1Var.f64200f;
            this.f51821c = m1Var.f64201g;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g */
    public static class C18575g {

        /* renamed from: a */
        public int f51822a = 3;

        /* renamed from: b */
        public int f51823b = -1;

        /* renamed from: c */
        public String f51824c = "";

        /* renamed from: d */
        public String f51825d = "";

        /* renamed from: e */
        public String f51826e = "";

        /* renamed from: f */
        public String f51827f = "";

        /* renamed from: g */
        public boolean f51828g = false;

        /* renamed from: h */
        public int f51829h = 0;
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$h */
    public enum C18576h {
        onGetCodeSuccess,
        onShowTimeExpired,
        onReceiveCodeUnavailable,
        onGetCodeFail
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$i */
    public static class C18577i {

        /* renamed from: a */
        public C18576h f51835a;

        /* renamed from: b */
        public String f51836b;

        /* renamed from: c */
        public C53247c f51837c;
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$c */
    public class C18579c extends ViewOutlineProvider {
        public C18579c() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C76577a.m92157h(CardDetailUIContoller.this.f51797e, C0966R.dimen.f3703bv));
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$d */
    public class C18580d extends ViewOutlineProvider {
        public C18580d() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C76577a.m92157h(CardDetailUIContoller.this.f51797e, C0966R.dimen.f3703bv));
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$j */
    public interface C18581j {
    }

    public CardDetailUIContoller(MMActivity mMActivity, View view) {
        this.f51797e = mMActivity;
        this.f51796d = view;
    }

    /* renamed from: f */
    public static void m19341f(CardDetailUIContoller cardDetailUIContoller) {
        cardDetailUIContoller.getClass();
        Intent intent = new Intent();
        C20483c cVar = cardDetailUIContoller.f51776E;
        if (cVar instanceof CardInfo) {
            intent.putExtra("key_card_info_data", (CardInfo) cVar);
        } else if (cVar instanceof ShareCardInfo) {
            intent.putExtra("key_card_info_data", (ShareCardInfo) cVar);
        }
        intent.putExtra("key_from_appbrand_type", cardDetailUIContoller.f51791U.f51829h);
        intent.setClass(cardDetailUIContoller.f51797e, CardShopUI.class);
        MMActivity mMActivity = cardDetailUIContoller.f51797e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMActivity mMActivity2 = mMActivity;
        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(11324, "UsedStoresView", Integer.valueOf(cardDetailUIContoller.f51776E.mo23264L0().f64141i), cardDetailUIContoller.f51776E.mo23270R0(), cardDetailUIContoller.f51776E.getCardId(), 0, Integer.valueOf(cardDetailUIContoller.f51791U.f51823b), cardDetailUIContoller.f51791U.f51825d, Integer.valueOf(cardDetailUIContoller.f51776E.mo23277X0() ? 1 : 0), "");
    }

    /* renamed from: a */
    public void mo23361a(int i, String str) {
        Log.m105921e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", Integer.valueOf(i), str);
        Message obtain = Message.obtain();
        C18577i iVar = new C18577i();
        iVar.f51835a = C18576h.onGetCodeFail;
        iVar.f51836b = i == -1 ? mo23369j(C0966R.string.ax7) : i == 2 ? mo23369j(C0966R.string.awb) : mo23369j(C0966R.string.ax6);
        obtain.obj = iVar;
        this.f51793W.sendMessage(obtain);
    }

    /* renamed from: b */
    public void mo23362b(C53247c cVar) {
        Log.m105924i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
        Message obtain = Message.obtain();
        C18577i iVar = new C18577i();
        iVar.f51835a = C18576h.onReceiveCodeUnavailable;
        iVar.f51837c = cVar;
        obtain.obj = iVar;
        this.f51793W.sendMessage(obtain);
    }

    /* renamed from: c */
    public void mo23363c(C53247c cVar) {
        Log.m105924i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
        Message obtain = Message.obtain();
        C18577i iVar = new C18577i();
        iVar.f51835a = C18576h.onGetCodeSuccess;
        iVar.f51837c = cVar;
        obtain.obj = iVar;
        this.f51793W.sendMessage(obtain);
    }

    /* renamed from: d */
    public void mo23364d() {
        Log.m105924i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
        Message obtain = Message.obtain();
        C18577i iVar = new C18577i();
        iVar.f51835a = C18576h.onShowTimeExpired;
        obtain.obj = iVar;
        this.f51793W.sendMessage(obtain);
    }

    /* renamed from: e */
    public void mo23365e(boolean z, C45991n.C45994c cVar, boolean z2) {
        C45991n.C45994c cVar2 = cVar;
        String str = "";
        if (z) {
            C22498fy fyVar = this.f51776E.mo23263J0().f63959x;
            if (this.f51776E.mo23286i2()) {
                C53246b.m59675g(this.f51797e, cVar2.f124030d, cVar2.f124031e, z2, this.f51776E);
                C115669n.INSTANCE.mo160131h(11941, 17, this.f51776E.getCardId(), this.f51776E.mo23270R0(), str, this.f51776E.mo23263J0().f63959x.f63884d);
            } else if (fyVar != null && !TextUtils.isEmpty(fyVar.f63893p) && !TextUtils.isEmpty(fyVar.f63894q)) {
                String cardId = this.f51776E.getCardId();
                C18575g gVar = this.f51791U;
                C53246b.m59673e(cardId, fyVar, gVar.f51823b, gVar.f51829h);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = 6;
                objArr[1] = this.f51776E.getCardId();
                objArr[2] = this.f51776E.mo23270R0();
                objArr[3] = str;
                String str2 = fyVar.f63884d;
                if (str2 != null) {
                    str = str2;
                }
                objArr[4] = str;
                nVar.mo160131h(11941, objArr);
            } else if (fyVar == null || TextUtils.isEmpty(fyVar.f63887g)) {
                C115669n.INSTANCE.mo160131h(11324, "CardConsumedCodeUI", Integer.valueOf(this.f51776E.mo23264L0().f64141i), this.f51776E.mo23270R0(), this.f51776E.getCardId(), 0, Integer.valueOf(this.f51791U.f51823b), this.f51791U.f51825d, Integer.valueOf(this.f51776E.mo23277X0() ? 1 : 0), str);
                mo23370k(cVar2.f124027a);
            } else {
                C53246b.m59678j(this.f51797e, C22945n.m27011k(fyVar.f63887g, fyVar.f63888h), 1);
                C115669n nVar2 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[5];
                objArr2[0] = 6;
                objArr2[1] = this.f51776E.getCardId();
                objArr2[2] = this.f51776E.mo23270R0();
                objArr2[3] = str;
                String str3 = fyVar.f63884d;
                if (str3 != null) {
                    str = str3;
                }
                objArr2[4] = str;
                nVar2.mo160131h(11941, objArr2);
            }
        } else {
            C115669n.INSTANCE.mo160131h(11324, "CardConsumedCodeUI", Integer.valueOf(this.f51776E.mo23264L0().f64141i), this.f51776E.mo23270R0(), this.f51776E.getCardId(), 0, Integer.valueOf(this.f51791U.f51823b), this.f51791U.f51825d, Integer.valueOf(this.f51776E.mo23277X0() ? 1 : 0), str);
            mo23370k(cVar2.f124027a);
        }
    }

    /* renamed from: g */
    public final int mo23366g(int i) {
        LinkedList<C22511m1> linkedList = this.f51776E.mo23263J0().f63957v;
        if (linkedList == null) {
            return i;
        }
        this.f51788R.clear();
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            C22511m1 m1Var = linkedList.get(i2);
            boolean z = !Util.isNullOrNil(m1Var.f64199e) || !Util.isNullOrNil(m1Var.f64200f);
            if (!Util.isNullOrNil(m1Var.f64198d) && z) {
                this.f51789S.add(m1Var.f64198d);
                this.f51787Q.put(Integer.valueOf(i), m1Var.f64198d);
                this.f51788R.put(m1Var.f64198d, new C18574f(m1Var));
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public void mo23367h() {
        int i;
        int i2;
        C20483c cVar = this.f51776E;
        if (cVar == null) {
            Log.m105920e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
            C18581j jVar = this.f51790T;
            if (jVar != null) {
                CardDetailUI cardDetailUI = CardDetailUI.this;
                int i3 = CardDetailUI.f51728S;
                cardDetailUI.mo23356q();
            }
        } else if (cVar.mo23264L0() == null) {
            Log.m105920e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
            C18581j jVar2 = this.f51790T;
            if (jVar2 != null) {
                CardDetailUI cardDetailUI2 = CardDetailUI.this;
                int i4 = CardDetailUI.f51728S;
                cardDetailUI2.mo23356q();
            }
        } else if (this.f51776E.mo23263J0() == null) {
            Log.m105920e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
            C18581j jVar3 = this.f51790T;
            if (jVar3 != null) {
                CardDetailUI cardDetailUI3 = CardDetailUI.this;
                int i5 = CardDetailUI.f51728S;
                cardDetailUI3.mo23356q();
            }
        } else if (!this.f51776E.mo23266N0()) {
            Log.m105921e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", Integer.valueOf(this.f51776E.mo23264L0().f64141i));
            if (!TextUtils.isEmpty(this.f51776E.mo23264L0().f64103A)) {
                C53246b.m59678j(this.f51797e, this.f51776E.mo23264L0().f64103A, 0);
                C18581j jVar4 = this.f51790T;
                if (jVar4 != null) {
                    CardDetailUI cardDetailUI4 = CardDetailUI.this;
                    int i6 = CardDetailUI.f51728S;
                    cardDetailUI4.mo23356q();
                    return;
                }
                return;
            }
            C76879j.m92713G(this.f51797e, mo23369j(C0966R.string.b06), (String) null, false, new C18571a());
        } else {
            Log.m105924i("MicroMsg.CardDetailUIContoller", "doUpdate()");
            Log.m105924i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.f51776E.mo23264L0().f64130W);
            C20871g gVar = this.f51779H;
            C20483c cVar2 = this.f51776E;
            ArrayList<C49029co> arrayList = this.f51777F;
            int i7 = this.f51791U.f51822a;
            gVar.f58970b = cVar2;
            gVar.f58974f = arrayList;
            gVar.f58971c = i7;
            if (this.f51798f != null && (!cVar2.mo23272T0() ? !this.f51776E.mo23291o() ? !this.f51776E.mo23289m0() ? !this.f51776E.mo23284h() ? !this.f51776E.mo23271R1() ? !this.f51776E.mo23285h2() ? !(this.f51798f instanceof C22280a) : !(this.f51798f instanceof C22283d) : !(this.f51798f instanceof C22285f) : !(this.f51798f instanceof C22282c) : !(this.f51798f instanceof C22281b) : !(this.f51798f instanceof C22284e) : !(this.f51798f instanceof C22287h))) {
                C22280a aVar = (C22280a) this.f51798f;
                aVar.f63173c = null;
                aVar.f63172b = null;
                aVar.f63171a = null;
                this.f51798f = null;
                Log.m105925i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", Integer.valueOf(this.f51776E.mo23264L0().f64141i));
            }
            if (this.f51798f == null) {
                Log.m105925i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", Integer.valueOf(this.f51776E.mo23264L0().f64141i));
                Log.m105925i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", Integer.valueOf(this.f51776E.mo23264L0().f64141i));
                if (this.f51776E.mo23272T0()) {
                    this.f51798f = new C22287h(this.f51797e);
                } else {
                    int i8 = this.f51776E.mo23264L0().f64141i;
                    if (i8 == 0) {
                        this.f51798f = new C22282c(this.f51797e);
                    } else if (i8 == 20) {
                        this.f51798f = new C22285f(this.f51797e);
                    } else if (i8 == 30) {
                        this.f51798f = new C22283d(this.f51797e);
                    } else if (i8 == 10) {
                        this.f51798f = new C22284e(this.f51797e);
                    } else if (i8 != 11) {
                        this.f51798f = new C22280a(this.f51797e);
                    } else {
                        this.f51798f = new C22281b(this.f51797e);
                    }
                }
            }
            Log.m105925i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", Integer.valueOf(this.f51776E.mo23264L0().f64141i));
            C22286g gVar2 = this.f51798f;
            C20483c cVar3 = this.f51776E;
            C18575g gVar3 = this.f51791U;
            C22280a aVar2 = (C22280a) gVar2;
            aVar2.f63173c = cVar3;
            aVar2.f63172b = gVar3;
            aVar2.mo35450x();
            C22280a aVar3 = (C22280a) this.f51798f;
            int i9 = 2;
            Log.m105925i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", Integer.valueOf(TextUtils.isEmpty(aVar3.f63173c.mo23263J0().f63950o) ^ true ? 1 : 0), aVar3.mo35445s(), Integer.valueOf(aVar3.f63174d ? 1 : 0), Integer.valueOf(aVar3.mo35435i() ? 1 : 0), Integer.valueOf(aVar3.f63176f ? 1 : 0), Integer.valueOf(aVar3.f63177g ? 1 : 0), Integer.valueOf(aVar3.f63178h ? 1 : 0), Integer.valueOf(aVar3.f63179i ? 1 : 0), Integer.valueOf(aVar3.f63180j ? 1 : 0), Integer.valueOf(aVar3.f63181k ? 1 : 0), Integer.valueOf(aVar3.f63182l ? 1 : 0), Integer.valueOf(aVar3.f63183m ? 1 : 0));
            Log.m105924i("MicroMsg.CardDetailUIContoller", "");
            if (!this.f51798f.mo35436j()) {
                this.f51797e.setMMTitle("");
            } else {
                this.f51797e.setMMTitle(this.f51779H.mo32579d());
            }
            C20483c cVar4 = this.f51776E;
            if (cVar4 == null) {
                Log.m105920e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
            } else {
                if (this.f51803n != null && (!cVar4.mo23291o() ? !(!this.f51776E.mo23289m0() ? !this.f51776E.mo23284h() ? !this.f51776E.mo23271R1() ? !this.f51776E.mo23285h2() || (this.f51803n instanceof C23151f) : (this.f51803n instanceof C23153h) : (this.f51803n instanceof C23148d) : (this.f51803n instanceof C23150e)) : !(this.f51803n instanceof C23152g))) {
                    View f = ((C23145a) this.f51803n).mo36527f();
                    if (f != null) {
                        this.f51804o.removeView(f);
                    }
                    this.f51804o.removeAllViews();
                    this.f51804o.invalidate();
                    C23145a aVar4 = (C23145a) this.f51803n;
                    aVar4.f66477f = null;
                    aVar4.f66473b = null;
                    this.f51803n = null;
                }
                if (this.f51803n == null) {
                    if (this.f51776E.mo23291o()) {
                        this.f51803n = new C23152g(this.f51797e);
                    } else if (this.f51776E.mo23289m0()) {
                        this.f51803n = new C23150e(this.f51797e);
                    } else if (this.f51776E.mo23284h()) {
                        this.f51803n = new C23148d(this.f51797e);
                    } else if (this.f51776E.mo23271R1()) {
                        this.f51803n = new C23153h(this.f51797e);
                    } else if (this.f51776E.mo23285h2()) {
                        this.f51803n = new C23151f(this.f51797e);
                    } else {
                        this.f51803n = new C23148d(this.f51797e);
                    }
                    C23145a aVar5 = (C23145a) this.f51803n;
                    aVar5.f66472a = this.f51776E;
                    View f2 = aVar5.mo36527f();
                    if (f2 != null) {
                        LinearLayout linearLayout = this.f51804o;
                        f2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.addView(f2);
                    }
                    this.f51804o.invalidate();
                    this.f51803n.setOnClickListener(this.f51794X);
                    C23154i iVar = this.f51803n;
                    if (iVar != null) {
                        iVar.mo36526e(false, false);
                    }
                }
                if (this.f51803n != null) {
                    if (this.f51776E.mo23271R1()) {
                        ((C23153h) this.f51803n).f66528q = this.f51777F;
                    }
                    C23145a aVar6 = (C23145a) this.f51803n;
                    aVar6.f66472a = this.f51776E;
                    aVar6.mo36530i();
                }
            }
            if (this.f51798f.mo35438l()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
                this.f51799g.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
                this.f51799g.mo35950d(8);
            }
            if (this.f51798f.mo35435i()) {
                if (this.f51773B == null) {
                    C22813c cVar5 = new C22813c();
                    this.f51773B = cVar5;
                    cVar5.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
                this.f51773B.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
                C22821l lVar = this.f51773B;
                if (lVar != null) {
                    lVar.mo35950d(8);
                }
            }
            this.f51797e.showOptionMenu(((C22280a) this.f51798f).f63179i);
            if (((C22280a) this.f51798f).f63181k) {
                this.f51787Q.clear();
                this.f51789S.clear();
                if (this.f51776E.mo23292p()) {
                    this.f51789S.add(mo23369j(C0966R.string.b2e));
                    this.f51787Q.put(0, "menu_func_share_friend");
                    this.f51789S.add(mo23369j(C0966R.string.b2d));
                    this.f51787Q.put(1, "menu_func_share_timeline");
                } else {
                    i9 = 0;
                }
                if (!TextUtils.isEmpty(this.f51776E.mo23263J0().f63955t)) {
                    this.f51789S.add(mo23369j(C0966R.string.azx));
                    this.f51787Q.put(Integer.valueOf(i9), "menu_func_report");
                    i9++;
                }
                mo23366g(i9);
                if (this.f51789S.size() > 0) {
                    this.f51797e.showOptionMenu(true);
                }
            }
            if (((C22280a) this.f51798f).f63182l) {
                this.f51787Q.clear();
                this.f51789S.clear();
                if (!this.f51776E.mo23267O() || !this.f51776E.mo23294v()) {
                    i2 = 0;
                } else {
                    if (!Util.isNullOrNil(this.f51776E.mo23264L0().f64127U0)) {
                        this.f51789S.add(this.f51776E.mo23264L0().f64127U0);
                    } else if (this.f51776E.mo23285h2()) {
                        this.f51789S.add(mo23369j(C0966R.string.azw));
                    } else {
                        this.f51789S.add(mo23369j(C0966R.string.azv));
                    }
                    this.f51787Q.put(0, "menu_func_gift");
                    i2 = 1;
                }
                int g = mo23366g(i2);
                if (!TextUtils.isEmpty(this.f51776E.mo23263J0().f63955t)) {
                    this.f51789S.add(mo23369j(C0966R.string.azx));
                    this.f51787Q.put(Integer.valueOf(g), "menu_func_report");
                    g++;
                }
                if (this.f51776E.mo23267O()) {
                    this.f51789S.add(mo23369j(C0966R.string.f7944x1));
                    this.f51787Q.put(Integer.valueOf(g), "menu_func_delete");
                } else if (this.f51776E.mo23272T0()) {
                    String s = C75592q0.m90789s();
                    String e = this.f51776E.mo23280e();
                    if (s == null || !s.equals(e)) {
                        Log.m105924i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
                    } else {
                        this.f51789S.add(mo23369j(C0966R.string.f7944x1));
                        this.f51787Q.put(Integer.valueOf(g), "menu_func_delete_share_card");
                    }
                }
                if (this.f51789S.size() > 0) {
                    this.f51797e.showOptionMenu(true);
                }
            }
            if (((C22280a) this.f51798f).f63183m) {
                this.f51787Q.clear();
                this.f51789S.clear();
                if (!TextUtils.isEmpty(this.f51776E.mo23263J0().f63955t)) {
                    this.f51789S.add(mo23369j(C0966R.string.azx));
                    this.f51787Q.put(0, "menu_func_report");
                    i = 1;
                } else {
                    i = 0;
                }
                mo23366g(i);
                if (this.f51789S.size() > 0) {
                    this.f51797e.showOptionMenu(true);
                }
            }
            C22280a aVar7 = (C22280a) this.f51798f;
            boolean z = aVar7.f63180j;
            C23154i iVar2 = this.f51803n;
            if (iVar2 != null && (iVar2 instanceof C23148d)) {
                C23148d dVar = (C23148d) iVar2;
            }
            boolean z2 = aVar7.f63177g;
            boolean z3 = aVar7.f63178h;
            if (iVar2 != null) {
                iVar2.mo36526e(z2, z3);
            }
            if (!this.f51776E.mo23291o() && this.f51798f.mo35432f()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
                this.f51801i.mo35951e();
            } else if (this.f51776E.mo23291o() && this.f51798f.mo35432f()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
                this.f51802j.mo35951e();
            } else if (this.f51798f.mo35433g()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
                this.f51802j.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
                this.f51802j.mo35950d(8);
                this.f51801i.mo35950d(8);
            }
            C23154i iVar3 = this.f51803n;
            if (iVar3 != null) {
                iVar3.mo36523b(((C22280a) this.f51798f).f63174d);
            }
            mo23372m();
            if (this.f51798f.mo35442p()) {
                if (this.f51809t == null) {
                    C22814c0 c0Var = new C22814c0();
                    this.f51809t = c0Var;
                    c0Var.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
                this.f51809t.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
                C22821l lVar2 = this.f51809t;
                if (lVar2 != null) {
                    lVar2.mo35950d(8);
                }
            }
            if (this.f51798f.mo35429c()) {
                if (this.f51808s == null) {
                    C22815d dVar2 = new C22815d();
                    this.f51808s = dVar2;
                    dVar2.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
                this.f51808s.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
                C22821l lVar3 = this.f51808s;
                if (lVar3 != null) {
                    lVar3.mo35950d(8);
                }
            }
            if (this.f51798f.mo35444r()) {
                if (this.f51810u == null) {
                    C22822n nVar = new C22822n();
                    this.f51810u = nVar;
                    nVar.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
                this.f51810u.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
                C22821l lVar4 = this.f51810u;
                if (lVar4 != null) {
                    lVar4.mo35950d(8);
                }
            }
            if (this.f51798f.mo35431e()) {
                if (this.f51811v == null) {
                    C22809a0 a0Var = new C22809a0();
                    this.f51811v = a0Var;
                    a0Var.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
                this.f51811v.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
                C22821l lVar5 = this.f51811v;
                if (lVar5 != null) {
                    lVar5.mo35950d(8);
                }
            }
            if (this.f51798f.mo35439m()) {
                if (this.f51812w == null) {
                    C78497o oVar = new C78497o();
                    this.f51812w = oVar;
                    oVar.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
                this.f51812w.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
                C22821l lVar6 = this.f51812w;
                if (lVar6 != null) {
                    lVar6.mo35950d(8);
                }
            }
            C22280a aVar8 = (C22280a) this.f51798f;
            if (aVar8.f63173c.mo23263J0().f63956u != null && !TextUtils.isEmpty(aVar8.f63173c.mo23263J0().f63956u.f63884d)) {
                if (this.f51813x == null) {
                    C78496d0 d0Var = new C78496d0();
                    this.f51813x = d0Var;
                    d0Var.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
                this.f51813x.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
                C22821l lVar7 = this.f51813x;
                if (lVar7 != null) {
                    lVar7.mo35950d(8);
                }
            }
            if (this.f51798f.mo35428b()) {
                if (this.f51814y == null) {
                    C22817f fVar = new C22817f();
                    this.f51814y = fVar;
                    fVar.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
                this.f51814y.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
                C22821l lVar8 = this.f51814y;
                if (lVar8 != null) {
                    lVar8.mo35950d(8);
                }
            }
            if (this.f51798f.mo35430d()) {
                if (this.f51815z == null) {
                    C22824y yVar = new C22824y();
                    this.f51815z = yVar;
                    yVar.mo35968a(this);
                }
                Log.m105924i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
                this.f51815z.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
                C22821l lVar9 = this.f51815z;
                if (lVar9 != null) {
                    lVar9.mo35950d(8);
                }
            }
            mo23371l();
            if (this.f51798f.mo35427a()) {
                this.f51776E.mo23273U0(this.f51776E.mo23263J0());
                C22945n.m27000M(this.f51776E);
                if (this.f51798f.mo35434h()) {
                    C22819h hVar = this.f51805p;
                    if (hVar == null) {
                        if (this.f51776E.mo23264L0().f64146p0 != null && this.f51776E.mo23264L0().f64146p0.f130976d) {
                            this.f51805p = new C53050p();
                            C45988h zx02 = C46153l0.zx0();
                            if (zx02.f124012d == null) {
                                zx02.f124012d = new ArrayList();
                            }
                            ((ArrayList) zx02.f124012d).add(new WeakReference(this));
                        } else if (this.f51776E.mo23264L0().f64141i == 10) {
                            this.f51805p = new C53056u();
                        } else {
                            this.f51805p = new C53049m();
                        }
                        this.f51805p.mo35968a(this);
                        this.f51805p.mo35951e();
                    } else if (hVar.mo35965k(this.f51776E)) {
                        C22819h hVar2 = this.f51805p;
                        C20483c cVar6 = this.f51776E;
                        if (cVar6 == null) {
                            hVar2.getClass();
                            Log.m105920e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
                        } else {
                            hVar2.f65607d = cVar6;
                        }
                        this.f51805p.mo35951e();
                    }
                } else {
                    C22819h hVar3 = this.f51805p;
                    if (hVar3 != null) {
                        hVar3.mo35950d(8);
                    }
                }
                C23154i iVar4 = this.f51803n;
                if (iVar4 != null) {
                    iVar4.mo36525d(true);
                }
            } else {
                Log.m105920e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
                C22819h hVar4 = this.f51805p;
                if (hVar4 != null) {
                    hVar4.mo35950d(8);
                }
                C23154i iVar5 = this.f51803n;
                if (iVar5 != null) {
                    iVar5.mo36525d(false);
                }
            }
            if (this.f51798f.mo35441o()) {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
                this.f51772A.mo35951e();
            } else {
                Log.m105924i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
                this.f51772A.mo35950d(8);
            }
            this.f51774C.f51935q = this.f51776E;
        }
    }

    /* renamed from: i */
    public final String mo23368i() {
        if (TextUtils.isEmpty(this.f51783L) || TextUtils.isEmpty(this.f51784M)) {
            return !TextUtils.isEmpty(this.f51783L) ? this.f51783L : !TextUtils.isEmpty(this.f51784M) ? C22945n.m27010j(this.f51784M) : "";
        }
        return this.f51783L + "," + C22945n.m27010j(this.f51784M);
    }

    /* renamed from: j */
    public String mo23369j(int i) {
        return this.f51797e.getString(i);
    }

    /* renamed from: k */
    public void mo23370k(String str) {
        Intent intent = new Intent();
        C20483c cVar = this.f51776E;
        if (cVar instanceof CardInfo) {
            intent.putExtra("key_card_info_data", (CardInfo) cVar);
        } else if (cVar instanceof ShareCardInfo) {
            intent.putExtra("key_card_info_data", (ShareCardInfo) cVar);
        }
        intent.setClass(this.f51797e, CardConsumeCodeUI.class);
        intent.putExtra("key_from_scene", this.f51791U.f51822a);
        intent.putExtra("key_previous_scene", this.f51791U.f51823b);
        intent.putExtra("key_mark_user", str);
        intent.putExtra("key_from_appbrand_type", this.f51791U.f51829h);
        this.f51797e.startActivityForResult(intent, 3);
        this.f51797e.mmSetOnActivityResultCallback(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017d, code lost:
        r8 = r2.f64223g;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23371l() {
        /*
            r12 = this;
            rz0.g r0 = r12.f51798f
            boolean r0 = r0.mo35437k()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "MicroMsg.CardDetailUIContoller"
            java.lang.String r1 = "card is membership or share card or general coupon, not accept, don't updateCellData()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0010:
            java.util.List<hz0.b> r0 = r12.f51778G
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<hz0.b> r0 = r12.f51778G
            gz0.g r1 = r12.f51779H
            java.util.List<hz0.b> r2 = r1.f58972d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            te3.fy r2 = r2.f63935B
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x006b
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            te3.fy r2 = r2.f63935B
            java.lang.String r2 = r2.f63884d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x006b
            hz0.b r2 = new hz0.b
            r2.<init>()
            r2.f59501t = r4
            dz0.c r5 = r1.f58970b
            te3.hn r5 = r5.mo23263J0()
            te3.fy r5 = r5.f63935B
            java.lang.String r5 = r5.f63884d
            r2.f64746d = r5
            r2.f64748f = r3
            java.lang.String r5 = "card://jump_card_gift"
            r2.f64749g = r5
            dz0.c r5 = r1.f58970b
            te3.hn r5 = r5.mo23263J0()
            te3.fy r5 = r5.f63935B
            java.lang.String r5 = r5.f63891n
            r2.f64753n = r5
            java.util.List<hz0.b> r5 = r1.f58972d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r2)
        L_0x006b:
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            java.util.LinkedList<te3.xo> r2 = r2.f63945g
            r5 = 0
            if (r2 == 0) goto L_0x00a4
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            java.util.LinkedList<te3.xo> r2 = r2.f63945g
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00a4
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            java.util.LinkedList<te3.xo> r2 = r2.f63945g
            java.util.List r2 = wz0.C22945n.m27003c(r2)
            if (r2 == 0) goto L_0x00a4
            r6 = r2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r5)
            hz0.b r6 = (hz0.C21034b) r6
            r6.f59502u = r5
            java.util.List<hz0.b> r6 = r1.f58972d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.addAll(r2)
        L_0x00a4:
            int r2 = r1.f58971c
            r6 = 6
            if (r2 != r6) goto L_0x00b3
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63949n
            if (r2 <= 0) goto L_0x00bb
        L_0x00b3:
            int r2 = r1.f58971c
            boolean r2 = wz0.C22945n.m27022v(r2)
            if (r2 == 0) goto L_0x0123
        L_0x00bb:
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23296v1()
            if (r2 == 0) goto L_0x0123
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23267O()
            if (r2 == 0) goto L_0x0123
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23294v()
            if (r2 == 0) goto L_0x0123
            hz0.b r2 = new hz0.b
            r2.<init>()
            r2.f59501t = r4
            dz0.c r7 = r1.f58970b
            te3.ko r7 = r7.mo23264L0()
            java.lang.String r7 = r7.f64127U0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00f3
            dz0.c r7 = r1.f58970b
            te3.ko r7 = r7.mo23264L0()
            java.lang.String r7 = r7.f64127U0
            r2.f64746d = r7
            goto L_0x0116
        L_0x00f3:
            dz0.c r7 = r1.f58970b
            boolean r7 = r7.mo23285h2()
            if (r7 == 0) goto L_0x0109
            android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r8 = 2131823144(0x7f110a28, float:1.927908E38)
            java.lang.String r7 = r7.getString(r8)
            r2.f64746d = r7
            goto L_0x0116
        L_0x0109:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131823143(0x7f110a27, float:1.9279077E38)
            java.lang.String r7 = r7.getString(r8)
            r2.f64746d = r7
        L_0x0116:
            r2.f64748f = r3
            java.lang.String r7 = "card://jump_gift"
            r2.f64749g = r7
            java.util.List<hz0.b> r7 = r1.f58972d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r2)
        L_0x0123:
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63942d
            if (r2 == 0) goto L_0x013f
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63942d
            if (r2 == r4) goto L_0x013f
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63942d
        L_0x013f:
            int r2 = r1.f58971c
            r7 = 3
            if (r2 == r7) goto L_0x014e
            if (r2 != r6) goto L_0x014e
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63949n
        L_0x014e:
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.m40 r2 = r2.f64115M
            dz0.c r6 = r1.f58970b
            te3.hn r6 = r6.mo23263J0()
            te3.fy r6 = r6.f63956u
            if (r6 == 0) goto L_0x016d
            dz0.c r6 = r1.f58970b
            te3.hn r6 = r6.mo23263J0()
            te3.fy r6 = r6.f63956u
            java.lang.String r6 = r6.f63884d
            android.text.TextUtils.isEmpty(r6)
        L_0x016d:
            hz0.b r6 = new hz0.b
            r6.<init>()
            dz0.c r8 = r1.f58970b
            boolean r8 = r8.mo23285h2()
            if (r8 == 0) goto L_0x017b
            goto L_0x0198
        L_0x017b:
            if (r2 == 0) goto L_0x0196
            java.util.LinkedList<java.lang.String> r8 = r2.f64223g
            if (r8 == 0) goto L_0x0196
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0196
            java.util.LinkedList<java.lang.String> r8 = r2.f64223g
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            if (r2 != 0) goto L_0x019a
        L_0x0198:
            r2 = 0
            goto L_0x019b
        L_0x019a:
            r2 = 1
        L_0x019b:
            r6.f59502u = r5
            r6.f59501t = r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r1.mo32579d()
            r8.append(r9)
            r9 = 2131823030(0x7f1109b6, float:1.9278848E38)
            java.lang.String r9 = r1.mo32578c(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.f64746d = r8
            r6.f64747e = r3
            r6.f64748f = r3
            java.lang.String r8 = "card://jump_detail"
            r6.f64749g = r8
            if (r2 == 0) goto L_0x01cc
            java.util.List<hz0.b> r2 = r1.f58972d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r6)
        L_0x01cc:
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23271R1()
            if (r2 == 0) goto L_0x01e0
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            int r2 = r2.f64154x
            if (r2 <= 0) goto L_0x01e0
            goto L_0x02a3
        L_0x01e0:
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23291o()
            if (r2 == 0) goto L_0x01f7
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            int r2 = r2.f64154x
            if (r2 <= 0) goto L_0x01f7
            r1.mo32576a()
            goto L_0x02a3
        L_0x01f7:
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            int r2 = r2.f64154x
            if (r2 <= 0) goto L_0x02a3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "shop_count:"
            r2.append(r6)
            dz0.c r6 = r1.f58970b
            te3.ko r6 = r6.mo23264L0()
            int r6 = r6.f64154x
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "MicroMsg.CardDetailDataMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r2)
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            int r2 = r2.f64154x
            if (r2 < r4) goto L_0x02a0
            java.util.ArrayList<te3.co> r2 = r1.f58974f
            if (r2 == 0) goto L_0x02a0
            int r2 = r2.size()
            if (r2 < r4) goto L_0x02a0
            java.util.ArrayList<te3.co> r2 = r1.f58974f
            java.lang.Object r2 = r2.get(r5)
            te3.co r2 = (te3.C49029co) r2
            if (r2 == 0) goto L_0x0288
            float r8 = r2.f131855n
            r9 = 1195593728(0x47435000, float:50000.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0288
            hz0.b r6 = new hz0.b
            r6.<init>()
            r8 = 2
            r6.f59501t = r8
            java.lang.String r9 = r2.f131848d
            r6.f64746d = r9
            com.tencent.mm.ui.MMActivity r9 = r1.f58969a
            r10 = 2131823203(0x7f110a63, float:1.92792E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            float r11 = r2.f131855n
            java.lang.String r11 = wz0.C22945n.m26991D(r9, r11)
            r8[r5] = r11
            java.lang.String r5 = r2.f131854j
            r8[r4] = r5
            java.lang.String r5 = r9.getString(r10, r8)
            r6.f64747e = r5
            r6.f64748f = r3
            java.lang.String r3 = "card://jump_shop"
            r6.f64749g = r3
            java.lang.String r2 = r2.f131850f
            r6.f59506y = r2
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64145p
            r6.f59507z = r2
            java.util.List<hz0.b> r2 = r1.f58972d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r6)
            goto L_0x02a0
        L_0x0288:
            if (r2 == 0) goto L_0x02a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "distance:"
            r3.append(r5)
            float r2 = r2.f131855n
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r2)
        L_0x02a0:
            r1.mo32576a()
        L_0x02a3:
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23285h2()
            if (r2 == 0) goto L_0x02b6
            dz0.c r2 = r1.f58970b
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63942d
            if (r2 != r7) goto L_0x02b6
            goto L_0x02cf
        L_0x02b6:
            dz0.c r2 = r1.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64139g
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02cf
            java.util.List<hz0.b> r2 = r1.f58972d
            hz0.b r3 = r1.mo32577b()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r3)
        L_0x02cf:
            dz0.c r2 = r1.f58970b
            boolean r2 = r2.mo23291o()
            if (r2 == 0) goto L_0x02ee
            java.util.List<hz0.b> r2 = r1.f58972d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x02df:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ee
            java.lang.Object r3 = r2.next()
            hz0.b r3 = (hz0.C21034b) r3
            r3.f59505x = r4
            goto L_0x02df
        L_0x02ee:
            java.util.List<hz0.b> r1 = r1.f58972d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            com.tencent.mm.plugin.card.ui.l0 r0 = r12.f51807r
            java.util.List<hz0.b> r1 = r12.f51778G
            java.util.List<hz0.b> r2 = r0.f51947d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.util.List<hz0.b> r0 = r0.f51947d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            com.tencent.mm.plugin.card.ui.l0 r0 = r12.f51807r
            dz0.c r1 = r12.f51776E
            boolean r1 = r1.mo23285h2()
            r0.f51949f = r1
            com.tencent.mm.plugin.card.ui.l0 r0 = r12.f51807r
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller.mo23371l():void");
    }

    /* renamed from: m */
    public final void mo23372m() {
        if (this.f51792V) {
            Log.m105924i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
            return;
        }
        if (!this.f51776E.mo23267O() || !this.f51776E.mo23291o()) {
            int d = C22945n.m27004d(this.f51776E.mo23264L0().f64145p);
            this.f51796d.findViewById(C0966R.C0970id.f357622au1).setBackgroundColor(d);
            this.f51797e.setActionbarColor(d);
        } else {
            this.f51796d.findViewById(C0966R.C0970id.f357622au1).setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.al6));
            MMActivity mMActivity = this.f51797e;
            mMActivity.setActionbarColor(mMActivity.getResources().getColor(C0966R.color.al6));
        }
        View findViewById = this.f51796d.findViewById(C0966R.C0970id.c3j);
        View findViewById2 = this.f51796d.findViewById(C0966R.C0970id.evh);
        View findViewById3 = this.f51796d.findViewById(C0966R.C0970id.c3f);
        if (!this.f51776E.mo23267O() || !this.f51798f.mo35432f()) {
            if (this.f51776E.mo23272T0()) {
                if (this.f51798f.mo35438l() && this.f51800h) {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.bxp);
                    findViewById3.setBackgroundResource(0);
                } else if (!this.f51798f.mo35438l() || this.f51800h) {
                    findViewById.setBackgroundResource(0);
                    if (((C22280a) this.f51798f).f63174d) {
                        findViewById3.setBackgroundResource(C0966R.C0969drawable.bxo);
                    } else {
                        findViewById3.setBackgroundResource(C0966R.C0969drawable.bxp);
                    }
                } else {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.bxo);
                    findViewById3.setBackgroundResource(0);
                }
            } else if (this.f51776E.mo23284h()) {
                findViewById.setClipToOutline(true);
                findViewById.setOutlineProvider(new C18580d());
                findViewById3.setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.UN_BW_97));
            } else if (this.f51776E.mo23271R1()) {
                findViewById.setBackgroundResource(C0966R.C0969drawable.f4722l2);
                findViewById3.setBackgroundResource(0);
            } else {
                findViewById.setBackgroundResource(0);
                findViewById3.setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.al6));
            }
        } else if (this.f51776E.mo23284h()) {
            findViewById.setClipToOutline(true);
            findViewById.setOutlineProvider(new C18579c());
            findViewById3.setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.UN_BW_97));
        } else if (this.f51776E.mo23291o()) {
            this.f51796d.findViewById(C0966R.C0970id.efy).setBackgroundResource(0);
            findViewById3.setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.al6));
        } else if (this.f51776E.mo23271R1()) {
            findViewById.setBackgroundResource(C0966R.C0969drawable.bxp);
            this.f51796d.findViewById(C0966R.C0970id.efy).setBackgroundResource(C0966R.C0969drawable.f4697kb);
            findViewById3.setBackgroundResource(0);
        } else if (!this.f51776E.mo23289m0() && this.f51776E.mo23285h2()) {
            findViewById3.setBackgroundColor(this.f51797e.getResources().getColor(C0966R.color.al6));
        }
        if (this.f51776E.mo23285h2()) {
            TextView textView = (TextView) this.f51796d.findViewById(C0966R.C0970id.ai6);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.bxn));
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            textView.setBackgroundDrawable(bitmapDrawable);
            textView.setVisibility(0);
        }
        Rect rect = new Rect(0, 0, 0, 0);
        findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById.invalidate();
        findViewById3.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById3.invalidate();
        if (this.f51776E.mo23272T0() && this.f51798f.mo35438l() && this.f51800h) {
            View findViewById4 = this.f51796d.findViewById(C0966R.C0970id.jix);
            findViewById4.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            findViewById4.invalidate();
        }
        if (this.f51776E.mo23267O() && this.f51798f.mo35432f()) {
            View findViewById5 = this.f51796d.findViewById(C0966R.C0970id.efy);
            rect.left = this.f51797e.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
            int dimensionPixelOffset = this.f51797e.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
            rect.right = dimensionPixelOffset;
            findViewById5.setPadding(rect.left, rect.top, dimensionPixelOffset, rect.bottom);
            findViewById5.invalidate();
            if (this.f51776E.mo23271R1()) {
                View findViewById6 = this.f51796d.findViewById(C0966R.C0970id.efz);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById6.getLayoutParams();
                int dimensionPixelSize = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
                findViewById6.setLayoutParams(layoutParams);
            }
        }
        if (this.f51798f.mo35432f() || this.f51798f.mo35438l()) {
            if (this.f51803n != null && ((this.f51776E.mo23267O() && this.f51776E.mo23284h()) || this.f51776E.mo23272T0())) {
                this.f51803n.mo36524c(0);
            }
        } else if (this.f51803n != null && ((this.f51776E.mo23267O() && this.f51776E.mo23284h()) || this.f51776E.mo23272T0())) {
            if (((C22280a) this.f51798f).f63174d) {
                this.f51803n.mo36524c(C0966R.C0969drawable.bxq);
            } else {
                this.f51803n.mo36524c(C0966R.C0969drawable.f4720kz);
            }
        }
        if (this.f51803n != null && this.f51776E.mo23267O() && this.f51776E.mo23291o()) {
            this.f51803n.mo36522a(C22945n.m27014n(this.f51797e, C22945n.m27004d(this.f51776E.mo23264L0().f64145p), this.f51797e.getResources().getDimensionPixelOffset(C0966R.dimen.f4231wz)));
        }
        if (this.f51776E.mo23267O() && this.f51776E.mo23291o()) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
            if (!TextUtils.isEmpty(this.f51776E.mo23264L0().f64108F)) {
                layoutParams2.weight = 0.0f;
                layoutParams2.height = -2;
            } else {
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
            }
            findViewById.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            int dimensionPixelSize2 = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
            layoutParams3.rightMargin = dimensionPixelSize2;
            layoutParams3.leftMargin = dimensionPixelSize2;
            if (this.f51776E.mo23291o()) {
                layoutParams3.topMargin = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3905if);
                layoutParams3.bottomMargin = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig);
                int dimensionPixelSize3 = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
                layoutParams3.rightMargin = dimensionPixelSize3;
                layoutParams3.leftMargin = dimensionPixelSize3;
            } else {
                int dimensionPixelSize4 = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3633r);
                layoutParams3.bottomMargin = dimensionPixelSize4;
                layoutParams3.topMargin = dimensionPixelSize4;
            }
            findViewById2.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) findViewById3.getLayoutParams();
            layoutParams4.bottomMargin = 0;
            layoutParams4.topMargin = 0;
            layoutParams4.rightMargin = 0;
            layoutParams4.leftMargin = 0;
            if (this.f51776E.mo23291o()) {
                layoutParams4.bottomMargin = this.f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
            }
            if (!TextUtils.isEmpty(this.f51776E.mo23264L0().f64108F)) {
                layoutParams4.weight = 0.0f;
                layoutParams4.height = -2;
            } else {
                layoutParams4.height = 0;
                layoutParams4.weight = 1.0f;
            }
            findViewById3.setLayoutParams(layoutParams4);
            if (!TextUtils.isEmpty(this.f51776E.mo23264L0().f64108F)) {
                View findViewById7 = this.f51796d.findViewById(C0966R.C0970id.f5648ks);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) findViewById7.getLayoutParams();
                layoutParams5.height = 0;
                layoutParams5.weight = 1.0f;
                findViewById7.setLayoutParams(layoutParams5);
            }
        }
        this.f51796d.invalidate();
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (!(i == 0 || i == 1)) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                } else if (this.f51790T != null) {
                    Log.m105924i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
                    return;
                } else {
                    return;
                }
            } else if (i2 == -1) {
                int intExtra = intent.getIntExtra("Ktag_range_index", 0);
                this.f51782K = intExtra;
                Log.m105925i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", Integer.valueOf(intExtra));
                if (this.f51782K >= 2) {
                    this.f51783L = intent.getStringExtra("Klabel_name_list");
                    this.f51784M = intent.getStringExtra("Kother_user_name_list");
                    Log.m105919d("MicroMsg.CardDetailUIContoller", "mPrivateSelect : %d, names : %s", Integer.valueOf(this.f51782K), this.f51783L);
                    if (!TextUtils.isEmpty(this.f51783L) || !TextUtils.isEmpty(this.f51784M)) {
                        List asList = Arrays.asList(this.f51783L.split(","));
                        this.f51786P = C22945n.m27008h(asList);
                        this.f51785N = C22945n.m27009i(asList);
                        String str = this.f51784M;
                        if (str != null && str.length() > 0) {
                            this.f51785N.addAll(Arrays.asList(this.f51784M.split(",")));
                        }
                        if (this.f51786P != null) {
                            Log.m105924i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.f51786P.size());
                        }
                        if (this.f51785N != null) {
                            Log.m105924i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.f51785N.size());
                            Iterator<String> it = this.f51785N.iterator();
                            while (it.hasNext()) {
                                Log.m105919d("MicroMsg.CardDetailUIContoller", "username : %s", it.next());
                            }
                        }
                        int i3 = this.f51782K;
                        if (i3 == 2) {
                            C22816e eVar = this.f51772A;
                            eVar.f65603d.setText(this.f51797e.getString(C0966R.string.f360233b14, new Object[]{mo23368i()}));
                            return;
                        } else if (i3 == 3) {
                            C22816e eVar2 = this.f51772A;
                            eVar2.f65603d.setText(this.f51797e.getString(C0966R.string.f360232b13, new Object[]{mo23368i()}));
                            return;
                        } else {
                            C22816e eVar3 = this.f51772A;
                            eVar3.f65603d.setText(this.f51797e.getString(C0966R.string.f360231b12));
                            return;
                        }
                    } else {
                        Log.m105920e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
                        return;
                    }
                } else {
                    C22816e eVar4 = this.f51772A;
                    eVar4.f65603d.setText(this.f51797e.getString(C0966R.string.f360231b12));
                    return;
                }
            } else {
                return;
            }
        }
        if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            this.f51780I = stringExtra;
            C20483c cVar = this.f51776E;
            if (cVar == null || cVar.mo23264L0() == null) {
                Log.m105920e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                if (TextUtils.isEmpty(this.f51776E.mo23293u0().f133848d) || this.f51776E.mo23285h2()) {
                    sb.append(mo23369j(C0966R.string.jgc));
                } else {
                    sb.append(this.f51776E.mo23293u0().f133848d);
                }
            } else if (i == 1) {
                sb.append(mo23369j(C0966R.string.b1f) + this.f51779H.mo32579d());
            } else if (i == 4) {
                sb.append(mo23369j(C0966R.string.b0d) + this.f51779H.mo32579d());
            }
            C15148g1.C15149a.f41275a.Sk0(this.f51797e.getController(), sb.toString(), this.f51776E.mo23264L0().f64137e, this.f51776E.mo23264L0().f64143n + "\n" + this.f51776E.mo23264L0().f64142j, (String) null, true, this.f51797e.getResources().getString(C0966R.string.a2s), new C18603i(this, i, stringExtra));
        }
    }
}
