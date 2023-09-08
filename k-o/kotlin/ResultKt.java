package kotlin;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Result;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\b*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a#\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0013\u0010\u000f\u001a5\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ak\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aS\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001b\u0010\u000f\u001aF\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000f\u001aW\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001d\u0010\u000f\u001aJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000f\u001aM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0012\u0010\u000f\u001aM\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000eH\bø\u0001\u0001ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0017\u0010\u000f\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006 "}, mo182094d2 = {"", "exception", "", "createFailure", "Lkotlin/Result;", "Lrx3/b0;", "throwOnFailure", "(Ljava/lang/Object;)V", "R", "Lkotlin/Function0;", "block", "runCatching", "(Lfy3/a;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "(Ljava/lang/Object;Lfy3/l;)Ljava/lang/Object;", "getOrThrow", "(Ljava/lang/Object;)Ljava/lang/Object;", "onFailure", "getOrElse", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "onSuccess", "fold", "(Ljava/lang/Object;Lfy3/l;Lfy3/l;)Ljava/lang/Object;", "transform", "map", "mapCatching", "recover", "recoverCatching", "action", "kotlin-stdlib"}, mo182095k = 2, mo182096mv = {1, 7, 1})
public final class ResultKt {
    public static final Object createFailure(Throwable th) {
        C87412m.m108594g(th, "exception");
        return new Result.Failure(th);
    }

    private static final <R, T> R fold(Object obj, C32226l<? super T, ? extends R> lVar, C32226l<? super Throwable, ? extends R> lVar2) {
        C87412m.m108594g(lVar, "onSuccess");
        C87412m.m108594g(lVar2, "onFailure");
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        return r0 == null ? lVar.invoke(obj) : lVar2.invoke(r0);
    }

    private static final <R, T extends R> R getOrDefault(Object obj, R r) {
        return Result.m168120isFailureimpl(obj) ? r : obj;
    }

    private static final <R, T extends R> R getOrElse(Object obj, C32226l<? super Throwable, ? extends R> lVar) {
        C87412m.m108594g(lVar, "onFailure");
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        return r0 == null ? obj : lVar.invoke(r0);
    }

    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    private static final <R, T> Object map(Object obj, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(lVar, "transform");
        return Result.m168121isSuccessimpl(obj) ? Result.m168114constructorimpl(lVar.invoke(obj)) : Result.m168114constructorimpl(obj);
    }

    private static final <R, T> Object mapCatching(Object obj, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(lVar, "transform");
        if (!Result.m168121isSuccessimpl(obj)) {
            return Result.m168114constructorimpl(obj);
        }
        try {
            return Result.m168114constructorimpl(lVar.invoke(obj));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            return Result.m168114constructorimpl(createFailure(th));
        }
    }

    private static final <T> Object onFailure(Object obj, C32226l<? super Throwable, C13598b0> lVar) {
        C87412m.m108594g(lVar, "action");
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            lVar.invoke(r0);
        }
        return obj;
    }

    private static final <T> Object onSuccess(Object obj, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(lVar, "action");
        if (Result.m168121isSuccessimpl(obj)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    private static final <R, T extends R> Object recover(Object obj, C32226l<? super Throwable, ? extends R> lVar) {
        C87412m.m108594g(lVar, "transform");
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        return r0 == null ? obj : Result.m168114constructorimpl(lVar.invoke(r0));
    }

    private static final <R, T extends R> Object recoverCatching(Object obj, C32226l<? super Throwable, ? extends R> lVar) {
        C87412m.m108594g(lVar, "transform");
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        try {
            return Result.m168114constructorimpl(lVar.invoke(r0));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            return Result.m168114constructorimpl(createFailure(th));
        }
    }

    private static final <R> Object runCatching(C32224a<? extends R> aVar) {
        C87412m.m108594g(aVar, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m168114constructorimpl(aVar.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m168114constructorimpl(createFailure(th));
        }
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    private static final <T, R> Object runCatching(T t, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(lVar, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m168114constructorimpl(lVar.invoke(t));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m168114constructorimpl(createFailure(th));
        }
    }
}
