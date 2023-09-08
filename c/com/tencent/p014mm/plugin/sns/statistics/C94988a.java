package com.tencent.p014mm.plugin.sns.statistics;

import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsHeader;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.statistics.a */
public class C94988a {

    /* renamed from: a */
    public ListView f275580a;

    /* renamed from: b */
    public SnsHeader f275581b;

    /* renamed from: com.tencent.mm.plugin.sns.statistics.a$a */
    public static class C94989a {

        /* renamed from: a */
        public long f275582a;

        /* renamed from: b */
        public List<C94990b> f275583b;
    }

    /* renamed from: com.tencent.mm.plugin.sns.statistics.a$b */
    public static class C94990b {

        /* renamed from: a */
        public int f275584a;

        /* renamed from: b */
        public int f275585b;

        /* renamed from: c */
        public int f275586c;

        /* renamed from: d */
        public int f275587d;

        /* renamed from: e */
        public String f275588e;

        /* renamed from: f */
        public int f275589f;

        /* renamed from: g */
        public int f275590g;

        /* renamed from: h */
        public int f275591h;

        /* renamed from: i */
        public int f275592i;

        /* renamed from: j */
        public int f275593j;

        /* renamed from: k */
        public int f275594k;

        /* renamed from: l */
        public int f275595l;

        /* renamed from: m */
        public int f275596m;

        /* renamed from: n */
        public int f275597n;

        /* renamed from: o */
        public int f275598o;
    }

    /* renamed from: a */
    public void mo131395a(ListView listView, SnsHeader snsHeader) {
        SnsMethodCalculate.markStartTimeMs("setExt", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
        this.f275580a = listView;
        this.f275581b = snsHeader;
        SnsMethodCalculate.markEndTimeMs("setExt", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
    }
}
