package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e30.C75539a;
import hd0.C98410o0;
import p682rz.C101488s;
import t30.C77843i;
import t30.C77844j;
import zp3.C23555k;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$f */
public class m7$$f extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C72963f4 f217593a;

    /* renamed from: b */
    public final /* synthetic */ boolean f217594b;

    public m7$$f(C72963f4 f4Var, boolean z) {
        this.f217593a = f4Var;
        this.f217594b = z;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        if (!C72996z1.m85807K5(this.f217593a.mo108768t())) {
            boolean z2 = this.f217594b;
            long y2 = this.f217593a.mo108774y2();
            String t = this.f217593a.mo108768t();
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(this.f217593a.mo108765s2());
            C75539a.C75545f fVar = C75539a.f221937g;
            if (fVar != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new C77843i((C77844j) fVar, y2, z2, t), "KaraEvent");
            }
        }
    }
}
