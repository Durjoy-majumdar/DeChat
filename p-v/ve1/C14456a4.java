package ve1;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0748l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58969q;
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
import l31.C61212e;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13604l;
import sx3.C90364q0;
import up1.C27696y;

/* renamed from: ve1.a4 */
public final class C14456a4 extends C60896i<C0748l0> {

    /* renamed from: e */
    public final String f40087e = "FinderFollowConvert";

    /* renamed from: ve1.a4$a */
    public static final class C14457a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f40088d;

        public C14457a(View view) {
            this.f40088d = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f40088d.getHitRect(rect);
            int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
            rect.inset(i, i);
            ViewParent parent = this.f40088d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f40088d));
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a9t;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C60905o oVar2 = oVar;
        C0748l0 l0Var = (C0748l0) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C61212e.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(l0Var, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.a27);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.a0g);
        View D = oVar2.mo85812D(C0966R.C0970id.dv9);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.a0k);
        C58969q qVar = l0Var.f1766d;
        Context context = oVar2.f173499A;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        C62345f fVar = new C62345f(qVar.getAvatarUrl(), (C27696y) null, 2, (C8480h) null);
        C87412m.m108593f(imageView, "avatarIv");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, qVar.getNickname()));
        FinderAuthInfo finderAuthInfo = qVar.field_authInfo;
        int i3 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
        textView2.setVisibility(8);
        C58784w3 w3Var = C58784w3.f168295a;
        C87412m.m108593f(imageView2, "authIcon");
        TextView textView3 = textView2;
        C58784w3.m68429F1(w3Var, imageView2, qVar.field_authInfo, 0, C58960c.m68830b(qVar, false), 4, (Object) null);
        if (i3 <= 0) {
            textView3.setVisibility(8);
        } else if (i3 == 1) {
            textView3.setVisibility(0);
            FinderAuthInfo finderAuthInfo2 = qVar.field_authInfo;
            if (finderAuthInfo2 == null || (str = finderAuthInfo2.authProfession) == null) {
                str = "";
            }
            textView3.setText(str);
        } else if (i3 != 2 && i3 == 100) {
            textView3.setVisibility(8);
        }
        if (qVar.field_liveStatus == 1) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = D;
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((C61212e) C86312j.m106911c(cls3)).o30(view, "living_label");
            ((C61212e) C86312j.m106911c(cls3)).mo86175pO(view, 40, 26236);
            ((C61212e) C86312j.m106911c(cls3)).mo86149PM(view, C90364q0.m113147f(new C13604l("feed_id", ""), new C13604l("live_id", ""), new C13604l("comment_scene", "12"), new C13604l("finder_username", qVar.getUsername()), new C13604l("session_buffer", " ")));
            ((C61212e) C86312j.m106911c(cls3)).E60(view, C14699y3.f40648a);
            view.setOnClickListener(new C14708z3(view, oVar, qVar));
            textView.getViewTreeObserver().addOnPreDrawListener(new C14691x3(textView, view, imageView2, this));
            return;
        }
        View view2 = D;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewParent parent = view2.getParent();
        View view4 = parent instanceof View ? (View) parent : null;
        if (view4 != null) {
            view4.setTouchDelegate((TouchDelegate) null);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.dv9);
        D.post(new C14457a(D));
    }
}
