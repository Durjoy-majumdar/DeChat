package com.tencent.p014mm.plugin.sns.p106ui;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import os2.C100400e0;
import te3.C101789j00;
import vr2.C102236a0;
import vr2.C102246h;

/* renamed from: com.tencent.mm.plugin.sns.ui.u5 */
public class C96236u5 extends C95772f<SnsInfo> {

    /* renamed from: c */
    public String f281214c = "";

    /* renamed from: d */
    public List<SnsInfo> f281215d = new ArrayList();

    /* renamed from: e */
    public boolean f281216e;

    /* renamed from: f */
    public int f281217f = 0;

    /* renamed from: g */
    public int f281218g = 0;

    /* renamed from: h */
    public String f281219h = "";

    /* renamed from: i */
    public boolean f281220i = false;

    /* renamed from: j */
    public C96238b f281221j;

    /* renamed from: k */
    public Comparator<SnsInfo> f281222k = new C96237a(this);

    /* renamed from: l */
    public C102246h f281223l;

    /* renamed from: com.tencent.mm.plugin.sns.ui.u5$a */
    public class C96237a implements Comparator<SnsInfo> {
        public C96237a(C96236u5 u5Var) {
        }

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            SnsInfo snsInfo = (SnsInfo) obj;
            SnsInfo snsInfo2 = (SnsInfo) obj2;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            int i = -1;
            if (snsInfo.localid == -1) {
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            } else if (snsInfo2.localid == -1) {
                i = 1;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            } else if (snsInfo.getHead() != snsInfo2.getHead()) {
                i = snsInfo2.getHead() - snsInfo.getHead();
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            } else if (snsInfo.getCreateTime() != snsInfo2.getCreateTime()) {
                i = snsInfo2.getCreateTime() - snsInfo.getCreateTime();
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            } else {
                i = 0;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            }
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.u5$b */
    public interface C96238b {
        /* renamed from: a */
        void mo133866a(boolean z);

        /* renamed from: b */
        void mo133867b(List<SnsInfo> list, Map<Integer, Integer> map, Map<Integer, Integer> map2, Map<Integer, Integer> map3, int i, int i2);
    }

    public C96236u5(C96238b bVar, String str, boolean z) {
        this.f281221j = bVar;
        this.f281214c = str;
        this.f281216e = z;
    }

    /* renamed from: b */
    public List<SnsInfo> mo133173b() {
        Cursor cursor;
        SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        String str = this.f281214c;
        boolean z = this.f281216e;
        String str2 = this.f281219h;
        boolean z2 = this.f281220i;
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("getSnsListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (z2) {
            C100400e0 Yx0 = C94866e1.Yx0();
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            cursor = Yx0.mo139801NQ(false, str, 10, z, str2, 0, 0);
            SnsMethodCalculate.markEndTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            C100400e0 Yx02 = C94866e1.Yx0();
            Yx02.getClass();
            SnsMethodCalculate.markStartTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            cursor = Yx02.mo139801NQ(false, str, 0, z, str2, 0, 0);
            SnsMethodCalculate.markEndTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        ArrayList arrayList = new ArrayList();
        if (cursor.getCount() == 0) {
            cursor.close();
            SnsMethodCalculate.markEndTimeMs("getSnsListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            if (cursor.moveToFirst()) {
                do {
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.convertFrom(cursor);
                    arrayList.add(snsInfo);
                } while (cursor.moveToNext());
            }
            cursor.close();
            SnsMethodCalculate.markEndTimeMs("getSnsListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        Log.m105925i("MicroMsg.SnsSelfHelper", "loadData thread: %d count: %d", Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(arrayList.size()));
        SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        return arrayList;
    }

    /* renamed from: c */
    public void mo133174c(List<SnsInfo> list) {
        SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        if (this.f281221j != null) {
            if (list != null) {
                mo133901d(true, list);
            }
            this.f281221j.mo133866a(true);
        }
        SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    /* renamed from: d */
    public final void mo133901d(boolean z, List<SnsInfo> list) {
        HashMap hashMap;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        List<SnsInfo> list2 = list;
        String str2 = "initFixType";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        this.f281223l = new C102246h();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        } else {
            if (this.f281216e) {
                SnsInfo snsInfo = new SnsInfo(0);
                snsInfo.field_snsId = 0;
                snsInfo.localid = -1;
                snsInfo.setCreateTime((int) (System.currentTimeMillis() / 1000));
                list2.add(0, snsInfo);
            }
            SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        }
        int size = list.size();
        String str3 = "MicroMsg.SnsSelfHelper";
        Log.m105918d(str3, "initFixType " + size);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < size) {
            SnsMethodCalculate.markStartTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            String str4 = str2;
            this.f281223l.mo141808a();
            long j = currentTimeMillis;
            if (!this.f281216e || i5 != 0) {
                int i9 = i5 + 1;
                if (i9 < size) {
                    SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo snsInfo2 = list2.get(i9);
                    SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo snsInfo3 = snsInfo2;
                    str = str3;
                    this.f281223l.f301118b = snsInfo3.getHead();
                    TimeLineObject timeLine = snsInfo3.getTimeLine();
                    hashMap = hashMap4;
                    this.f281223l.f301121e = timeLine.ContentDesc;
                    C94897n1.m120371i(snsInfo3.getLocalPrivate(), this.f281216e);
                    this.f281223l.f301119c = snsInfo3.getTypeFlag();
                    C101789j00 j002 = timeLine.ContentObj;
                    if (j002 != null) {
                        this.f281223l.f301120d = j002.f298427h.size();
                    } else {
                        this.f281223l.f301120d = 0;
                    }
                } else {
                    hashMap = hashMap4;
                    str = str3;
                }
                int i15 = i5 + 2;
                if (i15 < size) {
                    SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo snsInfo4 = list2.get(i15);
                    SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo snsInfo5 = snsInfo4;
                    this.f281223l.f301126j = snsInfo5.getHead();
                    TimeLineObject timeLine2 = snsInfo5.getTimeLine();
                    this.f281223l.f301122f = timeLine2.ContentDesc;
                    C94897n1.m120371i(snsInfo5.getLocalPrivate(), this.f281216e);
                    this.f281223l.f301127k = snsInfo5.getTypeFlag();
                    C101789j00 j003 = timeLine2.ContentObj;
                    if (j003 != null) {
                        this.f281223l.f301128l = j003.f298427h.size();
                    } else {
                        this.f281223l.f301128l = 0;
                    }
                }
                SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                SnsInfo snsInfo6 = list2.get(i5);
                SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                SnsInfo snsInfo7 = snsInfo6;
                this.f281223l.f301117a = snsInfo7.getHead();
                TimeLineObject timeLine3 = snsInfo7.getTimeLine();
                C102246h hVar = this.f281223l;
                hVar.f301123g = timeLine3.ContentDesc;
                hVar.f301124h = snsInfo7.getTypeFlag();
                C102246h hVar2 = this.f281223l;
                C94897n1.m120371i(snsInfo7.getLocalPrivate(), this.f281216e);
                hVar2.getClass();
                C101789j00 j004 = timeLine3.ContentObj;
                if (j004 != null) {
                    this.f281223l.f301125i = j004.f298427h.size();
                    i = 0;
                } else {
                    i = 0;
                    this.f281223l.f301125i = 0;
                }
                if (this.f281223l.mo141810c()) {
                    SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i2 = 1;
                } else if (this.f281223l.mo141811d()) {
                    SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i2 = 2;
                } else {
                    SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i2 = 3;
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                hashMap = hashMap4;
                str = str3;
                i2 = 1;
                i = 0;
            }
            hashMap2.put(Integer.valueOf(i6), Integer.valueOf(i7));
            hashMap3.put(Integer.valueOf(i6), Integer.valueOf(i2));
            i7 += i2;
            HashMap hashMap5 = hashMap;
            hashMap5.put(Integer.valueOf(i6), Integer.valueOf(i8));
            SnsMethodCalculate.markStartTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            if (!this.f281216e || i5 != 0) {
                if (i2 < 1 || this.f281223l.f301124h != 1) {
                    i4 = 2;
                    i3 = 0;
                } else {
                    i4 = 2;
                    i3 = 1;
                }
                if (i2 >= i4 && this.f281223l.f301119c == 1) {
                    i3++;
                }
                if (i2 >= 3 && this.f281223l.f301127k == 1) {
                    i3++;
                }
                i = i3;
                SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            } else {
                SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            }
            i8 += i;
            i5 += i2;
            i6++;
            hashMap4 = hashMap5;
            str2 = str4;
            currentTimeMillis = j;
            str3 = str;
        }
        String str5 = str2;
        long j2 = currentTimeMillis;
        HashMap hashMap6 = hashMap4;
        this.f281217f = i6;
        this.f281218g = list.size();
        Log.m105918d(str3, "icount " + this.f281217f);
        this.f281215d = list2;
        C102236a0.m134748i("SnsphotoAdapter initFixType ", j2);
        this.f281221j.mo133867b(this.f281215d, hashMap2, hashMap3, hashMap4, this.f281218g, this.f281217f);
        SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    /* renamed from: e */
    public final void mo133902e() {
        SnsMethodCalculate.markStartTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        mo133901d(false, this.f281215d);
        SnsMethodCalculate.markEndTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    /* renamed from: f */
    public void mo133903f() {
        SnsMethodCalculate.markStartTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        Collections.sort(this.f281215d, this.f281222k);
        SnsMethodCalculate.markEndTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }
}
