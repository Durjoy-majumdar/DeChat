package com.tencent.p014mm.p136ui.tipsbar;

import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import java.util.List;
import jq3.C60896i;
import jq3.C9500j;
import kn3.C61118a;
import kotlin.Metadata;
import mn3.C76791e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$buildItemConverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$buildItemConverts$1 */
public final class ChatTipsBarGroup$buildItemConverts$1 implements C9500j {
    public final /* synthetic */ List<C76791e<?>> $processors;
    public final /* synthetic */ ChatTipsBarGroup.C74825d $shareData;
    public final /* synthetic */ C67391b $ui;
    public final /* synthetic */ ChatTipsBarGroup this$0;

    public ChatTipsBarGroup$buildItemConverts$1(List<? extends C76791e<?>> list, ChatTipsBarGroup chatTipsBarGroup, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        this.$processors = list;
        this.this$0 = chatTipsBarGroup;
        this.$ui = bVar;
        this.$shareData = dVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C61118a y;
        List<C76791e<?>> list = this.$processors;
        C67391b bVar = this.$ui;
        ChatTipsBarGroup.C74825d dVar = this.$shareData;
        for (C76791e eVar : list) {
            if (eVar.mo86473c() == i && (y = eVar.mo86474y(i, bVar, dVar)) != null) {
                return y;
            }
        }
        return this.this$0.f219967u;
    }
}
