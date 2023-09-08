package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import kotlin.Metadata;
import p247u3.C65035c1;
import p247u3.C65054f0;
import p247u3.C65064g1;
import p247u3.C65153r;
import p247u3.C65192x0;
import p856m.C61417a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rx3.C48096k;
import uc1.C65322a;
import ye1.C53517h;
import zt3.C119143b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationBlackUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "b", "c", "d", "e", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI */
public final class FinderConversationBlackUI extends MMFinderUI {

    /* renamed from: q */
    public static final /* synthetic */ int f161029q = 0;

    /* renamed from: o */
    public final C56331e f161030o = new C56331e();

    /* renamed from: p */
    public final C13601g f161031p = C36568h.m40985a(new C41503f(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$d */
    public static final class C41502d extends C72996z1 {
        public Object clone() {
            return super.clone();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$f */
    public static final class C41503f extends C87413o implements C32224a<C53517h> {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationBlackUI f111769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41503f(FinderConversationBlackUI finderConversationBlackUI) {
            super(0);
            this.f111769d = finderConversationBlackUI;
        }

        public Object invoke() {
            return C53517h.m60070a(this.f111769d.findViewById(C0966R.C0970id.mc5));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$a */
    public static final class C56328a extends C65192x0<Object, C41502d> {
        public C56328a(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$b */
    public static final class C56329b extends C65153r.C65155b<Object, C41502d> {

        /* renamed from: a */
        public final int f161032a;

        public C56329b(int i) {
            this.f161032a = i;
        }

        /* renamed from: a */
        public C65153r<Object, C41502d> mo79078a() {
            return new C56328a(this.f161032a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$c */
    public static final class C56330c extends C60905o {
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$e */
    public static final class C56331e extends C65064g1<C41502d, C56330c> {

        /* renamed from: e */
        public static final C56332a f161033e = new C56332a();

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$e$a */
        public static final class C56332a extends C54248l.C54252d<C41502d> {
            /* renamed from: a */
            public boolean mo75048a(Object obj, Object obj2) {
                C87412m.m108594g((C41502d) obj, "old");
                C87412m.m108594g((C41502d) obj2, "new");
                return false;
            }

            /* renamed from: b */
            public boolean mo75049b(Object obj, Object obj2) {
                C41502d dVar = (C41502d) obj;
                C41502d dVar2 = (C41502d) obj2;
                C87412m.m108594g(dVar, "old");
                C87412m.m108594g(dVar2, "new");
                return C87412m.m108589b(dVar.getUsername(), dVar2.getUsername());
            }
        }

        public C56331e() {
            super(f161033e);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g((C56330c) zVar, "p0");
            throw new C48096k("An operation is not implemented: Not yet implemented");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "p0");
            throw new C48096k("An operation is not implemented: Not yet implemented");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$g */
    public static final class C56333g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationBlackUI f161034d;

        public C56333g(FinderConversationBlackUI finderConversationBlackUI) {
            this.f161034d = finderConversationBlackUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f161034d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$h */
    public static final class C56334h<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationBlackUI f161035d;

        /* renamed from: e */
        public final /* synthetic */ C56335i f161036e;

        public C56334h(FinderConversationBlackUI finderConversationBlackUI, C56335i iVar) {
            this.f161035d = finderConversationBlackUI;
            this.f161036e = iVar;
        }

        public void onChanged(Object obj) {
            this.f161035d.f161030o.f187266d.mo89226b((C65035c1) obj);
            C56335i iVar = this.f161036e;
            iVar.getClass();
            Log.m105924i("Finder.ConversationBlackUI", "[onItemsChangeLoaded]");
            FinderConversationBlackUI finderConversationBlackUI = iVar.f161037a;
            int i = FinderConversationBlackUI.f161029q;
            if (finderConversationBlackUI.mo79077N7().f150479c.getVisibility() == 0 && iVar.f161037a.mo79077N7().f150477a.getVisibility() != 0) {
                iVar.f161037a.mo79077N7().f150479c.setVisibility(8);
                iVar.f161037a.mo79077N7().f150477a.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationBlackUI$i */
    public static final class C56335i extends C65035c1.C65036a<C41502d> {

        /* renamed from: a */
        public final /* synthetic */ FinderConversationBlackUI f161037a;

        public C56335i(FinderConversationBlackUI finderConversationBlackUI) {
            this.f161037a = finderConversationBlackUI;
        }

        /* renamed from: a */
        public void mo79080a(Object obj) {
            C87412m.m108594g((C41502d) obj, "itemAtEnd");
            Log.m105924i("Finder.ConversationBlackUI", "[onItemAtEndLoaded]");
        }

        /* renamed from: b */
        public void mo79081b(Object obj) {
            C87412m.m108594g((C41502d) obj, "itemAtFront");
            Log.m105924i("Finder.ConversationBlackUI", "[onItemAtFrontLoaded]");
        }

        /* renamed from: c */
        public void mo79082c() {
            Log.m105924i("Finder.ConversationBlackUI", "[onZeroItemsLoaded]");
        }
    }

    /* renamed from: N7 */
    public final C53517h mo79077N7() {
        return (C53517h) ((C36570n) this.f161031p).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("KEY_TALKER_TYPE", -1);
        Log.m105924i("Finder.ConversationBlackUI", "[onCreate] talkerType==" + intExtra);
        setMMTitle((int) C0966R.string.esu);
        setBackBtn(new C56333g(this));
        C65035c1.C65038c.C65039a aVar = new C65035c1.C65038c.C65039a();
        aVar.f187214a = 60;
        aVar.f187215b = 30;
        int i = aVar.f187216c;
        if (i == Integer.MAX_VALUE || i >= (30 * 2) + 60) {
            C65035c1.C65038c cVar = new C65035c1.C65038c(60, 30, false, 15, i);
            RecyclerView recyclerView = mo79077N7().f150477a;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(recyclerView.getAdapter());
            RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f44810f = 0;
            }
            RecyclerView.C16616j itemAnimator2 = recyclerView.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.f44809e = 0;
            }
            C56335i iVar = new C56335i(this);
            C56329b bVar = new C56329b(intExtra);
            C119143b bVar2 = C65322a.f188001a;
            LiveData<T> liveData = new C65054f0(bVar2, (Object) null, bVar, cVar, C61417a.f174665c, bVar2, iVar).f152170b;
            C87412m.m108593f(liveData, "LivePagedListBuilder(Con…tor)\n            .build()");
            liveData.observe(this, new C56334h(this, iVar));
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist" + ", pageSize=" + aVar.f187214a + ", prefetchDist=" + aVar.f187215b + ", maxSize=" + aVar.f187216c);
    }
}
