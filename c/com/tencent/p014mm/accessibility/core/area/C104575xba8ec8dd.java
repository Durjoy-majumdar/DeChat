package com.tencent.p014mm.accessibility.core.area;

import android.view.TouchDelegate;
import android.view.View;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1$onLayoutChange$1 */
public final class C104575xba8ec8dd extends C87413o implements C32224a<C13598b0> {

    /* renamed from: $v */
    public final /* synthetic */ View f309987$v;
    public final /* synthetic */ ExpandTouchDelegate$Companion$layoutChangeListener$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104575xba8ec8dd(View view, ExpandTouchDelegate$Companion$layoutChangeListener$1 expandTouchDelegate$Companion$layoutChangeListener$1) {
        super(0);
        this.f309987$v = view;
        this.this$0 = expandTouchDelegate$Companion$layoutChangeListener$1;
    }

    public final void invoke() {
        if (!AccUtil.INSTANCE.canExpand()) {
            this.f309987$v.removeOnLayoutChangeListener(this.this$0);
        }
        if (this.f309987$v.getVisibility() == 8 || this.f309987$v.getVisibility() == 4 || !this.f309987$v.isShown()) {
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(this.f309987$v);
            if (tagData != null) {
                tagData.setTouchDelegate((WeakReference<TouchDelegate>) null);
                return;
            }
            return;
        }
        ExpandTouchDelegate.Companion.setDelegate(this.f309987$v);
    }
}
