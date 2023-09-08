package com.tencent.p014mm.feature.performance;

import android.content.Context;
import ce2.C28544a;
import ce2.C28547d;
import com.tencent.matrix.resource.C92459b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.performance.diagnostic.C30338e;
import com.tencent.p014mm.plugin.performance.diagnostic.DiagnosticPush;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import de2.C86231c;
import de2.C86244g;
import di3.C86301e;
import ee2.C86511b;
import ei3.C86522b;
import f40.C86709a0;
import f81.C7998c;
import fe2.C86863b;
import tf0.C37054v1;

@C86522b(dependencies = {C85597u.class, C7998c.class}, onProcess = {C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES})
/* renamed from: com.tencent.mm.feature.performance.c0 */
public class C28920c0 extends C86301e {
    public void onCreate(Context context) {
        C28544a aVar = C28544a.INSTANCE;
        aVar.mo56048e(C30338e.f81885e);
        aVar.mo56048e(new C86511b());
        aVar.mo56048e(new C86231c());
        aVar.mo56048e(new C86863b());
        aVar.mo56048e(new C86244g());
        MultiProcessMMKV multiProcessMMKV = DiagnosticPush.f81882a;
        if (MMApplicationContext.isMainProcess()) {
            DiagnosticPush.f81884c.alive();
        }
        C86709a0.m107532n(C28547d.class, new C37054v1());
        C92459b.f264618b = C85875k4.m106199o0();
    }
}
