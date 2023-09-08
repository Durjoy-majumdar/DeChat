package com.tencent.p014mm.plugin.emoji.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import p248ug.C90660g;
import wh3.C38145t;

/* renamed from: com.tencent.mm.plugin.emoji.provider.EmotionContentProvider */
public class EmotionContentProvider extends ContentProvider {

    /* renamed from: d */
    public static final UriMatcher f268268d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f268268d = uriMatcher;
        String str = C90660g.f260478a;
        uriMatcher.addURI(str, "EmojiGroupInfo", 1);
        uriMatcher.addURI(str, "userinfo", 2);
        uriMatcher.addURI(str, "GetEmotionListCache", 3);
        uriMatcher.addURI(str, "EmojiInfo", 4);
        uriMatcher.addURI(str, "EmojiInfoDesc", 5);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.Bundle, java.lang.Object, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04f4, code lost:
        if (r6 == 0) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0501, code lost:
        if (r6 == 0) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0503, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0506, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "getSmileyPanelConfigInfoList: %s", java.lang.Integer.valueOf(r3.size()));
        r1.putParcelableArrayList("smiley_panel_info", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x051d, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r20, java.lang.String r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Class<aq.g> r3 = p441aq.C92054g.class
            java.lang.Class<z51.g> r4 = z51.C39315g.class
            java.lang.String r5 = "MicroMsg.EmotionContentProvider"
            java.lang.String r6 = "[call] method:%s"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r8)
            f40.a0 r5 = f40.C86709a0.m107528h()
            boolean r5 = r5.f251735l
            r6 = 0
            if (r5 == 0) goto L_0x0579
            f40.e r5 = f40.C86709a0.m107523b()
            boolean r5 = r5.mo121114l()
            if (r5 != 0) goto L_0x002c
            goto L_0x0579
        L_0x002c:
            java.lang.String r5 = "getAccPath"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0046
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "path"
            f40.o r2 = f40.C86709a0.m107535s()
            java.lang.String r2 = r2.f251806d
            r0.putString(r1, r2)
            return r0
        L_0x0046:
            java.lang.String r5 = "getEmojiKey"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0062
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_data"
            tk.a r2 = p384tk.C101897a.m134075e()
            java.lang.String r2 = r2.mo141395d()
            r0.putString(r1, r2)
            return r0
        L_0x0062:
            java.lang.String r5 = "ConfigStorage.getBoolean"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0091
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key"
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.String r4 = "key"
            int r2 = r2.getInt(r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r3.mo119684e(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.putBoolean(r1, r2)
            return r0
        L_0x0091:
            java.lang.String r5 = "ConfigStorage.getString"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00bc
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key"
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.String r4 = "key"
            int r2 = r2.getInt(r4)
            java.lang.String r4 = ""
            java.lang.Object r2 = r3.mo119684e(r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            r0.putString(r1, r2)
            return r0
        L_0x00bc:
            java.lang.String r5 = "getAllCustomEmoji"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00de
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r1 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.<init>(r1)
            java.lang.String r1 = "key_data"
            dl.o r2 = p490dl.C97489o.m125592g()
            java.util.ArrayList r2 = r2.mo136760a()
            r0.putParcelableArrayList(r1, r2)
            return r0
        L_0x00de:
            java.lang.String r5 = "getRandomEmoji"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x012f
            if (r2 == 0) goto L_0x011a
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r0 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            java.lang.String r0 = "emoji"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r0
            android.os.Bundle r1 = new android.os.Bundle
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r2 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.<init>(r2)
            java.lang.String r2 = "data"
            di3.d r3 = di3.C86312j.m106911c(r4)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r3.mo138027m(r0)
            r1.putParcelable(r2, r0)
            return r1
        L_0x011a:
            java.lang.String r0 = "MicroMsg.EmotionContentProvider"
            java.lang.String r1 = "[getRandomEmoji] extras:%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]
            if (r2 != 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r3[r9] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
            goto L_0x0578
        L_0x012f:
            java.lang.String r5 = "getCurLangDesc"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0150
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "data"
            di3.d r3 = di3.C86312j.m106911c(r3)
            aq.g r3 = (p441aq.C92054g) r3
            com.tencent.mm.storage.p2 r3 = r3.mo126027Cd()
            java.lang.String r1 = r3.mo57676c(r1)
            r0.putString(r2, r1)
            return r0
        L_0x0150:
            java.lang.String r5 = "countCustomEmoji"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0188
            if (r2 == 0) goto L_0x0168
            java.lang.String r0 = "withSystem"
            boolean r7 = r2.getBoolean(r0)
            java.lang.String r0 = "onlySuccess"
            boolean r9 = r2.getBoolean(r0)
        L_0x0168:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "data"
            di3.d r2 = di3.C86312j.m106911c(r3)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            int r2 = r2.mo142063qq(r7, r9)
            r0.putInt(r1, r2)
            return r0
        L_0x0188:
            java.lang.String r5 = "countCaptureEmoji"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x01b9
            if (r2 == 0) goto L_0x0199
            java.lang.String r0 = "onlySuccess"
            boolean r7 = r2.getBoolean(r0)
        L_0x0199:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "data"
            di3.d r2 = di3.C86312j.m106911c(r3)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            int r2 = r2.mo142038Lo(r7)
            r0.putInt(r1, r2)
            return r0
        L_0x01b9:
            java.lang.String r5 = "countProductId"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x01e1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "data"
            di3.d r3 = di3.C86312j.m106911c(r3)
            aq.g r3 = (p441aq.C92054g) r3
            r3.getClass()
            com.tencent.mm.storage.w2 r3 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r3 = r3.mo57717d()
            int r1 = r3.mo142048Yt(r1)
            r0.putInt(r2, r1)
            return r0
        L_0x01e1:
            java.lang.String r5 = "getEmojiListByGroupId"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x020c
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r2 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.<init>(r2)
            java.lang.String r2 = "data"
            di3.d r3 = di3.C86312j.m106911c(r4)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            i61.h r3 = (i61.C98602h) r3
            java.util.List r1 = r3.mo138000H(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.putParcelableArrayList(r2, r1)
            return r0
        L_0x020c:
            java.lang.String r5 = "getDesignerInfo"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x022f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.o r2 = r2.mo57719f()
            wh3.n r1 = r2.mo61538jo(r1)
            if (r1 == 0) goto L_0x022e
            java.lang.String r2 = "buffer"
            byte[] r1 = r1.field_content
            r0.putByteArray(r2, r1)
        L_0x022e:
            return r0
        L_0x022f:
            java.lang.String r5 = "getEmojiGroupInfoList"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0262
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiGroupInfo> r1 = com.tencent.p014mm.storage.emotion.EmojiGroupInfo.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.<init>(r1)
            java.lang.String r1 = "data"
            di3.d r2 = di3.C86312j.m106911c(r3)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r5 = r2.f82769a
            monitor-enter(r5)
            dl.o r2 = r2.f82787s     // Catch:{ all -> 0x025f }
            java.util.ArrayList r2 = r2.mo136763d()     // Catch:{ all -> 0x025f }
            monitor-exit(r5)     // Catch:{ all -> 0x025f }
            r0.putParcelableArrayList(r1, r2)
            return r0
        L_0x025f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x025f }
            throw r0
        L_0x0262:
            java.lang.String r5 = "createEmojiInfo"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x02a4
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_md5"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = "key_group"
            int r1 = r2.getInt(r1)
            java.lang.String r3 = "key_type"
            int r3 = r2.getInt(r3)
            java.lang.String r5 = "key_size"
            int r2 = r2.getInt(r5)
            di3.d r4 = di3.C86312j.m106911c(r4)
            z51.g r4 = (z51.C39315g) r4
            zc3.a r4 = r4.mo58035cm()
            i61.h r4 = (i61.C98602h) r4
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r4.mo138033r(r0, r1, r3, r2)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "key_emoji_info"
            r1.putParcelable(r2, r0)
            return r1
        L_0x02a4:
            java.lang.String r5 = "updateEmojiInfo"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x02d2
            if (r2 == 0) goto L_0x0578
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r0 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            java.lang.String r0 = "key_emoji_info"
            java.lang.Object r0 = r2.get(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r0
            di3.d r1 = di3.C86312j.m106911c(r4)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            r1.mo138019f(r0)
            goto L_0x0578
        L_0x02d2:
            java.lang.String r5 = "isEnableHEVCDecode"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x02fa
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_data"
            di3.d r2 = di3.C86312j.m106911c(r4)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            i61.h r2 = (i61.C98602h) r2
            r2.getClass()
            boolean r2 = p490dl.C97496s.m125614b()
            r0.putBoolean(r1, r2)
            return r0
        L_0x02fa:
            java.lang.String r5 = "isEnableHevcUpload"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x031f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_data"
            di3.d r2 = di3.C86312j.m106911c(r4)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            i61.h r2 = (i61.C98602h) r2
            boolean r2 = r2.mo138017d()
            r0.putBoolean(r1, r2)
            return r0
        L_0x031f:
            java.lang.String r5 = "getEmojiByMd5"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x034c
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_md5"
            java.lang.String r0 = r2.getString(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "key_emoji_info"
            di3.d r3 = di3.C86312j.m106911c(r4)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r3.mo137999G(r0)
            r1.putParcelable(r2, r0)
            return r1
        L_0x034c:
            java.lang.String r5 = "getConfig"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x037d
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_config_key"
            java.lang.Object r0 = r2.get(r0)
            com.tencent.mm.storage.y1$a r0 = (com.tencent.p014mm.storage.C72994y1.C72995a) r0
            di3.d r1 = di3.C86312j.m106911c(r4)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            java.lang.Object r0 = r1.mo138032q(r0, r6)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "key_config_value"
            java.io.Serializable r0 = (java.io.Serializable) r0
            r1.putSerializable(r2, r0)
            return r1
        L_0x037d:
            java.lang.String r5 = "setConfig"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x03a9
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_config_key"
            java.lang.Object r0 = r2.get(r0)
            com.tencent.mm.storage.y1$a r0 = (com.tencent.p014mm.storage.C72994y1.C72995a) r0
            java.lang.String r1 = "key_config_value"
            java.lang.Object r1 = r2.get(r1)
            di3.d r2 = di3.C86312j.m106911c(r4)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            i61.h r2 = (i61.C98602h) r2
            r2.mo138034s(r0, r1)
            goto L_0x0578
        L_0x03a9:
            java.lang.String r5 = "checkGifFile"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x03d6
            if (r2 == 0) goto L_0x0578
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_path"
            java.lang.String r1 = r2.getString(r1)
            di3.d r2 = di3.C86312j.m106911c(r4)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            i61.h r2 = (i61.C98602h) r2
            boolean r1 = r2.mo138026l1(r1)
            java.lang.String r2 = "key_data"
            r0.putBoolean(r2, r1)
            return r0
        L_0x03d6:
            java.lang.String r5 = "getSmileyInfoList"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0405
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x03fa }
            z51.g r0 = (z51.C39315g) r0     // Catch:{ Exception -> 0x03fa }
            zc3.a r0 = r0.mo58035cm()     // Catch:{ Exception -> 0x03fa }
            i61.h r0 = (i61.C98602h) r0     // Catch:{ Exception -> 0x03fa }
            java.util.ArrayList r0 = r0.mo138004K()     // Catch:{ Exception -> 0x03fa }
            java.lang.String r2 = "key_data"
            r1.putParcelableArrayList(r2, r0)     // Catch:{ Exception -> 0x03fa }
            goto L_0x0404
        L_0x03fa:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.EmotionContentProvider"
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x0404:
            return r1
        L_0x0405:
            java.lang.String r5 = "deleteLoadingCaptureEmoji"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0424
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r0 != 0) goto L_0x0578
            di3.d r0 = di3.C86312j.m106911c(r4)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            i61.h r0 = (i61.C98602h) r0
            r0.mo137993A(r1)
            goto L_0x0578
        L_0x0424:
            java.lang.String r1 = "showCaptureEmojiInPanel"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0451
            if (r2 == 0) goto L_0x0578
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r0 = com.tencent.p014mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            java.lang.String r0 = "emojiInfo"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r0
            di3.d r1 = di3.C86312j.m106911c(r4)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            r1.mo138029o(r0)
            goto L_0x0578
        L_0x0451:
            java.lang.String r1 = "addCaptureEmojiUploadTask"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0473
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_md5"
            java.lang.String r0 = r2.getString(r0)
            di3.d r1 = di3.C86312j.m106911c(r4)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            r1.mo138023j(r0)
            goto L_0x0578
        L_0x0473:
            java.lang.String r1 = "getCaptureEmoji"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x048f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            dl.o r1 = p490dl.C97489o.m125592g()
            java.util.ArrayList r1 = r1.mo136761b(r9)
            java.lang.String r2 = "key_data"
            r0.putParcelableArrayList(r2, r1)
            return r0
        L_0x048f:
            java.lang.String r1 = "getSmileyPanelInfoList"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0527
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            di3.d r0 = di3.C86312j.m106911c(r4)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            i61.h r0 = (i61.C98602h) r0
            r0.getClass()
            di3.d r0 = di3.C86312j.m106911c(r3)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r3 = r0.f82769a
            monitor-enter(r3)
            wh3.y r0 = r0.f82781m     // Catch:{ all -> 0x0524 }
            monitor-exit(r3)     // Catch:{ all -> 0x0524 }
            r0.getClass()
            java.lang.String r2 = "MicroMsg.emoji.SmileyPanelConfigInfoStorage"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r0.f100805d     // Catch:{ Exception -> 0x04f9 }
            java.lang.String r11 = "SmileyPanelConfigInfo"
            java.lang.String[] r12 = wh3.C38150y.f100804f     // Catch:{ Exception -> 0x04f9 }
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 2
            android.database.Cursor r6 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x04f9 }
            if (r6 == 0) goto L_0x04f4
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x04f9 }
            if (r0 == 0) goto L_0x04f4
        L_0x04e3:
            com.tencent.mm.storage.emotion.SmileyPanelConfigInfo r0 = new com.tencent.mm.storage.emotion.SmileyPanelConfigInfo     // Catch:{ Exception -> 0x04f9 }
            r0.<init>()     // Catch:{ Exception -> 0x04f9 }
            r0.convertFrom(r6)     // Catch:{ Exception -> 0x04f9 }
            r3.add(r0)     // Catch:{ Exception -> 0x04f9 }
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x04f9 }
            if (r0 != 0) goto L_0x04e3
        L_0x04f4:
            if (r6 == 0) goto L_0x0506
            goto L_0x0503
        L_0x04f7:
            r0 = move-exception
            goto L_0x051e
        L_0x04f9:
            r0 = move-exception
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x04f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x04f7 }
            if (r6 == 0) goto L_0x0506
        L_0x0503:
            r6.close()
        L_0x0506:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r9] = r4
            java.lang.String r4 = "getSmileyPanelConfigInfoList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            java.lang.String r0 = "smiley_panel_info"
            r1.putParcelableArrayList(r0, r3)
            return r1
        L_0x051e:
            if (r6 == 0) goto L_0x0523
            r6.close()
        L_0x0523:
            throw r0
        L_0x0524:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0524 }
            throw r0
        L_0x0527:
            java.lang.String r1 = "getPanelConfigName"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x054b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_data"
            di3.d r2 = di3.C86312j.m106911c(r4)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            i61.h r2 = (i61.C98602h) r2
            java.lang.String r2 = r2.mo138037v()
            r0.putString(r1, r2)
            return r0
        L_0x054b:
            java.lang.String r1 = "getIpSetInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0578
            if (r2 == 0) goto L_0x0578
            java.lang.String r0 = "key_ip_key"
            java.lang.String r0 = r2.getString(r0)
            di3.d r1 = di3.C86312j.m106911c(r4)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            com.tencent.mm.storage.emotion.EmojiIPSetInfo r0 = r1.mo138031p(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "key_data"
            r1.putParcelable(r2, r0)
            return r1
        L_0x0578:
            return r6
        L_0x0579:
            java.lang.String r1 = "MicroMsg.EmotionContentProvider"
            java.lang.String r2 = "[call] method:%s, but kernel or account not init."
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.provider.EmotionContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MicroMsg.EmotionContentProvider", "[delete] kernel or account not init.");
            return 0;
        } else if (f268268d.match(uri) != 3) {
            return 0;
        } else {
            return C86709a0.m107535s().f251811i.delete("GetEmotionListCache", str, strArr);
        }
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MicroMsg.EmotionContentProvider", "[insert] kernel or account not init.");
            return uri;
        } else if (f268268d.match(uri) != 3) {
            return uri;
        } else {
            long q = C86709a0.m107535s().f251811i.mo125627q("GetEmotionListCache", C38145t.f100793p.primaryKey, contentValues, false);
            return Uri.withAppendedPath(uri, q + "");
        }
    }

    public boolean onCreate() {
        Log.m105924i("MicroMsg.EmotionContentProvider", "[onCreate]");
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MicroMsg.EmotionContentProvider", "[query] kernel or account not init.");
            return null;
        }
        Log.m105925i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", uri.getPath(), str);
        int match = f268268d.match(uri);
        if (match == 1) {
            return C86709a0.m107535s().f251811i.rawQuery(str, strArr2, 2);
        }
        if (match == 3) {
            return C86709a0.m107535s().f251811i.rawQuery(str, strArr2, 2);
        }
        if (match == 4) {
            return C86709a0.m107535s().f251811i.rawQuery(str, strArr2, 2);
        }
        if (match != 5) {
            return null;
        }
        return C86709a0.m107535s().f251811i.rawQuery(str, strArr2, 2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MicroMsg.EmotionContentProvider", "[update] kernel or account not init.");
            return -1;
        }
        int match = f268268d.match(uri);
        if (match == 1) {
            return C86709a0.m107535s().f251811i.update("EmojiGroupInfo", contentValues, str, strArr);
        }
        if (match != 2) {
            return -1;
        }
        C86709a0.m107535s().mo121142i().mo119676J(((Integer) contentValues.get("type")).intValue(), contentValues.get("value"));
        return 0;
    }
}
