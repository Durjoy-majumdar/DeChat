package com.tencent.p014mm.plugin.zero;

import com.tencent.p014mm.booter.NotifyReceiver;
import jc3.C33536g;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.zero.u$d$$a */
public final /* synthetic */ class u$d$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ NotifyReceiver.NotifyService f82486a;

    /* renamed from: b */
    public final /* synthetic */ int f82487b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f82488c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f82489d;

    /* renamed from: e */
    public final /* synthetic */ long f82490e;

    public /* synthetic */ u$d$$a(NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
        this.f82486a = notifyService;
        this.f82487b = i;
        this.f82488c = bArr;
        this.f82489d = bArr2;
        this.f82490e = j;
    }

    public final boolean invoke(C15510f fVar) {
        ((C33536g) fVar).mo57264W1(this.f82486a, this.f82487b, this.f82488c, this.f82489d, this.f82490e);
        return false;
    }
}
