package com.tencent.p014mm.kara.feature.feature.sns;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import f30.C86704a;
import java.util.Calendar;
import java.util.Date;
import m30.C88694d;
import o30.C89112b;
import os2.C100400e0;
import q30.C100992k0;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories */
public class SenderSnsHistories extends C89112b {
    @C86704a
    public SenderTypeSnsHistories image;
    @C86704a
    public SenderTypeSnsHistories video;
    @C86704a
    public SenderTypeSnsHistories web;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories$SenderTypeSnsHistories */
    public class SenderTypeSnsHistories extends C89112b {
        private final int TYPE;
        @C86704a
        public int dayOfTheWeek_countThatHappened;
        @C86704a
        public int dayOfTheWeek_countThatRecalled;
        @C86704a
        public float dayOfTheWeek_proportionThatRecalled;
        private String groupName;
        @C86704a
        public int hourOfTheDay_countThatHappened;
        @C86704a
        public int hourOfTheDay_countThatRecalled;
        @C86704a
        public float hourOfTheDay_proportionThatRecalled;
        @C86704a
        public int hourOfTheWeekAndDay_countThatHappened;
        @C86704a
        public int hourOfTheWeekAndDay_countThatRecalled;
        @C86704a
        public float hourOfTheWeekAndDay_proportionThatRecalled;
        @C86704a
        public int total_countThatHappened;
        @C86704a
        public int total_countThatRecalled;
        @C86704a
        public float total_proportionThatRecalled;
        private String userName;

        public SenderTypeSnsHistories(String str, String str2, int i) {
            this.userName = str;
            this.groupName = str2;
            this.TYPE = i;
        }

        public void build() {
            super.build();
            if (!TextUtils.isEmpty(this.userName)) {
                C100992k0 k0Var = C100992k0.f295710e;
                long currentTimeMillis = System.currentTimeMillis();
                long b = C88694d.m110639b(currentTimeMillis);
                C100400e0 Yx0 = C94866e1.Yx0();
                String str = this.userName;
                Yx0.getClass();
                SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                Cursor NQ = Yx0.mo139801NQ(true, str, 0, false, "", (int) (b / 1000), (int) (currentTimeMillis / 1000));
                SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date(currentTimeMillis));
                int i = instance.get(11);
                int i2 = instance.get(7);
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i15 = 0;
                while (NQ.moveToNext()) {
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.convertFrom(NQ);
                    if (snsInfo.isValid()) {
                        SnsInfo snsInfo2 = snsInfo;
                        int i16 = i3;
                        int i17 = i4;
                        int i18 = i5;
                        int i19 = i6;
                        long j = b;
                        int i25 = i8;
                        long j2 = currentTimeMillis;
                        Cursor cursor = NQ;
                        int i26 = i15;
                        int i27 = i2;
                        int g = i26 + k0Var.mo140491g(snsInfo.getSnsId(), 11, this.TYPE, j, j2, i27);
                        int g2 = i25 + k0Var.mo140491g(snsInfo2.getSnsId(), 12, this.TYPE, j, j2, i27);
                        int i28 = i;
                        int i29 = i9;
                        int i35 = i29 + k0Var.mo140493i(snsInfo2.getSnsId(), 11, this.TYPE, j, currentTimeMillis, i28);
                        long j3 = currentTimeMillis;
                        int i36 = i19 + k0Var.mo140493i(snsInfo2.getSnsId(), 12, this.TYPE, j, j3, i28);
                        int i37 = i;
                        int i38 = i7;
                        int e = i38 + k0Var.mo140489e(snsInfo2.getSnsId(), 11, this.TYPE, b, j3, i28, i37);
                        long j4 = b;
                        int e2 = i18 + k0Var.mo140489e(snsInfo2.getSnsId(), 12, this.TYPE, j4, j3, i28, i37);
                        int i39 = i17;
                        int c = i39 + k0Var.mo140487c(snsInfo2.getSnsId(), 11, this.TYPE, j4, j3);
                        i3 = i16 + k0Var.mo140487c(snsInfo2.getSnsId(), 12, this.TYPE, j4, j3);
                        i5 = e2;
                        i4 = c;
                        NQ = cursor;
                        i15 = g;
                        i8 = g2;
                        i9 = i35;
                        i6 = i36;
                        i7 = e;
                    }
                }
                Cursor cursor2 = NQ;
                int i44 = i15;
                cursor2.close();
                this.dayOfTheWeek_countThatHappened = i44;
                this.dayOfTheWeek_countThatRecalled = i8;
                this.hourOfTheDay_countThatHappened = i9;
                this.hourOfTheDay_countThatRecalled = i6;
                this.hourOfTheWeekAndDay_countThatHappened = i7;
                this.hourOfTheWeekAndDay_countThatRecalled = i5;
                this.total_countThatHappened = i4;
                this.total_countThatRecalled = i3;
                if (i44 > 0) {
                    this.dayOfTheWeek_proportionThatRecalled = ((float) i8) / ((float) i44);
                }
                if (i9 > 0) {
                    this.hourOfTheDay_proportionThatRecalled = ((float) i6) / ((float) i9);
                }
                if (i7 > 0) {
                    this.hourOfTheWeekAndDay_proportionThatRecalled = ((float) i5) / ((float) i7);
                }
                if (i4 > 0) {
                    this.total_proportionThatRecalled = ((float) i3) / ((float) i4);
                }
            }
        }

        public String getName() {
            return this.groupName;
        }
    }

    public SenderSnsHistories(String str) {
        this.image = new SenderTypeSnsHistories(str, "image", 1);
        this.video = new SenderTypeSnsHistories(str, "video", 15);
        this.web = new SenderTypeSnsHistories(str, "webview", 3);
    }

    public String getName() {
        return "sender_momentHistories";
    }
}
