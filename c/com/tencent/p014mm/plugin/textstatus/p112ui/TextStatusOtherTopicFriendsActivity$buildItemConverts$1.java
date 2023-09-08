package com.tencent.p014mm.plugin.textstatus.p112ui;

import ez2.C45722b;
import ez2.C45733q;
import java.text.SimpleDateFormat;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import qy2.C77448f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$buildItemConverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$buildItemConverts$1 */
public final class TextStatusOtherTopicFriendsActivity$buildItemConverts$1 implements C9500j {
    public final /* synthetic */ int $source;
    public final /* synthetic */ TextStatusOtherTopicFriendsActivity this$0;

    public TextStatusOtherTopicFriendsActivity$buildItemConverts$1(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, int i) {
        this.this$0 = textStatusOtherTopicFriendsActivity;
        this.$source = i;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == -2) {
            return new C45722b(this.this$0.f116989s);
        }
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        return new C45733q(this.$source);
    }
}
