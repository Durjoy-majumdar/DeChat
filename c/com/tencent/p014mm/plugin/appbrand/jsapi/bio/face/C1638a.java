package com.tencent.p014mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.sdk.platformtools.Log;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.a */
public class C1638a implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ boolean f11266a;

    /* renamed from: b */
    public final /* synthetic */ C1761b f11267b;

    /* renamed from: c */
    public final /* synthetic */ C82554k f11268c;

    /* renamed from: d */
    public final /* synthetic */ int f11269d;

    /* renamed from: e */
    public final /* synthetic */ C1639b f11270e;

    public C1638a(C1639b bVar, boolean z, C1761b bVar2, C82554k kVar, int i) {
        this.f11270e = bVar;
        this.f11266a = z;
        this.f11267b = bVar2;
        this.f11268c = kVar;
        this.f11269d = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (this.f11266a) {
            this.f11267b.mo1751iF();
        }
        int i3 = 90199;
        if (intent != null) {
            i3 = intent.getIntExtra("err_code", 90199);
        }
        Bundle bundle = null;
        if (i == 1000) {
            Log.m105925i("MicroMsg.JsApiFaceAsyncBase", "alvinluo: requestWxFacePictureVerify errCode: %d", Integer.valueOf(i3));
            if (i3 == 0) {
                C1639b bVar = this.f11270e;
                C82554k kVar = this.f11268c;
                int i4 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar, kVar, i4, bundle, "ok");
            } else if (i3 == 90100) {
                C1639b bVar2 = this.f11270e;
                C82554k kVar2 = this.f11268c;
                int i5 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar2, kVar2, i5, bundle, "cancel");
            } else {
                C1639b bVar3 = this.f11270e;
                C82554k kVar3 = this.f11268c;
                int i6 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar3, kVar3, i6, bundle, "fail");
            }
            return true;
        } else if (i != 1001) {
            return false;
        } else {
            Log.m105925i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", Integer.valueOf(i3));
            if (i3 == 0) {
                C1639b bVar4 = this.f11270e;
                C82554k kVar4 = this.f11268c;
                int i7 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar4, kVar4, i7, bundle, "ok");
            } else if (i3 == 90100) {
                C1639b bVar5 = this.f11270e;
                C82554k kVar5 = this.f11268c;
                int i8 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar5, kVar5, i8, bundle, "cancel");
            } else {
                C1639b bVar6 = this.f11270e;
                C82554k kVar6 = this.f11268c;
                int i9 = this.f11269d;
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                C1639b.m1675w(bVar6, kVar6, i9, bundle, "fail");
            }
            return true;
        }
    }
}
