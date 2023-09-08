package mn3;

import android.app.Activity;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.conversation.banner.C74666h;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import f40.C86709a0;
import gb0.C75900d;
import gb0.C75901e;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76615k;
import ln3.C76709a;
import ln3.C76716j;
import xd3.C78801a;

/* renamed from: mn3.j */
public final class C76796j extends C76787a<C76716j> {

    /* renamed from: f */
    public final C75901e f224615f = new C76797a(this);

    /* renamed from: mn3.j$a */
    public static final class C76797a implements C75901e {

        /* renamed from: a */
        public final /* synthetic */ C76796j f224616a;

        public C76797a(C76796j jVar) {
            this.f224616a = jVar;
        }

        /* renamed from: a */
        public void mo102639a(boolean z) {
            Log.m105918d("SecurityTipsBarProcessor", "onStateChange() called with: state = " + z);
            this.f224616a.mo107034Z5();
        }

        /* renamed from: b */
        public void mo102640b() {
            Log.m105918d("SecurityTipsBarProcessor", "onCleanState() called");
            this.f224616a.mo107034Z5();
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C97625j3.m125812b().mo105905t().mo106155a(this.f224615f);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (C86709a0.m107523b().mo121114l()) {
            C75900d t = C97625j3.m125812b().mo105905t();
            ((ArrayList) t.f222571a).remove(this.f224615f);
        }
    }

    /* renamed from: Z */
    public List<C76716j> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        Activity f = this.f215752d.mo91565f();
        C74666h.C74667a aVar = C74666h.C74667a.CHATTING_SECURITY_BANNER_V2;
        Object[] objArr = new Object[3];
        objArr[0] = iVar.f107141a;
        String str = iVar.f107142b;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = Boolean.valueOf(iVar.f107144d);
        C78801a a = C74666h.m89417a(f, aVar, objArr);
        Log.m105918d("SecurityTipsBarProcessor", "getData:" + a);
        if (a == null || a.getView() == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C76716j(a));
        return linkedList;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224433s;
    }

    /* renamed from: y */
    public C61118a<C76716j> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76615k(bVar, dVar, this);
    }
}
