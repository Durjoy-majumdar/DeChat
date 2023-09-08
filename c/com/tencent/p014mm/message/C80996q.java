package com.tencent.p014mm.message;

import android.util.Pair;
import cc3.C26835d;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.storage.C72963f4;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C64596nz3;

/* renamed from: com.tencent.mm.message.q */
public interface C80996q extends C7335d {

    /* renamed from: com.tencent.mm.message.q$a */
    public static class C1279a {
        /* renamed from: a */
        public static C80996q m1369a() {
            return (C80996q) C86312j.m106911c(C80996q.class);
        }
    }

    void Je0(C72963f4 f4Var, C26835d dVar, C32226l<? super C89132b.C89134c<C64596nz3>, C13598b0> lVar);

    /* renamed from: qE */
    Pair<Integer, Long> mo112827qE(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr);

    /* renamed from: y0 */
    Pair<Integer, Long> mo112828y0(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr, boolean z);
}
