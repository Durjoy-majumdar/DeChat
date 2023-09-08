package ve1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import er1.C7878t0;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rs1.C13442s8;
import up1.C27696y;

/* renamed from: ve1.v3 */
public abstract class C14657v3 extends C60896i<BaseFinderFeed> {

    /* renamed from: e */
    public final FinderFoldedScrollLayout.C3953a f40539e;

    /* renamed from: f */
    public final int f40540f;

    /* renamed from: ve1.v3$a */
    public static final class C14658a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14657v3 f40541d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40542e;

        public C14658a(C14657v3 v3Var, C60905o oVar) {
            this.f40541d = v3Var;
            this.f40542e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40541d.f40539e.mo2389f(this.f40542e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.v3$b */
    public static final class C14659b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImageView f40543d;

        public C14659b(ImageView imageView) {
            this.f40543d = imageView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40543d.callOnClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.v3$c */
    public static final class C14660c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40544d;

        public C14660c(C60905o oVar) {
            this.f40544d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) this.f40544d.f173503E;
            intent.putExtra("finder_username", baseFinderFeed.mo3513o().getUserName());
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f40544d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8.C13443a.m12791e(aVar, context, intent, baseFinderFeed.getItemId(), (String) null, 0, 5, false, 0, 192, (Object) null);
            Context context2 = this.f40544d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFoldedConvert$onCreateViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14657v3(FinderFoldedScrollLayout.C3953a aVar, int i) {
        C87412m.m108594g(aVar, "controller");
        this.f40539e = aVar;
        this.f40540f = i;
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f40540f;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setOnClickListener(new C14658a(this, oVar));
        ConstraintLayout.LayoutParams a = this.f40539e.mo2386a();
        if (a != null) {
            oVar.mo85812D(C0966R.C0970id.kk6).getLayoutParams().height = a.height;
            oVar.mo85812D(C0966R.C0970id.kk6).getLayoutParams().width = a.width;
            oVar.f44854d.requestLayout();
        }
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.d78);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
        if (textView != null) {
            textView.setOnClickListener(new C14659b(imageView));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new C14660c(oVar));
        }
    }

    /* renamed from: j */
    public void mo13849j(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        C58969q l;
        C60905o oVar2 = oVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d78);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.fnp);
        if (this.f40539e.mo2388e() == 1) {
            imageView.setVisibility(0);
            C60979d<C100810g0> i25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C58969q l2 = baseFinderFeed.mo3507l();
            i25.mo85957c(new C62345f(Util.nullAsNil(l2 != null ? l2.getAvatarUrl() : null), (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(baseFinderFeed.mo3513o().getNickNameSpan());
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            }
            ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.a0g);
            if (!(imageView2 == null || (l = baseFinderFeed.mo3507l()) == null)) {
                C58784w3.m68429F1(C58784w3.f168295a, imageView2, l.field_authInfo, 0, C58960c.m68830b(l, false), 4, (Object) null);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView3 = (ImageView) oVar2.mo85812D(C0966R.C0970id.a0g);
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        View D = oVar2.mo85812D(C0966R.C0970id.da7);
        if (D != null) {
            int likeCount = baseFinderFeed.mo3513o().getLikeCount();
            int i3 = (!this.f40539e.mo2387c() || likeCount <= 0) ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFoldedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFoldedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f40539e.mo2387c() && likeCount > 0) {
                String c = C7878t0.m8034c(2, likeCount);
                C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                textView2.setText(c);
            }
        }
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (textView3 == null) {
            return;
        }
        if (!Util.isNullOrNil(baseFinderFeed.mo3513o().getDescription())) {
            textView3.setVisibility(0);
            textView3.setText(baseFinderFeed.mo3513o().getDescriptionSpan());
            return;
        }
        textView3.setText("");
    }
}
