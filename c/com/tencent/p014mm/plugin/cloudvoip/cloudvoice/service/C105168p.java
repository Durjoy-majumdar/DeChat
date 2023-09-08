package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.os.Looper;
import android.os.Process;
import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.IConfCallBack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p */
public class C105168p implements IConfCallBack {

    /* renamed from: a */
    public final /* synthetic */ C105169q f312289a;

    public C105168p(C105169q qVar) {
        this.f312289a = qVar;
    }

    public byte[] callBackFromConf(int i, int i2, byte[] bArr) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: triggered native callback: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        HashSet hashSet = this.f312289a.f312291b.get(i);
        if (hashSet == null || hashSet.size() <= 0) {
            Log.m105929w("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", Integer.valueOf(i));
            return new byte[1];
        }
        ArrayList arrayList = new ArrayList(1);
        byte[] bArr2 = new byte[1];
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C105169q.C105170a aVar = (C105169q.C105170a) it.next();
            if (aVar != null) {
                Object c = aVar.mo118178c(i2, aVar.mo118176a(bArr));
                if (c != null) {
                    bArr2 = aVar.mo118177b(c);
                }
                if (!aVar.mo118179d()) {
                    arrayList.add(aVar);
                }
            } else {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: item is null! weired");
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            hashSet.remove((C105169q.C105170a) it4.next());
        }
        return bArr2;
    }

    public void callbackVideoFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        C105137e eVar = this.f312289a.f312292c;
        if (eVar != null) {
            eVar.mo149450a(i, byteBuffer, i2, i3, i4);
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
