package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ak1.C54108o;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46551y0;
import kotlin.Metadata;
import kotlin.ResultKt;
import ok1.C62042e;
import qk1.C12816m2;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90363p0;
import vf1.C52879w5;
import vf1.C52881x5;
import vf1.C52883y5;
import vf1.C52884z5;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 */
public final class OccupyFinderUI39 extends MMFinderUI {

    /* renamed from: v */
    public static final /* synthetic */ int f111565v = 0;

    /* renamed from: o */
    public final C13601g f111566o = C36568h.m40985a(new C41437g(this));

    /* renamed from: p */
    public final C13601g f111567p = C36568h.m40985a(new C41433d(this));

    /* renamed from: q */
    public final C13601g f111568q = C36568h.m40985a(new C41431b(this));

    /* renamed from: r */
    public LinkedList<String> f111569r = new LinkedList<>();

    /* renamed from: s */
    public final C12816m2 f111570s;

    /* renamed from: t */
    public KeyboardHeightProvider f111571t;

    /* renamed from: u */
    public boolean f111572u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$a */
    public static final class C41430a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI39 f111573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41430a(OccupyFinderUI39 occupyFinderUI39) {
            super(1);
            this.f111573d = occupyFinderUI39;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "word");
            OccupyFinderUI39 occupyFinderUI39 = this.f111573d;
            C12816m2 m2Var = occupyFinderUI39.f111570s;
            m2Var.getClass();
            int indexOf = ((ArrayList) m2Var.f36693e).indexOf(str);
            ((ArrayList) m2Var.f36693e).remove(str);
            m2Var.notifyItemRemoved(indexOf);
            occupyFinderUI39.mo64535Q7(occupyFinderUI39.f111570s.getItemCount());
            C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) occupyFinderUI39), (C66212f) null, (C53934p0) null, new C52879w5(occupyFinderUI39, str, (C15601d<? super C52879w5>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$b */
    public static final class C41431b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI39 f111574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41431b(OccupyFinderUI39 occupyFinderUI39) {
            super(0);
            this.f111574d = occupyFinderUI39;
        }

        public Object invoke() {
            return (TextView) this.f111574d.findViewById(C0966R.C0970id.f357451eo2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$c */
    public static final class C41432c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C15601d<Boolean> f111575a;

        /* renamed from: b */
        public final /* synthetic */ OccupyFinderUI39 f111576b;

        /* renamed from: c */
        public final /* synthetic */ int f111577c;

        public C41432c(C15601d<? super Boolean> dVar, OccupyFinderUI39 occupyFinderUI39, int i) {
            this.f111575a = dVar;
            this.f111576b = occupyFinderUI39;
            this.f111577c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            if (r0 == false) goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r7) {
            /*
                r6 = this;
                ob0.b$c r7 = (ob0.C89132b.C89134c) r7
                r0 = 1
                r1 = 0
                if (r7 == 0) goto L_0x000c
                int r2 = r7.f256793a
                if (r2 != 0) goto L_0x000c
                r2 = 1
                goto L_0x000d
            L_0x000c:
                r2 = 0
            L_0x000d:
                java.lang.String r3 = "wordList"
                if (r2 == 0) goto L_0x006e
                int r2 = r7.f256794b
                if (r2 != 0) goto L_0x006e
                T r7 = r7.f256796d
                te3.j81 r7 = (te3.C49958j81) r7
                java.util.LinkedList<java.lang.String> r7 = r7.f135917d
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r2 = r6.f111576b
                int r4 = r6.f111577c
                gy3.C87412m.m108593f(r7, r3)
                r2.f111569r = r7
                r3 = 3
                if (r4 == r3) goto L_0x0042
                qk1.m2 r3 = r2.f111570s
                rx3.g r3 = r3.f36694f
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                uo3.a r3 = (uo3.C78253a) r3
                boolean r3 = r3.mo108270e()
                if (r3 != 0) goto L_0x0040
                boolean r3 = r2.f111572u
                if (r3 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                if (r0 != 0) goto L_0x005f
            L_0x0042:
                qk1.m2 r0 = r2.f111570s
                r0.getClass()
                java.util.List<java.lang.String> r1 = r0.f36693e
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.clear()
                java.util.List<java.lang.String> r1 = r0.f36693e
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.addAll(r7)
                r0.notifyDataSetChanged()
                int r7 = r7.size()
                r2.mo64535Q7(r7)
            L_0x005f:
                wx3.d<java.lang.Boolean> r7 = r6.f111575a
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                r7.resumeWith(r0)
                goto L_0x0141
            L_0x006e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "errType = "
                r2.append(r4)
                int r4 = r7.f256793a
                r2.append(r4)
                java.lang.String r4 = ", errCode = "
                r2.append(r4)
                int r4 = r7.f256794b
                r2.append(r4)
                java.lang.String r4 = ", errMsg = "
                r2.append(r4)
                java.lang.String r4 = r7.f256795c
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                int r4 = p213oh.C11412b.f33577a
                r4 = 0
                java.lang.String r5 = "FinderLiveSensitiveWords"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r4)
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r2 = r6.f111576b
                int r4 = com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39.f111565v
                java.lang.String r4 = "input_method"
                java.lang.Object r4 = r2.getSystemService(r4)
                java.lang.String r5 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
                gy3.C87412m.m108592e(r4, r5)
                android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
                com.tencent.mm.ui.widget.MMEditText r2 = r2.mo64533O7()
                android.os.IBinder r2 = r2.getWindowToken()
                r4.hideSoftInputFromWindow(r2, r1)
                T r2 = r7.f256796d
                te3.j81 r2 = (te3.C49958j81) r2
                java.util.LinkedList<java.lang.String> r2 = r2.f135917d
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r4 = r6.f111576b
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x00c9
                java.util.LinkedList<java.lang.String> r2 = r4.f111569r
            L_0x00c9:
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r4 = r6.f111576b
                gy3.C87412m.m108593f(r2, r3)
                r4.f111569r = r2
                qk1.m2 r3 = r4.f111570s
                r3.getClass()
                java.util.List<java.lang.String> r5 = r3.f36693e
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                r5.clear()
                java.util.List<java.lang.String> r5 = r3.f36693e
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                r5.addAll(r2)
                r3.notifyDataSetChanged()
                int r2 = r2.size()
                r4.mo64535Q7(r2)
                java.lang.String r2 = r7.f256795c
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r3 = r6.f111576b
                int r4 = r2.length()
                if (r4 != 0) goto L_0x00f8
                goto L_0x00f9
            L_0x00f8:
                r0 = 0
            L_0x00f9:
                if (r0 == 0) goto L_0x0106
                android.content.res.Resources r0 = r3.getResources()
                r1 = 2131828762(0x7f11201a, float:1.9290474E38)
                java.lang.String r2 = r0.getString(r1)
            L_0x0106:
                int r7 = r7.f256794b
                r0 = -200219(0xfffffffffffcf1e5, float:NaN)
                if (r7 != r0) goto L_0x012f
                qo3.q r7 = new qo3.q
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r0 = r6.f111576b
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                r7.<init>(r0)
                r7.mo107595g(r2)
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r0 = r6.f111576b
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                r1 = 2131828452(0x7f111ee4, float:1.9289845E38)
                java.lang.String r0 = r0.getString(r1)
                r7.mo107602n(r0)
                r7.mo107603o()
                goto L_0x0134
            L_0x012f:
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 r7 = r6.f111576b
                nj3.C76912y0.m92767f(r7, r2)
            L_0x0134:
                wx3.d<java.lang.Boolean> r7 = r6.f111575a
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                r7.resumeWith(r0)
            L_0x0141:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39.C41432c.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$d */
    public static final class C41433d extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI39 f111578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41433d(OccupyFinderUI39 occupyFinderUI39) {
            super(0);
            this.f111578d = occupyFinderUI39;
        }

        public Object invoke() {
            return (MMEditText) this.f111578d.findViewById(C0966R.C0970id.o0_);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$onResume$1", mo125469f = "OccupyFinderUI39.kt", mo125470l = {71}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$e */
    public static final class C41434e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f111579d;

        /* renamed from: e */
        public final /* synthetic */ OccupyFinderUI39 f111580e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41434e(OccupyFinderUI39 occupyFinderUI39, C15601d<? super C41434e> dVar) {
            super(2, dVar);
            this.f111580e = occupyFinderUI39;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C41434e(this.f111580e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C41434e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f111579d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OccupyFinderUI39 occupyFinderUI39 = this.f111580e;
                this.f111579d = 1;
                int i2 = OccupyFinderUI39.f111565v;
                if (occupyFinderUI39.mo64532N7(3, new LinkedList(), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$f */
    public static final class C41435f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI39 f111581d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$f$a */
        public static final class C41436a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ OccupyFinderUI39 f111582d;

            public C41436a(OccupyFinderUI39 occupyFinderUI39) {
                this.f111582d = occupyFinderUI39;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                this.f111582d.f111572u = i > 0;
            }
        }

        public C41435f(OccupyFinderUI39 occupyFinderUI39) {
            this.f111581d = occupyFinderUI39;
        }

        public final void run() {
            OccupyFinderUI39 occupyFinderUI39 = this.f111581d;
            if (occupyFinderUI39.f111571t == null) {
                occupyFinderUI39.f111571t = new KeyboardHeightProvider(occupyFinderUI39);
                OccupyFinderUI39 occupyFinderUI392 = this.f111581d;
                KeyboardHeightProvider keyboardHeightProvider = occupyFinderUI392.f111571t;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C41436a(occupyFinderUI392);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f111581d.f111571t;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39$g */
    public static final class C41437g extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI39 f111583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41437g(OccupyFinderUI39 occupyFinderUI39) {
            super(0);
            this.f111583d = occupyFinderUI39;
        }

        public Object invoke() {
            return (RecyclerView) this.f111583d.findViewById(C0966R.C0970id.o0a);
        }
    }

    public OccupyFinderUI39() {
        C12816m2 m2Var = new C12816m2(this);
        m2Var.f36695g = new C41430a(this);
        this.f111570s = m2Var;
    }

    /* renamed from: N7 */
    public final Object mo64532N7(int i, LinkedList<String> linkedList, C15601d<? super Boolean> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        new C46551y0(i, C66785b.f191882e.mo90662O5(), linkedList).mo9225i().mo123420E(new C41432c(hVar, this, i));
        return hVar.mo90314b();
    }

    /* renamed from: O7 */
    public final MMEditText mo64533O7() {
        Object value = ((C36570n) this.f111567p).getValue();
        C87412m.m108593f(value, "<get-editField>(...)");
        return (MMEditText) value;
    }

    /* renamed from: P7 */
    public final void mo64534P7(String str, String str2, String str3) {
        ((C54108o) C86312j.m106911c(C54108o.class)).Rx0(str, str2, C90363p0.m113143b(new C13604l("sensitive_word", str3)));
    }

    /* renamed from: Q7 */
    public final void mo64535Q7(int i) {
        if (i > 0) {
            Object value = ((C36570n) this.f111568q).getValue();
            C87412m.m108593f(value, "<get-addedCount>(...)");
            ((TextView) value).setVisibility(0);
            Object value2 = ((C36570n) this.f111568q).getValue();
            C87412m.m108593f(value2, "<get-addedCount>(...)");
            ((TextView) value2).setText(getResources().getString(C0966R.string.n2n, new Object[]{String.valueOf(i)}));
            return;
        }
        Object value3 = ((C36570n) this.f111568q).getValue();
        C87412m.m108593f(value3, "<get-addedCount>(...)");
        ((TextView) value3).setVisibility(4);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d4j;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object value = ((C36570n) this.f111566o).getValue();
        C87412m.m108593f(value, "<get-wordList>(...)");
        ((RecyclerView) value).setAdapter(this.f111570s);
        Object value2 = ((C36570n) this.f111566o).getValue();
        C87412m.m108593f(value2, "<get-wordList>(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this));
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SENSITIVE_WORDS_LIMIT_INT, (Object) null);
        C62042e.f176370a.mo87028N1(mo64533O7(), (TextView) null, 20, 10, true, (C32224a<C13598b0>) null);
        mo64533O7().setHint(getResources().getString(C0966R.string.n2p, new Object[]{f}));
        mo64533O7().setInputType(1);
        mo64533O7().setImeOptions(6);
        mo64533O7().setOnEditorActionListener(new C52881x5(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_search, new C52883y5(this));
        mo64534P7("live_sensitive_word_search", "view_exp", "");
        setMMTitle(getResources().getString(C0966R.string.n2q));
        setBackBtn(new C52884z5(this));
    }

    public void onResume() {
        super.onResume();
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C41434e(this, (C15601d<? super C41434e>) null), 3, (Object) null);
        getWindow().getDecorView().post(new C41435f(this));
    }
}
