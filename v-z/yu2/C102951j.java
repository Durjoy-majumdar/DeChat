package yu2;

import android.database.Cursor;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C95772f;
import com.tencent.p014mm.plugin.sns.p106ui.C96315x6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import os2.C100400e0;
import sx3.C110818d0;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: yu2.j */
public final class C102951j extends C95772f<C102944e0> {

    /* renamed from: c */
    public final C102952a f303839c;

    /* renamed from: d */
    public final String f303840d;

    /* renamed from: e */
    public final boolean f303841e;

    /* renamed from: f */
    public final LinkedList<String> f303842f = new LinkedList<>();

    /* renamed from: g */
    public String f303843g = "";

    /* renamed from: h */
    public String f303844h = "";

    /* renamed from: yu2.j$a */
    public interface C102952a {
        /* renamed from: a */
        void mo142665a(List<C102944e0> list);

        /* renamed from: b */
        void mo142666b(String str);
    }

    public C102951j(C102952a aVar, String str, boolean z) {
        C87412m.m108594g(str, "mUserName");
        this.f303839c = aVar;
        this.f303840d = str;
        this.f303841e = z;
    }

    /* renamed from: b */
    public List<C102944e0> mo133173b() {
        String str;
        Object obj;
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        C101789j00 j003;
        LinkedList<C101804kv2> linkedList2;
        SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        LinkedList linkedList3 = new LinkedList();
        String str2 = this.f303840d;
        boolean z = this.f303841e;
        String str3 = this.f303843g;
        String str4 = this.f303844h;
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("getSnsListForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        C100400e0 Yx0 = C94866e1.Yx0();
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("getCursorByUserNameLimitSeqInterval", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markStartTimeMs("getMediaSqlIncludePrivacy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str5 = ("select *,rowid from SnsInfo " + Yx0.mo139802Ow(str2, z)) + " AND type in ( 1 , 15)";
        SnsMethodCalculate.markEndTimeMs("getMediaSqlIncludePrivacy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (Yx0.zs0(str3)) {
            str5 = str5 + " AND " + Yx0.mo139831uP(str3);
        }
        if (Yx0.zs0(str4)) {
            str5 = str5 + " AND " + Yx0.mo139827nP(str4);
        }
        if (z) {
            str = str5 + C100400e0.f294098q;
        } else {
            str = str5 + C100400e0.f294099r;
        }
        String str6 = str + " LIMIT " + 10;
        Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorByUserNameLimitSeqInterval in gallery " + str6);
        Cursor rawQuery = Yx0.f294108d.rawQuery(str6, (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursorByUserNameLimitSeqInterval", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        ArrayList<SnsInfo> arrayList = new ArrayList<>();
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getSnsListForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            if (rawQuery.moveToFirst()) {
                do {
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.convertFrom(rawQuery);
                    arrayList.add(snsInfo);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getSnsListForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("to loadData limitSeq: [");
        sb.append(this.f303843g);
        sb.append(',');
        sb.append(this.f303844h);
        sb.append("], pull all type snsInfo count:");
        sb.append(arrayList.size());
        sb.append(" , minSnsId = ");
        SnsInfo snsInfo2 = (SnsInfo) C110818d0.m150925W(arrayList);
        long j = 0;
        sb.append(snsInfo2 != null ? snsInfo2.field_snsId : 0);
        Log.m105924i("MicroMsg.SnsAlbumPickerListAdapterHelper", sb.toString());
        if (!arrayList.isEmpty()) {
            SnsInfo snsInfo3 = (SnsInfo) C110818d0.m150925W(arrayList);
            if (snsInfo3 != null) {
                j = snsInfo3.field_snsId;
            }
            String p0 = C102236a0.m134763p0(j);
            C87412m.m108593f(p0, "longToFullString(snsInfo…Null()?.field_snsId ?:0L)");
            this.f303843g = p0;
            C102952a aVar = this.f303839c;
            if (aVar != null) {
                aVar.mo142666b(p0);
            }
        }
        for (SnsInfo snsInfo4 : arrayList) {
            C87412m.m108593f(snsInfo4, "info");
            SnsMethodCalculate.markStartTimeMs("checkSnsInfoMediaType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
            int i2 = snsInfo4.field_type;
            boolean z2 = false;
            if (i2 == 1 || i2 == 15) {
                TimeLineObject timeLine = snsInfo4.getTimeLine();
                if ((timeLine == null || (j003 = timeLine.ContentObj) == null || (linkedList2 = j003.f298427h) == null || true != (linkedList2.isEmpty() ^ true)) ? false : true) {
                    z2 = true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkSnsInfoMediaType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
            if (z2) {
                long createTime = ((long) snsInfo4.getCreateTime()) * 1000;
                Map<String, List<String>> map = C96315x6.f281690a;
                SnsMethodCalculate.markStartTimeMs("formatTimeInSnsAlbumPicker", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                if (C96315x6.m123543i(createTime)) {
                    obj = MMApplicationContext.getContext().getResources().getString(C0966R.string.ezr);
                    SnsMethodCalculate.markEndTimeMs("formatTimeInSnsAlbumPicker", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                } else if (C96315x6.m123542h(createTime)) {
                    obj = MMApplicationContext.getContext().getResources().getString(C0966R.string.eys);
                    SnsMethodCalculate.markEndTimeMs("formatTimeInSnsAlbumPicker", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                } else {
                    obj = DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.jas), createTime);
                    SnsMethodCalculate.markEndTimeMs("formatTimeInSnsAlbumPicker", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                }
                String obj2 = obj.toString();
                if (!this.f303842f.contains(obj2)) {
                    this.f303842f.add(obj2);
                    SnsMethodCalculate.markStartTimeMs("createSnsPickerTimeHeader", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                    C87412m.m108594g(obj2, "timeLabelString");
                    SnsInfo snsInfo5 = new SnsInfo();
                    snsInfo5.setCreateTime(-1);
                    snsInfo5.setTypeFlag(-1);
                    C101804kv2 kv22 = new C101804kv2();
                    kv22.f298689d = "-1";
                    kv22.f298697o = obj2;
                    C102944e0 e0Var = new C102944e0(snsInfo5, kv22);
                    SnsMethodCalculate.markEndTimeMs("createSnsPickerTimeHeader", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                    linkedList3.add(e0Var);
                }
                TimeLineObject timeLine2 = snsInfo4.getTimeLine();
                if (!(timeLine2 == null || (j002 = timeLine2.ContentObj) == null || (linkedList = j002.f298427h) == null)) {
                    for (C101804kv2 kv23 : linkedList) {
                        if (kv23.f298690e == 6) {
                            float f = 0.0f;
                            if (kv23.f298684R <= 0.0f) {
                                String str7 = kv23.f298689d;
                                String T = C102236a0.m134725T(kv23);
                                Map<String, String> map2 = C94938q1.f275149a;
                                SnsMethodCalculate.markStartTimeMs("getFullSnsMediaFileCachePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                                SnsMethodCalculate.markEndTimeMs("getFullSnsMediaFileCachePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                                C94554a c = C94555d.m119567c(C94938q1.m120518e(C94866e1.m120262YO(), str7).replace("MicroMsg", XWalkPlugin.PRIVATE_CACHE_DIR_NAME) + T, true);
                                if (c != null) {
                                    f = (float) c.f273443a;
                                }
                                kv23.f298684R = f / 1000.0f;
                            }
                        }
                        linkedList3.add(new C102944e0(snsInfo4, kv23));
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return linkedList3;
    }

    /* renamed from: c */
    public void mo133174c(List<C102944e0> list) {
        SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        C87412m.m108594g(list, "list");
        C102952a aVar = this.f303839c;
        if (aVar != null) {
            aVar.mo142665a(list);
        }
        SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
    }

    /* renamed from: d */
    public final boolean mo142674d(C102944e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        C87412m.m108594g(e0Var, "info");
        boolean z = C87412m.m108589b(e0Var.mo142659b().f298689d, "-4") && e0Var.mo142658a().getCreateTime() == -4 && e0Var.mo142658a().getTypeFlag() == -4;
        SnsMethodCalculate.markEndTimeMs("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z;
    }

    /* renamed from: e */
    public final boolean mo142675e(C102944e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        C87412m.m108594g(e0Var, "info");
        boolean z = C87412m.m108589b(e0Var.mo142659b().f298689d, "-1") && e0Var.mo142658a().getCreateTime() == -1 && e0Var.mo142658a().getTypeFlag() == -1;
        SnsMethodCalculate.markEndTimeMs("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z;
    }
}
