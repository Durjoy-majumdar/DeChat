package com.tencent.p014mm.plugin.game.media;

import com.tencent.p014mm.plugin.game.media.GameLocalGalleryView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.media.c */
public class C94116c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f271815d;

    /* renamed from: e */
    public final /* synthetic */ GameLocalGalleryView.C94092f f271816e;

    public C94116c(GameLocalGalleryView.C94092f fVar, ArrayList arrayList) {
        this.f271816e = fVar;
        this.f271815d = arrayList;
    }

    public void run() {
        this.f271816e.f271711d.clear();
        ArrayList arrayList = this.f271815d;
        if (arrayList != null) {
            this.f271816e.f271711d.addAll(arrayList);
        }
        this.f271816e.notifyDataSetChanged();
    }
}
