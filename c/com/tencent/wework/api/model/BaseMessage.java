package com.tencent.wework.api.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class BaseMessage {

    /* renamed from: a */
    public Context f285800a = null;

    /* renamed from: b */
    public String f285801b;

    /* renamed from: c */
    public static Bundle m125331c(BaseMessage baseMessage) {
        if (baseMessage == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        baseMessage.mo136619f(bundle);
        bundle.putString("_wwobject_identifier_", baseMessage.getClass().getName());
        return bundle;
    }

    /* renamed from: a */
    public void mo136615a(Intent intent, String str) {
    }

    /* renamed from: b */
    public abstract boolean mo136616b();

    /* renamed from: d */
    public void mo136617d(Context context) {
        this.f285800a = context;
    }

    /* renamed from: e */
    public void mo136618e(String str) {
        this.f285801b = str;
    }

    /* renamed from: f */
    public abstract void mo136619f(Bundle bundle);
}
