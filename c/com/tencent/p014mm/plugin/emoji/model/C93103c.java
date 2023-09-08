package com.tencent.p014mm.plugin.emoji.model;

import android.os.Looper;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import java.io.File;
import java.util.Set;
import p008bq.C39833l0;
import p441aq.C92054g;
import p823sg.C90193h;
import z04.C119027c;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.model.c */
public final class C93103c implements C39833l0.C39834a {

    /* renamed from: a */
    public static final C93103c f268230a = new C93103c();

    /* renamed from: a */
    public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo != null && z && !Util.isNullOrNil(iEmojiInfo.mo62676i0())) {
            Set<String> set = C93121y.f268266a;
            C87412m.m108591d(set);
            if (set.remove(iEmojiInfo.getMd5())) {
                Log.m105925i("MicroMsg.FTS.FTSEmojiLogic", "emojiServiceCallback onDownload %s", iEmojiInfo.getMd5());
                FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = new FTSEmojiDownloadedEvent();
                FTSEmojiDownloadedEvent.C1032a aVar = fTSEmojiDownloadedEvent.f9141d;
                aVar.f9143a = 2;
                aVar.f9144b = iEmojiInfo.mo62685o0();
                fTSEmojiDownloadedEvent.f9141d.f9146d = iEmojiInfo.getName();
                fTSEmojiDownloadedEvent.f9141d.f9147e = iEmojiInfo.getAesKey();
                fTSEmojiDownloadedEvent.f9141d.f9148f = iEmojiInfo.mo62660g2();
                fTSEmojiDownloadedEvent.f9141d.f9145c = iEmojiInfo.getThumbUrl();
                fTSEmojiDownloadedEvent.f9141d.f9149g = iEmojiInfo.mo62676i0();
                fTSEmojiDownloadedEvent.f9141d.f9150h = iEmojiInfo.getGroupId();
                String K1 = iEmojiInfo.mo62640K1();
                ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(iEmojiInfo.getMd5());
                if (TO == null || (TO.field_reserved4 & 1) != 1) {
                    fTSEmojiDownloadedEvent.f9142e.f9151a = K1;
                } else if (MMApplicationContext.getContext().getExternalCacheDir() != null) {
                    File externalCacheDir = MMApplicationContext.getContext().getExternalCacheDir();
                    String md5 = iEmojiInfo.getMd5();
                    C87412m.m108593f(md5, "emoji.md5");
                    byte[] bytes = md5.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    String i = new C86009m1(externalCacheDir, C90193h.m112878f(bytes)).mo119971i();
                    C87412m.m108593f(i, "VFSFile(\n               …           ).absolutePath");
                    if (C86013q1.m106450k(K1) && !C86013q1.m106450k(i)) {
                        byte[] u = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138036u(TO);
                        if (u != null) {
                            C86013q1.m106440a(i, u);
                        } else {
                            Log.m105928w("MicroMsg.FTS.FTSEmojiLogic", "onDownload: decrypt failed");
                        }
                    }
                    fTSEmojiDownloadedEvent.f9142e.f9151a = i;
                } else {
                    return;
                }
                fTSEmojiDownloadedEvent.asyncPublish(Looper.getMainLooper());
                return;
            }
        }
        Log.m105924i("MicroMsg.FTS.FTSEmojiLogic", "somethings error.");
    }
}
