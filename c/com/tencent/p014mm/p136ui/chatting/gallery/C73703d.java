package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.chatting.gallery.d */
public final class C73703d {

    /* renamed from: a */
    public static final C73703d f216412a = new C73703d();

    /* renamed from: b */
    public static final HashMap<Long, CdnVideoResourceDownloader> f216413b = new HashMap<>();

    /* renamed from: a */
    public final CdnVideoResourceDownloader mo102767a(long j) {
        return f216413b.get(Long.valueOf(j));
    }

    /* renamed from: b */
    public final CdnVideoResourceDownloader mo102768b(long j) {
        return f216413b.remove(Long.valueOf(j));
    }
}
