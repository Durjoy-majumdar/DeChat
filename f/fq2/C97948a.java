package fq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fq2.a */
public class C97948a {

    /* renamed from: a */
    public String f287287a;

    /* renamed from: b */
    public final List<C97950b> f287288b = new ArrayList();

    /* renamed from: fq2.a$a */
    public static class C97949a {

        /* renamed from: a */
        public String f287289a;

        /* renamed from: b */
        public String f287290b;

        /* renamed from: c */
        public String f287291c;

        /* renamed from: d */
        public int f287292d;

        /* renamed from: e */
        public int f287293e;

        /* renamed from: f */
        public int f287294f;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel$MediaInfo");
            String str = "MediaInfo{mid='" + this.f287289a + '\'' + ", url='" + this.f287290b + '\'' + ", thumb='" + this.f287291c + '\'' + ", width=" + this.f287292d + ", height=" + this.f287293e + ", totalSize=" + this.f287294f + '}';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel$MediaInfo");
            return str;
        }
    }

    /* renamed from: fq2.a$b */
    public static class C97950b {

        /* renamed from: a */
        public String f287295a;

        /* renamed from: b */
        public String f287296b;

        /* renamed from: c */
        public String f287297c;

        /* renamed from: d */
        public String f287298d;

        /* renamed from: e */
        public String f287299e;

        /* renamed from: f */
        public String f287300f;

        /* renamed from: g */
        public C97949a f287301g;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel$TopicResInfo");
            String str = "TopicResInfo{avatar='" + this.f287295a + '\'' + ", nickname='" + this.f287296b + '\'' + ", tag='" + this.f287297c + '\'' + ", desc='" + this.f287298d + '\'' + ", barBgColor='" + this.f287299e + '\'' + ", duration='" + this.f287300f + '\'' + ", mediaInfo=" + this.f287301g + '}';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel$TopicResInfo");
            return str;
        }
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel");
        String str = "TopicCardResponseModel{relationText='" + this.f287287a + '\'' + ", resInfos=" + this.f287288b + '}';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel");
        return str;
    }
}
