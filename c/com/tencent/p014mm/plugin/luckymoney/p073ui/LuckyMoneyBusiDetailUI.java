package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetFestivalLuckyMoneyResEvent;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69203d1;
import com.tencent.p014mm.plugin.luckymoney.model.C69206d2;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69245l2;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.model.C69249n;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f32.C75674c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI */
public class LuckyMoneyBusiDetailUI extends LuckyMoneyBaseUI {

    /* renamed from: P */
    public static final /* synthetic */ int f199679P = 0;

    /* renamed from: A */
    public boolean f199680A = false;

    /* renamed from: B */
    public int f199681B;

    /* renamed from: C */
    public String f199682C;

    /* renamed from: D */
    public String f199683D;

    /* renamed from: E */
    public String f199684E;

    /* renamed from: F */
    public String f199685F;

    /* renamed from: G */
    public int f199686G = 0;

    /* renamed from: H */
    public List<C69236j1> f199687H = new LinkedList();

    /* renamed from: I */
    public Map<String, Integer> f199688I = new HashMap();

    /* renamed from: J */
    public C69699u4 f199689J;

    /* renamed from: K */
    public String f199690K = "";

    /* renamed from: L */
    public boolean f199691L = false;

    /* renamed from: M */
    public boolean f199692M = false;

    /* renamed from: N */
    public AbsListView.OnScrollListener f199693N = new C69343b();

    /* renamed from: g */
    public ListView f199694g;

    /* renamed from: h */
    public ImageView f199695h;

    /* renamed from: i */
    public TextView f199696i;

    /* renamed from: j */
    public TextView f199697j;

    /* renamed from: n */
    public View f199698n;

    /* renamed from: o */
    public TextView f199699o;

    /* renamed from: p */
    public LuckyMoneyWishFooter f199700p;

    /* renamed from: q */
    public View f199701q;

    /* renamed from: r */
    public TextView f199702r;

    /* renamed from: s */
    public ImageView f199703s;

    /* renamed from: t */
    public View f199704t;

    /* renamed from: u */
    public TextView f199705u;

    /* renamed from: v */
    public View f199706v;

    /* renamed from: w */
    public ImageView f199707w;

    /* renamed from: x */
    public View f199708x;

    /* renamed from: y */
    public int f199709y = 0;

    /* renamed from: z */
    public boolean f199710z = true;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI$a */
    public class C69342a implements DialogInterface.OnClickListener {
        public C69342a(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI$b */
    public class C69343b implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f199711d = false;

        /* renamed from: e */
        public boolean f199712e;

        public C69343b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i3 == 0 || !this.f199711d) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            boolean z = true;
            if (i <= 0) {
                View childAt = absListView.getChildAt(i);
                if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                    z = false;
                }
            }
            if (this.f199712e != z) {
                if (z) {
                    LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = LuckyMoneyBusiDetailUI.this;
                    luckyMoneyBusiDetailUI.getResources().getDrawable(C0966R.C0969drawable.c5k);
                    luckyMoneyBusiDetailUI.getClass();
                } else {
                    LuckyMoneyBusiDetailUI.this.getClass();
                }
                this.f199712e = z;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (absListView.getCount() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            boolean z = true;
            if (i == 0) {
                if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                    C69203d1 d1Var = LuckyMoneyBusiDetailUI.this.f199660d;
                    if (d1Var.f199127g.isEmpty() && d1Var.f199126f.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        LuckyMoneyBusiDetailUI.this.f199680A = false;
                    }
                    LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = LuckyMoneyBusiDetailUI.this;
                    if (luckyMoneyBusiDetailUI.f199710z && !luckyMoneyBusiDetailUI.f199680A) {
                        luckyMoneyBusiDetailUI.mo95532K7();
                    }
                }
                this.f199711d = false;
            } else if (i == 1) {
                this.f199711d = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    public static void fixBackgroundRepeat(View view) {
        Drawable background;
        if (view != null && (background = view.getBackground()) != null && (background instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) background;
            bitmapDrawable.mutate();
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        }
    }

    /* renamed from: J7 */
    public final void mo95531J7() {
        LuckyMoneyWishFooter luckyMoneyWishFooter = this.f199700p;
        if (luckyMoneyWishFooter != null && luckyMoneyWishFooter.getVisibility() != 8) {
            this.f199700p.setVisibility(8);
        }
    }

    /* renamed from: K7 */
    public final void mo95532K7() {
        this.f199680A = true;
        if (this.f199709y > 0 && ((LinkedList) this.f199687H).size() > 0) {
            List<C69236j1> list = this.f199687H;
            if (((LinkedList) list).get(((LinkedList) list).size() - 1) != null) {
                String str = this.f199682C;
                int i = this.f199709y;
                String str2 = this.f199684E;
                List<C69236j1> list2 = this.f199687H;
                doSceneProgress(new C69267u1(str, 11, i, str2, Util.getLong(((C69236j1) ((LinkedList) list2).get(((LinkedList) list2).size() - 1)).f199215g, 0), "v1.0", this.f199690K));
                return;
            }
        }
        this.f199690K = "";
        doSceneProgress(new C69267u1(this.f199682C, 11, this.f199709y, this.f199684E, "v1.0", ""));
    }

    /* renamed from: L7 */
    public final void mo95533L7(C69158a0 a0Var) {
        int i;
        int i2;
        char c;
        String str;
        C69249n nVar;
        C69158a0 a0Var2 = a0Var;
        if (a0Var2 != null) {
            if (!C69242l1.m81611q() || (nVar = a0Var2.f198941C) == null || nVar.f199277d == 1) {
                getWindow().setStatusBarColor(-1186093);
                this.f199692M = false;
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di);
                loadAnimation.setDuration(250);
                getContentView().startAnimation(loadAnimation);
                setContentViewVisibility(0);
                this.f199710z = a0Var2.f198982y == 1;
                if (this.f199709y == 0) {
                    String str2 = a0Var2.f198979v;
                    this.f199683D = str2;
                    C69699u4 u4Var = this.f199689J;
                    u4Var.f201100e = str2;
                    u4Var.f201105j = a0Var2.f198948J;
                    AppCompatActivity context = getContext();
                    if (a0Var2.f198948J == 2) {
                        this.f199695h.setImageResource(C0966R.C0969drawable.c5v);
                        if (a0Var2.f198949K != 0) {
                            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + a0Var2.f198949K);
                            GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent = new GetFestivalLuckyMoneyResEvent();
                            getFestivalLuckyMoneyResEvent.f193649d.f193651a = a0Var2.f198949K;
                            getFestivalLuckyMoneyResEvent.callback = new C69588f(this, getFestivalLuckyMoneyResEvent, a0Var2);
                            getFestivalLuckyMoneyResEvent.asyncPublish(Looper.myLooper());
                        } else if (!Util.isNullOrNil(a0Var2.f198970j)) {
                            C69242l1.m81595a(this.f199695h, a0Var2.f198970j, a0Var2.f198954Q);
                        }
                    } else {
                        C69242l1.m81595a(this.f199695h, a0Var2.f198970j, a0Var2.f198954Q);
                    }
                    C69242l1.m81616v(context, this.f199696i, a0Var2.f198969i);
                    C69242l1.m81616v(context, this.f199697j, a0Var2.f198968h);
                    if (a0Var2.f198939A != 2 || this.f199681B == 3) {
                        View view = this.f199698n;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        this.f199699o.setText(C75228t.m90260n(((double) a0Var2.f198974q) / 100.0d));
                        if (a0Var2.f198980w != 1) {
                            this.f199689J.f201101f = true;
                        } else {
                            this.f199689J.f201101f = false;
                        }
                        View view3 = this.f199698n;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (!Util.isNullOrNil(a0Var2.f198943E)) {
                        View view5 = this.f199701q;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f199702r.setText(a0Var2.f198943E);
                        if (a0Var2.f198942D == 1) {
                            if (TextUtils.isEmpty(a0Var2.f198952N) || a0Var2.f198952N.startsWith("weixin://wxpay")) {
                                this.f199703s.setVisibility(8);
                            } else {
                                this.f199703s.setVisibility(0);
                            }
                            this.f199702r.setOnClickListener(new C69594g(this, a0Var2, context));
                        } else {
                            Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
                            this.f199702r.setTextColor(getResources().getColor(C0966R.color.a3h));
                        }
                    } else {
                        Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
                        View view7 = this.f199701q;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (!Util.isNullOrNil(a0Var2.f198983z)) {
                        this.f199705u.setText(a0Var2.f198983z);
                    } else {
                        this.f199705u.setText((CharSequence) null);
                    }
                    LinkedList<C69248m2> linkedList = a0Var2.f198944F;
                    if (linkedList != null && linkedList.size() > 0) {
                        View findViewById = this.f199708x.findViewById(C0966R.C0970id.anb);
                        View findViewById2 = this.f199708x.findViewById(C0966R.C0970id.anc);
                        View findViewById3 = this.f199708x.findViewById(C0966R.C0970id.and);
                        ViewGroup viewGroup = (ViewGroup) this.f199708x.findViewById(C0966R.C0970id.an9);
                        ViewGroup viewGroup2 = (ViewGroup) this.f199708x.findViewById(C0966R.C0970id.an_);
                        ViewGroup viewGroup3 = (ViewGroup) this.f199708x.findViewById(C0966R.C0970id.ana);
                        View findViewById4 = this.f199708x.findViewById(C0966R.C0970id.an4);
                        View findViewById5 = this.f199708x.findViewById(C0966R.C0970id.an5);
                        C69558a3.C69561c cVar = new C69558a3.C69561c();
                        cVar.f200852a = getResources().getColor(C0966R.color.a2u);
                        cVar.f200854c = true;
                        cVar.f200856e = a0Var2.f198949K;
                        cVar.f200855d = this.f199686G;
                        if (linkedList.size() > 0) {
                            C69558a3.m81995a(this, viewGroup, linkedList.get(0), cVar);
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(0);
                            View view9 = findViewById;
                            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (linkedList.size() > 1) {
                            C69558a3.m81995a(this, viewGroup2, linkedList.get(1), cVar);
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(0);
                            View view10 = findViewById2;
                            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (linkedList.size() > 2) {
                            C69558a3.m81995a(this, viewGroup3, linkedList.get(2), cVar);
                            C9556a aVar7 = new C9556a();
                            aVar7.mo10233c(0);
                            View view11 = findViewById3;
                            C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (findViewById.getVisibility() == 0 && (findViewById2.getVisibility() == 0 || findViewById3.getVisibility() == 0)) {
                            C9556a aVar8 = new C9556a();
                            aVar8.mo10233c(0);
                            View view12 = findViewById4;
                            C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                            C117292a.m165359e(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (findViewById2.getVisibility() == 0 && findViewById3.getVisibility() == 0) {
                            C9556a aVar9 = new C9556a();
                            aVar9.mo10233c(0);
                            View view13 = findViewById5;
                            C117292a.m165358d(view13, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById5.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                            C117292a.m165359e(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (findViewById.getVisibility() == 0 || findViewById2.getVisibility() == 0 || findViewById3.getVisibility() == 0) {
                            this.f199706v.requestLayout();
                            View view14 = this.f199706v;
                            C9556a aVar10 = new C9556a();
                            aVar10.mo10233c(0);
                            View view15 = view14;
                            C117292a.m165358d(view15, aVar10.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view14.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                            C117292a.m165359e(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    C69558a3.C69561c cVar2 = new C69558a3.C69561c();
                    cVar2.f200852a = getResources().getColor(C0966R.color.a2u);
                    cVar2.f200853b = getResources().getDimensionPixelSize(C0966R.dimen.f3962lk);
                    C69558a3.m81995a(this, (ViewGroup) this.f199704t.findViewById(C0966R.C0970id.an6), a0Var2.f198945G, cVar2);
                    C115669n nVar2 = C115669n.INSTANCE;
                    Object[] objArr = new Object[5];
                    i2 = 2;
                    objArr[0] = Integer.valueOf(a0Var2.f198948J == 2 ? 13 : 7);
                    objArr[1] = 0;
                    objArr[2] = 0;
                    i = 3;
                    objArr[3] = 0;
                    objArr[4] = 1;
                    nVar2.mo160131h(11701, objArr);
                } else {
                    i2 = 2;
                    i = 3;
                }
                int i3 = a0Var2.f198965e;
                boolean z = (i3 == i || i3 == i2) && a0Var2.f198981x == 1 && !this.f199710z && a0Var2.f198940B == 1;
                C69249n nVar3 = a0Var2.f198941C;
                boolean z2 = nVar3 != null && nVar3.f199277d == 1 && !Util.isNullOrNil(nVar3.f199278e);
                TextView textView = (TextView) this.f199704t.findViewById(C0966R.C0970id.ani);
                if (z || z2) {
                    textView.setOnClickListener(new C69600h(this, a0Var2));
                    if (z2) {
                        C69249n nVar4 = a0Var2.f198941C;
                        this.f199685F = nVar4.f199278e;
                        textView.setText(nVar4.f199279f);
                    }
                    C115669n nVar5 = C115669n.INSTANCE;
                    Object[] objArr2 = new Object[5];
                    objArr2[0] = Integer.valueOf(a0Var2.f198948J == 2 ? 13 : 7);
                    objArr2[1] = 0;
                    objArr2[2] = 0;
                    objArr2[3] = 0;
                    objArr2[4] = 2;
                    nVar5.mo160131h(11701, objArr2);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                TextView textView2 = (TextView) this.f199704t.findViewById(C0966R.C0970id.anf);
                int i4 = this.f199681B;
                if (i4 == 1 || i4 == 3 || textView.getVisibility() == 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setOnClickListener(new C69606i(this, a0Var2));
                    textView2.setVisibility(0);
                }
                if (!this.f199691L) {
                    this.f199694g.addFooterView(this.f199704t);
                    this.f199691L = true;
                }
                LinkedList<C69236j1> linkedList2 = a0Var2.f198951M;
                if (linkedList2 != null) {
                    for (int i5 = 0; i5 < linkedList2.size(); i5++) {
                        C69236j1 j1Var = linkedList2.get(i5);
                        if (!((HashMap) this.f199688I).containsKey(j1Var.f199217i)) {
                            ((LinkedList) this.f199687H).add(linkedList2.get(i5));
                            ((HashMap) this.f199688I).put(j1Var.f199217i, 1);
                        }
                    }
                    this.f199709y += linkedList2.size();
                    this.f199680A = false;
                    C69699u4 u4Var2 = this.f199689J;
                    List<C69236j1> list = this.f199687H;
                    if (list == null) {
                        u4Var2.getClass();
                        new LinkedList();
                    } else {
                        u4Var2.f201099d = list;
                    }
                    u4Var2.notifyDataSetChanged();
                }
                String str3 = a0Var2.f198947I;
                String str4 = a0Var2.f198953P;
                this.f199707w.setImageResource(C0966R.C0969drawable.c5u);
                if (Util.isNullOrNil(str3)) {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "renderAdImage: no adImage");
                    this.f199707w.setVisibility(8);
                    c = 0;
                } else {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = MMApplicationContext.getContext().getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        ViewGroup.LayoutParams layoutParams = this.f199707w.getLayoutParams();
                        layoutParams.height = (int) (((float) ((displayMetrics.widthPixels - (getResources().getDimensionPixelSize(C0966R.dimen.f357045ae1) * 2)) - (getResources().getDimensionPixelSize(C0966R.dimen.f357044ae0) * 2))) * 0.75f);
                        this.f199707w.setLayoutParams(layoutParams);
                    }
                    c = 0;
                    C69242l1.m81610p(this.f199707w, str3, str4, false);
                    this.f199707w.setVisibility(0);
                }
                C115669n nVar6 = C115669n.INSTANCE;
                Object[] objArr3 = new Object[10];
                objArr3[c] = Integer.valueOf(this.f199686G);
                objArr3[1] = 1;
                objArr3[2] = a0Var2.f198947I;
                LinkedList<C69248m2> linkedList3 = a0Var2.f198944F;
                if (linkedList3 == null || linkedList3.size() == 0) {
                    Log.m105920e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
                    str = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    for (int i6 = 0; i6 < linkedList3.size(); i6++) {
                        C69248m2 m2Var = linkedList3.get(i6);
                        if (m2Var != null) {
                            if (i6 != 0) {
                                sb.append("|");
                            }
                            sb.append(m2Var.f199272f);
                            sb.append("|");
                            sb.append(m2Var.f199271e);
                        }
                    }
                    str = sb.toString();
                }
                objArr3[3] = str;
                objArr3[4] = "";
                objArr3[5] = "";
                objArr3[6] = "";
                objArr3[7] = "";
                objArr3[8] = a0Var2.f198969i;
                objArr3[9] = Integer.valueOf(a0Var2.f198949K);
                nVar6.mo160131h(13051, objArr3);
                return;
            }
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "is not atomic luckymoney, go to LuckyMoneyDetailUI");
            C75674c.m90930b(this.f199682C, a0Var2);
            Intent intent = new Intent(getContext(), LuckyMoneyDetailUI.class);
            intent.putExtras(getIntent());
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(intent);
            C117292a.m165358d(this, aVar11.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar11.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f199692M = true;
            finish();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f199700p.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f199700p.setVisibility(8);
        return true;
    }

    public void finish() {
        if (this.f199692M) {
            super.finish();
        } else if (getIntent().hasExtra("key_realname_guide_helper")) {
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
            bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
            boolean a = ((RealnameGuideHelper) getIntent().getParcelableExtra("key_realname_guide_helper")).mo99370a(this, bundle, new C69342a(this), (C79148e.C79149a) null);
            getIntent().removeExtra("key_realname_guide_helper");
            if (!a) {
                super.finish();
            }
        } else {
            super.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9d;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                String str = this.f199685F;
                if (str == null || !str.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")) {
                    doSceneProgress(new C69245l2(stringExtra.replaceAll(",", "|"), this.f199682C, 1, "v1.0"));
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.view.Window r5 = r4.getWindow()
            r0 = 0
            r5.setStatusBarColor(r0)
            r5 = 2131298516(0x7f0908d4, float:1.8215007E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ListView r5 = (android.widget.ListView) r5
            r4.f199694g = r5
            com.tencent.mm.plugin.luckymoney.ui.u4 r5 = new com.tencent.mm.plugin.luckymoney.ui.u4
            androidx.appcompat.app.AppCompatActivity r1 = r4.getContext()
            r5.<init>(r1)
            r4.f199689J = r5
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r1 = 2131496357(0x7f0c0da5, float:1.8616277E38)
            r2 = 0
            android.view.View r5 = r5.inflate(r1, r2)
            r4.f199708x = r5
            android.widget.ListView r1 = r4.f199694g
            r1.addHeaderView(r5)
            android.widget.ListView r5 = r4.f199694g
            com.tencent.mm.plugin.luckymoney.ui.u4 r1 = r4.f199689J
            r5.setAdapter(r1)
            android.view.View r5 = r4.f199708x
            com.tencent.mm.plugin.luckymoney.ui.j r1 = new com.tencent.mm.plugin.luckymoney.ui.j
            r1.<init>(r4)
            r5.setOnClickListener(r1)
            android.widget.ListView r5 = r4.f199694g
            android.widget.AbsListView$OnScrollListener r1 = r4.f199693N
            r5.setOnScrollListener(r1)
            android.widget.ListView r5 = r4.f199694g
            com.tencent.mm.plugin.luckymoney.ui.k r1 = new com.tencent.mm.plugin.luckymoney.ui.k
            r1.<init>(r4)
            r5.setOnItemClickListener(r1)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r1 = 2131496356(0x7f0c0da4, float:1.8616275E38)
            android.view.View r5 = r5.inflate(r1, r2)
            r4.f199704t = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298499(0x7f0908c3, float:1.8214973E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f199695h = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298520(0x7f0908d8, float:1.8215015E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f199696i = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298522(0x7f0908da, float:1.821502E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f199697j = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298498(0x7f0908c2, float:1.821497E38)
            android.view.View r5 = r5.findViewById(r1)
            r4.f199698n = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298497(0x7f0908c1, float:1.8214969E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f199699o = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298506(0x7f0908ca, float:1.8214987E38)
            android.view.View r5 = r5.findViewById(r1)
            r4.f199701q = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298519(0x7f0908d7, float:1.8215013E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f199702r = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298507(0x7f0908cb, float:1.821499E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f199703s = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298502(0x7f0908c6, float:1.8214979E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f199705u = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298514(0x7f0908d2, float:1.8215003E38)
            android.view.View r5 = r5.findViewById(r1)
            r4.f199706v = r5
            android.view.View r5 = r4.f199708x
            r1 = 2131298496(0x7f0908c0, float:1.8214967E38)
            android.view.View r5 = r5.findViewById(r1)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f199707w = r5
            r5 = 2131298501(0x7f0908c5, float:1.8214977E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 2131298521(0x7f0908d9, float:1.8215018E38)
            android.view.View r1 = r4.findViewById(r1)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyWishFooter) r1
            r4.f199700p = r1
            com.tencent.mm.plugin.luckymoney.ui.l r2 = new com.tencent.mm.plugin.luckymoney.ui.l
            r2.<init>(r4)
            com.tencent.mm.ui.widget.MMEditText r1 = r1.f200836p
            if (r1 == 0) goto L_0x010c
            r1.setBackListener(r2)
        L_0x010c:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter r1 = r4.f199700p
            com.tencent.mm.plugin.luckymoney.ui.m r2 = new com.tencent.mm.plugin.luckymoney.ui.m
            r2.<init>(r4)
            r1.setOnWishSendImp(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter r1 = r4.f199700p
            com.tencent.mm.plugin.luckymoney.ui.n r2 = new com.tencent.mm.plugin.luckymoney.ui.n
            r2.<init>(r4)
            r1.post(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter r1 = r4.f199700p
            com.tencent.mm.plugin.luckymoney.ui.o r2 = new com.tencent.mm.plugin.luckymoney.ui.o
            r2.<init>(r4)
            r1.setOnkbdStateListener(r2)
            com.tencent.mm.plugin.luckymoney.ui.u4 r1 = r4.f199689J
            com.tencent.mm.plugin.luckymoney.ui.p r2 = new com.tencent.mm.plugin.luckymoney.ui.p
            r2.<init>(r4)
            r1.f201104i = r2
            com.tencent.mm.plugin.luckymoney.ui.u4 r1 = r4.f199689J
            com.tencent.mm.plugin.luckymoney.ui.u4$a r2 = new com.tencent.mm.plugin.luckymoney.ui.u4$a
            r2.<init>(r1)
            r1.f201106n = r2
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter r1 = r4.f199700p
            r2 = 25
            r1.setMaxLength(r2)
            com.tencent.mm.plugin.luckymoney.ui.q r1 = new com.tencent.mm.plugin.luckymoney.ui.q
            r1.<init>(r4)
            r5.setOnClickListener(r1)
            r5 = 2131298500(0x7f0908c4, float:1.8214975E38)
            android.view.View r5 = r4.findViewById(r5)
            fixBackgroundRepeat(r5)
            r5 = 8
            r4.setContentViewVisibility(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "key_sendid"
            java.lang.String r5 = r5.getStringExtra(r1)
            r4.f199682C = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "key_native_url"
            java.lang.String r5 = r5.getStringExtra(r1)
            r4.f199684E = r5
            android.content.Intent r5 = r4.getIntent()
            r1 = 2
            java.lang.String r2 = "key_jump_from"
            int r5 = r5.getIntExtra(r2, r1)
            r4.f199681B = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r2 = "key_static_from_scene"
            int r5 = r5.getIntExtra(r2, r0)
            r4.f199686G = r5
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r2 = r4.f199682C
            r5[r0] = r2
            java.lang.String r2 = r4.f199684E
            r3 = 1
            r5[r3] = r2
            int r2 = r4.f199681B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r1] = r2
            java.lang.String r2 = "MicroMsg.LuckyMoneyDetailUI"
            java.lang.String r3 = "initData: sendid=%s , nativeurl=%s, jumpFrom=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            int r5 = r4.f199681B
            if (r5 != r1) goto L_0x01e0
            android.content.Intent r5 = r4.getIntent()     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r1 = "key_detail_info"
            byte[] r5 = r5.getByteArrayExtra(r1)     // Catch:{ Exception -> 0x01c7 }
            if (r5 == 0) goto L_0x01e0
            com.tencent.mm.plugin.luckymoney.model.a0 r1 = new com.tencent.mm.plugin.luckymoney.model.a0     // Catch:{ Exception -> 0x01c7 }
            r1.<init>()     // Catch:{ Exception -> 0x01c7 }
            pe3.a r5 = r1.parseFrom(r5)     // Catch:{ Exception -> 0x01c7 }
            com.tencent.mm.plugin.luckymoney.model.a0 r5 = (com.tencent.p014mm.plugin.luckymoney.model.C69158a0) r5     // Catch:{ Exception -> 0x01c7 }
            if (r5 == 0) goto L_0x01e0
            r4.mo95533L7(r5)     // Catch:{ Exception -> 0x01c7 }
            goto L_0x0229
        L_0x01c7:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "initData: parse LuckyMoneyDetail fail!"
            r1.append(r3)
            java.lang.String r5 = r5.getLocalizedMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r5)
        L_0x01e0:
            java.lang.String r5 = r4.f199682C
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0218
            java.lang.String r5 = r4.f199684E
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0218
            java.lang.String r5 = r4.f199684E
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r1 = "sendid"
            java.lang.String r5 = r5.getQueryParameter(r1)     // Catch:{ Exception -> 0x01ff }
            r4.f199682C = r5     // Catch:{ Exception -> 0x01ff }
            goto L_0x0218
        L_0x01ff:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "initData: parse uri exp:"
            r1.append(r3)
            java.lang.String r5 = r5.getLocalizedMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r5)
        L_0x0218:
            java.lang.String r5 = r4.f199682C
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0224
            r4.mo95532K7()
            goto L_0x0229
        L_0x0224:
            java.lang.String r5 = "sendid null or nil, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r5)
        L_0x0229:
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "play_sound"
            boolean r5 = r5.getBooleanExtra(r1, r0)
            if (r5 == 0) goto L_0x023b
            r5 = 2131832339(0x7f112e13, float:1.929773E38)
            com.tencent.p014mm.plugin.luckymoney.p073ui.C115591q5.m162472a(r4, r5)
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBusiDetailUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        LuckyMoneyWishFooter luckyMoneyWishFooter = this.f199700p;
        if (luckyMoneyWishFooter != null && luckyMoneyWishFooter.f200838r != null) {
            Log.m105924i("MicroMsg.SnsCommentFooter", "commentfooter release");
            luckyMoneyWishFooter.f200838r.mo100200l();
            luckyMoneyWishFooter.f200838r.mo100189b();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C69267u1)) {
            int i3 = 0;
            if (yVar instanceof C69206d2) {
                if (i == 0 && i2 == 0) {
                    C76879j.m92726T(this, getString(C0966R.string.fjh));
                    this.f199689J.f201101f = false;
                    mo95531J7();
                    C69206d2 d2Var = (C69206d2) yVar;
                    if (this.f199687H != null) {
                        while (true) {
                            if (i3 >= ((LinkedList) this.f199687H).size()) {
                                break;
                            }
                            C69236j1 j1Var = (C69236j1) ((LinkedList) this.f199687H).get(i3);
                            if (j1Var.f199217i.equalsIgnoreCase(d2Var.f199132h)) {
                                j1Var.f199216h = d2Var.f199133i;
                                this.f199689J.notifyDataSetChanged();
                                break;
                            }
                            i3++;
                        }
                    }
                    return true;
                }
                C76879j.m92726T(this, str);
                return true;
            } else if (!(yVar instanceof C69245l2)) {
                return false;
            } else {
                if (i == 0 && i2 == 0) {
                    C76879j.m92726T(this, getString(C0966R.string.fjh));
                    return true;
                }
                C76879j.m92726T(this, str);
                return true;
            }
        } else if (i == 0 && i2 == 0) {
            C69267u1 u1Var = (C69267u1) yVar;
            C69158a0 a0Var = u1Var.f199337h;
            this.f199690K = u1Var.f199338i;
            mo95533L7(a0Var);
            return true;
        } else {
            C76879j.m92726T(this, str);
            return true;
        }
    }
}
