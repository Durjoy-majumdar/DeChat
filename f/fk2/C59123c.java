package fk2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.ringtone.widget.p803at.RingtoneAtSomeoneDialog$buildItemConvertFactory$1;
import com.tencent.p014mm.plugin.ringtone.widget.p803at.RingtoneAtSomeoneLiveList;
import com.tencent.p014mm.plugin.ringtone.widget.p803at.RingtoneAtSomeoneSearchDataSource;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import nl3.C47276a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: fk2.c */
public final class C59123c extends C47276a implements FTSEditTextView.C45051l {

    /* renamed from: D */
    public static final /* synthetic */ int f169109D = 0;

    /* renamed from: A */
    public final C13601g f169110A;

    /* renamed from: B */
    public String f169111B;

    /* renamed from: C */
    public final C13601g f169112C;

    /* renamed from: s */
    public final C59122a f169113s;

    /* renamed from: t */
    public FTSEditTextView f169114t;

    /* renamed from: u */
    public WxRecyclerView f169115u;

    /* renamed from: v */
    public AlphabetScrollBar f169116v;

    /* renamed from: w */
    public final C13601g f169117w = C36568h.m40985a(C59125b.f169122d);

    /* renamed from: x */
    public final C13601g f169118x = C36568h.m40985a(new C59132i(this));

    /* renamed from: y */
    public final C13601g f169119y = C36568h.m40985a(new C59130g(this));

    /* renamed from: z */
    public final C13601g f169120z = C36568h.m40985a(new C59124a(this));

    /* renamed from: fk2.c$a */
    public static final class C59124a extends C87413o implements C32224a<C103009m<C59134f>> {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59124a(C59123c cVar) {
            super(0);
            this.f169121d = cVar;
        }

        public Object invoke() {
            RingtoneAtSomeoneLiveList L = this.f169121d.mo84343L();
            this.f169121d.getClass();
            return new C103009m(L, new RingtoneAtSomeoneDialog$buildItemConvertFactory$1(), false, 4, (C8480h) null);
        }
    }

    /* renamed from: fk2.c$b */
    public static final class C59125b extends C87413o implements C32224a<C45799b> {

        /* renamed from: d */
        public static final C59125b f169122d = new C59125b();

        public C59125b() {
            super(0);
        }

        public Object invoke() {
            return new C45799b();
        }
    }

    /* renamed from: fk2.c$c */
    public static final class C59126c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169123d;

        public C59126c(C59123c cVar) {
            this.f169123d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f169123d.cancel();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fk2.c$d */
    public static final class C59127d implements VerticalScrollBar.C6756b {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169124d;

        public C59127d(C59123c cVar) {
            this.f169124d = cVar;
        }

        /* renamed from: S0 */
        public final void mo5638S0(String str) {
            C59123c cVar = this.f169124d;
            if (!C87412m.m108589b(cVar.f169111B, str)) {
                C87412m.m108593f(str, LocaleUtil.ITALIAN);
                cVar.f169111B = str;
            }
            if (C87412m.m108589b(str, "🔍")) {
                WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) ((C36570n) cVar.f169110A).getValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                WxLinearLayoutManager wxLinearLayoutManager2 = wxLinearLayoutManager;
                C117292a.m165358d(wxLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            Iterator<T> it = cVar.mo84343L().f272353o.iterator();
            int i = 0;
            while (it.hasNext()) {
                T next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C59134f fVar = (C59134f) next;
                    if (!C87412m.m108589b(fVar.f169137j, str) || !fVar.f169135h) {
                        i = i2;
                    } else {
                        WxLinearLayoutManager wxLinearLayoutManager3 = (WxLinearLayoutManager) ((C36570n) cVar.f169110A).getValue();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        aVar2.mo10233c(Integer.valueOf(i));
                        WxLinearLayoutManager wxLinearLayoutManager4 = wxLinearLayoutManager3;
                        C117292a.m165358d(wxLinearLayoutManager4, aVar2.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        wxLinearLayoutManager3.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                        C117292a.m165359e(wxLinearLayoutManager4, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: fk2.c$e */
    public static final class C59128e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169125d;

        public C59128e(C59123c cVar) {
            this.f169125d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r3 = r2.f169125d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r3) {
            /*
                r2 = this;
                ac2.j r3 = (ac2.C91988j) r3
                ac2.k r3 = r3.f263327a
                ac2.k r0 = ac2.C39535k.UIRefresh
                if (r3 != r0) goto L_0x0026
                fk2.c r3 = r2.f169125d
                com.tencent.mm.ui.base.AlphabetScrollBar r0 = r3.f169116v
                if (r0 == 0) goto L_0x0026
                com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r3 = r3.mo84343L()
                java.util.ArrayList<java.lang.String> r3 = r3.f164181z
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r3 = r3.toArray(r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r3, r1)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r0.setAlphabet(r3)
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fk2.C59123c.C59128e.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: fk2.c$f */
    public static final class C59129f extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f169126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59129f(Context context) {
            super(0);
            this.f169126d = context;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f169126d);
        }
    }

    /* renamed from: fk2.c$g */
    public static final class C59130g extends C87413o implements C32224a<RingtoneAtSomeoneLiveList> {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59130g(C59123c cVar) {
            super(0);
            this.f169127d = cVar;
        }

        public Object invoke() {
            return new RingtoneAtSomeoneLiveList((C45799b) ((C36570n) this.f169127d.f169117w).getValue(), (RingtoneAtSomeoneSearchDataSource) ((C36570n) this.f169127d.f169118x).getValue(), new C53769h(), this.f169127d);
        }
    }

    /* renamed from: fk2.c$h */
    public static final class C59131h extends C87413o implements C32224a<C59133d> {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59131h(C59123c cVar) {
            super(0);
            this.f169128d = cVar;
        }

        public Object invoke() {
            return new C59133d(this.f169128d);
        }
    }

    /* renamed from: fk2.c$i */
    public static final class C59132i extends C87413o implements C32224a<RingtoneAtSomeoneSearchDataSource> {

        /* renamed from: d */
        public final /* synthetic */ C59123c f169129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59132i(C59123c cVar) {
            super(0);
            this.f169129d = cVar;
        }

        public Object invoke() {
            RingtoneAtSomeoneSearchDataSource ringtoneAtSomeoneSearchDataSource = new RingtoneAtSomeoneSearchDataSource();
            this.f169129d.getLifecycle().addObserver(ringtoneAtSomeoneSearchDataSource);
            return ringtoneAtSomeoneSearchDataSource;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59123c(Context context, C59122a aVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        this.f169113s = aVar;
        this.f169110A = C36568h.m40985a(new C59129f(context));
        UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
        updateSearchIndexAtOnceEvent.publish();
        this.f169111B = "";
        this.f169112C = C36568h.m40985a(new C59131h(this));
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: G */
    public View mo6265G() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359950cp0, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…_at_someone_dialog, null)");
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6266H() {
        /*
            r4 = this;
            super.mo6266H()
            android.view.View r0 = r4.f126905i
            if (r0 == 0) goto L_0x0018
            r1 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0018
            fk2.c$c r1 = new fk2.c$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L_0x0018:
            android.view.View r0 = r4.f126905i
            r1 = 0
            if (r0 == 0) goto L_0x0027
            r2 = 2131305242(0x7f09231a, float:1.822865E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.ui.search.FTSEditTextView r0 = (com.tencent.p014mm.p136ui.search.FTSEditTextView) r0
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r4.f169114t = r0
            if (r0 == 0) goto L_0x002f
            r0.mo70338f()
        L_0x002f:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r4.f169114t
            if (r0 == 0) goto L_0x0036
            r0.setFtsEditTextListener(r4)
        L_0x0036:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r4.f169114t
            if (r0 == 0) goto L_0x004c
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131821674(0x7f11046a, float:1.9276098E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setHint(r2)
        L_0x004c:
            com.tencent.mm.ui.search.FTSEditTextView r0 = r4.f169114t
            if (r0 == 0) goto L_0x0058
            r2 = 1
            r3 = 1099431936(0x41880000, float:17.0)
            android.widget.EditText r0 = r0.f122158g
            r0.setTextSize(r2, r3)
        L_0x0058:
            android.view.View r0 = r4.f126905i
            if (r0 == 0) goto L_0x0066
            r2 = 2131299052(0x7f090aec, float:1.8216095E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            goto L_0x0067
        L_0x0066:
            r0 = r1
        L_0x0067:
            r4.f169115u = r0
            if (r0 != 0) goto L_0x006c
            goto L_0x0079
        L_0x006c:
            rx3.g r2 = r4.f169120z
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            zb2.m r2 = (zb2.C103009m) r2
            r0.setAdapter(r2)
        L_0x0079:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r4.f169115u
            if (r0 != 0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            rx3.g r2 = r4.f169110A
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r2 = (com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager) r2
            r0.setLayoutManager(r2)
        L_0x008b:
            rx3.g r0 = r4.f169120z
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            zb2.m r0 = (zb2.C103009m) r0
            rx3.g r2 = r4.f169112C
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            fk2.d r2 = (fk2.C59133d) r2
            r0.f165746y = r2
            android.view.View r0 = r4.f126905i
            if (r0 == 0) goto L_0x00af
            r1 = 2131296918(0x7f090296, float:1.8211766E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = (com.tencent.p014mm.p136ui.base.AlphabetScrollBar) r1
        L_0x00af:
            r4.f169116v = r1
            if (r1 == 0) goto L_0x00bb
            fk2.c$d r0 = new fk2.c$d
            r0.<init>(r4)
            r1.setOnScrollBarTouchListener(r0)
        L_0x00bb:
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = r4.f169116v
            if (r0 == 0) goto L_0x00cb
            java.lang.String r1 = "🔍"
            java.lang.String r2 = "#"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r0.setAlphabet(r1)
        L_0x00cb:
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r0 = r4.mo84343L()
            androidx.lifecycle.LiveData<ac2.j<T>> r0 = r0.f272358t
            fk2.c$e r1 = new fk2.c$e
            r1.<init>(r4)
            r0.observe(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.C59123c.mo6266H():void");
    }

    /* renamed from: L */
    public final RingtoneAtSomeoneLiveList mo84343L() {
        return (RingtoneAtSomeoneLiveList) ((C36570n) this.f169119y).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3001b3(java.lang.String r1, java.lang.String r2, java.util.List<com.tencent.p014mm.p136ui.search.FTSSearchView.C6996f> r3, com.tencent.p014mm.p136ui.search.FTSEditTextView.C45052m r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0023
            boolean r4 = z04.C112551y.m153811k(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            if (r1 == 0) goto L_0x0023
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r4 = r0.mo84343L()
            r4.mo80726u(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f169116v
            if (r1 != 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            r4 = 8
            r1.setVisibility(r4)
        L_0x0020:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0024
        L_0x0023:
            r1 = r3
        L_0x0024:
            if (r1 != 0) goto L_0x0046
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.mo84343L()
            ac2.b<T, Q> r4 = r1.f163774x
            r4.mo74668f()
            a14.z1 r1 = r1.f163775y
            if (r1 == 0) goto L_0x0036
            a14.C53973z1.C53974a.m60623a(r1, r3, r2, r3)
        L_0x0036:
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.mo84343L()
            r1.mo129609m()
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f169116v
            if (r1 != 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r2 = 0
            r1.setVisibility(r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.C59123c.mo3001b3(java.lang.String, java.lang.String, java.util.List, com.tencent.mm.ui.search.FTSEditTextView$m):void");
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickClearTextBtn(View view) {
    }

    /* renamed from: y */
    public boolean mo3009y() {
        return true;
    }
}
