package rc1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.FavInitConfirmDialogContentEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import qc1.C101110e;
import rb1.C101369c;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101841sc0;
import wd3.C78575u;
import xb1.C102614d;

/* renamed from: rc1.b */
public class C101370b extends IStaticListener<FavInitConfirmDialogContentEvent> {
    public boolean callback(IEvent iEvent) {
        Object obj;
        FavInitConfirmDialogContentEvent favInitConfirmDialogContentEvent = (FavInitConfirmDialogContentEvent) iEvent;
        FavInitConfirmDialogContentEvent.C67700a aVar = favInitConfirmDialogContentEvent.f193616d;
        Object obj2 = aVar.f193620d;
        if (obj2 != null && (obj2 instanceof C78575u.C78583h) && (obj = aVar.f193621e) != null && (obj instanceof Context)) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(favInitConfirmDialogContentEvent.f193616d.f193617a);
            FavInitConfirmDialogContentEvent.C67700a aVar2 = favInitConfirmDialogContentEvent.f193616d;
            String str = aVar2.f193618b;
            Log.m105919d("MicroMsg.InitConfirmDialogContentListener", "confirmDialog itemInfo:%s fakeLocalId:%s", Long.valueOf(aVar2.f193617a), str);
            if (!Util.isNullOrNil(str) && ((Yt != null && Yt.field_type == 18) || Yt.field_type == 14)) {
                try {
                    LinkedList<C101834rc0> linkedList = Yt.field_favProto.f298618f;
                    int i = Yt.field_type == 18 ? 1 : 0;
                    while (true) {
                        if (i >= linkedList.size()) {
                            break;
                        }
                        C101834rc0 rc02 = linkedList.get(i);
                        if (str.startsWith(rc02.f299280T)) {
                            C100755z o2 = Yt.clone();
                            o2.field_type = favInitConfirmDialogContentEvent.f193616d.f193619c;
                            o2.f295172Q0 = true;
                            o2.f295173R0 = Yt;
                            o2.f295174S0 = Yt.field_localId + "_" + rc02.f299280T;
                            C101801kd0 a = C101369c.m133013a(Yt.field_favProto);
                            o2.field_favProto = a;
                            a.f298618f = new LinkedList<>();
                            o2.field_favProto.f298618f.add(rc02);
                            o2.field_favProto.mo141220r(rc02.f299297d);
                            C101841sc0 sc02 = rc02.f299296c1;
                            if (sc02 != null) {
                                int i2 = favInitConfirmDialogContentEvent.f193616d.f193619c;
                                if (i2 == 6) {
                                    o2.field_favProto.mo141215m(sc02.f299406e);
                                } else if (i2 == 5) {
                                    o2.field_favProto.mo141221s(sc02.f299407f);
                                }
                            }
                            Yt = o2;
                        } else {
                            i++;
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.InitConfirmDialogContentListener", "FavInitConfirmDialogContentEvent callback : %s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
            if (Yt == null && !Util.isNullOrNil(favInitConfirmDialogContentEvent.f193616d.f193622f)) {
                Yt = C100734q.m131886z(favInitConfirmDialogContentEvent.f193616d.f193622f, 18);
            }
            FavInitConfirmDialogContentEvent.C67700a aVar3 = favInitConfirmDialogContentEvent.f193616d;
            C78575u.C78583h hVar = (C78575u.C78583h) aVar3.f193620d;
            Context context = (Context) aVar3.f193621e;
            C101110e.m132507j(hVar, context, Yt);
            C101110e.m132508k(hVar, context, Yt);
        }
        FavInitConfirmDialogContentEvent.C67700a aVar4 = favInitConfirmDialogContentEvent.f193616d;
        aVar4.f193617a = 0;
        aVar4.f193618b = "";
        aVar4.f193620d = null;
        aVar4.f193621e = null;
        return false;
    }
}
