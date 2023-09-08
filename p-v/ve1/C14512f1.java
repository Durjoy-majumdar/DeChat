package ve1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0793y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import p910lj.C76701a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C50581nr0;
import up1.C27696y;

/* renamed from: ve1.f1 */
public final class C14512f1 extends C60896i<C0793y> {

    /* renamed from: e */
    public final long f40232e;

    /* renamed from: f */
    public final String f40233f = "Finder.FinderFeedFriendLikeConvert";

    /* renamed from: g */
    public C32226l<? super C50581nr0, C13598b0> f40234g;

    /* renamed from: h */
    public Toast f40235h;

    public C14512f1(long j) {
        this.f40232e = j;
    }

    /* renamed from: j */
    public static void m13823j(C14512f1 f1Var, C60905o oVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        f1Var.getClass();
        C87412m.m108594g(oVar, "holder");
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.e8h)).setImageResource(C0966R.raw.icons_outlined_eyes_off);
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.e8h)).setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.Red_100));
        if (z) {
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String string = oVar.f173499A.getString(C0966R.string.f360796m34);
            C87412m.m108593f(string, "holder.context.getString…er_unlike_toast_text_new)");
            Toast toast = f1Var.f40235h;
            if (toast != null) {
                toast.cancel();
            }
            f1Var.f40235h = null;
            Toast makeText = C76701a.makeText(context, (CharSequence) "", 0);
            View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
            WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.kpx);
            weImageView.setImageResource(C0966R.raw.icons_filled_eyes_off);
            ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            weImageView.setLayoutParams(layoutParams);
            weImageView.setIconColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
            textView.setText(string);
            textView.setTextSize(0, context.getResources().getDimension(C0966R.dimen.f3684bd));
            textView.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            makeText.setGravity(17, 0, 0);
            makeText.setView(inflate);
            makeText.show();
            f1Var.f40235h = makeText;
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.adj;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0793y yVar;
        C8479f0 f0Var;
        C50581nr0 nr02;
        boolean z2;
        C60905o oVar2 = oVar;
        int i3 = i;
        C0793y yVar2 = (C0793y) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76979h.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(yVar2, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.da8);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.dac);
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.e8h);
        View D = oVar2.mo85812D(C0966R.C0970id.e8i);
        C8479f0 f0Var2 = new C8479f0();
        f0Var2.f27484d = oVar2.mo85812D(C0966R.C0970id.fnn);
        C50581nr0 nr03 = yVar2.f1851d;
        if (C87412m.m108589b(nr03.f138729i, C75592q0.m90789s())) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D;
            yVar = yVar2;
            z2 = false;
            f0Var = f0Var2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            nr02 = nr03;
        } else {
            yVar = yVar2;
            f0Var = f0Var2;
            z2 = false;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = D;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            nr02 = nr03;
            D.setOnClickListener(new C14475c1(this, oVar2, nr02));
            D.setTag(C0966R.C0970id.d58, ((C76979h) C86312j.m106911c(cls3)).mo107057T1(oVar2.f173499A, nr02.f138724d));
        }
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
        C62345f fVar = new C62345f(nr02.f138725e, (C27696y) null, 2, (C8480h) null);
        C87412m.m108593f(imageView, "avatarIv");
        K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        textView.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(oVar2.f173499A, C58784w3.m68433S(C58784w3.f168295a, nr02.f138729i, nr02.f138724d, false, 4, (Object) null)));
        if (nr02.f138727g == 1) {
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.da_)).setImageResource(C0966R.raw.icons_filled_like);
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.da_)).setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2966ao));
        } else {
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.da_)).setImageResource(C0966R.raw.icons_outlined_like);
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.da_)).setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.FG_2));
        }
        if (nr02.f138728h == 1) {
            m13823j(this, oVar2, z2, 2, (Object) null);
        } else {
            mo13773k(oVar);
        }
        C0793y yVar3 = yVar;
        oVar2.f44854d.setOnClickListener(new C14489d1(nr02, oVar2, this, yVar3));
        C8479f0 f0Var3 = f0Var;
        View view3 = (View) f0Var3.f27484d;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(z2 ? 1 : 0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (yVar3.f1852e && !yVar3.f1853f) {
            String str = this.f40233f;
            StringBuilder sb = new StringBuilder();
            sb.append("begin blink animation ");
            int i4 = i;
            sb.append(i4);
            Log.m105924i(str, sb.toString());
            yVar3.f1853f = true;
            View view5 = (View) f0Var3.f27484d;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Integer.valueOf(z2));
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(z2)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = (View) f0Var3.f27484d;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Float.valueOf(1.0f));
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((Float) aVar5.mo10231a(z2)).floatValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ((View) f0Var3.f27484d).animate().alpha(0.0f).setDuration(1000).setListener(new C14500e1(f0Var3, this, i4)).start();
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: k */
    public final void mo13773k(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.e8h)).setImageResource(C0966R.raw.icons_outlined_eyes_on);
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.e8h)).setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_1));
        Toast toast = this.f40235h;
        if (toast != null) {
            toast.cancel();
        }
        this.f40235h = null;
    }
}
