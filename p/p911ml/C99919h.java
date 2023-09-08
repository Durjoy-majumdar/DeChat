package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hp3.C87581a;
import ob0.C89132b;
import p207nl.C89008j;
import p490dl.C97491p;
import te3.C52081y8;
import z51.C39315g;

/* renamed from: ml.h */
public class C99919h implements C87581a<Void, C89132b.C89134c<C52081y8>> {

    /* renamed from: a */
    public final /* synthetic */ String f292778a;

    /* renamed from: b */
    public final /* synthetic */ C99917g f292779b;

    public C99919h(C99917g gVar, String str) {
        this.f292779b = gVar;
        this.f292778a = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        Log.m105925i("MicroMsg.EmojiUploadBackup", "backup callback: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C99917g gVar = this.f292779b;
            String str = this.f292778a;
            Class cls = C39315g.class;
            Log.m105925i("MicroMsg.EmojiUpload", "save emoji gif md5, wxam %b, md5 %s, %s", Boolean.valueOf(!Util.isNullOrNil(gVar.f292771a.field_wxamMd5)), str, gVar.f292771a.field_wxamMd5);
            if (!gVar.f292773c || Util.isNullOrNil(str)) {
                EmojiInfo emojiInfo = gVar.f292771a;
                emojiInfo.getClass();
                emojiInfo.field_captureStatus = 0;
                ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().r50(gVar.f292771a);
            } else {
                String K1 = gVar.f292771a.mo62640K1();
                String coverPath = gVar.f292771a.getCoverPath();
                C86013q1.m106442c(K1, C89008j.f256613a.mo123385d() + str);
                EmojiInfo emojiInfo2 = gVar.f292771a;
                String str2 = emojiInfo2.field_md5;
                emojiInfo2.field_md5 = str;
                emojiInfo2.field_externMd5 = emojiInfo2.field_wxamMd5;
                emojiInfo2.field_captureStatus = 0;
                C86013q1.m106442c(coverPath, emojiInfo2.getCoverPath());
                ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().mo142040Ow(gVar.f292771a);
                ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().mo142043TE(str2);
            }
            this.f292779b.mo139265a(0, this.f292778a);
            C97491p.f286143a.mo136773a(true);
        } else if (i2 == -434) {
            if (this.f292779b.f292772b) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, Boolean.TRUE);
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, Boolean.TRUE);
            }
            this.f292779b.mo139265a(3, (String) null);
            C97491p.f286143a.mo136773a(true);
        } else {
            this.f292779b.mo139266b();
        }
        return null;
    }
}
