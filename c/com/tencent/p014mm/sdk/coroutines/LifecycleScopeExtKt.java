package com.tencent.p014mm.sdk.coroutines;

import a14.C0000n0;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54217q;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\"\u001a\u0010\u0001\u001a\u00020\u00008\u0002X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0003\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000b¨\u0006\f"}, mo182094d2 = {"com/tencent/mm/sdk/coroutines/LifecycleScopeExtKt$applicationScope$1", "applicationScope", "Lcom/tencent/mm/sdk/coroutines/LifecycleScopeExtKt$applicationScope$1;", "getApplicationScope$annotations", "()V", "Landroidx/appcompat/app/AppCompatActivity;", "La14/n0;", "getLifecycleScope", "(Landroidx/appcompat/app/AppCompatActivity;)La14/n0;", "lifecycleScope", "Landroid/view/View;", "(Landroid/view/View;)La14/n0;", "wechat-sdk_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScopeExtKt */
public final class LifecycleScopeExtKt {
    private static final LifecycleScopeExtKt$applicationScope$1 applicationScope = new LifecycleScopeExtKt$applicationScope$1();

    private static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static final C0000n0 getLifecycleScope(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "<this>");
        C39623j lifecycle = appCompatActivity.getLifecycle();
        C87412m.m108593f(lifecycle, "lifecycle");
        return C54217q.m60905a(lifecycle);
    }

    public static final C0000n0 getLifecycleScope(View view) {
        C87412m.m108594g(view, "<this>");
        if (!(view.getContext() instanceof C0125s)) {
            return applicationScope;
        }
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C39623j lifecycle = ((C0125s) context).getLifecycle();
        C87412m.m108593f(lifecycle, "context as LifecycleOwner).lifecycle");
        return C54217q.m60905a(lifecycle);
    }
}
