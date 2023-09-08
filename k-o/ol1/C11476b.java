package ol1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import ml1.C10929b;
import ml1.C10930c;
import o40.C61926c;
import ok1.C62042e;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C77407n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48648a11;
import te3.C50767p11;
import te3.C51280sp2;
import up1.C27696y;

/* renamed from: ol1.b */
public final class C11476b extends C11475a<C48648a11> {

    /* renamed from: j */
    public final C10929b f33737j;

    /* renamed from: n */
    public final C10930c f33738n;

    /* renamed from: o */
    public ConstraintLayout f33739o;

    /* renamed from: p */
    public LinearLayout f33740p;

    /* renamed from: q */
    public ConstraintLayout f33741q;

    /* renamed from: r */
    public ConstraintLayout f33742r;

    /* renamed from: s */
    public final C13601g f33743s;

    /* renamed from: t */
    public final C13601g f33744t;

    /* renamed from: u */
    public final C13601g f33745u;

    /* renamed from: ol1.b$a */
    public static final class C11477a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11476b f33746d;

        public C11477a(C11476b bVar) {
            this.f33746d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33746d.mo9763a();
            this.f33746d.f33738n.mo11127K();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ol1.b$b */
    public static final class C11478b extends C87413o implements C32224a<C77407n> {

        /* renamed from: d */
        public final /* synthetic */ Context f33747d;

        /* renamed from: e */
        public final /* synthetic */ C11476b f33748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11478b(Context context, C11476b bVar) {
            super(0);
            this.f33747d = context;
            this.f33748e = bVar;
        }

        public Object invoke() {
            C77407n nVar = new C77407n(this.f33747d, 1, false);
            C11476b bVar = this.f33748e;
            nVar.f225771i = new C11481c(bVar);
            nVar.f225782p = new C11482d(bVar);
            nVar.f225761d = new C11483e(bVar);
            return nVar;
        }
    }

    /* renamed from: ol1.b$c */
    public static final class C11479c extends C87413o implements C32224a<C77407n> {

        /* renamed from: d */
        public final /* synthetic */ Context f33749d;

        /* renamed from: e */
        public final /* synthetic */ C11476b f33750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11479c(Context context, C11476b bVar) {
            super(0);
            this.f33749d = context;
            this.f33750e = bVar;
        }

        public Object invoke() {
            C77407n nVar = new C77407n(this.f33749d, 1, true);
            C11476b bVar = this.f33750e;
            Context context = this.f33749d;
            nVar.mo107569n((TextView) ((C36570n) bVar.f33743s).getValue(), false);
            nVar.f225771i = new C11484f(context);
            nVar.f225776l1 = true;
            nVar.f225782p = new C11485g(bVar);
            return nVar;
        }
    }

    /* renamed from: ol1.b$d */
    public static final class C11480d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ Context f33751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11480d(Context context) {
            super(0);
            this.f33751d = context;
        }

        public Object invoke() {
            TextView textView = new TextView(this.f33751d);
            Context context = this.f33751d;
            textView.setText(context.getString(C0966R.string.fpa));
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(context.getResources().getColor(C0966R.color.FG_1));
            textView.setGravity(17);
            textView.setPadding(0, textView.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, textView.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11476b(Context context, C0125s sVar, C10929b bVar, C10930c cVar) {
        super(context, sVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(bVar, "serviceLive");
        C87412m.m108594g(cVar, "viewEvent");
        this.f33737j = bVar;
        this.f33738n = cVar;
        this.f33743s = C36568h.m40985a(new C11480d(context));
        this.f33744t = C36568h.m40985a(new C11479c(context, this));
        this.f33745u = C36568h.m40985a(new C11478b(context, this));
    }

    /* renamed from: c */
    public View mo9764c() {
        WeImageView weImageView = new WeImageView(this.f28306d);
        weImageView.setImageResource(C0966R.raw.more_more_icon_normal);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.FG_0));
        weImageView.setLayoutParams(new ViewGroup.LayoutParams(C76577a.m92151b(weImageView.getContext(), 28), C76577a.m92151b(weImageView.getContext(), 28)));
        weImageView.setIconColor(this.f28306d.getResources().getColor(C0966R.color.FG_1));
        return weImageView;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.b17;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        View findViewById = view.findViewById(C0966R.C0970id.izj);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…ve_wish_edit_gift_layout)");
        this.f33739o = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.mmx);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.wish_add)");
        this.f33740p = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.mmz);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.wish_complete_layout)");
        this.f33741q = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.f359594mn1);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.wish_divider_layout)");
        this.f33742r = (ConstraintLayout) findViewById4;
        LinearLayout linearLayout = this.f33740p;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C11477a(this));
        } else {
            C87412m.m108603p("createWishView");
            throw null;
        }
    }

    /* renamed from: o */
    public void mo9768o() {
        mo9763a();
        ((C77407n) ((C36570n) this.f33745u).getValue()).mo107573q();
    }

    public void onChanged(Object obj) {
        T t;
        Iterator<T> it;
        C50767p11 p112;
        C48648a11 a112 = (C48648a11) obj;
        Log.m105924i("WishAnchorPanelWidget", "onChanged: " + a112);
        Throwable th = null;
        if (a112 != null) {
            ConstraintLayout constraintLayout = this.f33739o;
            if (constraintLayout != null) {
                constraintLayout.removeAllViews();
                boolean z = false;
                if (a112.f130205f >= a112.f130204e) {
                    ConstraintLayout constraintLayout2 = this.f33741q;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                        ConstraintLayout constraintLayout3 = this.f33742r;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(0);
                            this.f28309g.mo9110a("", "");
                            ConstraintLayout constraintLayout4 = this.f33739o;
                            if (constraintLayout4 != null) {
                                ViewGroup.LayoutParams layoutParams = constraintLayout4.getLayoutParams();
                                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = C76577a.m92151b(this.f28306d, 36);
                                marginLayoutParams.bottomMargin = C76577a.m92151b(this.f28306d, 66);
                            } else {
                                C87412m.m108603p("giftPanelLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("wishDividerLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("completeLayout");
                        throw null;
                    }
                } else {
                    ConstraintLayout constraintLayout5 = this.f33741q;
                    if (constraintLayout5 != null) {
                        constraintLayout5.setVisibility(8);
                        ConstraintLayout constraintLayout6 = this.f33742r;
                        if (constraintLayout6 != null) {
                            constraintLayout6.setVisibility(8);
                            String string = this.f28306d.getResources().getString(C0966R.string.fyw);
                            C87412m.m108593f(string, "context.resources.getStr…er_live_wish_panel_title)");
                            String string2 = this.f28306d.getResources().getString(C0966R.string.f360585fp3);
                            C87412m.m108593f(string2, "context.resources.getStr…ve_gift_wish_anchor_tips)");
                            this.f28309g.mo9110a(string, string2);
                            ConstraintLayout constraintLayout7 = this.f33739o;
                            if (constraintLayout7 != null) {
                                ViewGroup.LayoutParams layoutParams2 = constraintLayout7.getLayoutParams();
                                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                marginLayoutParams2.topMargin = C76577a.m92151b(this.f28306d, 40);
                                marginLayoutParams2.bottomMargin = C76577a.m92151b(this.f28306d, 100);
                            } else {
                                C87412m.m108603p("giftPanelLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("wishDividerLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("completeLayout");
                        throw null;
                    }
                }
                LinkedList<C51280sp2> linkedList = a112.f130203d;
                C87412m.m108593f(linkedList, "wish_list");
                Iterator<T> it4 = linkedList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    C50767p11 p113 = ((C51280sp2) t).f141663d;
                    if (C61926c.m72696u(p113 != null ? p113.f139519s : 0, 8)) {
                        break;
                    }
                }
                boolean z2 = t != null;
                LinkedList<C51280sp2> linkedList2 = a112.f130203d;
                C87412m.m108593f(linkedList2, "wish_list");
                Iterator<T> it5 = linkedList2.iterator();
                while (it5.hasNext()) {
                    C51280sp2 sp22 = (C51280sp2) it5.next();
                    C87412m.m108593f(sp22, LocaleUtil.ITALIAN);
                    LayoutInflater from = LayoutInflater.from(this.f28306d);
                    ConstraintLayout constraintLayout8 = this.f33739o;
                    if (constraintLayout8 != null) {
                        View inflate = from.inflate(C0966R.C0971layout.b15, constraintLayout8, z);
                        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.dmc);
                        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.dmf);
                        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.mn4);
                        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.f359593mn0);
                        TextView textView4 = (TextView) inflate.findViewById(C0966R.C0970id.jb_);
                        View findViewById = inflate.findViewById(C0966R.C0970id.f358159nm1);
                        inflate.setId(sp22.hashCode());
                        C50767p11 p114 = sp22.f141663d;
                        if (p114 != null) {
                            it = it5;
                            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(p114.f139509f, C27696y.THUMB_IMAGE));
                            C87412m.m108593f(imageView, "giftView");
                            ((C99342a) a).mo85954d(imageView);
                            textView.setText(p114.f139515o);
                        } else {
                            it = it5;
                        }
                        textView4.setVisibility(8);
                        StringBuilder sb = new StringBuilder();
                        sb.append(XVFSFile.SEPARATOR_CHAR);
                        sb.append(sp22.f141664e);
                        textView2.setText(sb.toString());
                        long j = sp22.f141665f;
                        textView3.setText(j > TimeUtil.SECOND_TO_US ? "100万+" : String.valueOf(j));
                        C62042e eVar = C62042e.f176370a;
                        C87412m.m108593f(findViewById, "tagView");
                        C50767p11 p115 = sp22.f141663d;
                        eVar.mo87007G1(findViewById, p115 != null ? C8916d.f28211b1.mo9727a(p115) : null);
                        if (z2 && (p112 = sp22.f141663d) != null) {
                            if (C61926c.m72696u(p112.f139519s, 8)) {
                                textView4.setVisibility(0);
                            } else {
                                textView4.setVisibility(4);
                            }
                        }
                        ConstraintLayout constraintLayout9 = this.f33739o;
                        if (constraintLayout9 != null) {
                            constraintLayout9.addView(inflate);
                            it5 = it;
                            th = null;
                            z = false;
                        } else {
                            C87412m.m108603p("giftPanelLayout");
                            throw null;
                        }
                    } else {
                        Throwable th4 = th;
                        C87412m.m108603p("giftPanelLayout");
                        throw th4;
                    }
                }
            } else {
                C87412m.m108603p("giftPanelLayout");
                throw null;
            }
        }
        Throwable th5 = th;
        ConstraintLayout constraintLayout10 = this.f33739o;
        if (constraintLayout10 != null) {
            mo11446r(constraintLayout10);
        } else {
            C87412m.m108603p("giftPanelLayout");
            throw th5;
        }
    }
}
