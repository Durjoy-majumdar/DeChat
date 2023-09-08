package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.util.SparseArray;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.v3 */
public final class C44040v3 {

    /* renamed from: a */
    public static final SparseArray<MsgHandler> f119319a = new SparseArray<>();

    /* renamed from: b */
    public static volatile MsgHandler f119320b = null;

    /* renamed from: a */
    public static MsgHandler m48330a(int i) {
        MsgHandler msgHandler;
        synchronized (C44040v3.class) {
            SparseArray<MsgHandler> sparseArray = f119319a;
            if (sparseArray.get(i) == null) {
                sparseArray.put(i, new MsgHandler(i));
            }
            msgHandler = sparseArray.get(i);
            f119320b = msgHandler;
        }
        return msgHandler;
    }

    @Deprecated
    /* renamed from: b */
    public static MsgHandler m48331b() {
        if (f119320b == null) {
            f119320b = new MsgHandler(0);
        }
        return f119320b;
    }
}
