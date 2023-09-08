package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.IConfCallBack;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u */
public class C105703u {

    /* renamed from: a */
    public IConfCallBack f314285a;

    /* renamed from: b */
    public final SparseArray<HashSet<C105704a>> f314286b;

    /* renamed from: c */
    public C105713v2 f314287c;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u$a */
    public interface C105704a<InParamType, OutParamType> {
        /* renamed from: a */
        InParamType mo150478a(byte[] bArr);

        /* renamed from: b */
        byte[] mo150479b(OutParamType outparamtype);

        /* renamed from: c */
        OutParamType mo150480c(int i, InParamType inparamtype);

        /* renamed from: d */
        boolean mo150481d();
    }

    public C105703u() {
        this.f314285a = null;
        this.f314287c = null;
        this.f314286b = new SparseArray<>(5);
        this.f314285a = new C105698t(this);
    }

    /* renamed from: a */
    public IConfCallBack mo150566a(boolean z) {
        IConfCallBack iConfCallBack;
        Log.m105925i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: trigger validate callback %b", Boolean.valueOf(z));
        synchronized (this) {
            if (z) {
                this.f314286b.clear();
            }
            iConfCallBack = this.f314285a;
        }
        return iConfCallBack;
    }

    /* renamed from: b */
    public <ConvertedDataType, OutParamType> void mo150567b(int i, C105704a<ConvertedDataType, OutParamType> aVar) {
        boolean z = true;
        Log.m105925i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: registering event id: %d", Integer.valueOf(i));
        synchronized (this) {
            HashSet hashSet = this.f314286b.get(i);
            if (hashSet == null) {
                hashSet = new HashSet(1);
            } else {
                z = false;
            }
            hashSet.add(aVar);
            if (z) {
                this.f314286b.append(i, hashSet);
            }
        }
    }

    /* renamed from: c */
    public <ConvertedDataType, OutParamType> void mo150568c(int i, C105704a<ConvertedDataType, OutParamType> aVar) {
        synchronized (this) {
            HashSet hashSet = this.f314286b.get(i);
            if (hashSet != null) {
                hashSet.remove(aVar);
            }
        }
    }
}
