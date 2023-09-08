package com.tencent.p014mm.plugin.finder.post;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PostJumpInfoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/post/PostMainUIC$jumpInfoEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/PostJumpInfoEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$jumpInfoEventListener$1 */
public final class PostMainUIC$jumpInfoEventListener$1 extends IListener<PostJumpInfoEvent> {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f15868d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f15869e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostMainUIC$jumpInfoEventListener$1(PostMainUIC postMainUIC, AppCompatActivity appCompatActivity, C40008f fVar) {
        super(fVar);
        this.f15868d = postMainUIC;
        this.f15869e = appCompatActivity;
    }

    public boolean callback(IEvent iEvent) {
        PostJumpInfoEvent postJumpInfoEvent = (PostJumpInfoEvent) iEvent;
        C87412m.m108594g(postJumpInfoEvent, "event");
        C61926c.m72668M(new C3376a(postJumpInfoEvent, this.f15868d, this.f15869e));
        return false;
    }
}
