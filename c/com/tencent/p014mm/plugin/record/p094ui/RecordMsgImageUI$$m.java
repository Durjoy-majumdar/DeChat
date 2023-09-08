package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$m */
public class RecordMsgImageUI$$m implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f272666d;

    /* renamed from: e */
    public final /* synthetic */ RecordMsgImageUI$$q f272667e;

    /* renamed from: f */
    public final /* synthetic */ List f272668f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgImageUI f272669g;

    public RecordMsgImageUI$$m(RecordMsgImageUI recordMsgImageUI, List list, RecordMsgImageUI$$q recordMsgImageUI$$q, List list2) {
        this.f272669g = recordMsgImageUI;
        this.f272666d = list;
        this.f272667e = recordMsgImageUI$$q;
        this.f272668f = list2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        this.f272669g.f272641q.mo107567l((View) null);
        e0Var.clear();
        e0Var.setHeaderTitle((CharSequence) "");
        for (int i = 0; i < this.f272666d.size(); i++) {
            if (((Integer) this.f272666d.get(i)).intValue() == 3) {
                RecordMsgImageUI recordMsgImageUI = this.f272669g;
                C77407n nVar = recordMsgImageUI.f272641q;
                RecordMsgImageUI$$q recordMsgImageUI$$q = this.f272667e;
                recordMsgImageUI.getClass();
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = recordMsgImageUI$$q.f272679a;
                C96874n1 n1Var = C96874n1.f283849a;
                int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                C94369m mVar = new C94369m(recordMsgImageUI, recogQBarOfImageFileResultEvent, d, b, c);
                if (!recordMsgImageUI$$q.f272680b) {
                    recordMsgImageUI$$q.f272680b = true;
                    ((ScanCodeSheetItemLogic) recordMsgImageUI.f272646v).mo67077h(b, d);
                }
                nVar.mo107567l(((ScanCodeSheetItemLogic) recordMsgImageUI.f272646v).mo67071b(mVar, b, d, 5));
            } else {
                e0Var.mo107142f(((Integer) this.f272666d.get(i)).intValue(), (CharSequence) this.f272668f.get(i));
            }
        }
    }
}
