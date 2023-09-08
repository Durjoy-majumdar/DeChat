package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.os.Looper;
import android.os.Process;
import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.IConfCallBack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.t */
public class C105698t implements IConfCallBack {

    /* renamed from: a */
    public final /* synthetic */ C105703u f314276a;

    public C105698t(C105703u uVar) {
        this.f314276a = uVar;
    }

    public byte[] callBackFromConf(int i, int i2, byte[] bArr) {
        byte[] bArr2;
        Log.m105925i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: triggered native callback: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        C105703u uVar = this.f314276a;
        synchronized (uVar) {
            HashSet hashSet = uVar.f314286b.get(i);
            if (hashSet == null || hashSet.size() <= 0) {
                Log.m105929w("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", Integer.valueOf(i));
                bArr2 = new byte[1];
            } else {
                ArrayList arrayList = new ArrayList(1);
                bArr2 = new byte[1];
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C105703u.C105704a aVar = (C105703u.C105704a) it.next();
                    if (aVar != null) {
                        Object c = aVar.mo150480c(i2, aVar.mo150478a(bArr));
                        if (c != null) {
                            bArr2 = aVar.mo150479b(c);
                        }
                        if (!aVar.mo150481d()) {
                            arrayList.add(aVar);
                        }
                    } else {
                        Log.m105921e("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: event %d item or buffer is null! weired", Integer.valueOf(i));
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    hashSet.remove((C105703u.C105704a) it4.next());
                }
            }
        }
        return bArr2;
    }

    public void callbackVideoFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        C105713v2 v2Var = this.f314276a.f314287c;
        if (v2Var != null) {
            v2Var.mo150580a(i, byteBuffer, i2, i3, i4);
        }
    }

    public void callbackWriteLog(int i, String str, String str2, int i2, String str3, String str4, int i3) {
        if (i >= (Log.getImpl() != null ? Log.getImpl().getLogLevel(0) : 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CloudVoIPNative:");
            String str5 = str;
            sb.append(str);
            Xlog.logWrite2(i, sb.toString(), str2, str3, Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str4);
        }
    }
}
