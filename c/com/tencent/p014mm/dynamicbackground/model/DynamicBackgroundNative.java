package com.tencent.p014mm.dynamicbackground.model;

import kotlin.Metadata;
import p413ok.C77014c;
import p913nk.C76918b;
import p913nk.C76919c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH JQ\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH J\u0011\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH J9\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH ¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/dynamicbackground/model/DynamicBackgroundNative;", "", "", "nativeInit", "inst", "Lrx3/b0;", "nativeRelease", "draw", "", "width", "height", "surfaceCreated", "", "vertexShader", "fragmentShader", "vertexFrameBuffer", "fragFrameBuffer", "textureVertexShader", "textureFragmentShader", "bgVertexShader", "bgFragmentShader", "setupGlslFiles", "initView", "surfaceChanged", "particleColor1", "particleColor2", "particleColor3", "bgColor1", "bgColor2", "setColor", "<init>", "()V", "dynamicbg_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative */
public final class DynamicBackgroundNative {

    /* renamed from: a */
    public long f195177a = -1;

    /* renamed from: b */
    public long f195178b = -1;

    public DynamicBackgroundNative() {
        C76918b bVar = C76919c.f224781a;
        C76918b bVar2 = C76919c.f224781a;
        if (bVar2 != null) {
            bVar2.loadDynamicBgLibrary();
        }
    }

    /* renamed from: a */
    public final void mo93405a() {
        if (this.f195178b > 0) {
            C77014c.m92922b("MicroMsg.DynamicBackgroundNative", "destroy DynamicBackgroundNative toRelease: " + this.f195178b + " inst: " + this.f195177a, new Object[0]);
            nativeRelease(this.f195178b);
            this.f195178b = -1;
        }
    }

    public final native void draw(long j);

    public final native void initView(long j);

    public final native long nativeInit();

    public final native void nativeRelease(long j);

    public final native void setColor(long j, int i, int i2, int i3, int i4, int i5);

    public final native void setupGlslFiles(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public final native void surfaceChanged(long j, int i, int i2);

    public final native void surfaceCreated(long j, int i, int i2);
}
