package com.tencent.p014mm.plugin.story.model.sync;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import hw2.C8826e;
import rx3.C13598b0;
import zv2.C103105a;

/* renamed from: com.tencent.mm.plugin.story.model.sync.e */
public final class C96347e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f281776d;

    /* renamed from: e */
    public final /* synthetic */ boolean f281777e;

    /* renamed from: f */
    public final /* synthetic */ String f281778f;

    /* renamed from: g */
    public final /* synthetic */ String f281779g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96347e(long j, boolean z, String str, String str2) {
        super(0);
        this.f281776d = j;
        this.f281777e = z;
        this.f281778f = str;
        this.f281779g = str2;
    }

    public Object invoke() {
        StoryCore.f281736t.mo134191i().mo138664Ow(this.f281776d);
        ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
        Log.m105924i("MicroMsg.ContactSyncFetcher", "new comment in " + this.f281776d + ", isUnread:" + this.f281777e + ", storyOwner:" + this.f281778f + ", fromUser:" + this.f281779g);
        C103105a aVar = C103105a.f304209b;
        C103105a.C103106a aVar2 = (C103105a.C103106a) aVar.mo138761d();
        C103105a.C103106a aVar3 = (C103105a.C103106a) aVar.mo138761d();
        Log.m105924i("MicroMsg.ContactSyncFetcher", "filterStory false");
        C8826e eVar = ContactSyncFetcher.f281760f.get(this.f281778f);
        if (eVar == null) {
            return C13598b0.f38549a;
        }
        eVar.getClass();
        throw null;
    }
}
