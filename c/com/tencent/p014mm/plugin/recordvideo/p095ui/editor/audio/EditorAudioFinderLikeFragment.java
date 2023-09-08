package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import jh2.C9436l;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51129rn0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderLikeFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderLikeFragment */
public final class EditorAudioFinderLikeFragment extends EditorAudioFinderTabFragment {

    /* renamed from: p */
    public C9436l f20392p;

    /* renamed from: q */
    public C89349b f20393q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderLikeFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(3965, this);
    }

    /* renamed from: c */
    public void mo6011c() {
        this.f20392p = new C9436l(this.f20393q);
        C86709a0.m107524d().mo123460f(this.f20392p);
    }

    /* renamed from: e */
    public void mo6012e() {
        super.mo6012e();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar != null && C87412m.m108589b(this.f20392p, yVar)) {
            this.f20392p = null;
            if (i == 0 && i2 == 0) {
                C9436l lVar = (C9436l) yVar;
                C47465a aVar = lVar.f29462d.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
                this.f20393q = ((C51129rn0) aVar).f141037e;
                C47465a aVar2 = lVar.f29462d.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
                LinkedList<FinderObject> linkedList = ((C51129rn0) aVar2).f141036d;
                C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…dListResponse).liked_list");
                C47465a aVar3 = lVar.f29462d.f127056b.f127083a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
                mo80772d(linkedList, ((C51129rn0) aVar3).f141038f != 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderLikeFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(3965, this);
    }
}
