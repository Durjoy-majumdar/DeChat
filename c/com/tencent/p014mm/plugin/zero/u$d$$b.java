package com.tencent.p014mm.plugin.zero;

import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.plugin.zero.C85597u;
import jc3.C87947e;
import nr3.C89055a;

/* renamed from: com.tencent.mm.plugin.zero.u$d$$b */
public class u$d$$b implements C89055a.C89056a<C87947e> {

    /* renamed from: a */
    public final /* synthetic */ NotifyReceiver.NotifyService f249519a;

    /* renamed from: b */
    public final /* synthetic */ int f249520b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f249521c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f249522d;

    /* renamed from: e */
    public final /* synthetic */ long f249523e;

    public u$d$$b(C85597u.C85600d dVar, NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
        this.f249519a = notifyService;
        this.f249520b = i;
        this.f249521c = bArr;
        this.f249522d = bArr2;
        this.f249523e = j;
    }

    /* renamed from: a */
    public void mo54201a(Object obj) {
        ((C87947e) obj).mo119070W1(this.f249519a, this.f249520b, this.f249521c, this.f249522d, this.f249523e);
    }
}
