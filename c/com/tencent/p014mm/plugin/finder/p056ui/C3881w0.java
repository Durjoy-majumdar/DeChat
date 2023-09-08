package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58684b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C50581nr0;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.ui.w0 */
public final class C3881w0 extends BaseAdapter {

    /* renamed from: d */
    public Activity f17435d;

    /* renamed from: e */
    public ArrayList<C50581nr0> f17436e = new ArrayList<>();

    /* renamed from: f */
    public C32226l<? super C50581nr0, C13598b0> f17437f;

    /* renamed from: g */
    public C32226l<? super C50581nr0, C13598b0> f17438g;

    /* renamed from: com.tencent.mm.plugin.finder.ui.w0$a */
    public static final class C3882a {

        /* renamed from: a */
        public ImageView f17439a;

        /* renamed from: b */
        public TextView f17440b;

        /* renamed from: c */
        public WeImageView f17441c;

        /* renamed from: d */
        public View f17442d;

        /* renamed from: e */
        public WeImageView f17443e;

        /* renamed from: f */
        public View f17444f;

        /* renamed from: a */
        public final WeImageView mo4220a() {
            WeImageView weImageView = this.f17443e;
            if (weImageView != null) {
                return weImageView;
            }
            C87412m.m108603p("unLike");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.w0$b */
    public static final class C3883b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C3881w0 f17445d;

        /* renamed from: e */
        public final /* synthetic */ C3882a f17446e;

        /* renamed from: f */
        public final /* synthetic */ C50581nr0 f17447f;

        public C3883b(C3881w0 w0Var, C3882a aVar, C50581nr0 nr02) {
            this.f17445d = w0Var;
            this.f17446e = aVar;
            this.f17447f = nr02;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C3881w0 w0Var = this.f17445d;
            C3882a aVar = this.f17446e;
            C50581nr0 nr02 = this.f17447f;
            w0Var.getClass();
            C87412m.m108594g(aVar, "vh");
            C87412m.m108594g(nr02, "likeInfo");
            if (nr02.f138727g == 1) {
                w0Var.mo4212a(aVar);
            } else {
                w0Var.mo4213b(aVar);
            }
            nr02.f138727g = (nr02.f138727g + 1) % 2;
            C32226l<? super C50581nr0, C13598b0> lVar = w0Var.f17437f;
            if (lVar != null) {
                lVar.invoke(nr02);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.w0$c */
    public static final class C3884c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C3881w0 f17448d;

        /* renamed from: e */
        public final /* synthetic */ C3882a f17449e;

        /* renamed from: f */
        public final /* synthetic */ C50581nr0 f17450f;

        public C3884c(C3881w0 w0Var, C3882a aVar, C50581nr0 nr02) {
            this.f17448d = w0Var;
            this.f17449e = aVar;
            this.f17450f = nr02;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C3881w0 w0Var = this.f17448d;
            C3882a aVar = this.f17449e;
            C50581nr0 nr02 = this.f17450f;
            w0Var.getClass();
            C87412m.m108594g(aVar, "vh");
            C87412m.m108594g(nr02, "likeInfo");
            if (nr02.f138728h == 1) {
                w0Var.mo4215f(aVar);
            } else {
                w0Var.mo4214d(aVar);
            }
            nr02.f138728h = (nr02.f138728h + 1) % 2;
            C32226l<? super C50581nr0, C13598b0> lVar = w0Var.f17438g;
            if (lVar != null) {
                lVar.invoke(nr02);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.w0$d */
    public static final class C3885d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C50581nr0 f17451d;

        /* renamed from: e */
        public final /* synthetic */ C3881w0 f17452e;

        public C3885d(C50581nr0 nr02, C3881w0 w0Var) {
            this.f17451d = nr02;
            this.f17452e = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C58684b) C86312j.m106911c(C58684b.class)).fy0(this.f17451d.f138729i, this.f17452e.f17435d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C3881w0(Activity activity) {
        C87412m.m108594g(activity, "context");
        this.f17435d = activity;
    }

    /* renamed from: a */
    public final void mo4212a(C3882a aVar) {
        C87412m.m108594g(aVar, "vh");
        WeImageView weImageView = aVar.f17441c;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.icons_outlined_like);
            WeImageView weImageView2 = aVar.f17441c;
            if (weImageView2 != null) {
                weImageView2.setIconColor(this.f17435d.getResources().getColor(C0966R.color.FG_2));
            } else {
                C87412m.m108603p("likeIv");
                throw null;
            }
        } else {
            C87412m.m108603p("likeIv");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo4213b(C3882a aVar) {
        C87412m.m108594g(aVar, "vh");
        WeImageView weImageView = aVar.f17441c;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.icons_filled_like);
            WeImageView weImageView2 = aVar.f17441c;
            if (weImageView2 != null) {
                weImageView2.setIconColor(this.f17435d.getResources().getColor(C0966R.color.f2966ao));
            } else {
                C87412m.m108603p("likeIv");
                throw null;
            }
        } else {
            C87412m.m108603p("likeIv");
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo4214d(C3882a aVar) {
        C87412m.m108594g(aVar, "vh");
        aVar.mo4220a().setImageResource(C0966R.raw.icons_filled_eyes_off);
        aVar.mo4220a().setIconColor(this.f17435d.getResources().getColor(C0966R.color.FG_0));
    }

    /* renamed from: f */
    public final void mo4215f(C3882a aVar) {
        C87412m.m108594g(aVar, "vh");
        aVar.mo4220a().setImageResource(C0966R.raw.icons_outlined_eyes_on);
        aVar.mo4220a().setIconColor(this.f17435d.getResources().getColor(C0966R.color.FG_2));
    }

    public int getCount() {
        return this.f17436e.size();
    }

    public Object getItem(int i) {
        C50581nr0 nr02 = this.f17436e.get(i);
        C87412m.m108593f(nr02, "dataList[position]");
        return nr02;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76979h.class;
        if (view == null) {
            view2 = C85868k2.m106137b(this.f17435d).inflate(C0966R.C0971layout.adj, viewGroup, false);
            view2.setTag(new C3882a());
        } else {
            view2 = view;
        }
        Object tag = view2.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderFriendRecommendAdapter.LikedViewHolder");
        C3882a aVar = (C3882a) tag;
        View findViewById = view2.findViewById(C0966R.C0970id.da8);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.finder_liked_avatar_iv)");
        aVar.f17439a = (ImageView) findViewById;
        View findViewById2 = view2.findViewById(C0966R.C0970id.dac);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…finder_liked_username_tv)");
        aVar.f17440b = (TextView) findViewById2;
        View findViewById3 = view2.findViewById(C0966R.C0970id.da_);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.finder_liked_iv)");
        aVar.f17441c = (WeImageView) findViewById3;
        View findViewById4 = view2.findViewById(C0966R.C0970id.da9);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.…inder_liked_click_layout)");
        aVar.f17442d = findViewById4;
        View findViewById5 = view2.findViewById(C0966R.C0970id.e8h);
        C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.finder_unliked_iv)");
        aVar.f17443e = (WeImageView) findViewById5;
        View findViewById6 = view2.findViewById(C0966R.C0970id.e8i);
        C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.finder_unliked_layout)");
        aVar.f17444f = findViewById6;
        C50581nr0 nr02 = this.f17436e.get(i);
        C87412m.m108593f(nr02, "dataList[position]");
        C50581nr0 nr03 = nr02;
        if (C87412m.m108589b(nr03.f138729i, C75592q0.m90789s())) {
            View view3 = aVar.f17442d;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                aVar.mo4220a().setVisibility(8);
            } else {
                C87412m.m108603p("likeLayout");
                throw null;
            }
        } else {
            View view5 = aVar.f17442d;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                String str = "likeLayout";
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/ui/FinderFriendRecommendAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = aVar.f17442d;
                if (view7 != null) {
                    view7.setOnClickListener(new C3883b(this, aVar, nr03));
                    View view8 = aVar.f17444f;
                    if (view8 != null) {
                        view8.setOnClickListener(new C3884c(this, aVar, nr03));
                        SpannableString T1 = ((C76979h) C86312j.m106911c(cls3)).mo107057T1(this.f17435d, nr03.f138724d);
                        View view9 = aVar.f17444f;
                        if (view9 != null) {
                            view9.setTag(C0966R.C0970id.d58, T1);
                        } else {
                            C87412m.m108603p("unLikeLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("unLikeLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p(str);
                    throw null;
                }
            } else {
                C87412m.m108603p("likeLayout");
                throw null;
            }
        }
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
        C62345f fVar = new C62345f(nr03.f138725e, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = aVar.f17439a;
        if (imageView != null) {
            K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            TextView textView = aVar.f17440b;
            if (textView != null) {
                textView.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(this.f17435d, nr03.f138724d));
                if (nr03.f138727g == 1) {
                    mo4213b(aVar);
                } else {
                    mo4212a(aVar);
                }
                if (nr03.f138728h == 1) {
                    mo4214d(aVar);
                } else {
                    mo4215f(aVar);
                }
                ImageView imageView2 = aVar.f17439a;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new C3885d(nr03, this));
                    return view2;
                }
                C87412m.m108603p("avatarIv");
                throw null;
            }
            C87412m.m108603p("nicknameTv");
            throw null;
        }
        C87412m.m108603p("avatarIv");
        throw null;
    }
}
