package com.tencent.p014mm.kara.feature.feature.sns;

import f30.C86704a;
import java.util.Calendar;
import java.util.Date;
import m30.C88694d;
import o30.C89112b;
import q30.C100992k0;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup */
public class HistoriesOfWeishangFeatureGroup extends C89112b {
    @C86704a
    public WeishangWebviewFeatureGroup image = new WeishangWebviewFeatureGroup("image", 1);
    @C86704a
    public WeishangWebviewFeatureGroup video = new WeishangWebviewFeatureGroup("video", 15);
    @C86704a
    public WeishangWebviewFeatureGroup webview = new WeishangWebviewFeatureGroup("webview", 3);

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup$WeishangWebviewFeatureGroup */
    public class WeishangWebviewFeatureGroup extends C89112b {
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

        public WeishangWebviewFeatureGroup(String str, int i) {
            this.groupName = str;
            this.TYPE = i;
        }

        public void build() {
            super.build();
            long currentTimeMillis = System.currentTimeMillis();
            long b = C88694d.m110639b(currentTimeMillis);
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(currentTimeMillis));
            int i = instance.get(11);
            int i2 = instance.get(7);
            C100992k0 k0Var = C100992k0.f295710e;
            long j = b;
            long j2 = currentTimeMillis;
            this.total_countThatHappened = k0Var.mo140498n(11, this.TYPE, j, j2);
            int n = k0Var.mo140498n(12, this.TYPE, j, j2);
            this.total_countThatRecalled = n;
            int i3 = this.total_countThatHappened;
            if (i3 > 0) {
                this.total_proportionThatRecalled = ((float) n) / ((float) i3);
            }
            long j3 = b;
            long j4 = currentTimeMillis;
            int i4 = i2;
            this.dayOfTheWeek_countThatHappened = k0Var.mo140500p(11, this.TYPE, j3, j4, i4);
            int p = k0Var.mo140500p(12, this.TYPE, j3, j4, i4);
            this.dayOfTheWeek_countThatRecalled = p;
            int i5 = this.dayOfTheWeek_countThatHappened;
            if (i5 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = ((float) p) / ((float) i5);
            }
            long j5 = b;
            long j6 = currentTimeMillis;
            int i6 = i;
            this.hourOfTheDay_countThatHappened = k0Var.mo140501q(11, this.TYPE, j5, j6, i6);
            int q = k0Var.mo140501q(12, this.TYPE, j5, j6, i6);
            this.hourOfTheDay_countThatRecalled = q;
            int i7 = this.hourOfTheDay_countThatHappened;
            if (i7 > 0) {
                this.hourOfTheDay_proportionThatRecalled = ((float) q) / ((float) i7);
            }
            long j7 = b;
            long j8 = currentTimeMillis;
            int i8 = i2;
            int i9 = i;
            this.hourOfTheWeekAndDay_countThatHappened = k0Var.mo140499o(11, this.TYPE, j7, j8, i8, i9);
            int o = k0Var.mo140499o(12, this.TYPE, j7, j8, i8, i9);
            this.hourOfTheWeekAndDay_countThatRecalled = o;
            int i15 = this.hourOfTheWeekAndDay_countThatHappened;
            if (i15 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = ((float) o) / ((float) i15);
            }
        }

        public String getName() {
            return this.groupName;
        }
    }

    public String getName() {
        return "historiesOfWeishang";
    }
}
