package com.tencent.p014mm.plugin.sns.model;

import android.database.Cursor;
import as2.C28128e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import eb0.C31543z5;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import os2.C11765l0;
import p823sg.C90193h;
import te3.C101789j00;
import te3.C101800k70;
import te3.C101804kv2;
import te3.C64491kg3;
import te3.c74;
import te3.h84;
import te3.j74;
import te3.m64;
import te3.n64;
import te3.w64;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.sns.model.n1 */
public final class C94897n1 {

    /* renamed from: a */
    public static long f274987a = 0;

    /* renamed from: b */
    public static long f274988b = 0;

    /* renamed from: c */
    public static long f274989c = 0;

    /* renamed from: d */
    public static int f274990d = 0;

    /* renamed from: e */
    public static long f274991e = 86400;

    /* renamed from: f */
    public static Map<String, SnsObject> f274992f = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.sns.model.n1$a */
    public class C94898a implements Comparator<Long> {
        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$1");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$1");
            int compareTo = ((Long) obj2).compareTo((Long) obj);
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$1");
            return compareTo;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.n1$b */
    public class C94899b implements Comparator<w64> {
        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$2");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$2");
            int compare = Long.compare((long) ((w64) obj).f299708i, (long) ((w64) obj2).f299708i);
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$2");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic$2");
            return compare;
        }
    }

    static {
        new TreeMap(new C94898a());
    }

    /* renamed from: a */
    public static void m120363a(SnsInfo snsInfo, SnsObject snsObject) {
        SnsInfo snsInfo2 = snsInfo;
        SnsObject snsObject2 = snsObject;
        SnsMethodCalculate.markStartTimeMs("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (snsInfo2 != null) {
            try {
                if (snsInfo2.field_attrBuf != null) {
                    String s = C75592q0.m90789s();
                    long e = (long) C31543z5.m39455e();
                    SnsObject snsObject3 = (SnsObject) new SnsObject().parseFrom(snsInfo2.field_attrBuf);
                    if (!(snsObject3 == null || Util.isNullOrNil((List) snsObject3.CommentUserList) || snsObject2 == null)) {
                        ArrayList arrayList = new ArrayList();
                        if (snsObject2.CommentUserList == null) {
                            snsObject2.CommentUserList = new LinkedList<>();
                        }
                        Iterator<w64> it = snsObject2.CommentUserList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(it.next().f299709j));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<w64> it4 = snsObject3.CommentUserList.iterator();
                        while (it4.hasNext()) {
                            w64 next = it4.next();
                            if (Util.isEqual(next.f299703d, s) && next.f299715s > 0) {
                                if (e - ((long) next.f299708i) > f274991e) {
                                    Log.m105925i("MicroMsg.SnsInfoStorageLogic", "it's time to delete local comment deleted tip:[%s,%s]", Integer.valueOf(next.f299709j), next.f299703d);
                                } else if (!arrayList.contains(Integer.valueOf(next.f299709j))) {
                                    Log.m105925i("MicroMsg.SnsInfoStorageLogic", "insert a local fake comment deleted tip:[%s,%s]", Integer.valueOf(next.f299709j), next.f299703d);
                                    arrayList2.add(next);
                                }
                            }
                        }
                        if (!Util.isNullOrNil((List) arrayList2)) {
                            snsObject2.CommentUserList.addAll(arrayList2);
                        }
                        Collections.sort(snsObject2.CommentUserList, new C94899b());
                    }
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e2, "", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    /* renamed from: b */
    public static EmojiInfo m120364b(c74 c74) {
        SnsMethodCalculate.markStartTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        EmojiInfo emojiInfo = new EmojiInfo();
        if (c74 == null) {
            SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return emojiInfo;
        } else if (c74.f131561e == null) {
            emojiInfo.field_md5 = c74.f131560d;
            SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return emojiInfo;
        } else {
            try {
                C101800k70 k702 = new C101800k70();
                k702.parseFrom(c74.f131561e.f140574f.f257327a);
                C101964h.m134219a(k702, emojiInfo);
                emojiInfo.field_temp = 1;
                emojiInfo.field_catalog = 65;
            } catch (Exception unused) {
            }
            SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return emojiInfo;
        }
    }

    /* renamed from: c */
    public static C101804kv2 m120365c(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        } else if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        } else {
            TimeLineObject timeLine = snsInfo.getTimeLine();
            C101789j00 j002 = timeLine.ContentObj;
            if (j002 == null || j002.f298427h.size() == 0 || timeLine.ContentObj.f298427h.size() <= i) {
                SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return null;
            }
            C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(i);
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return kv22;
        }
    }

    /* renamed from: d */
    public static C101804kv2 m120366d(SnsInfo snsInfo, String str) {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C101789j00 j002 = timeLine.ContentObj;
        if (j002 == null || j002.f298427h.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        Iterator<C101804kv2> it = timeLine.ContentObj.f298427h.iterator();
        while (it.hasNext()) {
            C101804kv2 next = it.next();
            if (next.f298689d.equals(str)) {
                SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return next;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return null;
    }

    /* renamed from: e */
    public static SnsObject m120367e(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            if (snsInfo.contentByteMd5 == null) {
                snsInfo.contentByteMd5 = C90193h.m112878f(snsInfo.field_content) + C90193h.m112878f(snsInfo.field_attrBuf);
            }
            if (((ConcurrentHashMap) f274992f).containsKey(snsInfo.contentByteMd5)) {
                SnsObject snsObject = (SnsObject) ((ConcurrentHashMap) f274992f).get(snsInfo.contentByteMd5);
                if (snsObject != null) {
                    C94866e1.Rx0().mo130957p(snsObject);
                    SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    return snsObject;
                }
            }
            SnsObject snsObject2 = (SnsObject) new SnsObject().parseFrom(snsInfo.field_attrBuf);
            ((ConcurrentHashMap) f274992f).put(snsInfo.contentByteMd5, snsObject2);
            C94866e1.Rx0().mo130957p(snsObject2);
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject2;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
            SnsObject snsObject3 = new SnsObject();
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject3;
        }
    }

    /* renamed from: f */
    public static SnsObject m120368f(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            SnsObject p = C94866e1.Rx0().mo130957p((SnsObject) new SnsObject().parseFrom(snsInfo.field_attrBuf));
            if (p.f283891Id == 0) {
                long j = snsInfo.field_snsId;
                if (j != 0) {
                    p.f283891Id = j;
                }
            }
            ((ConcurrentHashMap) f274992f).clear();
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return p;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
            SnsObject snsObject = new SnsObject();
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject;
        }
    }

    /* renamed from: g */
    public static String m120369g(String str) {
        SnsMethodCalculate.markStartTimeMs("getTagName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        LinkedList linkedList = new LinkedList();
        Cursor Yt = C94866e1.ey0().mo11653Yt();
        if (Yt.moveToFirst()) {
            do {
                C11765l0 l0Var = new C11765l0();
                l0Var.convertFrom(Yt);
                linkedList.add(Util.nullAs(l0Var.field_tagName, ""));
            } while (Yt.moveToNext());
        }
        Yt.close();
        int i = 1;
        String str2 = str;
        while (linkedList.contains(str2)) {
            str2 = str + i;
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("getTagName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c4  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m120370h(java.lang.String r19, int r20, java.util.LinkedList<com.tencent.p014mm.protocal.protobuf.SnsObject> r21, java.lang.String r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.String r3 = "insertSnsList"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            if (r21 == 0) goto L_0x0375
            boolean r5 = r21.isEmpty()
            if (r5 == 0) goto L_0x0017
            goto L_0x0375
        L_0x0017:
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.Iterator r8 = r21.iterator()
        L_0x0029:
            boolean r9 = r8.hasNext()
            java.lang.String r10 = "MicroMsg.SnsInfoStorageLogic"
            r12 = 0
            r13 = 1
            if (r9 == 0) goto L_0x00d6
            java.lang.Object r9 = r8.next()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            java.lang.String r14 = "checkSnsObjectValid"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            if (r9 != 0) goto L_0x0044
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            goto L_0x0070
        L_0x0044:
            java.lang.String r15 = r9.Username
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x0056
            java.lang.String r15 = "snsObject username invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            goto L_0x0070
        L_0x0056:
            int r15 = r9.CreateTime
            if (r15 > 0) goto L_0x006c
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r12] = r15
            java.lang.String r15 = "sns CreateTime error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r15, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            goto L_0x0070
        L_0x006c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            r12 = 1
        L_0x0070:
            if (r12 != 0) goto L_0x0073
            goto L_0x0029
        L_0x0073:
            long r10 = r9.f283891Id
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r5.mo139806SE(r10)
            if (r10 != 0) goto L_0x0080
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r10.<init>()
        L_0x0080:
            long r11 = m120376n(r10, r9, r0, r1)
            r14 = 0
            int r17 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r17 != 0) goto L_0x008b
            goto L_0x0029
        L_0x008b:
            int r11 = r7.size()
            r12 = 15
            r14 = 3
            if (r11 >= r14) goto L_0x00a9
            int r11 = r10.getTypeFlag()
            if (r11 == r13) goto L_0x00a0
            int r11 = r10.getTypeFlag()
            if (r11 != r12) goto L_0x00a9
        L_0x00a0:
            long r14 = r10.field_snsId
            java.lang.String r11 = vr2.C102236a0.m134765q0(r14)
            r7.add(r11)
        L_0x00a9:
            java.lang.String r11 = "recordSnsHappen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            int r14 = r10.getTypeFlag()
            if (r14 == r13) goto L_0x00be
            r13 = 3
            if (r14 == r13) goto L_0x00be
            if (r14 == r12) goto L_0x00be
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x00cb
        L_0x00be:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.getTimeLine()
            if (r10 != 0) goto L_0x00c8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x00cb
        L_0x00c8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
        L_0x00cb:
            long r9 = r9.f283891Id
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.add(r9)
            goto L_0x0029
        L_0x00d6:
            java.lang.String r5 = ""
            r8 = 4
            if (r1 == r8) goto L_0x00df
            r9 = 8
            if (r1 != r9) goto L_0x0187
        L_0x00df:
            boolean r9 = r2.equals(r5)
            if (r9 == 0) goto L_0x0187
            os2.d0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r9.getClass()
            java.lang.String r11 = "getNewersId"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.storage.SnsExtStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r14)
            os2.c0 r9 = r9.mo139782Yt(r0)
            java.lang.String r9 = r9.field_newerIds
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r5)
            java.lang.String r11 = ","
            java.lang.String[] r9 = r9.split(r11)
            java.util.ArrayList r9 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "newerIds "
            r11.append(r14)
            java.lang.String r14 = m120372j(r7)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
        L_0x0123:
            int r11 = r7.size()
            r14 = 3
            if (r11 >= r14) goto L_0x0163
            int r11 = r9.size()
            if (r11 <= 0) goto L_0x0163
            java.lang.Object r11 = r9.remove(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0123
            java.util.Iterator r15 = r7.iterator()
        L_0x013c:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0159
            java.lang.Object r16 = r15.next()
            r14 = r16
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r11.compareTo(r14)
            if (r14 != 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            if (r14 <= 0) goto L_0x0157
            r7.add(r12, r11)
            goto L_0x0159
        L_0x0157:
            r14 = 3
            goto L_0x013c
        L_0x0159:
            boolean r14 = r7.contains(r11)
            if (r14 != 0) goto L_0x0123
            r7.add(r11)
            goto L_0x0123
        L_0x0163:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "merge newerIds "
            r9.append(r11)
            java.lang.String r11 = m120372j(r7)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            os2.d0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r7 = m120372j(r7)
            r9.mo139785bO(r0, r7)
        L_0x0187:
            java.lang.String r7 = "updateSnsInfoStgItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            java.lang.Object r9 = r21.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r14 = r9.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134765q0(r14)
            java.lang.String r9 = vr2.C102236a0.m134705B(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "FIlTER SEQ :: "
            r11.append(r14)
            r11.append(r2)
            java.lang.String r14 = "  -  "
            r11.append(r14)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            java.lang.String r11 = "MicroMsg.SnsInfoStorage"
            java.lang.String r14 = "getCursorByUserSeq "
            java.lang.String r15 = " AND "
            r12 = 2
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            if (r1 != r12) goto L_0x0232
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.getClass()
            java.lang.String r12 = "getCursorByTimeLineSeq"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.String r8 = "getFullTimeLineSql"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r13)
            java.lang.String r8 = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) "
            if (r2 == 0) goto L_0x01e3
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01f9
        L_0x01e3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r15)
            java.lang.String r2 = r0.mo139831uP(r2)
            r5.append(r2)
            java.lang.String r8 = r5.toString()
        L_0x01f9:
            boolean r2 = r0.zs0(r9)
            if (r2 == 0) goto L_0x0215
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r15)
            java.lang.String r5 = r0.mo139827nP(r9)
            r2.append(r5)
            java.lang.String r8 = r2.toString()
        L_0x0215:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
            os2.k0 r0 = r0.f294108d
            r5 = 0
            android.database.Cursor r0 = r0.rawQuery(r8, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x024c
        L_0x0232:
            r5 = 0
            r8 = 16
            if (r1 != r8) goto L_0x0240
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            android.database.Cursor r0 = r0.mo139819fY(r2, r9)
            goto L_0x024c
        L_0x0240:
            r8 = 128(0x80, float:1.794E-43)
            if (r1 != r8) goto L_0x024f
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            android.database.Cursor r0 = r0.mo139821gY(r5, r2, r9)
        L_0x024c:
            r18 = r3
            goto L_0x02bd
        L_0x024f:
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r8 = 4
            if (r1 != r8) goto L_0x0258
            r8 = 1
            goto L_0x0259
        L_0x0258:
            r8 = 0
        L_0x0259:
            r5.getClass()
            java.lang.String r12 = "getCursorByUserSeq"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r18 = r3
            r1 = 1
            r3 = 0
            java.lang.String r0 = r5.ko0(r1, r0, r8, r3)
            boolean r1 = r5.zs0(r2)
            if (r1 == 0) goto L_0x0285
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r5.mo139831uP(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0285:
            boolean r1 = r5.zs0(r9)
            if (r1 == 0) goto L_0x02a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r5.mo139827nP(r9)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x02a1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            os2.k0 r1 = r5.f294108d
            r2 = 0
            android.database.Cursor r0 = r1.rawQuery(r0, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
        L_0x02bd:
            if (r0 != 0) goto L_0x02c4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x034d
        L_0x02c4:
            boolean r1 = r0.moveToFirst()
            if (r1 != 0) goto L_0x02d2
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x034d
        L_0x02d2:
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r1.<init>()
            r1.convertFrom((android.database.Cursor) r0)
            long r2 = r1.field_snsId
            boolean r5 = r1.isWaitPost()
            if (r5 == 0) goto L_0x02ec
            java.lang.String r1 = "uploading one "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
        L_0x02e8:
            r5 = r20
            r1 = 2
            goto L_0x0341
        L_0x02ec:
            boolean r5 = r1.isDieItem()
            if (r5 == 0) goto L_0x02f8
            java.lang.String r1 = "die one "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
            goto L_0x02e8
        L_0x02f8:
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x02e8
            r5 = r20
            r1.removeSourceFlag(r5)
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r8.yu0(r2, r1)
            r1 = 2
            if (r5 != r1) goto L_0x0318
            os2.o0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.iy0()
            r8.mo60193qq(r2)
        L_0x0318:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "removeSourceFlag sns Id "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " source "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = ", snsIdStr="
            r8.append(r9)
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
        L_0x0341:
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x02d2
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
        L_0x034d:
            com.tencent.mm.plugin.sns.model.y1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r0.getClass()
            java.lang.String r1 = "checkRemoveFeed"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "MicroMsg.SnsUnreadTipManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.model.b2 r5 = new com.tencent.mm.plugin.sns.model.b2
            r5.<init>(r0, r6)
            r3.post(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        L_0x0375:
            r2 = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(java.lang.String, int, java.util.LinkedList, java.lang.String):void");
    }

    /* renamed from: i */
    public static boolean m120371i(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z2 = false;
        if (z) {
            if (i > 0) {
                z2 = true;
            }
            SnsMethodCalculate.markEndTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return z2;
        }
        SnsMethodCalculate.markEndTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return false;
    }

    /* renamed from: j */
    public static String m120372j(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        String str = "";
        for (String next : list) {
            if (str.length() == 0) {
                str = next;
            } else {
                str = str + "," + next;
            }
        }
        SnsMethodCalculate.markEndTimeMs("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return str;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [pe3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.C51018qv3 m120373k(te3.C51018qv3 r5, byte[] r6) {
        /*
            java.lang.String r0 = "mergeOperation"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r6 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.SnsObject r3 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0019 }
            r3.<init>()     // Catch:{ Exception -> 0x0019 }
            pe3.a r6 = r3.parseFrom(r6)     // Catch:{ Exception -> 0x0019 }
            com.tencent.mm.protocal.protobuf.SnsObject r6 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r6     // Catch:{ Exception -> 0x0019 }
            te3.qv3 r6 = r6.ObjectOperations     // Catch:{ Exception -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r5 = move-exception
            goto L_0x0068
        L_0x001b:
            r6 = r2
        L_0x001c:
            if (r5 != 0) goto L_0x0022
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        L_0x0022:
            te3.y74 r3 = new te3.y74     // Catch:{ Exception -> 0x0019 }
            r3.<init>()     // Catch:{ Exception -> 0x0019 }
            if (r6 == 0) goto L_0x0034
            pe3.b r6 = r6.f140574f     // Catch:{ Exception -> 0x0019 }
            byte[] r6 = r6.f257327a     // Catch:{ Exception -> 0x0019 }
            pe3.a r6 = r3.parseFrom(r6)     // Catch:{ Exception -> 0x0019 }
            r3 = r6
            te3.y74 r3 = (te3.y74) r3     // Catch:{ Exception -> 0x0019 }
        L_0x0034:
            te3.y74 r6 = new te3.y74     // Catch:{ Exception -> 0x0019 }
            r6.<init>()     // Catch:{ Exception -> 0x0019 }
            pe3.b r5 = r5.f140574f     // Catch:{ Exception -> 0x0019 }
            byte[] r5 = r5.f257327a     // Catch:{ Exception -> 0x0019 }
            pe3.a r5 = r6.parseFrom(r5)     // Catch:{ Exception -> 0x0019 }
            te3.y74 r5 = (te3.y74) r5     // Catch:{ Exception -> 0x0019 }
            te3.xg3 r6 = r5.f145163h     // Catch:{ Exception -> 0x0019 }
            if (r6 != 0) goto L_0x004b
            te3.xg3 r6 = r3.f145163h     // Catch:{ Exception -> 0x0019 }
            r5.f145163h = r6     // Catch:{ Exception -> 0x0019 }
        L_0x004b:
            te3.n30 r6 = r3.f145162g     // Catch:{ Exception -> 0x0019 }
            if (r6 != 0) goto L_0x0052
            r5.f145162g = r2     // Catch:{ Exception -> 0x0019 }
            goto L_0x0058
        L_0x0052:
            te3.n30 r3 = r5.f145162g     // Catch:{ Exception -> 0x0019 }
            if (r3 != 0) goto L_0x0058
            r5.f145162g = r6     // Catch:{ Exception -> 0x0019 }
        L_0x0058:
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0019 }
            te3.qv3 r6 = new te3.qv3     // Catch:{ Exception -> 0x0019 }
            r6.<init>()     // Catch:{ Exception -> 0x0019 }
            r6.mo73350k(r5)     // Catch:{ Exception -> 0x0019 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        L_0x0068:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r4, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94897n1.m120373k(te3.qv3, byte[]):te3.qv3");
    }

    /* renamed from: l */
    public static void m120374l(SnsInfo snsInfo, SnsObject snsObject) {
        SnsObject snsObject2;
        C64491kg3 kg32;
        int i;
        SnsMethodCalculate.markStartTimeMs("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        long currentTicks = Util.currentTicks();
        try {
            if (snsInfo.getTypeFlag() == 15 && (snsObject2 = (SnsObject) new SnsObject().parseFrom(snsInfo.field_attrBuf)) != null && (kg32 = snsObject2.PreDownloadInfo) != null && (i = kg32.f183931d) > 0) {
                snsObject.PreDownloadInfo = kg32;
                Log.m105925i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", Integer.valueOf(i), Integer.valueOf(snsObject.PreDownloadInfo.f183932e), snsObject.PreDownloadInfo.f183933f, Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    /* renamed from: m */
    public static void m120375m(long j, n64 n64) {
        SnsMethodCalculate.markStartTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        m64 m64 = n64.f298899f;
        if (m64.f298777h != 9) {
            SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(SE.field_attrBuf);
            snsObject.f283891Id = j;
            Iterator<w64> it = snsObject.CommentUserList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w64 next = it.next();
                if (next.f299709j == m64.f298782p && !Util.isNullOrNil(next.f299703d) && next.f299703d.equals(m64.f298773d)) {
                    snsObject.CommentUserList.remove(next);
                    break;
                }
            }
            SE.setAttrBuf(snsObject.toByteArray());
            C94866e1.Yx0().xs0(snsObject.f283891Id, SE);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r0 = true;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m120376n(com.tencent.p014mm.plugin.sns.storage.SnsInfo r10, com.tencent.p014mm.protocal.protobuf.SnsObject r11, java.lang.String r12, int r13) {
        /*
            java.lang.String r0 = "replace"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r10 != 0) goto L_0x000f
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r10.<init>()
        L_0x000f:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r1 = r10.field_snsId
            monitor-enter(r0)
            java.lang.String r3 = "checkNotDel"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x02d5 }
            ms2.c r3 = r0.f274774a     // Catch:{ all -> 0x02d5 }
            java.util.LinkedList<ms2.f> r3 = r3.f292903h     // Catch:{ all -> 0x02d5 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02d5 }
        L_0x0025:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x02d5 }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x02d5 }
            ms2.f r4 = (ms2.C47096f) r4     // Catch:{ all -> 0x02d5 }
            long r7 = r4.f126561d     // Catch:{ all -> 0x02d5 }
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r1 = "checkNotDel"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x02d5 }
            monitor-exit(r0)
            r0 = 0
            goto L_0x004c
        L_0x0043:
            java.lang.String r1 = "checkNotDel"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x02d5 }
            monitor-exit(r0)
            r0 = 1
        L_0x004c:
            if (r0 != 0) goto L_0x0059
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x0059:
            int r0 = r11.NoChange
            if (r0 == 0) goto L_0x00a3
            java.lang.String r12 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hit the filter id:"
            r0.append(r1)
            long r1 = r11.f283891Id
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            long r1 = r11.f283891Id
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            boolean r12 = r10.isSourceExist(r13)
            if (r12 != 0) goto L_0x008d
            r10.addSourceFlag(r13)
            r5 = 1
        L_0x008d:
            if (r5 == 0) goto L_0x0098
            os2.e0 r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r0 = r11.f283891Id
            r12.xs0(r0, r10)
        L_0x0098:
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x00a3:
            java.lang.String r0 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r1 = "hasChange id:  %s listSize %s Stringid %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = r11.f283891Id
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r5] = r3
            java.util.LinkedList<te3.w64> r3 = r11.CommentUserList
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r6] = r3
            long r3 = r11.f283891Id
            java.lang.String r3 = vr2.C102236a0.m134765q0(r3)
            r4 = 2
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            te3.qv3 r0 = r11.ObjectDesc
            if (r0 == 0) goto L_0x02c2
            pe3.b r0 = r0.f140574f
            if (r0 != 0) goto L_0x00d4
            goto L_0x02c2
        L_0x00d4:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r0.mo123703f()
            r1.<init>(r0)
            java.lang.String r0 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r2 = "from server %d "
            java.lang.Object[] r3 = new java.lang.Object[r6]
            long r7 = r11.f283891Id
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 == 0) goto L_0x00ff
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x00ff:
            boolean r0 = r10.setContent(r1)
            if (r0 != 0) goto L_0x0110
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x0110:
            te3.qv3 r0 = r11.ObjectOperations
            byte[] r1 = r10.field_attrBuf
            te3.qv3 r0 = m120373k(r0, r1)
            r11.ObjectOperations = r0
            java.lang.String r0 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r1 = "from server xml ok %d"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r7 = r11.f283891Id
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)
            te3.qv3 r0 = r11.ObjectDesc
            byte[] r1 = new byte[r5]
            r0.mo73350k(r1)
            java.lang.String r0 = r11.Username
            r10.setUserName(r0)
            int r0 = r11.CreateTime
            r10.setCreateTime(r0)
            int r0 = r11.LikeFlag
            r10.setLikeFlag(r0)
            long r0 = r11.f283891Id
            r10.setSnsId(r0)
            long r0 = r11.f283891Id
            r10.setStringSeq((long) r0)
            int r0 = r11.ExtFlag
            r10.field_serverExtFlag = r0
            r10.addSourceFlag(r13)
            boolean r0 = r10.isAd()     // Catch:{ Exception -> 0x0166 }
            if (r0 != 0) goto L_0x015b
            m120363a(r10, r11)     // Catch:{ Exception -> 0x0166 }
        L_0x015b:
            m120374l(r10, r11)     // Catch:{ Exception -> 0x0166 }
            byte[] r0 = r11.toByteArray()     // Catch:{ Exception -> 0x0166 }
            r10.setAttrBuf(r0)     // Catch:{ Exception -> 0x0166 }
            goto L_0x0170
        L_0x0166:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x0170:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r10.getTimeLine()
            java.lang.String r1 = r11.Username
            r0.UserName = r1
            int r1 = r0.Privated
            r10.setPravited(r1)
            java.lang.String r2 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r3 = "ext flag %s  extflag %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r7 = r11.f283891Id
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4[r5] = r7
            int r7 = r11.ExtFlag
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            int r2 = r11.ExtFlag
            java.lang.String r3 = "isBIDIRFRIEND"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2 = r2 & r6
            if (r2 <= 0) goto L_0x01a5
            r2 = 1
            goto L_0x01a6
        L_0x01a5:
            r2 = 0
        L_0x01a6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 == 0) goto L_0x01af
            r10.setExtFlag()
            goto L_0x01b2
        L_0x01af:
            r10.unSetExtFlag()
        L_0x01b2:
            int r2 = r11.WeiShangFeedType
            if (r2 == 0) goto L_0x01ba
            r10.setWsFeedTypeFlag()
            goto L_0x01bd
        L_0x01ba:
            r10.clearWsFeedTypeFlag()
        L_0x01bd:
            int r2 = r11.ExtFlag
            java.lang.String r3 = "isWsFold"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r7 = 16
            r2 = r2 & r7
            if (r2 <= 0) goto L_0x01ce
            r2 = 1
            goto L_0x01cf
        L_0x01ce:
            r2 = 0
        L_0x01cf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 == 0) goto L_0x021d
            r2 = 128(0x80, float:1.794E-43)
            r10.addSourceFlag(r2)
            os2.o0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.iy0()
            long r3 = r11.f283891Id
            os2.n0 r2 = r2.mo60192jo(r3)
            if (r2 == 0) goto L_0x0211
            byte[] r3 = r2.field_groupStrcut
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)
            if (r3 != 0) goto L_0x0211
            te3.k94 r3 = new te3.k94
            r3.<init>()
            byte[] r4 = r2.field_groupStrcut     // Catch:{ Exception -> 0x0200 }
            r3.parseFrom(r4)     // Catch:{ Exception -> 0x0200 }
            java.util.LinkedList<java.lang.Long> r3 = r3.f183902d     // Catch:{ Exception -> 0x0200 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)     // Catch:{ Exception -> 0x0200 }
            r5 = r3 ^ 1
            goto L_0x0211
        L_0x0200:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r8 = "parse SnsWsGroupStruct fail:%s"
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r3 = r3.getMessage()
            r9[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r9)
        L_0x0211:
            if (r2 == 0) goto L_0x0219
            if (r5 == 0) goto L_0x0219
            r10.setWsFoldFlag()
            goto L_0x0220
        L_0x0219:
            r10.cleanWsFoldFlag()
            goto L_0x0220
        L_0x021d:
            r10.cleanWsFoldFlag()
        L_0x0220:
            r2 = 4
            if (r1 != r6) goto L_0x023a
            if (r13 == r2) goto L_0x023a
            if (r13 == r7) goto L_0x023a
            java.lang.String r10 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r11 = "svr error push me the private pic in timelnie or others"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            r10 = 0
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x023a:
            if (r1 == r6) goto L_0x0246
            java.lang.String r1 = r11.Username
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L_0x0249
            if (r13 != r2) goto L_0x0249
        L_0x0246:
            r10.setLocalPrivate()
        L_0x0249:
            r10.setTimeLine(r0)
            te3.j00 r12 = r0.ContentObj
            int r12 = r12.f298424e
            r10.setTypeFlag(r12)
            te3.j00 r12 = r0.ContentObj
            int r12 = r12.f298428i
            r10.setSubTypeFlag(r12)
            os2.e0 r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r0 = r11.f283891Id
            boolean r10 = r12.xs0(r0, r10)
            if (r10 != 0) goto L_0x026d
            java.lang.String r10 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r12 = ""
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
        L_0x026d:
            java.util.LinkedList<te3.w64> r10 = r11.CommentUserList
            java.util.Iterator r10 = r10.iterator()
        L_0x0273:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x02b7
            java.lang.Object r12 = r10.next()
            te3.w64 r12 = (te3.w64) r12
            java.util.LinkedList<te3.c74> r12 = r12.f299717u
            java.util.Iterator r12 = r12.iterator()
        L_0x0285:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0273
            java.lang.Object r13 = r12.next()
            te3.c74 r13 = (te3.c74) r13
            com.tencent.mm.storage.emotion.EmojiInfo r13 = m120364b(r13)
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            java.lang.String r1 = r13.field_md5
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.mo142044TO(r1)
            if (r0 != 0) goto L_0x0285
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r0.insert(r13)
            wk.e r0 = p260wk.C102457e.f301712a
            r1 = 0
            r0.mo142073e(r13, r1)
            goto L_0x0285
        L_0x02b7:
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x02c2:
            java.lang.String r10 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r12 = "object desc is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            long r10 = r11.f283891Id
            java.lang.String r12 = "replace"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r10
        L_0x02d5:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94897n1.m120376n(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.SnsObject, java.lang.String, int):long");
    }

    /* renamed from: o */
    public static long m120377o(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(snsObject.f283891Id);
        if (SE == null) {
            SE = new SnsInfo();
        }
        long n = m120376n(SE, snsObject, "", 0);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m120378p(int r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "retryPostItem"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "retryPostItem localId　"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.SnsInfoStorageLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            os2.e0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.mo139800LL(r11)
            r5 = 0
            if (r3 != 0) goto L_0x0030
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x0030:
            r3.clearItemDie()
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r7 = (int) r6
            r3.setCreateTime(r7)
            r6 = 0
            te3.lv2 r7 = new te3.lv2     // Catch:{ Exception -> 0x0060 }
            r7.<init>()     // Catch:{ Exception -> 0x0060 }
            byte[] r8 = r3.getPostBuf()     // Catch:{ Exception -> 0x0060 }
            pe3.a r7 = r7.parseFrom(r8)     // Catch:{ Exception -> 0x0060 }
            te3.lv2 r7 = (te3.C101808lv2) r7     // Catch:{ Exception -> 0x0060 }
            r7.f298750n = r5     // Catch:{ Exception -> 0x005e }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            r7.f298751o = r8     // Catch:{ Exception -> 0x005e }
            byte[] r6 = r7.toByteArray()     // Catch:{ Exception -> 0x005e }
            r3.setPostBuf(r6)     // Catch:{ Exception -> 0x005e }
            goto L_0x0069
        L_0x005e:
            r6 = move-exception
            goto L_0x0064
        L_0x0060:
            r7 = move-exception
            r10 = r7
            r7 = r6
            r6 = r10
        L_0x0064:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r0, r8)
        L_0x0069:
            if (r7 != 0) goto L_0x006f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x006f:
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r6.Rv0(r11, r3)
            r11 = 0
        L_0x0077:
            java.util.LinkedList<te3.ar2> r3 = r7.f298747h
            int r3 = r3.size()
            if (r11 >= r3) goto L_0x00cb
            java.util.LinkedList<te3.ar2> r3 = r7.f298747h
            java.lang.Object r3 = r3.get(r11)
            te3.ar2 r3 = (te3.C64241ar2) r3
            int r3 = r3.f182140d
            os2.j0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            long r8 = (long) r3
            os2.i0 r6 = r6.mo139867LL(r8)
            if (r6 != 0) goto L_0x0095
            goto L_0x00bf
        L_0x0095:
            r6.mo139855i(r5)
            te3.nv2 r8 = new te3.nv2     // Catch:{ Exception -> 0x00c2 }
            r8.<init>()     // Catch:{ Exception -> 0x00c2 }
            byte[] r9 = r6.mo139854h()     // Catch:{ Exception -> 0x00c2 }
            pe3.a r8 = r8.parseFrom(r9)     // Catch:{ Exception -> 0x00c2 }
            te3.nv2 r8 = (te3.C101821nv2) r8     // Catch:{ Exception -> 0x00c2 }
            int r9 = r8.f298920n     // Catch:{ Exception -> 0x00c2 }
            if (r9 != 0) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            r9 = 2
            r8.f298920n = r9     // Catch:{ Exception -> 0x00c2 }
            r8.f298922p = r0     // Catch:{ Exception -> 0x00c2 }
            byte[] r8 = r8.toByteArray()     // Catch:{ Exception -> 0x00c2 }
            r6.mo139858l(r8)     // Catch:{ Exception -> 0x00c2 }
            os2.j0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            r8.r50(r3, r6)
        L_0x00bf:
            int r11 = r11 + 1
            goto L_0x0077
        L_0x00c2:
            java.lang.String r11 = "MediaUploadInfo parseFrom MediaUploadInfo Exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x00cb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94897n1.m120378p(int):boolean");
    }

    /* renamed from: q */
    public static void m120379q(int i) {
        SnsMethodCalculate.markStartTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        Log.m105918d("MicroMsg.SnsInfoStorageLogic", "unsetOmitResendFlag localId　" + i);
        SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
        if (LL == null) {
            SnsMethodCalculate.markEndTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        LL.unsetOmittedFailResend();
        C94866e1.Yx0().Rv0(i, LL);
        SnsMethodCalculate.markEndTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    /* renamed from: r */
    public static boolean m120380r(long j, n64 n64) {
        SnsMethodCalculate.markStartTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        m64 m64 = n64.f298899f;
        int i = m64.f298777h;
        if (i == 1 || i == 2) {
            SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
            if (SE == null) {
                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return true;
            } else if (SE.getTypeFlag() != 21 || C28128e.m38101c()) {
                try {
                    SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(SE.field_attrBuf);
                    snsObject.f283891Id = j;
                    int i2 = m64.f298777h;
                    if (i2 == 1) {
                        Iterator<w64> it = snsObject.LikeUserList.iterator();
                        while (it.hasNext()) {
                            w64 next = it.next();
                            if (next.f299708i == m64.f298779j && next.f299703d.equals(m64.f298773d)) {
                                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                                return true;
                            }
                        }
                        snsObject.LikeUserList.add(C94843b1.m120188i(n64));
                    } else if (i2 == 2) {
                        Iterator<w64> it4 = snsObject.CommentUserList.iterator();
                        while (it4.hasNext()) {
                            w64 next2 = it4.next();
                            if (next2.f299708i == m64.f298779j && next2.f299703d.equals(m64.f298773d)) {
                                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                                return true;
                            }
                        }
                        snsObject.CommentUserList.add(C94843b1.m120188i(n64));
                    }
                    SE.setAttrBuf(snsObject.toByteArray());
                    C94866e1.Yx0().xs0(snsObject.f283891Id, SE);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
                }
                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return true;
            } else {
                Log.m105924i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
                SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return false;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return true;
        }
    }

    /* renamed from: s */
    public static void m120381s(long j, n64 n64) {
        SnsMethodCalculate.markStartTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        m64 m64 = n64.f298899f;
        if (m64.f298777h != 13) {
            SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(SE.field_attrBuf);
            snsObject.f283891Id = j;
            if (snsObject.SnsRedEnvelops == null) {
                snsObject.SnsRedEnvelops = new h84();
            }
            if (m64.f298777h == 13) {
                Iterator<j74> it = snsObject.SnsRedEnvelops.f134505e.iterator();
                while (it.hasNext()) {
                    if (it.next().f135912d.equals(m64.f298773d)) {
                        SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return;
                    }
                }
                j74 j74 = new j74();
                j74.f135914f = m64.f298786t;
                j74.f135913e = m64.f298779j;
                j74.f135912d = m64.f298773d;
                snsObject.SnsRedEnvelops.f134505e.add(j74);
                h84 h84 = snsObject.SnsRedEnvelops;
                h84.f134504d = h84.f134505e.size();
            }
            SE.setAttrBuf(snsObject.toByteArray());
            C94866e1.Yx0().xs0(snsObject.f283891Id, SE);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    /* renamed from: t */
    public static void m120382t(LinkedList<SnsObject> linkedList, int i) {
        SnsMethodCalculate.markStartTimeMs("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (i == 0) {
            f274987a = linkedList.getFirst().f283891Id;
            f274988b = linkedList.getLast().f283891Id;
        } else if (i == 1) {
            f274987a = linkedList.getFirst().f283891Id;
        } else if (i == 2) {
            f274988b = linkedList.getLast().f283891Id;
        }
        SnsMethodCalculate.markEndTimeMs("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }
}
