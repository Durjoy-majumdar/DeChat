package com.tencent.p014mm.sdk.platformtools;

import a14.C0000n0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u001a>\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u001a>\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\r"}, mo182094d2 = {"T", "", "intervalMs", "La14/n0;", "coroutineScope", "Lkotlin/Function1;", "Lrx3/b0;", "destinationFunction", "throttleLatest", "waitMs", "debounce", "skipMs", "throttleFirst", "libcompatible_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.ReactiveKt */
public final class ReactiveKt {
    public static final <T> C32226l<T, C13598b0> debounce(long j, C0000n0 n0Var, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(lVar, "destinationFunction");
        return new ReactiveKt$debounce$1(new C8479f0(), n0Var, j, lVar);
    }

    public static /* synthetic */ C32226l debounce$default(long j, C0000n0 n0Var, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        return debounce(j, n0Var, lVar);
    }

    public static final <T> C32226l<T, C13598b0> throttleFirst(long j, C0000n0 n0Var, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(lVar, "destinationFunction");
        return new ReactiveKt$throttleFirst$1(new C8479f0(), n0Var, lVar, j);
    }

    public static /* synthetic */ C32226l throttleFirst$default(long j, C0000n0 n0Var, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        return throttleFirst(j, n0Var, lVar);
    }

    public static final <T> C32226l<T, C13598b0> throttleLatest(long j, C0000n0 n0Var, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(lVar, "destinationFunction");
        return new ReactiveKt$throttleLatest$1(new C8479f0(), new C8479f0(), n0Var, j, lVar);
    }

    public static /* synthetic */ C32226l throttleLatest$default(long j, C0000n0 n0Var, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        return throttleLatest(j, n0Var, lVar);
    }
}
