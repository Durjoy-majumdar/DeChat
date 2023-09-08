package com.tencent.p014mm.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.mini.AbsLiveMiniView;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/live/view/RoomLiveMiniView;", "Lcom/tencent/mm/live/core/mini/AbsLiveMiniView;", "", "state", "Lrx3/b0;", "setState", "getCurrentState", "", "coverUrl", "setBgCoverUrl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.RoomLiveMiniView */
public final class RoomLiveMiniView extends AbsLiveMiniView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomLiveMiniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(MMApplicationContext.getContext(), C0966R.C0971layout.b74, this);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        setOnClickListener(RoomLiveService.f157189U);
    }

    /* renamed from: a */
    public void mo76394a(int i) {
    }

    /* renamed from: b */
    public int mo76395b() {
        return 16;
    }

    /* renamed from: d */
    public void mo76397d(int i) {
    }

    /* renamed from: e */
    public final void mo76542e(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.f357653b13);
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/view/RoomLiveMiniView", "updateCloseBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/live/view/RoomLiveMiniView", "updateCloseBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getCurrentState() {
        return 0;
    }

    public void setBgCoverUrl(String str) {
    }

    public void setState(int i) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomLiveMiniView(Context context) {
        this(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomLiveMiniView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
