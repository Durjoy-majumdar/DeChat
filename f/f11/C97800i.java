package f11;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import g11.C98068c;
import hd0.C98410o0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p682rz.C101488s;
import p682rz.C101491u;

/* renamed from: f11.i */
public class C97800i extends C97796e {

    /* renamed from: f */
    public String f286890f;

    /* renamed from: g */
    public String f286891g;

    public C97800i(C92993j jVar, C72963f4 f4Var) {
        super(jVar, f4Var);
    }

    /* renamed from: h */
    public int mo137124h() {
        return 3;
    }

    /* renamed from: k */
    public void mo137127k(View view, C97792a aVar) {
        C98068c.m126679d(((C92977a) this.f286877a).f267793d.getContext(), view, aVar);
    }

    /* renamed from: m */
    public String mo137130m() {
        if (this.f286891g == null) {
            this.f286891g = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(this.f286878b.mo108765s2());
        }
        return this.f286891g;
    }

    /* renamed from: n */
    public void mo137126j(C97806o oVar, int i, C97792a aVar) {
        super.mo137126j(oVar, i, aVar);
        View view = oVar.f286910E;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.f286911F.setVisibility(0);
        TextView textView = oVar.f286911F;
        if (this.f286890f == null) {
            this.f286890f = Util.formatSecToMin(((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f286878b.mo108765s2()).f288566m);
        }
        textView.setText(Util.nullAs(this.f286890f, ""));
    }
}
