package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a14.C0000n0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.luckymoney.model.C42516e;
import com.tencent.p014mm.plugin.luckymoney.model.C42519p;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f32.C75672b;
import h81.C32735h;
import ir3.C76371a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import org.libpag.PAGView;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C77390c0;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C77994sf2;
import te3.C77999tf2;
import te3.C78007w82;
import zo3.C79405a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI */
public class LuckyMoneyHistoryEnvelopeUI extends MMActivity {

    /* renamed from: C */
    public static final /* synthetic */ int f199965C = 0;

    /* renamed from: A */
    public String f199966A = "";

    /* renamed from: B */
    public boolean f199967B = true;

    /* renamed from: d */
    public int f199968d;

    /* renamed from: e */
    public int f199969e;

    /* renamed from: f */
    public int f199970f;

    /* renamed from: g */
    public int f199971g;

    /* renamed from: h */
    public int f199972h;

    /* renamed from: i */
    public int f199973i;

    /* renamed from: j */
    public int f199974j;

    /* renamed from: n */
    public int f199975n;

    /* renamed from: o */
    public int f199976o;

    /* renamed from: p */
    public int f199977p;

    /* renamed from: q */
    public int f199978q;

    /* renamed from: r */
    public int f199979r;

    /* renamed from: s */
    public FrameLayout f199980s;

    /* renamed from: t */
    public RefreshLoadMoreLayout f199981t;

    /* renamed from: u */
    public RecyclerView f199982u;

    /* renamed from: v */
    public WxRecyclerAdapter f199983v;

    /* renamed from: w */
    public ArrayList<C9493c> f199984w = new ArrayList<>();

    /* renamed from: x */
    public List<String> f199985x = new ArrayList();

    /* renamed from: y */
    public String f199986y;

    /* renamed from: z */
    public boolean f199987z = true;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$a */
    public class C69398a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C42519p f199988d;

        public C69398a(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C42519p pVar) {
            this.f199988d = pVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            P p = this.f199988d.f221004c;
            if (p != null) {
                p.mo85581g();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$b */
    public class C69399b implements C75097a.C75099b<C78007w82> {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f199989a;

        public C69399b(C89779i0 i0Var) {
            this.f199989a = i0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
            C78007w82 w822 = (C78007w82) obj;
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C78007w82 w822 = (C78007w82) obj;
            if (LuckyMoneyHistoryEnvelopeUI.this.isFinishing() || LuckyMoneyHistoryEnvelopeUI.this.isDestroyed()) {
                Log.m105928w("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "activity has destroyed");
                return;
            }
            C89779i0 i0Var = this.f199989a;
            if (i0Var != null && i0Var.isShowing()) {
                this.f199989a.dismiss();
            }
            boolean z = false;
            LuckyMoneyHistoryEnvelopeUI.this.f199981t.mo82440F(0);
            Log.m105924i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source net callback");
            if (i == 0 && i2 == 0 && w822 != null) {
                Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", Integer.valueOf(w822.f228340d));
                if (w822.f228340d == 0) {
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
                    if (w822.f228344h == 1) {
                        z = true;
                    }
                    luckyMoneyHistoryEnvelopeUI.f199987z = z;
                    luckyMoneyHistoryEnvelopeUI.f199966A = w822.f228343g;
                    ((ArrayList) luckyMoneyHistoryEnvelopeUI.f199985x).addAll(w822.f228346j);
                    Iterator<C77994sf2> it = w822.f228342f.iterator();
                    while (it.hasNext()) {
                        C77994sf2 next = it.next();
                        if (next.f228205i == 1 || next.f228209p == 1 || w822.f228346j.contains(next.f228202f)) {
                            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI2 = LuckyMoneyHistoryEnvelopeUI.this;
                            C69407i iVar = new C69407i(luckyMoneyHistoryEnvelopeUI2);
                            iVar.f200000d = next;
                            luckyMoneyHistoryEnvelopeUI2.f199984w.add(iVar);
                            LuckyMoneyHistoryEnvelopeUI.this.f199983v.notifyDataSetChanged();
                        }
                    }
                    if (!Util.isNullOrNil(w822.f228350q)) {
                        LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI3 = LuckyMoneyHistoryEnvelopeUI.this;
                        C69409k kVar = new C69409k(luckyMoneyHistoryEnvelopeUI3);
                        kVar.f200003d = w822.f228350q;
                        luckyMoneyHistoryEnvelopeUI3.f199984w.add(kVar);
                        return;
                    }
                    return;
                }
                C75228t.m90210C(w822.f228341e);
                return;
            }
            C75228t.m90209B(LuckyMoneyHistoryEnvelopeUI.this.getContext(), "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$c */
    public class C69400c implements MenuItem.OnMenuItemClickListener {
        public C69400c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LuckyMoneyHistoryEnvelopeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$d */
    public class C69401d extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$d$a */
        public class C69402a implements Runnable {
            public C69402a() {
            }

            public void run() {
                LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
                int i = LuckyMoneyHistoryEnvelopeUI.f199965C;
                luckyMoneyHistoryEnvelopeUI.mo95579H7(true);
            }
        }

        public C69401d() {
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            Log.m105918d("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "trigger load more");
            LuckyMoneyHistoryEnvelopeUI.this.runOnUiThread(new C69402a());
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
            if (!luckyMoneyHistoryEnvelopeUI.f199987z) {
                luckyMoneyHistoryEnvelopeUI.f199981t.mo82437B((RefreshLoadMoreLayout.C7080c<Object>) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$e */
    public class C69403e extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ GridLayoutManager f199994b;

        public C69403e(GridLayoutManager gridLayoutManager) {
            this.f199994b = gridLayoutManager;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            if (LuckyMoneyHistoryEnvelopeUI.this.f199983v.getItemViewType(i) == 2) {
                return this.f199994b.f44669w;
            }
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$f */
    public class C69404f implements C60898l.C9502b {
        public C69404f() {
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            ImageView imageView;
            int i2;
            Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "click envelope: %s", Integer.valueOf(i));
            C9493c cVar = (C9493c) ((C60905o) zVar).f173503E;
            if (cVar instanceof C69407i) {
                LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
                C77994sf2 sf22 = ((C69407i) cVar).f200000d;
                int i3 = LuckyMoneyHistoryEnvelopeUI.f199965C;
                Class cls = C75672b.class;
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(luckyMoneyHistoryEnvelopeUI.getContext()).inflate(C0966R.C0971layout.b_b, luckyMoneyHistoryEnvelopeUI.f199980s, false);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.gii);
                View findViewById = viewGroup.findViewById(C0966R.C0970id.gia);
                View findViewById2 = viewGroup.findViewById(C0966R.C0970id.m_d);
                View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f358695o14);
                PAGView pAGView = (PAGView) viewGroup.findViewById(C0966R.C0970id.f358694o13);
                View findViewById4 = viewGroup.findViewById(C0966R.C0970id.o16);
                PAGView pAGView2 = (PAGView) viewGroup.findViewById(C0966R.C0970id.o15);
                ImageView imageView2 = (ImageView) viewGroup.findViewById(C0966R.C0970id.gib);
                ImageView imageView3 = (ImageView) viewGroup.findViewById(C0966R.C0970id.gi_);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.gio);
                TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.gih);
                ImageView imageView4 = (ImageView) viewGroup.findViewById(C0966R.C0970id.gig);
                TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.gim);
                ViewGroup viewGroup4 = viewGroup2;
                C69708w0 w0Var = new C69708w0(luckyMoneyHistoryEnvelopeUI, sf22, findViewById4, findViewById2, imageView3, findViewById, viewGroup2, findViewById3);
                WeImageView weImageView = (WeImageView) viewGroup.findViewById(C0966R.C0970id.gip);
                Button button = (Button) viewGroup.findViewById(C0966R.C0970id.giq);
                textView2.setText(C0966R.string.gf7);
                TextView textView3 = textView;
                textView3.setText(luckyMoneyHistoryEnvelopeUI.getString(C0966R.string.gjt, new Object[]{((C76979h) C86312j.m106911c(C76979h.class)).op0(luckyMoneyHistoryEnvelopeUI.getContext(), C75592q0.m90783m(), C76577a.m92157h(luckyMoneyHistoryEnvelopeUI.getContext(), C0966R.dimen.aeb))}));
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView4, C75592q0.m90789s(), 0.06f);
                viewGroup3.setVisibility(8);
                ImageView imageView5 = imageView3;
                imageView5.setVisibility(0);
                ((C75672b) C86312j.m106911c(cls)).ng0(imageView5, sf22, (C75672b.C75673a) null, 0, 0, 0);
                C77999tf2 tf22 = sf22.f228203g;
                if (tf22 == null || Util.isNullOrNil(tf22.f228251o) || Util.isNullOrNil(sf22.f228203g.f228252p)) {
                    imageView = imageView2;
                    imageView.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
                    layoutParams.topMargin = C76577a.m92151b(luckyMoneyHistoryEnvelopeUI.getContext(), 24);
                    weImageView.setLayoutParams(layoutParams);
                } else {
                    C76371a.m91796b(imageView2);
                    imageView = imageView2;
                    imageView.setVisibility(0);
                    ((C75672b) C86312j.m106911c(cls)).P30(imageView, sf22, (C75672b.C75673a) null, 0, 0);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
                    layoutParams2.topMargin = 0;
                    weImageView.setLayoutParams(layoutParams2);
                }
                C0000n0 a = C75142u0.f221103a.mo104865a();
                ImageView imageView6 = imageView;
                LuckyMoneyNotHookReceiveUI.m81872O7(sf22, findViewById3, pAGView, findViewById4, pAGView2, w0Var, a);
                button.setClickable(false);
                String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
                if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                    button.setBackgroundResource(C0966R.C0969drawable.c_e);
                    button.setText(C0966R.string.f360994gi2);
                } else {
                    button.setBackgroundResource(C0966R.C0969drawable.c27);
                }
                viewGroup.setFocusable(false);
                viewGroup.setClickable(true);
                viewGroup.setImportantForAccessibility(2);
                ViewGroup viewGroup5 = viewGroup4;
                viewGroup5.setFocusable(true);
                button.setImportantForAccessibility(2);
                weImageView.setEnableColorFilter(false);
                weImageView.setImageResource(C0966R.C0969drawable.adn);
                if (C85875k4.m106211z()) {
                    i2 = luckyMoneyHistoryEnvelopeUI.getResources().getColor(C0966R.color.BW_0_Alpha_0_8);
                    viewGroup.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
                } else {
                    i2 = luckyMoneyHistoryEnvelopeUI.getResources().getColor(C0966R.color.f356950a32);
                    viewGroup.setBackgroundResource(C0966R.color.f356950a32);
                }
                C77390c0 c0Var = new C77390c0(luckyMoneyHistoryEnvelopeUI.getContext(), C0966R.style.f8511l4);
                c0Var.setContentView(viewGroup);
                c0Var.getWindow().setLayout(-1, -1);
                c0Var.getWindow().getDecorView().setSystemUiVisibility(c0Var.getWindow().getDecorView().getWindowSystemUiVisibility() | 1024);
                c0Var.getWindow().setStatusBarColor(i2);
                c0Var.setOnShowListener(new C69716x0(luckyMoneyHistoryEnvelopeUI, c0Var));
                c0Var.show();
                C69242l1.m81612r(viewGroup5);
                C69242l1.m81612r(imageView6);
                weImageView.setOnClickListener(new C69725y0(luckyMoneyHistoryEnvelopeUI, c0Var, pAGView, w0Var, pAGView2, a));
                return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$g */
    public class C69405g implements C60898l.C9503c {
        public C69405g() {
        }

        /* renamed from: n */
        public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "long click envelope: %s", Integer.valueOf(i));
            C9493c cVar = (C9493c) ((C60905o) zVar).f173503E;
            if (cVar instanceof C69407i) {
                LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
                C77994sf2 sf22 = ((C69407i) cVar).f200000d;
                int i2 = LuckyMoneyHistoryEnvelopeUI.f199965C;
                luckyMoneyHistoryEnvelopeUI.getClass();
                if (sf22 != null) {
                    if ("0".equals(sf22.f228202f)) {
                        Log.m105924i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "can not delete default envelope");
                    } else {
                        C77407n nVar = new C77407n((Context) luckyMoneyHistoryEnvelopeUI.getContext(), 1, true);
                        TextView textView = new TextView(luckyMoneyHistoryEnvelopeUI.getContext());
                        textView.setPadding(0, 0, 0, C76577a.m92151b(luckyMoneyHistoryEnvelopeUI.getContext(), 9));
                        textView.setMinHeight(C76577a.m92157h(luckyMoneyHistoryEnvelopeUI.getContext(), C0966R.dimen.f3639x));
                        textView.setTextSize(14.0f);
                        textView.setTextColor(luckyMoneyHistoryEnvelopeUI.getResources().getColor(C0966R.color.f3552xi));
                        textView.setText(C0966R.string.gi8);
                        textView.setGravity(81);
                        nVar.mo107569n(textView, true);
                        nVar.f225771i = new C56858a1(luckyMoneyHistoryEnvelopeUI);
                        nVar.f225782p = new C69566b1(luckyMoneyHistoryEnvelopeUI, sf22);
                        nVar.mo107573q();
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$h */
    public class C69406h extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f199998d = C76371a.m91795a(4);

        public C69406h() {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int ceil = (int) Math.ceil((double) (((float) LuckyMoneyHistoryEnvelopeUI.this.f199984w.size()) / 2.0f));
            int N0 = recyclerView.mo17029N0(view);
            int ceil2 = (int) Math.ceil((double) (((float) (N0 + 1)) / 2.0f));
            if (ceil2 == 0) {
                int i = this.f199998d;
                rect.top = i * 2;
                rect.bottom = i * 2;
            } else if (ceil2 == ceil) {
                int i2 = this.f199998d;
                rect.top = i2;
                rect.bottom = i2 * 2;
            } else {
                int i3 = this.f199998d;
                rect.top = i3;
                rect.bottom = i3;
            }
            if (N0 % 2 == 0) {
                int i4 = this.f199998d;
                rect.left = i4 * 2;
                rect.right = i4;
                return;
            }
            int i5 = this.f199998d;
            rect.left = i5;
            rect.right = i5 * 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$i */
    public class C69407i implements C9493c {

        /* renamed from: d */
        public C77994sf2 f200000d;

        /* renamed from: e */
        public boolean f200001e = false;

        public C69407i(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) this.f200000d.f228202f.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$j */
    public class C69408j extends C60896i<C69407i> {
        public C69408j() {
        }

        /* renamed from: b */
        public C60905o mo25318b(RecyclerView recyclerView, View view) {
            return new C69411m(LuckyMoneyHistoryEnvelopeUI.this, view);
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.b9t;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            ListScrollPAGView listScrollPAGView;
            View view;
            boolean z2;
            boolean z3;
            C60905o oVar2 = oVar;
            C69407i iVar = (C69407i) cVar;
            ((C76705f) C86312j.m106911c(C76705f.class)).D20((ImageView) oVar2.mo85812D(C0966R.C0970id.g1p), C75592q0.m90789s(), 0.06f);
            oVar2.mo85815G(C0966R.C0970id.g2f, LuckyMoneyHistoryEnvelopeUI.this.getString(C0966R.string.gjt, new Object[]{((C76979h) C86312j.m106911c(C76979h.class)).op0(LuckyMoneyHistoryEnvelopeUI.this.getContext(), C75592q0.m90783m(), C76577a.m92157h(LuckyMoneyHistoryEnvelopeUI.this.getContext(), C0966R.dimen.f3653ac))}));
            C77994sf2 sf22 = iVar.f200000d;
            View D = oVar2.mo85812D(C0966R.C0970id.f358612g24);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = D;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ImageView) oVar2.mo85812D(C0966R.C0970id.f358612g24)).setImageBitmap((Bitmap) null);
            View D2 = oVar2.mo85812D(C0966R.C0970id.g2a);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = D2;
            C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar2.mo85812D(C0966R.C0970id.g2_).setBackgroundResource(C0966R.C0969drawable.ady);
            View D3 = oVar2.mo85812D(C0966R.C0970id.g2c);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view4 = D3;
            C117292a.m165358d(D3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D4 = oVar2.mo85812D(C0966R.C0970id.o0o);
            ListScrollPAGView listScrollPAGView2 = (ListScrollPAGView) oVar2.mo85812D(C0966R.C0970id.o0n);
            View D5 = oVar2.mo85812D(C0966R.C0970id.o0q);
            ListScrollPAGView listScrollPAGView3 = (ListScrollPAGView) oVar2.mo85812D(C0966R.C0970id.o0p);
            if (D4 != null) {
                listScrollPAGView2.mo21226m();
                if (oVar2 instanceof C69411m) {
                    C69411m mVar = (C69411m) oVar2;
                    listScrollPAGView2.mo21222i(mVar.f200004G);
                    mVar.f200004G = null;
                }
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view5 = D4;
                listScrollPAGView = listScrollPAGView3;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view = D5;
            } else {
                listScrollPAGView = listScrollPAGView3;
                view = D5;
            }
            if (view != null) {
                listScrollPAGView.mo21226m();
                if (oVar2 instanceof C69411m) {
                    C69411m mVar2 = (C69411m) oVar2;
                    ListScrollPAGView listScrollPAGView4 = listScrollPAGView;
                    listScrollPAGView4.mo21222i(mVar2.f200005H);
                    ListScrollPAGView.C17719f fVar = mVar2.f200006I;
                    synchronized (listScrollPAGView4) {
                        listScrollPAGView4.f48764s.remove(fVar);
                    }
                    mVar2.f200005H = null;
                    mVar2.f200006I = null;
                }
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view6 = view;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (sf22.f228203g != null) {
                ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.g2c);
                View D6 = oVar2.mo85812D(C0966R.C0970id.o0o);
                View D7 = oVar2.mo85812D(C0966R.C0970id.o0q);
                if (mo95583j(oVar2, sf22.f228203g)) {
                    imageView.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams.width = luckyMoneyHistoryEnvelopeUI.f199976o;
                    layoutParams.height = luckyMoneyHistoryEnvelopeUI.f199977p;
                    imageView.setLayoutParams(layoutParams);
                    C77999tf2 tf22 = sf22.f228203g;
                    if (oVar2.mo85812D(C0966R.C0970id.o0q) != null && !Util.isNullOrNil(tf22.f228260x) && tf22.f228242D == 2) {
                        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
                        if (D7 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                            D7.setOutlineProvider(new C79405a(true, true, b));
                        }
                        if (D7 != null) {
                            D7.setClipToOutline(z3);
                        }
                        ViewGroup.LayoutParams layoutParams2 = D7.getLayoutParams();
                        LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI2 = LuckyMoneyHistoryEnvelopeUI.this;
                        layoutParams2.width = luckyMoneyHistoryEnvelopeUI2.f199976o;
                        layoutParams2.height = luckyMoneyHistoryEnvelopeUI2.f199977p;
                        D7.setLayoutParams(layoutParams2);
                    } else if (D7 != null) {
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        View view7 = D7;
                        C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(8);
                        View view8 = D6;
                        C117292a.m165358d(D6, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) oVar2.mo85812D(C0966R.C0970id.g2_).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI3 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams3.width = luckyMoneyHistoryEnvelopeUI3.f199974j;
                    int i3 = luckyMoneyHistoryEnvelopeUI3.f199975n;
                    layoutParams3.height = i3;
                    layoutParams3.topMargin = (luckyMoneyHistoryEnvelopeUI3.f199977p - i3) / 2;
                    oVar2.mo85812D(C0966R.C0970id.g2_).setLayoutParams(layoutParams3);
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) oVar2.mo85812D(C0966R.C0970id.bin).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI4 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams4.width = luckyMoneyHistoryEnvelopeUI4.f199974j;
                    int i4 = luckyMoneyHistoryEnvelopeUI4.f199975n;
                    layoutParams4.height = i4;
                    layoutParams4.topMargin = (luckyMoneyHistoryEnvelopeUI4.f199977p - i4) / 2;
                    oVar2.mo85812D(C0966R.C0970id.bin).setLayoutParams(layoutParams4);
                    ViewGroup.LayoutParams layoutParams5 = oVar2.mo85812D(C0966R.C0970id.f358612g24).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI5 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams5.width = luckyMoneyHistoryEnvelopeUI5.f199974j;
                    layoutParams5.height = luckyMoneyHistoryEnvelopeUI5.f199975n;
                    oVar2.mo85812D(C0966R.C0970id.f358612g24).setLayoutParams(layoutParams5);
                    ViewGroup.LayoutParams layoutParams6 = oVar2.mo85812D(C0966R.C0970id.g2a).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI6 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams6.width = luckyMoneyHistoryEnvelopeUI6.f199974j;
                    layoutParams6.height = luckyMoneyHistoryEnvelopeUI6.f199978q;
                    oVar2.mo85812D(C0966R.C0970id.g2a).setLayoutParams(layoutParams6);
                    ViewGroup.LayoutParams layoutParams7 = oVar2.mo85812D(C0966R.C0970id.g29).getLayoutParams();
                    int i5 = LuckyMoneyHistoryEnvelopeUI.this.f199979r;
                    layoutParams7.width = i5;
                    layoutParams7.height = i5;
                    oVar2.mo85812D(C0966R.C0970id.g29).setLayoutParams(layoutParams7);
                    RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) oVar2.mo85812D(C0966R.C0970id.g27).getLayoutParams();
                    layoutParams8.addRule(3, C0966R.C0970id.g2c);
                    layoutParams8.topMargin = 0;
                    oVar2.mo85812D(C0966R.C0970id.g27).setLayoutParams(layoutParams8);
                } else {
                    View view9 = D6;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) oVar2.mo85812D(C0966R.C0970id.g2_).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI7 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams9.width = luckyMoneyHistoryEnvelopeUI7.f199970f;
                    layoutParams9.height = luckyMoneyHistoryEnvelopeUI7.f199971g;
                    layoutParams9.topMargin = 0;
                    oVar2.mo85812D(C0966R.C0970id.g2_).setLayoutParams(layoutParams9);
                    RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) oVar2.mo85812D(C0966R.C0970id.bin).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI8 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams10.width = luckyMoneyHistoryEnvelopeUI8.f199970f;
                    layoutParams10.height = luckyMoneyHistoryEnvelopeUI8.f199971g;
                    layoutParams10.topMargin = 0;
                    oVar2.mo85812D(C0966R.C0970id.bin).setLayoutParams(layoutParams10);
                    ViewGroup.LayoutParams layoutParams11 = oVar2.mo85812D(C0966R.C0970id.f358612g24).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI9 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams11.width = luckyMoneyHistoryEnvelopeUI9.f199970f;
                    layoutParams11.height = luckyMoneyHistoryEnvelopeUI9.f199971g;
                    oVar2.mo85812D(C0966R.C0970id.f358612g24).setLayoutParams(layoutParams11);
                    C77999tf2 tf23 = sf22.f228203g;
                    if (oVar2.mo85812D(C0966R.C0970id.o0o) != null && !Util.isNullOrNil(tf23.f228260x) && tf23.f228242D == 1) {
                        float b2 = (float) C76577a.m92151b(MMApplicationContext.getContext(), 4);
                        if (view9 == null) {
                            z2 = true;
                        } else {
                            z2 = true;
                            view9.setOutlineProvider(new C79405a(true, true, b2));
                        }
                        if (view9 != null) {
                            view9.setClipToOutline(z2);
                        }
                        ViewGroup.LayoutParams layoutParams12 = view9.getLayoutParams();
                        LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI10 = LuckyMoneyHistoryEnvelopeUI.this;
                        layoutParams12.width = luckyMoneyHistoryEnvelopeUI10.f199970f;
                        layoutParams12.height = luckyMoneyHistoryEnvelopeUI10.f199971g;
                        view9.setLayoutParams(layoutParams12);
                    } else if (view9 != null) {
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view10 = view9;
                        View view11 = D7;
                        C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(8);
                        C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view12 = view11;
                        view12.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ViewGroup.LayoutParams layoutParams13 = oVar2.mo85812D(C0966R.C0970id.g2a).getLayoutParams();
                    LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI11 = LuckyMoneyHistoryEnvelopeUI.this;
                    layoutParams13.width = luckyMoneyHistoryEnvelopeUI11.f199970f;
                    layoutParams13.height = luckyMoneyHistoryEnvelopeUI11.f199972h;
                    oVar2.mo85812D(C0966R.C0970id.g2a).setLayoutParams(layoutParams13);
                    ViewGroup.LayoutParams layoutParams14 = oVar2.mo85812D(C0966R.C0970id.g29).getLayoutParams();
                    int i6 = LuckyMoneyHistoryEnvelopeUI.this.f199973i;
                    layoutParams14.width = i6;
                    layoutParams14.height = i6;
                    oVar2.mo85812D(C0966R.C0970id.g29).setLayoutParams(layoutParams14);
                }
                mo95584k(oVar2, sf22, false, iVar);
            }
            oVar2.mo85812D(C0966R.C0970id.g2i).setOnClickListener(new C69575c1(this, oVar2, sf22, iVar));
            if (sf22.f228208o == 2) {
                View D8 = oVar2.mo85812D(C0966R.C0970id.g2h);
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(0);
                View view13 = D8;
                C117292a.m165358d(view13, aVar10.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D8.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) oVar2.mo85812D(C0966R.C0970id.g2h)).setTextSize(1, 11.0f);
            } else {
                View D9 = oVar2.mo85812D(C0966R.C0970id.g2h);
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(8);
                C117292a.m165358d(D9, aVar11.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D9.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(D9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            oVar2.mo85815G(C0966R.C0970id.g28, sf22.f228200d);
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f358611g23);
            if (sf22.f228209p == 1) {
                textView.setText(sf22.f228210q);
            } else if (sf22.f228205i == 1) {
                textView.setText(sf22.f228204h);
            } else {
                if (((ArrayList) LuckyMoneyHistoryEnvelopeUI.this.f199985x).contains(sf22.f228202f)) {
                    textView.setText(C0966R.string.gfs);
                }
            }
            String str = LuckyMoneyHistoryEnvelopeUI.this.f199986y;
            if (str == null || str.length() <= 0 || (!LuckyMoneyHistoryEnvelopeUI.this.f199986y.equals("zh_CN") && !LuckyMoneyHistoryEnvelopeUI.this.f199986y.equals("zh_TW") && !LuckyMoneyHistoryEnvelopeUI.this.f199986y.equals("zh_HK"))) {
                oVar2.mo85812D(C0966R.C0970id.g29).setBackgroundResource(C0966R.C0969drawable.c_e);
                oVar2.mo85814F(C0966R.C0970id.g29, C0966R.string.f360994gi2);
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = LuckyMoneyHistoryEnvelopeUI.this;
            layoutParams.width = luckyMoneyHistoryEnvelopeUI.f199968d;
            oVar.f44854d.setMinimumHeight(luckyMoneyHistoryEnvelopeUI.f199969e);
            oVar.f44854d.setLayoutParams(layoutParams);
            int a = C76371a.m91795a(8);
            oVar.f44854d.setPadding(a, a, a, a);
            ViewGroup.LayoutParams layoutParams2 = oVar.mo85812D(C0966R.C0970id.g2_).getLayoutParams();
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI2 = LuckyMoneyHistoryEnvelopeUI.this;
            layoutParams2.width = luckyMoneyHistoryEnvelopeUI2.f199970f;
            layoutParams2.height = luckyMoneyHistoryEnvelopeUI2.f199971g;
            oVar.mo85812D(C0966R.C0970id.g2_).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = oVar.mo85812D(C0966R.C0970id.bin).getLayoutParams();
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI3 = LuckyMoneyHistoryEnvelopeUI.this;
            layoutParams3.width = luckyMoneyHistoryEnvelopeUI3.f199970f;
            layoutParams3.height = luckyMoneyHistoryEnvelopeUI3.f199971g;
            oVar.mo85812D(C0966R.C0970id.bin).setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = oVar.mo85812D(C0966R.C0970id.f358612g24).getLayoutParams();
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI4 = LuckyMoneyHistoryEnvelopeUI.this;
            layoutParams4.width = luckyMoneyHistoryEnvelopeUI4.f199970f;
            layoutParams4.height = luckyMoneyHistoryEnvelopeUI4.f199971g;
            oVar.mo85812D(C0966R.C0970id.f358612g24).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = oVar.mo85812D(C0966R.C0970id.g2a).getLayoutParams();
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI5 = LuckyMoneyHistoryEnvelopeUI.this;
            layoutParams5.width = luckyMoneyHistoryEnvelopeUI5.f199970f;
            layoutParams5.height = luckyMoneyHistoryEnvelopeUI5.f199972h;
            oVar.mo85812D(C0966R.C0970id.g2a).setLayoutParams(layoutParams5);
            ViewGroup.LayoutParams layoutParams6 = oVar.mo85812D(C0966R.C0970id.g29).getLayoutParams();
            int i2 = LuckyMoneyHistoryEnvelopeUI.this.f199973i;
            layoutParams6.width = i2;
            layoutParams6.height = i2;
            oVar.mo85812D(C0966R.C0970id.g29).setLayoutParams(layoutParams6);
        }

        /* renamed from: i */
        public void mo735i(C60905o oVar) {
            View D = oVar.mo85812D(C0966R.C0970id.o0o);
            ListScrollPAGView listScrollPAGView = (ListScrollPAGView) oVar.mo85812D(C0966R.C0970id.o0n);
            View D2 = oVar.mo85812D(C0966R.C0970id.o0q);
            ListScrollPAGView listScrollPAGView2 = (ListScrollPAGView) oVar.mo85812D(C0966R.C0970id.o0p);
            if (D != null && D.getVisibility() == 0) {
                listScrollPAGView.mo21226m();
                if (oVar instanceof C69411m) {
                    C69411m mVar = (C69411m) oVar;
                    listScrollPAGView.mo21222i(mVar.f200004G);
                    mVar.f200004G = null;
                }
            }
            if (D2 != null && D2.getVisibility() == 0) {
                listScrollPAGView2.mo21226m();
                if (oVar instanceof C69411m) {
                    C69411m mVar2 = (C69411m) oVar;
                    listScrollPAGView2.mo21222i(mVar2.f200005H);
                    ListScrollPAGView.C17719f fVar = mVar2.f200006I;
                    synchronized (listScrollPAGView2) {
                        listScrollPAGView2.f48764s.remove(fVar);
                    }
                    mVar2.f200005H = null;
                    mVar2.f200006I = null;
                }
            }
        }

        /* renamed from: j */
        public final boolean mo95583j(C60905o oVar, C77999tf2 tf22) {
            return oVar.mo85812D(C0966R.C0970id.g2c) != null && !Util.isNullOrNil(tf22.f228251o) && !Util.isNullOrNil(tf22.f228252p);
        }

        /* renamed from: k */
        public final void mo95584k(C60905o oVar, C77994sf2 sf22, boolean z, C69407i iVar) {
            C60905o oVar2 = oVar;
            C77994sf2 sf23 = sf22;
            Class cls = C75672b.class;
            if (z) {
                View D = oVar2.mo85812D(C0966R.C0970id.g2e);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D2 = oVar2.mo85812D(C0966R.C0970id.g1o);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D3 = oVar2.mo85812D(C0966R.C0970id.g2g);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                C117292a.m165358d(D3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(D3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View D4 = oVar2.mo85812D(C0966R.C0970id.g2d);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                C117292a.m165358d(D4, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(D4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((ImageView) oVar2.mo85812D(C0966R.C0970id.f358612g24)).setImageBitmap((Bitmap) null);
            ((ImageView) oVar2.mo85812D(C0966R.C0970id.f358612g24)).setVisibility(0);
            ((C75672b) C86312j.m106911c(cls)).ng0((ImageView) oVar2.mo85812D(C0966R.C0970id.f358612g24), sf22, new C56859d1(this, oVar2), 0, 0, 0);
            View D5 = oVar2.mo85812D(C0966R.C0970id.o0o);
            ListScrollPAGView listScrollPAGView = (ListScrollPAGView) oVar2.mo85812D(C0966R.C0970id.o0n);
            View D6 = oVar2.mo85812D(C0966R.C0970id.o0q);
            ListScrollPAGView listScrollPAGView2 = (ListScrollPAGView) oVar2.mo85812D(C0966R.C0970id.o0p);
            if (!(LuckyMoneyHistoryEnvelopeUI.this.f199967B || D5 == null || D6 == null)) {
                C77999tf2 tf22 = sf23.f228203g;
                if (tf22 == null || Util.isNullOrNil(tf22.f228260x)) {
                    listScrollPAGView.mo21226m();
                    listScrollPAGView2.mo21226m();
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    C117292a.m165358d(D5, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(D5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view = D6;
                    C117292a.m165358d(view, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (sf23.f228203g.f228242D == 2) {
                    if (oVar2 instanceof C69411m) {
                        C69411m mVar = (C69411m) oVar2;
                        C56863e1 e1Var = new C56863e1(this, D6);
                        mVar.f200005H = e1Var;
                        listScrollPAGView2.mo21212d(e1Var);
                        listScrollPAGView2.setRepeatCount(0);
                        listScrollPAGView2.setScaleMode(3);
                        C69590f1 f1Var = new C69590f1(this, iVar, listScrollPAGView2, oVar2);
                        mVar.f200006I = f1Var;
                        listScrollPAGView2.mo21213e(f1Var);
                    } else {
                        C69407i iVar2 = iVar;
                    }
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(8);
                    C117292a.m165358d(D5, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D5.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(D5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    listScrollPAGView.mo21226m();
                    C69198d0.f199107a.mo95352b(sf23, 1, oVar2.f29679z, new C69595g1(this, iVar, listScrollPAGView2, sf22, D6));
                } else {
                    if (oVar2 instanceof C69411m) {
                        C56864h1 h1Var = new C56864h1(this, D5);
                        ((C69411m) oVar2).f200004G = h1Var;
                        listScrollPAGView.mo21212d(h1Var);
                    }
                    listScrollPAGView.mo21213e(new C69608i1(this));
                    listScrollPAGView.setRepeatCount(0);
                    listScrollPAGView.setScaleMode(3);
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view2 = D6;
                    C117292a.m165358d(view2, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D6.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    listScrollPAGView2.mo21226m();
                    D5.setOutlineProvider(new C79405a(true, true, (float) C76577a.m92151b(MMApplicationContext.getContext(), 4)));
                    D5.setClipToOutline(true);
                    C69198d0.f199107a.mo95352b(sf23, 1, oVar2.f29679z, new C69616j1(this, listScrollPAGView, sf23, D5));
                }
            }
            if (mo95583j(oVar2, sf23.f228203g)) {
                ((C75672b) C86312j.m106911c(cls)).P30((ImageView) oVar2.mo85812D(C0966R.C0970id.g2c), sf22, new C56866k1(this), 0, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$k */
    public class C69409k implements C9493c {

        /* renamed from: d */
        public String f200003d;

        public C69409k(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        }

        /* renamed from: c */
        public int mo75c() {
            return 2;
        }

        public long getItemId() {
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$l */
    public class C69410l extends C60896i<C69409k> {
        public C69410l(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.b9v;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            oVar.mo85815G(C0966R.C0970id.ewi, ((C69409k) cVar).f200003d);
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI$m */
    public class C69411m extends C60905o {

        /* renamed from: G */
        public ListScrollPAGView.C17718h f200004G;

        /* renamed from: H */
        public ListScrollPAGView.C17718h f200005H;

        /* renamed from: I */
        public ListScrollPAGView.C17719f f200006I;

        public C69411m(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, View view) {
            super(view);
        }
    }

    /* renamed from: H7 */
    public final void mo95579H7(boolean z) {
        Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source: %s", Boolean.valueOf(this.f199987z));
        if (!this.f199987z) {
            this.f199981t.mo82440F(0);
            return;
        }
        C42519p g = C42519p.m46167g();
        C89779i0 i0Var = null;
        if (!z) {
            i0Var = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C69398a(this, g));
        }
        g.f221004c = new C42516e(this.f199966A, 2);
        g.mo104792c(new C69399b(i0Var), true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9u;
    }

    public void initView() {
        this.f199980s = (FrameLayout) findViewById(C0966R.C0970id.gfc);
        this.f199981t = (RefreshLoadMoreLayout) findViewById(C0966R.C0970id.g1m);
        this.f199982u = (RecyclerView) findViewById(C0966R.C0970id.g1n);
        this.f199981t.setEnableRefresh(false);
        this.f199981t.setActionCallback(new C69401d());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.f44666B = new C69403e(gridLayoutManager);
        this.f199982u.setLayoutManager(gridLayoutManager);
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new C9500j() {
            public C60896i<?> getItemConvert(int i) {
                return i == 1 ? new C69408j() : new C69410l(LuckyMoneyHistoryEnvelopeUI.this);
            }
        }, this.f199984w, false);
        this.f199983v = wxRecyclerAdapter;
        wxRecyclerAdapter.f173488o = new C69404f();
        wxRecyclerAdapter.f173487n = new C69405g();
        this.f199982u.setAdapter(wxRecyclerAdapter);
        this.f199982u.mo17085h0(new C69406h());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2927a));
        hideActionbarLine();
        setMMTitle(getString(C0966R.string.gfr));
        setBackBtn(new C69400c());
        HashMap<String, Long> hashMap = C69242l1.f199264a;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_android_lucky_money_dynamic_history_close_switch, true);
        Log.m105925i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigHistory：%s ", Boolean.valueOf(wf));
        this.f199967B = wf;
        this.f199986y = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
        getWindow().getDecorView().post(new C69730z0(this));
        initView();
        mo95579H7(false);
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
