package com.tencent.wework.api.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.wework.api.model.WWMediaMessage;

public class WWMediaConversation extends WWMediaMessage.WWMediaObject {

    /* renamed from: f */
    public String f285803f;

    /* renamed from: g */
    public long f285804g;

    /* renamed from: h */
    public byte[] f285805h;

    /* renamed from: i */
    public WWMediaMessage.WWMediaObject f285806i;

    /* renamed from: a */
    public void mo136615a(Intent intent, String str) {
        try {
            this.f285806i.mo136615a(intent, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r3.f285806i;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136616b() {
        /*
            r3 = this;
            boolean r0 = super.mo136616b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r0 = r3.f285805h
            r2 = 10485760(0xa00000, float:1.469368E-38)
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length
            if (r0 <= r2) goto L_0x0012
            return r1
        L_0x0012:
            com.tencent.wework.api.model.WWMediaMessage$WWMediaObject r0 = r3.f285806i
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.mo136616b()
            if (r0 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaConversation.mo136616b():boolean");
    }

    /* renamed from: d */
    public void mo136617d(Context context) {
        this.f285800a = context;
        try {
            this.f285806i.mo136617d(context);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public void mo136618e(String str) {
        this.f285801b = str;
        try {
            this.f285806i.mo136618e(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        super.mo136619f(bundle);
        bundle.putString("_wwconvobject_name", this.f285803f);
        bundle.putLong("_wwconvobject_date", this.f285804g);
        bundle.putByteArray("_wwconvobject_avatarData", this.f285805h);
        bundle.putString("_wwconvobject_avatarPath", (String) null);
        bundle.putBundle("_wwconvobject_message", BaseMessage.m125331c(this.f285806i));
    }
}
