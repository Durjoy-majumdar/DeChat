package f11;

import android.view.View;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import g11.C98068c;
import p158gt.C98201k;

/* renamed from: f11.h */
public class C97799h extends C97796e {

    /* renamed from: f */
    public String f286889f;

    public C97799h(C92993j jVar, C72963f4 f4Var) {
        super(jVar, f4Var);
    }

    /* renamed from: h */
    public int mo137124h() {
        return 2;
    }

    /* renamed from: k */
    public void mo137127k(View view, C97792a aVar) {
        C98068c.m126679d(((C92977a) this.f286877a).f267793d.getContext(), view, aVar);
    }

    /* renamed from: m */
    public String mo137130m() {
        if (this.f286889f == null) {
            String c402 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).c40(this.f286878b.mo108765s2(), false, false);
            this.f286889f = c402;
            if (!Util.isNullOrNil(c402) && !this.f286889f.endsWith("hd")) {
                if (C86013q1.m106450k(this.f286889f + "hd")) {
                    this.f286889f += "hd";
                }
            }
        }
        return this.f286889f;
    }
}
