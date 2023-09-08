package com.tencent.p014mm.plugin.finder.live.p797ui.p798at;

import a11.C39479c;
import ac2.C53996a;
import ac2.C53997b;
import android.content.Context;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C57962a;
import cq1.C57974g;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9500j;
import lk1.C46870b;
import lk1.C61298c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupMemberDialog */
public final class FinderLiveAtGroupMemberDialog extends FinderLiveAtSomeoneDialog {

    /* renamed from: E */
    public final String f159551E;

    /* renamed from: F */
    public final C13601g f159552F = C36568h.m40985a(new C55966a(this));

    /* renamed from: G */
    public final C13601g f159553G = C36568h.m40985a(new C55967b(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupMemberDialog$a */
    public static final class C55966a extends C87413o implements C32224a<C53996a<C57974g>> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAtGroupMemberDialog f159554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55966a(FinderLiveAtGroupMemberDialog finderLiveAtGroupMemberDialog) {
            super(0);
            this.f159554d = finderLiveAtGroupMemberDialog;
        }

        public Object invoke() {
            return (C53996a) new C61298c(this.f159554d.f159551E).mo74666a(new C46870b(this.f159554d.f159551E));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupMemberDialog$b */
    public static final class C55967b extends C87413o implements C32224a<FinderLiveAtGroupSearchDataSource> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAtGroupMemberDialog f159555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55967b(FinderLiveAtGroupMemberDialog finderLiveAtGroupMemberDialog) {
            super(0);
            this.f159555d = finderLiveAtGroupMemberDialog;
        }

        public Object invoke() {
            FinderLiveAtGroupSearchDataSource finderLiveAtGroupSearchDataSource = new FinderLiveAtGroupSearchDataSource(this.f159555d.f159551E);
            this.f159555d.getLifecycle().addObserver(finderLiveAtGroupSearchDataSource);
            return finderLiveAtGroupSearchDataSource;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAtGroupMemberDialog(String str, Context context, Boolean bool, C57962a aVar) {
        super(context, bool, aVar);
        C87412m.m108594g(str, "groupId");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        this.f159551E = str;
    }

    /* renamed from: L */
    public C9500j mo77761L() {
        return new FinderLiveAtGroupMemberDialog$buildItemConvertFactory$1(this);
    }

    /* renamed from: M */
    public String mo77762M(C72996z1 z1Var) {
        C87412m.m108594g(z1Var, "ct");
        String q2 = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f159551E).mo69789q2(z1Var.getUsername());
        if (q2 == null || q2.length() == 0) {
            q2 = z1Var.mo62909j3();
        }
        C87412m.m108593f(q2, "atDisplayName");
        return q2;
    }

    /* renamed from: N */
    public C53996a<C57974g> mo77763N() {
        return (C53996a) ((C36570n) this.f159552F).getValue();
    }

    /* renamed from: O */
    public C53997b<C57974g, String> mo77764O() {
        return (FinderLiveAtGroupSearchDataSource) ((C36570n) this.f159553G).getValue();
    }
}
