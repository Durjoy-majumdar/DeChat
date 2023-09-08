package com.tencent.p014mm.plugin.card.p031ui.p032v2;

import a70.C112760b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import de3.C45336q;
import de3.C75355a0;
import de3.C75359b0;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import gc0.C20828a;
import gy3.C87412m;
import gz0.C45995o;
import hc0.C20937c;
import hp3.C87581a;
import hz0.C76251l;
import ie3.C76328d;
import j20.C117292a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kz0.C46819k;
import kz0.C46823m;
import kz0.C46824n;
import l31.C61212e;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import ob0.C89132b;
import qo3.C77407n;
import rx3.C13598b0;
import sz0.C22417c;
import sz0.C22418d;
import sz0.C48510a;
import sz0.C48511b;
import te3.C118431fo;
import te3.C118435go;
import te3.C22502jn;
import te3.C22514mn;
import te3.C22517nn;
import te3.C22528rn;
import te3.C22536y32;
import te3.C49871in;
import te3.C50151kn;
import te3.C50983qn;
import te3.C51569un;
import te3.C51997xn;
import te3.C64732tn;
import wd3.C53155r0;
import wz0.C22945n;
import wz0.C53246b;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "b", "c", "d", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI */
public final class CardHomePageNewUI extends CardNewBaseUI {

    /* renamed from: N */
    public static final int f51963N = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: P */
    public static final int f51964P = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    /* renamed from: A */
    public boolean f51965A;

    /* renamed from: B */
    public boolean f51966B;

    /* renamed from: C */
    public int f51967C = -1;

    /* renamed from: D */
    public int f51968D;

    /* renamed from: E */
    public int f51969E;

    /* renamed from: F */
    public ArrayList<C118431fo> f51970F = new ArrayList<>();

    /* renamed from: G */
    public boolean f51971G;

    /* renamed from: H */
    public C22517nn f51972H = new C22517nn();

    /* renamed from: I */
    public int f51973I;

    /* renamed from: J */
    public C22514mn f51974J;

    /* renamed from: K */
    public boolean f51975K;

    /* renamed from: L */
    public Dialog f51976L;

    /* renamed from: M */
    public C46824n f51977M;

    /* renamed from: i */
    public LoadMoreRecyclerView f51978i;

    /* renamed from: j */
    public C18611c f51979j;

    /* renamed from: n */
    public ViewGroup f51980n;

    /* renamed from: o */
    public ViewGroup f51981o;

    /* renamed from: p */
    public int f51982p;

    /* renamed from: q */
    public int f51983q = 10;

    /* renamed from: r */
    public boolean f51984r;

    /* renamed from: s */
    public String f51985s = "";

    /* renamed from: t */
    public final ArrayList<C18610a> f51986t = new ArrayList<>();

    /* renamed from: u */
    public final ArrayList<C18610a> f51987u = new ArrayList<>();

    /* renamed from: v */
    public final ArrayList<C18610a> f51988v = new ArrayList<>();

    /* renamed from: w */
    public C18610a f51989w;

    /* renamed from: x */
    public C18610a f51990x;

    /* renamed from: y */
    public C18610a f51991y;

    /* renamed from: z */
    public boolean f51992z = true;

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$a */
    public final class C18610a {

        /* renamed from: a */
        public C22514mn f51993a;

        /* renamed from: b */
        public int f51994b;

        /* renamed from: c */
        public String f51995c;

        /* renamed from: d */
        public boolean f51996d;

        /* renamed from: e */
        public boolean f51997e;

        /* renamed from: f */
        public C22528rn f51998f;

        /* renamed from: g */
        public boolean f51999g;

        public C18610a(CardHomePageNewUI cardHomePageNewUI) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d */
    public final class C18612d extends RecyclerView.C16631z {

        /* renamed from: T */
        public static final /* synthetic */ int f52001T = 0;

        /* renamed from: A */
        public CdnImageView f52002A;

        /* renamed from: B */
        public TextView f52003B;

        /* renamed from: C */
        public TextView f52004C;

        /* renamed from: D */
        public LinearLayout f52005D;

        /* renamed from: E */
        public LinearLayout f52006E;

        /* renamed from: F */
        public LinearLayout f52007F;

        /* renamed from: G */
        public TextView f52008G;

        /* renamed from: H */
        public ImageView f52009H;

        /* renamed from: I */
        public CardLabelTextView f52010I;

        /* renamed from: J */
        public ImageView f52011J;

        /* renamed from: K */
        public TextView f52012K;

        /* renamed from: L */
        public TextView f52013L;

        /* renamed from: M */
        public ImageView f52014M;

        /* renamed from: N */
        public ImageView f52015N;

        /* renamed from: P */
        public TextView f52016P;

        /* renamed from: Q */
        public View f52017Q;

        /* renamed from: R */
        public C18610a f52018R;

        /* renamed from: S */
        public final /* synthetic */ CardHomePageNewUI f52019S;

        /* renamed from: z */
        public TextView f52020z;

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$a */
        public static final class C18613a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52021d;

            /* renamed from: e */
            public final /* synthetic */ C22514mn f52022e;

            /* renamed from: f */
            public final /* synthetic */ C18612d f52023f;

            /* renamed from: g */
            public final /* synthetic */ C22502jn f52024g;

            /* renamed from: h */
            public final /* synthetic */ int f52025h;

            /* renamed from: i */
            public final /* synthetic */ int f52026i;

            public C18613a(CardHomePageNewUI cardHomePageNewUI, C22514mn mnVar, C18612d dVar, C22502jn jnVar, int i, int i2) {
                this.f52021d = cardHomePageNewUI;
                this.f52022e = mnVar;
                this.f52023f = dVar;
                this.f52024g = jnVar;
                this.f52025h = i;
                this.f52026i = i2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CardHomePageNewUI cardHomePageNewUI = this.f52021d;
                cardHomePageNewUI.f51966B = true;
                cardHomePageNewUI.f51967C = 0;
                cardHomePageNewUI.f51974J = this.f52022e;
                C18612d dVar = this.f52023f;
                String str = this.f52024g.f64049d;
                C87412m.m108593f(str, "coupon.user_card_id");
                dVar.mo23435K(str);
                C115669n.INSTANCE.mo160131h(16324, 1, this.f52022e.f64246d, Integer.valueOf(this.f52025h), this.f52024g.f64049d, 2, Integer.valueOf(this.f52026i), Integer.valueOf(this.f52021d.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$b */
        public static final class C18614b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52027d;

            /* renamed from: e */
            public final /* synthetic */ C22514mn f52028e;

            /* renamed from: f */
            public final /* synthetic */ C18612d f52029f;

            /* renamed from: g */
            public final /* synthetic */ C22502jn f52030g;

            /* renamed from: h */
            public final /* synthetic */ int f52031h;

            /* renamed from: i */
            public final /* synthetic */ int f52032i;

            public C18614b(CardHomePageNewUI cardHomePageNewUI, C22514mn mnVar, C18612d dVar, C22502jn jnVar, int i, int i2) {
                this.f52027d = cardHomePageNewUI;
                this.f52028e = mnVar;
                this.f52029f = dVar;
                this.f52030g = jnVar;
                this.f52031h = i;
                this.f52032i = i2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CardHomePageNewUI cardHomePageNewUI = this.f52027d;
                cardHomePageNewUI.f51966B = true;
                cardHomePageNewUI.f51967C = 0;
                cardHomePageNewUI.f51974J = this.f52028e;
                C18612d dVar = this.f52029f;
                String str = this.f52030g.f64049d;
                C87412m.m108593f(str, "coupon.user_card_id");
                dVar.mo23435K(str);
                C115669n.INSTANCE.mo160131h(16324, 1, this.f52028e.f64246d, Integer.valueOf(this.f52031h), this.f52030g.f64049d, 2, Integer.valueOf(this.f52032i), Integer.valueOf(this.f52027d.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$c */
        public static final class C18615c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52033d;

            /* renamed from: e */
            public final /* synthetic */ C22514mn f52034e;

            /* renamed from: f */
            public final /* synthetic */ C22514mn f52035f;

            /* renamed from: g */
            public final /* synthetic */ C18612d f52036g;

            /* renamed from: h */
            public final /* synthetic */ int f52037h;

            public C18615c(CardHomePageNewUI cardHomePageNewUI, C22514mn mnVar, C22514mn mnVar2, C18612d dVar, int i) {
                this.f52033d = cardHomePageNewUI;
                this.f52034e = mnVar;
                this.f52035f = mnVar2;
                this.f52036g = dVar;
                this.f52037h = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.CardHomePageNewUI", "click header");
                CardHomePageNewUI cardHomePageNewUI = this.f52033d;
                cardHomePageNewUI.f51966B = true;
                cardHomePageNewUI.f51967C = 0;
                cardHomePageNewUI.f51974J = this.f52034e;
                C22514mn mnVar = this.f52035f;
                int i = mnVar.f64251i;
                if (i == 1) {
                    Context context = this.f52036g.f44854d.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    C53246b.m59678j((MMActivity) context, this.f52035f.f64252j, 0);
                } else if (i == 2) {
                    C51997xn xnVar = mnVar.f64253n;
                    C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                }
                C115669n.INSTANCE.mo160131h(16324, 1, this.f52035f.f64246d, 0, 0, 1, Integer.valueOf(this.f52037h), Integer.valueOf(this.f52033d.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$d */
        public static final class C18616d extends C45336q {

            /* renamed from: f */
            public final /* synthetic */ View.OnClickListener f52038f;

            public C18616d(View.OnClickListener onClickListener) {
                this.f52038f = onClickListener;
            }

            /* renamed from: a */
            public void mo23448a(View view, C53155r0 r0Var) {
                this.f52038f.onClick(view);
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$e */
        public static final class C18617e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52039d;

            public C18617e(CardHomePageNewUI cardHomePageNewUI) {
                this.f52039d = cardHomePageNewUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CardHomePageNewUI.m19369L7(this.f52039d);
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$f */
        public static final class C18618f implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52040d;

            public C18618f(CardHomePageNewUI cardHomePageNewUI) {
                this.f52040d = cardHomePageNewUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CardHomePageNewUI.m19369L7(this.f52040d);
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$g */
        public static final class C18619g implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C18612d f52041d;

            /* renamed from: e */
            public final /* synthetic */ int f52042e;

            /* renamed from: f */
            public final /* synthetic */ C22514mn f52043f;

            /* renamed from: g */
            public final /* synthetic */ CardHomePageNewUI f52044g;

            public C18619g(C18612d dVar, int i, C22514mn mnVar, CardHomePageNewUI cardHomePageNewUI) {
                this.f52041d = dVar;
                this.f52042e = i;
                this.f52043f = mnVar;
                this.f52044g = cardHomePageNewUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105918d("MicroMsg.CardHomePageNewUI", "do collapse coupon layout");
                C18612d dVar = this.f52041d;
                int i = this.f52042e;
                C18610a aVar = dVar.f52018R;
                C87412m.m108591d(aVar);
                C22514mn mnVar = aVar.f51993a;
                int childCount = dVar.mo23426B().getChildCount();
                C87412m.m108591d(mnVar);
                if (childCount > mnVar.f64262w) {
                    Log.m105919d("MicroMsg.CardHomePageNewUI", "collapse count: %s, limit: %s", Integer.valueOf(dVar.mo23426B().getChildCount()), Integer.valueOf(mnVar.f64262w));
                    int childCount2 = dVar.mo23426B().getChildCount() - 1;
                    int i2 = mnVar.f64262w;
                    if (i2 <= childCount2) {
                        while (true) {
                            dVar.mo23426B().removeViewAt(childCount2);
                            if (childCount2 == i2) {
                                break;
                            }
                            childCount2--;
                        }
                    }
                }
                dVar.mo23442R(false, i);
                C18610a aVar2 = this.f52041d.f52018R;
                if (aVar2 != null) {
                    aVar2.f51997e = false;
                }
                C115669n nVar = C115669n.INSTANCE;
                C22514mn mnVar2 = this.f52043f;
                C87412m.m108591d(mnVar2);
                nVar.mo160131h(16324, 1, mnVar2.f64246d, 0, 0, 5, Integer.valueOf(this.f52042e), Integer.valueOf(this.f52044g.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$h */
        public static final class C18620h implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C18612d f52045d;

            /* renamed from: e */
            public final /* synthetic */ int f52046e;

            /* renamed from: f */
            public final /* synthetic */ C22514mn f52047f;

            /* renamed from: g */
            public final /* synthetic */ CardHomePageNewUI f52048g;

            public C18620h(C18612d dVar, int i, C22514mn mnVar, CardHomePageNewUI cardHomePageNewUI) {
                this.f52045d = dVar;
                this.f52046e = i;
                this.f52047f = mnVar;
                this.f52048g = cardHomePageNewUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105918d("MicroMsg.CardHomePageNewUI", "do expand coupon layout");
                C18612d dVar = this.f52045d;
                int i = this.f52046e;
                C18610a aVar = dVar.f52018R;
                C87412m.m108591d(aVar);
                C22514mn mnVar = aVar.f51993a;
                int childCount = dVar.mo23426B().getChildCount();
                C87412m.m108591d(mnVar);
                if (childCount < mnVar.f64261v) {
                    dVar.mo23444z(mnVar.f64262w, -1, i);
                    if (mnVar.f64262w >= mnVar.f64261v) {
                        dVar.mo23429E().setVisibility(8);
                    } else {
                        dVar.mo23442R(true, i);
                    }
                }
                C18610a aVar2 = this.f52045d.f52018R;
                if (aVar2 != null) {
                    aVar2.f51997e = true;
                }
                C115669n nVar = C115669n.INSTANCE;
                C22514mn mnVar2 = this.f52047f;
                C87412m.m108591d(mnVar2);
                nVar.mo160131h(16324, 1, mnVar2.f64246d, 0, 0, 4, Integer.valueOf(this.f52046e), Integer.valueOf(this.f52048g.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$d$i */
        public static final class C18621i implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C22514mn f52049d;

            /* renamed from: e */
            public final /* synthetic */ CardHomePageNewUI f52050e;

            /* renamed from: f */
            public final /* synthetic */ C18612d f52051f;

            /* renamed from: g */
            public final /* synthetic */ int f52052g;

            public C18621i(C22514mn mnVar, CardHomePageNewUI cardHomePageNewUI, C18612d dVar, int i) {
                this.f52049d = mnVar;
                this.f52050e = cardHomePageNewUI;
                this.f52051f = dVar;
                this.f52052g = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C51997xn xnVar = this.f52049d.f64258s;
                if (xnVar != null) {
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(xnVar != null);
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
                    CardHomePageNewUI cardHomePageNewUI = this.f52050e;
                    cardHomePageNewUI.f51966B = true;
                    cardHomePageNewUI.f51967C = 0;
                    C22514mn mnVar = this.f52049d;
                    cardHomePageNewUI.f51974J = mnVar;
                    C51997xn xnVar2 = mnVar.f64258s;
                    C53246b.m59674f(xnVar2.f144755d, xnVar2.f144756e, xnVar2.f144757f);
                }
                C115669n nVar = C115669n.INSTANCE;
                C18610a aVar = this.f52051f.f52018R;
                C87412m.m108591d(aVar);
                C22514mn mnVar2 = aVar.f51993a;
                C87412m.m108591d(mnVar2);
                nVar.mo160131h(16324, 1, mnVar2.f64246d, 0, 0, 6, Integer.valueOf(this.f52052g), Integer.valueOf(this.f52050e.f51969E));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18612d(com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI r17, android.view.View r18, int r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r18
                java.lang.String r2 = "itemView"
                gy3.C87412m.m108594g(r1, r2)
                r2 = r17
                r0.f52019S = r2
                r0.<init>(r1)
                java.lang.String r2 = "itemView.findViewById(R.id.chpi_mch_label_tv)"
                java.lang.String r4 = "itemView.findViewById(R.id.chti_right_iv)"
                r5 = 2131299629(0x7f090d2d, float:1.8217265E38)
                java.lang.String r6 = "itemView.findViewById(R.id.chti_desc_tv)"
                r7 = 2131299624(0x7f090d28, float:1.8217255E38)
                java.lang.String r8 = "itemView.findViewById(R.id.chti_title_tv)"
                r9 = 2131299630(0x7f090d2e, float:1.8217267E38)
                java.lang.String r10 = "itemView.findViewById(R.id.chti_icon_iv)"
                r11 = 2131299626(0x7f090d2a, float:1.8217259E38)
                java.lang.String r12 = "itemView.findViewById(R.id.chpi_desc_tv)"
                java.lang.String r14 = "itemView.findViewById(R.id.chpi_username_tv)"
                r15 = 2131299595(0x7f090d0b, float:1.8217196E38)
                java.lang.String r3 = "itemView.findViewById(R.id.chpi_logo_iv)"
                r13 = 2131299591(0x7f090d07, float:1.8217188E38)
                switch(r19) {
                    case 0: goto L_0x015b;
                    case 1: goto L_0x0149;
                    case 2: goto L_0x0115;
                    case 3: goto L_0x00ef;
                    case 4: goto L_0x00c1;
                    case 5: goto L_0x0093;
                    case 6: goto L_0x0037;
                    default: goto L_0x0035;
                }
            L_0x0035:
                goto L_0x01eb
            L_0x0037:
                android.view.View r2 = r1.findViewById(r11)
                gy3.C87412m.m108593f(r2, r10)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r0.f52011J = r2
                android.view.View r2 = r1.findViewById(r9)
                gy3.C87412m.m108593f(r2, r8)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52012K = r2
                android.view.View r2 = r1.findViewById(r7)
                gy3.C87412m.m108593f(r2, r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52013L = r2
                android.view.View r2 = r1.findViewById(r5)
                gy3.C87412m.m108593f(r2, r4)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r0.f52014M = r2
                r2 = 2131299628(0x7f090d2c, float:1.8217263E38)
                android.view.View r2 = r1.findViewById(r2)
                java.lang.String r3 = "itemView.findViewById(R.id.chti_reddot_iv)"
                gy3.C87412m.m108593f(r2, r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r0.f52015N = r2
                r2 = 2131299627(0x7f090d2b, float:1.821726E38)
                android.view.View r2 = r1.findViewById(r2)
                java.lang.String r3 = "itemView.findViewById(R.id.chti_new_tv)"
                gy3.C87412m.m108593f(r2, r3)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52016P = r2
                r2 = 2131299625(0x7f090d29, float:1.8217257E38)
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "itemView.findViewById(R.id.chti_divider)"
                gy3.C87412m.m108593f(r1, r2)
                r0.f52017Q = r1
                goto L_0x01eb
            L_0x0093:
                android.view.View r2 = r1.findViewById(r11)
                gy3.C87412m.m108593f(r2, r10)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r0.f52011J = r2
                android.view.View r2 = r1.findViewById(r9)
                gy3.C87412m.m108593f(r2, r8)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52012K = r2
                android.view.View r2 = r1.findViewById(r7)
                gy3.C87412m.m108593f(r2, r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52013L = r2
                android.view.View r1 = r1.findViewById(r5)
                gy3.C87412m.m108593f(r1, r4)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.f52014M = r1
                goto L_0x01eb
            L_0x00c1:
                android.view.View r2 = r1.findViewById(r11)
                gy3.C87412m.m108593f(r2, r10)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r0.f52011J = r2
                android.view.View r2 = r1.findViewById(r9)
                gy3.C87412m.m108593f(r2, r8)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52012K = r2
                android.view.View r2 = r1.findViewById(r7)
                gy3.C87412m.m108593f(r2, r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52013L = r2
                android.view.View r1 = r1.findViewById(r5)
                gy3.C87412m.m108593f(r1, r4)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.f52014M = r1
                goto L_0x01eb
            L_0x00ef:
                android.view.View r2 = r1.findViewById(r13)
                gy3.C87412m.m108593f(r2, r3)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r2
                r0.f52002A = r2
                android.view.View r2 = r1.findViewById(r15)
                gy3.C87412m.m108593f(r2, r14)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r0.f52003B = r2
                r2 = 2131299585(0x7f090d01, float:1.8217176E38)
                android.view.View r1 = r1.findViewById(r2)
                gy3.C87412m.m108593f(r1, r12)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.f52004C = r1
                goto L_0x01eb
            L_0x0115:
                android.view.View r4 = r1.findViewById(r13)
                gy3.C87412m.m108593f(r4, r3)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r4
                r0.f52002A = r4
                android.view.View r3 = r1.findViewById(r15)
                gy3.C87412m.m108593f(r3, r14)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r0.f52003B = r3
                r3 = 2131299585(0x7f090d01, float:1.8217176E38)
                android.view.View r3 = r1.findViewById(r3)
                gy3.C87412m.m108593f(r3, r12)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r0.f52004C = r3
                r3 = 2131299592(0x7f090d08, float:1.821719E38)
                android.view.View r1 = r1.findViewById(r3)
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.card.ui.v2.CardLabelTextView r1 = (com.tencent.p014mm.plugin.card.p031ui.p032v2.CardLabelTextView) r1
                r0.f52010I = r1
                goto L_0x01eb
            L_0x0149:
                r2 = 2131299593(0x7f090d09, float:1.8217192E38)
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "itemView.findViewById(R.id.chpi_section_title)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.f52020z = r1
                goto L_0x01eb
            L_0x015b:
                android.view.View r4 = r1.findViewById(r13)
                gy3.C87412m.m108593f(r4, r3)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r4
                r0.f52002A = r4
                android.view.View r3 = r1.findViewById(r15)
                gy3.C87412m.m108593f(r3, r14)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r0.f52003B = r3
                r3 = 2131299585(0x7f090d01, float:1.8217176E38)
                android.view.View r3 = r1.findViewById(r3)
                gy3.C87412m.m108593f(r3, r12)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r0.f52004C = r3
                r3 = 2131299590(0x7f090d06, float:1.8217186E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r4 = "itemView.findViewById(R.id.chpi_label_layout)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                r0.f52005D = r3
                r3 = 2131299584(0x7f090d00, float:1.8217174E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r4 = "itemView.findViewById(R.id.chpi_coupon_layout)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                r0.f52006E = r3
                r3 = 2131299587(0x7f090d03, float:1.821718E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r4 = "itemView.findViewById(R.id.chpi_expand_layout)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                r0.f52007F = r3
                r3 = 2131299586(0x7f090d02, float:1.8217178E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r4 = "itemView.findViewById(R.id.chpi_expand_iv)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r0.f52009H = r3
                r3 = 2131299588(0x7f090d04, float:1.8217182E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r4 = "itemView.findViewById(R.id.chpi_expand_tv)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r0.f52008G = r3
                r3 = 2131299592(0x7f090d08, float:1.821719E38)
                android.view.View r3 = r1.findViewById(r3)
                gy3.C87412m.m108593f(r3, r2)
                com.tencent.mm.plugin.card.ui.v2.CardLabelTextView r3 = (com.tencent.p014mm.plugin.card.p031ui.p032v2.CardLabelTextView) r3
                r0.f52010I = r3
                r2 = 2131299589(0x7f090d05, float:1.8217184E38)
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "itemView.findViewById(R.id.chpi_header_layout)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            L_0x01eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI.C18612d.<init>(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI, android.view.View, int):void");
        }

        /* renamed from: B */
        public final LinearLayout mo23426B() {
            LinearLayout linearLayout = this.f52006E;
            if (linearLayout != null) {
                return linearLayout;
            }
            C87412m.m108603p("chpiCouponLayout");
            throw null;
        }

        /* renamed from: C */
        public final TextView mo23427C() {
            TextView textView = this.f52004C;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("chpiDescTv");
            throw null;
        }

        /* renamed from: D */
        public final ImageView mo23428D() {
            ImageView imageView = this.f52009H;
            if (imageView != null) {
                return imageView;
            }
            C87412m.m108603p("chpiExpandIv");
            throw null;
        }

        /* renamed from: E */
        public final LinearLayout mo23429E() {
            LinearLayout linearLayout = this.f52007F;
            if (linearLayout != null) {
                return linearLayout;
            }
            C87412m.m108603p("chpiExpandLayout");
            throw null;
        }

        /* renamed from: F */
        public final LinearLayout mo23430F() {
            LinearLayout linearLayout = this.f52005D;
            if (linearLayout != null) {
                return linearLayout;
            }
            C87412m.m108603p("chpiLabelLayout");
            throw null;
        }

        /* renamed from: G */
        public final CdnImageView mo23431G() {
            CdnImageView cdnImageView = this.f52002A;
            if (cdnImageView != null) {
                return cdnImageView;
            }
            C87412m.m108603p("chpiLogoIv");
            throw null;
        }

        /* renamed from: H */
        public final CardLabelTextView mo23432H() {
            CardLabelTextView cardLabelTextView = this.f52010I;
            if (cardLabelTextView != null) {
                return cardLabelTextView;
            }
            C87412m.m108603p("chpiMchLabelTv");
            throw null;
        }

        /* renamed from: I */
        public final TextView mo23433I() {
            TextView textView = this.f52003B;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("chpiNameTv");
            throw null;
        }

        /* renamed from: J */
        public final TextView mo23434J() {
            TextView textView = this.f52013L;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("chtiDescTv");
            throw null;
        }

        /* renamed from: K */
        public final void mo23435K(String str) {
            C87412m.m108594g(str, "cardId");
            Log.m105925i("MicroMsg.CardHomePageNewUI", "go to card detail: %s", str);
            Intent intent = new Intent(this.f44854d.getContext(), CardDetailUI.class);
            intent.putExtra("key_card_id", str);
            intent.addFlags(131072);
            intent.putExtra("key_from_scene", 3);
            Context context = this.f44854d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: L */
        public final void mo23436L(ImageView imageView, String str) {
            C87412m.m108594g(imageView, "imageView");
            C87412m.m108594g(str, "url");
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C112760b.m154195C();
            bVar.f59350f = C76251l.m91644m(str);
            bVar.f59346b = true;
            bVar.f59364t = true;
            bVar.f59366v = true;
            bVar.f59345a = true;
            bVar.f59359o = C0966R.raw.card_default_merchant_icon;
            C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
        }

        /* renamed from: M */
        public final void mo23437M(C18610a aVar, int i, boolean z) {
            C118431fo foVar;
            C18610a aVar2 = aVar;
            int i2 = i;
            C87412m.m108594g(aVar2, "model");
            this.f52018R = aVar2;
            C22514mn mnVar = aVar2.f51993a;
            switch (aVar2.f51994b) {
                case 0:
                    C87412m.m108591d(mnVar);
                    CardHomePageNewUI cardHomePageNewUI = this.f52019S;
                    mo23431G().setRoundCorner(true);
                    if (!Util.isNullOrNil(mnVar.f64247e)) {
                        CdnImageView G = mo23431G();
                        String str = mnVar.f64247e;
                        C87412m.m108593f(str, "card_element_mch_icon");
                        mo23436L(G, str);
                    } else {
                        mo23431G().setImageResource(C0966R.raw.card_default_merchant_icon);
                    }
                    C18615c cVar = r0;
                    C18615c cVar2 = new C18615c(cardHomePageNewUI, mnVar, mnVar, this, i);
                    mo23431G().setOnClickListener(cVar);
                    C18634b bVar = new C18634b(cardHomePageNewUI, cardHomePageNewUI.getContext().getResources().getColor(C0966R.color.a7f), cardHomePageNewUI.getContext().getResources().getColor(C0966R.color.ad7), new C18616d(cVar));
                    SpannableString spannableString = new SpannableString(mnVar.f64248f);
                    spannableString.setSpan(bVar, 0, spannableString.length(), 18);
                    mo23433I().setClickable(true);
                    mo23433I().setOnTouchListener(new C75355a0(cardHomePageNewUI));
                    mo23433I().setText(spannableString);
                    if (!Util.isNullOrNil(mnVar.f64249g)) {
                        mo23427C().setText(mnVar.f64249g);
                        mo23427C().setVisibility(0);
                        mo23427C().setOnClickListener(cVar);
                    } else {
                        mo23427C().setVisibility(8);
                    }
                    C50151kn knVar = mnVar.f64259t;
                    if (knVar == null) {
                        mo23432H().setText("");
                        mo23432H().setVisibility(8);
                    } else if (!Util.isNullOrNil(knVar.f136887d)) {
                        mo23432H().setText(mnVar.f64259t.f136887d);
                        if (!Util.isNullOrNil(mnVar.f64259t.f136888e)) {
                            mo23432H().setTextColor(Color.parseColor(mnVar.f64259t.f136888e));
                        } else {
                            mo23432H().setTextColor(cardHomePageNewUI.getResources().getColor(C0966R.color.al6));
                        }
                        if (!Util.isNullOrNil(mnVar.f64259t.f136889f)) {
                            CardLabelTextView H = mo23432H();
                            C50151kn knVar2 = mnVar.f64259t;
                            H.setFillColor(C22945n.m27002b(knVar2.f136889f, knVar2.f136892i));
                        } else {
                            mo23432H().setFillColor(0);
                        }
                        mo23432H().setVisibility(0);
                    } else {
                        mo23432H().setVisibility(8);
                    }
                    mo23426B().removeAllViews();
                    if ((z || !aVar2.f51996d) ? mnVar.f64260u == 1 : aVar2.f51997e) {
                        LinkedList<C22502jn> linkedList = mnVar.f64255p;
                        C87412m.m108593f(linkedList, "card_element_coupon_list");
                        if (!linkedList.isEmpty()) {
                            mo23444z(-1, mnVar.f64255p.size(), i2);
                            mo23426B().setVisibility(0);
                            aVar2.f51997e = true;
                        } else {
                            mo23426B().setVisibility(8);
                        }
                        if (!Util.isNullOrNil(mnVar.f64256q)) {
                            mo23440P(i2);
                            mo23429E().setVisibility(0);
                        } else if (mnVar.f64262w < mnVar.f64255p.size()) {
                            mo23438N(i2);
                        } else {
                            mo23429E().setVisibility(8);
                        }
                    } else {
                        LinkedList<C22502jn> linkedList2 = mnVar.f64255p;
                        C87412m.m108593f(linkedList2, "card_element_coupon_list");
                        if (!linkedList2.isEmpty()) {
                            mo23444z(-1, mnVar.f64262w, i2);
                            mo23426B().setVisibility(0);
                            aVar2.f51997e = false;
                        } else {
                            mo23426B().setVisibility(8);
                        }
                        if (mnVar.f64262w < mnVar.f64255p.size()) {
                            mo23439O(i2);
                            mo23429E().setVisibility(0);
                        } else if (!Util.isNullOrNil(mnVar.f64256q)) {
                            mo23440P(i2);
                            mo23429E().setVisibility(0);
                        } else {
                            mo23429E().setVisibility(8);
                        }
                    }
                    LinkedList<C50151kn> linkedList3 = mnVar.f64250h;
                    C87412m.m108593f(linkedList3, "card_element_mch_label");
                    mo23430F().removeAllViews();
                    if (!linkedList3.isEmpty()) {
                        int i3 = 0;
                        for (C50151kn next : linkedList3) {
                            int i4 = i3 + 1;
                            Context context = mo23430F().getContext();
                            C87412m.m108593f(context, "chpiLabelLayout.context");
                            CardLabelTextView cardLabelTextView = new CardLabelTextView(context);
                            Context context2 = mo23430F().getContext();
                            cardLabelTextView.setTextSize(1, 12.0f);
                            cardLabelTextView.setText(next.f136887d);
                            int b = C76577a.m92151b(context2, 4);
                            cardLabelTextView.setPadding(b, 0, b, 0);
                            cardLabelTextView.setGravity(16);
                            if (!Util.isNullOrNil(next.f136888e)) {
                                cardLabelTextView.setTextColor(Color.parseColor(next.f136888e));
                            } else {
                                cardLabelTextView.setTextColor(-1);
                            }
                            if (!Util.isNullOrNil(next.f136889f)) {
                                cardLabelTextView.setFillColor(C22945n.m27002b(next.f136889f, next.f136892i));
                            } else {
                                cardLabelTextView.setFillColor(0);
                            }
                            if (i3 > 0) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.leftMargin = C76577a.m92151b(context2, 4);
                                mo23430F().addView(cardLabelTextView, new LinearLayout.LayoutParams(marginLayoutParams));
                            } else {
                                mo23430F().addView(cardLabelTextView);
                            }
                            i3 = i4;
                        }
                        mo23430F().setVisibility(0);
                        break;
                    } else {
                        mo23430F().setVisibility(8);
                        break;
                    }
                    break;
                case 1:
                    TextView textView = this.f52020z;
                    if (textView != null) {
                        String str2 = aVar2.f51995c;
                        if (str2 != null) {
                            textView.setText(str2);
                            break;
                        } else {
                            C87412m.m108603p("sectionTitle");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("sectionTitleTv");
                        throw null;
                    }
                case 2:
                    C87412m.m108591d(mnVar);
                    CardHomePageNewUI cardHomePageNewUI2 = this.f52019S;
                    mo23431G().setRoundCorner(true);
                    mo23431G().setUrl(mnVar.f64247e);
                    mo23433I().setText(mnVar.f64248f);
                    if (!Util.isNullOrNil(mnVar.f64249g)) {
                        mo23427C().setText(mnVar.f64249g);
                        mo23427C().setVisibility(0);
                    } else {
                        mo23427C().setVisibility(8);
                    }
                    C50151kn knVar3 = mnVar.f64259t;
                    if (knVar3 != null) {
                        if (Util.isNullOrNil(knVar3.f136887d)) {
                            mo23432H().setVisibility(8);
                            break;
                        } else {
                            mo23432H().setText(mnVar.f64259t.f136887d);
                            if (!Util.isNullOrNil(mnVar.f64259t.f136888e)) {
                                mo23432H().setTextColor(Color.parseColor(mnVar.f64259t.f136888e));
                            } else {
                                mo23432H().setTextColor(cardHomePageNewUI2.getResources().getColor(C0966R.color.al6));
                            }
                            if (!Util.isNullOrNil(mnVar.f64259t.f136889f)) {
                                CardLabelTextView H2 = mo23432H();
                                C50151kn knVar4 = mnVar.f64259t;
                                H2.setFillColor(C22945n.m27002b(knVar4.f136889f, knVar4.f136892i));
                            } else {
                                mo23432H().setFillColor(0);
                            }
                            mo23432H().setVisibility(0);
                            break;
                        }
                    } else {
                        mo23432H().setText("");
                        mo23432H().setVisibility(8);
                        break;
                    }
                case 3:
                    mo23431G().setRoundCorner(true);
                    mo23431G().setImageResource(C0966R.raw.card_default_merchant_icon);
                    mo23433I().setText(MMApplicationContext.getResources().getString(C0966R.string.ay5));
                    mo23427C().setVisibility(8);
                    break;
                case 4:
                    TextView textView2 = this.f52012K;
                    if (textView2 != null) {
                        textView2.setText(C0966R.string.k2i);
                        CardHomePageNewUI cardHomePageNewUI3 = this.f52019S;
                        if (cardHomePageNewUI3.f51985s != null) {
                            mo23434J().setText(cardHomePageNewUI3.f51985s);
                            break;
                        }
                    } else {
                        C87412m.m108603p("chtiTitleTv");
                        throw null;
                    }
                    break;
                case 5:
                    TextView textView3 = this.f52012K;
                    if (textView3 != null) {
                        textView3.setText(C0966R.string.b07);
                        if (this.f52019S.f51968D == 1) {
                            mo23434J().setVisibility(0);
                            ImageView imageView = this.f52014M;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                                CardHomePageNewUI cardHomePageNewUI4 = this.f52019S;
                                Iterator<C118431fo> it = cardHomePageNewUI4.f51970F.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        foVar = it.next();
                                        if (foVar.f354004d == cardHomePageNewUI4.f51969E) {
                                        }
                                    } else {
                                        foVar = null;
                                    }
                                }
                                if (foVar == null) {
                                    mo23434J().setText("");
                                } else {
                                    mo23434J().setText(foVar.f354006f);
                                }
                                mo23434J().setOnClickListener(new C18617e(this.f52019S));
                                ImageView imageView2 = this.f52014M;
                                if (imageView2 != null) {
                                    imageView2.setOnClickListener(new C18618f(this.f52019S));
                                    ImageView imageView3 = this.f52014M;
                                    if (imageView3 != null) {
                                        Util.expandViewTouchArea(imageView3, 50, 50, 50, 50);
                                        break;
                                    } else {
                                        C87412m.m108603p("chtiRightIv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("chtiRightIv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("chtiRightIv");
                                throw null;
                            }
                        } else {
                            mo23434J().setVisibility(8);
                            ImageView imageView4 = this.f52014M;
                            if (imageView4 != null) {
                                imageView4.setVisibility(8);
                                break;
                            } else {
                                C87412m.m108603p("chtiRightIv");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("chtiTitleTv");
                        throw null;
                    }
                case 6:
                    C22528rn rnVar = aVar2.f51998f;
                    if (rnVar != null) {
                        TextView textView4 = this.f52012K;
                        if (textView4 != null) {
                            textView4.setText(rnVar.f64550e);
                            mo23434J().setText(rnVar.f64551f);
                            ImageView imageView5 = this.f52011J;
                            if (imageView5 != null) {
                                String str3 = rnVar.f64549d;
                                C87412m.m108593f(str3, "card_top_cell_icon");
                                mo23436L(imageView5, str3);
                                TextView textView5 = this.f52016P;
                                if (textView5 != null) {
                                    textView5.setVisibility(rnVar.f64557o == 1 ? 0 : 8);
                                    ImageView imageView6 = this.f52015N;
                                    if (imageView6 != null) {
                                        imageView6.setVisibility(rnVar.f64556n == 1 ? 0 : 8);
                                    } else {
                                        C87412m.m108603p("chtiRedDotIv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("chtiNewTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("chtiIconIv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("chtiTitleTv");
                            throw null;
                        }
                    }
                    if (aVar2.f51999g) {
                        View view = this.f52017Q;
                        if (view != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "setModel", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "setModel", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            break;
                        } else {
                            C87412m.m108603p("chtiDivider");
                            throw null;
                        }
                    } else {
                        View view3 = this.f52017Q;
                        if (view3 != null) {
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar4.mo10233c(8);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "setModel", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH", "setModel", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            break;
                        } else {
                            C87412m.m108603p("chtiDivider");
                            throw null;
                        }
                    }
            }
            aVar2.f51996d = true;
        }

        /* renamed from: N */
        public final void mo23438N(int i) {
            C18610a aVar = this.f52018R;
            C87412m.m108591d(aVar);
            C22514mn mnVar = aVar.f51993a;
            TextView textView = this.f52008G;
            if (textView != null) {
                textView.setText(MMApplicationContext.getResources().getString(C0966R.string.f360221ay2));
                mo23429E().setOnClickListener(new C18619g(this, i, mnVar, this.f52019S));
                mo23428D().setImageResource(C0966R.C0969drawable.bxg);
                mo23428D().setVisibility(0);
                return;
            }
            C87412m.m108603p("chpiExpandTv");
            throw null;
        }

        /* renamed from: O */
        public final void mo23439O(int i) {
            C18610a aVar = this.f52018R;
            C87412m.m108591d(aVar);
            C22514mn mnVar = aVar.f51993a;
            TextView textView = this.f52008G;
            if (textView != null) {
                Resources resources = MMApplicationContext.getResources();
                C87412m.m108591d(mnVar);
                textView.setText(resources.getString(C0966R.string.ay4, new Object[]{Integer.valueOf(mnVar.f64261v - mnVar.f64262w)}));
                mo23429E().setOnClickListener(new C18620h(this, i, mnVar, this.f52019S));
                mo23428D().setImageResource(C0966R.C0969drawable.bxf);
                mo23428D().setVisibility(0);
                return;
            }
            C87412m.m108603p("chpiExpandTv");
            throw null;
        }

        /* renamed from: P */
        public final void mo23440P(int i) {
            C18610a aVar = this.f52018R;
            C87412m.m108591d(aVar);
            C22514mn mnVar = aVar.f51993a;
            C87412m.m108591d(mnVar);
            CardHomePageNewUI cardHomePageNewUI = this.f52019S;
            if (!Util.isNullOrNil(mnVar.f64256q)) {
                if (!Util.isNullOrNil(mnVar.f64257r)) {
                    TextView textView = this.f52008G;
                    if (textView != null) {
                        textView.setTextColor(Color.parseColor(mnVar.f64257r));
                    } else {
                        C87412m.m108603p("chpiExpandTv");
                        throw null;
                    }
                }
                TextView textView2 = this.f52008G;
                if (textView2 != null) {
                    textView2.setText(mnVar.f64256q);
                    mo23428D().setImageResource(C0966R.C0969drawable.bwx);
                    mo23429E().setOnClickListener(new C18621i(mnVar, cardHomePageNewUI, this, i));
                    return;
                }
                C87412m.m108603p("chpiExpandTv");
                throw null;
            }
        }

        /* renamed from: Q */
        public final void mo23441Q(List<? extends C49871in> list, LinearLayout linearLayout) {
            C87412m.m108594g(list, "couponLabelList");
            C87412m.m108594g(linearLayout, "labelLayout");
            for (C49871in inVar : list) {
                CardTagTextView cardTagTextView = new CardTagTextView(mo23426B().getContext());
                Context context = mo23426B().getContext();
                cardTagTextView.setMinHeight(C76577a.m92151b(context, 18));
                cardTagTextView.setMinWidth(C76577a.m92151b(context, 56));
                int b = C76577a.m92151b(context, 8);
                int b2 = C76577a.m92151b(context, 4);
                cardTagTextView.setPadding(b, b2, b, b2);
                cardTagTextView.setText(inVar.f135509d);
                cardTagTextView.setTextSize(1, 10.0f);
                if (!Util.isNullOrNil(inVar.f135510e)) {
                    cardTagTextView.setTextColor(Color.parseColor(inVar.f135510e));
                } else {
                    cardTagTextView.setTextColor(-1);
                }
                if (!Util.isNullOrNil(inVar.f135511f)) {
                    cardTagTextView.setFillColor(C22945n.m27002b(inVar.f135511f, inVar.f135514i));
                } else {
                    cardTagTextView.setFillColor(C22945n.m27001a(-16777216, 26));
                }
                linearLayout.addView(cardTagTextView);
            }
        }

        /* renamed from: R */
        public final void mo23442R(boolean z, int i) {
            C18610a aVar = this.f52018R;
            C87412m.m108591d(aVar);
            C22514mn mnVar = aVar.f51993a;
            if (z) {
                if (!Util.isNullOrNil(mnVar != null ? mnVar.f64256q : null)) {
                    mo23440P(i);
                } else {
                    mo23438N(i);
                }
            } else {
                mo23439O(i);
            }
        }

        /* renamed from: y */
        public final void mo23443y(View view) {
            C87412m.m108594g(view, "view");
            if (mo23426B().getChildCount() == 0) {
                mo23426B().addView(view);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C76577a.m92151b(mo23426B().getContext(), 84));
            marginLayoutParams.topMargin = C76577a.m92151b(mo23426B().getContext(), 8);
            mo23426B().addView(view, new LinearLayout.LayoutParams(marginLayoutParams));
        }

        /* renamed from: z */
        public final void mo23444z(int i, int i2, int i3) {
            Iterator<C22502jn> it;
            int i4;
            int i5 = i2;
            C18610a aVar = this.f52018R;
            C87412m.m108591d(aVar);
            C22514mn mnVar = aVar.f51993a;
            C87412m.m108591d(mnVar);
            Iterator<C22502jn> it4 = mnVar.f64255p.iterator();
            boolean z = false;
            int i6 = 0;
            int i7 = 0;
            while (it4.hasNext()) {
                int i8 = i6 + 1;
                C22502jn next = it4.next();
                if (i6 < i) {
                    it = it4;
                    i4 = i8;
                } else {
                    int i9 = next.f64056n;
                    if (i9 == 1) {
                        View inflate = LayoutInflater.from(mo23426B().getContext()).inflate(C0966R.C0971layout.f6724mt, mo23426B(), z);
                        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) inflate;
                        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.bbf);
                        CdnImageView cdnImageView = (CdnImageView) viewGroup.findViewById(C0966R.C0970id.bbc);
                        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.bbd);
                        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.bbe);
                        if (!Util.isNullOrNil(next.f64059q)) {
                            it = it4;
                            textView.setTextColor(C22945n.m27002b(next.f64059q, next.f64060r));
                        } else {
                            it = it4;
                        }
                        textView.setText(next.f64050e);
                        cdnImageView.setUrl(next.f64057o);
                        if (!Util.isNullOrNil(next.f64061s)) {
                            textView2.setTextColor(C22945n.m27002b(next.f64061s, next.f64062t));
                        }
                        textView2.setText(next.f64051f);
                        LinkedList<C49871in> linkedList = next.f64055j;
                        C87412m.m108593f(linkedList, "coupon.coupon_label");
                        C87412m.m108593f(linearLayout, "labelLayout");
                        mo23441Q(linkedList, linearLayout);
                        viewGroup.setOnClickListener(new C18613a(this.f52019S, mnVar, this, next, mo23426B().getChildCount(), i3));
                        mo23443y(viewGroup);
                    } else {
                        it = it4;
                        if (i9 == 2) {
                            View inflate2 = LayoutInflater.from(mo23426B().getContext()).inflate(C0966R.C0971layout.f6723ms, mo23426B(), false);
                            C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup2 = (ViewGroup) inflate2;
                            TextView textView3 = (TextView) viewGroup2.findViewById(C0966R.C0970id.bbf);
                            TextView textView4 = (TextView) viewGroup2.findViewById(C0966R.C0970id.bbd);
                            LinearLayout linearLayout2 = (LinearLayout) viewGroup2.findViewById(C0966R.C0970id.bbe);
                            MemberCardTopCropImageView memberCardTopCropImageView = (MemberCardTopCropImageView) viewGroup2.findViewById(C0966R.C0970id.bba);
                            ImageView imageView = (ImageView) viewGroup2.findViewById(C0966R.C0970id.bbb);
                            if (!Util.isNullOrNil(next.f64059q)) {
                                i4 = i8;
                                textView3.setTextColor(C22945n.m27002b(next.f64059q, next.f64060r));
                            } else {
                                i4 = i8;
                            }
                            textView3.setText(next.f64050e);
                            textView4.setText(next.f64051f);
                            memberCardTopCropImageView.setRadius((float) C76577a.m92151b(memberCardTopCropImageView.getContext(), 2));
                            if (!Util.isNullOrNil(next.f64054i)) {
                                String str = next.f64054i;
                                C87412m.m108593f(str, "coupon.coupon_back_url");
                                C20937c.C20939b bVar = new C20937c.C20939b();
                                bVar.f59351g = C112760b.m154195C();
                                bVar.f59350f = C76251l.m91644m(str);
                                bVar.f59346b = true;
                                bVar.f59366v = true;
                                bVar.f59345a = true;
                                bVar.f59359o = C0966R.C0969drawable.f4699kd;
                                bVar.f59355k = C76577a.m92151b(memberCardTopCropImageView.getContext(), 84);
                                bVar.f59354j = C76577a.m92145A(memberCardTopCropImageView.getContext());
                                C20828a.m22825b().mo32519h(str, memberCardTopCropImageView, bVar.mo32666a());
                                memberCardTopCropImageView.setImageMatrix(new Matrix());
                                imageView.setVisibility(0);
                            } else if (!Util.isNullOrNil(next.f64053h)) {
                                memberCardTopCropImageView.setImageDrawable(new ColorDrawable(Color.parseColor(next.f64053h)));
                                imageView.setVisibility(0);
                            }
                            LinkedList<C49871in> linkedList2 = next.f64055j;
                            C87412m.m108593f(linkedList2, "coupon.coupon_label");
                            C87412m.m108593f(linearLayout2, "labelLayout");
                            mo23441Q(linkedList2, linearLayout2);
                            viewGroup2.setOnClickListener(new C18614b(this.f52019S, mnVar, this, next, mo23426B().getChildCount(), i3));
                            mo23443y(viewGroup2);
                            if (i5 > 0 && (i7 = i7 + 1) >= i5) {
                                return;
                            }
                        }
                    }
                    i4 = i8;
                    return;
                }
                i6 = i4;
                it4 = it;
                z = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$e */
    public static final class C18622e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ CardHomePageNewUI f52053a;

        public C18622e(CardHomePageNewUI cardHomePageNewUI) {
            this.f52053a = cardHomePageNewUI;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            Dialog dialog = this.f52053a.f51976L;
            if (dialog != null) {
                dialog.dismiss();
            }
            CardHomePageNewUI cardHomePageNewUI = this.f52053a;
            cardHomePageNewUI.f51977M = null;
            ViewGroup viewGroup = cardHomePageNewUI.f51981o;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                CardHomePageNewUI cardHomePageNewUI2 = this.f52053a;
                cardHomePageNewUI2.f51965A = false;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    T t = cVar.f256796d;
                    C22536y32 y322 = (C22536y32) t;
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "retCode: %s", Integer.valueOf(y322.f64803d));
                    if (y322.f64803d == 0) {
                        cardHomePageNewUI2.f51982p = y322.f64805f;
                        cardHomePageNewUI2.f51984r = y322.f64806g == 1;
                        cardHomePageNewUI2.f51970F.clear();
                        C118435go goVar = y322.f64813q;
                        if (goVar != null) {
                            cardHomePageNewUI2.f51970F.addAll(goVar.f354035d);
                        }
                        if (!Util.isNullOrNil(y322.f64810n)) {
                            cardHomePageNewUI2.f51985s = y322.f64810n;
                        }
                        if (cardHomePageNewUI2.f51984r) {
                            LoadMoreRecyclerView loadMoreRecyclerView = cardHomePageNewUI2.f51978i;
                            if (loadMoreRecyclerView != null) {
                                loadMoreRecyclerView.mo63430I(false);
                                cardHomePageNewUI2.f51972H = y322.f64809j;
                                cardHomePageNewUI2.mo23420N7();
                            } else {
                                C87412m.m108603p("mRecyclerView");
                                throw null;
                            }
                        } else {
                            LoadMoreRecyclerView loadMoreRecyclerView2 = cardHomePageNewUI2.f51978i;
                            if (loadMoreRecyclerView2 != null) {
                                loadMoreRecyclerView2.mo63430I(true);
                            } else {
                                C87412m.m108603p("mRecyclerView");
                                throw null;
                            }
                        }
                        if (cardHomePageNewUI2.f51992z || cardHomePageNewUI2.f51975K) {
                            cardHomePageNewUI2.f51987u.clear();
                            cardHomePageNewUI2.f51988v.clear();
                            cardHomePageNewUI2.f51986t.clear();
                            cardHomePageNewUI2.f51990x = null;
                            if (cardHomePageNewUI2.f51992z) {
                                cardHomePageNewUI2.f51992z = false;
                            }
                            cardHomePageNewUI2.f51975K = false;
                        } else {
                            y322.f64814r = null;
                        }
                        cardHomePageNewUI2.mo23421O7(y322.f64807h, y322.f64808i, y322.f64814r);
                        LoadMoreRecyclerView loadMoreRecyclerView3 = cardHomePageNewUI2.f51978i;
                        if (loadMoreRecyclerView3 != null) {
                            RecyclerView.C16613e<?> adapter = loadMoreRecyclerView3.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                        } else {
                            C87412m.m108603p("mRecyclerView");
                            throw null;
                        }
                    } else {
                        if (cardHomePageNewUI2.f51992z) {
                            cardHomePageNewUI2.f51992z = false;
                        }
                        C22945n.m27018r(cardHomePageNewUI2, y322.f64804e);
                        C115669n.INSTANCE.mo160131h(16322, 31);
                    }
                    if (y322.f64811o != 1) {
                        return t;
                    }
                    cardHomePageNewUI2.f51975K = true;
                    cardHomePageNewUI2.f51982p = 0;
                    cardHomePageNewUI2.f51969E = y322.f64812p;
                    cardHomePageNewUI2.mo23419M7();
                    return t;
                }
                cardHomePageNewUI2.f51969E = 0;
                if (cardHomePageNewUI2.f51992z) {
                    cardHomePageNewUI2.f51992z = false;
                }
                C22945n.m27017q(cardHomePageNewUI2, "");
                C115669n.INSTANCE.mo160131h(16322, 31);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("mLoadingView2");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$f */
    public static final class C18623f extends RecyclerView.C0129l {

        /* renamed from: d */
        public final Paint f52054d;

        /* renamed from: e */
        public final Paint f52055e;

        /* renamed from: f */
        public final /* synthetic */ CardHomePageNewUI f52056f;

        public C18623f(CardHomePageNewUI cardHomePageNewUI) {
            this.f52056f = cardHomePageNewUI;
            Paint paint = new Paint();
            this.f52054d = paint;
            Paint paint2 = new Paint();
            this.f52055e = paint2;
            paint.setColor(cardHomePageNewUI.getResources().getColor(C0966R.color.abr));
            paint.setStyle(Paint.Style.FILL);
            paint.setFlags(1);
            paint2.setColor(cardHomePageNewUI.getResources().getColor(C0966R.color.al6));
            paint2.setStyle(Paint.Style.FILL);
            paint2.setFlags(1);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            int N0 = recyclerView.mo17029N0(view);
            C18611c cVar = this.f52056f.f51979j;
            if (cVar == null) {
                C87412m.m108603p("mHomePageAdapter");
                throw null;
            } else if (N0 == cVar.getItemCount() - 1) {
                Log.m105918d("MicroMsg.CardHomePageNewUI", "is last");
                int i = CardHomePageNewUI.f51963N;
                rect.bottom = CardHomePageNewUI.f51963N;
            } else {
                rect.bottom = 1;
            }
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(canvas, "c");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            LoadMoreRecyclerView loadMoreRecyclerView = this.f52056f.f51978i;
            if (loadMoreRecyclerView != null) {
                int paddingLeft = loadMoreRecyclerView.getPaddingLeft();
                int i = CardHomePageNewUI.f51963N;
                int i2 = paddingLeft + CardHomePageNewUI.f51964P;
                int width = loadMoreRecyclerView.getWidth() - loadMoreRecyclerView.getPaddingRight();
                int childCount = loadMoreRecyclerView.getChildCount();
                int i3 = 0;
                while (true) {
                    int i4 = 1;
                    int i5 = childCount - 1;
                    if (i3 < i5) {
                        View childAt = loadMoreRecyclerView.getChildAt(i3);
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
                        if (i3 == i5) {
                            int i6 = CardHomePageNewUI.f51963N;
                            i4 = CardHomePageNewUI.f51963N;
                        }
                        float f = (float) i2;
                        float f2 = (float) (i4 + bottom);
                        Canvas canvas2 = canvas;
                        float f3 = (float) bottom;
                        canvas2.drawRect(f, f3, (float) width, f2, this.f52054d);
                        canvas2.drawRect((float) 0, f3, f, f2, this.f52055e);
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                C87412m.m108603p("mRecyclerView");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$g */
    public static final class C18624g implements LoadMoreRecyclerView.C40579c {

        /* renamed from: a */
        public final /* synthetic */ CardHomePageNewUI f52057a;

        public C18624g(CardHomePageNewUI cardHomePageNewUI) {
            this.f52057a = cardHomePageNewUI;
        }

        /* renamed from: a */
        public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
            CardHomePageNewUI cardHomePageNewUI = this.f52057a;
            int i = CardHomePageNewUI.f51963N;
            cardHomePageNewUI.mo23419M7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$h */
    public static final class C18625h implements MRecyclerView.C40583d {

        /* renamed from: a */
        public final /* synthetic */ CardHomePageNewUI f52058a;

        public C18625h(CardHomePageNewUI cardHomePageNewUI) {
            this.f52058a = cardHomePageNewUI;
        }

        /* renamed from: a */
        public final void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
            int i2;
            int i3 = i;
            Class<CardTicketListUI> cls = CardTicketListUI.class;
            C18611c cVar = this.f52058a.f51979j;
            if (cVar != null) {
                C18610a F4 = cVar.mo23422F4(i3);
                if (F4 != null) {
                    CardHomePageNewUI cardHomePageNewUI = this.f52058a;
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "click type: %s", Integer.valueOf(F4.f51994b));
                    int i4 = F4.f51994b;
                    if (i4 == 2) {
                        cardHomePageNewUI.f51966B = true;
                        cardHomePageNewUI.f51967C = 1;
                        C22514mn mnVar = F4.f51993a;
                        cardHomePageNewUI.f51974J = mnVar;
                        C87412m.m108591d(mnVar);
                        int i5 = mnVar.f64251i;
                        if (i5 == 1) {
                            C22514mn mnVar2 = F4.f51993a;
                            C87412m.m108591d(mnVar2);
                            C53246b.m59678j(cardHomePageNewUI, mnVar2.f64252j, 0);
                        } else if (i5 == 2) {
                            C22514mn mnVar3 = F4.f51993a;
                            C87412m.m108591d(mnVar3);
                            C51997xn xnVar = mnVar3.f64253n;
                            C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                        }
                        C115669n nVar = C115669n.INSTANCE;
                        C22514mn mnVar4 = F4.f51993a;
                        C87412m.m108591d(mnVar4);
                        nVar.mo160131h(16324, 2, mnVar4.f64246d, 0, 0, 1, Integer.valueOf(i), Integer.valueOf(cardHomePageNewUI.f51969E));
                    } else if (i4 == 4) {
                        Log.m105924i("MicroMsg.CardHomePageNewUI", "click ticket item");
                        Intent intent = new Intent(cardHomePageNewUI, cls);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        CardHomePageNewUI cardHomePageNewUI2 = cardHomePageNewUI;
                        C117292a.m165358d(cardHomePageNewUI2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        cardHomePageNewUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(cardHomePageNewUI2, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        C115669n.INSTANCE.mo160131h(16322, 5);
                    } else if (i4 == 5) {
                        C115669n.INSTANCE.mo160131h(16322, 13);
                    } else if (i4 == 6) {
                        C22528rn rnVar = F4.f51998f;
                        C87412m.m108591d(rnVar);
                        int i6 = rnVar.f64552g;
                        if (i6 == 1) {
                            i2 = 0;
                            C22528rn rnVar2 = F4.f51998f;
                            C87412m.m108591d(rnVar2);
                            C53246b.m59678j(cardHomePageNewUI, rnVar2.f64553h, 0);
                            cardHomePageNewUI.f51971G = true;
                        } else if (i6 != 2) {
                            if (i6 == 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("click native url: ");
                                C22528rn rnVar3 = F4.f51998f;
                                C87412m.m108591d(rnVar3);
                                sb.append(rnVar3.f64555j);
                                Log.m105924i("MicroMsg.CardHomePageNewUI", sb.toString());
                                C22528rn rnVar4 = F4.f51998f;
                                C87412m.m108591d(rnVar4);
                                if (C87412m.m108589b("weixin://mktcard/cert", rnVar4.f64555j)) {
                                    Intent intent2 = new Intent(cardHomePageNewUI, cls);
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(intent2);
                                    CardHomePageNewUI cardHomePageNewUI3 = cardHomePageNewUI;
                                    i2 = 0;
                                    C117292a.m165358d(cardHomePageNewUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    cardHomePageNewUI.startActivity((Intent) aVar2.mo10231a(0));
                                    C117292a.m165359e(cardHomePageNewUI3, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    cardHomePageNewUI.f51971G = true;
                                }
                            }
                            i2 = 0;
                        } else {
                            i2 = 0;
                            C22528rn rnVar5 = F4.f51998f;
                            C87412m.m108591d(rnVar5);
                            C51997xn xnVar2 = rnVar5.f64554i;
                            C53246b.m59674f(xnVar2.f144755d, xnVar2.f144756e, xnVar2.f144757f);
                            cardHomePageNewUI.f51971G = true;
                        }
                        C22528rn rnVar6 = F4.f51998f;
                        C87412m.m108591d(rnVar6);
                        rnVar6.f64557o = i2;
                        C22528rn rnVar7 = F4.f51998f;
                        C87412m.m108591d(rnVar7);
                        rnVar7.f64556n = i2;
                        C18611c cVar2 = cardHomePageNewUI.f51979j;
                        if (cVar2 != null) {
                            cVar2.notifyItemChanged(i3);
                        } else {
                            C87412m.m108603p("mHomePageAdapter");
                            throw null;
                        }
                    }
                }
            } else {
                C87412m.m108603p("mHomePageAdapter");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$j */
    public static final class C18626j implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageNewUI f52059d;

        public C18626j(CardHomePageNewUI cardHomePageNewUI) {
            this.f52059d = cardHomePageNewUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52059d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$k */
    public static final class C18627k implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageNewUI f52060d;

        /* renamed from: e */
        public final /* synthetic */ C22517nn f52061e;

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$k$a */
        public static final class C18628a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C22517nn f52062d;

            public C18628a(C22517nn nnVar) {
                this.f52062d = nnVar;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.add(0, 0, 1, (CharSequence) this.f52062d.f64329d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$k$b */
        public static final class C18629b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C22517nn f52063d;

            /* renamed from: e */
            public final /* synthetic */ CardHomePageNewUI f52064e;

            public C18629b(C22517nn nnVar, CardHomePageNewUI cardHomePageNewUI) {
                this.f52063d = nnVar;
                this.f52064e = cardHomePageNewUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 0) {
                    C22517nn nnVar = this.f52063d;
                    int i2 = nnVar.f64330e;
                    if (i2 == 1) {
                        C53246b.m59678j(this.f52064e, nnVar.f64331f, 0);
                    } else if (i2 == 2) {
                        C51997xn xnVar = nnVar.f64332g;
                        C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    }
                }
            }
        }

        public C18627k(CardHomePageNewUI cardHomePageNewUI, C22517nn nnVar) {
            this.f52060d = cardHomePageNewUI;
            this.f52061e = nnVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) this.f52060d.getContext(), 1, false);
            C22517nn nnVar = this.f52061e;
            nVar.f225771i = new C18628a(nnVar);
            nVar.f225782p = new C18629b(nnVar, this.f52060d);
            nVar.mo107573q();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$i */
    public static final class C18630i implements MRecyclerView.C40584e {

        /* renamed from: a */
        public final /* synthetic */ CardHomePageNewUI f52065a;

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$i$a */
        public static final class C18631a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52066d;

            public C18631a(CardHomePageNewUI cardHomePageNewUI) {
                this.f52066d = cardHomePageNewUI;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(1, this.f52066d.getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$i$b */
        public static final class C18632b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ CardHomePageNewUI f52067d;

            /* renamed from: e */
            public final /* synthetic */ C18610a f52068e;

            /* renamed from: f */
            public final /* synthetic */ int f52069f;

            /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$i$b$a */
            public static final class C18633a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ CardHomePageNewUI f52070d;

                /* renamed from: e */
                public final /* synthetic */ C18610a f52071e;

                /* renamed from: f */
                public final /* synthetic */ int f52072f;

                public C18633a(CardHomePageNewUI cardHomePageNewUI, C18610a aVar, int i) {
                    this.f52070d = cardHomePageNewUI;
                    this.f52071e = aVar;
                    this.f52072f = i;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    CardHomePageNewUI cardHomePageNewUI = this.f52070d;
                    C22514mn mnVar = this.f52071e.f51993a;
                    C87412m.m108591d(mnVar);
                    String str = mnVar.f64246d;
                    C87412m.m108593f(str, "element!!.card_pack_merchant_id");
                    cardHomePageNewUI.getClass();
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "do delete merchant: %s", str);
                    new C46819k(str).mo9225i().mo123062e(new C48510a(cardHomePageNewUI, str));
                    dialogInterface.dismiss();
                    C115669n nVar = C115669n.INSTANCE;
                    C22514mn mnVar2 = this.f52071e.f51993a;
                    C87412m.m108591d(mnVar2);
                    nVar.mo160131h(16324, 2, mnVar2.f64246d, 0, 0, 9, Integer.valueOf(this.f52072f), Integer.valueOf(this.f52070d.f51969E));
                }
            }

            public C18632b(CardHomePageNewUI cardHomePageNewUI, C18610a aVar, int i) {
                this.f52067d = cardHomePageNewUI;
                this.f52068e = aVar;
                this.f52069f = i;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 1) {
                    C76879j.m92713G(this.f52067d.getContext(), this.f52067d.getString(C0966R.string.ayt), "", false, new C18633a(this.f52067d, this.f52068e, this.f52069f));
                    C115669n nVar = C115669n.INSTANCE;
                    C22514mn mnVar = this.f52068e.f51993a;
                    C87412m.m108591d(mnVar);
                    nVar.mo160131h(16324, 2, mnVar.f64246d, 0, 0, 8, Integer.valueOf(this.f52069f), Integer.valueOf(this.f52067d.f51969E));
                }
            }
        }

        public C18630i(CardHomePageNewUI cardHomePageNewUI) {
            this.f52065a = cardHomePageNewUI;
        }

        /* renamed from: a */
        public final boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
            C18611c cVar = this.f52065a.f51979j;
            if (cVar != null) {
                C18610a F4 = cVar.mo23422F4(i);
                if (F4 != null) {
                    CardHomePageNewUI cardHomePageNewUI = this.f52065a;
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "long click type: %s", Integer.valueOf(F4.f51994b));
                    if (F4.f51994b == 2) {
                        AppCompatActivity context = cardHomePageNewUI.getContext();
                        LayoutInflater.from(context);
                        C77407n nVar = new C77407n((Context) context, 1, false);
                        C76874e0 e0Var = new C76874e0(context);
                        new C76874e0(context);
                        C18631a aVar = new C18631a(cardHomePageNewUI);
                        C18632b bVar = new C18632b(cardHomePageNewUI, F4, i);
                        e0Var.clear();
                        C76874e0 e0Var2 = new C76874e0(context);
                        aVar.onCreateMMMenu(e0Var2);
                        if (e0Var2.mo107176v()) {
                            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                        } else {
                            nVar.f225771i = aVar;
                            nVar.f225782p = bVar;
                            nVar.f225761d = null;
                            nVar.f225725D = null;
                            nVar.mo107573q();
                        }
                        C115669n nVar2 = C115669n.INSTANCE;
                        C22514mn mnVar = F4.f51993a;
                        C87412m.m108591d(mnVar);
                        nVar2.mo160131h(16324, 2, mnVar.f64246d, 0, 0, 7, Integer.valueOf(i), Integer.valueOf(cardHomePageNewUI.f51969E));
                    }
                }
                return false;
            }
            C87412m.m108603p("mHomePageAdapter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$b */
    public final class C18634b extends C75359b0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18634b(CardHomePageNewUI cardHomePageNewUI, int i, int i2, C45336q qVar) {
            super(i, i2);
            C87412m.m108594g(qVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.mClickListener = qVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            C45336q qVar = this.mClickListener;
            if (qVar != null) {
                qVar.mo23448a(view, (C53155r0) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 1);
    }

    /* renamed from: L7 */
    public static final void m19369L7(CardHomePageNewUI cardHomePageNewUI) {
        if (cardHomePageNewUI.f51970F != null) {
            C77407n nVar = new C77407n((Context) cardHomePageNewUI.getContext(), 1, false);
            nVar.f225771i = new C22417c(cardHomePageNewUI);
            nVar.f225782p = new C22418d(cardHomePageNewUI);
            nVar.mo107573q();
        }
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
        Log.m105925i("MicroMsg.CardHomePageNewUI", "location finish: [%s, %s], ret: %s, isOk: %s", Float.valueOf(this.f52073d), Float.valueOf(this.f52074e), Integer.valueOf(i), Boolean.valueOf(z));
        if (this.f51992z) {
            if (this.f51968D == 1 && i < 0 && this.f51969E == 1) {
                this.f51969E = 0;
                if (i == -2) {
                    C115669n.INSTANCE.mo160131h(16322, 30);
                }
            }
            mo23419M7();
        } else if (!z) {
            mo23460K7();
        }
    }

    /* renamed from: M7 */
    public final void mo23419M7() {
        Log.m105925i("MicroMsg.CardHomePageNewUI", "do get card Home page: %s, %s", Boolean.valueOf(this.f51984r), Boolean.valueOf(this.f51965A));
        boolean z = this.f51975K;
        if (z || (!this.f51984r && !this.f51965A)) {
            this.f51965A = true;
            C118431fo foVar = null;
            if (z) {
                ViewGroup viewGroup = this.f51981o;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                } else {
                    C87412m.m108603p("mLoadingView2");
                    throw null;
                }
            }
            Iterator<C118431fo> it = this.f51970F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C118431fo next = it.next();
                if (next.f354004d == this.f51969E) {
                    foVar = next;
                    break;
                }
            }
            this.f51983q = foVar != null ? foVar.f354005e : 10;
            Dialog dialog = this.f51976L;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (this.f51987u.isEmpty()) {
                this.f51976L = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.f7961xj), getContext().getString(C0966R.string.gas), false, true, (DialogInterface.OnCancelListener) null);
            }
            C46824n nVar = new C46824n(this.f51982p, this.f51983q, (double) this.f52073d, (double) this.f52074e, 1, this.f51969E);
            this.f51977M = nVar;
            nVar.f256791h = true;
            nVar.mo9225i().mo123062e(new C18622e(this)).mo11397F(this);
        }
    }

    /* renamed from: N7 */
    public final void mo23420N7() {
        C22517nn nnVar = this.f51972H;
        if (nnVar != null && !Util.isNullOrNil(nnVar.f64329d)) {
            removeAllOptionMenu();
            addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C18627k(this, nnVar));
        }
    }

    /* renamed from: O7 */
    public final void mo23421O7(C50983qn qnVar, C51569un unVar, C64732tn tnVar) {
        int i = 0;
        if (qnVar != null) {
            LinkedList<C22514mn> linkedList = qnVar.f140399d;
            C87412m.m108593f(linkedList, "card_home_page_element");
            if (!linkedList.isEmpty()) {
                Iterator<C22514mn> it = qnVar.f140399d.iterator();
                while (it.hasNext()) {
                    C18610a aVar = new C18610a(this);
                    aVar.f51993a = it.next();
                    aVar.f51994b = 0;
                    this.f51987u.add(aVar);
                }
            }
        }
        if (unVar != null) {
            LinkedList<C22514mn> linkedList2 = unVar.f142953d;
            C87412m.m108593f(linkedList2, "card_home_page_element");
            if (!linkedList2.isEmpty()) {
                if (Util.isNullOrNil(unVar.f142954e)) {
                    unVar.f142954e = getString(C0966R.string.f360222ay3);
                }
                if (this.f51990x == null) {
                    C18610a aVar2 = new C18610a(this);
                    this.f51990x = aVar2;
                    aVar2.f51994b = 1;
                }
                C18610a aVar3 = this.f51990x;
                C87412m.m108591d(aVar3);
                String str = unVar.f142954e;
                C87412m.m108593f(str, "section_title");
                aVar3.f51995c = str;
                Iterator<C22514mn> it4 = unVar.f142953d.iterator();
                while (it4.hasNext()) {
                    C18610a aVar4 = new C18610a(this);
                    aVar4.f51993a = it4.next();
                    aVar4.f51994b = 2;
                    this.f51988v.add(aVar4);
                }
            }
        }
        if (tnVar != null) {
            LinkedList<C22528rn> linkedList3 = tnVar.f185620d;
            C87412m.m108593f(linkedList3, "card_home_page_top_cell");
            if (!linkedList3.isEmpty()) {
                Iterator<C22528rn> it5 = tnVar.f185620d.iterator();
                while (it5.hasNext()) {
                    int i2 = i + 1;
                    C18610a aVar5 = new C18610a(this);
                    aVar5.f51998f = it5.next();
                    aVar5.f51994b = 6;
                    if (i == tnVar.f185620d.size() - 1) {
                        aVar5.f51999g = true;
                    }
                    this.f51986t.add(aVar5);
                    i = i2;
                }
            }
        }
        C18610a aVar6 = new C18610a(this);
        this.f51991y = aVar6;
        aVar6.f51994b = 5;
        if (!this.f51987u.isEmpty() || !this.f51988v.isEmpty() || !(!this.f51986t.isEmpty())) {
            this.f51989w = null;
            return;
        }
        C18610a aVar7 = new C18610a(this);
        this.f51989w = aVar7;
        aVar7.f51994b = 7;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6731n0;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bcf);
        C87412m.m108593f(findViewById, "findViewById(R.id.chpu_rv)");
        LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) findViewById;
        this.f51978i = loadMoreRecyclerView;
        loadMoreRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C18611c cVar = new C18611c();
        this.f51979j = cVar;
        LoadMoreRecyclerView loadMoreRecyclerView2 = this.f51978i;
        if (loadMoreRecyclerView2 != null) {
            loadMoreRecyclerView2.setAdapter(cVar);
            LayoutInflater from = LayoutInflater.from(this);
            LoadMoreRecyclerView loadMoreRecyclerView3 = this.f51978i;
            if (loadMoreRecyclerView3 != null) {
                boolean z = false;
                View inflate = from.inflate(C0966R.C0971layout.f6728mx, loadMoreRecyclerView3, false);
                C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                this.f51980n = (ViewGroup) inflate;
                View findViewById2 = findViewById(C0966R.C0970id.bce);
                C87412m.m108593f(findViewById2, "findViewById(R.id.chpu_loading_layout)");
                this.f51981o = (ViewGroup) findViewById2;
                LoadMoreRecyclerView loadMoreRecyclerView4 = this.f51978i;
                if (loadMoreRecyclerView4 != null) {
                    ViewGroup viewGroup = this.f51980n;
                    if (viewGroup != null) {
                        loadMoreRecyclerView4.setLoadingView((View) viewGroup);
                        C18623f fVar = new C18623f(this);
                        LoadMoreRecyclerView loadMoreRecyclerView5 = this.f51978i;
                        if (loadMoreRecyclerView5 != null) {
                            loadMoreRecyclerView5.mo17085h0(fVar);
                            LoadMoreRecyclerView loadMoreRecyclerView6 = this.f51978i;
                            if (loadMoreRecyclerView6 != null) {
                                loadMoreRecyclerView6.setOnLoadingStateChangedListener(new C18624g(this));
                                LoadMoreRecyclerView loadMoreRecyclerView7 = this.f51978i;
                                if (loadMoreRecyclerView7 != null) {
                                    loadMoreRecyclerView7.setOnItemClickListener(new C18625h(this));
                                    LoadMoreRecyclerView loadMoreRecyclerView8 = this.f51978i;
                                    if (loadMoreRecyclerView8 != null) {
                                        loadMoreRecyclerView8.setOnItemLongClickListener(new C18630i(this));
                                        C50983qn qnVar = new C50983qn();
                                        C51569un unVar = new C51569un();
                                        C64732tn tnVar = new C64732tn();
                                        C118435go goVar = new C118435go();
                                        C22517nn nnVar = this.f51972H;
                                        Log.m105924i("MicroMsg.CardSnapshotMgr", "load home page snapshot");
                                        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_STORE_LIST_STRING_SYNC, (Object) null);
                                        boolean z2 = true;
                                        if (str != null) {
                                            byte[] bytes = str.getBytes(C119027c.f356489b);
                                            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                            qnVar.parseFrom(bytes);
                                            z = true;
                                        }
                                        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_UNDER_LIST_STRING_SYNC, (Object) null);
                                        if (str2 != null) {
                                            byte[] bytes2 = str2.getBytes(C119027c.f356489b);
                                            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                                            unVar.parseFrom(bytes2);
                                            z = true;
                                        }
                                        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_TOP_LIST_STRING_SYNC, (Object) null);
                                        if (str3 != null) {
                                            byte[] bytes3 = str3.getBytes(C119027c.f356489b);
                                            C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
                                            tnVar.parseFrom(bytes3);
                                            z = true;
                                        }
                                        String str4 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, (Object) null);
                                        if (str4 != null) {
                                            byte[] bytes4 = str4.getBytes(C119027c.f356489b);
                                            C87412m.m108593f(bytes4, "this as java.lang.String).getBytes(charset)");
                                            goVar.parseFrom(bytes4);
                                            z = true;
                                        }
                                        String str5 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, (Object) null);
                                        if (str5 == null) {
                                            z2 = z;
                                        } else if (nnVar != null) {
                                            byte[] bytes5 = str5.getBytes(C119027c.f356489b);
                                            C87412m.m108593f(bytes5, "this as java.lang.String).getBytes(charset)");
                                            nnVar.parseFrom(bytes5);
                                        }
                                        this.f51970F.clear();
                                        this.f51970F.addAll(goVar.f354035d);
                                        mo23421O7(qnVar, unVar, tnVar);
                                        if (!z2 && this.f51987u.isEmpty() && this.f51988v.isEmpty()) {
                                            Log.m105924i("MicroMsg.CardHomePageNewUI", "show init view");
                                            C18610a aVar = new C18610a(this);
                                            aVar.f51994b = 3;
                                            C18610a aVar2 = new C18610a(this);
                                            aVar2.f51994b = 3;
                                            this.f51987u.add(aVar);
                                            this.f51987u.add(aVar2);
                                        }
                                        mo23420N7();
                                        LoadMoreRecyclerView loadMoreRecyclerView9 = this.f51978i;
                                        if (loadMoreRecyclerView9 != null) {
                                            RecyclerView.C16613e<?> adapter = loadMoreRecyclerView9.getAdapter();
                                            if (adapter != null) {
                                                adapter.notifyDataSetChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        C87412m.m108603p("mRecyclerView");
                                        throw null;
                                    }
                                    C87412m.m108603p("mRecyclerView");
                                    throw null;
                                }
                                C87412m.m108603p("mRecyclerView");
                                throw null;
                            }
                            C87412m.m108603p("mRecyclerView");
                            throw null;
                        }
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                    C87412m.m108603p("mLoadingView");
                    throw null;
                }
                C87412m.m108603p("mRecyclerView");
                throw null;
            }
            C87412m.m108603p("mRecyclerView");
            throw null;
        }
        C87412m.m108603p("mRecyclerView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        setMMTitle((int) C0966R.string.aym);
        this.f51973I = getIntent().getIntExtra("key_home_page_from_scene", 0);
        initView();
        this.f51968D = 1;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, 1);
        this.f51969E = j;
        if (j == 0) {
            this.f51969E = 1;
        }
        if (this.f51968D == 1) {
            C115669n.INSTANCE.mo160131h(16322, 14);
        }
        Log.m105925i("MicroMsg.CardHomePageNewUI", "on create, scene: %s", Integer.valueOf(this.f51973I));
        setBackBtn(new C18626j(this));
        C115669n.INSTANCE.mo160131h(16322, 4);
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this, 8, 2);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.CardHomePageNewUI).mo86179qs(this, C76986a.Cards);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, Integer.valueOf(this.f51969E));
        C46824n nVar = this.f51977M;
        String str = null;
        if (nVar != null) {
            nVar.mo85581g();
            this.f51977M = null;
        }
        C45995o.m51273a();
        Log.m105924i("MicroMsg.CardHomePageNewUI", "do save snap shot");
        C50983qn qnVar = new C50983qn();
        qnVar.f140399d = new LinkedList<>();
        Iterator<C18610a> it = this.f51987u.iterator();
        while (it.hasNext()) {
            C22514mn mnVar = it.next().f51993a;
            if (mnVar != null) {
                qnVar.f140399d.add(mnVar);
            }
        }
        C51569un unVar = new C51569un();
        C18610a aVar = this.f51990x;
        if (aVar != null) {
            String str2 = aVar.f51995c;
            if (str2 != null) {
                str = str2;
            } else {
                C87412m.m108603p("sectionTitle");
                throw null;
            }
        }
        unVar.f142954e = str;
        unVar.f142953d = new LinkedList<>();
        Iterator<C18610a> it4 = this.f51988v.iterator();
        while (it4.hasNext()) {
            C22514mn mnVar2 = it4.next().f51993a;
            if (mnVar2 != null) {
                unVar.f142953d.add(mnVar2);
            }
        }
        C64732tn tnVar = new C64732tn();
        Iterator<C18610a> it5 = this.f51986t.iterator();
        while (it5.hasNext()) {
            C22528rn rnVar = it5.next().f51998f;
            if (rnVar != null) {
                tnVar.f185620d.add(rnVar);
            }
        }
        C118435go goVar = new C118435go();
        goVar.f354035d.addAll(this.f51970F);
        C22517nn nnVar = this.f51972H;
        Log.m105924i("MicroMsg.CardSnapshotMgr", "save home page snapshot");
        byte[] byteArray = qnVar.toByteArray();
        C87412m.m108593f(byteArray, "storeList.toByteArray()");
        Charset charset = C119027c.f356489b;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_STORE_LIST_STRING_SYNC, new String(byteArray, charset));
        byte[] byteArray2 = unVar.toByteArray();
        C87412m.m108593f(byteArray2, "underList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_UNDER_LIST_STRING_SYNC, new String(byteArray2, charset));
        byte[] byteArray3 = tnVar.toByteArray();
        C87412m.m108593f(byteArray3, "topList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_TOP_LIST_STRING_SYNC, new String(byteArray3, charset));
        byte[] byteArray4 = goVar.toByteArray();
        C87412m.m108593f(byteArray4, "sortInfoList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, new String(byteArray4, charset));
        if (nnVar != null) {
            byte[] byteArray5 = nnVar.toByteArray();
            C87412m.m108593f(byteArray5, "faqItem.toByteArray()");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, new String(byteArray5, charset));
        }
    }

    public void onResume() {
        C22514mn mnVar;
        super.onResume();
        if (this.f51966B && (mnVar = this.f51974J) != null && this.f51967C != -1) {
            C87412m.m108591d(mnVar);
            String str = mnVar.f64246d;
            C87412m.m108593f(str, "clickedCardHomePageElement!!.card_pack_merchant_id");
            C22514mn mnVar2 = this.f51974J;
            C87412m.m108591d(mnVar2);
            long j = mnVar2.f64263x;
            Log.m105925i("MicroMsg.CardHomePageNewUI", "do get mch infoset: %s", str);
            new C46823m(str, j, (double) this.f52073d, (double) this.f52074e, this.f51969E, 0).mo9225i().mo123062e(new C48511b(this, str));
            this.f51966B = false;
            this.f51974J = null;
        } else if (this.f51971G) {
            this.f51975K = true;
            this.f51982p = 0;
            this.f51971G = false;
            mo23419M7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI$c */
    public final class C18611c extends RecyclerView.C16613e<C18612d> {
        public C18611c() {
        }

        /* renamed from: F4 */
        public final C18610a mo23422F4(int i) {
            Object[] objArr = new Object[4];
            int i2 = 0;
            objArr[0] = Integer.valueOf(i);
            ArrayList<C18610a> arrayList = CardHomePageNewUI.this.f51987u;
            objArr[1] = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
            ArrayList<C18610a> arrayList2 = CardHomePageNewUI.this.f51987u;
            objArr[2] = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
            objArr[3] = Boolean.valueOf(CardHomePageNewUI.this.f51990x != null);
            Log.m105919d("MicroMsg.CardHomePageNewUI", "pos: %s, sSize: %s, uSize: %s, title: %s", objArr);
            ArrayList<C18610a> arrayList3 = CardHomePageNewUI.this.f51986t;
            if (arrayList3 != null) {
                int i3 = i + 0;
                if (i3 < arrayList3.size()) {
                    return arrayList3.get(i3);
                }
                i2 = arrayList3.size();
            }
            CardHomePageNewUI cardHomePageNewUI = CardHomePageNewUI.this;
            C18610a aVar = cardHomePageNewUI.f51991y;
            if (aVar != null) {
                if (i == i2) {
                    return aVar;
                }
                i2++;
            }
            C18610a aVar2 = cardHomePageNewUI.f51989w;
            if (aVar2 != null && i == i2) {
                return aVar2;
            }
            ArrayList<C18610a> arrayList4 = cardHomePageNewUI.f51987u;
            if (arrayList4 != null) {
                int i4 = i - i2;
                if (i4 < arrayList4.size()) {
                    return arrayList4.get(i4);
                }
                i2 = arrayList4.size() - 1;
            }
            CardHomePageNewUI cardHomePageNewUI2 = CardHomePageNewUI.this;
            C18610a aVar3 = cardHomePageNewUI2.f51990x;
            if (aVar3 != null && i == (i2 = i2 + 1)) {
                return aVar3;
            }
            ArrayList<C18610a> arrayList5 = cardHomePageNewUI2.f51988v;
            if (arrayList5 == null || i <= i2 || i > arrayList5.size() + i2) {
                return null;
            }
            return arrayList5.get((i - i2) - 1);
        }

        /* renamed from: G4 */
        public final int mo23423G4(String str) {
            C87412m.m108594g(str, "merchantId");
            CardHomePageNewUI cardHomePageNewUI = CardHomePageNewUI.this;
            int i = 0;
            int i2 = cardHomePageNewUI.f51986t != null ? 1 : 0;
            if (cardHomePageNewUI.f51991y != null) {
                i2++;
            }
            Iterator<C18610a> it = cardHomePageNewUI.f51987u.iterator();
            int i3 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    int i4 = i3 + 1;
                    C22514mn mnVar = it.next().f51993a;
                    if (mnVar != null) {
                        str2 = mnVar.f64246d;
                    }
                    if (C87412m.m108589b(str2, str)) {
                        return i2 + i3;
                    }
                    i3 = i4;
                } else {
                    int size = (i2 + CardHomePageNewUI.this.f51987u.size()) - 1;
                    CardHomePageNewUI cardHomePageNewUI2 = CardHomePageNewUI.this;
                    if (cardHomePageNewUI2.f51990x != null) {
                        size++;
                    }
                    Iterator<C18610a> it4 = cardHomePageNewUI2.f51988v.iterator();
                    while (it4.hasNext()) {
                        int i5 = i + 1;
                        C22514mn mnVar2 = it4.next().f51993a;
                        if (C87412m.m108589b(mnVar2 != null ? mnVar2.f64246d : null, str)) {
                            return size + i + 1;
                        }
                        i = i5;
                    }
                    return -1;
                }
            }
        }

        /* renamed from: O4 */
        public final void mo23424O4(String str) {
            C87412m.m108594g(str, "merchantId");
            Iterator<C18610a> it = CardHomePageNewUI.this.f51987u.iterator();
            while (it.hasNext()) {
                C18610a next = it.next();
                C22514mn mnVar = next.f51993a;
                if (C87412m.m108589b(mnVar != null ? mnVar.f64246d : null, str)) {
                    CardHomePageNewUI.this.f51987u.remove(next);
                    LoadMoreRecyclerView loadMoreRecyclerView = CardHomePageNewUI.this.f51978i;
                    if (loadMoreRecyclerView != null) {
                        RecyclerView.C16613e<?> adapter = loadMoreRecyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("mRecyclerView");
                    throw null;
                }
            }
            Iterator<C18610a> it4 = CardHomePageNewUI.this.f51988v.iterator();
            while (it4.hasNext()) {
                C18610a next2 = it4.next();
                C22514mn mnVar2 = next2.f51993a;
                if (C87412m.m108589b(mnVar2 != null ? mnVar2.f64246d : null, str)) {
                    CardHomePageNewUI.this.f51988v.remove(next2);
                    if (CardHomePageNewUI.this.f51988v.size() == 0) {
                        CardHomePageNewUI cardHomePageNewUI = CardHomePageNewUI.this;
                        cardHomePageNewUI.f51990x = null;
                        LoadMoreRecyclerView loadMoreRecyclerView2 = cardHomePageNewUI.f51978i;
                        if (loadMoreRecyclerView2 != null) {
                            RecyclerView.C16613e<?> adapter2 = loadMoreRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                    return;
                }
            }
        }

        /* renamed from: g5 */
        public final void mo23425g5(String str, C22514mn mnVar) {
            C87412m.m108594g(str, "merchantId");
            C87412m.m108594g(mnVar, "mchInfo");
            Iterator<C18610a> it = CardHomePageNewUI.this.f51987u.iterator();
            while (it.hasNext()) {
                C18610a next = it.next();
                C22514mn mnVar2 = next.f51993a;
                if (C87412m.m108589b(mnVar2 != null ? mnVar2.f64246d : null, str)) {
                    next.f51993a = mnVar;
                    int G4 = mo23423G4(str);
                    if (G4 >= 0) {
                        LoadMoreRecyclerView loadMoreRecyclerView = CardHomePageNewUI.this.f51978i;
                        if (loadMoreRecyclerView != null) {
                            RecyclerView.C16613e<?> adapter = loadMoreRecyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemChanged(G4, Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                    return;
                }
            }
            Iterator<C18610a> it4 = CardHomePageNewUI.this.f51988v.iterator();
            while (it4.hasNext()) {
                C18610a next2 = it4.next();
                C22514mn mnVar3 = next2.f51993a;
                if (C87412m.m108589b(mnVar3 != null ? mnVar3.f64246d : null, str)) {
                    next2.f51993a = mnVar;
                    int G42 = mo23423G4(str);
                    if (G42 >= 0) {
                        LoadMoreRecyclerView loadMoreRecyclerView2 = CardHomePageNewUI.this.f51978i;
                        if (loadMoreRecyclerView2 != null) {
                            RecyclerView.C16613e<?> adapter2 = loadMoreRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyItemChanged(G42, Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                    return;
                }
            }
        }

        public int getItemCount() {
            ArrayList<C18610a> arrayList = CardHomePageNewUI.this.f51987u;
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList<C18610a> arrayList2 = CardHomePageNewUI.this.f51988v;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            CardHomePageNewUI cardHomePageNewUI = CardHomePageNewUI.this;
            int i = 1;
            int i2 = cardHomePageNewUI.f51990x != null ? 1 : 0;
            cardHomePageNewUI.getClass();
            CardHomePageNewUI cardHomePageNewUI2 = CardHomePageNewUI.this;
            int i3 = cardHomePageNewUI2.f51991y != null ? 1 : 0;
            ArrayList<C18610a> arrayList3 = cardHomePageNewUI2.f51986t;
            int size3 = arrayList3 != null ? arrayList3.size() : 0;
            if (CardHomePageNewUI.this.f51989w == null) {
                i = 0;
            }
            return size + size2 + i2 + 0 + i3 + size3 + i;
        }

        public int getItemViewType(int i) {
            C18610a F4 = mo23422F4(i);
            if (F4 != null) {
                return F4.f51994b;
            }
            return 3;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C18612d dVar = (C18612d) zVar;
            C87412m.m108594g(dVar, "holder");
            Log.m105919d("MicroMsg.CardHomePageNewUI", "bind view: %s", Integer.valueOf(i));
            C18610a F4 = mo23422F4(i);
            if (F4 != null) {
                int i2 = C18612d.f52001T;
                dVar.mo23437M(F4, i, false);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            int i2 = C0966R.C0971layout.f6730mz;
            switch (i) {
                case 0:
                    i2 = C0966R.C0971layout.f6727mw;
                    break;
                case 1:
                    i2 = C0966R.C0971layout.f6729my;
                    break;
                case 2:
                case 3:
                    i2 = C0966R.C0971layout.f6721mq;
                    break;
                case 4:
                case 6:
                    break;
                case 5:
                    i2 = C0966R.C0971layout.f6722mr;
                    break;
                case 7:
                    i2 = C0966R.C0971layout.f6726mv;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
            CardHomePageNewUI cardHomePageNewUI = CardHomePageNewUI.this;
            C87412m.m108593f(inflate, "itemView");
            return new C18612d(cardHomePageNewUI, inflate, i);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C18612d dVar = (C18612d) zVar;
            C87412m.m108594g(dVar, "holder");
            C87412m.m108594g(list, "payloads");
            if (!(!list.isEmpty()) || !C87412m.m108589b(list.get(0), Boolean.TRUE)) {
                super.onBindViewHolder(dVar, i, list);
                return;
            }
            C18610a F4 = mo23422F4(i);
            if (F4 != null) {
                dVar.mo23437M(F4, i, false);
            }
        }
    }
}
