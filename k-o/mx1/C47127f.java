package mx1;

import a14.C53872d1;
import a14.C53901i0;
import androidx.lifecycle.C103769x;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.stubs.logger.Log;
import cx1.C45220b;
import cx1.C45221c;
import cx1.C45223e;
import di3.C86312j;
import ex1.C45712e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13604l;
import rx3.C36568h;
import wx3.C66212f;

/* renamed from: mx1.f */
public final class C47127f extends C39622i0 {

    /* renamed from: d */
    public final C103769x<C45220b> f126627d = new C103769x<>();

    /* renamed from: e */
    public final C54219z<List<C45221c>> f126628e = new C54219z<>();

    /* renamed from: f */
    public String f126629f;

    /* renamed from: g */
    public String f126630g;

    /* renamed from: h */
    public final C13601g f126631h;

    /* renamed from: i */
    public final ArrayList<String> f126632i;

    /* renamed from: j */
    public final C13601g f126633j;

    /* renamed from: n */
    public final C13601g f126634n;

    /* renamed from: mx1.f$a */
    public static final class C47128a extends C87413o implements C32224a<C66212f> {

        /* renamed from: d */
        public final /* synthetic */ C47127f f126635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47128a(C47127f fVar) {
            super(0);
            this.f126635d = fVar;
        }

        public Object invoke() {
            return C53872d1.f151119c.plus((C53901i0) this.f126635d.f126633j.getValue());
        }
    }

    /* renamed from: mx1.f$b */
    public static final class C47129b extends C87413o implements C32224a<C53901i0> {

        /* renamed from: d */
        public static final C47129b f126636d = new C47129b();

        public C47129b() {
            super(0);
        }

        public Object invoke() {
            int i = C53901i0.f151153a0;
            return new C47131g(C53901i0.C39480a.f106019d);
        }
    }

    /* renamed from: mx1.f$c */
    public static final class C47130c extends C87413o implements C32224a<C45712e> {

        /* renamed from: d */
        public static final C47130c f126637d = new C47130c();

        public C47130c() {
            super(0);
        }

        public Object invoke() {
            return (C45712e) C86312j.m106911c(C45712e.class);
        }
    }

    public C47127f() {
        C13602i iVar = C13602i.NONE;
        this.f126631h = C36568h.m40986b(iVar, C47130c.f126637d);
        this.f126632i = new ArrayList<>();
        this.f126633j = C36568h.m40986b(iVar, C47129b.f126636d);
        this.f126634n = C36568h.m40986b(iVar, new C47128a(this));
    }

    /* renamed from: c3 */
    public static final void m52422c3(C47127f fVar, C45223e eVar, boolean z) {
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (z) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.a_e);
            C87412m.m108593f(string, "getContext().getString(R.string.at_all_nickname)");
            arrayList.add(new C45221c((C13604l) null, new C45223e("all", string, ""), false, 601, 5, (C8480h) null));
        }
        if (eVar != null) {
            arrayList.add(new C45221c((C13604l) null, eVar, false, 602, 5, (C8480h) null));
        }
        if (!arrayList.isEmpty()) {
            fVar.f126627d.postValue(C45220b.m50019a(fVar.mo72234d3(), arrayList, (C13604l) null, (C13604l) null, (C13604l) null, 14, (Object) null));
        }
    }

    /* renamed from: d3 */
    public final C45220b mo72234d3() {
        C45220b value = this.f126627d.getValue();
        return value == null ? new C45220b((List) null, (C13604l) null, (C13604l) null, (C13604l) null, 15, (C8480h) null) : value;
    }

    public void onCleared() {
        String str = this.f126629f;
        if (str != null) {
            C47119a aVar = C47119a.f126606d;
            aVar.mo72232c().remove(str);
            aVar.mo72231b().remove(str);
        }
        Log.m106505i("GameChatRoom.ChatroomMemberViewModel", "onCleared");
        super.onCleared();
    }
}
