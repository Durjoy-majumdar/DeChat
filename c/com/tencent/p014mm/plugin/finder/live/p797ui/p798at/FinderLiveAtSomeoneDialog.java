package com.tencent.p014mm.plugin.finder.live.p797ui.p798at;

import ac2.C53996a;
import ac2.C53997b;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C57962a;
import cq1.C57963b;
import cq1.C57974g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9500j;
import lk1.C46869a;
import lk1.C46872e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneDialog */
public class FinderLiveAtSomeoneDialog extends C57963b {

    /* renamed from: C */
    public final C13601g f159563C = C36568h.m40985a(C41465a.f111655d);

    /* renamed from: D */
    public final C13601g f159564D = C36568h.m40985a(new C55970b(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneDialog$a */
    public static final class C41465a extends C87413o implements C32224a<C53996a<C57974g>> {

        /* renamed from: d */
        public static final C41465a f111655d = new C41465a();

        public C41465a() {
            super(0);
        }

        public Object invoke() {
            return (C53996a) new C46872e().mo74666a(new C46869a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneDialog$b */
    public static final class C55970b extends C87413o implements C32224a<FinderLiveAtSomeoneSearchDataSource> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAtSomeoneDialog f159565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55970b(FinderLiveAtSomeoneDialog finderLiveAtSomeoneDialog) {
            super(0);
            this.f159565d = finderLiveAtSomeoneDialog;
        }

        public Object invoke() {
            FinderLiveAtSomeoneSearchDataSource finderLiveAtSomeoneSearchDataSource = new FinderLiveAtSomeoneSearchDataSource();
            this.f159565d.getLifecycle().addObserver(finderLiveAtSomeoneSearchDataSource);
            return finderLiveAtSomeoneSearchDataSource;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAtSomeoneDialog(Context context, Boolean bool, C57962a aVar) {
        super(context, bool, aVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
        updateSearchIndexAtOnceEvent.publish();
    }

    /* renamed from: L */
    public C9500j mo77761L() {
        return new FinderLiveAtSomeoneDialog$buildItemConvertFactory$1(this);
    }

    /* renamed from: M */
    public String mo77762M(C72996z1 z1Var) {
        C87412m.m108594g(z1Var, "ct");
        if (C87412m.m108589b(z1Var.getUsername(), "notify@all")) {
            String string = getContext().getResources().getString(C0966R.string.dgl);
            C87412m.m108593f(string, "{\n            context.re…og_at_all_item)\n        }");
            return string;
        }
        String j3 = z1Var.mo62909j3();
        C87412m.m108593f(j3, "{\n            ct.displayNick\n        }");
        return j3;
    }

    /* renamed from: N */
    public C53996a<C57974g> mo77763N() {
        return (C53996a) ((C36570n) this.f159563C).getValue();
    }

    /* renamed from: O */
    public C53997b<C57974g, String> mo77764O() {
        return (FinderLiveAtSomeoneSearchDataSource) ((C36570n) this.f159564D).getValue();
    }

    /* renamed from: P */
    public int mo77766P() {
        return C0966R.C0971layout.f359708af0;
    }
}
