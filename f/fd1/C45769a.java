package fd1;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C7446m0;
import gd1.C45905a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C50998qq3;
import te3.C51141rq3;
import te3.C52170yu2;
import te3.C64586nn1;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: fd1.a */
public final class C45769a extends C60896i<C45905a> {

    /* renamed from: e */
    public ImageView f123657e;

    /* renamed from: f */
    public TextView f123658f;

    /* renamed from: g */
    public TextView f123659g;

    /* renamed from: h */
    public View f123660h;

    /* renamed from: i */
    public TextView f123661i;

    /* renamed from: j */
    public View f123662j;

    /* renamed from: n */
    public WeImageView f123663n;

    /* renamed from: o */
    public ImageView f123664o;

    /* renamed from: p */
    public TextView f123665p;

    /* renamed from: q */
    public View f123666q;

    /* renamed from: r */
    public View f123667r;

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cxv;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        String str3;
        int i3;
        String str4;
        LinkedList<C50998qq3> linkedList;
        C50998qq3 qq32;
        String str5;
        C60905o oVar2 = oVar;
        C45905a aVar = (C45905a) cVar;
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar, "item");
        View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.f5348co);
        C87412m.m108593f(findViewById, "holder.itemView.findViewById(R.id.account_avatar)");
        this.f123657e = (ImageView) findViewById;
        View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.n5m);
        C87412m.m108593f(findViewById2, "holder.itemView.findViewById(R.id.account_name)");
        this.f123658f = (TextView) findViewById2;
        View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.cs9);
        C87412m.m108593f(findViewById3, "holder.itemView.findViewById(R.id.account_wx_name)");
        this.f123659g = (TextView) findViewById3;
        View findViewById4 = oVar2.f44854d.findViewById(C0966R.C0970id.n5q);
        C87412m.m108593f(findViewById4, "holder.itemView.findViewById(R.id.account_status)");
        this.f123665p = (TextView) findViewById4;
        View findViewById5 = oVar2.f44854d.findViewById(C0966R.C0970id.n5f);
        C87412m.m108593f(findViewById5, "holder.itemView.findView…(R.id.account_add_layout)");
        this.f123662j = findViewById5;
        View findViewById6 = oVar2.f44854d.findViewById(C0966R.C0970id.n5g);
        C87412m.m108593f(findViewById6, "holder.itemView.findViewById(R.id.account_choose)");
        this.f123664o = (ImageView) findViewById6;
        View findViewById7 = oVar2.f44854d.findViewById(C0966R.C0970id.n5i);
        C87412m.m108593f(findViewById7, "holder.itemView.findViewById(R.id.account_line)");
        this.f123666q = findViewById7;
        View findViewById8 = oVar2.f44854d.findViewById(C0966R.C0970id.n5e);
        C87412m.m108593f(findViewById8, "holder.itemView.findViewById(R.id.account_add)");
        this.f123663n = (WeImageView) findViewById8;
        View findViewById9 = oVar2.f44854d.findViewById(C0966R.C0970id.n5k);
        C87412m.m108593f(findViewById9, "holder.itemView.findView…(R.id.account_msg_layout)");
        this.f123660h = findViewById9;
        View findViewById10 = oVar2.f44854d.findViewById(C0966R.C0970id.n5j);
        C87412m.m108593f(findViewById10, "holder.itemView.findViewById(R.id.account_msg)");
        this.f123661i = (TextView) findViewById10;
        View findViewById11 = oVar2.f44854d.findViewById(C0966R.C0970id.n5l);
        C87412m.m108593f(findViewById11, "holder.itemView.findView…d(R.id.account_msg_redot)");
        this.f123667r = findViewById11;
        String str6 = aVar.f123874d.field_username;
        String str7 = "";
        if (str6 == null || str6.length() == 0) {
            TextView textView = this.f123658f;
            if (textView != null) {
                textView.setText(oVar2.f173499A.getResources().getString(C0966R.string.mla));
                C51141rq3 rq32 = aVar.f123876f;
                if (!(rq32 == null || (linkedList = rq32.f141080d) == null || (qq32 = (C50998qq3) C110818d0.m150916N(linkedList)) == null || (str5 = qq32.f140483d) == null)) {
                    str7 = str5;
                }
                TextView textView2 = this.f123659g;
                if (textView2 != null) {
                    textView2.setText(str7.length() > 0 ? oVar2.f173499A.getResources().getString(C0966R.string.n0y, new Object[]{str7}) : oVar2.f173499A.getResources().getString(C0966R.string.n0z));
                    ImageView imageView = this.f123657e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        View view = this.f123662j;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view3 = this.f123666q;
                            if (view3 != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View view5 = this.f123660h;
                                if (view5 != null) {
                                    C9556a aVar4 = new C9556a();
                                    aVar4.mo10233c(8);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    if (aVar.f123877g) {
                                        TextView textView3 = this.f123658f;
                                        if (textView3 != null) {
                                            textView3.setTextColor(oVar2.f173499A.getColor(C0966R.color.FG_0));
                                            WeImageView weImageView = this.f123663n;
                                            if (weImageView != null) {
                                                weImageView.setIconColor(oVar2.f173499A.getColor(C0966R.color.FG_0));
                                            } else {
                                                C87412m.m108603p("addIv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("nameTv");
                                            throw null;
                                        }
                                    } else {
                                        TextView textView4 = this.f123658f;
                                        if (textView4 != null) {
                                            textView4.setTextColor(oVar2.f173499A.getColor(C0966R.color.FG_2));
                                            WeImageView weImageView2 = this.f123663n;
                                            if (weImageView2 != null) {
                                                weImageView2.setIconColor(oVar2.f173499A.getColor(C0966R.color.FG_2));
                                            } else {
                                                C87412m.m108603p("addIv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("nameTv");
                                            throw null;
                                        }
                                    }
                                    C7446m0 m0Var = C7446m0.f25635a;
                                    View view7 = oVar2.f44854d;
                                    C87412m.m108593f(view7, "holder.itemView");
                                    C7446m0.m7572b(m0Var, view7, "create_new_account", 8, 0, (Map) null, 24, (Object) null);
                                    return;
                                }
                                C87412m.m108603p("msgLayout");
                                throw null;
                            }
                            C87412m.m108603p("accountLine");
                            throw null;
                        }
                        C87412m.m108603p("addLayout");
                        throw null;
                    }
                    C87412m.m108603p("avatarIv");
                    throw null;
                }
                C87412m.m108603p("wxNameTv");
                throw null;
            }
            C87412m.m108603p("nameTv");
            throw null;
        }
        TextView textView5 = this.f123658f;
        if (textView5 != null) {
            textView5.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, aVar.f123874d.field_nickname));
            C52170yu2 yu22 = aVar.f123874d.mo75251m2().f132491H;
            if (yu22 == null || (str = yu22.f145513d) == null) {
                str = str7;
            }
            if (str.length() > 0) {
                TextView textView6 = this.f123659g;
                if (textView6 != null) {
                    textView6.setText(str);
                } else {
                    C87412m.m108603p("wxNameTv");
                    throw null;
                }
            } else {
                TextView textView7 = this.f123659g;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                } else {
                    C87412m.m108603p("wxNameTv");
                    throw null;
                }
            }
            ImageView imageView2 = this.f123657e;
            if (imageView2 != null) {
                if (!Util.isNullOrNil(aVar.f123874d.field_avatarUrl)) {
                    C39818r rVar = C39818r.f106831a;
                    str3 = str7;
                    str2 = "avatarIv";
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(aVar.f123874d.field_avatarUrl, (C27696y) null, 2, (C8480h) null), imageView2, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                } else {
                    str2 = "avatarIv";
                    str3 = str7;
                }
                ImageView imageView3 = this.f123657e;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    View view8 = this.f123662j;
                    if (view8 != null) {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar5.mo10233c(8);
                        View view9 = view8;
                        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        boolean z2 = aVar.f123874d.mo75251m2().f132503q == 1;
                        int color = oVar2.f173499A.getColor(C0966R.color.FG_0);
                        TextView textView8 = this.f123658f;
                        if (textView8 != null) {
                            textView8.setTextColor(color);
                            TextView textView9 = this.f123665p;
                            if (textView9 != null) {
                                if (z2) {
                                    textView9.setText(oVar2.f173499A.getResources().getString(C0966R.string.moe));
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                textView9.setVisibility(i3);
                                String str8 = aVar.f123874d.field_username;
                                if (z2 || C87412m.m108589b(C66785b.f191882e.mo90662O5(), str8) || Util.isNullOrNil(str8) || aVar.f123875e) {
                                    View view10 = this.f123660h;
                                    if (view10 != null) {
                                        C9556a aVar6 = new C9556a();
                                        aVar6.mo10233c(8);
                                        View view11 = view10;
                                        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                        C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    } else {
                                        C87412m.m108603p("msgLayout");
                                        throw null;
                                    }
                                } else {
                                    String str9 = aVar.f123874d.field_username;
                                    C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(cls2)).Nt0();
                                    int j = mo71243j(Nt0.mo77262d6("finder_private_msg_entrance", str9)) + mo71243j(Nt0.mo77262d6("AuthorProfileNotify", str9));
                                    if (j > 0) {
                                        View view12 = this.f123660h;
                                        if (view12 != null) {
                                            C9556a aVar7 = new C9556a();
                                            aVar7.mo10233c(0);
                                            View view13 = view12;
                                            C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "showMessageRedDot", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                            C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "showMessageRedDot", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            TextView textView10 = this.f123661i;
                                            if (textView10 != null) {
                                                Resources resources = oVar2.f173499A.getResources();
                                                Object[] objArr = new Object[1];
                                                objArr[0] = j > 999 ? "999+" : String.valueOf(j);
                                                textView10.setText(resources.getString(C0966R.string.ml_, objArr));
                                            } else {
                                                C87412m.m108603p("accountMsg");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("msgLayout");
                                            throw null;
                                        }
                                    } else {
                                        View view14 = this.f123660h;
                                        if (view14 != null) {
                                            C9556a aVar8 = new C9556a();
                                            aVar8.mo10233c(8);
                                            View view15 = view14;
                                            C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "showMessageRedDot", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                            C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvert", "showMessageRedDot", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/convert/model/FinderAccountData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        } else {
                                            C87412m.m108603p("msgLayout");
                                            throw null;
                                        }
                                    }
                                }
                                ImageView imageView4 = this.f123664o;
                                if (imageView4 != null) {
                                    imageView4.setVisibility(aVar.f123875e ? 0 : 8);
                                    C54446b bVar = aVar.f123874d;
                                    String str10 = bVar.field_username;
                                    C52170yu2 yu23 = bVar.mo75251m2().f132491H;
                                    String str11 = (yu23 == null || (str4 = yu23.f145513d) == null) ? str3 : str4;
                                    C60152b4 Nt02 = ((C60200t1) C86312j.m106911c(cls2)).Nt0();
                                    int j2 = mo71243j(Nt02.mo77262d6("finder_private_msg_entrance", str10)) + mo71243j(Nt02.mo77262d6("AuthorProfileNotify", str10));
                                    C7446m0 m0Var2 = C7446m0.f25635a;
                                    View view16 = oVar2.f44854d;
                                    C87412m.m108593f(view16, "holder.itemView");
                                    C13604l[] lVarArr = new C13604l[3];
                                    C13604l lVar = new C13604l("finder_username", str10);
                                    int i4 = 0;
                                    lVarArr[0] = lVar;
                                    if (j2 > 0) {
                                        i4 = 1;
                                    }
                                    lVarArr[1] = new C13604l("is_red_dot", Integer.valueOf(i4));
                                    lVarArr[2] = new C13604l("wx_username", str11);
                                    C7446m0.m7572b(m0Var2, view16, "switch_avatar", 8, 0, C90364q0.m113147f(lVarArr), 8, (Object) null);
                                    return;
                                }
                                C87412m.m108603p("chooseIv");
                                throw null;
                            }
                            C87412m.m108603p("statusTv");
                            throw null;
                        }
                        C87412m.m108603p("nameTv");
                        throw null;
                    }
                    C87412m.m108603p("addLayout");
                    throw null;
                }
                C87412m.m108603p(str2);
                throw null;
            }
            C87412m.m108603p("avatarIv");
            throw null;
        }
        C87412m.m108603p("nameTv");
        throw null;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final int mo71243j(C64586nn1 nn12) {
        if (nn12 != null && nn12.f184502d == 2) {
            return nn12.f184503e;
        }
        return 0;
    }
}
