package com.tencent.p014mm.modelcdntran;

import gy3.C87412m;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.modelcdntran.v */
public final class C92798v {

    /* renamed from: a */
    public final C92799a f267130a;

    /* renamed from: b */
    public final String f267131b;

    /* renamed from: c */
    public int f267132c;

    /* renamed from: d */
    public C98124g f267133d;

    /* renamed from: e */
    public C98120c f267134e;

    /* renamed from: f */
    public C98121d f267135f;

    /* renamed from: com.tencent.mm.modelcdntran.v$a */
    public enum C92799a {
        OnDownloadCallbackError,
        OnDownloadCallbackSuccess,
        OnDownloadCallbackFindLocal,
        OnDownloadCallbackProgress,
        OnUploadCallbackError,
        OnUploadCallbackSuccess,
        OnUploadCallbackProgress,
        OnDownloadInvalidMediaId,
        OnDownloadAlreadyRunning,
        OnDownloadStartSuccess,
        OnDownloadStartError,
        OnDownloadCancel,
        OnUploadInvalidMediaId,
        OnUploadAlreadyRunning,
        OnUploadStartSuccess,
        OnUploadStartError,
        OnUploadCancel
    }

    public C92798v(C92799a aVar, String str) {
        C87412m.m108594g(aVar, "action");
        C87412m.m108594g(str, "mediaId");
        this.f267130a = aVar;
        this.f267131b = str;
    }
}
