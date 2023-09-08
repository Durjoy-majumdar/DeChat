package mn3;

import a11.C39479c;
import ak3.C67056a;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76604c;
import l31.C61212e;
import ln3.C76709a;
import ln3.C76711c;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import z04.C112551y;

/* renamed from: mn3.c */
public final class C76789c extends C76787a<C76711c> {

    /* renamed from: f */
    public ViewRoomDescTipsStruct f224606f;

    /* renamed from: g */
    public final MStorage.IOnStorageChange f224607g = new C76790a(this);

    /* renamed from: h */
    public boolean f224608h;

    /* renamed from: mn3.c$a */
    public static final class C76790a implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C76789c f224609d;

        public C76790a(C76789c cVar) {
            this.f224609d = cVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105926v("ChatRoomNotifyTipsBarProcessor", "roommember watcher notify " + str);
            if (this.f224609d.f215752d.mo91583x() && !Util.isNullOrNil(str) && C87412m.m108589b(str, this.f224609d.f215752d.mo91577r())) {
                this.f224609d.mo107034Z5();
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C97625j3.m125812b().mo105902q().add(this.f224607g);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (C86709a0.m107523b().mo121114l()) {
            C97625j3.m125812b().mo105902q().remove(this.f224607g);
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f224608h = false;
    }

    /* renamed from: Z */
    public List<C76711c> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(iVar.f107141a);
        if (bVar.f193286j.hasDestory || Lo == null) {
            return null;
        }
        boolean z = true;
        if (Lo.field_chatroomNoticeNew != 1) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        String str = Lo.field_chatroomnotice;
        if (str != null && !C112551y.m153811k(str)) {
            z = false;
        }
        if (!z) {
            linkedList.add(new C76711c(Lo));
        }
        return linkedList;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224427j;
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        C76711c cVar;
        WeakReference<C67056a> weakReference = C67056a.f192606o;
        C67056a aVar = weakReference != null ? weakReference.get() : null;
        if (aVar != null) {
            Iterator<T> it = aVar.f192612j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                C76709a aVar2 = (C76709a) it.next();
                if (aVar2 instanceof C76711c) {
                    cVar = (C76711c) aVar2;
                    break;
                }
            }
            if (cVar != null) {
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("group_msg_set_top_detach", (Object) null, C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_close_scene", 5)), cVar.mo106997b()), 26356);
            }
        }
        if (this.f215752d.mo91583x()) {
            List<? extends DATA> list = this.f224605e;
            if ((list != null ? list.size() : 0) > 0 && this.f224608h) {
                C45612m0.m50676C(this.f215752d.mo91574o().getUsername());
            }
        }
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = this.f224606f;
        if (viewRoomDescTipsStruct != null) {
            viewRoomDescTipsStruct.mo86054n();
        }
        this.f224606f = null;
    }

    /* renamed from: y */
    public C61118a<C76711c> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76604c(bVar, dVar, this);
    }
}
