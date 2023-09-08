package com.tencent.p014mm.plugin.sns.p106ui;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.C96236u5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import te3.C101789j00;
import vr2.C102236a0;
import vr2.C102246h;

/* renamed from: com.tencent.mm.plugin.sns.ui.v5 */
public class C96245v5 extends C95772f<SnsInfo> {

    /* renamed from: c */
    public boolean f281232c = false;

    /* renamed from: d */
    public List<SnsInfo> f281233d = new ArrayList();

    /* renamed from: e */
    public int f281234e = 0;

    /* renamed from: f */
    public int f281235f = 0;

    /* renamed from: g */
    public C102246h f281236g;

    /* renamed from: h */
    public boolean f281237h = false;

    /* renamed from: i */
    public C96236u5.C96238b f281238i;

    /* renamed from: j */
    public Comparator<SnsInfo> f281239j = new C96246a(this);

    /* renamed from: com.tencent.mm.plugin.sns.ui.v5$a */
    public class C96246a implements Comparator<SnsInfo> {
        public C96246a(C96245v5 v5Var) {
        }

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            SnsInfo snsInfo = (SnsInfo) obj;
            SnsInfo snsInfo2 = (SnsInfo) obj2;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            int i = -1;
            if (snsInfo.localid == -1) {
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            } else if (snsInfo2.localid == -1) {
                i = 1;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            } else if (snsInfo.getHead() != snsInfo2.getHead()) {
                i = snsInfo2.getHead() - snsInfo.getHead();
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            } else if (snsInfo.getCreateTime() != snsInfo2.getCreateTime()) {
                i = snsInfo2.getCreateTime() - snsInfo.getCreateTime();
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            } else {
                i = 0;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            }
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            return i;
        }
    }

    public C96245v5(C96236u5.C96238b bVar, String str, boolean z) {
        this.f281238i = bVar;
        this.f281232c = z;
    }

    /* renamed from: b */
    public List<SnsInfo> mo133173b() {
        SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        String p0 = C102236a0.m134763p0(C94897n1.f274987a);
        String p05 = C102236a0.m134763p0(C94897n1.f274988b);
        SnsMethodCalculate.markStartTimeMs("getUserSearchList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        Cursor fY = C94866e1.Yx0().mo139819fY(p0, p05);
        ArrayList arrayList = new ArrayList();
        if (fY.getCount() == 0) {
            fY.close();
            SnsMethodCalculate.markEndTimeMs("getUserSearchList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            if (fY.moveToFirst()) {
                do {
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.convertFrom(fY);
                    arrayList.add(snsInfo);
                } while (fY.moveToNext());
            }
            fY.close();
            SnsMethodCalculate.markEndTimeMs("getUserSearchList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        Log.m105925i("MicroMsg.SnsSelfAdapterSearchHelper", "loadData thread: %d count: %d", Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(arrayList.size()));
        SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        return arrayList;
    }

    /* renamed from: c */
    public void mo133174c(List<SnsInfo> list) {
        SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        if (this.f281238i != null) {
            if (list != null) {
                mo133911d(this.f281237h, list);
            }
            this.f281238i.mo133866a(true);
        }
        SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }

    /* renamed from: d */
    public final void mo133911d(boolean z, List<SnsInfo> list) {
        String str;
        HashMap hashMap;
        int i;
        int i2;
        List<SnsInfo> list2 = list;
        String str2 = "initFixType";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        this.f281236g = new C102246h();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        } else {
            if (this.f281232c) {
                SnsInfo snsInfo = new SnsInfo(0);
                snsInfo.field_snsId = 0;
                snsInfo.localid = -1;
                snsInfo.setCreateTime((int) (System.currentTimeMillis() / 1000));
                list2.add(0, snsInfo);
            }
            SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        }
        int size = list.size();
        String str3 = "MicroMsg.SnsSelfAdapterSearchHelper";
        Log.m105918d(str3, "initFixType " + size);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            SnsMethodCalculate.markStartTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            String str4 = str2;
            this.f281236g.mo141808a();
            int i7 = i3 + 1;
            long j = currentTimeMillis;
            if (i7 < size) {
                SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                SnsInfo snsInfo2 = list2.get(i7);
                SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                SnsInfo snsInfo3 = snsInfo2;
                str = str3;
                this.f281236g.f301118b = snsInfo3.getHead();
                TimeLineObject timeLine = snsInfo3.getTimeLine();
                hashMap = hashMap4;
                this.f281236g.f301121e = timeLine.ContentDesc;
                C94897n1.m120371i(snsInfo3.getLocalPrivate(), this.f281232c);
                this.f281236g.f301119c = snsInfo3.getTypeFlag();
                C101789j00 j002 = timeLine.ContentObj;
                if (j002 != null) {
                    this.f281236g.f301120d = j002.f298427h.size();
                } else {
                    this.f281236g.f301120d = 0;
                }
            } else {
                hashMap = hashMap4;
                str = str3;
            }
            int i8 = i3 + 2;
            if (i8 < size) {
                SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                SnsInfo snsInfo4 = list2.get(i8);
                SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                SnsInfo snsInfo5 = snsInfo4;
                this.f281236g.f301126j = snsInfo5.getHead();
                TimeLineObject timeLine2 = snsInfo5.getTimeLine();
                this.f281236g.f301122f = timeLine2.ContentDesc;
                C94897n1.m120371i(snsInfo5.getLocalPrivate(), this.f281232c);
                this.f281236g.f301127k = snsInfo5.getTypeFlag();
                C101789j00 j003 = timeLine2.ContentObj;
                if (j003 != null) {
                    this.f281236g.f301128l = j003.f298427h.size();
                } else {
                    this.f281236g.f301128l = 0;
                }
            }
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            SnsInfo snsInfo6 = list2.get(i3);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            SnsInfo snsInfo7 = snsInfo6;
            this.f281236g.f301117a = snsInfo7.getHead();
            TimeLineObject timeLine3 = snsInfo7.getTimeLine();
            C102246h hVar = this.f281236g;
            hVar.f301123g = timeLine3.ContentDesc;
            hVar.f301124h = snsInfo7.getTypeFlag();
            C102246h hVar2 = this.f281236g;
            C94897n1.m120371i(snsInfo7.getLocalPrivate(), this.f281232c);
            hVar2.getClass();
            C101789j00 j004 = timeLine3.ContentObj;
            if (j004 != null) {
                this.f281236g.f301125i = j004.f298427h.size();
            } else {
                this.f281236g.f301125i = 0;
            }
            if (this.f281236g.mo141810c()) {
                SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i = 1;
            } else if (this.f281236g.mo141811d()) {
                SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i = 2;
            } else {
                SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i = 3;
            }
            hashMap2.put(Integer.valueOf(i4), Integer.valueOf(i5));
            hashMap3.put(Integer.valueOf(i4), Integer.valueOf(i));
            i5 += i;
            HashMap hashMap5 = hashMap;
            hashMap5.put(Integer.valueOf(i4), Integer.valueOf(i6));
            SnsMethodCalculate.markStartTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            if (!this.f281232c || i3 != 0) {
                int i9 = (i < 1 || this.f281236g.f301124h != 1) ? 0 : 1;
                if (i >= 2 && this.f281236g.f301119c == 1) {
                    i9++;
                }
                if (i >= 3 && this.f281236g.f301127k == 1) {
                    i9++;
                }
                SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i2 = i9;
            } else {
                SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i2 = 0;
            }
            i6 += i2;
            i3 += i;
            i4++;
            str3 = str;
            hashMap4 = hashMap5;
            str2 = str4;
            currentTimeMillis = j;
        }
        String str5 = str2;
        long j2 = currentTimeMillis;
        HashMap hashMap6 = hashMap4;
        this.f281234e = i4;
        this.f281235f = list.size();
        Log.m105918d(str3, "icount " + this.f281234e);
        this.f281233d = list2;
        C102236a0.m134748i("SnsphotoAdapter initFixType ", j2);
        this.f281238i.mo133867b(this.f281233d, hashMap2, hashMap3, hashMap4, this.f281235f, this.f281234e);
        SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }
}
