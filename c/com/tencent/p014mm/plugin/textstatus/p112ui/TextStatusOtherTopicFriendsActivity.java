package com.tencent.p014mm.plugin.textstatus.p112ui;

import ac2.C39535k;
import ac2.C91988j;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import jq3.C9500j;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import oz2.C47416g;
import qy2.C77448f0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import su0.C13781a;
import sz2.C48518b;
import vz2.C53062f;
import vz2.C78501d;
import yz2.C16086o;
import yz2.C16088u2;
import yz2.C16089v2;
import yz2.C53673f2;
import yz2.C53697m2;
import z04.C112551y;
import zb2.C103009m;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "a", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity */
public final class TextStatusOtherTopicFriendsActivity extends MMSecDataActivity {

    /* renamed from: t */
    public static final C30508a f116976t = new C30508a((C8480h) null);

    /* renamed from: d */
    public final C13601g f116977d = C36568h.m40985a(new C43238m(this));

    /* renamed from: e */
    public final C13601g f116978e = C36568h.m40985a(new C43237l(this));

    /* renamed from: f */
    public final C13601g f116979f = C36568h.m40985a(new C43239n(this));

    /* renamed from: g */
    public final C13601g f116980g = C36568h.m40985a(new C43236k(this));

    /* renamed from: h */
    public final C13601g f116981h = C36568h.m40985a(new C43228c(this));

    /* renamed from: i */
    public final C13601g f116982i = C36568h.m40985a(new C43240o(this));

    /* renamed from: j */
    public final C13601g f116983j = C36568h.m40985a(new C43227b(this));

    /* renamed from: n */
    public MvvmList<C48518b> f116984n;

    /* renamed from: o */
    public long f116985o;

    /* renamed from: p */
    public final TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1 f116986p = new TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1(this, C40008f.f107254d);

    /* renamed from: q */
    public boolean f116987q = true;

    /* renamed from: r */
    public final C32224a<Integer> f116988r = new C43229d(this);

    /* renamed from: s */
    public final C32224a<Integer> f116989s = new C43230e(this);

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$a */
    public static final class C30508a {
        public C30508a(C8480h hVar) {
        }

        /* renamed from: a */
        public static void m39108a(C30508a aVar, Context context, String str, int i, long j, int i2, Object obj) {
            Context context2 = context;
            String str2 = (i2 & 2) != 0 ? "" : str;
            int i3 = (i2 & 4) != 0 ? 0 : i;
            long j2 = (i2 & 8) != 0 ? 0 : j;
            aVar.getClass();
            C87412m.m108594g(context, "context");
            Intent intent = new Intent(context, TextStatusOtherTopicFriendsActivity.class);
            intent.putExtra("exclude_topic_id", str2);
            intent.putExtra("key_source", i3);
            intent.putExtra("KEY_RED_DOT_TYPE", j2);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$b */
    public static final class C43227b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43227b(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116990d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f116990d.findViewById(C0966R.C0970id.g1h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$c */
    public static final class C43228c extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43228c(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116991d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return (ViewGroup) this.f116991d.findViewById(C0966R.C0970id.m3l);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$d */
    public static final class C43229d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43229d(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116992d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            C78501d.m94807i(C78501d.f229945a, 5, (String) null, 0, (String) null, (String) null, (String) null, this.f116992d.mo67464I7(), 0, 0, (String) null, (Integer) null, (String) null, 4030, (Object) null);
            return 4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$e */
    public static final class C43230e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43230e(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116993d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            C78501d.m94807i(C78501d.f229945a, 4, (String) null, 0, (String) null, (String) null, (String) null, this.f116993d.mo67464I7(), 0, 0, (String) null, (Integer) null, (String) null, 4030, (Object) null);
            return 3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$f */
    public static final class C43231f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116994d;

        public C43231f(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            this.f116994d = textStatusOtherTopicFriendsActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116994d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$g */
    public static final class C43232g<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 f116995d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116996e;

        public C43232g(TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 textStatusOtherTopicFriendsActivity$onCreate$dataList$1, TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            this.f116995d = textStatusOtherTopicFriendsActivity$onCreate$dataList$1;
            this.f116996e = textStatusOtherTopicFriendsActivity;
        }

        public void onChanged(Object obj) {
            if (((C91988j) obj).f263327a == C39535k.UIRefresh) {
                ArrayList<T> arrayList = this.f116995d.f272353o;
                TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f116996e;
                boolean z = true;
                String str = null;
                if (!arrayList.isEmpty()) {
                    Object value = ((C36570n) textStatusOtherTopicFriendsActivity.f116981h).getValue();
                    C87412m.m108593f(value, "<get-llWithoutFriendsStatus>(...)");
                    ((ViewGroup) value).setVisibility(8);
                    C16089v2.m14974c3((C16089v2) textStatusOtherTopicFriendsActivity.component(C16089v2.class), 0, 1, (Object) null);
                    return;
                }
                Object value2 = ((C36570n) textStatusOtherTopicFriendsActivity.f116981h).getValue();
                C87412m.m108593f(value2, "<get-llWithoutFriendsStatus>(...)");
                ((ViewGroup) value2).setVisibility(0);
                Object value3 = ((C36570n) textStatusOtherTopicFriendsActivity.f116981h).getValue();
                C87412m.m108593f(value3, "<get-llWithoutFriendsStatus>(...)");
                ((ViewGroup) value3).setPadding(0, 0, 0, (C75044y4.m89989a(textStatusOtherTopicFriendsActivity.getContext()) + C75044y4.m89994f(textStatusOtherTopicFriendsActivity.getContext())) / 2);
                Object value4 = ((C36570n) textStatusOtherTopicFriendsActivity.f116982i).getValue();
                C87412m.m108593f(value4, "<get-tvWithoutFriendsStatus>(...)");
                C85875k4.m106191k0(((TextView) value4).getPaint());
                C48201c n0 = C39674e.f106452d.mo62253n0(C13781a.m13082a());
                if (n0 != null) {
                    str = n0.field_IconID;
                }
                if (str != null && !C112551y.m153811k(str)) {
                    z = false;
                }
                if (!z) {
                    Object value5 = ((C36570n) textStatusOtherTopicFriendsActivity.f116983j).getValue();
                    C87412m.m108593f(value5, "<get-llSetTextStatus>(...)");
                    ((LinearLayout) value5).setVisibility(8);
                    return;
                }
                Object value6 = ((C36570n) textStatusOtherTopicFriendsActivity.f116983j).getValue();
                C87412m.m108593f(value6, "<get-llSetTextStatus>(...)");
                ((LinearLayout) value6).setVisibility(0);
                Object value7 = ((C36570n) textStatusOtherTopicFriendsActivity.f116983j).getValue();
                C87412m.m108593f(value7, "<get-llSetTextStatus>(...)");
                ((LinearLayout) value7).setOnClickListener(new C71541i(textStatusOtherTopicFriendsActivity));
                C78501d.m94805g(C78501d.f229945a, 35, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$h */
    public static final class C43233h extends C103009m<C48518b> {
        public C43233h(TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 textStatusOtherTopicFriendsActivity$onCreate$dataList$1, C9500j jVar) {
            super(textStatusOtherTopicFriendsActivity$onCreate$dataList$1, jVar, false, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$i */
    public static final class C43234i extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116997d;

        public C43234i(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            this.f116997d = textStatusOtherTopicFriendsActivity;
        }

        /* renamed from: f */
        public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(recyclerView, "parent");
            TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f116997d;
            C30508a aVar = TextStatusOtherTopicFriendsActivity.f116976t;
            RecyclerView.C16613e adapter = textStatusOtherTopicFriendsActivity.mo67463H7().getAdapter();
            if (i == (adapter != null ? adapter.getItemCount() : 1) - 1) {
                rect.bottom = C76577a.m92151b(this.f116997d, 16);
            } else {
                rect.bottom = C76577a.m92151b(this.f116997d, 8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$j */
    public static final class C43235j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43235j(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116998d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            try {
                TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f116998d;
                MvvmList<C48518b> mvvmList = textStatusOtherTopicFriendsActivity.f116984n;
                if (mvvmList != null) {
                    mvvmList.mo129613q(C47416g.f127202g.mo72449a(textStatusOtherTopicFriendsActivity));
                }
            } catch (Throwable unused) {
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$k */
    public static final class C43236k extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f116999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43236k(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f116999d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return Long.valueOf(this.f116999d.getIntent().getLongExtra("KEY_RED_DOT_TYPE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$l */
    public static final class C43237l extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43237l(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f117000d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f117000d.findViewById(C0966R.C0970id.iwc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$m */
    public static final class C43238m extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43238m(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f117001d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f117001d.findViewById(C0966R.C0970id.ixi);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$n */
    public static final class C43239n extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43239n(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f117002d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return Integer.valueOf(this.f117002d.getIntent().getIntExtra("key_source", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$o */
    public static final class C43240o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43240o(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            super(0);
            this.f117003d = textStatusOtherTopicFriendsActivity;
        }

        public Object invoke() {
            return (TextView) this.f117003d.findViewById(C0966R.C0970id.kwk);
        }
    }

    /* renamed from: H7 */
    public final WxRecyclerView mo67463H7() {
        Object value = ((C36570n) this.f116977d).getValue();
        C87412m.m108593f(value, "<get-rvOtherTopic>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: I7 */
    public final int mo67464I7() {
        return ((Number) ((C36570n) this.f116979f).getValue()).intValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9k;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f116986p.alive();
        this.f116985o = C31543z5.m39453c();
        setBackBtn(new C43231f(this));
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setNavigationbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle((int) C0966R.string.k1e);
        String stringExtra = getIntent().getStringExtra("exclude_topic_id");
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(this).mo75002a(C53673f2.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…pPageDataUIC::class.java)");
        C53673f2 f2Var = (C53673f2) a;
        mo67463H7().setLayoutManager(new LinearLayoutManager(this, 1, false));
        TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 textStatusOtherTopicFriendsActivity$onCreate$dataList$1 = new TextStatusOtherTopicFriendsActivity$onCreate$dataList$1(new C47416g(this, stringExtra, mo67464I7(), ((Number) ((C36570n) this.f116980g).getValue()).longValue()), this, new C53769h());
        this.f116984n = textStatusOtherTopicFriendsActivity$onCreate$dataList$1;
        textStatusOtherTopicFriendsActivity$onCreate$dataList$1.f272358t.observe(this, new C43232g(textStatusOtherTopicFriendsActivity$onCreate$dataList$1, this));
        C43233h hVar = new C43233h(textStatusOtherTopicFriendsActivity$onCreate$dataList$1, new TextStatusOtherTopicFriendsActivity$buildItemConverts$1(this, mo67464I7()));
        f2Var.f150747e = hVar;
        hVar.setHasStableIds(true);
        mo67463H7().setAdapter(f2Var.f150747e);
        mo67463H7().setAnimation((Animation) null);
        RecyclerView.C16616j itemAnimator = mo67463H7().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        mo67463H7().setItemAnimator((RecyclerView.C16616j) null);
        mo67463H7().mo17085h0(new C43234i(this));
        Object value = ((C36570n) this.f116978e).getValue();
        C87412m.m108593f(value, "<get-root>(...)");
        ((LinearLayout) value).setBackgroundColor(getResources().getColor(C0966R.color.al6));
        mo67463H7().setBackgroundColor(getResources().getColor(C0966R.color.al6));
        int i = C74783i3.m89537a(this).f24704a;
        int b = C76577a.m92151b(this, 24);
        int b2 = (((i - (b * 2)) - C76577a.m92151b(this, 32)) - C76577a.m92151b(this, 24)) / (C76577a.m92151b(this, 8) + C76577a.m92151b(this, 32));
        ((C53697m2) rVar.mo62444c(this).mo75002a(C53697m2.class)).f150791d = this.f116988r;
        C16089v2 v2Var = (C16089v2) component(C16089v2.class);
        WxRecyclerView H7 = mo67463H7();
        v2Var.getClass();
        v2Var.f43237e = H7;
        H7.setOnTouchListener(new C16088u2(v2Var));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.TextStatusOtherTopicFriendsActivity).mo86179qs(this, C76986a.TextState);
    }

    public void onDestroy() {
        C78501d.m94807i(C78501d.f229945a, 9, (String) null, 0, (String) null, (String) null, (String) null, 0, C31543z5.m39453c() - this.f116985o, 0, (String) null, (Integer) null, (String) null, 3966, (Object) null);
        super.onDestroy();
        this.f116986p.dead();
        TextStatusCardFeedsActivity.C43198a aVar = TextStatusCardFeedsActivity.f116896j;
        TextStatusCardFeedsActivity.f116897n.clear();
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "onPause() called");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "onResume() called");
        if (!this.f116987q) {
            C61926c.m72661F("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", new C43235j(this));
        }
        if (this.f116987q) {
            this.f116987q = false;
        }
    }

    public void onStart() {
        Log.m105918d("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "onStart() called");
        super.onStart();
    }

    public void onStop() {
        Log.m105918d("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "onStop() called");
        super.onStop();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C53697m2.class);
        hashSet.add(C53673f2.class);
        hashSet.add(C16086o.class);
        hashSet.add(C53062f.class);
        hashSet.add(C16089v2.class);
    }
}
