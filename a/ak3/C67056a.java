package ak3;

import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.component.C73412a;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jn3.C46564f;
import ln3.C76709a;
import ln3.C76719m;
import mn3.C61504d;
import mn3.C61507f;
import mn3.C76787a;
import mn3.C76788b;
import mn3.C76789c;
import mn3.C76791e;
import mn3.C76792g;
import mn3.C76794h;
import mn3.C76795i;
import mn3.C76796j;
import mn3.C76798k;
import mn3.C76800l;
import p270xi.C91212b;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import zp3.C23564m;

@C91212b(exportInterface = C67067f.class)
/* renamed from: ak3.a */
public final class C67056a extends C73412a implements C67067f {

    /* renamed from: o */
    public static WeakReference<C67056a> f192606o;

    /* renamed from: e */
    public final String f192607e = ("MicroMsg.ChattingTipsBarComponent" + hashCode());

    /* renamed from: f */
    public ChatTipsBarGroup f192608f;

    /* renamed from: g */
    public long f192609g;

    /* renamed from: h */
    public final LinkedList<C76787a<?>> f192610h;

    /* renamed from: i */
    public long f192611i;

    /* renamed from: j */
    public LinkedList<C76709a<?>> f192612j;

    /* renamed from: n */
    public final MStorage.IOnStorageChange f192613n;

    /* renamed from: ak3.a$a */
    public static final class C67057a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67056a f192614d;

        public C67057a(C67056a aVar) {
            this.f192614d = aVar;
        }

        public final void run() {
            this.f192614d.mo91071Z5();
        }
    }

    /* renamed from: ak3.a$b */
    public static final class C67058b implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C67056a f192615d;

        public C67058b(C67056a aVar) {
            this.f192615d = aVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            String str2 = this.f192615d.f192607e;
            Log.m105926v(str2, "roommember watcher notify " + str);
            if (this.f192615d.f215752d.mo91583x() && !Util.isNullOrNil(str) && C87412m.m108589b(str, this.f192615d.f215752d.mo91577r())) {
                this.f192615d.mo91069X0();
            }
        }
    }

    public C67056a() {
        LinkedList<C76787a<?>> linkedList = new LinkedList<>();
        linkedList.add(new C76800l());
        linkedList.add(new C76789c());
        linkedList.add(new C76788b());
        linkedList.add(new C76795i());
        linkedList.add(new C61504d());
        linkedList.add(new C61507f());
        linkedList.add(new C76792g());
        linkedList.add(new C76796j());
        linkedList.add(new C76798k());
        linkedList.add(new C76794h());
        this.f192610h = linkedList;
        this.f192612j = new LinkedList<>();
        this.f192613n = new C67058b(this);
    }

    /* renamed from: C1 */
    public int mo91066C1() {
        return this.f215752d.mo91570k().getPaddingTop();
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105918d(this.f192607e, "onChattingResume() called");
        this.f192611i = System.currentTimeMillis();
        C23564m.m28136f(new C67066e(this, ChatTipsBarGroup.C74826e.ON_RESUME, true));
        f192606o = new WeakReference<>(this);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105918d(this.f192607e, "onChattingPause() called");
    }

    /* renamed from: J */
    public <T extends C76791e<?>, V extends Class<T>> T mo91067J(V v) {
        Iterator<T> it = this.f192610h.iterator();
        while (it.hasNext()) {
            T t = (C76787a) it.next();
            if (C87412m.m108589b(t.getClass(), v)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: O0 */
    public void mo91068O0() {
        ChatTipsBarGroup chatTipsBarGroup = this.f192608f;
        if (chatTipsBarGroup != null && !chatTipsBarGroup.f219960n && !chatTipsBarGroup.f219961o && chatTipsBarGroup.f219962p.f219973a == ChatTipsBarGroup.C74824c.MODE_EXPAND) {
            chatTipsBarGroup.mo103992d();
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105918d(this.f192607e, "onChattingEnterAnimStart() called");
        this.f192609g = System.currentTimeMillis();
        f192606o = new WeakReference<>(this);
        C97625j3.m125812b().mo105902q().add(this.f192613n);
    }

    /* renamed from: X0 */
    public void mo91069X0() {
        C23564m.m28136f(new C67066e(this, ChatTipsBarGroup.C74826e.DEFAULT, false));
    }

    /* renamed from: Y5 */
    public final void mo91070Y5() {
        if (C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            mo91071Z5();
        } else {
            this.f215752d.mo91571l().postUI(new C67057a(this));
        }
    }

    /* renamed from: Z5 */
    public final void mo91071Z5() {
        ChatTipsBarGroup chatTipsBarGroup = this.f192608f;
        if (chatTipsBarGroup != null) {
            chatTipsBarGroup.mo103990b();
        }
        this.f192612j = new LinkedList<>();
        for (C76787a Y5 : this.f192610h) {
            Y5.mo86475Y5();
        }
    }

    /* renamed from: j1 */
    public boolean mo91072j1() {
        return this.f192612j.size() > 0;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        for (C76787a l2 : this.f192610h) {
            l2.mo70047l2();
        }
        if (C86709a0.m107523b().mo121114l()) {
            C97625j3.m125812b().mo105902q().remove(this.f192613n);
        }
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Log.m105918d(this.f192607e, "onChattingExitAnimEnd() called");
        mo91070Y5();
        this.f192609g = 0;
        f192606o = null;
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        for (C76787a u2 : this.f192610h) {
            u2.mo70142u2(bVar);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        if (C86709a0.m107523b().mo121114l()) {
            C97625j3.m125812b().mo105902q().remove(this.f192613n);
        }
    }

    /* renamed from: v3 */
    public Map<String, Object> mo91073v3(C72963f4 f4Var) {
        C76709a aVar = null;
        if (f4Var == null) {
            return null;
        }
        for (C76709a aVar2 : this.f192612j) {
            if ((aVar2 instanceof C76719m) && ((C76719m) aVar2).f224453v.getMsgId() == f4Var.getMsgId()) {
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            return aVar.mo106997b();
        }
        return C90364q0.m113149h(C76719m.f224451w.mo59556a(f4Var), C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_list_length", Integer.valueOf(this.f192612j.size()))), C46564f.m51893a(this.f215752d.mo91575p())));
    }
}
