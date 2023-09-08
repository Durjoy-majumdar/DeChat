package com.tencent.p014mm.plugin.textstatus.convert.topic;

import android.content.Context;
import ez2.C45727g;
import ez2.C45733q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$buildItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.convert.topic.TopicSquareItemConvert$buildItemConvertFactory$1 */
public final class TopicSquareItemConvert$buildItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C45733q this$0;

    /* renamed from: com.tencent.mm.plugin.textstatus.convert.topic.TopicSquareItemConvert$buildItemConvertFactory$1$a */
    public static final class C43190a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45733q f116877d;

        /* renamed from: e */
        public final /* synthetic */ Context f116878e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43190a(C45733q qVar, Context context) {
            super(1);
            this.f116877d = qVar;
            this.f116878e = context;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "topicId");
            this.f116877d.mo71230j(this.f116878e, str);
            return C13598b0.f38549a;
        }
    }

    public TopicSquareItemConvert$buildItemConvertFactory$1(C45733q qVar, Context context) {
        this.this$0 = qVar;
        this.$context = context;
    }

    public C60896i<?> getItemConvert(int i) {
        C45727g gVar = new C45727g();
        gVar.f123566e = new C43190a(this.this$0, this.$context);
        return gVar;
    }
}
