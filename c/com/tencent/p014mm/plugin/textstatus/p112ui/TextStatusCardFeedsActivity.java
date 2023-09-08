package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import bl3.C39818r;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StatusCardFeedItemScrollEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.card.TextStatusCardFeedUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dm2.C45418c;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import in3.C87773e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import mz2.C47149b;
import nj3.C88989a;
import oz2.C35347a;
import oz2.C47412d;
import oz2.C62185f;
import p196ln.C76705f;
import p606mm.C99933h;
import p640ox.C77049b;
import p816jl.C60878a;
import qy2.C47896n;
import qy2.C77448f0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import su0.C13781a;
import sx3.C64197v;
import sz2.C48518b;
import uz2.C52673c1;
import uz2.C78315f0;
import vo3.C78461f;
import vz2.C53061b;
import vz2.C78501d;
import yz2.C53673f2;
import yz2.C53678h0;
import yz2.C53690k0;
import yz2.C53694l0;
import yz2.C53696m0;
import yz2.C79284y;
import z04.C112551y;
import zz2.C16421b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "a", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity */
public class TextStatusCardFeedsActivity extends MMSecDataActivity {

    /* renamed from: j */
    public static final C43198a f116896j = new C43198a((C8480h) null);

    /* renamed from: n */
    public static final LinkedList<C48201c> f116897n = new LinkedList<>();

    /* renamed from: o */
    public static String f116898o = "SCENE_DEFAULT";

    /* renamed from: d */
    public boolean f116899d;

    /* renamed from: e */
    public final C13601g f116900e = C36568h.m40985a(new C5632d(this));

    /* renamed from: f */
    public final C13601g f116901f = C36568h.m40985a(new C5636m(this));

    /* renamed from: g */
    public final C13601g f116902g = C36568h.m40985a(new C5637n(this));

    /* renamed from: h */
    public C62185f f116903h;

    /* renamed from: i */
    public final C43199b f116904i = new C43199b(this);

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$d */
    public static final class C5632d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f21582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5632d(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            super(0);
            this.f21582d = textStatusCardFeedsActivity;
        }

        public Object invoke() {
            return (ImageView) this.f21582d.findViewById(C0966R.C0970id.msy);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$f */
    public static final class C5633f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f21583d;

        public C5633f(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f21583d = textStatusCardFeedsActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21583d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$h */
    public static final class C5634h extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f21584d;

        public C5634h(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f21584d = textStatusCardFeedsActivity;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$onCreate$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onScrolled: ");
                TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f21584d;
                C43198a aVar = TextStatusCardFeedsActivity.f116896j;
                RecyclerView.LayoutManager layoutManager = textStatusCardFeedsActivity.mo67429J7().getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                sb.append(((LinearLayoutManager) layoutManager).mo16957C());
                Log.m105924i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", sb.toString());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$onCreate$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$onCreate$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$onCreate$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$k */
    public static final class C5635k implements C60878a.C60879c {
        /* renamed from: a */
        public void mo6660a(int i) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onPageStartChange() called with: position = " + i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$m */
    public static final class C5636m extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f21585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5636m(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            super(0);
            this.f21585d = textStatusCardFeedsActivity;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f21585d.findViewById(C0966R.C0970id.m6l);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$n */
    public static final class C5637n extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f21586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5637n(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            super(0);
            this.f21586d = textStatusCardFeedsActivity;
        }

        public Object invoke() {
            View findViewById = this.f21586d.findViewById(C0966R.C0970id.mmr);
            findViewById.setOnClickListener(C5645a.f21593d);
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$a */
    public static final class C43198a {
        public C43198a(C8480h hVar) {
        }

        /* renamed from: a */
        public static void m46779a(C43198a aVar, Context context, String str, int i, String str2, Integer num, View view, int i2, Object obj) {
            int i3;
            int i4;
            Context context2 = context;
            String str3 = (i2 & 2) != 0 ? "" : str;
            String str4 = (i2 & 8) != 0 ? "SCENE_DEFAULT" : str2;
            Activity activity = null;
            Integer num2 = (i2 & 16) != 0 ? null : num;
            View view2 = (i2 & 32) != 0 ? null : view;
            aVar.getClass();
            C87412m.m108594g(context2, "context");
            C87412m.m108594g(str4, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            TextStatusCardFeedsActivity.f116897n.clear();
            C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C53673f2.class);
            C87412m.m108593f(a, "UICProvider.of(context).…pPageDataUIC::class.java)");
            C53673f2 f2Var = (C53673f2) a;
            f2Var.f150748f = str3;
            Iterator<Object> it = f2Var.f150746d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C48518b) {
                    for (C48201c cVar : ((C48518b) next).f129772d.f129193b) {
                        TextStatusCardFeedsActivity.f116897n.add(cVar);
                        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
                        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_TextStatus_NewTextStatusSquareFakeData_Int, 0) == 1) {
                            for (int i5 = 0; i5 < 20; i5++) {
                                TextStatusCardFeedsActivity.f116897n.add(cVar);
                            }
                        }
                    }
                } else if (next instanceof C52673c1) {
                    TextStatusCardFeedsActivity.f116897n.add(C47149b.m52432a((C52673c1) next));
                }
            }
            Intent intent = new Intent(context2, TextStatusCardFeedsActivity.class);
            intent.putExtra("KEY_USER_NAME", str3);
            intent.putExtra("KEY_FROM_SCENE", str4);
            SimpleDateFormat simpleDateFormat2 = C77448f0.f225876a;
            if (!(((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_square_anim_and, C104160f.RepairerConfig_TextStatus_EntrySwitch_Int, 1) == 1 && !C85875k4.m106164U() && !C85875k4.m106165V()) || view2 == null) {
                i4 = -1;
                i3 = -1;
            } else {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                i3 = iArr[0];
                i4 = iArr[1];
            }
            intent.putExtra("KEY_START_CARD_ANIM_X_OFFSET", i3);
            intent.putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i4);
            if (num2 != null) {
                num2.intValue();
                intent.putExtra("KEY_SCROLL_INDEX", num2.intValue());
            }
            boolean z = context2 instanceof Activity;
            Activity activity2 = z ? (Activity) context2 : null;
            if (activity2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                aVar2.mo10233c(intent);
                C117292a.m165364j(activity2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$Companion", "startForResult", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            if (i3 == -1 || i4 == -1) {
                if (z) {
                    activity = (Activity) context2;
                }
                if (activity != null) {
                    activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                    return;
                }
                return;
            }
            if (z) {
                activity = (Activity) context2;
            }
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$b */
    public static final class C43199b implements C47896n.C47897a {

        /* renamed from: a */
        public final /* synthetic */ TextStatusCardFeedsActivity f116905a;

        public C43199b(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f116905a = textStatusCardFeedsActivity;
        }

        /* renamed from: a */
        public void mo67431a(int i, Object obj) {
            if (i == 1) {
                this.f116905a.onBackPressed();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$c */
    public static final class C43200c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f116906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43200c(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            super(0);
            this.f116906d = textStatusCardFeedsActivity;
        }

        public Object invoke() {
            TextStatusCardFeedsActivity.super.finish();
            this.f116906d.overridePendingTransition(0, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$e */
    public static final class C43201e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f116907d;

        public C43201e(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f116907d = textStatusCardFeedsActivity;
        }

        public final void run() {
            C62185f fVar = this.f116907d.f116903h;
            if (fVar != null) {
                fVar.mo85779n();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$g */
    public static final class C43202g implements C78461f.C78462a {

        /* renamed from: d */
        public int f116908d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusCardFeedsActivity f116909e;

        public C43202g(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f116909e = textStatusCardFeedsActivity;
        }

        /* renamed from: c3 */
        public void mo6473c3(int i) {
            if (i != 0 && this.f116908d == 0 && i > 0) {
                C60905o c3 = ((TextStatusCardFeedUIC) this.f116909e.component(TextStatusCardFeedUIC.class)).mo67472c3();
                C47896n nVar = null;
                Object obj = c3 != null ? c3.f173502D : null;
                if (obj instanceof C47896n) {
                    nVar = (C47896n) obj;
                }
                if (nVar != null) {
                    nVar.mo72645s(false);
                }
            }
            this.f116908d = i;
        }

        /* renamed from: w4 */
        public void mo6474w4(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$i */
    public static final class C43203i implements C60878a.C46560a {

        /* renamed from: a */
        public final /* synthetic */ TextStatusCardFeedsActivity f116910a;

        public C43203i(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f116910a = textStatusCardFeedsActivity;
        }

        public void onPageSelected(int i) {
            String str;
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onPageSelected() called with: position = " + i);
            TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) this.f116910a.component(TextStatusCardFeedUIC.class);
            TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f116910a;
            C43198a aVar = TextStatusCardFeedsActivity.f116896j;
            WxRecyclerView J7 = textStatusCardFeedsActivity.mo67429J7();
            textStatusCardFeedUIC.getClass();
            RecyclerView.C16631z I0 = J7.mo17023I0(i);
            C79284y yVar = null;
            C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
            Object obj = oVar != null ? oVar.f173502D : null;
            if (obj instanceof C79284y) {
                yVar = (C79284y) obj;
            }
            if (yVar == null || (str = yVar.f232766q) == null) {
                str = "";
            }
            String str2 = textStatusCardFeedUIC.f117019g;
            if (!(str2 == null || C112551y.m153811k(str2)) && !C112551y.m153811k(str)) {
                textStatusCardFeedUIC.f117018f = str;
            }
            textStatusCardFeedUIC.f117019g = str;
            if (!C112551y.m153811k(str)) {
                StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent = new StatusCardFeedItemScrollEvent();
                statusCardFeedItemScrollEvent.f107771d.f107772a = textStatusCardFeedUIC.f117019g;
                if (!textStatusCardFeedUIC.f117024o) {
                    statusCardFeedItemScrollEvent.publish();
                } else {
                    textStatusCardFeedUIC.f117027r = statusCardFeedItemScrollEvent;
                }
            }
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPageSelected() called with: position = " + i + ", lastScrollName:" + textStatusCardFeedUIC.f117018f + " lastSelectUserName:" + textStatusCardFeedUIC.f117019g);
            C43198a aVar2 = TextStatusCardFeedsActivity.f116896j;
            C87412m.m108589b(TextStatusCardFeedsActivity.f116898o, "SCENE_HISTORY_FEED");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$j */
    public static final class C43204j implements C60878a.C46561b {

        /* renamed from: a */
        public final /* synthetic */ TextStatusCardFeedsActivity f116911a;

        public C43204j(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
            this.f116911a = textStatusCardFeedsActivity;
        }

        /* renamed from: a */
        public void mo67434a(int i) {
            int i2 = i;
            Class cls = TextStatusCardFeedUIC.class;
            TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) this.f116911a.component(cls);
            TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f116911a;
            C43198a aVar = TextStatusCardFeedsActivity.f116896j;
            WxRecyclerView J7 = textStatusCardFeedsActivity.mo67429J7();
            textStatusCardFeedUIC.getClass();
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPageSettle() called with: position = " + i2 + " lastPos:" + textStatusCardFeedUIC.f117021i);
            if (i2 != textStatusCardFeedUIC.f117021i) {
                Activity context = textStatusCardFeedUIC.getContext();
                if (context instanceof TextStatusCardFeedsActivity) {
                    TextStatusCardFeedsActivity textStatusCardFeedsActivity2 = (TextStatusCardFeedsActivity) context;
                    if (!textStatusCardFeedsActivity2.f116899d && ((TextStatusCardFeedUIC) textStatusCardFeedsActivity2.component(cls)).mo67473d3()) {
                        textStatusCardFeedsActivity2.mo67429J7().post(new C53696m0(textStatusCardFeedsActivity2));
                    }
                }
                C60905o c3 = textStatusCardFeedUIC.mo67472c3();
                C79284y yVar = null;
                Object obj = c3 != null ? c3.f173502D : null;
                C47896n nVar = obj instanceof C47896n ? (C47896n) obj : null;
                if (nVar != null) {
                    nVar.mo72649m();
                    nVar.mo72642o(false);
                    int i3 = textStatusCardFeedUIC.f117021i;
                    if (i3 > i2) {
                        nVar.mo72644p(202);
                    } else if (i3 < i2) {
                        nVar.mo72644p(201);
                    }
                    RecyclerView.C16613e adapter = J7.getAdapter();
                    if (i2 == (adapter != null ? adapter.getItemCount() : 0) - 1) {
                        if (!(C39674e.f106452d.mo62253n0(C13781a.m13082a()) != null)) {
                            C78501d.m94805g(C78501d.f229945a, 33, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
                        }
                        nVar.mo72645s(true);
                    }
                }
                RecyclerView.C16631z I0 = J7.mo17023I0(i2);
                if (I0 instanceof C60905o) {
                    textStatusCardFeedUIC.f117017e = new WeakReference<>(I0);
                    C60905o c35 = textStatusCardFeedUIC.mo67472c3();
                    Object obj2 = c35 != null ? c35.f173502D : null;
                    if (obj2 instanceof C79284y) {
                        yVar = (C79284y) obj2;
                    }
                    if (yVar != null) {
                        yVar.mo72648k();
                        yVar.mo109292w();
                        yVar.mo72642o(textStatusCardFeedUIC.f117016d);
                        if (textStatusCardFeedUIC.f117016d) {
                            textStatusCardFeedUIC.f117016d = false;
                        }
                    }
                }
                textStatusCardFeedUIC.f117021i = i2;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$l */
    public static final class C43205l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62185f f116912d;

        public C43205l(C62185f fVar) {
            this.f116912d = fVar;
        }

        public final void run() {
            this.f116912d.mo85779n();
        }
    }

    /* renamed from: I7 */
    public final ImageView mo67428I7() {
        Object value = ((C36570n) this.f116900e).getValue();
        C87412m.m108593f(value, "<get-ivExitAnimAvatar>(...)");
        return (ImageView) value;
    }

    /* renamed from: J7 */
    public final WxRecyclerView mo67429J7() {
        Object value = ((C36570n) this.f116901f).getValue();
        C87412m.m108593f(value, "<get-rvCardFeed>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: K7 */
    public final void mo67430K7() {
        Class cls = TextStatusCardFeedUIC.class;
        ((TextStatusCardFeedUIC) component(cls)).f117024o = false;
        TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) component(cls);
        StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent = textStatusCardFeedUIC.f117027r;
        if (statusCardFeedItemScrollEvent != null) {
            statusCardFeedItemScrollEvent.publish();
        }
        textStatusCardFeedUIC.f117027r = null;
        View findViewById = findViewById(C0966R.C0970id.m6g);
        if (findViewById != null) {
            findViewById.setBackgroundColor(getResources().getColor(C0966R.color.f2950a7));
        }
    }

    public void finish() {
        Class cls = TextStatusCardFeedUIC.class;
        Intent intent = new Intent();
        intent.putExtra("KEY_SCROLL_USER_NAME", ((TextStatusCardFeedUIC) component(cls)).f117018f);
        C13598b0 b0Var = C13598b0.f38549a;
        setResult(-1, intent);
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "finish");
        if (((TextStatusCardFeedUIC) component(cls)).mo67473d3()) {
            Object value = ((C36570n) this.f116902g).getValue();
            C87412m.m108593f(value, "<get-vIntercept>(...)");
            View view = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C43200c cVar = new C43200c(this);
            mo67428I7().setVisibility(0);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(mo67428I7(), getIntent().getStringExtra("KEY_USER_NAME"), 0.0f);
            int intExtra = getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
            int intExtra2 = getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                View contentView = getContentView();
                if (contentView != null) {
                    contentView.setClipToOutline(true);
                }
                contentView.setTranslationX(0.0f);
                contentView.setTranslationY(0.0f);
                mo67428I7().setAlpha(0.0f);
                int h = C76577a.m92157h(this, C0966R.dimen.f3753d4);
                int h2 = C76577a.m92157h(this, C0966R.dimen.f3753d4);
                contentView.setPivotX(0.0f);
                contentView.setPivotY(0.0f);
                ViewPropertyAnimator translationY = contentView.animate().translationX((float) intExtra).translationY((float) intExtra2);
                translationY.setDuration(200);
                translationY.start();
                translationY.setUpdateListener(new C53690k0(contentView, h2, h2, this, h));
                translationY.setListener(new C53694l0(cVar));
                return;
            }
            return;
        }
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.m6l;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cmj;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        try {
            int i = ((TextStatusCardFeedUIC) component(TextStatusCardFeedUIC.class)).f117021i;
            C53673f2 f2Var = (C53673f2) component(C53673f2.class);
            ArrayList arrayList = new ArrayList();
            for (C48201c dVar : f116897n) {
                arrayList.add(new C47412d(dVar));
            }
            arrayList.add(new C35347a());
            f2Var.f150747e = new WxRecyclerAdapter(new TextStatusCardFeedsActivity$buildItemConverts$1(this, f116898o), arrayList, false);
            mo67429J7().setAdapter(f2Var.f150747e);
            WxRecyclerView J7 = mo67429J7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(J7, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            J7.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(J7, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            mo67429J7().post(new C43201e(this));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusCardFeedsActivity", th, "onConfigurationChanged err", new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        C78315f0 f0Var;
        Class cls = TextStatusCardFeedUIC.class;
        Class cls2 = C78315f0.class;
        Class cls3 = C77049b.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        setBackBtn(new C5633f(this));
        String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        int intExtra = getIntent().getIntExtra("KEY_SCROLL_INDEX", -1);
        String stringExtra2 = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra2 == null) {
            stringExtra2 = "SCENE_DEFAULT";
        }
        f116898o = stringExtra2;
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C53673f2.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…pPageDataUIC::class.java)");
        C53673f2 f2Var = (C53673f2) a;
        ArrayList<C9493c> arrayList = new ArrayList<>();
        for (C48201c dVar : f116897n) {
            arrayList.add(new C47412d(dVar));
        }
        arrayList.add(new C35347a());
        f2Var.f150749g = arrayList;
        Log.m105924i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onCreate");
        mo67429J7().setLayoutManager(new LinearLayoutManager(this, 1, false));
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            ((NestedBounceView) bounceView).mo154637e(new C43202g(this));
        }
        f2Var.f150747e = new WxRecyclerAdapter(new TextStatusCardFeedsActivity$buildItemConverts$1(this, f116898o), arrayList, false);
        mo67429J7().setAdapter(f2Var.f150747e);
        if (C87412m.m108589b(f116898o, "SCENE_HISTORY_FEED")) {
            mo67429J7().mo17043c(new C5634h(this));
        }
        if (intExtra != -1) {
            WxRecyclerView J7 = mo67429J7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intExtra));
            WxRecyclerView wxRecyclerView = J7;
            C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
            J7.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            Iterator<C9493c> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                C9493c next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C9493c cVar = next;
                    if ((cVar instanceof C47412d) && C87412m.m108589b(((C47412d) cVar).f127195d.field_UserName, stringExtra)) {
                        WxRecyclerView J72 = mo67429J7();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(i));
                        WxRecyclerView wxRecyclerView2 = J72;
                        C117292a.m165358d(wxRecyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        J72.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        C62185f fVar = new C62185f(false, 1, (C8480h) null);
        fVar.mo75025b(mo67429J7());
        fVar.f173447m = new C43203i(this);
        fVar.f173448n = new C43204j(this);
        fVar.f173449o = new C5635k();
        mo67429J7().post(new C43205l(fVar));
        fVar.f173443i = 20.0f;
        this.f116903h = fVar;
        ((C77049b) C86312j.m106911c(cls3)).mo72352Rp(this, new C45418c(cls2, 9, true));
        C78315f0 f0Var2 = (C78315f0) ((C77049b) C86312j.m106911c(cls3)).Wi0(this, 9, cls2);
        if (f0Var2 != null) {
            try {
                f0Var = (C78315f0) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(9, "TextStatusCardExposed");
            } catch (Throwable unused) {
                f0Var = null;
            }
            f0Var2.f229428d = f0Var != null ? f0Var.f229428d : null;
        }
        if (C87412m.m108589b(f116898o, "SCENE_DEFAULT")) {
            ((C16421b) component(C16421b.class)).mo14880d3((ViewGroup) findViewById(C0966R.C0970id.m6g), (String) null);
        }
        if (((TextStatusCardFeedUIC) component(cls)).mo67473d3()) {
            getContentView().setScaleX(0.0f);
            getContentView().setScaleY(0.0f);
        } else {
            getContentView().postDelayed(new C53678h0(this), 300);
        }
        ((TextStatusCardFeedUIC) component(cls)).f117024o = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        setRequestedOrientation(1);
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C53673f2.class);
        hashSet.add(TextStatusCardFeedUIC.class);
        hashSet.add(C53061b.class);
        hashSet.add(C16421b.class);
    }
}
