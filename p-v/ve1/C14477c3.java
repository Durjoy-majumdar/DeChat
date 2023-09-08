package ve1;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0729f0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7644m;
import er1.C7919x;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C51389tf1;

/* renamed from: ve1.c3 */
public final class C14477c3 extends C60896i<C0729f0> {

    /* renamed from: e */
    public final C32226l<Integer, C13598b0> f40123e;

    /* renamed from: f */
    public final C10008v1 f40124f;

    /* renamed from: g */
    public int f40125g = 3;

    /* renamed from: h */
    public TextView f40126h;

    /* renamed from: i */
    public int f40127i;

    /* renamed from: j */
    public boolean f40128j;

    /* renamed from: n */
    public boolean f40129n;

    /* renamed from: o */
    public final MTimerHandler f40130o = new MTimerHandler(new C14480b(this), true);

    /* renamed from: ve1.c3$a */
    public static final class C14478a extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C14477c3 f40131g;

        /* renamed from: ve1.c3$a$a */
        public static final class C14479a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C7637b f40132d;

            /* renamed from: e */
            public final /* synthetic */ C14477c3 f40133e;

            public C14479a(C7637b bVar, C14477c3 c3Var) {
                this.f40132d = bVar;
                this.f40133e = c3Var;
            }

            public final void run() {
                int i = ((C7644m) this.f40132d).f25962c;
                C14477c3 c3Var = this.f40133e;
                if (i != c3Var.f40127i && !c3Var.f40129n) {
                    c3Var.mo13734j();
                    this.f40133e.f40129n = true;
                }
            }
        }

        public C14478a(C14477c3 c3Var) {
            this.f40131g = c3Var;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            if ((bVar instanceof C7644m) && ((C7644m) bVar).f25961b == 1) {
                C88024r.m109572b(new C14479a(bVar, this.f40131g));
            }
        }
    }

    /* renamed from: ve1.c3$b */
    public static final class C14480b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C14477c3 f40134d;

        public C14480b(C14477c3 c3Var) {
            this.f40134d = c3Var;
        }

        public final boolean onTimerExpired() {
            C14477c3 c3Var = this.f40134d;
            int i = c3Var.f40125g;
            if (i <= 0) {
                return false;
            }
            c3Var.f40125g = i - 1;
            TextView textView = c3Var.f40126h;
            if (textView != null) {
                textView.setText(MMApplicationContext.getContext().getString(C0966R.string.d1m, new Object[]{Integer.valueOf(c3Var.f40125g)}));
            }
            C14477c3 c3Var2 = this.f40134d;
            if (c3Var2.f40125g != 0) {
                return true;
            }
            C32226l<Integer, C13598b0> lVar = c3Var2.f40123e;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(c3Var2.f40127i));
            }
            this.f40134d.mo13734j();
            return true;
        }
    }

    public C14477c3(C32226l<? super Integer, C13598b0> lVar, C10008v1 v1Var, int i) {
        AppCompatActivity context;
        C13442s8 f;
        C58553c y3;
        C87412m.m108594g(v1Var, "contract");
        this.f40123e = lVar;
        this.f40124f = v1Var;
        MMActivity activity = v1Var.getActivity();
        if (activity != null && (context = activity.getContext()) != null && (f = C13442s8.f38060Q0.mo12873f(context)) != null && (y3 = f.mo12867y3(i)) != null) {
            y3.mo83450a(new C14478a(this));
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aqm;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C60905o oVar2 = oVar;
        C0729f0 f0Var = (C0729f0) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(f0Var, "item");
        C51389tf1 tf12 = f0Var.mo3513o().getFinderObject().place_holder_info;
        View D = oVar2.mo85812D(C0966R.C0970id.kaj);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (tf12 != null && tf12.f142198f == 1) {
            View D2 = oVar2.mo85812D(C0966R.C0970id.o7o);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = D2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D3 = oVar2.mo85812D(C0966R.C0970id.o7w);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view2 = D3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar2.mo85812D(C0966R.C0970id.kaj).setOnClickListener((View.OnClickListener) null);
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.o7p);
            textView.setVisibility(0);
            textView.setOnClickListener(new C14491d3(this, oVar2));
            return;
        }
        View D4 = oVar2.mo85812D(C0966R.C0970id.o7o);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view3 = D4;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D5 = oVar2.mo85812D(C0966R.C0970id.o7w);
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view4 = D5;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.o7p)).setVisibility(8);
        if (tf12 != null) {
            int i3 = tf12.f142197e;
            if (i3 == -4036) {
                str = tf12.f142196d;
                if (str == null) {
                    str = oVar2.f173499A.getResources().getString(C0966R.string.eoh);
                    C87412m.m108593f(str, "holder.context.resources….finder_set_privacy_tips)");
                }
            } else if (i3 == -4033) {
                str = tf12.f142196d;
                if (str == null) {
                    str = oVar2.f173499A.getResources().getString(C0966R.string.d_8);
                    C87412m.m108593f(str, "holder.context.resources…finder_feed_self_see_tip)");
                }
            } else if (i3 != -4011) {
                str = "";
            } else {
                str = tf12.f142196d;
                if (str == null) {
                    str = oVar2.f173499A.getResources().getString(C0966R.string.f360503d90);
                    C87412m.m108593f(str, "holder.context.resources….finder_feed_deleted_tip)");
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = oVar2.f173499A.getResources().getString(C0966R.string.d5b);
                C87412m.m108593f(str, "holder.context.resources…reate_contact_failed_tip)");
            }
            ((TextView) oVar2.mo85812D(C0966R.C0970id.kyk)).setText(str);
        }
        oVar2.mo85812D(C0966R.C0970id.kaj).setOnClickListener(new C14502e3(this));
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.kvh);
        this.f40126h = textView2;
        if (!this.f40128j) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f40126h;
            if (textView3 != null) {
                textView3.setText(oVar2.f173499A.getString(C0966R.string.d1m, new Object[]{3}));
            }
            this.f40125g = 3;
            this.f40130o.startTimer(1000, 1000);
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.f40127i = i;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.o7r);
        C87412m.m108593f(D, "holder.getView<TextView>…finder_recommend_tips_tv)");
        C7919x.m8091a((TextView) D);
        View D2 = oVar.mo85812D(C0966R.C0970id.o7p);
        C87412m.m108593f(D2, "holder.getView<TextView>…inder_open_recommend_btn)");
        C7919x.m8091a((TextView) D2);
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        mo13734j();
    }

    /* renamed from: j */
    public final void mo13734j() {
        this.f40128j = true;
        TextView textView = this.f40126h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f40127i = 0;
        this.f40130o.stopTimer();
    }
}
