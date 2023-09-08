package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gk3.C98154l;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p200lx.C99716u;
import p270xi.C91212b;
import te3.C51834wh2;
import zj3.C103036t0;

@C91212b(exportInterface = C103036t0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.l4 */
public final class C97016l4 extends C73412a implements C103036t0 {
    /* renamed from: n2 */
    public void mo26199n2() {
        HashMap<String, C51834wh2> hashMap = C98154l.f287765e;
        HashMap<String, C51834wh2> hashMap2 = C98154l.f287765e;
        ConcurrentHashMap<Long, C98154l.C98155a> concurrentHashMap = C98154l.f287766f;
        Log.m105925i("MicroMsg.ImageSearchPreviewManager", "alvinluo clearCache previewResult size: %d, msgIdToPHashCache size: %d", Integer.valueOf(hashMap2.size()), Integer.valueOf(concurrentHashMap.size()));
        hashMap2.clear();
        concurrentHashMap.clear();
        ((C99716u) C86312j.m106911c(C99716u.class)).mo138680NE();
    }
}
