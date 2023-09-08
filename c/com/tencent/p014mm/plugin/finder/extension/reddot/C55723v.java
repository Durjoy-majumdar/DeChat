package com.tencent.p014mm.plugin.finder.extension.reddot;

import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.v */
public final class C55723v extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ byte[] f158592d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f158593e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f158594f;

    /* renamed from: g */
    public final /* synthetic */ C55718s0 f158595g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55723v(byte[] bArr, C8477a0 a0Var, C8479f0<String> f0Var, C55718s0 s0Var) {
        super(0);
        this.f158592d = bArr;
        this.f158593e = a0Var;
        this.f158594f = f0Var;
        this.f158595g = s0Var;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("size=");
        byte[] bArr = this.f158592d;
        sb.append(bArr != null ? bArr.length : -1);
        sb.append(" isExBlob=");
        sb.append(this.f158593e.f27482d);
        sb.append(" blobStr=");
        sb.append((String) this.f158594f.f27484d);
        sb.append(" error rowId=");
        sb.append(this.f158595g.systemRowid);
        sb.append(" tipsId=");
        sb.append(this.f158595g.field_tipsId);
        sb.append(" type=");
        sb.append(this.f158595g.field_ctrType);
        sb.append(" time=");
        sb.append(this.f158595g.field_time);
        sb.append(" aiScene=");
        sb.append(this.f158595g.field_aiScene);
        return sb.toString();
    }
}
