package f11;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import p763ym.C53543s;

/* renamed from: f11.b */
public class C97793b extends C97799h {

    /* renamed from: g */
    public C68070l.C68072b f286882g;

    /* renamed from: h */
    public String f286883h;

    public C97793b(C92993j jVar, C72963f4 f4Var) {
        super(jVar, f4Var);
    }

    /* renamed from: c */
    public String mo137118c() {
        return mo137131p() != null ? mo137131p().f195602n : "";
    }

    /* renamed from: d */
    public String mo137119d() {
        return mo137131p() != null ? mo137131p().f195570f : "";
    }

    /* renamed from: e */
    public int mo137120e() {
        if (mo137131p() != null) {
            return mo137131p().f195594l;
        }
        return 0;
    }

    /* renamed from: m */
    public String mo137130m() {
        C72683d qq;
        if (!(this.f286883h != null || mo137131p() == null || mo137131p().f195606o == null || mo137131p().f195606o.length() <= 0 || (qq = ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100154qq(mo137131p().f195606o)) == null)) {
            this.f286883h = qq.field_fileFullPath;
        }
        String str = this.f286883h;
        return str != null ? str : "";
    }

    /* renamed from: p */
    public final C68070l.C68072b mo137131p() {
        if (this.f286882g == null) {
            this.f286882g = C68070l.C68072b.m80422u(this.f286878b.getContent(), (String) null);
        }
        return this.f286882g;
    }
}
