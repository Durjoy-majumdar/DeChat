package com.tencent.p014mm.kara.feature.feature.sns;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import eb0.C75592q0;
import f30.C86704a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o30.C89112b;
import os2.C100400e0;
import q30.C100992k0;
import te3.w64;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMomentsFeatureGroup */
public class SenderMomentsFeatureGroup extends C89112b {
    @C86704a
    public int count;
    @C86704a
    public int countICommented;
    @C86704a
    public int countILiked;
    @C86704a
    public float proportionICommented;
    @C86704a
    public float proportionILiked;
    private String sender;

    public SenderMomentsFeatureGroup(String str) {
        this.sender = str;
    }

    public void build() {
        super.build();
        if (!TextUtils.isEmpty(this.sender)) {
            C100992k0 k0Var = C100992k0.f295710e;
            String str = this.sender;
            int i = C94897n1.f274990d;
            SnsMethodCalculate.markStartTimeMs("getSnsInfoListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            ArrayList arrayList = new ArrayList();
            C100400e0 Yx0 = C94866e1.Yx0();
            int i2 = 0;
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Cursor NQ = Yx0.mo139801NQ(false, str, -1, false, "", 0, 0);
            SnsMethodCalculate.markEndTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (NQ.getCount() == 0) {
                NQ.close();
                SnsMethodCalculate.markEndTimeMs("getSnsInfoListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                if (NQ.moveToFirst()) {
                    do {
                        SnsInfo snsInfo = new SnsInfo();
                        snsInfo.convertFrom(NQ);
                        arrayList.add(snsInfo);
                    } while (NQ.moveToNext());
                }
                NQ.close();
                SnsMethodCalculate.markEndTimeMs("getSnsInfoListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
            String s = C75592q0.m90789s();
            this.count = arrayList.size();
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                SnsInfo snsInfo2 = (SnsInfo) it.next();
                if (snsInfo2 != null) {
                    SnsObject e = C94897n1.m120367e(snsInfo2);
                    LinkedList<w64> linkedList = e.CommentUserList;
                    if (linkedList != null && linkedList.contains(s)) {
                        i2++;
                    }
                    LinkedList<w64> linkedList2 = e.LikeUserList;
                    if (linkedList2 != null && linkedList2.contains(s)) {
                        i3++;
                    }
                }
            }
            this.countICommented = i2;
            this.countILiked = i3;
            int i4 = this.count;
            if (i4 > 0) {
                float f = (float) i4;
                this.proportionICommented = ((float) i2) / f;
                this.proportionILiked = ((float) i3) / f;
            }
        }
    }

    public String getName() {
        return "sender_itsMoments";
    }
}
