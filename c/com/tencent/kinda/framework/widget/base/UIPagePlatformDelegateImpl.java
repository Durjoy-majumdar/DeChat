package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import com.tencent.kinda.gen.IUIPagePlatformDelegate;
import com.tencent.kinda.gen.Platform;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class UIPagePlatformDelegateImpl implements IUIPagePlatformDelegate {
    private WeakReference<Context> context;
    private ArrayList<Integer> secureViews = new ArrayList<>();

    public UIPagePlatformDelegateImpl(Context context2) {
        this.context = new WeakReference<>(context2);
    }

    public boolean addSecureView(int i) {
        return this.secureViews.add(Integer.valueOf(i));
    }

    public Platform currentPlatform() {
        return Platform.ANDROID;
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.context;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public ArrayList<Integer> getSecureViews() {
        return this.secureViews;
    }

    public boolean removeSecureView(Integer num) {
        if (num == null || this.secureViews.size() <= 0) {
            return false;
        }
        return this.secureViews.remove(num);
    }

    public void setContext(Context context2) {
        this.context = new WeakReference<>(context2);
    }
}
