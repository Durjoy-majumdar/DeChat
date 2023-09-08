package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.IConfCallBack;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.q */
public class C105169q {

    /* renamed from: a */
    public IConfCallBack f312290a = null;

    /* renamed from: b */
    public final SparseArray<HashSet<C105170a>> f312291b = new SparseArray<>(5);

    /* renamed from: c */
    public C105137e f312292c = null;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.q$a */
    public interface C105170a<InParamType, OutParamType> {
        /* renamed from: a */
        InParamType mo118176a(byte[] bArr);

        /* renamed from: b */
        byte[] mo118177b(OutParamType outparamtype);

        /* renamed from: c */
        OutParamType mo118178c(int i, InParamType inparamtype);

        /* renamed from: d */
        boolean mo118179d();
    }

    /* renamed from: a */
    public IConfCallBack mo149489a(boolean z) {
        IConfCallBack iConfCallBack;
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: trigger validate callback %b", Boolean.valueOf(z));
        synchronized (this) {
            if (z) {
                this.f312290a = new C105168p(this);
            } else {
                this.f312290a = null;
            }
            this.f312291b.clear();
            iConfCallBack = this.f312290a;
        }
        return iConfCallBack;
    }

    /* renamed from: b */
    public <ConvertedDataType, OutParamType> void mo149490b(int i, C105170a<ConvertedDataType, OutParamType> aVar) {
        boolean z = true;
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: registering event id: %d", Integer.valueOf(i));
        synchronized (this) {
            HashSet hashSet = this.f312291b.get(i);
            if (hashSet == null) {
                hashSet = new HashSet(1);
            } else {
                z = false;
            }
            hashSet.add(aVar);
            if (z) {
                this.f312291b.append(i, hashSet);
            }
        }
    }

    /* renamed from: c */
    public <ConvertedDataType, OutParamType> void mo149491c(int i, C105170a<ConvertedDataType, OutParamType> aVar) {
        synchronized (this) {
            HashSet hashSet = this.f312291b.get(i);
            if (hashSet != null) {
                hashSet.remove(aVar);
            }
        }
    }
}
