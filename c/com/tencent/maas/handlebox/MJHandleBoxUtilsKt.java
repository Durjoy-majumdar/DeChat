package com.tencent.maas.handlebox;

import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001ac\u0010\b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0006H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a}\u0010\b\u001a\u0004\u0018\u00018\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\n*\u00020\u0000\"\b\b\u0003\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00030\fH\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\r\u001a\u0001\u0010\b\u001a\u0004\u0018\u00018\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\n*\u00020\u0000\"\b\b\u0003\u0010\u000e*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\u000f\u001a\u0004\u0018\u00018\u00032&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00040\u0010H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0011\u001a±\u0001\u0010\b\u001a\u0004\u0018\u00018\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\n*\u00020\u0000\"\b\b\u0003\u0010\u000e*\u00020\u0000\"\b\b\u0004\u0010\u0012*\u00020\u0000\"\b\b\u0005\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\u000f\u001a\u0004\u0018\u00018\u00032\b\u0010\u0013\u001a\u0004\u0018\u00018\u00042,\u0010\u0007\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00050\u0014H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0015\u001a\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001e"}, mo182094d2 = {"", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "block", "safeLet", "(Ljava/lang/Object;Ljava/lang/Object;Lfy3/p;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/q;)Ljava/lang/Object;", "T4", "p4", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/r;)Ljava/lang/Object;", "T5", "p5", "Lkotlin/Function5;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/s;)Ljava/lang/Object;", "", "tag", "msg", "Lrx3/b0;", "log", "", "HANDLE_BOX_DEBUG", "Z", "MaasSDK_release"}, mo182095k = 2, mo182096mv = {1, 5, 1})
public final class MJHandleBoxUtilsKt {
    private static final boolean HANDLE_BOX_DEBUG = true;

    public static final void log(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
    }

    public static final <T1, T2, R> R safeLet(T1 t1, T2 t2, C32227p<? super T1, ? super T2, ? extends R> pVar) {
        C87412m.m108594g(pVar, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return pVar.invoke(t1, t2);
    }

    public static final <T1, T2, T3, R> R safeLet(T1 t1, T2 t2, T3 t3, C32228q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
        C87412m.m108594g(qVar, "block");
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return qVar.invoke(t1, t2, t3);
    }

    public static final <T1, T2, T3, T4, R> R safeLet(T1 t1, T2 t2, T3 t3, T4 t4, C32229r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
        C87412m.m108594g(rVar, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null) {
            return null;
        }
        return rVar.mo162I(t1, t2, t3, t4);
    }

    public static final <T1, T2, T3, T4, T5, R> R safeLet(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, C32230s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
        C87412m.m108594g(sVar, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null || t5 == null) {
            return null;
        }
        return sVar.mo237D(t1, t2, t3, t4, t5);
    }
}
