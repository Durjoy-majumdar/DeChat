package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.IStorageEx;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C7335d;
import java.util.ArrayList;
import java.util.Arrays;
import p261wl.C15510f;

/* renamed from: com.tencent.mm.storage.v3 */
public interface C30783v3 extends IStorageEx {

    /* renamed from: a */
    public static final ArrayList<Integer> f82766a = new ArrayList<>(Arrays.asList(new Integer[]{4, 1, 2, 10, 66, 132}));

    /* renamed from: b */
    public static final ArrayList<Integer> f82767b = new ArrayList<>(Arrays.asList(new Integer[]{0, 4, 1, 2, 10, 66, 132}));

    /* renamed from: com.tencent.mm.storage.v3$a */
    public interface C30784a {
        /* renamed from: A */
        void mo57653A(C72976h2 h2Var, C30783v3 v3Var);
    }

    /* renamed from: com.tencent.mm.storage.v3$b */
    public interface C30785b {
    }

    /* renamed from: com.tencent.mm.storage.v3$c */
    public interface C30786c extends C7335d {
        /* renamed from: U9 */
        C30785b mo57710U9();
    }

    /* renamed from: com.tencent.mm.storage.v3$d */
    public interface C30787d extends C15510f {
        void onNotifyChange(int i, MStorageEx mStorageEx, Object obj);
    }

    /* renamed from: com.tencent.mm.storage.v3$e */
    public interface C30788e extends C15510f {
        /* renamed from: A */
        void mo57712A(C72976h2 h2Var, C30783v3 v3Var);
    }

    /* renamed from: com.tencent.mm.storage.v3$f */
    public interface C30789f extends C15510f {
        /* renamed from: A */
        void mo57713A(C72976h2 h2Var, C30783v3 v3Var);
    }

    static {
        new ArrayList(Arrays.asList(new Integer[]{0, 1, 2, 10, 66}));
    }
}
