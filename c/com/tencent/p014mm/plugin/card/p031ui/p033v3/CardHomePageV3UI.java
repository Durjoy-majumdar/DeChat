package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardTicketListUI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kr0.C88273g1;
import kr0.C88274h0;
import kz0.C10443e;
import lz0.C46917c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C22517nn;
import te3.C22520on;
import te3.C22528rn;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51997xn;
import te3.C64222a42;
import te3.C64632pn;
import te3.C64713sn;
import uo3.C78253a;
import wz0.C102526o;
import wz0.C22945n;
import wz0.C53246b;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "b", "c", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI */
public final class CardHomePageV3UI extends MMActivity {

    /* renamed from: y */
    public static final /* synthetic */ int f52082y = 0;

    /* renamed from: d */
    public String f52083d = "MicroMsg.CardHomePageV3UI";

    /* renamed from: e */
    public WxRecyclerView f52084e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f52085f;

    /* renamed from: g */
    public ViewGroup f52086g;

    /* renamed from: h */
    public ViewGroup f52087h;

    /* renamed from: i */
    public TextView f52088i;

    /* renamed from: j */
    public View f52089j;

    /* renamed from: n */
    public WxRecyclerAdapter<C18639a> f52090n;

    /* renamed from: o */
    public ArrayList<C18639a> f52091o = new ArrayList<>();

    /* renamed from: p */
    public int f52092p;

    /* renamed from: q */
    public boolean f52093q;

    /* renamed from: r */
    public boolean f52094r;

    /* renamed from: s */
    public boolean f52095s;

    /* renamed from: t */
    public boolean f52096t;

    /* renamed from: u */
    public C64713sn f52097u;

    /* renamed from: v */
    public C22517nn f52098v;

    /* renamed from: w */
    public int f52099w;

    /* renamed from: x */
    public int f52100x;

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$c */
    public static final class C2167c extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$c$a */
        public static final class C2168a extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2168a f12144d = new C2168a();

            public C2168a() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, LocaleUtil.ITALIAN);
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bcd)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bc8)).getText());
                return sb.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2167c(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.f6735n4).view(C0966R.C0970id.bbo).desc((int) C0966R.C0970id.bbm);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6737n6);
            root.view(C0966R.C0970id.bcc).desc((C32226l<? super View, String>) C2168a.f12144d).type(viewType);
            root.disable(C0966R.C0970id.bc7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$a */
    public static final class C18639a implements C9493c {

        /* renamed from: d */
        public C22520on f52101d;

        /* renamed from: a */
        public final C22520on mo23469a() {
            C22520on onVar = this.f52101d;
            if (onVar != null) {
                return onVar;
            }
            C87412m.m108603p("recentlyUsedCell");
            throw null;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) mo23469a().f64362d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$b */
    public final class C18640b extends C60896i<C18639a> {

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$b$a */
        public static final class C18641a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60905o f52103d;

            /* renamed from: e */
            public final /* synthetic */ CardHomePageV3UI f52104e;

            public C18641a(C60905o oVar, CardHomePageV3UI cardHomePageV3UI) {
                this.f52103d = oVar;
                this.f52104e = cardHomePageV3UI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C18639a aVar = (C18639a) this.f52103d.f173503E;
                int i = aVar.mo23469a().f64370o;
                if (i == 1) {
                    C53246b.m59678j((MMActivity) this.f52104e.getContext(), aVar.mo23469a().f64371p, 0);
                } else if (i == 2) {
                    C51997xn xnVar = aVar.mo23469a().f64372q;
                    if (xnVar != null) {
                        C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    }
                } else if (i != 3) {
                    String str = this.f52104e.f52083d;
                    Log.m105928w(str, "unknown type " + aVar.mo23469a().f64370o);
                    CardHomePageV3UI cardHomePageV3UI = this.f52104e;
                    String str2 = aVar.mo23469a().f64363e;
                    C87412m.m108593f(str2, "cardConvertData.recentlyUsedCell.user_card_id");
                    CardHomePageV3UI.m19407H7(cardHomePageV3UI, str2);
                } else {
                    CardHomePageV3UI cardHomePageV3UI2 = this.f52104e;
                    String str3 = aVar.mo23469a().f64363e;
                    C87412m.m108593f(str3, "cardConvertData.recentlyUsedCell.user_card_id");
                    CardHomePageV3UI.m19407H7(cardHomePageV3UI2, str3);
                }
                C115669n.INSTANCE.mo160131h(19674, 1, Integer.valueOf(aVar.mo23469a().f64368j), aVar.mo23469a().f64363e, Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$b$b */
        public static final class C18642b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60905o f52105d;

            /* renamed from: e */
            public final /* synthetic */ CardHomePageV3UI f52106e;

            /* renamed from: f */
            public final /* synthetic */ C18640b f52107f;

            /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$b$b$a */
            public static final class C18643a implements View.OnCreateContextMenuListener {

                /* renamed from: d */
                public final /* synthetic */ CardHomePageV3UI f52108d;

                public C18643a(CardHomePageV3UI cardHomePageV3UI) {
                    this.f52108d = cardHomePageV3UI;
                }

                public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    contextMenu.add(0, 1, 0, this.f52108d.getString(C0966R.string.ayl));
                }
            }

            /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$b$b$b */
            public static final class C18644b implements C11184p0 {

                /* renamed from: d */
                public final /* synthetic */ C18640b f52109d;

                /* renamed from: e */
                public final /* synthetic */ C18639a f52110e;

                public C18644b(C18640b bVar, C18639a aVar) {
                    this.f52109d = bVar;
                    this.f52110e = aVar;
                }

                public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    C18640b bVar = this.f52109d;
                    String str = this.f52110e.mo23469a().f64362d;
                    C87412m.m108593f(str, "cardConvertData.recentlyUsedCell.card_id");
                    String str2 = this.f52110e.mo23469a().f64363e;
                    C87412m.m108593f(str2, "cardConvertData.recentlyUsedCell.user_card_id");
                    C77407n nVar = new C77407n((Context) CardHomePageV3UI.this.getContext(), 1, true);
                    TextView textView = new TextView(CardHomePageV3UI.this.getContext());
                    textView.setText(CardHomePageV3UI.this.getString(C0966R.string.ayk));
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(CardHomePageV3UI.this.getResources().getColor(C0966R.color.f3552xi));
                    textView.setGravity(17);
                    int dimensionPixelSize = CardHomePageV3UI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                    int dimensionPixelSize2 = CardHomePageV3UI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                    textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    nVar.mo107569n(textView, false);
                    CardHomePageV3UI cardHomePageV3UI = CardHomePageV3UI.this;
                    nVar.f225771i = new C2171c(cardHomePageV3UI);
                    nVar.f225782p = new C18685d(cardHomePageV3UI, str, str2);
                    nVar.mo107573q();
                    C115669n.INSTANCE.mo160131h(19674, 2, Integer.valueOf(this.f52110e.mo23469a().f64368j), this.f52110e.mo23469a().f64363e, Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
                }
            }

            public C18642b(C60905o oVar, CardHomePageV3UI cardHomePageV3UI, C18640b bVar) {
                this.f52105d = oVar;
                this.f52106e = cardHomePageV3UI;
                this.f52107f = bVar;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C78253a aVar = new C78253a(this.f52106e.getContext(), view);
                aVar.f229249r = new C18643a(this.f52106e);
                aVar.f229251t = new C18644b(this.f52107f, (C18639a) this.f52105d.f173503E);
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                Point a = C102526o.m135341a(view);
                aVar.mo71743n(a.x, a.y);
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C18640b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f6737n6;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C18639a aVar = (C18639a) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(aVar, "item");
            oVar.mo85815G(C0966R.C0970id.bcd, aVar.mo23469a().f64365g);
            C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.bcd)).getPaint(), 0.8f);
            oVar.mo85815G(C0966R.C0970id.bc8, aVar.mo23469a().f64364f);
            Object tag = oVar.f44854d.getTag();
            String str = aVar.mo23469a().f64363e;
            if (str == null) {
                str = "";
            }
            if (!(tag instanceof String) || TextUtils.isEmpty((CharSequence) tag) || !tag.equals(str)) {
                oVar.f44854d.setTag(str);
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) oVar.mo85812D(C0966R.C0970id.bc9);
                roundCornerImageView.mo104340q(C76577a.m92151b(CardHomePageV3UI.this.getContext(), 1), CardHomePageV3UI.this.getResources().getColor(C0966R.color.f2975b6));
                roundCornerImageView.setImageDrawable((Drawable) null);
                String str2 = aVar.mo23469a().f64369n;
                if (str2 != null) {
                    int dimensionPixelSize = CardHomePageV3UI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6);
                    C102526o.m135342b(roundCornerImageView, str2, 0.0f, true, C0966R.raw.card_default_merchant_icon, dimensionPixelSize, dimensionPixelSize);
                }
                if (aVar.mo23469a().f64368j == 3) {
                    oVar.mo85816H(C0966R.C0970id.bcd, CardHomePageV3UI.this.getResources().getColor(C0966R.color.f3138gm));
                    oVar.mo85816H(C0966R.C0970id.bc8, CardHomePageV3UI.this.getResources().getColor(C0966R.color.f3138gm));
                    View D = oVar.mo85812D(C0966R.C0970id.bcd);
                    C87412m.m108593f(D, "holder.getView(R.id.chpiv3_title_tv)");
                    ((TextView) D).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    View D2 = oVar.mo85812D(C0966R.C0970id.bc8);
                    C87412m.m108593f(D2, "holder.getView(R.id.chpiv3_desc_tv)");
                    ((TextView) D2).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    oVar.mo85817I(C0966R.C0970id.bc7, 8);
                    oVar.mo85817I(C0966R.C0970id.bca, 0);
                    oVar.mo85817I(C0966R.C0970id.bc6, 8);
                    return;
                }
                oVar.mo85816H(C0966R.C0970id.bcd, CardHomePageV3UI.this.getResources().getColor(C0966R.color.f2975b6));
                oVar.mo85816H(C0966R.C0970id.bc8, CardHomePageV3UI.this.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                View D3 = oVar.mo85812D(C0966R.C0970id.bcd);
                C87412m.m108593f(D3, "holder.getView(R.id.chpiv3_title_tv)");
                TextView textView = (TextView) D3;
                textView.setShadowLayer((float) C76577a.m92151b(textView.getContext(), 4), 0.0f, 0.0f, CardHomePageV3UI.this.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_2));
                View D4 = oVar.mo85812D(C0966R.C0970id.bc8);
                C87412m.m108593f(D4, "holder.getView(R.id.chpiv3_desc_tv)");
                TextView textView2 = (TextView) D4;
                textView2.setShadowLayer((float) C76577a.m92151b(textView2.getContext(), 4), 0.0f, 0.0f, CardHomePageV3UI.this.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_2));
                oVar.mo85817I(C0966R.C0970id.bca, 8);
                View D5 = oVar.mo85812D(C0966R.C0970id.bc7);
                C87412m.m108593f(D5, "holder.getView(R.id.chpiv3_card_bg_iv)");
                MemberCardTopCropImageView memberCardTopCropImageView = (MemberCardTopCropImageView) D5;
                memberCardTopCropImageView.setImageDrawable((Drawable) null);
                C18684b bVar = new C18684b(CardHomePageV3UI.this, oVar, memberCardTopCropImageView, aVar);
                CardHomePageV3UI cardHomePageV3UI = CardHomePageV3UI.this;
                if (cardHomePageV3UI.f52099w <= 0 || cardHomePageV3UI.f52100x <= 0) {
                    cardHomePageV3UI.f52099w = oVar.f44854d.getHeight();
                    CardHomePageV3UI.this.f52100x = oVar.f44854d.getWidth();
                    CardHomePageV3UI cardHomePageV3UI2 = CardHomePageV3UI.this;
                    if (cardHomePageV3UI2.f52099w <= 0 || cardHomePageV3UI2.f52100x <= 0) {
                        oVar.f44854d.post(new C18683a(cardHomePageV3UI2, oVar, bVar));
                        return;
                    }
                }
                bVar.invoke();
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
            ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.bcc);
            viewGroup.setOnClickListener(new C18641a(oVar, CardHomePageV3UI.this));
            viewGroup.setOnLongClickListener(new C18642b(oVar, CardHomePageV3UI.this, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$d */
    public static final class C18645d extends C87413o implements C32226l<C89132b.C89134c<C64222a42>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageV3UI f52111d;

        /* renamed from: e */
        public final /* synthetic */ boolean f52112e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18645d(CardHomePageV3UI cardHomePageV3UI, boolean z) {
            super(1);
            this.f52111d = cardHomePageV3UI;
            this.f52112e = z;
        }

        public Object invoke(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                CardHomePageV3UI cardHomePageV3UI = this.f52111d;
                boolean z = this.f52112e;
                String str = cardHomePageV3UI.f52083d;
                Log.m105924i(str, "errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C64222a42 a422 = (C64222a42) cVar.f256796d;
                    if (a422 != null) {
                        String str2 = cardHomePageV3UI.f52083d;
                        Log.m105924i(str2, "retcode: " + a422.f182018d + ", retmsg: " + a422.f182019e);
                        if (a422.f182018d == 0) {
                            cardHomePageV3UI.f52092p = a422.f182021g;
                            cardHomePageV3UI.f52093q = a422.f182022h >= 1;
                            cardHomePageV3UI.f52095s = true;
                            cardHomePageV3UI.mo23468N7(a422.f182025n);
                            cardHomePageV3UI.mo23466L7(a422.f182020f);
                            if (z) {
                                cardHomePageV3UI.f52091o.clear();
                            }
                            cardHomePageV3UI.mo23464J7(a422.f182023i);
                            cardHomePageV3UI.mo23465K7(a422.f182024j);
                        } else {
                            C22945n.m27018r(cardHomePageV3UI.getContext(), a422.f182019e);
                        }
                    }
                } else {
                    C22945n.m27017q(cardHomePageV3UI.getContext(), "");
                }
            }
            CardHomePageV3UI cardHomePageV3UI2 = this.f52111d;
            cardHomePageV3UI2.f52094r = false;
            if (!this.f52112e) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = cardHomePageV3UI2.f52085f;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.mo82440F(0);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$e */
    public static final class C18646e extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ CardHomePageV3UI f52113a;

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$e$a */
        public static final class C18647a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageV3UI f52114d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18647a(CardHomePageV3UI cardHomePageV3UI) {
                super(0);
                this.f52114d = cardHomePageV3UI;
            }

            public Object invoke() {
                CardHomePageV3UI cardHomePageV3UI = this.f52114d;
                int i = CardHomePageV3UI.f52082y;
                cardHomePageV3UI.mo23463I7(false);
                return C13598b0.f38549a;
            }
        }

        public C18646e(CardHomePageV3UI cardHomePageV3UI) {
            this.f52113a = cardHomePageV3UI;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            Log.m105918d(this.f52113a.f52083d, "on load more");
            C61926c.m72668M(new C18647a(this.f52113a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            CardHomePageV3UI cardHomePageV3UI = this.f52113a;
            String str = cardHomePageV3UI.f52083d;
            cardHomePageV3UI.getClass();
            Log.m105918d(str, "on load more end: 0");
            CardHomePageV3UI cardHomePageV3UI2 = this.f52113a;
            if (cardHomePageV3UI2.f52093q) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = cardHomePageV3UI2.f52085f;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.mo82437B((RefreshLoadMoreLayout.C7080c<Object>) null);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            Log.m105918d(this.f52113a.f52083d, "on begin refresh");
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            Log.m105918d(this.f52113a.f52083d, "on refresh end");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$f */
    public static final class C18648f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageV3UI f52115d;

        public C18648f(CardHomePageV3UI cardHomePageV3UI) {
            this.f52115d = cardHomePageV3UI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52115d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$g */
    public static final class C18649g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageV3UI f52116d;

        /* renamed from: e */
        public final /* synthetic */ C22517nn f52117e;

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$g$a */
        public static final class C18650a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C22517nn f52118d;

            public C18650a(C22517nn nnVar) {
                this.f52118d = nnVar;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.add(0, 0, 1, (CharSequence) this.f52118d.f64329d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$g$b */
        public static final class C18651b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C22517nn f52119d;

            /* renamed from: e */
            public final /* synthetic */ CardHomePageV3UI f52120e;

            public C18651b(C22517nn nnVar, CardHomePageV3UI cardHomePageV3UI) {
                this.f52119d = nnVar;
                this.f52120e = cardHomePageV3UI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 0) {
                    C22517nn nnVar = this.f52119d;
                    int i2 = nnVar.f64330e;
                    if (i2 == 1) {
                        C53246b.m59678j((MMActivity) this.f52120e.getContext(), this.f52119d.f64331f, 0);
                    } else if (i2 == 2) {
                        C51997xn xnVar = nnVar.f64332g;
                        C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    }
                }
            }
        }

        public C18649g(CardHomePageV3UI cardHomePageV3UI, C22517nn nnVar) {
            this.f52116d = cardHomePageV3UI;
            this.f52117e = nnVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) this.f52116d.getContext(), 1, false);
            C22517nn nnVar = this.f52117e;
            nVar.f225771i = new C18650a(nnVar);
            nVar.f225782p = new C18651b(nnVar, this.f52116d);
            nVar.mo107573q();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$h */
    public static final class C18652h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C22528rn f52121d;

        /* renamed from: e */
        public final /* synthetic */ CardHomePageV3UI f52122e;

        public C18652h(C22528rn rnVar, CardHomePageV3UI cardHomePageV3UI) {
            this.f52121d = rnVar;
            this.f52122e = cardHomePageV3UI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C22528rn rnVar = this.f52121d;
            int i = rnVar.f64552g;
            if (i == 1) {
                C53246b.m59678j((MMActivity) this.f52122e.getContext(), this.f52121d.f64553h, 0);
            } else if (i == 2) {
                C51997xn xnVar = rnVar.f64554i;
                if (xnVar != null) {
                    CardHomePageV3UI cardHomePageV3UI = this.f52122e;
                    C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    cardHomePageV3UI.f52096t = true;
                }
            } else if (i != 3) {
                String str = this.f52122e.f52083d;
                Log.m105928w(str, "unknown type " + this.f52121d.f64552g);
            } else if ("weixin://mktcard/cert".equals(rnVar.f64555j)) {
                CardHomePageV3UI cardHomePageV3UI2 = this.f52122e;
                Log.m105924i(cardHomePageV3UI2.f52083d, "go to cert list");
                cardHomePageV3UI2.startActivityForResult(new Intent(cardHomePageV3UI2.getContext(), CardTicketListUI.class), 2);
            } else if ("weixin://mktcard/membercard".equals(this.f52121d.f64555j)) {
                CardHomePageV3UI cardHomePageV3UI3 = this.f52122e;
                Log.m105924i(cardHomePageV3UI3.f52083d, "go to vip card list");
                cardHomePageV3UI3.startActivityForResult(new Intent(cardHomePageV3UI3.getContext(), VipCardListUI.class), 1);
            } else if ("weixin://mktcard/coupon".equals(this.f52121d.f64555j)) {
                CardHomePageV3UI cardHomePageV3UI4 = this.f52122e;
                String str2 = this.f52121d.f64550e;
                Log.m105924i(cardHomePageV3UI4.f52083d, "go to vip card list");
                Intent intent = new Intent(cardHomePageV3UI4.getContext(), CouponCardListUI.class);
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
                cardHomePageV3UI4.startActivityForResult(intent, 3);
            } else if ("weixin://mktcard/couponv2".equals(this.f52121d.f64555j)) {
                CardHomePageV3UI cardHomePageV3UI5 = this.f52122e;
                String str3 = this.f52121d.f64550e;
                Log.m105924i(cardHomePageV3UI5.f52083d, "go to coupon gift card list");
                Intent intent2 = new Intent(cardHomePageV3UI5.getContext(), CouponAndGiftCardListV4UI.class);
                intent2.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
                cardHomePageV3UI5.startActivityForResult(intent2, 5);
            }
            C115669n.INSTANCE.mo160131h(19673, this.f52121d.f64550e, Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static final void m19407H7(CardHomePageV3UI cardHomePageV3UI, String str) {
        Log.m105925i(cardHomePageV3UI.f52083d, "go to card detail: %s", str);
        Intent intent = new Intent(cardHomePageV3UI.getContext(), CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        cardHomePageV3UI.startActivityForResult(intent, 4);
    }

    /* renamed from: I7 */
    public final void mo23463I7(boolean z) {
        Log.m105924i(this.f52083d, "do load home page");
        int i = 0;
        if (this.f52093q && !z) {
            Log.m105928w(this.f52083d, "already load complete");
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52085f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
            } else {
                C87412m.m108603p("mRefreshLayout");
                throw null;
            }
        } else if (this.f52094r) {
            Log.m105928w(this.f52083d, "is loading");
        } else {
            this.f52094r = true;
            int i2 = this.f52092p;
            if (z) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52085f;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setHasBottomMore(true);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            } else {
                i = i2;
            }
            C89059e i3 = new C46917c(i, 10).mo9225i();
            C87412m.m108593f(i3, "CgiGetMktCardHomePageV3(offset, 10).run()");
            C61926c.m72665J(i3, new C18645d(this, z));
        }
    }

    /* renamed from: J7 */
    public final void mo23464J7(C64632pn pnVar) {
        if (pnVar != null) {
            Iterator<C22520on> it = pnVar.f184864d.iterator();
            while (it.hasNext()) {
                C22520on next = it.next();
                C18639a aVar = new C18639a();
                C87412m.m108593f(next, "cell");
                aVar.f52101d = next;
                this.f52091o.add(aVar);
            }
            WxRecyclerAdapter<C18639a> wxRecyclerAdapter = this.f52090n;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            } else {
                C87412m.m108603p("mPageAdapter");
                throw null;
            }
        }
        mo23467M7();
    }

    /* renamed from: K7 */
    public final void mo23465K7(C22517nn nnVar) {
        if (nnVar != null) {
            this.f52098v = nnVar;
            if (!Util.isNullOrNil(nnVar.f64329d)) {
                removeAllOptionMenu();
                addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C18649g(this, nnVar));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ad  */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23466L7(te3.C64713sn r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.String r2 = r0.f52083d
            java.lang.String r3 = "do update header"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            r0.f52097u = r1
            android.view.ViewGroup r2 = r0.f52087h
            java.lang.String r4 = "mHeaderContainerLayout"
            if (r2 == 0) goto L_0x01e2
            r2.removeAllViews()
            android.content.res.Resources r2 = r30.getResources()
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r2 = r2.getDimensionPixelSize(r5)
            java.util.LinkedList<te3.tn> r1 = r1.f185433d
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01e1
            java.lang.Object r5 = r1.next()
            te3.tn r5 = (te3.C64732tn) r5
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r7 = r30.getContext()
            r6.<init>(r7)
            r7 = 1
            r6.setOrientation(r7)
            r8 = 0
            r6.setPadding(r8, r8, r8, r2)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            java.util.LinkedList<te3.rn> r10 = r5.f185620d
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0055:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01c7
            int r12 = r11 + 1
            java.lang.Object r13 = r10.next()
            te3.rn r13 = (te3.C22528rn) r13
            android.view.LayoutInflater r14 = r30.getLayoutInflater()
            r15 = 2131493499(0x7f0c027b, float:1.861048E38)
            android.view.View r14 = r14.inflate(r15, r6, r8)
            r15 = 2131299575(0x7f090cf7, float:1.8217155E38)
            android.view.View r15 = r14.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r3 = 2131299576(0x7f090cf8, float:1.8217157E38)
            android.view.View r3 = r14.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r8 = 2131299573(0x7f090cf5, float:1.8217151E38)
            android.view.View r8 = r14.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7 = 2131299581(0x7f090cfd, float:1.8217167E38)
            android.view.View r7 = r14.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r25 = r1
            r1 = 2131299582(0x7f090cfe, float:1.821717E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r26 = r2
            r2 = 2131299583(0x7f090cff, float:1.8217171E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r27 = r10
            java.lang.String r10 = r13.f64551f
            if (r10 == 0) goto L_0x00b9
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            r28 = r12
            r10 = 0
            goto L_0x00bc
        L_0x00b9:
            r28 = r12
            r10 = 1
        L_0x00bc:
            if (r10 != 0) goto L_0x00d7
            int r10 = r13.f64556n
            r12 = 1
            if (r10 != r12) goto L_0x00d8
            java.lang.String r10 = r13.f64551f
            r8.setText(r10)
            r10 = 0
            r2.setVisibility(r10)
            r2 = 8
            r1.setVisibility(r2)
            r7.setVisibility(r2)
            r29 = r4
            goto L_0x0112
        L_0x00d7:
            r12 = 1
        L_0x00d8:
            int r10 = r13.f64557o
            r29 = r4
            java.lang.String r4 = ""
            if (r10 != r12) goto L_0x00f0
            r10 = 0
            r7.setVisibility(r10)
            r8.setText(r4)
            r4 = 8
            r2.setVisibility(r4)
            r1.setVisibility(r4)
            goto L_0x0112
        L_0x00f0:
            int r10 = r13.f64556n
            if (r10 != r12) goto L_0x0104
            r8.setText(r4)
            r4 = 0
            r1.setVisibility(r4)
            r10 = 8
            r7.setVisibility(r10)
            r2.setVisibility(r10)
            goto L_0x0112
        L_0x0104:
            r10 = 8
            r8.setText(r4)
            r1.setVisibility(r10)
            r7.setVisibility(r10)
            r2.setVisibility(r10)
        L_0x0112:
            java.lang.String r1 = r13.f64549d
            if (r1 == 0) goto L_0x0151
            android.content.res.Resources r2 = r30.getResources()
            r4 = 2131165337(0x7f070099, float:1.7944888E38)
            int r2 = r2.getDimensionPixelSize(r4)
            java.lang.String r4 = r0.f52083d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "cell icon top height and width "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            java.lang.String r4 = "iconIv"
            gy3.C87412m.m108593f(r15, r4)
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 28
            r24 = 0
            r16 = r15
            r17 = r1
            r21 = r2
            r22 = r2
            wz0.C102526o.m135343c(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0151:
            java.lang.String r1 = r13.f64550e
            r3.setText(r1)
            java.util.LinkedList<te3.rn> r1 = r5.f185620d
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            if (r11 != r1) goto L_0x01ad
            r1 = 2131299574(0x7f090cf6, float:1.8217153E38)
            android.view.View r1 = r14.findViewById(r1)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI"
            java.lang.String r18 = "updateHeader"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/CardHomePageTopCellGroup;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI"
            java.lang.String r17 = "updateHeader"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/CardHomePageTopCellGroup;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01ae
        L_0x01ad:
            r4 = 0
        L_0x01ae:
            com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$h r1 = new com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$h
            r1.<init>(r13, r0)
            r14.setOnClickListener(r1)
            r6.addView(r14)
            r1 = r25
            r2 = r26
            r10 = r27
            r11 = r28
            r4 = r29
            r7 = 1
            r8 = 0
            goto L_0x0055
        L_0x01c7:
            r25 = r1
            r26 = r2
            r29 = r4
            android.view.ViewGroup r1 = r0.f52087h
            if (r1 == 0) goto L_0x01dc
            r1.addView(r6, r9)
            r1 = r25
            r2 = r26
            r4 = r29
            goto L_0x002a
        L_0x01dc:
            gy3.C87412m.m108603p(r29)
            r1 = 0
            throw r1
        L_0x01e1:
            return
        L_0x01e2:
            r29 = r4
            r1 = 0
            gy3.C87412m.m108603p(r29)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p033v3.CardHomePageV3UI.mo23466L7(te3.sn):void");
    }

    /* renamed from: M7 */
    public final void mo23467M7() {
        if (this.f52091o.isEmpty()) {
            View view = this.f52089j;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f52088i;
                if (textView != null) {
                    textView.setVisibility(8);
                } else {
                    C87412m.m108603p("mHomePageRecentlyUsedCardTitleTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mHomePageEmptyView");
                throw null;
            }
        } else {
            View view3 = this.f52089j;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView2 = this.f52088i;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    C87412m.m108603p("mHomePageRecentlyUsedCardTitleTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mHomePageEmptyView");
                throw null;
            }
        }
    }

    /* renamed from: N7 */
    public final void mo23468N7(String str) {
        if (!(str == null || str.length() == 0)) {
            TextView textView = this.f52088i;
            if (textView != null) {
                textView.setText(str);
            } else {
                C87412m.m108603p("mHomePageRecentlyUsedCardTitleTv");
                throw null;
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6738n7;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bch);
        C87412m.m108593f(findViewById, "findViewById(R.id.chpuv3_rv)");
        this.f52084e = (WxRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.bcg);
        C87412m.m108593f(findViewById2, "findViewById(R.id.chpuv3_refresh_layout)");
        this.f52085f = (RefreshLoadMoreLayout) findViewById2;
        WxRecyclerView wxRecyclerView = this.f52084e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            WxRecyclerAdapter<C18639a> wxRecyclerAdapter = new WxRecyclerAdapter<>(new CardHomePageV3UI$initView$1(this), this.f52091o, false);
            this.f52090n = wxRecyclerAdapter;
            wxRecyclerAdapter.setHasStableIds(true);
            WxRecyclerView wxRecyclerView2 = this.f52084e;
            if (wxRecyclerView2 != null) {
                WxRecyclerAdapter<C18639a> wxRecyclerAdapter2 = this.f52090n;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerView2.setAdapter(wxRecyclerAdapter2);
                    C0132m mVar = new C0132m(getContext(), 1);
                    mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4705kj));
                    WxRecyclerView wxRecyclerView3 = this.f52084e;
                    if (wxRecyclerView3 != null) {
                        wxRecyclerView3.mo17085h0(mVar);
                        LayoutInflater layoutInflater = getLayoutInflater();
                        WxRecyclerView wxRecyclerView4 = this.f52084e;
                        if (wxRecyclerView4 != null) {
                            View inflate = layoutInflater.inflate(C0966R.C0971layout.f6736n5, wxRecyclerView4, false);
                            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup = (ViewGroup) inflate;
                            this.f52086g = viewGroup;
                            View findViewById3 = viewGroup.findViewById(C0966R.C0970id.bbn);
                            C87412m.m108593f(findViewById3, "mHeaderView.findViewById…_header_container_layout)");
                            this.f52087h = (ViewGroup) findViewById3;
                            ViewGroup viewGroup2 = this.f52086g;
                            if (viewGroup2 != null) {
                                View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.bbq);
                                C87412m.m108593f(findViewById4, "mHeaderView.findViewById…hphv3_home_page_title_tv)");
                                this.f52088i = (TextView) findViewById4;
                                ViewGroup viewGroup3 = this.f52086g;
                                if (viewGroup3 != null) {
                                    View findViewById5 = viewGroup3.findViewById(C0966R.C0970id.bbp);
                                    C87412m.m108593f(findViewById5, "mHeaderView.findViewById…3_home_page_empty_layout)");
                                    this.f52089j = findViewById5;
                                    WxRecyclerAdapter<C18639a> wxRecyclerAdapter3 = this.f52090n;
                                    if (wxRecyclerAdapter3 != null) {
                                        ViewGroup viewGroup4 = this.f52086g;
                                        if (viewGroup4 != null) {
                                            wxRecyclerAdapter3.mo85794V5(viewGroup4, 2, false);
                                            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52085f;
                                            if (refreshLoadMoreLayout != null) {
                                                refreshLoadMoreLayout.setEnableRefresh(false);
                                                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52085f;
                                                if (refreshLoadMoreLayout2 != null) {
                                                    refreshLoadMoreLayout2.setLimitTopRequest(C76577a.m92151b(getContext(), 1200) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f52085f;
                                                    if (refreshLoadMoreLayout3 != null) {
                                                        refreshLoadMoreLayout3.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - C76577a.m92151b(getContext(), 1200));
                                                        RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f52085f;
                                                        if (refreshLoadMoreLayout4 != null) {
                                                            refreshLoadMoreLayout4.setDamping(1.85f);
                                                            RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f52085f;
                                                            if (refreshLoadMoreLayout5 != null) {
                                                                refreshLoadMoreLayout5.setActionCallback(new C18646e(this));
                                                            } else {
                                                                C87412m.m108603p("mRefreshLayout");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("mRefreshLayout");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("mRefreshLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("mRefreshLayout");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("mRefreshLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("mHeaderView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mPageAdapter");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mHeaderView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mHeaderView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mPageRv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mPageRv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mPageAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mPageRv");
                throw null;
            }
        } else {
            C87412m.m108603p("mPageRv");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r3 != 5) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L_0x001c
            r1 = 2
            if (r3 == r1) goto L_0x0018
            r1 = 3
            if (r3 == r1) goto L_0x0014
            r1 = 4
            if (r3 == r1) goto L_0x0010
            r1 = 5
            if (r3 == r1) goto L_0x0014
            goto L_0x001f
        L_0x0010:
            r2.mo23463I7(r0)
            goto L_0x001f
        L_0x0014:
            r2.mo23463I7(r0)
            goto L_0x001f
        L_0x0018:
            r2.mo23463I7(r0)
            goto L_0x001f
        L_0x001c:
            r2.mo23463I7(r0)
        L_0x001f:
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p033v3.CardHomePageV3UI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setMMTitle((int) C0966R.string.aym);
        setActionbarColor(getResources().getColor(C0966R.color.f2927a));
        hideActionbarLine();
        setBackBtn(new C18648f(this));
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load home page v3 snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_V3_STRING_SYNC, "");
        C64222a42 a422 = null;
        if (!(str == null || str.length() == 0)) {
            C64222a42 a423 = new C64222a42();
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            try {
                a423.parseFrom(bytes);
                a422 = a423;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        if (a422 != null) {
            this.f52092p = a422.f182021g;
            mo23468N7(a422.f182025n);
            mo23466L7(a422.f182020f);
            mo23464J7(a422.f182023i);
            mo23465K7(a422.f182024j);
        }
        mo23463I7(true);
        ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.CARD_PACKAGE);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f52095s) {
            Log.m105924i(this.f52083d, "no data to save snapshot");
            return;
        }
        C64222a42 a422 = new C64222a42();
        C49966ja jaVar = new C49966ja();
        a422.BaseResponse = jaVar;
        jaVar.f135956e = new C51163rv3();
        a422.f182020f = this.f52097u;
        TextView textView = this.f52088i;
        if (textView != null) {
            a422.f182025n = textView.getText().toString();
            a422.f182023i = new C64632pn();
            a422.f182021g = this.f52092p;
            a422.f182024j = this.f52098v;
            Iterator<C18639a> it = this.f52091o.iterator();
            while (it.hasNext()) {
                a422.f182023i.f184864d.add(it.next().mo23469a());
            }
            Log.m105918d("MicroMsg.CardSnapshotMgr", "save home page v3 snapshot");
            C61926c.m72656A((String) null, new C10443e(a422));
            return;
        }
        C87412m.m108603p("mHomePageRecentlyUsedCardTitleTv");
        throw null;
    }

    public void onResume() {
        super.onResume();
        if (this.f52096t) {
            mo23463I7(true);
            this.f52096t = false;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C2167c.class);
    }
}
