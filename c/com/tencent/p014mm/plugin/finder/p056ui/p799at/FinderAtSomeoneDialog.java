package com.tencent.p014mm.plugin.finder.p056ui.p799at;

import ac2.C53996a;
import ac2.C53997b;
import android.content.Context;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C45143d;
import cq1.C45146j;
import cq1.C57962a;
import cq1.C57963b;
import cq1.C57974g;
import er1.C7865r3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9500j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog */
public final class FinderAtSomeoneDialog extends C57963b {

    /* renamed from: C */
    public final C13601g f161180C;

    /* renamed from: D */
    public final C13601g f161181D = C36568h.m40985a(new C56380b(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog$a */
    public static final class C41530a extends C87413o implements C32224a<C53996a<C57974g>> {

        /* renamed from: d */
        public final /* synthetic */ C72994y1.C72995a f111836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41530a(C72994y1.C72995a aVar) {
            super(0);
            this.f111836d = aVar;
        }

        public Object invoke() {
            return (C53996a) new C45143d().mo74666a(new C45146j(this.f111836d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog$b */
    public static final class C56380b extends C87413o implements C32224a<FinderAtSomeoneSearchDataSource> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtSomeoneDialog f161182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56380b(FinderAtSomeoneDialog finderAtSomeoneDialog) {
            super(0);
            this.f161182d = finderAtSomeoneDialog;
        }

        public Object invoke() {
            FinderAtSomeoneSearchDataSource finderAtSomeoneSearchDataSource = new FinderAtSomeoneSearchDataSource();
            this.f161182d.getLifecycle().addObserver(finderAtSomeoneSearchDataSource);
            return finderAtSomeoneSearchDataSource;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAtSomeoneDialog(Context context, Boolean bool, C72994y1.C72995a aVar, C57962a aVar2) {
        super(context, bool, aVar2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "recentAtStorageKey");
        C87412m.m108594g(aVar2, "callback");
        this.f161180C = C36568h.m40985a(new C41530a(aVar));
    }

    /* renamed from: F */
    public int mo23875F() {
        return (int) ((((double) C7865r3.f26468a.mo8968a()) * 0.25d) - ((double) C75044y4.m89994f(getContext())));
    }

    /* renamed from: H */
    public void mo6266H() {
        mo143466u().mo143388f(1);
        super.mo6266H();
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(C0966R.style.f8722sr);
        }
    }

    /* renamed from: L */
    public C9500j mo77761L() {
        return new FinderAtSomeoneDialog$buildItemConvertFactory$1(this);
    }

    /* renamed from: M */
    public String mo77762M(C72996z1 z1Var) {
        C87412m.m108594g(z1Var, "ct");
        String j3 = z1Var.mo62909j3();
        C87412m.m108593f(j3, "ct.displayNick");
        return j3;
    }

    /* renamed from: N */
    public C53996a<C57974g> mo77763N() {
        return (C53996a) ((C36570n) this.f161180C).getValue();
    }

    /* renamed from: O */
    public C53997b<C57974g, String> mo77764O() {
        return (FinderAtSomeoneSearchDataSource) ((C36570n) this.f161181D).getValue();
    }

    /* renamed from: P */
    public int mo77766P() {
        return C0966R.C0971layout.f359676a90;
    }
}
