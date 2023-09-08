package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardNewBaseUI;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kz0.C10445g;
import kz0.C117432h;
import lz0.C46916b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C118431fo;
import te3.C118435go;
import te3.C22502jn;
import te3.C22517nn;
import te3.C22530u32;
import te3.C49871in;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51997xn;
import tz0.C22570g;
import tz0.C22571h;
import tz0.C22574i;
import uo3.C78253a;
import wz0.C102526o;
import wz0.C22945n;
import wz0.C53246b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/VipCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "b", "c", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI */
public final class VipCardListUI extends CardNewBaseUI {

    /* renamed from: R */
    public static final /* synthetic */ int f52184R = 0;

    /* renamed from: A */
    public boolean f52185A;

    /* renamed from: B */
    public C51997xn f52186B;

    /* renamed from: C */
    public String f52187C;

    /* renamed from: D */
    public C118435go f52188D;

    /* renamed from: E */
    public C51997xn f52189E;

    /* renamed from: F */
    public String f52190F;

    /* renamed from: G */
    public String f52191G;

    /* renamed from: H */
    public List<? extends C22517nn> f52192H;

    /* renamed from: I */
    public String f52193I = "";

    /* renamed from: J */
    public int f52194J;

    /* renamed from: K */
    public int f52195K;

    /* renamed from: L */
    public boolean f52196L;

    /* renamed from: M */
    public int f52197M;

    /* renamed from: N */
    public int f52198N;

    /* renamed from: P */
    public boolean f52199P = true;

    /* renamed from: Q */
    public C89779i0 f52200Q;

    /* renamed from: i */
    public final String f52201i = "MicroMsg.VipCardListUI";

    /* renamed from: j */
    public WxRecyclerView f52202j;

    /* renamed from: n */
    public RefreshLoadMoreLayout f52203n;

    /* renamed from: o */
    public ViewGroup f52204o;

    /* renamed from: p */
    public ViewGroup f52205p;

    /* renamed from: q */
    public ViewGroup f52206q;

    /* renamed from: r */
    public TextView f52207r;

    /* renamed from: s */
    public ViewGroup f52208s;

    /* renamed from: t */
    public TextView f52209t;

    /* renamed from: u */
    public WxRecyclerAdapter<C18668a> f52210u;

    /* renamed from: v */
    public final ArrayList<C18668a> f52211v = new ArrayList<>();

    /* renamed from: w */
    public int f52212w;

    /* renamed from: x */
    public int f52213x = 10;

    /* renamed from: y */
    public boolean f52214y;

    /* renamed from: z */
    public boolean f52215z;

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$c */
    public static final class C2169c extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$c$a */
        public static final class C2170a extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2170a f12145d = new C2170a();

            public C2170a() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, LocaleUtil.ITALIAN);
                ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.bcp);
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bct)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bcl)).getText());
                C87412m.m108593f(viewGroup, "labelLayout");
                MapExpandKt.visitChild(viewGroup, new C2173k(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2169c(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.f6739n8).view(C0966R.C0970id.bcr).desc((int) C0966R.C0970id.bcs);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6740n9);
            root.view(C0966R.C0970id.bck).desc((C32226l<? super View, String>) C2170a.f12145d).type(viewType);
            root.disable(C0966R.C0970id.bc7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$a */
    public static final class C18668a implements C9493c {

        /* renamed from: d */
        public C22502jn f52216d;

        /* renamed from: a */
        public final C22502jn mo23499a() {
            C22502jn jnVar = this.f52216d;
            if (jnVar != null) {
                return jnVar;
            }
            C87412m.m108603p("vipCardInfo");
            throw null;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) mo23499a().f64049d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$b */
    public final class C18669b extends C60896i<C18668a> {

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$b$a */
        public static final class C18670a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60905o f52218d;

            /* renamed from: e */
            public final /* synthetic */ VipCardListUI f52219e;

            public C18670a(C60905o oVar, VipCardListUI vipCardListUI) {
                this.f52218d = oVar;
                this.f52219e = vipCardListUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C18668a aVar = (C18668a) this.f52218d.f173503E;
                C22502jn a = aVar.mo23499a();
                VipCardListUI vipCardListUI = this.f52219e;
                int i = a.f64064v;
                if (i == 1) {
                    C53246b.m59678j((MMActivity) vipCardListUI.getContext(), a.f64065w, 0);
                } else if (i == 2) {
                    C51997xn xnVar = a.f64066x;
                    C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                } else if (i == 3) {
                    String str = aVar.mo23499a().f64049d;
                    C87412m.m108593f(str, "vipCardConvertData.vipCardInfo.user_card_id");
                    VipCardListUI.m19441L7(vipCardListUI, str);
                } else {
                    String str2 = aVar.mo23499a().f64049d;
                    C87412m.m108593f(str2, "vipCardConvertData.vipCardInfo.user_card_id");
                    VipCardListUI.m19441L7(vipCardListUI, str2);
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = 1;
                objArr[1] = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
                objArr[2] = aVar.mo23499a().f64049d;
                VipCardListUI vipCardListUI2 = this.f52219e;
                String str3 = aVar.mo23499a().f64049d;
                C87412m.m108593f(str3, "vipCardConvertData.vipCardInfo.user_card_id");
                Iterator<C18668a> it = vipCardListUI2.f52211v.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    C18668a next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C64197v.m75542k();
                        throw null;
                    } else if (C87412m.m108589b(next.mo23499a().f64049d, str3)) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
                objArr[3] = Integer.valueOf(i2);
                objArr[4] = 0;
                nVar.mo160131h(19748, objArr);
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$b$b */
        public static final class C18671b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60905o f52220d;

            /* renamed from: e */
            public final /* synthetic */ VipCardListUI f52221e;

            /* renamed from: f */
            public final /* synthetic */ C18669b f52222f;

            /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$b$b$a */
            public static final class C18672a implements View.OnCreateContextMenuListener {

                /* renamed from: d */
                public final /* synthetic */ VipCardListUI f52223d;

                public C18672a(VipCardListUI vipCardListUI) {
                    this.f52223d = vipCardListUI;
                }

                public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    contextMenu.add(0, 1, 0, this.f52223d.getString(C0966R.string.f7944x1));
                }
            }

            /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$b$b$b */
            public static final class C18673b implements C11184p0 {

                /* renamed from: d */
                public final /* synthetic */ C18669b f52224d;

                /* renamed from: e */
                public final /* synthetic */ C18668a f52225e;

                public C18673b(C18669b bVar, C18668a aVar) {
                    this.f52224d = bVar;
                    this.f52225e = aVar;
                }

                public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    C18669b bVar = this.f52224d;
                    String str = this.f52225e.mo23499a().f64049d;
                    C87412m.m108593f(str, "vipCardConvertData.vipCardInfo.user_card_id");
                    C77407n nVar = new C77407n((Context) VipCardListUI.this.getContext(), 1, true);
                    TextView textView = new TextView(VipCardListUI.this.getContext());
                    textView.setText(VipCardListUI.this.getString(C0966R.string.ayc));
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(VipCardListUI.this.getResources().getColor(C0966R.color.f3552xi));
                    textView.setGravity(17);
                    int dimensionPixelSize = VipCardListUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                    int dimensionPixelSize2 = VipCardListUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                    textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    nVar.mo107569n(textView, false);
                    VipCardListUI vipCardListUI = VipCardListUI.this;
                    nVar.f225771i = new C2172i(vipCardListUI);
                    nVar.f225782p = new C18689j(vipCardListUI, str);
                    nVar.mo107573q();
                }
            }

            public C18671b(C60905o oVar, VipCardListUI vipCardListUI, C18669b bVar) {
                this.f52220d = oVar;
                this.f52221e = vipCardListUI;
                this.f52222f = bVar;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C78253a aVar = new C78253a(this.f52221e.getContext(), view);
                aVar.f229249r = new C18672a(this.f52221e);
                aVar.f229251t = new C18673b(this.f52222f, (C18668a) this.f52220d.f173503E);
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                Point a = C102526o.m135341a(view);
                aVar.mo71743n(a.x, a.y);
                C115669n.INSTANCE.mo160131h(19747, 1, 3);
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C18669b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f6740n9;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C18668a aVar = (C18668a) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(aVar, "item");
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.bct);
            textView.setText(aVar.mo23499a().f64050e);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            oVar.mo85815G(C0966R.C0970id.bcl, aVar.mo23499a().f64051f);
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.bcn);
            if (aVar.mo23499a().f64063u != null) {
                int dimensionPixelSize = VipCardListUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6);
                C87412m.m108593f(imageView, "iconIv");
                String str = aVar.mo23499a().f64063u;
                C87412m.m108593f(str, "item.vipCardInfo.card_icon_url");
                C102526o.m135343c(imageView, str, 0.0f, false, C0966R.raw.card_default_merchant_icon, dimensionPixelSize, dimensionPixelSize, 12, (Object) null);
            }
            LinearLayout linearLayout = (LinearLayout) oVar.mo85812D(C0966R.C0970id.bcp);
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            if (!aVar.mo23499a().f64055j.isEmpty()) {
                LinkedList<C49871in> linkedList = aVar.mo23499a().f64055j;
                C87412m.m108593f(linkedList, "item.vipCardInfo.coupon_label");
                for (C49871in next : linkedList) {
                    CardTagTextView cardTagTextView = new CardTagTextView(VipCardListUI.this.getContext());
                    AppCompatActivity context = VipCardListUI.this.getContext();
                    cardTagTextView.setMinHeight(C76577a.m92151b(context, 18));
                    cardTagTextView.setMinWidth(C76577a.m92151b(context, 56));
                    int b = C76577a.m92151b(context, 8);
                    int b2 = C76577a.m92151b(context, 4);
                    cardTagTextView.setPadding(b, b2, b, b2);
                    cardTagTextView.setText(next.f135509d);
                    cardTagTextView.setTextSize(1, 10.0f);
                    if (!Util.isNullOrNil(next.f135510e)) {
                        cardTagTextView.setTextColor(Color.parseColor(next.f135510e));
                    } else {
                        cardTagTextView.setTextColor(-1);
                    }
                    if (!Util.isNullOrNil(next.f135511f)) {
                        cardTagTextView.setFillColor(C22945n.m27002b(next.f135511f, next.f135514i));
                    } else {
                        cardTagTextView.setFillColor(C22945n.m27001a(-16777216, 26));
                    }
                    linearLayout.addView(cardTagTextView);
                }
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            View D = oVar.mo85812D(C0966R.C0970id.bcj);
            C87412m.m108593f(D, "holder.getView(R.id.chpvv3_card_bg_iv)");
            MemberCardTopCropImageView memberCardTopCropImageView = (MemberCardTopCropImageView) D;
            Object tag = memberCardTopCropImageView.getTag();
            String str2 = aVar.mo23499a().f64049d;
            if (str2 == null) {
                str2 = "";
            }
            if (!(tag instanceof String) || TextUtils.isEmpty((CharSequence) tag) || !tag.equals(str2)) {
                memberCardTopCropImageView.setTag(str2);
                C18688h hVar = new C18688h(VipCardListUI.this, memberCardTopCropImageView, aVar);
                VipCardListUI vipCardListUI = VipCardListUI.this;
                if (vipCardListUI.f52197M <= 0 || vipCardListUI.f52198N <= 0) {
                    vipCardListUI.f52197M = oVar.f44854d.getHeight();
                    VipCardListUI.this.f52198N = oVar.f44854d.getWidth();
                    VipCardListUI vipCardListUI2 = VipCardListUI.this;
                    if (vipCardListUI2.f52197M <= 0 || vipCardListUI2.f52198N <= 0) {
                        oVar.f44854d.post(new C18687g(vipCardListUI2, oVar, hVar));
                        return;
                    }
                }
                hVar.invoke();
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
            ((RoundCornerImageView) oVar.mo85812D(C0966R.C0970id.bcn)).mo104340q(C76577a.m92151b(VipCardListUI.this.getContext(), 1), VipCardListUI.this.getResources().getColor(C0966R.color.f2975b6));
            oVar.f44854d.setOnClickListener(new C18670a(oVar, VipCardListUI.this));
            oVar.f44854d.setOnLongClickListener(new C18671b(oVar, VipCardListUI.this, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$d */
    public static final class C18674d extends C87413o implements C32226l<C89132b.C89134c<C22530u32>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f52226d;

        /* renamed from: e */
        public final /* synthetic */ boolean f52227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18674d(VipCardListUI vipCardListUI, boolean z) {
            super(1);
            this.f52226d = vipCardListUI;
            this.f52227e = z;
        }

        public Object invoke(Object obj) {
            T t;
            boolean z;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                VipCardListUI vipCardListUI = this.f52226d;
                boolean z2 = this.f52227e;
                Log.m105924i(vipCardListUI.f52201i, "errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C22530u32 u322 = (C22530u32) cVar.f256796d;
                    if (u322 != null) {
                        Log.m105924i(vipCardListUI.f52201i, "retcode: " + u322.f64622d + ", retmsg: " + u322.f64623e);
                        if (u322.f64622d == 0) {
                            vipCardListUI.f52212w = u322.f64624f;
                            vipCardListUI.f52214y = u322.f64625g >= 1;
                            vipCardListUI.f52215z = true;
                            C118435go goVar = u322.f64627i;
                            vipCardListUI.f52188D = goVar;
                            if (goVar != null) {
                                if (u322.f64628j == 1) {
                                    LinkedList<C118431fo> linkedList = goVar.f354035d;
                                    C87412m.m108593f(linkedList, "card_sort_info");
                                    Iterator<T> it = linkedList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            t = null;
                                            break;
                                        }
                                        t = it.next();
                                        if (((C118431fo) t).f354004d == u322.f64629n) {
                                            z = true;
                                            continue;
                                        } else {
                                            z = false;
                                            continue;
                                        }
                                        if (z) {
                                            break;
                                        }
                                    }
                                    C118431fo foVar = (C118431fo) t;
                                    if (foVar != null) {
                                        vipCardListUI.f52194J = foVar.f354004d;
                                        String str = foVar.f354006f;
                                        C87412m.m108593f(str, "find.sort_wording");
                                        vipCardListUI.f52193I = str;
                                        vipCardListUI.f52213x = foVar.f354005e;
                                    }
                                } else if (vipCardListUI.f52194J == 0) {
                                    C118431fo first = goVar.f354035d.getFirst();
                                    vipCardListUI.f52194J = first.f354004d;
                                    String str2 = first.f354006f;
                                    C87412m.m108593f(str2, "first.sort_wording");
                                    vipCardListUI.f52193I = str2;
                                    vipCardListUI.f52213x = first.f354005e;
                                }
                            }
                            vipCardListUI.f52186B = u322.f64630o;
                            vipCardListUI.f52192H = u322.f64635t;
                            vipCardListUI.f52187C = u322.f64631p;
                            vipCardListUI.f52189E = u322.f64632q;
                            vipCardListUI.f52190F = u322.f64634s;
                            vipCardListUI.f52191G = u322.f64633r;
                            vipCardListUI.mo23496P7();
                            if (z2) {
                                vipCardListUI.f52211v.clear();
                            }
                            vipCardListUI.mo23498R7(u322);
                        } else {
                            C22945n.m27018r(vipCardListUI.getContext(), u322.f64623e);
                            vipCardListUI.f52194J = vipCardListUI.f52195K;
                        }
                    }
                    if (vipCardListUI.f52199P) {
                        vipCardListUI.f52199P = false;
                    }
                } else {
                    C22945n.m27017q(vipCardListUI.getContext(), "");
                    vipCardListUI.f52194J = vipCardListUI.f52195K;
                }
                vipCardListUI.mo23497Q7();
            }
            VipCardListUI vipCardListUI2 = this.f52226d;
            vipCardListUI2.f52196L = false;
            RefreshLoadMoreLayout refreshLoadMoreLayout = vipCardListUI2.f52203n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("mRefreshLayout");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$e */
    public static final class C18675e extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ VipCardListUI f52228a;

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$e$a */
        public static final class C18676a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ VipCardListUI f52229d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18676a(VipCardListUI vipCardListUI) {
                super(0);
                this.f52229d = vipCardListUI;
            }

            public Object invoke() {
                VipCardListUI vipCardListUI = this.f52229d;
                int i = VipCardListUI.f52184R;
                vipCardListUI.mo23494N7(false);
                return C13598b0.f38549a;
            }
        }

        public C18675e(VipCardListUI vipCardListUI) {
            this.f52228a = vipCardListUI;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            Log.m105918d(this.f52228a.f52201i, "on load more");
            C61926c.m72668M(new C18676a(this.f52228a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            VipCardListUI vipCardListUI = this.f52228a;
            String str = vipCardListUI.f52201i;
            vipCardListUI.getClass();
            Log.m105918d(str, "on load more end: 0");
            VipCardListUI vipCardListUI2 = this.f52228a;
            if (vipCardListUI2.f52214y) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = vipCardListUI2.f52203n;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.mo82437B((RefreshLoadMoreLayout.C7080c<Object>) null);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$f */
    public static final class C18677f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f52230d;

        public C18677f(VipCardListUI vipCardListUI) {
            this.f52230d = vipCardListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52230d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$g */
    public static final class C18678g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f52231d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f52232e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f52233f;

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$g$a */
        public static final class C18679a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f52234d;

            /* renamed from: e */
            public final /* synthetic */ VipCardListUI f52235e;

            /* renamed from: f */
            public final /* synthetic */ C8477a0 f52236f;

            public C18679a(C8477a0 a0Var, VipCardListUI vipCardListUI, C8477a0 a0Var2) {
                this.f52234d = a0Var;
                this.f52235e = vipCardListUI;
                this.f52236f = a0Var2;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (this.f52234d.f27482d) {
                    e0Var.add(0, 1, 0, (CharSequence) this.f52235e.f52191G);
                }
                if (this.f52236f.f27482d) {
                    e0Var.add(0, 2, 1, (CharSequence) this.f52235e.f52187C);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$g$b */
        public static final class C18680b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ VipCardListUI f52237d;

            public C18680b(VipCardListUI vipCardListUI) {
                this.f52237d = vipCardListUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 1) {
                    VipCardListUI vipCardListUI = this.f52237d;
                    vipCardListUI.f52185A = true;
                    C51997xn xnVar = vipCardListUI.f52189E;
                    C87412m.m108591d(xnVar);
                    String str = xnVar.f144755d;
                    C51997xn xnVar2 = this.f52237d.f52189E;
                    C87412m.m108591d(xnVar2);
                    String str2 = xnVar2.f144756e;
                    C51997xn xnVar3 = this.f52237d.f52189E;
                    C87412m.m108591d(xnVar3);
                    C53246b.m59674f(str, str2, xnVar3.f144757f);
                    C115669n.INSTANCE.mo160131h(19747, 1, 7);
                } else if (menuItem.getItemId() == 2) {
                    C51997xn xnVar4 = this.f52237d.f52186B;
                    C87412m.m108591d(xnVar4);
                    String str3 = xnVar4.f144755d;
                    C51997xn xnVar5 = this.f52237d.f52186B;
                    C87412m.m108591d(xnVar5);
                    String str4 = xnVar5.f144756e;
                    C51997xn xnVar6 = this.f52237d.f52186B;
                    C87412m.m108591d(xnVar6);
                    C53246b.m59674f(str3, str4, xnVar6.f144757f);
                    C115669n.INSTANCE.mo160131h(19747, 1, 2);
                }
            }
        }

        public C18678g(VipCardListUI vipCardListUI, C8477a0 a0Var, C8477a0 a0Var2) {
            this.f52231d = vipCardListUI;
            this.f52232e = a0Var;
            this.f52233f = a0Var2;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) this.f52231d.getContext(), 1, false);
            C8477a0 a0Var = this.f52232e;
            VipCardListUI vipCardListUI = this.f52231d;
            nVar.f225771i = new C18679a(a0Var, vipCardListUI, this.f52233f);
            nVar.f225782p = new C18680b(vipCardListUI);
            nVar.mo107573q();
            C115669n.INSTANCE.mo160131h(19747, 1, 1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$h */
    public static final class C18681h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f52238d;

        public C18681h(VipCardListUI vipCardListUI) {
            this.f52238d = vipCardListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d(this.f52238d.f52201i, "click header view");
            VipCardListUI vipCardListUI = this.f52238d;
            Log.m105924i(vipCardListUI.f52201i, "show sort dialog");
            if (vipCardListUI.f52188D != null) {
                C77407n nVar = new C77407n((Context) vipCardListUI.getContext(), 1, false);
                nVar.f225771i = new C22570g(vipCardListUI);
                nVar.f225782p = new C22571h(vipCardListUI);
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$i */
    public static final class C18682i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f52239d;

        public C18682i(VipCardListUI vipCardListUI) {
            this.f52239d = vipCardListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VipCardListUI vipCardListUI = this.f52239d;
            vipCardListUI.f52185A = true;
            C51997xn xnVar = vipCardListUI.f52189E;
            C87412m.m108591d(xnVar);
            String str = xnVar.f144755d;
            C51997xn xnVar2 = this.f52239d.f52189E;
            C87412m.m108591d(xnVar2);
            String str2 = xnVar2.f144756e;
            C51997xn xnVar3 = this.f52239d.f52189E;
            C87412m.m108591d(xnVar3);
            C53246b.m59674f(str, str2, xnVar3.f144757f);
            C115669n.INSTANCE.mo160131h(19747, 1, 8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: L7 */
    public static final void m19441L7(VipCardListUI vipCardListUI, String str) {
        Log.m105924i(vipCardListUI.f52201i, "go to card detail ui");
        Intent intent = new Intent(vipCardListUI.getContext(), CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        AppCompatActivity context = vipCardListUI.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: M7 */
    public static final void m19442M7(VipCardListUI vipCardListUI, MenuItem menuItem) {
        vipCardListUI.f52195K = vipCardListUI.f52194J;
        vipCardListUI.f52194J = 1;
        vipCardListUI.f52193I = menuItem.getTitle().toString();
        vipCardListUI.mo23497Q7();
        vipCardListUI.mo23494N7(true);
        C115669n.INSTANCE.mo160131h(19747, 1, 5);
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
        if (this.f52199P && this.f52194J == 1) {
            mo23494N7(true);
        } else if (!z) {
            mo23460K7();
        }
    }

    /* renamed from: N7 */
    public final void mo23494N7(boolean z) {
        int i;
        String str = this.f52201i;
        Log.m105924i(str, "do load vip card list: " + this.f52196L + ", " + this.f52212w + ", " + this.f52194J);
        if (this.f52214y && !z) {
            Log.m105928w(this.f52201i, "already load complete");
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52203n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
            } else {
                C87412m.m108603p("mRefreshLayout");
                throw null;
            }
        } else if (this.f52196L) {
            Log.m105928w(this.f52201i, "is loading");
        } else {
            this.f52196L = true;
            int i2 = this.f52212w;
            if (z) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52203n;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setHasBottomMore(true);
                    i = 0;
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            } else {
                i = i2;
            }
            C46916b bVar = new C46916b(i, this.f52213x, (double) this.f52073d, (double) this.f52074e, this.f52194J);
            bVar.f256791h = true;
            C89059e i3 = bVar.mo9225i();
            C87412m.m108593f(i3, "CgiGetMemberCardHomePage…ntCancelAfterDead().run()");
            C61926c.m72665J(i3, new C18674d(this, z)).mo11397F(this);
        }
    }

    /* renamed from: O7 */
    public final void mo23495O7(Boolean bool) {
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(getContext(), getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = this.f52200Q;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            this.f52200Q = i0Var;
        }
    }

    /* renamed from: P7 */
    public final void mo23496P7() {
        List<? extends C22517nn> list = this.f52192H;
        if (!(list == null || list.isEmpty())) {
            List<? extends C22517nn> list2 = this.f52192H;
            if (list2 != null) {
                removeAllOptionMenu();
                addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C22574i(this, list2, list2));
                return;
            }
            return;
        }
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        if (this.f52189E != null) {
            String str = this.f52191G;
            if (!(str == null || str.length() == 0)) {
                a0Var.f27482d = true;
            }
        }
        if (this.f52186B != null) {
            a0Var2.f27482d = true;
        }
        if (a0Var.f27482d || a0Var2.f27482d) {
            removeAllOptionMenu();
            addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C18678g(this, a0Var, a0Var2));
        }
    }

    /* renamed from: Q7 */
    public final void mo23497Q7() {
        boolean z;
        boolean z2 = true;
        if (this.f52194J <= 0 || !(!this.f52211v.isEmpty()) || this.f52188D == null) {
            ViewGroup viewGroup = this.f52206q;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                z = false;
            } else {
                C87412m.m108603p("mSortLayout");
                throw null;
            }
        } else {
            TextView textView = this.f52207r;
            if (textView != null) {
                textView.setText(this.f52193I);
                ViewGroup viewGroup2 = this.f52206q;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    ViewGroup viewGroup3 = this.f52206q;
                    if (viewGroup3 != null) {
                        viewGroup3.setOnClickListener(new C18681h(this));
                        z = true;
                    } else {
                        C87412m.m108603p("mSortLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mSortLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("mSortTv");
                throw null;
            }
        }
        String str = this.f52190F;
        if ((str == null || str.length() == 0) || this.f52189E == null) {
            ViewGroup viewGroup4 = this.f52208s;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
                z2 = z;
            } else {
                C87412m.m108603p("mTopPhoneVipCardLayout");
                throw null;
            }
        } else {
            ViewGroup viewGroup5 = this.f52208s;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
                TextView textView2 = this.f52209t;
                if (textView2 != null) {
                    textView2.setText(this.f52190F);
                    ViewGroup viewGroup6 = this.f52208s;
                    if (viewGroup6 != null) {
                        viewGroup6.setOnClickListener(new C18682i(this));
                    } else {
                        C87412m.m108603p("mTopPhoneVipCardLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mTopPhoneVipCardTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mTopPhoneVipCardLayout");
                throw null;
            }
        }
        if (z2) {
            WxRecyclerAdapter<C18668a> wxRecyclerAdapter = this.f52210u;
            if (wxRecyclerAdapter != null) {
                ViewGroup viewGroup7 = this.f52205p;
                if (viewGroup7 != null) {
                    wxRecyclerAdapter.mo85794V5(viewGroup7, 2, false);
                } else {
                    C87412m.m108603p("mHeaderView");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVipCardListAdapter");
                throw null;
            }
        } else {
            WxRecyclerAdapter<C18668a> wxRecyclerAdapter2 = this.f52210u;
            if (wxRecyclerAdapter2 != null) {
                ViewGroup viewGroup8 = this.f52205p;
                if (viewGroup8 != null) {
                    wxRecyclerAdapter2.mo85802j6((long) viewGroup8.hashCode(), false);
                } else {
                    C87412m.m108603p("mHeaderView");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVipCardListAdapter");
                throw null;
            }
        }
    }

    /* renamed from: R7 */
    public final void mo23498R7(C22530u32 u322) {
        this.f52188D = u322.f64627i;
        Iterator<C22502jn> it = u322.f64626h.iterator();
        while (it.hasNext()) {
            C22502jn next = it.next();
            C18668a aVar = new C18668a();
            C87412m.m108593f(next, "cardInfo");
            aVar.f52216d = next;
            this.f52211v.add(aVar);
        }
        if (this.f52211v.isEmpty()) {
            ViewGroup viewGroup = this.f52204o;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            } else {
                C87412m.m108603p("mEmptyView");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.f52204o;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            } else {
                C87412m.m108603p("mEmptyView");
                throw null;
            }
        }
        WxRecyclerAdapter<C18668a> wxRecyclerAdapter = this.f52210u;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        } else {
            C87412m.m108603p("mVipCardListAdapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6741n_;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bcq);
        C87412m.m108593f(findViewById, "findViewById(R.id.chpvv3_rv)");
        this.f52202j = (WxRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.bco);
        C87412m.m108593f(findViewById2, "findViewById(R.id.chpvv3_refresh_layout)");
        this.f52203n = (RefreshLoadMoreLayout) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.bcm);
        C87412m.m108593f(findViewById3, "findViewById(R.id.chpvv3_empty_layout)");
        this.f52204o = (ViewGroup) findViewById3;
        WxRecyclerView wxRecyclerView = this.f52202j;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            WxRecyclerAdapter<C18668a> wxRecyclerAdapter = new WxRecyclerAdapter<>(new VipCardListUI$initView$1(this), this.f52211v, false);
            this.f52210u = wxRecyclerAdapter;
            wxRecyclerAdapter.setHasStableIds(true);
            WxRecyclerView wxRecyclerView2 = this.f52202j;
            if (wxRecyclerView2 != null) {
                WxRecyclerAdapter<C18668a> wxRecyclerAdapter2 = this.f52210u;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerView2.setAdapter(wxRecyclerAdapter2);
                    C0132m mVar = new C0132m(getContext(), 1);
                    mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4705kj));
                    WxRecyclerView wxRecyclerView3 = this.f52202j;
                    if (wxRecyclerView3 != null) {
                        wxRecyclerView3.mo17085h0(mVar);
                        LayoutInflater layoutInflater = getLayoutInflater();
                        WxRecyclerView wxRecyclerView4 = this.f52202j;
                        if (wxRecyclerView4 != null) {
                            View inflate = layoutInflater.inflate(C0966R.C0971layout.f6739n8, wxRecyclerView4, false);
                            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup = (ViewGroup) inflate;
                            this.f52205p = viewGroup;
                            View findViewById4 = viewGroup.findViewById(C0966R.C0970id.bcs);
                            C87412m.m108593f(findViewById4, "mHeaderView.findViewById(R.id.chpvv3_sort_tv)");
                            this.f52207r = (TextView) findViewById4;
                            ViewGroup viewGroup2 = this.f52205p;
                            if (viewGroup2 != null) {
                                View findViewById5 = viewGroup2.findViewById(C0966R.C0970id.bcr);
                                C87412m.m108593f(findViewById5, "mHeaderView.findViewById(R.id.chpvv3_sort_layout)");
                                this.f52206q = (ViewGroup) findViewById5;
                                ViewGroup viewGroup3 = this.f52205p;
                                if (viewGroup3 != null) {
                                    View findViewById6 = viewGroup3.findViewById(C0966R.C0970id.bcu);
                                    C87412m.m108593f(findViewById6, "mHeaderView.findViewById…top_phone_vipcard_layout)");
                                    this.f52208s = (ViewGroup) findViewById6;
                                    ViewGroup viewGroup4 = this.f52205p;
                                    if (viewGroup4 != null) {
                                        View findViewById7 = viewGroup4.findViewById(C0966R.C0970id.bcv);
                                        C87412m.m108593f(findViewById7, "mHeaderView.findViewById…vv3_top_phone_vipcard_tv)");
                                        this.f52209t = (TextView) findViewById7;
                                        WxRecyclerAdapter<C18668a> wxRecyclerAdapter3 = this.f52210u;
                                        if (wxRecyclerAdapter3 != null) {
                                            ViewGroup viewGroup5 = this.f52205p;
                                            if (viewGroup5 != null) {
                                                wxRecyclerAdapter3.mo85794V5(viewGroup5, 2, false);
                                                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52203n;
                                                if (refreshLoadMoreLayout != null) {
                                                    refreshLoadMoreLayout.setEnableRefresh(false);
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52203n;
                                                    if (refreshLoadMoreLayout2 != null) {
                                                        refreshLoadMoreLayout2.setActionCallback(new C18675e(this));
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
                                            C87412m.m108603p("mVipCardListAdapter");
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
                                C87412m.m108603p("mHeaderView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mVipCardListRv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mVipCardListRv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mVipCardListAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVipCardListRv");
                throw null;
            }
        } else {
            C87412m.m108603p("mVipCardListRv");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r10.initView()
            r11 = 2131823137(0x7f110a21, float:1.9279065E38)
            r10.setMMTitle((int) r11)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 2131099648(0x7f060000, float:1.7811655E38)
            int r11 = r11.getColor(r0)
            r10.setActionbarColor(r11)
            r10.hideActionbarLine()
            com.tencent.mm.plugin.card.ui.v3.VipCardListUI$f r11 = new com.tencent.mm.plugin.card.ui.v3.VipCardListUI$f
            r11.<init>(r10)
            r10.setBackBtn(r11)
            java.lang.String r11 = "MicroMsg.CardSnapshotMgr"
            java.lang.String r0 = "load vip card list snapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_VIPCARD_LIST_STRING_SYNC
            java.lang.String r3 = ""
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x004a
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r5 = 0
            goto L_0x004b
        L_0x004a:
            r5 = 1
        L_0x004b:
            java.lang.String r6 = "safeParser"
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            r8 = 0
            if (r5 == 0) goto L_0x0055
            goto L_0x006f
        L_0x0055:
            te3.u32 r5 = new te3.u32
            r5.<init>()
            java.nio.charset.Charset r9 = z04.C119027c.f356489b
            byte[] r1 = r1.getBytes(r9)
            gy3.C87412m.m108593f(r1, r7)
            r5.parseFrom(r1)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0070
        L_0x0067:
            r1 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r3, r5)
        L_0x006f:
            r5 = r8
        L_0x0070:
            if (r5 == 0) goto L_0x0098
            int r1 = r5.f64624f
            r10.f52212w = r1
            te3.go r1 = r5.f64627i
            r10.f52188D = r1
            te3.xn r1 = r5.f64630o
            r10.f52186B = r1
            java.util.LinkedList<te3.nn> r1 = r5.f64635t
            r10.f52192H = r1
            java.lang.String r1 = r5.f64631p
            r10.f52187C = r1
            te3.xn r1 = r5.f64632q
            r10.f52189E = r1
            java.lang.String r1 = r5.f64634s
            r10.f52190F = r1
            java.lang.String r1 = r5.f64633r
            r10.f52191G = r1
            r10.mo23496P7()
            r10.mo23498R7(r5)
        L_0x0098:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_VIPCARD_SORTINFO_STRING_SYNC
            java.lang.Object r11 = r11.mo119685f(r0, r3)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00b6
            int r0 = r11.length()
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = 0
            goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            if (r0 == 0) goto L_0x00ba
            goto L_0x00d5
        L_0x00ba:
            te3.fo r0 = new te3.fo
            r0.<init>()
            java.nio.charset.Charset r1 = z04.C119027c.f356489b
            byte[] r11 = r11.getBytes(r1)
            gy3.C87412m.m108593f(r11, r7)
            r0.parseFrom(r11)     // Catch:{ Exception -> 0x00cd }
            r8 = r0
            goto L_0x00d5
        L_0x00cd:
            r11 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r2] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r3, r0)
        L_0x00d5:
            if (r8 == 0) goto L_0x00ec
            int r11 = r8.f354004d
            r10.f52194J = r11
            java.lang.String r11 = r8.f354006f
            java.lang.String r0 = "cardSortInfo.sort_wording"
            gy3.C87412m.m108593f(r11, r0)
            r10.f52193I = r11
            int r11 = r8.f354005e
            r10.f52213x = r11
            int r11 = r10.f52194J
            r10.f52195K = r11
        L_0x00ec:
            r10.mo23497Q7()
            int r11 = r10.f52194J
            if (r11 == r4) goto L_0x00f6
            r10.mo23494N7(r4)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f52215z) {
            Log.m105924i(this.f52201i, "no data to save snapshot");
            return;
        }
        C22530u32 u322 = new C22530u32();
        C49966ja jaVar = new C49966ja();
        u322.BaseResponse = jaVar;
        jaVar.f135956e = new C51163rv3();
        Iterator<C18668a> it = this.f52211v.iterator();
        while (it.hasNext()) {
            C18668a next = it.next();
            next.mo23499a();
            u322.f64626h.add(next.mo23499a());
        }
        u322.f64627i = this.f52188D;
        u322.f64624f = this.f52212w;
        u322.f64631p = this.f52187C;
        u322.f64630o = this.f52186B;
        u322.f64635t = (LinkedList) this.f52192H;
        u322.f64632q = this.f52189E;
        u322.f64633r = this.f52191G;
        u322.f64634s = this.f52190F;
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save vip card list snapshot");
        C61926c.m72656A((String) null, new C10445g(u322));
        C118431fo foVar = new C118431fo();
        foVar.f354004d = this.f52194J;
        foVar.f354006f = this.f52193I;
        foVar.f354005e = this.f52213x;
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save vip card list snapshot");
        C61926c.m72656A((String) null, new C117432h(foVar));
    }

    public void onResume() {
        if (this.f52185A) {
            mo23494N7(true);
            this.f52185A = false;
        }
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C2169c.class);
    }
}
