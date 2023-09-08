package com.tencent.thumbplayer.tplayer;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadAnnotations;
import com.tencent.thumbplayer.utils.TPThreadSwitch;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TPPlayerProxy implements InvocationHandler {
    private TPPlayer mPlayer;
    private TPThreadSwitch mSwitch;

    public TPPlayerProxy(TPPlayer tPPlayer) {
        this.mPlayer = tPPlayer;
        this.mSwitch = new TPThreadSwitch(tPPlayer.getTag(), this.mPlayer.getLooper(), this.mPlayer);
    }

    private Object[] beforeSetDataSource(Object[] objArr) {
        Object obj = objArr[0];
        if (obj != null && (obj instanceof ParcelFileDescriptor)) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                objArr[0] = ParcelFileDescriptor.fromFd(parcelFileDescriptor.detachFd());
                parcelFileDescriptor.close();
            } catch (Exception e) {
                String tag = this.mPlayer.getTag();
                TPLogUtil.m21894e(tag, "setDataSource, fromFd has exception:" + e.toString());
            }
        } else if (obj != null && (obj instanceof AssetFileDescriptor)) {
            try {
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                objArr[0] = new AssetFileDescriptor(ParcelFileDescriptor.fromFd(assetFileDescriptor.getParcelFileDescriptor().detachFd()), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();
            } catch (Exception e2) {
                String tag2 = this.mPlayer.getTag();
                TPLogUtil.m21894e(tag2, "setDataSource, fromFd has exception:" + e2.toString());
            }
        }
        return objArr;
    }

    private Object dealThreadSwitch(Method method, Object[] objArr) {
        String name = method.getName();
        if (name.equals("setDataSource")) {
            objArr = beforeSetDataSource(objArr);
        }
        if (method.getReturnType().getName().equals("void")) {
            this.mSwitch.dealThreadSwitch(name, objArr);
            return null;
        }
        Object dealThreadSwitchWithResult = this.mSwitch.dealThreadSwitchWithResult(name, objArr);
        String tag = this.mPlayer.getTag();
        TPLogUtil.m21897i(tag, "dealThreadSwitch: " + name + ", var count:" + getVarCount(objArr) + ", result:" + dealThreadSwitchWithResult);
        return dealThreadSwitchWithResult;
    }

    private int getVarCount(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    private boolean isNeedSwitchThread(Method method, Object[] objArr) {
        return TPThreadAnnotations.getMethod(this.mPlayer.getClass(), method.getName(), objArr) != null;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(this.mPlayer.getClass().getClassLoader(), this.mPlayer.getClass().getInterfaces(), this);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        return !isNeedSwitchThread(method, objArr) ? method.invoke(this.mPlayer, objArr) : dealThreadSwitch(method, objArr);
    }
}
