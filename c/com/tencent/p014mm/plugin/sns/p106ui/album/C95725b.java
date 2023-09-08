package com.tencent.p014mm.plugin.sns.p106ui.album;

import com.tencent.p014mm.plugin.sns.p106ui.C95772f;
import com.tencent.p014mm.plugin.sns.p106ui.album.C95716a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.ui.album.b */
public class C95725b extends C95772f<C95716a.C95719c> {

    /* renamed from: c */
    public String f279193c = "";

    /* renamed from: d */
    public boolean f279194d = false;

    /* renamed from: e */
    public String f279195e = "";

    /* renamed from: f */
    public boolean f279196f = false;

    /* renamed from: g */
    public C95726a f279197g = null;

    /* renamed from: h */
    public Map<String, List<SnsInfo>> f279198h = new LinkedHashMap();

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.b$a */
    public interface C95726a {
    }

    public C95725b(C95726a aVar, String str, boolean z) {
        this.f279197g = aVar;
        this.f279193c = str;
        this.f279194d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.plugin.sns.p106ui.album.C95716a.C95719c> mo133173b() {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "loadData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.Map<java.lang.String, java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo>> r3 = r0.f279198h
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            r3.clear()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            boolean r6 = r0.f279194d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r0.f279195e
            r8 = 1
            r5[r8] = r6
            boolean r6 = r0.f279196f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r9 = 2
            r5[r9] = r6
            java.lang.String r6 = "MicroMsg.SnsAlbumAdapterHelper"
            java.lang.String r10 = "loadData isSelf=%s limitSeq=%s isPrivate=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r5)
            java.lang.String r5 = r0.f279193c
            boolean r10 = r0.f279194d
            java.lang.String r11 = r0.f279195e
            int r12 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274990d
            java.lang.String r12 = "getSnsMediaListByUserName"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r14.getClass()
            java.lang.String r15 = "getCursorForAlbumHistory"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            java.lang.String r5 = r14.Wa0(r7, r5, r10, r7)
            boolean r16 = r14.zs0(r11)
            if (r16 == 0) goto L_0x0077
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = " AND "
            r9.append(r5)
            java.lang.String r5 = r14.mo139827nP(r11)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
        L_0x0077:
            if (r10 == 0) goto L_0x008b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = os2.C100400e0.f294098q
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            goto L_0x009c
        L_0x008b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = os2.C100400e0.f294099r
            r9.append(r5)
            java.lang.String r5 = r9.toString()
        L_0x009c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getCursorByUserName in gallery "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.SnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
            os2.k0 r9 = r14.f294108d
            r10 = 0
            android.database.Cursor r5 = r9.rawQuery(r5, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r9 = r5.getCount()
            if (r9 != 0) goto L_0x00ce
            r5.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x00eb
        L_0x00ce:
            boolean r9 = r5.moveToFirst()
            if (r9 == 0) goto L_0x00e5
        L_0x00d4:
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r9.<init>()
            r9.convertFrom((android.database.Cursor) r5)
            r4.add(r9)
            boolean r9 = r5.moveToNext()
            if (r9 != 0) goto L_0x00d4
        L_0x00e5:
            r5.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
        L_0x00eb:
            java.util.Iterator r5 = r4.iterator()
        L_0x00ef:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x01e6
            java.lang.Object r9 = r5.next()
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
            int r10 = r9.field_type
            if (r10 == r8) goto L_0x0103
            r11 = 15
            if (r10 != r11) goto L_0x01de
        L_0x0103:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r9.getTimeLine()
            if (r10 == 0) goto L_0x01de
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r9.getTimeLine()
            te3.j00 r10 = r10.ContentObj
            if (r10 == 0) goto L_0x01de
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r9.getTimeLine()
            te3.j00 r10 = r10.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x01de
            java.lang.String r10 = "assembleRealData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r2)
            int r11 = r9.getCreateTime()
            long r11 = (long) r11
            r13 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.lang.String r15 = "formatTimeInSnsAlbum"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsTimeUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r8)
            boolean r17 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123543i(r13)
            if (r17 == 0) goto L_0x0151
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131830360(0x7f112658, float:1.9293715E38)
            java.lang.String r13 = r13.getString(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)
        L_0x014e:
            r18 = r5
            goto L_0x017e
        L_0x0151:
            boolean r17 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123542h(r13)
            if (r17 == 0) goto L_0x016a
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131830322(0x7f112632, float:1.9293638E38)
            java.lang.String r13 = r13.getString(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)
            goto L_0x014e
        L_0x016a:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r18 = r5
            r5 = 2131830398(0x7f11267e, float:1.9293792E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.CharSequence r13 = android.text.format.DateFormat.format(r5, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)
        L_0x017e:
            java.lang.String r5 = r13.toString()
            r7 = 7
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r5
            java.lang.String r8 = vr2.C102236a0.m134772u(r11)
            r13 = 1
            r7[r13] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r11 = 2
            r7[r11] = r8
            long r11 = r9.field_snsId
            java.lang.String r8 = vr2.C102236a0.m134763p0(r11)
            r11 = 3
            r7[r11] = r8
            r8 = 4
            long r11 = r9.field_snsId
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r8] = r11
            r8 = 5
            int r11 = r9.getSourceType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r8] = r11
            r8 = 6
            int r11 = r9.localid
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r8] = r11
            java.lang.String r8 = "[SnsFeedInfo|c] key:%s createTime:%s[%s] snsId:[%s, %s] type:%s localId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            java.util.Map<java.lang.String, java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo>> r7 = r0.f279198h
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r7 = r7.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x01d7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Map<java.lang.String, java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo>> r8 = r0.f279198h
            r8.put(r5, r7)
        L_0x01d7:
            r7.add(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r2)
            goto L_0x01e0
        L_0x01de:
            r18 = r5
        L_0x01e0:
            r5 = r18
            r7 = 0
            r8 = 1
            goto L_0x00ef
        L_0x01e6:
            java.util.Map<java.lang.String, java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo>> r5 = r0.f279198h
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x01f2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0217
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            com.tencent.mm.plugin.sns.ui.album.a$c r8 = new com.tencent.mm.plugin.sns.ui.album.a$c
            r8.<init>()
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r8.f279179b = r9
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            r8.f279178a = r7
            r3.add(r8)
            goto L_0x01f2
        L_0x0217:
            r7 = 3
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            long r7 = r7.getId()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r5[r8] = r7
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 1
            r5[r7] = r4
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r5[r7] = r4
            java.lang.String r4 = "loadData thread: %d count: %d  realCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.album.C95725b.mo133173b():java.util.List");
    }

    /* renamed from: c */
    public void mo133174c(List<C95716a.C95719c> list) {
        SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        C95726a aVar = this.f279197g;
        if (aVar != null) {
            C95716a.C95717a aVar2 = (C95716a.C95717a) aVar;
            SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(list == null ? 0 : list.size());
            Log.m105925i("MicroMsg.SnsAlbumAdapter", "onLoadingFinish list.size=%s", objArr);
            ((ArrayList) C95716a.m122532F4(C95716a.this)).clear();
            C95716a.C95719c cVar = new C95716a.C95719c();
            cVar.f279179b = "my_timeline";
            ((ArrayList) C95716a.m122532F4(C95716a.this)).add(cVar);
            ((ArrayList) C95716a.m122532F4(C95716a.this)).addAll(list);
            C95716a aVar3 = C95716a.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            Iterator it = ((ArrayList) aVar3.f279163d).iterator();
            while (it.hasNext()) {
                ((C95716a.C95719c) it.next()).f279178a.size();
            }
            SnsMethodCalculate.markEndTimeMs("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (!list.isEmpty()) {
                C95716a.C95719c cVar2 = new C95716a.C95719c();
                cVar2.f279179b = "loading";
                ((ArrayList) C95716a.m122532F4(C95716a.this)).add(cVar2);
            }
            C95716a.this.notifyDataSetChanged();
            C95716a aVar4 = C95716a.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            C95716a.C95718b bVar = aVar4.f279176t;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (bVar != null) {
                C95716a aVar5 = C95716a.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                C95716a.C95718b bVar2 = aVar5.f279176t;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                SnsAlbumUI snsAlbumUI = (SnsAlbumUI) bVar2;
                snsAlbumUI.getClass();
                SnsMethodCalculate.markStartTimeMs("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                if (!list.isEmpty()) {
                    snsAlbumUI.f279151d.setVisibility(0);
                    snsAlbumUI.f279152e.setVisibility(8);
                } else {
                    snsAlbumUI.f279151d.setVisibility(8);
                    snsAlbumUI.f279152e.setVisibility(0);
                }
                SnsMethodCalculate.markEndTimeMs("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            }
            SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
        }
        SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
    }
}
