package com.tencent.p014mm.accessibility.base;

import android.view.View;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$mockInflateAsync$1 */
public final class MMBaseAccessibilityConfig$mockInflateAsync$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ View $root;
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$mockInflateAsync$1(MMBaseAccessibilityConfig mMBaseAccessibilityConfig, View view) {
        super(0);
        this.this$0 = mMBaseAccessibilityConfig;
        this.$root = view;
    }

    public final void invoke() {
        final MMBaseAccessibilityConfig mMBaseAccessibilityConfig = this.this$0;
        final View view = this.$root;
        C61926c.m72662G(ConstantsAccessibility.THREAD_TAG, false, new C32224a<C13598b0>() {
            public final void invoke() {
                mMBaseAccessibilityConfig.mockInflateCore(view);
                ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
                if (tagData != null) {
                    tagData.setHavenInflate(Boolean.TRUE);
                }
            }
        }, 200);
        Log.m105924i(MMBaseAccessibilityConfig.TAG, "mockInflate start in " + this.this$0.getClass().getName() + " :Root->" + IdUtil.INSTANCE.getName(this.$root.getId()));
    }
}
