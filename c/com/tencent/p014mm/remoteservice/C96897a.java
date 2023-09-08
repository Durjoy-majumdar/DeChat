package com.tencent.p014mm.remoteservice;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.remoteservice.C96899b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ef3.C86513a;
import ef3.C86514b;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.remoteservice.a */
public class C96897a extends C96899b.C96900a {

    /* renamed from: d */
    public final C96905d f283896d;

    /* renamed from: e */
    public C96899b f283897e;

    /* renamed from: com.tencent.mm.remoteservice.a$a */
    public class C96898a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object[] f283898d;

        /* renamed from: e */
        public final /* synthetic */ String f283899e;

        public C96898a(Object[] objArr, String str) {
            this.f283898d = objArr;
            this.f283899e = str;
        }

        public void run() {
            Bundle a = C96897a.this.mo127939a(this.f283898d);
            C96897a aVar = C96897a.this;
            aVar.f283896d.mo135258b(aVar, this.f283899e, a);
        }
    }

    public C96897a(C96905d dVar) {
        this.f283896d = dVar;
    }

    public Object CLIENT_CALL(String str, Object... objArr) {
        Bundle a = mo127939a(objArr);
        try {
            this.f283897e.onCallback(str, a, true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BaseClientRequest", "exception:%s", Util.stackTraceToString(e));
        }
        return a.get("result_key");
    }

    public Object REMOTE_CALL(String str, Object... objArr) {
        if (this.f283896d.mo135259c()) {
            Bundle a = mo127939a(objArr);
            this.f283896d.mo135258b(this, str, a);
            a.setClassLoader(getClass().getClassLoader());
            return a.get("result_key");
        }
        this.f283896d.mo135257a(new C96898a(objArr, str));
        return null;
    }

    /* renamed from: a */
    public Bundle mo127939a(Object... objArr) {
        Bundle bundle = new Bundle();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Bundle) {
                bundle.putBundle("" + i, objArr[i]);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable("" + i, objArr[i]);
            } else {
                bundle.putSerializable("" + i, objArr[i]);
            }
        }
        return bundle;
    }

    public Object[] getArgs(Bundle bundle) {
        LinkedList linkedList = new LinkedList();
        int size = bundle.size();
        for (int i = 0; i < size; i++) {
            String str = "" + i;
            if (bundle.containsKey(str)) {
                linkedList.add(bundle.get(str));
            }
        }
        return linkedList.toArray();
    }

    public void onCallback(String str, Bundle bundle, boolean z) {
        Log.m105919d("MicroMsg.BaseClientRequest", "class:%s, method:%s, clientCall:%B", getClass().getName(), str, Boolean.valueOf(z));
        Method method = null;
        try {
            Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (method2.getName().equalsIgnoreCase(str)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                if (method.isAnnotationPresent(z ? C86513a.class : C86514b.class)) {
                    Object invoke = method.invoke(this, getArgs(bundle));
                    if (method.getReturnType() != Void.TYPE) {
                        bundle.putSerializable("result_key", (Serializable) invoke);
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BaseClientRequest", "exception:%s", Util.stackTraceToString(e));
        }
    }
}
