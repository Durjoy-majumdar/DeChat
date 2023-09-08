package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.facedetect.model.k */
public class C115423k {

    /* renamed from: d */
    public static C115423k f345973d;

    /* renamed from: a */
    public int f345974a = 0;

    /* renamed from: b */
    public int[] f345975b = null;

    /* renamed from: c */
    public int f345976c = -1;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.k$a */
    public static class C115424a {

        /* renamed from: a */
        public int f345977a;

        /* renamed from: b */
        public long f345978b;

        /* renamed from: c */
        public long f345979c;

        /* renamed from: d */
        public String f345980d;

        /* renamed from: e */
        public boolean f345981e;

        /* renamed from: f */
        public long f345982f;

        /* renamed from: g */
        public String f345983g;

        /* renamed from: h */
        public boolean f345984h;

        public C115424a(int i, String str) {
            this.f345977a = i;
            this.f345983g = str;
            if (i == 0) {
                this.f345978b = 30;
                this.f345979c = 7000;
                this.f345980d = MMApplicationContext.getContext().getString(C0966R.string.jl4);
                this.f345981e = true;
                this.f345982f = 2500;
                this.f345984h = false;
            } else if (i == 1) {
                this.f345978b = 30;
                this.f345979c = 7000;
                this.f345980d = MMApplicationContext.getContext().getString(C0966R.string.cj5);
                this.f345981e = false;
                this.f345982f = -1;
                this.f345984h = true;
            } else if (i == 2) {
                this.f345978b = 30;
                this.f345979c = 7000;
                this.f345980d = MMApplicationContext.getContext().getString(C0966R.string.cj6);
                this.f345981e = false;
                this.f345982f = -1;
                this.f345984h = true;
            } else if (i == 3) {
                this.f345978b = 30;
                this.f345979c = 7000;
                this.f345980d = MMApplicationContext.getContext().getString(C0966R.string.cj4);
                this.f345981e = true;
                this.f345982f = -1;
                this.f345984h = true;
            } else if (i != 4) {
                Log.m105920e("MicroMsg.FaceDetectProcessModel", "hy: unknown type");
                this.f345977a = 100;
            } else {
                this.f345978b = 30;
                this.f345979c = 7000;
                this.f345980d = MMApplicationContext.getContext().getString(C0966R.string.cj7);
                this.f345981e = true;
                this.f345982f = 1000;
                this.f345984h = true;
            }
        }

        public String toString() {
            return "FaceProcessItem{type=" + this.f345977a + ", frameTween=" + this.f345978b + ", hintTween=" + this.f345979c + ", hintStr='" + this.f345980d + '\'' + ", isCheckFace=" + this.f345981e + ", minSuccTime=" + this.f345982f + ", actionData='" + this.f345983g + '\'' + '}';
        }
    }

    /* renamed from: a */
    public C115424a mo175309a() {
        String str;
        C105227i iVar = C105227i.INSTANCE;
        int a = iVar.mo149594a();
        FaceProNative faceProNative = iVar.f312612d.f345985i.f345972a;
        if (faceProNative == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: get motion data not init");
            str = null;
        } else {
            str = faceProNative.engineGetCurrMotionData();
        }
        return new C115424a(a, str);
    }

    public String toString() {
        return "FaceDetectProcessModel{mProcessInSequence=" + Arrays.toString(this.f345975b) + '}';
    }
}
