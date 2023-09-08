package com.tencent.p014mm.plugin.zero;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p206nj.C88957l;
import qe3.C89625d;

@C86522b(dependencies = {LoadNormsgJNIService.class, C30643n.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_PUSH})
/* renamed from: com.tencent.mm.plugin.zero.LoadProtocolJNIService */
public class LoadProtocolJNIService extends C86301e {
    private void retryOnce(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            runnable.run();
        }
    }

    public void onCreate(Context context) {
        C88957l.m111079o("MMProtocalJni", getClass().getClassLoader());
        retryOnce(new Runnable() {
            public void run() {
                MMProtocalJni.setClientPackVersion(C89625d.f257841g);
            }
        });
        retryOnce(new Runnable() {
            public void run() {
                MMProtocalJni.setProtocalJniLogLevel(Log.getLogLevel());
            }
        });
        retryOnce(new Runnable() {
            public void run() {
                MMProtocalJni.setIsLite(false);
            }
        });
    }
}
