package sq1;

import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import jq3.C9493c;
import tf0.C64916p1;
import tf1.C13914m;

/* renamed from: sq1.e */
public class C64151e implements C9493c, C13914m {

    /* renamed from: d */
    public C64147b f181868d;

    /* renamed from: e */
    public boolean f181869e;

    /* renamed from: f */
    public boolean f181870f;

    /* renamed from: g */
    public boolean f181871g;

    /* renamed from: h */
    public boolean f181872h;

    /* renamed from: i */
    public boolean f181873i;

    /* renamed from: j */
    public int f181874j;

    /* renamed from: n */
    public boolean f181875n;

    public C64151e(C64147b bVar) {
        C87412m.m108594g(bVar, "commentObj");
        this.f181868d = bVar;
        boolean z = false;
        if (!Util.isNullOrNil(bVar.getUsername()) && (C58739j4.f168176a.mo83694W(this.f181868d.getUsername()) || ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76657EE(this.f181868d.getUsername()))) {
            z = true;
        }
        this.f181869e = z;
        this.f181870f = true;
        this.f181871g = true;
        this.f181874j = this.f181868d.mo88879q2();
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f181868d.field_actionInfo.f186500h == 0 ? 1 : 2;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        return this.f181868d.mo88875m2();
    }
}
