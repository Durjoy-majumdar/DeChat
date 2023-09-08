package com.tencent.p014mm.plugin.textstatus.p112ui;

import dz2.C45502b;
import dz2.C45505f;
import dz2.C45507i;
import dz2.C45510m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$buildItemConverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$buildItemConverts$1 */
public final class TextStatusLikeListFragment$buildItemConverts$1 implements C9500j {
    public final /* synthetic */ long $reportScene;
    public final /* synthetic */ TextStatusLikeListFragment this$0;

    public TextStatusLikeListFragment$buildItemConverts$1(long j, TextStatusLikeListFragment textStatusLikeListFragment) {
        this.$reportScene = j;
        this.this$0 = textStatusLikeListFragment;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new C45510m(this.$reportScene, this.this$0.f116947v) : new C45505f(this.$reportScene, this.this$0.f116947v) : new C45507i() : new C45502b();
    }
}
