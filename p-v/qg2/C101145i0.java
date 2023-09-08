package qg2;

import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import p478cp.C45138c;
import p654pw.C100971c;
import te3.C101801kd0;

/* renamed from: qg2.i0 */
public class C101145i0 implements C45138c.C45139a {

    /* renamed from: a */
    public final /* synthetic */ long f296050a;

    /* renamed from: b */
    public final /* synthetic */ C68070l.C68072b f296051b;

    /* renamed from: c */
    public final /* synthetic */ String f296052c;

    /* renamed from: d */
    public final /* synthetic */ DoFavoriteEvent f296053d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f296054e;

    public C101145i0(long j, C68070l.C68072b bVar, String str, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        this.f296050a = j;
        this.f296051b = bVar;
        this.f296052c = str;
        this.f296053d = doFavoriteEvent;
        this.f296054e = f4Var;
    }

    /* renamed from: a */
    public void mo70647a(int i, String str, List<C45138c.C45141c> list) {
        C101801kd0 kd02;
        String str2;
        if (i == 0) {
            C101147j0.m132622c(this.f296050a, this.f296051b.mo93550m(), this.f296051b.mo93548k(), this.f296052c, this.f296053d.f264674d.f264676a);
        } else if (-3200 == i) {
            C101147j0.m132620a(this.f296050a, this.f296054e);
            long j = this.f296050a;
            C72963f4 f4Var = this.f296054e;
            String str3 = this.f296052c;
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            C101144i u2 = C101147j0.m132640u(u);
            if (u2 != null) {
                str2 = u2.f296047a;
                kd02 = u2.f296049c;
            } else {
                kd02 = null;
                str2 = "";
            }
            C101147j0.m132622c(j, u.mo93550m(), str2, str3, kd02);
            ((C100971c) C86312j.m106911c(C100971c.class)).rm0(this.f296050a, this.f296052c);
        } else {
            this.f296054e.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f296050a, this.f296054e);
            if (!C101147j0.m132612E(this.f296052c, this.f296050a, false, str)) {
                C101147j0.m132621b(this.f296052c, str);
            }
        }
    }
}
