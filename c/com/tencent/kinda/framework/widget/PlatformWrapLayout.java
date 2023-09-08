package com.tencent.kinda.framework.widget;

import com.facebook.yoga.android.YogaLayout;
import com.tencent.kinda.framework.animate.KindaAnimatorViewProxy;
import com.tencent.kinda.framework.widget.base.MMKViewLayout;
import com.tencent.kinda.gen.KView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class PlatformWrapLayout extends MMKViewLayout {
    public PlatformWrapLayout(YogaLayout yogaLayout) {
        setView(yogaLayout);
    }

    private Object unwrapProxyObj(Object obj) {
        if (!(obj instanceof Proxy)) {
            return obj;
        }
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof KindaAnimatorViewProxy ? ((KindaAnimatorViewProxy) invocationHandler).getTarget() : obj;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void addView(KView kView) {
        Object unwrapProxyObj = unwrapProxyObj(kView);
        Log.m105925i(MMKViewLayout.TAG, "PlatformWrapLayout addView: %s %s", kView, unwrapProxyObj);
        if (unwrapProxyObj != null) {
            kView = (KView) unwrapProxyObj;
        }
        super.addView(kView);
    }
}
