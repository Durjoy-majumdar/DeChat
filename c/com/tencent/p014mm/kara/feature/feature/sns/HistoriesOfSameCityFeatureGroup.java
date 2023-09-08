package com.tencent.p014mm.kara.feature.feature.sns;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import f30.C86704a;
import java.util.Calendar;
import java.util.Date;
import m30.C88694d;
import o30.C89112b;
import q30.C100992k0;
import te3.C101802kr2;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup */
public class HistoriesOfSameCityFeatureGroup extends C89112b {
    @C86704a
    public SameCityHabitsFeatureGroup image;
    @C86704a
    public SameCityHabitsFeatureGroup video;
    @C86704a
    public SameCityHabitsFeatureGroup webview;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup$SameCityHabitsFeatureGroup */
    public class SameCityHabitsFeatureGroup extends C89112b {
        private final int TYPE;
        private String city;
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

        public SameCityHabitsFeatureGroup(String str, int i, String str2) {
            this.groupName = str;
            this.TYPE = i;
            this.city = str2;
        }

        public void build() {
            super.build();
            if (!TextUtils.isEmpty(this.city)) {
                long currentTimeMillis = System.currentTimeMillis();
                long b = C88694d.m110639b(currentTimeMillis);
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date(currentTimeMillis));
                int i = instance.get(11);
                int i2 = instance.get(7);
                C100992k0 k0Var = C100992k0.f295710e;
                long j = b;
                long j2 = currentTimeMillis;
                this.total_countThatHappened = k0Var.mo140494j(11, this.TYPE, j, j2, this.city);
                int j3 = k0Var.mo140494j(12, this.TYPE, j, j2, this.city);
                this.total_countThatRecalled = j3;
                int i3 = this.total_countThatHappened;
                if (i3 > 0) {
                    this.total_proportionThatRecalled = ((float) j3) / ((float) i3);
                }
                long j4 = b;
                long j5 = currentTimeMillis;
                int i4 = i2;
                this.dayOfTheWeek_countThatHappened = k0Var.mo140496l(11, this.TYPE, j4, j5, i4, this.city);
                int l = k0Var.mo140496l(12, this.TYPE, j4, j5, i4, this.city);
                this.dayOfTheWeek_countThatRecalled = l;
                int i5 = this.dayOfTheWeek_countThatHappened;
                if (i5 > 0) {
                    this.dayOfTheWeek_proportionThatRecalled = ((float) l) / ((float) i5);
                }
                long j6 = b;
                long j7 = currentTimeMillis;
                int i6 = i;
                this.hourOfTheDay_countThatHappened = k0Var.mo140497m(11, this.TYPE, j6, j7, i6, this.city);
                int m = k0Var.mo140497m(12, this.TYPE, j6, j7, i6, this.city);
                this.hourOfTheDay_countThatRecalled = m;
                int i7 = this.hourOfTheDay_countThatHappened;
                if (i7 > 0) {
                    this.hourOfTheDay_proportionThatRecalled = ((float) m) / ((float) i7);
                }
                long j8 = b;
                long j9 = currentTimeMillis;
                int i8 = i2;
                int i9 = i;
                this.hourOfTheWeekAndDay_countThatHappened = k0Var.mo140495k(11, this.TYPE, j8, j9, i8, i9, this.city);
                int k = k0Var.mo140495k(12, this.TYPE, j8, j9, i8, i9, this.city);
                this.hourOfTheWeekAndDay_countThatRecalled = k;
                int i15 = this.hourOfTheWeekAndDay_countThatHappened;
                if (i15 > 0) {
                    this.hourOfTheWeekAndDay_proportionThatRecalled = ((float) k) / ((float) i15);
                }
            }
        }

        public String getName() {
            return this.groupName;
        }
    }

    public HistoriesOfSameCityFeatureGroup(SnsInfo snsInfo) {
        C101802kr2 kr22;
        String str;
        TimeLineObject timeLine = snsInfo.getTimeLine();
        String str2 = "";
        if (!(timeLine == null || (kr22 = timeLine.Location) == null || (str = kr22.f298649f) == null)) {
            str2 = str;
        }
        str2 = str2.endsWith("市") ? str2.substring(0, str2.length() - 1) : str2;
        this.image = new SameCityHabitsFeatureGroup("image", 1, str2);
        this.video = new SameCityHabitsFeatureGroup("video", 15, str2);
        this.webview = new SameCityHabitsFeatureGroup("webview", 3, str2);
    }

    public String getName() {
        return "historiesOfSameCity";
    }
}
