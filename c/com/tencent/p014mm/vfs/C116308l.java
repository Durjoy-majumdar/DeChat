package com.tencent.p014mm.vfs;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.l */
public final class C116308l {

    /* renamed from: a */
    public static final String[] f349026a = {"EnMicroMsg.db", "EnMicroMsg.db-shm", "EnMicroMsg.db-wal"};

    /* renamed from: b */
    public static final Map<Integer, String> f349027b = C90364q0.m113147f(new C13604l(0, "read"), new C13604l(1, "write"), new C13604l(3, "delete"), new C13604l(5, "mkdir"), new C13604l(7, "copy"), new C13604l(8, "move"), new C13604l(9, "moveOut"));

    /* renamed from: c */
    public static final Map<Integer, String> f349028c = C90364q0.m113147f(new C13604l(0, "ok"), new C13604l(1, StateEvent.ProcessResult.FAILED), new C13604l(2, "denied"));
}
