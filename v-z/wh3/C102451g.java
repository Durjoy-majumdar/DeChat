package wh3;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p490dl.C97491p;
import te3.C101800k70;
import u61.C101964h;
import v51.C102151n;
import v51.C52762d;

/* renamed from: wh3.g */
public class C102451g extends MAutoStorage<EmojiInfo> {

    /* renamed from: e */
    public static final String[] f301703e = {MAutoStorage.getCreateSQLs(EmojiInfo.f284123W1, "EmojiInfo"), "CREATE INDEX IF NOT EXISTS emojiinfogrouptempindex  on EmojiInfo  (  groupId,temp )", "CREATE INDEX IF NOT EXISTS emojiinfogatalogindex  on EmojiInfo  (  catalog )"};

    /* renamed from: d */
    public ISQLiteDatabase f301704d;

    public C102451g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, EmojiInfo.f284123W1, "EmojiInfo", (String[]) null);
        this.f301704d = iSQLiteDatabase;
    }

    /* renamed from: CP */
    public List<EmojiInfo> mo142034CP(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        sb.append("EmojiInfo");
        sb.append(" where ");
        sb.append("catalog");
        sb.append(" = ");
        sb.append(i);
        if (!z) {
            sb.append(" and ");
            sb.append("state");
            sb.append(" != ");
            sb.append(4);
        }
        sb.append(" order by ");
        sb.append("reserved3");
        sb.append(" asc ");
        Cursor rawQuery = this.f301704d.rawQuery(sb.toString(), (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    EmojiInfo emojiInfo = new EmojiInfo();
                    emojiInfo.convertFrom(rawQuery);
                    arrayList.add(emojiInfo);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: CZ */
    public boolean insert(EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.mo135618p2()) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s", emojiInfo.field_md5);
        long replace = this.f301704d.replace("EmojiInfo", "md5", emojiInfo.convertTo());
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s, %s", emojiInfo.field_md5, Long.valueOf(replace));
        return replace >= 0;
    }

    /* renamed from: DN */
    public List<EmojiInfo> mo142036DN(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<EmojiInfo> CP = mo142034CP(18, false);
        if (((ArrayList) CP).size() > 0) {
            C97491p pVar = C97491p.f286143a;
            pVar.mo136773a(false);
            pVar.mo136774c().putBoolean("game_to_custom", false);
        }
        arrayList.addAll(mo142034CP(81, z));
        arrayList.addAll(CP);
        return arrayList;
    }

    /* renamed from: LL */
    public boolean mo142037LL(List<String> list, int i) {
        return i == 1 ? mo142051bF(list) : mo142060mI(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r3 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        return r2;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142038Lo(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "capture"
            if (r8 != 0) goto L_0x000e
            java.lang.String[] r8 = new java.lang.String[]{r1}
            java.lang.String r1 = "select count(*) from EmojiInfo where groupId=?"
            goto L_0x0015
        L_0x000e:
            java.lang.String[] r8 = new java.lang.String[]{r1}
            java.lang.String r1 = "select count(*) from EmojiInfo where groupId=? AND captureStatus=0"
        L_0x0015:
            r2 = 0
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r7.f301704d     // Catch:{ Exception -> 0x0032 }
            r5 = 2
            android.database.Cursor r3 = r4.rawQuery(r1, r8, r5)     // Catch:{ Exception -> 0x0032 }
            if (r3 == 0) goto L_0x002a
            boolean r8 = r3.moveToFirst()     // Catch:{ Exception -> 0x0032 }
            if (r8 == 0) goto L_0x002a
            int r2 = r3.getInt(r2)     // Catch:{ Exception -> 0x0032 }
        L_0x002a:
            if (r3 == 0) goto L_0x0051
        L_0x002c:
            r3.close()
            goto L_0x0051
        L_0x0030:
            r8 = move-exception
            goto L_0x0052
        L_0x0032:
            r8 = move-exception
            java.lang.String r1 = "exception:%s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0030 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r8)     // Catch:{ all -> 0x0030 }
            r5[r2] = r6     // Catch:{ all -> 0x0030 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r5)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "[countCustomEmoji]Exception:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0030 }
            r4[r2] = r8     // Catch:{ all -> 0x0030 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r4)     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0051
            goto L_0x002c
        L_0x0051:
            return r2
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            r3.close()
        L_0x0057:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142038Lo(boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r4 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r4 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        r4.close();
     */
    /* renamed from: NQ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.storage.emotion.EmojiInfo> mo142039NQ(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "select * from EmojiInfo where groupId=? and temp=? order by idx asc"
            r2 = 1
            r3 = 0
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r8.f301704d     // Catch:{ Exception -> 0x0042 }
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0042 }
            r7[r3] = r9     // Catch:{ Exception -> 0x0042 }
            java.lang.String r9 = "0"
            r7[r2] = r9     // Catch:{ Exception -> 0x0042 }
            android.database.Cursor r4 = r5.rawQuery(r1, r7, r6)     // Catch:{ Exception -> 0x0042 }
            if (r4 == 0) goto L_0x003a
            boolean r9 = r4.moveToFirst()     // Catch:{ Exception -> 0x0042 }
            if (r9 == 0) goto L_0x003a
        L_0x0022:
            com.tencent.mm.storage.emotion.EmojiInfo r9 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x0042 }
            v51.C102151n.m134592b()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = v51.C102151n.m134591a()     // Catch:{ Exception -> 0x0042 }
            r9.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0042 }
            r9.convertFrom(r4)     // Catch:{ Exception -> 0x0042 }
            r0.add(r9)     // Catch:{ Exception -> 0x0042 }
            boolean r9 = r4.moveToNext()     // Catch:{ Exception -> 0x0042 }
            if (r9 != 0) goto L_0x0022
        L_0x003a:
            if (r4 == 0) goto L_0x0055
        L_0x003c:
            r4.close()
            goto L_0x0055
        L_0x0040:
            r9 = move-exception
            goto L_0x0056
        L_0x0042:
            r9 = move-exception
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "[getEmojiListByGroupId] Exception:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0040 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0040 }
            r2[r3] = r9     // Catch:{ all -> 0x0040 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r5, r2)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0055
            goto L_0x003c
        L_0x0055:
            return r0
        L_0x0056:
            if (r4 == 0) goto L_0x005b
            r4.close()
        L_0x005b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142039NQ(java.lang.String):java.util.List");
    }

    /* renamed from: Ow */
    public EmojiInfo mo142040Ow(EmojiInfo emojiInfo) {
        if (emojiInfo == null || Util.isNullOrNil(emojiInfo.getMd5()) || emojiInfo.getMd5().length() <= 0) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            return null;
        }
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "create: %s", emojiInfo.field_md5);
        if (!insert(emojiInfo)) {
            return null;
        }
        doNotify("create_emoji_info_notify");
        return emojiInfo;
    }

    public boolean P50(List<C101800k70> list) {
        if (list == null || list.isEmpty()) {
            Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL failed. empty list");
            return false;
        }
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL size:%d", Integer.valueOf(list.size()));
        for (int i = 0; i < list.size(); i++) {
            C101800k70 k702 = list.get(i);
            EmojiInfo TO = mo142044TO(k702.f298586d);
            if (TO == null) {
                TO = new EmojiInfo();
                TO.field_md5 = k702.f298586d;
                TO.field_catalog = 65;
                Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "new emoji as received when updateEmoji url");
            }
            C101964h.m134219a(k702, TO);
            X90(TO);
        }
        return true;
    }

    /* renamed from: SE */
    public boolean mo142042SE(int i) {
        ISQLiteDatabase iSQLiteDatabase = this.f301704d;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i);
        return iSQLiteDatabase.delete("EmojiInfo", "catalog=?", new String[]{sb.toString()}) >= 0;
    }

    /* renamed from: TE */
    public boolean mo142043TE(String str) {
        if (str == null || str.length() != 32) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "delete by md5 assertion");
            return false;
        }
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "deleteByMd5: %s", str);
        ISQLiteDatabase iSQLiteDatabase = this.f301704d;
        int delete = iSQLiteDatabase.delete("EmojiInfo", "md5=?", new String[]{"" + str});
        if (delete > 0) {
            doNotify("event_update_emoji");
        }
        return delete > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.tencent.mm.storage.emotion.EmojiInfo} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* renamed from: TO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.emotion.EmojiInfo mo142044TO(java.lang.String r16) {
        /*
            r15 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x006f
            int r0 = r16.length()
            r5 = 32
            if (r0 == r5) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            r5 = r15
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r5.f301704d     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = "EmojiInfo"
            r8 = 0
            java.lang.String r9 = "md5=?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0053 }
            r10[r3] = r16     // Catch:{ Exception -> 0x0053 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 2
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0053 }
            if (r6 == 0) goto L_0x004b
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 == 0) goto L_0x004b
            com.tencent.mm.storage.emotion.EmojiInfo r7 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            v51.C102151n.m134592b()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            java.lang.String r0 = v51.C102151n.m134591a()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r7.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r7.convertFrom(r6)     // Catch:{ Exception -> 0x0042, all -> 0x0044 }
            r2 = r7
            goto L_0x004b
        L_0x0042:
            r0 = move-exception
            goto L_0x0049
        L_0x0044:
            r0 = move-exception
            r2 = r6
            goto L_0x0069
        L_0x0047:
            r0 = move-exception
            r7 = r2
        L_0x0049:
            r2 = r6
            goto L_0x0055
        L_0x004b:
            if (r6 == 0) goto L_0x0068
            r6.close()
            goto L_0x0068
        L_0x0051:
            r0 = move-exception
            goto L_0x0069
        L_0x0053:
            r0 = move-exception
            r7 = r2
        L_0x0055:
            java.lang.String r6 = "[getByMd5]Exception:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0051 }
            r4[r3] = r0     // Catch:{ all -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r4)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            r2 = r7
        L_0x0068:
            return r2
        L_0x0069:
            if (r2 == 0) goto L_0x006e
            r2.close()
        L_0x006e:
            throw r0
        L_0x006f:
            r5 = r15
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r16
            java.lang.String r3 = "md5 is null or invalue. md5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142044TO(java.lang.String):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    /* renamed from: TY */
    public boolean mo142045TY(Context context) {
        Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init");
        EmojiInfo TO = mo142044TO("86cb157e9c44b2c9934e4e430790776d");
        EmojiInfo TO2 = mo142044TO("68f9864ca5c0a5d823ed7184e113a4aa");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        int jo = mo142058jo(32);
        Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,group art custom catalog count:%d", Integer.valueOf(jo));
        if (TO != null || ((TO2 != null && TO2.getContent().length() == 0) || jo <= 2)) {
            Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for very old version");
            mo142042SE(17);
            mo142042SE(50);
            mo142042SE(49);
        }
        EmojiInfo TO3 = mo142044TO("9bd1281af3a31710a45b84d736363691");
        if (TO3 != null && TO3.field_catalog == 17) {
            Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for 5.0");
            mo142042SE(17);
            mo142042SE(50);
            mo142042SE(49);
        }
        InputStream a = C52762d.m59141a(context, "icon_002_cover.png");
        if (a != null) {
            Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for 5.1,update emoji tuzi  for 4.4");
            mo142042SE(17);
            mo142042SE(50);
            mo142042SE(49);
        }
        if (a != null) {
            try {
                a.close();
            } catch (Exception unused) {
            }
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = EmojiInfo.f284123W1;
        if (mo142058jo(17) != 0) {
            return true;
        }
        InputStream inputStream = null;
        try {
            Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,parse xml start.");
            long currentTimeMillis = System.currentTimeMillis();
            InputStream open = context.getAssets().open("custom_emoji/manifest.xml");
            List<EmojiInfo> h302 = h30(new InputStream[]{open});
            Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]parse xml time: %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            if (((ArrayList) h302).size() > 0) {
                v10(h302);
            }
            Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "insert time: %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            Log.m105918d("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,parse xml end.");
            if (open != null) {
                try {
                    open.close();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e));
                }
            }
        } catch (IOException e2) {
            Log.m105920e("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init, db error. " + e2.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e3));
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e4));
                }
            }
            throw th;
        }
        return true;
    }

    public void Wa0(Context context, EmojiInfo emojiInfo) {
        int i;
        int i2 = emojiInfo.field_catalog;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        if (i2 == 17 || i2 == 50 || i2 == 49) {
            InputStream inputStream = null;
            try {
                InputStream a = C52762d.m59141a(context, emojiInfo.getName());
                i = a != null ? a.available() : 0;
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e));
                    }
                }
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e2));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e3));
                    }
                }
                i = 0;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e4));
                    }
                }
                throw th;
            }
        } else {
            i = (int) C86013q1.m106451l(emojiInfo.mo62640K1());
        }
        if (i != 0 && i != emojiInfo.field_size) {
            emojiInfo.field_size = i;
            r50(emojiInfo);
        }
    }

    public boolean X90(EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.mo135618p2()) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        return this.f301704d.update("EmojiInfo", emojiInfo.convertTo(), "md5=?", new String[]{emojiInfo.getMd5()}) > 0;
    }

    /* renamed from: Yt */
    public int mo142048Yt(String str) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {str, "0"};
        Cursor cursor = null;
        try {
            Cursor rawQuery = this.f301704d.rawQuery("select count(*) from EmojiInfo where groupId= ? and temp=?", strArr, 2);
            i = (rawQuery == null || !rawQuery.moveToFirst()) ? 0 : rawQuery.getInt(0);
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", Util.stackTraceToString(e));
            Log.m105920e("MicroMsg.emoji.EmojiInfoStorage", "[countProductId]Count ProductId fail." + e.getMessage());
            if (cursor != null) {
                cursor.close();
            }
            i = 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        Log.m105919d("MicroMsg.emoji.EmojiInfoStorage", "count product id use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return i;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b00(java.util.List<com.tencent.p014mm.storage.emotion.EmojiInfo> r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            r1 = 0
            if (r13 == 0) goto L_0x00c9
            int r2 = r13.size()
            if (r2 > 0) goto L_0x000d
            goto L_0x00c9
        L_0x000d:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r14
            int r3 = r13.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "insertEmojiList groupId:%s size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            r2 = 0
            r5 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r12.f301704d
            boolean r7 = r3 instanceof zh3.C91753f
            if (r7 == 0) goto L_0x003a
            r2 = r3
            zh3.f r2 = (zh3.C91753f) r2
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r5 = r3.getId()
            long r5 = r2.beginTransaction(r5)
        L_0x003a:
            java.util.List r14 = r12.mo142039NQ(r14)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0049:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x005d
            java.lang.Object r7 = r14.next()
            com.tencent.mm.storage.emotion.EmojiInfo r7 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r7
            java.lang.String r8 = r7.getMd5()
            r3.put(r8, r7)
            goto L_0x0049
        L_0x005d:
            r14 = 0
        L_0x005e:
            int r7 = r13.size()
            java.lang.String r8 = "EmojiInfo"
            if (r14 >= r7) goto L_0x0084
            java.lang.Object r7 = r13.get(r14)
            com.tencent.mm.storage.emotion.EmojiInfo r7 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r7
            r7.field_temp = r1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r12.f301704d
            android.content.ContentValues r10 = r7.convertTo()
            java.lang.String r11 = "md5"
            r9.replace(r8, r11, r10)
            java.lang.String r7 = r7.getMd5()
            r3.remove(r7)
            int r14 = r14 + 1
            goto L_0x005e
        L_0x0084:
            java.util.Set r13 = r3.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x008c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00c3
            java.lang.Object r14 = r13.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r3 = r14.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r14 = r14.getValue()
            com.tencent.mm.storage.emotion.EmojiInfo r14 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r14
            r14.field_temp = r4
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r12.f301704d
            android.content.ContentValues r9 = r14.convertTo()
            java.lang.String[] r10 = new java.lang.String[r4]
            r10[r1] = r3
            java.lang.String r3 = "md5=?"
            r7.update(r8, r9, r3, r10)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r14 = r14.field_groupId
            r3[r1] = r14
            java.lang.String r14 = "jacks modify excess emoji to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r14, r3)
            goto L_0x008c
        L_0x00c3:
            if (r2 == 0) goto L_0x00c8
            r2.endTransaction(r5)
        L_0x00c8:
            return r4
        L_0x00c9:
            java.lang.String r13 = "insert emoji list faild. list is null or size is 0."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.b00(java.util.List, java.lang.String):boolean");
    }

    /* renamed from: bD */
    public EmojiInfo mo142050bD(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5) {
        return mo142059kD(str, str2, i, i2, i3, (String) null, str3, str4, str5, 1);
    }

    /* renamed from: bF */
    public boolean mo142051bF(List<String> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE");
        sb.append(" EmojiInfo ");
        sb.append(" SET ");
        sb.append("groupId");
        sb.append("=");
        sb.append("\"\"");
        sb.append(" where ");
        sb.append("md5");
        sb.append(" IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append("'" + list.get(i) + "'");
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        Log.m105918d("MicroMsg.emoji.EmojiInfoStorage", sb.toString());
        if (this.f301704d.execSQL("EmojiInfo", sb.toString())) {
            doNotify("delete_emoji_info_notify");
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.tencent.mm.storage.emotion.EmojiInfo} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* renamed from: bO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.emotion.EmojiInfo mo142052bO(long r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r12.f301704d     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r3 = "EmojiInfo"
            r4 = 0
            java.lang.String r5 = "captureEnterTime=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r6[r1] = r13     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            if (r13 == 0) goto L_0x0041
            boolean r14 = r13.moveToFirst()     // Catch:{ Exception -> 0x003c }
            if (r14 == 0) goto L_0x0041
            com.tencent.mm.storage.emotion.EmojiInfo r14 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x003c }
            v51.C102151n.m134592b()     // Catch:{ Exception -> 0x003c }
            java.lang.String r2 = v51.C102151n.m134591a()     // Catch:{ Exception -> 0x003c }
            r14.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x003c }
            r14.convertFrom(r13)     // Catch:{ Exception -> 0x003a }
            r0 = r14
            goto L_0x0041
        L_0x003a:
            r0 = move-exception
            goto L_0x004d
        L_0x003c:
            r14 = move-exception
            r11 = r0
            r0 = r14
            r14 = r11
            goto L_0x004d
        L_0x0041:
            if (r13 == 0) goto L_0x005c
            r13.close()
            goto L_0x005c
        L_0x0047:
            r14 = move-exception
            goto L_0x005f
        L_0x0049:
            r13 = move-exception
            r14 = r0
            r0 = r13
            r13 = r14
        L_0x004d:
            java.lang.String r2 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x005d }
            if (r13 == 0) goto L_0x005b
            r13.close()
        L_0x005b:
            r0 = r14
        L_0x005c:
            return r0
        L_0x005d:
            r14 = move-exception
            r0 = r13
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.close()
        L_0x0064:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142052bO(long):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c40(int r22, java.util.List<java.lang.String> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.tencent.mm.api.IEmojiInfo$a r2 = com.tencent.p014mm.api.IEmojiInfo.C40005a.STATUS_SUCCESS
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r4 = "[cpan] begin topCustomEmojiByMd5"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r4 = java.lang.System.currentTimeMillis()
            if (r23 == 0) goto L_0x0142
            int r7 = r23.size()
            if (r7 > 0) goto L_0x001b
            goto L_0x0142
        L_0x001b:
            java.util.List r7 = r21.mo142067vP(r22)
            r8 = 0
            r9 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r0.f301704d
            boolean r12 = r11 instanceof zh3.C91753f
            if (r12 == 0) goto L_0x0037
            r8 = r11
            zh3.f r8 = (zh3.C91753f) r8
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            long r9 = r9.getId()
            long r9 = r8.beginTransaction(r9)
        L_0x0037:
            java.util.Iterator r11 = r23.iterator()
            r13 = 1
        L_0x003c:
            boolean r14 = r11.hasNext()
            java.lang.String r15 = "[cpan] end topCustomEmojiByMd5 user time:%d faild "
            r16 = 0
            java.lang.String r6 = "md5"
            java.lang.String r12 = "EmojiInfo"
            if (r14 == 0) goto L_0x00b5
            java.lang.Object r14 = r11.next()
            java.lang.String r14 = (java.lang.String) r14
            r18 = r11
            com.tencent.mm.storage.emotion.EmojiInfo r11 = r0.mo142044TO(r14)
            if (r11 == 0) goto L_0x00b0
            java.lang.String r19 = r11.getMd5()
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r19 != 0) goto L_0x00b0
            r19 = r3
            r3 = 1
            if (r1 != r3) goto L_0x0075
            com.tencent.mm.api.IEmojiInfo$a r3 = r11.mo62647T1()
            if (r3 != r2) goto L_0x0071
            r11.field_idx = r13
            goto L_0x0077
        L_0x0071:
            r3 = 0
            r11.field_idx = r3
            goto L_0x0077
        L_0x0075:
            r11.field_reserved3 = r13
        L_0x0077:
            r3 = r7
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r20 = r3.isEmpty()
            if (r20 != 0) goto L_0x0083
            r3.remove(r14)
        L_0x0083:
            int r13 = r13 + 1
            android.content.ContentValues r3 = r11.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r0.f301704d
            long r11 = r11.replace(r12, r6, r3)
            int r3 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ad
            if (r8 == 0) goto L_0x0098
            r8.endTransaction(r9)
        L_0x0098:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r11 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r15, r1)
            return r3
        L_0x00ad:
            r11 = r19
            goto L_0x00b1
        L_0x00b0:
            r11 = r3
        L_0x00b1:
            r3 = r11
            r11 = r18
            goto L_0x003c
        L_0x00b5:
            r11 = r3
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x0118
            java.util.Iterator r3 = r7.iterator()
        L_0x00c2:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0118
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r0.mo142044TO(r7)
            if (r7 == 0) goto L_0x00c2
            java.lang.String r14 = r7.getMd5()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x00c2
            r14 = 1
            if (r1 != r14) goto L_0x00ee
            com.tencent.mm.api.IEmojiInfo$a r14 = r7.mo62647T1()
            if (r14 != r2) goto L_0x00ea
            r7.field_idx = r13
            goto L_0x00f0
        L_0x00ea:
            r14 = 0
            r7.field_idx = r14
            goto L_0x00f0
        L_0x00ee:
            r7.field_reserved3 = r13
        L_0x00f0:
            int r13 = r13 + 1
            android.content.ContentValues r7 = r7.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r0.f301704d
            long r18 = r14.replace(r12, r6, r7)
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c2
            if (r8 == 0) goto L_0x0105
            r8.endTransaction(r9)
        L_0x0105:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r15, r1)
            return r3
        L_0x0118:
            if (r8 == 0) goto L_0x011d
            r8.endTransaction(r9)
        L_0x011d:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r23.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "[cpan] end topCustomEmojiByMd5 user time:%d succes. size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            java.lang.String r1 = "event_update_emoji"
            r0.doNotify(r1)
            return r3
        L_0x0142:
            r11 = r3
            java.lang.String r1 = "[cpan] topCustomEmojiByMd5 failed. list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.c40(int, java.util.List):boolean");
    }

    /* renamed from: fY */
    public Cursor mo142054fY(int i) {
        ISQLiteDatabase iSQLiteDatabase = this.f301704d;
        return iSQLiteDatabase.query("EmojiInfo", (String[]) null, "catalog=? and temp=?", new String[]{"" + i, "0"}, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v18, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v19, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b7, code lost:
        if (r6 == 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        if (r6 == 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cc, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if (r4.size() > 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. sync list is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00da, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
        r5 = new java.util.ArrayList();
        r4 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e8, code lost:
        if (r4.hasNext() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
        r6 = (java.lang.String) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if (r13.contains(r6.toLowerCase()) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r5.add(r6);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] delete:%s", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0107, code lost:
        mo142037LL(r5, r12);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r1), java.lang.Integer.valueOf(r5.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0126, code lost:
        return true;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142055g(int r12, java.util.List<java.lang.String> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "[cpan] begin preparedDeleteCustomEmojiList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            if (r13 == 0) goto L_0x012d
            int r4 = r13.size()
            if (r4 > 0) goto L_0x0016
            goto L_0x012d
        L_0x0016:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " select "
            r5.append(r6)
            java.lang.String r6 = "md5"
            r5.append(r6)
            java.lang.String r6 = " from "
            r5.append(r6)
            java.lang.String r6 = "EmojiInfo"
            r5.append(r6)
            java.lang.String r6 = " and "
            java.lang.String r7 = " = "
            java.lang.String r8 = " where "
            r9 = 1
            if (r12 != r9) goto L_0x0064
            r5.append(r8)
            java.lang.String r8 = "groupId"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r7 = "\""
            r5.append(r7)
            java.lang.String r8 = "capture"
            r5.append(r8)
            r5.append(r7)
            r5.append(r6)
            java.lang.String r7 = "captureStatus"
            r5.append(r7)
            java.lang.String r7 = " = 0"
            r5.append(r7)
            goto L_0x0076
        L_0x0064:
            r5.append(r8)
            java.lang.String r8 = "catalog"
            r5.append(r8)
            r5.append(r7)
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r7 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1
            r7 = 81
            r5.append(r7)
        L_0x0076:
            r5.append(r6)
            java.lang.String r6 = "state"
            r5.append(r6)
            java.lang.String r6 = " in ("
            r5.append(r6)
            r6 = 3
            r5.append(r6)
            java.lang.String r6 = " , "
            r5.append(r6)
            r6 = 4
            r5.append(r6)
            java.lang.String r6 = " ) "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r7 = 2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r11.f301704d     // Catch:{ Exception -> 0x00bc }
            android.database.Cursor r6 = r8.rawQuery(r5, r6, r7)     // Catch:{ Exception -> 0x00bc }
            if (r6 == 0) goto L_0x00b7
            boolean r5 = r6.moveToFirst()     // Catch:{ Exception -> 0x00bc }
            if (r5 == 0) goto L_0x00b7
        L_0x00aa:
            java.lang.String r5 = r6.getString(r3)     // Catch:{ Exception -> 0x00bc }
            r4.add(r5)     // Catch:{ Exception -> 0x00bc }
            boolean r5 = r6.moveToNext()     // Catch:{ Exception -> 0x00bc }
            if (r5 != 0) goto L_0x00aa
        L_0x00b7:
            if (r6 == 0) goto L_0x00cf
            goto L_0x00cc
        L_0x00ba:
            r12 = move-exception
            goto L_0x0127
        L_0x00bc:
            r5 = move-exception
            java.lang.String r8 = "get download custom emoji MD5 list failed :%s"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x00ba }
            r10[r3] = r5     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r10)     // Catch:{ all -> 0x00ba }
            if (r6 == 0) goto L_0x00cf
        L_0x00cc:
            r6.close()
        L_0x00cf:
            int r5 = r4.size()
            if (r5 > 0) goto L_0x00db
            java.lang.String r12 = "[cpan] preparedDeleteCustomEmojiList failed. sync list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            return r3
        L_0x00db:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00e4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r6.toLowerCase()
            boolean r8 = r13.contains(r8)
            if (r8 != 0) goto L_0x00e4
            r5.add(r6)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            r8[r3] = r6
            java.lang.String r6 = "[cpan] delete:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r8)
            goto L_0x00e4
        L_0x0107:
            r11.mo142037LL(r5, r12)
            java.lang.Object[] r12 = new java.lang.Object[r7]
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r12[r3] = r13
            int r13 = r5.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r9] = r13
            java.lang.String r13 = "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r12)
            return r9
        L_0x0127:
            if (r6 == 0) goto L_0x012c
            r6.close()
        L_0x012c:
            throw r12
        L_0x012d:
            java.lang.String r12 = "[cpan] preparedDeleteCustomEmojiList failed. list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142055g(int, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r1 = p823sg.C77710q.m93738a(f40.C86709a0.m107523b().mo121110g());
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "uin is %s", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = p823sg.C90193h.m112878f(r1.getBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r1 = p823sg.C90193h.m112878f("com.tencent.mm.key.MicroMsg.Wechat".getBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "create key :%s" + com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1));
        r0 = new com.tencent.p014mm.storage.emotion.EmojiInfo();
        r0.field_md5 = r1;
        r0.field_catalog = 153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
        if (mo142035CZ(r0) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* renamed from: gY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo142056gY() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "SELECT md5 FROM EmojiInfo WHERE catalog =?"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 153(0x99, float:2.14E-43)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            r6 = 0
            r3[r6] = r5
            r5 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r9.f301704d     // Catch:{ Exception -> 0x004a, all -> 0x0048 }
            r8 = 2
            android.database.Cursor r1 = r7.rawQuery(r1, r3, r8)     // Catch:{ Exception -> 0x004a, all -> 0x0048 }
            if (r1 == 0) goto L_0x0042
            boolean r3 = r1.moveToFirst()     // Catch:{ Exception -> 0x0040 }
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = r1.getString(r6)     // Catch:{ Exception -> 0x0040 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0040 }
            r7.<init>()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r8 = "had key :%s"
            r7.append(r8)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)     // Catch:{ Exception -> 0x0040 }
            r7.append(r8)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0040 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ Exception -> 0x0040 }
            r1.close()
            return r3
        L_0x0040:
            r3 = move-exception
            goto L_0x004c
        L_0x0042:
            if (r1 == 0) goto L_0x005c
        L_0x0044:
            r1.close()
            goto L_0x005c
        L_0x0048:
            r0 = move-exception
            goto L_0x00b6
        L_0x004a:
            r3 = move-exception
            r1 = r5
        L_0x004c:
            java.lang.String r7 = "createKey :%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x00b4 }
            r8[r6] = r3     // Catch:{ all -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x005c
            goto L_0x0044
        L_0x005c:
            f40.e r1 = f40.C86709a0.m107523b()
            int r1 = r1.mo121110g()
            java.lang.String r1 = p823sg.C77710q.m93738a(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r1
            java.lang.String r3 = "uin is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0081
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            goto L_0x008b
        L_0x0081:
            java.lang.String r1 = "com.tencent.mm.key.MicroMsg.Wechat"
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
        L_0x008b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create key :%s"
            r2.append(r3)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = new com.tencent.mm.storage.emotion.EmojiInfo
            r0.<init>()
            r0.field_md5 = r1
            r0.field_catalog = r4
            boolean r0 = r9.insert(r0)
            if (r0 == 0) goto L_0x00b3
            return r1
        L_0x00b3:
            return r5
        L_0x00b4:
            r0 = move-exception
            r5 = r1
        L_0x00b6:
            if (r5 == 0) goto L_0x00bb
            r5.close()
        L_0x00bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142056gY():java.lang.String");
    }

    public String getTableName() {
        return "EmojiInfo";
    }

    public final List<EmojiInfo> h30(InputStream[] inputStreamArr) {
        InputStream[] inputStreamArr2 = inputStreamArr;
        ArrayList arrayList = new ArrayList();
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            for (InputStream inputStream : inputStreamArr2) {
                if (inputStream != null) {
                    NodeList elementsByTagName = newDocumentBuilder.parse(inputStream).getDocumentElement().getElementsByTagName("catalog");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Element element = (Element) elementsByTagName.item(i);
                        int intValue = Integer.decode(element.getAttribute("id")).intValue();
                        NodeList elementsByTagName2 = element.getElementsByTagName("emoji");
                        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                            C102151n.m134592b();
                            EmojiInfo emojiInfo = new EmojiInfo(C102151n.m134591a());
                            Element element2 = (Element) elementsByTagName2.item(i2);
                            emojiInfo.field_md5 = element2.getAttribute("md5");
                            if (emojiInfo.mo135618p2()) {
                                emojiInfo.field_catalog = intValue;
                                emojiInfo.field_groupId = intValue + "";
                                emojiInfo.field_name = element2.getAttribute("name");
                                emojiInfo.field_type = Integer.decode(element2.getAttribute("type")).intValue();
                                Node firstChild = element2.getFirstChild();
                                String data = firstChild instanceof CharacterData ? ((CharacterData) firstChild).getData() : "";
                                if (emojiInfo.field_type == 4) {
                                    data = new String(Base64.decode(data, 0));
                                }
                                emojiInfo.field_content = data;
                                arrayList.add(emojiInfo);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.emoji.EmojiInfoStorage", "parse xml error; " + e.getMessage());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r8 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r8 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r8.close();
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142058jo(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "select count(*) from EmojiInfo where groupId= ? and temp=?"
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "0"
            r5 = 1
            r3[r5] = r8
            r8 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r7.f301704d     // Catch:{ Exception -> 0x003c }
            android.database.Cursor r8 = r6.rawQuery(r1, r3, r2)     // Catch:{ Exception -> 0x003c }
            if (r8 == 0) goto L_0x0034
            boolean r1 = r8.moveToFirst()     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x0034
            int r4 = r8.getInt(r4)     // Catch:{ Exception -> 0x003c }
        L_0x0034:
            if (r8 == 0) goto L_0x0065
        L_0x0036:
            r8.close()
            goto L_0x0065
        L_0x003a:
            r0 = move-exception
            goto L_0x0066
        L_0x003c:
            r1 = move-exception
            java.lang.String r2 = "exception:%s"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x003a }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x003a }
            r3[r4] = r5     // Catch:{ all -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r2.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "[countProductId]Count ProductId fail."
            r2.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x003a }
            r2.append(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0065
            goto L_0x0036
        L_0x0065:
            return r4
        L_0x0066:
            if (r8 == 0) goto L_0x006b
            r8.close()
        L_0x006b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142058jo(int):int");
    }

    /* renamed from: kD */
    public EmojiInfo mo142059kD(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, int i4) {
        EmojiInfo emojiInfo;
        if (str == null || str.length() <= 0) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            return null;
        }
        if (str.length() <= 0) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            emojiInfo = null;
        } else {
            emojiInfo = mo142044TO(str);
            if (emojiInfo == null) {
                C102151n.m134592b();
                emojiInfo = new EmojiInfo(C102151n.m134591a());
                emojiInfo.field_catalog = i;
            }
            emojiInfo.field_md5 = str;
            emojiInfo.field_svrid = str2;
            emojiInfo.field_type = i2;
            emojiInfo.field_size = i3;
            emojiInfo.field_state = 0;
            emojiInfo.field_reserved1 = str3;
            emojiInfo.field_reserved2 = str4;
            emojiInfo.field_app_id = str5;
            emojiInfo.field_temp = i4;
            emojiInfo.field_reserved4 = 0;
            if (!TextUtils.isEmpty(str6)) {
                emojiInfo.field_groupId = str6;
            }
        }
        emojiInfo.field_state = 3;
        if (!insert(emojiInfo)) {
            return null;
        }
        doNotify("create_emoji_info_notify");
        return emojiInfo;
    }

    /* renamed from: mI */
    public boolean mo142060mI(List<String> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE");
        sb.append(" EmojiInfo ");
        sb.append(" SET ");
        sb.append("catalog");
        sb.append("=");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        sb.append(65);
        sb.append(",");
        sb.append(FirebaseAnalytics.C113379b.SOURCE);
        sb.append("=");
        sb.append(0);
        sb.append(",");
        sb.append("needupload");
        sb.append("=");
        sb.append(0);
        sb.append(" where ");
        sb.append("md5");
        sb.append(" IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append("'" + list.get(i) + "'");
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        Log.m105918d("MicroMsg.emoji.EmojiInfoStorage", sb.toString());
        if (this.f301704d.execSQL("EmojiInfo", sb.toString())) {
            doNotify("delete_emoji_info_notify");
        }
        return true;
    }

    /* renamed from: mL */
    public boolean mo142061mL(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("groupId = '");
            sb.append(str);
            sb.append("'");
            try {
                return this.f301704d.delete("EmojiInfo", sb.toString(), (String[]) null) >= 0;
            } catch (Exception e) {
                Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "Delete By ProductId fail." + e.getMessage());
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r3 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r3.close();
     */
    /* renamed from: nP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142062nP() {
        /*
            r7 = this;
            java.lang.String r0 = "select reserved3 from EmojiInfo where catalog=? order by reserved3 desc limit 1"
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 81
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r7.f301704d     // Catch:{ Exception -> 0x002b }
            r6 = 2
            android.database.Cursor r3 = r5.rawQuery(r0, r2, r6)     // Catch:{ Exception -> 0x002b }
            if (r3 == 0) goto L_0x0023
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x002b }
            if (r0 == 0) goto L_0x0023
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x002b }
        L_0x0023:
            if (r3 == 0) goto L_0x003e
        L_0x0025:
            r3.close()
            goto L_0x003e
        L_0x0029:
            r0 = move-exception
            goto L_0x003f
        L_0x002b:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "getCustomEmojiMaxIndex :%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0029 }
            r1[r4] = r0     // Catch:{ all -> 0x0029 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r1)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x003e
            goto L_0x0025
        L_0x003e:
            return r4
        L_0x003f:
            if (r3 == 0) goto L_0x0044
            r3.close()
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142062nP():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r4 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r4 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return r3;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo142063qq(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            r1 = 2
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x0031
            r7 = 81
            r4 = 18
            if (r8 != 0) goto L_0x001f
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8[r3] = r4
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8[r2] = r7
            java.lang.String r7 = "select count(*) from EmojiInfo where catalog IN (?,?)"
            goto L_0x0044
        L_0x001f:
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8[r3] = r4
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8[r2] = r7
            java.lang.String r7 = "select count(*) from EmojiInfo where catalog IN (?,?) AND captureStatus=0"
            goto L_0x0044
        L_0x0031:
            java.lang.String r7 = "81"
            if (r8 != 0) goto L_0x003d
            java.lang.String[] r8 = new java.lang.String[]{r7}
            java.lang.String r7 = "select count(*) from EmojiInfo where catalog=?"
            goto L_0x0044
        L_0x003d:
            java.lang.String[] r8 = new java.lang.String[]{r7}
            java.lang.String r7 = "select count(*) from EmojiInfo where catalog=? AND captureStatus=0"
        L_0x0044:
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r6.f301704d     // Catch:{ Exception -> 0x005f }
            android.database.Cursor r4 = r5.rawQuery(r7, r8, r1)     // Catch:{ Exception -> 0x005f }
            if (r4 == 0) goto L_0x0057
            boolean r7 = r4.moveToFirst()     // Catch:{ Exception -> 0x005f }
            if (r7 == 0) goto L_0x0057
            int r3 = r4.getInt(r3)     // Catch:{ Exception -> 0x005f }
        L_0x0057:
            if (r4 == 0) goto L_0x007d
        L_0x0059:
            r4.close()
            goto L_0x007d
        L_0x005d:
            r7 = move-exception
            goto L_0x007e
        L_0x005f:
            r7 = move-exception
            java.lang.String r8 = "exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x005d }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r7)     // Catch:{ all -> 0x005d }
            r1[r3] = r5     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r1)     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "[countCustomEmoji]Exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x005d }
            r1[r3] = r7     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r1)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x007d
            goto L_0x0059
        L_0x007d:
            return r3
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r4.close()
        L_0x0083:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142063qq(boolean, boolean):int");
    }

    public boolean r50(EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.mo135618p2()) {
            Log.m105922f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        int update = this.f301704d.update("EmojiInfo", emojiInfo.convertTo(), "md5=?", new String[]{emojiInfo.getMd5()});
        if (update > 0) {
            doNotify(emojiInfo.getMd5());
            doNotify("event_update_emoji");
        }
        return update > 0;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        if (r2 == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        if (r2 == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: uP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo142065uP(int r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " select "
            r1.append(r2)
            java.lang.String r2 = "md5"
            r1.append(r2)
            java.lang.String r2 = " from "
            r1.append(r2)
            java.lang.String r2 = "EmojiInfo"
            r1.append(r2)
            java.lang.String r2 = " where "
            r3 = 1
            java.lang.String r4 = " = "
            if (r7 != r3) goto L_0x003f
            r1.append(r2)
            java.lang.String r7 = "groupId"
            r1.append(r7)
            r1.append(r4)
            java.lang.String r7 = "\""
            r1.append(r7)
            java.lang.String r2 = "capture"
            r1.append(r2)
            r1.append(r7)
            goto L_0x0051
        L_0x003f:
            r1.append(r2)
            java.lang.String r7 = "catalog"
            r1.append(r7)
            r1.append(r4)
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r7 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1
            r7 = 81
            r1.append(r7)
        L_0x0051:
            java.lang.String r7 = " and "
            r1.append(r7)
            java.lang.String r7 = "state"
            r1.append(r7)
            r1.append(r4)
            r7 = 4
            r1.append(r7)
            r7 = 0
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r6.f301704d     // Catch:{ Exception -> 0x008d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008d }
            r5 = 2
            android.database.Cursor r2 = r4.rawQuery(r1, r2, r5)     // Catch:{ Exception -> 0x008d }
            if (r2 == 0) goto L_0x0085
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x0085
        L_0x0078:
            java.lang.String r1 = r2.getString(r7)     // Catch:{ Exception -> 0x008d }
            r0.add(r1)     // Catch:{ Exception -> 0x008d }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x008d }
            if (r1 != 0) goto L_0x0078
        L_0x0085:
            if (r2 == 0) goto L_0x00a0
        L_0x0087:
            r2.close()
            goto L_0x00a0
        L_0x008b:
            r7 = move-exception
            goto L_0x00a1
        L_0x008d:
            r1 = move-exception
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "get need to sync emoji MD5 list failed :%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008b }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x008b }
            r3[r7] = r1     // Catch:{ all -> 0x008b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x00a0
            goto L_0x0087
        L_0x00a0:
            return r0
        L_0x00a1:
            if (r2 == 0) goto L_0x00a6
            r2.close()
        L_0x00a6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142065uP(int):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v10(java.util.List<com.tencent.p014mm.storage.emotion.EmojiInfo> r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0054
            int r1 = r10.size()
            if (r1 > 0) goto L_0x000a
            goto L_0x0054
        L_0x000a:
            r1 = 0
            r2 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r9.f301704d
            boolean r5 = r4 instanceof zh3.C91753f
            if (r5 == 0) goto L_0x0022
            r1 = r4
            zh3.f r1 = (zh3.C91753f) r1
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            long r2 = r1.beginTransaction(r2)
        L_0x0022:
            java.util.Iterator r10 = r10.iterator()
        L_0x0026:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r10.next()
            com.tencent.mm.storage.emotion.EmojiInfo r4 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r4
            android.content.ContentValues r4 = r4.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r9.f301704d
            java.lang.String r6 = "EmojiInfo"
            java.lang.String r7 = "md5"
            long r4 = r5.replace(r6, r7, r4)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0026
            if (r1 == 0) goto L_0x004c
            r1.endTransaction(r2)
        L_0x004c:
            return r0
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.endTransaction(r2)
        L_0x0052:
            r10 = 1
            return r10
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.v10(java.util.List):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008d, code lost:
        if (r2 == 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a5, code lost:
        if (r2 == 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: vP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo142067vP(int r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select "
            r1.append(r2)
            java.lang.String r2 = "md5"
            r1.append(r2)
            java.lang.String r2 = " from "
            r1.append(r2)
            java.lang.String r2 = "EmojiInfo"
            r1.append(r2)
            java.lang.String r2 = " asc "
            java.lang.String r3 = " order by "
            java.lang.String r4 = " = "
            java.lang.String r5 = " where "
            r6 = 1
            if (r8 != r6) goto L_0x004f
            r1.append(r5)
            java.lang.String r8 = "groupId"
            r1.append(r8)
            r1.append(r4)
            java.lang.String r8 = "\""
            r1.append(r8)
            java.lang.String r4 = "capture"
            r1.append(r4)
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = "idx"
            r1.append(r8)
            r1.append(r2)
            goto L_0x006b
        L_0x004f:
            r1.append(r5)
            java.lang.String r8 = "catalog"
            r1.append(r8)
            r1.append(r4)
            r8 = 81
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = "reserved3"
            r1.append(r8)
            r1.append(r2)
        L_0x006b:
            r8 = 0
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r7.f301704d     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0095 }
            r4 = 2
            android.database.Cursor r2 = r3.rawQuery(r1, r2, r4)     // Catch:{ Exception -> 0x0095 }
            if (r2 == 0) goto L_0x008d
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0095 }
            if (r1 == 0) goto L_0x008d
        L_0x0080:
            java.lang.String r1 = r2.getString(r8)     // Catch:{ Exception -> 0x0095 }
            r0.add(r1)     // Catch:{ Exception -> 0x0095 }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0095 }
            if (r1 != 0) goto L_0x0080
        L_0x008d:
            if (r2 == 0) goto L_0x00a8
        L_0x008f:
            r2.close()
            goto L_0x00a8
        L_0x0093:
            r8 = move-exception
            goto L_0x00a9
        L_0x0095:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r4 = "get download custom emoji MD5 list failed :%s"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x0093 }
            r5[r8] = r1     // Catch:{ all -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x00a8
            goto L_0x008f
        L_0x00a8:
            return r0
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            r2.close()
        L_0x00ae:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C102451g.mo142067vP(int):java.util.List");
    }
}
