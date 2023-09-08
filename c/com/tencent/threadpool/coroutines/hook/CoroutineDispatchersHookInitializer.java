package com.tencent.threadpool.coroutines.hook;

import a14.C53872d1;
import a14.C53896h0;
import au3.C54329b;
import au3.C54330c;
import au3.C54331d;
import bu3.C16821a;
import gy3.C87412m;
import java.lang.reflect.Field;
import kotlin.Metadata;
import ny3.C89104m;
import rx3.C13601g;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/threadpool/coroutines/hook/CoroutineDispatchersHookInitializer;", "", "Lrx3/b0;", "setup", "<init>", "()V", "threadpool-coroutines_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class CoroutineDispatchersHookInitializer {
    public static final CoroutineDispatchersHookInitializer INSTANCE = new CoroutineDispatchersHookInitializer();

    private CoroutineDispatchersHookInitializer() {
    }

    public static final void setup() {
        if (C54330c.f152464a == null) {
            C53896h0 h0Var = C53872d1.f151119c;
            if (!C87412m.m108589b(h0Var, C54331d.f152465f)) {
                C54330c.f152464a = h0Var;
            }
        }
        C13601g gVar = C16821a.f45439c;
        C89104m[] mVarArr = C16821a.f45437a;
        C89104m mVar = mVarArr[1];
        Field field = (Field) ((C36570n) gVar).getValue();
        if (field != null) {
            field.set((Object) null, C54329b.f152463f);
        }
        C13601g gVar2 = C16821a.f45440d;
        C89104m mVar2 = mVarArr[2];
        Field field2 = (Field) ((C36570n) gVar2).getValue();
        if (field2 != null) {
            field2.set((Object) null, C54331d.f152465f);
        }
    }
}
