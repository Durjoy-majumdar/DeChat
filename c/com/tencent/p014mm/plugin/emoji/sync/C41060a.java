package com.tencent.p014mm.plugin.emoji.sync;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import l61.C46833a;
import l61.C46834b;
import p490dl.C97489o;

/* renamed from: com.tencent.mm.plugin.emoji.sync.a */
public class C41060a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93123b f110569d;

    public C41060a(C93123b bVar) {
        this.f110569d = bVar;
    }

    public void run() {
        ArrayList<EmojiGroupInfo> d = C97489o.m125592g().mo136763d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_group_sync_min_count, 20);
        for (EmojiGroupInfo next : d) {
            if (next.field_sync != 2 && !Util.isEqual(next.field_productID, String.valueOf(17))) {
                Object bVar = Util.isEqual(next.field_productID, String.valueOf(17)) ? new C46834b("com.tencent.xin.emoticon.tusiji") : new C46833a(next.field_productID);
                if (next.field_idx < Qe) {
                    arrayList2.add(bVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        this.f110569d.f268269a.mo64096e();
        this.f110569d.f268269a.mo64092a(arrayList2);
        this.f110569d.f268269a.mo64093b(arrayList);
        BKGLoaderManager bKGLoaderManager = this.f110569d.f268269a;
        if (!bKGLoaderManager.f110547c) {
            bKGLoaderManager.mo64097f();
        }
    }
}
