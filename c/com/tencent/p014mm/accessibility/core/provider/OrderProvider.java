package com.tencent.p014mm.accessibility.core.provider;

import android.os.Build;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/OrderProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Lrx3/b0;", "dealOnViewInflateAsync", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.OrderProvider */
public final class OrderProvider extends Provider {
    public static final int $stable = 0;
    public static final OrderProvider INSTANCE = new OrderProvider();
    public static final String TAG = "MicroMsg.Acc.OrderProvider";

    private OrderProvider() {
    }

    public void dealOnViewInflateAsync(View view) {
        C87412m.m108594g(view, "view");
        if (Build.VERSION.SDK_INT >= 22) {
            getConfig(view, new OrderProvider$dealOnViewInflateAsync$1(view));
        }
    }

    public int getAuthority() {
        return 2;
    }
}
