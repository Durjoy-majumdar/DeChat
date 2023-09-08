package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C50275lk0;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.ui.a */
public final class C41525a extends BaseAdapter {

    /* renamed from: d */
    public Activity f111820d;

    /* renamed from: e */
    public ArrayList<C50275lk0> f111821e = new ArrayList<>();

    /* renamed from: f */
    public C32227p<? super View, ? super Integer, C13598b0> f111822f;

    /* renamed from: g */
    public C32227p<? super View, ? super Integer, C13598b0> f111823g;

    /* renamed from: com.tencent.mm.plugin.finder.ui.a$a */
    public static final class C41526a {

        /* renamed from: a */
        public ImageView f111824a;

        /* renamed from: b */
        public TextView f111825b;

        /* renamed from: c */
        public TextView f111826c;
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.a$b */
    public static final class C41527b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C41525a f111827d;

        /* renamed from: e */
        public final /* synthetic */ View f111828e;

        /* renamed from: f */
        public final /* synthetic */ int f111829f;

        public C41527b(C41525a aVar, View view, int i) {
            this.f111827d = aVar;
            this.f111828e = view;
            this.f111829f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32227p<? super View, ? super Integer, C13598b0> pVar = this.f111827d.f111823g;
            if (pVar != null) {
                View view2 = this.f111828e;
                C87412m.m108593f(view2, "clickArea");
                pVar.invoke(view2, Integer.valueOf(this.f111829f));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.a$c */
    public static final class C41528c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C41525a f111830d;

        /* renamed from: e */
        public final /* synthetic */ View f111831e;

        /* renamed from: f */
        public final /* synthetic */ int f111832f;

        public C41528c(C41525a aVar, View view, int i) {
            this.f111830d = aVar;
            this.f111831e = view;
            this.f111832f = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C32227p<? super View, ? super Integer, C13598b0> pVar = this.f111830d.f111822f;
            if (pVar != null) {
                View view2 = this.f111831e;
                C87412m.m108593f(view2, "clickArea");
                pVar.invoke(view2, Integer.valueOf(this.f111832f));
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.a$d */
    public static final class C41529d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C41525a f111833d;

        /* renamed from: e */
        public final /* synthetic */ View f111834e;

        /* renamed from: f */
        public final /* synthetic */ int f111835f;

        public C41529d(C41525a aVar, View view, int i) {
            this.f111833d = aVar;
            this.f111834e = view;
            this.f111835f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32227p<? super View, ? super Integer, C13598b0> pVar = this.f111833d.f111823g;
            if (pVar != null) {
                View view2 = this.f111834e;
                C87412m.m108593f(view2, "clickArea");
                pVar.invoke(view2, Integer.valueOf(this.f111835f));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C41525a(Activity activity) {
        C87412m.m108594g(activity, "context");
        this.f111820d = activity;
    }

    /* renamed from: a */
    public C50275lk0 getItem(int i) {
        C50275lk0 lk02 = this.f111821e.get(i);
        C87412m.m108593f(lk02, "dataList[position]");
        return lk02;
    }

    /* renamed from: b */
    public final void mo64610b(List<? extends C50275lk0> list) {
        C87412m.m108594g(list, "contacts");
        this.f111821e.clear();
        this.f111821e.addAll(list);
    }

    public int getCount() {
        return this.f111821e.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        int i2;
        boolean z;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (view == null) {
            view = View.inflate(this.f111820d, C0966R.C0971layout.a_q, (ViewGroup) null);
            view.setTag(new C41526a());
        }
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FansListAdapter.ContactViewHolder");
        C41526a aVar = (C41526a) tag;
        View findViewById = view.findViewById(C0966R.C0970id.a27);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        aVar.f111824a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.nickname_tv)");
        aVar.f111825b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.a84);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.before_split_tv)");
        aVar.f111826c = (TextView) findViewById3;
        C50275lk0 a = getItem(i);
        FinderContact finderContact = a.f137476d;
        if (finderContact == null || (str = finderContact.headUrl) == null) {
            str = "";
        }
        String nullAsNil = Util.nullAsNil(str);
        if (a.f137480h == 0) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
            C62345f fVar = new C62345f(nullAsNil, (C27696y) null, 2, (C8480h) null);
            ImageView imageView = aVar.f111824a;
            if (imageView != null) {
                K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            } else {
                C87412m.m108603p("avatarIv");
                throw null;
            }
        } else {
            C39818r rVar2 = C39818r.f106831a;
            C60979d<C100810g0> i25 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar2 = new C62345f(nullAsNil, (C27696y) null, 2, (C8480h) null);
            ImageView imageView2 = aVar.f111824a;
            if (imageView2 != null) {
                i25.mo85957c(fVar2, imageView2, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            } else {
                C87412m.m108603p("avatarIv");
                throw null;
            }
        }
        TextView textView = aVar.f111825b;
        if (textView != null) {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Activity activity = this.f111820d;
            C58784w3 w3Var = C58784w3.f168295a;
            String str2 = a.f137481i;
            FinderContact finderContact2 = a.f137476d;
            textView.setText(hVar.mo107057T1(activity, C58784w3.m68433S(w3Var, str2, finderContact2 != null ? finderContact2.nickname : null, false, 4, (Object) null)));
            ArrayList<C50275lk0> arrayList = this.f111821e;
            ListIterator<C50275lk0> listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i2 = -1;
                    break;
                }
                if (listIterator.previous().f137477e == 1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            }
            if (i2 != i || i == getCount() - 1) {
                TextView textView2 = aVar.f111826c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                } else {
                    C87412m.m108603p("beforeTip");
                    throw null;
                }
            } else {
                TextView textView3 = aVar.f111826c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                } else {
                    C87412m.m108603p("beforeTip");
                    throw null;
                }
            }
            View findViewById4 = view.findViewById(C0966R.C0970id.ctc);
            if (getItem(i).f137479g) {
                findViewById4.setOnLongClickListener((View.OnLongClickListener) null);
                findViewById4.setOnClickListener(new C41527b(this, findViewById4, i));
            } else {
                findViewById4.setOnLongClickListener(new C41528c(this, findViewById4, i));
                findViewById4.setOnClickListener(new C41529d(this, findViewById4, i));
            }
            return view;
        }
        C87412m.m108603p("nicknameTv");
        throw null;
    }
}
