package com.tencent.p014mm.plugin.music.p080ui;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.tencent.p014mm.plugin.music.p080ui.C94243l;

/* renamed from: com.tencent.mm.plugin.music.ui.n */
public class C94249n extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    public final /* synthetic */ int f272305a;

    public C94249n(C94243l.C94245b bVar, int i) {
        this.f272305a = i;
    }

    public Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, new int[]{this.f272305a, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.REPEAT);
    }
}
