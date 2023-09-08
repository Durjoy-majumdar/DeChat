package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Parcel;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.extension.c */
public class C80893c {

    /* renamed from: a */
    public static final Object f237719a = new byte[0];

    /* renamed from: b */
    public static final List<C80891a> f237720b = new LinkedList();

    /* renamed from: c */
    public static final Map<String, C80891a> f237721c = new HashMap();

    /* renamed from: a */
    public static void m98760a(C80891a aVar) {
        if (aVar != null) {
            synchronized (f237719a) {
                List<C80891a> list = f237720b;
                if (!((LinkedList) list).contains(aVar)) {
                    ((HashMap) f237721c).put(aVar.getName(), aVar);
                    ((LinkedList) list).add(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public static C80891a m98761b(Object obj) {
        synchronized (f237719a) {
            for (C80891a next : f237720b) {
                if (next.mo56343b(obj)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Object m98762c(String str, Parcel parcel) {
        C80891a aVar;
        synchronized (f237719a) {
            aVar = (C80891a) ((HashMap) f237721c).get(str);
        }
        if (aVar != null) {
            return aVar.mo56342a(parcel);
        }
        C90741c.m113810c("Luggage.ObjectTypeTransfer", "Get transferClass '%s' return null", str);
        return null;
    }

    /* renamed from: d */
    public static void m98763d(Object obj, Parcel parcel) {
        C80891a b = m98761b(obj);
        if (b != null) {
            b.mo56344c(obj, parcel);
        }
    }
}
