package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import fy3.C32224a;
import fy3.C32226l;
import rx3.C13598b0;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.model.v */
public interface C57463v {

    /* renamed from: com.tencent.mm.plugin.vlog.model.v$a */
    public static final class C57464a {
        /* renamed from: a */
        public static /* synthetic */ void m66219a(C57463v vVar, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aVar = null;
                }
                vVar.mo81179g(aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ float m66220b(C57463v vVar, C64899zy zyVar, boolean z, C32226l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return vVar.mo81177e(zyVar, z, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: export");
        }
    }

    /* renamed from: a */
    void mo81173a(boolean z, VideoTransPara videoTransPara);

    /* renamed from: b */
    void mo81174b(C32226l<? super Float, C13598b0> lVar);

    /* renamed from: c */
    void mo81175c(int i);

    /* renamed from: d */
    void mo81176d(boolean z);

    /* renamed from: e */
    float mo81177e(C64899zy zyVar, boolean z, C32226l<? super C96553q, C13598b0> lVar);

    /* renamed from: f */
    void mo81178f(int i);

    /* renamed from: g */
    void mo81179g(C32224a<C13598b0> aVar);
}
