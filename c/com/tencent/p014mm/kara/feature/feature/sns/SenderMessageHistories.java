package com.tencent.p014mm.kara.feature.feature.sns;

import android.text.TextUtils;
import f30.C86704a;
import java.util.Calendar;
import java.util.Date;
import m30.C88694d;
import o30.C89112b;
import q30.C100976a;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories */
public class SenderMessageHistories extends C89112b {
    @C86704a
    public SenderTypeMessageHistories image;
    @C86704a
    public SenderTypeMessageHistories video;
    @C86704a
    public SenderTypeMessageHistories web;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories$SenderTypeMessageHistories */
    public class SenderTypeMessageHistories extends C89112b {
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

        public SenderTypeMessageHistories(String str, String str2, int i) {
            this.userName = str;
            this.groupName = str2;
            this.TYPE = i;
        }

        public void build() {
            super.build();
            if (!TextUtils.isEmpty(this.userName)) {
                C100976a aVar = C100976a.f295681e;
                long currentTimeMillis = System.currentTimeMillis();
                long b = C88694d.m110639b(currentTimeMillis);
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date(currentTimeMillis));
                int i = instance.get(11);
                int i2 = instance.get(7);
                long j = b;
                long j2 = currentTimeMillis;
                int i3 = i2;
                this.dayOfTheWeek_countThatHappened = aVar.mo140484d(this.userName, 1, this.TYPE, j, j2, i3);
                int d = aVar.mo140484d(this.userName, 2, this.TYPE, j, j2, i3);
                this.dayOfTheWeek_countThatRecalled = d;
                int i4 = this.dayOfTheWeek_countThatHappened;
                if (i4 > 0) {
                    this.dayOfTheWeek_proportionThatRecalled = ((float) d) / ((float) i4);
                }
                long j3 = b;
                long j4 = currentTimeMillis;
                int i5 = i;
                this.hourOfTheDay_countThatHappened = aVar.mo140485e(this.userName, 1, this.TYPE, j3, j4, i5);
                int e = aVar.mo140485e(this.userName, 2, this.TYPE, j3, j4, i5);
                this.hourOfTheDay_countThatRecalled = e;
                int i6 = this.hourOfTheDay_countThatHappened;
                if (i6 > 0) {
                    this.hourOfTheDay_proportionThatRecalled = ((float) e) / ((float) i6);
                }
                long j5 = b;
                long j6 = currentTimeMillis;
                int i7 = i2;
                int i8 = i;
                this.hourOfTheWeekAndDay_countThatHappened = aVar.mo140483c(this.userName, 1, this.TYPE, j5, j6, i7, i8);
                int c = aVar.mo140483c(this.userName, 2, this.TYPE, j5, j6, i7, i8);
                this.hourOfTheWeekAndDay_countThatRecalled = c;
                int i9 = this.hourOfTheWeekAndDay_countThatHappened;
                if (i9 > 0) {
                    this.hourOfTheWeekAndDay_proportionThatRecalled = ((float) c) / ((float) i9);
                }
                long j7 = b;
                long j8 = currentTimeMillis;
                this.total_countThatHappened = aVar.mo140482b(this.userName, 1, this.TYPE, j7, j8);
                int b2 = aVar.mo140482b(this.userName, 2, this.TYPE, j7, j8);
                this.total_countThatRecalled = b2;
                int i15 = this.total_countThatHappened;
                if (i15 > 0) {
                    this.total_proportionThatRecalled = ((float) b2) / ((float) i15);
                }
            }
        }

        public String getName() {
            return this.groupName;
        }
    }

    public SenderMessageHistories(String str) {
        this.image = new SenderTypeMessageHistories(str, "image", 1);
        this.video = new SenderTypeMessageHistories(str, "video", 2);
        this.web = new SenderTypeMessageHistories(str, "webview", 3);
    }

    public String getName() {
        return "sender_messageHistories";
    }
}
